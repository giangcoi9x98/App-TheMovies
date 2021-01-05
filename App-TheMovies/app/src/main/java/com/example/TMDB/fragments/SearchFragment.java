package com.example.TMDB.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.TMDB.adapters.MoviesAdapter;
import com.example.TMDB.adapters.TvShowAdapter;
import com.example.TMDB.api.APIService;
import com.example.TMDB.api.RetrofitConfiguration;
import com.example.TMDB.models.GetMoviesResponse;
import com.example.TMDB.models.GetTvShows;
import com.example.android1_module3_tmdb.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    @BindView(R.id.spn_search)
    Spinner spnSearch;
    @BindView(R.id.tv_add_spinner)
    TextView tvAddSpinner;
    @BindView(R.id.et_search)
    EditText etSearch;
    @BindView(R.id.imgSearch)
    ImageView imgSearch;
    @BindView(R.id.tv_result_search)
    TextView tvResultSearch;
    @BindView(R.id.rcv_movies_search)
    RecyclerView rcvMoviesSearch;
    @BindView(R.id.srl_search_movie)
    SwipeRefreshLayout srlSearchMovie;
    private List<GetMoviesResponse.ResultsBean> moviesSearch = new ArrayList<>();
    private TvShowAdapter showAdapter;
    private List<GetTvShows.ResultsBean> tvShows = new ArrayList<>();
    private MoviesAdapter movieAdapter;
    private int page = 1;
    private int visibleThreshold = 5;
    private int totalIteamCount, lastVisibleItem;
    private boolean isLoading;
    private String query ;
    private int result;
    private static final String TAG = "SearchFragment";
    private HashMap<String, List<GetMoviesResponse.ResultsBean>> data = new HashMap<>();

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        ButterKnife.bind(this, view);
        setUpSpinner();
        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String et = etSearch.getText().toString();
                moviesSearch.clear();
                loadData(et);
                setUpUI(et);

//                if (!et.equalsIgnoreCase(query) && et != null) {
//                  //  moviesSearch.clear();
//                    loadData(et);
//                    setUpUI(et);
//                    //setUpUI(et);
//                    query = et;
//                    Log.d(TAG, "onClick: ok");
//                } else if (et == null) {
//                    Toast.makeText(getContext(), "Please enter key words", Toast.LENGTH_SHORT).show();
////                } else if (result == 0) {
////                    Toast.makeText(getContext(), "No result", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(getContext(), "Change key words", Toast.LENGTH_SHORT).show();
//                }

                Log.d(TAG, "onClick: " + query);
                Log.d(TAG, "onClick:et " + et);
          }
        });
//        loadData(query);
//        setUpUI(query);

        return view;
    }

    private void setUpUI(String msg) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        rcvMoviesSearch.setLayoutManager(gridLayoutManager);

        movieAdapter = new MoviesAdapter(moviesSearch);
        rcvMoviesSearch.setAdapter(movieAdapter);
        Log.d(TAG, "setUpUI:seccess ");
        rcvMoviesSearch.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                totalIteamCount = gridLayoutManager.getItemCount();
                lastVisibleItem = gridLayoutManager.findLastVisibleItemPosition();
                Log.d(TAG, "onScrolled: totalItem" + totalIteamCount);
                Log.d(TAG, "onScrolled: LastVisiableItem" + lastVisibleItem);

                if (!isLoading && lastVisibleItem >= totalIteamCount - visibleThreshold) {
                    Log.d(TAG, "onScrolled: LoadMore");
                    page++;
                    loadData(msg);
                    isLoading = true;
                }
            }
        });
    }

    private void loadData(String msg) {
        APIService service = RetrofitConfiguration.getInstance().create(APIService.class);
        Call<GetMoviesResponse> call = service.getMoviesSearch(msg, page);
        call.enqueue(new Callback<GetMoviesResponse>() {
            @Override
            public void onResponse(Call<GetMoviesResponse> call, Response<GetMoviesResponse> response) {
                isLoading = false;
                if (response.code() == 200) {
                    result = response.body().getTotal_results();
//                    tvResultSearch.setText(response.body().getTotal_results() + " result in relate to " + "\" " +
//                            etSearch.getText().toString() + "\" " + " in Movies ");
                   // moviesSearch.addAll(response.body().getResults());

                    movieAdapter.addAll(response.body().getResults());
                    //     data.put(msg, moviesSearch);
                    Log.d(TAG, "onResponse:Data " + data.get(msg));

                    movieAdapter.notifyDataSetChanged();


                    Log.d(TAG, "onResponse: connected" + response.code() + response.body().getTotal_results());
                } else {
                    Log.d(TAG, "onResponse: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<GetMoviesResponse> call, Throwable t) {
                isLoading = false;
                Toast.makeText(getContext(), "NetWork fail ", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void loadDataTv(String msg) {
        APIService service = RetrofitConfiguration.getInstance().create(APIService.class);
        Call<GetTvShows> call = service.getTvShows(msg, page);
        call.enqueue(new Callback<GetTvShows>() {
            @Override
            public void onResponse(Call<GetTvShows> call, Response<GetTvShows> responseTv) {
                isLoading = false;
                if (responseTv.code() == 200) {
//
//                    tvResultSearch.setText(responseTv.body().getTotal_results() + " result in relate to " + "\" " +
//                            etSearch.getText().toString() + "\" " + " inTvShows ");

                    tvShows.addAll(responseTv.body().getResults());
                    showAdapter.notifyDataSetChanged();

                    Log.d(TAG, "onResponse: " + responseTv.body().getTotal_results());
                    Log.d(TAG, "onResponse: connected" + responseTv.code() + responseTv.body().getTotal_results());
                } else {
                    Log.d(TAG, "onResponse: " + responseTv.code());
                }
            }

            @Override
            public void onFailure(Call<GetTvShows> call, Throwable t) {
                isLoading = false;
                Toast.makeText(getContext(), "NetWork fail ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setUpUITv() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        rcvMoviesSearch.setLayoutManager(gridLayoutManager);
        showAdapter = new TvShowAdapter(tvShows);
        rcvMoviesSearch.setAdapter(showAdapter);
        Log.d(TAG, "setUpUI:seccess ");
        rcvMoviesSearch.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                totalIteamCount = gridLayoutManager.getItemCount();
                lastVisibleItem = gridLayoutManager.findLastVisibleItemPosition();
                Log.d(TAG, "onScrolled: totalItem" + totalIteamCount);
                Log.d(TAG, "onScrolled: LastVisiableItem" + lastVisibleItem);

                if (!isLoading && lastVisibleItem >= totalIteamCount - visibleThreshold) {
                    Log.d(TAG, "onScrolled: LoadMore");
                    page++;
                    loadDataTv(query);
                    isLoading = true;
                }
            }
        });
    }


    public void setUpSpinner() {

        ArrayList<String> items = new ArrayList<String>();
        items.add("Movies");
        items.add("People");
        items.add("TvShows");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, items);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnSearch.setAdapter(arrayAdapter);
        spnSearch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = spnSearch.getSelectedItem().toString();

                tvAddSpinner.setText(text);

                switch (text) {
                    case "Movies":
//
//                        query = etSearch.getText().toString();
//                        loadData(query);
//                        setUpUI(query);

                        break;
                    case "People":
                        Toast.makeText(getContext(), "People", Toast.LENGTH_SHORT).show();
                        break;
                    case "TvShows":

                        query = etSearch.getText().toString();
                        loadDataTv(query);
                        setUpUITv();
                        Log.d(TAG, "onItemSelected: " + etSearch);
                        break;

//
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}

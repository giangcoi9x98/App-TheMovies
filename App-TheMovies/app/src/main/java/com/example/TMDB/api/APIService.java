package com.example.TMDB.api;

import com.example.TMDB.models.DeleteSessionIdRequest;
import com.example.TMDB.models.DeleteSessionIdResponse;
import com.example.TMDB.models.GetCreateRequestTokenResponse;
import com.example.TMDB.models.GetMovieAccountStatesResponse;
import com.example.TMDB.models.GetMovieDetailResponse;
import com.example.TMDB.models.GetMoviesResponse;
import com.example.TMDB.models.GetTvShowResponse;
import com.example.TMDB.models.GetTvShows;
import com.example.TMDB.models.PostCreateSessionRequest;
import com.example.TMDB.models.PostCreateSessionResponse;
import com.example.TMDB.models.PostCreateSessionWithLoginRequest;
import com.example.TMDB.models.PostCreateSessionWithLoginResponse;
import com.example.TMDB.models.SetFavouriteMovieRequest;
import com.example.TMDB.models.SetFavouriteMovieResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {
    String apiKey = "27c2920e66c9e5b322a7ce6bc0e0d1b5";

    @GET("discover/movie?api_key=" + apiKey)
    Call<GetMoviesResponse> getMovies(@Query("page") int page);

    @GET("movie/{movie_id}?api_key=" + apiKey + "&append_to_response=videos")
    Call<GetMovieDetailResponse> getMovieDetail(@Path("movie_id") int movieId);

    @GET("authentication/token/new?api_key=" + apiKey)
    Call<GetCreateRequestTokenResponse> getCreateRequestToken();

    @POST("authentication/token/validate_with_login?api_key=" + apiKey)
    Call<PostCreateSessionWithLoginResponse> postCreateSessionWithLogin(@Body PostCreateSessionWithLoginRequest body);

    @POST("authentication/session/new?api_key=" + apiKey)
    Call<PostCreateSessionResponse> postCreateSession(@Body PostCreateSessionRequest body);

    @GET("search/movie?api_key=" + apiKey)
    Call<GetMoviesResponse> getMoviesSearch(
            @Query("query") String query,
            @Query("page") int page
    );

    //tvShows
    @GET("search/tv?api_key=" + apiKey)
    Call<GetTvShows> getTvShows(
            @Query("query") String query,
            @Query("page") int page
    );

    @GET("tv/{tv_id}?api_key=" + apiKey)
    Call<GetTvShowResponse> getTvShowResponse(
            @Path("tv_id") int tvId
    );

//    @DELETE("authentication/session?api_key=" + apiKey)
    @HTTP(method = "DELETE", path = "authentication/session?api_key=" + apiKey, hasBody = true)
    Call<DeleteSessionIdResponse> deleteSessionId(@Body DeleteSessionIdRequest body);

    @POST("account/{account_id}/favorite?api_key=" + apiKey)
    Call<SetFavouriteMovieResponse> setFavouriteMovie(@Body SetFavouriteMovieRequest body, @Query("session_id") String sessionId);

    @GET("movie/{movie_id}/account_states?api_key=" + apiKey)
    Call<GetMovieAccountStatesResponse> getMovieAccountStates(@Path("movie_id") int movieId, @Query("session_id") String sessionId);
}

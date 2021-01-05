package com.example.TMDB.models;

import java.util.List;

public class GetTvShows {

    /**
     * page : 1
     * total_results : 11
     * total_pages : 1
     * results : [{"original_name":"Frozen Planet","genre_ids":[99],"name":"Frozen Planet","popularity":9.341,"origin_country":["GB"],"vote_count":118,"first_air_date":"2011-10-26","backdrop_path":"/vLQTtxlcHJHCzAKdzG81yhSCkb4.jpg","original_language":"en","id":8724,"vote_average":8.3,"overview":"David Attenborough travels to the end of the earth, taking viewers on an extraordinary journey across the polar regions of our planet.","poster_path":"/rDlNybzqSf2W8sI5ht0fXWpSHWJ.jpg"},{"original_name":"Alaska: Earth's Frozen Kingdom","genre_ids":[99],"name":"Alaska: Earth's Frozen Kingdom","popularity":2.446,"origin_country":["GB"],"vote_count":3,"first_air_date":"2015-02-04","backdrop_path":null,"original_language":"en","id":62041,"vote_average":2.5,"overview":"Three-part series that looks at a year in Alaska, revealing the stories of pioneering Alaskans, both animal and human, as they battle the elements and reap the benefits of nature's seasonal gold rush.","poster_path":"/w2WXnM9xRMHt57ls5gH1PeglUyV.jpg"},{"original_name":"Memorandum on a Frozen Ark","id":33380,"name":"Memorandum on a Frozen Ark","popularity":0.6,"vote_count":0,"vote_average":0,"first_air_date":"","poster_path":null,"genre_ids":[],"original_language":"en","backdrop_path":null,"overview":"Memorandum on a Frozen Ark was a Canadian documentary television miniseries which explored the state of Canada's museums. It aired on CBC Television in 1970.","origin_country":[]},{"original_name":"Curse of the Frozen Gold","genre_ids":[],"name":"Curse of the Frozen Gold","popularity":0.645,"origin_country":[],"vote_count":1,"first_air_date":"","backdrop_path":null,"original_language":"en","id":63882,"vote_average":3,"overview":"","poster_path":"/9TUWjGIB7tpW0U4b3wVsIkS6P4g.jpg"},{"original_name":"David Blaine: Frozen in Time","id":18220,"name":"David Blaine: Frozen in Time","popularity":0.6,"vote_count":0,"vote_average":0,"first_air_date":"","poster_path":null,"genre_ids":[],"original_language":"en","backdrop_path":null,"overview":"","origin_country":[]},{"original_name":"Glacé","genre_ids":[18],"name":"The Frozen Dead","popularity":6.998,"origin_country":["FR"],"vote_count":20,"first_air_date":"2017-01-10","backdrop_path":null,"original_language":"fr","id":69488,"vote_average":6.5,"overview":"A horrific discovery in a small town nestled high in the French Pyrenees begins to unravel a dark mystery that has been hidden for years. On an unforgiving winter morning, a group of workers discover the headless body of a horse, hanging suspended from the edge of a frozen cliff. Commandant Martin Servaz starts investigating and soon discovers a dark story of madness and revenge.","poster_path":"/kUzTRUCfu3RuNqmb6KEVqNFuIfv.jpg"},{"original_name":"Frusna Vägar","id":76772,"name":"Frozen Roads","popularity":1.4,"vote_count":0,"vote_average":0,"first_air_date":"2018-01-30","poster_path":"/44GUOal42Tg8jn8xvSMfv9Bp887.jpg","genre_ids":[99],"original_language":"sv","backdrop_path":"/dj7YAGDlx6KQHzki08zrT0OjJWv.jpg","overview":"Follow along to a sparkling Sweden, up in the North, where snow and ice is an every day thing for salvager's and snow clearer's, but not comfortable for big city dwellers during their temporary visits. Follow the heroes that transforms the northern vastness to travel-able areas.","origin_country":[]},{"original_name":"Der kalte Himmel","id":73051,"name":"Frozen Sky","popularity":0.844,"vote_count":0,"vote_average":0,"first_air_date":"2011-01-01","poster_path":"/mECfjl5V4IVwD5iIfEg3CH2UEFw.jpg","genre_ids":[],"original_language":"en","backdrop_path":"/pVsflAJSdeYngLi5KPiJA3VpkOr.jpg","overview":"Fighting against the prejudices of late 1960s Germany, a mother will stop at nothing to find her son a proper psychiatric diagnosis. To society, he is a problem child; to his mother, he is gifted. Doctor Zhivago meets The A Word... an exquisite, arresting tale of love and hope.","origin_country":[]},{"original_name":"빙구","genre_ids":[],"name":"Frozen Love","popularity":0.6,"origin_country":["KR"],"vote_count":2,"first_air_date":"2017-02-05","backdrop_path":"/7OcJTQWGNyV2XnE7TAi0usdFpwZ.jpg","original_language":"ko","id":79281,"vote_average":8.5,"overview":"After being frozen for 33 years, Man Soo finds himself awake in a cold body but he has enormous love in his heart. He meets Ha Da, who has turned into a cold-hearted human being after living in the city. Now that Man Soo is awake from his slumber, he embarks on a search for his long-lost love through time while Ha Da, whom he encountered, is discovering warmth in her heart.Will either of them find love? This TV show aims to weave a beautiful story of romance to uplift viewers who are dealing with a depressed economy and dim job prospects in a harsh society of today.\n\n(Source: MBC)","poster_path":"/glfI2qdo8V80YFkeWiJYZmvZgSC.jpg"},{"original_name":"凍りつく夏","genre_ids":[],"name":"Frozen Summer","popularity":0.6,"origin_country":["JP"],"vote_count":0,"first_air_date":"1998-07-06","backdrop_path":null,"original_language":"ja","id":26411,"vote_average":0,"overview":"The Oikawa children are still coming to terms with the death of their mother and the addition of a stepmother. The head of the family takes out his frustration on the children, inflicting mental and physical wounds, while the children\u2019s lives outside the home reflect their abuse as they get into everything from street violence to teenage companion services. A sharp lawyer and new stepmother to the children attempts to forge a stable family, but as she does so the mystery behind her predecessor\u2019s death slowly becomes chillingly clear to her.","poster_path":null},{"original_name":"Les témoins","genre_ids":[80,9648],"name":"Witnesses","popularity":3.547,"origin_country":["BE","FR"],"vote_count":18,"first_air_date":"2014-11-22","backdrop_path":null,"original_language":"fr","id":62641,"vote_average":6.9,"overview":"A young female detective is put in charge of a case and must delve into her partner's mysterious past in order to solve it.","poster_path":"/joL6OghzMTQ2usNdVRMYsEKr8UN.jpg"}]
     */

    private int page;
    private int total_results;
    private int total_pages;
    private List<ResultsBean> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * original_name : Frozen Planet
         * genre_ids : [99]
         * name : Frozen Planet
         * popularity : 9.341
         * origin_country : ["GB"]
         * vote_count : 118
         * first_air_date : 2011-10-26
         * backdrop_path : /vLQTtxlcHJHCzAKdzG81yhSCkb4.jpg
         * original_language : en
         * id : 8724
         * vote_average : 8.3
         * overview : David Attenborough travels to the end of the earth, taking viewers on an extraordinary journey across the polar regions of our planet.
         * poster_path : /rDlNybzqSf2W8sI5ht0fXWpSHWJ.jpg
         */

        private String original_name;
        private String name;
        private double popularity;
        private int vote_count;
        private String first_air_date;
        private String backdrop_path;
        private String original_language;
        private int id;
        private double vote_average;
        private String overview;
        private String poster_path;
        private List<Integer> genre_ids;
        private List<String> origin_country;

        public String getOriginal_name() {
            return original_name;
        }

        public void setOriginal_name(String original_name) {
            this.original_name = original_name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public int getVote_count() {
            return vote_count;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }

        public String getFirst_air_date() {
            return first_air_date;
        }

        public void setFirst_air_date(String first_air_date) {
            this.first_air_date = first_air_date;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getVote_average() {
            return vote_average;
        }

        public void setVote_average(double vote_average) {
            this.vote_average = vote_average;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
        }

        public void setGenre_ids(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }

        public List<String> getOrigin_country() {
            return origin_country;
        }

        public void setOrigin_country(List<String> origin_country) {
            this.origin_country = origin_country;
        }
    }
}

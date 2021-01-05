package com.example.TMDB.models;

import java.util.List;

public class GetTvShowResponse {

    /**
     * backdrop_path : /vLQTtxlcHJHCzAKdzG81yhSCkb4.jpg
     * created_by : [{"id":86543,"credit_id":"5bd1be4dc3a3682f8f00d101","name":"David Attenborough","gender":2,"profile_path":"/tt3LW3XftcvxOZtMXmIaJSWFN7y.jpg"}]
     * episode_run_time : [60]
     * first_air_date : 2011-10-26
     * genres : [{"id":99,"name":"Documentary"}]
     * homepage : http://www.bbc.co.uk/programmes/b00mfl7n
     * id : 8724
     * in_production : false
     * languages : ["en","fr"]
     * last_air_date : 2011-12-07
     * last_episode_to_air : {"air_date":"2011-12-07","episode_number":7,"id":399411,"name":"On Thin Ice","overview":"A look at how scientists measure changes in the polar regions and what those changes mean for the animals and people who live there, as well as the rest of the planet.","production_code":"","season_number":1,"show_id":8724,"still_path":"/6OFC0qvhGKTEG0b5SMXnhXFVE49.jpg","vote_average":0,"vote_count":0}
     * name : Frozen Planet
     * next_episode_to_air : null
     * networks : [{"name":"BBC One","id":4,"logo_path":"/mVn7xESaTNmjBUyUtGNvDQd3CT1.png","origin_country":"GB"}]
     * number_of_episodes : 7
     * number_of_seasons : 1
     * origin_country : ["GB"]
     * original_language : en
     * original_name : Frozen Planet
     * overview : David Attenborough travels to the end of the earth, taking viewers on an extraordinary journey across the polar regions of our planet.
     * popularity : 6.87
     * poster_path : /rDlNybzqSf2W8sI5ht0fXWpSHWJ.jpg
     * production_companies : [{"id":3324,"logo_path":"/16fY7pucCzn7WSOYxOGRHlAayL3.png","name":"BBC","origin_country":"GB"}]
     * seasons : [{"air_date":"2011-10-26","episode_count":10,"id":18619,"name":"Specials","overview":"","poster_path":null,"season_number":0},{"air_date":"2011-10-26","episode_count":7,"id":18620,"name":"Miniseries","overview":"","poster_path":"/sFAssIrNY2ileQPeUf99Dna3yzN.jpg","season_number":1}]
     * status : Ended
     * type : Miniseries
     * vote_average : 8.3
     * vote_count : 119
     */

    private String backdrop_path;
    private String first_air_date;
    private String homepage;
    private int id;
    private boolean in_production;
    private String last_air_date;
    private LastEpisodeToAirBean last_episode_to_air;
    private String name;
    private Object next_episode_to_air;
    private int number_of_episodes;
    private int number_of_seasons;
    private String original_language;
    private String original_name;
    private String overview;
    private double popularity;
    private String poster_path;
    private String status;
    private String type;
    private double vote_average;
    private int vote_count;
    private List<CreatedByBean> created_by;
    private List<Integer> episode_run_time;
    private List<GenresBean> genres;
    private List<String> languages;
    private List<NetworksBean> networks;
    private List<String> origin_country;
    private List<ProductionCompaniesBean> production_companies;
    private List<SeasonsBean> seasons;

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(String first_air_date) {
        this.first_air_date = first_air_date;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIn_production() {
        return in_production;
    }

    public void setIn_production(boolean in_production) {
        this.in_production = in_production;
    }

    public String getLast_air_date() {
        return last_air_date;
    }

    public void setLast_air_date(String last_air_date) {
        this.last_air_date = last_air_date;
    }

    public LastEpisodeToAirBean getLast_episode_to_air() {
        return last_episode_to_air;
    }

    public void setLast_episode_to_air(LastEpisodeToAirBean last_episode_to_air) {
        this.last_episode_to_air = last_episode_to_air;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getNext_episode_to_air() {
        return next_episode_to_air;
    }

    public void setNext_episode_to_air(Object next_episode_to_air) {
        this.next_episode_to_air = next_episode_to_air;
    }

    public int getNumber_of_episodes() {
        return number_of_episodes;
    }

    public void setNumber_of_episodes(int number_of_episodes) {
        this.number_of_episodes = number_of_episodes;
    }

    public int getNumber_of_seasons() {
        return number_of_seasons;
    }

    public void setNumber_of_seasons(int number_of_seasons) {
        this.number_of_seasons = number_of_seasons;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public List<CreatedByBean> getCreated_by() {
        return created_by;
    }

    public void setCreated_by(List<CreatedByBean> created_by) {
        this.created_by = created_by;
    }

    public List<Integer> getEpisode_run_time() {
        return episode_run_time;
    }

    public void setEpisode_run_time(List<Integer> episode_run_time) {
        this.episode_run_time = episode_run_time;
    }

    public List<GenresBean> getGenres() {
        return genres;
    }

    public void setGenres(List<GenresBean> genres) {
        this.genres = genres;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<NetworksBean> getNetworks() {
        return networks;
    }

    public void setNetworks(List<NetworksBean> networks) {
        this.networks = networks;
    }

    public List<String> getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(List<String> origin_country) {
        this.origin_country = origin_country;
    }

    public List<ProductionCompaniesBean> getProduction_companies() {
        return production_companies;
    }

    public void setProduction_companies(List<ProductionCompaniesBean> production_companies) {
        this.production_companies = production_companies;
    }

    public List<SeasonsBean> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<SeasonsBean> seasons) {
        this.seasons = seasons;
    }

    public static class LastEpisodeToAirBean {
        /**
         * air_date : 2011-12-07
         * episode_number : 7
         * id : 399411
         * name : On Thin Ice
         * overview : A look at how scientists measure changes in the polar regions and what those changes mean for the animals and people who live there, as well as the rest of the planet.
         * production_code :
         * season_number : 1
         * show_id : 8724
         * still_path : /6OFC0qvhGKTEG0b5SMXnhXFVE49.jpg
         * vote_average : 0.0
         * vote_count : 0
         */

        private String air_date;
        private int episode_number;
        private int id;
        private String name;
        private String overview;
        private String production_code;
        private int season_number;
        private int show_id;
        private String still_path;
        private double vote_average;
        private int vote_count;

        public String getAir_date() {
            return air_date;
        }

        public void setAir_date(String air_date) {
            this.air_date = air_date;
        }

        public int getEpisode_number() {
            return episode_number;
        }

        public void setEpisode_number(int episode_number) {
            this.episode_number = episode_number;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getProduction_code() {
            return production_code;
        }

        public void setProduction_code(String production_code) {
            this.production_code = production_code;
        }

        public int getSeason_number() {
            return season_number;
        }

        public void setSeason_number(int season_number) {
            this.season_number = season_number;
        }

        public int getShow_id() {
            return show_id;
        }

        public void setShow_id(int show_id) {
            this.show_id = show_id;
        }

        public String getStill_path() {
            return still_path;
        }

        public void setStill_path(String still_path) {
            this.still_path = still_path;
        }

        public double getVote_average() {
            return vote_average;
        }

        public void setVote_average(double vote_average) {
            this.vote_average = vote_average;
        }

        public int getVote_count() {
            return vote_count;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }
    }

    public static class CreatedByBean {
        /**
         * id : 86543
         * credit_id : 5bd1be4dc3a3682f8f00d101
         * name : David Attenborough
         * gender : 2
         * profile_path : /tt3LW3XftcvxOZtMXmIaJSWFN7y.jpg
         */

        private int id;
        private String credit_id;
        private String name;
        private int gender;
        private String profile_path;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCredit_id() {
            return credit_id;
        }

        public void setCredit_id(String credit_id) {
            this.credit_id = credit_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getProfile_path() {
            return profile_path;
        }

        public void setProfile_path(String profile_path) {
            this.profile_path = profile_path;
        }
    }

    public static class GenresBean {
        /**
         * id : 99
         * name : Documentary
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class NetworksBean {
        /**
         * name : BBC One
         * id : 4
         * logo_path : /mVn7xESaTNmjBUyUtGNvDQd3CT1.png
         * origin_country : GB
         */

        private String name;
        private int id;
        private String logo_path;
        private String origin_country;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogo_path() {
            return logo_path;
        }

        public void setLogo_path(String logo_path) {
            this.logo_path = logo_path;
        }

        public String getOrigin_country() {
            return origin_country;
        }

        public void setOrigin_country(String origin_country) {
            this.origin_country = origin_country;
        }
    }

    public static class ProductionCompaniesBean {
        /**
         * id : 3324
         * logo_path : /16fY7pucCzn7WSOYxOGRHlAayL3.png
         * name : BBC
         * origin_country : GB
         */

        private int id;
        private String logo_path;
        private String name;
        private String origin_country;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogo_path() {
            return logo_path;
        }

        public void setLogo_path(String logo_path) {
            this.logo_path = logo_path;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOrigin_country() {
            return origin_country;
        }

        public void setOrigin_country(String origin_country) {
            this.origin_country = origin_country;
        }
    }

    public static class SeasonsBean {
        /**
         * air_date : 2011-10-26
         * episode_count : 10
         * id : 18619
         * name : Specials
         * overview :
         * poster_path : null
         * season_number : 0
         */

        private String air_date;
        private int episode_count;
        private int id;
        private String name;
        private String overview;
        private Object poster_path;
        private int season_number;

        public String getAir_date() {
            return air_date;
        }

        public void setAir_date(String air_date) {
            this.air_date = air_date;
        }

        public int getEpisode_count() {
            return episode_count;
        }

        public void setEpisode_count(int episode_count) {
            this.episode_count = episode_count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public Object getPoster_path() {
            return poster_path;
        }

        public void setPoster_path(Object poster_path) {
            this.poster_path = poster_path;
        }

        public int getSeason_number() {
            return season_number;
        }

        public void setSeason_number(int season_number) {
            this.season_number = season_number;
        }
    }
}

package com.poly.pt_ls.weather.model;

import com.englandstudio.basekt.BaseModel;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Forecast implements BaseModel {

    /**
     * cod : 200
     * message : 0.007
     * cnt : 40
     * data : [{"dt":1553353200,"main":{"temp":20.05,"temp_min":20.05,"temp_max":22.67,"pressure":1013.48,"sea_level":1013.48,"grnd_level":980.27,"humidity":93,"temp_kf":-2.62},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.61,"deg":5.00049},"rain":{"3h":7.23},"sys":{"pod":"n"},"dt_txt":"2019-03-23 15:00:00"},{"dt":1553364000,"main":{"temp":19.45,"temp_min":19.45,"temp_max":21.19,"pressure":1012.97,"sea_level":1012.97,"grnd_level":979.53,"humidity":96,"temp_kf":-1.75},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":80},"wind":{"speed":1.67,"deg":351},"rain":{"3h":4.04},"sys":{"pod":"n"},"dt_txt":"2019-03-23 18:00:00"},{"dt":1553374800,"main":{"temp":19.9,"temp_min":19.9,"temp_max":20.77,"pressure":1012.52,"sea_level":1012.52,"grnd_level":979.1,"humidity":98,"temp_kf":-0.87},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":1.82,"deg":338.002},"rain":{"3h":0.55},"sys":{"pod":"n"},"dt_txt":"2019-03-23 21:00:00"},{"dt":1553385600,"main":{"temp":20.91,"temp_min":20.91,"temp_max":20.91,"pressure":1014.09,"sea_level":1014.09,"grnd_level":980.65,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.26,"deg":334},"rain":{"3h":0.61},"sys":{"pod":"d"},"dt_txt":"2019-03-24 00:00:00"},{"dt":1553396400,"main":{"temp":23.24,"temp_min":23.24,"temp_max":23.24,"pressure":1015.06,"sea_level":1015.06,"grnd_level":981.71,"humidity":89,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":80},"wind":{"speed":2.56,"deg":342.502},"rain":{"3h":0.37},"sys":{"pod":"d"},"dt_txt":"2019-03-24 03:00:00"},{"dt":1553407200,"main":{"temp":24.52,"temp_min":24.52,"temp_max":24.52,"pressure":1012.96,"sea_level":1012.96,"grnd_level":979.78,"humidity":80,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":76},"wind":{"speed":2.61,"deg":353.505},"rain":{"3h":0.15},"sys":{"pod":"d"},"dt_txt":"2019-03-24 06:00:00"},{"dt":1553418000,"main":{"temp":24.72,"temp_min":24.72,"temp_max":24.72,"pressure":1010.93,"sea_level":1010.93,"grnd_level":977.73,"humidity":79,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":64},"wind":{"speed":2.56,"deg":17.0043},"rain":{"3h":0.029999999999999},"sys":{"pod":"d"},"dt_txt":"2019-03-24 09:00:00"},{"dt":1553428800,"main":{"temp":21.97,"temp_min":21.97,"temp_max":21.97,"pressure":1012.31,"sea_level":1012.31,"grnd_level":979.03,"humidity":90,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":1.51,"deg":25.0176},"rain":{"3h":0.24},"sys":{"pod":"n"},"dt_txt":"2019-03-24 12:00:00"},{"dt":1553439600,"main":{"temp":20.89,"temp_min":20.89,"temp_max":20.89,"pressure":1013.79,"sea_level":1013.79,"grnd_level":980.4,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":1.21,"deg":16.5024},"rain":{"3h":0.41},"sys":{"pod":"n"},"dt_txt":"2019-03-24 15:00:00"},{"dt":1553450400,"main":{"temp":20.55,"temp_min":20.55,"temp_max":20.55,"pressure":1013.48,"sea_level":1013.48,"grnd_level":980.02,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":1.17,"deg":14.0027},"rain":{"3h":0.475},"sys":{"pod":"n"},"dt_txt":"2019-03-24 18:00:00"},{"dt":1553461200,"main":{"temp":20.26,"temp_min":20.26,"temp_max":20.26,"pressure":1013.15,"sea_level":1013.15,"grnd_level":979.76,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.23,"deg":30.003},"rain":{"3h":0.35},"sys":{"pod":"n"},"dt_txt":"2019-03-24 21:00:00"},{"dt":1553472000,"main":{"temp":20.53,"temp_min":20.53,"temp_max":20.53,"pressure":1014.37,"sea_level":1014.37,"grnd_level":980.95,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":1.06,"deg":10.0022},"rain":{"3h":0.074999999999999},"sys":{"pod":"d"},"dt_txt":"2019-03-25 00:00:00"},{"dt":1553482800,"main":{"temp":25.51,"temp_min":25.51,"temp_max":25.51,"pressure":1014.97,"sea_level":1014.97,"grnd_level":981.64,"humidity":82,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":32},"wind":{"speed":1.41,"deg":22.0006},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-25 03:00:00"},{"dt":1553493600,"main":{"temp":27.56,"temp_min":27.56,"temp_max":27.56,"pressure":1013.21,"sea_level":1013.21,"grnd_level":980.07,"humidity":72,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":48},"wind":{"speed":2.66,"deg":37.0001},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-25 06:00:00"},{"dt":1553504400,"main":{"temp":25.61,"temp_min":25.61,"temp_max":25.61,"pressure":1011.78,"sea_level":1011.78,"grnd_level":978.67,"humidity":76,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":88},"wind":{"speed":2.71,"deg":25.5004},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-25 09:00:00"},{"dt":1553515200,"main":{"temp":22.72,"temp_min":22.72,"temp_max":22.72,"pressure":1013.48,"sea_level":1013.48,"grnd_level":980.22,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.78,"deg":12.0005},"rain":{"3h":0.125},"sys":{"pod":"n"},"dt_txt":"2019-03-25 12:00:00"},{"dt":1553526000,"main":{"temp":21.43,"temp_min":21.43,"temp_max":21.43,"pressure":1015.18,"sea_level":1015.18,"grnd_level":981.78,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":1.36,"deg":4.50177},"rain":{"3h":0.65},"sys":{"pod":"n"},"dt_txt":"2019-03-25 15:00:00"},{"dt":1553536800,"main":{"temp":20.62,"temp_min":20.62,"temp_max":20.62,"pressure":1014.69,"sea_level":1014.69,"grnd_level":981.28,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":1.41,"deg":357.004},"rain":{"3h":1.4},"sys":{"pod":"n"},"dt_txt":"2019-03-25 18:00:00"},{"dt":1553547600,"main":{"temp":20.01,"temp_min":20.01,"temp_max":20.01,"pressure":1014.37,"sea_level":1014.37,"grnd_level":980.99,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":68},"wind":{"speed":1.51,"deg":356.501},"rain":{"3h":1.3},"sys":{"pod":"n"},"dt_txt":"2019-03-25 21:00:00"},{"dt":1553558400,"main":{"temp":20.78,"temp_min":20.78,"temp_max":20.78,"pressure":1015.95,"sea_level":1015.95,"grnd_level":982.53,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":68},"wind":{"speed":1.56,"deg":14.5022},"rain":{"3h":0.55},"sys":{"pod":"d"},"dt_txt":"2019-03-26 00:00:00"},{"dt":1553569200,"main":{"temp":25.05,"temp_min":25.05,"temp_max":25.05,"pressure":1016.94,"sea_level":1016.94,"grnd_level":983.66,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":56},"wind":{"speed":1.87,"deg":41.0012},"rain":{"3h":0.3},"sys":{"pod":"d"},"dt_txt":"2019-03-26 03:00:00"},{"dt":1553580000,"main":{"temp":25.03,"temp_min":25.03,"temp_max":25.03,"pressure":1015.37,"sea_level":1015.37,"grnd_level":982.16,"humidity":88,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":76},"wind":{"speed":2.77,"deg":55.5014},"rain":{"3h":1.025},"sys":{"pod":"d"},"dt_txt":"2019-03-26 06:00:00"},{"dt":1553590800,"main":{"temp":22.75,"temp_min":22.75,"temp_max":22.75,"pressure":1013.68,"sea_level":1013.68,"grnd_level":980.43,"humidity":100,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":100},"wind":{"speed":2.02,"deg":48.5011},"rain":{"3h":3.35},"sys":{"pod":"d"},"dt_txt":"2019-03-26 09:00:00"},{"dt":1553601600,"main":{"temp":22.45,"temp_min":22.45,"temp_max":22.45,"pressure":1014.27,"sea_level":1014.27,"grnd_level":981.02,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.76,"deg":58.0083},"rain":{"3h":0.55},"sys":{"pod":"n"},"dt_txt":"2019-03-26 12:00:00"},{"dt":1553612400,"main":{"temp":22.53,"temp_min":22.53,"temp_max":22.53,"pressure":1015.33,"sea_level":1015.33,"grnd_level":981.9,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":2.07,"deg":77.5027},"rain":{"3h":0.125},"sys":{"pod":"n"},"dt_txt":"2019-03-26 15:00:00"},{"dt":1553623200,"main":{"temp":21.95,"temp_min":21.95,"temp_max":21.95,"pressure":1014.3,"sea_level":1014.3,"grnd_level":981.04,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":64},"wind":{"speed":2.08,"deg":92.0071},"rain":{"3h":0.074999999999999},"sys":{"pod":"n"},"dt_txt":"2019-03-26 18:00:00"},{"dt":1553634000,"main":{"temp":20.68,"temp_min":20.68,"temp_max":20.68,"pressure":1013.53,"sea_level":1013.53,"grnd_level":980.16,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":1.21,"deg":77.5008},"rain":{"3h":0.025000000000002},"sys":{"pod":"n"},"dt_txt":"2019-03-26 21:00:00"},{"dt":1553644800,"main":{"temp":21.65,"temp_min":21.65,"temp_max":21.65,"pressure":1015.01,"sea_level":1015.01,"grnd_level":981.5,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":1.51,"deg":79.0023},"rain":{"3h":0.099999999999998},"sys":{"pod":"d"},"dt_txt":"2019-03-27 00:00:00"},{"dt":1553655600,"main":{"temp":25.24,"temp_min":25.24,"temp_max":25.24,"pressure":1015.57,"sea_level":1015.57,"grnd_level":982.31,"humidity":88,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":32},"wind":{"speed":1.72,"deg":88.5014},"rain":{"3h":0.3},"sys":{"pod":"d"},"dt_txt":"2019-03-27 03:00:00"},{"dt":1553666400,"main":{"temp":29.14,"temp_min":29.14,"temp_max":29.14,"pressure":1013.2,"sea_level":1013.2,"grnd_level":980.09,"humidity":69,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.22,"deg":81.0034},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-27 06:00:00"},{"dt":1553677200,"main":{"temp":28.1,"temp_min":28.1,"temp_max":28.1,"pressure":1011.13,"sea_level":1011.13,"grnd_level":978.2,"humidity":67,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.76,"deg":77.0026},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-27 09:00:00"},{"dt":1553688000,"main":{"temp":24.05,"temp_min":24.05,"temp_max":24.05,"pressure":1012.36,"sea_level":1012.36,"grnd_level":979.21,"humidity":82,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":64},"wind":{"speed":2.27,"deg":84.0018},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-27 12:00:00"},{"dt":1553698800,"main":{"temp":22.17,"temp_min":22.17,"temp_max":22.17,"pressure":1013.51,"sea_level":1013.51,"grnd_level":980.3,"humidity":91,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":56},"wind":{"speed":1.05,"deg":82.5006},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-27 15:00:00"},{"dt":1553709600,"main":{"temp":21.09,"temp_min":21.09,"temp_max":21.09,"pressure":1012.55,"sea_level":1012.55,"grnd_level":979.26,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":48},"wind":{"speed":1.12,"deg":351.003},"rain":{"3h":0.024999999999999},"sys":{"pod":"n"},"dt_txt":"2019-03-27 18:00:00"},{"dt":1553720400,"main":{"temp":21.15,"temp_min":21.15,"temp_max":21.15,"pressure":1011.36,"sea_level":1011.36,"grnd_level":978.07,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":68},"wind":{"speed":1.16,"deg":339},"rain":{"3h":0.075000000000003},"sys":{"pod":"n"},"dt_txt":"2019-03-27 21:00:00"},{"dt":1553731200,"main":{"temp":21.75,"temp_min":21.75,"temp_max":21.75,"pressure":1011.7,"sea_level":1011.7,"grnd_level":978.43,"humidity":95,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":64},"wind":{"speed":1.15,"deg":311.503},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-28 00:00:00"},{"dt":1553742000,"main":{"temp":28.65,"temp_min":28.65,"temp_max":28.65,"pressure":1011.42,"sea_level":1011.42,"grnd_level":978.23,"humidity":70,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":0},"wind":{"speed":1.63,"deg":82.0045},"rain":{"3h":0.049999999999997},"sys":{"pod":"d"},"dt_txt":"2019-03-28 03:00:00"},{"dt":1553752800,"main":{"temp":33.05,"temp_min":33.05,"temp_max":33.05,"pressure":1008.85,"sea_level":1008.85,"grnd_level":975.87,"humidity":55,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02d"}],"clouds":{"all":8},"wind":{"speed":1.56,"deg":45.001},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-28 06:00:00"},{"dt":1553763600,"main":{"temp":31.43,"temp_min":31.43,"temp_max":31.43,"pressure":1007.16,"sea_level":1007.16,"grnd_level":974.34,"humidity":52,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":32},"wind":{"speed":2.36,"deg":70.5049},"rain":{"3h":0.075000000000003},"sys":{"pod":"d"},"dt_txt":"2019-03-28 09:00:00"},{"dt":1553774400,"main":{"temp":25.56,"temp_min":25.56,"temp_max":25.56,"pressure":1009.01,"sea_level":1009.01,"grnd_level":976.18,"humidity":78,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":36},"wind":{"speed":1.16,"deg":67.0034},"rain":{"3h":0.25},"sys":{"pod":"n"},"dt_txt":"2019-03-28 12:00:00"}]
     * city : {"id":1582926,"name":"Dong Ha","coord":{"lat":16.8163,"lon":107.1003},"country":"VN","population":17662}
     */

    private String cod;
    private double message;
    private int cnt;
    private City city;
    private List<ListWeather> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<ListWeather> getList() {
        return list;
    }

    public void setList(List<ListWeather> list) {
        this.list = list;
    }

    public static class City {
        /**
         * id : 1582926
         * name : Dong Ha
         * coord : {"lat":16.8163,"lon":107.1003}
         * country : VN
         * population : 17662
         */

        private int id;
        private String name;
        private Coord coord;
        private String country;
        private int population;

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

        public Coord getCoord() {
            return coord;
        }

        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class Coord {
            /**
             * lat : 16.8163
             * lon : 107.1003
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListWeather implements BaseModel {
        /**
         * dt : 1553353200
         * main : {"temp":20.05,"temp_min":20.05,"temp_max":22.67,"pressure":1013.48,"sea_level":1013.48,"grnd_level":980.27,"humidity":93,"temp_kf":-2.62}
         * weather : [{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}]
         * clouds : {"all":92}
         * wind : {"speed":1.61,"deg":5.00049}
         * rain : {"3h":7.23}
         * sys : {"pod":"n"}
         * dt_txt : 2019-03-23 15:00:00
         */

        private long dt;
        private Main main;
        private Clouds clouds;
        private Wind wind;
        private Rain rain;
        private Sys sys;
        private String dt_txt;
        private List<Weather> weather;

        public long getDt() {
            return dt;
        }

        public void setDt(long dt) {
            this.dt = dt;
        }

        public Main getMain() {
            return main;
        }

        public void setMain(Main main) {
            this.main = main;
        }

        public Clouds getClouds() {
            return clouds;
        }

        public void setClouds(Clouds clouds) {
            this.clouds = clouds;
        }

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        public Rain getRain() {
            return rain;
        }

        public void setRain(Rain rain) {
            this.rain = rain;
        }

        public Sys getSys() {
            return sys;
        }

        public void setSys(Sys sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<Weather> getWeather() {
            return weather;
        }

        public void setWeather(List<Weather> weather) {
            this.weather = weather;
        }

        public static class Main {
            /**
             * temp : 20.05
             * temp_min : 20.05
             * temp_max : 22.67
             * pressure : 1013.48
             * sea_level : 1013.48
             * grnd_level : 980.27
             * humidity : 93
             * temp_kf : -2.62
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class Clouds {
            /**
             * all : 92
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class Wind {
            /**
             * speed : 1.61
             * deg : 5.00049
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class Rain {
            /**
             * 3h : 7.23
             */

            @SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class Sys {
            /**
             * pod : n
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class Weather {
            /**
             * id : 501
             * main : Rain
             * description : moderate rain
             * icon : 10n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}

package com.example.korselthymeleaf;

public class Linjatdheoraret {

    public static class linjaDheOraret{

        String emertimiILinjes;
        String ditetENisjes;
        String orariINisjes;
        String ditetEKthimit;
        String orariIKthimit;


        public linjaDheOraret(String emertimiILinjes, String ditetENisjes, String orariINisjes, String ditetEKthimit, String orariIKthimit) {
            this.emertimiILinjes = emertimiILinjes;
            this.ditetENisjes = ditetENisjes;
            this.orariINisjes = orariINisjes;
            this.ditetEKthimit = ditetEKthimit;
            this.orariIKthimit = orariIKthimit;
        }

        public String getEmertimiILinjes() {
            return emertimiILinjes;
        }

        public String getDitetENisjes() {
            return ditetENisjes;
        }

        public String getOrariINisjes() {
            return orariINisjes;
        }

        public String getDitetEKthimit() {
            return ditetEKthimit;
        }

        public String getOrariIKthimit() {
            return orariIKthimit;
        }
    }
}



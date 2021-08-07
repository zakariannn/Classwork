package com.aca.week5.gen;

import java.util.Random;

public class Main {
    private static final String[] STRINGS = {"a", "6", "d", "s"};
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        final GenerationResult generate = new Main().generate(100000);
        System.out.println(generate.toString());
    }

    public GenerationResult generate(int count) {
        final long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < count; ++i) {
            if(System.currentTimeMillis() - start > 1000){
                throw new CalculationTimeoutException("count" + " " + count + " " + "more than 100 millis");
            }
            final int index = RANDOM.nextInt(STRINGS.length);
            final String randomSymbol = STRINGS[index];
            result += randomSymbol;
        }
        return new GenerationResult(result, 0);
    }

    private class GenerationResult {
        private final String name;
        private final long duration;

        public GenerationResult(String name, long duration) {
            this.name = name;
            this.duration = duration;
        }

        public String getName() {
            return name;
        }

        public long getDuration() {
            return duration;
        }

        @Override
        public String toString() {
            return "GenerationResult{" +
                    "name='" + name + '\'' +
                    ", duration=" + duration +
                    '}';
        }
    }


}

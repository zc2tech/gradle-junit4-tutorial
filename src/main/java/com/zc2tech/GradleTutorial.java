package com.zc2tech;

class  GradleTutorial {
    public static void main(String[] args) {
        System.out.println("Hello,Gradle Tutorial");
        GradleTutorial inst = new GradleTutorial();
        System.out.println("Result of 2000 + 22 is: " + inst.getPlusResult(2000,22));
    }

    public int getPlusResult(int a,int b) {
        return a+b;
    }
}
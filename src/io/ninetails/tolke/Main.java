package com.ninetails;

public class Main {

    public static void main(String[] args) {
	    // Driver for tolke
        private String filename;
        private String language;

        switch (args.length) {
            case 0:
                exit;
            case 1:
                filename = args[0];
                language = "Java";
                break;
            default:
                filename = args[0];
                language = args[1];
        }

        System.out.println("Welcome to Tolke\n\nExecuting " + filename + " in "+ language);
    }
}

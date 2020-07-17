package edu.pucmm.isc;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(javalinConfig -> {
        }).start(7100);

        app.get("/", ctx -> ctx.result("Esta es la app1 a la que se accede por medio de 'app.intelligence.gq'"));
    }
}

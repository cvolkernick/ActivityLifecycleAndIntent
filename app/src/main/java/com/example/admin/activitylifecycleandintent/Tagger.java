package com.example.admin.activitylifecycleandintent;

/**
 * Created by Admin on 3/27/2018.
 */

public class Tagger {

    public static String get(Object o) {
        return o.getClass().getSimpleName();
    }
}

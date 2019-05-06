package com.example.myapplication;

import android.support.design.widget.Snackbar;
import android.view.View;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void onClick(View view) {
        Snackbar.make(view, "hello", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
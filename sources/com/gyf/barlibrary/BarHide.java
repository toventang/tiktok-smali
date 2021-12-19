package com.gyf.barlibrary;

import com.bytedance.covode.number.Covode;

public enum BarHide {
    FLAG_HIDE_STATUS_BAR,
    FLAG_HIDE_NAVIGATION_BAR,
    FLAG_HIDE_BAR,
    FLAG_SHOW_BAR;

    static {
        Covode.recordClassIndex(34156);
    }
}

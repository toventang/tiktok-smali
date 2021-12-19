package com.ss.android.sdk.webview;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class WebViewGeoEntry {
    @c(a = "ad_switch")
    public boolean adSwitch;
    @c(a = "main_switch")
    public boolean mainSwitch = true;
    @c(a = "regions")
    public List<String> regions;
    @c(a = "web_switch")
    public boolean webSwitch;

    static {
        Covode.recordClassIndex(37159);
    }
}

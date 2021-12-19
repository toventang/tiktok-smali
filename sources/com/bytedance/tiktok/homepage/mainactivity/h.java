package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f44167a;

    static {
        Covode.recordClassIndex(27064);
    }

    public h(Activity activity) {
        this.f44167a = activity;
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

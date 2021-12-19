package com.ss.android.ugc.aweme.d;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f79334a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(49247);
    }

    public static View a(Activity activity, int i2, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        c inflater;
        View a2;
        l.c(layoutInflater, "");
        if (!(activity instanceof d)) {
            activity = null;
        }
        d dVar = (d) activity;
        if (dVar != null && (inflater = dVar.getInflater()) != null && (a2 = inflater.a(i2)) != null) {
            return a2;
        }
        View a3 = a.a(layoutInflater, i2, viewGroup, false);
        l.a((Object) a3, "");
        return a3;
    }
}

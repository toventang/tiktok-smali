package com.ss.android.ugc.aweme.sharer.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f124504a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<View, Long> f124505b = new WeakHashMap<>();

    private b() {
    }

    static {
        Covode.recordClassIndex(81770);
    }

    public static boolean a(View view, long j2) {
        if (view == null) {
            return false;
        }
        WeakHashMap<View, Long> weakHashMap = f124505b;
        Long l2 = weakHashMap.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l2 == null) {
            weakHashMap.put(view, Long.valueOf(nanoTime));
            return false;
        } else if (nanoTime - l2.longValue() <= j2) {
            return true;
        } else {
            weakHashMap.put(view, Long.valueOf(nanoTime));
            return false;
        }
    }
}

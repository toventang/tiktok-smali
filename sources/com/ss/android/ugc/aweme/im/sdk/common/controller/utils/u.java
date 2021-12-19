package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<View, Long> f102444a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final u f102445b = new u();

    /* renamed from: c  reason: collision with root package name */
    private static final int f102446c = 1200;

    private u() {
    }

    static {
        Covode.recordClassIndex(65584);
    }

    public static boolean a(View view, long j2) {
        if (view == null) {
            return false;
        }
        WeakHashMap<View, Long> weakHashMap = f102444a;
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

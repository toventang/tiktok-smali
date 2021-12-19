package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.util.bj;

public final class gf {

    /* renamed from: a  reason: collision with root package name */
    public static final gf f143003a = new gf();

    /* renamed from: b  reason: collision with root package name */
    private static long f143004b;

    private gf() {
    }

    static {
        Covode.recordClassIndex(93587);
    }

    public static final void a() {
        bj.d("click to open camera");
        f143004b = System.currentTimeMillis();
    }

    public static final void b() {
        bj.d("open camera to first frame cost = ".concat(String.valueOf(System.currentTimeMillis() - f143004b)));
    }
}

package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class cr {

    /* renamed from: a  reason: collision with root package name */
    static final Keva f78302a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f78303b;

    /* renamed from: c  reason: collision with root package name */
    static long f78304c;

    /* renamed from: d  reason: collision with root package name */
    public static final cr f78305d = new cr();

    private cr() {
    }

    static {
        Covode.recordClassIndex(48606);
        Keva repo = Keva.getRepo("NewUserUtils");
        f78302a = repo;
        f78304c = repo.getLong("last_open_time", -1);
    }
}

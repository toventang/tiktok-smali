package com.ss.android.ugc.aweme.detail.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f79609a = (AVApiImpl.b().a() + "/aweme/v1/aweme/react_duet/limit/reference/");

    public static b a() {
        if (!c.u.a()) {
            return (b) AVApiImpl.b().a(f79609a, b.class);
        }
        throw new IllegalStateException("Cannot access in ftc");
    }

    static {
        Covode.recordClassIndex(49453);
    }
}

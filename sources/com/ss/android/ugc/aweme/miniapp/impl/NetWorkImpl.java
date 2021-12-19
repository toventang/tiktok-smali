package com.ss.android.ugc.aweme.miniapp.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.o;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.miniapp_api.a.g;

public class NetWorkImpl implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f109653a = NetWorkImpl.class.getSimpleName();

    public interface NetApi {
        static {
            Covode.recordClassIndex(70171);
        }

        @h
        q<String> doGet(@o int i2, @ag String str);
    }

    static {
        Covode.recordClassIndex(70170);
    }
}

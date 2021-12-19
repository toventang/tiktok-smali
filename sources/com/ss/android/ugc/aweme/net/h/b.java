package com.ss.android.ugc.aweme.net.h;

import com.bytedance.covode.number.Covode;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;

public final class b {
    static {
        Covode.recordClassIndex(72195);
    }

    public static Response a(Interceptor.Chain chain, String str) {
        return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).message(str).code(200).body(new c(MediaType.parse("text/plain; charset=utf-8"))).build();
    }
}

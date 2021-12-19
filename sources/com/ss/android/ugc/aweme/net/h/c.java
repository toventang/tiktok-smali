package com.ss.android.ugc.aweme.net.h;

import com.bytedance.covode.number.Covode;
import k.f;
import k.h;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public final class c extends ResponseBody {

    /* renamed from: a  reason: collision with root package name */
    private final MediaType f112358a;

    /* renamed from: b  reason: collision with root package name */
    private final long f112359b = 0;

    static {
        Covode.recordClassIndex(72202);
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f112359b;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f112358a;
    }

    @Override // okhttp3.ResponseBody
    public final h source() {
        return new f();
    }

    public c(MediaType mediaType) {
        this.f112358a = mediaType;
    }
}

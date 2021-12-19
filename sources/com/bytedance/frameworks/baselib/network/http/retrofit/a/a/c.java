package com.bytedance.frameworks.baselib.network.http.retrofit.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.f;
import com.google.gson.v;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

final class c<T> implements e<TypedInput, T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f29385a;

    /* renamed from: b  reason: collision with root package name */
    private final v<T> f29386b;

    static {
        Covode.recordClassIndex(17133);
    }

    /* access modifiers changed from: private */
    public T a(TypedInput typedInput) {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.in(), str);
        try {
            return this.f29386b.read(this.f29385a.a((Reader) inputStreamReader));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    c(f fVar, v<T> vVar) {
        this.f29385a = fVar;
        this.f29386b = vVar;
    }
}

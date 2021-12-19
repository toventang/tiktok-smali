package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.f;
import com.google.gson.v;
import com.ss.android.ugc.aweme.app.api.c;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

final class d<T> implements e<TypedInput, T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f35023a;

    /* renamed from: b  reason: collision with root package name */
    private final v<T> f35024b;

    static {
        Covode.recordClassIndex(21010);
    }

    /* access modifiers changed from: private */
    public T a(TypedInput typedInput) {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.in(), str);
        try {
            T read = this.f35024b.read(this.f35023a.a((Reader) inputStreamReader));
            if ((read instanceof c) && (typedInput instanceof TypedByteArray)) {
                read.setJsonData(new String(((TypedByteArray) typedInput).getBytes(), str));
            }
            return read;
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    d(f fVar, v<T> vVar) {
        this.f35023a = fVar;
        this.f35024b = vVar;
    }
}

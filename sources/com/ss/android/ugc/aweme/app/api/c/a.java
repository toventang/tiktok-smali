package com.ss.android.ugc.aweme.app.api.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.f;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.q;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.logger.a;
import f.a.t;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements e<TypedInput, c> {

    /* renamed from: a  reason: collision with root package name */
    static String f66596a = "wire_convert";

    /* renamed from: c  reason: collision with root package name */
    private static AtomicBoolean f66597c = new AtomicBoolean(true);

    /* renamed from: b  reason: collision with root package name */
    public final Type f66598b;

    /* renamed from: d  reason: collision with root package name */
    private final f f66599d;

    /* renamed from: e  reason: collision with root package name */
    private final q f66600e;

    /* renamed from: f  reason: collision with root package name */
    private d f66601f;

    static {
        Covode.recordClassIndex(40945);
    }

    private c b(TypedInput typedInput) {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.in(), str);
        try {
            return new c(this.f66599d.a((com.google.gson.b.a) com.google.gson.b.a.get(this.f66598b)).read(this.f66599d.a((Reader) inputStreamReader)), null);
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.retrofit2.e
    public final /* synthetic */ c a(TypedInput typedInput) {
        boolean z;
        TypedInput typedInput2 = typedInput;
        Type type = this.f66598b;
        if (!(type == null || type != FeedItemList.class || typedInput2 == null)) {
            String mimeType = typedInput2.mimeType();
            int i2 = 1;
            if (TextUtils.isEmpty(mimeType) || !mimeType.contains("json")) {
                z = false;
            } else {
                z = true;
            }
            com.ss.android.ugc.aweme.logger.a aVar = a.b.f109011a;
            if (!z) {
                i2 = 2;
            }
            if (aVar.f109005f == -1) {
                aVar.f109005f = i2;
            }
        }
        return a(typedInput2);
    }

    private c a(TypedInput typedInput) {
        boolean z;
        String mimeType = typedInput.mimeType();
        if (TextUtils.isEmpty(mimeType) || !mimeType.contains("json")) {
            z = false;
        } else {
            z = true;
        }
        if (f66597c.get()) {
            f66597c.getAndSet(false);
            t.b("").a(f.a.h.a.b(f.a.k.a.f158006c)).d(new b(z));
        }
        if (z) {
            com.ss.android.ugc.aweme.framework.a.a.a(2, "ComposePbAndJson", "response json");
            try {
                long currentTimeMillis = System.currentTimeMillis();
                c b2 = b(typedInput);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                d dVar = this.f66601f;
                if (dVar != null) {
                    dVar.a(currentTimeMillis2, b2.f66603a, null, true);
                }
                return b2;
            } catch (IOException e2) {
                d dVar2 = this.f66601f;
                if (dVar2 != null) {
                    dVar2.a(e2.getMessage());
                }
                throw e2;
            }
        } else {
            try {
                long currentTimeMillis3 = System.currentTimeMillis();
                c cVar = new c(null, this.f66600e.a(typedInput));
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                d dVar3 = this.f66601f;
                if (dVar3 != null) {
                    dVar3.a(currentTimeMillis4, null, cVar.f66604b, false);
                }
                return cVar;
            } catch (IOException e3) {
                d dVar4 = this.f66601f;
                if (dVar4 != null) {
                    dVar4.a(e3.getMessage());
                }
                throw e3;
            }
        }
    }

    public a(ParameterizedType parameterizedType, f fVar, d dVar) {
        this.f66599d = fVar;
        this.f66601f = dVar;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        this.f66600e = new q(ProtoAdapter.get((Class) actualTypeArguments[0]));
        this.f66598b = actualTypeArguments[1];
    }
}

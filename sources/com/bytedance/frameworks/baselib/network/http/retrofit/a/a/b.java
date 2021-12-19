package com.bytedance.frameworks.baselib.network.http.retrofit.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

final class b<T> implements e<T, TypedOutput> {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f29382a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private final f f29383b;

    /* renamed from: c  reason: collision with root package name */
    private final v<T> f29384c;

    static {
        Covode.recordClassIndex(17132);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.retrofit2.e
    public final /* synthetic */ TypedOutput a(Object obj) {
        MethodCollector.i(1205);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        c a2 = this.f29383b.a((Writer) new OutputStreamWriter(byteArrayOutputStream, f29382a));
        this.f29384c.write(a2, obj);
        a2.close();
        TypedByteArray typedByteArray = new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
        MethodCollector.o(1205);
        return typedByteArray;
    }

    b(f fVar, v<T> vVar) {
        this.f29383b = fVar;
        this.f29384c = vVar;
    }
}

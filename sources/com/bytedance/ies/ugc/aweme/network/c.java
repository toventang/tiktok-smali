package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.f;
import com.google.gson.v;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

final class c<T> implements e<T, TypedOutput> {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f35020a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private final f f35021b;

    /* renamed from: c  reason: collision with root package name */
    private final v<T> f35022c;

    static {
        Covode.recordClassIndex(21009);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.retrofit2.e
    public final /* synthetic */ TypedOutput a(Object obj) {
        MethodCollector.i(6194);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        com.google.gson.c.c a2 = this.f35021b.a((Writer) new OutputStreamWriter(byteArrayOutputStream, f35020a));
        this.f35022c.write(a2, obj);
        a2.close();
        TypedByteArray typedByteArray = new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
        MethodCollector.o(6194);
        return typedByteArray;
    }

    c(f fVar, v<T> vVar) {
        this.f35021b = fVar;
        this.f35022c = vVar;
    }
}

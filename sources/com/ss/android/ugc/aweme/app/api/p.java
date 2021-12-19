package com.ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import k.f;
import k.g;
import okhttp3.MediaType;

final class p<T extends Message<T, ?>> implements e<T, TypedOutput> {

    /* renamed from: a  reason: collision with root package name */
    private static final MediaType f66644a = MediaType.parse("application/x-protobuf");

    /* renamed from: b  reason: collision with root package name */
    private final ProtoAdapter<T> f66645b;

    static {
        Covode.recordClassIndex(40980);
    }

    p(ProtoAdapter<T> protoAdapter) {
        this.f66645b = protoAdapter;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.retrofit2.e
    public final /* synthetic */ TypedOutput a(Object obj) {
        f fVar = new f();
        this.f66645b.encode((g) fVar, (T) obj);
        return new TypedByteArray(f66644a.type(), fVar.u(), new String[0]);
    }
}

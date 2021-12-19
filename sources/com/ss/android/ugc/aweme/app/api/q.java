package com.ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

public final class q<T extends Message<T, ?>> implements e<TypedInput, T> {

    /* renamed from: a  reason: collision with root package name */
    private final ProtoAdapter<T> f66646a;

    static {
        Covode.recordClassIndex(40981);
    }

    public q(ProtoAdapter<T> protoAdapter) {
        this.f66646a = protoAdapter;
    }

    public final T a(TypedInput typedInput) {
        try {
            return this.f66646a.decode(typedInput.in());
        } finally {
            typedInput.in().reset();
        }
    }
}

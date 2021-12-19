package com.squareup.wire;

import com.bytedance.covode.number.Covode;

public abstract class DefaultValueProtoAdapter<E> extends ProtoAdapter<E> {
    static {
        Covode.recordClassIndex(36102);
    }

    public abstract E decode(ProtoReader protoReader, E e2);

    public DefaultValueProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        super(fieldEncoding, cls);
    }
}

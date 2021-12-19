package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.Serializable;
import java.io.StreamCorruptedException;

final class MessageSerializedForm<M extends Message<M, B>, B extends Message.Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final byte[] bytes;
    private final Class<M> messageClass;

    static {
        Covode.recordClassIndex(36109);
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        try {
            return ProtoAdapter.get(this.messageClass).decode(this.bytes);
        } catch (IOException e2) {
            throw new StreamCorruptedException(e2.getMessage());
        }
    }

    public MessageSerializedForm(byte[] bArr, Class<M> cls) {
        this.bytes = bArr;
        this.messageClass = cls;
    }
}

package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Objects;
import k.f;
import k.g;
import k.i;

public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    transient int cachedSerializedSize;
    public transient int hashCode;
    private final transient i unknownFields;

    static {
        Covode.recordClassIndex(36107);
    }

    public abstract Builder<M, B> newBuilder();

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public final i unknownFields() {
        i iVar = this.unknownFields;
        if (iVar != null) {
            return iVar;
        }
        return i.EMPTY;
    }

    public final M withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    /* access modifiers changed from: protected */
    public final Object writeReplace() {
        return new MessageSerializedForm(encode(), getClass());
    }

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        transient f unknownFieldsBuffer;
        transient i unknownFieldsByteString = i.EMPTY;
        transient ProtoWriter unknownFieldsWriter;

        static {
            Covode.recordClassIndex(36108);
        }

        public abstract M build();

        public final i buildUnknownFields() {
            f fVar = this.unknownFieldsBuffer;
            if (fVar != null) {
                this.unknownFieldsByteString = fVar.q();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = i.EMPTY;
            f fVar = this.unknownFieldsBuffer;
            if (fVar != null) {
                fVar.v();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        private void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new f();
                ProtoWriter protoWriter = new ProtoWriter(this.unknownFieldsBuffer);
                this.unknownFieldsWriter = protoWriter;
                try {
                    protoWriter.writeBytes(this.unknownFieldsByteString);
                    this.unknownFieldsByteString = i.EMPTY;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }

        public final Builder<M, B> addUnknownFields(i iVar) {
            if (iVar.size() > 0) {
                prepareForNewUnknownFields();
                try {
                    this.unknownFieldsWriter.writeBytes(iVar);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public final Builder<M, B> addUnknownField(int i2, FieldEncoding fieldEncoding, Object obj) {
            prepareForNewUnknownFields();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.unknownFieldsWriter, i2, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream outputStream) {
        this.adapter.encode(outputStream, this);
    }

    public final void encode(g gVar) {
        this.adapter.encode(gVar, this);
    }

    public Message(ProtoAdapter<M> protoAdapter, i iVar) {
        Objects.requireNonNull(protoAdapter, "adapter == null");
        Objects.requireNonNull(iVar, "unknownFields == null");
        this.adapter = protoAdapter;
        this.unknownFields = iVar;
    }
}

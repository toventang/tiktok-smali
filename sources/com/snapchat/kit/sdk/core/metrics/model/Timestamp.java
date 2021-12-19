package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class Timestamp extends Message<Timestamp, Builder> {
    public static final ProtoAdapter<Timestamp> ADAPTER = new ProtoAdapter_Timestamp();
    public static final Integer DEFAULT_NANOS = 0;
    public static final Long DEFAULT_SECONDS = 0L;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer nanos;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long seconds;

    static final class ProtoAdapter_Timestamp extends ProtoAdapter<Timestamp> {
        static {
            Covode.recordClassIndex(35768);
        }

        public ProtoAdapter_Timestamp() {
            super(FieldEncoding.LENGTH_DELIMITED, Timestamp.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.snapchat.kit.sdk.core.metrics.model.Timestamp$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.Timestamp redact(com.snapchat.kit.sdk.core.metrics.model.Timestamp r2) {
            /*
                r1 = this;
                com.snapchat.kit.sdk.core.metrics.model.Timestamp$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.Timestamp.ProtoAdapter_Timestamp.redact(com.snapchat.kit.sdk.core.metrics.model.Timestamp):com.snapchat.kit.sdk.core.metrics.model.Timestamp");
        }

        public final int encodedSize(Timestamp timestamp) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, timestamp.seconds) + ProtoAdapter.INT32.encodedSizeWithTag(2, timestamp.nanos) + timestamp.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Timestamp decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.seconds(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.nanos(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Timestamp timestamp) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, timestamp.seconds);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, timestamp.nanos);
            protoWriter.writeBytes(timestamp.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<Timestamp, Builder> {
        public Integer nanos;
        public Long seconds;

        static {
            Covode.recordClassIndex(35767);
        }

        @Override // com.squareup.wire.Message.Builder
        public final Timestamp build() {
            return new Timestamp(this.seconds, this.nanos, super.buildUnknownFields());
        }

        public final Builder nanos(Integer num) {
            this.nanos = num;
            return this;
        }

        public final Builder seconds(Long l2) {
            this.seconds = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35766);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.Timestamp$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<Timestamp, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.seconds = this.seconds;
        builder.nanos = this.nanos;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.seconds;
        int i4 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Integer num = this.nanos;
        if (num != null) {
            i4 = num.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.seconds != null) {
            sb.append(", seconds=").append(this.seconds);
        }
        if (this.nanos != null) {
            sb.append(", nanos=").append(this.nanos);
        }
        return sb.replace(0, 2, "Timestamp{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timestamp)) {
            return false;
        }
        Timestamp timestamp = (Timestamp) obj;
        if (!unknownFields().equals(timestamp.unknownFields()) || !Internal.equals(this.seconds, timestamp.seconds) || !Internal.equals(this.nanos, timestamp.nanos)) {
            return false;
        }
        return true;
    }

    public Timestamp(Long l2, Integer num) {
        this(l2, num, i.EMPTY);
    }

    public Timestamp(Long l2, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.seconds = l2;
        this.nanos = num;
    }
}

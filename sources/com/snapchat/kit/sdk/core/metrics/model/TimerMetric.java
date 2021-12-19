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

public final class TimerMetric extends Message<TimerMetric, Builder> {
    public static final ProtoAdapter<TimerMetric> ADAPTER = new ProtoAdapter_TimerMetric();
    public static final Long DEFAULT_LATENCY_MILLIS = 0L;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long latency_millis;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.Timestamp#ADAPTER", tag = 2)
    public final Timestamp timestamp;

    static final class ProtoAdapter_TimerMetric extends ProtoAdapter<TimerMetric> {
        static {
            Covode.recordClassIndex(35765);
        }

        public ProtoAdapter_TimerMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, TimerMetric.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.TimerMetric$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.TimerMetric redact(com.snapchat.kit.sdk.core.metrics.model.TimerMetric r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.TimerMetric$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = r2.timestamp
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.Timestamp> r1 = com.snapchat.kit.sdk.core.metrics.model.Timestamp.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = r2.timestamp
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = (com.snapchat.kit.sdk.core.metrics.model.Timestamp) r0
                r2.timestamp = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.TimerMetric r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.TimerMetric.ProtoAdapter_TimerMetric.redact(com.snapchat.kit.sdk.core.metrics.model.TimerMetric):com.snapchat.kit.sdk.core.metrics.model.TimerMetric");
        }

        public final int encodedSize(TimerMetric timerMetric) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, timerMetric.name) + Timestamp.ADAPTER.encodedSizeWithTag(2, timerMetric.timestamp) + ProtoAdapter.INT64.encodedSizeWithTag(3, timerMetric.latency_millis) + timerMetric.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TimerMetric decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.timestamp(Timestamp.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.latency_millis(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, TimerMetric timerMetric) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, timerMetric.name);
            Timestamp.ADAPTER.encodeWithTag(protoWriter, 2, timerMetric.timestamp);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, timerMetric.latency_millis);
            protoWriter.writeBytes(timerMetric.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<TimerMetric, Builder> {
        public Long latency_millis;
        public String name;
        public Timestamp timestamp;

        static {
            Covode.recordClassIndex(35764);
        }

        @Override // com.squareup.wire.Message.Builder
        public final TimerMetric build() {
            return new TimerMetric(this.name, this.timestamp, this.latency_millis, super.buildUnknownFields());
        }

        public final Builder latency_millis(Long l2) {
            this.latency_millis = l2;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder timestamp(Timestamp timestamp2) {
            this.timestamp = timestamp2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35763);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.TimerMetric$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<TimerMetric, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.timestamp = this.timestamp;
        builder.latency_millis = this.latency_millis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        Timestamp timestamp2 = this.timestamp;
        if (timestamp2 != null) {
            i3 = timestamp2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        Long l2 = this.latency_millis;
        if (l2 != null) {
            i5 = l2.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=").append(this.name);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=").append(this.timestamp);
        }
        if (this.latency_millis != null) {
            sb.append(", latency_millis=").append(this.latency_millis);
        }
        return sb.replace(0, 2, "TimerMetric{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimerMetric)) {
            return false;
        }
        TimerMetric timerMetric = (TimerMetric) obj;
        if (!unknownFields().equals(timerMetric.unknownFields()) || !Internal.equals(this.name, timerMetric.name) || !Internal.equals(this.timestamp, timerMetric.timestamp) || !Internal.equals(this.latency_millis, timerMetric.latency_millis)) {
            return false;
        }
        return true;
    }

    public TimerMetric(String str, Timestamp timestamp2, Long l2) {
        this(str, timestamp2, l2, i.EMPTY);
    }

    public TimerMetric(String str, Timestamp timestamp2, Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.name = str;
        this.timestamp = timestamp2;
        this.latency_millis = l2;
    }
}

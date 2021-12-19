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

public final class OpMetric extends Message<OpMetric, Builder> {
    public static final ProtoAdapter<OpMetric> ADAPTER = new ProtoAdapter_OpMetric();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CounterMetric#ADAPTER", tag = 1)
    public final CounterMetric counter_metric;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LevelMetric#ADAPTER", tag = 3)
    public final LevelMetric level_metric;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.TimerMetric#ADAPTER", tag = 2)
    public final TimerMetric timer_metric;

    static final class ProtoAdapter_OpMetric extends ProtoAdapter<OpMetric> {
        static {
            Covode.recordClassIndex(35731);
        }

        public ProtoAdapter_OpMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, OpMetric.class);
        }

        public final int encodedSize(OpMetric opMetric) {
            return CounterMetric.ADAPTER.encodedSizeWithTag(1, opMetric.counter_metric) + TimerMetric.ADAPTER.encodedSizeWithTag(2, opMetric.timer_metric) + LevelMetric.ADAPTER.encodedSizeWithTag(3, opMetric.level_metric) + opMetric.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.OpMetric$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.OpMetric redact(com.snapchat.kit.sdk.core.metrics.model.OpMetric r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.OpMetric$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.CounterMetric r0 = r2.counter_metric
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.CounterMetric> r1 = com.snapchat.kit.sdk.core.metrics.model.CounterMetric.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.CounterMetric r0 = r2.counter_metric
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.CounterMetric r0 = (com.snapchat.kit.sdk.core.metrics.model.CounterMetric) r0
                r2.counter_metric = r0
            L_0x0014:
                com.snapchat.kit.sdk.core.metrics.model.TimerMetric r0 = r2.timer_metric
                if (r0 == 0) goto L_0x0024
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.TimerMetric> r1 = com.snapchat.kit.sdk.core.metrics.model.TimerMetric.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.TimerMetric r0 = r2.timer_metric
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.TimerMetric r0 = (com.snapchat.kit.sdk.core.metrics.model.TimerMetric) r0
                r2.timer_metric = r0
            L_0x0024:
                com.snapchat.kit.sdk.core.metrics.model.LevelMetric r0 = r2.level_metric
                if (r0 == 0) goto L_0x0034
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.LevelMetric> r1 = com.snapchat.kit.sdk.core.metrics.model.LevelMetric.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.LevelMetric r0 = r2.level_metric
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.LevelMetric r0 = (com.snapchat.kit.sdk.core.metrics.model.LevelMetric) r0
                r2.level_metric = r0
            L_0x0034:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.OpMetric r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.OpMetric.ProtoAdapter_OpMetric.redact(com.snapchat.kit.sdk.core.metrics.model.OpMetric):com.snapchat.kit.sdk.core.metrics.model.OpMetric");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final OpMetric decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.counter_metric(CounterMetric.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.timer_metric(TimerMetric.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.level_metric(LevelMetric.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, OpMetric opMetric) {
            CounterMetric.ADAPTER.encodeWithTag(protoWriter, 1, opMetric.counter_metric);
            TimerMetric.ADAPTER.encodeWithTag(protoWriter, 2, opMetric.timer_metric);
            LevelMetric.ADAPTER.encodeWithTag(protoWriter, 3, opMetric.level_metric);
            protoWriter.writeBytes(opMetric.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<OpMetric, Builder> {
        public CounterMetric counter_metric;
        public LevelMetric level_metric;
        public TimerMetric timer_metric;

        static {
            Covode.recordClassIndex(35730);
        }

        @Override // com.squareup.wire.Message.Builder
        public final OpMetric build() {
            return new OpMetric(this.counter_metric, this.timer_metric, this.level_metric, super.buildUnknownFields());
        }

        public final Builder counter_metric(CounterMetric counterMetric) {
            this.counter_metric = counterMetric;
            this.timer_metric = null;
            this.level_metric = null;
            return this;
        }

        public final Builder level_metric(LevelMetric levelMetric) {
            this.level_metric = levelMetric;
            this.counter_metric = null;
            this.timer_metric = null;
            return this;
        }

        public final Builder timer_metric(TimerMetric timerMetric) {
            this.timer_metric = timerMetric;
            this.counter_metric = null;
            this.level_metric = null;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35729);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.OpMetric$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<OpMetric, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.counter_metric = this.counter_metric;
        builder.timer_metric = this.timer_metric;
        builder.level_metric = this.level_metric;
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
        CounterMetric counterMetric = this.counter_metric;
        int i5 = 0;
        if (counterMetric != null) {
            i2 = counterMetric.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        TimerMetric timerMetric = this.timer_metric;
        if (timerMetric != null) {
            i3 = timerMetric.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        LevelMetric levelMetric = this.level_metric;
        if (levelMetric != null) {
            i5 = levelMetric.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.counter_metric != null) {
            sb.append(", counter_metric=").append(this.counter_metric);
        }
        if (this.timer_metric != null) {
            sb.append(", timer_metric=").append(this.timer_metric);
        }
        if (this.level_metric != null) {
            sb.append(", level_metric=").append(this.level_metric);
        }
        return sb.replace(0, 2, "OpMetric{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpMetric)) {
            return false;
        }
        OpMetric opMetric = (OpMetric) obj;
        if (!unknownFields().equals(opMetric.unknownFields()) || !Internal.equals(this.counter_metric, opMetric.counter_metric) || !Internal.equals(this.timer_metric, opMetric.timer_metric) || !Internal.equals(this.level_metric, opMetric.level_metric)) {
            return false;
        }
        return true;
    }

    public OpMetric(CounterMetric counterMetric, TimerMetric timerMetric, LevelMetric levelMetric) {
        this(counterMetric, timerMetric, levelMetric, i.EMPTY);
    }

    public OpMetric(CounterMetric counterMetric, TimerMetric timerMetric, LevelMetric levelMetric, i iVar) {
        super(ADAPTER, iVar);
        if (Internal.countNonNull(counterMetric, timerMetric, levelMetric) <= 1) {
            this.counter_metric = counterMetric;
            this.timer_metric = timerMetric;
            this.level_metric = levelMetric;
            return;
        }
        throw new IllegalArgumentException("at most one of counter_metric, timer_metric, level_metric may be non-null");
    }
}

package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class Metrics extends Message<Metrics, Builder> {
    public static final ProtoAdapter<Metrics> ADAPTER = new ProtoAdapter_Metrics();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CounterMetric#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<CounterMetric> counters;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LevelMetric#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<LevelMetric> levels;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.TimerMetric#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<TimerMetric> timers;

    static final class ProtoAdapter_Metrics extends ProtoAdapter<Metrics> {
        static {
            Covode.recordClassIndex(35728);
        }

        public ProtoAdapter_Metrics() {
            super(FieldEncoding.LENGTH_DELIMITED, Metrics.class);
        }

        public final int encodedSize(Metrics metrics) {
            return CounterMetric.ADAPTER.asRepeated().encodedSizeWithTag(1, metrics.counters) + TimerMetric.ADAPTER.asRepeated().encodedSizeWithTag(2, metrics.timers) + LevelMetric.ADAPTER.asRepeated().encodedSizeWithTag(3, metrics.levels) + metrics.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.Metrics$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.Metrics redact(com.snapchat.kit.sdk.core.metrics.model.Metrics r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.Metrics$Builder r2 = r4.newBuilder()
                java.util.List<com.snapchat.kit.sdk.core.metrics.model.CounterMetric> r1 = r2.counters
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.CounterMetric> r0 = com.snapchat.kit.sdk.core.metrics.model.CounterMetric.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                java.util.List<com.snapchat.kit.sdk.core.metrics.model.TimerMetric> r1 = r2.timers
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.TimerMetric> r0 = com.snapchat.kit.sdk.core.metrics.model.TimerMetric.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                java.util.List<com.snapchat.kit.sdk.core.metrics.model.LevelMetric> r1 = r2.levels
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.LevelMetric> r0 = com.snapchat.kit.sdk.core.metrics.model.LevelMetric.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.Metrics r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.Metrics.ProtoAdapter_Metrics.redact(com.snapchat.kit.sdk.core.metrics.model.Metrics):com.snapchat.kit.sdk.core.metrics.model.Metrics");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Metrics decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.counters.add(CounterMetric.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.timers.add(TimerMetric.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.levels.add(LevelMetric.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Metrics metrics) {
            CounterMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, metrics.counters);
            TimerMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, metrics.timers);
            LevelMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, metrics.levels);
            protoWriter.writeBytes(metrics.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<Metrics, Builder> {
        public List<CounterMetric> counters = Internal.newMutableList();
        public List<LevelMetric> levels = Internal.newMutableList();
        public List<TimerMetric> timers = Internal.newMutableList();

        static {
            Covode.recordClassIndex(35727);
        }

        @Override // com.squareup.wire.Message.Builder
        public final Metrics build() {
            return new Metrics(this.counters, this.timers, this.levels, super.buildUnknownFields());
        }

        public final Builder counters(List<CounterMetric> list) {
            Internal.checkElementsNotNull(list);
            this.counters = list;
            return this;
        }

        public final Builder levels(List<LevelMetric> list) {
            Internal.checkElementsNotNull(list);
            this.levels = list;
            return this;
        }

        public final Builder timers(List<TimerMetric> list) {
            Internal.checkElementsNotNull(list);
            this.timers = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35726);
    }

    public final int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = (((((unknownFields().hashCode() * 37) + this.counters.hashCode()) * 37) + this.timers.hashCode()) * 37) + this.levels.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.Metrics$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<Metrics, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.counters = Internal.copyOf("counters", this.counters);
        builder.timers = Internal.copyOf("timers", this.timers);
        builder.levels = Internal.copyOf("levels", this.levels);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.counters.isEmpty()) {
            sb.append(", counters=").append(this.counters);
        }
        if (!this.timers.isEmpty()) {
            sb.append(", timers=").append(this.timers);
        }
        if (!this.levels.isEmpty()) {
            sb.append(", levels=").append(this.levels);
        }
        return sb.replace(0, 2, "Metrics{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Metrics)) {
            return false;
        }
        Metrics metrics = (Metrics) obj;
        if (!unknownFields().equals(metrics.unknownFields()) || !this.counters.equals(metrics.counters) || !this.timers.equals(metrics.timers) || !this.levels.equals(metrics.levels)) {
            return false;
        }
        return true;
    }

    public Metrics(List<CounterMetric> list, List<TimerMetric> list2, List<LevelMetric> list3) {
        this(list, list2, list3, i.EMPTY);
    }

    public Metrics(List<CounterMetric> list, List<TimerMetric> list2, List<LevelMetric> list3, i iVar) {
        super(ADAPTER, iVar);
        this.counters = Internal.immutableCopyOf("counters", list);
        this.timers = Internal.immutableCopyOf("timers", list2);
        this.levels = Internal.immutableCopyOf("levels", list3);
    }
}

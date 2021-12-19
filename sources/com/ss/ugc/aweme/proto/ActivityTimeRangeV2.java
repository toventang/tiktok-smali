package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class ActivityTimeRangeV2 extends Message<ActivityTimeRangeV2, Builder> {
    public static final ProtoAdapter<ActivityTimeRangeV2> ADAPTER = new ProtoAdapter_ActivityTimeRangeV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 3)
    public Double duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 2)
    public Double end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 1)
    public Double start;

    public ActivityTimeRangeV2() {
    }

    static final class ProtoAdapter_ActivityTimeRangeV2 extends ProtoAdapter<ActivityTimeRangeV2> {
        static {
            Covode.recordClassIndex(101842);
        }

        public ProtoAdapter_ActivityTimeRangeV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ActivityTimeRangeV2.class);
        }

        public final int encodedSize(ActivityTimeRangeV2 activityTimeRangeV2) {
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, activityTimeRangeV2.start) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, activityTimeRangeV2.end) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, activityTimeRangeV2.duration) + activityTimeRangeV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ActivityTimeRangeV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.start(ProtoAdapter.DOUBLE.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.end(ProtoAdapter.DOUBLE.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.duration(ProtoAdapter.DOUBLE.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ActivityTimeRangeV2 activityTimeRangeV2) {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, activityTimeRangeV2.start);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, activityTimeRangeV2.end);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, activityTimeRangeV2.duration);
            protoWriter.writeBytes(activityTimeRangeV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ActivityTimeRangeV2, Builder> {
        public Double duration;
        public Double end;
        public Double start;

        static {
            Covode.recordClassIndex(101841);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ActivityTimeRangeV2 build() {
            return new ActivityTimeRangeV2(this.start, this.end, this.duration, super.buildUnknownFields());
        }

        public final Builder duration(Double d2) {
            this.duration = d2;
            return this;
        }

        public final Builder end(Double d2) {
            this.end = d2;
            return this;
        }

        public final Builder start(Double d2) {
            this.start = d2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101840);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ActivityTimeRangeV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ActivityTimeRangeV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.start = this.start;
        builder.end = this.end;
        builder.duration = this.duration;
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
        Double d2 = this.start;
        int i5 = 0;
        if (d2 != null) {
            i2 = d2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        Double d3 = this.end;
        if (d3 != null) {
            i3 = d3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        Double d4 = this.duration;
        if (d4 != null) {
            i5 = d4.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start != null) {
            sb.append(", start=").append(this.start);
        }
        if (this.end != null) {
            sb.append(", end=").append(this.end);
        }
        if (this.duration != null) {
            sb.append(", duration=").append(this.duration);
        }
        return sb.replace(0, 2, "ActivityTimeRangeV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityTimeRangeV2)) {
            return false;
        }
        ActivityTimeRangeV2 activityTimeRangeV2 = (ActivityTimeRangeV2) obj;
        if (!unknownFields().equals(activityTimeRangeV2.unknownFields()) || !Internal.equals(this.start, activityTimeRangeV2.start) || !Internal.equals(this.end, activityTimeRangeV2.end) || !Internal.equals(this.duration, activityTimeRangeV2.duration)) {
            return false;
        }
        return true;
    }

    public ActivityTimeRangeV2(Double d2, Double d3, Double d4) {
        this(d2, d3, d4, i.EMPTY);
    }

    public ActivityTimeRangeV2(Double d2, Double d3, Double d4, i iVar) {
        super(ADAPTER, iVar);
        this.start = d2;
        this.end = d3;
        this.duration = d4;
    }
}

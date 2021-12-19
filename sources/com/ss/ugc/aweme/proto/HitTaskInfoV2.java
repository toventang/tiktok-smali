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

/* access modifiers changed from: package-private */
public final class HitTaskInfoV2 extends Message<HitTaskInfoV2, Builder> {
    public static final ProtoAdapter<HitTaskInfoV2> ADAPTER = new ProtoAdapter_HitTaskInfoV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer compeleted_task_cnt;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer total_task_cnt;

    static final class ProtoAdapter_HitTaskInfoV2 extends ProtoAdapter<HitTaskInfoV2> {
        static {
            Covode.recordClassIndex(102028);
        }

        public ProtoAdapter_HitTaskInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, HitTaskInfoV2.class);
        }

        public final int encodedSize(HitTaskInfoV2 hitTaskInfoV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, hitTaskInfoV2.compeleted_task_cnt) + ProtoAdapter.INT32.encodedSizeWithTag(2, hitTaskInfoV2.total_task_cnt) + hitTaskInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final HitTaskInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.compeleted_task_cnt(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.total_task_cnt(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, HitTaskInfoV2 hitTaskInfoV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, hitTaskInfoV2.compeleted_task_cnt);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, hitTaskInfoV2.total_task_cnt);
            protoWriter.writeBytes(hitTaskInfoV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<HitTaskInfoV2, Builder> {
        public Integer compeleted_task_cnt;
        public Integer total_task_cnt;

        static {
            Covode.recordClassIndex(102027);
        }

        @Override // com.squareup.wire.Message.Builder
        public final HitTaskInfoV2 build() {
            return new HitTaskInfoV2(this.compeleted_task_cnt, this.total_task_cnt, super.buildUnknownFields());
        }

        public final Builder compeleted_task_cnt(Integer num) {
            this.compeleted_task_cnt = num;
            return this;
        }

        public final Builder total_task_cnt(Integer num) {
            this.total_task_cnt = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102026);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.HitTaskInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<HitTaskInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.compeleted_task_cnt = this.compeleted_task_cnt;
        builder.total_task_cnt = this.total_task_cnt;
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
        Integer num = this.compeleted_task_cnt;
        int i4 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Integer num2 = this.total_task_cnt;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.compeleted_task_cnt != null) {
            sb.append(", compeleted_task_cnt=").append(this.compeleted_task_cnt);
        }
        if (this.total_task_cnt != null) {
            sb.append(", total_task_cnt=").append(this.total_task_cnt);
        }
        return sb.replace(0, 2, "HitTaskInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HitTaskInfoV2)) {
            return false;
        }
        HitTaskInfoV2 hitTaskInfoV2 = (HitTaskInfoV2) obj;
        if (!unknownFields().equals(hitTaskInfoV2.unknownFields()) || !Internal.equals(this.compeleted_task_cnt, hitTaskInfoV2.compeleted_task_cnt) || !Internal.equals(this.total_task_cnt, hitTaskInfoV2.total_task_cnt)) {
            return false;
        }
        return true;
    }

    public HitTaskInfoV2(Integer num, Integer num2) {
        this(num, num2, i.EMPTY);
    }

    public HitTaskInfoV2(Integer num, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.compeleted_task_cnt = num;
        this.total_task_cnt = num2;
    }
}

package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class CNYStructV2 extends Message<CNYStructV2, Builder> {
    public static final ProtoAdapter<CNYStructV2> ADAPTER = new ProtoAdapter_CNYStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer feed_show_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String live_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean topview_valid;

    public CNYStructV2() {
    }

    static final class ProtoAdapter_CNYStructV2 extends ProtoAdapter<CNYStructV2> {
        static {
            Covode.recordClassIndex(101941);
        }

        public ProtoAdapter_CNYStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CNYStructV2.class);
        }

        public final int encodedSize(CNYStructV2 cNYStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, cNYStructV2.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(2, cNYStructV2.end_time) + ProtoAdapter.BOOL.encodedSizeWithTag(3, cNYStructV2.topview_valid) + ProtoAdapter.INT32.encodedSizeWithTag(4, cNYStructV2.feed_show_time) + ProtoAdapter.STRING.encodedSizeWithTag(5, cNYStructV2.live_info) + cNYStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CNYStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.start_time(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.end_time(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.topview_valid(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.feed_show_time(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.live_info(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CNYStructV2 cNYStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, cNYStructV2.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, cNYStructV2.end_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, cNYStructV2.topview_valid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, cNYStructV2.feed_show_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, cNYStructV2.live_info);
            protoWriter.writeBytes(cNYStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101939);
    }

    public static final class Builder extends Message.Builder<CNYStructV2, Builder> {
        public Long end_time;
        public Integer feed_show_time;
        public String live_info;
        public Long start_time;
        public Boolean topview_valid;

        static {
            Covode.recordClassIndex(101940);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CNYStructV2 build() {
            return new CNYStructV2(this.start_time, this.end_time, this.topview_valid, this.feed_show_time, this.live_info, super.buildUnknownFields());
        }

        public final Builder end_time(Long l2) {
            this.end_time = l2;
            return this;
        }

        public final Builder feed_show_time(Integer num) {
            this.feed_show_time = num;
            return this;
        }

        public final Builder live_info(String str) {
            this.live_info = str;
            return this;
        }

        public final Builder start_time(Long l2) {
            this.start_time = l2;
            return this;
        }

        public final Builder topview_valid(Boolean bool) {
            this.topview_valid = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CNYStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CNYStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.topview_valid = this.topview_valid;
        builder.feed_show_time = this.feed_show_time;
        builder.live_info = this.live_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.start_time;
        int i7 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        Long l3 = this.end_time;
        if (l3 != null) {
            i3 = l3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        Boolean bool = this.topview_valid;
        if (bool != null) {
            i4 = bool.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        Integer num = this.feed_show_time;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        String str = this.live_info;
        if (str != null) {
            i7 = str.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=").append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=").append(this.end_time);
        }
        if (this.topview_valid != null) {
            sb.append(", topview_valid=").append(this.topview_valid);
        }
        if (this.feed_show_time != null) {
            sb.append(", feed_show_time=").append(this.feed_show_time);
        }
        if (this.live_info != null) {
            sb.append(", live_info=").append(this.live_info);
        }
        return sb.replace(0, 2, "CNYStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CNYStructV2)) {
            return false;
        }
        CNYStructV2 cNYStructV2 = (CNYStructV2) obj;
        if (!unknownFields().equals(cNYStructV2.unknownFields()) || !Internal.equals(this.start_time, cNYStructV2.start_time) || !Internal.equals(this.end_time, cNYStructV2.end_time) || !Internal.equals(this.topview_valid, cNYStructV2.topview_valid) || !Internal.equals(this.feed_show_time, cNYStructV2.feed_show_time) || !Internal.equals(this.live_info, cNYStructV2.live_info)) {
            return false;
        }
        return true;
    }

    public CNYStructV2(Long l2, Long l3, Boolean bool, Integer num, String str) {
        this(l2, l3, bool, num, str, i.EMPTY);
    }

    public CNYStructV2(Long l2, Long l3, Boolean bool, Integer num, String str, i iVar) {
        super(ADAPTER, iVar);
        this.start_time = l2;
        this.end_time = l3;
        this.topview_valid = bool;
        this.feed_show_time = num;
        this.live_info = str;
    }
}

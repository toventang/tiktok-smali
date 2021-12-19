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

/* access modifiers changed from: package-private */
public final class StitchV2 extends Message<StitchV2, Builder> {
    public static final ProtoAdapter<StitchV2> ADAPTER = new ProtoAdapter_StitchV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Boolean is_restitch;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long original_aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String parent_aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String root_aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long stitch_trim_end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long stitch_trim_start_time;

    static final class ProtoAdapter_StitchV2 extends ProtoAdapter<StitchV2> {
        static {
            Covode.recordClassIndex(102223);
        }

        public ProtoAdapter_StitchV2() {
            super(FieldEncoding.LENGTH_DELIMITED, StitchV2.class);
        }

        public final int encodedSize(StitchV2 stitchV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, stitchV2.original_aweme_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, stitchV2.stitch_trim_start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, stitchV2.stitch_trim_end_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, stitchV2.root_aweme_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, stitchV2.parent_aweme_id) + ProtoAdapter.BOOL.encodedSizeWithTag(6, stitchV2.is_restitch) + stitchV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StitchV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.original_aweme_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.stitch_trim_start_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.stitch_trim_end_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.root_aweme_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.parent_aweme_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.is_restitch(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, StitchV2 stitchV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, stitchV2.original_aweme_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, stitchV2.stitch_trim_start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, stitchV2.stitch_trim_end_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, stitchV2.root_aweme_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, stitchV2.parent_aweme_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, stitchV2.is_restitch);
            protoWriter.writeBytes(stitchV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102221);
    }

    public static final class Builder extends Message.Builder<StitchV2, Builder> {
        public Boolean is_restitch;
        public Long original_aweme_id;
        public String parent_aweme_id;
        public String root_aweme_id;
        public Long stitch_trim_end_time;
        public Long stitch_trim_start_time;

        static {
            Covode.recordClassIndex(102222);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StitchV2 build() {
            return new StitchV2(this.original_aweme_id, this.stitch_trim_start_time, this.stitch_trim_end_time, this.root_aweme_id, this.parent_aweme_id, this.is_restitch, super.buildUnknownFields());
        }

        public final Builder is_restitch(Boolean bool) {
            this.is_restitch = bool;
            return this;
        }

        public final Builder original_aweme_id(Long l2) {
            this.original_aweme_id = l2;
            return this;
        }

        public final Builder parent_aweme_id(String str) {
            this.parent_aweme_id = str;
            return this;
        }

        public final Builder root_aweme_id(String str) {
            this.root_aweme_id = str;
            return this;
        }

        public final Builder stitch_trim_end_time(Long l2) {
            this.stitch_trim_end_time = l2;
            return this;
        }

        public final Builder stitch_trim_start_time(Long l2) {
            this.stitch_trim_start_time = l2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.StitchV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StitchV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.original_aweme_id = this.original_aweme_id;
        builder.stitch_trim_start_time = this.stitch_trim_start_time;
        builder.stitch_trim_end_time = this.stitch_trim_end_time;
        builder.root_aweme_id = this.root_aweme_id;
        builder.parent_aweme_id = this.parent_aweme_id;
        builder.is_restitch = this.is_restitch;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.original_aweme_id;
        int i8 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        Long l3 = this.stitch_trim_start_time;
        if (l3 != null) {
            i3 = l3.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        Long l4 = this.stitch_trim_end_time;
        if (l4 != null) {
            i4 = l4.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        String str = this.root_aweme_id;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        String str2 = this.parent_aweme_id;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        Boolean bool = this.is_restitch;
        if (bool != null) {
            i8 = bool.hashCode();
        }
        int i14 = i13 + i8;
        this.hashCode = i14;
        return i14;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.original_aweme_id != null) {
            sb.append(", original_aweme_id=").append(this.original_aweme_id);
        }
        if (this.stitch_trim_start_time != null) {
            sb.append(", stitch_trim_start_time=").append(this.stitch_trim_start_time);
        }
        if (this.stitch_trim_end_time != null) {
            sb.append(", stitch_trim_end_time=").append(this.stitch_trim_end_time);
        }
        if (this.root_aweme_id != null) {
            sb.append(", root_aweme_id=").append(this.root_aweme_id);
        }
        if (this.parent_aweme_id != null) {
            sb.append(", parent_aweme_id=").append(this.parent_aweme_id);
        }
        if (this.is_restitch != null) {
            sb.append(", is_restitch=").append(this.is_restitch);
        }
        return sb.replace(0, 2, "StitchV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StitchV2)) {
            return false;
        }
        StitchV2 stitchV2 = (StitchV2) obj;
        if (!unknownFields().equals(stitchV2.unknownFields()) || !Internal.equals(this.original_aweme_id, stitchV2.original_aweme_id) || !Internal.equals(this.stitch_trim_start_time, stitchV2.stitch_trim_start_time) || !Internal.equals(this.stitch_trim_end_time, stitchV2.stitch_trim_end_time) || !Internal.equals(this.root_aweme_id, stitchV2.root_aweme_id) || !Internal.equals(this.parent_aweme_id, stitchV2.parent_aweme_id) || !Internal.equals(this.is_restitch, stitchV2.is_restitch)) {
            return false;
        }
        return true;
    }

    public StitchV2(Long l2, Long l3, Long l4, String str, String str2, Boolean bool) {
        this(l2, l3, l4, str, str2, bool, i.EMPTY);
    }

    public StitchV2(Long l2, Long l3, Long l4, String str, String str2, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.original_aweme_id = l2;
        this.stitch_trim_start_time = l3;
        this.stitch_trim_end_time = l4;
        this.root_aweme_id = str;
        this.parent_aweme_id = str2;
        this.is_restitch = bool;
    }
}

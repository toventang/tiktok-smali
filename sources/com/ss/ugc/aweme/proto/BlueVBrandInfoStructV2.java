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

public final class BlueVBrandInfoStructV2 extends Message<BlueVBrandInfoStructV2, Builder> {
    public static final ProtoAdapter<BlueVBrandInfoStructV2> ADAPTER = new ProtoAdapter_BlueVBrandInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer brand_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String brand_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer category_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String category_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Integer heat;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public UrlStructV2 logo_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer rank_diff;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String tag_name;

    public BlueVBrandInfoStructV2() {
    }

    static final class ProtoAdapter_BlueVBrandInfoStructV2 extends ProtoAdapter<BlueVBrandInfoStructV2> {
        static {
            Covode.recordClassIndex(101929);
        }

        public ProtoAdapter_BlueVBrandInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BlueVBrandInfoStructV2.class);
        }

        public final int encodedSize(BlueVBrandInfoStructV2 blueVBrandInfoStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, blueVBrandInfoStructV2.category_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, blueVBrandInfoStructV2.category_name) + ProtoAdapter.INT32.encodedSizeWithTag(3, blueVBrandInfoStructV2.brand_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, blueVBrandInfoStructV2.brand_name) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, blueVBrandInfoStructV2.logo_url) + ProtoAdapter.INT32.encodedSizeWithTag(6, blueVBrandInfoStructV2.heat) + ProtoAdapter.INT32.encodedSizeWithTag(7, blueVBrandInfoStructV2.rank) + ProtoAdapter.INT32.encodedSizeWithTag(8, blueVBrandInfoStructV2.rank_diff) + ProtoAdapter.STRING.encodedSizeWithTag(9, blueVBrandInfoStructV2.tag_name) + blueVBrandInfoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlueVBrandInfoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.category_id(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.category_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.brand_id(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.brand_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.logo_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.heat(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.rank(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.rank_diff(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.tag_name(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, BlueVBrandInfoStructV2 blueVBrandInfoStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, blueVBrandInfoStructV2.category_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, blueVBrandInfoStructV2.category_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, blueVBrandInfoStructV2.brand_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, blueVBrandInfoStructV2.brand_name);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, blueVBrandInfoStructV2.logo_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, blueVBrandInfoStructV2.heat);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, blueVBrandInfoStructV2.rank);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, blueVBrandInfoStructV2.rank_diff);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, blueVBrandInfoStructV2.tag_name);
            protoWriter.writeBytes(blueVBrandInfoStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101927);
    }

    public static final class Builder extends Message.Builder<BlueVBrandInfoStructV2, Builder> {
        public Integer brand_id;
        public String brand_name;
        public Integer category_id;
        public String category_name;
        public Integer heat;
        public UrlStructV2 logo_url;
        public Integer rank;
        public Integer rank_diff;
        public String tag_name;

        static {
            Covode.recordClassIndex(101928);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BlueVBrandInfoStructV2 build() {
            return new BlueVBrandInfoStructV2(this.category_id, this.category_name, this.brand_id, this.brand_name, this.logo_url, this.heat, this.rank, this.rank_diff, this.tag_name, super.buildUnknownFields());
        }

        public final Builder brand_id(Integer num) {
            this.brand_id = num;
            return this;
        }

        public final Builder brand_name(String str) {
            this.brand_name = str;
            return this;
        }

        public final Builder category_id(Integer num) {
            this.category_id = num;
            return this;
        }

        public final Builder category_name(String str) {
            this.category_name = str;
            return this;
        }

        public final Builder heat(Integer num) {
            this.heat = num;
            return this;
        }

        public final Builder logo_url(UrlStructV2 urlStructV2) {
            this.logo_url = urlStructV2;
            return this;
        }

        public final Builder rank(Integer num) {
            this.rank = num;
            return this;
        }

        public final Builder rank_diff(Integer num) {
            this.rank_diff = num;
            return this;
        }

        public final Builder tag_name(String str) {
            this.tag_name = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.BlueVBrandInfoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BlueVBrandInfoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.category_id = this.category_id;
        builder.category_name = this.category_name;
        builder.brand_id = this.brand_id;
        builder.brand_name = this.brand_name;
        builder.logo_url = this.logo_url;
        builder.heat = this.heat;
        builder.rank = this.rank;
        builder.rank_diff = this.rank_diff;
        builder.tag_name = this.tag_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.category_id;
        int i11 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (hashCode + i2) * 37;
        String str = this.category_name;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        Integer num2 = this.brand_id;
        if (num2 != null) {
            i4 = num2.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        String str2 = this.brand_name;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        UrlStructV2 urlStructV2 = this.logo_url;
        if (urlStructV2 != null) {
            i6 = urlStructV2.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        Integer num3 = this.heat;
        if (num3 != null) {
            i7 = num3.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 37;
        Integer num4 = this.rank;
        if (num4 != null) {
            i8 = num4.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 37;
        Integer num5 = this.rank_diff;
        if (num5 != null) {
            i9 = num5.hashCode();
        } else {
            i9 = 0;
        }
        int i19 = (i18 + i9) * 37;
        String str3 = this.tag_name;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        int i20 = i19 + i11;
        this.hashCode = i20;
        return i20;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.category_id != null) {
            sb.append(", category_id=").append(this.category_id);
        }
        if (this.category_name != null) {
            sb.append(", category_name=").append(this.category_name);
        }
        if (this.brand_id != null) {
            sb.append(", brand_id=").append(this.brand_id);
        }
        if (this.brand_name != null) {
            sb.append(", brand_name=").append(this.brand_name);
        }
        if (this.logo_url != null) {
            sb.append(", logo_url=").append(this.logo_url);
        }
        if (this.heat != null) {
            sb.append(", heat=").append(this.heat);
        }
        if (this.rank != null) {
            sb.append(", rank=").append(this.rank);
        }
        if (this.rank_diff != null) {
            sb.append(", rank_diff=").append(this.rank_diff);
        }
        if (this.tag_name != null) {
            sb.append(", tag_name=").append(this.tag_name);
        }
        return sb.replace(0, 2, "BlueVBrandInfoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlueVBrandInfoStructV2)) {
            return false;
        }
        BlueVBrandInfoStructV2 blueVBrandInfoStructV2 = (BlueVBrandInfoStructV2) obj;
        if (!unknownFields().equals(blueVBrandInfoStructV2.unknownFields()) || !Internal.equals(this.category_id, blueVBrandInfoStructV2.category_id) || !Internal.equals(this.category_name, blueVBrandInfoStructV2.category_name) || !Internal.equals(this.brand_id, blueVBrandInfoStructV2.brand_id) || !Internal.equals(this.brand_name, blueVBrandInfoStructV2.brand_name) || !Internal.equals(this.logo_url, blueVBrandInfoStructV2.logo_url) || !Internal.equals(this.heat, blueVBrandInfoStructV2.heat) || !Internal.equals(this.rank, blueVBrandInfoStructV2.rank) || !Internal.equals(this.rank_diff, blueVBrandInfoStructV2.rank_diff) || !Internal.equals(this.tag_name, blueVBrandInfoStructV2.tag_name)) {
            return false;
        }
        return true;
    }

    public BlueVBrandInfoStructV2(Integer num, String str, Integer num2, String str2, UrlStructV2 urlStructV2, Integer num3, Integer num4, Integer num5, String str3) {
        this(num, str, num2, str2, urlStructV2, num3, num4, num5, str3, i.EMPTY);
    }

    public BlueVBrandInfoStructV2(Integer num, String str, Integer num2, String str2, UrlStructV2 urlStructV2, Integer num3, Integer num4, Integer num5, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.category_id = num;
        this.category_name = str;
        this.brand_id = num2;
        this.brand_name = str2;
        this.logo_url = urlStructV2;
        this.heat = num3;
        this.rank = num4;
        this.rank_diff = num5;
        this.tag_name = str3;
    }
}

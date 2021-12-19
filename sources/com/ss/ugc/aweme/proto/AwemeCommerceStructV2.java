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

public final class AwemeCommerceStructV2 extends Message<AwemeCommerceStructV2, Builder> {
    public static final ProtoAdapter<AwemeCommerceStructV2> ADAPTER = new ProtoAdapter_AwemeCommerceStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer ad_auth_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer ad_source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Integer ad_style;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean avoid_global_pendant;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Boolean is_ghost_ads;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Boolean prevent_share;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String study_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean with_comment_filter_words;

    public AwemeCommerceStructV2() {
    }

    static final class ProtoAdapter_AwemeCommerceStructV2 extends ProtoAdapter<AwemeCommerceStructV2> {
        static {
            Covode.recordClassIndex(101890);
        }

        public ProtoAdapter_AwemeCommerceStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeCommerceStructV2.class);
        }

        public final int encodedSize(AwemeCommerceStructV2 awemeCommerceStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, awemeCommerceStructV2.ad_auth_status) + ProtoAdapter.INT32.encodedSizeWithTag(2, awemeCommerceStructV2.ad_source) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemeCommerceStructV2.avoid_global_pendant) + ProtoAdapter.BOOL.encodedSizeWithTag(4, awemeCommerceStructV2.with_comment_filter_words) + ProtoAdapter.INT32.encodedSizeWithTag(5, awemeCommerceStructV2.ad_style) + ProtoAdapter.BOOL.encodedSizeWithTag(6, awemeCommerceStructV2.prevent_share) + ProtoAdapter.STRING.encodedSizeWithTag(7, awemeCommerceStructV2.study_id) + ProtoAdapter.BOOL.encodedSizeWithTag(8, awemeCommerceStructV2.is_ghost_ads) + awemeCommerceStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeCommerceStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.ad_auth_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.ad_source(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.avoid_global_pendant(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.with_comment_filter_words(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.ad_style(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.prevent_share(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.study_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.is_ghost_ads(ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeCommerceStructV2 awemeCommerceStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, awemeCommerceStructV2.ad_auth_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, awemeCommerceStructV2.ad_source);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemeCommerceStructV2.avoid_global_pendant);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, awemeCommerceStructV2.with_comment_filter_words);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, awemeCommerceStructV2.ad_style);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, awemeCommerceStructV2.prevent_share);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, awemeCommerceStructV2.study_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, awemeCommerceStructV2.is_ghost_ads);
            protoWriter.writeBytes(awemeCommerceStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101888);
    }

    public static final class Builder extends Message.Builder<AwemeCommerceStructV2, Builder> {
        public Integer ad_auth_status;
        public Integer ad_source;
        public Integer ad_style;
        public Boolean avoid_global_pendant;
        public Boolean is_ghost_ads;
        public Boolean prevent_share;
        public String study_id;
        public Boolean with_comment_filter_words;

        static {
            Covode.recordClassIndex(101889);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeCommerceStructV2 build() {
            return new AwemeCommerceStructV2(this.ad_auth_status, this.ad_source, this.avoid_global_pendant, this.with_comment_filter_words, this.ad_style, this.prevent_share, this.study_id, this.is_ghost_ads, super.buildUnknownFields());
        }

        public final Builder ad_auth_status(Integer num) {
            this.ad_auth_status = num;
            return this;
        }

        public final Builder ad_source(Integer num) {
            this.ad_source = num;
            return this;
        }

        public final Builder ad_style(Integer num) {
            this.ad_style = num;
            return this;
        }

        public final Builder avoid_global_pendant(Boolean bool) {
            this.avoid_global_pendant = bool;
            return this;
        }

        public final Builder is_ghost_ads(Boolean bool) {
            this.is_ghost_ads = bool;
            return this;
        }

        public final Builder prevent_share(Boolean bool) {
            this.prevent_share = bool;
            return this;
        }

        public final Builder study_id(String str) {
            this.study_id = str;
            return this;
        }

        public final Builder with_comment_filter_words(Boolean bool) {
            this.with_comment_filter_words = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeCommerceStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeCommerceStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.ad_auth_status = this.ad_auth_status;
        builder.ad_source = this.ad_source;
        builder.avoid_global_pendant = this.avoid_global_pendant;
        builder.with_comment_filter_words = this.with_comment_filter_words;
        builder.ad_style = this.ad_style;
        builder.prevent_share = this.prevent_share;
        builder.study_id = this.study_id;
        builder.is_ghost_ads = this.is_ghost_ads;
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
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.ad_auth_status;
        int i10 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 37;
        Integer num2 = this.ad_source;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        Boolean bool = this.avoid_global_pendant;
        if (bool != null) {
            i4 = bool.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        Boolean bool2 = this.with_comment_filter_words;
        if (bool2 != null) {
            i5 = bool2.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        Integer num3 = this.ad_style;
        if (num3 != null) {
            i6 = num3.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        Boolean bool3 = this.prevent_share;
        if (bool3 != null) {
            i7 = bool3.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        String str = this.study_id;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 37;
        Boolean bool4 = this.is_ghost_ads;
        if (bool4 != null) {
            i10 = bool4.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ad_auth_status != null) {
            sb.append(", ad_auth_status=").append(this.ad_auth_status);
        }
        if (this.ad_source != null) {
            sb.append(", ad_source=").append(this.ad_source);
        }
        if (this.avoid_global_pendant != null) {
            sb.append(", avoid_global_pendant=").append(this.avoid_global_pendant);
        }
        if (this.with_comment_filter_words != null) {
            sb.append(", with_comment_filter_words=").append(this.with_comment_filter_words);
        }
        if (this.ad_style != null) {
            sb.append(", ad_style=").append(this.ad_style);
        }
        if (this.prevent_share != null) {
            sb.append(", prevent_share=").append(this.prevent_share);
        }
        if (this.study_id != null) {
            sb.append(", study_id=").append(this.study_id);
        }
        if (this.is_ghost_ads != null) {
            sb.append(", is_ghost_ads=").append(this.is_ghost_ads);
        }
        return sb.replace(0, 2, "AwemeCommerceStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeCommerceStructV2)) {
            return false;
        }
        AwemeCommerceStructV2 awemeCommerceStructV2 = (AwemeCommerceStructV2) obj;
        if (!unknownFields().equals(awemeCommerceStructV2.unknownFields()) || !Internal.equals(this.ad_auth_status, awemeCommerceStructV2.ad_auth_status) || !Internal.equals(this.ad_source, awemeCommerceStructV2.ad_source) || !Internal.equals(this.avoid_global_pendant, awemeCommerceStructV2.avoid_global_pendant) || !Internal.equals(this.with_comment_filter_words, awemeCommerceStructV2.with_comment_filter_words) || !Internal.equals(this.ad_style, awemeCommerceStructV2.ad_style) || !Internal.equals(this.prevent_share, awemeCommerceStructV2.prevent_share) || !Internal.equals(this.study_id, awemeCommerceStructV2.study_id) || !Internal.equals(this.is_ghost_ads, awemeCommerceStructV2.is_ghost_ads)) {
            return false;
        }
        return true;
    }

    public AwemeCommerceStructV2(Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, String str, Boolean bool4) {
        this(num, num2, bool, bool2, num3, bool3, str, bool4, i.EMPTY);
    }

    public AwemeCommerceStructV2(Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, String str, Boolean bool4, i iVar) {
        super(ADAPTER, iVar);
        this.ad_auth_status = num;
        this.ad_source = num2;
        this.avoid_global_pendant = bool;
        this.with_comment_filter_words = bool2;
        this.ad_style = num3;
        this.prevent_share = bool3;
        this.study_id = str;
        this.is_ghost_ads = bool4;
    }
}

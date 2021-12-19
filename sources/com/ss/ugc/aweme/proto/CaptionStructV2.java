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

public final class CaptionStructV2 extends Message<CaptionStructV2, Builder> {
    public static final ProtoAdapter<CaptionStructV2> ADAPTER = new ProtoAdapter_CaptionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String caption_format;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public Long cla_subtitle_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long complaint_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long expire;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Boolean is_auto_generated;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String lang;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long language_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer sub_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String sub_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Long translator_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String url;

    public CaptionStructV2() {
    }

    static final class ProtoAdapter_CaptionStructV2 extends ProtoAdapter<CaptionStructV2> {
        static {
            Covode.recordClassIndex(101950);
        }

        public ProtoAdapter_CaptionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CaptionStructV2.class);
        }

        public final int encodedSize(CaptionStructV2 captionStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, captionStructV2.lang) + ProtoAdapter.INT64.encodedSizeWithTag(2, captionStructV2.language_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, captionStructV2.url) + ProtoAdapter.INT64.encodedSizeWithTag(4, captionStructV2.expire) + ProtoAdapter.STRING.encodedSizeWithTag(5, captionStructV2.caption_format) + ProtoAdapter.INT64.encodedSizeWithTag(6, captionStructV2.complaint_id) + ProtoAdapter.BOOL.encodedSizeWithTag(7, captionStructV2.is_auto_generated) + ProtoAdapter.INT32.encodedSizeWithTag(8, captionStructV2.sub_id) + ProtoAdapter.STRING.encodedSizeWithTag(9, captionStructV2.sub_version) + ProtoAdapter.INT64.encodedSizeWithTag(10, captionStructV2.cla_subtitle_id) + ProtoAdapter.INT64.encodedSizeWithTag(11, captionStructV2.translator_id) + captionStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaptionStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.lang(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.language_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.expire(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.caption_format(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.complaint_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.is_auto_generated(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.sub_id(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.sub_version(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.cla_subtitle_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.translator_id(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CaptionStructV2 captionStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, captionStructV2.lang);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, captionStructV2.language_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, captionStructV2.url);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, captionStructV2.expire);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, captionStructV2.caption_format);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, captionStructV2.complaint_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, captionStructV2.is_auto_generated);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, captionStructV2.sub_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, captionStructV2.sub_version);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, captionStructV2.cla_subtitle_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, captionStructV2.translator_id);
            protoWriter.writeBytes(captionStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101948);
    }

    public static final class Builder extends Message.Builder<CaptionStructV2, Builder> {
        public String caption_format;
        public Long cla_subtitle_id;
        public Long complaint_id;
        public Long expire;
        public Boolean is_auto_generated;
        public String lang;
        public Long language_id;
        public Integer sub_id;
        public String sub_version;
        public Long translator_id;
        public String url;

        static {
            Covode.recordClassIndex(101949);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CaptionStructV2 build() {
            return new CaptionStructV2(this.lang, this.language_id, this.url, this.expire, this.caption_format, this.complaint_id, this.is_auto_generated, this.sub_id, this.sub_version, this.cla_subtitle_id, this.translator_id, super.buildUnknownFields());
        }

        public final Builder caption_format(String str) {
            this.caption_format = str;
            return this;
        }

        public final Builder cla_subtitle_id(Long l2) {
            this.cla_subtitle_id = l2;
            return this;
        }

        public final Builder complaint_id(Long l2) {
            this.complaint_id = l2;
            return this;
        }

        public final Builder expire(Long l2) {
            this.expire = l2;
            return this;
        }

        public final Builder is_auto_generated(Boolean bool) {
            this.is_auto_generated = bool;
            return this;
        }

        public final Builder lang(String str) {
            this.lang = str;
            return this;
        }

        public final Builder language_id(Long l2) {
            this.language_id = l2;
            return this;
        }

        public final Builder sub_id(Integer num) {
            this.sub_id = num;
            return this;
        }

        public final Builder sub_version(String str) {
            this.sub_version = str;
            return this;
        }

        public final Builder translator_id(Long l2) {
            this.translator_id = l2;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CaptionStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CaptionStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.lang = this.lang;
        builder.language_id = this.language_id;
        builder.url = this.url;
        builder.expire = this.expire;
        builder.caption_format = this.caption_format;
        builder.complaint_id = this.complaint_id;
        builder.is_auto_generated = this.is_auto_generated;
        builder.sub_id = this.sub_id;
        builder.sub_version = this.sub_version;
        builder.cla_subtitle_id = this.cla_subtitle_id;
        builder.translator_id = this.translator_id;
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
        int i10;
        int i11;
        int i12 = this.hashCode;
        if (i12 != 0) {
            return i12;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.lang;
        int i13 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (hashCode + i2) * 37;
        Long l2 = this.language_id;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 37;
        String str2 = this.url;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        Long l3 = this.expire;
        if (l3 != null) {
            i5 = l3.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 37;
        String str3 = this.caption_format;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 37;
        Long l4 = this.complaint_id;
        if (l4 != null) {
            i7 = l4.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 37;
        Boolean bool = this.is_auto_generated;
        if (bool != null) {
            i8 = bool.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 37;
        Integer num = this.sub_id;
        if (num != null) {
            i9 = num.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 37;
        String str4 = this.sub_version;
        if (str4 != null) {
            i10 = str4.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 37;
        Long l5 = this.cla_subtitle_id;
        if (l5 != null) {
            i11 = l5.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 37;
        Long l6 = this.translator_id;
        if (l6 != null) {
            i13 = l6.hashCode();
        }
        int i24 = i23 + i13;
        this.hashCode = i24;
        return i24;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.lang != null) {
            sb.append(", lang=").append(this.lang);
        }
        if (this.language_id != null) {
            sb.append(", language_id=").append(this.language_id);
        }
        if (this.url != null) {
            sb.append(", url=").append(this.url);
        }
        if (this.expire != null) {
            sb.append(", expire=").append(this.expire);
        }
        if (this.caption_format != null) {
            sb.append(", caption_format=").append(this.caption_format);
        }
        if (this.complaint_id != null) {
            sb.append(", complaint_id=").append(this.complaint_id);
        }
        if (this.is_auto_generated != null) {
            sb.append(", is_auto_generated=").append(this.is_auto_generated);
        }
        if (this.sub_id != null) {
            sb.append(", sub_id=").append(this.sub_id);
        }
        if (this.sub_version != null) {
            sb.append(", sub_version=").append(this.sub_version);
        }
        if (this.cla_subtitle_id != null) {
            sb.append(", cla_subtitle_id=").append(this.cla_subtitle_id);
        }
        if (this.translator_id != null) {
            sb.append(", translator_id=").append(this.translator_id);
        }
        return sb.replace(0, 2, "CaptionStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptionStructV2)) {
            return false;
        }
        CaptionStructV2 captionStructV2 = (CaptionStructV2) obj;
        if (!unknownFields().equals(captionStructV2.unknownFields()) || !Internal.equals(this.lang, captionStructV2.lang) || !Internal.equals(this.language_id, captionStructV2.language_id) || !Internal.equals(this.url, captionStructV2.url) || !Internal.equals(this.expire, captionStructV2.expire) || !Internal.equals(this.caption_format, captionStructV2.caption_format) || !Internal.equals(this.complaint_id, captionStructV2.complaint_id) || !Internal.equals(this.is_auto_generated, captionStructV2.is_auto_generated) || !Internal.equals(this.sub_id, captionStructV2.sub_id) || !Internal.equals(this.sub_version, captionStructV2.sub_version) || !Internal.equals(this.cla_subtitle_id, captionStructV2.cla_subtitle_id) || !Internal.equals(this.translator_id, captionStructV2.translator_id)) {
            return false;
        }
        return true;
    }

    public CaptionStructV2(String str, Long l2, String str2, Long l3, String str3, Long l4, Boolean bool, Integer num, String str4, Long l5, Long l6) {
        this(str, l2, str2, l3, str3, l4, bool, num, str4, l5, l6, i.EMPTY);
    }

    public CaptionStructV2(String str, Long l2, String str2, Long l3, String str3, Long l4, Boolean bool, Integer num, String str4, Long l5, Long l6, i iVar) {
        super(ADAPTER, iVar);
        this.lang = str;
        this.language_id = l2;
        this.url = str2;
        this.expire = l3;
        this.caption_format = str3;
        this.complaint_id = l4;
        this.is_auto_generated = bool;
        this.sub_id = num;
        this.sub_version = str4;
        this.cla_subtitle_id = l5;
        this.translator_id = l6;
    }
}

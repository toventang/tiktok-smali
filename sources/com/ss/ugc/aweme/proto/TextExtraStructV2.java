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

public final class TextExtraStructV2 extends Message<TextExtraStructV2, Builder> {
    public static final ProtoAdapter<TextExtraStructV2> ADAPTER = new ProtoAdapter_TextExtraStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String hashTagName;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String hashtag_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String hashtag_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Boolean is_commerce;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public Integer line_idx;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public Long question_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer start;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Integer sub_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String user_id;

    public TextExtraStructV2() {
    }

    static final class ProtoAdapter_TextExtraStructV2 extends ProtoAdapter<TextExtraStructV2> {
        static {
            Covode.recordClassIndex(102235);
        }

        public ProtoAdapter_TextExtraStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, TextExtraStructV2.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TextExtraStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.start(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.end(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.user_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.hashtag_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.hashtag_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.is_commerce(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.hashTagName(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.aweme_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.sub_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.question_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.line_idx(ProtoAdapter.INT32.decode(protoReader));
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

        public final int encodedSize(TextExtraStructV2 textExtraStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, textExtraStructV2.start) + ProtoAdapter.INT32.encodedSizeWithTag(2, textExtraStructV2.end) + ProtoAdapter.STRING.encodedSizeWithTag(3, textExtraStructV2.user_id) + ProtoAdapter.INT32.encodedSizeWithTag(4, textExtraStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(5, textExtraStructV2.hashtag_name) + ProtoAdapter.STRING.encodedSizeWithTag(6, textExtraStructV2.hashtag_id) + ProtoAdapter.BOOL.encodedSizeWithTag(7, textExtraStructV2.is_commerce) + ProtoAdapter.STRING.encodedSizeWithTag(8, textExtraStructV2.hashTagName) + ProtoAdapter.STRING.encodedSizeWithTag(9, textExtraStructV2.sec_uid) + ProtoAdapter.STRING.encodedSizeWithTag(10, textExtraStructV2.aweme_id) + ProtoAdapter.INT32.encodedSizeWithTag(11, textExtraStructV2.sub_type) + ProtoAdapter.INT64.encodedSizeWithTag(12, textExtraStructV2.question_id) + ProtoAdapter.INT32.encodedSizeWithTag(13, textExtraStructV2.line_idx) + textExtraStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, TextExtraStructV2 textExtraStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, textExtraStructV2.start);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, textExtraStructV2.end);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, textExtraStructV2.user_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, textExtraStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, textExtraStructV2.hashtag_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, textExtraStructV2.hashtag_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, textExtraStructV2.is_commerce);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, textExtraStructV2.hashTagName);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, textExtraStructV2.sec_uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, textExtraStructV2.aweme_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, textExtraStructV2.sub_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, textExtraStructV2.question_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, textExtraStructV2.line_idx);
            protoWriter.writeBytes(textExtraStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102233);
    }

    public static final class Builder extends Message.Builder<TextExtraStructV2, Builder> {
        public String aweme_id;
        public Integer end;
        public String hashTagName;
        public String hashtag_id;
        public String hashtag_name;
        public Boolean is_commerce;
        public Integer line_idx;
        public Long question_id;
        public String sec_uid;
        public Integer start;
        public Integer sub_type;
        public Integer type;
        public String user_id;

        static {
            Covode.recordClassIndex(102234);
        }

        @Override // com.squareup.wire.Message.Builder
        public final TextExtraStructV2 build() {
            return new TextExtraStructV2(this.start, this.end, this.user_id, this.type, this.hashtag_name, this.hashtag_id, this.is_commerce, this.hashTagName, this.sec_uid, this.aweme_id, this.sub_type, this.question_id, this.line_idx, super.buildUnknownFields());
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder end(Integer num) {
            this.end = num;
            return this;
        }

        public final Builder hashTagName(String str) {
            this.hashTagName = str;
            return this;
        }

        public final Builder hashtag_id(String str) {
            this.hashtag_id = str;
            return this;
        }

        public final Builder hashtag_name(String str) {
            this.hashtag_name = str;
            return this;
        }

        public final Builder is_commerce(Boolean bool) {
            this.is_commerce = bool;
            return this;
        }

        public final Builder line_idx(Integer num) {
            this.line_idx = num;
            return this;
        }

        public final Builder question_id(Long l2) {
            this.question_id = l2;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder start(Integer num) {
            this.start = num;
            return this;
        }

        public final Builder sub_type(Integer num) {
            this.sub_type = num;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder user_id(String str) {
            this.user_id = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.TextExtraStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<TextExtraStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.start = this.start;
        builder.end = this.end;
        builder.user_id = this.user_id;
        builder.type = this.type;
        builder.hashtag_name = this.hashtag_name;
        builder.hashtag_id = this.hashtag_id;
        builder.is_commerce = this.is_commerce;
        builder.hashTagName = this.hashTagName;
        builder.sec_uid = this.sec_uid;
        builder.aweme_id = this.aweme_id;
        builder.sub_type = this.sub_type;
        builder.question_id = this.question_id;
        builder.line_idx = this.line_idx;
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
        int i12;
        int i13;
        int i14 = this.hashCode;
        if (i14 != 0) {
            return i14;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.start;
        int i15 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (hashCode + i2) * 37;
        Integer num2 = this.end;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 37;
        String str = this.user_id;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 37;
        Integer num3 = this.type;
        if (num3 != null) {
            i5 = num3.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 37;
        String str2 = this.hashtag_name;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 37;
        String str3 = this.hashtag_id;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 37;
        Boolean bool = this.is_commerce;
        if (bool != null) {
            i8 = bool.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 37;
        String str4 = this.hashTagName;
        if (str4 != null) {
            i9 = str4.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 37;
        String str5 = this.sec_uid;
        if (str5 != null) {
            i10 = str5.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 37;
        String str6 = this.aweme_id;
        if (str6 != null) {
            i11 = str6.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 37;
        Integer num4 = this.sub_type;
        if (num4 != null) {
            i12 = num4.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 37;
        Long l2 = this.question_id;
        if (l2 != null) {
            i13 = l2.hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (i26 + i13) * 37;
        Integer num5 = this.line_idx;
        if (num5 != null) {
            i15 = num5.hashCode();
        }
        int i28 = i27 + i15;
        this.hashCode = i28;
        return i28;
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
        if (this.user_id != null) {
            sb.append(", user_id=").append(this.user_id);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.hashtag_name != null) {
            sb.append(", hashtag_name=").append(this.hashtag_name);
        }
        if (this.hashtag_id != null) {
            sb.append(", hashtag_id=").append(this.hashtag_id);
        }
        if (this.is_commerce != null) {
            sb.append(", is_commerce=").append(this.is_commerce);
        }
        if (this.hashTagName != null) {
            sb.append(", hashTagName=").append(this.hashTagName);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=").append(this.sec_uid);
        }
        if (this.aweme_id != null) {
            sb.append(", aweme_id=").append(this.aweme_id);
        }
        if (this.sub_type != null) {
            sb.append(", sub_type=").append(this.sub_type);
        }
        if (this.question_id != null) {
            sb.append(", question_id=").append(this.question_id);
        }
        if (this.line_idx != null) {
            sb.append(", line_idx=").append(this.line_idx);
        }
        return sb.replace(0, 2, "TextExtraStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextExtraStructV2)) {
            return false;
        }
        TextExtraStructV2 textExtraStructV2 = (TextExtraStructV2) obj;
        if (!unknownFields().equals(textExtraStructV2.unknownFields()) || !Internal.equals(this.start, textExtraStructV2.start) || !Internal.equals(this.end, textExtraStructV2.end) || !Internal.equals(this.user_id, textExtraStructV2.user_id) || !Internal.equals(this.type, textExtraStructV2.type) || !Internal.equals(this.hashtag_name, textExtraStructV2.hashtag_name) || !Internal.equals(this.hashtag_id, textExtraStructV2.hashtag_id) || !Internal.equals(this.is_commerce, textExtraStructV2.is_commerce) || !Internal.equals(this.hashTagName, textExtraStructV2.hashTagName) || !Internal.equals(this.sec_uid, textExtraStructV2.sec_uid) || !Internal.equals(this.aweme_id, textExtraStructV2.aweme_id) || !Internal.equals(this.sub_type, textExtraStructV2.sub_type) || !Internal.equals(this.question_id, textExtraStructV2.question_id) || !Internal.equals(this.line_idx, textExtraStructV2.line_idx)) {
            return false;
        }
        return true;
    }

    public TextExtraStructV2(Integer num, Integer num2, String str, Integer num3, String str2, String str3, Boolean bool, String str4, String str5, String str6, Integer num4, Long l2, Integer num5) {
        this(num, num2, str, num3, str2, str3, bool, str4, str5, str6, num4, l2, num5, i.EMPTY);
    }

    public TextExtraStructV2(Integer num, Integer num2, String str, Integer num3, String str2, String str3, Boolean bool, String str4, String str5, String str6, Integer num4, Long l2, Integer num5, i iVar) {
        super(ADAPTER, iVar);
        this.start = num;
        this.end = num2;
        this.user_id = str;
        this.type = num3;
        this.hashtag_name = str2;
        this.hashtag_id = str3;
        this.is_commerce = bool;
        this.hashTagName = str4;
        this.sec_uid = str5;
        this.aweme_id = str6;
        this.sub_type = num4;
        this.question_id = l2;
        this.line_idx = num5;
    }
}

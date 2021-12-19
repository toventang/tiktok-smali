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
import java.util.List;
import k.i;

public final class AnchorCommonStructV2 extends Message<AnchorCommonStructV2, Builder> {
    public static final ProtoAdapter<AnchorCommonStructV2> ADAPTER = new ProtoAdapter_AnchorCommonStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorPanelActionStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 15)
    public List<AnchorPanelActionStructV2> actions;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String deep_link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public String description;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Integer general_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String language;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public String log_extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String schema;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_SELECT_SCENE)
    public UrlStructV2 thumbnail;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public String universal_link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String url;

    public AnchorCommonStructV2() {
    }

    static final class ProtoAdapter_AnchorCommonStructV2 extends ProtoAdapter<AnchorCommonStructV2> {
        static {
            Covode.recordClassIndex(101848);
        }

        public ProtoAdapter_AnchorCommonStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorCommonStructV2.class);
        }

        public final int encodedSize(AnchorCommonStructV2 anchorCommonStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, anchorCommonStructV2.keyword) + ProtoAdapter.STRING.encodedSizeWithTag(2, anchorCommonStructV2.url) + ProtoAdapter.STRING.encodedSizeWithTag(3, anchorCommonStructV2.language) + ProtoAdapter.STRING.encodedSizeWithTag(4, anchorCommonStructV2.schema) + ProtoAdapter.STRING.encodedSizeWithTag(5, anchorCommonStructV2.id) + ProtoAdapter.INT32.encodedSizeWithTag(6, anchorCommonStructV2.type) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, anchorCommonStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(8, anchorCommonStructV2.extra) + ProtoAdapter.STRING.encodedSizeWithTag(9, anchorCommonStructV2.deep_link) + ProtoAdapter.STRING.encodedSizeWithTag(10, anchorCommonStructV2.universal_link) + ProtoAdapter.INT32.encodedSizeWithTag(11, anchorCommonStructV2.general_type) + ProtoAdapter.STRING.encodedSizeWithTag(12, anchorCommonStructV2.log_extra) + ProtoAdapter.STRING.encodedSizeWithTag(13, anchorCommonStructV2.description) + UrlStructV2.ADAPTER.encodedSizeWithTag(14, anchorCommonStructV2.thumbnail) + AnchorPanelActionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(15, anchorCommonStructV2.actions) + anchorCommonStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnchorCommonStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.keyword(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.language(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.schema(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.icon(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.deep_link(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.universal_link(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.general_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.log_extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.description(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.thumbnail(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.actions.add(AnchorPanelActionStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AnchorCommonStructV2 anchorCommonStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anchorCommonStructV2.keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anchorCommonStructV2.url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, anchorCommonStructV2.language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, anchorCommonStructV2.schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, anchorCommonStructV2.id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, anchorCommonStructV2.type);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, anchorCommonStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, anchorCommonStructV2.extra);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, anchorCommonStructV2.deep_link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, anchorCommonStructV2.universal_link);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, anchorCommonStructV2.general_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, anchorCommonStructV2.log_extra);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, anchorCommonStructV2.description);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 14, anchorCommonStructV2.thumbnail);
            AnchorPanelActionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, anchorCommonStructV2.actions);
            protoWriter.writeBytes(anchorCommonStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101846);
    }

    public static final class Builder extends Message.Builder<AnchorCommonStructV2, Builder> {
        public List<AnchorPanelActionStructV2> actions = Internal.newMutableList();
        public String deep_link;
        public String description;
        public String extra;
        public Integer general_type;
        public UrlStructV2 icon;
        public String id;
        public String keyword;
        public String language;
        public String log_extra;
        public String schema;
        public UrlStructV2 thumbnail;
        public Integer type;
        public String universal_link;
        public String url;

        static {
            Covode.recordClassIndex(101847);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AnchorCommonStructV2 build() {
            return new AnchorCommonStructV2(this.keyword, this.url, this.language, this.schema, this.id, this.type, this.icon, this.extra, this.deep_link, this.universal_link, this.general_type, this.log_extra, this.description, this.thumbnail, this.actions, super.buildUnknownFields());
        }

        public final Builder deep_link(String str) {
            this.deep_link = str;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder general_type(Integer num) {
            this.general_type = num;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder keyword(String str) {
            this.keyword = str;
            return this;
        }

        public final Builder language(String str) {
            this.language = str;
            return this;
        }

        public final Builder log_extra(String str) {
            this.log_extra = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder thumbnail(UrlStructV2 urlStructV2) {
            this.thumbnail = urlStructV2;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder universal_link(String str) {
            this.universal_link = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }

        public final Builder actions(List<AnchorPanelActionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.actions = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AnchorCommonStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AnchorCommonStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.keyword = this.keyword;
        builder.url = this.url;
        builder.language = this.language;
        builder.schema = this.schema;
        builder.id = this.id;
        builder.type = this.type;
        builder.icon = this.icon;
        builder.extra = this.extra;
        builder.deep_link = this.deep_link;
        builder.universal_link = this.universal_link;
        builder.general_type = this.general_type;
        builder.log_extra = this.log_extra;
        builder.description = this.description;
        builder.thumbnail = this.thumbnail;
        builder.actions = Internal.copyOf("actions", this.actions);
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
        int i14;
        int i15 = this.hashCode;
        if (i15 != 0) {
            return i15;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.keyword;
        int i16 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i17 = (hashCode + i2) * 37;
        String str2 = this.url;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i18 = (i17 + i3) * 37;
        String str3 = this.language;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i19 = (i18 + i4) * 37;
        String str4 = this.schema;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i20 = (i19 + i5) * 37;
        String str5 = this.id;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i21 = (i20 + i6) * 37;
        Integer num = this.type;
        if (num != null) {
            i7 = num.hashCode();
        } else {
            i7 = 0;
        }
        int i22 = (i21 + i7) * 37;
        UrlStructV2 urlStructV2 = this.icon;
        if (urlStructV2 != null) {
            i8 = urlStructV2.hashCode();
        } else {
            i8 = 0;
        }
        int i23 = (i22 + i8) * 37;
        String str6 = this.extra;
        if (str6 != null) {
            i9 = str6.hashCode();
        } else {
            i9 = 0;
        }
        int i24 = (i23 + i9) * 37;
        String str7 = this.deep_link;
        if (str7 != null) {
            i10 = str7.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = (i24 + i10) * 37;
        String str8 = this.universal_link;
        if (str8 != null) {
            i11 = str8.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 37;
        Integer num2 = this.general_type;
        if (num2 != null) {
            i12 = num2.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (i26 + i12) * 37;
        String str9 = this.log_extra;
        if (str9 != null) {
            i13 = str9.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 37;
        String str10 = this.description;
        if (str10 != null) {
            i14 = str10.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 37;
        UrlStructV2 urlStructV22 = this.thumbnail;
        if (urlStructV22 != null) {
            i16 = urlStructV22.hashCode();
        }
        int hashCode2 = ((i29 + i16) * 37) + this.actions.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=").append(this.keyword);
        }
        if (this.url != null) {
            sb.append(", url=").append(this.url);
        }
        if (this.language != null) {
            sb.append(", language=").append(this.language);
        }
        if (this.schema != null) {
            sb.append(", schema=").append(this.schema);
        }
        if (this.id != null) {
            sb.append(", id=").append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.deep_link != null) {
            sb.append(", deep_link=").append(this.deep_link);
        }
        if (this.universal_link != null) {
            sb.append(", universal_link=").append(this.universal_link);
        }
        if (this.general_type != null) {
            sb.append(", general_type=").append(this.general_type);
        }
        if (this.log_extra != null) {
            sb.append(", log_extra=").append(this.log_extra);
        }
        if (this.description != null) {
            sb.append(", description=").append(this.description);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=").append(this.thumbnail);
        }
        if (!this.actions.isEmpty()) {
            sb.append(", actions=").append(this.actions);
        }
        return sb.replace(0, 2, "AnchorCommonStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorCommonStructV2)) {
            return false;
        }
        AnchorCommonStructV2 anchorCommonStructV2 = (AnchorCommonStructV2) obj;
        if (!unknownFields().equals(anchorCommonStructV2.unknownFields()) || !Internal.equals(this.keyword, anchorCommonStructV2.keyword) || !Internal.equals(this.url, anchorCommonStructV2.url) || !Internal.equals(this.language, anchorCommonStructV2.language) || !Internal.equals(this.schema, anchorCommonStructV2.schema) || !Internal.equals(this.id, anchorCommonStructV2.id) || !Internal.equals(this.type, anchorCommonStructV2.type) || !Internal.equals(this.icon, anchorCommonStructV2.icon) || !Internal.equals(this.extra, anchorCommonStructV2.extra) || !Internal.equals(this.deep_link, anchorCommonStructV2.deep_link) || !Internal.equals(this.universal_link, anchorCommonStructV2.universal_link) || !Internal.equals(this.general_type, anchorCommonStructV2.general_type) || !Internal.equals(this.log_extra, anchorCommonStructV2.log_extra) || !Internal.equals(this.description, anchorCommonStructV2.description) || !Internal.equals(this.thumbnail, anchorCommonStructV2.thumbnail) || !this.actions.equals(anchorCommonStructV2.actions)) {
            return false;
        }
        return true;
    }

    public AnchorCommonStructV2(String str, String str2, String str3, String str4, String str5, Integer num, UrlStructV2 urlStructV2, String str6, String str7, String str8, Integer num2, String str9, String str10, UrlStructV2 urlStructV22, List<AnchorPanelActionStructV2> list) {
        this(str, str2, str3, str4, str5, num, urlStructV2, str6, str7, str8, num2, str9, str10, urlStructV22, list, i.EMPTY);
    }

    public AnchorCommonStructV2(String str, String str2, String str3, String str4, String str5, Integer num, UrlStructV2 urlStructV2, String str6, String str7, String str8, Integer num2, String str9, String str10, UrlStructV2 urlStructV22, List<AnchorPanelActionStructV2> list, i iVar) {
        super(ADAPTER, iVar);
        this.keyword = str;
        this.url = str2;
        this.language = str3;
        this.schema = str4;
        this.id = str5;
        this.type = num;
        this.icon = urlStructV2;
        this.extra = str6;
        this.deep_link = str7;
        this.universal_link = str8;
        this.general_type = num2;
        this.log_extra = str9;
        this.description = str10;
        this.thumbnail = urlStructV22;
        this.actions = Internal.immutableCopyOf("actions", list);
    }
}

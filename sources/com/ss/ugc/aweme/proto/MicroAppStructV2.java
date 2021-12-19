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

public final class MicroAppStructV2 extends Message<MicroAppStructV2, Builder> {
    public static final ProtoAdapter<MicroAppStructV2> ADAPTER = new ProtoAdapter_MicroAppStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String app_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String app_name;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MicroAppCardStructV2#ADAPTER", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public MicroAppCardStructV2 card;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String description;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer orientation;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Integer state;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String summary;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public String web_url;

    public MicroAppStructV2() {
    }

    static final class ProtoAdapter_MicroAppStructV2 extends ProtoAdapter<MicroAppStructV2> {
        static {
            Covode.recordClassIndex(102109);
        }

        public ProtoAdapter_MicroAppStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MicroAppStructV2.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MicroAppStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.app_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.app_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.icon(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.orientation(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.schema(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.state(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.summary(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.description(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.card(MicroAppCardStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.web_url(ProtoAdapter.STRING.decode(protoReader));
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

        public final int encodedSize(MicroAppStructV2 microAppStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, microAppStructV2.app_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, microAppStructV2.app_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, microAppStructV2.icon) + ProtoAdapter.INT32.encodedSizeWithTag(4, microAppStructV2.orientation) + ProtoAdapter.STRING.encodedSizeWithTag(5, microAppStructV2.schema) + ProtoAdapter.INT32.encodedSizeWithTag(6, microAppStructV2.state) + ProtoAdapter.STRING.encodedSizeWithTag(7, microAppStructV2.summary) + ProtoAdapter.INT32.encodedSizeWithTag(8, microAppStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(9, microAppStructV2.description) + ProtoAdapter.STRING.encodedSizeWithTag(10, microAppStructV2.title) + MicroAppCardStructV2.ADAPTER.encodedSizeWithTag(11, microAppStructV2.card) + ProtoAdapter.STRING.encodedSizeWithTag(12, microAppStructV2.web_url) + microAppStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, MicroAppStructV2 microAppStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, microAppStructV2.app_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, microAppStructV2.app_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, microAppStructV2.icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, microAppStructV2.orientation);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, microAppStructV2.schema);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, microAppStructV2.state);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, microAppStructV2.summary);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, microAppStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, microAppStructV2.description);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, microAppStructV2.title);
            MicroAppCardStructV2.ADAPTER.encodeWithTag(protoWriter, 11, microAppStructV2.card);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, microAppStructV2.web_url);
            protoWriter.writeBytes(microAppStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102107);
    }

    public static final class Builder extends Message.Builder<MicroAppStructV2, Builder> {
        public String app_id;
        public String app_name;
        public MicroAppCardStructV2 card;
        public String description;
        public String icon;
        public Integer orientation;
        public String schema;
        public Integer state;
        public String summary;
        public String title;
        public Integer type;
        public String web_url;

        static {
            Covode.recordClassIndex(102108);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MicroAppStructV2 build() {
            return new MicroAppStructV2(this.app_id, this.app_name, this.icon, this.orientation, this.schema, this.state, this.summary, this.type, this.description, this.title, this.card, this.web_url, super.buildUnknownFields());
        }

        public final Builder app_id(String str) {
            this.app_id = str;
            return this;
        }

        public final Builder app_name(String str) {
            this.app_name = str;
            return this;
        }

        public final Builder card(MicroAppCardStructV2 microAppCardStructV2) {
            this.card = microAppCardStructV2;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder orientation(Integer num) {
            this.orientation = num;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder state(Integer num) {
            this.state = num;
            return this;
        }

        public final Builder summary(String str) {
            this.summary = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MicroAppStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MicroAppStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.app_id = this.app_id;
        builder.app_name = this.app_name;
        builder.icon = this.icon;
        builder.orientation = this.orientation;
        builder.schema = this.schema;
        builder.state = this.state;
        builder.summary = this.summary;
        builder.type = this.type;
        builder.description = this.description;
        builder.title = this.title;
        builder.card = this.card;
        builder.web_url = this.web_url;
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
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_id;
        int i14 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (hashCode + i2) * 37;
        String str2 = this.app_name;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 37;
        String str3 = this.icon;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 37;
        Integer num = this.orientation;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 37;
        String str4 = this.schema;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 37;
        Integer num2 = this.state;
        if (num2 != null) {
            i7 = num2.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 37;
        String str5 = this.summary;
        if (str5 != null) {
            i8 = str5.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 37;
        Integer num3 = this.type;
        if (num3 != null) {
            i9 = num3.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 37;
        String str6 = this.description;
        if (str6 != null) {
            i10 = str6.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 37;
        String str7 = this.title;
        if (str7 != null) {
            i11 = str7.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 37;
        MicroAppCardStructV2 microAppCardStructV2 = this.card;
        if (microAppCardStructV2 != null) {
            i12 = microAppCardStructV2.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 37;
        String str8 = this.web_url;
        if (str8 != null) {
            i14 = str8.hashCode();
        }
        int i26 = i25 + i14;
        this.hashCode = i26;
        return i26;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=").append(this.app_id);
        }
        if (this.app_name != null) {
            sb.append(", app_name=").append(this.app_name);
        }
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        if (this.orientation != null) {
            sb.append(", orientation=").append(this.orientation);
        }
        if (this.schema != null) {
            sb.append(", schema=").append(this.schema);
        }
        if (this.state != null) {
            sb.append(", state=").append(this.state);
        }
        if (this.summary != null) {
            sb.append(", summary=").append(this.summary);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.description != null) {
            sb.append(", description=").append(this.description);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.card != null) {
            sb.append(", card=").append(this.card);
        }
        if (this.web_url != null) {
            sb.append(", web_url=").append(this.web_url);
        }
        return sb.replace(0, 2, "MicroAppStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MicroAppStructV2)) {
            return false;
        }
        MicroAppStructV2 microAppStructV2 = (MicroAppStructV2) obj;
        if (!unknownFields().equals(microAppStructV2.unknownFields()) || !Internal.equals(this.app_id, microAppStructV2.app_id) || !Internal.equals(this.app_name, microAppStructV2.app_name) || !Internal.equals(this.icon, microAppStructV2.icon) || !Internal.equals(this.orientation, microAppStructV2.orientation) || !Internal.equals(this.schema, microAppStructV2.schema) || !Internal.equals(this.state, microAppStructV2.state) || !Internal.equals(this.summary, microAppStructV2.summary) || !Internal.equals(this.type, microAppStructV2.type) || !Internal.equals(this.description, microAppStructV2.description) || !Internal.equals(this.title, microAppStructV2.title) || !Internal.equals(this.card, microAppStructV2.card) || !Internal.equals(this.web_url, microAppStructV2.web_url)) {
            return false;
        }
        return true;
    }

    public MicroAppStructV2(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, String str6, String str7, MicroAppCardStructV2 microAppCardStructV2, String str8) {
        this(str, str2, str3, num, str4, num2, str5, num3, str6, str7, microAppCardStructV2, str8, i.EMPTY);
    }

    public MicroAppStructV2(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, String str6, String str7, MicroAppCardStructV2 microAppCardStructV2, String str8, i iVar) {
        super(ADAPTER, iVar);
        this.app_id = str;
        this.app_name = str2;
        this.icon = str3;
        this.orientation = num;
        this.schema = str4;
        this.state = num2;
        this.summary = str5;
        this.type = num3;
        this.description = str6;
        this.title = str7;
        this.card = microAppCardStructV2;
        this.web_url = str8;
    }
}

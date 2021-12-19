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

public final class HotListStructV2 extends Message<HotListStructV2, Builder> {
    public static final ProtoAdapter<HotListStructV2> ADAPTER = new ProtoAdapter_HotListStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String footer;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String header;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String i18n_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String image_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer pattern_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer type;

    public HotListStructV2() {
    }

    static final class ProtoAdapter_HotListStructV2 extends ProtoAdapter<HotListStructV2> {
        static {
            Covode.recordClassIndex(102031);
        }

        public ProtoAdapter_HotListStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, HotListStructV2.class);
        }

        public final int encodedSize(HotListStructV2 hotListStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, hotListStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, hotListStructV2.image_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, hotListStructV2.schema) + ProtoAdapter.INT32.encodedSizeWithTag(4, hotListStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(5, hotListStructV2.i18n_title) + ProtoAdapter.STRING.encodedSizeWithTag(6, hotListStructV2.header) + ProtoAdapter.STRING.encodedSizeWithTag(7, hotListStructV2.footer) + ProtoAdapter.INT32.encodedSizeWithTag(8, hotListStructV2.pattern_type) + hotListStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final HotListStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.image_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.schema(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.i18n_title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.header(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.footer(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.pattern_type(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, HotListStructV2 hotListStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hotListStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hotListStructV2.image_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, hotListStructV2.schema);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, hotListStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, hotListStructV2.i18n_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, hotListStructV2.header);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, hotListStructV2.footer);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, hotListStructV2.pattern_type);
            protoWriter.writeBytes(hotListStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102029);
    }

    public static final class Builder extends Message.Builder<HotListStructV2, Builder> {
        public String footer;
        public String header;
        public String i18n_title;
        public String image_url;
        public Integer pattern_type;
        public String schema;
        public String title;
        public Integer type;

        static {
            Covode.recordClassIndex(102030);
        }

        @Override // com.squareup.wire.Message.Builder
        public final HotListStructV2 build() {
            return new HotListStructV2(this.title, this.image_url, this.schema, this.type, this.i18n_title, this.header, this.footer, this.pattern_type, super.buildUnknownFields());
        }

        public final Builder footer(String str) {
            this.footer = str;
            return this;
        }

        public final Builder header(String str) {
            this.header = str;
            return this;
        }

        public final Builder i18n_title(String str) {
            this.i18n_title = str;
            return this;
        }

        public final Builder image_url(String str) {
            this.image_url = str;
            return this;
        }

        public final Builder pattern_type(Integer num) {
            this.pattern_type = num;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
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
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.HotListStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<HotListStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.image_url = this.image_url;
        builder.schema = this.schema;
        builder.type = this.type;
        builder.i18n_title = this.i18n_title;
        builder.header = this.header;
        builder.footer = this.footer;
        builder.pattern_type = this.pattern_type;
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
        String str = this.title;
        int i10 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 37;
        String str2 = this.image_url;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        String str3 = this.schema;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        Integer num = this.type;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        String str4 = this.i18n_title;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        String str5 = this.header;
        if (str5 != null) {
            i7 = str5.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        String str6 = this.footer;
        if (str6 != null) {
            i8 = str6.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 37;
        Integer num2 = this.pattern_type;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.image_url != null) {
            sb.append(", image_url=").append(this.image_url);
        }
        if (this.schema != null) {
            sb.append(", schema=").append(this.schema);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.i18n_title != null) {
            sb.append(", i18n_title=").append(this.i18n_title);
        }
        if (this.header != null) {
            sb.append(", header=").append(this.header);
        }
        if (this.footer != null) {
            sb.append(", footer=").append(this.footer);
        }
        if (this.pattern_type != null) {
            sb.append(", pattern_type=").append(this.pattern_type);
        }
        return sb.replace(0, 2, "HotListStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HotListStructV2)) {
            return false;
        }
        HotListStructV2 hotListStructV2 = (HotListStructV2) obj;
        if (!unknownFields().equals(hotListStructV2.unknownFields()) || !Internal.equals(this.title, hotListStructV2.title) || !Internal.equals(this.image_url, hotListStructV2.image_url) || !Internal.equals(this.schema, hotListStructV2.schema) || !Internal.equals(this.type, hotListStructV2.type) || !Internal.equals(this.i18n_title, hotListStructV2.i18n_title) || !Internal.equals(this.header, hotListStructV2.header) || !Internal.equals(this.footer, hotListStructV2.footer) || !Internal.equals(this.pattern_type, hotListStructV2.pattern_type)) {
            return false;
        }
        return true;
    }

    public HotListStructV2(String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2) {
        this(str, str2, str3, num, str4, str5, str6, num2, i.EMPTY);
    }

    public HotListStructV2(String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.title = str;
        this.image_url = str2;
        this.schema = str3;
        this.type = num;
        this.i18n_title = str4;
        this.header = str5;
        this.footer = str6;
        this.pattern_type = num2;
    }
}

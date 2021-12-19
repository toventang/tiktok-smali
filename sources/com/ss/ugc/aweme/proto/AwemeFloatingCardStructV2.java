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

public final class AwemeFloatingCardStructV2 extends Message<AwemeFloatingCardStructV2, Builder> {
    public static final ProtoAdapter<AwemeFloatingCardStructV2> ADAPTER = new ProtoAdapter_AwemeFloatingCardStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public UrlStructV2 button_bg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String button_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String description;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public List<UrlStructV2> icons;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String schema_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String title;

    public AwemeFloatingCardStructV2() {
    }

    static final class ProtoAdapter_AwemeFloatingCardStructV2 extends ProtoAdapter<AwemeFloatingCardStructV2> {
        static {
            Covode.recordClassIndex(101896);
        }

        public ProtoAdapter_AwemeFloatingCardStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeFloatingCardStructV2.class);
        }

        public final int encodedSize(AwemeFloatingCardStructV2 awemeFloatingCardStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeFloatingCardStructV2.schema) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeFloatingCardStructV2.schema_desc) + UrlStructV2.ADAPTER.asRepeated().encodedSizeWithTag(3, awemeFloatingCardStructV2.icons) + ProtoAdapter.STRING.encodedSizeWithTag(4, awemeFloatingCardStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(5, awemeFloatingCardStructV2.description) + ProtoAdapter.STRING.encodedSizeWithTag(6, awemeFloatingCardStructV2.button_desc) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, awemeFloatingCardStructV2.button_bg) + awemeFloatingCardStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeFloatingCardStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.schema(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.schema_desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.icons.add(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.description(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.button_desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.button_bg(UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeFloatingCardStructV2 awemeFloatingCardStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeFloatingCardStructV2.schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeFloatingCardStructV2.schema_desc);
            UrlStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, awemeFloatingCardStructV2.icons);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, awemeFloatingCardStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, awemeFloatingCardStructV2.description);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, awemeFloatingCardStructV2.button_desc);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, awemeFloatingCardStructV2.button_bg);
            protoWriter.writeBytes(awemeFloatingCardStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101894);
    }

    public static final class Builder extends Message.Builder<AwemeFloatingCardStructV2, Builder> {
        public UrlStructV2 button_bg;
        public String button_desc;
        public String description;
        public List<UrlStructV2> icons = Internal.newMutableList();
        public String schema;
        public String schema_desc;
        public String title;

        static {
            Covode.recordClassIndex(101895);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeFloatingCardStructV2 build() {
            return new AwemeFloatingCardStructV2(this.schema, this.schema_desc, this.icons, this.title, this.description, this.button_desc, this.button_bg, super.buildUnknownFields());
        }

        public final Builder button_bg(UrlStructV2 urlStructV2) {
            this.button_bg = urlStructV2;
            return this;
        }

        public final Builder button_desc(String str) {
            this.button_desc = str;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder schema_desc(String str) {
            this.schema_desc = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder icons(List<UrlStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.icons = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeFloatingCardStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeFloatingCardStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.schema = this.schema;
        builder.schema_desc = this.schema_desc;
        builder.icons = Internal.copyOf("icons", this.icons);
        builder.title = this.title;
        builder.description = this.description;
        builder.button_desc = this.button_desc;
        builder.button_bg = this.button_bg;
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
        String str = this.schema;
        int i8 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        String str2 = this.schema_desc;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((i9 + i3) * 37) + this.icons.hashCode()) * 37;
        String str3 = this.title;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (hashCode2 + i4) * 37;
        String str4 = this.description;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        String str5 = this.button_desc;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 37;
        UrlStructV2 urlStructV2 = this.button_bg;
        if (urlStructV2 != null) {
            i8 = urlStructV2.hashCode();
        }
        int i13 = i12 + i8;
        this.hashCode = i13;
        return i13;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.schema != null) {
            sb.append(", schema=").append(this.schema);
        }
        if (this.schema_desc != null) {
            sb.append(", schema_desc=").append(this.schema_desc);
        }
        if (!this.icons.isEmpty()) {
            sb.append(", icons=").append(this.icons);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.description != null) {
            sb.append(", description=").append(this.description);
        }
        if (this.button_desc != null) {
            sb.append(", button_desc=").append(this.button_desc);
        }
        if (this.button_bg != null) {
            sb.append(", button_bg=").append(this.button_bg);
        }
        return sb.replace(0, 2, "AwemeFloatingCardStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeFloatingCardStructV2)) {
            return false;
        }
        AwemeFloatingCardStructV2 awemeFloatingCardStructV2 = (AwemeFloatingCardStructV2) obj;
        if (!unknownFields().equals(awemeFloatingCardStructV2.unknownFields()) || !Internal.equals(this.schema, awemeFloatingCardStructV2.schema) || !Internal.equals(this.schema_desc, awemeFloatingCardStructV2.schema_desc) || !this.icons.equals(awemeFloatingCardStructV2.icons) || !Internal.equals(this.title, awemeFloatingCardStructV2.title) || !Internal.equals(this.description, awemeFloatingCardStructV2.description) || !Internal.equals(this.button_desc, awemeFloatingCardStructV2.button_desc) || !Internal.equals(this.button_bg, awemeFloatingCardStructV2.button_bg)) {
            return false;
        }
        return true;
    }

    public AwemeFloatingCardStructV2(String str, String str2, List<UrlStructV2> list, String str3, String str4, String str5, UrlStructV2 urlStructV2) {
        this(str, str2, list, str3, str4, str5, urlStructV2, i.EMPTY);
    }

    public AwemeFloatingCardStructV2(String str, String str2, List<UrlStructV2> list, String str3, String str4, String str5, UrlStructV2 urlStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.schema = str;
        this.schema_desc = str2;
        this.icons = Internal.immutableCopyOf("icons", list);
        this.title = str3;
        this.description = str4;
        this.button_desc = str5;
        this.button_bg = urlStructV2;
    }
}

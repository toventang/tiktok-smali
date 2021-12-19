package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class IconButtonStructV2 extends Message<IconButtonStructV2, Builder> {
    public static final ProtoAdapter<IconButtonStructV2> ADAPTER = new ProtoAdapter_IconButtonStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String action;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String text;

    public IconButtonStructV2() {
    }

    static final class ProtoAdapter_IconButtonStructV2 extends ProtoAdapter<IconButtonStructV2> {
        static {
            Covode.recordClassIndex(102040);
        }

        public ProtoAdapter_IconButtonStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, IconButtonStructV2.class);
        }

        public final int encodedSize(IconButtonStructV2 iconButtonStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, iconButtonStructV2.text) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, iconButtonStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(3, iconButtonStructV2.action) + iconButtonStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final IconButtonStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.icon(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.action(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, IconButtonStructV2 iconButtonStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, iconButtonStructV2.text);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, iconButtonStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, iconButtonStructV2.action);
            protoWriter.writeBytes(iconButtonStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<IconButtonStructV2, Builder> {
        public String action;
        public UrlStructV2 icon;
        public String text;

        static {
            Covode.recordClassIndex(102039);
        }

        @Override // com.squareup.wire.Message.Builder
        public final IconButtonStructV2 build() {
            return new IconButtonStructV2(this.text, this.icon, this.action, super.buildUnknownFields());
        }

        public final Builder action(String str) {
            this.action = str;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102038);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.IconButtonStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<IconButtonStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.icon = this.icon;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        UrlStructV2 urlStructV2 = this.icon;
        if (urlStructV2 != null) {
            i3 = urlStructV2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        String str2 = this.action;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=").append(this.text);
        }
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        if (this.action != null) {
            sb.append(", action=").append(this.action);
        }
        return sb.replace(0, 2, "IconButtonStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IconButtonStructV2)) {
            return false;
        }
        IconButtonStructV2 iconButtonStructV2 = (IconButtonStructV2) obj;
        if (!unknownFields().equals(iconButtonStructV2.unknownFields()) || !Internal.equals(this.text, iconButtonStructV2.text) || !Internal.equals(this.icon, iconButtonStructV2.icon) || !Internal.equals(this.action, iconButtonStructV2.action)) {
            return false;
        }
        return true;
    }

    public IconButtonStructV2(String str, UrlStructV2 urlStructV2, String str2) {
        this(str, urlStructV2, str2, i.EMPTY);
    }

    public IconButtonStructV2(String str, UrlStructV2 urlStructV2, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.text = str;
        this.icon = urlStructV2;
        this.action = str2;
    }
}

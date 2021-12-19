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

/* access modifiers changed from: package-private */
public final class VisualSearchEntryStructV2 extends Message<VisualSearchEntryStructV2, Builder> {
    public static final ProtoAdapter<VisualSearchEntryStructV2> ADAPTER = new ProtoAdapter_VisualSearchEntryStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String sub_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String text_color;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String title;

    static final class ProtoAdapter_VisualSearchEntryStructV2 extends ProtoAdapter<VisualSearchEntryStructV2> {
        static {
            Covode.recordClassIndex(102286);
        }

        public ProtoAdapter_VisualSearchEntryStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VisualSearchEntryStructV2.class);
        }

        public final int encodedSize(VisualSearchEntryStructV2 visualSearchEntryStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, visualSearchEntryStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, visualSearchEntryStructV2.sub_title) + ProtoAdapter.STRING.encodedSizeWithTag(3, visualSearchEntryStructV2.text_color) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, visualSearchEntryStructV2.icon_url) + visualSearchEntryStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VisualSearchEntryStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.title(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.sub_title(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.text_color(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.icon_url(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VisualSearchEntryStructV2 visualSearchEntryStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, visualSearchEntryStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, visualSearchEntryStructV2.sub_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, visualSearchEntryStructV2.text_color);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, visualSearchEntryStructV2.icon_url);
            protoWriter.writeBytes(visualSearchEntryStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102284);
    }

    public static final class Builder extends Message.Builder<VisualSearchEntryStructV2, Builder> {
        public UrlStructV2 icon_url;
        public String sub_title;
        public String text_color;
        public String title;

        static {
            Covode.recordClassIndex(102285);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VisualSearchEntryStructV2 build() {
            return new VisualSearchEntryStructV2(this.title, this.sub_title, this.text_color, this.icon_url, super.buildUnknownFields());
        }

        public final Builder icon_url(UrlStructV2 urlStructV2) {
            this.icon_url = urlStructV2;
            return this;
        }

        public final Builder sub_title(String str) {
            this.sub_title = str;
            return this;
        }

        public final Builder text_color(String str) {
            this.text_color = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VisualSearchEntryStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VisualSearchEntryStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.sub_title = this.sub_title;
        builder.text_color = this.text_color;
        builder.icon_url = this.icon_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        String str2 = this.sub_title;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        String str3 = this.text_color;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        UrlStructV2 urlStructV2 = this.icon_url;
        if (urlStructV2 != null) {
            i6 = urlStructV2.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.sub_title != null) {
            sb.append(", sub_title=").append(this.sub_title);
        }
        if (this.text_color != null) {
            sb.append(", text_color=").append(this.text_color);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=").append(this.icon_url);
        }
        return sb.replace(0, 2, "VisualSearchEntryStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisualSearchEntryStructV2)) {
            return false;
        }
        VisualSearchEntryStructV2 visualSearchEntryStructV2 = (VisualSearchEntryStructV2) obj;
        if (!unknownFields().equals(visualSearchEntryStructV2.unknownFields()) || !Internal.equals(this.title, visualSearchEntryStructV2.title) || !Internal.equals(this.sub_title, visualSearchEntryStructV2.sub_title) || !Internal.equals(this.text_color, visualSearchEntryStructV2.text_color) || !Internal.equals(this.icon_url, visualSearchEntryStructV2.icon_url)) {
            return false;
        }
        return true;
    }

    public VisualSearchEntryStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2) {
        this(str, str2, str3, urlStructV2, i.EMPTY);
    }

    public VisualSearchEntryStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.title = str;
        this.sub_title = str2;
        this.text_color = str3;
        this.icon_url = urlStructV2;
    }
}

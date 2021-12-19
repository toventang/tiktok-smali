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

public final class CaptionAnchorStructV2 extends Message<CaptionAnchorStructV2, Builder> {
    public static final ProtoAdapter<CaptionAnchorStructV2> ADAPTER = new ProtoAdapter_CaptionAnchorStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String link;

    public CaptionAnchorStructV2() {
    }

    static final class ProtoAdapter_CaptionAnchorStructV2 extends ProtoAdapter<CaptionAnchorStructV2> {
        static {
            Covode.recordClassIndex(101944);
        }

        public ProtoAdapter_CaptionAnchorStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CaptionAnchorStructV2.class);
        }

        public final int encodedSize(CaptionAnchorStructV2 captionAnchorStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, captionAnchorStructV2.keyword) + ProtoAdapter.STRING.encodedSizeWithTag(2, captionAnchorStructV2.link) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, captionAnchorStructV2.icon) + captionAnchorStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaptionAnchorStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.keyword(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.link(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.icon(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CaptionAnchorStructV2 captionAnchorStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, captionAnchorStructV2.keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, captionAnchorStructV2.link);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, captionAnchorStructV2.icon);
            protoWriter.writeBytes(captionAnchorStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CaptionAnchorStructV2, Builder> {
        public UrlStructV2 icon;
        public String keyword;
        public String link;

        static {
            Covode.recordClassIndex(101943);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CaptionAnchorStructV2 build() {
            return new CaptionAnchorStructV2(this.keyword, this.link, this.icon, super.buildUnknownFields());
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder keyword(String str) {
            this.keyword = str;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101942);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CaptionAnchorStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CaptionAnchorStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.keyword = this.keyword;
        builder.link = this.link;
        builder.icon = this.icon;
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
        String str = this.keyword;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.link;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        UrlStructV2 urlStructV2 = this.icon;
        if (urlStructV2 != null) {
            i5 = urlStructV2.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=").append(this.keyword);
        }
        if (this.link != null) {
            sb.append(", link=").append(this.link);
        }
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        return sb.replace(0, 2, "CaptionAnchorStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptionAnchorStructV2)) {
            return false;
        }
        CaptionAnchorStructV2 captionAnchorStructV2 = (CaptionAnchorStructV2) obj;
        if (!unknownFields().equals(captionAnchorStructV2.unknownFields()) || !Internal.equals(this.keyword, captionAnchorStructV2.keyword) || !Internal.equals(this.link, captionAnchorStructV2.link) || !Internal.equals(this.icon, captionAnchorStructV2.icon)) {
            return false;
        }
        return true;
    }

    public CaptionAnchorStructV2(String str, String str2, UrlStructV2 urlStructV2) {
        this(str, str2, urlStructV2, i.EMPTY);
    }

    public CaptionAnchorStructV2(String str, String str2, UrlStructV2 urlStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.keyword = str;
        this.link = str2;
        this.icon = urlStructV2;
    }
}

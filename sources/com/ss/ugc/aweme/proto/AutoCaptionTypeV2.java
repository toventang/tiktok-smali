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

public final class AutoCaptionTypeV2 extends Message<AutoCaptionTypeV2, Builder> {
    public static final ProtoAdapter<AutoCaptionTypeV2> ADAPTER = new ProtoAdapter_AutoCaptionTypeV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String language;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String uri;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 url;

    public AutoCaptionTypeV2() {
    }

    static final class ProtoAdapter_AutoCaptionTypeV2 extends ProtoAdapter<AutoCaptionTypeV2> {
        static {
            Covode.recordClassIndex(101869);
        }

        public ProtoAdapter_AutoCaptionTypeV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AutoCaptionTypeV2.class);
        }

        public final int encodedSize(AutoCaptionTypeV2 autoCaptionTypeV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, autoCaptionTypeV2.language) + ProtoAdapter.STRING.encodedSizeWithTag(2, autoCaptionTypeV2.uri) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, autoCaptionTypeV2.url) + autoCaptionTypeV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AutoCaptionTypeV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.language(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.uri(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.url(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AutoCaptionTypeV2 autoCaptionTypeV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, autoCaptionTypeV2.language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, autoCaptionTypeV2.uri);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, autoCaptionTypeV2.url);
            protoWriter.writeBytes(autoCaptionTypeV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<AutoCaptionTypeV2, Builder> {
        public String language;
        public String uri;
        public UrlStructV2 url;

        static {
            Covode.recordClassIndex(101868);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AutoCaptionTypeV2 build() {
            return new AutoCaptionTypeV2(this.language, this.uri, this.url, super.buildUnknownFields());
        }

        public final Builder language(String str) {
            this.language = str;
            return this;
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder url(UrlStructV2 urlStructV2) {
            this.url = urlStructV2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101867);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AutoCaptionTypeV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AutoCaptionTypeV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.language = this.language;
        builder.uri = this.uri;
        builder.url = this.url;
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
        String str = this.language;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.uri;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        UrlStructV2 urlStructV2 = this.url;
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
        if (this.language != null) {
            sb.append(", language=").append(this.language);
        }
        if (this.uri != null) {
            sb.append(", uri=").append(this.uri);
        }
        if (this.url != null) {
            sb.append(", url=").append(this.url);
        }
        return sb.replace(0, 2, "AutoCaptionTypeV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoCaptionTypeV2)) {
            return false;
        }
        AutoCaptionTypeV2 autoCaptionTypeV2 = (AutoCaptionTypeV2) obj;
        if (!unknownFields().equals(autoCaptionTypeV2.unknownFields()) || !Internal.equals(this.language, autoCaptionTypeV2.language) || !Internal.equals(this.uri, autoCaptionTypeV2.uri) || !Internal.equals(this.url, autoCaptionTypeV2.url)) {
            return false;
        }
        return true;
    }

    public AutoCaptionTypeV2(String str, String str2, UrlStructV2 urlStructV2) {
        this(str, str2, urlStructV2, i.EMPTY);
    }

    public AutoCaptionTypeV2(String str, String str2, UrlStructV2 urlStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.language = str;
        this.uri = str2;
        this.url = urlStructV2;
    }
}

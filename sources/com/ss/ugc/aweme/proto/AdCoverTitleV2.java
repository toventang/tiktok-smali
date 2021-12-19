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

public final class AdCoverTitleV2 extends Message<AdCoverTitleV2, Builder> {
    public static final ProtoAdapter<AdCoverTitleV2> ADAPTER = new ProtoAdapter_AdCoverTitleV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String web_url;

    public AdCoverTitleV2() {
    }

    static final class ProtoAdapter_AdCoverTitleV2 extends ProtoAdapter<AdCoverTitleV2> {
        static {
            Covode.recordClassIndex(101845);
        }

        public ProtoAdapter_AdCoverTitleV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AdCoverTitleV2.class);
        }

        public final int encodedSize(AdCoverTitleV2 adCoverTitleV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, adCoverTitleV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, adCoverTitleV2.web_url) + adCoverTitleV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AdCoverTitleV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.title(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.web_url(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AdCoverTitleV2 adCoverTitleV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, adCoverTitleV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, adCoverTitleV2.web_url);
            protoWriter.writeBytes(adCoverTitleV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<AdCoverTitleV2, Builder> {
        public String title;
        public String web_url;

        static {
            Covode.recordClassIndex(101844);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AdCoverTitleV2 build() {
            return new AdCoverTitleV2(this.title, this.web_url, super.buildUnknownFields());
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101843);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AdCoverTitleV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AdCoverTitleV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.web_url = this.web_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str2 = this.web_url;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.web_url != null) {
            sb.append(", web_url=").append(this.web_url);
        }
        return sb.replace(0, 2, "AdCoverTitleV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdCoverTitleV2)) {
            return false;
        }
        AdCoverTitleV2 adCoverTitleV2 = (AdCoverTitleV2) obj;
        if (!unknownFields().equals(adCoverTitleV2.unknownFields()) || !Internal.equals(this.title, adCoverTitleV2.title) || !Internal.equals(this.web_url, adCoverTitleV2.web_url)) {
            return false;
        }
        return true;
    }

    public AdCoverTitleV2(String str, String str2) {
        this(str, str2, i.EMPTY);
    }

    public AdCoverTitleV2(String str, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.title = str;
        this.web_url = str2;
    }
}

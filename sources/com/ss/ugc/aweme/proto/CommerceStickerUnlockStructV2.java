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

public final class CommerceStickerUnlockStructV2 extends Message<CommerceStickerUnlockStructV2, Builder> {
    public static final ProtoAdapter<CommerceStickerUnlockStructV2> ADAPTER = new ProtoAdapter_CommerceStickerUnlockStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String web_url;

    public CommerceStickerUnlockStructV2() {
    }

    static final class ProtoAdapter_CommerceStickerUnlockStructV2 extends ProtoAdapter<CommerceStickerUnlockStructV2> {
        static {
            Covode.recordClassIndex(101977);
        }

        public ProtoAdapter_CommerceStickerUnlockStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceStickerUnlockStructV2.class);
        }

        public final int encodedSize(CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, commerceStickerUnlockStructV2.desc) + ProtoAdapter.STRING.encodedSizeWithTag(2, commerceStickerUnlockStructV2.web_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, commerceStickerUnlockStructV2.open_url) + commerceStickerUnlockStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CommerceStickerUnlockStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.desc(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.web_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.open_url(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commerceStickerUnlockStructV2.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commerceStickerUnlockStructV2.web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commerceStickerUnlockStructV2.open_url);
            protoWriter.writeBytes(commerceStickerUnlockStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CommerceStickerUnlockStructV2, Builder> {
        public String desc;
        public String open_url;
        public String web_url;

        static {
            Covode.recordClassIndex(101976);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CommerceStickerUnlockStructV2 build() {
            return new CommerceStickerUnlockStructV2(this.desc, this.web_url, this.open_url, super.buildUnknownFields());
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101975);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CommerceStickerUnlockStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CommerceStickerUnlockStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.desc = this.desc;
        builder.web_url = this.web_url;
        builder.open_url = this.open_url;
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
        String str = this.desc;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.web_url;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        String str3 = this.open_url;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.desc != null) {
            sb.append(", desc=").append(this.desc);
        }
        if (this.web_url != null) {
            sb.append(", web_url=").append(this.web_url);
        }
        if (this.open_url != null) {
            sb.append(", open_url=").append(this.open_url);
        }
        return sb.replace(0, 2, "CommerceStickerUnlockStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceStickerUnlockStructV2)) {
            return false;
        }
        CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2 = (CommerceStickerUnlockStructV2) obj;
        if (!unknownFields().equals(commerceStickerUnlockStructV2.unknownFields()) || !Internal.equals(this.desc, commerceStickerUnlockStructV2.desc) || !Internal.equals(this.web_url, commerceStickerUnlockStructV2.web_url) || !Internal.equals(this.open_url, commerceStickerUnlockStructV2.open_url)) {
            return false;
        }
        return true;
    }

    public CommerceStickerUnlockStructV2(String str, String str2, String str3) {
        this(str, str2, str3, i.EMPTY);
    }

    public CommerceStickerUnlockStructV2(String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.desc = str;
        this.web_url = str2;
        this.open_url = str3;
    }
}

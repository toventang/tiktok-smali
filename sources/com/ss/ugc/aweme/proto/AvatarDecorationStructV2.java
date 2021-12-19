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

public final class AvatarDecorationStructV2 extends Message<AvatarDecorationStructV2, Builder> {
    public static final ProtoAdapter<AvatarDecorationStructV2> ADAPTER = new ProtoAdapter_AvatarDecorationStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 source_url;

    public AvatarDecorationStructV2() {
    }

    static final class ProtoAdapter_AvatarDecorationStructV2 extends ProtoAdapter<AvatarDecorationStructV2> {
        static {
            Covode.recordClassIndex(101875);
        }

        public ProtoAdapter_AvatarDecorationStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AvatarDecorationStructV2.class);
        }

        public final int encodedSize(AvatarDecorationStructV2 avatarDecorationStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, avatarDecorationStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, avatarDecorationStructV2.name) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, avatarDecorationStructV2.source_url) + avatarDecorationStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AvatarDecorationStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.source_url(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AvatarDecorationStructV2 avatarDecorationStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, avatarDecorationStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, avatarDecorationStructV2.name);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, avatarDecorationStructV2.source_url);
            protoWriter.writeBytes(avatarDecorationStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<AvatarDecorationStructV2, Builder> {
        public Long id;
        public String name;
        public UrlStructV2 source_url;

        static {
            Covode.recordClassIndex(101874);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AvatarDecorationStructV2 build() {
            return new AvatarDecorationStructV2(this.id, this.name, this.source_url, super.buildUnknownFields());
        }

        public final Builder id(Long l2) {
            this.id = l2;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder source_url(UrlStructV2 urlStructV2) {
            this.source_url = urlStructV2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101873);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AvatarDecorationStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AvatarDecorationStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.name = this.name;
        builder.source_url = this.source_url;
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
        Long l2 = this.id;
        int i5 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str = this.name;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        UrlStructV2 urlStructV2 = this.source_url;
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
        if (this.id != null) {
            sb.append(", id=").append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=").append(this.name);
        }
        if (this.source_url != null) {
            sb.append(", source_url=").append(this.source_url);
        }
        return sb.replace(0, 2, "AvatarDecorationStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarDecorationStructV2)) {
            return false;
        }
        AvatarDecorationStructV2 avatarDecorationStructV2 = (AvatarDecorationStructV2) obj;
        if (!unknownFields().equals(avatarDecorationStructV2.unknownFields()) || !Internal.equals(this.id, avatarDecorationStructV2.id) || !Internal.equals(this.name, avatarDecorationStructV2.name) || !Internal.equals(this.source_url, avatarDecorationStructV2.source_url)) {
            return false;
        }
        return true;
    }

    public AvatarDecorationStructV2(Long l2, String str, UrlStructV2 urlStructV2) {
        this(l2, str, urlStructV2, i.EMPTY);
    }

    public AvatarDecorationStructV2(Long l2, String str, UrlStructV2 urlStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.id = l2;
        this.name = str;
        this.source_url = urlStructV2;
    }
}

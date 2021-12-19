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

public final class HashTagStickerStructV2 extends Message<HashTagStickerStructV2, Builder> {
    public static final ProtoAdapter<HashTagStickerStructV2> ADAPTER = new ProtoAdapter_HashTagStickerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String hashtag_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String hashtag_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer status;

    public HashTagStickerStructV2() {
    }

    static final class ProtoAdapter_HashTagStickerStructV2 extends ProtoAdapter<HashTagStickerStructV2> {
        static {
            Covode.recordClassIndex(102025);
        }

        public ProtoAdapter_HashTagStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, HashTagStickerStructV2.class);
        }

        public final int encodedSize(HashTagStickerStructV2 hashTagStickerStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, hashTagStickerStructV2.hashtag_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, hashTagStickerStructV2.hashtag_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, hashTagStickerStructV2.status) + hashTagStickerStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final HashTagStickerStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.hashtag_name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.hashtag_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, HashTagStickerStructV2 hashTagStickerStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hashTagStickerStructV2.hashtag_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hashTagStickerStructV2.hashtag_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, hashTagStickerStructV2.status);
            protoWriter.writeBytes(hashTagStickerStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102023);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.HashTagStickerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<HashTagStickerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.hashtag_name = this.hashtag_name;
        builder.hashtag_id = this.hashtag_id;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<HashTagStickerStructV2, Builder> {
        public String hashtag_id;
        public String hashtag_name;
        public Integer status;

        static {
            Covode.recordClassIndex(102024);
        }

        @Override // com.squareup.wire.Message.Builder
        public final HashTagStickerStructV2 build() {
            String str = this.hashtag_name;
            if (str != null) {
                return new HashTagStickerStructV2(this.hashtag_name, this.hashtag_id, this.status, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "hashtag_name");
        }

        public final Builder hashtag_id(String str) {
            this.hashtag_id = str;
            return this;
        }

        public final Builder hashtag_name(String str) {
            this.hashtag_name = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.hashtag_name.hashCode()) * 37;
        String str = this.hashtag_id;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Integer num = this.status;
        if (num != null) {
            i4 = num.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", hashtag_name=").append(this.hashtag_name);
        if (this.hashtag_id != null) {
            sb.append(", hashtag_id=").append(this.hashtag_id);
        }
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        return sb.replace(0, 2, "HashTagStickerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HashTagStickerStructV2)) {
            return false;
        }
        HashTagStickerStructV2 hashTagStickerStructV2 = (HashTagStickerStructV2) obj;
        if (!unknownFields().equals(hashTagStickerStructV2.unknownFields()) || !this.hashtag_name.equals(hashTagStickerStructV2.hashtag_name) || !Internal.equals(this.hashtag_id, hashTagStickerStructV2.hashtag_id) || !Internal.equals(this.status, hashTagStickerStructV2.status)) {
            return false;
        }
        return true;
    }

    public HashTagStickerStructV2(String str, String str2, Integer num) {
        this(str, str2, num, i.EMPTY);
    }

    public HashTagStickerStructV2(String str, String str2, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.hashtag_name = str;
        this.hashtag_id = str2;
        this.status = num;
    }
}

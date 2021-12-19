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

public final class MutualUserStructV2 extends Message<MutualUserStructV2, Builder> {
    public static final ProtoAdapter<MutualUserStructV2> ADAPTER = new ProtoAdapter_MutualUserStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 avatar_medium;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String sec_uid;

    public MutualUserStructV2() {
    }

    static final class ProtoAdapter_MutualUserStructV2 extends ProtoAdapter<MutualUserStructV2> {
        static {
            Covode.recordClassIndex(102142);
        }

        public ProtoAdapter_MutualUserStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MutualUserStructV2.class);
        }

        public final int encodedSize(MutualUserStructV2 mutualUserStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, mutualUserStructV2.sec_uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, mutualUserStructV2.nickname) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, mutualUserStructV2.avatar_medium) + mutualUserStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MutualUserStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.nickname(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.avatar_medium(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MutualUserStructV2 mutualUserStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mutualUserStructV2.sec_uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mutualUserStructV2.nickname);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, mutualUserStructV2.avatar_medium);
            protoWriter.writeBytes(mutualUserStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MutualUserStructV2, Builder> {
        public UrlStructV2 avatar_medium;
        public String nickname;
        public String sec_uid;

        static {
            Covode.recordClassIndex(102141);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MutualUserStructV2 build() {
            return new MutualUserStructV2(this.sec_uid, this.nickname, this.avatar_medium, super.buildUnknownFields());
        }

        public final Builder avatar_medium(UrlStructV2 urlStructV2) {
            this.avatar_medium = urlStructV2;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102140);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MutualUserStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MutualUserStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.sec_uid = this.sec_uid;
        builder.nickname = this.nickname;
        builder.avatar_medium = this.avatar_medium;
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
        String str = this.sec_uid;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.nickname;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        UrlStructV2 urlStructV2 = this.avatar_medium;
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
        if (this.sec_uid != null) {
            sb.append(", sec_uid=").append(this.sec_uid);
        }
        if (this.nickname != null) {
            sb.append(", nickname=").append(this.nickname);
        }
        if (this.avatar_medium != null) {
            sb.append(", avatar_medium=").append(this.avatar_medium);
        }
        return sb.replace(0, 2, "MutualUserStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MutualUserStructV2)) {
            return false;
        }
        MutualUserStructV2 mutualUserStructV2 = (MutualUserStructV2) obj;
        if (!unknownFields().equals(mutualUserStructV2.unknownFields()) || !Internal.equals(this.sec_uid, mutualUserStructV2.sec_uid) || !Internal.equals(this.nickname, mutualUserStructV2.nickname) || !Internal.equals(this.avatar_medium, mutualUserStructV2.avatar_medium)) {
            return false;
        }
        return true;
    }

    public MutualUserStructV2(String str, String str2, UrlStructV2 urlStructV2) {
        this(str, str2, urlStructV2, i.EMPTY);
    }

    public MutualUserStructV2(String str, String str2, UrlStructV2 urlStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.sec_uid = str;
        this.nickname = str2;
        this.avatar_medium = urlStructV2;
    }
}

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

public final class MusicPerformerStructV2 extends Message<MusicPerformerStructV2, Builder> {
    public static final ProtoAdapter<MusicPerformerStructV2> ADAPTER = new ProtoAdapter_MusicPerformerStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicAvatarStructV2#ADAPTER", tag = 3)
    public MusicAvatarStructV2 avatar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;

    public MusicPerformerStructV2() {
    }

    static final class ProtoAdapter_MusicPerformerStructV2 extends ProtoAdapter<MusicPerformerStructV2> {
        static {
            Covode.recordClassIndex(102133);
        }

        public ProtoAdapter_MusicPerformerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MusicPerformerStructV2.class);
        }

        public final int encodedSize(MusicPerformerStructV2 musicPerformerStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, musicPerformerStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, musicPerformerStructV2.name) + MusicAvatarStructV2.ADAPTER.encodedSizeWithTag(3, musicPerformerStructV2.avatar) + musicPerformerStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MusicPerformerStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.avatar(MusicAvatarStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MusicPerformerStructV2 musicPerformerStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, musicPerformerStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, musicPerformerStructV2.name);
            MusicAvatarStructV2.ADAPTER.encodeWithTag(protoWriter, 3, musicPerformerStructV2.avatar);
            protoWriter.writeBytes(musicPerformerStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MusicPerformerStructV2, Builder> {
        public MusicAvatarStructV2 avatar;
        public String id;
        public String name;

        static {
            Covode.recordClassIndex(102132);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MusicPerformerStructV2 build() {
            return new MusicPerformerStructV2(this.id, this.name, this.avatar, super.buildUnknownFields());
        }

        public final Builder avatar(MusicAvatarStructV2 musicAvatarStructV2) {
            this.avatar = musicAvatarStructV2;
            return this;
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102131);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MusicPerformerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MusicPerformerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.name = this.name;
        builder.avatar = this.avatar;
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
        String str = this.id;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.name;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        MusicAvatarStructV2 musicAvatarStructV2 = this.avatar;
        if (musicAvatarStructV2 != null) {
            i5 = musicAvatarStructV2.hashCode();
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
        if (this.avatar != null) {
            sb.append(", avatar=").append(this.avatar);
        }
        return sb.replace(0, 2, "MusicPerformerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicPerformerStructV2)) {
            return false;
        }
        MusicPerformerStructV2 musicPerformerStructV2 = (MusicPerformerStructV2) obj;
        if (!unknownFields().equals(musicPerformerStructV2.unknownFields()) || !Internal.equals(this.id, musicPerformerStructV2.id) || !Internal.equals(this.name, musicPerformerStructV2.name) || !Internal.equals(this.avatar, musicPerformerStructV2.avatar)) {
            return false;
        }
        return true;
    }

    public MusicPerformerStructV2(String str, String str2, MusicAvatarStructV2 musicAvatarStructV2) {
        this(str, str2, musicAvatarStructV2, i.EMPTY);
    }

    public MusicPerformerStructV2(String str, String str2, MusicAvatarStructV2 musicAvatarStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.id = str;
        this.name = str2;
        this.avatar = musicAvatarStructV2;
    }
}

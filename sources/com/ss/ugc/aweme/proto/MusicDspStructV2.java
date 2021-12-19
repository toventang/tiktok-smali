package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class MusicDspStructV2 extends Message<MusicDspStructV2, Builder> {
    public static final ProtoAdapter<MusicDspStructV2> ADAPTER = new ProtoAdapter_MusicDspStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer collect_status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicAvatarStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public MusicAvatarStructV2 default_performer_avatar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String full_clip_author;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String full_clip_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String full_clip_title;

    public MusicDspStructV2() {
    }

    static final class ProtoAdapter_MusicDspStructV2 extends ProtoAdapter<MusicDspStructV2> {
        static {
            Covode.recordClassIndex(102130);
        }

        public ProtoAdapter_MusicDspStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MusicDspStructV2.class);
        }

        public final int encodedSize(MusicDspStructV2 musicDspStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, musicDspStructV2.full_clip_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, musicDspStructV2.full_clip_author) + ProtoAdapter.STRING.encodedSizeWithTag(3, musicDspStructV2.full_clip_title) + ProtoAdapter.INT32.encodedSizeWithTag(4, musicDspStructV2.collect_status) + MusicAvatarStructV2.ADAPTER.encodedSizeWithTag(5, musicDspStructV2.default_performer_avatar) + musicDspStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MusicDspStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.full_clip_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.full_clip_author(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.full_clip_title(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.collect_status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.default_performer_avatar(MusicAvatarStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MusicDspStructV2 musicDspStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, musicDspStructV2.full_clip_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, musicDspStructV2.full_clip_author);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, musicDspStructV2.full_clip_title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, musicDspStructV2.collect_status);
            MusicAvatarStructV2.ADAPTER.encodeWithTag(protoWriter, 5, musicDspStructV2.default_performer_avatar);
            protoWriter.writeBytes(musicDspStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102128);
    }

    public static final class Builder extends Message.Builder<MusicDspStructV2, Builder> {
        public Integer collect_status;
        public MusicAvatarStructV2 default_performer_avatar;
        public String full_clip_author;
        public String full_clip_id;
        public String full_clip_title;

        static {
            Covode.recordClassIndex(102129);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MusicDspStructV2 build() {
            return new MusicDspStructV2(this.full_clip_id, this.full_clip_author, this.full_clip_title, this.collect_status, this.default_performer_avatar, super.buildUnknownFields());
        }

        public final Builder collect_status(Integer num) {
            this.collect_status = num;
            return this;
        }

        public final Builder default_performer_avatar(MusicAvatarStructV2 musicAvatarStructV2) {
            this.default_performer_avatar = musicAvatarStructV2;
            return this;
        }

        public final Builder full_clip_author(String str) {
            this.full_clip_author = str;
            return this;
        }

        public final Builder full_clip_id(String str) {
            this.full_clip_id = str;
            return this;
        }

        public final Builder full_clip_title(String str) {
            this.full_clip_title = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MusicDspStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MusicDspStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.full_clip_id = this.full_clip_id;
        builder.full_clip_author = this.full_clip_author;
        builder.full_clip_title = this.full_clip_title;
        builder.collect_status = this.collect_status;
        builder.default_performer_avatar = this.default_performer_avatar;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.full_clip_id;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        String str2 = this.full_clip_author;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        String str3 = this.full_clip_title;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        Integer num = this.collect_status;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        MusicAvatarStructV2 musicAvatarStructV2 = this.default_performer_avatar;
        if (musicAvatarStructV2 != null) {
            i7 = musicAvatarStructV2.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.full_clip_id != null) {
            sb.append(", full_clip_id=").append(this.full_clip_id);
        }
        if (this.full_clip_author != null) {
            sb.append(", full_clip_author=").append(this.full_clip_author);
        }
        if (this.full_clip_title != null) {
            sb.append(", full_clip_title=").append(this.full_clip_title);
        }
        if (this.collect_status != null) {
            sb.append(", collect_status=").append(this.collect_status);
        }
        if (this.default_performer_avatar != null) {
            sb.append(", default_performer_avatar=").append(this.default_performer_avatar);
        }
        return sb.replace(0, 2, "MusicDspStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicDspStructV2)) {
            return false;
        }
        MusicDspStructV2 musicDspStructV2 = (MusicDspStructV2) obj;
        if (!unknownFields().equals(musicDspStructV2.unknownFields()) || !Internal.equals(this.full_clip_id, musicDspStructV2.full_clip_id) || !Internal.equals(this.full_clip_author, musicDspStructV2.full_clip_author) || !Internal.equals(this.full_clip_title, musicDspStructV2.full_clip_title) || !Internal.equals(this.collect_status, musicDspStructV2.collect_status) || !Internal.equals(this.default_performer_avatar, musicDspStructV2.default_performer_avatar)) {
            return false;
        }
        return true;
    }

    public MusicDspStructV2(String str, String str2, String str3, Integer num, MusicAvatarStructV2 musicAvatarStructV2) {
        this(str, str2, str3, num, musicAvatarStructV2, i.EMPTY);
    }

    public MusicDspStructV2(String str, String str2, String str3, Integer num, MusicAvatarStructV2 musicAvatarStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.full_clip_id = str;
        this.full_clip_author = str2;
        this.full_clip_title = str3;
        this.collect_status = num;
        this.default_performer_avatar = musicAvatarStructV2;
    }
}

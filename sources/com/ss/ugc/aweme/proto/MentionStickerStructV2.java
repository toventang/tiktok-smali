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

public final class MentionStickerStructV2 extends Message<MentionStickerStructV2, Builder> {
    public static final ProtoAdapter<MentionStickerStructV2> ADAPTER = new ProtoAdapter_MentionStickerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String sec_uid;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public UrlStructV2 user_avatar_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String user_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String user_name;

    public MentionStickerStructV2() {
    }

    static final class ProtoAdapter_MentionStickerStructV2 extends ProtoAdapter<MentionStickerStructV2> {
        static {
            Covode.recordClassIndex(102103);
        }

        public ProtoAdapter_MentionStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MentionStickerStructV2.class);
        }

        public final int encodedSize(MentionStickerStructV2 mentionStickerStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, mentionStickerStructV2.sec_uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, mentionStickerStructV2.user_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, mentionStickerStructV2.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, mentionStickerStructV2.nickname) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, mentionStickerStructV2.user_avatar_url) + mentionStickerStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MentionStickerStructV2 decode(ProtoReader protoReader) {
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
                    builder.user_name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.user_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.nickname(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.user_avatar_url(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MentionStickerStructV2 mentionStickerStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mentionStickerStructV2.sec_uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mentionStickerStructV2.user_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mentionStickerStructV2.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mentionStickerStructV2.nickname);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, mentionStickerStructV2.user_avatar_url);
            protoWriter.writeBytes(mentionStickerStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102101);
    }

    public static final class Builder extends Message.Builder<MentionStickerStructV2, Builder> {
        public String nickname;
        public String sec_uid;
        public UrlStructV2 user_avatar_url;
        public String user_id;
        public String user_name;

        static {
            Covode.recordClassIndex(102102);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MentionStickerStructV2 build() {
            String str = this.sec_uid;
            if (str != null && this.user_name != null) {
                return new MentionStickerStructV2(this.sec_uid, this.user_name, this.user_id, this.nickname, this.user_avatar_url, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "sec_uid", this.user_name, "user_name");
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder user_avatar_url(UrlStructV2 urlStructV2) {
            this.user_avatar_url = urlStructV2;
            return this;
        }

        public final Builder user_id(String str) {
            this.user_id = str;
            return this;
        }

        public final Builder user_name(String str) {
            this.user_name = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MentionStickerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MentionStickerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.sec_uid = this.sec_uid;
        builder.user_name = this.user_name;
        builder.user_id = this.user_id;
        builder.nickname = this.nickname;
        builder.user_avatar_url = this.user_avatar_url;
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
        int hashCode = ((((unknownFields().hashCode() * 37) + this.sec_uid.hashCode()) * 37) + this.user_name.hashCode()) * 37;
        String str = this.user_id;
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
        UrlStructV2 urlStructV2 = this.user_avatar_url;
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
        sb.append(", sec_uid=").append(this.sec_uid);
        sb.append(", user_name=").append(this.user_name);
        if (this.user_id != null) {
            sb.append(", user_id=").append(this.user_id);
        }
        if (this.nickname != null) {
            sb.append(", nickname=").append(this.nickname);
        }
        if (this.user_avatar_url != null) {
            sb.append(", user_avatar_url=").append(this.user_avatar_url);
        }
        return sb.replace(0, 2, "MentionStickerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MentionStickerStructV2)) {
            return false;
        }
        MentionStickerStructV2 mentionStickerStructV2 = (MentionStickerStructV2) obj;
        if (!unknownFields().equals(mentionStickerStructV2.unknownFields()) || !this.sec_uid.equals(mentionStickerStructV2.sec_uid) || !this.user_name.equals(mentionStickerStructV2.user_name) || !Internal.equals(this.user_id, mentionStickerStructV2.user_id) || !Internal.equals(this.nickname, mentionStickerStructV2.nickname) || !Internal.equals(this.user_avatar_url, mentionStickerStructV2.user_avatar_url)) {
            return false;
        }
        return true;
    }

    public MentionStickerStructV2(String str, String str2, String str3, String str4, UrlStructV2 urlStructV2) {
        this(str, str2, str3, str4, urlStructV2, i.EMPTY);
    }

    public MentionStickerStructV2(String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.sec_uid = str;
        this.user_name = str2;
        this.user_id = str3;
        this.nickname = str4;
        this.user_avatar_url = urlStructV2;
    }
}

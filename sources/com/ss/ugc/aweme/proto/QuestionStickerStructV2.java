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

public final class QuestionStickerStructV2 extends Message<QuestionStickerStructV2, Builder> {
    public static final ProtoAdapter<QuestionStickerStructV2> ADAPTER = new ProtoAdapter_QuestionStickerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long item_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long question_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String sec_uid;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 user_avatar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long user_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String username;

    public QuestionStickerStructV2() {
    }

    static final class ProtoAdapter_QuestionStickerStructV2 extends ProtoAdapter<QuestionStickerStructV2> {
        static {
            Covode.recordClassIndex(102181);
        }

        public ProtoAdapter_QuestionStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, QuestionStickerStructV2.class);
        }

        public final int encodedSize(QuestionStickerStructV2 questionStickerStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, questionStickerStructV2.question_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, questionStickerStructV2.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, questionStickerStructV2.item_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, questionStickerStructV2.content) + ProtoAdapter.STRING.encodedSizeWithTag(5, questionStickerStructV2.username) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, questionStickerStructV2.user_avatar) + ProtoAdapter.STRING.encodedSizeWithTag(7, questionStickerStructV2.sec_uid) + questionStickerStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final QuestionStickerStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.question_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.item_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.content(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.username(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.user_avatar(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, QuestionStickerStructV2 questionStickerStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, questionStickerStructV2.question_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, questionStickerStructV2.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, questionStickerStructV2.item_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, questionStickerStructV2.content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, questionStickerStructV2.username);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, questionStickerStructV2.user_avatar);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, questionStickerStructV2.sec_uid);
            protoWriter.writeBytes(questionStickerStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102179);
    }

    public static final class Builder extends Message.Builder<QuestionStickerStructV2, Builder> {
        public String content;
        public Long item_id;
        public Long question_id;
        public String sec_uid;
        public UrlStructV2 user_avatar;
        public Long user_id;
        public String username;

        static {
            Covode.recordClassIndex(102180);
        }

        @Override // com.squareup.wire.Message.Builder
        public final QuestionStickerStructV2 build() {
            return new QuestionStickerStructV2(this.question_id, this.user_id, this.item_id, this.content, this.username, this.user_avatar, this.sec_uid, super.buildUnknownFields());
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder item_id(Long l2) {
            this.item_id = l2;
            return this;
        }

        public final Builder question_id(Long l2) {
            this.question_id = l2;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder user_avatar(UrlStructV2 urlStructV2) {
            this.user_avatar = urlStructV2;
            return this;
        }

        public final Builder user_id(Long l2) {
            this.user_id = l2;
            return this;
        }

        public final Builder username(String str) {
            this.username = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.QuestionStickerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<QuestionStickerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.question_id = this.question_id;
        builder.user_id = this.user_id;
        builder.item_id = this.item_id;
        builder.content = this.content;
        builder.username = this.username;
        builder.user_avatar = this.user_avatar;
        builder.sec_uid = this.sec_uid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.question_id;
        int i9 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (hashCode + i2) * 37;
        Long l3 = this.user_id;
        if (l3 != null) {
            i3 = l3.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        Long l4 = this.item_id;
        if (l4 != null) {
            i4 = l4.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        String str = this.content;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        String str2 = this.username;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        UrlStructV2 urlStructV2 = this.user_avatar;
        if (urlStructV2 != null) {
            i7 = urlStructV2.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 37;
        String str3 = this.sec_uid;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        int i16 = i15 + i9;
        this.hashCode = i16;
        return i16;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.question_id != null) {
            sb.append(", question_id=").append(this.question_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=").append(this.user_id);
        }
        if (this.item_id != null) {
            sb.append(", item_id=").append(this.item_id);
        }
        if (this.content != null) {
            sb.append(", content=").append(this.content);
        }
        if (this.username != null) {
            sb.append(", username=").append(this.username);
        }
        if (this.user_avatar != null) {
            sb.append(", user_avatar=").append(this.user_avatar);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=").append(this.sec_uid);
        }
        return sb.replace(0, 2, "QuestionStickerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuestionStickerStructV2)) {
            return false;
        }
        QuestionStickerStructV2 questionStickerStructV2 = (QuestionStickerStructV2) obj;
        if (!unknownFields().equals(questionStickerStructV2.unknownFields()) || !Internal.equals(this.question_id, questionStickerStructV2.question_id) || !Internal.equals(this.user_id, questionStickerStructV2.user_id) || !Internal.equals(this.item_id, questionStickerStructV2.item_id) || !Internal.equals(this.content, questionStickerStructV2.content) || !Internal.equals(this.username, questionStickerStructV2.username) || !Internal.equals(this.user_avatar, questionStickerStructV2.user_avatar) || !Internal.equals(this.sec_uid, questionStickerStructV2.sec_uid)) {
            return false;
        }
        return true;
    }

    public QuestionStickerStructV2(Long l2, Long l3, Long l4, String str, String str2, UrlStructV2 urlStructV2, String str3) {
        this(l2, l3, l4, str, str2, urlStructV2, str3, i.EMPTY);
    }

    public QuestionStickerStructV2(Long l2, Long l3, Long l4, String str, String str2, UrlStructV2 urlStructV2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.question_id = l2;
        this.user_id = l3;
        this.item_id = l4;
        this.content = str;
        this.username = str2;
        this.user_avatar = urlStructV2;
        this.sec_uid = str3;
    }
}

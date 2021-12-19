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

public final class QuestionInfoV2 extends Message<QuestionInfoV2, Builder> {
    public static final ProtoAdapter<QuestionInfoV2> ADAPTER = new ProtoAdapter_QuestionInfoV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long item_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 user_avatar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long user_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String username;

    public QuestionInfoV2() {
    }

    static final class ProtoAdapter_QuestionInfoV2 extends ProtoAdapter<QuestionInfoV2> {
        static {
            Covode.recordClassIndex(102178);
        }

        public ProtoAdapter_QuestionInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, QuestionInfoV2.class);
        }

        public final int encodedSize(QuestionInfoV2 questionInfoV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, questionInfoV2.id) + ProtoAdapter.INT64.encodedSizeWithTag(2, questionInfoV2.item_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, questionInfoV2.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, questionInfoV2.username) + ProtoAdapter.STRING.encodedSizeWithTag(5, questionInfoV2.content) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, questionInfoV2.user_avatar) + questionInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final QuestionInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.item_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.username(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.content(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.user_avatar(UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, QuestionInfoV2 questionInfoV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, questionInfoV2.id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, questionInfoV2.item_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, questionInfoV2.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, questionInfoV2.username);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, questionInfoV2.content);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, questionInfoV2.user_avatar);
            protoWriter.writeBytes(questionInfoV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102176);
    }

    public static final class Builder extends Message.Builder<QuestionInfoV2, Builder> {
        public String content;
        public Long id;
        public Long item_id;
        public UrlStructV2 user_avatar;
        public Long user_id;
        public String username;

        static {
            Covode.recordClassIndex(102177);
        }

        @Override // com.squareup.wire.Message.Builder
        public final QuestionInfoV2 build() {
            return new QuestionInfoV2(this.id, this.item_id, this.user_id, this.username, this.content, this.user_avatar, super.buildUnknownFields());
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder id(Long l2) {
            this.id = l2;
            return this;
        }

        public final Builder item_id(Long l2) {
            this.item_id = l2;
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

    /* Return type fixed from 'com.ss.ugc.aweme.proto.QuestionInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<QuestionInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.item_id = this.item_id;
        builder.user_id = this.user_id;
        builder.username = this.username;
        builder.content = this.content;
        builder.user_avatar = this.user_avatar;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.id;
        int i8 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        Long l3 = this.item_id;
        if (l3 != null) {
            i3 = l3.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        Long l4 = this.user_id;
        if (l4 != null) {
            i4 = l4.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        String str = this.username;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        String str2 = this.content;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        UrlStructV2 urlStructV2 = this.user_avatar;
        if (urlStructV2 != null) {
            i8 = urlStructV2.hashCode();
        }
        int i14 = i13 + i8;
        this.hashCode = i14;
        return i14;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=").append(this.id);
        }
        if (this.item_id != null) {
            sb.append(", item_id=").append(this.item_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=").append(this.user_id);
        }
        if (this.username != null) {
            sb.append(", username=").append(this.username);
        }
        if (this.content != null) {
            sb.append(", content=").append(this.content);
        }
        if (this.user_avatar != null) {
            sb.append(", user_avatar=").append(this.user_avatar);
        }
        return sb.replace(0, 2, "QuestionInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuestionInfoV2)) {
            return false;
        }
        QuestionInfoV2 questionInfoV2 = (QuestionInfoV2) obj;
        if (!unknownFields().equals(questionInfoV2.unknownFields()) || !Internal.equals(this.id, questionInfoV2.id) || !Internal.equals(this.item_id, questionInfoV2.item_id) || !Internal.equals(this.user_id, questionInfoV2.user_id) || !Internal.equals(this.username, questionInfoV2.username) || !Internal.equals(this.content, questionInfoV2.content) || !Internal.equals(this.user_avatar, questionInfoV2.user_avatar)) {
            return false;
        }
        return true;
    }

    public QuestionInfoV2(Long l2, Long l3, Long l4, String str, String str2, UrlStructV2 urlStructV2) {
        this(l2, l3, l4, str, str2, urlStructV2, i.EMPTY);
    }

    public QuestionInfoV2(Long l2, Long l3, Long l4, String str, String str2, UrlStructV2 urlStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.id = l2;
        this.item_id = l3;
        this.user_id = l4;
        this.username = str;
        this.content = str2;
        this.user_avatar = urlStructV2;
    }
}

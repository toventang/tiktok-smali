package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class SetConversationSettingInfoRequestBody extends Message<SetConversationSettingInfoRequestBody, Builder> {
    public static final ProtoAdapter<SetConversationSettingInfoRequestBody> ADAPTER = new ProtoAdapter_SetConversationSettingInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_SET_FAVORITE = false;
    public static final Boolean DEFAULT_SET_MUTE = false;
    public static final Boolean DEFAULT_SET_STICK_ON_TOP = false;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "set_favorite")
    public final Boolean set_favorite;
    @c(a = "set_mute")
    public final Boolean set_mute;
    @c(a = "set_stick_on_top")
    public final Boolean set_stick_on_top;

    static final class ProtoAdapter_SetConversationSettingInfoRequestBody extends ProtoAdapter<SetConversationSettingInfoRequestBody> {
        static {
            Covode.recordClassIndex(23771);
        }

        public ProtoAdapter_SetConversationSettingInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetConversationSettingInfoRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody redact(com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody.ProtoAdapter_SetConversationSettingInfoRequestBody.redact(com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody):com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody");
        }

        public final int encodedSize(SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setConversationSettingInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, setConversationSettingInfoRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, setConversationSettingInfoRequestBody.conversation_type) + ProtoAdapter.BOOL.encodedSizeWithTag(4, setConversationSettingInfoRequestBody.set_stick_on_top) + ProtoAdapter.BOOL.encodedSizeWithTag(5, setConversationSettingInfoRequestBody.set_mute) + ProtoAdapter.BOOL.encodedSizeWithTag(6, setConversationSettingInfoRequestBody.set_favorite) + setConversationSettingInfoRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SetConversationSettingInfoRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.set_stick_on_top(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.set_mute(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.set_favorite(ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setConversationSettingInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setConversationSettingInfoRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setConversationSettingInfoRequestBody.conversation_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, setConversationSettingInfoRequestBody.set_stick_on_top);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, setConversationSettingInfoRequestBody.set_mute);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, setConversationSettingInfoRequestBody.set_favorite);
            protoWriter.writeBytes(setConversationSettingInfoRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<SetConversationSettingInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Boolean set_favorite;
        public Boolean set_mute;
        public Boolean set_stick_on_top;

        static {
            Covode.recordClassIndex(23770);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SetConversationSettingInfoRequestBody build() {
            return new SetConversationSettingInfoRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.set_stick_on_top, this.set_mute, this.set_favorite, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder set_favorite(Boolean bool) {
            this.set_favorite = bool;
            return this;
        }

        public final Builder set_mute(Boolean bool) {
            this.set_mute = bool;
            return this;
        }

        public final Builder set_stick_on_top(Boolean bool) {
            this.set_stick_on_top = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SetConversationSettingInfoRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23769);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SetConversationSettingInfoRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.set_stick_on_top = this.set_stick_on_top;
        builder.set_mute = this.set_mute;
        builder.set_favorite = this.set_favorite;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public SetConversationSettingInfoRequestBody(String str, Long l2, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        this(str, l2, num, bool, bool2, bool3, i.EMPTY);
    }

    public SetConversationSettingInfoRequestBody(String str, Long l2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.set_stick_on_top = bool;
        this.set_mute = bool2;
        this.set_favorite = bool3;
    }
}

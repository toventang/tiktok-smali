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
import com.squareup.wire.internal.Internal;
import java.util.Map;
import k.i;

public final class UpdateConversationParticipantRequestBody extends Message<UpdateConversationParticipantRequestBody, Builder> {
    public static final ProtoAdapter<UpdateConversationParticipantRequestBody> ADAPTER = new ProtoAdapter_UpdateConversationParticipantRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_IS_ALIAS_SET = false;
    public static final Integer DEFAULT_ROLE = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "alias")
    public final String alias;
    @c(a = "biz_ext")
    public final Map<String, String> biz_ext;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "is_alias_set")
    public final Boolean is_alias_set;
    @c(a = "role")
    public final Integer role;
    @c(a = "user_id")
    public final Long user_id;

    static final class ProtoAdapter_UpdateConversationParticipantRequestBody extends ProtoAdapter<UpdateConversationParticipantRequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;

        static {
            Covode.recordClassIndex(23803);
        }

        public ProtoAdapter_UpdateConversationParticipantRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationParticipantRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody redact(com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody.ProtoAdapter_UpdateConversationParticipantRequestBody.redact(com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody):com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody");
        }

        public final int encodedSize(UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateConversationParticipantRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, updateConversationParticipantRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, updateConversationParticipantRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, updateConversationParticipantRequestBody.user_id) + ProtoAdapter.INT32.encodedSizeWithTag(5, updateConversationParticipantRequestBody.role) + ProtoAdapter.STRING.encodedSizeWithTag(6, updateConversationParticipantRequestBody.alias) + ProtoAdapter.BOOL.encodedSizeWithTag(7, updateConversationParticipantRequestBody.is_alias_set) + this.biz_ext.encodedSizeWithTag(11, updateConversationParticipantRequestBody.biz_ext) + updateConversationParticipantRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 11) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 2:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            continue;
                        case 3:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            continue;
                        case 4:
                            builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.role(ProtoAdapter.INT32.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.alias(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.is_alias_set(ProtoAdapter.BOOL.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    builder.biz_ext.putAll(this.biz_ext.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateConversationParticipantRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, updateConversationParticipantRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, updateConversationParticipantRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, updateConversationParticipantRequestBody.user_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, updateConversationParticipantRequestBody.role);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, updateConversationParticipantRequestBody.alias);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, updateConversationParticipantRequestBody.is_alias_set);
            this.biz_ext.encodeWithTag(protoWriter, 11, updateConversationParticipantRequestBody.biz_ext);
            protoWriter.writeBytes(updateConversationParticipantRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<UpdateConversationParticipantRequestBody, Builder> {
        public String alias;
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Boolean is_alias_set;
        public Integer role;
        public Long user_id;

        static {
            Covode.recordClassIndex(23802);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UpdateConversationParticipantRequestBody build() {
            return new UpdateConversationParticipantRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.user_id, this.role, this.alias, this.is_alias_set, this.biz_ext, super.buildUnknownFields());
        }

        public final Builder alias(String str) {
            this.alias = str;
            return this;
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

        public final Builder is_alias_set(Boolean bool) {
            this.is_alias_set = bool;
            return this;
        }

        public final Builder role(Integer num) {
            this.role = num;
            return this;
        }

        public final Builder user_id(Long l2) {
            this.user_id = l2;
            return this;
        }

        public final Builder biz_ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.biz_ext = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "UpdateConversationParticipantRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23801);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UpdateConversationParticipantRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.user_id = this.user_id;
        builder.role = this.role;
        builder.alias = this.alias;
        builder.is_alias_set = this.is_alias_set;
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public UpdateConversationParticipantRequestBody(String str, Long l2, Integer num, Long l3, Integer num2, String str2, Boolean bool, Map<String, String> map) {
        this(str, l2, num, l3, num2, str2, bool, map, i.EMPTY);
    }

    public UpdateConversationParticipantRequestBody(String str, Long l2, Integer num, Long l3, Integer num2, String str2, Boolean bool, Map<String, String> map, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.user_id = l3;
        this.role = num2;
        this.alias = str2;
        this.is_alias_set = bool;
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map);
    }
}

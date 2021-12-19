package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.Map;
import k.i;

public final class SendUserActionRequestBody extends Message<SendUserActionRequestBody, Builder> {
    public static final ProtoAdapter<SendUserActionRequestBody> ADAPTER = new ProtoAdapter_SendUserActionRequestBody();
    public static final UserActionType DEFAULT_ACTION_TYPE = UserActionType.ENTER_CONVERSATION;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @c(a = "action_type")
    public final UserActionType action_type;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "extra")
    public final Map<String, String> extra;

    static final class ProtoAdapter_SendUserActionRequestBody extends ProtoAdapter<SendUserActionRequestBody> {
        private final ProtoAdapter<Map<String, String>> extra;

        static {
            Covode.recordClassIndex(23759);
        }

        public ProtoAdapter_SendUserActionRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendUserActionRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.extra = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.SendUserActionRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.SendUserActionRequestBody redact(com.bytedance.im.core.proto.SendUserActionRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.SendUserActionRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.SendUserActionRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.SendUserActionRequestBody.ProtoAdapter_SendUserActionRequestBody.redact(com.bytedance.im.core.proto.SendUserActionRequestBody):com.bytedance.im.core.proto.SendUserActionRequestBody");
        }

        public final int encodedSize(SendUserActionRequestBody sendUserActionRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sendUserActionRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendUserActionRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, sendUserActionRequestBody.conversation_short_id) + UserActionType.ADAPTER.encodedSizeWithTag(4, sendUserActionRequestBody.action_type) + this.extra.encodedSizeWithTag(5, sendUserActionRequestBody.extra) + sendUserActionRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendUserActionRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    try {
                        builder.action_type(UserActionType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.extra.putAll(this.extra.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SendUserActionRequestBody sendUserActionRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendUserActionRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendUserActionRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, sendUserActionRequestBody.conversation_short_id);
            UserActionType.ADAPTER.encodeWithTag(protoWriter, 4, sendUserActionRequestBody.action_type);
            this.extra.encodeWithTag(protoWriter, 5, sendUserActionRequestBody.extra);
            protoWriter.writeBytes(sendUserActionRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<SendUserActionRequestBody, Builder> {
        public UserActionType action_type;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> extra = Internal.newMutableMap();

        static {
            Covode.recordClassIndex(23758);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SendUserActionRequestBody build() {
            return new SendUserActionRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.action_type, this.extra, super.buildUnknownFields());
        }

        public final Builder action_type(UserActionType userActionType) {
            this.action_type = userActionType;
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

        public final Builder extra(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.extra = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23757);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SendUserActionRequestBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SendUserActionRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SendUserActionRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.action_type = this.action_type;
        builder.extra = Internal.copyOf("extra", this.extra);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public SendUserActionRequestBody(String str, Integer num, Long l2, UserActionType userActionType, Map<String, String> map) {
        this(str, num, l2, userActionType, map, i.EMPTY);
    }

    public SendUserActionRequestBody(String str, Integer num, Long l2, UserActionType userActionType, Map<String, String> map, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.action_type = userActionType;
        this.extra = Internal.immutableCopyOf("extra", map);
    }
}

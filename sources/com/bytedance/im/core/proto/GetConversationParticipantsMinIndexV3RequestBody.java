package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class GetConversationParticipantsMinIndexV3RequestBody extends Message<GetConversationParticipantsMinIndexV3RequestBody, Builder> {
    public static final ProtoAdapter<GetConversationParticipantsMinIndexV3RequestBody> ADAPTER = new ProtoAdapter_GetConversationParticipantsMinIndexV3RequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;

    static final class ProtoAdapter_GetConversationParticipantsMinIndexV3RequestBody extends ProtoAdapter<GetConversationParticipantsMinIndexV3RequestBody> {
        static {
            Covode.recordClassIndex(23453);
        }

        public ProtoAdapter_GetConversationParticipantsMinIndexV3RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsMinIndexV3RequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody redact(com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody.ProtoAdapter_GetConversationParticipantsMinIndexV3RequestBody.redact(com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody):com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody");
        }

        public final int encodedSize(GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationParticipantsMinIndexV3RequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationParticipantsMinIndexV3RequestBody.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, getConversationParticipantsMinIndexV3RequestBody.conversation_id) + getConversationParticipantsMinIndexV3RequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationParticipantsMinIndexV3RequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationParticipantsMinIndexV3RequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationParticipantsMinIndexV3RequestBody.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getConversationParticipantsMinIndexV3RequestBody.conversation_id);
            protoWriter.writeBytes(getConversationParticipantsMinIndexV3RequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationParticipantsMinIndexV3RequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        static {
            Covode.recordClassIndex(23452);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationParticipantsMinIndexV3RequestBody build() {
            return new GetConversationParticipantsMinIndexV3RequestBody(this.conversation_short_id, this.conversation_type, this.conversation_id, super.buildUnknownFields());
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
    }

    static {
        Covode.recordClassIndex(23451);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationParticipantsMinIndexV3RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_id = this.conversation_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationParticipantsMinIndexV3RequestBody" + h.f38770a.b(this).toString();
    }

    public GetConversationParticipantsMinIndexV3RequestBody(Long l2, Integer num, String str) {
        this(l2, num, str, i.EMPTY);
    }

    public GetConversationParticipantsMinIndexV3RequestBody(Long l2, Integer num, String str, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.conversation_id = str;
    }
}

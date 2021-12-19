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

public final class GetConversationParticipantsReadIndexV3RequestBody extends Message<GetConversationParticipantsReadIndexV3RequestBody, Builder> {
    public static final ProtoAdapter<GetConversationParticipantsReadIndexV3RequestBody> ADAPTER = new ProtoAdapter_GetConversationParticipantsReadIndexV3RequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;

    static final class ProtoAdapter_GetConversationParticipantsReadIndexV3RequestBody extends ProtoAdapter<GetConversationParticipantsReadIndexV3RequestBody> {
        static {
            Covode.recordClassIndex(23459);
        }

        public ProtoAdapter_GetConversationParticipantsReadIndexV3RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsReadIndexV3RequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody redact(com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody.ProtoAdapter_GetConversationParticipantsReadIndexV3RequestBody.redact(com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody):com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody");
        }

        public final int encodedSize(GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationParticipantsReadIndexV3RequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationParticipantsReadIndexV3RequestBody.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, getConversationParticipantsReadIndexV3RequestBody.conversation_id) + getConversationParticipantsReadIndexV3RequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationParticipantsReadIndexV3RequestBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationParticipantsReadIndexV3RequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationParticipantsReadIndexV3RequestBody.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getConversationParticipantsReadIndexV3RequestBody.conversation_id);
            protoWriter.writeBytes(getConversationParticipantsReadIndexV3RequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationParticipantsReadIndexV3RequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        static {
            Covode.recordClassIndex(23458);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationParticipantsReadIndexV3RequestBody build() {
            return new GetConversationParticipantsReadIndexV3RequestBody(this.conversation_short_id, this.conversation_type, this.conversation_id, super.buildUnknownFields());
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
        Covode.recordClassIndex(23457);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationParticipantsReadIndexV3RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_id = this.conversation_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationParticipantsReadIndexV3RequestBody" + h.f38770a.b(this).toString();
    }

    public GetConversationParticipantsReadIndexV3RequestBody(Long l2, Integer num, String str) {
        this(l2, num, str, i.EMPTY);
    }

    public GetConversationParticipantsReadIndexV3RequestBody(Long l2, Integer num, String str, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.conversation_id = str;
    }
}

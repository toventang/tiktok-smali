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

public final class GetTicketRequestBody extends Message<GetTicketRequestBody, Builder> {
    public static final ProtoAdapter<GetTicketRequestBody> ADAPTER = new ProtoAdapter_GetTicketRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final ConversationType DEFAULT_CONVERSATION_TYPE = ConversationType.ONE_TO_ONE_CHAT;
    public static final Integer DEFAULT_CUSTOMED_CONVERSATION_TYPE = 0;
    public static final TicketType DEFAULT_TICKET_TYPE = TicketType.TICKET_TYPE_APP;
    public static final Long DEFAULT_TO_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final ConversationType conversation_type;
    @c(a = "customed_conversation_type")
    public final Integer customed_conversation_type;
    @c(a = "ext")
    public final Map<String, String> ext;
    @c(a = "ticket_type")
    public final TicketType ticket_type;
    @c(a = "to_id")
    public final Long to_id;

    static final class ProtoAdapter_GetTicketRequestBody extends ProtoAdapter<GetTicketRequestBody> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23519);
        }

        public ProtoAdapter_GetTicketRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTicketRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetTicketRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetTicketRequestBody redact(com.bytedance.im.core.proto.GetTicketRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetTicketRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetTicketRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetTicketRequestBody.ProtoAdapter_GetTicketRequestBody.redact(com.bytedance.im.core.proto.GetTicketRequestBody):com.bytedance.im.core.proto.GetTicketRequestBody");
        }

        public final int encodedSize(GetTicketRequestBody getTicketRequestBody) {
            return TicketType.ADAPTER.encodedSizeWithTag(1, getTicketRequestBody.ticket_type) + ConversationType.ADAPTER.encodedSizeWithTag(2, getTicketRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, getTicketRequestBody.to_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, getTicketRequestBody.conversation_short_id) + this.ext.encodedSizeWithTag(10, getTicketRequestBody.ext) + ProtoAdapter.INT32.encodedSizeWithTag(6, getTicketRequestBody.customed_conversation_type) + getTicketRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetTicketRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.ticket_type(TicketType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        builder.conversation_type(ConversationType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                } else if (nextTag == 4) {
                    builder.to_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 5) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 6) {
                    builder.customed_conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 10) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.ext.putAll(this.ext.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetTicketRequestBody getTicketRequestBody) {
            TicketType.ADAPTER.encodeWithTag(protoWriter, 1, getTicketRequestBody.ticket_type);
            ConversationType.ADAPTER.encodeWithTag(protoWriter, 2, getTicketRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getTicketRequestBody.to_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, getTicketRequestBody.conversation_short_id);
            this.ext.encodeWithTag(protoWriter, 10, getTicketRequestBody.ext);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getTicketRequestBody.customed_conversation_type);
            protoWriter.writeBytes(getTicketRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetTicketRequestBody, Builder> {
        public Long conversation_short_id;
        public ConversationType conversation_type;
        public Integer customed_conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();
        public TicketType ticket_type;
        public Long to_id;

        static {
            Covode.recordClassIndex(23518);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetTicketRequestBody build() {
            return new GetTicketRequestBody(this.ticket_type, this.conversation_type, this.to_id, this.conversation_short_id, this.ext, this.customed_conversation_type, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder conversation_type(ConversationType conversationType) {
            this.conversation_type = conversationType;
            return this;
        }

        public final Builder customed_conversation_type(Integer num) {
            this.customed_conversation_type = num;
            return this;
        }

        public final Builder ticket_type(TicketType ticketType) {
            this.ticket_type = ticketType;
            return this;
        }

        public final Builder to_id(Long l2) {
            this.to_id = l2;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetTicketRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23517);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetTicketRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetTicketRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.ticket_type = this.ticket_type;
        builder.conversation_type = this.conversation_type;
        builder.to_id = this.to_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.customed_conversation_type = this.customed_conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public GetTicketRequestBody(TicketType ticketType, ConversationType conversationType, Long l2, Long l3, Map<String, String> map, Integer num) {
        this(ticketType, conversationType, l2, l3, map, num, i.EMPTY);
    }

    public GetTicketRequestBody(TicketType ticketType, ConversationType conversationType, Long l2, Long l3, Map<String, String> map, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.ticket_type = ticketType;
        this.conversation_type = conversationType;
        this.to_id = l2;
        this.conversation_short_id = l3;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.customed_conversation_type = num;
    }
}

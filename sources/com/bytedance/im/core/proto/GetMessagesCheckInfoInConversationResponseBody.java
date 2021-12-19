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
import java.util.List;
import k.i;

public final class GetMessagesCheckInfoInConversationResponseBody extends Message<GetMessagesCheckInfoInConversationResponseBody, Builder> {
    public static final ProtoAdapter<GetMessagesCheckInfoInConversationResponseBody> ADAPTER = new ProtoAdapter_GetMessagesCheckInfoInConversationResponseBody();
    public static final Long DEFAULT_CURSOR_REVERSE_NEXT = 0L;
    public static final Integer DEFAULT_REAL_MSG_TOTAL_COUNT = 0;
    private static final long serialVersionUID = 0;
    @c(a = "cursor_reverse_next")
    public final Long cursor_reverse_next;
    @c(a = "msgs_checkinfo_list")
    public final List<MessagesCheckInfo> msgs_checkinfo_list;
    @c(a = "real_msg_total_count")
    public final Integer real_msg_total_count;

    static final class ProtoAdapter_GetMessagesCheckInfoInConversationResponseBody extends ProtoAdapter<GetMessagesCheckInfoInConversationResponseBody> {
        static {
            Covode.recordClassIndex(23492);
        }

        public ProtoAdapter_GetMessagesCheckInfoInConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessagesCheckInfoInConversationResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody redact(com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessagesCheckInfo> r1 = r2.msgs_checkinfo_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessagesCheckInfo> r0 = com.bytedance.im.core.proto.MessagesCheckInfo.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody.ProtoAdapter_GetMessagesCheckInfoInConversationResponseBody.redact(com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody):com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody");
        }

        public final int encodedSize(GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
            return MessagesCheckInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessagesCheckInfoInConversationResponseBody.msgs_checkinfo_list) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessagesCheckInfoInConversationResponseBody.real_msg_total_count) + ProtoAdapter.INT64.encodedSizeWithTag(4, getMessagesCheckInfoInConversationResponseBody.cursor_reverse_next) + getMessagesCheckInfoInConversationResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagesCheckInfoInConversationResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.msgs_checkinfo_list.add(MessagesCheckInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.real_msg_total_count(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cursor_reverse_next(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
            MessagesCheckInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMessagesCheckInfoInConversationResponseBody.msgs_checkinfo_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessagesCheckInfoInConversationResponseBody.real_msg_total_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getMessagesCheckInfoInConversationResponseBody.cursor_reverse_next);
            protoWriter.writeBytes(getMessagesCheckInfoInConversationResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetMessagesCheckInfoInConversationResponseBody, Builder> {
        public Long cursor_reverse_next;
        public List<MessagesCheckInfo> msgs_checkinfo_list = Internal.newMutableList();
        public Integer real_msg_total_count;

        static {
            Covode.recordClassIndex(23491);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetMessagesCheckInfoInConversationResponseBody build() {
            return new GetMessagesCheckInfoInConversationResponseBody(this.msgs_checkinfo_list, this.real_msg_total_count, this.cursor_reverse_next, super.buildUnknownFields());
        }

        public final Builder cursor_reverse_next(Long l2) {
            this.cursor_reverse_next = l2;
            return this;
        }

        public final Builder real_msg_total_count(Integer num) {
            this.real_msg_total_count = num;
            return this;
        }

        public final Builder msgs_checkinfo_list(List<MessagesCheckInfo> list) {
            Internal.checkElementsNotNull(list);
            this.msgs_checkinfo_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23490);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetMessagesCheckInfoInConversationResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.msgs_checkinfo_list = Internal.copyOf("msgs_checkinfo_list", this.msgs_checkinfo_list);
        builder.real_msg_total_count = this.real_msg_total_count;
        builder.cursor_reverse_next = this.cursor_reverse_next;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetMessagesCheckInfoInConversationResponseBody" + h.f38770a.b(this).toString();
    }

    public GetMessagesCheckInfoInConversationResponseBody(List<MessagesCheckInfo> list, Integer num, Long l2) {
        this(list, num, l2, i.EMPTY);
    }

    public GetMessagesCheckInfoInConversationResponseBody(List<MessagesCheckInfo> list, Integer num, Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.msgs_checkinfo_list = Internal.immutableCopyOf("msgs_checkinfo_list", list);
        this.real_msg_total_count = num;
        this.cursor_reverse_next = l2;
    }
}

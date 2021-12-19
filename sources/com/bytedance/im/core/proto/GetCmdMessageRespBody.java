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

public final class GetCmdMessageRespBody extends Message<GetCmdMessageRespBody, Builder> {
    public static final ProtoAdapter<GetCmdMessageRespBody> ADAPTER = new ProtoAdapter_GetCmdMessageRespBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CMD_INDEX = 0L;
    public static final Long DEFAULT_NEXT_USER_MESSAGE_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "has_more")
    public final Boolean has_more;
    @c(a = "messages")
    public final List<MessageBody> messages;
    @c(a = "next_cmd_index")
    public final Long next_cmd_index;
    @c(a = "next_user_message_cursor")
    public final Long next_user_message_cursor;

    static final class ProtoAdapter_GetCmdMessageRespBody extends ProtoAdapter<GetCmdMessageRespBody> {
        static {
            Covode.recordClassIndex(23405);
        }

        public ProtoAdapter_GetCmdMessageRespBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCmdMessageRespBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetCmdMessageRespBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetCmdMessageRespBody redact(com.bytedance.im.core.proto.GetCmdMessageRespBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetCmdMessageRespBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetCmdMessageRespBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetCmdMessageRespBody.ProtoAdapter_GetCmdMessageRespBody.redact(com.bytedance.im.core.proto.GetCmdMessageRespBody):com.bytedance.im.core.proto.GetCmdMessageRespBody");
        }

        public final int encodedSize(GetCmdMessageRespBody getCmdMessageRespBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getCmdMessageRespBody.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getCmdMessageRespBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, getCmdMessageRespBody.next_cmd_index) + ProtoAdapter.INT64.encodedSizeWithTag(4, getCmdMessageRespBody.next_user_message_cursor) + getCmdMessageRespBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetCmdMessageRespBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.next_cmd_index(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.next_user_message_cursor(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetCmdMessageRespBody getCmdMessageRespBody) {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCmdMessageRespBody.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getCmdMessageRespBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getCmdMessageRespBody.next_cmd_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getCmdMessageRespBody.next_user_message_cursor);
            protoWriter.writeBytes(getCmdMessageRespBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23403);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetCmdMessageRespBody" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<GetCmdMessageRespBody, Builder> {
        public Boolean has_more;
        public List<MessageBody> messages = Internal.newMutableList();
        public Long next_cmd_index;
        public Long next_user_message_cursor;

        static {
            Covode.recordClassIndex(23404);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetCmdMessageRespBody build() {
            Boolean bool = this.has_more;
            if (bool != null) {
                return new GetCmdMessageRespBody(this.messages, this.has_more, this.next_cmd_index, this.next_user_message_cursor, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_more");
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cmd_index(Long l2) {
            this.next_cmd_index = l2;
            return this;
        }

        public final Builder next_user_message_cursor(Long l2) {
            this.next_user_message_cursor = l2;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetCmdMessageRespBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetCmdMessageRespBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.has_more = this.has_more;
        builder.next_cmd_index = this.next_cmd_index;
        builder.next_user_message_cursor = this.next_user_message_cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public GetCmdMessageRespBody(List<MessageBody> list, Boolean bool, Long l2, Long l3) {
        this(list, bool, l2, l3, i.EMPTY);
    }

    public GetCmdMessageRespBody(List<MessageBody> list, Boolean bool, Long l2, Long l3, i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.has_more = bool;
        this.next_cmd_index = l2;
        this.next_user_message_cursor = l3;
    }
}

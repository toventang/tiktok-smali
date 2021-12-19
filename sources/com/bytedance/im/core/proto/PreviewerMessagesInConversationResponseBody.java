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
import java.util.List;
import k.i;

public final class PreviewerMessagesInConversationResponseBody extends Message<PreviewerMessagesInConversationResponseBody, Builder> {
    public static final ProtoAdapter<PreviewerMessagesInConversationResponseBody> ADAPTER = new ProtoAdapter_PreviewerMessagesInConversationResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "has_more")
    public final Boolean has_more;
    @c(a = "messages")
    public final List<MessageBody> messages;
    @c(a = "next_cursor")
    public final Long next_cursor;
    @c(a = "status")
    public final Integer status;

    static final class ProtoAdapter_PreviewerMessagesInConversationResponseBody extends ProtoAdapter<PreviewerMessagesInConversationResponseBody> {
        static {
            Covode.recordClassIndex(23688);
        }

        public ProtoAdapter_PreviewerMessagesInConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, PreviewerMessagesInConversationResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody redact(com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody.ProtoAdapter_PreviewerMessagesInConversationResponseBody.redact(com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody):com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody");
        }

        public final int encodedSize(PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerMessagesInConversationResponseBody.messages) + ProtoAdapter.INT64.encodedSizeWithTag(2, previewerMessagesInConversationResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, previewerMessagesInConversationResponseBody.has_more) + ProtoAdapter.INT32.encodedSizeWithTag(4, previewerMessagesInConversationResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(5, previewerMessagesInConversationResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(6, previewerMessagesInConversationResponseBody.check_message) + previewerMessagesInConversationResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerMessagesInConversationResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.check_message(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody) {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, previewerMessagesInConversationResponseBody.messages);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, previewerMessagesInConversationResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, previewerMessagesInConversationResponseBody.has_more);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, previewerMessagesInConversationResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, previewerMessagesInConversationResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, previewerMessagesInConversationResponseBody.check_message);
            protoWriter.writeBytes(previewerMessagesInConversationResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<PreviewerMessagesInConversationResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public Boolean has_more;
        public List<MessageBody> messages = Internal.newMutableList();
        public Long next_cursor;
        public Integer status;

        static {
            Covode.recordClassIndex(23687);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PreviewerMessagesInConversationResponseBody build() {
            return new PreviewerMessagesInConversationResponseBody(this.messages, this.next_cursor, this.has_more, this.status, this.check_code, this.check_message, super.buildUnknownFields());
        }

        public final Builder check_code(Long l2) {
            this.check_code = l2;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l2) {
            this.next_cursor = l2;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "PreviewerMessagesInConversationResponseBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23686);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PreviewerMessagesInConversationResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public PreviewerMessagesInConversationResponseBody(List<MessageBody> list, Long l2, Boolean bool, Integer num, Long l3, String str) {
        this(list, l2, bool, num, l3, str, i.EMPTY);
    }

    public PreviewerMessagesInConversationResponseBody(List<MessageBody> list, Long l2, Boolean bool, Integer num, Long l3, String str, i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.next_cursor = l2;
        this.has_more = bool;
        this.status = num;
        this.check_code = l3;
        this.check_message = str;
    }
}

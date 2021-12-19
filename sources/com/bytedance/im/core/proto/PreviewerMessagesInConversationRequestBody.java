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

public final class PreviewerMessagesInConversationRequestBody extends Message<PreviewerMessagesInConversationRequestBody, Builder> {
    public static final ProtoAdapter<PreviewerMessagesInConversationRequestBody> ADAPTER = new ProtoAdapter_PreviewerMessagesInConversationRequestBody();
    public static final Long DEFAULT_ANCHOR_INDEX = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final MessageDirection DEFAULT_DIRECTION = MessageDirection.OLDER;
    public static final Integer DEFAULT_LIMIT = 50;
    private static final long serialVersionUID = 0;
    @c(a = "anchor_index")
    public final Long anchor_index;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "direction")
    public final MessageDirection direction;
    @c(a = "limit")
    public final Integer limit;

    static final class ProtoAdapter_PreviewerMessagesInConversationRequestBody extends ProtoAdapter<PreviewerMessagesInConversationRequestBody> {
        static {
            Covode.recordClassIndex(23685);
        }

        public ProtoAdapter_PreviewerMessagesInConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, PreviewerMessagesInConversationRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody redact(com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody.ProtoAdapter_PreviewerMessagesInConversationRequestBody.redact(com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody):com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody");
        }

        public final int encodedSize(PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, previewerMessagesInConversationRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, previewerMessagesInConversationRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, previewerMessagesInConversationRequestBody.conversation_short_id) + MessageDirection.ADAPTER.encodedSizeWithTag(4, previewerMessagesInConversationRequestBody.direction) + ProtoAdapter.INT64.encodedSizeWithTag(5, previewerMessagesInConversationRequestBody.anchor_index) + ProtoAdapter.INT32.encodedSizeWithTag(6, previewerMessagesInConversationRequestBody.limit) + previewerMessagesInConversationRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerMessagesInConversationRequestBody decode(ProtoReader protoReader) {
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
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.direction(MessageDirection.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.anchor_index(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.limit(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, previewerMessagesInConversationRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, previewerMessagesInConversationRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, previewerMessagesInConversationRequestBody.conversation_short_id);
            MessageDirection.ADAPTER.encodeWithTag(protoWriter, 4, previewerMessagesInConversationRequestBody.direction);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, previewerMessagesInConversationRequestBody.anchor_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, previewerMessagesInConversationRequestBody.limit);
            protoWriter.writeBytes(previewerMessagesInConversationRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<PreviewerMessagesInConversationRequestBody, Builder> {
        public Long anchor_index;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public MessageDirection direction;
        public Integer limit;

        static {
            Covode.recordClassIndex(23684);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PreviewerMessagesInConversationRequestBody build() {
            return new PreviewerMessagesInConversationRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.direction, this.anchor_index, this.limit, super.buildUnknownFields());
        }

        public final Builder anchor_index(Long l2) {
            this.anchor_index = l2;
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

        public final Builder direction(MessageDirection messageDirection) {
            this.direction = messageDirection;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "PreviewerMessagesInConversationRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23683);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PreviewerMessagesInConversationRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.direction = this.direction;
        builder.anchor_index = this.anchor_index;
        builder.limit = this.limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public PreviewerMessagesInConversationRequestBody(String str, Integer num, Long l2, MessageDirection messageDirection, Long l3, Integer num2) {
        this(str, num, l2, messageDirection, l3, num2, i.EMPTY);
    }

    public PreviewerMessagesInConversationRequestBody(String str, Integer num, Long l2, MessageDirection messageDirection, Long l3, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.direction = messageDirection;
        this.anchor_index = l3;
        this.limit = num2;
    }
}

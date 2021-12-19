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
import k.i;

public final class GetMessageInfoByIndexV2RangeRequestBody extends Message<GetMessageInfoByIndexV2RangeRequestBody, Builder> {
    public static final ProtoAdapter<GetMessageInfoByIndexV2RangeRequestBody> ADAPTER = new ProtoAdapter_GetMessageInfoByIndexV2RangeRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final MessageDirection DEFAULT_DIRECTION = MessageDirection.OLDER;
    public static final Long DEFAULT_MAX_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Long DEFAULT_MIN_INDEX_IN_CONVERSATION_V2 = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "direction")
    public final MessageDirection direction;
    @c(a = "max_index_in_conversation_v2")
    public final Long max_index_in_conversation_v2;
    @c(a = "min_index_in_conversation_v2")
    public final Long min_index_in_conversation_v2;

    static final class ProtoAdapter_GetMessageInfoByIndexV2RangeRequestBody extends ProtoAdapter<GetMessageInfoByIndexV2RangeRequestBody> {
        static {
            Covode.recordClassIndex(23477);
        }

        public ProtoAdapter_GetMessageInfoByIndexV2RangeRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageInfoByIndexV2RangeRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody redact(com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody.ProtoAdapter_GetMessageInfoByIndexV2RangeRequestBody.redact(com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody):com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody");
        }

        public final int encodedSize(GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageInfoByIndexV2RangeRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageInfoByIndexV2RangeRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMessageInfoByIndexV2RangeRequestBody.conversation_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, getMessageInfoByIndexV2RangeRequestBody.min_index_in_conversation_v2) + ProtoAdapter.INT64.encodedSizeWithTag(5, getMessageInfoByIndexV2RangeRequestBody.max_index_in_conversation_v2) + MessageDirection.ADAPTER.encodedSizeWithTag(6, getMessageInfoByIndexV2RangeRequestBody.direction) + getMessageInfoByIndexV2RangeRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageInfoByIndexV2RangeRequestBody decode(ProtoReader protoReader) {
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
                            builder.min_index_in_conversation_v2(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.max_index_in_conversation_v2(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            try {
                                builder.direction(MessageDirection.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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

        public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2RangeRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageInfoByIndexV2RangeRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMessageInfoByIndexV2RangeRequestBody.conversation_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getMessageInfoByIndexV2RangeRequestBody.min_index_in_conversation_v2);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, getMessageInfoByIndexV2RangeRequestBody.max_index_in_conversation_v2);
            MessageDirection.ADAPTER.encodeWithTag(protoWriter, 6, getMessageInfoByIndexV2RangeRequestBody.direction);
            protoWriter.writeBytes(getMessageInfoByIndexV2RangeRequestBody.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetMessageInfoByIndexV2RangeRequestBody" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<GetMessageInfoByIndexV2RangeRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public MessageDirection direction;
        public Long max_index_in_conversation_v2;
        public Long min_index_in_conversation_v2;

        static {
            Covode.recordClassIndex(23476);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetMessageInfoByIndexV2RangeRequestBody build() {
            Long l2 = this.min_index_in_conversation_v2;
            if (l2 != null && this.max_index_in_conversation_v2 != null) {
                return new GetMessageInfoByIndexV2RangeRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.min_index_in_conversation_v2, this.max_index_in_conversation_v2, this.direction, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "min_index_in_conversation_v2", this.max_index_in_conversation_v2, "max_index_in_conversation_v2");
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

        public final Builder max_index_in_conversation_v2(Long l2) {
            this.max_index_in_conversation_v2 = l2;
            return this;
        }

        public final Builder min_index_in_conversation_v2(Long l2) {
            this.min_index_in_conversation_v2 = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23475);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetMessageInfoByIndexV2RangeRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.min_index_in_conversation_v2 = this.min_index_in_conversation_v2;
        builder.max_index_in_conversation_v2 = this.max_index_in_conversation_v2;
        builder.direction = this.direction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public GetMessageInfoByIndexV2RangeRequestBody(String str, Integer num, Long l2, Long l3, Long l4, MessageDirection messageDirection) {
        this(str, num, l2, l3, l4, messageDirection, i.EMPTY);
    }

    public GetMessageInfoByIndexV2RangeRequestBody(String str, Integer num, Long l2, Long l3, Long l4, MessageDirection messageDirection, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.min_index_in_conversation_v2 = l3;
        this.max_index_in_conversation_v2 = l4;
        this.direction = messageDirection;
    }
}

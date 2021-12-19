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

public final class GetMessageInfoByIndexV2RequestBody extends Message<GetMessageInfoByIndexV2RequestBody, Builder> {
    public static final ProtoAdapter<GetMessageInfoByIndexV2RequestBody> ADAPTER = new ProtoAdapter_GetMessageInfoByIndexV2RequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "index_in_conversation_v2")
    public final List<Long> index_in_conversation_v2;

    static final class ProtoAdapter_GetMessageInfoByIndexV2RequestBody extends ProtoAdapter<GetMessageInfoByIndexV2RequestBody> {
        static {
            Covode.recordClassIndex(23483);
        }

        public ProtoAdapter_GetMessageInfoByIndexV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageInfoByIndexV2RequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody redact(com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody.ProtoAdapter_GetMessageInfoByIndexV2RequestBody.redact(com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody):com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody");
        }

        public final int encodedSize(GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageInfoByIndexV2RequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageInfoByIndexV2RequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMessageInfoByIndexV2RequestBody.conversation_short_id) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(4, getMessageInfoByIndexV2RequestBody.index_in_conversation_v2) + getMessageInfoByIndexV2RequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageInfoByIndexV2RequestBody decode(ProtoReader protoReader) {
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
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.index_in_conversation_v2.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2RequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageInfoByIndexV2RequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMessageInfoByIndexV2RequestBody.conversation_short_id);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 4, getMessageInfoByIndexV2RequestBody.index_in_conversation_v2);
            protoWriter.writeBytes(getMessageInfoByIndexV2RequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetMessageInfoByIndexV2RequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<Long> index_in_conversation_v2 = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23482);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetMessageInfoByIndexV2RequestBody build() {
            return new GetMessageInfoByIndexV2RequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.index_in_conversation_v2, super.buildUnknownFields());
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

        public final Builder index_in_conversation_v2(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.index_in_conversation_v2 = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23481);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetMessageInfoByIndexV2RequestBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetMessageInfoByIndexV2RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.index_in_conversation_v2 = Internal.copyOf("index_in_conversation_v2", this.index_in_conversation_v2);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public GetMessageInfoByIndexV2RequestBody(String str, Integer num, Long l2, List<Long> list) {
        this(str, num, l2, list, i.EMPTY);
    }

    public GetMessageInfoByIndexV2RequestBody(String str, Integer num, Long l2, List<Long> list, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.index_in_conversation_v2 = Internal.immutableCopyOf("index_in_conversation_v2", list);
    }
}

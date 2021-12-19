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

public final class MarkConversationReadNotify extends Message<MarkConversationReadNotify, Builder> {
    public static final ProtoAdapter<MarkConversationReadNotify> ADAPTER = new ProtoAdapter_MarkConversationReadNotify();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_READ_INDEX = 0L;
    public static final Long DEFAULT_READ_INDEX_V2 = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "read_index")
    public final Long read_index;
    @c(a = "read_index_v2")
    public final Long read_index_v2;

    static final class ProtoAdapter_MarkConversationReadNotify extends ProtoAdapter<MarkConversationReadNotify> {
        static {
            Covode.recordClassIndex(23546);
        }

        public ProtoAdapter_MarkConversationReadNotify() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkConversationReadNotify.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkConversationReadNotify$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MarkConversationReadNotify redact(com.bytedance.im.core.proto.MarkConversationReadNotify r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkConversationReadNotify$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkConversationReadNotify r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MarkConversationReadNotify.ProtoAdapter_MarkConversationReadNotify.redact(com.bytedance.im.core.proto.MarkConversationReadNotify):com.bytedance.im.core.proto.MarkConversationReadNotify");
        }

        public final int encodedSize(MarkConversationReadNotify markConversationReadNotify) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, markConversationReadNotify.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, markConversationReadNotify.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, markConversationReadNotify.read_index) + ProtoAdapter.INT64.encodedSizeWithTag(4, markConversationReadNotify.read_index_v2) + markConversationReadNotify.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkConversationReadNotify decode(ProtoReader protoReader) {
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
                    builder.read_index(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.read_index_v2(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MarkConversationReadNotify markConversationReadNotify) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markConversationReadNotify.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markConversationReadNotify.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, markConversationReadNotify.read_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, markConversationReadNotify.read_index_v2);
            protoWriter.writeBytes(markConversationReadNotify.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MarkConversationReadNotify, Builder> {
        public String conversation_id;
        public Integer conversation_type;
        public Long read_index;
        public Long read_index_v2;

        static {
            Covode.recordClassIndex(23545);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkConversationReadNotify build() {
            return new MarkConversationReadNotify(this.conversation_id, this.conversation_type, this.read_index, this.read_index_v2, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder read_index(Long l2) {
            this.read_index = l2;
            return this;
        }

        public final Builder read_index_v2(Long l2) {
            this.read_index_v2 = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23544);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkConversationReadNotify$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkConversationReadNotify, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.read_index = this.read_index;
        builder.read_index_v2 = this.read_index_v2;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkConversationReadNotify" + h.f38770a.b(this).toString();
    }

    public MarkConversationReadNotify(String str, Integer num, Long l2, Long l3) {
        this(str, num, l2, l3, i.EMPTY);
    }

    public MarkConversationReadNotify(String str, Integer num, Long l2, Long l3, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.read_index = l2;
        this.read_index_v2 = l3;
    }
}

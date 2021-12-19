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

public final class ConversationsPerUserByFavoriteV2RequestBody extends Message<ConversationsPerUserByFavoriteV2RequestBody, Builder> {
    public static final ProtoAdapter<ConversationsPerUserByFavoriteV2RequestBody> ADAPTER = new ProtoAdapter_ConversationsPerUserByFavoriteV2RequestBody();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 500;
    private static final long serialVersionUID = 0;
    @c(a = "cursor")
    public final Long cursor;
    @c(a = "limit")
    public final Integer limit;

    static final class ProtoAdapter_ConversationsPerUserByFavoriteV2RequestBody extends ProtoAdapter<ConversationsPerUserByFavoriteV2RequestBody> {
        static {
            Covode.recordClassIndex(23353);
        }

        public ProtoAdapter_ConversationsPerUserByFavoriteV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationsPerUserByFavoriteV2RequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody redact(com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody.ProtoAdapter_ConversationsPerUserByFavoriteV2RequestBody.redact(com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody):com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody");
        }

        public final int encodedSize(ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationsPerUserByFavoriteV2RequestBody.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationsPerUserByFavoriteV2RequestBody.limit) + conversationsPerUserByFavoriteV2RequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationsPerUserByFavoriteV2RequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.limit(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationsPerUserByFavoriteV2RequestBody.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationsPerUserByFavoriteV2RequestBody.limit);
            protoWriter.writeBytes(conversationsPerUserByFavoriteV2RequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ConversationsPerUserByFavoriteV2RequestBody, Builder> {
        public Long cursor;
        public Integer limit;

        static {
            Covode.recordClassIndex(23352);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationsPerUserByFavoriteV2RequestBody build() {
            return new ConversationsPerUserByFavoriteV2RequestBody(this.cursor, this.limit, super.buildUnknownFields());
        }

        public final Builder cursor(Long l2) {
            this.cursor = l2;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23351);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationsPerUserByFavoriteV2RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationsPerUserByFavoriteV2RequestBody" + h.f38770a.b(this).toString();
    }

    public ConversationsPerUserByFavoriteV2RequestBody(Long l2, Integer num) {
        this(l2, num, i.EMPTY);
    }

    public ConversationsPerUserByFavoriteV2RequestBody(Long l2, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.cursor = l2;
        this.limit = num;
    }
}

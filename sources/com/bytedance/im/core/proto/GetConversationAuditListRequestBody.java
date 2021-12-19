package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.proto.RequestBody;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class GetConversationAuditListRequestBody extends Message<GetConversationAuditListRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationAuditListRequestBody> ADAPTER;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 0;
    public static final Boolean DEFAULT_NO_CLEAR_UNREAD = false;
    private static final long serialVersionUID = 0;
    @c(a = "conv_short_id")
    public final Long conv_short_id;
    @c(a = "cursor")
    public final Long cursor;
    @c(a = "limit")
    public final Integer limit;
    @c(a = "no_clear_unread")
    public final Boolean no_clear_unread;

    static final class ProtoAdapter_GetConversationAuditListRequestBody extends ProtoAdapter<GetConversationAuditListRequestBody> {
        static {
            Covode.recordClassIndex(23417);
        }

        public ProtoAdapter_GetConversationAuditListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditListRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetConversationAuditListRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationAuditListRequestBody redact(com.bytedance.im.core.proto.GetConversationAuditListRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetConversationAuditListRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationAuditListRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationAuditListRequestBody.ProtoAdapter_GetConversationAuditListRequestBody.redact(com.bytedance.im.core.proto.GetConversationAuditListRequestBody):com.bytedance.im.core.proto.GetConversationAuditListRequestBody");
        }

        public final int encodedSize(GetConversationAuditListRequestBody getConversationAuditListRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationAuditListRequestBody.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationAuditListRequestBody.limit) + ProtoAdapter.INT64.encodedSizeWithTag(3, getConversationAuditListRequestBody.conv_short_id) + ProtoAdapter.BOOL.encodedSizeWithTag(4, getConversationAuditListRequestBody.no_clear_unread) + getConversationAuditListRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationAuditListRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.limit(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.no_clear_unread(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationAuditListRequestBody getConversationAuditListRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationAuditListRequestBody.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationAuditListRequestBody.limit);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getConversationAuditListRequestBody.conv_short_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getConversationAuditListRequestBody.no_clear_unread);
            protoWriter.writeBytes(getConversationAuditListRequestBody.unknownFields());
        }
    }

    public static void registerAdapter() {
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2027, ADAPTER);
    }

    public static final class Builder extends Message.Builder<GetConversationAuditListRequestBody, Builder> {
        public Long conv_short_id;
        public Long cursor;
        public Integer limit;
        public Boolean no_clear_unread;

        static {
            Covode.recordClassIndex(23416);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationAuditListRequestBody build() {
            return new GetConversationAuditListRequestBody(this.cursor, this.limit, this.conv_short_id, this.no_clear_unread, super.buildUnknownFields());
        }

        public final Builder conv_short_id(Long l2) {
            this.conv_short_id = l2;
            return this;
        }

        public final Builder cursor(Long l2) {
            this.cursor = l2;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public final Builder no_clear_unread(Boolean bool) {
            this.no_clear_unread = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationAuditListRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationAuditListRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.conv_short_id = this.conv_short_id;
        builder.no_clear_unread = this.no_clear_unread;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationAuditListRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23415);
        ProtoAdapter_GetConversationAuditListRequestBody protoAdapter_GetConversationAuditListRequestBody = new ProtoAdapter_GetConversationAuditListRequestBody();
        ADAPTER = protoAdapter_GetConversationAuditListRequestBody;
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2027, protoAdapter_GetConversationAuditListRequestBody);
    }

    public GetConversationAuditListRequestBody(Long l2, Integer num, Long l3, Boolean bool) {
        this(l2, num, l3, bool, i.EMPTY);
    }

    public GetConversationAuditListRequestBody(Long l2, Integer num, Long l3, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.cursor = l2;
        this.limit = num;
        this.conv_short_id = l3;
        this.no_clear_unread = bool;
    }
}

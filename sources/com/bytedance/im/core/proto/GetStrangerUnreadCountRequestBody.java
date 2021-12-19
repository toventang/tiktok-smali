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

public final class GetStrangerUnreadCountRequestBody extends Message<GetStrangerUnreadCountRequestBody, Builder> {
    public static final ProtoAdapter<GetStrangerUnreadCountRequestBody> ADAPTER = new ProtoAdapter_GetStrangerUnreadCountRequestBody();
    public static final Boolean DEFAULT_RESET_UNREAD_COUNT = false;
    private static final long serialVersionUID = 0;
    @c(a = "reset_unread_count")
    public final Boolean reset_unread_count;

    static final class ProtoAdapter_GetStrangerUnreadCountRequestBody extends ProtoAdapter<GetStrangerUnreadCountRequestBody> {
        static {
            Covode.recordClassIndex(23513);
        }

        public ProtoAdapter_GetStrangerUnreadCountRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerUnreadCountRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetStrangerUnreadCountRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetStrangerUnreadCountRequestBody redact(com.bytedance.im.core.proto.GetStrangerUnreadCountRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetStrangerUnreadCountRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetStrangerUnreadCountRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetStrangerUnreadCountRequestBody.ProtoAdapter_GetStrangerUnreadCountRequestBody.redact(com.bytedance.im.core.proto.GetStrangerUnreadCountRequestBody):com.bytedance.im.core.proto.GetStrangerUnreadCountRequestBody");
        }

        public final int encodedSize(GetStrangerUnreadCountRequestBody getStrangerUnreadCountRequestBody) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, getStrangerUnreadCountRequestBody.reset_unread_count) + getStrangerUnreadCountRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerUnreadCountRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.reset_unread_count(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetStrangerUnreadCountRequestBody getStrangerUnreadCountRequestBody) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getStrangerUnreadCountRequestBody.reset_unread_count);
            protoWriter.writeBytes(getStrangerUnreadCountRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetStrangerUnreadCountRequestBody, Builder> {
        public Boolean reset_unread_count;

        static {
            Covode.recordClassIndex(23512);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetStrangerUnreadCountRequestBody build() {
            return new GetStrangerUnreadCountRequestBody(this.reset_unread_count, super.buildUnknownFields());
        }

        public final Builder reset_unread_count(Boolean bool) {
            this.reset_unread_count = bool;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23511);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetStrangerUnreadCountRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetStrangerUnreadCountRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.reset_unread_count = this.reset_unread_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetStrangerUnreadCountRequestBody" + h.f38770a.b(this).toString();
    }

    public GetStrangerUnreadCountRequestBody(Boolean bool) {
        this(bool, i.EMPTY);
    }

    public GetStrangerUnreadCountRequestBody(Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.reset_unread_count = bool;
    }
}

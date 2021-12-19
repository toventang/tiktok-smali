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

public final class InboxMessagesPerUserResponseBody extends Message<InboxMessagesPerUserResponseBody, Builder> {
    public static final ProtoAdapter<InboxMessagesPerUserResponseBody> ADAPTER = new ProtoAdapter_InboxMessagesPerUserResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    private static final long serialVersionUID = 0;
    @c(a = "has_more")
    public final Boolean has_more;
    @c(a = "inbox_type")
    public final Integer inbox_type;

    static final class ProtoAdapter_InboxMessagesPerUserResponseBody extends ProtoAdapter<InboxMessagesPerUserResponseBody> {
        static {
            Covode.recordClassIndex(23541);
        }

        public ProtoAdapter_InboxMessagesPerUserResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, InboxMessagesPerUserResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody redact(com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody.ProtoAdapter_InboxMessagesPerUserResponseBody.redact(com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody):com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody");
        }

        public final int encodedSize(InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, inboxMessagesPerUserResponseBody.inbox_type) + ProtoAdapter.BOOL.encodedSizeWithTag(2, inboxMessagesPerUserResponseBody.has_more) + inboxMessagesPerUserResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InboxMessagesPerUserResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.inbox_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, inboxMessagesPerUserResponseBody.inbox_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, inboxMessagesPerUserResponseBody.has_more);
            protoWriter.writeBytes(inboxMessagesPerUserResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<InboxMessagesPerUserResponseBody, Builder> {
        public Boolean has_more;
        public Integer inbox_type;

        static {
            Covode.recordClassIndex(23540);
        }

        @Override // com.squareup.wire.Message.Builder
        public final InboxMessagesPerUserResponseBody build() {
            return new InboxMessagesPerUserResponseBody(this.inbox_type, this.has_more, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23539);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<InboxMessagesPerUserResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.inbox_type = this.inbox_type;
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "InboxMessagesPerUserResponseBody" + h.f38770a.b(this).toString();
    }

    public InboxMessagesPerUserResponseBody(Integer num, Boolean bool) {
        this(num, bool, i.EMPTY);
    }

    public InboxMessagesPerUserResponseBody(Integer num, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.inbox_type = num;
        this.has_more = bool;
    }
}

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

public final class ConversationParticipantsListResponseBody extends Message<ConversationParticipantsListResponseBody, Builder> {
    public static final ProtoAdapter<ConversationParticipantsListResponseBody> ADAPTER = new ProtoAdapter_ConversationParticipantsListResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "participants_page")
    public final ParticipantsPage participants_page;

    static final class ProtoAdapter_ConversationParticipantsListResponseBody extends ProtoAdapter<ConversationParticipantsListResponseBody> {
        static {
            Covode.recordClassIndex(23333);
        }

        public ProtoAdapter_ConversationParticipantsListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationParticipantsListResponseBody.class);
        }

        public final int encodedSize(ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
            return ParticipantsPage.ADAPTER.encodedSizeWithTag(1, conversationParticipantsListResponseBody.participants_page) + conversationParticipantsListResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ConversationParticipantsListResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationParticipantsListResponseBody redact(com.bytedance.im.core.proto.ConversationParticipantsListResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ConversationParticipantsListResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ParticipantsPage r0 = r2.participants_page
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ParticipantsPage> r1 = com.bytedance.im.core.proto.ParticipantsPage.ADAPTER
                com.bytedance.im.core.proto.ParticipantsPage r0 = r2.participants_page
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ParticipantsPage r0 = (com.bytedance.im.core.proto.ParticipantsPage) r0
                r2.participants_page = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationParticipantsListResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationParticipantsListResponseBody.ProtoAdapter_ConversationParticipantsListResponseBody.redact(com.bytedance.im.core.proto.ConversationParticipantsListResponseBody):com.bytedance.im.core.proto.ConversationParticipantsListResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationParticipantsListResponseBody decode(ProtoReader protoReader) {
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
                    builder.participants_page(ParticipantsPage.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
            ParticipantsPage.ADAPTER.encodeWithTag(protoWriter, 1, conversationParticipantsListResponseBody.participants_page);
            protoWriter.writeBytes(conversationParticipantsListResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ConversationParticipantsListResponseBody, Builder> {
        public ParticipantsPage participants_page;

        static {
            Covode.recordClassIndex(23332);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationParticipantsListResponseBody build() {
            return new ConversationParticipantsListResponseBody(this.participants_page, super.buildUnknownFields());
        }

        public final Builder participants_page(ParticipantsPage participantsPage) {
            this.participants_page = participantsPage;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23331);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationParticipantsListResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationParticipantsListResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.participants_page = this.participants_page;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationParticipantsListResponseBody" + h.f38770a.b(this).toString();
    }

    public ConversationParticipantsListResponseBody(ParticipantsPage participantsPage) {
        this(participantsPage, i.EMPTY);
    }

    public ConversationParticipantsListResponseBody(ParticipantsPage participantsPage, i iVar) {
        super(ADAPTER, iVar);
        this.participants_page = participantsPage;
    }
}

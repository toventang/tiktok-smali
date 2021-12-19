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

public final class ConversationParticipantReadIndex extends Message<ConversationParticipantReadIndex, Builder> {
    public static final ProtoAdapter<ConversationParticipantReadIndex> ADAPTER = new ProtoAdapter_ConversationParticipantReadIndex();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "participantReadIndex")
    public final List<ParticipantReadIndex> participantReadIndex;

    static final class ProtoAdapter_ConversationParticipantReadIndex extends ProtoAdapter<ConversationParticipantReadIndex> {
        static {
            Covode.recordClassIndex(23327);
        }

        public ProtoAdapter_ConversationParticipantReadIndex() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationParticipantReadIndex.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ConversationParticipantReadIndex$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationParticipantReadIndex redact(com.bytedance.im.core.proto.ConversationParticipantReadIndex r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ConversationParticipantReadIndex$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ParticipantReadIndex> r1 = r2.participantReadIndex
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ParticipantReadIndex> r0 = com.bytedance.im.core.proto.ParticipantReadIndex.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationParticipantReadIndex r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationParticipantReadIndex.ProtoAdapter_ConversationParticipantReadIndex.redact(com.bytedance.im.core.proto.ConversationParticipantReadIndex):com.bytedance.im.core.proto.ConversationParticipantReadIndex");
        }

        public final int encodedSize(ConversationParticipantReadIndex conversationParticipantReadIndex) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationParticipantReadIndex.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationParticipantReadIndex.conversation_short_id) + ParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(3, conversationParticipantReadIndex.participantReadIndex) + conversationParticipantReadIndex.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationParticipantReadIndex decode(ProtoReader protoReader) {
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
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.participantReadIndex.add(ParticipantReadIndex.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationParticipantReadIndex conversationParticipantReadIndex) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationParticipantReadIndex.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationParticipantReadIndex.conversation_short_id);
            ParticipantReadIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, conversationParticipantReadIndex.participantReadIndex);
            protoWriter.writeBytes(conversationParticipantReadIndex.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ConversationParticipantReadIndex, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public List<ParticipantReadIndex> participantReadIndex = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23326);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationParticipantReadIndex build() {
            return new ConversationParticipantReadIndex(this.conversation_id, this.conversation_short_id, this.participantReadIndex, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder participantReadIndex(List<ParticipantReadIndex> list) {
            Internal.checkElementsNotNull(list);
            this.participantReadIndex = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23325);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationParticipantReadIndex$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationParticipantReadIndex, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.participantReadIndex = Internal.copyOf("participantReadIndex", this.participantReadIndex);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationParticipantReadIndex" + h.f38770a.b(this).toString();
    }

    public ConversationParticipantReadIndex(String str, Long l2, List<ParticipantReadIndex> list) {
        this(str, l2, list, i.EMPTY);
    }

    public ConversationParticipantReadIndex(String str, Long l2, List<ParticipantReadIndex> list, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.participantReadIndex = Internal.immutableCopyOf("participantReadIndex", list);
    }
}

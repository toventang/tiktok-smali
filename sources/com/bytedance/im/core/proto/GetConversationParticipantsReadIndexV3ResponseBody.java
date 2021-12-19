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

public final class GetConversationParticipantsReadIndexV3ResponseBody extends Message<GetConversationParticipantsReadIndexV3ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationParticipantsReadIndexV3ResponseBody> ADAPTER = new ProtoAdapter_GetConversationParticipantsReadIndexV3ResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "indexes")
    public final List<ParticipantReadIndex> indexes;

    static final class ProtoAdapter_GetConversationParticipantsReadIndexV3ResponseBody extends ProtoAdapter<GetConversationParticipantsReadIndexV3ResponseBody> {
        static {
            Covode.recordClassIndex(23462);
        }

        public ProtoAdapter_GetConversationParticipantsReadIndexV3ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsReadIndexV3ResponseBody.class);
        }

        public final int encodedSize(GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
            return ParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationParticipantsReadIndexV3ResponseBody.indexes) + getConversationParticipantsReadIndexV3ResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody redact(com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ParticipantReadIndex> r1 = r2.indexes
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ParticipantReadIndex> r0 = com.bytedance.im.core.proto.ParticipantReadIndex.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody.ProtoAdapter_GetConversationParticipantsReadIndexV3ResponseBody.redact(com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody):com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationParticipantsReadIndexV3ResponseBody decode(ProtoReader protoReader) {
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
                    builder.indexes.add(ParticipantReadIndex.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
            ParticipantReadIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationParticipantsReadIndexV3ResponseBody.indexes);
            protoWriter.writeBytes(getConversationParticipantsReadIndexV3ResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationParticipantsReadIndexV3ResponseBody, Builder> {
        public List<ParticipantReadIndex> indexes = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23461);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationParticipantsReadIndexV3ResponseBody build() {
            return new GetConversationParticipantsReadIndexV3ResponseBody(this.indexes, super.buildUnknownFields());
        }

        public final Builder indexes(List<ParticipantReadIndex> list) {
            Internal.checkElementsNotNull(list);
            this.indexes = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23460);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationParticipantsReadIndexV3ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.indexes = Internal.copyOf("indexes", this.indexes);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationParticipantsReadIndexV3ResponseBody" + h.f38770a.b(this).toString();
    }

    public GetConversationParticipantsReadIndexV3ResponseBody(List<ParticipantReadIndex> list) {
        this(list, i.EMPTY);
    }

    public GetConversationParticipantsReadIndexV3ResponseBody(List<ParticipantReadIndex> list, i iVar) {
        super(ADAPTER, iVar);
        this.indexes = Internal.immutableCopyOf("indexes", list);
    }
}

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

public final class GetConversationParticipantsMinIndexV3ResponseBody extends Message<GetConversationParticipantsMinIndexV3ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationParticipantsMinIndexV3ResponseBody> ADAPTER = new ProtoAdapter_GetConversationParticipantsMinIndexV3ResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "indexes")
    public final List<ParticipantMinIndex> indexes;

    static final class ProtoAdapter_GetConversationParticipantsMinIndexV3ResponseBody extends ProtoAdapter<GetConversationParticipantsMinIndexV3ResponseBody> {
        static {
            Covode.recordClassIndex(23456);
        }

        public ProtoAdapter_GetConversationParticipantsMinIndexV3ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsMinIndexV3ResponseBody.class);
        }

        public final int encodedSize(GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
            return ParticipantMinIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationParticipantsMinIndexV3ResponseBody.indexes) + getConversationParticipantsMinIndexV3ResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody redact(com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ParticipantMinIndex> r1 = r2.indexes
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ParticipantMinIndex> r0 = com.bytedance.im.core.proto.ParticipantMinIndex.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody.ProtoAdapter_GetConversationParticipantsMinIndexV3ResponseBody.redact(com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody):com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationParticipantsMinIndexV3ResponseBody decode(ProtoReader protoReader) {
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
                    builder.indexes.add(ParticipantMinIndex.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
            ParticipantMinIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationParticipantsMinIndexV3ResponseBody.indexes);
            protoWriter.writeBytes(getConversationParticipantsMinIndexV3ResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationParticipantsMinIndexV3ResponseBody, Builder> {
        public List<ParticipantMinIndex> indexes = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23455);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationParticipantsMinIndexV3ResponseBody build() {
            return new GetConversationParticipantsMinIndexV3ResponseBody(this.indexes, super.buildUnknownFields());
        }

        public final Builder indexes(List<ParticipantMinIndex> list) {
            Internal.checkElementsNotNull(list);
            this.indexes = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23454);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationParticipantsMinIndexV3ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.indexes = Internal.copyOf("indexes", this.indexes);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationParticipantsMinIndexV3ResponseBody" + h.f38770a.b(this).toString();
    }

    public GetConversationParticipantsMinIndexV3ResponseBody(List<ParticipantMinIndex> list) {
        this(list, i.EMPTY);
    }

    public GetConversationParticipantsMinIndexV3ResponseBody(List<ParticipantMinIndex> list, i iVar) {
        super(ADAPTER, iVar);
        this.indexes = Internal.immutableCopyOf("indexes", list);
    }
}

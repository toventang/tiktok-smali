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

public final class UpdateConversationParticipantResponseBody extends Message<UpdateConversationParticipantResponseBody, Builder> {
    public static final ProtoAdapter<UpdateConversationParticipantResponseBody> ADAPTER = new ProtoAdapter_UpdateConversationParticipantResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "extra_info")
    public final String extra_info;
    @c(a = "participant")
    public final Participant participant;
    @c(a = "status")
    public final Integer status;

    static final class ProtoAdapter_UpdateConversationParticipantResponseBody extends ProtoAdapter<UpdateConversationParticipantResponseBody> {
        static {
            Covode.recordClassIndex(23806);
        }

        public ProtoAdapter_UpdateConversationParticipantResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationParticipantResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody redact(com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.Participant r0 = r2.participant
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.Participant> r1 = com.bytedance.im.core.proto.Participant.ADAPTER
                com.bytedance.im.core.proto.Participant r0 = r2.participant
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.Participant r0 = (com.bytedance.im.core.proto.Participant) r0
                r2.participant = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody.ProtoAdapter_UpdateConversationParticipantResponseBody.redact(com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody):com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody");
        }

        public final int encodedSize(UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
            return Participant.ADAPTER.encodedSizeWithTag(1, updateConversationParticipantResponseBody.participant) + ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationParticipantResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, updateConversationParticipantResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, updateConversationParticipantResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(5, updateConversationParticipantResponseBody.check_message) + updateConversationParticipantResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.participant(Participant.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.extra_info(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
            Participant.ADAPTER.encodeWithTag(protoWriter, 1, updateConversationParticipantResponseBody.participant);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateConversationParticipantResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, updateConversationParticipantResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, updateConversationParticipantResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, updateConversationParticipantResponseBody.check_message);
            protoWriter.writeBytes(updateConversationParticipantResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<UpdateConversationParticipantResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public Participant participant;
        public Integer status;

        static {
            Covode.recordClassIndex(23805);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UpdateConversationParticipantResponseBody build() {
            return new UpdateConversationParticipantResponseBody(this.participant, this.status, this.extra_info, this.check_code, this.check_message, super.buildUnknownFields());
        }

        public final Builder check_code(Long l2) {
            this.check_code = l2;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder participant(Participant participant2) {
            this.participant = participant2;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23804);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "UpdateConversationParticipantResponseBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UpdateConversationParticipantResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.participant = this.participant;
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public UpdateConversationParticipantResponseBody(Participant participant2, Integer num, String str, Long l2, String str2) {
        this(participant2, num, str, l2, str2, i.EMPTY);
    }

    public UpdateConversationParticipantResponseBody(Participant participant2, Integer num, String str, Long l2, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.participant = participant2;
        this.status = num;
        this.extra_info = str;
        this.check_code = l2;
        this.check_message = str2;
    }
}

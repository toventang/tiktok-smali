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

public final class UpdateConversationParticipantResult extends Message<UpdateConversationParticipantResult, Builder> {
    public static final ProtoAdapter<UpdateConversationParticipantResult> ADAPTER = new ProtoAdapter_UpdateConversationParticipantResult();
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

    static final class ProtoAdapter_UpdateConversationParticipantResult extends ProtoAdapter<UpdateConversationParticipantResult> {
        static {
            Covode.recordClassIndex(23809);
        }

        public ProtoAdapter_UpdateConversationParticipantResult() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationParticipantResult.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.UpdateConversationParticipantResult$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.UpdateConversationParticipantResult redact(com.bytedance.im.core.proto.UpdateConversationParticipantResult r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.UpdateConversationParticipantResult$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.Participant r0 = r2.participant
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.Participant> r1 = com.bytedance.im.core.proto.Participant.ADAPTER
                com.bytedance.im.core.proto.Participant r0 = r2.participant
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.Participant r0 = (com.bytedance.im.core.proto.Participant) r0
                r2.participant = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.UpdateConversationParticipantResult r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.UpdateConversationParticipantResult.ProtoAdapter_UpdateConversationParticipantResult.redact(com.bytedance.im.core.proto.UpdateConversationParticipantResult):com.bytedance.im.core.proto.UpdateConversationParticipantResult");
        }

        public final int encodedSize(UpdateConversationParticipantResult updateConversationParticipantResult) {
            return Participant.ADAPTER.encodedSizeWithTag(1, updateConversationParticipantResult.participant) + ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationParticipantResult.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, updateConversationParticipantResult.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, updateConversationParticipantResult.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(5, updateConversationParticipantResult.check_message) + updateConversationParticipantResult.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantResult decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantResult updateConversationParticipantResult) {
            Participant.ADAPTER.encodeWithTag(protoWriter, 1, updateConversationParticipantResult.participant);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateConversationParticipantResult.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, updateConversationParticipantResult.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, updateConversationParticipantResult.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, updateConversationParticipantResult.check_message);
            protoWriter.writeBytes(updateConversationParticipantResult.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<UpdateConversationParticipantResult, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public Participant participant;
        public Integer status;

        static {
            Covode.recordClassIndex(23808);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UpdateConversationParticipantResult build() {
            return new UpdateConversationParticipantResult(this.participant, this.status, this.extra_info, this.check_code, this.check_message, super.buildUnknownFields());
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
        Covode.recordClassIndex(23807);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "UpdateConversationParticipantResult" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.UpdateConversationParticipantResult$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UpdateConversationParticipantResult, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.participant = this.participant;
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public UpdateConversationParticipantResult(Participant participant2, Integer num, String str, Long l2, String str2) {
        this(participant2, num, str, l2, str2, i.EMPTY);
    }

    public UpdateConversationParticipantResult(Participant participant2, Integer num, String str, Long l2, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.participant = participant2;
        this.status = num;
        this.extra_info = str;
        this.check_code = l2;
        this.check_message = str2;
    }
}

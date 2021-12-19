package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class ConversationRemoveParticipantsResponseBody extends Message<ConversationRemoveParticipantsResponseBody, Builder> {
    public static final ProtoAdapter<ConversationRemoveParticipantsResponseBody> ADAPTER = new ProtoAdapter_ConversationRemoveParticipantsResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "extra_info")
    public final String extra_info;
    @c(a = "failed_participants")
    public final List<Long> failed_participants;
    @c(a = "failed_sec_participants")
    public final List<SecUidPair> failed_sec_participants;
    @c(a = "status")
    public final Integer status;

    static final class ProtoAdapter_ConversationRemoveParticipantsResponseBody extends ProtoAdapter<ConversationRemoveParticipantsResponseBody> {
        static {
            Covode.recordClassIndex(23342);
        }

        public ProtoAdapter_ConversationRemoveParticipantsResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationRemoveParticipantsResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody redact(com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.SecUidPair> r1 = r2.failed_sec_participants
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.SecUidPair> r0 = com.bytedance.im.core.proto.SecUidPair.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody.ProtoAdapter_ConversationRemoveParticipantsResponseBody.redact(com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody):com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody");
        }

        public final int encodedSize(ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, conversationRemoveParticipantsResponseBody.failed_participants) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationRemoveParticipantsResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, conversationRemoveParticipantsResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationRemoveParticipantsResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(5, conversationRemoveParticipantsResponseBody.check_message) + SecUidPair.ADAPTER.asRepeated().encodedSizeWithTag(6, conversationRemoveParticipantsResponseBody.failed_sec_participants) + conversationRemoveParticipantsResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationRemoveParticipantsResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.failed_participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.extra_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.failed_sec_participants.add(SecUidPair.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, conversationRemoveParticipantsResponseBody.failed_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationRemoveParticipantsResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, conversationRemoveParticipantsResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationRemoveParticipantsResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, conversationRemoveParticipantsResponseBody.check_message);
            SecUidPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, conversationRemoveParticipantsResponseBody.failed_sec_participants);
            protoWriter.writeBytes(conversationRemoveParticipantsResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ConversationRemoveParticipantsResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public List<Long> failed_participants = Internal.newMutableList();
        public List<SecUidPair> failed_sec_participants = Internal.newMutableList();
        public Integer status;

        static {
            Covode.recordClassIndex(23341);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationRemoveParticipantsResponseBody build() {
            return new ConversationRemoveParticipantsResponseBody(this.failed_participants, this.status, this.extra_info, this.check_code, this.check_message, this.failed_sec_participants, super.buildUnknownFields());
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

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder failed_participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.failed_participants = list;
            return this;
        }

        public final Builder failed_sec_participants(List<SecUidPair> list) {
            Internal.checkElementsNotNull(list);
            this.failed_sec_participants = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23340);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationRemoveParticipantsResponseBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationRemoveParticipantsResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.failed_participants = Internal.copyOf("failed_participants", this.failed_participants);
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.failed_sec_participants = Internal.copyOf("failed_sec_participants", this.failed_sec_participants);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationRemoveParticipantsResponseBody(List<Long> list, Integer num, String str, Long l2, String str2, List<SecUidPair> list2) {
        this(list, num, str, l2, str2, list2, i.EMPTY);
    }

    public ConversationRemoveParticipantsResponseBody(List<Long> list, Integer num, String str, Long l2, String str2, List<SecUidPair> list2, i iVar) {
        super(ADAPTER, iVar);
        this.failed_participants = Internal.immutableCopyOf("failed_participants", list);
        this.status = num;
        this.extra_info = str;
        this.check_code = l2;
        this.check_message = str2;
        this.failed_sec_participants = Internal.immutableCopyOf("failed_sec_participants", list2);
    }
}

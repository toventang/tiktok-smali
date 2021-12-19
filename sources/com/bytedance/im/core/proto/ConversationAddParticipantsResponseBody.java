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

public final class ConversationAddParticipantsResponseBody extends Message<ConversationAddParticipantsResponseBody, Builder> {
    public static final ProtoAdapter<ConversationAddParticipantsResponseBody> ADAPTER = new ProtoAdapter_ConversationAddParticipantsResponseBody();
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
    @c(a = "sec_failed_participants")
    public final List<SecUidPair> sec_failed_participants;
    @c(a = "sec_success_participants")
    public final List<SecUidPair> sec_success_participants;
    @c(a = "status")
    public final Integer status;
    @c(a = "success_participants")
    public final List<Long> success_participants;

    static final class ProtoAdapter_ConversationAddParticipantsResponseBody extends ProtoAdapter<ConversationAddParticipantsResponseBody> {
        static {
            Covode.recordClassIndex(23289);
        }

        public ProtoAdapter_ConversationAddParticipantsResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationAddParticipantsResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody redact(com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.SecUidPair> r1 = r2.sec_success_participants
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.SecUidPair> r0 = com.bytedance.im.core.proto.SecUidPair.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                java.util.List<com.bytedance.im.core.proto.SecUidPair> r1 = r2.sec_failed_participants
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.SecUidPair> r0 = com.bytedance.im.core.proto.SecUidPair.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody.ProtoAdapter_ConversationAddParticipantsResponseBody.redact(com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody):com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody");
        }

        public final int encodedSize(ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, conversationAddParticipantsResponseBody.success_participants) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, conversationAddParticipantsResponseBody.failed_participants) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationAddParticipantsResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(4, conversationAddParticipantsResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(5, conversationAddParticipantsResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(6, conversationAddParticipantsResponseBody.check_message) + SecUidPair.ADAPTER.asRepeated().encodedSizeWithTag(7, conversationAddParticipantsResponseBody.sec_success_participants) + SecUidPair.ADAPTER.asRepeated().encodedSizeWithTag(8, conversationAddParticipantsResponseBody.sec_failed_participants) + conversationAddParticipantsResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationAddParticipantsResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.success_participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.failed_participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.extra_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.sec_success_participants.add(SecUidPair.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.sec_failed_participants.add(SecUidPair.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, conversationAddParticipantsResponseBody.success_participants);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, conversationAddParticipantsResponseBody.failed_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationAddParticipantsResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, conversationAddParticipantsResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, conversationAddParticipantsResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, conversationAddParticipantsResponseBody.check_message);
            SecUidPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, conversationAddParticipantsResponseBody.sec_success_participants);
            SecUidPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, conversationAddParticipantsResponseBody.sec_failed_participants);
            protoWriter.writeBytes(conversationAddParticipantsResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ConversationAddParticipantsResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public List<Long> failed_participants = Internal.newMutableList();
        public List<SecUidPair> sec_failed_participants = Internal.newMutableList();
        public List<SecUidPair> sec_success_participants = Internal.newMutableList();
        public Integer status;
        public List<Long> success_participants = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23288);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationAddParticipantsResponseBody build() {
            return new ConversationAddParticipantsResponseBody(this.success_participants, this.failed_participants, this.status, this.extra_info, this.check_code, this.check_message, this.sec_success_participants, this.sec_failed_participants, super.buildUnknownFields());
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

        public final Builder sec_failed_participants(List<SecUidPair> list) {
            Internal.checkElementsNotNull(list);
            this.sec_failed_participants = list;
            return this;
        }

        public final Builder sec_success_participants(List<SecUidPair> list) {
            Internal.checkElementsNotNull(list);
            this.sec_success_participants = list;
            return this;
        }

        public final Builder success_participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.success_participants = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23287);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationAddParticipantsResponseBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationAddParticipantsResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.success_participants = Internal.copyOf("success_participants", this.success_participants);
        builder.failed_participants = Internal.copyOf("failed_participants", this.failed_participants);
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.sec_success_participants = Internal.copyOf("sec_success_participants", this.sec_success_participants);
        builder.sec_failed_participants = Internal.copyOf("sec_failed_participants", this.sec_failed_participants);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationAddParticipantsResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l2, String str2, List<SecUidPair> list3, List<SecUidPair> list4) {
        this(list, list2, num, str, l2, str2, list3, list4, i.EMPTY);
    }

    public ConversationAddParticipantsResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l2, String str2, List<SecUidPair> list3, List<SecUidPair> list4, i iVar) {
        super(ADAPTER, iVar);
        this.success_participants = Internal.immutableCopyOf("success_participants", list);
        this.failed_participants = Internal.immutableCopyOf("failed_participants", list2);
        this.status = num;
        this.extra_info = str;
        this.check_code = l2;
        this.check_message = str2;
        this.sec_success_participants = Internal.immutableCopyOf("sec_success_participants", list3);
        this.sec_failed_participants = Internal.immutableCopyOf("sec_failed_participants", list4);
    }
}

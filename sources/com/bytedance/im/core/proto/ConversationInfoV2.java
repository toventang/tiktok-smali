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
import k.i;

public final class ConversationInfoV2 extends Message<ConversationInfoV2, Builder> {
    public static final ProtoAdapter<ConversationInfoV2> ADAPTER = new ProtoAdapter_ConversationInfoV2();
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Boolean DEFAULT_IS_PARTICIPANT = false;
    public static final Integer DEFAULT_PARTICIPANTS_COUNT = 0;
    private static final long serialVersionUID = 0;
    @c(a = "badge_count")
    public final Integer badge_count;
    @c(a = "conversation_core_info")
    public final ConversationCoreInfo conversation_core_info;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_setting_info")
    public final ConversationSettingInfo conversation_setting_info;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "first_page_participants")
    public final ParticipantsPage first_page_participants;
    @c(a = "inbox_type")
    public final Integer inbox_type;
    @c(a = "is_participant")
    public final Boolean is_participant;
    @c(a = "participants_count")
    public final Integer participants_count;
    @c(a = "ticket")
    public final String ticket;
    @c(a = "user_info")
    public final Participant user_info;

    static final class ProtoAdapter_ConversationInfoV2 extends ProtoAdapter<ConversationInfoV2> {
        static {
            Covode.recordClassIndex(23307);
        }

        public ProtoAdapter_ConversationInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationInfoV2.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ConversationInfoV2$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationInfoV2 redact(com.bytedance.im.core.proto.ConversationInfoV2 r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ConversationInfoV2$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ParticipantsPage r0 = r2.first_page_participants
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ParticipantsPage> r1 = com.bytedance.im.core.proto.ParticipantsPage.ADAPTER
                com.bytedance.im.core.proto.ParticipantsPage r0 = r2.first_page_participants
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ParticipantsPage r0 = (com.bytedance.im.core.proto.ParticipantsPage) r0
                r2.first_page_participants = r0
            L_0x0014:
                com.bytedance.im.core.proto.Participant r0 = r2.user_info
                if (r0 == 0) goto L_0x0024
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.Participant> r1 = com.bytedance.im.core.proto.Participant.ADAPTER
                com.bytedance.im.core.proto.Participant r0 = r2.user_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.Participant r0 = (com.bytedance.im.core.proto.Participant) r0
                r2.user_info = r0
            L_0x0024:
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = r2.conversation_core_info
                if (r0 == 0) goto L_0x0034
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationCoreInfo> r1 = com.bytedance.im.core.proto.ConversationCoreInfo.ADAPTER
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = r2.conversation_core_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = (com.bytedance.im.core.proto.ConversationCoreInfo) r0
                r2.conversation_core_info = r0
            L_0x0034:
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = r2.conversation_setting_info
                if (r0 == 0) goto L_0x0044
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationSettingInfo> r1 = com.bytedance.im.core.proto.ConversationSettingInfo.ADAPTER
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = r2.conversation_setting_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = (com.bytedance.im.core.proto.ConversationSettingInfo) r0
                r2.conversation_setting_info = r0
            L_0x0044:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationInfoV2.ProtoAdapter_ConversationInfoV2.redact(com.bytedance.im.core.proto.ConversationInfoV2):com.bytedance.im.core.proto.ConversationInfoV2");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationInfoV2 decode(ProtoReader protoReader) {
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
                } else if (nextTag == 3) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.ticket(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 20) {
                    builder.user_info(Participant.ADAPTER.decode(protoReader));
                } else if (nextTag == 50) {
                    builder.conversation_core_info(ConversationCoreInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 51) {
                    switch (nextTag) {
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.first_page_participants(ParticipantsPage.ADAPTER.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.participants_count(ProtoAdapter.INT32.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.is_participant(ProtoAdapter.BOOL.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.inbox_type(ProtoAdapter.INT32.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.badge_count(ProtoAdapter.INT32.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    builder.conversation_setting_info(ConversationSettingInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final int encodedSize(ConversationInfoV2 conversationInfoV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationInfoV2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationInfoV2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationInfoV2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, conversationInfoV2.ticket) + ParticipantsPage.ADAPTER.encodedSizeWithTag(6, conversationInfoV2.first_page_participants) + ProtoAdapter.INT32.encodedSizeWithTag(7, conversationInfoV2.participants_count) + ProtoAdapter.BOOL.encodedSizeWithTag(8, conversationInfoV2.is_participant) + ProtoAdapter.INT32.encodedSizeWithTag(9, conversationInfoV2.inbox_type) + ProtoAdapter.INT32.encodedSizeWithTag(10, conversationInfoV2.badge_count) + Participant.ADAPTER.encodedSizeWithTag(20, conversationInfoV2.user_info) + ConversationCoreInfo.ADAPTER.encodedSizeWithTag(50, conversationInfoV2.conversation_core_info) + ConversationSettingInfo.ADAPTER.encodedSizeWithTag(51, conversationInfoV2.conversation_setting_info) + conversationInfoV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ConversationInfoV2 conversationInfoV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationInfoV2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationInfoV2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationInfoV2.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, conversationInfoV2.ticket);
            ParticipantsPage.ADAPTER.encodeWithTag(protoWriter, 6, conversationInfoV2.first_page_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, conversationInfoV2.participants_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, conversationInfoV2.is_participant);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, conversationInfoV2.inbox_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, conversationInfoV2.badge_count);
            Participant.ADAPTER.encodeWithTag(protoWriter, 20, conversationInfoV2.user_info);
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 50, conversationInfoV2.conversation_core_info);
            ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 51, conversationInfoV2.conversation_setting_info);
            protoWriter.writeBytes(conversationInfoV2.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationInfoV2" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<ConversationInfoV2, Builder> {
        public Integer badge_count;
        public ConversationCoreInfo conversation_core_info;
        public String conversation_id;
        public ConversationSettingInfo conversation_setting_info;
        public Long conversation_short_id;
        public Integer conversation_type;
        public ParticipantsPage first_page_participants;
        public Integer inbox_type;
        public Boolean is_participant;
        public Integer participants_count;
        public String ticket;
        public Participant user_info;

        static {
            Covode.recordClassIndex(23306);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationInfoV2 build() {
            return new ConversationInfoV2(this.conversation_id, this.conversation_short_id, this.conversation_type, this.ticket, this.first_page_participants, this.participants_count, this.is_participant, this.inbox_type, this.badge_count, this.user_info, this.conversation_core_info, this.conversation_setting_info, super.buildUnknownFields());
        }

        public final Builder badge_count(Integer num) {
            this.badge_count = num;
            return this;
        }

        public final Builder conversation_core_info(ConversationCoreInfo conversationCoreInfo) {
            this.conversation_core_info = conversationCoreInfo;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_setting_info(ConversationSettingInfo conversationSettingInfo) {
            this.conversation_setting_info = conversationSettingInfo;
            return this;
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder first_page_participants(ParticipantsPage participantsPage) {
            this.first_page_participants = participantsPage;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder is_participant(Boolean bool) {
            this.is_participant = bool;
            return this;
        }

        public final Builder participants_count(Integer num) {
            this.participants_count = num;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }

        public final Builder user_info(Participant participant) {
            this.user_info = participant;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23305);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.ticket = this.ticket;
        builder.first_page_participants = this.first_page_participants;
        builder.participants_count = this.participants_count;
        builder.is_participant = this.is_participant;
        builder.inbox_type = this.inbox_type;
        builder.badge_count = this.badge_count;
        builder.user_info = this.user_info;
        builder.conversation_core_info = this.conversation_core_info;
        builder.conversation_setting_info = this.conversation_setting_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationInfoV2(String str, Long l2, Integer num, String str2, ParticipantsPage participantsPage, Integer num2, Boolean bool, Integer num3, Integer num4, Participant participant, ConversationCoreInfo conversationCoreInfo, ConversationSettingInfo conversationSettingInfo) {
        this(str, l2, num, str2, participantsPage, num2, bool, num3, num4, participant, conversationCoreInfo, conversationSettingInfo, i.EMPTY);
    }

    public ConversationInfoV2(String str, Long l2, Integer num, String str2, ParticipantsPage participantsPage, Integer num2, Boolean bool, Integer num3, Integer num4, Participant participant, ConversationCoreInfo conversationCoreInfo, ConversationSettingInfo conversationSettingInfo, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.ticket = str2;
        this.first_page_participants = participantsPage;
        this.participants_count = num2;
        this.is_participant = bool;
        this.inbox_type = num3;
        this.badge_count = num4;
        this.user_info = participant;
        this.conversation_core_info = conversationCoreInfo;
        this.conversation_setting_info = conversationSettingInfo;
    }
}

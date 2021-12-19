package com.bytedance.im.core.proto;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
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

public final class NewMessageNotify extends Message<NewMessageNotify, Builder> {
    public static final ProtoAdapter<NewMessageNotify> ADAPTER = new ProtoAdapter_NewMessageNotify();
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_CMD_MESSAGE_INDEX = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final NewMessageNotifyType DEFAULT_NOTIFY_TYPE = NewMessageNotifyType.PER_USER;
    public static final Long DEFAULT_PREVIOUS_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_PREVIOUS_CURSOR = 0L;
    public static final Long DEFAULT_PREVIOUS_MSG_INDEX_IN_CONV = 0L;
    public static final Long DEFAULT_PRE_READCONV_VERSION = 0L;
    public static final Long DEFAULT_READCONV_VERSION = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "badge_count")
    public final Integer badge_count;
    @c(a = "cmd_message_index")
    public final Long cmd_message_index;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "conversation_version")
    public final Long conversation_version;
    @c(a = "index_in_conversation")
    public final Long index_in_conversation;
    @c(a = "index_in_conversation_v2")
    public final Long index_in_conversation_v2;
    @c(a = "message")
    public final MessageBody message;
    @c(a = "mute_badge_count_info")
    public final MuteBadgeCountInfo mute_badge_count_info;
    @c(a = "next_cursor")
    public final Long next_cursor;
    @c(a = "notify_type")
    public final NewMessageNotifyType notify_type;
    @c(a = "pre_readconv_version")
    public final Long pre_readconv_version;
    @c(a = "previous_conversation_version")
    public final Long previous_conversation_version;
    @c(a = "previous_cursor")
    public final Long previous_cursor;
    @c(a = "previous_msg_index_in_conv")
    public final Long previous_msg_index_in_conv;
    @c(a = "readconv_version")
    public final Long readconv_version;
    @c(a = "ref_msg_info")
    public final ReferenceInfo ref_msg_info;
    @c(a = "trace")
    public final MsgTrace trace;

    static final class ProtoAdapter_NewMessageNotify extends ProtoAdapter<NewMessageNotify> {
        static {
            Covode.recordClassIndex(23655);
        }

        public ProtoAdapter_NewMessageNotify() {
            super(FieldEncoding.LENGTH_DELIMITED, NewMessageNotify.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.NewMessageNotify$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.NewMessageNotify redact(com.bytedance.im.core.proto.NewMessageNotify r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.NewMessageNotify$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.MessageBody r0 = r2.message
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r1 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.bytedance.im.core.proto.MessageBody r0 = r2.message
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.MessageBody r0 = (com.bytedance.im.core.proto.MessageBody) r0
                r2.message = r0
            L_0x0014:
                com.bytedance.im.core.proto.MsgTrace r0 = r2.trace
                if (r0 == 0) goto L_0x0024
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MsgTrace> r1 = com.bytedance.im.core.proto.MsgTrace.ADAPTER
                com.bytedance.im.core.proto.MsgTrace r0 = r2.trace
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.MsgTrace r0 = (com.bytedance.im.core.proto.MsgTrace) r0
                r2.trace = r0
            L_0x0024:
                com.bytedance.im.core.proto.ReferenceInfo r0 = r2.ref_msg_info
                if (r0 == 0) goto L_0x0034
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ReferenceInfo> r1 = com.bytedance.im.core.proto.ReferenceInfo.ADAPTER
                com.bytedance.im.core.proto.ReferenceInfo r0 = r2.ref_msg_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ReferenceInfo r0 = (com.bytedance.im.core.proto.ReferenceInfo) r0
                r2.ref_msg_info = r0
            L_0x0034:
                com.bytedance.im.core.proto.MuteBadgeCountInfo r0 = r2.mute_badge_count_info
                if (r0 == 0) goto L_0x0044
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MuteBadgeCountInfo> r1 = com.bytedance.im.core.proto.MuteBadgeCountInfo.ADAPTER
                com.bytedance.im.core.proto.MuteBadgeCountInfo r0 = r2.mute_badge_count_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.MuteBadgeCountInfo r0 = (com.bytedance.im.core.proto.MuteBadgeCountInfo) r0
                r2.mute_badge_count_info = r0
            L_0x0044:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.NewMessageNotify r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.NewMessageNotify.ProtoAdapter_NewMessageNotify.redact(com.bytedance.im.core.proto.NewMessageNotify):com.bytedance.im.core.proto.NewMessageNotify");
        }

        public final int encodedSize(NewMessageNotify newMessageNotify) {
            return ProtoAdapter.STRING.encodedSizeWithTag(2, newMessageNotify.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, newMessageNotify.conversation_type) + NewMessageNotifyType.ADAPTER.encodedSizeWithTag(4, newMessageNotify.notify_type) + MessageBody.ADAPTER.encodedSizeWithTag(5, newMessageNotify.message) + ProtoAdapter.INT64.encodedSizeWithTag(6, newMessageNotify.previous_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(7, newMessageNotify.next_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(8, newMessageNotify.index_in_conversation) + ProtoAdapter.INT64.encodedSizeWithTag(9, newMessageNotify.index_in_conversation_v2) + ProtoAdapter.INT64.encodedSizeWithTag(10, newMessageNotify.conversation_version) + ProtoAdapter.INT64.encodedSizeWithTag(11, newMessageNotify.previous_conversation_version) + ProtoAdapter.INT64.encodedSizeWithTag(12, newMessageNotify.cmd_message_index) + ProtoAdapter.INT32.encodedSizeWithTag(13, newMessageNotify.badge_count) + MsgTrace.ADAPTER.encodedSizeWithTag(14, newMessageNotify.trace) + ReferenceInfo.ADAPTER.encodedSizeWithTag(15, newMessageNotify.ref_msg_info) + ProtoAdapter.INT64.encodedSizeWithTag(16, newMessageNotify.previous_msg_index_in_conv) + ProtoAdapter.INT64.encodedSizeWithTag(17, newMessageNotify.readconv_version) + ProtoAdapter.INT64.encodedSizeWithTag(18, newMessageNotify.pre_readconv_version) + MuteBadgeCountInfo.ADAPTER.encodedSizeWithTag(19, newMessageNotify.mute_badge_count_info) + newMessageNotify.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final NewMessageNotify decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.notify_type(NewMessageNotifyType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.message(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.previous_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.index_in_conversation(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.index_in_conversation_v2(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.conversation_version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.previous_conversation_version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            builder.cmd_message_index(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            builder.badge_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            builder.trace(MsgTrace.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.ref_msg_info(ReferenceInfo.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.previous_msg_index_in_conv(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 17:
                            builder.readconv_version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.pre_readconv_version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 19:
                            builder.mute_badge_count_info(MuteBadgeCountInfo.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, NewMessageNotify newMessageNotify) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, newMessageNotify.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, newMessageNotify.conversation_type);
            NewMessageNotifyType.ADAPTER.encodeWithTag(protoWriter, 4, newMessageNotify.notify_type);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 5, newMessageNotify.message);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, newMessageNotify.previous_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, newMessageNotify.next_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, newMessageNotify.index_in_conversation);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, newMessageNotify.index_in_conversation_v2);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, newMessageNotify.conversation_version);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, newMessageNotify.previous_conversation_version);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, newMessageNotify.cmd_message_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, newMessageNotify.badge_count);
            MsgTrace.ADAPTER.encodeWithTag(protoWriter, 14, newMessageNotify.trace);
            ReferenceInfo.ADAPTER.encodeWithTag(protoWriter, 15, newMessageNotify.ref_msg_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 16, newMessageNotify.previous_msg_index_in_conv);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, newMessageNotify.readconv_version);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 18, newMessageNotify.pre_readconv_version);
            MuteBadgeCountInfo.ADAPTER.encodeWithTag(protoWriter, 19, newMessageNotify.mute_badge_count_info);
            protoWriter.writeBytes(newMessageNotify.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "NewMessageNotify" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23653);
    }

    public static final class Builder extends Message.Builder<NewMessageNotify, Builder> {
        public Integer badge_count;
        public Long cmd_message_index;
        public String conversation_id;
        public Integer conversation_type;
        public Long conversation_version;
        public Long index_in_conversation;
        public Long index_in_conversation_v2;
        public MessageBody message;
        public MuteBadgeCountInfo mute_badge_count_info;
        public Long next_cursor;
        public NewMessageNotifyType notify_type;
        public Long pre_readconv_version;
        public Long previous_conversation_version;
        public Long previous_cursor;
        public Long previous_msg_index_in_conv;
        public Long readconv_version;
        public ReferenceInfo ref_msg_info;
        public MsgTrace trace;

        static {
            Covode.recordClassIndex(23654);
        }

        @Override // com.squareup.wire.Message.Builder
        public final NewMessageNotify build() {
            return new NewMessageNotify(this.conversation_id, this.conversation_type, this.notify_type, this.message, this.previous_cursor, this.next_cursor, this.index_in_conversation, this.index_in_conversation_v2, this.conversation_version, this.previous_conversation_version, this.cmd_message_index, this.badge_count, this.trace, this.ref_msg_info, this.previous_msg_index_in_conv, this.readconv_version, this.pre_readconv_version, this.mute_badge_count_info, super.buildUnknownFields());
        }

        public final Builder badge_count(Integer num) {
            this.badge_count = num;
            return this;
        }

        public final Builder cmd_message_index(Long l2) {
            this.cmd_message_index = l2;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder conversation_version(Long l2) {
            this.conversation_version = l2;
            return this;
        }

        public final Builder index_in_conversation(Long l2) {
            this.index_in_conversation = l2;
            return this;
        }

        public final Builder index_in_conversation_v2(Long l2) {
            this.index_in_conversation_v2 = l2;
            return this;
        }

        public final Builder message(MessageBody messageBody) {
            this.message = messageBody;
            return this;
        }

        public final Builder mute_badge_count_info(MuteBadgeCountInfo muteBadgeCountInfo) {
            this.mute_badge_count_info = muteBadgeCountInfo;
            return this;
        }

        public final Builder next_cursor(Long l2) {
            this.next_cursor = l2;
            return this;
        }

        public final Builder notify_type(NewMessageNotifyType newMessageNotifyType) {
            this.notify_type = newMessageNotifyType;
            return this;
        }

        public final Builder pre_readconv_version(Long l2) {
            this.pre_readconv_version = l2;
            return this;
        }

        public final Builder previous_conversation_version(Long l2) {
            this.previous_conversation_version = l2;
            return this;
        }

        public final Builder previous_cursor(Long l2) {
            this.previous_cursor = l2;
            return this;
        }

        public final Builder previous_msg_index_in_conv(Long l2) {
            this.previous_msg_index_in_conv = l2;
            return this;
        }

        public final Builder readconv_version(Long l2) {
            this.readconv_version = l2;
            return this;
        }

        public final Builder ref_msg_info(ReferenceInfo referenceInfo) {
            this.ref_msg_info = referenceInfo;
            return this;
        }

        public final Builder trace(MsgTrace msgTrace) {
            this.trace = msgTrace;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.NewMessageNotify$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<NewMessageNotify, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.notify_type = this.notify_type;
        builder.message = this.message;
        builder.previous_cursor = this.previous_cursor;
        builder.next_cursor = this.next_cursor;
        builder.index_in_conversation = this.index_in_conversation;
        builder.index_in_conversation_v2 = this.index_in_conversation_v2;
        builder.conversation_version = this.conversation_version;
        builder.previous_conversation_version = this.previous_conversation_version;
        builder.cmd_message_index = this.cmd_message_index;
        builder.badge_count = this.badge_count;
        builder.trace = this.trace;
        builder.ref_msg_info = this.ref_msg_info;
        builder.previous_msg_index_in_conv = this.previous_msg_index_in_conv;
        builder.readconv_version = this.readconv_version;
        builder.pre_readconv_version = this.pre_readconv_version;
        builder.mute_badge_count_info = this.mute_badge_count_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public NewMessageNotify(String str, Integer num, NewMessageNotifyType newMessageNotifyType, MessageBody messageBody, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Integer num2, MsgTrace msgTrace, ReferenceInfo referenceInfo, Long l9, Long l10, Long l11, MuteBadgeCountInfo muteBadgeCountInfo) {
        this(str, num, newMessageNotifyType, messageBody, l2, l3, l4, l5, l6, l7, l8, num2, msgTrace, referenceInfo, l9, l10, l11, muteBadgeCountInfo, i.EMPTY);
    }

    public NewMessageNotify(String str, Integer num, NewMessageNotifyType newMessageNotifyType, MessageBody messageBody, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Integer num2, MsgTrace msgTrace, ReferenceInfo referenceInfo, Long l9, Long l10, Long l11, MuteBadgeCountInfo muteBadgeCountInfo, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.notify_type = newMessageNotifyType;
        this.message = messageBody;
        this.previous_cursor = l2;
        this.next_cursor = l3;
        this.index_in_conversation = l4;
        this.index_in_conversation_v2 = l5;
        this.conversation_version = l6;
        this.previous_conversation_version = l7;
        this.cmd_message_index = l8;
        this.badge_count = num2;
        this.trace = msgTrace;
        this.ref_msg_info = referenceInfo;
        this.previous_msg_index_in_conv = l9;
        this.readconv_version = l10;
        this.pre_readconv_version = l11;
        this.mute_badge_count_info = muteBadgeCountInfo;
    }
}

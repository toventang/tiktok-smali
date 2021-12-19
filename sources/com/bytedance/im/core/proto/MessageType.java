package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MessageType implements WireEnum {
    MESSAGE_TYPE_NOT_USED(0),
    LEGACY_MESSAGE_TYPE_SYSTEM(1),
    LEGACY_MESSAGE_TYPE_IMAGE(2),
    LEGACY_MESSAGE_TYPE_AUDIO(3),
    LEGACY_MESSAGE_TYPE_VIDEO(4),
    LEGACY_MESSAGE_TYPE_EMOJI(5),
    LEGACY_MESSAGE_TYPE_FILE(6),
    LEGACY_MESSAGE_TYPE_TEXT(7),
    LEGACY_MESSAGE_TYPE_USER_CARD(8),
    LEGACY_MESSAGE_TYPE_TOAST(9),
    LEGACY_MESSAGE_TYPE_GROUP_CARD(10),
    MESSAGE_TYPE_TEXT(10001),
    MESSAGE_TYPE_STICKER(10002),
    MESSAGE_TYPE_IMAGE(10003),
    MESSAGE_TYPE_VIDEO(10004),
    MESSAGE_TYPE_FILE(10005),
    MESSAGE_TYPE_AUDIO(10006),
    MESSAGE_TYPE_LOCATION(10007),
    MESSAGE_TYPE_SYSTEM(10008),
    MESSAGE_TYPE_LINK(10009),
    MESSAGE_TYPE_GSDK_AUDIO(10011),
    MESSAGE_TYPE_COMMAND(50001),
    MESSAGE_TYPE_UPDATE_MESSAGE_EXT(50002),
    MESSAGE_TYPE_MODE_CHANGE(50010),
    MESSAGE_TYPE_UPDATE_MIN_INDEX(50003),
    MESSAGE_TYPE_USER_ACTION(50004),
    MESSAGE_TYPE_CONVERSATION_DESTROY(50005),
    MESSAGE_TYPE_BLOCK_COMMAND(50011),
    MESSAGE_TYPE_MARK_COMMAND(50012),
    MESSAGE_TYPE_READ_COMMAND(50013),
    MESSAGE_TYPE_SEND_FAILED_RESP(50014),
    MESSAGE_TYPE_NOTIFY_STRANGER(50015),
    MESSAGE_TYPE_BATCH_UNMARK_COMMAND(50016),
    MESSAGE_TYPE_VISIBLE_MESSAGE_COMMAND(50017),
    MESSAGE_TYPE_NOTIFY_COMMAND(60001),
    MESSAGE_TYPE_MESSAGE_PROPERTY(70001),
    MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY(70002),
    MESSAGE_TYPE_VOIP_COMMAND(80001),
    MESSAGE_TYPE_VOIP_CARD_COMMAND(80002),
    MESSAGE_TYPE_VOIP_SINGLE_CHAT_STATUS_COMMAND(80003),
    MESSAGE_TYPE_VOIP_CALLEE_LIST_UPDATE_NOTIFY(80004),
    MESSAGE_TYPE_VOIP_ROOM_DISMISS_NOTIFY(80005),
    MESSAGE_TYPE_CONVERSATION_APPLY_NOTIFY(90001),
    MESSAGE_TYPE_CONVERSATION_AUDIT_ACK_NOTIFY(90002);
    
    public static final ProtoAdapter<MessageType> ADAPTER = new ProtoAdapter_MessageType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_MessageType extends EnumAdapter<MessageType> {
        static {
            Covode.recordClassIndex(23601);
        }

        ProtoAdapter_MessageType() {
            super(MessageType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MessageType fromValue(int i2) {
            return MessageType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23600);
    }

    public static MessageType fromValue(int i2) {
        if (i2 == 10011) {
            return MESSAGE_TYPE_GSDK_AUDIO;
        }
        if (i2 == 60001) {
            return MESSAGE_TYPE_NOTIFY_COMMAND;
        }
        switch (i2) {
            case 0:
                return MESSAGE_TYPE_NOT_USED;
            case 1:
                return LEGACY_MESSAGE_TYPE_SYSTEM;
            case 2:
                return LEGACY_MESSAGE_TYPE_IMAGE;
            case 3:
                return LEGACY_MESSAGE_TYPE_AUDIO;
            case 4:
                return LEGACY_MESSAGE_TYPE_VIDEO;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return LEGACY_MESSAGE_TYPE_EMOJI;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return LEGACY_MESSAGE_TYPE_FILE;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return LEGACY_MESSAGE_TYPE_TEXT;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return LEGACY_MESSAGE_TYPE_USER_CARD;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return LEGACY_MESSAGE_TYPE_TOAST;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return LEGACY_MESSAGE_TYPE_GROUP_CARD;
            default:
                switch (i2) {
                    case 10001:
                        return MESSAGE_TYPE_TEXT;
                    case 10002:
                        return MESSAGE_TYPE_STICKER;
                    case 10003:
                        return MESSAGE_TYPE_IMAGE;
                    case 10004:
                        return MESSAGE_TYPE_VIDEO;
                    case 10005:
                        return MESSAGE_TYPE_FILE;
                    case 10006:
                        return MESSAGE_TYPE_AUDIO;
                    case 10007:
                        return MESSAGE_TYPE_LOCATION;
                    case 10008:
                        return MESSAGE_TYPE_SYSTEM;
                    case 10009:
                        return MESSAGE_TYPE_LINK;
                    default:
                        switch (i2) {
                            case 50001:
                                return MESSAGE_TYPE_COMMAND;
                            case 50002:
                                return MESSAGE_TYPE_UPDATE_MESSAGE_EXT;
                            case 50003:
                                return MESSAGE_TYPE_UPDATE_MIN_INDEX;
                            case 50004:
                                return MESSAGE_TYPE_USER_ACTION;
                            case 50005:
                                return MESSAGE_TYPE_CONVERSATION_DESTROY;
                            default:
                                switch (i2) {
                                    case 50010:
                                        return MESSAGE_TYPE_MODE_CHANGE;
                                    case 50011:
                                        return MESSAGE_TYPE_BLOCK_COMMAND;
                                    case 50012:
                                        return MESSAGE_TYPE_MARK_COMMAND;
                                    case 50013:
                                        return MESSAGE_TYPE_READ_COMMAND;
                                    case 50014:
                                        return MESSAGE_TYPE_SEND_FAILED_RESP;
                                    case 50015:
                                        return MESSAGE_TYPE_NOTIFY_STRANGER;
                                    case 50016:
                                        return MESSAGE_TYPE_BATCH_UNMARK_COMMAND;
                                    case 50017:
                                        return MESSAGE_TYPE_VISIBLE_MESSAGE_COMMAND;
                                    default:
                                        switch (i2) {
                                            case 70001:
                                                return MESSAGE_TYPE_MESSAGE_PROPERTY;
                                            case 70002:
                                                return MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY;
                                            default:
                                                switch (i2) {
                                                    case 80001:
                                                        return MESSAGE_TYPE_VOIP_COMMAND;
                                                    case 80002:
                                                        return MESSAGE_TYPE_VOIP_CARD_COMMAND;
                                                    case 80003:
                                                        return MESSAGE_TYPE_VOIP_SINGLE_CHAT_STATUS_COMMAND;
                                                    case 80004:
                                                        return MESSAGE_TYPE_VOIP_CALLEE_LIST_UPDATE_NOTIFY;
                                                    case 80005:
                                                        return MESSAGE_TYPE_VOIP_ROOM_DISMISS_NOTIFY;
                                                    default:
                                                        switch (i2) {
                                                            case 90001:
                                                                return MESSAGE_TYPE_CONVERSATION_APPLY_NOTIFY;
                                                            case 90002:
                                                                return MESSAGE_TYPE_CONVERSATION_AUDIT_ACK_NOTIFY;
                                                            default:
                                                                return null;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private MessageType(int i2) {
        this.value = i2;
    }
}

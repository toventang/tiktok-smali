package com.bytedance.im.core.proto;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.c.a;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum IMCMD implements WireEnum {
    IMCMD_NOT_USED(0),
    SEND_MESSAGE(100),
    GET_MESSAGES_BY_USER(200),
    GET_MESSAGES_BY_USER_INIT(201),
    REPORT_GET_MESSAGES_CURSOR(202),
    GET_MESSAGES_BY_USER_INIT_V2(203),
    CHECK_MESSAGES_BY_USER(210),
    GET_MESSAGE_INFO_BY_SERVER_ID(211),
    GET_CONVERSATION_LIST(300),
    GET_MESSAGES_BY_CONVERSATION(301),
    GET_MESSAGES_CHECKINFO_IN_CONVERSATION(302),
    SEND_ONLINE(400),
    SEND_OFFLINE(401),
    SEND_CLIENT_FOREGROUND(402),
    SEND_CLIENT_BACKGROUND(403),
    SEND_USER_ACTION(410),
    SEND_INPUT_STATUS(411),
    NEW_MSG_NOTIFY(500),
    MARK_READ_NOTIFY(501),
    CONVERSATION_INFO_UPDATED_NOTIFY(502),
    NEW_P2P_MSG_NOTIFY(504),
    NEW_BROADCAST_MSG_NOTIFY(505),
    NEW_BROADCAST_CMD_MSG_NOTIFY(506),
    NEW_PREVIEW_MSG_NOTIFY(507),
    NEW_FRIEND_MSG_NOTIFY(508),
    GET_CONVERSATION_INFO(600),
    SET_CONVERSATION_INFO(601),
    CREATE_CONVERSATION(602),
    MARK_CONVERSATION_DELETE(603),
    MARK_CONVERSATION_READ(604),
    GET_CONVERSATION_INFO_LIST(607),
    GET_CONVERSATION_INFO_V2(608),
    CREATE_CONVERSATION_V2(609),
    GET_CONVERSATION_INFO_LIST_V2(610),
    GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2(611),
    GET_CONVERSATION_INFO_LIST_BY_TOP_V2(612),
    BATCH_MARK_CONVERSATION_READ(613),
    DISSOLVE_CONVERSATION(614),
    GET_CONVERSATIONS_CHECKINFO(615),
    CONVERSATION_PARTICIPANTS_LIST(605),
    ADD_CONVERSATION_PARTICIPANTS(650),
    REMOVE_CONVERSATION_PARTICIPANTS(651),
    LEAVE_CONVERSATION(652),
    CONVERSATION_SET_ROLE(653),
    MGET_CONVERSATION_PARTICIPANTS(654),
    UPDATE_CONVERSATION_PARTICIPANT(655),
    BATCH_UPDATE_CONVERSATION_PARTICIPANT(656),
    DELETE_MESSAGE(701),
    RECALL_MESSAGE(702),
    REACTION_MESSAGE(703),
    SYNC_MESSAGE(704),
    SET_MESSAGE_PROPERTY(705),
    GET_GROUP_INFO(801),
    SET_GROUP_INFO(802),
    GET_GROUP_INFO_LIST(803),
    GET_CONVERSATION_CORE_INFO(901),
    SET_CONVERSATION_CORE_INFO(902),
    GET_CONVERSATION_CORE_INFO_LIST(903),
    UPSERT_CONVERSATION_CORE_EXT_INFO(904),
    GET_CONVERSATION_SETTING_INFO(920),
    SET_CONVERSATION_SETTING_INFO(921),
    UPSERT_CONVERSATION_SETTING_EXT_INFO(922),
    GET_STRANGER_CONVERSATION_LIST(1001),
    GET_STRANGER_MESSAGES_IN_CONVERSATION(1002),
    DELETE_STRANGER_MESSAGE(1003),
    DELETE_STRANGER_CONVERSATION(1004),
    DELETE_ALL_STRANGER_CONVERSATIONS(1005),
    MARK_STRANGER_CONVERSATION_READ(1006),
    MARK_ALL_STRANGER_CONVERSATIONS_READ(1007),
    GET_STRANGER_UNREAD_COUNT(1008),
    STRANGER_NEW_MSG_NOTIFY(1099),
    GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3(LiveNetAdaptiveHurryTimeSetting.DEFAULT),
    GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3(2001),
    MARK_CONVERSATION_READ_V3(2002),
    GET_MEDIA_UPLOAD_TOKEN(2003),
    GET_MEDIA_URLS(2004),
    GET_TICKET(2005),
    GET_USER_CONVERSATION_LIST(2006),
    BROADCAST_SEND_MESSAGE(2007),
    BROADCAST_RECV_MESSAGE(2008),
    BROADCAST_USER_COUNTER(2009),
    CLIENT_ACK(2010),
    CREATE_VOIP(2011),
    CALL_VOIP(2012),
    UPDATE_VOIP(2013),
    HEARTBEAT_CHANNEL(2014),
    PROFILE_GET_INFO(2015),
    REPORT_CLIENT_METRICS(2016),
    GET_CONFIGS(2017),
    UNREAD_COUNT_REPORT(2018),
    BLOCK_MEMBERS(2019),
    BLOCK_CONVERSATION(2020),
    MODIFY_MESSAGE_EXT(2021),
    GET_CONVERSATION_AUDIT_SWITCH(2022),
    UPDATE_CONVERSATION_AUDIT_SWITCH(2023),
    SEND_CONVERSATION_APPLY(2024),
    ACK_CONVERSATION_APPLY(2025),
    GET_CONVERSATION_APPLY(2026),
    GET_CONVERSATION_AUDIT_LIST(2027),
    GET_CONVERSATION_AUDIT_UNREAD(2028),
    CLEAR_CONVERSATION_AUDIT_UNREAD(2029),
    GET_UNREAD_COUNT(2030),
    SEND_MESSAGE_P2P(2031),
    GET_BLOCKLIST(2032),
    SET_BLOCKLIST(2033),
    CHECK_IN_BLOCKLIST(2034),
    GET_MESSAGE_INFO_BY_INDEX_V2(2035),
    MARK_MESSAGE(2036),
    PULL_MARK_MESSAGE(2037),
    BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX(2038),
    GET_RECENT_MESSAGE(2039),
    GET_CMD_MESSAGE(2040),
    GET_MESSAGE_INFO_BY_INDEX_V2_RANGE(2041),
    BATCH_GET_CONVERSATION_AUDIT_UNREAD(2042),
    GET_MESSAGE_BY_INIT(2043),
    PREVIEWER_GET_MESSAGES_BY_CONVERSATION(2044),
    PREVIEWER_GET_CONVERSATION_INFO_LIST(2045),
    SEND_FRIEND_APPLY(2046),
    GET_FRIEND_APPLY_LIST(2047),
    GET_FRIEND_RECEIVE_APPLY_LIST(2048),
    REPLY_FRIEND_APPLY(2049),
    GET_FRIEND_LIST(2050),
    DELETE_FRIEND(2051),
    PROFILE_BATCH_GET_INFO(2052),
    PROFILE_SEARCH_INFO(2053),
    MARK_MSG_UNREAD_COUNT_REPORT(2054),
    MARK_MSG_GET_UNREAD_COUNT(2055),
    BATCH_UNMARK_MESSAGE(2056),
    CLIENT_BATCH_ACK(2057),
    GLOBAL_MESSAGE_SEARCH(2100),
    GLOBAL_GROUP_SEARCH(2101),
    CONVERSATION_MESSAGE_SEARCH(2102),
    CONVERSATION_MESSAGE_PRE_VIEW(2103),
    VCD_CLEAN(9999);
    
    public static final ProtoAdapter<IMCMD> ADAPTER = new ProtoAdapter_IMCMD();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(23531);
    }

    static final class ProtoAdapter_IMCMD extends EnumAdapter<IMCMD> {
        static {
            Covode.recordClassIndex(23532);
        }

        ProtoAdapter_IMCMD() {
            super(IMCMD.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final IMCMD fromValue(int i2) {
            return IMCMD.fromValue(i2);
        }
    }

    public static IMCMD fromValue(int i2) {
        if (i2 == 0) {
            return IMCMD_NOT_USED;
        }
        if (i2 == 210) {
            return CHECK_MESSAGES_BY_USER;
        }
        if (i2 == 211) {
            return GET_MESSAGE_INFO_BY_SERVER_ID;
        }
        if (i2 == 410) {
            return SEND_USER_ACTION;
        }
        if (i2 == 411) {
            return SEND_INPUT_STATUS;
        }
        switch (i2) {
            case a.f41622a:
                return SEND_MESSAGE;
            case 607:
                return GET_CONVERSATION_INFO_LIST;
            case 608:
                return GET_CONVERSATION_INFO_V2;
            case 609:
                return CREATE_CONVERSATION_V2;
            case 610:
                return GET_CONVERSATION_INFO_LIST_V2;
            case 611:
                return GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2;
            case 612:
                return GET_CONVERSATION_INFO_LIST_BY_TOP_V2;
            case 613:
                return BATCH_MARK_CONVERSATION_READ;
            case 614:
                return DISSOLVE_CONVERSATION;
            case 615:
                return GET_CONVERSATIONS_CHECKINFO;
            case 701:
                return DELETE_MESSAGE;
            case 702:
                return RECALL_MESSAGE;
            case 703:
                return REACTION_MESSAGE;
            case 704:
                return SYNC_MESSAGE;
            case 705:
                return SET_MESSAGE_PROPERTY;
            case 801:
                return GET_GROUP_INFO;
            case 802:
                return SET_GROUP_INFO;
            case 803:
                return GET_GROUP_INFO_LIST;
            case 901:
                return GET_CONVERSATION_CORE_INFO;
            case 902:
                return SET_CONVERSATION_CORE_INFO;
            case 903:
                return GET_CONVERSATION_CORE_INFO_LIST;
            case 904:
                return UPSERT_CONVERSATION_CORE_EXT_INFO;
            case 920:
                return GET_CONVERSATION_SETTING_INFO;
            case 921:
                return SET_CONVERSATION_SETTING_INFO;
            case 922:
                return UPSERT_CONVERSATION_SETTING_EXT_INFO;
            case 1001:
                return GET_STRANGER_CONVERSATION_LIST;
            case 1002:
                return GET_STRANGER_MESSAGES_IN_CONVERSATION;
            case 1003:
                return DELETE_STRANGER_MESSAGE;
            case 1004:
                return DELETE_STRANGER_CONVERSATION;
            case 1005:
                return DELETE_ALL_STRANGER_CONVERSATIONS;
            case 1006:
                return MARK_STRANGER_CONVERSATION_READ;
            case 1007:
                return MARK_ALL_STRANGER_CONVERSATIONS_READ;
            case 1008:
                return GET_STRANGER_UNREAD_COUNT;
            case 1099:
                return STRANGER_NEW_MSG_NOTIFY;
            case LiveNetAdaptiveHurryTimeSetting.DEFAULT:
                return GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3;
            case 2001:
                return GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3;
            case 2002:
                return MARK_CONVERSATION_READ_V3;
            case 2003:
                return GET_MEDIA_UPLOAD_TOKEN;
            case 2004:
                return GET_MEDIA_URLS;
            case 2005:
                return GET_TICKET;
            case 2006:
                return GET_USER_CONVERSATION_LIST;
            case 2007:
                return BROADCAST_SEND_MESSAGE;
            case 2008:
                return BROADCAST_RECV_MESSAGE;
            case 2009:
                return BROADCAST_USER_COUNTER;
            case 2010:
                return CLIENT_ACK;
            case 2011:
                return CREATE_VOIP;
            case 2012:
                return CALL_VOIP;
            case 2013:
                return UPDATE_VOIP;
            case 2014:
                return HEARTBEAT_CHANNEL;
            case 2015:
                return PROFILE_GET_INFO;
            case 2016:
                return REPORT_CLIENT_METRICS;
            case 2017:
                return GET_CONFIGS;
            case 2018:
                return UNREAD_COUNT_REPORT;
            case 2019:
                return BLOCK_MEMBERS;
            case 2020:
                return BLOCK_CONVERSATION;
            case 2021:
                return MODIFY_MESSAGE_EXT;
            case 2022:
                return GET_CONVERSATION_AUDIT_SWITCH;
            case 2023:
                return UPDATE_CONVERSATION_AUDIT_SWITCH;
            case 2024:
                return SEND_CONVERSATION_APPLY;
            case 2025:
                return ACK_CONVERSATION_APPLY;
            case 2026:
                return GET_CONVERSATION_APPLY;
            case 2027:
                return GET_CONVERSATION_AUDIT_LIST;
            case 2028:
                return GET_CONVERSATION_AUDIT_UNREAD;
            case 2029:
                return CLEAR_CONVERSATION_AUDIT_UNREAD;
            case 2030:
                return GET_UNREAD_COUNT;
            case 2031:
                return SEND_MESSAGE_P2P;
            case 2032:
                return GET_BLOCKLIST;
            case 2033:
                return SET_BLOCKLIST;
            case 2034:
                return CHECK_IN_BLOCKLIST;
            case 2035:
                return GET_MESSAGE_INFO_BY_INDEX_V2;
            case 2036:
                return MARK_MESSAGE;
            case 2037:
                return PULL_MARK_MESSAGE;
            case 2038:
                return BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX;
            case 2039:
                return GET_RECENT_MESSAGE;
            case 2040:
                return GET_CMD_MESSAGE;
            case 2041:
                return GET_MESSAGE_INFO_BY_INDEX_V2_RANGE;
            case 2042:
                return BATCH_GET_CONVERSATION_AUDIT_UNREAD;
            case 2043:
                return GET_MESSAGE_BY_INIT;
            case 2044:
                return PREVIEWER_GET_MESSAGES_BY_CONVERSATION;
            case 2045:
                return PREVIEWER_GET_CONVERSATION_INFO_LIST;
            case 2046:
                return SEND_FRIEND_APPLY;
            case 2047:
                return GET_FRIEND_APPLY_LIST;
            case 2048:
                return GET_FRIEND_RECEIVE_APPLY_LIST;
            case 2049:
                return REPLY_FRIEND_APPLY;
            case 2050:
                return GET_FRIEND_LIST;
            case 2051:
                return DELETE_FRIEND;
            case 2052:
                return PROFILE_BATCH_GET_INFO;
            case 2053:
                return PROFILE_SEARCH_INFO;
            case 2054:
                return MARK_MSG_UNREAD_COUNT_REPORT;
            case 2055:
                return MARK_MSG_GET_UNREAD_COUNT;
            case 2056:
                return BATCH_UNMARK_MESSAGE;
            case 2057:
                return CLIENT_BATCH_ACK;
            case 2100:
                return GLOBAL_MESSAGE_SEARCH;
            case 2101:
                return GLOBAL_GROUP_SEARCH;
            case 2102:
                return CONVERSATION_MESSAGE_SEARCH;
            case 2103:
                return CONVERSATION_MESSAGE_PRE_VIEW;
            case 9999:
                return VCD_CLEAN;
            default:
                switch (i2) {
                    case 200:
                        return GET_MESSAGES_BY_USER;
                    case 201:
                        return GET_MESSAGES_BY_USER_INIT;
                    case 202:
                        return REPORT_GET_MESSAGES_CURSOR;
                    case 203:
                        return GET_MESSAGES_BY_USER_INIT_V2;
                    default:
                        switch (i2) {
                            case 300:
                                return GET_CONVERSATION_LIST;
                            case 301:
                                return GET_MESSAGES_BY_CONVERSATION;
                            case 302:
                                return GET_MESSAGES_CHECKINFO_IN_CONVERSATION;
                            default:
                                switch (i2) {
                                    case 400:
                                        return SEND_ONLINE;
                                    case 401:
                                        return SEND_OFFLINE;
                                    case 402:
                                        return SEND_CLIENT_FOREGROUND;
                                    case 403:
                                        return SEND_CLIENT_BACKGROUND;
                                    default:
                                        switch (i2) {
                                            case 500:
                                                return NEW_MSG_NOTIFY;
                                            case 501:
                                                return MARK_READ_NOTIFY;
                                            case 502:
                                                return CONVERSATION_INFO_UPDATED_NOTIFY;
                                            default:
                                                switch (i2) {
                                                    case 504:
                                                        return NEW_P2P_MSG_NOTIFY;
                                                    case 505:
                                                        return NEW_BROADCAST_MSG_NOTIFY;
                                                    case 506:
                                                        return NEW_BROADCAST_CMD_MSG_NOTIFY;
                                                    case 507:
                                                        return NEW_PREVIEW_MSG_NOTIFY;
                                                    case 508:
                                                        return NEW_FRIEND_MSG_NOTIFY;
                                                    default:
                                                        switch (i2) {
                                                            case 600:
                                                                return GET_CONVERSATION_INFO;
                                                            case 601:
                                                                return SET_CONVERSATION_INFO;
                                                            case 602:
                                                                return CREATE_CONVERSATION;
                                                            case 603:
                                                                return MARK_CONVERSATION_DELETE;
                                                            case 604:
                                                                return MARK_CONVERSATION_READ;
                                                            case 605:
                                                                return CONVERSATION_PARTICIPANTS_LIST;
                                                            default:
                                                                switch (i2) {
                                                                    case 650:
                                                                        return ADD_CONVERSATION_PARTICIPANTS;
                                                                    case 651:
                                                                        return REMOVE_CONVERSATION_PARTICIPANTS;
                                                                    case 652:
                                                                        return LEAVE_CONVERSATION;
                                                                    case 653:
                                                                        return CONVERSATION_SET_ROLE;
                                                                    case 654:
                                                                        return MGET_CONVERSATION_PARTICIPANTS;
                                                                    case 655:
                                                                        return UPDATE_CONVERSATION_PARTICIPANT;
                                                                    case 656:
                                                                        return BATCH_UPDATE_CONVERSATION_PARTICIPANT;
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
    }

    private IMCMD(int i2) {
        this.value = i2;
    }
}

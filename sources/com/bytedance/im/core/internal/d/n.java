package com.bytedance.im.core.internal.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.internal.d.a.b;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Objects;

public final class n {
    static {
        Covode.recordClassIndex(23106);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.im.core.internal.d.n$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f38734a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 126
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.d.n.AnonymousClass1.<clinit>():void");
        }
    }

    static b.a a(Integer num) {
        if (num == null) {
            return null;
        }
        try {
            String a2 = a(num.intValue());
            b.a aVar = new b.a();
            aVar.f38702a.f38697a = d.a().b().f37600h + a2;
            aVar.f38702a.f38698b = a2;
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(int i2) {
        IMCMD fromValue = IMCMD.fromValue(i2);
        Objects.requireNonNull(fromValue, "cmd is null");
        if (fromValue == IMCMD.SEND_MESSAGE) {
            return "v1/message/send";
        }
        if (fromValue == IMCMD.REACTION_MESSAGE) {
            return "v1/message/reaction";
        }
        if (fromValue == IMCMD.GET_MESSAGES_BY_USER) {
            return "v1/message/get_by_user";
        }
        if (fromValue == IMCMD.REPORT_GET_MESSAGES_CURSOR) {
            return "v1/message/report_cursor";
        }
        if (fromValue == IMCMD.GET_MESSAGES_BY_USER_INIT_V2) {
            return "v2/message/get_by_user_init";
        }
        if (fromValue == IMCMD.CHECK_MESSAGES_BY_USER) {
            return "v1/message/check_by_user";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_LIST) {
            return "v1/conversation/get_list";
        }
        if (fromValue == IMCMD.GET_MESSAGES_BY_CONVERSATION) {
            return "v1/message/get_by_conversation";
        }
        if (fromValue == IMCMD.SEND_ONLINE) {
            return "v1/account/online";
        }
        if (fromValue == IMCMD.SEND_OFFLINE) {
            return "v1/account/offline";
        }
        if (fromValue == IMCMD.MARK_CONVERSATION_DELETE) {
            return "v1/conversation/delete";
        }
        if (fromValue == IMCMD.MARK_CONVERSATION_READ) {
            return "v1/conversation/mark_read";
        }
        if (fromValue == IMCMD.BATCH_MARK_CONVERSATION_READ) {
            return "v2/conversation/batch_mark_read";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_INFO_V2) {
            return "v2/conversation/get_info";
        }
        if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
            return "v2/conversation/create";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_INFO_LIST_V2) {
            return "v2/conversation/get_info_list";
        }
        if (fromValue == IMCMD.CONVERSATION_PARTICIPANTS_LIST) {
            return "v1/conversation/participants_list";
        }
        if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
            return "v1/conversation/add_participants";
        }
        if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
            return "v1/conversation/remove_participants";
        }
        if (fromValue == IMCMD.LEAVE_CONVERSATION) {
            return "v1/conversation/leave";
        }
        if (fromValue == IMCMD.MGET_CONVERSATION_PARTICIPANTS) {
            return "v1/conversation/mget_participants";
        }
        if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
            return "v1/conversation/update_participant";
        }
        if (fromValue == IMCMD.DELETE_MESSAGE) {
            return "v1/message/delete";
        }
        if (fromValue == IMCMD.RECALL_MESSAGE) {
            return "v1/message/recall";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_CORE_INFO) {
            return "v1/conversation/get_core_info";
        }
        if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
            return "v1/conversation/set_core_info";
        }
        if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
            return "v1/conversation/upsert_core_ext_info";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_SETTING_INFO) {
            return "v1/conversation/get_setting_info";
        }
        if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
            return "v1/conversation/set_setting_info";
        }
        if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
            return "v1/conversation/upsert_settings_ext";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2) {
            return "v2/conversation/get_by_favorite";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_INFO_LIST_BY_TOP_V2) {
            return "v2/conversation/get_by_top";
        }
        if (fromValue == IMCMD.GET_STRANGER_CONVERSATION_LIST) {
            return "v1/stranger/get_conversation_list";
        }
        if (fromValue == IMCMD.GET_STRANGER_MESSAGES_IN_CONVERSATION) {
            return "v1/stranger/get_messages";
        }
        if (fromValue == IMCMD.DELETE_STRANGER_MESSAGE) {
            return "v1/stranger/delete_message";
        }
        if (fromValue == IMCMD.DELETE_STRANGER_CONVERSATION) {
            return "v1/stranger/delete_conversation";
        }
        if (fromValue == IMCMD.DELETE_ALL_STRANGER_CONVERSATIONS) {
            return "v1/stranger/delete_all_conversations";
        }
        if (fromValue == IMCMD.MARK_STRANGER_CONVERSATION_READ) {
            return "v1/stranger/mark_read_conversation";
        }
        if (fromValue == IMCMD.MARK_ALL_STRANGER_CONVERSATIONS_READ) {
            return "v1/stranger/mark_read_all_conversations";
        }
        if (fromValue == IMCMD.SEND_USER_ACTION) {
            return "v1/client/user_action";
        }
        if (fromValue == IMCMD.SEND_INPUT_STATUS) {
            return "v1/client/input_status";
        }
        if (fromValue == IMCMD.DISSOLVE_CONVERSATION) {
            return "v1/conversation/dissolve";
        }
        if (fromValue == IMCMD.SET_MESSAGE_PROPERTY) {
            return "v1/message/set_property";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3) {
            return "v3/conversation/get_read_index";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3) {
            return "v3/conversation/get_min_index";
        }
        if (fromValue == IMCMD.MARK_CONVERSATION_READ_V3) {
            return "v3/conversation/mark_read";
        }
        if (fromValue == IMCMD.GET_MEDIA_UPLOAD_TOKEN) {
            return "v1/media/get_upload_token";
        }
        if (fromValue == IMCMD.GET_MEDIA_URLS) {
            return "v1/media/get_urls";
        }
        if (fromValue == IMCMD.GET_USER_CONVERSATION_LIST) {
            return "v1/conversation/list";
        }
        if (fromValue == IMCMD.BROADCAST_SEND_MESSAGE) {
            return "v1/broadcast/send_message";
        }
        if (fromValue == IMCMD.BROADCAST_RECV_MESSAGE) {
            return "v1/broadcast/recv_message";
        }
        if (fromValue == IMCMD.BROADCAST_USER_COUNTER) {
            return "v1/broadcast/user_counter";
        }
        if (fromValue == IMCMD.CLIENT_ACK) {
            return "v1/client/ack";
        }
        if (fromValue == IMCMD.PROFILE_GET_INFO) {
            return "v1/profile/get_info";
        }
        if (fromValue == IMCMD.CREATE_VOIP) {
            return "v1/voip/create";
        }
        if (fromValue == IMCMD.CALL_VOIP) {
            return "v1/voip/call";
        }
        if (fromValue == IMCMD.UPDATE_VOIP) {
            return "v1/voip/update";
        }
        if (fromValue == IMCMD.HEARTBEAT_CHANNEL) {
            return "v1/channel/heartbeat";
        }
        if (fromValue == IMCMD.GET_CONVERSATIONS_CHECKINFO) {
            return "v1/conversation/get_checkinfo";
        }
        if (fromValue == IMCMD.GET_MESSAGES_CHECKINFO_IN_CONVERSATION) {
            return "v1/message/get_checkinfo";
        }
        if (fromValue == IMCMD.REPORT_CLIENT_METRICS) {
            return "v1/client/report_metrics";
        }
        if (fromValue == IMCMD.GET_CONFIGS) {
            return "v1/config/get";
        }
        if (fromValue == IMCMD.UNREAD_COUNT_REPORT) {
            return "v1/client/unread_count";
        }
        if (fromValue == IMCMD.BATCH_UPDATE_CONVERSATION_PARTICIPANT) {
            return "v1/conversation/batch_update_participant";
        }
        if (fromValue == IMCMD.GET_TICKET) {
            return "v1/conversation/get_ticket";
        }
        if (fromValue == IMCMD.BLOCK_MEMBERS) {
            return "v1/conversation/block_member";
        }
        if (fromValue == IMCMD.BLOCK_CONVERSATION) {
            return "v1/conversation/block_conversation";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_AUDIT_SWITCH) {
            return "v1/conversation/get_audit";
        }
        if (fromValue == IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH) {
            return "v1/conversation/update_audit";
        }
        if (fromValue == IMCMD.SEND_CONVERSATION_APPLY) {
            return "v1/conversation/send_apply";
        }
        if (fromValue == IMCMD.ACK_CONVERSATION_APPLY) {
            return "v1/conversation/ack_apply";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_AUDIT_LIST) {
            return "v1/conversation/get_audit_list";
        }
        if (fromValue == IMCMD.GET_CONVERSATION_AUDIT_UNREAD) {
            return "v1/conversation/get_audit_unread";
        }
        if (fromValue == IMCMD.CLEAR_CONVERSATION_AUDIT_UNREAD) {
            return "v1/conversation/clear_audit_unread";
        }
        if (fromValue == IMCMD.SEND_MESSAGE_P2P) {
            return "v1/send_message/p2p";
        }
        if (fromValue == IMCMD.GET_BLOCKLIST) {
            return "v1/blacklist/get";
        }
        if (fromValue == IMCMD.SET_BLOCKLIST) {
            return "v1/blacklist/set";
        }
        if (fromValue == IMCMD.CHECK_IN_BLOCKLIST) {
            return "v1/blacklist/check";
        }
        if (fromValue == IMCMD.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX) {
            return "v1/conversation/batch_get_conversation_participants_readindex";
        }
        if (fromValue == IMCMD.MARK_MESSAGE) {
            return "v1/message/mark";
        }
        if (fromValue == IMCMD.PULL_MARK_MESSAGE) {
            return "v1/message/pull_mark";
        }
        if (fromValue == IMCMD.GET_RECENT_MESSAGE) {
            return "v1/message/get_recent_message/";
        }
        if (fromValue == IMCMD.GET_CMD_MESSAGE) {
            return "v1/message/get_cmd_message/";
        }
        if (fromValue == IMCMD.GET_MESSAGE_INFO_BY_INDEX_V2_RANGE) {
            return "v1/message/get_message_by_index_v2_range/";
        }
        if (fromValue == IMCMD.GET_MESSAGE_INFO_BY_SERVER_ID) {
            return "v1/message/get_message_by_server_id";
        }
        if (fromValue == IMCMD.BATCH_GET_CONVERSATION_AUDIT_UNREAD) {
            return "v1/conversation/batch_get_audit_unread";
        }
        if (fromValue == IMCMD.BATCH_UNMARK_MESSAGE) {
            return "v1/message/batch_unmark";
        }
        if (fromValue == IMCMD.MARK_MSG_UNREAD_COUNT_REPORT) {
            return "v1/message/report_mark_count";
        }
        if (fromValue == IMCMD.MARK_MSG_GET_UNREAD_COUNT) {
            return "v1/message/get_mark_count";
        }
        switch (AnonymousClass1.f38734a[fromValue.ordinal()]) {
            case 1:
                return "v1/message/previewer_get_by_conversation";
            case 2:
                return "v2/conversation/previewer_get_info_list";
            case 3:
                return "v1/profile/batch_get_info";
            case 4:
                return "v1/friend/delete";
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return "v1/friend/get_list";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return "v1/friend/reply_apply";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return "v1/friend/get_receive_apply_list";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return "v1/friend/get_apply_list";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return "v1/friend/send_apply";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return "v1/profile/search_info";
            default:
                throw new IllegalArgumentException("cmd not find!");
        }
    }
}

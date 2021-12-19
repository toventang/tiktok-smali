package com.bytedance.im.core.proto;

import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.nita.c.a;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.HashMap;
import java.util.Map;
import k.i;

public final class RequestBody extends Message<RequestBody, Builder> {
    public static final ProtoAdapter<RequestBody> ADAPTER = new ProtoAdapter_RequestBody();
    private static final long serialVersionUID = 0;
    @c(a = "batch_get_conversation_participants_readindex")
    public final BatchGetConversationParticipantsReadIndexRequestBody batch_get_conversation_participants_readindex;
    @c(a = "batch_mark_read_body")
    public final BatchMarkConversationReadRequestBody batch_mark_read_body;
    @c(a = "batch_unmark_message")
    public final BatchUnmarkMessageRequestBody batch_unmark_message;
    @c(a = "batch_update_conversation_participant_body")
    public final BatchUpdateConversationParticipantRequestBody batch_update_conversation_participant_body;
    @c(a = "block_conversation_body")
    public final BlockConversationRequestBody block_conversation_body;
    @c(a = "block_members_body")
    public final BlockMembersRequestBody block_members_body;
    @c(a = "broadcast_user_counter_body")
    public final BroadcastUserCounterRequestBody broadcast_user_counter_body;
    @c(a = "check_messages_per_user_body")
    public final CheckMessagePerUserRequestBody check_messages_per_user_body;
    @c(a = "client_ack_body")
    public final ClientACKRequestBody client_ack_body;
    @c(a = "client_batch_ack_body")
    public final ClientBatchACKRequestBody client_batch_ack_body;
    @c(a = "conversation_add_participants_body")
    public final ConversationAddParticipantsRequestBody conversation_add_participants_body;
    @c(a = "conversation_message_pre_view_body")
    public final ConversationMessagePreViewRequestBody conversation_message_pre_view_body;
    @c(a = "conversation_message_search_body")
    public final ConversationMessageSearchRequestBody conversation_message_search_body;
    @c(a = "conversation_participants_body")
    public final ConversationParticipantsListRequestBody conversation_participants_body;
    @c(a = "conversation_remove_participants_body")
    public final ConversationRemoveParticipantsRequestBody conversation_remove_participants_body;
    @c(a = "create_conversation_v2_body")
    public final CreateConversationV2RequestBody create_conversation_v2_body;
    @c(a = "delete_conversation_body")
    public final DeleteConversationRequestBody delete_conversation_body;
    @c(a = "delete_message_body")
    public final DeleteMessageRequestBody delete_message_body;
    @c(a = "delete_stranger_all_conversation_body")
    public final DeleteStrangerAllConversationRequestBody delete_stranger_all_conversation_body;
    @c(a = "delete_stranger_conversation_body")
    public final DeleteStrangerConversationRequestBody delete_stranger_conversation_body;
    @c(a = "delete_stranger_message_body")
    public final DeleteStrangerMessageRequestBody delete_stranger_message_body;
    @c(a = "dissolve_conversation_body")
    public final DissolveConversationRequestBody dissolve_conversation_body;
    private HashMap<String, Object> extensionMsgs;
    public transient HashMap<Integer, Pair<ProtoAdapter, Message>> extensions;
    @c(a = "get_cmd_message_body")
    public final GetCmdMessageReqBody get_cmd_message_body;
    @c(a = "get_configs_body")
    public final GetConfigsRequestBody get_configs_body;
    @c(a = "get_conversation_info_list_by_favorite_v2_body")
    public final ConversationsPerUserByFavoriteV2RequestBody get_conversation_info_list_by_favorite_v2_body;
    @c(a = "get_conversation_info_list_by_top_v2_body")
    public final ConversationsPerUserByTopV2RequestBody get_conversation_info_list_by_top_v2_body;
    @c(a = "get_conversation_info_list_v2_body")
    public final GetConversationInfoListV2RequestBody get_conversation_info_list_v2_body;
    @c(a = "get_conversation_info_v2_body")
    public final GetConversationInfoV2RequestBody get_conversation_info_v2_body;
    @c(a = "get_conversation_list_body")
    public final GetUserConversationListRequestBody get_conversation_list_body;
    @c(a = "get_conversations_checkinfo_body")
    public final GetConversationsCheckInfoRequestBody get_conversations_checkinfo_body;
    @c(a = "get_message_by_id_body")
    public final GetMessageByIdRequestBody get_message_by_id_body;
    @c(a = "get_message_info_by_index_v2_body")
    public final GetMessageInfoByIndexV2RequestBody get_message_info_by_index_v2_body;
    @c(a = "get_message_info_by_index_v2_range_body")
    public final GetMessageInfoByIndexV2RangeRequestBody get_message_info_by_index_v2_range_body;
    @c(a = "get_messages_checkinfo_in_conversation_body")
    public final GetMessagesCheckInfoInConversationRequestBody get_messages_checkinfo_in_conversation_body;
    @c(a = "get_recent_message_body")
    public final GetRecentMessageReqBody get_recent_message_body;
    @c(a = "get_stranger_conversation_body")
    public final GetStrangerConversationListRequestBody get_stranger_conversation_body;
    @c(a = "get_stranger_messages_body")
    public final GetStrangerMessagesRequestBody get_stranger_messages_body;
    @c(a = "get_ticket_body")
    public final GetTicketRequestBody get_ticket_body;
    @c(a = "leave_conversation_body")
    public final ConversationLeaveRequestBody leave_conversation_body;
    @c(a = "mark_conversation_read_body")
    public final MarkConversationReadRequestBody mark_conversation_read_body;
    @c(a = "mark_message_body")
    public final MarkMessageRequestBody mark_message_body;
    @c(a = "mark_msg_get_unread_count")
    public final MarkMsgGetUnreadCountRequestBody mark_msg_get_unread_count;
    @c(a = "mark_msg_unread_count_report")
    public final MarkMsgUnreadCountReportRequestBody mark_msg_unread_count_report;
    @c(a = "mark_stranger_all_conversation_read_body")
    public final MarkStrangerAllConversationReadRequestBody mark_stranger_all_conversation_read_body;
    @c(a = "mark_stranger_conversation_read_body")
    public final MarkStrangerConversationReadRequestBody mark_stranger_conversation_read_body;
    @c(a = "message_by_init")
    public final MessageByInitRequestBody message_by_init;
    @c(a = "messages_in_conversation_body")
    public final MessagesInConversationRequestBody messages_in_conversation_body;
    @c(a = "messages_per_user_body")
    public final MessagesPerUserRequestBody messages_per_user_body;
    @c(a = "messages_per_user_init_v2_body")
    public final MessagesPerUserInitV2RequestBody messages_per_user_init_v2_body;
    @c(a = "modify_message_property_body")
    public final ModifyMessagePropertyRequestBody modify_message_property_body;
    @c(a = "participants_min_index_body")
    public final GetConversationParticipantsMinIndexV3RequestBody participants_min_index_body;
    @c(a = "participants_read_index_body")
    public final GetConversationParticipantsReadIndexV3RequestBody participants_read_index_body;
    @c(a = "previewer_get_conversation_info_list_body")
    public final PreviewerGetConversationInfoListRequestBody previewer_get_conversation_info_list_body;
    @c(a = "previewer_messages_in_conversation_body")
    public final PreviewerMessagesInConversationRequestBody previewer_messages_in_conversation_body;
    @c(a = "pull_mark_message_body")
    public final PullMarkMessageRequestBody pull_mark_message_body;
    @c(a = "recall_message_body")
    public final RecallMessageRequestBody recall_message_body;
    @c(a = "report_client_metrics_body")
    public final ReportClientMetricsRequestBody report_client_metrics_body;
    @c(a = "send_message_body")
    public final SendMessageRequestBody send_message_body;
    @c(a = "send_message_p2p_body")
    public final SendMessageP2PRequestBody send_message_p2p_body;
    @c(a = "send_user_action_body")
    public final SendUserActionRequestBody send_user_action_body;
    @c(a = "set_conversation_core_info_body")
    public final SetConversationCoreInfoRequestBody set_conversation_core_info_body;
    @c(a = "set_conversation_setting_info_body")
    public final SetConversationSettingInfoRequestBody set_conversation_setting_info_body;
    @c(a = "unread_count_report_body")
    public final UnReadCountReportRequestBody unread_count_report_body;
    @c(a = "update_conversation_participant_body")
    public final UpdateConversationParticipantRequestBody update_conversation_participant_body;
    @c(a = "upsert_conversation_core_ext_info_body")
    public final UpsertConversationCoreExtInfoRequestBody upsert_conversation_core_ext_info_body;
    @c(a = "upsert_conversation_setting_ext_info_body")
    public final UpsertConversationSettingExtInfoRequestBody upsert_conversation_setting_ext_info_body;

    public RequestBody(SendMessageRequestBody sendMessageRequestBody, MessagesPerUserRequestBody messagesPerUserRequestBody, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody, GetMessageByIdRequestBody getMessageByIdRequestBody, MessagesInConversationRequestBody messagesInConversationRequestBody, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody, SendUserActionRequestBody sendUserActionRequestBody, DeleteConversationRequestBody deleteConversationRequestBody, MarkConversationReadRequestBody markConversationReadRequestBody, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody, DissolveConversationRequestBody dissolveConversationRequestBody, GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody, CreateConversationV2RequestBody createConversationV2RequestBody, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody, ConversationLeaveRequestBody conversationLeaveRequestBody, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody, BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody, DeleteMessageRequestBody deleteMessageRequestBody, RecallMessageRequestBody recallMessageRequestBody, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody, DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody, MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody, GetTicketRequestBody getTicketRequestBody, GetUserConversationListRequestBody getUserConversationListRequestBody, BroadcastUserCounterRequestBody broadcastUserCounterRequestBody, ClientACKRequestBody clientACKRequestBody, ReportClientMetricsRequestBody reportClientMetricsRequestBody, GetConfigsRequestBody getConfigsRequestBody, UnReadCountReportRequestBody unReadCountReportRequestBody, BlockMembersRequestBody blockMembersRequestBody, BlockConversationRequestBody blockConversationRequestBody, SendMessageP2PRequestBody sendMessageP2PRequestBody, GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody, MarkMessageRequestBody markMessageRequestBody, PullMarkMessageRequestBody pullMarkMessageRequestBody, BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody, GetRecentMessageReqBody getRecentMessageReqBody, GetCmdMessageReqBody getCmdMessageReqBody, GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody, MessageByInitRequestBody messageByInitRequestBody, PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody, MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody, MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody, BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody, ClientBatchACKRequestBody clientBatchACKRequestBody, ConversationMessageSearchRequestBody conversationMessageSearchRequestBody, ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody, HashMap<Integer, Pair<ProtoAdapter, Message>> hashMap, HashMap<String, Object> hashMap2) {
        this(sendMessageRequestBody, messagesPerUserRequestBody, messagesPerUserInitV2RequestBody, checkMessagePerUserRequestBody, getMessageByIdRequestBody, messagesInConversationRequestBody, getMessagesCheckInfoInConversationRequestBody, sendUserActionRequestBody, deleteConversationRequestBody, markConversationReadRequestBody, conversationParticipantsListRequestBody, batchMarkConversationReadRequestBody, dissolveConversationRequestBody, getConversationsCheckInfoRequestBody, getConversationInfoV2RequestBody, createConversationV2RequestBody, getConversationInfoListV2RequestBody, conversationsPerUserByFavoriteV2RequestBody, conversationsPerUserByTopV2RequestBody, conversationAddParticipantsRequestBody, conversationRemoveParticipantsRequestBody, conversationLeaveRequestBody, updateConversationParticipantRequestBody, batchUpdateConversationParticipantRequestBody, deleteMessageRequestBody, recallMessageRequestBody, modifyMessagePropertyRequestBody, setConversationCoreInfoRequestBody, upsertConversationCoreExtInfoRequestBody, setConversationSettingInfoRequestBody, upsertConversationSettingExtInfoRequestBody, getStrangerConversationListRequestBody, getStrangerMessagesRequestBody, deleteStrangerMessageRequestBody, deleteStrangerConversationRequestBody, deleteStrangerAllConversationRequestBody, markStrangerConversationReadRequestBody, markStrangerAllConversationReadRequestBody, getConversationParticipantsReadIndexV3RequestBody, getConversationParticipantsMinIndexV3RequestBody, getTicketRequestBody, getUserConversationListRequestBody, broadcastUserCounterRequestBody, clientACKRequestBody, reportClientMetricsRequestBody, getConfigsRequestBody, unReadCountReportRequestBody, blockMembersRequestBody, blockConversationRequestBody, sendMessageP2PRequestBody, getMessageInfoByIndexV2RequestBody, markMessageRequestBody, pullMarkMessageRequestBody, batchGetConversationParticipantsReadIndexRequestBody, getRecentMessageReqBody, getCmdMessageReqBody, getMessageInfoByIndexV2RangeRequestBody, messageByInitRequestBody, previewerMessagesInConversationRequestBody, previewerGetConversationInfoListRequestBody, markMsgUnreadCountReportRequestBody, markMsgGetUnreadCountRequestBody, batchUnmarkMessageRequestBody, clientBatchACKRequestBody, conversationMessageSearchRequestBody, conversationMessagePreViewRequestBody, hashMap, hashMap2, i.EMPTY);
    }

    public RequestBody(SendMessageRequestBody sendMessageRequestBody, MessagesPerUserRequestBody messagesPerUserRequestBody, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody, GetMessageByIdRequestBody getMessageByIdRequestBody, MessagesInConversationRequestBody messagesInConversationRequestBody, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody, SendUserActionRequestBody sendUserActionRequestBody, DeleteConversationRequestBody deleteConversationRequestBody, MarkConversationReadRequestBody markConversationReadRequestBody, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody, DissolveConversationRequestBody dissolveConversationRequestBody, GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody, CreateConversationV2RequestBody createConversationV2RequestBody, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody, ConversationLeaveRequestBody conversationLeaveRequestBody, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody, BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody, DeleteMessageRequestBody deleteMessageRequestBody, RecallMessageRequestBody recallMessageRequestBody, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody, DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody, MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody, GetTicketRequestBody getTicketRequestBody, GetUserConversationListRequestBody getUserConversationListRequestBody, BroadcastUserCounterRequestBody broadcastUserCounterRequestBody, ClientACKRequestBody clientACKRequestBody, ReportClientMetricsRequestBody reportClientMetricsRequestBody, GetConfigsRequestBody getConfigsRequestBody, UnReadCountReportRequestBody unReadCountReportRequestBody, BlockMembersRequestBody blockMembersRequestBody, BlockConversationRequestBody blockConversationRequestBody, SendMessageP2PRequestBody sendMessageP2PRequestBody, GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody, MarkMessageRequestBody markMessageRequestBody, PullMarkMessageRequestBody pullMarkMessageRequestBody, BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody, GetRecentMessageReqBody getRecentMessageReqBody, GetCmdMessageReqBody getCmdMessageReqBody, GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody, MessageByInitRequestBody messageByInitRequestBody, PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody, MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody, MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody, BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody, ClientBatchACKRequestBody clientBatchACKRequestBody, ConversationMessageSearchRequestBody conversationMessageSearchRequestBody, ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody, HashMap<Integer, Pair<ProtoAdapter, Message>> hashMap, HashMap<String, Object> hashMap2, i iVar) {
        super(ADAPTER, iVar);
        this.extensions = new HashMap<>();
        this.extensionMsgs = new HashMap<>();
        this.send_message_body = sendMessageRequestBody;
        this.messages_per_user_body = messagesPerUserRequestBody;
        this.messages_per_user_init_v2_body = messagesPerUserInitV2RequestBody;
        this.check_messages_per_user_body = checkMessagePerUserRequestBody;
        this.get_message_by_id_body = getMessageByIdRequestBody;
        this.messages_in_conversation_body = messagesInConversationRequestBody;
        this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationRequestBody;
        this.send_user_action_body = sendUserActionRequestBody;
        this.delete_conversation_body = deleteConversationRequestBody;
        this.mark_conversation_read_body = markConversationReadRequestBody;
        this.conversation_participants_body = conversationParticipantsListRequestBody;
        this.batch_mark_read_body = batchMarkConversationReadRequestBody;
        this.dissolve_conversation_body = dissolveConversationRequestBody;
        this.get_conversations_checkinfo_body = getConversationsCheckInfoRequestBody;
        this.get_conversation_info_v2_body = getConversationInfoV2RequestBody;
        this.create_conversation_v2_body = createConversationV2RequestBody;
        this.get_conversation_info_list_v2_body = getConversationInfoListV2RequestBody;
        this.get_conversation_info_list_by_favorite_v2_body = conversationsPerUserByFavoriteV2RequestBody;
        this.get_conversation_info_list_by_top_v2_body = conversationsPerUserByTopV2RequestBody;
        this.conversation_add_participants_body = conversationAddParticipantsRequestBody;
        this.conversation_remove_participants_body = conversationRemoveParticipantsRequestBody;
        this.leave_conversation_body = conversationLeaveRequestBody;
        this.update_conversation_participant_body = updateConversationParticipantRequestBody;
        this.batch_update_conversation_participant_body = batchUpdateConversationParticipantRequestBody;
        this.delete_message_body = deleteMessageRequestBody;
        this.recall_message_body = recallMessageRequestBody;
        this.modify_message_property_body = modifyMessagePropertyRequestBody;
        this.set_conversation_core_info_body = setConversationCoreInfoRequestBody;
        this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoRequestBody;
        this.set_conversation_setting_info_body = setConversationSettingInfoRequestBody;
        this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoRequestBody;
        this.get_stranger_conversation_body = getStrangerConversationListRequestBody;
        this.get_stranger_messages_body = getStrangerMessagesRequestBody;
        this.delete_stranger_message_body = deleteStrangerMessageRequestBody;
        this.delete_stranger_conversation_body = deleteStrangerConversationRequestBody;
        this.delete_stranger_all_conversation_body = deleteStrangerAllConversationRequestBody;
        this.mark_stranger_conversation_read_body = markStrangerConversationReadRequestBody;
        this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadRequestBody;
        this.participants_read_index_body = getConversationParticipantsReadIndexV3RequestBody;
        this.participants_min_index_body = getConversationParticipantsMinIndexV3RequestBody;
        this.get_ticket_body = getTicketRequestBody;
        this.get_conversation_list_body = getUserConversationListRequestBody;
        this.broadcast_user_counter_body = broadcastUserCounterRequestBody;
        this.client_ack_body = clientACKRequestBody;
        this.report_client_metrics_body = reportClientMetricsRequestBody;
        this.get_configs_body = getConfigsRequestBody;
        this.unread_count_report_body = unReadCountReportRequestBody;
        this.block_members_body = blockMembersRequestBody;
        this.block_conversation_body = blockConversationRequestBody;
        this.send_message_p2p_body = sendMessageP2PRequestBody;
        this.get_message_info_by_index_v2_body = getMessageInfoByIndexV2RequestBody;
        this.mark_message_body = markMessageRequestBody;
        this.pull_mark_message_body = pullMarkMessageRequestBody;
        this.batch_get_conversation_participants_readindex = batchGetConversationParticipantsReadIndexRequestBody;
        this.get_recent_message_body = getRecentMessageReqBody;
        this.get_cmd_message_body = getCmdMessageReqBody;
        this.get_message_info_by_index_v2_range_body = getMessageInfoByIndexV2RangeRequestBody;
        this.message_by_init = messageByInitRequestBody;
        this.previewer_messages_in_conversation_body = previewerMessagesInConversationRequestBody;
        this.previewer_get_conversation_info_list_body = previewerGetConversationInfoListRequestBody;
        this.mark_msg_unread_count_report = markMsgUnreadCountReportRequestBody;
        this.mark_msg_get_unread_count = markMsgGetUnreadCountRequestBody;
        this.batch_unmark_message = batchUnmarkMessageRequestBody;
        this.client_batch_ack_body = clientBatchACKRequestBody;
        this.conversation_message_search_body = conversationMessageSearchRequestBody;
        this.conversation_message_pre_view_body = conversationMessagePreViewRequestBody;
        this.extensions = hashMap;
        this.extensionMsgs = hashMap2;
    }

    public static final class ProtoAdapter_RequestBody extends ProtoAdapter<RequestBody> {
        public static HashMap<Integer, ProtoAdapter> adapterMap = new HashMap<>();

        public ProtoAdapter_RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestBody.class);
        }

        static {
            Covode.recordClassIndex(23728);
        }

        public final int encodedSize(RequestBody requestBody) {
            int encodedSizeWithTag = SendMessageRequestBody.ADAPTER.encodedSizeWithTag(100, requestBody.send_message_body) + MessagesPerUserRequestBody.ADAPTER.encodedSizeWithTag(200, requestBody.messages_per_user_body) + MessagesPerUserInitV2RequestBody.ADAPTER.encodedSizeWithTag(203, requestBody.messages_per_user_init_v2_body) + CheckMessagePerUserRequestBody.ADAPTER.encodedSizeWithTag(210, requestBody.check_messages_per_user_body) + GetMessageByIdRequestBody.ADAPTER.encodedSizeWithTag(211, requestBody.get_message_by_id_body) + MessagesInConversationRequestBody.ADAPTER.encodedSizeWithTag(301, requestBody.messages_in_conversation_body) + GetMessagesCheckInfoInConversationRequestBody.ADAPTER.encodedSizeWithTag(302, requestBody.get_messages_checkinfo_in_conversation_body) + SendUserActionRequestBody.ADAPTER.encodedSizeWithTag(410, requestBody.send_user_action_body) + DeleteConversationRequestBody.ADAPTER.encodedSizeWithTag(603, requestBody.delete_conversation_body) + MarkConversationReadRequestBody.ADAPTER.encodedSizeWithTag(604, requestBody.mark_conversation_read_body) + ConversationParticipantsListRequestBody.ADAPTER.encodedSizeWithTag(605, requestBody.conversation_participants_body) + BatchMarkConversationReadRequestBody.ADAPTER.encodedSizeWithTag(613, requestBody.batch_mark_read_body) + DissolveConversationRequestBody.ADAPTER.encodedSizeWithTag(614, requestBody.dissolve_conversation_body) + GetConversationsCheckInfoRequestBody.ADAPTER.encodedSizeWithTag(615, requestBody.get_conversations_checkinfo_body) + GetConversationInfoV2RequestBody.ADAPTER.encodedSizeWithTag(608, requestBody.get_conversation_info_v2_body) + CreateConversationV2RequestBody.ADAPTER.encodedSizeWithTag(609, requestBody.create_conversation_v2_body) + GetConversationInfoListV2RequestBody.ADAPTER.encodedSizeWithTag(610, requestBody.get_conversation_info_list_v2_body) + ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.encodedSizeWithTag(611, requestBody.get_conversation_info_list_by_favorite_v2_body) + ConversationsPerUserByTopV2RequestBody.ADAPTER.encodedSizeWithTag(612, requestBody.get_conversation_info_list_by_top_v2_body) + ConversationAddParticipantsRequestBody.ADAPTER.encodedSizeWithTag(650, requestBody.conversation_add_participants_body) + ConversationRemoveParticipantsRequestBody.ADAPTER.encodedSizeWithTag(651, requestBody.conversation_remove_participants_body) + ConversationLeaveRequestBody.ADAPTER.encodedSizeWithTag(652, requestBody.leave_conversation_body) + UpdateConversationParticipantRequestBody.ADAPTER.encodedSizeWithTag(655, requestBody.update_conversation_participant_body) + BatchUpdateConversationParticipantRequestBody.ADAPTER.encodedSizeWithTag(656, requestBody.batch_update_conversation_participant_body) + DeleteMessageRequestBody.ADAPTER.encodedSizeWithTag(701, requestBody.delete_message_body) + RecallMessageRequestBody.ADAPTER.encodedSizeWithTag(702, requestBody.recall_message_body) + ModifyMessagePropertyRequestBody.ADAPTER.encodedSizeWithTag(705, requestBody.modify_message_property_body) + SetConversationCoreInfoRequestBody.ADAPTER.encodedSizeWithTag(902, requestBody.set_conversation_core_info_body) + UpsertConversationCoreExtInfoRequestBody.ADAPTER.encodedSizeWithTag(904, requestBody.upsert_conversation_core_ext_info_body) + SetConversationSettingInfoRequestBody.ADAPTER.encodedSizeWithTag(921, requestBody.set_conversation_setting_info_body) + UpsertConversationSettingExtInfoRequestBody.ADAPTER.encodedSizeWithTag(922, requestBody.upsert_conversation_setting_ext_info_body) + GetStrangerConversationListRequestBody.ADAPTER.encodedSizeWithTag(1000, requestBody.get_stranger_conversation_body) + GetStrangerMessagesRequestBody.ADAPTER.encodedSizeWithTag(1001, requestBody.get_stranger_messages_body) + DeleteStrangerMessageRequestBody.ADAPTER.encodedSizeWithTag(1002, requestBody.delete_stranger_message_body) + DeleteStrangerConversationRequestBody.ADAPTER.encodedSizeWithTag(1003, requestBody.delete_stranger_conversation_body) + DeleteStrangerAllConversationRequestBody.ADAPTER.encodedSizeWithTag(1004, requestBody.delete_stranger_all_conversation_body) + MarkStrangerConversationReadRequestBody.ADAPTER.encodedSizeWithTag(1005, requestBody.mark_stranger_conversation_read_body) + MarkStrangerAllConversationReadRequestBody.ADAPTER.encodedSizeWithTag(1006, requestBody.mark_stranger_all_conversation_read_body) + GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.encodedSizeWithTag(LiveNetAdaptiveHurryTimeSetting.DEFAULT, requestBody.participants_read_index_body) + GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.encodedSizeWithTag(2001, requestBody.participants_min_index_body) + GetTicketRequestBody.ADAPTER.encodedSizeWithTag(2005, requestBody.get_ticket_body) + GetUserConversationListRequestBody.ADAPTER.encodedSizeWithTag(2006, requestBody.get_conversation_list_body) + BroadcastUserCounterRequestBody.ADAPTER.encodedSizeWithTag(2009, requestBody.broadcast_user_counter_body) + ClientACKRequestBody.ADAPTER.encodedSizeWithTag(2010, requestBody.client_ack_body) + ReportClientMetricsRequestBody.ADAPTER.encodedSizeWithTag(2016, requestBody.report_client_metrics_body) + GetConfigsRequestBody.ADAPTER.encodedSizeWithTag(2017, requestBody.get_configs_body) + UnReadCountReportRequestBody.ADAPTER.encodedSizeWithTag(2018, requestBody.unread_count_report_body) + BlockMembersRequestBody.ADAPTER.encodedSizeWithTag(2019, requestBody.block_members_body) + BlockConversationRequestBody.ADAPTER.encodedSizeWithTag(2020, requestBody.block_conversation_body) + SendMessageP2PRequestBody.ADAPTER.encodedSizeWithTag(2031, requestBody.send_message_p2p_body) + GetMessageInfoByIndexV2RequestBody.ADAPTER.encodedSizeWithTag(2035, requestBody.get_message_info_by_index_v2_body) + MarkMessageRequestBody.ADAPTER.encodedSizeWithTag(2036, requestBody.mark_message_body) + PullMarkMessageRequestBody.ADAPTER.encodedSizeWithTag(2037, requestBody.pull_mark_message_body) + BatchGetConversationParticipantsReadIndexRequestBody.ADAPTER.encodedSizeWithTag(2038, requestBody.batch_get_conversation_participants_readindex) + GetRecentMessageReqBody.ADAPTER.encodedSizeWithTag(2039, requestBody.get_recent_message_body) + GetCmdMessageReqBody.ADAPTER.encodedSizeWithTag(2040, requestBody.get_cmd_message_body) + GetMessageInfoByIndexV2RangeRequestBody.ADAPTER.encodedSizeWithTag(2041, requestBody.get_message_info_by_index_v2_range_body) + MessageByInitRequestBody.ADAPTER.encodedSizeWithTag(2043, requestBody.message_by_init) + PreviewerMessagesInConversationRequestBody.ADAPTER.encodedSizeWithTag(2044, requestBody.previewer_messages_in_conversation_body) + PreviewerGetConversationInfoListRequestBody.ADAPTER.encodedSizeWithTag(2045, requestBody.previewer_get_conversation_info_list_body) + MarkMsgUnreadCountReportRequestBody.ADAPTER.encodedSizeWithTag(2054, requestBody.mark_msg_unread_count_report) + MarkMsgGetUnreadCountRequestBody.ADAPTER.encodedSizeWithTag(2055, requestBody.mark_msg_get_unread_count) + BatchUnmarkMessageRequestBody.ADAPTER.encodedSizeWithTag(2056, requestBody.batch_unmark_message) + ClientBatchACKRequestBody.ADAPTER.encodedSizeWithTag(2057, requestBody.client_batch_ack_body) + ConversationMessageSearchRequestBody.ADAPTER.encodedSizeWithTag(2102, requestBody.conversation_message_search_body) + ConversationMessagePreViewRequestBody.ADAPTER.encodedSizeWithTag(2103, requestBody.conversation_message_pre_view_body) + requestBody.unknownFields().size();
            for (Map.Entry<Integer, ProtoAdapter> entry : adapterMap.entrySet()) {
                if (requestBody.extensions.get(entry.getKey()) != null) {
                    encodedSizeWithTag += entry.getValue().encodedSizeWithTag(entry.getKey().intValue(), requestBody.extensions.get(entry.getKey()).second);
                }
            }
            return encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 210) {
                    builder.check_messages_per_user_body(CheckMessagePerUserRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 211) {
                    builder.get_message_by_id_body(GetMessageByIdRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 301) {
                    builder.messages_in_conversation_body(MessagesInConversationRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 302) {
                    builder.get_messages_checkinfo_in_conversation_body(GetMessagesCheckInfoInConversationRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 655) {
                    builder.update_conversation_participant_body(UpdateConversationParticipantRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 656) {
                    builder.batch_update_conversation_participant_body(BatchUpdateConversationParticipantRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 701) {
                    builder.delete_message_body(DeleteMessageRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 702) {
                    builder.recall_message_body(RecallMessageRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 921) {
                    builder.set_conversation_setting_info_body(SetConversationSettingInfoRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 922) {
                    builder.upsert_conversation_setting_ext_info_body(UpsertConversationSettingExtInfoRequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 2000) {
                    builder.participants_read_index_body(GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.decode(protoReader));
                } else if (nextTag != 2001) {
                    switch (nextTag) {
                        case a.f41622a:
                            builder.send_message_body(SendMessageRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 200:
                            builder.messages_per_user_body(MessagesPerUserRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 203:
                            builder.messages_per_user_init_v2_body(MessagesPerUserInitV2RequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 410:
                            builder.send_user_action_body(SendUserActionRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 608:
                            builder.get_conversation_info_v2_body(GetConversationInfoV2RequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 609:
                            builder.create_conversation_v2_body(CreateConversationV2RequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 610:
                            builder.get_conversation_info_list_v2_body(GetConversationInfoListV2RequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 611:
                            builder.get_conversation_info_list_by_favorite_v2_body(ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 612:
                            builder.get_conversation_info_list_by_top_v2_body(ConversationsPerUserByTopV2RequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 613:
                            builder.batch_mark_read_body(BatchMarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 614:
                            builder.dissolve_conversation_body(DissolveConversationRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 615:
                            builder.get_conversations_checkinfo_body(GetConversationsCheckInfoRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 705:
                            builder.modify_message_property_body(ModifyMessagePropertyRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 902:
                            builder.set_conversation_core_info_body(SetConversationCoreInfoRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 904:
                            builder.upsert_conversation_core_ext_info_body(UpsertConversationCoreExtInfoRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2005:
                            builder.get_ticket_body(GetTicketRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2006:
                            builder.get_conversation_list_body(GetUserConversationListRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2009:
                            builder.broadcast_user_counter_body(BroadcastUserCounterRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2010:
                            builder.client_ack_body(ClientACKRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2016:
                            builder.report_client_metrics_body(ReportClientMetricsRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2017:
                            builder.get_configs_body(GetConfigsRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2018:
                            builder.unread_count_report_body(UnReadCountReportRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2019:
                            builder.block_members_body(BlockMembersRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2020:
                            builder.block_conversation_body(BlockConversationRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2031:
                            builder.send_message_p2p_body(SendMessageP2PRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2035:
                            builder.get_message_info_by_index_v2_body(GetMessageInfoByIndexV2RequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2036:
                            builder.mark_message_body(MarkMessageRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2037:
                            builder.pull_mark_message_body(PullMarkMessageRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2038:
                            builder.batch_get_conversation_participants_readindex(BatchGetConversationParticipantsReadIndexRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2039:
                            builder.get_recent_message_body(GetRecentMessageReqBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2040:
                            builder.get_cmd_message_body(GetCmdMessageReqBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2041:
                            builder.get_message_info_by_index_v2_range_body(GetMessageInfoByIndexV2RangeRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2043:
                            builder.message_by_init(MessageByInitRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2044:
                            builder.previewer_messages_in_conversation_body(PreviewerMessagesInConversationRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2045:
                            builder.previewer_get_conversation_info_list_body(PreviewerGetConversationInfoListRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2054:
                            builder.mark_msg_unread_count_report(MarkMsgUnreadCountReportRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2055:
                            builder.mark_msg_get_unread_count(MarkMsgGetUnreadCountRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2056:
                            builder.batch_unmark_message(BatchUnmarkMessageRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2057:
                            builder.client_batch_ack_body(ClientBatchACKRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2102:
                            builder.conversation_message_search_body(ConversationMessageSearchRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2103:
                            builder.conversation_message_pre_view_body(ConversationMessagePreViewRequestBody.ADAPTER.decode(protoReader));
                            continue;
                        default:
                            switch (nextTag) {
                                case 603:
                                    builder.delete_conversation_body(DeleteConversationRequestBody.ADAPTER.decode(protoReader));
                                    continue;
                                case 604:
                                    builder.mark_conversation_read_body(MarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                                    continue;
                                case 605:
                                    builder.conversation_participants_body(ConversationParticipantsListRequestBody.ADAPTER.decode(protoReader));
                                    continue;
                                default:
                                    switch (nextTag) {
                                        case 650:
                                            builder.conversation_add_participants_body(ConversationAddParticipantsRequestBody.ADAPTER.decode(protoReader));
                                            continue;
                                        case 651:
                                            builder.conversation_remove_participants_body(ConversationRemoveParticipantsRequestBody.ADAPTER.decode(protoReader));
                                            continue;
                                        case 652:
                                            builder.leave_conversation_body(ConversationLeaveRequestBody.ADAPTER.decode(protoReader));
                                            continue;
                                        default:
                                            switch (nextTag) {
                                                case 1000:
                                                    builder.get_stranger_conversation_body(GetStrangerConversationListRequestBody.ADAPTER.decode(protoReader));
                                                    continue;
                                                case 1001:
                                                    builder.get_stranger_messages_body(GetStrangerMessagesRequestBody.ADAPTER.decode(protoReader));
                                                    continue;
                                                case 1002:
                                                    builder.delete_stranger_message_body(DeleteStrangerMessageRequestBody.ADAPTER.decode(protoReader));
                                                    continue;
                                                case 1003:
                                                    builder.delete_stranger_conversation_body(DeleteStrangerConversationRequestBody.ADAPTER.decode(protoReader));
                                                    continue;
                                                case 1004:
                                                    builder.delete_stranger_all_conversation_body(DeleteStrangerAllConversationRequestBody.ADAPTER.decode(protoReader));
                                                    continue;
                                                case 1005:
                                                    builder.mark_stranger_conversation_read_body(MarkStrangerConversationReadRequestBody.ADAPTER.decode(protoReader));
                                                    continue;
                                                case 1006:
                                                    builder.mark_stranger_all_conversation_read_body(MarkStrangerAllConversationReadRequestBody.ADAPTER.decode(protoReader));
                                                    continue;
                                                default:
                                                    if (adapterMap.get(Integer.valueOf(nextTag)) != null) {
                                                        builder.addExtension(nextTag, adapterMap.get(Integer.valueOf(nextTag)), (Message) adapterMap.get(Integer.valueOf(nextTag)).decode(protoReader));
                                                        break;
                                                    } else {
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    builder.participants_min_index_body(GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.RequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.RequestBody redact(com.bytedance.im.core.proto.RequestBody r5) {
            /*
            // Method dump skipped, instructions count: 1097
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.RequestBody.ProtoAdapter_RequestBody.redact(com.bytedance.im.core.proto.RequestBody):com.bytedance.im.core.proto.RequestBody");
        }

        public final void encode(ProtoWriter protoWriter, RequestBody requestBody) {
            SendMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 100, requestBody.send_message_body);
            MessagesPerUserRequestBody.ADAPTER.encodeWithTag(protoWriter, 200, requestBody.messages_per_user_body);
            MessagesPerUserInitV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 203, requestBody.messages_per_user_init_v2_body);
            CheckMessagePerUserRequestBody.ADAPTER.encodeWithTag(protoWriter, 210, requestBody.check_messages_per_user_body);
            GetMessageByIdRequestBody.ADAPTER.encodeWithTag(protoWriter, 211, requestBody.get_message_by_id_body);
            MessagesInConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 301, requestBody.messages_in_conversation_body);
            GetMessagesCheckInfoInConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 302, requestBody.get_messages_checkinfo_in_conversation_body);
            SendUserActionRequestBody.ADAPTER.encodeWithTag(protoWriter, 410, requestBody.send_user_action_body);
            DeleteConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 603, requestBody.delete_conversation_body);
            MarkConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 604, requestBody.mark_conversation_read_body);
            ConversationParticipantsListRequestBody.ADAPTER.encodeWithTag(protoWriter, 605, requestBody.conversation_participants_body);
            BatchMarkConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 613, requestBody.batch_mark_read_body);
            DissolveConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 614, requestBody.dissolve_conversation_body);
            GetConversationsCheckInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 615, requestBody.get_conversations_checkinfo_body);
            GetConversationInfoV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 608, requestBody.get_conversation_info_v2_body);
            CreateConversationV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 609, requestBody.create_conversation_v2_body);
            GetConversationInfoListV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 610, requestBody.get_conversation_info_list_v2_body);
            ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 611, requestBody.get_conversation_info_list_by_favorite_v2_body);
            ConversationsPerUserByTopV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 612, requestBody.get_conversation_info_list_by_top_v2_body);
            ConversationAddParticipantsRequestBody.ADAPTER.encodeWithTag(protoWriter, 650, requestBody.conversation_add_participants_body);
            ConversationRemoveParticipantsRequestBody.ADAPTER.encodeWithTag(protoWriter, 651, requestBody.conversation_remove_participants_body);
            ConversationLeaveRequestBody.ADAPTER.encodeWithTag(protoWriter, 652, requestBody.leave_conversation_body);
            UpdateConversationParticipantRequestBody.ADAPTER.encodeWithTag(protoWriter, 655, requestBody.update_conversation_participant_body);
            BatchUpdateConversationParticipantRequestBody.ADAPTER.encodeWithTag(protoWriter, 656, requestBody.batch_update_conversation_participant_body);
            DeleteMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 701, requestBody.delete_message_body);
            RecallMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 702, requestBody.recall_message_body);
            ModifyMessagePropertyRequestBody.ADAPTER.encodeWithTag(protoWriter, 705, requestBody.modify_message_property_body);
            SetConversationCoreInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 902, requestBody.set_conversation_core_info_body);
            UpsertConversationCoreExtInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 904, requestBody.upsert_conversation_core_ext_info_body);
            SetConversationSettingInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 921, requestBody.set_conversation_setting_info_body);
            UpsertConversationSettingExtInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 922, requestBody.upsert_conversation_setting_ext_info_body);
            GetStrangerConversationListRequestBody.ADAPTER.encodeWithTag(protoWriter, 1000, requestBody.get_stranger_conversation_body);
            GetStrangerMessagesRequestBody.ADAPTER.encodeWithTag(protoWriter, 1001, requestBody.get_stranger_messages_body);
            DeleteStrangerMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 1002, requestBody.delete_stranger_message_body);
            DeleteStrangerConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 1003, requestBody.delete_stranger_conversation_body);
            DeleteStrangerAllConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 1004, requestBody.delete_stranger_all_conversation_body);
            MarkStrangerConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 1005, requestBody.mark_stranger_conversation_read_body);
            MarkStrangerAllConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 1006, requestBody.mark_stranger_all_conversation_read_body);
            GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.encodeWithTag(protoWriter, LiveNetAdaptiveHurryTimeSetting.DEFAULT, requestBody.participants_read_index_body);
            GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.encodeWithTag(protoWriter, 2001, requestBody.participants_min_index_body);
            GetTicketRequestBody.ADAPTER.encodeWithTag(protoWriter, 2005, requestBody.get_ticket_body);
            GetUserConversationListRequestBody.ADAPTER.encodeWithTag(protoWriter, 2006, requestBody.get_conversation_list_body);
            BroadcastUserCounterRequestBody.ADAPTER.encodeWithTag(protoWriter, 2009, requestBody.broadcast_user_counter_body);
            ClientACKRequestBody.ADAPTER.encodeWithTag(protoWriter, 2010, requestBody.client_ack_body);
            ReportClientMetricsRequestBody.ADAPTER.encodeWithTag(protoWriter, 2016, requestBody.report_client_metrics_body);
            GetConfigsRequestBody.ADAPTER.encodeWithTag(protoWriter, 2017, requestBody.get_configs_body);
            UnReadCountReportRequestBody.ADAPTER.encodeWithTag(protoWriter, 2018, requestBody.unread_count_report_body);
            BlockMembersRequestBody.ADAPTER.encodeWithTag(protoWriter, 2019, requestBody.block_members_body);
            BlockConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 2020, requestBody.block_conversation_body);
            SendMessageP2PRequestBody.ADAPTER.encodeWithTag(protoWriter, 2031, requestBody.send_message_p2p_body);
            GetMessageInfoByIndexV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 2035, requestBody.get_message_info_by_index_v2_body);
            MarkMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 2036, requestBody.mark_message_body);
            PullMarkMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 2037, requestBody.pull_mark_message_body);
            BatchGetConversationParticipantsReadIndexRequestBody.ADAPTER.encodeWithTag(protoWriter, 2038, requestBody.batch_get_conversation_participants_readindex);
            GetRecentMessageReqBody.ADAPTER.encodeWithTag(protoWriter, 2039, requestBody.get_recent_message_body);
            GetCmdMessageReqBody.ADAPTER.encodeWithTag(protoWriter, 2040, requestBody.get_cmd_message_body);
            GetMessageInfoByIndexV2RangeRequestBody.ADAPTER.encodeWithTag(protoWriter, 2041, requestBody.get_message_info_by_index_v2_range_body);
            MessageByInitRequestBody.ADAPTER.encodeWithTag(protoWriter, 2043, requestBody.message_by_init);
            PreviewerMessagesInConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 2044, requestBody.previewer_messages_in_conversation_body);
            PreviewerGetConversationInfoListRequestBody.ADAPTER.encodeWithTag(protoWriter, 2045, requestBody.previewer_get_conversation_info_list_body);
            MarkMsgUnreadCountReportRequestBody.ADAPTER.encodeWithTag(protoWriter, 2054, requestBody.mark_msg_unread_count_report);
            MarkMsgGetUnreadCountRequestBody.ADAPTER.encodeWithTag(protoWriter, 2055, requestBody.mark_msg_get_unread_count);
            BatchUnmarkMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 2056, requestBody.batch_unmark_message);
            ClientBatchACKRequestBody.ADAPTER.encodeWithTag(protoWriter, 2057, requestBody.client_batch_ack_body);
            ConversationMessageSearchRequestBody.ADAPTER.encodeWithTag(protoWriter, 2102, requestBody.conversation_message_search_body);
            ConversationMessagePreViewRequestBody.ADAPTER.encodeWithTag(protoWriter, 2103, requestBody.conversation_message_pre_view_body);
            for (Map.Entry<Integer, ProtoAdapter> entry : adapterMap.entrySet()) {
                if (requestBody.extensions.get(entry.getKey()) != null) {
                    entry.getValue().encodeWithTag(protoWriter, entry.getKey().intValue(), requestBody.extensions.get(entry.getKey()).second);
                }
            }
            protoWriter.writeBytes(requestBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23726);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "RequestBody" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<RequestBody, Builder> {
        public BatchGetConversationParticipantsReadIndexRequestBody batch_get_conversation_participants_readindex;
        public BatchMarkConversationReadRequestBody batch_mark_read_body;
        public BatchUnmarkMessageRequestBody batch_unmark_message;
        public BatchUpdateConversationParticipantRequestBody batch_update_conversation_participant_body;
        public BlockConversationRequestBody block_conversation_body;
        public BlockMembersRequestBody block_members_body;
        public BroadcastUserCounterRequestBody broadcast_user_counter_body;
        public CheckMessagePerUserRequestBody check_messages_per_user_body;
        public ClientACKRequestBody client_ack_body;
        public ClientBatchACKRequestBody client_batch_ack_body;
        public ConversationAddParticipantsRequestBody conversation_add_participants_body;
        public ConversationMessagePreViewRequestBody conversation_message_pre_view_body;
        public ConversationMessageSearchRequestBody conversation_message_search_body;
        public ConversationParticipantsListRequestBody conversation_participants_body;
        public ConversationRemoveParticipantsRequestBody conversation_remove_participants_body;
        public CreateConversationV2RequestBody create_conversation_v2_body;
        public DeleteConversationRequestBody delete_conversation_body;
        public DeleteMessageRequestBody delete_message_body;
        public DeleteStrangerAllConversationRequestBody delete_stranger_all_conversation_body;
        public DeleteStrangerConversationRequestBody delete_stranger_conversation_body;
        public DeleteStrangerMessageRequestBody delete_stranger_message_body;
        public DissolveConversationRequestBody dissolve_conversation_body;
        public HashMap<String, Object> extensionMsgs = new HashMap<>();
        public HashMap<Integer, Pair<ProtoAdapter, Message>> extensions = new HashMap<>();
        public GetCmdMessageReqBody get_cmd_message_body;
        public GetConfigsRequestBody get_configs_body;
        public ConversationsPerUserByFavoriteV2RequestBody get_conversation_info_list_by_favorite_v2_body;
        public ConversationsPerUserByTopV2RequestBody get_conversation_info_list_by_top_v2_body;
        public GetConversationInfoListV2RequestBody get_conversation_info_list_v2_body;
        public GetConversationInfoV2RequestBody get_conversation_info_v2_body;
        public GetUserConversationListRequestBody get_conversation_list_body;
        public GetConversationsCheckInfoRequestBody get_conversations_checkinfo_body;
        public GetMessageByIdRequestBody get_message_by_id_body;
        public GetMessageInfoByIndexV2RequestBody get_message_info_by_index_v2_body;
        public GetMessageInfoByIndexV2RangeRequestBody get_message_info_by_index_v2_range_body;
        public GetMessagesCheckInfoInConversationRequestBody get_messages_checkinfo_in_conversation_body;
        public GetRecentMessageReqBody get_recent_message_body;
        public GetStrangerConversationListRequestBody get_stranger_conversation_body;
        public GetStrangerMessagesRequestBody get_stranger_messages_body;
        public GetTicketRequestBody get_ticket_body;
        public ConversationLeaveRequestBody leave_conversation_body;
        public MarkConversationReadRequestBody mark_conversation_read_body;
        public MarkMessageRequestBody mark_message_body;
        public MarkMsgGetUnreadCountRequestBody mark_msg_get_unread_count;
        public MarkMsgUnreadCountReportRequestBody mark_msg_unread_count_report;
        public MarkStrangerAllConversationReadRequestBody mark_stranger_all_conversation_read_body;
        public MarkStrangerConversationReadRequestBody mark_stranger_conversation_read_body;
        public MessageByInitRequestBody message_by_init;
        public MessagesInConversationRequestBody messages_in_conversation_body;
        public MessagesPerUserRequestBody messages_per_user_body;
        public MessagesPerUserInitV2RequestBody messages_per_user_init_v2_body;
        public ModifyMessagePropertyRequestBody modify_message_property_body;
        public GetConversationParticipantsMinIndexV3RequestBody participants_min_index_body;
        public GetConversationParticipantsReadIndexV3RequestBody participants_read_index_body;
        public PreviewerGetConversationInfoListRequestBody previewer_get_conversation_info_list_body;
        public PreviewerMessagesInConversationRequestBody previewer_messages_in_conversation_body;
        public PullMarkMessageRequestBody pull_mark_message_body;
        public RecallMessageRequestBody recall_message_body;
        public ReportClientMetricsRequestBody report_client_metrics_body;
        public SendMessageRequestBody send_message_body;
        public SendMessageP2PRequestBody send_message_p2p_body;
        public SendUserActionRequestBody send_user_action_body;
        public SetConversationCoreInfoRequestBody set_conversation_core_info_body;
        public SetConversationSettingInfoRequestBody set_conversation_setting_info_body;
        public UnReadCountReportRequestBody unread_count_report_body;
        public UpdateConversationParticipantRequestBody update_conversation_participant_body;
        public UpsertConversationCoreExtInfoRequestBody upsert_conversation_core_ext_info_body;
        public UpsertConversationSettingExtInfoRequestBody upsert_conversation_setting_ext_info_body;

        static {
            Covode.recordClassIndex(23727);
        }

        @Override // com.squareup.wire.Message.Builder
        public final RequestBody build() {
            return new RequestBody(this.send_message_body, this.messages_per_user_body, this.messages_per_user_init_v2_body, this.check_messages_per_user_body, this.get_message_by_id_body, this.messages_in_conversation_body, this.get_messages_checkinfo_in_conversation_body, this.send_user_action_body, this.delete_conversation_body, this.mark_conversation_read_body, this.conversation_participants_body, this.batch_mark_read_body, this.dissolve_conversation_body, this.get_conversations_checkinfo_body, this.get_conversation_info_v2_body, this.create_conversation_v2_body, this.get_conversation_info_list_v2_body, this.get_conversation_info_list_by_favorite_v2_body, this.get_conversation_info_list_by_top_v2_body, this.conversation_add_participants_body, this.conversation_remove_participants_body, this.leave_conversation_body, this.update_conversation_participant_body, this.batch_update_conversation_participant_body, this.delete_message_body, this.recall_message_body, this.modify_message_property_body, this.set_conversation_core_info_body, this.upsert_conversation_core_ext_info_body, this.set_conversation_setting_info_body, this.upsert_conversation_setting_ext_info_body, this.get_stranger_conversation_body, this.get_stranger_messages_body, this.delete_stranger_message_body, this.delete_stranger_conversation_body, this.delete_stranger_all_conversation_body, this.mark_stranger_conversation_read_body, this.mark_stranger_all_conversation_read_body, this.participants_read_index_body, this.participants_min_index_body, this.get_ticket_body, this.get_conversation_list_body, this.broadcast_user_counter_body, this.client_ack_body, this.report_client_metrics_body, this.get_configs_body, this.unread_count_report_body, this.block_members_body, this.block_conversation_body, this.send_message_p2p_body, this.get_message_info_by_index_v2_body, this.mark_message_body, this.pull_mark_message_body, this.batch_get_conversation_participants_readindex, this.get_recent_message_body, this.get_cmd_message_body, this.get_message_info_by_index_v2_range_body, this.message_by_init, this.previewer_messages_in_conversation_body, this.previewer_get_conversation_info_list_body, this.mark_msg_unread_count_report, this.mark_msg_get_unread_count, this.batch_unmark_message, this.client_batch_ack_body, this.conversation_message_search_body, this.conversation_message_pre_view_body, this.extensions, this.extensionMsgs, super.buildUnknownFields());
        }

        public final Builder batch_get_conversation_participants_readindex(BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody) {
            this.batch_get_conversation_participants_readindex = batchGetConversationParticipantsReadIndexRequestBody;
            return this;
        }

        public final Builder batch_mark_read_body(BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
            this.batch_mark_read_body = batchMarkConversationReadRequestBody;
            return this;
        }

        public final Builder batch_unmark_message(BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody) {
            this.batch_unmark_message = batchUnmarkMessageRequestBody;
            return this;
        }

        public final Builder batch_update_conversation_participant_body(BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody) {
            this.batch_update_conversation_participant_body = batchUpdateConversationParticipantRequestBody;
            return this;
        }

        public final Builder block_conversation_body(BlockConversationRequestBody blockConversationRequestBody) {
            this.block_conversation_body = blockConversationRequestBody;
            return this;
        }

        public final Builder block_members_body(BlockMembersRequestBody blockMembersRequestBody) {
            this.block_members_body = blockMembersRequestBody;
            return this;
        }

        public final Builder broadcast_user_counter_body(BroadcastUserCounterRequestBody broadcastUserCounterRequestBody) {
            this.broadcast_user_counter_body = broadcastUserCounterRequestBody;
            return this;
        }

        public final Builder check_messages_per_user_body(CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
            this.check_messages_per_user_body = checkMessagePerUserRequestBody;
            return this;
        }

        public final Builder client_ack_body(ClientACKRequestBody clientACKRequestBody) {
            this.client_ack_body = clientACKRequestBody;
            return this;
        }

        public final Builder client_batch_ack_body(ClientBatchACKRequestBody clientBatchACKRequestBody) {
            this.client_batch_ack_body = clientBatchACKRequestBody;
            return this;
        }

        public final Builder conversation_add_participants_body(ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody) {
            this.conversation_add_participants_body = conversationAddParticipantsRequestBody;
            return this;
        }

        public final Builder conversation_message_pre_view_body(ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody) {
            this.conversation_message_pre_view_body = conversationMessagePreViewRequestBody;
            return this;
        }

        public final Builder conversation_message_search_body(ConversationMessageSearchRequestBody conversationMessageSearchRequestBody) {
            this.conversation_message_search_body = conversationMessageSearchRequestBody;
            return this;
        }

        public final Builder conversation_participants_body(ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
            this.conversation_participants_body = conversationParticipantsListRequestBody;
            return this;
        }

        public final Builder conversation_remove_participants_body(ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
            this.conversation_remove_participants_body = conversationRemoveParticipantsRequestBody;
            return this;
        }

        public final Builder create_conversation_v2_body(CreateConversationV2RequestBody createConversationV2RequestBody) {
            this.create_conversation_v2_body = createConversationV2RequestBody;
            return this;
        }

        public final Builder delete_conversation_body(DeleteConversationRequestBody deleteConversationRequestBody) {
            this.delete_conversation_body = deleteConversationRequestBody;
            return this;
        }

        public final Builder delete_message_body(DeleteMessageRequestBody deleteMessageRequestBody) {
            this.delete_message_body = deleteMessageRequestBody;
            return this;
        }

        public final Builder delete_stranger_all_conversation_body(DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody) {
            this.delete_stranger_all_conversation_body = deleteStrangerAllConversationRequestBody;
            return this;
        }

        public final Builder delete_stranger_conversation_body(DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
            this.delete_stranger_conversation_body = deleteStrangerConversationRequestBody;
            return this;
        }

        public final Builder delete_stranger_message_body(DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            this.delete_stranger_message_body = deleteStrangerMessageRequestBody;
            return this;
        }

        public final Builder dissolve_conversation_body(DissolveConversationRequestBody dissolveConversationRequestBody) {
            this.dissolve_conversation_body = dissolveConversationRequestBody;
            return this;
        }

        public final Builder get_cmd_message_body(GetCmdMessageReqBody getCmdMessageReqBody) {
            this.get_cmd_message_body = getCmdMessageReqBody;
            return this;
        }

        public final Builder get_configs_body(GetConfigsRequestBody getConfigsRequestBody) {
            this.get_configs_body = getConfigsRequestBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_favorite_v2_body(ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
            this.get_conversation_info_list_by_favorite_v2_body = conversationsPerUserByFavoriteV2RequestBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_top_v2_body(ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody) {
            this.get_conversation_info_list_by_top_v2_body = conversationsPerUserByTopV2RequestBody;
            return this;
        }

        public final Builder get_conversation_info_list_v2_body(GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
            this.get_conversation_info_list_v2_body = getConversationInfoListV2RequestBody;
            return this;
        }

        public final Builder get_conversation_info_v2_body(GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
            this.get_conversation_info_v2_body = getConversationInfoV2RequestBody;
            return this;
        }

        public final Builder get_conversation_list_body(GetUserConversationListRequestBody getUserConversationListRequestBody) {
            this.get_conversation_list_body = getUserConversationListRequestBody;
            return this;
        }

        public final Builder get_conversations_checkinfo_body(GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody) {
            this.get_conversations_checkinfo_body = getConversationsCheckInfoRequestBody;
            return this;
        }

        public final Builder get_message_by_id_body(GetMessageByIdRequestBody getMessageByIdRequestBody) {
            this.get_message_by_id_body = getMessageByIdRequestBody;
            return this;
        }

        public final Builder get_message_info_by_index_v2_body(GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody) {
            this.get_message_info_by_index_v2_body = getMessageInfoByIndexV2RequestBody;
            return this;
        }

        public final Builder get_message_info_by_index_v2_range_body(GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody) {
            this.get_message_info_by_index_v2_range_body = getMessageInfoByIndexV2RangeRequestBody;
            return this;
        }

        public final Builder get_messages_checkinfo_in_conversation_body(GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
            this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationRequestBody;
            return this;
        }

        public final Builder get_recent_message_body(GetRecentMessageReqBody getRecentMessageReqBody) {
            this.get_recent_message_body = getRecentMessageReqBody;
            return this;
        }

        public final Builder get_stranger_conversation_body(GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
            this.get_stranger_conversation_body = getStrangerConversationListRequestBody;
            return this;
        }

        public final Builder get_stranger_messages_body(GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
            this.get_stranger_messages_body = getStrangerMessagesRequestBody;
            return this;
        }

        public final Builder get_ticket_body(GetTicketRequestBody getTicketRequestBody) {
            this.get_ticket_body = getTicketRequestBody;
            return this;
        }

        public final Builder leave_conversation_body(ConversationLeaveRequestBody conversationLeaveRequestBody) {
            this.leave_conversation_body = conversationLeaveRequestBody;
            return this;
        }

        public final Builder mark_conversation_read_body(MarkConversationReadRequestBody markConversationReadRequestBody) {
            this.mark_conversation_read_body = markConversationReadRequestBody;
            return this;
        }

        public final Builder mark_message_body(MarkMessageRequestBody markMessageRequestBody) {
            this.mark_message_body = markMessageRequestBody;
            return this;
        }

        public final Builder mark_msg_get_unread_count(MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody) {
            this.mark_msg_get_unread_count = markMsgGetUnreadCountRequestBody;
            return this;
        }

        public final Builder mark_msg_unread_count_report(MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody) {
            this.mark_msg_unread_count_report = markMsgUnreadCountReportRequestBody;
            return this;
        }

        public final Builder mark_stranger_all_conversation_read_body(MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody) {
            this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadRequestBody;
            return this;
        }

        public final Builder mark_stranger_conversation_read_body(MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody) {
            this.mark_stranger_conversation_read_body = markStrangerConversationReadRequestBody;
            return this;
        }

        public final Builder message_by_init(MessageByInitRequestBody messageByInitRequestBody) {
            this.message_by_init = messageByInitRequestBody;
            return this;
        }

        public final Builder messages_in_conversation_body(MessagesInConversationRequestBody messagesInConversationRequestBody) {
            this.messages_in_conversation_body = messagesInConversationRequestBody;
            return this;
        }

        public final Builder messages_per_user_body(MessagesPerUserRequestBody messagesPerUserRequestBody) {
            this.messages_per_user_body = messagesPerUserRequestBody;
            return this;
        }

        public final Builder messages_per_user_init_v2_body(MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
            this.messages_per_user_init_v2_body = messagesPerUserInitV2RequestBody;
            return this;
        }

        public final Builder modify_message_property_body(ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
            this.modify_message_property_body = modifyMessagePropertyRequestBody;
            return this;
        }

        public final Builder participants_min_index_body(GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody) {
            this.participants_min_index_body = getConversationParticipantsMinIndexV3RequestBody;
            return this;
        }

        public final Builder participants_read_index_body(GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
            this.participants_read_index_body = getConversationParticipantsReadIndexV3RequestBody;
            return this;
        }

        public final Builder previewer_get_conversation_info_list_body(PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody) {
            this.previewer_get_conversation_info_list_body = previewerGetConversationInfoListRequestBody;
            return this;
        }

        public final Builder previewer_messages_in_conversation_body(PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody) {
            this.previewer_messages_in_conversation_body = previewerMessagesInConversationRequestBody;
            return this;
        }

        public final Builder pull_mark_message_body(PullMarkMessageRequestBody pullMarkMessageRequestBody) {
            this.pull_mark_message_body = pullMarkMessageRequestBody;
            return this;
        }

        public final Builder recall_message_body(RecallMessageRequestBody recallMessageRequestBody) {
            this.recall_message_body = recallMessageRequestBody;
            return this;
        }

        public final Builder report_client_metrics_body(ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
            this.report_client_metrics_body = reportClientMetricsRequestBody;
            return this;
        }

        public final Builder send_message_body(SendMessageRequestBody sendMessageRequestBody) {
            this.send_message_body = sendMessageRequestBody;
            return this;
        }

        public final Builder send_message_p2p_body(SendMessageP2PRequestBody sendMessageP2PRequestBody) {
            this.send_message_p2p_body = sendMessageP2PRequestBody;
            return this;
        }

        public final Builder send_user_action_body(SendUserActionRequestBody sendUserActionRequestBody) {
            this.send_user_action_body = sendUserActionRequestBody;
            return this;
        }

        public final Builder set_conversation_core_info_body(SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
            this.set_conversation_core_info_body = setConversationCoreInfoRequestBody;
            return this;
        }

        public final Builder set_conversation_setting_info_body(SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
            this.set_conversation_setting_info_body = setConversationSettingInfoRequestBody;
            return this;
        }

        public final Builder unread_count_report_body(UnReadCountReportRequestBody unReadCountReportRequestBody) {
            this.unread_count_report_body = unReadCountReportRequestBody;
            return this;
        }

        public final Builder update_conversation_participant_body(UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
            this.update_conversation_participant_body = updateConversationParticipantRequestBody;
            return this;
        }

        public final Builder upsert_conversation_core_ext_info_body(UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody) {
            this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoRequestBody;
            return this;
        }

        public final Builder upsert_conversation_setting_ext_info_body(UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody) {
            this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoRequestBody;
            return this;
        }

        public final Builder addExtension(int i2, ProtoAdapter protoAdapter, Message message) {
            this.extensions.put(Integer.valueOf(i2), new Pair<>(protoAdapter, message));
            this.extensionMsgs.put(message.getClass().getSimpleName(), message);
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.send_message_body = this.send_message_body;
        builder.messages_per_user_body = this.messages_per_user_body;
        builder.messages_per_user_init_v2_body = this.messages_per_user_init_v2_body;
        builder.check_messages_per_user_body = this.check_messages_per_user_body;
        builder.get_message_by_id_body = this.get_message_by_id_body;
        builder.messages_in_conversation_body = this.messages_in_conversation_body;
        builder.get_messages_checkinfo_in_conversation_body = this.get_messages_checkinfo_in_conversation_body;
        builder.send_user_action_body = this.send_user_action_body;
        builder.delete_conversation_body = this.delete_conversation_body;
        builder.mark_conversation_read_body = this.mark_conversation_read_body;
        builder.conversation_participants_body = this.conversation_participants_body;
        builder.batch_mark_read_body = this.batch_mark_read_body;
        builder.dissolve_conversation_body = this.dissolve_conversation_body;
        builder.get_conversations_checkinfo_body = this.get_conversations_checkinfo_body;
        builder.get_conversation_info_v2_body = this.get_conversation_info_v2_body;
        builder.create_conversation_v2_body = this.create_conversation_v2_body;
        builder.get_conversation_info_list_v2_body = this.get_conversation_info_list_v2_body;
        builder.get_conversation_info_list_by_favorite_v2_body = this.get_conversation_info_list_by_favorite_v2_body;
        builder.get_conversation_info_list_by_top_v2_body = this.get_conversation_info_list_by_top_v2_body;
        builder.conversation_add_participants_body = this.conversation_add_participants_body;
        builder.conversation_remove_participants_body = this.conversation_remove_participants_body;
        builder.leave_conversation_body = this.leave_conversation_body;
        builder.update_conversation_participant_body = this.update_conversation_participant_body;
        builder.batch_update_conversation_participant_body = this.batch_update_conversation_participant_body;
        builder.delete_message_body = this.delete_message_body;
        builder.recall_message_body = this.recall_message_body;
        builder.modify_message_property_body = this.modify_message_property_body;
        builder.set_conversation_core_info_body = this.set_conversation_core_info_body;
        builder.upsert_conversation_core_ext_info_body = this.upsert_conversation_core_ext_info_body;
        builder.set_conversation_setting_info_body = this.set_conversation_setting_info_body;
        builder.upsert_conversation_setting_ext_info_body = this.upsert_conversation_setting_ext_info_body;
        builder.get_stranger_conversation_body = this.get_stranger_conversation_body;
        builder.get_stranger_messages_body = this.get_stranger_messages_body;
        builder.delete_stranger_message_body = this.delete_stranger_message_body;
        builder.delete_stranger_conversation_body = this.delete_stranger_conversation_body;
        builder.delete_stranger_all_conversation_body = this.delete_stranger_all_conversation_body;
        builder.mark_stranger_conversation_read_body = this.mark_stranger_conversation_read_body;
        builder.mark_stranger_all_conversation_read_body = this.mark_stranger_all_conversation_read_body;
        builder.participants_read_index_body = this.participants_read_index_body;
        builder.participants_min_index_body = this.participants_min_index_body;
        builder.get_ticket_body = this.get_ticket_body;
        builder.get_conversation_list_body = this.get_conversation_list_body;
        builder.broadcast_user_counter_body = this.broadcast_user_counter_body;
        builder.client_ack_body = this.client_ack_body;
        builder.report_client_metrics_body = this.report_client_metrics_body;
        builder.get_configs_body = this.get_configs_body;
        builder.unread_count_report_body = this.unread_count_report_body;
        builder.block_members_body = this.block_members_body;
        builder.block_conversation_body = this.block_conversation_body;
        builder.send_message_p2p_body = this.send_message_p2p_body;
        builder.get_message_info_by_index_v2_body = this.get_message_info_by_index_v2_body;
        builder.mark_message_body = this.mark_message_body;
        builder.pull_mark_message_body = this.pull_mark_message_body;
        builder.batch_get_conversation_participants_readindex = this.batch_get_conversation_participants_readindex;
        builder.get_recent_message_body = this.get_recent_message_body;
        builder.get_cmd_message_body = this.get_cmd_message_body;
        builder.get_message_info_by_index_v2_range_body = this.get_message_info_by_index_v2_range_body;
        builder.message_by_init = this.message_by_init;
        builder.previewer_messages_in_conversation_body = this.previewer_messages_in_conversation_body;
        builder.previewer_get_conversation_info_list_body = this.previewer_get_conversation_info_list_body;
        builder.mark_msg_unread_count_report = this.mark_msg_unread_count_report;
        builder.mark_msg_get_unread_count = this.mark_msg_get_unread_count;
        builder.batch_unmark_message = this.batch_unmark_message;
        builder.client_batch_ack_body = this.client_batch_ack_body;
        builder.conversation_message_search_body = this.conversation_message_search_body;
        builder.conversation_message_pre_view_body = this.conversation_message_pre_view_body;
        builder.extensions = this.extensions;
        builder.extensionMsgs = this.extensionMsgs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final <T> T getExtension(int i2) {
        if (this.extensions.get(Integer.valueOf(i2)) == null) {
            return null;
        }
        try {
            return (T) this.extensions.get(Integer.valueOf(i2)).second;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}

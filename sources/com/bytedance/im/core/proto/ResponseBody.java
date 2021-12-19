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

public final class ResponseBody extends Message<ResponseBody, Builder> {
    public static final ProtoAdapter<ResponseBody> ADAPTER = new ProtoAdapter_ResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "batch_get_conversation_participants_readindex")
    public final BatchGetConversationParticipantsReadIndexResponseBody batch_get_conversation_participants_readindex;
    @c(a = "batch_unmark_message")
    public final BatchUnmarkMessageResponseBody batch_unmark_message;
    @c(a = "batch_update_conversation_participant_body")
    public final BatchUpdateConversationParticipantResponseBody batch_update_conversation_participant_body;
    @c(a = "block_conversation_body")
    public final BlockConversationResponseBody block_conversation_body;
    @c(a = "block_members_body")
    public final BlockMembersResponseBody block_members_body;
    @c(a = "broadcast_user_counter_body")
    public final BroadcastUserCounterResponseBody broadcast_user_counter_body;
    @c(a = "check_messages_per_user_body")
    public final CheckMessagesPerUserResponseBody check_messages_per_user_body;
    @c(a = "client_batch_ack_body")
    public final ClientBatchACKResponseBody client_batch_ack_body;
    @c(a = "conversation_add_participants_body")
    public final ConversationAddParticipantsResponseBody conversation_add_participants_body;
    @c(a = "conversation_message_pre_view_body")
    public final ConversationMessagePreViewResponseBody conversation_message_pre_view_body;
    @c(a = "conversation_participants_body")
    public final ConversationParticipantsListResponseBody conversation_participants_body;
    @c(a = "conversation_remove_participants_body")
    public final ConversationRemoveParticipantsResponseBody conversation_remove_participants_body;
    @c(a = "create_conversation_v2_body")
    public final CreateConversationV2ResponseBody create_conversation_v2_body;
    @c(a = "delete_stranger_all_conversation_body")
    public final DeleteStrangerAllConversationResponseBody delete_stranger_all_conversation_body;
    @c(a = "delete_stranger_conversation_body")
    public final DeleteStrangerConversationResponseBody delete_stranger_conversation_body;
    @c(a = "delete_stranger_message_body")
    public final DeleteStrangerMessageResponseBody delete_stranger_message_body;
    private HashMap<String, Object> extensionMsgs;
    public transient HashMap<Integer, Pair<ProtoAdapter, Message>> extensions;
    @c(a = "get_cmd_message_body")
    public final GetCmdMessageRespBody get_cmd_message_body;
    @c(a = "get_configs_body")
    public final GetConfigsResponseBody get_configs_body;
    @c(a = "get_conversation_info_list_by_favorite_v2_body")
    public final GetConversationInfoListByFavoriteV2ResponseBody get_conversation_info_list_by_favorite_v2_body;
    @c(a = "get_conversation_info_list_by_top_v2_body")
    public final GetConversationInfoListByTopV2ResponseBody get_conversation_info_list_by_top_v2_body;
    @c(a = "get_conversation_info_list_v2_body")
    public final GetConversationInfoListV2ResponseBody get_conversation_info_list_v2_body;
    @c(a = "get_conversation_info_v2_body")
    public final GetConversationInfoV2ResponseBody get_conversation_info_v2_body;
    @c(a = "get_conversation_list_body")
    public final GetUserConversationListResponseBody get_conversation_list_body;
    @c(a = "get_conversations_checkinfo_body")
    public final GetConversationsCheckInfoResponseBody get_conversations_checkinfo_body;
    @c(a = "get_message_by_id_body")
    public final GetMessageByIdResponseBody get_message_by_id_body;
    @c(a = "get_message_info_by_index_v2_body")
    public final GetMessageInfoByIndexV2ResponseBody get_message_info_by_index_v2_body;
    @c(a = "get_message_info_by_index_v2_range_body")
    public final GetMessageInfoByIndexV2RangeResponseBody get_message_info_by_index_v2_range_body;
    @c(a = "get_messages_checkinfo_in_conversation_body")
    public final GetMessagesCheckInfoInConversationResponseBody get_messages_checkinfo_in_conversation_body;
    @c(a = "get_recent_message_body")
    public final GetRecentMessageRespBody get_recent_message_body;
    @c(a = "get_stranger_conversation_body")
    public final GetStrangerConversationListResponseBody get_stranger_conversation_body;
    @c(a = "get_stranger_messages_body")
    public final GetStrangerMessagesResponseBody get_stranger_messages_body;
    @c(a = "get_stranger_unread_count_body")
    public final GetStrangerUnreadCountResponseBody get_stranger_unread_count_body;
    @c(a = "get_ticket_body")
    public final GetTicketResponseBody get_ticket_body;
    @c(a = "has_new_message_notify")
    public final NewMessageNotify has_new_message_notify;
    @c(a = "has_new_p2p_message_notify")
    public final NewP2PMessageNotify has_new_p2p_message_notify;
    @c(a = "mark_conversation_read_notify")
    public final MarkConversationReadNotify mark_conversation_read_notify;
    @c(a = "mark_message_body")
    public final MarkMessageResponseBody mark_message_body;
    @c(a = "mark_msg_get_unread_count")
    public final MarkMsgGetUnreadCountResponseBody mark_msg_get_unread_count;
    @c(a = "mark_msg_unread_count_report")
    public final MarkMsgUnreadCountReportResponseBody mark_msg_unread_count_report;
    @c(a = "mark_stranger_all_conversation_read_body")
    public final MarkStrangerAllConversationReadResponseBody mark_stranger_all_conversation_read_body;
    @c(a = "mark_stranger_conversation_read_body")
    public final MarkStrangerConversationReadResponseBody mark_stranger_conversation_read_body;
    @c(a = "message_by_init")
    public final MessageByInitResponseBody message_by_init;
    @c(a = "messages_in_conversation_body")
    public final MessagesInConversationResponseBody messages_in_conversation_body;
    @c(a = "messages_per_user_body")
    public final MessagesPerUserResponseBody messages_per_user_body;
    @c(a = "messages_per_user_init_v2_body")
    public final MessagesPerUserInitV2ResponseBody messages_per_user_init_v2_body;
    @c(a = "modify_message_property_body")
    public final ModifyMessagePropertyResponseBody modify_message_property_body;
    @c(a = "participants_min_index_body")
    public final GetConversationParticipantsMinIndexV3ResponseBody participants_min_index_body;
    @c(a = "participants_read_index_body")
    public final GetConversationParticipantsReadIndexV3ResponseBody participants_read_index_body;
    @c(a = "previewer_get_conversation_info_list_body")
    public final PreviewerGetConversationInfoListResponseBody previewer_get_conversation_info_list_body;
    @c(a = "previewer_messages_in_conversation_body")
    public final PreviewerMessagesInConversationResponseBody previewer_messages_in_conversation_body;
    @c(a = "pull_mark_message_body")
    public final PullMarkMessageResponseBody pull_mark_message_body;
    @c(a = "report_client_metrics_body")
    public final ReportClientMetricsResponseBody report_client_metrics_body;
    @c(a = "send_message_body")
    public final SendMessageResponseBody send_message_body;
    @c(a = "send_user_action_body")
    public final SendUserActionResponseBody send_user_action_body;
    @c(a = "set_conversation_core_info_body")
    public final SetConversationCoreInfoResponseBody set_conversation_core_info_body;
    @c(a = "set_conversation_setting_info_body")
    public final SetConversationSettingInfoResponseBody set_conversation_setting_info_body;
    @c(a = "stranger_has_new_message_notify")
    public final StrangerNewMessageNotify stranger_has_new_message_notify;
    @c(a = "update_conversation_participant_body")
    public final UpdateConversationParticipantResponseBody update_conversation_participant_body;
    @c(a = "upsert_conversation_core_ext_info_body")
    public final UpsertConversationCoreExtInfoResponseBody upsert_conversation_core_ext_info_body;
    @c(a = "upsert_conversation_setting_ext_info_body")
    public final UpsertConversationSettingExtInfoResponseBody upsert_conversation_setting_ext_info_body;

    public static final class ProtoAdapter_ResponseBody extends ProtoAdapter<ResponseBody> {
        public static HashMap<Integer, ProtoAdapter> adapterMap = new HashMap<>();

        public ProtoAdapter_ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ResponseBody.class);
        }

        static {
            Covode.recordClassIndex(23734);
        }

        public final int encodedSize(ResponseBody responseBody) {
            int encodedSizeWithTag = SendMessageResponseBody.ADAPTER.encodedSizeWithTag(100, responseBody.send_message_body) + MessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(200, responseBody.messages_per_user_body) + MessagesPerUserInitV2ResponseBody.ADAPTER.encodedSizeWithTag(203, responseBody.messages_per_user_init_v2_body) + CheckMessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(210, responseBody.check_messages_per_user_body) + GetMessageByIdResponseBody.ADAPTER.encodedSizeWithTag(211, responseBody.get_message_by_id_body) + MessagesInConversationResponseBody.ADAPTER.encodedSizeWithTag(301, responseBody.messages_in_conversation_body) + GetMessagesCheckInfoInConversationResponseBody.ADAPTER.encodedSizeWithTag(302, responseBody.get_messages_checkinfo_in_conversation_body) + SendUserActionResponseBody.ADAPTER.encodedSizeWithTag(410, responseBody.send_user_action_body) + NewMessageNotify.ADAPTER.encodedSizeWithTag(500, responseBody.has_new_message_notify) + MarkConversationReadNotify.ADAPTER.encodedSizeWithTag(501, responseBody.mark_conversation_read_notify) + StrangerNewMessageNotify.ADAPTER.encodedSizeWithTag(503, responseBody.stranger_has_new_message_notify) + NewP2PMessageNotify.ADAPTER.encodedSizeWithTag(504, responseBody.has_new_p2p_message_notify) + GetConversationsCheckInfoResponseBody.ADAPTER.encodedSizeWithTag(615, responseBody.get_conversations_checkinfo_body) + GetConversationInfoV2ResponseBody.ADAPTER.encodedSizeWithTag(608, responseBody.get_conversation_info_v2_body) + CreateConversationV2ResponseBody.ADAPTER.encodedSizeWithTag(609, responseBody.create_conversation_v2_body) + GetConversationInfoListV2ResponseBody.ADAPTER.encodedSizeWithTag(610, responseBody.get_conversation_info_list_v2_body) + GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.encodedSizeWithTag(611, responseBody.get_conversation_info_list_by_favorite_v2_body) + GetConversationInfoListByTopV2ResponseBody.ADAPTER.encodedSizeWithTag(612, responseBody.get_conversation_info_list_by_top_v2_body) + ConversationParticipantsListResponseBody.ADAPTER.encodedSizeWithTag(605, responseBody.conversation_participants_body) + ConversationAddParticipantsResponseBody.ADAPTER.encodedSizeWithTag(650, responseBody.conversation_add_participants_body) + ConversationRemoveParticipantsResponseBody.ADAPTER.encodedSizeWithTag(651, responseBody.conversation_remove_participants_body) + UpdateConversationParticipantResponseBody.ADAPTER.encodedSizeWithTag(655, responseBody.update_conversation_participant_body) + BatchUpdateConversationParticipantResponseBody.ADAPTER.encodedSizeWithTag(656, responseBody.batch_update_conversation_participant_body) + ModifyMessagePropertyResponseBody.ADAPTER.encodedSizeWithTag(705, responseBody.modify_message_property_body) + SetConversationCoreInfoResponseBody.ADAPTER.encodedSizeWithTag(902, responseBody.set_conversation_core_info_body) + UpsertConversationCoreExtInfoResponseBody.ADAPTER.encodedSizeWithTag(904, responseBody.upsert_conversation_core_ext_info_body) + SetConversationSettingInfoResponseBody.ADAPTER.encodedSizeWithTag(921, responseBody.set_conversation_setting_info_body) + UpsertConversationSettingExtInfoResponseBody.ADAPTER.encodedSizeWithTag(922, responseBody.upsert_conversation_setting_ext_info_body) + GetStrangerConversationListResponseBody.ADAPTER.encodedSizeWithTag(1000, responseBody.get_stranger_conversation_body) + GetStrangerMessagesResponseBody.ADAPTER.encodedSizeWithTag(1001, responseBody.get_stranger_messages_body) + DeleteStrangerMessageResponseBody.ADAPTER.encodedSizeWithTag(1002, responseBody.delete_stranger_message_body) + DeleteStrangerConversationResponseBody.ADAPTER.encodedSizeWithTag(1003, responseBody.delete_stranger_conversation_body) + DeleteStrangerAllConversationResponseBody.ADAPTER.encodedSizeWithTag(1004, responseBody.delete_stranger_all_conversation_body) + MarkStrangerConversationReadResponseBody.ADAPTER.encodedSizeWithTag(1005, responseBody.mark_stranger_conversation_read_body) + MarkStrangerAllConversationReadResponseBody.ADAPTER.encodedSizeWithTag(1006, responseBody.mark_stranger_all_conversation_read_body) + GetStrangerUnreadCountResponseBody.ADAPTER.encodedSizeWithTag(1007, responseBody.get_stranger_unread_count_body) + GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(LiveNetAdaptiveHurryTimeSetting.DEFAULT, responseBody.participants_read_index_body) + GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(2001, responseBody.participants_min_index_body) + GetTicketResponseBody.ADAPTER.encodedSizeWithTag(2005, responseBody.get_ticket_body) + GetUserConversationListResponseBody.ADAPTER.encodedSizeWithTag(2006, responseBody.get_conversation_list_body) + BroadcastUserCounterResponseBody.ADAPTER.encodedSizeWithTag(2009, responseBody.broadcast_user_counter_body) + ReportClientMetricsResponseBody.ADAPTER.encodedSizeWithTag(2016, responseBody.report_client_metrics_body) + GetConfigsResponseBody.ADAPTER.encodedSizeWithTag(2017, responseBody.get_configs_body) + BlockMembersResponseBody.ADAPTER.encodedSizeWithTag(2019, responseBody.block_members_body) + BlockConversationResponseBody.ADAPTER.encodedSizeWithTag(2020, responseBody.block_conversation_body) + GetMessageInfoByIndexV2ResponseBody.ADAPTER.encodedSizeWithTag(2035, responseBody.get_message_info_by_index_v2_body) + MarkMessageResponseBody.ADAPTER.encodedSizeWithTag(2036, responseBody.mark_message_body) + PullMarkMessageResponseBody.ADAPTER.encodedSizeWithTag(2037, responseBody.pull_mark_message_body) + BatchGetConversationParticipantsReadIndexResponseBody.ADAPTER.encodedSizeWithTag(2038, responseBody.batch_get_conversation_participants_readindex) + GetRecentMessageRespBody.ADAPTER.encodedSizeWithTag(2039, responseBody.get_recent_message_body) + GetCmdMessageRespBody.ADAPTER.encodedSizeWithTag(2040, responseBody.get_cmd_message_body) + GetMessageInfoByIndexV2RangeResponseBody.ADAPTER.encodedSizeWithTag(2041, responseBody.get_message_info_by_index_v2_range_body) + MessageByInitResponseBody.ADAPTER.encodedSizeWithTag(2043, responseBody.message_by_init) + PreviewerMessagesInConversationResponseBody.ADAPTER.encodedSizeWithTag(2044, responseBody.previewer_messages_in_conversation_body) + PreviewerGetConversationInfoListResponseBody.ADAPTER.encodedSizeWithTag(2045, responseBody.previewer_get_conversation_info_list_body) + MarkMsgUnreadCountReportResponseBody.ADAPTER.encodedSizeWithTag(2054, responseBody.mark_msg_unread_count_report) + MarkMsgGetUnreadCountResponseBody.ADAPTER.encodedSizeWithTag(2055, responseBody.mark_msg_get_unread_count) + BatchUnmarkMessageResponseBody.ADAPTER.encodedSizeWithTag(2056, responseBody.batch_unmark_message) + ClientBatchACKResponseBody.ADAPTER.encodedSizeWithTag(2057, responseBody.client_batch_ack_body) + ConversationMessagePreViewResponseBody.ADAPTER.encodedSizeWithTag(2103, responseBody.conversation_message_pre_view_body) + responseBody.unknownFields().size();
            for (Map.Entry<Integer, ProtoAdapter> entry : adapterMap.entrySet()) {
                if (responseBody.extensions.get(entry.getKey()) != null) {
                    encodedSizeWithTag += entry.getValue().encodedSizeWithTag(entry.getKey().intValue(), responseBody.extensions.get(entry.getKey()).second);
                }
            }
            return encodedSizeWithTag;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.im.core.proto.ResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ResponseBody redact(com.bytedance.im.core.proto.ResponseBody r5) {
            /*
            // Method dump skipped, instructions count: 1001
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ResponseBody.ProtoAdapter_ResponseBody.redact(com.bytedance.im.core.proto.ResponseBody):com.bytedance.im.core.proto.ResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 210) {
                    builder.check_messages_per_user_body(CheckMessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 211) {
                    builder.get_message_by_id_body(GetMessageByIdResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 301) {
                    builder.messages_in_conversation_body(MessagesInConversationResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 302) {
                    builder.get_messages_checkinfo_in_conversation_body(GetMessagesCheckInfoInConversationResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 500) {
                    builder.has_new_message_notify(NewMessageNotify.ADAPTER.decode(protoReader));
                } else if (nextTag == 501) {
                    builder.mark_conversation_read_notify(MarkConversationReadNotify.ADAPTER.decode(protoReader));
                } else if (nextTag == 503) {
                    builder.stranger_has_new_message_notify(StrangerNewMessageNotify.ADAPTER.decode(protoReader));
                } else if (nextTag == 504) {
                    builder.has_new_p2p_message_notify(NewP2PMessageNotify.ADAPTER.decode(protoReader));
                } else if (nextTag == 650) {
                    builder.conversation_add_participants_body(ConversationAddParticipantsResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 651) {
                    builder.conversation_remove_participants_body(ConversationRemoveParticipantsResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 655) {
                    builder.update_conversation_participant_body(UpdateConversationParticipantResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 656) {
                    builder.batch_update_conversation_participant_body(BatchUpdateConversationParticipantResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 921) {
                    builder.set_conversation_setting_info_body(SetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 922) {
                    builder.upsert_conversation_setting_ext_info_body(UpsertConversationSettingExtInfoResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 2000) {
                    builder.participants_read_index_body(GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.decode(protoReader));
                } else if (nextTag != 2001) {
                    switch (nextTag) {
                        case a.f41622a:
                            builder.send_message_body(SendMessageResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 200:
                            builder.messages_per_user_body(MessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 203:
                            builder.messages_per_user_init_v2_body(MessagesPerUserInitV2ResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 410:
                            builder.send_user_action_body(SendUserActionResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 605:
                            builder.conversation_participants_body(ConversationParticipantsListResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 615:
                            builder.get_conversations_checkinfo_body(GetConversationsCheckInfoResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 705:
                            builder.modify_message_property_body(ModifyMessagePropertyResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 902:
                            builder.set_conversation_core_info_body(SetConversationCoreInfoResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 904:
                            builder.upsert_conversation_core_ext_info_body(UpsertConversationCoreExtInfoResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 1000:
                            builder.get_stranger_conversation_body(GetStrangerConversationListResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 1001:
                            builder.get_stranger_messages_body(GetStrangerMessagesResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 1002:
                            builder.delete_stranger_message_body(DeleteStrangerMessageResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 1003:
                            builder.delete_stranger_conversation_body(DeleteStrangerConversationResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 1004:
                            builder.delete_stranger_all_conversation_body(DeleteStrangerAllConversationResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 1005:
                            builder.mark_stranger_conversation_read_body(MarkStrangerConversationReadResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 1006:
                            builder.mark_stranger_all_conversation_read_body(MarkStrangerAllConversationReadResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 1007:
                            builder.get_stranger_unread_count_body(GetStrangerUnreadCountResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2005:
                            builder.get_ticket_body(GetTicketResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2006:
                            builder.get_conversation_list_body(GetUserConversationListResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2009:
                            builder.broadcast_user_counter_body(BroadcastUserCounterResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2016:
                            builder.report_client_metrics_body(ReportClientMetricsResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2017:
                            builder.get_configs_body(GetConfigsResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2019:
                            builder.block_members_body(BlockMembersResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2020:
                            builder.block_conversation_body(BlockConversationResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2035:
                            builder.get_message_info_by_index_v2_body(GetMessageInfoByIndexV2ResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2036:
                            builder.mark_message_body(MarkMessageResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2037:
                            builder.pull_mark_message_body(PullMarkMessageResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2038:
                            builder.batch_get_conversation_participants_readindex(BatchGetConversationParticipantsReadIndexResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2039:
                            builder.get_recent_message_body(GetRecentMessageRespBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2040:
                            builder.get_cmd_message_body(GetCmdMessageRespBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2041:
                            builder.get_message_info_by_index_v2_range_body(GetMessageInfoByIndexV2RangeResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2043:
                            builder.message_by_init(MessageByInitResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2044:
                            builder.previewer_messages_in_conversation_body(PreviewerMessagesInConversationResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2045:
                            builder.previewer_get_conversation_info_list_body(PreviewerGetConversationInfoListResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2054:
                            builder.mark_msg_unread_count_report(MarkMsgUnreadCountReportResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2055:
                            builder.mark_msg_get_unread_count(MarkMsgGetUnreadCountResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2056:
                            builder.batch_unmark_message(BatchUnmarkMessageResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2057:
                            builder.client_batch_ack_body(ClientBatchACKResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        case 2103:
                            builder.conversation_message_pre_view_body(ConversationMessagePreViewResponseBody.ADAPTER.decode(protoReader));
                            continue;
                        default:
                            switch (nextTag) {
                                case 608:
                                    builder.get_conversation_info_v2_body(GetConversationInfoV2ResponseBody.ADAPTER.decode(protoReader));
                                    continue;
                                case 609:
                                    builder.create_conversation_v2_body(CreateConversationV2ResponseBody.ADAPTER.decode(protoReader));
                                    continue;
                                case 610:
                                    builder.get_conversation_info_list_v2_body(GetConversationInfoListV2ResponseBody.ADAPTER.decode(protoReader));
                                    continue;
                                case 611:
                                    builder.get_conversation_info_list_by_favorite_v2_body(GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.decode(protoReader));
                                    continue;
                                case 612:
                                    builder.get_conversation_info_list_by_top_v2_body(GetConversationInfoListByTopV2ResponseBody.ADAPTER.decode(protoReader));
                                    continue;
                                default:
                                    if (adapterMap.get(Integer.valueOf(nextTag)) != null) {
                                        builder.addExtension(nextTag, adapterMap.get(Integer.valueOf(nextTag)), (Message) adapterMap.get(Integer.valueOf(nextTag)).decode(protoReader));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                            }
                    }
                } else {
                    builder.participants_min_index_body(GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ResponseBody responseBody) {
            SendMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 100, responseBody.send_message_body);
            MessagesPerUserResponseBody.ADAPTER.encodeWithTag(protoWriter, 200, responseBody.messages_per_user_body);
            MessagesPerUserInitV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 203, responseBody.messages_per_user_init_v2_body);
            CheckMessagesPerUserResponseBody.ADAPTER.encodeWithTag(protoWriter, 210, responseBody.check_messages_per_user_body);
            GetMessageByIdResponseBody.ADAPTER.encodeWithTag(protoWriter, 211, responseBody.get_message_by_id_body);
            MessagesInConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 301, responseBody.messages_in_conversation_body);
            GetMessagesCheckInfoInConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 302, responseBody.get_messages_checkinfo_in_conversation_body);
            SendUserActionResponseBody.ADAPTER.encodeWithTag(protoWriter, 410, responseBody.send_user_action_body);
            NewMessageNotify.ADAPTER.encodeWithTag(protoWriter, 500, responseBody.has_new_message_notify);
            MarkConversationReadNotify.ADAPTER.encodeWithTag(protoWriter, 501, responseBody.mark_conversation_read_notify);
            StrangerNewMessageNotify.ADAPTER.encodeWithTag(protoWriter, 503, responseBody.stranger_has_new_message_notify);
            NewP2PMessageNotify.ADAPTER.encodeWithTag(protoWriter, 504, responseBody.has_new_p2p_message_notify);
            GetConversationsCheckInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 615, responseBody.get_conversations_checkinfo_body);
            GetConversationInfoV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 608, responseBody.get_conversation_info_v2_body);
            CreateConversationV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 609, responseBody.create_conversation_v2_body);
            GetConversationInfoListV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 610, responseBody.get_conversation_info_list_v2_body);
            GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 611, responseBody.get_conversation_info_list_by_favorite_v2_body);
            GetConversationInfoListByTopV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 612, responseBody.get_conversation_info_list_by_top_v2_body);
            ConversationParticipantsListResponseBody.ADAPTER.encodeWithTag(protoWriter, 605, responseBody.conversation_participants_body);
            ConversationAddParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 650, responseBody.conversation_add_participants_body);
            ConversationRemoveParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 651, responseBody.conversation_remove_participants_body);
            UpdateConversationParticipantResponseBody.ADAPTER.encodeWithTag(protoWriter, 655, responseBody.update_conversation_participant_body);
            BatchUpdateConversationParticipantResponseBody.ADAPTER.encodeWithTag(protoWriter, 656, responseBody.batch_update_conversation_participant_body);
            ModifyMessagePropertyResponseBody.ADAPTER.encodeWithTag(protoWriter, 705, responseBody.modify_message_property_body);
            SetConversationCoreInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 902, responseBody.set_conversation_core_info_body);
            UpsertConversationCoreExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 904, responseBody.upsert_conversation_core_ext_info_body);
            SetConversationSettingInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 921, responseBody.set_conversation_setting_info_body);
            UpsertConversationSettingExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 922, responseBody.upsert_conversation_setting_ext_info_body);
            GetStrangerConversationListResponseBody.ADAPTER.encodeWithTag(protoWriter, 1000, responseBody.get_stranger_conversation_body);
            GetStrangerMessagesResponseBody.ADAPTER.encodeWithTag(protoWriter, 1001, responseBody.get_stranger_messages_body);
            DeleteStrangerMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 1002, responseBody.delete_stranger_message_body);
            DeleteStrangerConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 1003, responseBody.delete_stranger_conversation_body);
            DeleteStrangerAllConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 1004, responseBody.delete_stranger_all_conversation_body);
            MarkStrangerConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 1005, responseBody.mark_stranger_conversation_read_body);
            MarkStrangerAllConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 1006, responseBody.mark_stranger_all_conversation_read_body);
            GetStrangerUnreadCountResponseBody.ADAPTER.encodeWithTag(protoWriter, 1007, responseBody.get_stranger_unread_count_body);
            GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.encodeWithTag(protoWriter, LiveNetAdaptiveHurryTimeSetting.DEFAULT, responseBody.participants_read_index_body);
            GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.encodeWithTag(protoWriter, 2001, responseBody.participants_min_index_body);
            GetTicketResponseBody.ADAPTER.encodeWithTag(protoWriter, 2005, responseBody.get_ticket_body);
            GetUserConversationListResponseBody.ADAPTER.encodeWithTag(protoWriter, 2006, responseBody.get_conversation_list_body);
            BroadcastUserCounterResponseBody.ADAPTER.encodeWithTag(protoWriter, 2009, responseBody.broadcast_user_counter_body);
            ReportClientMetricsResponseBody.ADAPTER.encodeWithTag(protoWriter, 2016, responseBody.report_client_metrics_body);
            GetConfigsResponseBody.ADAPTER.encodeWithTag(protoWriter, 2017, responseBody.get_configs_body);
            BlockMembersResponseBody.ADAPTER.encodeWithTag(protoWriter, 2019, responseBody.block_members_body);
            BlockConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 2020, responseBody.block_conversation_body);
            GetMessageInfoByIndexV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 2035, responseBody.get_message_info_by_index_v2_body);
            MarkMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 2036, responseBody.mark_message_body);
            PullMarkMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 2037, responseBody.pull_mark_message_body);
            BatchGetConversationParticipantsReadIndexResponseBody.ADAPTER.encodeWithTag(protoWriter, 2038, responseBody.batch_get_conversation_participants_readindex);
            GetRecentMessageRespBody.ADAPTER.encodeWithTag(protoWriter, 2039, responseBody.get_recent_message_body);
            GetCmdMessageRespBody.ADAPTER.encodeWithTag(protoWriter, 2040, responseBody.get_cmd_message_body);
            GetMessageInfoByIndexV2RangeResponseBody.ADAPTER.encodeWithTag(protoWriter, 2041, responseBody.get_message_info_by_index_v2_range_body);
            MessageByInitResponseBody.ADAPTER.encodeWithTag(protoWriter, 2043, responseBody.message_by_init);
            PreviewerMessagesInConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 2044, responseBody.previewer_messages_in_conversation_body);
            PreviewerGetConversationInfoListResponseBody.ADAPTER.encodeWithTag(protoWriter, 2045, responseBody.previewer_get_conversation_info_list_body);
            MarkMsgUnreadCountReportResponseBody.ADAPTER.encodeWithTag(protoWriter, 2054, responseBody.mark_msg_unread_count_report);
            MarkMsgGetUnreadCountResponseBody.ADAPTER.encodeWithTag(protoWriter, 2055, responseBody.mark_msg_get_unread_count);
            BatchUnmarkMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 2056, responseBody.batch_unmark_message);
            ClientBatchACKResponseBody.ADAPTER.encodeWithTag(protoWriter, 2057, responseBody.client_batch_ack_body);
            ConversationMessagePreViewResponseBody.ADAPTER.encodeWithTag(protoWriter, 2103, responseBody.conversation_message_pre_view_body);
            for (Map.Entry<Integer, ProtoAdapter> entry : adapterMap.entrySet()) {
                if (responseBody.extensions.get(entry.getKey()) != null) {
                    entry.getValue().encodeWithTag(protoWriter, entry.getKey().intValue(), responseBody.extensions.get(entry.getKey()).second);
                }
            }
            protoWriter.writeBytes(responseBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23732);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ResponseBody" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<ResponseBody, Builder> {
        public BatchGetConversationParticipantsReadIndexResponseBody batch_get_conversation_participants_readindex;
        public BatchUnmarkMessageResponseBody batch_unmark_message;
        public BatchUpdateConversationParticipantResponseBody batch_update_conversation_participant_body;
        public BlockConversationResponseBody block_conversation_body;
        public BlockMembersResponseBody block_members_body;
        public BroadcastUserCounterResponseBody broadcast_user_counter_body;
        public CheckMessagesPerUserResponseBody check_messages_per_user_body;
        public ClientBatchACKResponseBody client_batch_ack_body;
        public ConversationAddParticipantsResponseBody conversation_add_participants_body;
        public ConversationMessagePreViewResponseBody conversation_message_pre_view_body;
        public ConversationParticipantsListResponseBody conversation_participants_body;
        public ConversationRemoveParticipantsResponseBody conversation_remove_participants_body;
        public CreateConversationV2ResponseBody create_conversation_v2_body;
        public DeleteStrangerAllConversationResponseBody delete_stranger_all_conversation_body;
        public DeleteStrangerConversationResponseBody delete_stranger_conversation_body;
        public DeleteStrangerMessageResponseBody delete_stranger_message_body;
        public HashMap<String, Object> extensionMsgs = new HashMap<>();
        public HashMap<Integer, Pair<ProtoAdapter, Message>> extensions = new HashMap<>();
        public GetCmdMessageRespBody get_cmd_message_body;
        public GetConfigsResponseBody get_configs_body;
        public GetConversationInfoListByFavoriteV2ResponseBody get_conversation_info_list_by_favorite_v2_body;
        public GetConversationInfoListByTopV2ResponseBody get_conversation_info_list_by_top_v2_body;
        public GetConversationInfoListV2ResponseBody get_conversation_info_list_v2_body;
        public GetConversationInfoV2ResponseBody get_conversation_info_v2_body;
        public GetUserConversationListResponseBody get_conversation_list_body;
        public GetConversationsCheckInfoResponseBody get_conversations_checkinfo_body;
        public GetMessageByIdResponseBody get_message_by_id_body;
        public GetMessageInfoByIndexV2ResponseBody get_message_info_by_index_v2_body;
        public GetMessageInfoByIndexV2RangeResponseBody get_message_info_by_index_v2_range_body;
        public GetMessagesCheckInfoInConversationResponseBody get_messages_checkinfo_in_conversation_body;
        public GetRecentMessageRespBody get_recent_message_body;
        public GetStrangerConversationListResponseBody get_stranger_conversation_body;
        public GetStrangerMessagesResponseBody get_stranger_messages_body;
        public GetStrangerUnreadCountResponseBody get_stranger_unread_count_body;
        public GetTicketResponseBody get_ticket_body;
        public NewMessageNotify has_new_message_notify;
        public NewP2PMessageNotify has_new_p2p_message_notify;
        public MarkConversationReadNotify mark_conversation_read_notify;
        public MarkMessageResponseBody mark_message_body;
        public MarkMsgGetUnreadCountResponseBody mark_msg_get_unread_count;
        public MarkMsgUnreadCountReportResponseBody mark_msg_unread_count_report;
        public MarkStrangerAllConversationReadResponseBody mark_stranger_all_conversation_read_body;
        public MarkStrangerConversationReadResponseBody mark_stranger_conversation_read_body;
        public MessageByInitResponseBody message_by_init;
        public MessagesInConversationResponseBody messages_in_conversation_body;
        public MessagesPerUserResponseBody messages_per_user_body;
        public MessagesPerUserInitV2ResponseBody messages_per_user_init_v2_body;
        public ModifyMessagePropertyResponseBody modify_message_property_body;
        public GetConversationParticipantsMinIndexV3ResponseBody participants_min_index_body;
        public GetConversationParticipantsReadIndexV3ResponseBody participants_read_index_body;
        public PreviewerGetConversationInfoListResponseBody previewer_get_conversation_info_list_body;
        public PreviewerMessagesInConversationResponseBody previewer_messages_in_conversation_body;
        public PullMarkMessageResponseBody pull_mark_message_body;
        public ReportClientMetricsResponseBody report_client_metrics_body;
        public SendMessageResponseBody send_message_body;
        public SendUserActionResponseBody send_user_action_body;
        public SetConversationCoreInfoResponseBody set_conversation_core_info_body;
        public SetConversationSettingInfoResponseBody set_conversation_setting_info_body;
        public StrangerNewMessageNotify stranger_has_new_message_notify;
        public UpdateConversationParticipantResponseBody update_conversation_participant_body;
        public UpsertConversationCoreExtInfoResponseBody upsert_conversation_core_ext_info_body;
        public UpsertConversationSettingExtInfoResponseBody upsert_conversation_setting_ext_info_body;

        static {
            Covode.recordClassIndex(23733);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ResponseBody build() {
            return new ResponseBody(this.send_message_body, this.messages_per_user_body, this.messages_per_user_init_v2_body, this.check_messages_per_user_body, this.get_message_by_id_body, this.messages_in_conversation_body, this.get_messages_checkinfo_in_conversation_body, this.send_user_action_body, this.has_new_message_notify, this.mark_conversation_read_notify, this.stranger_has_new_message_notify, this.has_new_p2p_message_notify, this.get_conversations_checkinfo_body, this.get_conversation_info_v2_body, this.create_conversation_v2_body, this.get_conversation_info_list_v2_body, this.get_conversation_info_list_by_favorite_v2_body, this.get_conversation_info_list_by_top_v2_body, this.conversation_participants_body, this.conversation_add_participants_body, this.conversation_remove_participants_body, this.update_conversation_participant_body, this.batch_update_conversation_participant_body, this.modify_message_property_body, this.set_conversation_core_info_body, this.upsert_conversation_core_ext_info_body, this.set_conversation_setting_info_body, this.upsert_conversation_setting_ext_info_body, this.get_stranger_conversation_body, this.get_stranger_messages_body, this.delete_stranger_message_body, this.delete_stranger_conversation_body, this.delete_stranger_all_conversation_body, this.mark_stranger_conversation_read_body, this.mark_stranger_all_conversation_read_body, this.get_stranger_unread_count_body, this.participants_read_index_body, this.participants_min_index_body, this.get_ticket_body, this.get_conversation_list_body, this.broadcast_user_counter_body, this.report_client_metrics_body, this.get_configs_body, this.block_members_body, this.block_conversation_body, this.get_message_info_by_index_v2_body, this.mark_message_body, this.pull_mark_message_body, this.batch_get_conversation_participants_readindex, this.get_recent_message_body, this.get_cmd_message_body, this.get_message_info_by_index_v2_range_body, this.message_by_init, this.previewer_messages_in_conversation_body, this.previewer_get_conversation_info_list_body, this.mark_msg_unread_count_report, this.mark_msg_get_unread_count, this.batch_unmark_message, this.client_batch_ack_body, this.conversation_message_pre_view_body, this.extensions, this.extensionMsgs, super.buildUnknownFields());
        }

        public final Builder batch_get_conversation_participants_readindex(BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody) {
            this.batch_get_conversation_participants_readindex = batchGetConversationParticipantsReadIndexResponseBody;
            return this;
        }

        public final Builder batch_unmark_message(BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody) {
            this.batch_unmark_message = batchUnmarkMessageResponseBody;
            return this;
        }

        public final Builder batch_update_conversation_participant_body(BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody) {
            this.batch_update_conversation_participant_body = batchUpdateConversationParticipantResponseBody;
            return this;
        }

        public final Builder block_conversation_body(BlockConversationResponseBody blockConversationResponseBody) {
            this.block_conversation_body = blockConversationResponseBody;
            return this;
        }

        public final Builder block_members_body(BlockMembersResponseBody blockMembersResponseBody) {
            this.block_members_body = blockMembersResponseBody;
            return this;
        }

        public final Builder broadcast_user_counter_body(BroadcastUserCounterResponseBody broadcastUserCounterResponseBody) {
            this.broadcast_user_counter_body = broadcastUserCounterResponseBody;
            return this;
        }

        public final Builder check_messages_per_user_body(CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
            this.check_messages_per_user_body = checkMessagesPerUserResponseBody;
            return this;
        }

        public final Builder client_batch_ack_body(ClientBatchACKResponseBody clientBatchACKResponseBody) {
            this.client_batch_ack_body = clientBatchACKResponseBody;
            return this;
        }

        public final Builder conversation_add_participants_body(ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
            this.conversation_add_participants_body = conversationAddParticipantsResponseBody;
            return this;
        }

        public final Builder conversation_message_pre_view_body(ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody) {
            this.conversation_message_pre_view_body = conversationMessagePreViewResponseBody;
            return this;
        }

        public final Builder conversation_participants_body(ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
            this.conversation_participants_body = conversationParticipantsListResponseBody;
            return this;
        }

        public final Builder conversation_remove_participants_body(ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
            this.conversation_remove_participants_body = conversationRemoveParticipantsResponseBody;
            return this;
        }

        public final Builder create_conversation_v2_body(CreateConversationV2ResponseBody createConversationV2ResponseBody) {
            this.create_conversation_v2_body = createConversationV2ResponseBody;
            return this;
        }

        public final Builder delete_stranger_all_conversation_body(DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody) {
            this.delete_stranger_all_conversation_body = deleteStrangerAllConversationResponseBody;
            return this;
        }

        public final Builder delete_stranger_conversation_body(DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody) {
            this.delete_stranger_conversation_body = deleteStrangerConversationResponseBody;
            return this;
        }

        public final Builder delete_stranger_message_body(DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody) {
            this.delete_stranger_message_body = deleteStrangerMessageResponseBody;
            return this;
        }

        public final Builder get_cmd_message_body(GetCmdMessageRespBody getCmdMessageRespBody) {
            this.get_cmd_message_body = getCmdMessageRespBody;
            return this;
        }

        public final Builder get_configs_body(GetConfigsResponseBody getConfigsResponseBody) {
            this.get_configs_body = getConfigsResponseBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_favorite_v2_body(GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody) {
            this.get_conversation_info_list_by_favorite_v2_body = getConversationInfoListByFavoriteV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_top_v2_body(GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
            this.get_conversation_info_list_by_top_v2_body = getConversationInfoListByTopV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_info_list_v2_body(GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
            this.get_conversation_info_list_v2_body = getConversationInfoListV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_info_v2_body(GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
            this.get_conversation_info_v2_body = getConversationInfoV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_list_body(GetUserConversationListResponseBody getUserConversationListResponseBody) {
            this.get_conversation_list_body = getUserConversationListResponseBody;
            return this;
        }

        public final Builder get_conversations_checkinfo_body(GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
            this.get_conversations_checkinfo_body = getConversationsCheckInfoResponseBody;
            return this;
        }

        public final Builder get_message_by_id_body(GetMessageByIdResponseBody getMessageByIdResponseBody) {
            this.get_message_by_id_body = getMessageByIdResponseBody;
            return this;
        }

        public final Builder get_message_info_by_index_v2_body(GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody) {
            this.get_message_info_by_index_v2_body = getMessageInfoByIndexV2ResponseBody;
            return this;
        }

        public final Builder get_message_info_by_index_v2_range_body(GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody) {
            this.get_message_info_by_index_v2_range_body = getMessageInfoByIndexV2RangeResponseBody;
            return this;
        }

        public final Builder get_messages_checkinfo_in_conversation_body(GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
            this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationResponseBody;
            return this;
        }

        public final Builder get_recent_message_body(GetRecentMessageRespBody getRecentMessageRespBody) {
            this.get_recent_message_body = getRecentMessageRespBody;
            return this;
        }

        public final Builder get_stranger_conversation_body(GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
            this.get_stranger_conversation_body = getStrangerConversationListResponseBody;
            return this;
        }

        public final Builder get_stranger_messages_body(GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
            this.get_stranger_messages_body = getStrangerMessagesResponseBody;
            return this;
        }

        public final Builder get_stranger_unread_count_body(GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody) {
            this.get_stranger_unread_count_body = getStrangerUnreadCountResponseBody;
            return this;
        }

        public final Builder get_ticket_body(GetTicketResponseBody getTicketResponseBody) {
            this.get_ticket_body = getTicketResponseBody;
            return this;
        }

        public final Builder has_new_message_notify(NewMessageNotify newMessageNotify) {
            this.has_new_message_notify = newMessageNotify;
            return this;
        }

        public final Builder has_new_p2p_message_notify(NewP2PMessageNotify newP2PMessageNotify) {
            this.has_new_p2p_message_notify = newP2PMessageNotify;
            return this;
        }

        public final Builder mark_conversation_read_notify(MarkConversationReadNotify markConversationReadNotify) {
            this.mark_conversation_read_notify = markConversationReadNotify;
            return this;
        }

        public final Builder mark_message_body(MarkMessageResponseBody markMessageResponseBody) {
            this.mark_message_body = markMessageResponseBody;
            return this;
        }

        public final Builder mark_msg_get_unread_count(MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody) {
            this.mark_msg_get_unread_count = markMsgGetUnreadCountResponseBody;
            return this;
        }

        public final Builder mark_msg_unread_count_report(MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody) {
            this.mark_msg_unread_count_report = markMsgUnreadCountReportResponseBody;
            return this;
        }

        public final Builder mark_stranger_all_conversation_read_body(MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody) {
            this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadResponseBody;
            return this;
        }

        public final Builder mark_stranger_conversation_read_body(MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody) {
            this.mark_stranger_conversation_read_body = markStrangerConversationReadResponseBody;
            return this;
        }

        public final Builder message_by_init(MessageByInitResponseBody messageByInitResponseBody) {
            this.message_by_init = messageByInitResponseBody;
            return this;
        }

        public final Builder messages_in_conversation_body(MessagesInConversationResponseBody messagesInConversationResponseBody) {
            this.messages_in_conversation_body = messagesInConversationResponseBody;
            return this;
        }

        public final Builder messages_per_user_body(MessagesPerUserResponseBody messagesPerUserResponseBody) {
            this.messages_per_user_body = messagesPerUserResponseBody;
            return this;
        }

        public final Builder messages_per_user_init_v2_body(MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
            this.messages_per_user_init_v2_body = messagesPerUserInitV2ResponseBody;
            return this;
        }

        public final Builder modify_message_property_body(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            this.modify_message_property_body = modifyMessagePropertyResponseBody;
            return this;
        }

        public final Builder participants_min_index_body(GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
            this.participants_min_index_body = getConversationParticipantsMinIndexV3ResponseBody;
            return this;
        }

        public final Builder participants_read_index_body(GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
            this.participants_read_index_body = getConversationParticipantsReadIndexV3ResponseBody;
            return this;
        }

        public final Builder previewer_get_conversation_info_list_body(PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody) {
            this.previewer_get_conversation_info_list_body = previewerGetConversationInfoListResponseBody;
            return this;
        }

        public final Builder previewer_messages_in_conversation_body(PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody) {
            this.previewer_messages_in_conversation_body = previewerMessagesInConversationResponseBody;
            return this;
        }

        public final Builder pull_mark_message_body(PullMarkMessageResponseBody pullMarkMessageResponseBody) {
            this.pull_mark_message_body = pullMarkMessageResponseBody;
            return this;
        }

        public final Builder report_client_metrics_body(ReportClientMetricsResponseBody reportClientMetricsResponseBody) {
            this.report_client_metrics_body = reportClientMetricsResponseBody;
            return this;
        }

        public final Builder send_message_body(SendMessageResponseBody sendMessageResponseBody) {
            this.send_message_body = sendMessageResponseBody;
            return this;
        }

        public final Builder send_user_action_body(SendUserActionResponseBody sendUserActionResponseBody) {
            this.send_user_action_body = sendUserActionResponseBody;
            return this;
        }

        public final Builder set_conversation_core_info_body(SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
            this.set_conversation_core_info_body = setConversationCoreInfoResponseBody;
            return this;
        }

        public final Builder set_conversation_setting_info_body(SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody) {
            this.set_conversation_setting_info_body = setConversationSettingInfoResponseBody;
            return this;
        }

        public final Builder stranger_has_new_message_notify(StrangerNewMessageNotify strangerNewMessageNotify) {
            this.stranger_has_new_message_notify = strangerNewMessageNotify;
            return this;
        }

        public final Builder update_conversation_participant_body(UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
            this.update_conversation_participant_body = updateConversationParticipantResponseBody;
            return this;
        }

        public final Builder upsert_conversation_core_ext_info_body(UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
            this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoResponseBody;
            return this;
        }

        public final Builder upsert_conversation_setting_ext_info_body(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoResponseBody;
            return this;
        }

        public final Builder addExtension(int i2, ProtoAdapter protoAdapter, Message message) {
            this.extensions.put(Integer.valueOf(i2), new Pair<>(protoAdapter, message));
            this.extensionMsgs.put(message.getClass().getSimpleName(), message);
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.send_message_body = this.send_message_body;
        builder.messages_per_user_body = this.messages_per_user_body;
        builder.messages_per_user_init_v2_body = this.messages_per_user_init_v2_body;
        builder.check_messages_per_user_body = this.check_messages_per_user_body;
        builder.get_message_by_id_body = this.get_message_by_id_body;
        builder.messages_in_conversation_body = this.messages_in_conversation_body;
        builder.get_messages_checkinfo_in_conversation_body = this.get_messages_checkinfo_in_conversation_body;
        builder.send_user_action_body = this.send_user_action_body;
        builder.has_new_message_notify = this.has_new_message_notify;
        builder.mark_conversation_read_notify = this.mark_conversation_read_notify;
        builder.stranger_has_new_message_notify = this.stranger_has_new_message_notify;
        builder.has_new_p2p_message_notify = this.has_new_p2p_message_notify;
        builder.get_conversations_checkinfo_body = this.get_conversations_checkinfo_body;
        builder.get_conversation_info_v2_body = this.get_conversation_info_v2_body;
        builder.create_conversation_v2_body = this.create_conversation_v2_body;
        builder.get_conversation_info_list_v2_body = this.get_conversation_info_list_v2_body;
        builder.get_conversation_info_list_by_favorite_v2_body = this.get_conversation_info_list_by_favorite_v2_body;
        builder.get_conversation_info_list_by_top_v2_body = this.get_conversation_info_list_by_top_v2_body;
        builder.conversation_participants_body = this.conversation_participants_body;
        builder.conversation_add_participants_body = this.conversation_add_participants_body;
        builder.conversation_remove_participants_body = this.conversation_remove_participants_body;
        builder.update_conversation_participant_body = this.update_conversation_participant_body;
        builder.batch_update_conversation_participant_body = this.batch_update_conversation_participant_body;
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
        builder.get_stranger_unread_count_body = this.get_stranger_unread_count_body;
        builder.participants_read_index_body = this.participants_read_index_body;
        builder.participants_min_index_body = this.participants_min_index_body;
        builder.get_ticket_body = this.get_ticket_body;
        builder.get_conversation_list_body = this.get_conversation_list_body;
        builder.broadcast_user_counter_body = this.broadcast_user_counter_body;
        builder.report_client_metrics_body = this.report_client_metrics_body;
        builder.get_configs_body = this.get_configs_body;
        builder.block_members_body = this.block_members_body;
        builder.block_conversation_body = this.block_conversation_body;
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

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, GetMessageByIdResponseBody getMessageByIdResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody, SendUserActionResponseBody sendUserActionResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, StrangerNewMessageNotify strangerNewMessageNotify, NewP2PMessageNotify newP2PMessageNotify, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody, DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody, DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody, MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody, MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody, GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetTicketResponseBody getTicketResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody, BroadcastUserCounterResponseBody broadcastUserCounterResponseBody, ReportClientMetricsResponseBody reportClientMetricsResponseBody, GetConfigsResponseBody getConfigsResponseBody, BlockMembersResponseBody blockMembersResponseBody, BlockConversationResponseBody blockConversationResponseBody, GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody, MarkMessageResponseBody markMessageResponseBody, PullMarkMessageResponseBody pullMarkMessageResponseBody, BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody, GetRecentMessageRespBody getRecentMessageRespBody, GetCmdMessageRespBody getCmdMessageRespBody, GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody, MessageByInitResponseBody messageByInitResponseBody, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody, PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody, MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody, MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody, BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody, ClientBatchACKResponseBody clientBatchACKResponseBody, ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody, HashMap<Integer, Pair<ProtoAdapter, Message>> hashMap, HashMap<String, Object> hashMap2) {
        this(sendMessageResponseBody, messagesPerUserResponseBody, messagesPerUserInitV2ResponseBody, checkMessagesPerUserResponseBody, getMessageByIdResponseBody, messagesInConversationResponseBody, getMessagesCheckInfoInConversationResponseBody, sendUserActionResponseBody, newMessageNotify, markConversationReadNotify, strangerNewMessageNotify, newP2PMessageNotify, getConversationsCheckInfoResponseBody, getConversationInfoV2ResponseBody, createConversationV2ResponseBody, getConversationInfoListV2ResponseBody, getConversationInfoListByFavoriteV2ResponseBody, getConversationInfoListByTopV2ResponseBody, conversationParticipantsListResponseBody, conversationAddParticipantsResponseBody, conversationRemoveParticipantsResponseBody, updateConversationParticipantResponseBody, batchUpdateConversationParticipantResponseBody, modifyMessagePropertyResponseBody, setConversationCoreInfoResponseBody, upsertConversationCoreExtInfoResponseBody, setConversationSettingInfoResponseBody, upsertConversationSettingExtInfoResponseBody, getStrangerConversationListResponseBody, getStrangerMessagesResponseBody, deleteStrangerMessageResponseBody, deleteStrangerConversationResponseBody, deleteStrangerAllConversationResponseBody, markStrangerConversationReadResponseBody, markStrangerAllConversationReadResponseBody, getStrangerUnreadCountResponseBody, getConversationParticipantsReadIndexV3ResponseBody, getConversationParticipantsMinIndexV3ResponseBody, getTicketResponseBody, getUserConversationListResponseBody, broadcastUserCounterResponseBody, reportClientMetricsResponseBody, getConfigsResponseBody, blockMembersResponseBody, blockConversationResponseBody, getMessageInfoByIndexV2ResponseBody, markMessageResponseBody, pullMarkMessageResponseBody, batchGetConversationParticipantsReadIndexResponseBody, getRecentMessageRespBody, getCmdMessageRespBody, getMessageInfoByIndexV2RangeResponseBody, messageByInitResponseBody, previewerMessagesInConversationResponseBody, previewerGetConversationInfoListResponseBody, markMsgUnreadCountReportResponseBody, markMsgGetUnreadCountResponseBody, batchUnmarkMessageResponseBody, clientBatchACKResponseBody, conversationMessagePreViewResponseBody, hashMap, hashMap2, i.EMPTY);
    }

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, GetMessageByIdResponseBody getMessageByIdResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody, SendUserActionResponseBody sendUserActionResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, StrangerNewMessageNotify strangerNewMessageNotify, NewP2PMessageNotify newP2PMessageNotify, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody, DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody, DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody, MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody, MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody, GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetTicketResponseBody getTicketResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody, BroadcastUserCounterResponseBody broadcastUserCounterResponseBody, ReportClientMetricsResponseBody reportClientMetricsResponseBody, GetConfigsResponseBody getConfigsResponseBody, BlockMembersResponseBody blockMembersResponseBody, BlockConversationResponseBody blockConversationResponseBody, GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody, MarkMessageResponseBody markMessageResponseBody, PullMarkMessageResponseBody pullMarkMessageResponseBody, BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody, GetRecentMessageRespBody getRecentMessageRespBody, GetCmdMessageRespBody getCmdMessageRespBody, GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody, MessageByInitResponseBody messageByInitResponseBody, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody, PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody, MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody, MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody, BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody, ClientBatchACKResponseBody clientBatchACKResponseBody, ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody, HashMap<Integer, Pair<ProtoAdapter, Message>> hashMap, HashMap<String, Object> hashMap2, i iVar) {
        super(ADAPTER, iVar);
        this.extensions = new HashMap<>();
        this.extensionMsgs = new HashMap<>();
        this.send_message_body = sendMessageResponseBody;
        this.messages_per_user_body = messagesPerUserResponseBody;
        this.messages_per_user_init_v2_body = messagesPerUserInitV2ResponseBody;
        this.check_messages_per_user_body = checkMessagesPerUserResponseBody;
        this.get_message_by_id_body = getMessageByIdResponseBody;
        this.messages_in_conversation_body = messagesInConversationResponseBody;
        this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationResponseBody;
        this.send_user_action_body = sendUserActionResponseBody;
        this.has_new_message_notify = newMessageNotify;
        this.mark_conversation_read_notify = markConversationReadNotify;
        this.stranger_has_new_message_notify = strangerNewMessageNotify;
        this.has_new_p2p_message_notify = newP2PMessageNotify;
        this.get_conversations_checkinfo_body = getConversationsCheckInfoResponseBody;
        this.get_conversation_info_v2_body = getConversationInfoV2ResponseBody;
        this.create_conversation_v2_body = createConversationV2ResponseBody;
        this.get_conversation_info_list_v2_body = getConversationInfoListV2ResponseBody;
        this.get_conversation_info_list_by_favorite_v2_body = getConversationInfoListByFavoriteV2ResponseBody;
        this.get_conversation_info_list_by_top_v2_body = getConversationInfoListByTopV2ResponseBody;
        this.conversation_participants_body = conversationParticipantsListResponseBody;
        this.conversation_add_participants_body = conversationAddParticipantsResponseBody;
        this.conversation_remove_participants_body = conversationRemoveParticipantsResponseBody;
        this.update_conversation_participant_body = updateConversationParticipantResponseBody;
        this.batch_update_conversation_participant_body = batchUpdateConversationParticipantResponseBody;
        this.modify_message_property_body = modifyMessagePropertyResponseBody;
        this.set_conversation_core_info_body = setConversationCoreInfoResponseBody;
        this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoResponseBody;
        this.set_conversation_setting_info_body = setConversationSettingInfoResponseBody;
        this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoResponseBody;
        this.get_stranger_conversation_body = getStrangerConversationListResponseBody;
        this.get_stranger_messages_body = getStrangerMessagesResponseBody;
        this.delete_stranger_message_body = deleteStrangerMessageResponseBody;
        this.delete_stranger_conversation_body = deleteStrangerConversationResponseBody;
        this.delete_stranger_all_conversation_body = deleteStrangerAllConversationResponseBody;
        this.mark_stranger_conversation_read_body = markStrangerConversationReadResponseBody;
        this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadResponseBody;
        this.get_stranger_unread_count_body = getStrangerUnreadCountResponseBody;
        this.participants_read_index_body = getConversationParticipantsReadIndexV3ResponseBody;
        this.participants_min_index_body = getConversationParticipantsMinIndexV3ResponseBody;
        this.get_ticket_body = getTicketResponseBody;
        this.get_conversation_list_body = getUserConversationListResponseBody;
        this.broadcast_user_counter_body = broadcastUserCounterResponseBody;
        this.report_client_metrics_body = reportClientMetricsResponseBody;
        this.get_configs_body = getConfigsResponseBody;
        this.block_members_body = blockMembersResponseBody;
        this.block_conversation_body = blockConversationResponseBody;
        this.get_message_info_by_index_v2_body = getMessageInfoByIndexV2ResponseBody;
        this.mark_message_body = markMessageResponseBody;
        this.pull_mark_message_body = pullMarkMessageResponseBody;
        this.batch_get_conversation_participants_readindex = batchGetConversationParticipantsReadIndexResponseBody;
        this.get_recent_message_body = getRecentMessageRespBody;
        this.get_cmd_message_body = getCmdMessageRespBody;
        this.get_message_info_by_index_v2_range_body = getMessageInfoByIndexV2RangeResponseBody;
        this.message_by_init = messageByInitResponseBody;
        this.previewer_messages_in_conversation_body = previewerMessagesInConversationResponseBody;
        this.previewer_get_conversation_info_list_body = previewerGetConversationInfoListResponseBody;
        this.mark_msg_unread_count_report = markMsgUnreadCountReportResponseBody;
        this.mark_msg_get_unread_count = markMsgGetUnreadCountResponseBody;
        this.batch_unmark_message = batchUnmarkMessageResponseBody;
        this.client_batch_ack_body = clientBatchACKResponseBody;
        this.conversation_message_pre_view_body = conversationMessagePreViewResponseBody;
        this.extensions = hashMap;
        this.extensionMsgs = hashMap2;
    }
}

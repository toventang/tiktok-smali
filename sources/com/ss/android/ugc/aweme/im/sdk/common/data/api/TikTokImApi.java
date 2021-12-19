package com.ss.android.ugc.aweme.im.sdk.common.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentStatusResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.b;
import f.a.n;
import f.a.t;
import kotlinx.coroutines.av;
import l.b.c;
import l.b.e;
import l.b.o;

public interface TikTokImApi {
    static {
        Covode.recordClassIndex(65610);
    }

    @o(a = "im/group/invite/accept/")
    @e
    t<AcceptInviteCardResponse> acceptInviteCard(@c(a = "invite_id") String str);

    @o(a = "im/chat/notice/ack/")
    @e
    av<BaseResponse> acknowledgeNoticeRead(@c(a = "notice_code") String str, @c(a = "source_type") String str2, @c(a = "operation_code") int i2, @c(a = "conversation_id") String str3);

    @o(a = "im/user/info/")
    @e
    av<Object> fetchUserInfo(@c(a = "sec_user_ids") String str);

    @h(a = "/tiktok/comment/status/batch_get/v1")
    n<CommentStatusResponse> getCommentStatusBatch(@l.b.t(a = "cids") String str);

    @o(a = "im/group/invite/share")
    @e
    av<b> getGroupInviteInfo(@c(a = "conversation_short_id") String str);

    @o(a = "im/group/invite/verify/")
    @e
    t<InviteCardDetailInnerResponse> getInviteCardDetailInner(@c(a = "invite_id") String str);

    @h(a = "im/chat/notice/")
    av<ImChatTopTipModel> getTopChatNotice(@l.b.t(a = "to_user_id") String str, @l.b.t(a = "sec_to_user_id") String str2, @l.b.t(a = "conversation_id") String str3, @l.b.t(a = "source_type") String str4, @l.b.t(a = "unread_count") int i2, @l.b.t(a = "push_status") int i3);

    @o(a = "im/chat/stranger/unlimit/")
    @e
    t<BaseResponse> postChatStrangeUnLimit(@c(a = "to_user_id") String str, @c(a = "sec_to_user_id") String str2, @c(a = "conversation_id") String str3);

    @o(a = "videos/detail/")
    @e
    av<AwemeDetailList> queryAwemeList(@c(a = "aweme_ids") String str, @c(a = "origin_type") String str2, @c(a = "request_source") int i2);

    @h(a = "user/")
    n<UserStruct> queryUser(@l.b.t(a = "user_id") String str, @l.b.t(a = "sec_user_id") String str2);
}

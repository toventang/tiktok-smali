package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.ab;
import f.a.t;
import java.util.List;
import java.util.Map;

public interface LinkApi {
    static {
        Covode.recordClassIndex(8270);
    }

    @h(a = "/webcast/linkmic_audience/cancel/")
    t<com.bytedance.android.live.network.response.d<Void>> anchorCancelInviteGuest(@z(a = "channel_id") long j2, @z(a = "room_id") long j3, @z(a = "to_user_id") long j4, @z(a = "cancel_type") int i2, @z(a = "transparent_extra") String str);

    @g
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    @com.bytedance.retrofit2.b.t(a = "/webcast/linkmic_audience/apply/")
    ab<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.model.a>> apply(@com.bytedance.retrofit2.b.e(a = "room_id") long j2, @com.bytedance.retrofit2.b.e(a = "anchor_id") long j3, @f Map<String, String> map);

    @h(a = "/webcast/linkmic/cancel/")
    t<com.bytedance.android.live.network.response.d<Void>> cancel(@z(a = "channel_id") long j2, @z(a = "room_id") long j3, @z(a = "to_room_id") long j4, @z(a = "to_user_id") long j5, @z(a = "sec_to_user_id") String str, @z(a = "cancel_reason") String str2, @z(a = "transparent_extra") String str3);

    @h(a = "/webcast/linkmic_audience/check_permission/")
    ab<com.bytedance.android.live.network.response.b<Void, com.bytedance.android.livesdk.chatroom.model.b.a>> checkPermissionV1(@z(a = "room_id") long j2, @z(a = "anchor_id") long j3, @z(a = "linkmic_layout") int i2);

    @h(a = "/webcast/linkmic_audience/check_permission/")
    ab<com.bytedance.android.live.network.response.b<Void, com.bytedance.android.livesdk.chatroom.model.b.a>> checkPermissionV1(@z(a = "room_id") long j2, @z(a = "anchor_id") long j3, @z(a = "linkmic_layout") int i2, @z(a = "target_user_id") long j4);

    @h(a = "/webcast/linkmic/check_permission/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    t<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.interact.model.b>> checkPermissionV3(@z(a = "room_id") long j2);

    @h(a = "/webcast/linkmic_audience/finish/")
    ab<com.bytedance.android.live.network.response.d<Void>> finishV1(@z(a = "room_id") long j2, @z(a = "transparent_extra") String str);

    @h(a = "/webcast/linkmic/finish/")
    t<com.bytedance.android.live.network.response.d<Void>> finishV3(@z(a = "channel_id") long j2, @z(a = "transparent_extra") String str);

    @h(a = "/webcast/linkmic/finish/")
    t<com.bytedance.android.live.network.response.d<Void>> finishV3(@z(a = "channel_id") long j2, @z(a = "transparent_extra") String str, @z(a = "not_suggest_to_uid") long j3);

    @h(a = "/webcast/linkmic/get_settings/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    t<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.interact.model.c>> getAnchorLinkMicUserSetting(@z(a = "room_id") long j2, @z(a = "sec_user_id") String str);

    @h(a = "/webcast/linkmic_audience/list/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    ab<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.model.b.g>> getList(@z(a = "room_id") long j2, @z(a = "anchor_id") long j3, @z(a = "link_status") int i2);

    @h(a = "/webcast/linkmic_audience/init/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    ab<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.model.b.b>> init(@z(a = "room_id") long j2, @z(a = "linkmic_vendor") int i2, @z(a = "linkmic_layout") int i3);

    @h(a = "/webcast/linkmic/invite/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    t<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.interact.model.f>> invite(@z(a = "vendor") int i2, @z(a = "to_room_id") long j2, @z(a = "to_user_id") long j3, @z(a = "sec_to_user_id") String str, @z(a = "room_id") long j4, @z(a = "invite_type") int i3, @z(a = "match_type") int i4, @z(a = "effective_seconds") int i5);

    @h(a = "/webcast/linkmic_audience/get_settings/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    t<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.model.b.a.a>> isShowGuestLinkHint(@z(a = "room_id") long j2, @z(a = "owner_id") long j3, @z(a = "sec_owner_id") String str);

    @h(a = "/webcast/linkmic_audience/join_channel/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    ab<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.model.c.b>> joinChannelV1(@z(a = "room_id") long j2, @z(a = "transparent_extra") String str);

    @h(a = "/webcast/linkmic/join_channel/")
    t<com.bytedance.android.live.network.response.d<Void>> joinChannelV3(@z(a = "channel_id") long j2, @z(a = "transparent_extra") String str);

    @h(a = "/webcast/linkmic_audience/kick_out/")
    ab<com.bytedance.android.live.network.response.d<Void>> kickOut(@z(a = "room_id") long j2, @z(a = "to_user_id") long j3, @z(a = "sec_to_user_id") String str, @z(a = "transparent_extra") String str2);

    @h(a = "/webcast/linkmic_audience/leave/")
    ab<com.bytedance.android.live.network.response.d<Void>> leave(@z(a = "room_id") long j2, @z(a = "transparent_extra") String str);

    @h(a = "/webcast/linkmic_audience/invite/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    t<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.interact.model.d>> linkInRoomAnchorInviteGuest(@z(a = "room_id") long j2, @z(a = "to_user_id") long j3, @z(a = "sec_to_user_id") String str, @z(a = "effective_seconds") int i2, @z(a = "invitation_mic_idx") int i3);

    @h(a = "/webcast/linkmic_audience/reply/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    t<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.interact.model.e>> linkInRoomGuestReplyAnchor(@z(a = "channel_id") long j2, @z(a = "reply_status") int i2, @z(a = "room_id") long j3, @z(a = "invite_user_id") long j4, @z(a = "link_type") int i3, @z(a = "transparent_extra") String str, @z(a = "join_channel") boolean z);

    @h(a = "/webcast/linkmic_audience/permit/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    ab<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.model.b.a.c>> permit(@z(a = "room_id") long j2, @z(a = "to_user_id") long j3, @z(a = "sec_to_user_id") String str, @z(a = "effective_seconds") int i2, @z(a = "transparent_extra") String str2, @z(a = "permit_status") int i3);

    @h(a = "/webcast/linkmic_match/auto_match/")
    t<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.interact.model.g>> randomLinkMicAutoMatch(@z(a = "room_id") long j2, @z(a = "user_id") long j3, @z(a = "sec_user_id") String str, @z(a = "tz_name") String str2, @z(a = "tz_offset") int i2);

    @h(a = "/webcast/linkmic_match/cancel_match/")
    t<com.bytedance.android.live.network.response.d<Void>> randomLinkMicCancelMatch(@z(a = "room_id") long j2, @z(a = "user_id") long j3, @z(a = "sec_user_id") String str);

    @h(a = "/webcast/linkmic/reply/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    t<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.chatroom.model.b.f>> reply(@z(a = "channel_id") long j2, @z(a = "room_id") long j3, @z(a = "reply_status") int i2, @z(a = "invite_user_id") long j4, @z(a = "transparent_extra") String str);

    @com.bytedance.retrofit2.b.t(a = "/webcast/linkmic_audience/feedback/")
    @g
    t<com.bytedance.android.live.network.response.d<Void>> reportAudienceLinkIssue(@com.bytedance.retrofit2.b.e(a = "room_id") long j2, @com.bytedance.retrofit2.b.e(a = "channel_id") long j3, @com.bytedance.retrofit2.b.e(a = "scene") int i2, @com.bytedance.retrofit2.b.e(a = "vendor") int i3, @com.bytedance.retrofit2.b.e(a = "issue_category") String str, @com.bytedance.retrofit2.b.e(a = "issue_content") String str2, @com.bytedance.retrofit2.b.e(a = "err_code") long j4, @com.bytedance.retrofit2.b.e(a = "extra_str") String str3);

    @com.bytedance.retrofit2.b.t(a = "/webcast/linkmic/feedback/")
    @g
    t<com.bytedance.android.live.network.response.d<Void>> reportBroadcasterLinkIssue(@com.bytedance.retrofit2.b.e(a = "room_id") long j2, @com.bytedance.retrofit2.b.e(a = "channel_id") long j3, @z(a = "anchor_id") long j4, @com.bytedance.retrofit2.b.e(a = "sec_anchor_id") String str, @z(a = "to_user_id") long j5, @com.bytedance.retrofit2.b.e(a = "sec_to_user_id") String str2, @com.bytedance.retrofit2.b.e(a = "scene") String str3, @com.bytedance.retrofit2.b.e(a = "vendor") int i2, @com.bytedance.retrofit2.b.e(a = "issue_category") String str4, @com.bytedance.retrofit2.b.e(a = "issue_content") String str5, @com.bytedance.retrofit2.b.e(a = "err_code") long j6, @com.bytedance.retrofit2.b.e(a = "extra_str") String str6);

    @com.bytedance.retrofit2.b.t(a = "/webcast/linkmic/customer_feedback/")
    @g
    t<com.bytedance.android.live.network.response.d<Void>> reportCustomerFeedback(@com.bytedance.retrofit2.b.e(a = "room_id") long j2, @com.bytedance.retrofit2.b.e(a = "channel_id") long j3, @com.bytedance.retrofit2.b.e(a = "user_id") long j4, @com.bytedance.retrofit2.b.e(a = "to_user_id") long j5, @com.bytedance.retrofit2.b.e(a = "dislike_to_host") boolean z, @com.bytedance.retrofit2.b.e(a = "tags") List<String> list);

    @h(a = "/webcast/linkmic/rivals/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    t<com.bytedance.android.live.network.response.b<i, RivalsListExtra>> rivalsList(@z(a = "rivals_type") int i2, @z(a = "room_id") long j2, @z(a = "tz_name") String str, @z(a = "tz_offset") int i3);

    @com.bytedance.retrofit2.b.t(a = "/webcast/linkmic_audience/send_signaling/")
    @g
    ab<com.bytedance.android.live.network.response.d<Void>> sendSignalV1(@com.bytedance.retrofit2.b.e(a = "room_id") long j2, @com.bytedance.retrofit2.b.e(a = "content") String str, @com.bytedance.retrofit2.b.e(a = "to_user_ids") long[] jArr);

    @h(a = "/webcast/linkmic/send_signal/")
    t<com.bytedance.android.live.network.response.d<Void>> sendSignalV3(@z(a = "channel_id") long j2, @z(a = "content") String str, @z(a = "to_user_ids") long[] jArr);

    @com.bytedance.retrofit2.b.t(a = "/webcast/linkmic/update_settings/")
    @g
    t<com.bytedance.android.live.network.response.d<Void>> updateAnchorLinkSetting(@com.bytedance.retrofit2.b.e(a = "room_id") long j2, @com.bytedance.retrofit2.b.e(a = "sec_user_id") String str, @com.bytedance.retrofit2.b.e(a = "effective_field") int i2, @com.bytedance.retrofit2.b.e(a = "is_turn_on") boolean z, @com.bytedance.retrofit2.b.e(a = "accept_multi_linkmic") boolean z2, @com.bytedance.retrofit2.b.e(a = "accept_not_follower_invite") boolean z3, @com.bytedance.retrofit2.b.e(a = "allow_gift_to_other_anchors") boolean z4, @com.bytedance.retrofit2.b.e(a = "block_invitation_of_this_live") boolean z5);

    public enum b {
        Invite(0),
        Apply(1);
        
        public int val;

        static {
            Covode.recordClassIndex(8272);
        }

        private b(int i2) {
            this.val = i2;
        }
    }

    public enum d {
        WINDOW("window"),
        PANEL("panel");
        
        public String value;

        static {
            Covode.recordClassIndex(8274);
        }

        private d(String str) {
            this.value = str;
        }
    }

    public enum a {
        INVITE_CANCEL("initiative_cancel"),
        COUNTDOWN_CANCEL("countdown_cancel"),
        RTC_ERROR_CANCEL("rtc_error_cancel"),
        INTERRUPT_BY_MULTI_GUEST("interrupt_by_multi_guest");
        
        public String value;

        static {
            Covode.recordClassIndex(8271);
        }

        private a(String str) {
            this.value = str;
        }
    }

    public enum c {
        USER_CLICK("finish_with_user_click"),
        ILLEGAL_LIVE("finish_with_illegal_live"),
        INTERRUPT_BY_CO_HOST("finish_with_interrupt_by_co_host"),
        RTC_ERROR("finish_with_rtc_error"),
        MIC_ROOM("finish_with_mic_room");
        
        public String value;

        static {
            Covode.recordClassIndex(8273);
        }

        private c(String str) {
            this.value = str;
        }
    }

    public enum e {
        USER_CLICK("turn_on_with_user_click"),
        AUDIENCE_OPEN("audience_open"),
        AUTO_START("turn_on_with_auto_start"),
        RESTART_AFTER_MIC_ROOM("turn_on_with_restart_after_mic_room"),
        RESTART_AFTER_CO_HOST("turn_on_with_restart_after_co_host");
        
        public String value;

        static {
            Covode.recordClassIndex(8275);
        }

        private e(String str) {
            this.value = str;
        }
    }
}

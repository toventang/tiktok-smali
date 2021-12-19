package com.ss.android.ugc.aweme.friends.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.invite.d;
import com.ss.android.ugc.aweme.friends.invite.e;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.a;
import f.a.t;
import java.util.Map;
import l.b.c;
import l.b.f;
import l.b.o;

public interface FriendApi {
    static {
        Covode.recordClassIndex(61424);
    }

    @f(a = "/ug/social/invite/msg/settings/")
    q<e> getInviteContactFriendsSettings();

    @f(a = "/aweme/v1/social/friend/")
    t<FriendList<Friend>> getSocialFriendsWithScene(@l.b.t(a = "social") String str, @l.b.t(a = "access_token") String str2, @l.b.t(a = "secret_access_token") String str3, @l.b.t(a = "token_expiration_timestamp") Long l2, @l.b.t(a = "scene") Integer num);

    @o(a = "/ug/social/invite/msg/send_msg/")
    @l.b.e
    q<Object> inviteBySms(@c(a = "user_name") String str, @c(a = "enter_from") String str2, @c(a = "mobile_list") String str3);

    @f(a = "/aweme/v1/user/contact/")
    i<FriendList<User>> queryContactsFriends(@l.b.t(a = "cursor") int i2, @l.b.t(a = "count") int i3, @l.b.t(a = "type") int i4);

    @f(a = "/aweme/v1/user/contact/")
    i<FriendList<User>> queryContactsFriendsCountOnly(@l.b.t(a = "cursor") int i2, @l.b.t(a = "count") int i3, @l.b.t(a = "type") int i4, @l.b.t(a = "count_only") int i5);

    @f(a = "/aweme/v1/user/contact/invite_list/")
    i<FriendList<User>> queryMoreUnregisteredFriends(@l.b.t(a = "cursor") int i2, @l.b.t(a = "count") int i3);

    @o(a = "/ug/social/invite/msg/short_url/")
    @l.b.e
    q<d> shortenUrl(@c(a = "url") String str);

    @f(a = "/aweme/v1/social/friend/")
    t<FriendList<Friend>> socialFriends(@l.b.t(a = "social") String str, @l.b.t(a = "access_token") String str2, @l.b.t(a = "secret_access_token") String str3, @l.b.t(a = "token_expiration_timestamp") Long l2);

    @o(a = "/tiktok/user/relation/social/settings/update/v1")
    @l.b.e
    i<BaseResponse> syncContactStatus(@c(a = "social_platform") int i2, @c(a = "sync_status") Boolean bool);

    @o(a = "/tiktok/user/relation/social/settings/update/v1")
    @l.b.e
    t<BaseResponse> syncSocialRelationStatusInRx(@c(a = "social_platform") int i2, @c(a = "sync_status") Boolean bool);

    @f(a = "/aweme/v1/social/friend/")
    i<FriendList<Friend>> thirdPartFriends(@l.b.t(a = "social") String str, @l.b.t(a = "access_token") String str2, @l.b.t(a = "secret_access_token") String str3, @l.b.t(a = "token_expiration_timestamp") Long l2, @l.b.t(a = "scene") Integer num);

    @f(a = "/aweme/v1/social/token_upload/")
    i<BaseResponse> uploadAccessToken(@l.b.t(a = "social") String str, @l.b.t(a = "access_token") String str2, @l.b.t(a = "secret_access_token") String str3);

    @o(a = "/aweme/v1/upload/hashcontacts/")
    @l.b.e
    t<a> uploadHashContacts(@l.b.t(a = "need_unregistered_user") String str, @com.bytedance.retrofit2.b.f Map<String, String> map, @l.b.t(a = "scene") Integer num);
}

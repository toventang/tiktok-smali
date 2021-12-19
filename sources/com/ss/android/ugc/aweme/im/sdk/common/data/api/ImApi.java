package com.ss.android.ugc.aweme.im.sdk.common.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.f.d;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserOtherResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserSelfResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.RelationFetchResponse;
import f.a.ab;
import f.a.n;
import kotlinx.coroutines.av;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public interface ImApi {
    static {
        Covode.recordClassIndex(65609);
    }

    @f(a = "user/block/")
    q<BlockResponse> block(@t(a = "user_id") String str, @t(a = "sec_user_id") String str2, @t(a = "block_type") int i2);

    @f(a = "user/block/")
    n<BlockResponse> blockUser(@t(a = "user_id") String str, @t(a = "sec_user_id") String str2, @t(a = "block_type") int i2);

    @o(a = "im/msg/feedback/")
    @e
    f.a.t<BaseResponse> feedBackMsg(@c(a = "content") String str, @c(a = "msg_type") String str2, @c(a = "scene") String str3, @c(a = "msg_id") String str4, @c(a = "conv_short_id") Long l2, @c(a = "receiver_uid") Long l3);

    @f(a = "im/reboot/misc/")
    f.a.t<d> fetchMixInit(@t(a = "r_cell_status") int i2, @t(a = "is_active_x") int i3, @t(a = "im_token") int i4);

    @f(a = "user/profile/other/")
    av<UserOtherResponse> fetchUserOther(@t(a = "user_id") String str, @t(a = "sec_user_id") String str2);

    @f(a = "user/profile/self/")
    av<UserSelfResponse> fetchUserSelf(@t(a = "user_id") String str, @t(a = "sec_user_id") String str2);

    @f(a = "im/spotlight/multi_relation/")
    ab<ShareStateResponse> getShareUserCanSendMsg(@t(a = "sec_to_user_id") String str);

    @f(a = "spotlight/relation/")
    q<RelationFetchResponse> getSpotlightRelation(@t(a = "count") int i2, @t(a = "source") String str, @t(a = "with_fstatus") int i3, @t(a = "max_time") long j2, @t(a = "min_time") long j3, @t(a = "address_book_access") int i4, @t(a = "with_mention_check") boolean z);

    @f(a = "user/")
    q<UserStruct> queryUser(@t(a = "user_id") String str, @t(a = "sec_user_id") String str2);
}

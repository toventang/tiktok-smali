package com.ss.android.ugc.aweme.userservice.jedi.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import f.a.t;
import l.b.f;

public interface JediFollowApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142475a = a.f142476a;

    static {
        Covode.recordClassIndex(93180);
    }

    @f(a = "/aweme/v1/commit/follow/user/")
    t<FollowStatus> follow(@l.b.t(a = "user_id") String str, @l.b.t(a = "sec_user_id") String str2, @l.b.t(a = "type") int i2, @l.b.t(a = "channel_id") int i3, @l.b.t(a = "from") Integer num, @l.b.t(a = "item_id") String str3, @l.b.t(a = "from_pre") Integer num2, @l.b.t(a = "video_link_id") String str4, @l.b.t(a = "video_link_item_id") String str5, @l.b.t(a = "link_sharer") Integer num3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f142476a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(93181);
        }
    }
}

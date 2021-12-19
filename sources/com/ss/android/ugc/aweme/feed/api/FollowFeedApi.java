package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import l.b.f;

public interface FollowFeedApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91935a = a.f91936a;

    static {
        Covode.recordClassIndex(57881);
    }

    @f(a = "/aweme/v1/following/interest/feed/")
    t<j> getFollowingInterestFeed(@l.b.t(a = "cursor") int i2, @l.b.t(a = "count") int i3, @l.b.t(a = "following_uid") String str, @l.b.t(a = "refresh_type") int i4, @l.b.t(a = "sky_light_type") int i5, @l.b.t(a = "is_blue_user") boolean z);

    @f(a = "/aweme/v1/following/interest/users/")
    t<l> getInterestUsers(@l.b.t(a = "following_list_type") int i2, @l.b.t(a = "last_display_time") long j2, @l.b.t(a = "sky_light_type") int i3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f91936a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(57882);
        }

        public static FollowFeedApi a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(FollowFeedApi.class);
            l.b(create, "");
            return (FollowFeedApi) create;
        }
    }
}

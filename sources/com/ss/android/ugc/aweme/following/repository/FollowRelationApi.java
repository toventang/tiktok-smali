package com.ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.following.a.b;
import com.ss.android.ugc.aweme.following.a.c;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import l.b.f;

public interface FollowRelationApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f96346a = a.f96347a;

    static {
        Covode.recordClassIndex(60997);
    }

    @f(a = "aweme/v1/connected/relation/list")
    t<Object> queryConnectedList(@l.b.t(a = "user_id") String str, @l.b.t(a = "sec_user_id") String str2, @l.b.t(a = "cursor") Integer num, @l.b.t(a = "count") Integer num2);

    @f(a = "/aweme/v1/user/follower/list/")
    t<b> queryFollowerList(@l.b.t(a = "user_id") String str, @l.b.t(a = "sec_user_id") String str2, @l.b.t(a = "max_time") long j2, @l.b.t(a = "count") int i2, @l.b.t(a = "offset") int i3, @l.b.t(a = "source_type") int i4, @l.b.t(a = "address_book_access") int i5);

    @f(a = "/aweme/v1/user/following/list/")
    t<c> queryFollowingList(@l.b.t(a = "user_id") String str, @l.b.t(a = "sec_user_id") String str2, @l.b.t(a = "max_time") long j2, @l.b.t(a = "count") int i2, @l.b.t(a = "offset") int i3, @l.b.t(a = "source_type") int i4, @l.b.t(a = "address_book_access") int i5);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f96347a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(60998);
        }

        public static FollowRelationApi a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(FollowRelationApi.class);
            l.b(create, "");
            return (FollowRelationApi) create;
        }
    }
}

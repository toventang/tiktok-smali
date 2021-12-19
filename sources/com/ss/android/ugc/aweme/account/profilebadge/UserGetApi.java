package com.ss.android.ugc.aweme.account.profilebadge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.ss.android.c.b;
import f.a.t;
import h.f.b.l;

public interface UserGetApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65297a = a.f65298a;

    static {
        Covode.recordClassIndex(40150);
    }

    @h(a = "/aweme/v1/user/profile/self/")
    t<UserGetResponse> getSelf();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f65298a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(40151);
        }

        public static UserGetApi a() {
            Object a2 = RetrofitFactory.a().a(b.f59141e).a(UserGetApi.class);
            l.b(a2, "");
            return (UserGetApi) a2;
        }
    }
}

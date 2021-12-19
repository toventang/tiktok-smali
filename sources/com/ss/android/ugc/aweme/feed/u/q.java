package com.ss.android.ugc.aweme.feed.u;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.ss.android.ugc.aweme.feed.api.k;
import com.ss.android.ugc.aweme.feed.ui.au;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.j;
import f.a.d.f;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f94064a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public final au f94065b;

    static {
        Covode.recordClassIndex(59790);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f94069a;

        static {
            Covode.recordClassIndex(59792);
        }

        b(q qVar) {
            this.f94069a = qVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f94069a.f94065b.u();
        }
    }

    public q(au auVar) {
        l.d(auVar, "");
        this.f94065b = auVar;
    }

    public final void a(String str) {
        l.d(str, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            this.f94064a.a(FollowFeedApi.a.a().getInterestUsers(2, 0, 2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, SystemClock.elapsedRealtime(), str), new b(this)));
        }
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f94066a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f94067b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f94068c;

        static {
            Covode.recordClassIndex(59791);
        }

        a(q qVar, long j2, String str) {
            this.f94066a = qVar;
            this.f94067b = j2;
            this.f94068c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            j m2;
            com.ss.android.ugc.aweme.feed.api.l lVar = (com.ss.android.ugc.aweme.feed.api.l) obj;
            d dVar = new d();
            List<k> followingInterestUsers = lVar.getFollowingInterestUsers();
            if (followingInterestUsers != null) {
                i2 = followingInterestUsers.size();
            } else {
                i2 = 0;
            }
            r.a("livesdk_live_request_response", dVar.a("room_num", i2).a("duration", SystemClock.elapsedRealtime() - this.f94067b).a("enter_from_merge", "homepage_follow").a("enter_method", "live_cover").a("action_type", "click").a("request_api", "/aweme/v1/following/interest/users/").f66730a);
            if (com.bytedance.common.utility.collection.b.a((Collection) lVar.getFollowingInterestUsers())) {
                this.f94066a.f94065b.v();
                return;
            }
            List<k> followingInterestUsers2 = lVar.getFollowingInterestUsers();
            if (followingInterestUsers2 != null) {
                Iterator<T> it = followingInterestUsers2.iterator();
                while (it.hasNext()) {
                    it.next().setLogPbBean(lVar.getLogPbBean());
                }
            }
            au auVar = this.f94066a.f94065b;
            List<k> followingInterestUsers3 = lVar.getFollowingInterestUsers();
            if (followingInterestUsers3 == null) {
                l.b();
            }
            auVar.a(followingInterestUsers3);
            ILiveOuterService s = LiveOuterService.s();
            if (!(s == null || (m2 = s.m()) == null)) {
                m2.a("ttlive_from_following_show_live", 0, ag.a(v.a("source", "following")));
            }
            r.a("enter_following_window_feed", new d().a("enter_from", this.f94068c).a("is_live", "1").f66730a);
        }
    }
}

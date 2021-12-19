package com.ss.android.ugc.aweme.notification.i;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.friends.ui.au;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notification.i.i;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.notification.vm.d;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public final class g extends i.a implements k<User> {

    /* renamed from: a  reason: collision with root package name */
    private final h f113766a = com.ss.android.ugc.aweme.notification.b.a.a(new c(this));

    /* renamed from: b  reason: collision with root package name */
    private final h f113767b = h.i.a((h.f.a.a) b.f113769a);

    static {
        Covode.recordClassIndex(73141);
    }

    private final NotificationVM h() {
        return (NotificationVM) this.f113766a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.a.k
    public final void a(FollowStatus followStatus, String str, String str2) {
    }

    public final Set<String> b() {
        return (Set) this.f113767b.getValue();
    }

    static final class b extends m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f113769a = new b();

        static {
            Covode.recordClassIndex(73143);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    static final class c extends m implements h.f.a.a<NotificationVM> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(73144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.a.a(this.this$0.j());
        }
    }

    private static boolean m() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final d i() {
        com.ss.android.ugc.aweme.notification.vm.c b2 = h().b(a.b.a());
        Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationTLModel");
        return (d) b2;
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f113768a;

        static {
            Covode.recordClassIndex(73142);
        }

        a(g gVar) {
            this.f113768a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113768a.b().clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        i().b().observe(j(), new a(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.base.a.k
    public final /* synthetic */ void a(int i2, User user, int i3) {
        User user2 = user;
        if (j().ab_() && user2 != null) {
            String str = "";
            if (i2 == au.f97190c) {
                SmartRoute withParam = SmartRouter.buildRoute(k(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", user2.getRecommendReason()).withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_from_type", "list");
                String h2 = i().f114256f.e().h();
                if (h2 != null) {
                    str = h2;
                }
                withParam.withParam("enter_from_request_id", str).withParam("recommend_enter_profile_params", new com.ss.android.ugc.aweme.recommend.g("notification_page", null, u.c.CARD, user2.getRecType(), g.a.a(user2), user2.getUid(), null, null, user2.getRequestId(), null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
                e.d(user2, Integer.valueOf(i().a(user2.getUid())), h().b());
            } else if (i2 == au.f97195h) {
                androidx.fragment.app.e l2 = l();
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = m();
                }
                if (!j.f107229h) {
                    new com.bytedance.tux.g.b(l2).e(R.string.de8).b();
                } else {
                    e.c(user2, Integer.valueOf(i().a(user2.getUid())), h().b());
                }
            } else if (i2 == au.f97192e) {
                i().a(i3);
            } else if (i2 == au.f97194g && !b().contains(user2.getUid())) {
                if (user2.isShould_write_impr()) {
                    e.a.f112592a.a(1, user2.getUid());
                }
                com.ss.android.ugc.aweme.notification.utils.e.a(user2, Integer.valueOf(i().a(user2.getUid())), h().b());
                Set<String> b2 = b();
                String uid = user2.getUid();
                l.b(uid, str);
                b2.add(uid);
            }
        }
    }
}

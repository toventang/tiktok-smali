package com.ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.experiment.ds;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.relation.a.b;
import com.ss.android.ugc.aweme.relation.b.b;
import com.ss.android.ugc.aweme.relation.c.a;
import com.ss.android.ugc.aweme.relation.c.c;
import com.ss.android.ugc.aweme.relation.recommend.g;
import com.ss.android.ugc.aweme.relation.recommend.n;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import h.f.b.l;
import h.p;

public final class SocialFriendsService implements au, b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f97038b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private androidx.fragment.app.e f97039c;

    /* renamed from: d  reason: collision with root package name */
    private IFriendsService.c f97040d;

    static {
        Covode.recordClassIndex(61677);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61678);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.b
    public final void a() {
        IFriendsService.c cVar = this.f97040d;
        if (cVar != null) {
            cVar.a();
            this.f97040d = null;
        }
    }

    public final void b() {
        androidx.fragment.app.e eVar = this.f97039c;
        if (eVar != null) {
            eVar.getLifecycle().b(this);
            this.f97039c = null;
        }
        IFriendsService.c cVar = this.f97040d;
        if (cVar != null) {
            cVar.a();
            this.f97040d = null;
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        androidx.fragment.app.e eVar = this.f97039c;
        if (eVar != null) {
            eVar.getLifecycle().b(this);
            this.f97039c = null;
        }
        if (this.f97040d != null) {
            this.f97040d = null;
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialFriendsService f97043a;

        static {
            Covode.recordClassIndex(61680);
        }

        c(SocialFriendsService socialFriendsService) {
            this.f97043a = socialFriendsService;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97043a.b();
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialFriendsService f97046a;

        static {
            Covode.recordClassIndex(61682);
        }

        e(SocialFriendsService socialFriendsService) {
            this.f97046a = socialFriendsService;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97046a.b();
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialFriendsService f97041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f97042b;

        static {
            Covode.recordClassIndex(61679);
        }

        b(SocialFriendsService socialFriendsService, int i2) {
            this.f97041a = socialFriendsService;
            this.f97042b = i2;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97041a.a((com.ss.android.ugc.aweme.relation.viewmodel.e) obj, this.f97042b);
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialFriendsService f97044a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f97045b;

        static {
            Covode.recordClassIndex(61681);
        }

        d(SocialFriendsService socialFriendsService, int i2) {
            this.f97044a = socialFriendsService;
            this.f97045b = i2;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97044a.a((com.ss.android.ugc.aweme.relation.viewmodel.e) obj, this.f97045b);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.b
    public final p<Boolean, Long> a(int i2) {
        return new p<>(Boolean.valueOf(c.a.a().b(i2, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue())), Long.valueOf(c.a.a().c(i2, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue())));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.b
    public final p<Boolean, Long> b(int i2) {
        return new p<>(Boolean.valueOf(c.a.a().b(i2, com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue())), Long.valueOf(c.a.a().c(i2, com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue())));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.b
    public final void a(androidx.fragment.app.e eVar, IFriendsService.c cVar) {
        boolean z;
        int value;
        l.d(eVar, "");
        l.d(cVar, "");
        if (eVar.isFinishing()) {
            cVar.a();
            return;
        }
        this.f97040d = cVar;
        this.f97039c = eVar;
        eVar.getLifecycle().a(this);
        b.d a2 = com.ss.android.ugc.aweme.relation.b.b.a(3);
        int c2 = a2.c();
        ac a3 = ae.a(eVar, (ad.b) null).a(SocialRecFlowModel.class);
        l.b(a3, "");
        SocialRecFlowModel socialRecFlowModel = (SocialRecFlowModel) a3;
        socialRecFlowModel.f120502a.observe(eVar, new d(this, c2));
        socialRecFlowModel.f120503b.observe(eVar, new e(this));
        boolean booleanValue = a2.a().getFirst().booleanValue();
        if (!ds.a() || !com.ss.android.ugc.aweme.relation.b.b.a()) {
            z = false;
        } else {
            z = true;
        }
        if (!booleanValue || !z) {
            a(new com.ss.android.ugc.aweme.relation.viewmodel.e(com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_RECOMMEND.getValue(), null, null, null, 14), c2);
            return;
        }
        if (com.ss.android.ugc.aweme.relation.b.c()) {
            value = com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue();
        } else {
            value = com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_CONTACT.getValue();
        }
        a(new com.ss.android.ugc.aweme.relation.viewmodel.e(value, null, null, null, 14), c2);
    }

    public final void a(com.ss.android.ugc.aweme.relation.viewmodel.e eVar, int i2) {
        if (eVar == null) {
            b();
            return;
        }
        int i3 = eVar.f120573a;
        if (i3 == com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue()) {
            if (!ds.a() || !com.ss.android.ugc.aweme.relation.b.b.a()) {
                b();
            }
            com.ss.android.ugc.aweme.relation.a.a c2 = com.ss.android.ugc.aweme.relation.b.b.c(i2);
            if (c2 != null) {
                com.ss.android.ugc.aweme.relation.a.b a2 = b.d.a(c2);
                IFriendsService.c cVar = this.f97040d;
                if (cVar != null) {
                    cVar.a(a2);
                    return;
                }
                return;
            }
            b();
        } else if (i3 == com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue()) {
            com.ss.android.ugc.aweme.relation.recommend.m d2 = com.ss.android.ugc.aweme.relation.b.b.d(i2);
            if (d2 != null) {
                n a3 = n.d.a(d2);
                IFriendsService.c cVar2 = this.f97040d;
                if (cVar2 != null) {
                    cVar2.a(a3);
                    return;
                }
                return;
            }
            b();
        } else if (i3 == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_CONTACT.getValue() || i3 == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) {
            com.ss.android.ugc.aweme.relation.a.a a4 = com.ss.android.ugc.aweme.relation.b.b.a(i2, eVar.f120573a);
            if (a4 != null) {
                com.ss.android.ugc.aweme.relation.a.b a5 = b.d.a(a4);
                IFriendsService.c cVar3 = this.f97040d;
                if (cVar3 != null) {
                    cVar3.a(a5);
                    return;
                }
                return;
            }
            b();
        } else if (i3 == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_RECOMMEND.getValue()) {
            com.ss.android.ugc.aweme.relation.recommend.m d3 = com.ss.android.ugc.aweme.relation.b.b.d(i2);
            if (d3 != null) {
                g a6 = g.c.a(d3, eVar.f120575c, eVar.f120576d);
                IFriendsService.c cVar4 = this.f97040d;
                if (cVar4 != null) {
                    cVar4.a(a6);
                    return;
                }
                return;
            }
            b();
        } else {
            b();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.b
    public final void a(Activity activity, boolean z, IFriendsService.c cVar) {
        int i2;
        boolean z2;
        l.d(activity, "");
        l.d(cVar, "");
        com.ss.android.ugc.aweme.account.b.a();
        int i3 = 2;
        if (!l.a((Object) com.ss.android.ugc.aweme.account.b.f62864a.k().getLatestLoginMethodName(), (Object) "facebook")) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        b.d a2 = com.ss.android.ugc.aweme.relation.b.b.a(i2);
        if (!a2.a((androidx.fragment.app.e) activity)) {
            cVar.a();
            return;
        }
        this.f97040d = cVar;
        int c2 = a2.c();
        p<Boolean, Boolean> a3 = a2.a();
        if (!ds.a() || !com.ss.android.ugc.aweme.relation.b.b.a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!a2.b()) {
            if (!z) {
                if (c2 != 2) {
                    i3 = 1;
                }
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.friends.c.d(i3, a3));
                a.C3111a.a().f120367a.storeBoolean("after_login_permission_pop_up", true);
            }
            a();
        } else if (!z2 && a3.getFirst().booleanValue()) {
            cVar.a();
        } else if (a3.getFirst().booleanValue()) {
            l.d(activity, "");
            SmartRouter.buildRoute(activity, "//friends/social_friends").withParam("socialRecType", c2).withParam("nextStep", com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue()).open();
        } else {
            l.d(activity, "");
            SmartRouter.buildRoute(activity, "//friends/social_friends").withParam("socialRecType", c2).withParam("nextStep", com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue()).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.b
    public final void a(androidx.fragment.app.e eVar, com.ss.android.ugc.aweme.relation.c cVar, IFriendsService.c cVar2) {
        l.d(eVar, "");
        l.d(cVar, "");
        l.d(cVar2, "");
        if (eVar.isFinishing()) {
            cVar2.a();
            return;
        }
        com.ss.android.ugc.aweme.account.b.a();
        int i2 = 1;
        if (!(!l.a((Object) com.ss.android.ugc.aweme.account.b.f62864a.k().getLatestLoginMethodName(), (Object) "facebook"))) {
            i2 = 2;
        }
        b.d a2 = com.ss.android.ugc.aweme.relation.b.b.a(i2);
        if (!a2.b()) {
            cVar2.a();
        } else if (a2.a(cVar)) {
            cVar2.a();
        } else if (!a2.a(eVar)) {
            cVar2.a();
        } else {
            this.f97040d = cVar2;
            this.f97039c = eVar;
            eVar.getLifecycle().a(this);
            int c2 = a2.c();
            ((SocialRecFlowModel) ae.a(eVar, (ad.b) null).a(SocialRecFlowModel.class)).f120502a.observe(eVar, new b(this, c2));
            ((SocialRecFlowModel) ae.a(eVar, (ad.b) null).a(SocialRecFlowModel.class)).f120503b.observe(eVar, new c(this));
            if (a2.a().getFirst().booleanValue()) {
                a(new com.ss.android.ugc.aweme.relation.viewmodel.e(com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue(), null, null, null, 14), c2);
            } else {
                a(new com.ss.android.ugc.aweme.relation.viewmodel.e(com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue(), null, null, null, 14), c2);
            }
        }
    }
}

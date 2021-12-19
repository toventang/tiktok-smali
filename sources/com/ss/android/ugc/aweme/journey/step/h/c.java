package com.ss.android.ugc.aweme.journey.step.h;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c implements com.ss.android.ugc.aweme.journey.step.c<z, d> {
    static {
        Covode.recordClassIndex(67352);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final h.f.a.b<d, z> a() {
        return b.f105040a;
    }

    public static final class a implements IFriendsService.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f105038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f105039b;

        static {
            Covode.recordClassIndex(67353);
        }

        @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService.c
        public final void a() {
            this.f105039b.x().invoke();
        }

        @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService.c
        public final void a(Fragment fragment) {
            l.d(fragment, "");
            this.f105039b.y().invoke(fragment);
        }

        a(e eVar, d dVar) {
            this.f105038a = eVar;
            this.f105039b = dVar;
        }
    }

    static final class b extends m implements h.f.a.b<d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f105040a = new b();

        static {
            Covode.recordClassIndex(67354);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            l.d(dVar, "");
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final /* synthetic */ long a(d dVar) {
        l.d(dVar, "");
        return 0;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return z.f158842a;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        if (dVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_NEW_USER_ADD_FB_FRIENDS_ID.getId()))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        e eVar = dVar.w().invoke().get();
        if (eVar == null) {
            dVar.x().invoke();
            return;
        }
        com.ss.android.ugc.aweme.friends.service.b q = com.ss.android.ugc.aweme.friends.service.a.f97047a.q();
        if (q == null) {
            dVar.x().invoke();
        } else {
            q.a(eVar, com.ss.android.ugc.aweme.relation.c.TRIGGER_IN_JOURNEY_BACK, new a(eVar, dVar));
        }
    }
}

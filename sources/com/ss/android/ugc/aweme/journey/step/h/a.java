package com.ss.android.ugc.aweme.journey.step.h;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.journey.step.c;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a implements c<z, b> {
    static {
        Covode.recordClassIndex(67348);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final h.f.a.b<b, z> a() {
        return b.f105037a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.h.a$a  reason: collision with other inner class name */
    public static final class C2681a implements IFriendsService.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105036a;

        static {
            Covode.recordClassIndex(67349);
        }

        @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService.c
        public final void a() {
            this.f105036a.v().invoke();
        }

        C2681a(b bVar) {
            this.f105036a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService.c
        public final void a(Fragment fragment) {
            l.d(fragment, "");
            this.f105036a.y().invoke(fragment);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final /* synthetic */ long a(b bVar) {
        l.d(bVar, "");
        return 0;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return z.f158842a;
    }

    static final class b extends m implements h.f.a.b<b, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f105037a = new b();

        static {
            Covode.recordClassIndex(67350);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            l.d(bVar, "");
            com.ss.android.ugc.aweme.friends.service.a.f97047a.o();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        b bVar = (b) obj;
        l.d(bVar, "");
        if (bVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID.getId())) || bVar.b().c() != 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        b bVar = (b) obj;
        l.d(bVar, "");
        e eVar = bVar.w().invoke().get();
        if (eVar == null) {
            bVar.x().invoke();
            return;
        }
        com.ss.android.ugc.aweme.friends.service.b q = com.ss.android.ugc.aweme.friends.service.a.f97047a.q();
        if (q == null) {
            bVar.x().invoke();
        } else {
            q.a(eVar, new C2681a(bVar));
        }
    }
}

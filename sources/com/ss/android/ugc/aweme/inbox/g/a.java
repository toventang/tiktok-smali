package com.ss.android.ugc.aweme.inbox.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.ss.android.ugc.aweme.inbox.d;
import com.ss.android.ugc.aweme.inbox.e;
import com.ss.android.ugc.aweme.inbox.q;
import com.ss.android.ugc.aweme.inbox.r;
import com.ss.android.ugc.aweme.inbox.y;
import com.ss.android.ugc.aweme.recommend.b;
import com.ss.android.ugc.aweme.recommend.c;
import com.ss.android.ugc.aweme.recommend.f;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;

public final class a extends g<d> implements c {

    /* renamed from: g  reason: collision with root package name */
    private f.a.b.a f104247g;

    /* renamed from: h  reason: collision with root package name */
    private final b f104248h;

    static {
        Covode.recordClassIndex(66750);
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void c(f fVar) {
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void b() {
        f.a.b.a aVar = this.f104247g;
        if (aVar == null) {
            l.a("subscription");
        }
        aVar.dispose();
    }

    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void a() {
        f.a.b.a aVar = new f.a.b.a();
        this.f104247g = aVar;
        this.f104248h.setUFRSubscription(aVar);
        RecommendUserVM e2 = e();
        if (!e2.f103998i) {
            y.a("authorize_card_show", r.BOTTOM);
            e2.f103998i = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.a$a  reason: collision with other inner class name */
    static final class C2655a extends m implements h.f.a.b<e.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2655a f104250a = new C2655a();

        static {
            Covode.recordClassIndex(66752);
        }

        C2655a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e.a aVar) {
            e.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.b();
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar.getContainer());
        l.d(bVar, "");
        this.f104248h = bVar;
        bVar.b();
        bVar.setActionListener(this);
        bVar.setEnterFrom("notification_page");
        a(AnonymousClass1.f104249a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        super.b(bVar);
        this.f104248h.a(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final /* synthetic */ void a(d dVar) {
        l.d(dVar, "");
        this.f104248h.a(f.CONTACT, com.ss.android.ugc.aweme.recommend.e.INBOX_SMALL, -1);
        this.f104248h.setUFRExternalParams(ag.a(v.a("position", "bottom")));
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void b(f fVar) {
        l.d(fVar, "");
        e().a(c());
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void a(f fVar) {
        l.d(fVar, "");
        q.CONTACTS.markAction();
        com.ss.android.ugc.aweme.inbox.f.a(C2655a.f104250a);
        e();
        y.a("find_friends", r.BOTTOM);
    }
}

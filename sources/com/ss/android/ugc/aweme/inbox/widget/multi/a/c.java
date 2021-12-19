package com.ss.android.ugc.aweme.inbox.widget.multi.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.q;
import com.ss.android.ugc.aweme.inbox.r;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.recommend.b;
import com.ss.android.ugc.aweme.recommend.f;
import f.a.b.a;
import h.a.ag;
import h.f.b.l;
import h.v;

public final class c extends f<com.ss.android.ugc.aweme.inbox.widget.multi.c> implements com.ss.android.ugc.aweme.recommend.c {

    /* renamed from: a  reason: collision with root package name */
    private a f104424a;

    /* renamed from: b  reason: collision with root package name */
    private final b f104425b;

    static {
        Covode.recordClassIndex(66869);
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void c(f fVar) {
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final void b() {
        super.b();
        a aVar = this.f104424a;
        if (aVar == null) {
            l.a("subscription");
        }
        aVar.dispose();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final void bJ_() {
        a aVar = new a();
        this.f104424a = aVar;
        this.f104425b.setUFRSubscription(aVar);
        MultiViewModel d2 = d();
        if (!d2.f104402k) {
            d2.f104402k = true;
            e.a("authorize_card_show", r.TOP);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(bVar.getContainer());
        l.d(bVar, "");
        this.f104425b = bVar;
        bVar.b();
        bVar.setActionListener(this);
        bVar.setEnterFrom("notification_page");
        a(AnonymousClass1.f104426a);
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void a(f fVar) {
        l.d(fVar, "");
        q.CONTACTS.markAction();
        d();
        e.a("find_friends", r.TOP);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        this.f104425b.a(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.widget.multi.k] */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.inbox.widget.multi.c cVar) {
        com.ss.android.ugc.aweme.inbox.widget.multi.c cVar2 = cVar;
        l.d(cVar2, "");
        this.f104425b.a(f.CONTACT, com.ss.android.ugc.aweme.recommend.e.INBOX_NORMAL, cVar2.f104451a);
        this.f104425b.setUFRExternalParams(ag.a(v.a("position", "top")));
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void b(f fVar) {
        l.d(fVar, "");
        d().a(c());
    }
}

package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.e;
import com.ss.android.ugc.aweme.inbox.q;
import com.ss.android.ugc.aweme.inbox.r;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.recommend.c;
import com.ss.android.ugc.aweme.recommend.f;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;

public final class b extends p implements c {

    /* renamed from: a  reason: collision with root package name */
    private e f113609a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.recommend.b f113610b;

    /* renamed from: c  reason: collision with root package name */
    private final BaseNotificationVM f113611c;

    static {
        Covode.recordClassIndex(73035);
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void b(f fVar) {
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void c(f fVar) {
        l.d(fVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        super.bY_();
        if (!this.f113611c.f114046b) {
            this.f113611c.f114046b = true;
            e.a("authorize_card_show", this.f113611c.h());
        }
    }

    public final void c() {
        com.ss.android.ugc.aweme.recommend.e eVar;
        String str;
        if (this.f113611c.h() == r.TOP) {
            eVar = com.ss.android.ugc.aweme.recommend.e.INBOX_NORMAL;
            str = "top";
        } else {
            eVar = com.ss.android.ugc.aweme.recommend.e.INBOX_SMALL;
            str = "bottom";
        }
        this.f113610b.a(f.CONTACT, eVar, -1);
        this.f113610b.setUFRExternalParams(ag.a(v.a("position", str)));
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void a(e eVar) {
        this.f113609a = eVar;
    }

    static final class a extends m implements h.f.a.b<e.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113612a = new a();

        static {
            Covode.recordClassIndex(73036);
        }

        a() {
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

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final boolean onLongClick(View view) {
        e eVar = this.f113609a;
        if (eVar == null) {
            return true;
        }
        eVar.a(getLayoutPosition());
        return true;
    }

    @Override // com.ss.android.ugc.aweme.recommend.c
    public final void a(f fVar) {
        l.d(fVar, "");
        q.CONTACTS.markAction();
        if (this.f113611c.h() == r.BOTTOM) {
            com.ss.android.ugc.aweme.inbox.f.b(a.f113612a);
        }
        com.ss.android.ugc.aweme.notification.utils.e.a("find_friends", this.f113611c.h());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.ss.android.ugc.aweme.recommend.b bVar, BaseNotificationVM baseNotificationVM) {
        super(bVar.getContainer());
        l.d(bVar, "");
        l.d(baseNotificationVM, "");
        this.f113610b = bVar;
        this.f113611c = baseNotificationVM;
        bVar.setActionListener(this);
        bVar.b();
        bVar.setUFRSubscription((f.a.b.a) baseNotificationVM.f114047c.getValue());
        bVar.setEnterFrom("notification_page");
        this.itemView.setOnLongClickListener(this);
    }
}

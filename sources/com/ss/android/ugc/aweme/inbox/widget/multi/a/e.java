package com.ss.android.ugc.aweme.inbox.widget.multi.a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.friends.invite.c;
import com.ss.android.ugc.aweme.inbox.r;
import com.ss.android.ugc.aweme.inbox.widget.b;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;

public final class e extends f<i> {

    /* renamed from: a  reason: collision with root package name */
    private final c f104431a;

    static {
        Covode.recordClassIndex(66876);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final void bJ_() {
        MultiViewModel d2 = d();
        String b2 = this.f104431a.b();
        l.d(b2, "");
        if (!d2.f104403l) {
            d2.f104403l = true;
            com.ss.android.ugc.aweme.notification.utils.e.b(b2, r.TOP);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final void b(b bVar) {
        l.d(bVar, "");
        super.b(bVar);
        this.f104431a.a(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.widget.multi.k] */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.a.f
    public final /* synthetic */ void a(i iVar) {
        l.d(iVar, "");
        View view = this.itemView;
        l.b(view, "");
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Integer valueOf = Integer.valueOf(a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        com.bytedance.tux.h.i.a(view, (Integer) null, valueOf, (Integer) null, Integer.valueOf(a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()))), false, 21);
        this.f104431a.a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, Fragment fragment) {
        super(view);
        l.d(view, "");
        l.d(fragment, "");
        c a2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.a(fragment);
        View findViewById = view.findViewById(R.id.cx6);
        l.b(findViewById, "");
        View findViewById2 = view.findViewById(R.id.cxm);
        l.b(findViewById2, "");
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        View findViewById4 = view.findViewById(R.id.cww);
        l.b(findViewById4, "");
        a2.a(null, (RemoteImageView) findViewById, (TextView) findViewById2, (TextView) findViewById3, (TuxButton) findViewById4);
        this.f104431a = a2;
        a2.a(AnonymousClass1.f104432a);
        a2.a("notification_page");
        a2.c().observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.inbox.widget.multi.a.e.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f104433a;

            static {
                Covode.recordClassIndex(66878);
            }

            {
                this.f104433a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                MultiViewModel d2 = this.f104433a.d();
                l.b(bool, "");
                d2.f104396e.postValue(Boolean.valueOf(bool.booleanValue()));
            }
        });
        a(AnonymousClass3.f104434a);
    }
}

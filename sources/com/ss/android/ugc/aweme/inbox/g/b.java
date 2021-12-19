package com.ss.android.ugc.aweme.inbox.g;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.friends.invite.c;
import com.ss.android.ugc.aweme.friends.service.a;
import com.ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.ss.android.ugc.aweme.inbox.r;
import com.ss.android.ugc.aweme.inbox.w;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class b extends g<w> {

    /* renamed from: g  reason: collision with root package name */
    private final c f104251g;

    static {
        Covode.recordClassIndex(66753);
    }

    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void a() {
        String str;
        e();
        String b2 = this.f104251g.b();
        l.d(b2, "");
        r rVar = r.BOTTOM;
        l.d(b2, "");
        l.d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("platform", b2);
        if (rVar == r.TOP) {
            str = "top";
        } else {
            str = "bottom";
        }
        linkedHashMap.put("position", str);
        com.ss.android.ugc.aweme.common.r.a("invitation_card_show", linkedHashMap);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final /* synthetic */ void a(w wVar) {
        l.d(wVar, "");
        this.f104251g.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        this.f104251g.a(bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, Fragment fragment) {
        super(view);
        l.d(view, "");
        l.d(fragment, "");
        c a2 = a.f97047a.a(fragment);
        View findViewById = view.findViewById(R.id.cx6);
        l.b(findViewById, "");
        View findViewById2 = view.findViewById(R.id.cxm);
        l.b(findViewById2, "");
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        View findViewById4 = view.findViewById(R.id.cww);
        l.b(findViewById4, "");
        a2.a(null, (RemoteImageView) findViewById, (TextView) findViewById2, (TextView) findViewById3, (TuxButton) findViewById4);
        this.f104251g = a2;
        a2.a(AnonymousClass1.f104252a);
        a2.a("notification_page");
        a2.c().observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.inbox.g.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f104254a;

            static {
                Covode.recordClassIndex(66756);
            }

            {
                this.f104254a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                RecommendUserVM e2 = this.f104254a.e();
                l.b(bool, "");
                e2.f103990a.postValue(Boolean.valueOf(bool.booleanValue()));
            }
        });
        a(AnonymousClass3.f104255a);
    }
}

package com.ss.android.ugc.aweme.profile.widgets.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public View f117754j;

    /* renamed from: k  reason: collision with root package name */
    private final i f117755k = new i(bQ_(), new C2995a(this, null));

    /* renamed from: l  reason: collision with root package name */
    private View f117756l;

    static {
        Covode.recordClassIndex(76243);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.f.a$a  reason: collision with other inner class name */
    public static final class C2995a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2995a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.f.a.C2995a.invoke():java.lang.Object");
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117757a;

        static {
            Covode.recordClassIndex(76245);
        }

        b(a aVar) {
            this.f117757a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e b2 = com.bytedance.assem.arch.extensions.b.b(this.f117757a);
            if (b2 != null) {
                com.ss.android.ugc.aweme.profile.service.b bVar = com.ss.android.ugc.aweme.profile.service.b.f116618a;
                Bundle bundle = new ap().a("enter_from", "personal_homepage").a("enter_method", "click_button").f142646a;
                l.b(bundle, "");
                bVar.enterMyFavorites(b2, bundle);
                SharePrefCache inst = SharePrefCache.inst();
                l.b(inst, "");
                inst.getShouldShowFavouriteTip().b(false);
                View view2 = this.f117757a.f117754j;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        View view2;
        User user;
        Drawable drawable;
        Resources resources;
        l.d(view, "");
        this.f117756l = view.findViewById(R.id.cs3);
        this.f117754j = view.findViewById(R.id.b0k);
        View findViewById = view.findViewById(R.id.b0j);
        String str = null;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                l.b(findViewById, "");
                Context ar_ = ar_();
                if (ar_ == null || (resources = ar_.getResources()) == null) {
                    drawable = null;
                } else {
                    drawable = resources.getDrawable(R.drawable.b6x);
                }
                findViewById.setForeground(drawable);
            } catch (NullPointerException unused) {
            }
        }
        findViewById.setOnClickListener(new b(this));
        if (in.d()) {
            o.a(false, this.f117756l, this.f117754j);
        }
        com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.f117755k.getValue();
        if (aVar == null || !aVar.f117878c) {
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) d.f(this, ab.a(j.class));
            if (!(iVar == null || (user = iVar.f117705a) == null)) {
                str = user.getUid();
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (TextUtils.equals(str, g2.getCurUserId()) && (view2 = this.f117756l) != null) {
                view2.setVisibility(0);
            }
        }
    }
}

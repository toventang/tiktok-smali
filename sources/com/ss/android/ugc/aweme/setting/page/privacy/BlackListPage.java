package com.ss.android.ugc.aweme.setting.page.privacy;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class BlackListPage extends com.ss.android.ugc.aweme.setting.page.a implements h.a, c<User> {

    /* renamed from: e  reason: collision with root package name */
    public TuxStatusView f122522e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f122523f;

    /* renamed from: g  reason: collision with root package name */
    com.ss.android.ugc.aweme.setting.k.c f122524g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.setting.c.c f122525h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f122526i;

    static {
        Covode.recordClassIndex(80367);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f122526i == null) {
            this.f122526i = new SparseArray();
        }
        View view = (View) this.f122526i.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122526i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
        l.d(exc, "");
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f122526i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.axy;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<User> list, boolean z) {
        l.d(list, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        com.ss.android.ugc.aweme.setting.c.c cVar = this.f122525h;
        if (cVar == null) {
            l.b();
        }
        cVar.ag_();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        TuxStatusView tuxStatusView = this.f122522e;
        if (tuxStatusView == null) {
            l.a("mStatusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f122522e;
        if (tuxStatusView2 == null) {
            l.a("mStatusView");
        }
        tuxStatusView2.a();
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        com.ss.android.ugc.aweme.setting.k.c cVar = this.f122524g;
        if (cVar == null) {
            l.b();
        }
        cVar.a(4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.setting.k.c cVar = this.f122524g;
        if (cVar == null) {
            l.b();
        }
        cVar.a(1);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ BlackListPage this$0;

        static {
            Covode.recordClassIndex(80368);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BlackListPage blackListPage) {
            super(0);
            this.this$0 = blackListPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            BlackListPage blackListPage = this.this$0;
            if (blackListPage.f122524g != null) {
                com.ss.android.ugc.aweme.setting.k.c cVar = blackListPage.f122524g;
                if (cVar == null) {
                    l.b();
                }
                cVar.a(1);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        com.ss.android.ugc.aweme.setting.c.c cVar = this.f122525h;
        if (cVar == null) {
            l.b();
        }
        com.ss.android.ugc.aweme.setting.k.c cVar2 = this.f122524g;
        if (cVar2 == null) {
            l.b();
        }
        com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) cVar2.f76396h;
        l.b(aVar, "");
        cVar.b_(aVar.getItems());
        com.ss.android.ugc.aweme.setting.c.c cVar3 = this.f122525h;
        if (cVar3 == null) {
            l.b();
        }
        if (cVar3.v) {
            com.ss.android.ugc.aweme.setting.c.c cVar4 = this.f122525h;
            if (cVar4 == null) {
                l.b();
            }
            cVar4.d(false);
            com.ss.android.ugc.aweme.setting.c.c cVar5 = this.f122525h;
            if (cVar5 == null) {
                l.b();
            }
            cVar5.notifyDataSetChanged();
            com.ss.android.ugc.aweme.setting.c.c cVar6 = this.f122525h;
            if (cVar6 == null) {
                l.b();
            }
            cVar6.ah_();
        }
        TuxStatusView tuxStatusView = this.f122522e;
        if (tuxStatusView == null) {
            l.a("mStatusView");
        }
        tuxStatusView.setVisibility(0);
        if (isAdded()) {
            TuxStatusView tuxStatusView2 = this.f122522e;
            if (tuxStatusView2 == null) {
                l.a("mStatusView");
            }
            TuxStatusView.c cVar7 = new TuxStatusView.c();
            String string = getString(R.string.a6m);
            l.b(string, "");
            tuxStatusView2.setStatus(cVar7.a((CharSequence) string));
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        l.d(exc, "");
        com.ss.android.ugc.aweme.setting.c.c cVar = this.f122525h;
        if (cVar == null) {
            l.b();
        }
        cVar.i();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        l.d(exc, "");
        com.ss.android.ugc.aweme.setting.c.c cVar = this.f122525h;
        if (cVar == null) {
            l.b();
        }
        if (cVar.v) {
            com.ss.android.ugc.aweme.setting.c.c cVar2 = this.f122525h;
            if (cVar2 == null) {
                l.b();
            }
            cVar2.d(false);
            com.ss.android.ugc.aweme.setting.c.c cVar3 = this.f122525h;
            if (cVar3 == null) {
                l.b();
            }
            cVar3.notifyDataSetChanged();
        }
        TuxStatusView tuxStatusView = this.f122522e;
        if (tuxStatusView == null) {
            l.a("mStatusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f122522e;
        if (tuxStatusView2 == null) {
            l.a("mStatusView");
        }
        tuxStatusView2.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new a(this)));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<User> list, boolean z) {
        if (list == null || list.isEmpty() || !z) {
            com.ss.android.ugc.aweme.setting.c.c cVar = this.f122525h;
            if (cVar == null) {
                l.b();
            }
            cVar.ah_();
        } else {
            com.ss.android.ugc.aweme.setting.c.c cVar2 = this.f122525h;
            if (cVar2 == null) {
                l.b();
            }
            cVar2.ai_();
        }
        com.ss.android.ugc.aweme.setting.c.c cVar3 = this.f122525h;
        if (cVar3 == null) {
            l.b();
        }
        cVar3.b(list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<User> list, boolean z) {
        l.d(list, "");
        com.ss.android.ugc.aweme.setting.c.c cVar = this.f122525h;
        if (cVar == null) {
            l.b();
        }
        cVar.d(true);
        if (!z) {
            com.ss.android.ugc.aweme.setting.c.c cVar2 = this.f122525h;
            if (cVar2 == null) {
                l.b();
            }
            cVar2.ah_();
        } else {
            com.ss.android.ugc.aweme.setting.c.c cVar3 = this.f122525h;
            if (cVar3 == null) {
                l.b();
            }
            cVar3.ai_();
        }
        com.ss.android.ugc.aweme.setting.c.c cVar4 = this.f122525h;
        if (cVar4 == null) {
            l.b();
        }
        cVar4.b_(list);
        TuxStatusView tuxStatusView = this.f122522e;
        if (tuxStatusView == null) {
            l.a("mStatusView");
        }
        tuxStatusView.setVisibility(8);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.privacy.BlackListPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}

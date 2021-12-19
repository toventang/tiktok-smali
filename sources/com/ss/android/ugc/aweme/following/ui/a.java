package com.ss.android.ugc.aweme.following.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.x.h;
import com.ss.android.ugc.aweme.following.repository.f;
import com.ss.android.ugc.aweme.friends.a.p;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public abstract class a extends com.ss.android.ugc.aweme.base.arch.b implements p {

    /* renamed from: k  reason: collision with root package name */
    public static final C2323a f96383k = new C2323a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f96384b;

    /* renamed from: c  reason: collision with root package name */
    public User f96385c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f96386d;

    /* renamed from: e  reason: collision with root package name */
    protected DmtStatusView.a f96387e;

    /* renamed from: j  reason: collision with root package name */
    public String f96388j = "";

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f96389l;

    static {
        Covode.recordClassIndex(61035);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public View a(int i2) {
        if (this.f96389l == null) {
            this.f96389l = new SparseArray();
        }
        View view = (View) this.f96389l.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f96389l.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public void a() {
        SparseArray sparseArray = this.f96389l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public abstract int g();

    public int i() {
        return 0;
    }

    public String j() {
        return "";
    }

    public boolean l() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public abstract void p();

    public abstract int q();

    public abstract int r();

    /* renamed from: com.ss.android.ugc.aweme.following.ui.a$a  reason: collision with other inner class name */
    public static final class C2323a {
        static {
            Covode.recordClassIndex(61036);
        }

        private C2323a() {
        }

        public /* synthetic */ C2323a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.a.p
    public final boolean n() {
        return this.f96386d;
    }

    /* access modifiers changed from: protected */
    public final DmtStatusView.a e() {
        DmtStatusView.a aVar = this.f96387e;
        if (aVar == null) {
            l.a("mStatusViewBuilder");
        }
        return aVar;
    }

    public final String k() {
        if (h()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    @Override // com.ss.android.ugc.aweme.friends.a.p
    public final void o() {
        if (ab_()) {
            p();
            this.f96386d = false;
        }
    }

    public final boolean h() {
        String str = this.f96384b;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        return TextUtils.equals(str, g2.getCurUserId());
    }

    @Override // com.ss.android.ugc.aweme.friends.a.p
    public final void a(boolean z) {
        this.f96386d = z;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f96390a;

        static {
            Covode.recordClassIndex(61037);
        }

        b(a aVar) {
            this.f96390a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96390a.p();
        }
    }

    public final boolean a(ListState<Object, f> listState) {
        l.d(listState, "");
        h();
        return false;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("uid", "");
            l.b(string, "");
            this.f96388j = string;
            this.f96384b = arguments.getString("uid");
        }
        this.f96385c = h.f95333c;
    }

    public final void a(DmtStatusView dmtStatusView) {
        l.d(dmtStatusView, "");
        DmtStatusView.a b2 = DmtStatusView.a.a(getContext()).b(com.ss.android.ugc.aweme.views.h.a(getContext(), new b(this)));
        l.b(b2, "");
        this.f96387e = b2;
        MtEmptyView a2 = MtEmptyView.a(getContext());
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        a2.setStatus(new d.a(context).a(2131232659).b(r()).c(q()).f33648a);
        DmtStatusView.a aVar = this.f96387e;
        if (aVar == null) {
            l.a("mStatusViewBuilder");
        }
        aVar.b(a2);
        DmtStatusView.a aVar2 = this.f96387e;
        if (aVar2 == null) {
            l.a("mStatusViewBuilder");
        }
        dmtStatusView.setBuilder(aVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.ies.dmt.ui.widget.DmtStatusView r7, java.lang.Exception r8) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.a.a(com.bytedance.ies.dmt.ui.widget.DmtStatusView, java.lang.Exception):void");
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return com.a.a(layoutInflater, g(), viewGroup, false);
    }
}

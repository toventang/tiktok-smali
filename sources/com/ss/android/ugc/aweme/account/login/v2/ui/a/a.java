package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.k;
import com.ss.android.ugc.aweme.account.n.g;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class a extends com.ss.android.ugc.aweme.account.login.v2.base.c implements com.bytedance.analytics.page.b, k {

    /* renamed from: a  reason: collision with root package name */
    private AccountKeyBoardHelper f64785a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f64786b;
    public com.ss.android.ugc.aweme.account.login.v2.ui.b v;
    public boolean w;

    static {
        Covode.recordClassIndex(39818);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public View c(int i2) {
        if (this.f64786b == null) {
            this.f64786b = new HashMap();
        }
        View view = (View) this.f64786b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64786b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public abstract int d();

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.k
    public void f() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public void h() {
        HashMap hashMap = this.f64786b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract com.ss.android.ugc.aweme.account.login.v2.ui.b p();

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public boolean q() {
        return false;
    }

    public abstract void r();

    public abstract void s();

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.k
    public void u() {
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        l.d(this, "");
        return null;
    }

    private static boolean g() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void D() {
        e activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return String.valueOf(V_().hashCode());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        r();
        super.onDestroyView();
        h();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f64785a;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f64747a = null;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f64785a;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f64747a = this;
        }
    }

    public final boolean C() {
        getContext();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = g();
        }
        if (j.f107229h) {
            return true;
        }
        String string = getString(R.string.de8);
        l.b(string, "");
        a(0, string);
        return false;
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        com.ss.android.ugc.aweme.account.login.v2.base.k V_ = V_();
        l.d(V_, "");
        switch (com.ss.android.ugc.aweme.account.login.v2.base.a.f64716a[V_.ordinal()]) {
            case 1:
                return "4816";
            case 2:
                return "9472";
            case 3:
                return "2325";
            case 4:
                return "0442";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "3144";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return "1865";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return "2190";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return "8778";
            default:
                return V_().name();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a$a  reason: collision with other inner class name */
    public static final class C1444a implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f64788a;

        static {
            Covode.recordClassIndex(39819);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1444a(a aVar) {
            this.f64788a = aVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f64788a.D();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            String str;
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = this.f64788a.v;
            if (bVar != null) {
                str = bVar.f65055i;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                g.a(this.f64788a.getActivity(), str, this.f64788a.x());
                return;
            }
            throw new IllegalStateException("please pass pageName".toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f64789a;

        static {
            Covode.recordClassIndex(39820);
        }

        b(View view) {
            this.f64789a = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.c(this.f64789a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f64790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f64791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f64792c;

        static {
            Covode.recordClassIndex(39821);
        }

        c(a aVar, View view, View.OnClickListener onClickListener) {
            this.f64790a = aVar;
            this.f64791b = view;
            this.f64792c = onClickListener;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(this.f64791b, 1200) && this.f64790a.C()) {
                if (com.bytedance.ies.ugc.appcontext.f.j() == null) {
                    com.bytedance.ies.ugc.appcontext.f.a(this.f64790a.getActivity());
                }
                this.f64792c.onClick(view);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void b_(int i2) {
        if (i2 == 0) {
            if (ab_()) {
                r();
            } else if (this.w) {
                this.w = false;
            }
        } else if (i2 != 1) {
        } else {
            if (ab_()) {
                s();
            } else {
                this.w = true;
            }
        }
    }

    public final void a(View view, View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        if (view != null) {
            view.setOnClickListener(new c(this, view, onClickListener));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar;
        String str;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.account.login.v2.ui.b p = p();
        this.v = p;
        if (p == null) {
            NormalTitleBar normalTitleBar = (NormalTitleBar) c(R.id.rq);
            l.b(normalTitleBar, "");
            normalTitleBar.setVisibility(8);
            TuxTextView tuxTextView = (TuxTextView) c(R.id.rm);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.ro);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            TuxTextView tuxTextView3 = (TuxTextView) c(R.id.rn);
            l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
            ImageView imageView = (ImageView) c(R.id.rp);
            l.b(imageView, "");
            imageView.setVisibility(8);
        } else {
            if (TextUtils.isEmpty(p.f65047a)) {
                NormalTitleBar normalTitleBar2 = (NormalTitleBar) c(R.id.rq);
                l.b(normalTitleBar2, "");
                normalTitleBar2.setVisibility(8);
            } else {
                com.bytedance.ies.dmt.ui.titlebar.a aVar = (com.bytedance.ies.dmt.ui.titlebar.a) c(R.id.rq);
                com.ss.android.ugc.aweme.account.login.v2.ui.b bVar2 = this.v;
                if (bVar2 == null) {
                    l.b();
                }
                aVar.setTitle(bVar2.f65047a);
                com.ss.android.ugc.aweme.account.login.v2.ui.b bVar3 = this.v;
                if (bVar3 == null) {
                    l.b();
                }
                if (!TextUtils.isEmpty(bVar3.f65048b)) {
                    NormalTitleBar normalTitleBar3 = (NormalTitleBar) c(R.id.rq);
                    com.ss.android.ugc.aweme.account.login.v2.ui.b bVar4 = this.v;
                    if (bVar4 == null) {
                        l.b();
                    }
                    normalTitleBar3.setStartText(bVar4.f65048b);
                    ((NormalTitleBar) c(R.id.rq)).setStartTextSize((float) getResources().getDimensionPixelSize(R.dimen.d7));
                } else {
                    com.ss.android.ugc.aweme.account.login.v2.ui.b bVar5 = this.v;
                    if (bVar5 == null) {
                        l.b();
                    }
                    if (bVar5.f65049c) {
                        ((NormalTitleBar) c(R.id.rq)).setStartBtnIcon(R.drawable.jr);
                    } else {
                        NormalTitleBar normalTitleBar4 = (NormalTitleBar) c(R.id.rq);
                        l.b(normalTitleBar4, "");
                        ImageView startBtn = normalTitleBar4.getStartBtn();
                        l.b(startBtn, "");
                        startBtn.setVisibility(8);
                    }
                }
                ((NormalTitleBar) c(R.id.rq)).setOnTitleBarClickListener(new C1444a(this));
                com.ss.android.ugc.aweme.account.login.v2.ui.b bVar6 = this.v;
                if (bVar6 == null) {
                    l.b();
                }
                if (!bVar6.f65056j) {
                    NormalTitleBar normalTitleBar5 = (NormalTitleBar) c(R.id.rq);
                    l.b(normalTitleBar5, "");
                    ImageView endBtn = normalTitleBar5.getEndBtn();
                    l.b(endBtn, "");
                    endBtn.setVisibility(8);
                }
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar7 = this.v;
            if (bVar7 == null) {
                l.b();
            }
            if (TextUtils.isEmpty(bVar7.f65051e)) {
                TuxTextView tuxTextView4 = (TuxTextView) c(R.id.ro);
                l.b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) c(R.id.ro);
                l.b(tuxTextView5, "");
                com.ss.android.ugc.aweme.account.login.v2.ui.b bVar8 = this.v;
                if (bVar8 == null) {
                    l.b();
                }
                tuxTextView5.setText(bVar8.f65051e);
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar9 = this.v;
            if (bVar9 == null) {
                l.b();
            }
            if (TextUtils.isEmpty(bVar9.f65050d)) {
                TuxTextView tuxTextView6 = (TuxTextView) c(R.id.rm);
                l.b(tuxTextView6, "");
                tuxTextView6.setVisibility(8);
            } else {
                TuxTextView tuxTextView7 = (TuxTextView) c(R.id.rm);
                l.b(tuxTextView7, "");
                com.ss.android.ugc.aweme.account.login.v2.ui.b bVar10 = this.v;
                if (bVar10 == null) {
                    l.b();
                }
                tuxTextView7.setText(bVar10.f65050d);
                TuxTextView tuxTextView8 = (TuxTextView) c(R.id.rm);
                l.b(tuxTextView8, "");
                tuxTextView8.setVisibility(0);
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar11 = this.v;
            if (bVar11 == null) {
                l.b();
            }
            if (TextUtils.isEmpty(bVar11.f65052f)) {
                TuxTextView tuxTextView9 = (TuxTextView) c(R.id.rn);
                l.b(tuxTextView9, "");
                tuxTextView9.setVisibility(8);
            } else {
                TuxTextView tuxTextView10 = (TuxTextView) c(R.id.rn);
                l.b(tuxTextView10, "");
                com.ss.android.ugc.aweme.account.login.v2.ui.b bVar12 = this.v;
                if (bVar12 == null) {
                    l.b();
                }
                tuxTextView10.setText(bVar12.f65052f);
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar13 = this.v;
            if (!(bVar13 == null || (num = bVar13.f65053g) == null)) {
                ((ImageView) c(R.id.rp)).setImageResource(num.intValue());
                ImageView imageView2 = (ImageView) c(R.id.rp);
                l.b(imageView2, "");
                imageView2.setVisibility(0);
            }
            ((com.bytedance.ies.dmt.ui.titlebar.a) c(R.id.rq)).a(false);
        }
        NormalTitleBar normalTitleBar6 = (NormalTitleBar) c(R.id.rq);
        l.b(normalTitleBar6, "");
        if (!(normalTitleBar6.getVisibility() == 8 || (bVar = this.v) == null || !bVar.f65056j)) {
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar14 = this.v;
            if (bVar14 != null) {
                str = bVar14.f65055i;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalStateException("please pass pageName".toString());
            }
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar15 = this.v;
        if (bVar15 != null && bVar15.f65054h) {
            LinearLayout linearLayout = (LinearLayout) c(R.id.ciy);
            l.b(linearLayout, "");
            this.f64785a = new AccountKeyBoardHelper(linearLayout, this);
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar16 = this.v;
        if (bVar16 != null && bVar16.f65057k && !AccountKeyBoardHelper.a.a()) {
            view.setOnClickListener(new b(view));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.hg, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) a2;
        linearLayout.addView(com.a.a(layoutInflater, d(), linearLayout, false));
        return linearLayout;
    }
}

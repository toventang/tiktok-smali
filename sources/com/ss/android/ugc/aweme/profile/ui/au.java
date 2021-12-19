package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.appbar.AppBarLayout;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.experiment.fs;
import com.ss.android.ugc.aweme.performance.i;
import com.ss.android.ugc.aweme.profile.experiment.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.service.h;
import com.ss.android.ugc.aweme.profile.ui.b.a;
import com.ss.android.ugc.aweme.profile.ui.d.c;
import com.ss.android.ugc.aweme.profile.ui.widget.d;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.utils.cz;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;

public final class au extends c {
    protected RecyclerView K;
    protected AppBarLayout L;
    protected boolean M = true;
    private boolean Q;
    private boolean R;
    private a S;
    private TextView T;
    private boolean U;
    private c V;

    static {
        Covode.recordClassIndex(75492);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.c
    public final int a() {
        return R.layout.anx;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.profile.ui.c, com.ss.android.ugc.b.a.a.a
    public final void onResume() {
        super.onResume();
        a aVar = this.S;
        if (aVar != null) {
            aVar.a();
        }
    }

    private boolean O() {
        User user = this.f117010b;
        if (user == null || user.getFollowerCount() >= 1000 || user.getAccountType() == 2 || user.getAccountType() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.profile.ui.c
    public final void onDestroyView() {
        cz b2 = da.a.b(this.S.b());
        if (b2 != null) {
            b2.c();
        }
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.c, com.ss.android.ugc.aweme.profile.c.a
    public final void bM_() {
        if (ab_()) {
            if (this.Q || this.R) {
                f();
            } else if (this.s == null || !this.C) {
                v();
            } else {
                n();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.c, com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        if (!ab_()) {
            return null;
        }
        if (!this.U) {
            return this.n;
        }
        if (this.K == null) {
            this.K = this.V.a();
        }
        if (!this.M) {
            return null;
        }
        RecyclerView recyclerView = this.K;
        if (recyclerView != null) {
            return recyclerView;
        }
        return this.n;
    }

    private void M() {
        this.s.setVisibility(0);
        if (this.B != null) {
            c().setVisibility(4);
        }
        if (!this.f117014j && !in.d() && this.f117013e == 0 && k.c() && !O()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s.getLayoutParams();
            layoutParams.topMargin = n.a(38.0d);
            this.s.setLayoutParams(layoutParams);
            N();
        }
        this.s.g();
        if (this.t != null) {
            this.t.a(this.f117014j, this.f117013e);
        }
    }

    private void N() {
        if (!getActivity().isDestroyed() && !getActivity().isFinishing() && !this.U) {
            this.U = true;
            Fragment a2 = RecommendUserServiceImpl.b().a();
            getChildFragmentManager().a().b(R.id.dik, a2).c();
            c cVar = (c) a2;
            this.V = cVar;
            cVar.a(this.f117010b);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.profile.ui.c
    public final void f() {
        if (ab_()) {
            if (((com.ss.android.ugc.aweme.common.e.a) this.r.f76396h).isHasMore()) {
                l();
            }
            if (!this.f117014j || this.f117013e != 0) {
                M();
                return;
            }
            if (this.p.getItemCount() != 0 || this.p.f115801d) {
                if (this.t != null) {
                    this.t.a(this.f117013e);
                }
            } else if (this.t != null) {
                this.t.a(this.f117014j, this.f117013e);
            }
            this.s.setVisibility(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.c
    public final void n() {
        super.n();
        if (this.t != null && this.f117013e == 0 && !this.f117014j && !in.d() && !O()) {
            if (k.b()) {
                this.t.a(this.f117014j, this.f117013e);
            }
            if (k.c()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c().getLayoutParams();
                layoutParams.topMargin = n.a(-29.0d);
                c().setLayoutParams(layoutParams);
                this.s.setVisibility(8);
                N();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.c
    public final void p() {
        d dVar;
        this.n.setOverScrollMode(2);
        q();
        this.n.setLayoutManager(this.q);
        this.n.a(r());
        if (!i.a()) {
            dVar = new d(new aw(this));
            this.n.a(dVar);
        } else {
            dVar = null;
        }
        this.I = new com.ss.android.ugc.aweme.common.d.a(this.n, dVar);
        if (fs.f90079c) {
            this.n.a(new RecyclerView.n() {
                /* class com.ss.android.ugc.aweme.profile.ui.au.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75493);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2) {
                    int i3;
                    super.a(recyclerView, i2);
                    if (i2 == 0) {
                        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof GridLayoutManager) {
                            i3 = ((LinearLayoutManager) layoutManager).m();
                        } else {
                            i3 = -1;
                        }
                        recyclerView.getLayoutManager().A();
                        if (i3 > recyclerView.getLayoutManager().A() - 15) {
                            au.this.l();
                        }
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2, int i3) {
                    super.a(recyclerView, i2, i3);
                }
            });
        }
        this.n = h.f116622a.buildBaseRecyclerView(this.n, this);
        this.S = new a(this.f117014j, this.O, this.n);
        t();
        this.n.setAdapter(this.p);
        D();
        u();
        if (this.f117014j || this.w) {
            v();
        }
        if (this.f117017m > 0) {
            this.n.setPadding(0, 0, 0, this.f117017m);
        }
        Integer a2 = com.bytedance.tux.h.d.a(this.n.getContext(), R.attr.f159902m);
        if (a2 != null) {
            getView().setBackgroundColor(a2.intValue());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.c
    public final void j() {
        View c2;
        boolean z = this.f117014j;
        int i2 = R.string.ddj;
        if (!z) {
            i2 = this.f117013e == 0 ? R.string.h8e : R.string.h88;
        } else if (this.f117013e == 0) {
            i2 = R.string.bnt;
        } else if (this.f117013e == 1) {
            if (!in.d()) {
                i2 = !s.a.f66880a.d().c().booleanValue() ? R.string.c_k : s.a.f66880a.c().c().intValue() == 0 ? R.string.cw2 : R.string.cw3;
            }
        } else if (this.f117013e == 2) {
            i2 = R.string.g9x;
        }
        this.v = DmtStatusView.a.a(getContext());
        TuxTextView c3 = c(R.string.cyv);
        c(i2);
        if (this.f117014j && this.f117013e == 1) {
            if (!in.d()) {
                if (s.a.f66880a.c().c().intValue() == 0) {
                    c2 = a(getContext(), false);
                } else {
                    c2 = a(getContext(), true);
                }
            }
            c2 = c(i2);
        } else if (this.f117014j && this.f117013e == 14) {
            c2 = b(getString(R.string.evl), getString(R.string.exx));
        } else if (this.f117014j || this.f117013e != 1) {
            if (!this.f117014j && this.f117013e == 0 && !in.d() && k.b()) {
                c2 = b(getString(R.string.exq), getContext().getString(R.string.exp));
            }
            c2 = c(i2);
        } else {
            if (!in.d()) {
                c2 = b(getContext(), false);
            }
            c2 = c(i2);
        }
        c3.setOnClickListener(new ax(this));
        this.v.b(c2).c(c3);
        this.s.setBuilder(this.v);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs, com.ss.android.ugc.aweme.profile.ui.c
    public final void b(boolean z) {
        this.Q = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs, com.ss.android.ugc.aweme.profile.ui.c
    public final void c(boolean z) {
        this.R = z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2) {
        boolean z;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.M = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs, com.ss.android.ugc.aweme.profile.ui.aq
    public final void c(String str) {
        super.c(str);
        a aVar = this.S;
        if (aVar != null) {
            aVar.f116913b = str;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.profile.ui.c
    public final void setUserVisibleHint(boolean z) {
        a aVar;
        super.setUserVisibleHint(z);
        if (z && (aVar = this.S) != null) {
            aVar.a();
        }
    }

    private TuxTextView c(int i2) {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColor(b.c(getContext(), R.color.c4));
        tuxTextView.setText(i2);
        return tuxTextView;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq, com.ss.android.ugc.aweme.profile.ui.c
    public final void a(User user) {
        super.a(user);
        if (!this.f117014j && !in.d() && this.f117013e == 0 && k.b() && this.T != null) {
            if (!O()) {
                this.T.setText(c(getString(R.string.exq), com.a.a(getContext().getString(R.string.exp), new Object[]{in.b(this.f117010b)})));
                return;
            }
            this.T.setText(R.string.h8e);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.profile.ui.c
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.awa);
        this.L = appBarLayout;
        appBarLayout.a(new av(this));
    }

    private TuxTextView b(String str, String str2) {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColor(b.c(getContext(), R.color.c5));
        tuxTextView.setText(c(str, str2));
        this.T = tuxTextView;
        return tuxTextView;
    }

    private SpannableStringBuilder c(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str).append((CharSequence) "\n").append((CharSequence) str2);
        spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.b(33, false), 0, str.length(), 18);
        spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.d(n.a(20.0d)), 0, str.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(b.c(getContext(), R.color.bx)), 0, str.length(), 18);
        return spannableStringBuilder;
    }

    public static au a(int i2, int i3, String str, String str2, boolean z, boolean z2, Bundle bundle) {
        au auVar = new au();
        bundle.putInt(StringSet.type, i3);
        bundle.putString("uid", str);
        bundle.putString("sec_user_id", str2);
        bundle.putBoolean("is_my_profile", z);
        bundle.putBoolean("is_scene_transition_enable", z2);
        bundle.putInt("bottom_bar_height", i2);
        auVar.setArguments(bundle);
        return auVar;
    }
}

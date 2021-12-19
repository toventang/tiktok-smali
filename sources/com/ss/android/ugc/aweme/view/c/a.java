package com.ss.android.ugc.aweme.view.c;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.model.q;
import com.ss.android.ugc.aweme.view.c.b;
import com.ss.android.ugc.aweme.view.customView.NaviGLSurfaceView;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;

public final class a extends com.ss.android.ugc.aweme.view.customView.b implements b.a {

    /* renamed from: b  reason: collision with root package name */
    final h.h f144133b = h.i.a((h.f.a.a) new C3838a(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.h f144134c = h.i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f144135d = h.i.a((h.f.a.a) new k(this));

    /* renamed from: e  reason: collision with root package name */
    private final Handler f144136e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f144137f;

    static {
        Covode.recordClassIndex(94325);
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final View a(int i2) {
        if (this.f144137f == null) {
            this.f144137f = new SparseArray();
        }
        View view = (View) this.f144137f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f144137f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final int b() {
        return R.layout.apq;
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final void j() {
        SparseArray sparseArray = this.f144137f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final ProfileNaviHubViewModel k() {
        return (ProfileNaviHubViewModel) this.f144134c.getValue();
    }

    public final b l() {
        return (b) this.f144135d.getValue();
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.view.customView.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        j();
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144145a;

        static {
            Covode.recordClassIndex(94335);
        }

        j(a aVar) {
            this.f144145a = aVar;
        }

        public final void run() {
            this.f144145a.m();
            this.f144145a.k().a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final NaviGLSurfaceView e() {
        return (NaviGLSurfaceView) a(R.id.ct_);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.view.customView.b
    public final void onPause() {
        super.onPause();
        this.f144136e.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$a  reason: collision with other inner class name */
    static final class C3838a extends m implements h.f.a.a<ProfileNaviCreatorViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3838a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(ProfileNaviCreatorViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class b extends m implements h.f.a.a<ProfileNaviHubViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviHubViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(ProfileNaviHubViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class k extends m implements h.f.a.a<b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            androidx.fragment.app.e requireActivity = this.this$0.requireActivity();
            l.b(requireActivity, "");
            return new b(requireActivity, this.this$0, (byte) 0);
        }
    }

    public final void m() {
        if (getActivity() != null) {
            new c().show(getChildFragmentManager(), "navi");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (((ProfileNaviHubState) k().a(this)).getShouldShowSwitcher()) {
            this.f144136e.postDelayed(new j(this), 500);
        }
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final void c() {
        ((TuxCompoundIconTextView) a(R.id.ct6)).setOnClickListener(new c(this));
        ((LinearLayout) a(R.id.dab)).setOnClickListener(new d(this));
        ((LinearLayout) a(R.id.dac)).setOnClickListener(new e(this));
        ((TuxIconView) a(R.id.da_)).setOnClickListener(new f(this));
        ((ConstraintLayout) a(R.id.dah)).setOnClickListener(new g(this));
    }

    @Override // com.ss.android.ugc.aweme.view.c.b.a
    public final void n() {
        r.a("delete_avatar", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
        Context context = getContext();
        if (context != null) {
            a.C0731a a2 = new a.C0731a(context).a(R.string.a17);
            a2.M = true;
            com.bytedance.ies.dmt.ui.dialog.a a3 = a2.a(R.string.a15, (DialogInterface.OnClickListener) new h(this), false).b(R.string.a12, (DialogInterface.OnClickListener) new i(this), false).a();
            com.ss.android.ugc.aweme.bn.a.a();
            a3.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.view.c.b.a
    public final void o() {
        r.a("create_avatar_duplicate", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
        l().dismiss();
        ProfileNaviHubViewModel k2 = k();
        q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
        if (qVar != null) {
            HashMap<String, com.ss.android.ugc.aweme.model.d> hashMap = com.ss.android.ugc.aweme.model.r.f110815e;
            if (hashMap != null) {
                l.d(hashMap, "");
                q a2 = q.a.a(qVar.a(), hashMap);
                a2.f110805a = null;
                a2.f110810f = null;
                a2.f110809e = null;
                com.ss.android.ugc.aweme.model.r.a(a2);
            }
            k2.b();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144138a;

        static {
            Covode.recordClassIndex(94328);
        }

        c(a aVar) {
            this.f144138a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("click_metami_avatar_hub", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
            this.f144138a.m();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144139a;

        static {
            Covode.recordClassIndex(94329);
        }

        d(a aVar) {
            this.f144139a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("edit_avatar_hub", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
            this.f144139a.k().b();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144140a;

        static {
            Covode.recordClassIndex(94330);
        }

        e(a aVar) {
            this.f144140a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("more_option_avatar_hub", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
            this.f144140a.l().show();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144141a;

        static {
            Covode.recordClassIndex(94331);
        }

        f(a aVar) {
            this.f144141a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("exit_avatar_hub", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
            ProfileNaviHubViewModel k2 = this.f144141a.k();
            k2.d(ProfileNaviHubViewModel.g.f144366a);
            k2.d(ProfileNaviHubViewModel.h.f144367a);
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144142a;

        static {
            Covode.recordClassIndex(94332);
        }

        g(a aVar) {
            this.f144142a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("set_avatar_profile", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
            ((ProfileNaviCreatorViewModel) this.f144142a.f144133b.getValue()).g();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.view.customView.b
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        c();
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144144a;

        static {
            Covode.recordClassIndex(94334);
        }

        i(a aVar) {
            this.f144144a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            r.a("cancel_delete_avatar", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
            this.f144144a.l().dismiss();
        }
    }

    static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144143a;

        static {
            Covode.recordClassIndex(94333);
        }

        h(a aVar) {
            this.f144143a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            r.a("confirm_delete_avatar", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
            this.f144143a.l().dismiss();
            this.f144143a.k().a(0);
        }
    }
}

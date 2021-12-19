package com.ss.android.ugc.aweme.tools.draft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.experiment.cf;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.tools.draft.b.b;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class at extends x implements com.ss.android.ugc.aweme.tools.draft.f.a {
    public static final a A = new a((byte) 0);
    private ObjectAnimator B;
    private ObjectAnimator C;
    private View D;
    private RecyclerView E;
    private TextView F;
    private TextView G;
    private final h.h H = h.i.a((h.f.a.a) new b(this));
    private int I = 48;
    private boolean J = true;
    private LinearLayoutManager K;
    private HashMap L;

    /* renamed from: b  reason: collision with root package name */
    public final String f139384b = "DraftFragment";

    /* renamed from: c  reason: collision with root package name */
    public boolean f139385c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f139386d;

    /* renamed from: e  reason: collision with root package name */
    public final int f139387e;

    /* renamed from: f  reason: collision with root package name */
    public ButtonTitleBar f139388f;

    /* renamed from: g  reason: collision with root package name */
    DmtStatusView f139389g;

    /* renamed from: h  reason: collision with root package name */
    public FrameLayout f139390h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.draft.c.b f139391i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.draft.viewholder.c f139392j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f139393k;

    /* renamed from: l  reason: collision with root package name */
    public int f139394l;

    /* renamed from: m  reason: collision with root package name */
    public int f139395m;
    final boolean n = cf.a();
    public boolean o;
    public String p = "";
    public List<String> q = h.a.z.INSTANCE;
    long r;
    boolean s;
    public String t = "";
    public List<com.ss.android.ugc.aweme.tools.draft.d.a> u = new ArrayList();
    public final am v = an.a(bf.f159041b);
    public final am w = an.a(com.ss.android.ugc.aweme.af.a.f66269a);
    public boolean x = true;
    public Long y = 0L;
    public boolean z;

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ at this$0;

        static {
            Covode.recordClassIndex(91123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(at atVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = atVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ at this$0;

        static {
            Covode.recordClassIndex(91124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(at atVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = atVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((List<String>) null, this);
        }
    }

    static {
        Covode.recordClassIndex(91120);
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c, com.ss.android.ugc.aweme.tools.draft.x
    public final View a(int i2) {
        if (this.L == null) {
            this.L = new HashMap();
        }
        View view = (View) this.L.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.L.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c, com.ss.android.ugc.aweme.tools.draft.x
    public final void a() {
        HashMap hashMap = this.L;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final DraftViewModel c() {
        return (DraftViewModel) this.H.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91121);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.f.a
    public final void a(com.ss.android.ugc.aweme.tools.draft.d.c cVar, boolean z2) {
        String string;
        h.f.b.l.d(cVar, "");
        DraftViewModel c2 = c();
        h.f.b.l.d(cVar, "");
        if (z2) {
            c2.f139935b.add(cVar);
        } else {
            c2.f139935b.remove(cVar);
        }
        TextView textView = this.F;
        if (textView == null) {
            h.f.b.l.a("mDeleteTv");
        }
        String string2 = getString(R.string.yk);
        h.f.b.l.b(string2, "");
        String a2 = com.a.a(string2, Arrays.copyOf(new Object[]{Integer.valueOf(c().f139935b.size())}, 1));
        h.f.b.l.b(a2, "");
        textView.setText(a2);
        if (this.f139385c) {
            TextView textView2 = this.G;
            if (textView2 == null) {
                h.f.b.l.a("mFreeupSize");
            }
            long j2 = 0;
            for (com.ss.android.ugc.aweme.tools.draft.d.c cVar2 : c().f139935b) {
                j2 += cVar2.f139483f;
            }
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMaximumFractionDigits(1);
            if (j2 / 1073741824 > 1) {
                string = getString(R.string.fpv, decimalFormat.format((double) ((((float) j2) * 1.0f) / 1.07374182E9f)));
                h.f.b.l.b(string, "");
            } else {
                string = getString(R.string.fpu, decimalFormat.format((double) ((((float) j2) * 1.0f) / 1048576.0f)));
                h.f.b.l.b(string, "");
            }
            textView2.setText(string);
        }
        if (c().f139935b.size() <= 0) {
            k();
            return;
        }
        FrameLayout frameLayout = this.f139390h;
        if (frameLayout == null) {
            h.f.b.l.a("mLayoutDelete");
        }
        if (frameLayout.getVisibility() != 0) {
            FrameLayout frameLayout2 = this.f139390h;
            if (frameLayout2 == null) {
                h.f.b.l.a("mLayoutDelete");
            }
            if (frameLayout2.getVisibility() != 0) {
                FrameLayout frameLayout3 = this.f139390h;
                if (frameLayout3 == null) {
                    h.f.b.l.a("mLayoutDelete");
                }
                float[] fArr = new float[2];
                FrameLayout frameLayout4 = this.f139390h;
                if (frameLayout4 == null) {
                    h.f.b.l.a("mLayoutDelete");
                }
                fArr[0] = (float) frameLayout4.getMeasuredHeight();
                fArr[1] = 0.0f;
                ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout3, "translationY", fArr).setDuration(200L);
                this.C = duration;
                if (duration == null) {
                    h.f.b.l.b();
                }
                duration.addListener(new x(this));
                ObjectAnimator objectAnimator = this.C;
                if (objectAnimator == null) {
                    h.f.b.l.b();
                }
                objectAnimator.start();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.f.a
    public final void a(View view, com.ss.android.ugc.aweme.tools.draft.d.c cVar) {
        h.f.b.l.d(cVar, "");
        if (view == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.aweme.tools.draft.l.a aVar = new com.ss.android.ugc.aweme.tools.draft.l.a(view.getContext());
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        aVar.a(new String[]{context.getResources().getString(R.string.yh)}, new y(this, view, cVar));
        aVar.f139812a.b();
    }

    public static final class k extends com.ss.android.ugc.aweme.tools.draft.viewholder.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f139401a;

        static {
            Covode.recordClassIndex(91131);
        }

        @Override // com.ss.android.ugc.aweme.tools.draft.viewholder.i
        public final boolean c() {
            return this.f139401a.f139393k;
        }

        @Override // com.ss.android.ugc.aweme.tools.draft.viewholder.i
        public final boolean b() {
            if (this.f139401a.f139395m == this.f139401a.f139394l - 1) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.tools.draft.viewholder.i
        public final void a() {
            com.ss.android.ugc.tools.utils.q.a(this.f139401a.f139384b + " -> loadMoreItems is running");
            if (this.f139401a.x) {
                this.f139401a.f139395m++;
                this.f139401a.f139393k = true;
                bz unused = kotlinx.coroutines.i.a(this.f139401a.v, null, null, new a(this, null), 3);
            }
        }

        static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
            int label;
            final /* synthetic */ k this$0;

            static {
                Covode.recordClassIndex(91132);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = kVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    h.r.a(obj);
                    at atVar = this.this$0.f139401a;
                    this.label = 1;
                    if (atVar.a(this) == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    h.r.a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return h.z.f158842a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(at atVar, LinearLayoutManager linearLayoutManager) {
            super(linearLayoutManager);
            this.f139401a = atVar;
        }
    }

    public final IDraftService.DraftListener g() {
        return new u(this);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.f.a
    public final void e() {
        bz unused = kotlinx.coroutines.i.a(this.v, null, null, new r(this, null), 3);
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<DraftViewModel> {
        final /* synthetic */ at this$0;

        static {
            Covode.recordClassIndex(91122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(at atVar) {
            super(0);
            this.this$0 = atVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DraftViewModel invoke() {
            ac a2 = ae.a(this.this$0, (ad.b) null).a(DraftViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f139405a;

        static {
            Covode.recordClassIndex(91136);
        }

        o(at atVar) {
            this.f139405a = atVar;
        }

        public final void run() {
            ButtonTitleBar buttonTitleBar = this.f139405a.f139388f;
            if (buttonTitleBar == null) {
                h.f.b.l.a("mTitleBar");
            }
            buttonTitleBar.getStartBtn().setImageResource(2131230986);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.x
    public final void b() {
        f();
        if (this.f139386d) {
            this.f139386d = false;
            k();
            i();
            return;
        }
        l();
    }

    public final void f() {
        this.z = false;
        DmtStatusView dmtStatusView = this.f139389g;
        if (dmtStatusView == null) {
            h.f.b.l.a("mLoadingLayout");
        }
        dmtStatusView.setVisibility(8);
    }

    public final String j() {
        if (this.f139385c) {
            return "storage_management";
        }
        if (this.f139387e == 1) {
            return "video_shoot_page";
        }
        return "personal_homepage";
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.tools.draft.x
    public final void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.B;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.C;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            objectAnimator2.cancel();
        }
        this.t = "";
        a();
    }

    public final void d() {
        aw.f139417a = System.currentTimeMillis();
        DmtStatusView dmtStatusView = this.f139389g;
        if (dmtStatusView == null) {
            h.f.b.l.a("mLoadingLayout");
        }
        dmtStatusView.f();
        this.f139395m = 0;
        c().b();
        bz unused = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new f(this, null), 3);
    }

    public final void k() {
        FrameLayout frameLayout = this.f139390h;
        if (frameLayout == null) {
            h.f.b.l.a("mLayoutDelete");
        }
        if (frameLayout.getVisibility() != 8) {
            FrameLayout frameLayout2 = this.f139390h;
            if (frameLayout2 == null) {
                h.f.b.l.a("mLayoutDelete");
            }
            float[] fArr = new float[1];
            FrameLayout frameLayout3 = this.f139390h;
            if (frameLayout3 == null) {
                h.f.b.l.a("mLayoutDelete");
            }
            fArr[0] = (float) frameLayout3.getMeasuredHeight();
            ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout2, "translationY", fArr).setDuration(200L);
            this.B = duration;
            if (duration == null) {
                h.f.b.l.b();
            }
            duration.addListener(new e(this));
            ObjectAnimator objectAnimator = this.B;
            if (objectAnimator == null) {
                h.f.b.l.b();
            }
            objectAnimator.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        k();
        if (this.J || !com.ss.android.ugc.aweme.port.in.g.a().c().d()) {
            this.J = false;
            com.ss.android.ugc.aweme.port.in.g.a().c().a(true);
        } else if (!this.n || !bg.a()) {
            c().f139941h.a();
            com.ss.android.ugc.aweme.tools.draft.viewholder.c cVar = this.f139392j;
            if (cVar == null) {
                h.f.b.l.a("mAdapter");
            }
            cVar.f139913a.clear();
            cVar.notifyDataSetChanged();
            d();
        } else {
            String str = this.t;
            if (str == null || str.length() == 0) {
                com.ss.android.ugc.tools.utils.q.a("DraftFragment -> updateDraft: operatedDraftCreationId is null or empty");
            } else {
                bz unused = kotlinx.coroutines.i.a(this.w, null, null, new z(this, null), 3);
            }
        }
    }

    public final void h() {
        Set<com.ss.android.ugc.aweme.tools.draft.d.c> set = c().f139935b;
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context, "");
        com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(context);
        Context context2 = getContext();
        if (context2 == null) {
            h.f.b.l.b();
        }
        String string = context2.getString(R.string.bcm);
        h.f.b.l.b(string, "");
        bVar.c(string, new s(this, set));
        Context context3 = getContext();
        if (context3 == null) {
            h.f.b.l.b();
        }
        String string2 = context3.getString(R.string.bcn);
        h.f.b.l.b(string2, "");
        bVar.b(string2, t.f139406a);
        Context context4 = getContext();
        if (context4 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context4, "");
        com.bytedance.tux.dialog.b a2 = a.C1094a.a(context4).b((CharSequence) null);
        Context context5 = getContext();
        if (context5 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context5, "");
        a2.d(context5.getResources().getQuantityString(R.plurals.b4, 1)).a(bVar).a().b().show();
    }

    public final void i() {
        if (this.f139386d) {
            ButtonTitleBar buttonTitleBar = this.f139388f;
            if (buttonTitleBar == null) {
                h.f.b.l.a("mTitleBar");
            }
            buttonTitleBar.getEndBtn().setTextColor(buttonTitleBar.getResources().getColor(com.ss.android.ugc.aweme.ah.a.f66308b));
            DmtTextView endBtn = buttonTitleBar.getEndBtn();
            h.f.b.l.b(endBtn, "");
            endBtn.setText(getText(R.string.yi));
            ImageView startBtn = buttonTitleBar.getStartBtn();
            h.f.b.l.b(startBtn, "");
            startBtn.setVisibility(8);
            DmtTextView titleView = buttonTitleBar.getTitleView();
            h.f.b.l.b(titleView, "");
            titleView.setVisibility(8);
        } else {
            ButtonTitleBar buttonTitleBar2 = this.f139388f;
            if (buttonTitleBar2 == null) {
                h.f.b.l.a("mTitleBar");
            }
            buttonTitleBar2.getEndBtn().setTextColor(buttonTitleBar2.getResources().getColor(com.ss.android.ugc.aweme.ah.a.f66307a));
            DmtTextView endBtn2 = buttonTitleBar2.getEndBtn();
            h.f.b.l.b(endBtn2, "");
            endBtn2.setText(getText(R.string.yj));
            ImageView startBtn2 = buttonTitleBar2.getStartBtn();
            h.f.b.l.b(startBtn2, "");
            startBtn2.setVisibility(0);
            DmtTextView titleView2 = buttonTitleBar2.getTitleView();
            h.f.b.l.b(titleView2, "");
            titleView2.setVisibility(0);
            k();
        }
        com.ss.android.ugc.aweme.tools.draft.viewholder.c cVar = this.f139392j;
        if (cVar == null) {
            h.f.b.l.a("mAdapter");
        }
        cVar.f139914b = this.f139386d;
        cVar.notifyDataSetChanged();
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f139396a;

        static {
            Covode.recordClassIndex(91125);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(at atVar) {
            this.f139396a = atVar;
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            at.a(this.f139396a).setVisibility(8);
        }
    }

    public static final class m implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f139403a;

        static {
            Covode.recordClassIndex(91134);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(at atVar) {
            this.f139403a = atVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f139403a.l();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
            at atVar = this.f139403a;
            atVar.f139386d = !atVar.f139386d;
            atVar.i();
            atVar.c().f139935b.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f139406a = new t();

        static {
            Covode.recordClassIndex(91142);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            return h.z.f158842a;
        }
    }

    public static final class u extends IDraftService.DraftListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f139407a;

        static {
            Covode.recordClassIndex(91143);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        u(at atVar) {
            this.f139407a = atVar;
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(com.ss.android.ugc.aweme.draft.model.c cVar) {
            h.f.b.l.d(cVar, "");
            this.f139407a.d();
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f139408a = new w();

        static {
            Covode.recordClassIndex(91146);
        }

        w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            return h.z.f158842a;
        }
    }

    public static final class x extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f139409a;

        static {
            Covode.recordClassIndex(91147);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        x(at atVar) {
            this.f139409a = atVar;
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
            at.a(this.f139409a).setVisibility(0);
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f139402a;

        static {
            Covode.recordClassIndex(91133);
        }

        l(at atVar) {
            this.f139402a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139402a.h();
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f139404a;

        static {
            Covode.recordClassIndex(91135);
        }

        n(at atVar) {
            this.f139404a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139404a.h();
        }
    }

    public static final /* synthetic */ FrameLayout a(at atVar) {
        FrameLayout frameLayout = atVar.f139390h;
        if (frameLayout == null) {
            h.f.b.l.a("mLayoutDelete");
        }
        return frameLayout;
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.tools.draft.d.c $data;
        final /* synthetic */ at this$0;

        static {
            Covode.recordClassIndex(91144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(at atVar, com.ss.android.ugc.aweme.tools.draft.d.c cVar) {
            super(1);
            this.this$0 = atVar;
            this.$data = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            bz unused = kotlinx.coroutines.i.a(this.this$0.w, null, null, new h.f.a.m<am, h.c.d<? super h.z>, Object>(this, null) {
                /* class com.ss.android.ugc.aweme.tools.draft.at.v.AnonymousClass1 */
                int label;
                final /* synthetic */ v this$0;

                static {
                    Covode.recordClassIndex(91145);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.c.b.a.a
                public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                    h.f.b.l.d(dVar, "");
                    return 

                    static final class p extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                        final /* synthetic */ com.ss.android.ugc.aweme.tools.draft.d.c $data;
                        int label;
                        final /* synthetic */ at this$0;

                        static {
                            Covode.recordClassIndex(91137);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        p(at atVar, com.ss.android.ugc.aweme.tools.draft.d.c cVar, h.c.d dVar) {
                            super(2, dVar);
                            this.this$0 = atVar;
                            this.$data = cVar;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                            h.f.b.l.d(dVar, "");
                            return new p(this.this$0, this.$data, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // h.f.a.m
                        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                            return ((p) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                            int i2 = this.label;
                            if (i2 == 0) {
                                h.r.a(obj);
                                DraftViewModel c2 = this.this$0.c();
                                com.ss.android.ugc.aweme.tools.draft.d.c cVar = this.$data;
                                com.ss.android.ugc.aweme.tools.draft.c.b bVar = this.this$0.f139391i;
                                if (bVar == null) {
                                    h.f.b.l.a("mDraftStickerDownloadMgr");
                                }
                                this.label = 1;
                                if (c2.a(cVar, bVar, this) == aVar) {
                                    return aVar;
                                }
                            } else if (i2 == 1) {
                                h.r.a(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return h.z.f158842a;
                        }
                    }

                    static final class r extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                        int label;
                        final /* synthetic */ at this$0;

                        static {
                            Covode.recordClassIndex(91139);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        r(at atVar, h.c.d dVar) {
                            super(2, dVar);
                            this.this$0 = atVar;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                            h.f.b.l.d(dVar, "");
                            return new r(this.this$0, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // h.f.a.m
                        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                            return ((r) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                            int i2 = this.label;
                            if (i2 == 0) {
                                h.r.a(obj);
                                at atVar = this.this$0;
                                this.label = 1;
                                if (atVar.a(this) == aVar) {
                                    return aVar;
                                }
                            } else if (i2 == 1) {
                                h.r.a(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return h.z.f158842a;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public static final class s extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, h.z> {
                        final /* synthetic */ Set $mSelectedDraft;
                        final /* synthetic */ at this$0;

                        static {
                            Covode.recordClassIndex(91140);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        s(at atVar, Set set) {
                            super(1);
                            this.this$0 = atVar;
                            this.$mSelectedDraft = set;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                            h.f.b.l.d(aVar, "");
                            bz unused = kotlinx.coroutines.i.a(this.this$0.v, null, null, new h.f.a.m<am, h.c.d<? super h.z>, Object>(this, null) {
                                /* class com.ss.android.ugc.aweme.tools.draft.at.s.AnonymousClass1 */
                                int label;
                                final /* synthetic */ s this$0;

                                static {
                                    Covode.recordClassIndex(91141);
                                }

                                {
                                    this.this$0 = r2;
                                }

                                @Override // h.c.b.a.a
                                public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                    h.f.b.l.d(dVar, "");
                                    return 

                                    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
                                    public final void onCreate(Bundle bundle) {
                                        super.onCreate(bundle);
                                        Bundle arguments = getArguments();
                                        if (arguments != null) {
                                            this.f139385c = arguments.getBoolean("is_disk_manage_mode", false);
                                        }
                                        this.f139391i = new com.ss.android.ugc.aweme.tools.draft.c.b(this);
                                        aw.f139419c = true;
                                        this.r = System.currentTimeMillis();
                                    }

                                    /* access modifiers changed from: package-private */
                                    public static final class f extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                                        int label;
                                        final /* synthetic */ at this$0;

                                        static {
                                            Covode.recordClassIndex(91126);
                                        }

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        f(at atVar, h.c.d dVar) {
                                            super(2, dVar);
                                            this.this$0 = atVar;
                                        }

                                        @Override // h.c.b.a.a
                                        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                            h.f.b.l.d(dVar, "");
                                            return new f(this.this$0, dVar);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                        @Override // h.f.a.m
                                        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                            return ((f) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                                        }

                                        /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[RETURN] */
                                        @Override // h.c.b.a.a
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                                            /*
                                                r6 = this;
                                                h.c.a.a r5 = h.c.a.a.COROUTINE_SUSPENDED
                                                int r0 = r6.label
                                                r4 = 3
                                                r3 = 2
                                                r2 = 1
                                                if (r0 == 0) goto L_0x0015
                                                if (r0 == r2) goto L_0x0038
                                                if (r0 == r3) goto L_0x0038
                                                if (r0 != r4) goto L_0x0046
                                                h.r.a(r7)
                                            L_0x0012:
                                                h.z r0 = h.z.f158842a
                                                return r0
                                            L_0x0015:
                                                h.r.a(r7)
                                                com.ss.android.ugc.aweme.tools.draft.at r0 = r6.this$0
                                                boolean r0 = r0.o
                                                if (r0 == 0) goto L_0x002b
                                                com.ss.android.ugc.aweme.tools.draft.at r1 = r6.this$0
                                                java.util.List<java.lang.String> r0 = r1.q
                                                r6.label = r2
                                                java.lang.Object r0 = r1.a(r0, r6)
                                                if (r0 != r5) goto L_0x003b
                                                return r5
                                            L_0x002b:
                                                com.ss.android.ugc.aweme.tools.draft.at r1 = r6.this$0
                                                java.lang.String r0 = r1.p
                                                r6.label = r3
                                                java.lang.Object r0 = r1.a(r0, r6)
                                                if (r0 != r5) goto L_0x003b
                                                return r5
                                            L_0x0038:
                                                h.r.a(r7)
                                            L_0x003b:
                                                com.ss.android.ugc.aweme.tools.draft.at r0 = r6.this$0
                                                r6.label = r4
                                                java.lang.Object r0 = r0.a(r6)
                                                if (r0 != r5) goto L_0x0012
                                                return r5
                                            L_0x0046:
                                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                r1.<init>(r0)
                                                throw r1
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.at.f.invokeSuspend(java.lang.Object):java.lang.Object");
                                        }
                                    }

                                    static final class h<T> implements androidx.lifecycle.u {

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ at f139398a;

                                        static {
                                            Covode.recordClassIndex(91128);
                                        }

                                        h(at atVar) {
                                            this.f139398a = atVar;
                                        }

                                        @Override // androidx.lifecycle.u
                                        public final /* synthetic */ void onChanged(Object obj) {
                                            h.p pVar = (h.p) obj;
                                            com.ss.android.ugc.aweme.draft.model.c cVar = (com.ss.android.ugc.aweme.draft.model.c) pVar.getFirst();
                                            if (((Boolean) pVar.getSecond()).booleanValue()) {
                                                at atVar = this.f139398a;
                                                Long l2 = atVar.y;
                                                if (l2 == null) {
                                                    h.f.b.l.b();
                                                }
                                                long longValue = l2.longValue();
                                                if (atVar.z) {
                                                    atVar.f();
                                                    com.ss.android.ugc.tools.utils.q.a(atVar.f139384b + "loadStickersSuc -> draft : " + cVar.r());
                                                    ak.a(atVar.getActivity(), cVar, atVar.f139387e, longValue, atVar.g());
                                                    return;
                                                }
                                                return;
                                            }
                                            at atVar2 = this.f139398a;
                                            if (atVar2.z) {
                                                atVar2.f();
                                                new com.ss.android.ugc.aweme.tux.a.i.a(atVar2.getContext()).a(R.string.axa).a();
                                            }
                                        }
                                    }

                                    static final class i<T> implements androidx.lifecycle.u {

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ at f139399a;

                                        static {
                                            Covode.recordClassIndex(91129);
                                        }

                                        i(at atVar) {
                                            this.f139399a = atVar;
                                        }

                                        @Override // androidx.lifecycle.u
                                        public final /* synthetic */ void onChanged(Object obj) {
                                            com.ss.android.ugc.aweme.draft.model.c cVar = (com.ss.android.ugc.aweme.draft.model.c) obj;
                                            if (this.f139399a.z) {
                                                this.f139399a.f();
                                            }
                                            StringBuilder append = new StringBuilder().append(this.f139399a.f139384b).append("isUpdateDraftLiveData -> draft : ");
                                            h.f.b.l.b(cVar, "");
                                            com.ss.android.ugc.tools.utils.q.a(append.append(cVar.r()).toString());
                                            at atVar = this.f139399a;
                                            String f2 = cVar.f();
                                            h.f.b.l.b(f2, "");
                                            atVar.t = f2;
                                            androidx.fragment.app.e activity = this.f139399a.getActivity();
                                            int i2 = this.f139399a.f139387e;
                                            Long l2 = this.f139399a.y;
                                            if (l2 == null) {
                                                h.f.b.l.b();
                                            }
                                            ak.a(activity, cVar, i2, l2.longValue(), this.f139399a.g());
                                        }
                                    }

                                    public final Object a(h.c.d<? super h.z> dVar) {
                                        if (this.n) {
                                            if (this.o) {
                                                Object b2 = c().b(this.I, this.f139395m, this.q, dVar);
                                                if (b2 == h.c.a.a.COROUTINE_SUSPENDED) {
                                                    return b2;
                                                }
                                            } else {
                                                Object b3 = c().b(this.I, this.f139395m, this.p, dVar);
                                                if (b3 == h.c.a.a.COROUTINE_SUSPENDED) {
                                                    return b3;
                                                }
                                            }
                                        } else if (this.o) {
                                            Object a2 = c().a(this.I, this.f139395m, this.q, dVar);
                                            if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
                                                return a2;
                                            }
                                        } else {
                                            Object a3 = c().a(this.I, this.f139395m, this.p, dVar);
                                            if (a3 == h.c.a.a.COROUTINE_SUSPENDED) {
                                                return a3;
                                            }
                                        }
                                        return h.z.f158842a;
                                    }

                                    @Override // androidx.fragment.app.Fragment
                                    public final void onActivityCreated(Bundle bundle) {
                                        super.onActivityCreated(bundle);
                                        com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(getActivity());
                                        this.I = 48;
                                        boolean c2 = com.ss.android.ugc.aweme.port.in.g.a().o().c();
                                        this.o = c2;
                                        if (c2) {
                                            this.q = com.ss.android.ugc.aweme.port.in.g.a().o().f();
                                        } else {
                                            cr a2 = cr.a();
                                            h.f.b.l.b(a2, "");
                                            String f2 = a2.f();
                                            h.f.b.l.b(f2, "");
                                            this.p = f2;
                                        }
                                        d();
                                        c().f139937d.observe(this, new g(this));
                                        c().f139938e.observe(this, new h(this));
                                        c().f139939f.observe(this, new i(this));
                                        c().f139940g.observe(this, new j(this));
                                    }

                                    static final class j<T> implements androidx.lifecycle.u {

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ at f139400a;

                                        static {
                                            Covode.recordClassIndex(91130);
                                        }

                                        j(at atVar) {
                                            this.f139400a = atVar;
                                        }

                                        @Override // androidx.lifecycle.u
                                        public final /* synthetic */ void onChanged(Object obj) {
                                            com.ss.android.ugc.aweme.tools.draft.viewmodel.c cVar = (com.ss.android.ugc.aweme.tools.draft.viewmodel.c) obj;
                                            androidx.fragment.app.e requireActivity = this.f139400a.requireActivity();
                                            h.f.b.l.b(requireActivity, "");
                                            String str = cVar.f139949a;
                                            String str2 = cVar.f139950b;
                                            int i2 = cVar.f139951c;
                                            String str3 = cVar.f139952d;
                                            String uuid = UUID.randomUUID().toString();
                                            h.f.b.l.b(uuid, "");
                                            ArrayList<String> a2 = com.ss.android.ugc.aweme.sticker.p.g.a(str3);
                                            h.f.b.l.b(a2, "");
                                            h.f.b.l.d(uuid, "");
                                            h.f.b.l.d(str, "");
                                            h.f.b.l.d(a2, "");
                                            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", uuid).a("shoot_way", "draft_again").a("music_id", str).a("is_ui_shoot", false).a("group_id", dv.a());
                                            if (!com.ss.android.ugc.tools.utils.k.a(a2) && !TextUtils.isEmpty(a2.get(0))) {
                                                a3.a("prop_id", a2.get(0));
                                            }
                                            com.ss.android.ugc.aweme.utils.d.a("shoot", a3.f149193a);
                                            com.ss.android.ugc.aweme.df.e.a("toVideoActivity() called with: context = [ ], path = [" + str2 + "], musicStart = [" + i2 + ']');
                                            Intent intent = new Intent();
                                            intent.putExtra("path", str2);
                                            intent.putExtra("music_start", i2);
                                            intent.putExtra("record_from", 1);
                                            intent.putExtra("translation_type", 3);
                                            intent.putExtra("shoot_way", "draft_again");
                                            intent.putExtra("creation_id", uuid);
                                            intent.putExtra("extra_sticker_from", "draft");
                                            intent.putStringArrayListExtra("reuse_sticker_ids", com.ss.android.ugc.aweme.sticker.p.g.a(str3));
                                            cr.a().g();
                                            intent.setClass(requireActivity, VideoRecordPermissionActivity.class);
                                            com.ss.android.ugc.tiktok.security.a.a.a(intent, requireActivity);
                                            requireActivity.startActivity(intent);
                                        }
                                    }

                                    static final class q extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                                        final /* synthetic */ androidx.fragment.app.e $activity;
                                        final /* synthetic */ String $creationId;
                                        int label;
                                        final /* synthetic */ at this$0;

                                        static {
                                            Covode.recordClassIndex(91138);
                                        }

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        q(at atVar, androidx.fragment.app.e eVar, String str, h.c.d dVar) {
                                            super(2, dVar);
                                            this.this$0 = atVar;
                                            this.$activity = eVar;
                                            this.$creationId = str;
                                        }

                                        @Override // h.c.b.a.a
                                        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                            h.f.b.l.d(dVar, "");
                                            return new q(this.this$0, this.$activity, this.$creationId, dVar);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                        @Override // h.f.a.m
                                        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                            return ((q) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                                        }

                                        /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
                                        @Override // h.c.b.a.a
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                                            /*
                                            // Method dump skipped, instructions count: 142
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.at.q.invokeSuspend(java.lang.Object):java.lang.Object");
                                        }
                                    }

                                    static final class z extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                                        int label;
                                        final /* synthetic */ at this$0;

                                        static {
                                            Covode.recordClassIndex(91149);
                                        }

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        z(at atVar, h.c.d dVar) {
                                            super(2, dVar);
                                            this.this$0 = atVar;
                                        }

                                        @Override // h.c.b.a.a
                                        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                            h.f.b.l.d(dVar, "");
                                            return new z(this.this$0, dVar);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                        @Override // h.f.a.m
                                        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                            return ((z) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                                        }

                                        @Override // h.c.b.a.a
                                        public final Object invokeSuspend(Object obj) {
                                            com.ss.android.ugc.aweme.tools.draft.d.m mVar;
                                            String str;
                                            String str2;
                                            Object obj2 = obj;
                                            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                            int i2 = this.label;
                                            if (i2 == 0) {
                                                h.r.a(obj2);
                                                com.ss.android.ugc.tools.utils.q.a("DraftFragment -> updateDraft: operatedDraftCreationId = " + this.this$0.t);
                                                this.this$0.c().f139941h.b(this.this$0.t);
                                                String str3 = this.this$0.t;
                                                this.label = 1;
                                                obj2 = kotlinx.coroutines.i.a(bf.f159041b, new b.m(str3, null), this);
                                                if (obj2 == aVar) {
                                                    return aVar;
                                                }
                                            } else if (i2 == 1) {
                                                h.r.a(obj2);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            com.ss.android.ugc.aweme.tools.draft.d.h hVar = (com.ss.android.ugc.aweme.tools.draft.d.h) obj2;
                                            if (hVar != null) {
                                                h.f.b.l.d(hVar, "");
                                                String str4 = hVar.f139502a;
                                                String str5 = hVar.f139503b.f139497c;
                                                long j2 = hVar.f139504c.f139493c;
                                                if (hVar.f139503b.f139498d.length() == 0) {
                                                    str2 = "";
                                                } else {
                                                    str2 = hVar.f139503b.f139498d;
                                                }
                                                mVar = new com.ss.android.ugc.aweme.tools.draft.d.m(106, str4, str5, j2, str2, com.ss.android.ugc.aweme.tools.draft.d.g.a(hVar), 64);
                                            } else {
                                                mVar = null;
                                            }
                                            Iterator<com.ss.android.ugc.aweme.tools.draft.d.a> it = this.this$0.u.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                com.ss.android.ugc.aweme.tools.draft.d.a next = it.next();
                                                if (next instanceof com.ss.android.ugc.aweme.tools.draft.d.m) {
                                                    String str6 = ((com.ss.android.ugc.aweme.tools.draft.d.c) next).f139480c;
                                                    if (mVar != null) {
                                                        str = ((com.ss.android.ugc.aweme.tools.draft.d.c) mVar).f139480c;
                                                    } else {
                                                        str = null;
                                                    }
                                                    if (h.f.b.l.a((Object) str6, (Object) str)) {
                                                        this.this$0.u.set(this.this$0.u.indexOf(next), mVar);
                                                        com.ss.android.ugc.aweme.tools.draft.viewholder.c cVar = this.this$0.f139392j;
                                                        if (cVar == null) {
                                                            h.f.b.l.a("mAdapter");
                                                        }
                                                        cVar.a(this.this$0.u);
                                                        this.this$0.t = "";
                                                    }
                                                }
                                            }
                                            return h.z.f158842a;
                                        }
                                    }

                                    static final class g<T> implements androidx.lifecycle.u {

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ at f139397a;

                                        static {
                                            Covode.recordClassIndex(91127);
                                        }

                                        g(at atVar) {
                                            this.f139397a = atVar;
                                        }

                                        @Override // androidx.lifecycle.u
                                        public final /* synthetic */ void onChanged(Object obj) {
                                            Boolean bool = (Boolean) obj;
                                            at atVar = this.f139397a;
                                            h.f.b.l.b(bool, "");
                                            boolean booleanValue = bool.booleanValue();
                                            atVar.f139393k = false;
                                            DmtStatusView dmtStatusView = atVar.f139389g;
                                            if (dmtStatusView == null) {
                                                h.f.b.l.a("mLoadingLayout");
                                            }
                                            dmtStatusView.setVisibility(8);
                                            atVar.u = new ArrayList(atVar.c().f139936c);
                                            List<com.ss.android.ugc.aweme.tools.draft.d.a> list = atVar.u;
                                            h.f.b.l.d(list, "");
                                            if (atVar.f139395m == 0) {
                                                boolean z = atVar.s;
                                                String j2 = atVar.j();
                                                h.f.b.l.d(list, "");
                                                h.f.b.l.d(j2, "");
                                                if (!z) {
                                                    com.ss.android.ugc.aweme.common.r.a("click_draft_entrance", new com.ss.android.ugc.tools.f.b().a("draft_cnt", aw.b(list)).a("enter_from", j2).f149193a);
                                                }
                                                atVar.s = true;
                                                long j3 = atVar.r;
                                                if (!(j3 == 0 || list == null)) {
                                                    com.ss.android.ugc.aweme.common.r.a("tool_performance_draft_preview_list", new com.ss.android.ugc.tools.f.b().a("count", aw.b(list)).a("duration", System.currentTimeMillis() - j3).f149193a);
                                                }
                                                atVar.r = 0;
                                                aw.a(list);
                                            }
                                            if (booleanValue) {
                                                atVar.x = true;
                                                if (atVar.u.isEmpty()) {
                                                    com.ss.android.ugc.aweme.tools.draft.viewholder.c cVar = atVar.f139392j;
                                                    if (cVar == null) {
                                                        h.f.b.l.a("mAdapter");
                                                    }
                                                    cVar.a(atVar.u);
                                                    com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftClean();
                                                    atVar.l();
                                                    return;
                                                }
                                                List<com.ss.android.ugc.aweme.tools.draft.d.a> list2 = atVar.u;
                                                if (atVar.f139395m == atVar.f139394l - 1) {
                                                    if (atVar.n) {
                                                        list2.remove(list2.size() - 2);
                                                    } else {
                                                        list2.remove(list2.size() - 1);
                                                    }
                                                }
                                                com.ss.android.ugc.aweme.tools.draft.viewholder.c cVar2 = atVar.f139392j;
                                                if (cVar2 == null) {
                                                    h.f.b.l.a("mAdapter");
                                                }
                                                cVar2.a(atVar.u);
                                                return;
                                            }
                                            atVar.x = false;
                                            List<com.ss.android.ugc.aweme.tools.draft.d.a> list3 = atVar.u;
                                            if (list3.size() == 0) {
                                                DmtStatusView dmtStatusView2 = atVar.f139389g;
                                                if (dmtStatusView2 == null) {
                                                    h.f.b.l.a("mLoadingLayout");
                                                }
                                                dmtStatusView2.f();
                                                return;
                                            }
                                            com.ss.android.ugc.aweme.tools.draft.d.k kVar = new com.ss.android.ugc.aweme.tools.draft.d.k((byte) 0);
                                            kVar.f139507c = 1;
                                            if (atVar.n) {
                                                list3.set(list3.size() - 2, kVar);
                                            } else {
                                                list3.set(list3.size() - 1, kVar);
                                            }
                                            com.ss.android.ugc.aweme.tools.draft.viewholder.c cVar3 = atVar.f139392j;
                                            if (cVar3 == null) {
                                                h.f.b.l.a("mAdapter");
                                            }
                                            cVar3.a(list3);
                                        }
                                    }

                                    static final class y implements DialogInterface.OnClickListener {

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ at f139410a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ View f139411b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ com.ss.android.ugc.aweme.tools.draft.d.c f139412c;

                                        static {
                                            Covode.recordClassIndex(91148);
                                        }

                                        y(at atVar, View view, com.ss.android.ugc.aweme.tools.draft.d.c cVar) {
                                            this.f139410a = atVar;
                                            this.f139411b = view;
                                            this.f139412c = cVar;
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            h.f.b.l.d(dialogInterface, "");
                                            at atVar = this.f139410a;
                                            Context context = this.f139411b.getContext();
                                            h.f.b.l.b(context, "");
                                            com.ss.android.ugc.aweme.tools.draft.d.c cVar = this.f139412c;
                                            com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(context);
                                            String string = context.getString(R.string.bcm);
                                            h.f.b.l.b(string, "");
                                            bVar.c(string, new v(atVar, cVar));
                                            String string2 = context.getString(R.string.bcn);
                                            h.f.b.l.b(string2, "");
                                            bVar.b(string2, w.f139408a);
                                            a.C1094a.a(context).b((CharSequence) null).d(context.getResources().getQuantityString(R.plurals.b4, 1)).a(bVar).a().b().show();
                                            dialogInterface.dismiss();
                                        }
                                    }

                                    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
                                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
                                    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final java.lang.Object a(java.lang.String r7, h.c.d<? super h.z> r8) {
                                        /*
                                        // Method dump skipped, instructions count: 127
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.at.a(java.lang.String, h.c.d):java.lang.Object");
                                    }

                                    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
                                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
                                    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final java.lang.Object a(java.util.List<java.lang.String> r7, h.c.d<? super h.z> r8) {
                                        /*
                                        // Method dump skipped, instructions count: 127
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.at.a(java.util.List, h.c.d):java.lang.Object");
                                    }

                                    @Override // com.ss.android.ugc.aweme.tools.draft.f.a
                                    public final void a(int i2, com.ss.android.ugc.aweme.tools.draft.d.c cVar) {
                                        h.f.b.l.d(cVar, "");
                                        this.y = Long.valueOf(System.currentTimeMillis());
                                        this.z = true;
                                        DmtStatusView dmtStatusView = this.f139389g;
                                        if (dmtStatusView == null) {
                                            h.f.b.l.a("mLoadingLayout");
                                        }
                                        dmtStatusView.f();
                                        com.ss.android.ugc.tools.utils.q.a("DraftFragment -> onClick: position " + i2 + ", draftId " + cVar.f139480c);
                                        bz unused = kotlinx.coroutines.i.a(this.w, null, null, new p(this, cVar, null), 3);
                                    }

                                    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
                                    public final void onViewCreated(View view, Bundle bundle) {
                                        h.f.b.l.d(view, "");
                                        super.onViewCreated(view, bundle);
                                        View c2 = androidx.core.h.v.c(view, (int) R.id.em8);
                                        h.f.b.l.b(c2, "");
                                        this.f139388f = (ButtonTitleBar) c2;
                                        View c3 = androidx.core.h.v.c(view, (int) R.id.e_f);
                                        h.f.b.l.b(c3, "");
                                        this.D = c3;
                                        View c4 = androidx.core.h.v.c(view, (int) R.id.ape);
                                        h.f.b.l.b(c4, "");
                                        this.f139389g = (DmtStatusView) c4;
                                        View c5 = androidx.core.h.v.c(view, (int) R.id.djs);
                                        h.f.b.l.b(c5, "");
                                        this.E = (RecyclerView) c5;
                                        View c6 = androidx.core.h.v.c(view, (int) R.id.ey_);
                                        h.f.b.l.b(c6, "");
                                        this.F = (TextView) c6;
                                        if (this.f139385c) {
                                            View c7 = androidx.core.h.v.c(view, (int) R.id.ezt);
                                            h.f.b.l.b(c7, "");
                                            TextView textView = (TextView) c7;
                                            this.G = textView;
                                            if (textView == null) {
                                                h.f.b.l.a("mFreeupSize");
                                            }
                                            textView.setVisibility(0);
                                            TextView textView2 = this.G;
                                            if (textView2 == null) {
                                                h.f.b.l.a("mFreeupSize");
                                            }
                                            textView2.setVisibility(0);
                                        }
                                        View c8 = androidx.core.h.v.c(view, (int) R.id.c5c);
                                        h.f.b.l.b(c8, "");
                                        FrameLayout frameLayout = (FrameLayout) c8;
                                        this.f139390h = frameLayout;
                                        if (this.f139385c) {
                                            if (frameLayout == null) {
                                                h.f.b.l.a("mLayoutDelete");
                                            }
                                            frameLayout.setOnClickListener(new l(this));
                                        }
                                        if (this.f139385c) {
                                            FrameLayout frameLayout2 = this.f139390h;
                                            if (frameLayout2 == null) {
                                                h.f.b.l.a("mLayoutDelete");
                                            }
                                            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                                            layoutParams2.height = h.g.a.a(com.bytedance.common.utility.n.b(getContext(), 60.0f));
                                            FrameLayout frameLayout3 = this.f139390h;
                                            if (frameLayout3 == null) {
                                                h.f.b.l.a("mLayoutDelete");
                                            }
                                            frameLayout3.setLayoutParams(layoutParams2);
                                        } else {
                                            TextView textView3 = this.F;
                                            if (textView3 == null) {
                                                h.f.b.l.a("mDeleteTv");
                                            }
                                            ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
                                            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                            layoutParams4.gravity = 17;
                                            layoutParams4.topMargin = 0;
                                            TextView textView4 = this.F;
                                            if (textView4 == null) {
                                                h.f.b.l.a("mDeleteTv");
                                            }
                                            textView4.setLayoutParams(layoutParams4);
                                        }
                                        ButtonTitleBar buttonTitleBar = this.f139388f;
                                        if (buttonTitleBar == null) {
                                            h.f.b.l.a("mTitleBar");
                                        }
                                        buttonTitleBar.setOnTitleBarClickListener(new m(this));
                                        TextView textView5 = this.F;
                                        if (textView5 == null) {
                                            h.f.b.l.a("mDeleteTv");
                                        }
                                        textView5.setOnClickListener(new n(this));
                                        int i2 = Build.VERSION.SDK_INT;
                                        androidx.fragment.app.e activity = getActivity();
                                        if (activity != null) {
                                            View view2 = this.D;
                                            if (view2 == null) {
                                                h.f.b.l.a("mStatusBar");
                                            }
                                            view2.getLayoutParams().height = com.bytedance.ies.uikit.c.a.a(activity);
                                        }
                                        ButtonTitleBar buttonTitleBar2 = this.f139388f;
                                        if (buttonTitleBar2 == null) {
                                            h.f.b.l.a("mTitleBar");
                                        }
                                        buttonTitleBar2.setTitle(getText(R.string.bcj));
                                        ImageView startBtn = buttonTitleBar2.getStartBtn();
                                        h.f.b.l.b(startBtn, "");
                                        startBtn.setVisibility(0);
                                        DmtTextView endBtn = buttonTitleBar2.getEndBtn();
                                        h.f.b.l.b(endBtn, "");
                                        endBtn.setVisibility(0);
                                        buttonTitleBar2.getEndBtn().setTextColor(buttonTitleBar2.getResources().getColor(com.ss.android.ugc.aweme.ah.a.f66307a));
                                        DmtTextView endBtn2 = buttonTitleBar2.getEndBtn();
                                        h.f.b.l.b(endBtn2, "");
                                        endBtn2.setText(getText(R.string.yj));
                                        buttonTitleBar2.getEndBtn().setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
                                        buttonTitleBar2.getEndBtn().setBackgroundColor(0);
                                        new SafeHandler(getActivity()).post(new o(this));
                                        RecyclerView recyclerView = this.E;
                                        if (recyclerView == null) {
                                            h.f.b.l.a("mListView");
                                        }
                                        recyclerView.setOverScrollMode(2);
                                        if (this.n) {
                                            getActivity();
                                            this.K = new WrapGridLayoutManager();
                                            RecyclerView recyclerView2 = this.E;
                                            if (recyclerView2 == null) {
                                                h.f.b.l.a("mListView");
                                            }
                                            LinearLayoutManager linearLayoutManager = this.K;
                                            if (linearLayoutManager == null) {
                                                h.f.b.l.a("layoutManager");
                                            }
                                            recyclerView2.setLayoutManager(linearLayoutManager);
                                            RecyclerView recyclerView3 = this.E;
                                            if (recyclerView3 == null) {
                                                h.f.b.l.a("mListView");
                                            }
                                            recyclerView3.b(new au((int) com.bytedance.common.utility.n.b(getContext(), 1.0f)));
                                        } else {
                                            getActivity();
                                            this.K = new WrapLinearLayoutManager();
                                            RecyclerView recyclerView4 = this.E;
                                            if (recyclerView4 == null) {
                                                h.f.b.l.a("mListView");
                                            }
                                            LinearLayoutManager linearLayoutManager2 = this.K;
                                            if (linearLayoutManager2 == null) {
                                                h.f.b.l.a("layoutManager");
                                            }
                                            recyclerView4.setLayoutManager(linearLayoutManager2);
                                            RecyclerView recyclerView5 = this.E;
                                            if (recyclerView5 == null) {
                                                h.f.b.l.a("mListView");
                                            }
                                            recyclerView5.b(new com.ss.android.ugc.aweme.tools.draft.l.c(getResources().getColor(R.color.c9), (int) com.bytedance.common.utility.n.b(getActivity(), 0.0f), com.bytedance.common.utility.n.b(getActivity(), 0.0f), com.bytedance.common.utility.n.b(getActivity(), 0.0f)));
                                        }
                                        LinearLayoutManager linearLayoutManager3 = this.K;
                                        if (linearLayoutManager3 == null) {
                                            h.f.b.l.a("layoutManager");
                                        }
                                        aw.f139418b = linearLayoutManager3.s();
                                        com.ss.android.ugc.aweme.tools.draft.viewholder.c cVar = new com.ss.android.ugc.aweme.tools.draft.viewholder.c(this, c().f139941h);
                                        this.f139392j = cVar;
                                        cVar.f139915c = this.f139385c;
                                        RecyclerView recyclerView6 = this.E;
                                        if (recyclerView6 == null) {
                                            h.f.b.l.a("mListView");
                                        }
                                        com.ss.android.ugc.aweme.tools.draft.viewholder.c cVar2 = this.f139392j;
                                        if (cVar2 == null) {
                                            h.f.b.l.a("mAdapter");
                                        }
                                        recyclerView6.setAdapter(cVar2);
                                        RecyclerView recyclerView7 = this.E;
                                        if (recyclerView7 == null) {
                                            h.f.b.l.a("mListView");
                                        }
                                        LinearLayoutManager linearLayoutManager4 = this.K;
                                        if (linearLayoutManager4 == null) {
                                            h.f.b.l.a("layoutManager");
                                        }
                                        recyclerView7.a(new k(this, linearLayoutManager4));
                                        DmtStatusView dmtStatusView = this.f139389g;
                                        if (dmtStatusView == null) {
                                            h.f.b.l.a("mLoadingLayout");
                                        }
                                        dmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
                                        ButtonTitleBar buttonTitleBar3 = this.f139388f;
                                        if (buttonTitleBar3 == null) {
                                            h.f.b.l.a("mTitleBar");
                                        }
                                        DmtTextView endBtn3 = buttonTitleBar3.getEndBtn();
                                        ButtonTitleBar buttonTitleBar4 = this.f139388f;
                                        if (buttonTitleBar4 == null) {
                                            h.f.b.l.a("mTitleBar");
                                        }
                                        DmtTextView endBtn4 = buttonTitleBar4.getEndBtn();
                                        h.f.b.l.b(endBtn4, "");
                                        endBtn3.setTypeface(Typeface.create(endBtn4.getTypeface(), 0), 0);
                                        ButtonTitleBar buttonTitleBar5 = this.f139388f;
                                        if (buttonTitleBar5 == null) {
                                            h.f.b.l.a("mTitleBar");
                                        }
                                        buttonTitleBar5.getEndBtn().setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33795a);
                                        ButtonTitleBar buttonTitleBar6 = this.f139388f;
                                        if (buttonTitleBar6 == null) {
                                            h.f.b.l.a("mTitleBar");
                                        }
                                        buttonTitleBar6.getEndBtn().setTextSize(1, 17.0f);
                                        ButtonTitleBar buttonTitleBar7 = this.f139388f;
                                        if (buttonTitleBar7 == null) {
                                            h.f.b.l.a("mTitleBar");
                                        }
                                        buttonTitleBar7.getTitleView().setTextSize(1, 17.0f);
                                    }

                                    @Override // androidx.fragment.app.Fragment
                                    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                                        h.f.b.l.d(layoutInflater, "");
                                        super.onCreateView(layoutInflater, viewGroup, bundle);
                                        View a2 = com.a.a(layoutInflater, R.layout.a0w, viewGroup, false);
                                        h.f.b.l.b(a2, "");
                                        return a2;
                                    }

                                    @Override // com.ss.android.ugc.aweme.tools.draft.f.a
                                    public final void a(View view, Context context, String str) {
                                        h.f.b.l.d(view, "");
                                        h.f.b.l.d(context, "");
                                        h.f.b.l.d(str, "");
                                        androidx.fragment.app.e activity = getActivity();
                                        if (activity == null) {
                                            h.f.b.l.b();
                                        }
                                        h.f.b.l.b(activity, "");
                                        bz unused = kotlinx.coroutines.i.a(this.w, null, null, new q(this, activity, str, null), 3);
                                    }
                                }

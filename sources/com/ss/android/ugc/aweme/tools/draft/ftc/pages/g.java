package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
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
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.tools.draft.ai;
import com.ss.android.ugc.aweme.tools.draft.ak;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.e;
import com.ss.android.ugc.aweme.tools.draft.x;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.z;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

public final class g extends x implements FTCAwemeDraftViewHolder.a {

    /* renamed from: h  reason: collision with root package name */
    public static final c f139606h = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public TextView f139607b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f139608c;

    /* renamed from: d  reason: collision with root package name */
    public e f139609d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<com.ss.android.ugc.aweme.draft.model.c> f139610e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f139611f;

    /* renamed from: g  reason: collision with root package name */
    ObjectAnimator f139612g;

    /* renamed from: i  reason: collision with root package name */
    private final Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> f139613i = new WeakHashMap();

    /* renamed from: j  reason: collision with root package name */
    private ObjectAnimator f139614j;

    /* renamed from: k  reason: collision with root package name */
    private long f139615k;

    /* renamed from: l  reason: collision with root package name */
    private final IDraftService.DraftListener f139616l = new d(this);

    /* renamed from: m  reason: collision with root package name */
    private HashMap f139617m;

    static {
        Covode.recordClassIndex(91269);
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c, com.ss.android.ugc.aweme.tools.draft.x
    public final View a(int i2) {
        if (this.f139617m == null) {
            this.f139617m = new HashMap();
        }
        View view = (View) this.f139617m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f139617m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c, com.ss.android.ugc.aweme.tools.draft.x
    public final void a() {
        HashMap hashMap = this.f139617m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder.a
    public final void a(View view, com.ss.android.ugc.aweme.draft.model.c cVar) {
        h.f.b.l.d(cVar, "");
    }

    public static final class c {
        static {
            Covode.recordClassIndex(91272);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class e implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139621a;

        static {
            Covode.recordClassIndex(91274);
        }

        @Override // com.ss.android.ugc.aweme.tools.draft.ftc.pages.i
        public final void a() {
            this.f139621a.g();
        }

        e(g gVar) {
            this.f139621a = gVar;
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ButtonTitleBar f139626a;

        static {
            Covode.recordClassIndex(91279);
        }

        j(ButtonTitleBar buttonTitleBar) {
            this.f139626a = buttonTitleBar;
        }

        public final void run() {
            this.f139626a.getStartBtn().setImageResource(2131230986);
        }
    }

    public final void g() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.x
    public final void b() {
        if (this.f139611f) {
            this.f139611f = false;
            f();
            e();
            return;
        }
        g();
    }

    public final void c() {
        ((DmtStatusView) a(R.id.chi)).f();
        com.ss.android.ugc.aweme.tools.b.f138752a.execute(new f(this));
    }

    public final void f() {
        this.f139610e.clear();
        FrameLayout frameLayout = (FrameLayout) a(R.id.c4l);
        if (frameLayout.getVisibility() != 8) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, "translationY", (float) frameLayout.getMeasuredHeight()).setDuration(200L);
            duration.addListener(new b(frameLayout));
            duration.start();
            this.f139614j = duration;
        }
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onDestroy() {
        for (com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar : this.f139613i.values()) {
            aVar.close();
        }
        this.f139613i.clear();
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.tools.draft.x
    public final void onDestroyView() {
        com.ss.android.ugc.aweme.tools.draft.j.c.a().unregisterDraftListener(this.f139616l);
        ObjectAnimator objectAnimator = this.f139614j;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.f139614j;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator objectAnimator3 = this.f139612g;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllListeners();
        }
        ObjectAnimator objectAnimator4 = this.f139612g;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        super.onDestroyView();
        a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        f();
        if (!com.ss.android.ugc.aweme.port.in.g.a().c().d()) {
            com.ss.android.ugc.aweme.port.in.g.a().c().a(true);
            return;
        }
        e eVar = this.f139609d;
        if (eVar == null) {
            h.f.b.l.a("mAdapter");
        }
        eVar.c();
        c();
    }

    static final class m<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139629a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f139630b;

        static {
            Covode.recordClassIndex(91282);
        }

        m(g gVar, List list) {
            this.f139629a = gVar;
            this.f139630b = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (this.f139629a.f104785a) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f139629a.a(R.id.chi);
                h.f.b.l.b(dmtStatusView, "");
                dmtStatusView.setVisibility(8);
                e a2 = g.a(this.f139629a);
                List list = this.f139630b;
                h.f.b.l.d(list, "");
                if (!list.isEmpty()) {
                    com.ss.android.ugc.aweme.draft.model.c cVar = new com.ss.android.ugc.aweme.draft.model.c();
                    cVar.x = 2;
                    cVar.W.aE = false;
                    a2.f139586b = true;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(0, cVar);
                    arrayList.addAll(list);
                    list = arrayList;
                }
                a2.b(list);
            }
            return z.f158842a;
        }
    }

    public final void d() {
        a.C0731a aVar = new a.C0731a(getContext());
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context, "");
        aVar.f33402b = context.getResources().getQuantityString(R.plurals.b3, this.f139610e.size());
        aVar.b(R.string.bcn, (DialogInterface.OnClickListener) null, false).a(R.string.bcm, (DialogInterface.OnClickListener) new k(this), false).a().b();
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139622a;

        static {
            Covode.recordClassIndex(91275);
        }

        f(g gVar) {
            this.f139622a = gVar;
        }

        public final void run() {
            cr a2 = cr.a();
            h.f.b.l.b(a2, "");
            String f2 = a2.f();
            h.f.b.l.b(f2, "");
            g gVar = this.f139622a;
            q.a("Before DraftDataProvider.getDraftDataV2()");
            boolean z = gVar.f139608c;
            ArrayList arrayList = new ArrayList();
            ai a3 = ai.a();
            if (a3 != null) {
                q.a("Before DraftDataProvider.queryMusicAwemeCollectionV2()");
                List<com.ss.android.ugc.aweme.tools.draft.i.a> a4 = a3.a(f2);
                h.f.b.l.b(a4, "");
                q.a("After DraftDataProvider.queryMusicAwemeCollectionV2()");
                for (com.ss.android.ugc.aweme.tools.draft.i.a aVar : a4) {
                    List<com.ss.android.ugc.aweme.tools.draft.g.a<Object>> b2 = aVar.b();
                    if (!com.bytedance.common.utility.h.a(b2)) {
                        com.ss.android.ugc.aweme.draft.model.c cVar = new com.ss.android.ugc.aweme.draft.model.c();
                        cVar.x = 3;
                        cVar.B = aVar.a();
                        arrayList.add(cVar);
                        arrayList.addAll(com.ss.android.ugc.aweme.tools.draft.ftc.c.a.a(b2, z));
                    }
                    if (z && arrayList.size() > 0) {
                        ((com.ss.android.ugc.aweme.draft.model.c) arrayList.get(arrayList.size() - 1)).z = true;
                    }
                }
            }
            if (z) {
                com.ss.android.ugc.aweme.tools.draft.ftc.c.a.a(arrayList);
            }
            q.a("After DraftDataProvider.getDraftDataV2()");
            b.i.b(new m(gVar, arrayList), b.i.f4826c);
        }
    }

    public final void e() {
        if (this.f139611f) {
            ButtonTitleBar buttonTitleBar = (ButtonTitleBar) a(R.id.elv);
            buttonTitleBar.getEndBtn().setTextColor(androidx.core.content.b.c(requireContext(), com.ss.android.ugc.aweme.ah.a.f66308b));
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
            ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) a(R.id.elv);
            buttonTitleBar2.getEndBtn().setTextColor(androidx.core.content.b.c(requireContext(), com.ss.android.ugc.aweme.ah.a.f66307a));
            DmtTextView endBtn2 = buttonTitleBar2.getEndBtn();
            h.f.b.l.b(endBtn2, "");
            endBtn2.setText(getText(R.string.yj));
            ImageView startBtn2 = buttonTitleBar2.getStartBtn();
            h.f.b.l.b(startBtn2, "");
            startBtn2.setVisibility(0);
            DmtTextView titleView2 = buttonTitleBar2.getTitleView();
            h.f.b.l.b(titleView2, "");
            titleView2.setVisibility(0);
            f();
        }
        e eVar = this.f139609d;
        if (eVar == null) {
            h.f.b.l.a("mAdapter");
        }
        eVar.f139585a = this.f139611f;
        eVar.notifyDataSetChanged();
    }

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f139618a;

        static {
            Covode.recordClassIndex(91270);
        }

        a(FrameLayout frameLayout) {
            this.f139618a = frameLayout;
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
            this.f139618a.setVisibility(0);
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f139619a;

        static {
            Covode.recordClassIndex(91271);
        }

        b(FrameLayout frameLayout) {
            this.f139619a = frameLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            this.f139619a.setVisibility(8);
        }
    }

    public static final class d extends IDraftService.DraftListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139620a;

        static {
            Covode.recordClassIndex(91273);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(g gVar) {
            this.f139620a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftDelete(com.ss.android.ugc.aweme.draft.model.c cVar) {
            if (cVar != null) {
                e a2 = g.a(this.f139620a);
                String r = cVar.r();
                if (a2.f150019f != null) {
                    for (com.ss.android.ugc.aweme.draft.model.c cVar2 : a2.f150019f) {
                        h.f.b.l.b(cVar2, "");
                        if (TextUtils.equals(r, cVar2.r())) {
                            a2.a(cVar2);
                            return;
                        }
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(com.ss.android.ugc.aweme.draft.model.c cVar) {
            h.f.b.l.d(cVar, "");
            if (this.f139620a.f104785a) {
                e a2 = g.a(this.f139620a);
                if (!(a2.getItemCount() == 0 || cVar == null)) {
                    int size = a2.f150019f.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        com.ss.android.ugc.aweme.draft.model.c cVar2 = (com.ss.android.ugc.aweme.draft.model.c) a2.f150019f.get(i2);
                        if (cVar2 != null && com.bytedance.common.utility.m.a(cVar.r(), cVar2.r())) {
                            a2.f150019f.set(i2, cVar);
                            a2.notifyItemChanged(i2);
                        }
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftCheckedChanged(com.ss.android.ugc.aweme.draft.model.c cVar, boolean z) {
            String string;
            h.f.b.l.d(cVar, "");
            if (z) {
                this.f139620a.f139610e.add(cVar);
            } else {
                this.f139620a.f139610e.remove(cVar);
            }
            TuxTextView tuxTextView = (TuxTextView) this.f139620a.a(R.id.eup);
            h.f.b.l.b(tuxTextView, "");
            String string2 = this.f139620a.getString(R.string.yk);
            h.f.b.l.b(string2, "");
            String a2 = com.a.a(string2, Arrays.copyOf(new Object[]{Integer.valueOf(this.f139620a.f139610e.size())}, 1));
            h.f.b.l.b(a2, "");
            tuxTextView.setText(a2);
            if (this.f139620a.f139608c) {
                TextView textView = this.f139620a.f139607b;
                if (textView == null) {
                    h.f.b.l.b();
                }
                g gVar = this.f139620a;
                long j2 = 0;
                for (com.ss.android.ugc.aweme.draft.model.c cVar2 : gVar.f139610e) {
                    j2 += cVar2.C;
                }
                DecimalFormat decimalFormat = new DecimalFormat();
                decimalFormat.setMaximumFractionDigits(1);
                if (j2 / 1073741824 > 1) {
                    double d2 = (double) (((float) j2) * 1.0f);
                    Double.isNaN(d2);
                    string = gVar.getString(R.string.fpv, decimalFormat.format(d2 / 1.073741824E9d).toString());
                    h.f.b.l.b(string, "");
                } else {
                    double d3 = (double) (((float) j2) * 1.0f);
                    Double.isNaN(d3);
                    string = gVar.getString(R.string.fpu, decimalFormat.format(d3 / 1048576.0d).toString());
                    h.f.b.l.b(string, "");
                }
                textView.setText(string);
            }
            if (this.f139620a.f139610e.size() <= 0) {
                this.f139620a.f();
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f139620a.a(R.id.c4l);
            h.f.b.l.b(frameLayout, "");
            if (frameLayout.getVisibility() != 0) {
                g gVar2 = this.f139620a;
                FrameLayout frameLayout2 = (FrameLayout) gVar2.a(R.id.c4l);
                if (frameLayout2.getVisibility() != 0) {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout2, "translationY", (float) frameLayout2.getMeasuredHeight(), 0.0f).setDuration(200L);
                    duration.addListener(new a(frameLayout2));
                    duration.start();
                    gVar2.f139612g = duration;
                }
            }
        }
    }

    public static final class h implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139624a;

        static {
            Covode.recordClassIndex(91277);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(g gVar) {
            this.f139624a = gVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f139624a.g();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
            g gVar = this.f139624a;
            gVar.f139611f = !gVar.f139611f;
            gVar.e();
        }
    }

    public static final class l extends IDraftService.DraftListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139628a;

        static {
            Covode.recordClassIndex(91281);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(g gVar) {
            this.f139628a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(com.ss.android.ugc.aweme.draft.model.c cVar) {
            h.f.b.l.d(cVar, "");
            this.f139628a.c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$g  reason: collision with other inner class name */
    static final class View$OnClickListenerC3686g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139623a;

        static {
            Covode.recordClassIndex(91276);
        }

        View$OnClickListenerC3686g(g gVar) {
            this.f139623a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139623a.d();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139625a;

        static {
            Covode.recordClassIndex(91278);
        }

        i(g gVar) {
            this.f139625a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139625a.d();
        }
    }

    public static final /* synthetic */ e a(g gVar) {
        e eVar = gVar.f139609d;
        if (eVar == null) {
            h.f.b.l.a("mAdapter");
        }
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(getActivity());
    }

    /* access modifiers changed from: package-private */
    public static final class k implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139627a;

        static {
            Covode.recordClassIndex(91280);
        }

        k(g gVar) {
            this.f139627a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            e a2 = g.a(this.f139627a);
            ArrayList<com.ss.android.ugc.aweme.draft.model.c> arrayList = new ArrayList(a2.f150019f);
            com.ss.android.ugc.aweme.tools.b.f138752a.execute(new e.b(a2, arrayList));
            for (com.ss.android.ugc.aweme.draft.model.c cVar : arrayList) {
                if (cVar.y) {
                    a2.a(cVar);
                }
            }
            this.f139627a.f();
            this.f139627a.f139611f = false;
            this.f139627a.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder.a
    public final void a(int i2, com.ss.android.ugc.aweme.draft.model.c cVar) {
        h.f.b.l.d(cVar, "");
        q.a("draft onEdit: position " + i2 + ", draftId " + cVar.f83180a);
        ak.a(getActivity(), cVar, 0, System.currentTimeMillis(), new l(this));
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f139608c) {
            if (this.f139607b == null) {
                TextView textView = (TextView) v.c(view, (int) R.id.ezt);
                this.f139607b = textView;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
            TextView textView2 = this.f139607b;
            if (textView2 == null) {
                h.f.b.l.b();
            }
            textView2.setVisibility(0);
        }
        if (this.f139608c) {
            ((FrameLayout) a(R.id.c4l)).setOnClickListener(new View$OnClickListenerC3686g(this));
        }
        if (this.f139608c) {
            FrameLayout frameLayout = (FrameLayout) a(R.id.c4l);
            h.f.b.l.b(frameLayout, "");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = h.g.a.a(n.b(getContext(), 60.0f));
            FrameLayout frameLayout2 = (FrameLayout) a(R.id.c4l);
            h.f.b.l.b(frameLayout2, "");
            frameLayout2.setLayoutParams(layoutParams2);
        } else {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.eup);
            h.f.b.l.b(tuxTextView, "");
            ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 17;
            layoutParams4.topMargin = 0;
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.eup);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setLayoutParams(layoutParams4);
        }
        ((ButtonTitleBar) a(R.id.elv)).setOnTitleBarClickListener(new h(this));
        ((TuxTextView) a(R.id.eup)).setOnClickListener(new i(this));
        int i2 = Build.VERSION.SDK_INT;
        View a2 = a(R.id.e__);
        h.f.b.l.b(a2, "");
        a2.getLayoutParams().height = com.bytedance.ies.uikit.c.a.a(requireContext());
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) a(R.id.elv);
        buttonTitleBar.setTitle(getText(R.string.bcj));
        ImageView startBtn = buttonTitleBar.getStartBtn();
        h.f.b.l.b(startBtn, "");
        startBtn.setVisibility(0);
        DmtTextView endBtn = buttonTitleBar.getEndBtn();
        h.f.b.l.b(endBtn, "");
        endBtn.setVisibility(0);
        buttonTitleBar.getEndBtn().setTextColor(androidx.core.content.b.c(requireContext(), com.ss.android.ugc.aweme.ah.a.f66307a));
        DmtTextView endBtn2 = buttonTitleBar.getEndBtn();
        h.f.b.l.b(endBtn2, "");
        endBtn2.setText(getText(R.string.yj));
        buttonTitleBar.getEndBtn().setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
        buttonTitleBar.getEndBtn().setBackgroundColor(0);
        buttonTitleBar.post(new j(buttonTitleBar));
        RecyclerView recyclerView = (RecyclerView) a(R.id.apd);
        recyclerView.setOverScrollMode(2);
        getActivity();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        recyclerView.b(new com.ss.android.ugc.aweme.tools.draft.l.c(androidx.core.content.b.c(requireContext(), R.color.c9), (int) n.b(getActivity(), 0.0f), n.b(getActivity(), 0.0f), n.b(getActivity(), 0.0f)));
        e eVar = this.f139609d;
        if (eVar == null) {
            h.f.b.l.a("mAdapter");
        }
        recyclerView.setAdapter(eVar);
        ((DmtStatusView) a(R.id.chi)).setBuilder(DmtStatusView.a.a(getContext()));
        ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) a(R.id.elv);
        DmtTextView endBtn3 = buttonTitleBar2.getEndBtn();
        DmtTextView endBtn4 = buttonTitleBar2.getEndBtn();
        h.f.b.l.b(endBtn4, "");
        endBtn3.setTypeface(Typeface.create(endBtn4.getTypeface(), 0), 0);
        buttonTitleBar2.getEndBtn().setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33795a);
        buttonTitleBar2.getEndBtn().setTextSize(1, 17.0f);
        buttonTitleBar2.getTitleView().setTextSize(1, 17.0f);
        com.ss.android.ugc.aweme.tools.draft.j.c.a().registerDraftListener(this.f139616l);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        h.f.b.l.d(layoutInflater, "");
        this.f139615k = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_disk_manage_mode", false);
        } else {
            z = false;
        }
        this.f139608c = z;
        e eVar = new e(this.f139613i, this);
        eVar.f139587c = this.f139608c;
        eVar.d(false);
        eVar.f139588d = new e(this);
        this.f139609d = eVar;
        return com.a.a(layoutInflater, R.layout.a13, viewGroup, false);
    }
}

package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ai;
import com.bytedance.jedi.arch.t;
import com.bytedance.scene.c.e;
import com.bytedance.scene.navigation.f;
import com.bytedance.tux.e.a;
import com.ss.android.ugc.aweme.experiment.fb;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.setting.cj;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.wdiget.HorizontalCenterLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.util.be;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class f extends com.bytedance.scene.group.b implements b {
    public static d t;
    public static final a u = new a((byte) 0);
    private TextView A;
    private ImageView B;
    private View C;

    /* renamed from: b  reason: collision with root package name */
    boolean f129384b = true;

    /* renamed from: c  reason: collision with root package name */
    public int f129385c = -1;

    /* renamed from: d  reason: collision with root package name */
    public PreviewGestureViewPager f129386d;

    /* renamed from: e  reason: collision with root package name */
    public l f129387e;

    /* renamed from: f  reason: collision with root package name */
    public ChooseMediaViewModel f129388f;

    /* renamed from: g  reason: collision with root package name */
    public RecyclerView f129389g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f129390h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f129391i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c f129392j;

    /* renamed from: k  reason: collision with root package name */
    public int f129393k = -1;

    /* renamed from: l  reason: collision with root package name */
    public boolean f129394l = true;
    private TextView v;
    private ImageView w;
    private TextView x;
    private ViewGroup y;
    private View z;

    static {
        Covode.recordClassIndex(84930);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b
    public final void b() {
        this.f129384b = false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84931);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b
    public final boolean a() {
        return this.f129384b;
    }

    /* access modifiers changed from: package-private */
    public static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f129408a;

        static {
            Covode.recordClassIndex(84948);
        }

        p(f fVar) {
            this.f129408a = fVar;
        }

        public final void run() {
            this.f129408a.f129394l = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b
    public final void f() {
        a(false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b
    public final void g() {
        a(true);
    }

    public static final class o implements com.bytedance.scene.navigation.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f129407a;

        static {
            Covode.recordClassIndex(84947);
        }

        @Override // com.bytedance.scene.navigation.h
        public final boolean a() {
            c b2 = f.b(this.f129407a).b(f.a(this.f129407a).getCurrentItem());
            if (b2 == null) {
                return true;
            }
            b2.d();
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(f fVar) {
            this.f129407a = fVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b
    public final View c() {
        d dVar = t;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b
    public final void d() {
        com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this);
        if (a2 != null) {
            e.a aVar = new e.a();
            aVar.f42746a = new com.bytedance.scene.a.a.c();
            com.bytedance.scene.c.e eVar = new com.bytedance.scene.c.e(aVar.f42746a, aVar.f42747b, (byte) 0);
            com.bytedance.scene.d.j.a();
            if (com.bytedance.scene.d.k.a(a2.f42913m)) {
                a2.D();
                com.bytedance.scene.navigation.f fVar = a2.f42955c;
                fVar.a(new f.e(fVar, eVar, (byte) 0));
            }
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f129395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f129396b;

        static {
            Covode.recordClassIndex(84932);
        }

        b(View view, int i2) {
            this.f129395a = view;
            this.f129396b = i2;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f129395a.setEnabled(true);
            this.f129395a.getHitRect(rect);
            rect.top -= this.f129396b;
            rect.bottom += this.f129396b;
            rect.left -= this.f129396b;
            rect.right += this.f129396b;
            ViewParent parent = this.f129395a.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            View view = (View) parent;
            if (view != null) {
                view.setTouchDelegate(new TouchDelegate(rect, this.f129395a));
            }
        }
    }

    public final void E() {
        List<? extends MvImageChooseAdapter.MyMediaModel> list;
        PreviewGestureViewPager previewGestureViewPager = this.f129386d;
        if (previewGestureViewPager == null) {
            h.f.b.l.a("viewPager");
        }
        PagerAdapter adapter = previewGestureViewPager.getAdapter();
        if (!(adapter instanceof l)) {
            adapter = null;
        }
        l lVar = (l) adapter;
        if (lVar != null && (list = lVar.f129414a) != null && !list.isEmpty()) {
            PreviewGestureViewPager previewGestureViewPager2 = this.f129386d;
            if (previewGestureViewPager2 == null) {
                h.f.b.l.a("viewPager");
            }
            MvImageChooseAdapter.MyMediaModel myMediaModel = (MvImageChooseAdapter.MyMediaModel) h.a.n.b((List) list, previewGestureViewPager2.getCurrentItem());
            if (myMediaModel != null) {
                d dVar = t;
                if (dVar != null && !dVar.a(myMediaModel)) {
                    return;
                }
                if (myMediaModel.v >= 0) {
                    ChooseMediaViewModel chooseMediaViewModel = this.f129388f;
                    if (chooseMediaViewModel == null) {
                        h.f.b.l.a("chooseMediaViewModel");
                    }
                    chooseMediaViewModel.b(myMediaModel);
                    return;
                }
                ChooseMediaViewModel chooseMediaViewModel2 = this.f129388f;
                if (chooseMediaViewModel2 == null) {
                    h.f.b.l.a("chooseMediaViewModel");
                }
                h.f.b.l.d(myMediaModel, "");
                chooseMediaViewModel2.c(new ChooseMediaViewModel.k(myMediaModel));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b
    public final void e() {
        View view = this.z;
        if (view == null) {
            h.f.b.l.a("previewDockView");
        }
        boolean z2 = true;
        if (view.getAlpha() == 0.0f) {
            Activity activity = this.f42913m;
            if (activity != null) {
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                a.C1099a.a((androidx.fragment.app.e) activity).a(false, false).f44923a.d();
            }
        } else {
            Activity activity2 = this.f42913m;
            if (activity2 != null) {
                Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                a.C1099a.a((androidx.fragment.app.e) activity2).a(false, true).f44923a.d();
            }
        }
        View view2 = this.z;
        if (view2 == null) {
            h.f.b.l.a("previewDockView");
        }
        View view3 = this.z;
        if (view3 == null) {
            h.f.b.l.a("previewDockView");
        }
        if (view3.getAlpha() != 0.0f) {
            z2 = false;
        }
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a(view2, z2);
    }

    public static final class j extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f129403a;

        static {
            Covode.recordClassIndex(84941);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(f fVar) {
            this.f129403a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            List<? extends MvImageChooseAdapter.MyMediaModel> list;
            MvImageChooseAdapter.MyMediaModel myMediaModel;
            RecyclerView.a adapter = f.d(this.f129403a).getAdapter();
            if (adapter == null || adapter.getItemCount() != 0 || this.f129403a.f129393k < 0 || !fb.c()) {
                f.c(this.f129403a).c(ChooseMediaViewModel.a.f128815a);
                return;
            }
            PagerAdapter adapter2 = f.a(this.f129403a).getAdapter();
            if (!(adapter2 instanceof l)) {
                adapter2 = null;
            }
            l lVar = (l) adapter2;
            if (lVar != null && (list = lVar.f129414a) != null && (myMediaModel = (MvImageChooseAdapter.MyMediaModel) list.get(this.f129403a.f129393k)) != null) {
                ChooseMediaViewModel c2 = f.c(this.f129403a);
                h.f.b.l.d(myMediaModel, "");
                c2.c(new ChooseMediaViewModel.b(myMediaModel));
            }
        }
    }

    public static final class l implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f129405a;

        static {
            Covode.recordClassIndex(84943);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(f fVar) {
            this.f129405a = fVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Boolean, z> {
            final /* synthetic */ l this$0;

            static {
                Covode.recordClassIndex(84944);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(l lVar) {
                super(1);
                this.this$0 = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                MvImageChooseAdapter.MyMediaModel myMediaModel = (MvImageChooseAdapter.MyMediaModel) h.a.n.b((List) f.b(this.this$0.f129405a).f129414a, f.a(this.this$0.f129405a).getCurrentItem());
                if (myMediaModel != null && !booleanValue && myMediaModel.v >= 0) {
                    f.c(this.this$0.f129405a).b(myMediaModel);
                }
                return z.f158842a;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            c b2;
            if (i2 == 1) {
                f fVar = this.f129405a;
                fVar.f129385c = f.a(fVar).getCurrentItem();
            } else if (f.a(this.f129405a).getCurrentItem() == this.f129405a.f129385c && i2 == 0 && (b2 = f.b(this.f129405a).b(this.f129405a.f129385c)) != null) {
                b2.a();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c cVar;
            Integer c2;
            this.f129405a.f129393k = i2;
            if (!this.f129405a.f129384b) {
                f fVar = this.f129405a;
                fVar.a(f.b(fVar).f129414a, new a(this));
                MvImageChooseAdapter.MyMediaModel myMediaModel = (MvImageChooseAdapter.MyMediaModel) h.a.n.b((List) f.b(this.f129405a).f129414a, i2);
                if (myMediaModel != null) {
                    ChooseMediaViewModel c3 = f.c(this.f129405a);
                    h.f.b.l.d(myMediaModel, "");
                    c3.c(new ChooseMediaViewModel.e(myMediaModel));
                    if (fb.b() && (cVar = this.f129405a.f129392j) != null && (c2 = cVar.c(myMediaModel)) != null) {
                        this.f129405a.e(c2.intValue() + 1);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            c b2;
            if (f.a(this.f129405a).getCurrentItem() == this.f129405a.f129385c && i3 > 0 && (b2 = f.b(this.f129405a).b(this.f129405a.f129385c)) != null) {
                b2.b();
            }
        }
    }

    public static final class m implements PreviewGestureViewPager.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f129406a;

        static {
            Covode.recordClassIndex(84945);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(f fVar) {
            this.f129406a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager.a
        public final void a(boolean z) {
            Integer valueOf;
            int i2;
            Integer valueOf2;
            int i3;
            if (z) {
                d dVar = f.t;
                if (dVar != null && (valueOf2 = Integer.valueOf(dVar.d())) != null) {
                    if (valueOf2.intValue() == 1) {
                        i3 = R.string.c3k;
                    } else if (valueOf2.intValue() == 2) {
                        i3 = R.string.c3j;
                    } else if (valueOf2.intValue() == 3) {
                        i3 = R.string.c3i;
                    } else {
                        return;
                    }
                    this.f129406a.a(i3);
                    return;
                }
                return;
            }
            d dVar2 = f.t;
            if (dVar2 != null && (valueOf = Integer.valueOf(dVar2.d())) != null) {
                if (valueOf.intValue() == 1) {
                    i2 = R.string.c3n;
                } else if (valueOf.intValue() == 2) {
                    i2 = R.string.c3m;
                } else if (valueOf.intValue() == 3) {
                    i2 = R.string.c3l;
                } else {
                    return;
                }
                this.f129406a.a(i2);
            }
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c f129397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f129398b;

        static {
            Covode.recordClassIndex(84933);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            if (myMediaModel != null) {
                f.c(this.f129398b).b(myMediaModel);
            }
        }

        c(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c cVar, f fVar) {
            this.f129397a = cVar;
            this.f129398b = fVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e
        public final void a(int i2, int i3) {
            boolean z;
            boolean z2 = true;
            if (i2 < 0 || i2 >= this.f129397a.f129443b.size()) {
                z = false;
            } else {
                z = true;
            }
            if (i3 < 0 || i3 >= this.f129397a.f129443b.size()) {
                z2 = false;
            }
            if (z && z2) {
                MvImageChooseAdapter.MyMediaModel myMediaModel = this.f129397a.f129443b.get(i3);
                h.f.b.l.b(myMediaModel, "");
                final MvImageChooseAdapter.MyMediaModel myMediaModel2 = myMediaModel;
                f.c(this.f129398b).c(new ChooseMediaViewModel.i(i2, i3));
                f.a(this.f129398b).postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f129399a;

                    static {
                        Covode.recordClassIndex(84934);
                    }

                    {
                        this.f129399a = r1;
                    }

                    public final void run() {
                        List<? extends MvImageChooseAdapter.MyMediaModel> list;
                        MvImageChooseAdapter.MyMediaModel myMediaModel;
                        List<? extends MvImageChooseAdapter.MyMediaModel> list2;
                        MvImageChooseAdapter.MyMediaModel myMediaModel2;
                        PagerAdapter adapter = f.a(this.f129399a.f129398b).getAdapter();
                        l lVar = null;
                        if (!(adapter instanceof l)) {
                            adapter = null;
                        }
                        l lVar2 = (l) adapter;
                        if (lVar2 == null || (list2 = lVar2.f129414a) == null || (myMediaModel2 = (MvImageChooseAdapter.MyMediaModel) h.a.n.b((List) list2, myMediaModel2.w)) == null || !h.f.b.l.a((Object) myMediaModel2.f109390b, (Object) myMediaModel2.f109390b)) {
                            PagerAdapter adapter2 = f.a(this.f129399a.f129398b).getAdapter();
                            if (adapter2 instanceof l) {
                                lVar = adapter2;
                            }
                            l lVar3 = lVar;
                            if (lVar3 != null && (list = lVar3.f129414a) != null && (myMediaModel = (MvImageChooseAdapter.MyMediaModel) h.a.n.b((List) list, f.a(this.f129399a.f129398b).getCurrentItem())) != null) {
                                f.e(this.f129399a.f129398b).setText(String.valueOf(myMediaModel.v));
                                return;
                            }
                            return;
                        }
                        if (f.a(this.f129399a.f129398b).getCurrentItem() == myMediaModel2.w) {
                            f.e(this.f129399a.f129398b).setText(String.valueOf(myMediaModel2.v));
                        } else {
                            f.a(this.f129399a.f129398b).setCurrentItem(myMediaModel2.w);
                        }
                        this.f129399a.f129397a.b(myMediaModel2.v - 1);
                        this.f129399a.f129397a.notifyDataSetChanged();
                    }
                }, 100);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            int i2;
            Integer c2;
            if (myMediaModel != null && myMediaModel.w != f.a(this.f129398b).getCurrentItem()) {
                MediaModel mediaModel = (MediaModel) h.a.n.b((List) f.b(this.f129398b).f129414a, myMediaModel.w);
                if (mediaModel != null && h.f.b.l.a((Object) mediaModel.f109390b, (Object) myMediaModel.f109390b)) {
                    f.a(this.f129398b).setCurrentItem(myMediaModel.w);
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c cVar = this.f129398b.f129392j;
                    if (!(cVar == null || (c2 = cVar.c(myMediaModel)) == null)) {
                        this.f129398b.e(c2.intValue() + 1);
                        if (z.f158842a != null) {
                            return;
                        }
                    }
                }
                f fVar = this.f129398b;
                if (myMediaModel.b()) {
                    i2 = R.string.b26;
                } else {
                    i2 = R.string.b2_;
                }
                fVar.a(i2);
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f129401a;

        static {
            Covode.recordClassIndex(84939);
        }

        h(f fVar) {
            this.f129401a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.bytedance.scene.ktx.b.b(this.f129401a).E();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f129402a;

        static {
            Covode.recordClassIndex(84940);
        }

        i(f fVar) {
            this.f129402a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129402a.E();
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f129404a;

        static {
            Covode.recordClassIndex(84942);
        }

        k(f fVar) {
            this.f129404a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129404a.E();
        }
    }

    public static final /* synthetic */ PreviewGestureViewPager a(f fVar) {
        PreviewGestureViewPager previewGestureViewPager = fVar.f129386d;
        if (previewGestureViewPager == null) {
            h.f.b.l.a("viewPager");
        }
        return previewGestureViewPager;
    }

    public static final /* synthetic */ l b(f fVar) {
        l lVar = fVar.f129387e;
        if (lVar == null) {
            h.f.b.l.a("viewPagerAdapter");
        }
        return lVar;
    }

    public static final /* synthetic */ ChooseMediaViewModel c(f fVar) {
        ChooseMediaViewModel chooseMediaViewModel = fVar.f129388f;
        if (chooseMediaViewModel == null) {
            h.f.b.l.a("chooseMediaViewModel");
        }
        return chooseMediaViewModel;
    }

    public static final /* synthetic */ RecyclerView d(f fVar) {
        RecyclerView recyclerView = fVar.f129389g;
        if (recyclerView == null) {
            h.f.b.l.a("mediaRecyclerView");
        }
        return recyclerView;
    }

    public static final /* synthetic */ TextView e(f fVar) {
        TextView textView = fVar.f129390h;
        if (textView == null) {
            h.f.b.l.a("selectIndicator");
        }
        return textView;
    }

    static final class g extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(84938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            TextView textView = this.this$0.f129391i;
            if (textView == null) {
                h.f.b.l.a("nextBtn");
            }
            textView.setText(str2);
            return z.f158842a;
        }
    }

    private final void a(boolean z2) {
        if (z2) {
            View view = this.z;
            if (view == null) {
                h.f.b.l.a("previewDockView");
            }
            view.setVisibility(0);
            return;
        }
        View view2 = this.z;
        if (view2 == null) {
            h.f.b.l.a("previewDockView");
        }
        view2.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$f  reason: collision with other inner class name */
    static final class C3370f extends h.f.b.m implements h.f.a.b<MediaState, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c $adapter;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(84937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3370f(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c cVar, f fVar) {
            super(1);
            this.$adapter = cVar;
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(MediaState mediaState) {
            MediaState mediaState2 = mediaState;
            h.f.b.l.d(mediaState2, "");
            MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
            if (media != null) {
                if (this.$adapter.getItemCount() == 0) {
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a(f.d(this.this$0), true);
                }
                this.$adapter.b(media.v - 1);
                this.$adapter.b(media);
                this.this$0.e(this.$adapter.a());
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b
    public final void a(int i2) {
        if (this.f129394l) {
            this.f129394l = false;
            new com.ss.android.ugc.aweme.tux.a.i.a(t()).a(i2).a();
            com.bytedance.scene.ktx.c.a(this, new p(this), (long) InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    public final void e(int i2) {
        View view;
        if (i2 >= 0) {
            RecyclerView recyclerView = this.f129389g;
            if (recyclerView == null) {
                h.f.b.l.a("mediaRecyclerView");
            }
            RecyclerView.ViewHolder f2 = recyclerView.f(i2);
            if (f2 != null) {
                view = f2.itemView;
            } else {
                view = null;
            }
            int i3 = 0;
            if (view == null) {
                RecyclerView recyclerView2 = this.f129389g;
                if (recyclerView2 == null) {
                    h.f.b.l.a("mediaRecyclerView");
                }
                int i4 = i2 - 1;
                if (i4 > 0) {
                    i3 = i4;
                }
                recyclerView2.b(i3);
                return;
            }
            RecyclerView recyclerView3 = this.f129389g;
            if (recyclerView3 == null) {
                h.f.b.l.a("mediaRecyclerView");
            }
            int i5 = i2 - 1;
            if (i5 > 0) {
                i3 = i5;
            }
            recyclerView3.d(i3);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<MediaState, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c $adapter;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(84936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c cVar, f fVar) {
            super(1);
            this.$adapter = cVar;
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(MediaState mediaState) {
            List<? extends MvImageChooseAdapter.MyMediaModel> list;
            MvImageChooseAdapter.MyMediaModel myMediaModel;
            MediaState mediaState2 = mediaState;
            h.f.b.l.d(mediaState2, "");
            MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
            if (media != null) {
                PagerAdapter adapter = f.a(this.this$0).getAdapter();
                if (!(adapter instanceof l)) {
                    adapter = null;
                }
                l lVar = (l) adapter;
                if (!(lVar == null || (list = lVar.f129414a) == null || (myMediaModel = (MvImageChooseAdapter.MyMediaModel) h.a.n.b((List) list, f.a(this.this$0).getCurrentItem())) == null)) {
                    this.$adapter.c(myMediaModel);
                }
                this.$adapter.a(media);
                if (this.$adapter.getItemCount() <= 0) {
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a(f.d(this.this$0), false);
                }
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<MediaListState, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(84946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(MediaListState mediaListState) {
            int i2;
            MediaListState mediaListState2 = mediaListState;
            h.f.b.l.d(mediaListState2, "");
            List<? extends MvImageChooseAdapter.MyMediaModel> k2 = h.a.n.k(mediaListState2.getMediaList());
            l b2 = f.b(this.this$0);
            h.f.b.l.d(k2, "");
            b2.f129414a = k2;
            f.b(this.this$0).notifyDataSetChanged();
            if (this.this$0.f129384b) {
                PreviewGestureViewPager a2 = f.a(this.this$0);
                d dVar = f.t;
                if (dVar != null) {
                    i2 = dVar.c();
                } else {
                    i2 = 0;
                }
                a2.setCurrentItem(i2);
            }
            this.this$0.a(k2, (h.f.a.b<? super Boolean, z>) null);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<MediaListState, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(84935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(MediaListState mediaListState) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c cVar;
            Integer c2;
            MediaListState mediaListState2 = mediaListState;
            h.f.b.l.d(mediaListState2, "");
            ArrayList<MvImageChooseAdapter.MyMediaModel> mediaList = mediaListState2.getMediaList();
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c cVar2 = this.this$0.f129392j;
            if (cVar2 != null) {
                List k2 = h.a.n.k(mediaList);
                h.f.b.l.d(k2, "");
                cVar2.f129443b.clear();
                h.a.n.a((Collection) cVar2.f129443b, (Iterable) k2);
                cVar2.notifyDataSetChanged();
                q.d("VideoImageMixedBaseAdapter setMediaList size " + k2.size() + ' ' + be.a());
            }
            if (mediaList.size() == 0) {
                f.d(this.this$0).setVisibility(8);
            }
            MvImageChooseAdapter.MyMediaModel myMediaModel = (MvImageChooseAdapter.MyMediaModel) h.a.n.b((List) f.b(this.this$0).f129414a, f.a(this.this$0).getCurrentItem());
            if (!(myMediaModel == null || (cVar = this.this$0.f129392j) == null || (c2 = cVar.c(myMediaModel)) == null)) {
                this.this$0.e(c2.intValue());
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b
    public final void a(float f2) {
        int max = Math.max(0, (int) (255.0f * f2));
        PreviewGestureViewPager previewGestureViewPager = this.f129386d;
        if (previewGestureViewPager == null) {
            h.f.b.l.a("viewPager");
        }
        previewGestureViewPager.setBackgroundColor(Color.argb(max, 0, 0, 0));
        if (f2 == 1.0f) {
            if (fb.b()) {
                View view = this.z;
                if (view == null) {
                    h.f.b.l.a("previewDockView");
                }
                view.setVisibility(0);
                return;
            }
            ImageView imageView = this.w;
            if (imageView == null) {
                h.f.b.l.a("backBtn");
            }
            imageView.setVisibility(0);
            TextView textView = this.v;
            if (textView == null) {
                h.f.b.l.a("indexTxt");
            }
            textView.setVisibility(0);
            TextView textView2 = this.x;
            if (textView2 == null) {
                h.f.b.l.a("tipTxt");
            }
            textView2.setVisibility(0);
        } else if (fb.b()) {
            View view2 = this.z;
            if (view2 == null) {
                h.f.b.l.a("previewDockView");
            }
            view2.setVisibility(4);
        } else {
            ImageView imageView2 = this.w;
            if (imageView2 == null) {
                h.f.b.l.a("backBtn");
            }
            imageView2.setVisibility(4);
            TextView textView3 = this.v;
            if (textView3 == null) {
                h.f.b.l.a("indexTxt");
            }
            textView3.setVisibility(4);
            TextView textView4 = this.x;
            if (textView4 == null) {
                h.f.b.l.a("tipTxt");
            }
            textView4.setVisibility(4);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c cVar;
        Context r;
        Activity activity;
        Window window;
        super.a(bundle);
        View c2 = c(R.id.bny);
        h.f.b.l.b(c2, "");
        this.v = (TextView) c2;
        View c3 = c(R.id.elp);
        h.f.b.l.b(c3, "");
        this.x = (TextView) c3;
        View c4 = c(R.id.qb);
        h.f.b.l.b(c4, "");
        this.w = (ImageView) c4;
        View c5 = c(R.id.dxo);
        h.f.b.l.b(c5, "");
        this.y = (ViewGroup) c5;
        TextView textView = this.v;
        if (textView == null) {
            h.f.b.l.a("indexTxt");
        }
        int b2 = (int) com.bytedance.common.utility.n.b(t(), 20.0f);
        ViewParent parent = textView.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view = (View) parent;
        if (view != null) {
            view.post(new b(textView, b2));
        }
        ViewGroup viewGroup = this.y;
        if (viewGroup == null) {
            h.f.b.l.a("selectLayout");
        }
        viewGroup.setOnClickListener(new k(this));
        this.f129387e = new l(this, this);
        View c6 = c(R.id.fj_);
        h.f.b.l.b(c6, "");
        this.f129386d = (PreviewGestureViewPager) c6;
        if (fb.b()) {
            View c7 = c(R.id.d96);
            h.f.b.l.b(c7, "");
            c7.setVisibility(8);
            TextView textView2 = this.v;
            if (textView2 == null) {
                h.f.b.l.a("indexTxt");
            }
            textView2.setVisibility(8);
            ImageView imageView = this.w;
            if (imageView == null) {
                h.f.b.l.a("backBtn");
            }
            imageView.setVisibility(8);
            ViewGroup viewGroup2 = this.y;
            if (viewGroup2 == null) {
                h.f.b.l.a("selectLayout");
            }
            viewGroup2.setVisibility(8);
            if (!(Build.VERSION.SDK_INT < 21 || (r = r()) == null || (activity = this.f42913m) == null || (window = activity.getWindow()) == null)) {
                h.f.b.l.b(r, "");
                window.setNavigationBarColor(r.getResources().getColor(R.color.a2));
            }
            View c8 = c(R.id.d8t);
            h.f.b.l.b(c8, "");
            this.z = c8;
            View c9 = c(R.id.cl7);
            h.f.b.l.b(c9, "");
            RecyclerView recyclerView = (RecyclerView) c9;
            this.f129389g = recyclerView;
            if (recyclerView == null) {
                h.f.b.l.a("mediaRecyclerView");
            }
            Context r2 = r();
            Objects.requireNonNull(r2, "null cannot be cast to non-null type android.content.Context");
            recyclerView.setLayoutManager(new HorizontalCenterLayoutManager(r2));
            RecyclerView recyclerView2 = this.f129389g;
            if (recyclerView2 == null) {
                h.f.b.l.a("mediaRecyclerView");
            }
            androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i();
            iVar.f3830i = 250;
            iVar.f3831j = 250;
            iVar.f3832k = 250;
            iVar.f3833l = 250;
            recyclerView2.setItemAnimator(iVar);
            View c10 = c(R.id.bmg);
            h.f.b.l.b(c10, "");
            this.f129390h = (TextView) c10;
            View c11 = c(R.id.bmh);
            h.f.b.l.b(c11, "");
            this.A = (TextView) c11;
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a aVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a();
            androidx.recyclerview.widget.n nVar = new androidx.recyclerview.widget.n(new com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.f(aVar));
            RecyclerView recyclerView3 = this.f129389g;
            if (recyclerView3 == null) {
                h.f.b.l.a("mediaRecyclerView");
            }
            nVar.a(recyclerView3);
            this.f129392j = aVar;
            RecyclerView recyclerView4 = this.f129389g;
            if (recyclerView4 == null) {
                h.f.b.l.a("mediaRecyclerView");
            }
            recyclerView4.setAdapter(this.f129392j);
            View c12 = c(R.id.cud);
            h.f.b.l.b(c12, "");
            ImageView imageView2 = (ImageView) c12;
            this.B = imageView2;
            if (imageView2 == null) {
                h.f.b.l.a("newBackBtn");
            }
            imageView2.setOnClickListener(new h(this));
            View c13 = c(R.id.dxp);
            h.f.b.l.b(c13, "");
            this.C = c13;
            if (c13 == null) {
                h.f.b.l.a("previewSelectLayout");
            }
            c13.setOnClickListener(new i(this));
            View c14 = c(R.id.cv0);
            h.f.b.l.b(c14, "");
            TextView textView3 = (TextView) c14;
            this.f129391i = textView3;
            if (textView3 == null) {
                h.f.b.l.a("nextBtn");
            }
            textView3.setOnClickListener(new j(this));
        }
        if (cj.a()) {
            View c15 = c(R.id.d96);
            h.f.b.l.b(c15, "");
            c15.setVisibility(8);
            ImageView imageView3 = this.w;
            if (imageView3 == null) {
                h.f.b.l.a("backBtn");
            }
            imageView3.setImageResource(2131232197);
            TextView textView4 = this.x;
            if (textView4 == null) {
                h.f.b.l.a("tipTxt");
            }
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            float applyDimension = TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics());
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            textView4.setShadowLayer(applyDimension, 0.0f, TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics()), Color.parseColor("#33000000"));
        }
        PreviewGestureViewPager previewGestureViewPager = this.f129386d;
        if (previewGestureViewPager == null) {
            h.f.b.l.a("viewPager");
        }
        previewGestureViewPager.addOnPageChangeListener(new l(this));
        PreviewGestureViewPager previewGestureViewPager2 = this.f129386d;
        if (previewGestureViewPager2 == null) {
            h.f.b.l.a("viewPager");
        }
        previewGestureViewPager2.setGestureCallback(new m(this));
        PreviewGestureViewPager previewGestureViewPager3 = this.f129386d;
        if (previewGestureViewPager3 == null) {
            h.f.b.l.a("viewPager");
        }
        l lVar = this.f129387e;
        if (lVar == null) {
            h.f.b.l.a("viewPagerAdapter");
        }
        previewGestureViewPager3.setAdapter(lVar);
        Activity t2 = t();
        Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) t2).a(ChooseMediaViewModel.class);
        h.f.b.l.b(a2, "");
        ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) a2;
        this.f129388f = chooseMediaViewModel;
        if (chooseMediaViewModel == null) {
            h.f.b.l.a("chooseMediaViewModel");
        }
        f.a.b.b unused = chooseMediaViewModel.a(this, k.f129413a, new ah(), new n(this));
        com.bytedance.scene.ktx.b.b(this).a(this, new o(this));
        if (fb.b() && (cVar = this.f129392j) != null) {
            cVar.f129447f = new c(cVar, this);
            ChooseMediaViewModel chooseMediaViewModel2 = this.f129388f;
            if (chooseMediaViewModel2 == null) {
                h.f.b.l.a("chooseMediaViewModel");
            }
            f.a.b.b unused2 = chooseMediaViewModel2.a(this, g.f129409a, new ah(), new d(this));
            ChooseMediaViewModel chooseMediaViewModel3 = this.f129388f;
            if (chooseMediaViewModel3 == null) {
                h.f.b.l.a("chooseMediaViewModel");
            }
            chooseMediaViewModel3.a(this, h.f129410a, ai.b(), new e(cVar, this));
            ChooseMediaViewModel chooseMediaViewModel4 = this.f129388f;
            if (chooseMediaViewModel4 == null) {
                h.f.b.l.a("chooseMediaViewModel");
            }
            chooseMediaViewModel4.a(this, i.f129411a, ai.b(), new C3370f(cVar, this));
            ChooseMediaViewModel chooseMediaViewModel5 = this.f129388f;
            if (chooseMediaViewModel5 == null) {
                h.f.b.l.a("chooseMediaViewModel");
            }
            f.a.b.b unused3 = chooseMediaViewModel5.a(this, j.f129412a, new ah(), new g(this));
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        View a2 = com.a.a(t2.getLayoutInflater(), R.layout.au4, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel> r18, h.f.a.b<? super java.lang.Boolean, h.z> r19) {
        /*
        // Method dump skipped, instructions count: 586
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f.a(java.util.List, h.f.a.b):void");
    }
}

package com.bytedance.android.live.liveinteract.multilive.e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.as;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.b.o;
import com.bytedance.android.livesdk.j.eb;
import com.bytedance.android.livesdk.j.ec;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private View f11782a;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f11783d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11784e = true;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.common.e.a.a f11785f;

    /* renamed from: g  reason: collision with root package name */
    d f11786g;

    /* renamed from: h  reason: collision with root package name */
    public final List<View> f11787h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final DataChannel f11788i;

    static {
        Covode.recordClassIndex(6427);
    }

    public int b() {
        return 0;
    }

    public void k() {
    }

    public static FrameLayout.LayoutParams o() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public final void l() {
        FrameLayout e2 = e();
        if (e2 != null) {
            e2.post(new RunnableC0244a(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final void m() {
        FrameLayout e2 = e();
        if (e2 != null) {
            e2.post(new g(this));
        }
    }

    public FrameLayout e() {
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup != null) {
            return (FrameLayout) viewGroup.findViewById(R.id.d62);
        }
        return null;
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11795a;

        static {
            Covode.recordClassIndex(6434);
        }

        g(a aVar) {
            this.f11795a = aVar;
        }

        public final void run() {
            View view;
            FrameLayout e2 = this.f11795a.e();
            if (e2 == null || e2.getChildCount() != 0) {
                FrameLayout e3 = this.f11795a.e();
                d dVar = null;
                if (e3 != null) {
                    view = e3.getChildAt(0);
                } else {
                    view = null;
                }
                if (view instanceof d) {
                    dVar = view;
                }
                d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.a();
                }
            }
        }
    }

    public final void q() {
        float f2;
        int a2;
        float f3;
        if (!LiveBannerExperiment.isNewBannerEnable()) {
            if (p.f()) {
                f3 = 143.0f;
            } else {
                f3 = 152.0f;
            }
            a2 = y.a(f3);
        } else {
            if (p.f()) {
                f2 = 129.0f;
            } else {
                f2 = 138.0f;
            }
            a2 = y.a(f2);
        }
        a(a2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$a  reason: collision with other inner class name */
    public static final class RunnableC0244a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11789a;

        static {
            Covode.recordClassIndex(6428);
        }

        RunnableC0244a(a aVar) {
            this.f11789a = aVar;
        }

        public final void run() {
            FrameLayout e2;
            MethodCollector.i(8910);
            if (com.bytedance.android.live.liveinteract.api.c.e.f10014a.a().isEmpty()) {
                MethodCollector.o(8910);
                return;
            }
            a aVar = this.f11789a;
            Context context = null;
            if (aVar.f11783d != null) {
                if (aVar.f11786g == null) {
                    ViewGroup viewGroup = aVar.f11783d;
                    if (viewGroup == null || (context = viewGroup.getContext()) == null) {
                        l.b();
                    }
                    aVar.f11786g = new d(context, aVar.f11788i, aVar.f11784e);
                }
                d dVar = aVar.f11786g;
                if (dVar != null) {
                    FrameLayout e3 = this.f11789a.e();
                    if (e3 == null) {
                        MethodCollector.o(8910);
                        return;
                    } else if (e3.getChildCount() != 0 || (e2 = this.f11789a.e()) == null) {
                        MethodCollector.o(8910);
                        return;
                    } else {
                        e2.addView(dVar);
                        MethodCollector.o(8910);
                        return;
                    }
                }
            }
            MethodCollector.o(8910);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f11792c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RelativeLayout.LayoutParams f11793d;

        static {
            Covode.recordClassIndex(6429);
        }

        b(int i2, int i3, a aVar, RelativeLayout.LayoutParams layoutParams) {
            this.f11790a = i2;
            this.f11791b = i3;
            this.f11792c = aVar;
            this.f11793d = layoutParams;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            View findViewById;
            View findViewById2;
            View findViewById3;
            ViewGroup viewGroup = this.f11792c.f11783d;
            if (viewGroup == null || (findViewById3 = viewGroup.findViewById(R.id.eoa)) == null) {
                layoutParams = null;
            } else {
                layoutParams = findViewById3.getLayoutParams();
                if (layoutParams != null) {
                    int i2 = this.f11790a;
                    int i3 = this.f11791b;
                    if (i2 <= i3) {
                        i2 = i3;
                    }
                    layoutParams.height = i2;
                }
            }
            ViewGroup viewGroup2 = this.f11792c.f11783d;
            if (!(viewGroup2 == null || (findViewById2 = viewGroup2.findViewById(R.id.eoa)) == null)) {
                findViewById2.setLayoutParams(layoutParams);
            }
            ViewGroup viewGroup3 = this.f11792c.f11783d;
            if (viewGroup3 != null && (findViewById = viewGroup3.findViewById(R.id.eoa)) != null && findViewById.getVisibility() == 0) {
                this.f11792c.n();
                this.f11792c.k();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11794a;

        static {
            Covode.recordClassIndex(6430);
        }

        c(a aVar) {
            this.f11794a = aVar;
        }

        public final void run() {
            boolean z;
            boolean z2;
            View findViewById;
            n c2 = this.f11794a.c();
            FrameLayout e2 = this.f11794a.e();
            Boolean bool = (Boolean) this.f11794a.f11788i.b(ee.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            ViewGroup viewGroup = this.f11794a.f11783d;
            if (viewGroup == null || (findViewById = viewGroup.findViewById(R.id.eoa)) == null || findViewById.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f11794a.f11788i.c(as.class, new o(c2, e2, false, z, 0, 0, 0, 0, z2, 244));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f11797b;

        static {
            Covode.recordClassIndex(6435);
        }

        h(a aVar, ViewGroup viewGroup) {
            this.f11796a = aVar;
            this.f11797b = viewGroup;
        }

        public final void run() {
            View childAt;
            if (this.f11797b.getChildCount() != 0 && (childAt = this.f11797b.getChildAt(0)) != null && (childAt instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                if (viewGroup.getChildCount() > 0) {
                    View childAt2 = viewGroup.getChildAt(0);
                    l.b(childAt2, "");
                    ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                    if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                        layoutParams = null;
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (layoutParams2 != null) {
                        if ((this.f11796a.c() == n.GRID_FIX || this.f11796a.c() == n.GRID) && !com.bytedance.android.live.liveinteract.multilive.anchor.e.c.a(childAt2)) {
                            layoutParams2.gravity = 49;
                            layoutParams2.topMargin = y.a(78.0f);
                        } else {
                            layoutParams2.gravity = 17;
                        }
                        childAt2.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
    }

    public final void n() {
        boolean z;
        if (c() == n.NORMAL) {
            n c2 = c();
            FrameLayout e2 = e();
            Boolean bool = (Boolean) this.f11788i.b(ee.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.f11788i.c(as.class, new o(c2, e2, false, z, 0, 0, 0, 0, false, 500));
            return;
        }
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup != null) {
            viewGroup.post(new c(this));
        }
    }

    public final void r() {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        Boolean bool = (Boolean) this.f11788i.b(com.bytedance.android.livesdk.j.a.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean bool2 = (Boolean) this.f11788i.b(eb.class);
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        Boolean bool3 = (Boolean) this.f11788i.b(com.bytedance.android.livesdk.j.o.class);
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        if (!z && !z2 && !z3) {
            if (p.f()) {
                f2 = 129.0f;
            } else {
                f2 = 138.0f;
            }
            a(y.a(f2));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final void p() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        FrameLayout frameLayout5;
        FrameLayout frameLayout6;
        FrameLayout frameLayout7;
        FrameLayout frameLayout8;
        FrameLayout frameLayout9;
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null || (frameLayout8 = (FrameLayout) viewGroup.findViewById(R.id.d63)) == null || frameLayout8.getChildCount() != 1) {
            ViewGroup viewGroup2 = this.f11783d;
            if (!(viewGroup2 == null || (frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.avx)) == null)) {
                i.a.a.a.a.b.c(frameLayout);
            }
        } else {
            ViewGroup viewGroup3 = this.f11783d;
            if (!(viewGroup3 == null || (frameLayout9 = (FrameLayout) viewGroup3.findViewById(R.id.avx)) == null)) {
                i.a.a.a.a.b.a(frameLayout9);
            }
        }
        ViewGroup viewGroup4 = this.f11783d;
        if (viewGroup4 == null || (frameLayout6 = (FrameLayout) viewGroup4.findViewById(R.id.d64)) == null || frameLayout6.getChildCount() != 1) {
            ViewGroup viewGroup5 = this.f11783d;
            if (!(viewGroup5 == null || (frameLayout2 = (FrameLayout) viewGroup5.findViewById(R.id.avy)) == null)) {
                i.a.a.a.a.b.c(frameLayout2);
            }
        } else {
            ViewGroup viewGroup6 = this.f11783d;
            if (!(viewGroup6 == null || (frameLayout7 = (FrameLayout) viewGroup6.findViewById(R.id.avy)) == null)) {
                i.a.a.a.a.b.a(frameLayout7);
            }
        }
        ViewGroup viewGroup7 = this.f11783d;
        if (viewGroup7 == null || (frameLayout4 = (FrameLayout) viewGroup7.findViewById(R.id.d65)) == null || frameLayout4.getChildCount() != 1) {
            ViewGroup viewGroup8 = this.f11783d;
            if (viewGroup8 != null && (frameLayout3 = (FrameLayout) viewGroup8.findViewById(R.id.avz)) != null) {
                i.a.a.a.a.b.c(frameLayout3);
                return;
            }
            return;
        }
        ViewGroup viewGroup9 = this.f11783d;
        if (viewGroup9 != null && (frameLayout5 = (FrameLayout) viewGroup9.findViewById(R.id.avz)) != null) {
            i.a.a.a.a.b.a(frameLayout5);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final void a(com.bytedance.android.live.liveinteract.platform.common.e.a.a aVar) {
        l.d(aVar, "");
        this.f11785f = aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public void b(boolean z) {
        this.f11784e = z;
    }

    private final void d(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.post(new h(this, viewGroup));
        }
    }

    private static View e(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(6431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.q();
            } else {
                this.this$0.r();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(6432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.q();
            } else {
                this.this$0.r();
            }
            return z.f158842a;
        }
    }

    public a(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f11788i = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final void b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        ViewGroup viewGroup2 = this.f11783d;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        viewGroup.removeView(this.f11783d);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(6433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean z;
            float f2;
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = (Boolean) this.this$0.f11788i.b(com.bytedance.android.livesdk.j.a.class);
            boolean z2 = false;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            Boolean bool3 = (Boolean) this.this$0.f11788i.b(eb.class);
            if (bool3 != null) {
                z2 = bool3.booleanValue();
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.this$0.f11788i.b(ec.class);
            if (z || z2 || !booleanValue) {
                this.this$0.r();
            } else {
                a aVar = this.this$0;
                if (layoutParams != null) {
                    if (p.f()) {
                        f2 = 129.0f;
                    } else {
                        f2 = 138.0f;
                    }
                    int a2 = y.a(f2);
                    int a3 = layoutParams.height + layoutParams.topMargin + y.a(2.0f);
                    ViewGroup viewGroup = aVar.f11783d;
                    if (viewGroup != null) {
                        viewGroup.post(new b(a3, a2, aVar, layoutParams));
                    }
                }
            }
            return z.f158842a;
        }
    }

    private final void a(int i2) {
        View findViewById;
        View findViewById2;
        ViewGroup.LayoutParams layoutParams;
        View findViewById3;
        View findViewById4;
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null || (findViewById4 = viewGroup.findViewById(R.id.eoa)) == null || i2 != findViewById4.getHeight()) {
            ViewGroup viewGroup2 = this.f11783d;
            if (!(viewGroup2 == null || (findViewById2 = viewGroup2.findViewById(R.id.eoa)) == null || (layoutParams = findViewById2.getLayoutParams()) == null)) {
                layoutParams.height = i2;
                ViewGroup viewGroup3 = this.f11783d;
                if (!(viewGroup3 == null || (findViewById3 = viewGroup3.findViewById(R.id.eoa)) == null)) {
                    findViewById3.setLayoutParams(layoutParams);
                }
            }
            ViewGroup viewGroup4 = this.f11783d;
            if (viewGroup4 != null && (findViewById = viewGroup4.findViewById(R.id.eoa)) != null && findViewById.getVisibility() == 0) {
                n();
                k();
            }
        }
    }

    public static ArrayList<View> c(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        ArrayList<View> arrayList = new ArrayList<>();
        View e2 = e((ViewGroup) viewGroup.findViewById(R.id.d63));
        if (e2 != null) {
            arrayList.add(e2);
        }
        View e3 = e((ViewGroup) viewGroup.findViewById(R.id.d64));
        if (e3 != null) {
            arrayList.add(e3);
        }
        View e4 = e((ViewGroup) viewGroup.findViewById(R.id.d65));
        if (e4 != null) {
            arrayList.add(e4);
        }
        return arrayList;
    }

    public final int c(int i2) {
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d63);
        if (frameLayout != null && frameLayout.getChildCount() == 0) {
            arrayList.add(1);
        }
        FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.d64);
        if (frameLayout2 != null && frameLayout2.getChildCount() == 0) {
            arrayList.add(2);
        }
        FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d65);
        if (frameLayout3 != null && frameLayout3.getChildCount() == 0) {
            arrayList.add(3);
        }
        if (arrayList.contains(Integer.valueOf(i2))) {
            return i2;
        }
        if (arrayList.size() <= 0) {
            return -1;
        }
        Object obj = arrayList.get(0);
        l.b(obj, "");
        return ((Number) obj).intValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public void a(View view) {
        ViewParent parent;
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup != null && (parent = view.getParent()) != null) {
            if (l.a(parent, viewGroup.findViewById(R.id.d63))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d63)).removeView(view);
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.avx);
                l.b(frameLayout, "");
                i.a.a.a.a.b.c(frameLayout);
            } else if (l.a(parent, viewGroup.findViewById(R.id.d64))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d64)).removeView(view);
                FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.avy);
                l.b(frameLayout2, "");
                i.a.a.a.a.b.c(frameLayout2);
            } else if (l.a(parent, viewGroup.findViewById(R.id.d65))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d65)).removeView(view);
                FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.avz);
                l.b(frameLayout3, "");
                i.a.a.a.a.b.c(frameLayout3);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public void a(ViewGroup viewGroup) {
        Context context;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        l.d(viewGroup, "");
        Context context2 = viewGroup.getContext();
        ViewGroup viewGroup2 = this.f11783d;
        if (viewGroup2 != null && l.a(viewGroup2.getParent(), viewGroup)) {
            viewGroup.removeView(this.f11783d);
        }
        if (this.f11783d == null) {
            ViewGroup viewGroup3 = (ViewGroup) com.a.a(LayoutInflater.from(context2), a(), viewGroup, false);
            this.f11783d = viewGroup3;
            if (!(viewGroup3 == null || (context = viewGroup3.getContext()) == null)) {
                View a2 = a(context, viewGroup3);
                this.f11782a = a2;
                if (a2 != null) {
                    View a3 = a(context, viewGroup3);
                    View a4 = a(context, viewGroup3);
                    View a5 = a(context, viewGroup3);
                    if (a3 != null) {
                        this.f11787h.add(a3);
                    }
                    if (a4 != null) {
                        this.f11787h.add(a4);
                    }
                    if (a5 != null) {
                        this.f11787h.add(a5);
                    }
                    FrameLayout frameLayout3 = (FrameLayout) viewGroup3.findViewById(R.id.avx);
                    if (frameLayout3 != null) {
                        frameLayout3.addView(a3);
                    }
                    FrameLayout frameLayout4 = (FrameLayout) viewGroup3.findViewById(R.id.avy);
                    if (frameLayout4 != null) {
                        frameLayout4.addView(a4);
                    }
                    FrameLayout frameLayout5 = (FrameLayout) viewGroup3.findViewById(R.id.avz);
                    if (frameLayout5 != null) {
                        frameLayout5.addView(a5);
                    }
                    ViewGroup viewGroup4 = this.f11783d;
                    FrameLayout frameLayout6 = null;
                    if (viewGroup4 != null) {
                        frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.avx);
                    } else {
                        frameLayout = null;
                    }
                    d(frameLayout);
                    ViewGroup viewGroup5 = this.f11783d;
                    if (viewGroup5 != null) {
                        frameLayout2 = (FrameLayout) viewGroup5.findViewById(R.id.avy);
                    } else {
                        frameLayout2 = null;
                    }
                    d(frameLayout2);
                    ViewGroup viewGroup6 = this.f11783d;
                    if (viewGroup6 != null) {
                        frameLayout6 = (FrameLayout) viewGroup6.findViewById(R.id.avz);
                    }
                    d(frameLayout6);
                }
            }
        }
        viewGroup.addView(this.f11783d);
        ViewGroup viewGroup7 = this.f11783d;
        if (viewGroup7 != null) {
            viewGroup7.setVisibility(0);
        }
        n();
        this.f11788i.b(eb.class, (h.f.a.b) new d(this)).b(com.bytedance.android.livesdk.j.a.class, (h.f.a.b) new e(this)).b(com.bytedance.android.livesdk.j.o.class, (h.f.a.b) new f(this));
    }

    private final View a(Context context, ViewGroup viewGroup) {
        if (b() == 0) {
            return null;
        }
        return com.a.a(LayoutInflater.from(context), b(), (ViewGroup) viewGroup.findViewById(R.id.avx), false);
    }

    public static void a(View view, FrameLayout frameLayout) {
        l.d(view, "");
        if (frameLayout != null && !l.a(view.getParent(), frameLayout)) {
            boolean z = view instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a;
            if (z) {
                ((com.bytedance.android.live.liveinteract.multiguest.g.b.a) view).setAdjustParent(true);
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            View e2 = e(frameLayout);
            if (e2 != null && (e2 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a)) {
                ((com.bytedance.android.live.liveinteract.multiguest.g.b.a) e2).setAdjustParent(true);
            }
            frameLayout.removeAllViews();
            frameLayout.addView(view, o());
            if (z) {
                ((com.bytedance.android.live.liveinteract.multiguest.g.b.a) view).setAdjustParent(false);
            }
            frameLayout.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public int a(View view, int i2) {
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            return -1;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d63);
        if (frameLayout == null || frameLayout.getChildCount() != 0) {
            FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.d64);
            if (frameLayout2 == null || frameLayout2.getChildCount() != 0) {
                FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d65);
                if (frameLayout3 == null || frameLayout3.getChildCount() != 0) {
                    return -1;
                }
                ((FrameLayout) viewGroup.findViewById(R.id.d65)).addView(view, o());
                return 3;
            }
            ((FrameLayout) viewGroup.findViewById(R.id.d64)).addView(view, o());
            return 2;
        }
        ((FrameLayout) viewGroup.findViewById(R.id.d63)).addView(view, o());
        return 1;
    }
}

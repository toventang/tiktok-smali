package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    static boolean f131741a = true;

    static {
        Covode.recordClassIndex(86283);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.m<View, Boolean, z> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(86286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(2);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(View view, Boolean bool) {
            bool.booleanValue();
            a(view);
            return z.f158842a;
        }

        public final void a(View view) {
            l.d(view, "");
            View findViewById = view.findViewById(R.id.bmu);
            l.b(findViewById, "");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = dh.c(this.$context) + this.$context.getResources().getDimensionPixelSize(R.dimen.rk);
            findViewById.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void a(ViewGroup viewGroup) {
        MethodCollector.i(10730);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
        f131741a = false;
        MethodCollector.o(10730);
    }

    static final class e extends m implements h.f.a.b<View, z> {
        final /* synthetic */ c $modifyTopUI$1;

        static {
            Covode.recordClassIndex(86288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(1);
            this.$modifyTopUI$1 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            a(view);
            return z.f158842a;
        }

        public final void a(View view) {
            l.d(view, "");
            switch (com.ss.android.ugc.aweme.adaptation.a.f66177a.a()) {
                case 1:
                case 4:
                    this.$modifyTopUI$1.a(view);
                    d.a(view, true);
                    return;
                case 2:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.$modifyTopUI$1.a(view);
                    d.a(view, true);
                    return;
                case 3:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.$modifyTopUI$1.a(view);
                    d.a(view, false);
                    return;
                default:
                    this.$modifyTopUI$1.a(view);
                    d.a(view, false);
                    return;
            }
        }
    }

    static final class a extends m implements h.f.a.m<View, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131742a = new a();

        static {
            Covode.recordClassIndex(86284);
        }

        a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(View view, Integer num) {
            a(view, num.intValue());
            return z.f158842a;
        }

        public static void a(View view, int i2) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i2;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.m<View, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f131746a = new d();

        static {
            Covode.recordClassIndex(86287);
        }

        d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(View view, Boolean bool) {
            a(view, bool.booleanValue());
            return z.f158842a;
        }

        public static void a(View view, boolean z) {
            l.d(view, "");
            if (z) {
                View findViewById = view.findViewById(R.id.dow);
                l.b(findViewById, "");
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin + en.a(33.0d, i.f115645a));
                findViewById.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f$f  reason: collision with other inner class name */
    static final class C3422f implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131747a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f131748b;

        static {
            Covode.recordClassIndex(86289);
        }

        C3422f(e eVar, ViewGroup viewGroup) {
            this.f131747a = eVar;
            this.f131748b = viewGroup;
        }

        @Override // androidx.b.a.a.d
        public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
            MethodCollector.i(11307);
            l.d(view, "");
            this.f131747a.a(view);
            if (f.f131741a) {
                this.f131748b.addView(view);
            }
            MethodCollector.o(11307);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f131743a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f131744b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f131745c;

        static {
            Covode.recordClassIndex(86285);
        }

        b(Context context, boolean z, ViewGroup viewGroup) {
            this.f131743a = context;
            this.f131744b = z;
            this.f131745c = viewGroup;
        }

        @Override // androidx.b.a.a.d
        public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
            int i3;
            MethodCollector.i(11480);
            l.d(view, "");
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.dol);
            int c2 = dh.c(this.f131743a);
            ProgressSegmentView progressSegmentView = (ProgressSegmentView) view.findViewById(R.id.dc_);
            l.b(progressSegmentView, "");
            if (this.f131744b) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            progressSegmentView.setVisibility(i3);
            a.a(progressSegmentView, this.f131743a.getResources().getDimensionPixelSize(R.dimen.rl) + c2);
            a.a(relativeLayout, this.f131743a.getResources().getDimensionPixelSize(R.dimen.rk) + c2);
            a.a(view.findViewById(R.id.bmu), c2 + this.f131743a.getResources().getDimensionPixelSize(R.dimen.rk));
            RecordLayout recordLayout = (RecordLayout) view.findViewById(R.id.dhn);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.a8q);
            view.findViewById(R.id.a8o);
            view.findViewById(R.id.a8p);
            l.b(recordLayout, "");
            ViewGroup.LayoutParams layoutParams = recordLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                l.b(frameLayout, "");
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    int a2 = com.ss.android.ugc.aweme.adaptation.a.f66177a.a();
                    if (a2 == 1 || a2 == 2 || a2 == 4 || a2 == 5) {
                        layoutParams2.bottomMargin = en.a(33.0d, i.f115645a) + en.a(40.0d, i.f115645a);
                        layoutParams4.bottomMargin = en.a(33.0d, i.f115645a) + en.a(40.0d, i.f115645a);
                    } else {
                        layoutParams2.bottomMargin = en.a(40.0d, i.f115645a);
                        layoutParams4.bottomMargin = en.a(40.0d, i.f115645a);
                    }
                    recordLayout.setLayoutParams(layoutParams2);
                    frameLayout.setLayoutParams(layoutParams4);
                    frameLayout.bringToFront();
                    if (f.f131741a) {
                        this.f131745c.addView(view);
                    }
                    MethodCollector.o(11480);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                MethodCollector.o(11480);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            MethodCollector.o(11480);
            throw nullPointerException2;
        }
    }

    public static final void a(Context context, ViewGroup viewGroup, boolean z, boolean z2) {
        l.d(context, "");
        l.d(viewGroup, "");
        if (z) {
            androidx.b.a.a aVar = new androidx.b.a.a(context);
            f131741a = true;
            aVar.a(R.layout.f3, viewGroup, new b(context, z2, viewGroup));
        }
    }
}

package com.ss.android.ugc.aweme.ttep.ttepcomponent.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.duet.x;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.widgetcompat.AnimationImageView;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.List;
import java.util.Objects;

public final class a extends com.bytedance.scene.j implements com.ss.android.ugc.gamora.recorder.k.b {

    /* renamed from: i  reason: collision with root package name */
    public static final C3748a f141356i = new C3748a((byte) 0);
    private final com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> A;
    private final com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> B;
    private final com.bytedance.als.h<Integer> C;
    private final com.bytedance.als.h<RetakeVideoContext> D;
    private final com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> E;
    private final com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> F;
    private final com.bytedance.als.h<Boolean> G;
    private final com.bytedance.als.h<Boolean> H;
    private final com.bytedance.als.h<Boolean> I;
    private final com.bytedance.als.h<ScaleGestureDetector> J;
    private final com.bytedance.als.h<VideoRecordGestureLayout.a> K;

    /* renamed from: a  reason: collision with root package name */
    public ProgressSegmentView f141357a;

    /* renamed from: b  reason: collision with root package name */
    public View f141358b;

    /* renamed from: c  reason: collision with root package name */
    public RecordLayout f141359c;

    /* renamed from: d  reason: collision with root package name */
    public int f141360d = en.a(40.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: e  reason: collision with root package name */
    Dialog f141361e;

    /* renamed from: f  reason: collision with root package name */
    public FrameLayout f141362f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.b.a.m f141363g;

    /* renamed from: h  reason: collision with root package name */
    public final ShortVideoContext f141364h;

    /* renamed from: j  reason: collision with root package name */
    private c f141365j;

    /* renamed from: k  reason: collision with root package name */
    private View f141366k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView f141367l;
    private AnimationImageView t;
    private FrameLayout u;
    private ImageView v;
    private final h.h w = h.i.a((h.f.a.a) new w(this));
    private final com.bytedance.creativex.recorder.b.a.d x;
    private final com.bytedance.als.h<Long> y;
    private final com.bytedance.als.h<Boolean> z;

    static {
        Covode.recordClassIndex(92326);
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final String a() {
        return "TTEPRecordControlProgressScene";
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void a(boolean z2) {
    }

    public final String d() {
        return (String) this.w.getValue();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void f(int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$a  reason: collision with other inner class name */
    public static final class C3748a {
        static {
            Covode.recordClassIndex(92327);
        }

        private C3748a() {
        }

        public /* synthetic */ C3748a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final /* bridge */ /* synthetic */ com.bytedance.scene.j b() {
        return this;
    }

    static final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141387a;

        static {
            Covode.recordClassIndex(92348);
        }

        v(a aVar) {
            this.f141387a = aVar;
        }

        public final void run() {
            a.c(this.f141387a).setVisibility(0);
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String c_ = this.this$0.c_(R.string.q);
            h.f.b.l.b(c_, "");
            return c_;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void C() {
        RecordLayout recordLayout = this.f141359c;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.a(1);
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void D() {
        RecordLayout recordLayout = this.f141359c;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.c();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void F() {
        RecordLayout recordLayout = this.f141359c;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.b();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void G() {
        RecordLayout recordLayout = this.f141359c;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.y = true;
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        RecordLayout recordLayout = this.f141359c;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.d();
    }

    static final class n extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.scene.ktx.c.a(this.this$0)).a(this.this$0.d()).a();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void E() {
        if (this.f141362f != null) {
            FrameLayout frameLayout = this.f141362f;
            if (frameLayout == null) {
                h.f.b.l.a("colorSchemeLayout");
            }
            frameLayout.post(new v(this));
        }
    }

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
        Dialog dialog = this.f141361e;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.f141361e;
            if (dialog2 == null) {
                h.f.b.l.b();
            }
            dialog2.dismiss();
        }
    }

    public static final class t extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141385a;

        static {
            Covode.recordClassIndex(92346);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(a aVar) {
            this.f141385a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.scene.ktx.c.a(this.f141385a)).a(this.f141385a.d()).a();
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141371a;

        static {
            Covode.recordClassIndex(92331);
        }

        e(a aVar) {
            this.f141371a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            a.d(this.f141371a).setVisibility(8);
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141376a;

        static {
            Covode.recordClassIndex(92336);
        }

        j(a aVar) {
            this.f141376a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            RetakeVideoContext retakeVideoContext = (RetakeVideoContext) obj;
            if (retakeVideoContext != null) {
                a.d(this.f141376a).a(retakeVideoContext);
            }
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141380a;

        static {
            Covode.recordClassIndex(92341);
        }

        o(a aVar) {
            this.f141380a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.bytedance.creativex.recorder.b.a.m mVar = this.f141380a.f141363g;
            if (mVar != null) {
                mVar.v();
            }
        }
    }

    static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141382a;

        static {
            Covode.recordClassIndex(92343);
        }

        q(a aVar) {
            this.f141382a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) obj;
            if (scaleGestureDetector != null) {
                a.a(this.f141382a).setScaleGestureDetector(scaleGestureDetector);
            }
        }
    }

    static final class r<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141383a;

        static {
            Covode.recordClassIndex(92344);
        }

        r(a aVar) {
            this.f141383a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            VideoRecordGestureLayout.a aVar = (VideoRecordGestureLayout.a) obj;
            if (aVar != null) {
                a.a(this.f141383a).setOnGestureListener(aVar);
            }
        }
    }

    public static final /* synthetic */ RecordLayout a(a aVar) {
        RecordLayout recordLayout = aVar.f141359c;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        return recordLayout;
    }

    public static final /* synthetic */ View b(a aVar) {
        View view = aVar.f141358b;
        if (view == null) {
            h.f.b.l.a("nextGroupContainer");
        }
        return view;
    }

    public static final /* synthetic */ FrameLayout c(a aVar) {
        FrameLayout frameLayout = aVar.f141362f;
        if (frameLayout == null) {
            h.f.b.l.a("colorSchemeLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ ProgressSegmentView d(a aVar) {
        ProgressSegmentView progressSegmentView = aVar.f141357a;
        if (progressSegmentView == null) {
            h.f.b.l.a("progressSegmentView");
        }
        return progressSegmentView;
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void e(int i2) {
        View view = this.f141366k;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setVisibility(i2);
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141372a;

        static {
            Covode.recordClassIndex(92332);
        }

        f(a aVar) {
            this.f141372a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                a.d(this.f141372a).a((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
            }
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141374a;

        static {
            Covode.recordClassIndex(92334);
        }

        h(a aVar) {
            this.f141374a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            ProgressSegmentView d2 = a.d(this.f141374a);
            h.f.b.l.b(l2, "");
            d2.setMaxDuration(l2.longValue());
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141375a;

        static {
            Covode.recordClassIndex(92335);
        }

        i(a aVar) {
            this.f141375a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ProgressSegmentView d2 = a.d(this.f141375a);
            h.f.b.l.b(bool, "");
            d2.setNeedDrawAnchor(bool.booleanValue());
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141377a;

        static {
            Covode.recordClassIndex(92337);
        }

        k(a aVar) {
            this.f141377a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                a.d(this.f141377a).b((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
            }
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141378a;

        static {
            Covode.recordClassIndex(92338);
        }

        l(a aVar) {
            this.f141378a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.u uVar = (h.u) obj;
            if (uVar != null) {
                a.d(this.f141378a);
                uVar.getFirst();
                ((Number) uVar.getSecond()).longValue();
                uVar.getThird();
                ProgressSegmentView.b();
            }
        }
    }

    static final class u<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141386a;

        static {
            Covode.recordClassIndex(92347);
        }

        u(a aVar) {
            this.f141386a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f141386a.f141364h.f124757b.b() && x.a()) {
                a.a(this.f141386a).setCanTouch(bool);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void a(float f2) {
        View view = this.f141366k;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setAlpha(f2);
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void b(boolean z2) {
        ImageView imageView = this.f141367l;
        if (imageView == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView.setSelected(z2);
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141370a;

        static {
            Covode.recordClassIndex(92330);
        }

        d(a aVar) {
            this.f141370a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = a.d(this.f141370a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f141370a.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            marginLayoutParams.topMargin = dh.c(activity) + this.f141370a.t().getResources().getDimensionPixelSize(R.dimen.rl);
            a.d(this.f141370a).setLayoutParams(marginLayoutParams);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141373a;

        static {
            Covode.recordClassIndex(92333);
        }

        g(a aVar) {
            this.f141373a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.u uVar = (h.u) obj;
            if (uVar != null) {
                a.d(this.f141373a).a((List) uVar.getFirst(), ((Number) uVar.getSecond()).longValue(), (TimeSpeedModelExtension) uVar.getThird());
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141379a;

        static {
            Covode.recordClassIndex(92339);
        }

        m(a aVar) {
            this.f141379a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 2) {
                a.d(this.f141379a).a();
                return;
            }
            ProgressSegmentView d2 = a.d(this.f141379a);
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            d2.a(z);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void d(int i2) {
        ImageView imageView = this.f141367l;
        if (imageView == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView.setVisibility(i2);
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141381a;

        static {
            Covode.recordClassIndex(92342);
        }

        p(a aVar) {
            this.f141381a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = en.a(33.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + this.f141381a.f141360d;
            } else {
                i2 = this.f141381a.f141360d;
            }
            ViewGroup.LayoutParams layoutParams = a.a(this.f141381a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2;
            a.a(this.f141381a).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = a.b(this.f141381a).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i2;
            a.b(this.f141381a).setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = a.c(this.f141381a).getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = i2;
            a.c(this.f141381a).setLayoutParams(layoutParams6);
        }
    }

    static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141384a;

        static {
            Covode.recordClassIndex(92345);
        }

        s(a aVar) {
            this.f141384a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f141384a;
            h.f.b.l.b(view, "");
            if (aVar.f141361e != null) {
                Dialog dialog = aVar.f141361e;
                if (dialog == null) {
                    h.f.b.l.b();
                }
                if (dialog.isShowing()) {
                    return;
                }
            }
            a.C0731a aVar2 = new a.C0731a(aVar.f42913m);
            aVar2.f33402b = aVar.t().getResources().getString(R.string.b7x);
            aVar2.a(aVar.t().getResources().getString(R.string.b7y), (DialogInterface.OnClickListener) new b(aVar), false).b(aVar.t().getResources().getString(R.string.b7z), (DialogInterface.OnClickListener) new c(aVar), false);
            aVar.f141361e = aVar2.a().b();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void a(Animation animation) {
        h.f.b.l.d(animation, "");
        RecordLayout recordLayout = this.f141359c;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        com.bytedance.common.utility.n.a(recordLayout);
        RecordLayout recordLayout2 = this.f141359c;
        if (recordLayout2 == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout2.startAnimation(animation);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.dc_);
        h.f.b.l.b(c2, "");
        this.f141357a = (ProgressSegmentView) c2;
        com.bytedance.als.h<Boolean> hVar = this.H;
        if (hVar != null) {
            hVar.a(this, new d(this));
        }
        this.A.a(this, new f(this));
        this.B.a(this, new g(this));
        this.y.a(this, new h(this));
        this.z.a(this, new i(this));
        this.D.a(this, new j(this));
        this.E.a(this, new k(this));
        this.F.a(this, new l(this));
        this.C.a(this, new m(this));
        this.G.a(this, new e(this));
        View c3 = c(R.id.dhn);
        h.f.b.l.b(c3, "");
        RecordLayout recordLayout = (RecordLayout) c3;
        this.f141359c = recordLayout;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.setEnabled(false);
        View c4 = c(R.id.a8q);
        h.f.b.l.b(c4, "");
        this.f141362f = (FrameLayout) c4;
        View c5 = c(R.id.a8r);
        h.f.b.l.b(c5, "");
        this.t = (AnimationImageView) c5;
        View c6 = c(R.id.a8o);
        h.f.b.l.b(c6, "");
        this.u = (FrameLayout) c6;
        View c7 = c(R.id.a8p);
        h.f.b.l.b(c7, "");
        this.v = (ImageView) c7;
        if (this.f141364h.aN) {
            RecordLayout recordLayout2 = this.f141359c;
            if (recordLayout2 == null) {
                h.f.b.l.a("recordLayout");
            }
            recordLayout2.a();
        }
        FrameLayout frameLayout = this.f141362f;
        if (frameLayout == null) {
            h.f.b.l.a("colorSchemeLayout");
        }
        frameLayout.bringToFront();
        View c8 = c(R.id.cv2);
        h.f.b.l.b(c8, "");
        this.f141358b = c8;
        RecordLayout recordLayout3 = this.f141359c;
        if (recordLayout3 == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout3.setActivity(this.f42913m);
        androidx.fragment.app.e a2 = com.bytedance.scene.ktx.c.a(this);
        com.bytedance.creativex.recorder.b.a.d dVar = this.x;
        com.bytedance.creativex.recorder.b.a.m mVar = this.f141363g;
        RecordLayout recordLayout4 = this.f141359c;
        if (recordLayout4 == null) {
            h.f.b.l.a("recordLayout");
        }
        this.f141365j = new c(a2, dVar, mVar, recordLayout4, new n(this), new o(this));
        com.bytedance.als.h<Boolean> hVar2 = this.I;
        if (hVar2 != null) {
            hVar2.a(this, new p(this));
        }
        com.bytedance.als.h<ScaleGestureDetector> hVar3 = this.J;
        if (hVar3 != null) {
            hVar3.a(this, new q(this));
        }
        com.bytedance.als.h<VideoRecordGestureLayout.a> hVar4 = this.K;
        if (hVar4 != null) {
            hVar4.a(this, new r(this));
        }
        View c9 = c(R.id.bw8);
        h.f.b.l.b(c9, "");
        this.f141366k = c9;
        View c10 = c(R.id.z8);
        h.f.b.l.b(c10, "");
        this.f141367l = (ImageView) c10;
        View view = this.f141366k;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setOnClickListener(new s(this));
        ImageView imageView = this.f141367l;
        if (imageView == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView.setOnClickListener(new t(this));
        this.x.w().a(this, new u(this));
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141369a;

        static {
            Covode.recordClassIndex(92329);
        }

        c(a aVar) {
            this.f141369a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            androidx.lifecycle.i lifecycle = this.f141369a.getLifecycle();
            h.f.b.l.b(lifecycle, "");
            lifecycle.a();
            i.b bVar = i.b.DESTROYED;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.au8, viewGroup, false);
        View findViewById = a2.findViewById(R.id.dc_);
        h.f.b.l.b(findViewById, "");
        ((ProgressSegmentView) findViewById).setVisibility(8);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141368a;

        static {
            Covode.recordClassIndex(92328);
        }

        b(a aVar) {
            this.f141368a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            androidx.lifecycle.i lifecycle = this.f141368a.getLifecycle();
            h.f.b.l.b(lifecycle, "");
            if (lifecycle.a() != i.b.DESTROYED) {
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f141368a.f141364h.q).a("shoot_way", this.f141368a.f141364h.r);
                if (this.f141368a.f141364h.C != 0) {
                    a2.a("draft_id", this.f141368a.f141364h.C);
                }
                String str = this.f141368a.f141364h.D;
                h.f.b.l.b(str, "");
                if (str.length() > 0) {
                    a2.a("new_draft_id", this.f141368a.f141364h.D);
                }
                if (this.f141368a.f141364h.f124757b.f124714i) {
                    a2.a("action_type", "reshoot");
                }
                com.ss.android.ugc.aweme.common.r.a("delete_clip", a2.f149193a);
                com.bytedance.creativex.recorder.b.a.m mVar = this.f141368a.f141363g;
                if (mVar != null) {
                    mVar.c((com.bytedance.creativex.recorder.b.a.m) new com.bytedance.creativex.recorder.b.a.x("delete last fragment"));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void a(int i2, boolean z2) {
        RecordLayout recordLayout = this.f141359c;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.a(i2, z2);
    }

    public a(com.bytedance.creativex.recorder.b.a.d dVar, com.bytedance.creativex.recorder.b.a.m mVar, ShortVideoContext shortVideoContext, com.bytedance.als.h<Long> hVar, com.bytedance.als.h<Boolean> hVar2, com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> hVar3, com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar4, com.bytedance.als.h<Integer> hVar5, com.bytedance.als.h<RetakeVideoContext> hVar6, com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> hVar7, com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar8, com.bytedance.als.h<Boolean> hVar9, com.bytedance.als.h<Boolean> hVar10, com.bytedance.als.h<Boolean> hVar11, com.bytedance.als.h<ScaleGestureDetector> hVar12, com.bytedance.als.h<VideoRecordGestureLayout.a> hVar13) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(shortVideoContext, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(hVar2, "");
        h.f.b.l.d(hVar3, "");
        h.f.b.l.d(hVar4, "");
        h.f.b.l.d(hVar5, "");
        h.f.b.l.d(hVar6, "");
        h.f.b.l.d(hVar7, "");
        h.f.b.l.d(hVar8, "");
        h.f.b.l.d(hVar9, "");
        this.x = dVar;
        this.f141363g = mVar;
        this.f141364h = shortVideoContext;
        this.y = hVar;
        this.z = hVar2;
        this.A = hVar3;
        this.B = hVar4;
        this.C = hVar5;
        this.D = hVar6;
        this.E = hVar7;
        this.F = hVar8;
        this.G = hVar9;
        this.H = hVar10;
        this.I = hVar11;
        this.J = hVar12;
        this.K = hVar13;
    }
}

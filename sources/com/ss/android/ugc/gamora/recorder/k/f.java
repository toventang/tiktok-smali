package com.ss.android.ugc.gamora.recorder.k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.av;
import com.ss.android.ugc.aweme.shortvideo.bk;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.widget.CircleProgressSegmentView;
import com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout;
import com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.ss.android.ugc.aweme.widgetcompat.AnimationImageView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class f extends com.bytedance.scene.j {
    public static final a z = new a((byte) 0);
    private bk A;
    private AnimationImageView B;
    private FrameLayout C;
    private ImageView D;
    private final com.ss.android.ugc.gamora.recorder.h.c E = new com.ss.android.ugc.gamora.recorder.h.c();
    private final com.bytedance.creativex.recorder.b.a.d F;
    private final com.bytedance.als.h<Long> G;
    private final com.bytedance.als.h<Boolean> H;
    private final com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> I;
    private final com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> J;
    private final com.bytedance.als.h<Integer> K;
    private final com.bytedance.als.h<RetakeVideoContext> L;
    private final com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> M;
    private final com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> N;
    private final com.bytedance.als.h<Boolean> O;
    private final com.bytedance.als.h<Boolean> P;
    private final com.bytedance.als.h<ScaleGestureDetector> Q;
    private final com.bytedance.als.h<VideoRecordGestureLayout.a> R;
    private final com.bytedance.als.h<Long> S;
    private final com.bytedance.als.d<Integer> T;

    /* renamed from: a  reason: collision with root package name */
    public ProgressSegmentView f147889a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f147890b;

    /* renamed from: c  reason: collision with root package name */
    public View f147891c;

    /* renamed from: d  reason: collision with root package name */
    public LighteningRecordLayout f147892d;

    /* renamed from: e  reason: collision with root package name */
    View f147893e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f147894f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f147895g;

    /* renamed from: h  reason: collision with root package name */
    public int f147896h = en.a(40.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: i  reason: collision with root package name */
    final int f147897i = en.a(80.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: j  reason: collision with root package name */
    final int f147898j = en.a(36.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: k  reason: collision with root package name */
    final int f147899k = en.a(28.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: l  reason: collision with root package name */
    Dialog f147900l;
    public FrameLayout t;
    public boolean u = true;
    public final com.bytedance.creativex.recorder.b.a.m v;
    public final ShortVideoContext w;
    final com.bytedance.als.h<Boolean> x;
    public final com.bytedance.als.k<Boolean> y;

    static {
        Covode.recordClassIndex(97497);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97498);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147925a;

        static {
            Covode.recordClassIndex(97523);
        }

        z(f fVar) {
            this.f147925a = fVar;
        }

        public final void run() {
            f.c(this.f147925a).setVisibility(0);
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        LighteningRecordLayout lighteningRecordLayout = this.f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout.e();
    }

    public static final class y implements bk.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147924a;

        static {
            Covode.recordClassIndex(97522);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.bk.a
        public final void a() {
            f.e(this.f147924a).setVisibility(8);
            f.d(this.f147924a).setVisibility(8);
            this.f147924a.u = false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.bk.a
        public final void b() {
            ImageView imageView = this.f147924a.f147895g;
            if (imageView == null) {
                h.f.b.l.a("recordButtonIcon");
            }
            imageView.setVisibility(8);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        y(f fVar) {
            this.f147924a = fVar;
        }
    }

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
        Dialog dialog = this.f147900l;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.f147900l;
            if (dialog2 == null) {
                h.f.b.l.b();
            }
            dialog2.dismiss();
        }
    }

    public final void a() {
        LighteningRecordLayout lighteningRecordLayout = this.f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout.f();
    }

    public static final class q implements LighteningRecordLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147916a;

        static {
            Covode.recordClassIndex(97514);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(f fVar) {
            this.f147916a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.b
        public final void a(float f2) {
            ProgressSegmentView e2 = f.e(this.f147916a);
            if (!(e2 instanceof CircleProgressSegmentView)) {
                e2 = null;
            }
            CircleProgressSegmentView circleProgressSegmentView = (CircleProgressSegmentView) e2;
            if (circleProgressSegmentView != null) {
                circleProgressSegmentView.setCircleRadius(f2);
            }
        }
    }

    public static final class v extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147921a;

        static {
            Covode.recordClassIndex(97519);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        v(f fVar) {
            this.f147921a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            f fVar = this.f147921a;
            if (!fVar.w.f124757b.f124714i || fVar.w.f124757b.h() >= fVar.w.f124757b.k()) {
                if (fVar.w.f124757b.f124714i) {
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.b(fVar.w.f124757b.d().size());
                }
                fVar.v.a().a();
                fVar.v.a("click go next");
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("scene", "go_edit").a("shoot_way", fVar.w.r).a("creation_id", fVar.w.q).a("enter_from", fVar.w.x);
                ar arVar = ar.f132216a;
                h.f.b.l.b(arVar, "");
                com.ss.android.ugc.tools.f.b a3 = a2.a("dalvikPss", arVar.f132218c);
                ar arVar2 = ar.f132216a;
                h.f.b.l.b(arVar2, "");
                com.ss.android.ugc.tools.f.b a4 = a3.a("nativePss", arVar2.f132219d);
                ar arVar3 = ar.f132216a;
                h.f.b.l.b(arVar3, "");
                com.ss.android.ugc.tools.f.b a5 = a4.a("otherPss", arVar3.f132221f);
                ar arVar4 = ar.f132216a;
                h.f.b.l.b(arVar4, "");
                com.ss.android.ugc.aweme.common.r.a("av_memory_log", a5.a("totalPss", arVar4.f132220e).f149193a);
                com.ss.android.ugc.aweme.ah.c.a();
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(fVar.f42913m).a(R.string.bk0).a();
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147911a;

        static {
            Covode.recordClassIndex(97509);
        }

        l(f fVar) {
            this.f147911a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            RetakeVideoContext retakeVideoContext = (RetakeVideoContext) obj;
            if (retakeVideoContext != null) {
                f.e(this.f147911a).a(retakeVideoContext);
            }
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147915a;

        static {
            Covode.recordClassIndex(97513);
        }

        p(f fVar) {
            this.f147915a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147915a.v.v();
        }
    }

    static final class s<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147918a;

        static {
            Covode.recordClassIndex(97516);
        }

        s(f fVar) {
            this.f147918a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) obj;
            if (scaleGestureDetector != null) {
                f.a(this.f147918a).setScaleGestureDetector(scaleGestureDetector);
            }
        }
    }

    static final class t<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147919a;

        static {
            Covode.recordClassIndex(97517);
        }

        t(f fVar) {
            this.f147919a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            VideoRecordGestureLayout.a aVar = (VideoRecordGestureLayout.a) obj;
            if (aVar != null) {
                f.a(this.f147919a).setOnGestureListener(aVar);
            }
        }
    }

    public static final /* synthetic */ LighteningRecordLayout a(f fVar) {
        LighteningRecordLayout lighteningRecordLayout = fVar.f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        return lighteningRecordLayout;
    }

    public static final /* synthetic */ View b(f fVar) {
        View view = fVar.f147891c;
        if (view == null) {
            h.f.b.l.a("nextGroupContainer");
        }
        return view;
    }

    public static final /* synthetic */ FrameLayout c(f fVar) {
        FrameLayout frameLayout = fVar.t;
        if (frameLayout == null) {
            h.f.b.l.a("colorSchemeLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ TextView d(f fVar) {
        TextView textView = fVar.f147890b;
        if (textView == null) {
            h.f.b.l.a("progressTextView");
        }
        return textView;
    }

    public static final /* synthetic */ ProgressSegmentView e(f fVar) {
        ProgressSegmentView progressSegmentView = fVar.f147889a;
        if (progressSegmentView == null) {
            h.f.b.l.a("progressSegmentView");
        }
        return progressSegmentView;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$f  reason: collision with other inner class name */
    static final class C3985f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147905a;

        static {
            Covode.recordClassIndex(97503);
        }

        C3985f(f fVar) {
            this.f147905a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            f fVar = this.f147905a;
            h.f.b.l.b(l2, "");
            fVar.a(l2.longValue());
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147909a;

        static {
            Covode.recordClassIndex(97507);
        }

        j(f fVar) {
            this.f147909a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            ProgressSegmentView e2 = f.e(this.f147909a);
            h.f.b.l.b(l2, "");
            e2.setMaxDuration(l2.longValue());
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147910a;

        static {
            Covode.recordClassIndex(97508);
        }

        k(f fVar) {
            this.f147910a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e2 = f.e(this.f147910a);
            h.f.b.l.b(bool, "");
            e2.setNeedDrawAnchor(bool.booleanValue());
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147913a;

        static {
            Covode.recordClassIndex(97511);
        }

        n(f fVar) {
            this.f147913a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.u uVar = (h.u) obj;
            if (uVar != null) {
                f.e(this.f147913a);
                uVar.getFirst();
                ((Number) uVar.getSecond()).longValue();
                uVar.getThird();
                ProgressSegmentView.b();
            }
        }
    }

    static final class w<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147922a;

        static {
            Covode.recordClassIndex(97520);
        }

        w(f fVar) {
            this.f147922a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f147922a.w.f124757b.b() && com.ss.android.ugc.aweme.shortvideo.duet.x.a()) {
                f.a(this.f147922a).setCanTouch(bool);
            }
        }
    }

    static final class x<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147923a;

        static {
            Covode.recordClassIndex(97521);
        }

        x(f fVar) {
            this.f147923a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            f.d(this.f147923a).setTranslationY((float) ((Integer) obj).intValue());
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147903a;

        static {
            Covode.recordClassIndex(97501);
        }

        d(f fVar) {
            this.f147903a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = f.e(this.f147903a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f147903a.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            marginLayoutParams.topMargin = dh.c(activity) + this.f147903a.t().getResources().getDimensionPixelSize(R.dimen.rl);
            f.e(this.f147903a).setLayoutParams(marginLayoutParams);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147906a;

        static {
            Covode.recordClassIndex(97504);
        }

        g(f fVar) {
            this.f147906a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            f.a(this.f147906a).setVisibility(0);
            f.a(this.f147906a).d();
            f.a(this.f147906a).setEnabled(true);
            f.e(this.f147906a).setVisibility(0);
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147907a;

        static {
            Covode.recordClassIndex(97505);
        }

        h(f fVar) {
            this.f147907a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                f.e(this.f147907a).a((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                f.a(this.f147907a).setRecordingTime(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147908a;

        static {
            Covode.recordClassIndex(97506);
        }

        i(f fVar) {
            this.f147908a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.u uVar = (h.u) obj;
            if (uVar != null) {
                f.e(this.f147908a).a((List) uVar.getFirst(), ((Number) uVar.getSecond()).longValue(), (TimeSpeedModelExtension) uVar.getThird());
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147912a;

        static {
            Covode.recordClassIndex(97510);
        }

        m(f fVar) {
            this.f147912a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                f.e(this.f147912a).b((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                f.a(this.f147912a).setRecordingTime(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147914a;

        static {
            Covode.recordClassIndex(97512);
        }

        o(f fVar) {
            this.f147914a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 2) {
                f.e(this.f147914a).a();
                return;
            }
            ProgressSegmentView e2 = f.e(this.f147914a);
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            e2.a(z);
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147904a;

        static {
            Covode.recordClassIndex(97502);
        }

        e(f fVar) {
            this.f147904a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            TimeSpeedModelExtension timeSpeedModelExtension;
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e2 = f.e(this.f147904a);
            h.f.b.l.b(bool, "");
            int i3 = 0;
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            e2.setVisibility(i2);
            if (bool.booleanValue()) {
                if (this.f147904a.w.c() && (timeSpeedModelExtension = this.f147904a.w.F.f124774b) != null) {
                    i3 = timeSpeedModelExtension.getDuration();
                }
                f fVar = this.f147904a;
                fVar.a(fVar.w.f124757b.h() + ((long) i3));
                return;
            }
            f.d(this.f147904a).setVisibility(8);
            if (!h.f.b.l.a((Object) this.f147904a.y.a(), (Object) false)) {
                this.f147904a.y.a((Boolean) false);
            }
        }
    }

    public final void a(float f2) {
        View view = this.f147893e;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setAlpha(f2);
    }

    static final class u implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147920a;

        static {
            Covode.recordClassIndex(97518);
        }

        u(f fVar) {
            this.f147920a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f fVar = this.f147920a;
            h.f.b.l.b(view, "");
            if (fVar.w.b()) {
                Context context = view.getContext();
                h.f.b.l.b(context, "");
                if (com.ss.android.ugc.aweme.scene.a.a(context) != null) {
                    Context context2 = view.getContext();
                    h.f.b.l.b(context2, "");
                    Activity a2 = com.ss.android.ugc.aweme.scene.a.a(context2);
                    if (a2 == null) {
                        h.f.b.l.b();
                    }
                    ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(a2).b(view).a(com.bytedance.tux.tooltip.h.TOP)).e(R.string.fvl).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).d().a();
                    return;
                }
                return;
            }
            if (fVar.f147900l != null) {
                Dialog dialog = fVar.f147900l;
                if (dialog == null) {
                    h.f.b.l.b();
                }
                if (dialog.isShowing()) {
                    return;
                }
            }
            a.C0731a aVar = new a.C0731a(fVar.f42913m);
            aVar.f33402b = fVar.t().getResources().getString(R.string.b7x);
            aVar.a(fVar.t().getResources().getString(R.string.b7y), (DialogInterface.OnClickListener) new b(fVar), false).b(fVar.t().getResources().getString(R.string.b7z), (DialogInterface.OnClickListener) new c(fVar), false);
            fVar.f147900l = aVar.a().b();
        }
    }

    public final void a(long j2) {
        if (j2 <= 0) {
            TextView textView = this.f147890b;
            if (textView == null) {
                h.f.b.l.a("progressTextView");
            }
            textView.setVisibility(8);
            if (!h.f.b.l.a((Object) this.y.a(), (Object) false)) {
                this.y.a((Boolean) false);
            }
            LighteningRecordLayout lighteningRecordLayout = this.f147892d;
            if (lighteningRecordLayout == null) {
                h.f.b.l.a("recordLayout");
            }
            lighteningRecordLayout.setShouldDrawBorder(true);
            return;
        }
        int i2 = (int) (j2 / 1000);
        int i3 = i2 % 60;
        int i4 = (i2 - i3) / 60;
        if (this.u) {
            TextView textView2 = this.f147890b;
            if (textView2 == null) {
                h.f.b.l.a("progressTextView");
            }
            textView2.setVisibility(0);
            if (!h.f.b.l.a((Object) this.y.a(), (Object) true)) {
                this.y.a((Boolean) true);
            }
        }
        TextView textView3 = this.f147890b;
        if (textView3 == null) {
            h.f.b.l.a("progressTextView");
        }
        StringBuilder sb = new StringBuilder();
        String a2 = com.a.a("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
        h.f.b.l.b(a2, "");
        StringBuilder append = sb.append(a2).append(":");
        String a3 = com.a.a("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
        h.f.b.l.b(a3, "");
        textView3.setText(append.append(a3).toString());
        LighteningRecordLayout lighteningRecordLayout2 = this.f147892d;
        if (lighteningRecordLayout2 == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout2.setShouldDrawBorder(false);
    }

    static final class r<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147917a;

        static {
            Covode.recordClassIndex(97515);
        }

        r(f fVar) {
            this.f147917a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            T t;
            int a2;
            int i3;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = en.a(33.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + this.f147917a.f147896h;
            } else {
                i2 = this.f147917a.f147896h;
            }
            ViewGroup.LayoutParams layoutParams = f.a(this.f147917a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2;
            f.a(this.f147917a).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = f.b(this.f147917a).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i2;
            f.b(this.f147917a).setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = f.c(this.f147917a).getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = i2;
            f.c(this.f147917a).setLayoutParams(layoutParams6);
            f fVar = this.f147917a;
            com.bytedance.als.h<Boolean> hVar = fVar.x;
            if (hVar != null) {
                t = hVar.f6468a.getValue();
            } else {
                t = null;
            }
            if (h.f.b.l.a((Object) t, (Object) true)) {
                a2 = en.a(33.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + en.a(10.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                i3 = fVar.f147896h;
            } else {
                a2 = en.a(10.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                i3 = fVar.f147896h;
            }
            int i4 = a2 + i3;
            ProgressSegmentView progressSegmentView = fVar.f147889a;
            if (progressSegmentView == null) {
                h.f.b.l.a("progressSegmentView");
            }
            ViewGroup.LayoutParams layoutParams7 = progressSegmentView.getLayoutParams();
            Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
            if (!(i4 == layoutParams8.bottomMargin && layoutParams8.leftMargin == 0)) {
                layoutParams8.bottomMargin = i4;
                layoutParams8.leftMargin = 0;
                ProgressSegmentView progressSegmentView2 = fVar.f147889a;
                if (progressSegmentView2 == null) {
                    h.f.b.l.a("progressSegmentView");
                }
                progressSegmentView2.setLayoutParams(layoutParams8);
            }
            TextView textView = fVar.f147890b;
            if (textView == null) {
                h.f.b.l.a("progressTextView");
            }
            ViewGroup.LayoutParams layoutParams9 = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams9, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
            int i5 = fVar.f147897i + i4 + fVar.f147899k;
            if (i5 != layoutParams10.bottomMargin) {
                layoutParams10.bottomMargin = i5;
                TextView textView2 = fVar.f147890b;
                if (textView2 == null) {
                    h.f.b.l.a("progressTextView");
                }
                textView2.setLayoutParams(layoutParams10);
            }
            ImageView imageView = fVar.f147895g;
            if (imageView == null) {
                h.f.b.l.a("recordButtonIcon");
            }
            ViewGroup.LayoutParams layoutParams11 = imageView.getLayoutParams();
            Objects.requireNonNull(layoutParams11, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
            int i6 = i4 + ((fVar.f147897i - fVar.f147898j) / 2);
            if (i6 != layoutParams12.bottomMargin) {
                layoutParams12.bottomMargin = i6;
                ImageView imageView2 = fVar.f147895g;
                if (imageView2 == null) {
                    h.f.b.l.a("recordButtonIcon");
                }
                imageView2.setLayoutParams(layoutParams12);
            }
        }
    }

    public final void a(boolean z2) {
        int i2;
        ImageView imageView = this.f147895g;
        if (imageView == null) {
            h.f.b.l.a("recordButtonIcon");
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        AVChallenge aVChallenge;
        super.a(bundle);
        View c2 = c(R.id.a66);
        h.f.b.l.b(c2, "");
        this.f147889a = (ProgressSegmentView) c2;
        View c3 = c(R.id.f4z);
        h.f.b.l.b(c3, "");
        this.f147890b = (TextView) c3;
        View c4 = c(R.id.dhn);
        h.f.b.l.b(c4, "");
        this.f147892d = (LighteningRecordLayout) c4;
        View c5 = c(R.id.dit);
        h.f.b.l.b(c5, "");
        this.f147895g = (ImageView) c5;
        com.bytedance.als.h<Boolean> hVar = this.P;
        if (hVar != null) {
            hVar.a(this, new d(this));
        }
        this.I.a(this, new h(this));
        this.J.a(this, new i(this));
        this.G.a(this, new j(this));
        this.H.a(this, new k(this));
        this.L.a(this, new l(this));
        this.M.a(this, new m(this));
        this.N.a(this, new n(this));
        this.K.a(this, new o(this));
        this.O.a(this, new e(this));
        this.S.a(this, new C3985f(this));
        this.v.k().a(this, new g(this));
        View c6 = c(R.id.a8q);
        h.f.b.l.b(c6, "");
        this.t = (FrameLayout) c6;
        View c7 = c(R.id.a8r);
        h.f.b.l.b(c7, "");
        this.B = (AnimationImageView) c7;
        View c8 = c(R.id.a8o);
        h.f.b.l.b(c8, "");
        this.C = (FrameLayout) c8;
        View c9 = c(R.id.a8p);
        h.f.b.l.b(c9, "");
        this.D = (ImageView) c9;
        LighteningRecordLayout lighteningRecordLayout = this.f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        FrameLayout frameLayout = this.C;
        if (frameLayout == null) {
            h.f.b.l.a("colorSchemeBackground");
        }
        lighteningRecordLayout.setColorSchemeBackground(frameLayout);
        LighteningRecordLayout lighteningRecordLayout2 = this.f147892d;
        if (lighteningRecordLayout2 == null) {
            h.f.b.l.a("recordLayout");
        }
        ImageView imageView = this.D;
        if (imageView == null) {
            h.f.b.l.a("colorSchemeIcon");
        }
        lighteningRecordLayout2.setColorSchemeIcon(imageView);
        if (this.w.aN) {
            LighteningRecordLayout lighteningRecordLayout3 = this.f147892d;
            if (lighteningRecordLayout3 == null) {
                h.f.b.l.a("recordLayout");
            }
            lighteningRecordLayout3.a();
        }
        FrameLayout frameLayout2 = this.t;
        if (frameLayout2 == null) {
            h.f.b.l.a("colorSchemeLayout");
        }
        frameLayout2.bringToFront();
        View c10 = c(R.id.cv2);
        h.f.b.l.b(c10, "");
        this.f147891c = c10;
        LighteningRecordLayout lighteningRecordLayout4 = this.f147892d;
        if (lighteningRecordLayout4 == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout4.setActivity(this.f42913m);
        androidx.fragment.app.e a2 = com.bytedance.scene.ktx.c.a(this);
        com.bytedance.creativex.recorder.b.a.d dVar = this.F;
        com.bytedance.creativex.recorder.b.a.m mVar = this.v;
        LighteningRecordLayout lighteningRecordLayout5 = this.f147892d;
        if (lighteningRecordLayout5 == null) {
            h.f.b.l.a("recordLayout");
        }
        this.A = new bk(a2, dVar, mVar, lighteningRecordLayout5, this.w, new p(this));
        com.bytedance.als.h<Boolean> hVar2 = this.x;
        if (hVar2 != null) {
            hVar2.a(this, new r(this));
        }
        com.bytedance.als.h<ScaleGestureDetector> hVar3 = this.Q;
        if (hVar3 != null) {
            hVar3.a(this, new s(this));
        }
        com.bytedance.als.h<VideoRecordGestureLayout.a> hVar4 = this.R;
        if (hVar4 != null) {
            hVar4.a(this, new t(this));
        }
        View c11 = c(R.id.bw8);
        h.f.b.l.b(c11, "");
        this.f147893e = c11;
        View c12 = c(R.id.z8);
        h.f.b.l.b(c12, "");
        this.f147894f = (ImageView) c12;
        View view = this.f147893e;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setOnClickListener(new u(this));
        ImageView imageView2 = this.f147894f;
        if (imageView2 == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView2.setOnClickListener(new v(this));
        this.F.w().a(this, new w(this));
        this.T.a(this, new x(this));
        bk bkVar = this.A;
        if (bkVar != null) {
            bkVar.f125037b = new y(this);
        }
        LighteningRecordLayout lighteningRecordLayout6 = this.f147892d;
        if (lighteningRecordLayout6 == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout6.setRecordLayoutUIChangedListener(new q(this));
        if (this.w.c() || this.w.f124757b.f124714i || (this.w.p() && this.w.Z != 15 && this.w.Z != 2 && this.w.f124757b.h() > 0)) {
            LighteningRecordLayout lighteningRecordLayout7 = this.f147892d;
            if (lighteningRecordLayout7 == null) {
                h.f.b.l.a("recordLayout");
            }
            lighteningRecordLayout7.g();
        }
        if (!this.w.o() && !this.w.f124757b.b() && !this.w.f124757b.c() && !this.w.c() && !this.w.i()) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null || (aVChallenge = cVar.challenge) == null || !aVChallenge.isCommerce) {
                List<AVChallenge> a3 = av.a(this.w.f124757b.j(), this.w.O);
                if (!a3.isEmpty()) {
                    Iterator<T> it = a3.iterator();
                    while (it.hasNext()) {
                        if (it.next().isCommerce) {
                            return;
                        }
                    }
                }
                if (com.ss.android.ugc.aweme.port.in.l.f115658a.z().a(this.w.af.f124735c) == null && !h.f.b.l.a((Object) this.w.r, (Object) "tcm_upload")) {
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
                    if (!createIAVServiceProxybyMonsterPlugin.getStoryService().b()) {
                        IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                        h.f.b.l.b(createIAVServiceProxybyMonsterPlugin2, "");
                        if (createIAVServiceProxybyMonsterPlugin2.getStoryService().b() || this.E.f147801a.getBoolean("has_shown_story_lightening_guide", false) || h.a.n.b("click_intro", "click_fullscreen_intro", "click_story_label").contains(this.w.y)) {
                            return;
                        }
                    }
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin3 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    h.f.b.l.b(createIAVServiceProxybyMonsterPlugin3, "");
                    createIAVServiceProxybyMonsterPlugin3.getStoryService().a(com.bytedance.scene.ktx.c.a(this));
                    this.E.f147801a.storeBoolean("has_shown_story_lightening_guide", true);
                }
            }
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147902a;

        static {
            Covode.recordClassIndex(97500);
        }

        c(f fVar) {
            this.f147902a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            androidx.lifecycle.i lifecycle = this.f147902a.getLifecycle();
            h.f.b.l.b(lifecycle, "");
            lifecycle.a();
            i.b bVar = i.b.DESTROYED;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.aty, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147901a;

        static {
            Covode.recordClassIndex(97499);
        }

        b(f fVar) {
            this.f147901a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            androidx.lifecycle.i lifecycle = this.f147901a.getLifecycle();
            h.f.b.l.b(lifecycle, "");
            if (lifecycle.a() != i.b.DESTROYED) {
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f147901a.w.q).a("shoot_way", this.f147901a.w.r);
                if (this.f147901a.w.C != 0) {
                    a2.a("draft_id", this.f147901a.w.C);
                }
                String str = this.f147901a.w.D;
                h.f.b.l.b(str, "");
                if (str.length() > 0) {
                    a2.a("new_draft_id", this.f147901a.w.D);
                }
                if (this.f147901a.w.f124757b.f124714i) {
                    a2.a("action_type", "reshoot");
                }
                com.ss.android.ugc.aweme.common.r.a("delete_clip", a2.f149193a);
                this.f147901a.v.c((com.bytedance.creativex.recorder.b.a.m) new com.bytedance.creativex.recorder.b.a.x("delete last fragment"));
            }
        }
    }

    public f(com.bytedance.creativex.recorder.b.a.d dVar, com.bytedance.creativex.recorder.b.a.m mVar, ShortVideoContext shortVideoContext, com.bytedance.als.h<Long> hVar, com.bytedance.als.h<Boolean> hVar2, com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> hVar3, com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar4, com.bytedance.als.h<Integer> hVar5, com.bytedance.als.h<RetakeVideoContext> hVar6, com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> hVar7, com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar8, com.bytedance.als.h<Boolean> hVar9, com.bytedance.als.h<Boolean> hVar10, com.bytedance.als.h<Boolean> hVar11, com.bytedance.als.h<ScaleGestureDetector> hVar12, com.bytedance.als.h<VideoRecordGestureLayout.a> hVar13, com.bytedance.als.h<Long> hVar14, com.bytedance.als.k<Boolean> kVar, com.bytedance.als.d<Integer> dVar2) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(mVar, "");
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
        h.f.b.l.d(hVar14, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(dVar2, "");
        this.F = dVar;
        this.v = mVar;
        this.w = shortVideoContext;
        this.G = hVar;
        this.H = hVar2;
        this.I = hVar3;
        this.J = hVar4;
        this.K = hVar5;
        this.L = hVar6;
        this.M = hVar7;
        this.N = hVar8;
        this.O = hVar9;
        this.P = hVar10;
        this.x = hVar11;
        this.Q = hVar12;
        this.R = hVar13;
        this.S = hVar14;
        this.y = kVar;
        this.T = dVar2;
    }
}

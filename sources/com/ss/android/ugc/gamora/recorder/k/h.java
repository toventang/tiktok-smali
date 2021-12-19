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
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cz;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.duet.x;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.widgetcompat.AnimationImageView;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class h extends com.bytedance.scene.j implements b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f147960l = new a((byte) 0);
    private final com.bytedance.creativex.recorder.b.a.d A;
    private final com.bytedance.als.h<Long> B;
    private final com.bytedance.als.h<Boolean> C;
    private final com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> D;
    private final com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> E;
    private final com.bytedance.als.h<Integer> F;
    private final com.bytedance.als.h<RetakeVideoContext> G;
    private final com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> H;
    private final com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> I;
    private final com.bytedance.als.h<Boolean> J;
    private final com.bytedance.als.h<Boolean> K;
    private final com.bytedance.als.h<Boolean> L;
    private final com.bytedance.als.h<ScaleGestureDetector> M;
    private final com.bytedance.als.h<VideoRecordGestureLayout.a> N;

    /* renamed from: a  reason: collision with root package name */
    public ProgressSegmentView f147961a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f147962b;

    /* renamed from: c  reason: collision with root package name */
    public View f147963c;

    /* renamed from: d  reason: collision with root package name */
    public RecordLayout f147964d;

    /* renamed from: e  reason: collision with root package name */
    public int f147965e = en.a(40.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: f  reason: collision with root package name */
    Dialog f147966f;

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f147967g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f147968h;

    /* renamed from: i  reason: collision with root package name */
    final com.bytedance.o.f f147969i;

    /* renamed from: j  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.b.a.m f147970j;

    /* renamed from: k  reason: collision with root package name */
    public final ShortVideoContext f147971k;
    private cz t;
    private View u;
    private ImageView v;
    private AnimationImageView w;
    private FrameLayout x;
    private ImageView y;
    private long z;

    static {
        Covode.recordClassIndex(97548);
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final String a() {
        return "RecordControlProgressScene";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97549);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final /* bridge */ /* synthetic */ com.bytedance.scene.j b() {
        return this;
    }

    static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147991a;

        static {
            Covode.recordClassIndex(97569);
        }

        u(h hVar) {
            this.f147991a = hVar;
        }

        public final void run() {
            h.c(this.f147991a).setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void C() {
        RecordLayout recordLayout = this.f147964d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.a(1);
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void D() {
        RecordLayout recordLayout = this.f147964d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.c();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void F() {
        RecordLayout recordLayout = this.f147964d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.b();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void G() {
        RecordLayout recordLayout = this.f147964d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.y = true;
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        RecordLayout recordLayout = this.f147964d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.d();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void E() {
        if (this.f147967g != null) {
            FrameLayout frameLayout = this.f147967g;
            if (frameLayout == null) {
                h.f.b.l.a("colorSchemeLayout");
            }
            frameLayout.post(new u(this));
        }
    }

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
        Dialog dialog = this.f147966f;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.f147966f;
            if (dialog2 == null) {
                h.f.b.l.b();
            }
            dialog2.dismiss();
        }
    }

    public static final class s extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147989a;

        static {
            Covode.recordClassIndex(97567);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(h hVar) {
            this.f147989a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            h hVar = this.f147989a;
            cr a2 = cr.a();
            h.f.b.l.b(a2, "");
            a2.f125303i = false;
            cr a3 = cr.a();
            h.f.b.l.b(a3, "");
            a3.f125304j = true;
            if (!hVar.f147971k.f124757b.f124714i || hVar.f147971k.f124757b.h() >= hVar.f147971k.f124757b.k()) {
                if (hVar.f147971k.f124757b.f124714i) {
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.b(hVar.f147971k.f124757b.d().size());
                }
                if (hVar.f147971k.b()) {
                    ((com.ss.android.ugc.gamora.recorder.sticker.c.j) hVar.f147969i.a((Type) com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).F().a();
                }
                hVar.f147970j.a().a();
                hVar.f147970j.a("click go next");
                com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("scene", "go_edit").a("shoot_way", hVar.f147971k.r).a("creation_id", hVar.f147971k.q).a("enter_from", hVar.f147971k.x);
                ar arVar = ar.f132216a;
                h.f.b.l.b(arVar, "");
                com.ss.android.ugc.tools.f.b a5 = a4.a("dalvikPss", arVar.f132218c);
                ar arVar2 = ar.f132216a;
                h.f.b.l.b(arVar2, "");
                com.ss.android.ugc.tools.f.b a6 = a5.a("nativePss", arVar2.f132219d);
                ar arVar3 = ar.f132216a;
                h.f.b.l.b(arVar3, "");
                com.ss.android.ugc.tools.f.b a7 = a6.a("otherPss", arVar3.f132221f);
                ar arVar4 = ar.f132216a;
                h.f.b.l.b(arVar4, "");
                com.ss.android.ugc.aweme.common.r.a("av_memory_log", a7.a("totalPss", arVar4.f132220e).f149193a);
                com.ss.android.ugc.aweme.ah.c.a();
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(hVar.f42913m).a(R.string.bk0).a();
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147984a;

        static {
            Covode.recordClassIndex(97562);
        }

        n(h hVar) {
            this.f147984a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147984a.f147970j.v();
        }
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147986a;

        static {
            Covode.recordClassIndex(97564);
        }

        p(h hVar) {
            this.f147986a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) obj;
            if (scaleGestureDetector != null) {
                h.a(this.f147986a).setScaleGestureDetector(scaleGestureDetector);
            }
        }
    }

    static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147987a;

        static {
            Covode.recordClassIndex(97565);
        }

        q(h hVar) {
            this.f147987a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            VideoRecordGestureLayout.a aVar = (VideoRecordGestureLayout.a) obj;
            if (aVar != null) {
                h.a(this.f147987a).setOnGestureListener(aVar);
            }
        }
    }

    public static final /* synthetic */ RecordLayout a(h hVar) {
        RecordLayout recordLayout = hVar.f147964d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        return recordLayout;
    }

    public static final /* synthetic */ View b(h hVar) {
        View view = hVar.f147963c;
        if (view == null) {
            h.f.b.l.a("nextGroupContainer");
        }
        return view;
    }

    public static final /* synthetic */ FrameLayout c(h hVar) {
        FrameLayout frameLayout = hVar.f147967g;
        if (frameLayout == null) {
            h.f.b.l.a("colorSchemeLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ TextView d(h hVar) {
        TextView textView = hVar.f147962b;
        if (textView == null) {
            h.f.b.l.a("progressTextView");
        }
        return textView;
    }

    public static final /* synthetic */ ProgressSegmentView e(h hVar) {
        ProgressSegmentView progressSegmentView = hVar.f147961a;
        if (progressSegmentView == null) {
            h.f.b.l.a("progressSegmentView");
        }
        return progressSegmentView;
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void f(int i2) {
        TextView textView = this.f147962b;
        if (textView == null) {
            h.f.b.l.a("progressTextView");
        }
        textView.setVisibility(i2);
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147975a;

        static {
            Covode.recordClassIndex(97553);
        }

        e(h hVar) {
            this.f147975a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e2 = h.e(this.f147975a);
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            e2.setVisibility(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$h  reason: collision with other inner class name */
    static final class C3987h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147978a;

        static {
            Covode.recordClassIndex(97556);
        }

        C3987h(h hVar) {
            this.f147978a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            ProgressSegmentView e2 = h.e(this.f147978a);
            h.f.b.l.b(l2, "");
            e2.setMaxDuration(l2.longValue());
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147979a;

        static {
            Covode.recordClassIndex(97557);
        }

        i(h hVar) {
            this.f147979a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e2 = h.e(this.f147979a);
            h.f.b.l.b(bool, "");
            e2.setNeedDrawAnchor(bool.booleanValue());
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147980a;

        static {
            Covode.recordClassIndex(97558);
        }

        j(h hVar) {
            this.f147980a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            RetakeVideoContext retakeVideoContext = (RetakeVideoContext) obj;
            if (retakeVideoContext != null) {
                h.e(this.f147980a).a(retakeVideoContext);
                if (this.f147980a.f147968h) {
                    h.d(this.f147980a).setText("00:00");
                }
            }
        }
    }

    static final class t<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147990a;

        static {
            Covode.recordClassIndex(97568);
        }

        t(h hVar) {
            this.f147990a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f147990a.f147971k.f124757b.b() && x.a()) {
                h.a(this.f147990a).setCanTouch(bool);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void b(boolean z2) {
        ImageView imageView = this.v;
        if (imageView == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView.setSelected(z2);
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void d(int i2) {
        ImageView imageView = this.v;
        if (imageView == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void e(int i2) {
        View view = this.u;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setVisibility(i2);
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147974a;

        static {
            Covode.recordClassIndex(97552);
        }

        d(h hVar) {
            this.f147974a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = h.e(this.f147974a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f147974a.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            marginLayoutParams.topMargin = dh.c(activity) + this.f147974a.t().getResources().getDimensionPixelSize(R.dimen.rl);
            h.e(this.f147974a).setLayoutParams(marginLayoutParams);
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147976a;

        static {
            Covode.recordClassIndex(97554);
        }

        f(h hVar) {
            this.f147976a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                h.e(this.f147976a).a((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                this.f147976a.a(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147977a;

        static {
            Covode.recordClassIndex(97555);
        }

        g(h hVar) {
            this.f147977a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.u uVar = (h.u) obj;
            if (uVar != null) {
                h.e(this.f147977a).a((List) uVar.getFirst(), ((Number) uVar.getSecond()).longValue(), (TimeSpeedModelExtension) uVar.getThird());
                this.f147977a.a(((Number) uVar.getSecond()).longValue());
            }
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147981a;

        static {
            Covode.recordClassIndex(97559);
        }

        k(h hVar) {
            this.f147981a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                h.e(this.f147981a).b((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                this.f147981a.a(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147982a;

        static {
            Covode.recordClassIndex(97560);
        }

        l(h hVar) {
            this.f147982a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.u uVar = (h.u) obj;
            if (uVar != null) {
                h.e(this.f147982a);
                uVar.getFirst();
                ((Number) uVar.getSecond()).longValue();
                uVar.getThird();
                ProgressSegmentView.b();
                this.f147982a.a(((Number) uVar.getSecond()).longValue());
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147983a;

        static {
            Covode.recordClassIndex(97561);
        }

        m(h hVar) {
            this.f147983a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 2) {
                h.e(this.f147983a).a();
                return;
            }
            ProgressSegmentView e2 = h.e(this.f147983a);
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            e2.a(z);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void a(float f2) {
        View view = this.u;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setAlpha(f2);
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147985a;

        static {
            Covode.recordClassIndex(97563);
        }

        o(h hVar) {
            this.f147985a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = en.a(33.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + this.f147985a.f147965e;
            } else {
                i2 = this.f147985a.f147965e;
            }
            ViewGroup.LayoutParams layoutParams = h.a(this.f147985a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2;
            h.a(this.f147985a).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = h.b(this.f147985a).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i2;
            h.b(this.f147985a).setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = h.c(this.f147985a).getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = i2;
            h.c(this.f147985a).setLayoutParams(layoutParams6);
            if (this.f147985a.f147968h) {
                ViewGroup.LayoutParams layoutParams7 = h.d(this.f147985a).getLayoutParams();
                Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                layoutParams8.bottomMargin = i2 + en.a(100.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + en.a(16.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                h.d(this.f147985a).setLayoutParams(layoutParams8);
            }
        }
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147988a;

        static {
            Covode.recordClassIndex(97566);
        }

        r(h hVar) {
            this.f147988a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h hVar = this.f147988a;
            h.f.b.l.b(view, "");
            if (hVar.f147971k.b()) {
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
            if (hVar.f147966f != null) {
                Dialog dialog = hVar.f147966f;
                if (dialog == null) {
                    h.f.b.l.b();
                }
                if (dialog.isShowing()) {
                    return;
                }
            }
            a.C0731a aVar = new a.C0731a(hVar.f42913m);
            aVar.f33402b = hVar.t().getResources().getString(R.string.b7x);
            aVar.a(hVar.t().getResources().getString(R.string.b7y), (DialogInterface.OnClickListener) new b(hVar), false).b(hVar.t().getResources().getString(R.string.b7z), (DialogInterface.OnClickListener) new c(hVar), false);
            hVar.f147966f = aVar.a().b();
        }
    }

    public final void a(long j2) {
        if (this.f147968h) {
            long j3 = j2 - this.z;
            if (1 > j3 || 999 < j3 || j2 >= this.f147971k.f124757b.k()) {
                this.z = j2;
                int i2 = (int) (j2 / 1000);
                int i3 = i2 % 60;
                int i4 = (i2 - i3) / 60;
                TextView textView = this.f147962b;
                if (textView == null) {
                    h.f.b.l.a("progressTextView");
                }
                StringBuilder sb = new StringBuilder();
                String a2 = com.a.a(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                h.f.b.l.b(a2, "");
                StringBuilder append = sb.append(a2).append(":");
                String a3 = com.a.a(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                h.f.b.l.b(a3, "");
                textView.setText(append.append(a3).toString());
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.dc_);
        h.f.b.l.b(c2, "");
        this.f147961a = (ProgressSegmentView) c2;
        if (this.f147968h) {
            View c3 = c(R.id.f4z);
            h.f.b.l.b(c3, "");
            this.f147962b = (TextView) c3;
        }
        com.bytedance.als.h<Boolean> hVar = this.K;
        if (hVar != null) {
            hVar.a(this, new d(this));
        }
        this.D.a(this, new f(this));
        this.E.a(this, new g(this));
        this.B.a(this, new C3987h(this));
        this.C.a(this, new i(this));
        this.G.a(this, new j(this));
        this.H.a(this, new k(this));
        this.I.a(this, new l(this));
        this.F.a(this, new m(this));
        this.J.a(this, new e(this));
        View c4 = c(R.id.dhn);
        h.f.b.l.b(c4, "");
        this.f147964d = (RecordLayout) c4;
        View c5 = c(R.id.a8q);
        h.f.b.l.b(c5, "");
        this.f147967g = (FrameLayout) c5;
        View c6 = c(R.id.a8r);
        h.f.b.l.b(c6, "");
        this.w = (AnimationImageView) c6;
        View c7 = c(R.id.a8o);
        h.f.b.l.b(c7, "");
        this.x = (FrameLayout) c7;
        View c8 = c(R.id.a8p);
        h.f.b.l.b(c8, "");
        this.y = (ImageView) c8;
        if (this.f147971k.aN) {
            RecordLayout recordLayout = this.f147964d;
            if (recordLayout == null) {
                h.f.b.l.a("recordLayout");
            }
            recordLayout.a();
        }
        FrameLayout frameLayout = this.f147967g;
        if (frameLayout == null) {
            h.f.b.l.a("colorSchemeLayout");
        }
        frameLayout.bringToFront();
        View c9 = c(R.id.cv2);
        h.f.b.l.b(c9, "");
        this.f147963c = c9;
        RecordLayout recordLayout2 = this.f147964d;
        if (recordLayout2 == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout2.setActivity(this.f42913m);
        androidx.fragment.app.e a2 = com.bytedance.scene.ktx.c.a(this);
        com.bytedance.creativex.recorder.b.a.d dVar = this.A;
        com.bytedance.creativex.recorder.b.a.m mVar = this.f147970j;
        RecordLayout recordLayout3 = this.f147964d;
        if (recordLayout3 == null) {
            h.f.b.l.a("recordLayout");
        }
        this.t = new cz(a2, dVar, mVar, recordLayout3, new n(this));
        com.bytedance.als.h<Boolean> hVar2 = this.L;
        if (hVar2 != null) {
            hVar2.a(this, new o(this));
        }
        com.bytedance.als.h<ScaleGestureDetector> hVar3 = this.M;
        if (hVar3 != null) {
            hVar3.a(this, new p(this));
        }
        com.bytedance.als.h<VideoRecordGestureLayout.a> hVar4 = this.N;
        if (hVar4 != null) {
            hVar4.a(this, new q(this));
        }
        View c10 = c(R.id.bw8);
        h.f.b.l.b(c10, "");
        this.u = c10;
        View c11 = c(R.id.z8);
        h.f.b.l.b(c11, "");
        this.v = (ImageView) c11;
        View view = this.u;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setOnClickListener(new r(this));
        ImageView imageView = this.v;
        if (imageView == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView.setOnClickListener(new s(this));
        this.A.w().a(this, new t(this));
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void a(Animation animation) {
        h.f.b.l.d(animation, "");
        RecordLayout recordLayout = this.f147964d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        com.bytedance.common.utility.n.a(recordLayout);
        RecordLayout recordLayout2 = this.f147964d;
        if (recordLayout2 == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout2.startAnimation(animation);
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void a(boolean z2) {
        RecordLayout recordLayout = this.f147964d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.setEnabled(z2);
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147973a;

        static {
            Covode.recordClassIndex(97551);
        }

        c(h hVar) {
            this.f147973a = hVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            androidx.lifecycle.i lifecycle = this.f147973a.getLifecycle();
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
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147972a;

        static {
            Covode.recordClassIndex(97550);
        }

        b(h hVar) {
            this.f147972a = hVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            androidx.lifecycle.i lifecycle = this.f147972a.getLifecycle();
            h.f.b.l.b(lifecycle, "");
            if (lifecycle.a() != i.b.DESTROYED) {
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f147972a.f147971k.q).a("shoot_way", this.f147972a.f147971k.r);
                if (this.f147972a.f147971k.C != 0) {
                    a2.a("draft_id", this.f147972a.f147971k.C);
                }
                String str = this.f147972a.f147971k.D;
                h.f.b.l.b(str, "");
                if (str.length() > 0) {
                    a2.a("new_draft_id", this.f147972a.f147971k.D);
                }
                if (this.f147972a.f147971k.f124757b.f124714i) {
                    a2.a("action_type", "reshoot");
                }
                com.ss.android.ugc.aweme.common.r.a("delete_clip", a2.f149193a);
                this.f147972a.f147970j.c((com.bytedance.creativex.recorder.b.a.m) new com.bytedance.creativex.recorder.b.a.x("delete last fragment"));
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.b
    public final void a(int i2, boolean z2) {
        RecordLayout recordLayout = this.f147964d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.a(i2, z2);
    }

    public h(com.bytedance.creativex.recorder.b.a.d dVar, com.bytedance.o.f fVar, com.bytedance.creativex.recorder.b.a.m mVar, ShortVideoContext shortVideoContext, com.bytedance.als.h<Long> hVar, com.bytedance.als.h<Boolean> hVar2, com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> hVar3, com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar4, com.bytedance.als.h<Integer> hVar5, com.bytedance.als.h<RetakeVideoContext> hVar6, com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> hVar7, com.bytedance.als.h<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar8, com.bytedance.als.h<Boolean> hVar9, com.bytedance.als.h<Boolean> hVar10, com.bytedance.als.h<Boolean> hVar11, com.bytedance.als.h<ScaleGestureDetector> hVar12, com.bytedance.als.h<VideoRecordGestureLayout.a> hVar13) {
        boolean z2;
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(fVar, "");
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
        this.A = dVar;
        this.f147969i = fVar;
        this.f147970j = mVar;
        this.f147971k = shortVideoContext;
        this.B = hVar;
        this.C = hVar2;
        this.D = hVar3;
        this.E = hVar4;
        this.F = hVar5;
        this.G = hVar6;
        this.H = hVar7;
        this.I = hVar8;
        this.J = hVar9;
        this.K = hVar10;
        this.L = hVar11;
        this.M = hVar12;
        this.N = hVar13;
        if (com.ss.android.ugc.aweme.setting.i.p.a() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f147968h = z2;
    }
}

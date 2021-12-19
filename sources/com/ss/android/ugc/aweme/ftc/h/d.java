package com.ss.android.ugc.aweme.ftc.h;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cz;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.widgetcompat.AnimationImageView;
import com.zhiliaoapp.musically.R;
import h.u;
import h.z;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class d extends com.bytedance.scene.j {
    public static final a t = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ProgressSegmentView f98572a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f98573b;

    /* renamed from: c  reason: collision with root package name */
    public View f98574c;

    /* renamed from: d  reason: collision with root package name */
    public RecordLayout f98575d;

    /* renamed from: e  reason: collision with root package name */
    View f98576e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f98577f;

    /* renamed from: g  reason: collision with root package name */
    public int f98578g = en.a(40.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: h  reason: collision with root package name */
    public AnimationImageView f98579h;

    /* renamed from: i  reason: collision with root package name */
    public FrameLayout f98580i;

    /* renamed from: j  reason: collision with root package name */
    public FrameLayout f98581j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f98582k;

    /* renamed from: l  reason: collision with root package name */
    public final c f98583l;
    private cz u;
    private ImageView v;
    private long w;

    static {
        Covode.recordClassIndex(62672);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62673);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98599a;

        static {
            Covode.recordClassIndex(62692);
        }

        r(d dVar) {
            this.f98599a = dVar;
        }

        public final void run() {
            d.c(this.f98599a).setVisibility(0);
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        RecordLayout recordLayout = this.f98575d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.d();
    }

    public static final class q extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98598a;

        static {
            Covode.recordClassIndex(62691);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(d dVar) {
            this.f98598a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            d dVar = this.f98598a;
            if (!dVar.f98583l.b().f124757b.f124714i || dVar.f98583l.b().f124757b.h() >= dVar.f98583l.b().f124757b.k()) {
                if (dVar.f98583l.b().f124757b.f124714i) {
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.b(dVar.f98583l.b().f124757b.d().size());
                }
                dVar.f98583l.a().a().a();
                dVar.f98583l.a().a("ftc click go next");
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("scene", "go_edit").a("shoot_way", dVar.f98583l.b().r).a("creation_id", dVar.f98583l.b().q).a("enter_from", dVar.f98583l.b().x);
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
            new com.ss.android.ugc.aweme.tux.a.i.a(dVar.f42913m).a(R.string.bk0).a();
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98593a;

        static {
            Covode.recordClassIndex(62686);
        }

        l(d dVar) {
            this.f98593a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f98593a.f98583l.a().v();
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98595a;

        static {
            Covode.recordClassIndex(62688);
        }

        n(d dVar) {
            this.f98595a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) obj;
            if (scaleGestureDetector != null) {
                d.a(this.f98595a).setScaleGestureDetector(scaleGestureDetector);
            }
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98596a;

        static {
            Covode.recordClassIndex(62689);
        }

        o(d dVar) {
            this.f98596a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            VideoRecordGestureLayout.a aVar = (VideoRecordGestureLayout.a) obj;
            if (aVar != null) {
                d.a(this.f98596a).setOnGestureListener(aVar);
            }
        }
    }

    public static final /* synthetic */ RecordLayout a(d dVar) {
        RecordLayout recordLayout = dVar.f98575d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        return recordLayout;
    }

    public static final /* synthetic */ View b(d dVar) {
        View view = dVar.f98574c;
        if (view == null) {
            h.f.b.l.a("nextGroupContainer");
        }
        return view;
    }

    public static final /* synthetic */ FrameLayout c(d dVar) {
        FrameLayout frameLayout = dVar.f98580i;
        if (frameLayout == null) {
            h.f.b.l.a("colorSchemeLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ TextView d(d dVar) {
        TextView textView = dVar.f98573b;
        if (textView == null) {
            h.f.b.l.a("progressTextView");
        }
        return textView;
    }

    public static final /* synthetic */ ProgressSegmentView e(d dVar) {
        ProgressSegmentView progressSegmentView = dVar.f98572a;
        if (progressSegmentView == null) {
            h.f.b.l.a("progressSegmentView");
        }
        return progressSegmentView;
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98587a;

        static {
            Covode.recordClassIndex(62680);
        }

        f(d dVar) {
            this.f98587a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            ProgressSegmentView e2 = d.e(this.f98587a);
            h.f.b.l.b(l2, "");
            e2.setMaxDuration(l2.longValue());
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98588a;

        static {
            Covode.recordClassIndex(62681);
        }

        g(d dVar) {
            this.f98588a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            RetakeVideoContext retakeVideoContext = (RetakeVideoContext) obj;
            if (retakeVideoContext != null) {
                d.e(this.f98588a).a(retakeVideoContext);
                if (this.f98588a.f98582k) {
                    d.d(this.f98588a).setText("00:00");
                }
            }
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98592a;

        static {
            Covode.recordClassIndex(62685);
        }

        k(d dVar) {
            this.f98592a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e2 = d.e(this.f98592a);
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            e2.setVisibility(i2);
        }
    }

    public d(c cVar) {
        boolean z;
        h.f.b.l.d(cVar, "");
        this.f98583l = cVar;
        if (com.ss.android.ugc.aweme.setting.i.p.a() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f98582k = z;
    }

    public final void d(int i2) {
        TextView textView = this.f98573b;
        if (textView == null) {
            h.f.b.l.a("progressTextView");
        }
        textView.setVisibility(i2);
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98584a;

        static {
            Covode.recordClassIndex(62677);
        }

        c(d dVar) {
            this.f98584a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = d.e(this.f98584a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f98584a.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            marginLayoutParams.topMargin = dh.c(activity) + this.f98584a.t().getResources().getDimensionPixelSize(R.dimen.rl);
            d.e(this.f98584a).setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$d  reason: collision with other inner class name */
    static final class C2389d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98585a;

        static {
            Covode.recordClassIndex(62678);
        }

        C2389d(d dVar) {
            this.f98585a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                d.e(this.f98585a).a((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                this.f98585a.a(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98586a;

        static {
            Covode.recordClassIndex(62679);
        }

        e(d dVar) {
            this.f98586a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            u uVar = (u) obj;
            if (uVar != null) {
                d.e(this.f98586a).a((List) uVar.getFirst(), ((Number) uVar.getSecond()).longValue(), (TimeSpeedModelExtension) uVar.getThird());
                this.f98586a.a(((Number) uVar.getSecond()).longValue());
            }
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98589a;

        static {
            Covode.recordClassIndex(62682);
        }

        h(d dVar) {
            this.f98589a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                d.e(this.f98589a).b((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                this.f98589a.a(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98590a;

        static {
            Covode.recordClassIndex(62683);
        }

        i(d dVar) {
            this.f98590a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            u uVar = (u) obj;
            if (uVar != null) {
                d.e(this.f98590a);
                uVar.getFirst();
                ((Number) uVar.getSecond()).longValue();
                uVar.getThird();
                ProgressSegmentView.b();
                this.f98590a.a(((Number) uVar.getSecond()).longValue());
            }
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98591a;

        static {
            Covode.recordClassIndex(62684);
        }

        j(d dVar) {
            this.f98591a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 2) {
                d.e(this.f98591a).a();
                return;
            }
            ProgressSegmentView e2 = d.e(this.f98591a);
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            e2.a(z);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.this$0.t().getResources().getString(R.string.cu6);
            h.f.b.l.b(string, "");
            bVar2.b(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ftc.h.d.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(62675);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    androidx.lifecycle.i lifecycle = this.this$0.this$0.getLifecycle();
                    h.f.b.l.b(lifecycle, "");
                    lifecycle.a();
                    return z.f158842a;
                }
            });
            String string2 = this.this$0.t().getResources().getString(R.string.cu5);
            h.f.b.l.b(string2, "");
            bVar2.c(string2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ftc.h.d.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(62676);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    androidx.lifecycle.i lifecycle = this.this$0.this$0.getLifecycle();
                    h.f.b.l.b(lifecycle, "");
                    if (lifecycle.a() != i.b.DESTROYED) {
                        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.this$0.this$0.f98583l.b().q).a("shoot_way", this.this$0.this$0.f98583l.b().r).a("draft_id", this.this$0.this$0.f98583l.b().C);
                        if (this.this$0.this$0.f98583l.b().f124757b.f124714i) {
                            a2.a("action_type", "reshoot");
                        }
                        com.ss.android.ugc.aweme.common.r.a("delete_clip", a2.f149193a);
                        this.this$0.this$0.f98583l.a().c((com.bytedance.creativex.recorder.b.a.m) new x("delete last fragment"));
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98597a;

        static {
            Covode.recordClassIndex(62690);
        }

        p(d dVar) {
            this.f98597a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d dVar = this.f98597a;
            h.f.b.l.b(view, "");
            Context r = dVar.r();
            if (r == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(r, "");
            com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(r).d(dVar.t().getResources().getString(R.string.b7x)), new b(dVar)).a().b().show();
        }
    }

    public final void a(long j2) {
        if (this.f98582k) {
            long j3 = j2 - this.w;
            if (1 > j3 || 999 < j3 || j2 >= this.f98583l.b().f124757b.k()) {
                this.w = j2;
                int i2 = (int) (j2 / 1000);
                int i3 = i2 % 60;
                int i4 = (i2 - i3) / 60;
                TextView textView = this.f98573b;
                if (textView == null) {
                    h.f.b.l.a("progressTextView");
                }
                StringBuilder sb = new StringBuilder();
                String a2 = com.a.a("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                h.f.b.l.b(a2, "");
                StringBuilder append = sb.append(a2).append(":");
                String a3 = com.a.a("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                h.f.b.l.b(a3, "");
                textView.setText(append.append(a3).toString());
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98594a;

        static {
            Covode.recordClassIndex(62687);
        }

        m(d dVar) {
            this.f98594a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = en.a(33.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + this.f98594a.f98578g;
            } else {
                i2 = this.f98594a.f98578g;
            }
            ViewGroup.LayoutParams layoutParams = d.a(this.f98594a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2;
            d.a(this.f98594a).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = d.b(this.f98594a).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i2;
            d.b(this.f98594a).setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = d.c(this.f98594a).getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = i2;
            d.c(this.f98594a).setLayoutParams(layoutParams6);
            if (this.f98594a.f98582k) {
                ViewGroup.LayoutParams layoutParams7 = d.d(this.f98594a).getLayoutParams();
                Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                layoutParams8.bottomMargin = i2 + en.a(100.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + en.a(16.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                d.d(this.f98594a).setLayoutParams(layoutParams8);
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.dc_);
        h.f.b.l.b(c2, "");
        this.f98572a = (ProgressSegmentView) c2;
        if (this.f98582k) {
            View c3 = c(R.id.f4z);
            h.f.b.l.b(c3, "");
            this.f98573b = (TextView) c3;
        }
        com.bytedance.als.h<Boolean> hVar = this.f98583l.f98570l;
        if (hVar != null) {
            hVar.a(this, new c(this));
        }
        com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> hVar2 = this.f98583l.f98563e;
        if (hVar2 == null) {
            h.f.b.l.a("progressClipAnchors");
        }
        hVar2.a(this, new C2389d(this));
        com.bytedance.als.h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar3 = this.f98583l.f98564f;
        if (hVar3 == null) {
            h.f.b.l.a("progressClipWithStitch");
        }
        hVar3.a(this, new e(this));
        com.bytedance.als.h<Long> hVar4 = this.f98583l.f98562d;
        if (hVar4 == null) {
            h.f.b.l.a("progressMaxDuration");
        }
        hVar4.a(this, new f(this));
        com.bytedance.als.h<RetakeVideoContext> hVar5 = this.f98583l.f98566h;
        if (hVar5 == null) {
            h.f.b.l.a("retakeVideoContext");
        }
        hVar5.a(this, new g(this));
        com.bytedance.als.h<h.p<List<TimeSpeedModelExtension>, Long>> hVar6 = this.f98583l.f98567i;
        if (hVar6 == null) {
            h.f.b.l.a("retakeProgressClipAnchors");
        }
        hVar6.a(this, new h(this));
        com.bytedance.als.h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar7 = this.f98583l.f98568j;
        if (hVar7 == null) {
            h.f.b.l.a("retakeProgressClipWithStitch");
        }
        hVar7.a(this, new i(this));
        com.bytedance.als.h<Integer> hVar8 = this.f98583l.f98565g;
        if (hVar8 == null) {
            h.f.b.l.a("retakeState");
        }
        hVar8.a(this, new j(this));
        com.bytedance.als.h<Boolean> hVar9 = this.f98583l.f98569k;
        if (hVar9 == null) {
            h.f.b.l.a("progressSegmentVisible");
        }
        hVar9.a(this, new k(this));
        View c4 = c(R.id.dhn);
        h.f.b.l.b(c4, "");
        this.f98575d = (RecordLayout) c4;
        View c5 = c(R.id.a8q);
        h.f.b.l.b(c5, "");
        this.f98580i = (FrameLayout) c5;
        View c6 = c(R.id.a8r);
        h.f.b.l.b(c6, "");
        this.f98579h = (AnimationImageView) c6;
        View c7 = c(R.id.a8o);
        h.f.b.l.b(c7, "");
        this.f98581j = (FrameLayout) c7;
        View c8 = c(R.id.a8p);
        h.f.b.l.b(c8, "");
        this.v = (ImageView) c8;
        if (this.f98583l.b().aN) {
            RecordLayout recordLayout = this.f98575d;
            if (recordLayout == null) {
                h.f.b.l.a("recordLayout");
            }
            recordLayout.a();
        }
        FrameLayout frameLayout = this.f98580i;
        if (frameLayout == null) {
            h.f.b.l.a("colorSchemeLayout");
        }
        frameLayout.bringToFront();
        View c9 = c(R.id.cv2);
        h.f.b.l.b(c9, "");
        this.f98574c = c9;
        RecordLayout recordLayout2 = this.f98575d;
        if (recordLayout2 == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout2.setActivity(this.f42913m);
        androidx.fragment.app.e a2 = com.bytedance.scene.ktx.c.a(this);
        com.bytedance.creativex.recorder.b.a.d dVar = this.f98583l.f98559a;
        if (dVar == null) {
            h.f.b.l.a("cameraApiComponent");
        }
        com.bytedance.creativex.recorder.b.a.m a3 = this.f98583l.a();
        RecordLayout recordLayout3 = this.f98575d;
        if (recordLayout3 == null) {
            h.f.b.l.a("recordLayout");
        }
        this.u = new cz(a2, dVar, a3, recordLayout3, new l(this));
        com.bytedance.als.h<Boolean> hVar10 = this.f98583l.f98571m;
        if (hVar10 != null) {
            hVar10.a(this, new m(this));
        }
        com.bytedance.als.h<ScaleGestureDetector> hVar11 = this.f98583l.n;
        if (hVar11 != null) {
            hVar11.a(this, new n(this));
        }
        com.bytedance.als.h<VideoRecordGestureLayout.a> hVar12 = this.f98583l.o;
        if (hVar12 != null) {
            hVar12.a(this, new o(this));
        }
        View c10 = c(R.id.bw8);
        h.f.b.l.b(c10, "");
        this.f98576e = c10;
        View c11 = c(R.id.z8);
        h.f.b.l.b(c11, "");
        this.f98577f = (ImageView) c11;
        View view = this.f98576e;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setOnClickListener(new p(this));
        ImageView imageView = this.f98577f;
        if (imageView == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView.setOnClickListener(new q(this));
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a33, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }
}

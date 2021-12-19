package com.ss.android.ugc.aweme.ftc.pages;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.text.bean.o;
import com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.z;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;

public final class b extends i.b {

    /* renamed from: a  reason: collision with root package name */
    final e f98836a;

    /* renamed from: b  reason: collision with root package name */
    final c f98837b;

    /* renamed from: c  reason: collision with root package name */
    final VideoPublishEditModel f98838c;

    /* renamed from: d  reason: collision with root package name */
    public final z f98839d;

    /* renamed from: e  reason: collision with root package name */
    final h.f.a.a<SurfaceView> f98840e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<ImageView> f98841f;

    static {
        Covode.recordClassIndex(62844);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f98843b;

        static {
            Covode.recordClassIndex(62845);
        }

        a(b bVar, Fragment fragment) {
            this.f98842a = bVar;
            this.f98843b = fragment;
        }

        public final void run() {
            int i2;
            e activity = this.f98843b.getActivity();
            if (!this.f98843b.isDetached() && activity != null && !activity.isFinishing()) {
                b bVar = this.f98842a;
                c cVar = (c) this.f98843b;
                int d2 = dh.d(activity);
                bVar.f98839d.w.b(androidx.core.content.b.c(bVar.f98836a, R.color.f159921e));
                int e2 = dh.e(cVar.getActivity());
                int width = bVar.f98840e.invoke().getWidth();
                FrameLayout frameLayout = (FrameLayout) cVar.a(R.id.ffe);
                l.b(frameLayout, "");
                int measuredHeight = frameLayout.getMeasuredHeight();
                VESize b2 = bVar.f98839d.w.b();
                float f2 = (float) b2.height;
                float f3 = ((float) b2.width) / f2;
                float f4 = (float) width;
                float f5 = (float) measuredHeight;
                boolean z = false;
                if (f3 > f4 / f5) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, (float) ((int) (f4 / f3)));
                    l.b(ofFloat, "");
                    ofFloat.setDuration(0L);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.addUpdateListener(new C2404b(bVar, f3, e2, d2, cVar));
                    ofFloat.start();
                } else {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, f5);
                    l.b(ofFloat2, "");
                    ofFloat2.setDuration(0L);
                    ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat2.addUpdateListener(new c(bVar, f3, width, cVar));
                    ofFloat2.start();
                }
                bVar.f98839d.w.a(true);
                float f6 = ((float) b2.width) / ((float) b2.height);
                FrameLayout frameLayout2 = (FrameLayout) cVar.a(R.id.atu);
                l.b(frameLayout2, "");
                int width2 = frameLayout2.getWidth();
                FrameLayout frameLayout3 = (FrameLayout) cVar.a(R.id.atu);
                l.b(frameLayout3, "");
                int height = frameLayout3.getHeight();
                float f7 = (float) width2;
                float f8 = (float) height;
                FrameLayout frameLayout4 = (FrameLayout) cVar.a(R.id.atu);
                l.b(frameLayout4, "");
                ViewGroup.LayoutParams layoutParams = frameLayout4.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                float f9 = 1.0f;
                if (f6 > f7 / f8) {
                    layoutParams2.width = width2;
                    layoutParams2.height = ((int) (f7 / f6)) + 2;
                    i2 = (height * 9) / 16;
                } else {
                    float f10 = ((float) ((int) (f6 * f8))) / f7;
                    if (f10 != 0.0f && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
                        f9 = f10;
                    }
                    layoutParams2.height = (int) (f8 / f9);
                    i2 = -1;
                    z = true;
                }
                FrameLayout frameLayout5 = (FrameLayout) cVar.a(R.id.atu);
                l.b(frameLayout5, "");
                frameLayout5.setLayoutParams(layoutParams2);
                FrameLayout frameLayout6 = (FrameLayout) cVar.a(R.id.atu);
                l.b(frameLayout6, "");
                frameLayout6.setScaleX(f9);
                FrameLayout frameLayout7 = (FrameLayout) cVar.a(R.id.atu);
                l.b(frameLayout7, "");
                frameLayout7.setScaleY(f9);
                FrameLayout frameLayout8 = (FrameLayout) cVar.a(R.id.atu);
                l.b(frameLayout8, "");
                frameLayout8.setTag(new o(z, f9, i2));
                c cVar2 = bVar.f98837b;
                cVar2.c((bVar.f98838c.mVideoCoverStartTm * 1000.0f) / ((float) bVar.f98839d.w.j()));
                FTCChooseCoverView fTCChooseCoverView = (FTCChooseCoverView) cVar2.a(R.id.ff_);
                a aVar = cVar2.f98853a;
                if (aVar == null) {
                    l.a("mDependency");
                }
                fTCChooseCoverView.f98909a.setX(aVar.c().getCoverPublishModel().getVideoCoverViewX());
            }
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f98850b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f98851c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f98852d;

        static {
            Covode.recordClassIndex(62847);
        }

        c(b bVar, float f2, int i2, c cVar) {
            this.f98849a = bVar;
            this.f98850b = f2;
            this.f98851c = i2;
            this.f98852d = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            float f2 = this.f98850b * floatValue;
            g gVar = this.f98849a.f98839d.w;
            int i2 = (int) ((((float) this.f98851c) - f2) / 2.0f);
            int a2 = (int) (((float) this.f98852d.a()) * animatedFraction);
            int i3 = (int) f2;
            int i4 = (int) floatValue;
            gVar.a(i2, a2, i3, i4);
            this.f98849a.a(a2, i3, i4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.b$b  reason: collision with other inner class name */
    static final class C2404b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f98845b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f98846c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f98847d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f98848e;

        static {
            Covode.recordClassIndex(62846);
        }

        C2404b(b bVar, float f2, int i2, int i3, c cVar) {
            this.f98844a = bVar;
            this.f98845b = f2;
            this.f98846c = i2;
            this.f98847d = i3;
            this.f98848e = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            c cVar = this.f98848e;
            LinearLayout linearLayout = (LinearLayout) cVar.a(R.id.dji);
            l.b(linearLayout, "");
            int measuredHeight = linearLayout.getMeasuredHeight();
            FrameLayout frameLayout = (FrameLayout) cVar.a(R.id.att);
            l.b(frameLayout, "");
            int measuredHeight2 = (int) ((((((float) (this.f98846c - this.f98847d)) - (((float) ((measuredHeight + frameLayout.getMeasuredHeight()) + this.f98848e.a())) * animatedFraction)) - floatValue) / 2.0f) + ((float) this.f98848e.a()));
            int i2 = (int) (this.f98845b * floatValue);
            int i3 = (int) floatValue;
            this.f98844a.f98839d.w.a(0, measuredHeight2, i2, i3);
            this.f98844a.a(measuredHeight2, i2, i3);
        }
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentDetached(i iVar, Fragment fragment) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentDetached(iVar, fragment);
        if (fragment instanceof c) {
            Intent intent = new Intent();
            intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", (Serializable) this.f98838c);
            this.f98836a.setResult(-1, intent);
            this.f98836a.finish();
        }
    }

    public final void a(int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = this.f98841f.invoke().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = i2;
        layoutParams2.width = i3;
        layoutParams2.height = i4;
        this.f98841f.invoke().setLayoutParams(layoutParams2);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentActivityCreated(i iVar, Fragment fragment, Bundle bundle) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentActivityCreated(iVar, fragment, bundle);
        if (fragment instanceof c) {
            if (!(this.f98839d.v == null || (vEEditorAutoStartStopArbiter = this.f98839d.v) == null)) {
                vEEditorAutoStartStopArbiter.a(true, false);
            }
            View view = fragment.getView();
            if (view != null) {
                view.postDelayed(new a(this, fragment), 300);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends android.widget.ImageView> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.a<? extends android.view.SurfaceView> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(e eVar, c cVar, VideoPublishEditModel videoPublishEditModel, z zVar, h.f.a.a<? extends ImageView> aVar, h.f.a.a<? extends SurfaceView> aVar2) {
        l.d(eVar, "");
        l.d(cVar, "");
        l.d(videoPublishEditModel, "");
        l.d(zVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f98836a = eVar;
        this.f98837b = cVar;
        this.f98838c = videoPublishEditModel;
        this.f98839d = zVar;
        this.f98841f = aVar;
        this.f98840e = aVar2;
    }
}

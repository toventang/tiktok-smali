package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class DuetEditStickerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    FrameLayout f127234a;

    /* renamed from: b  reason: collision with root package name */
    h.f.a.b<? super DuetEditStickerView, z> f127235b;

    /* renamed from: c  reason: collision with root package name */
    a f127236c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    a f127237d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    DuetEditStickerView f127238e;

    /* renamed from: f  reason: collision with root package name */
    boolean f127239f;

    /* renamed from: g  reason: collision with root package name */
    boolean f127240g;

    /* renamed from: h  reason: collision with root package name */
    PointF f127241h = new PointF(0.0f, 0.0f);

    /* renamed from: i  reason: collision with root package name */
    public Animator f127242i;

    /* renamed from: j  reason: collision with root package name */
    public int f127243j = b.f127305a;

    /* renamed from: k  reason: collision with root package name */
    final float f127244k;

    /* renamed from: l  reason: collision with root package name */
    private h.f.a.b<? super DuetEditStickerView, z> f127245l;

    /* renamed from: m  reason: collision with root package name */
    private VideoPublishEditModel f127246m;

    static {
        Covode.recordClassIndex(83463);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView, h.z> */
    public final h.f.a.b<DuetEditStickerView, z> getBeforeChangeListener() {
        return this.f127245l;
    }

    public final VideoPublishEditModel getEditModel() {
        return this.f127246m;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView, h.z> */
    public final h.f.a.b<DuetEditStickerView, z> getOnCompleteListener() {
        return this.f127235b;
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ DuetEditStickerLayout this$0;

        static {
            Covode.recordClassIndex(83465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DuetEditStickerLayout duetEditStickerLayout) {
            super(0);
            this.this$0 = duetEditStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            float f2;
            DuetEditStickerLayout duetEditStickerLayout = this.this$0;
            duetEditStickerLayout.f127243j = b.f127305a;
            duetEditStickerLayout.f127239f = false;
            if (!duetEditStickerLayout.f127240g) {
                DuetEditStickerView duetEditStickerView = duetEditStickerLayout.f127238e;
                if (duetEditStickerView != null) {
                    a aVar = new a(duetEditStickerLayout);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(duetEditStickerView, "scaleX", duetEditStickerLayout.f127237d.f127264a, duetEditStickerLayout.f127236c.f127264a);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(duetEditStickerView, "scaleY", duetEditStickerLayout.f127237d.f127265b, duetEditStickerLayout.f127236c.f127265b);
                    float[] fArr = new float[2];
                    if (duetEditStickerLayout.f127236c.f127266c > 180.0f) {
                        f2 = 360.0f;
                    } else {
                        f2 = duetEditStickerLayout.f127237d.f127266c;
                    }
                    fArr[0] = f2;
                    fArr[1] = duetEditStickerLayout.f127236c.f127266c;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(duetEditStickerView, "rotation", fArr);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(duetEditStickerView, "x", duetEditStickerLayout.f127237d.f127267d, duetEditStickerLayout.f127236c.f127267d);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(duetEditStickerView, "y", duetEditStickerLayout.f127237d.f127268e, duetEditStickerLayout.f127236c.f127268e);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(300L);
                    animatorSet.addListener(aVar);
                    animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                    animatorSet.start();
                    duetEditStickerLayout.f127242i = animatorSet;
                }
                duetEditStickerLayout.f127240g = true;
            }
            return z.f158842a;
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DuetEditStickerLayout f127248a;

        static {
            Covode.recordClassIndex(83466);
        }

        c(DuetEditStickerLayout duetEditStickerLayout) {
            this.f127248a = duetEditStickerLayout;
        }

        public final void run() {
            float f2;
            DuetEditStickerLayout duetEditStickerLayout = this.f127248a;
            DuetEditStickerView duetEditStickerView = duetEditStickerLayout.f127238e;
            if (duetEditStickerView != null) {
                duetEditStickerLayout.f127237d.f127267d = (float) ((duetEditStickerLayout.getWidth() - duetEditStickerView.getWidth()) / 2);
                duetEditStickerLayout.f127237d.f127268e = ((((float) duetEditStickerLayout.getHeight()) - duetEditStickerLayout.f127244k) - ((float) duetEditStickerView.getHeight())) / 2.0f;
            }
            int i2 = this.f127248a.f127243j;
            if (i2 == b.f127307c) {
                DuetEditStickerLayout duetEditStickerLayout2 = this.f127248a;
                duetEditStickerLayout2.f127243j = b.f127305a;
                duetEditStickerLayout2.f127240g = false;
                if (!duetEditStickerLayout2.f127239f) {
                    DuetEditStickerView duetEditStickerView2 = duetEditStickerLayout2.f127238e;
                    if (duetEditStickerView2 != null) {
                        duetEditStickerView2.setVisibility(0);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(duetEditStickerView2, "scaleX", duetEditStickerLayout2.f127236c.f127264a, duetEditStickerLayout2.f127237d.f127264a);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(duetEditStickerView2, "scaleY", duetEditStickerLayout2.f127236c.f127265b, duetEditStickerLayout2.f127237d.f127265b);
                        float[] fArr = new float[2];
                        fArr[0] = duetEditStickerLayout2.f127236c.f127266c;
                        if (duetEditStickerLayout2.f127236c.f127266c > 180.0f) {
                            f2 = 360.0f;
                        } else {
                            f2 = duetEditStickerLayout2.f127237d.f127266c;
                        }
                        fArr[1] = f2;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(duetEditStickerView2, "rotation", fArr);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(duetEditStickerView2, "x", duetEditStickerLayout2.f127236c.f127267d, duetEditStickerLayout2.f127237d.f127267d);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(duetEditStickerView2, "y", duetEditStickerLayout2.f127236c.f127268e, duetEditStickerLayout2.f127237d.f127268e);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(300L);
                        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                        animatorSet.addListener(new e(duetEditStickerView2));
                        animatorSet.start();
                    }
                    duetEditStickerLayout2.f127239f = true;
                }
            } else if (i2 == b.f127306b) {
                DuetEditStickerLayout duetEditStickerLayout3 = this.f127248a;
                duetEditStickerLayout3.f127243j = b.f127305a;
                duetEditStickerLayout3.f127240g = false;
                if (!duetEditStickerLayout3.f127239f) {
                    DuetEditStickerView duetEditStickerView3 = duetEditStickerLayout3.f127238e;
                    if (duetEditStickerView3 != null) {
                        duetEditStickerLayout3.f127236c.f127267d = (float) ((duetEditStickerLayout3.getWidth() - duetEditStickerView3.getWidth()) / 2);
                        duetEditStickerLayout3.f127236c.f127268e = ((duetEditStickerLayout3.f127241h.x - ((float) duetEditStickerView3.getHeight())) / 2.0f) + duetEditStickerLayout3.f127241h.y;
                        duetEditStickerView3.setX(duetEditStickerLayout3.f127237d.f127267d);
                        duetEditStickerView3.setY(duetEditStickerLayout3.f127237d.f127268e);
                        duetEditStickerView3.setVisibility(0);
                        duetEditStickerLayout3.requestLayout();
                        DuetEditStickerView duetEditStickerView4 = duetEditStickerLayout3.f127238e;
                        if (duetEditStickerView4 != null) {
                            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(duetEditStickerView4, "scaleX", 0.0f, 1.0f);
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(duetEditStickerView4, "scaleY", 0.0f, 1.0f);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.setDuration(300L);
                            animatorSet2.play(ofFloat6).with(ofFloat7);
                            animatorSet2.addListener(new d(duetEditStickerView4));
                            animatorSet2.start();
                        }
                    }
                    duetEditStickerLayout3.f127239f = true;
                }
            }
        }
    }

    public final void setBeforeChangeListener(h.f.a.b<? super DuetEditStickerView, z> bVar) {
        this.f127245l = bVar;
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.f127246m = videoPublishEditModel;
    }

    public final void setOnCompleteListener(h.f.a.b<? super DuetEditStickerView, z> bVar) {
        this.f127235b = bVar;
    }

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DuetEditStickerLayout f127247a;

        static {
            Covode.recordClassIndex(83464);
        }

        a(DuetEditStickerLayout duetEditStickerLayout) {
            this.f127247a = duetEditStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.i(7483);
            super.onAnimationEnd(animator);
            this.f127247a.f127242i = null;
            DuetEditStickerLayout duetEditStickerLayout = this.f127247a;
            DuetEditStickerView duetEditStickerView = duetEditStickerLayout.f127238e;
            if (duetEditStickerView != null) {
                FrameLayout frameLayout = duetEditStickerLayout.f127234a;
                if (frameLayout == null) {
                    l.a("container");
                }
                frameLayout.removeView(duetEditStickerView);
                DuetEditStickerView duetEditStickerView2 = duetEditStickerLayout.f127238e;
                if (duetEditStickerView2 != null) {
                    duetEditStickerView2.setScaleX(1.0f);
                    duetEditStickerView2.setScaleY(1.0f);
                    duetEditStickerView2.setRotation(0.0f);
                    duetEditStickerView2.setTranslationX(0.0f);
                    duetEditStickerView2.setTranslationY(0.0f);
                    duetEditStickerLayout.f127236c = new a((byte) 0);
                }
                h.f.a.b<? super DuetEditStickerView, z> bVar = duetEditStickerLayout.f127235b;
                if (bVar != null) {
                    bVar.invoke(duetEditStickerLayout.f127238e);
                }
                duetEditStickerLayout.f127238e = null;
            }
            this.f127247a.setVisibility(4);
            MethodCollector.o(7483);
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DuetEditStickerView f127249a;

        static {
            Covode.recordClassIndex(83467);
        }

        d(DuetEditStickerView duetEditStickerView) {
            this.f127249a = duetEditStickerView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f127249a.a();
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DuetEditStickerView f127250a;

        static {
            Covode.recordClassIndex(83468);
        }

        e(DuetEditStickerView duetEditStickerView) {
            this.f127250a = duetEditStickerView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f127250a.a();
        }
    }

    public final void a(float f2, float f3) {
        this.f127241h.x = f2;
        this.f127241h.y = f3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DuetEditStickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(7894);
        Context context2 = getContext();
        l.b(context2, "");
        this.f127244k = r.a(context2, 380.0f);
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.af5, this, false);
        if (a2 != null) {
            FrameLayout frameLayout = (FrameLayout) a2;
            this.f127234a = frameLayout;
            if (frameLayout == null) {
                l.a("container");
            }
            addView(frameLayout);
            setVisibility(4);
            MethodCollector.o(7894);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.o(7894);
        throw nullPointerException;
    }

    public final void a(DuetEditStickerView duetEditStickerView, a aVar) {
        MethodCollector.i(7818);
        l.d(aVar, "");
        setVisibility(0);
        if (duetEditStickerView != null) {
            this.f127243j = b.f127307c;
            this.f127236c = aVar;
            float f2 = aVar.f127266c % 360.0f;
            if (f2 < 0.0f) {
                f2 += 360.0f;
            }
            aVar.f127266c = f2;
            this.f127238e = duetEditStickerView;
            ViewParent parent = duetEditStickerView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f127238e);
            }
            FrameLayout frameLayout = this.f127234a;
            if (frameLayout == null) {
                l.a("container");
            }
            frameLayout.addView(duetEditStickerView);
            setVisibility(0);
            DuetEditStickerView duetEditStickerView2 = this.f127238e;
            if (duetEditStickerView2 != null) {
                duetEditStickerView2.setVisibility(4);
            }
        } else {
            this.f127243j = b.f127306b;
            Context context = getContext();
            l.b(context, "");
            DuetEditStickerView duetEditStickerView3 = new DuetEditStickerView(context, this.f127246m);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            duetEditStickerView3.setVisibility(4);
            FrameLayout frameLayout2 = this.f127234a;
            if (frameLayout2 == null) {
                l.a("container");
            }
            frameLayout2.addView(duetEditStickerView3, layoutParams);
            this.f127238e = duetEditStickerView3;
        }
        DuetEditStickerView duetEditStickerView4 = this.f127238e;
        if (duetEditStickerView4 != null) {
            duetEditStickerView4.setSheetDismissListener(new b(this));
        }
        DuetEditStickerView duetEditStickerView5 = this.f127238e;
        if (duetEditStickerView5 != null) {
            duetEditStickerView5.post(new c(this));
            MethodCollector.o(7818);
            return;
        }
        MethodCollector.o(7818);
    }
}

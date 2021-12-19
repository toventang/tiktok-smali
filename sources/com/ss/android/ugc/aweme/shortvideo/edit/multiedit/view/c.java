package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.q;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.z;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class c extends b {
    private float A;
    private float B;

    /* renamed from: k  reason: collision with root package name */
    public View f127997k;

    /* renamed from: l  reason: collision with root package name */
    public View f127998l;

    /* renamed from: m  reason: collision with root package name */
    public View f127999m;
    public TextView n;
    public RecyclerView o;
    public int p;
    public int q;
    public ValueAnimator r;
    public androidx.core.g.e<Integer, Integer> s;
    public AnimatorSet t;
    public View u;
    public com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a v;
    private View w;
    private View x;
    private View y;
    private float z = 1.0f;

    static {
        Covode.recordClassIndex(83890);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(boolean z2, int i2) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(100L);
            ofFloat.addUpdateListener(new b(this));
            this.r = ofFloat;
        } else {
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
            if (aVar == null) {
                l.a("videoSegmentAdapter");
            }
            RecyclerView recyclerView = this.o;
            if (recyclerView == null) {
                l.a("videoRecyclerView");
            }
            int a2 = aVar.a(recyclerView, i2);
            View view = this.f127997k;
            if (view == null) {
                l.a("animTabDot");
            }
            float f2 = (float) a2;
            View view2 = this.f127997k;
            if (view2 == null) {
                l.a("animTabDot");
            }
            view.setX(f2 - ((float) (view2.getMeasuredWidth() / 2)));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setDuration(100L);
            ofFloat2.addUpdateListener(new C3337c(this));
            this.r = ofFloat2;
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar2 = this.v;
            if (aVar2 == null) {
                l.a("videoSegmentAdapter");
            }
            aVar2.f126300b = i2;
        }
        ValueAnimator valueAnimator2 = this.r;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void f() {
        l().c();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void k() {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
        if (aVar == null) {
            l.a("videoSegmentAdapter");
        }
        aVar.f127851k.a();
    }

    private final void r() {
        View view = this.y;
        if (view == null) {
            l.a("singleEditLayout");
        }
        view.setVisibility(0);
        View view2 = this.f127998l;
        if (view2 == null) {
            l.a("ivSave");
        }
        view2.setVisibility(8);
        View view3 = this.f127999m;
        if (view3 == null) {
            l.a("ivCancel");
        }
        view3.setVisibility(8);
        TextView textView = this.n;
        if (textView == null) {
            l.a("singleEditTitle");
        }
        textView.setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void h() {
        s();
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
        if (aVar == null) {
            l.a("videoSegmentAdapter");
        }
        aVar.f126302d = true;
        TextView textView = this.n;
        if (textView == null) {
            l.a("singleEditTitle");
        }
        textView.setVisibility(8);
        c();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void i() {
        View view = this.f127997k;
        if (view == null) {
            l.a("animTabDot");
        }
        view.setVisibility(0);
        m().setVisibility(0);
        n().setVisibility(0);
        View view2 = this.w;
        if (view2 == null) {
            l.a("ivDelete");
        }
        view2.setVisibility(8);
        View view3 = this.x;
        if (view3 == null) {
            l.a("tvVideoSegmentDes");
        }
        view3.setVisibility(0);
        o().setVisibility(8);
    }

    static final class e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128004a;

        static {
            Covode.recordClassIndex(83895);
        }

        e(c cVar) {
            this.f128004a = cVar;
        }

        public final boolean onPreDraw() {
            ValueAnimator valueAnimator = this.f128004a.r;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                int a2 = c.a(this.f128004a).a(c.b(this.f128004a), c.a(this.f128004a).f126300b);
                if (a2 == -1) {
                    c.c(this.f128004a).setVisibility(8);
                } else {
                    if (c.c(this.f128004a).getVisibility() == 8) {
                        c.c(this.f128004a).setVisibility(0);
                    }
                    c.c(this.f128004a).setX(((float) a2) - ((float) (c.c(this.f128004a).getMeasuredWidth() / 2)));
                }
            }
            return true;
        }
    }

    private final void s() {
        View view = this.f127998l;
        if (view == null) {
            l.a("ivSave");
        }
        view.setVisibility(8);
        View view2 = this.f127999m;
        if (view2 == null) {
            l.a("ivCancel");
        }
        view2.setVisibility(8);
        View view3 = this.y;
        if (view3 == null) {
            l.a("singleEditLayout");
        }
        view3.setVisibility(8);
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            l.a("videoRecyclerView");
        }
        recyclerView.setVisibility(0);
        TextView textView = this.n;
        if (textView == null) {
            l.a("singleEditTitle");
        }
        textView.setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void g() {
        r();
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            l.a("videoRecyclerView");
        }
        recyclerView.setVisibility(8);
        View view = this.f127998l;
        if (view == null) {
            l.a("ivSave");
        }
        view.setVisibility(0);
        View view2 = this.f127999m;
        if (view2 == null) {
            l.a("ivCancel");
        }
        view2.setVisibility(0);
        TextView textView = this.n;
        if (textView == null) {
            l.a("singleEditTitle");
        }
        textView.setVisibility(0);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
        if (aVar == null) {
            l.a("videoSegmentAdapter");
        }
        aVar.f126302d = false;
        View view3 = this.y;
        if (view3 == null) {
            l.a("singleEditLayout");
        }
        view3.setVisibility(0);
        c();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void j() {
        View view = this.f127997k;
        if (view == null) {
            l.a("animTabDot");
        }
        view.setVisibility(4);
        m().setVisibility(4);
        n().setVisibility(4);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
        if (aVar == null) {
            l.a("videoSegmentAdapter");
        }
        if (aVar.a().size() == 1) {
            View view2 = this.w;
            if (view2 == null) {
                l.a("ivDelete");
            }
            view2.setAlpha(0.5f);
        } else {
            View view3 = this.w;
            if (view3 == null) {
                l.a("ivDelete");
            }
            view3.setAlpha(1.0f);
        }
        View view4 = this.w;
        if (view4 == null) {
            l.a("ivDelete");
        }
        view4.setVisibility(0);
        o().setVisibility(0);
        View view5 = this.x;
        if (view5 == null) {
            l.a("tvVideoSegmentDes");
        }
        view5.setVisibility(4);
    }

    public static final class g implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f128012b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AnimatorListenerAdapter f128013c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f128014d;

        static {
            Covode.recordClassIndex(83898);
        }

        public final boolean onPreDraw() {
            View rootView = c.b(this.f128011a).getRootView();
            l.b(rootView, "");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f128011a.s == null) {
                return false;
            }
            RecyclerView b2 = c.b(this.f128011a);
            ArrayList arrayList = new ArrayList();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.play(ObjectAnimator.ofFloat(b2, "alpha", 0.0f, 1.0f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(300L);
            animatorSet2.play(ObjectAnimator.ofFloat(c.d(this.f128011a), "alpha", 1.0f, 0.0f));
            animatorSet2.play(ObjectAnimator.ofFloat(c.e(this.f128011a), "alpha", 1.0f, 0.0f));
            animatorSet2.play(ObjectAnimator.ofFloat(c.f(this.f128011a), "alpha", 1.0f, 0.0f));
            arrayList.add(animatorSet2);
            arrayList.add(animatorSet);
            c cVar = this.f128011a;
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            animatorSet3.addListener(new a(this, arrayList));
            cVar.t = animatorSet3;
            AnimatorSet animatorSet4 = this.f128011a.t;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
            c.a(this.f128011a).f126300b = this.f128014d;
            return false;
        }

        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f128015a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ArrayList f128016b;

            static {
                Covode.recordClassIndex(83899);
            }

            public final void onAnimationEnd(Animator animator) {
                AnimatorListenerAdapter animatorListenerAdapter;
                l.d(animator, "");
                super.onAnimationEnd(animator);
                if (this.f128015a.f128012b != null && !this.f128015a.f128012b.isFinishing() && (animatorListenerAdapter = this.f128015a.f128013c) != null) {
                    animatorListenerAdapter.onAnimationEnd(animator);
                }
            }

            a(g gVar, ArrayList arrayList) {
                this.f128015a = gVar;
                this.f128016b = arrayList;
            }
        }

        g(c cVar, androidx.fragment.app.e eVar, AnimatorListenerAdapter animatorListenerAdapter, int i2) {
            this.f128011a = cVar;
            this.f128012b = eVar;
            this.f128013c = animatorListenerAdapter;
            this.f128014d = i2;
        }
    }

    public static final class f implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f128006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f128007c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AnimatorListenerAdapter f128008d;

        static {
            Covode.recordClassIndex(83896);
        }

        public final boolean onPreDraw() {
            RecyclerView.ViewHolder f2;
            View rootView = c.b(this.f128005a).getRootView();
            l.b(rootView, "");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerView.ViewHolder f3 = c.b(this.f128005a).f(this.f128006b);
            RecyclerView b2 = c.b(this.f128005a);
            int i2 = this.f128006b;
            androidx.core.g.e<Integer, Integer> a2 = com.ss.android.ugc.aweme.ba.d.a(b2);
            F f4 = a2.f2397a;
            if (f4 == null) {
                l.b();
            }
            l.b(f4, "");
            Integer num = null;
            if (l.a(i2, f4.intValue()) >= 0) {
                S s = a2.f2398b;
                if (s == null) {
                    l.b();
                }
                l.b(s, "");
                if (l.a(i2, s.intValue()) <= 0) {
                    RecyclerView.a adapter = b2.getAdapter();
                    if (adapter == null || (num = Integer.valueOf(adapter.getItemCount())) == null) {
                        l.b();
                    }
                    if (i2 < num.intValue() && i2 >= 0 && (f2 = b2.f(i2)) != null && f2.itemView != null) {
                        int[] iArr = new int[2];
                        f2.itemView.getLocationInWindow(iArr);
                        int i3 = iArr[0];
                        int i4 = iArr[1];
                        int i5 = iArr[0];
                        View view = f2.itemView;
                        l.b(view, "");
                        int width = i5 + view.getWidth();
                        int i6 = iArr[1];
                        View view2 = f2.itemView;
                        l.b(view2, "");
                        new Rect(i3, i4, width, i6 + view2.getHeight());
                        if (f3 != null) {
                            c cVar = this.f128005a;
                            View view3 = f3.itemView;
                            l.b(view3, "");
                            cVar.u = view3;
                            c cVar2 = this.f128005a;
                            cVar2.s = com.ss.android.ugc.aweme.ba.d.a(c.b(cVar2));
                            RecyclerView b3 = c.b(this.f128005a);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.setDuration(300L);
                            animatorSet.play(ObjectAnimator.ofFloat(b3, "alpha", 1.0f, 0.0f));
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.setDuration(300L);
                            animatorSet2.play(ObjectAnimator.ofFloat(c.d(this.f128005a), "alpha", 0.0f, 1.0f));
                            animatorSet2.play(ObjectAnimator.ofFloat(c.e(this.f128005a), "alpha", 0.0f, 1.0f));
                            animatorSet2.play(ObjectAnimator.ofFloat(c.f(this.f128005a), "alpha", 0.0f, 1.0f));
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(animatorSet);
                            arrayList.add(animatorSet2);
                            c cVar3 = this.f128005a;
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            animatorSet3.playTogether(arrayList);
                            animatorSet3.addListener(new a(this, arrayList));
                            cVar3.t = animatorSet3;
                            AnimatorSet animatorSet4 = this.f128005a.t;
                            if (animatorSet4 != null) {
                                animatorSet4.start();
                            }
                        }
                    }
                }
            }
            return false;
        }

        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f128009a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ArrayList f128010b;

            static {
                Covode.recordClassIndex(83897);
            }

            public final void onAnimationEnd(Animator animator) {
                AnimatorListenerAdapter animatorListenerAdapter;
                l.d(animator, "");
                super.onAnimationEnd(animator);
                if (this.f128009a.f128007c != null && !this.f128009a.f128007c.isFinishing() && (animatorListenerAdapter = this.f128009a.f128008d) != null) {
                    animatorListenerAdapter.onAnimationEnd(animator);
                }
            }

            a(f fVar, ArrayList arrayList) {
                this.f128009a = fVar;
                this.f128010b = arrayList;
            }
        }

        f(c cVar, int i2, androidx.fragment.app.e eVar, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f128005a = cVar;
            this.f128006b = i2;
            this.f128007c = eVar;
            this.f128008d = animatorListenerAdapter;
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a a(c cVar) {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = cVar.v;
        if (aVar == null) {
            l.a("videoSegmentAdapter");
        }
        return aVar;
    }

    public static final /* synthetic */ RecyclerView b(c cVar) {
        RecyclerView recyclerView = cVar.o;
        if (recyclerView == null) {
            l.a("videoRecyclerView");
        }
        return recyclerView;
    }

    public static final /* synthetic */ View c(c cVar) {
        View view = cVar.f127997k;
        if (view == null) {
            l.a("animTabDot");
        }
        return view;
    }

    public static final /* synthetic */ TextView d(c cVar) {
        TextView textView = cVar.n;
        if (textView == null) {
            l.a("singleEditTitle");
        }
        return textView;
    }

    public static final /* synthetic */ View e(c cVar) {
        View view = cVar.f127999m;
        if (view == null) {
            l.a("ivCancel");
        }
        return view;
    }

    public static final /* synthetic */ View f(c cVar) {
        View view = cVar.f127998l;
        if (view == null) {
            l.a("ivSave");
        }
        return view;
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128001a;

        static {
            Covode.recordClassIndex(83892);
        }

        b(c cVar) {
            this.f128001a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c2 = c.c(this.f128001a);
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c2.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$c  reason: collision with other inner class name */
    static final class C3337c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128002a;

        static {
            Covode.recordClassIndex(83893);
        }

        C3337c(c cVar) {
            this.f128002a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c2 = c.c(this.f128002a);
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c2.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(VideoSegment videoSegment) {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
        if (aVar == null) {
            l.a("videoSegmentAdapter");
        }
        aVar.a(videoSegment);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void b(androidx.core.g.e<Float, Float> eVar) {
        l.d(eVar, "");
        l().a(eVar, true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(View.OnClickListener onClickListener) {
        super.a(onClickListener);
        View view = this.w;
        if (view == null) {
            l.a("ivDelete");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.f127998l;
        if (view2 == null) {
            l.a("ivSave");
        }
        view2.setOnClickListener(onClickListener);
        View view3 = this.f127999m;
        if (view3 == null) {
            l.a("ivCancel");
        }
        view3.setOnClickListener(onClickListener);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void b(VideoSegment videoSegment) {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
        if (aVar == null) {
            l.a("videoSegmentAdapter");
        }
        aVar.b(videoSegment);
    }

    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128000a;

        static {
            Covode.recordClassIndex(83891);
        }

        a(c cVar) {
            this.f128000a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c2;
            float f2;
            int a2 = c.a(this.f128000a).a(c.b(this.f128000a), this.f128000a.p);
            int a3 = c.a(this.f128000a).a(c.b(this.f128000a), this.f128000a.q);
            if (a2 == -1 && a3 == -1) {
                c.c(this.f128000a).setTranslationX(0.0f);
                c.c(this.f128000a).setVisibility(4);
                return;
            }
            if (a2 < 0 || a3 < 0) {
                c.c(this.f128000a).setVisibility(0);
                c2 = c.c(this.f128000a);
                if (a3 == -1) {
                    f2 = (float) a2;
                } else {
                    f2 = (float) a3;
                }
            } else {
                c.c(this.f128000a).setVisibility(0);
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                f2 = (((Float) animatedValue).floatValue() * ((float) (a3 - a2))) + ((float) a2);
                c2 = c.c(this.f128000a);
            }
            c2.setX(f2 - ((float) (c.c(this.f128000a).getMeasuredWidth() / 2)));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(List<? extends VideoSegment> list) {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
        if (aVar == null) {
            l.a("videoSegmentAdapter");
        }
        if (!k.a(list)) {
            aVar.a((List<VideoSegment>) list);
            aVar.notifyDataSetChanged();
        }
    }

    static final class d implements z.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128003a;

        static {
            Covode.recordClassIndex(83894);
        }

        d(c cVar) {
            this.f128003a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.z.b
        public final void a(int i2, String str) {
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.b bVar = this.f128003a.f127991g;
            if (bVar != null) {
                bVar.a(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(int i2, int i3) {
        if (i2 != i3) {
            RecyclerView recyclerView = this.o;
            if (recyclerView == null) {
                l.a("videoRecyclerView");
            }
            recyclerView.d(i3);
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
            if (aVar == null) {
                l.a("videoSegmentAdapter");
            }
            if (i2 == aVar.f126300b) {
                this.p = i2;
                this.q = i3;
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener(new a(this));
                this.r = ofFloat;
                ofFloat.start();
            } else {
                return;
            }
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar2 = this.v;
        if (aVar2 == null) {
            l.a("videoSegmentAdapter");
        }
        aVar2.f126300b = i3;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void b(androidx.fragment.app.e eVar, int i2, AnimatorListenerAdapter animatorListenerAdapter) {
        this.z = 1.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            l.a("videoRecyclerView");
        }
        recyclerView.b(i2);
        RecyclerView recyclerView2 = this.o;
        if (recyclerView2 == null) {
            l.a("videoRecyclerView");
        }
        v.e(recyclerView2);
        r();
        RecyclerView recyclerView3 = this.o;
        if (recyclerView3 == null) {
            l.a("videoRecyclerView");
        }
        View rootView = recyclerView3.getRootView();
        l.b(rootView, "");
        rootView.getViewTreeObserver().addOnPreDrawListener(new f(this, i2, eVar, animatorListenerAdapter));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(androidx.fragment.app.e eVar, int i2, AnimatorListenerAdapter animatorListenerAdapter) {
        s();
        if (this.s == null) {
            animatorListenerAdapter.onAnimationEnd(null);
            return;
        }
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            l.a("videoRecyclerView");
        }
        View rootView = recyclerView.getRootView();
        l.b(rootView, "");
        rootView.getViewTreeObserver().addOnPreDrawListener(new g(this, eVar, animatorListenerAdapter, i2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(androidx.fragment.app.e eVar, View view, boolean z2) {
        if (eVar != null && view != null) {
            super.a(eVar, view, z2);
            View findViewById = view.findViewById(R.id.bt7);
            l.b(findViewById, "");
            this.w = findViewById;
            View findViewById2 = view.findViewById(R.id.ev4);
            l.b(findViewById2, "");
            this.x = findViewById2;
            View findViewById3 = view.findViewById(R.id.kl);
            l.b(findViewById3, "");
            this.f127997k = findViewById3;
            View findViewById4 = view.findViewById(R.id.ffc);
            l.b(findViewById4, "");
            this.o = (RecyclerView) findViewById4;
            View findViewById5 = view.findViewById(R.id.e4h);
            l.b(findViewById5, "");
            this.n = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.e4e);
            l.b(findViewById6, "");
            this.y = findViewById6;
            View findViewById7 = view.findViewById(R.id.bth);
            l.b(findViewById7, "");
            this.f127998l = findViewById7;
            View findViewById8 = view.findViewById(R.id.bt5);
            l.b(findViewById8, "");
            this.f127999m = findViewById8;
            View findViewById9 = view.findViewById(R.id.ffc);
            l.b(findViewById9, "");
            this.o = (RecyclerView) findViewById9;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(androidx.fragment.app.e eVar, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        if (videoEditViewModel == null) {
            l.b();
        }
        if (cutMultiVideoViewModel == null) {
            l.b();
        }
        if (list == null) {
            l.b();
        }
        this.v = new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a(videoEditViewModel, cutMultiVideoViewModel, list);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar = this.v;
        if (aVar == null) {
            l.a("videoSegmentAdapter");
        }
        n nVar = new n(new q(aVar));
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            l.a("videoRecyclerView");
        }
        nVar.a(recyclerView);
        RecyclerView recyclerView2 = this.o;
        if (recyclerView2 == null) {
            l.a("videoRecyclerView");
        }
        recyclerView2.setLayoutManager(new MultiEditRecyleViewLayoutManager(eVar));
        RecyclerView recyclerView3 = this.o;
        if (recyclerView3 == null) {
            l.a("videoRecyclerView");
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar2 = this.v;
        if (aVar2 == null) {
            l.a("videoSegmentAdapter");
        }
        recyclerView3.setAdapter(aVar2);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar3 = this.v;
        if (aVar3 == null) {
            l.a("videoSegmentAdapter");
        }
        aVar3.f126301c = new d(this);
        RecyclerView recyclerView4 = this.o;
        if (recyclerView4 == null) {
            l.a("videoRecyclerView");
        }
        i iVar = new i();
        iVar.f3831j = 300;
        iVar.f3833l = 300;
        iVar.f3832k = 300;
        iVar.f3830i = 300;
        recyclerView4.setItemAnimator(iVar);
        RecyclerView recyclerView5 = this.o;
        if (recyclerView5 == null) {
            l.a("videoRecyclerView");
        }
        recyclerView5.getViewTreeObserver().addOnPreDrawListener(new e(this));
        RecyclerView recyclerView6 = this.o;
        if (recyclerView6 == null) {
            l.a("videoRecyclerView");
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar4 = this.v;
        if (aVar4 == null) {
            l.a("videoSegmentAdapter");
        }
        recyclerView6.setAdapter(aVar4);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a aVar5 = this.v;
        if (aVar5 == null) {
            l.a("videoSegmentAdapter");
        }
        aVar5.notifyDataSetChanged();
    }
}

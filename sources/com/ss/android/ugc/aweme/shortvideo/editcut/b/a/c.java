package com.ss.android.ugc.aweme.shortvideo.editcut.b.a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VideoLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.q;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.f;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.z;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f128119a;

    /* renamed from: b  reason: collision with root package name */
    public int f128120b = 1;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f128121c;

    /* renamed from: d  reason: collision with root package name */
    public z f128122d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f128123e;

    /* renamed from: f  reason: collision with root package name */
    public View f128124f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f128125g;

    /* renamed from: h  reason: collision with root package name */
    private final m f128126h;

    /* renamed from: i  reason: collision with root package name */
    private final VideoEditViewModel f128127i;

    /* renamed from: j  reason: collision with root package name */
    private final CutMultiVideoViewModel f128128j;

    static {
        Covode.recordClassIndex(83984);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f128121c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f128121c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128129a;

        static {
            Covode.recordClassIndex(83985);
        }

        a(c cVar) {
            this.f128129a = cVar;
        }

        public final boolean onPreDraw() {
            ValueAnimator valueAnimator = this.f128129a.f128121c;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                int a2 = c.a(this.f128129a).a(c.b(this.f128129a), c.a(this.f128129a).f126300b);
                if (a2 == -1) {
                    c.c(this.f128129a).setVisibility(4);
                } else if (this.f128129a.f128120b != 2) {
                    c.c(this.f128129a).setVisibility(0);
                    c.c(this.f128129a).setX(((float) a2) - ((float) (c.c(this.f128129a).getMeasuredWidth() / 2)));
                }
            }
            return true;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128134a;

        static {
            Covode.recordClassIndex(83988);
        }

        d(c cVar) {
            this.f128134a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Integer num = (Integer) obj;
            c cVar = this.f128134a;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 1;
            }
            cVar.f128120b = i2;
        }
    }

    public static final /* synthetic */ z a(c cVar) {
        z zVar = cVar.f128122d;
        if (zVar == null) {
            l.a("videoSegAdapter");
        }
        return zVar;
    }

    public static final /* synthetic */ RecyclerView b(c cVar) {
        RecyclerView recyclerView = cVar.f128123e;
        if (recyclerView == null) {
            l.a("videoRecyclerView");
        }
        return recyclerView;
    }

    public static final /* synthetic */ View c(c cVar) {
        View view = cVar.f128124f;
        if (view == null) {
            l.a("animTabDot");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c$c  reason: collision with other inner class name */
    static final class C3341c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f128132b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f128133c;

        static {
            Covode.recordClassIndex(83987);
        }

        C3341c(c cVar, int i2, int i3) {
            this.f128131a = cVar;
            this.f128132b = i2;
            this.f128133c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c2;
            float f2;
            int a2 = c.a(this.f128131a).a(c.b(this.f128131a), this.f128132b);
            int a3 = c.a(this.f128131a).a(c.b(this.f128131a), this.f128133c);
            if (a2 == -1 && a3 == -1) {
                c.c(this.f128131a).setTranslationX(0.0f);
                c.c(this.f128131a).setVisibility(4);
                return;
            }
            if (a2 < 0 || a3 < 0) {
                c.c(this.f128131a).setVisibility(0);
                c2 = c.c(this.f128131a);
                if (a3 == -1) {
                    f2 = (float) a2;
                } else {
                    f2 = (float) a3;
                }
            } else {
                c.c(this.f128131a).setVisibility(0);
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                f2 = (((Float) animatedValue).floatValue() * ((float) (a3 - a2))) + ((float) a2);
                c2 = c.c(this.f128131a);
            }
            c2.setX(f2 - ((float) (c.c(this.f128131a).getMeasuredWidth() / 2)));
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128135a;

        static {
            Covode.recordClassIndex(83989);
        }

        e(c cVar) {
            this.f128135a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            androidx.core.g.e eVar = (androidx.core.g.e) obj;
            if (eVar != null) {
                c cVar = this.f128135a;
                F f2 = eVar.f2397a;
                if (f2 == null) {
                    l.b();
                }
                l.b(f2, "");
                int intValue = f2.intValue();
                S s = eVar.f2398b;
                if (s == null) {
                    l.b();
                }
                l.b(s, "");
                int intValue2 = s.intValue();
                if (cVar.f128120b != 2) {
                    if (intValue != intValue2) {
                        if (cVar.f128122d != null && System.currentTimeMillis() - cVar.f128119a >= 3000) {
                            if (intValue2 == 0) {
                                i2 = 0;
                            } else {
                                z zVar = cVar.f128122d;
                                if (zVar == null) {
                                    l.a("videoSegAdapter");
                                }
                                if (zVar instanceof com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e) {
                                    z zVar2 = cVar.f128122d;
                                    if (zVar2 == null) {
                                        l.a("videoSegAdapter");
                                    }
                                    Objects.requireNonNull(zVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter");
                                    if (((com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e) zVar2).d()) {
                                        i2 = intValue2 + 1;
                                    }
                                }
                                i2 = intValue2;
                            }
                            RecyclerView recyclerView = cVar.f128123e;
                            if (recyclerView == null) {
                                l.a("videoRecyclerView");
                            }
                            recyclerView.d(i2);
                        }
                        z zVar3 = cVar.f128122d;
                        if (zVar3 == null) {
                            l.a("videoSegAdapter");
                        }
                        if (intValue == zVar3.f126300b) {
                            ValueAnimator valueAnimator = cVar.f128121c;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.setDuration(500L);
                            ofFloat.addUpdateListener(new C3341c(cVar, intValue, intValue2));
                            cVar.f128121c = ofFloat;
                            ValueAnimator valueAnimator2 = cVar.f128121c;
                            if (valueAnimator2 != null) {
                                valueAnimator2.start();
                            }
                        } else {
                            return;
                        }
                    }
                    z zVar4 = cVar.f128122d;
                    if (zVar4 == null) {
                        l.a("videoSegAdapter");
                    }
                    zVar4.f126300b = intValue2;
                }
            }
        }
    }

    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128130a;

        static {
            Covode.recordClassIndex(83986);
        }

        b(c cVar) {
            this.f128130a = cVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer valueOf;
            if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null) {
                return false;
            }
            if (valueOf.intValue() != 0 && valueOf.intValue() != 2 && valueOf.intValue() != 1) {
                return false;
            }
            this.f128130a.f128119a = System.currentTimeMillis();
            return false;
        }
    }

    public c(Context context, m mVar, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel) {
        l.d(context, "");
        l.d(mVar, "");
        l.d(videoEditViewModel, "");
        l.d(cutMultiVideoViewModel, "");
        this.f128125g = context;
        this.f128126h = mVar;
        this.f128127i = videoEditViewModel;
        this.f128128j = cutMultiVideoViewModel;
        videoEditViewModel.f126129b.observe(mVar, new d(this));
        cutMultiVideoViewModel.f125326a.observe(mVar, new e(this));
    }

    public final void a(RecyclerView recyclerView, View view, b bVar, z.b bVar2) {
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e eVar;
        n.a qVar;
        l.d(recyclerView, "");
        l.d(view, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f128123e = recyclerView;
        this.f128124f = view;
        if (bVar.f128115a) {
            VideoEditViewModel videoEditViewModel = this.f128127i;
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f128128j;
            List<VideoSegment> j2 = videoEditViewModel.j();
            l.b(j2, "");
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e eVar2 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e(videoEditViewModel, cutMultiVideoViewModel, j2);
            eVar2.a(bVar.f128117c);
            eVar = eVar2;
        } else {
            VideoEditViewModel videoEditViewModel2 = this.f128127i;
            eVar = new z(videoEditViewModel2, this.f128128j, videoEditViewModel2.j());
        }
        this.f128122d = eVar;
        eVar.f126301c = bVar2;
        z zVar = this.f128122d;
        if (zVar == null) {
            l.a("videoSegAdapter");
        }
        zVar.f126306h = bVar.f128116b;
        if (bVar.f128115a) {
            z zVar2 = this.f128122d;
            if (zVar2 == null) {
                l.a("videoSegAdapter");
            }
            qVar = new f(zVar2);
        } else {
            z zVar3 = this.f128122d;
            if (zVar3 == null) {
                l.a("videoSegAdapter");
            }
            qVar = new q(zVar3);
        }
        n nVar = new n(qVar);
        RecyclerView recyclerView2 = this.f128123e;
        if (recyclerView2 == null) {
            l.a("videoRecyclerView");
        }
        nVar.a(recyclerView2);
        RecyclerView recyclerView3 = this.f128123e;
        if (recyclerView3 == null) {
            l.a("videoRecyclerView");
        }
        recyclerView3.setLayoutManager(new VideoLayoutManager(this.f128125g));
        RecyclerView recyclerView4 = this.f128123e;
        if (recyclerView4 == null) {
            l.a("videoRecyclerView");
        }
        z zVar4 = this.f128122d;
        if (zVar4 == null) {
            l.a("videoSegAdapter");
        }
        recyclerView4.setAdapter(zVar4);
        RecyclerView recyclerView5 = this.f128123e;
        if (recyclerView5 == null) {
            l.a("videoRecyclerView");
        }
        i iVar = new i();
        iVar.f3831j = 300;
        iVar.f3833l = 300;
        iVar.f3832k = 300;
        iVar.f3830i = 300;
        recyclerView5.setItemAnimator(iVar);
        RecyclerView recyclerView6 = this.f128123e;
        if (recyclerView6 == null) {
            l.a("videoRecyclerView");
        }
        recyclerView6.getViewTreeObserver().addOnPreDrawListener(new a(this));
        RecyclerView recyclerView7 = this.f128123e;
        if (recyclerView7 == null) {
            l.a("videoRecyclerView");
        }
        recyclerView7.setOnTouchListener(new b(this));
        z zVar5 = this.f128122d;
        if (zVar5 == null) {
            l.a("videoSegAdapter");
        }
        zVar5.notifyDataSetChanged();
    }
}

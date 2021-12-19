package com.ss.ugc.live.barrage.b;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.barrage.a;
import com.ss.ugc.live.barrage.a.a;
import h.f.b.ab;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f154081b = {new y(ab.a(a.class), "valueAnimator", "getValueAnimator()Landroid/animation/ValueAnimator;")};

    /* renamed from: i  reason: collision with root package name */
    public static final b f154082i = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private com.ss.ugc.live.barrage.a.a f154083a;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList<com.ss.ugc.live.barrage.a.a> f154084c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<com.ss.ugc.live.barrage.a.a> f154085d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.ugc.live.barrage.a f154086e;

    /* renamed from: f  reason: collision with root package name */
    public float f154087f;

    /* renamed from: g  reason: collision with root package name */
    public AbstractC4100a f154088g;

    /* renamed from: h  reason: collision with root package name */
    public final View f154089h;

    /* renamed from: j  reason: collision with root package name */
    private final h f154090j;

    /* renamed from: com.ss.ugc.live.barrage.b.a$a  reason: collision with other inner class name */
    public interface AbstractC4100a {
        static {
            Covode.recordClassIndex(102744);
        }

        void a();

        void b();
    }

    private final ValueAnimator g() {
        return (ValueAnimator) this.f154090j.getValue();
    }

    public abstract void a(com.ss.ugc.live.barrage.a.a aVar);

    public abstract void a(com.ss.ugc.live.barrage.a aVar, float f2);

    public static final class b {
        static {
            Covode.recordClassIndex(102745);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public void a() {
        this.f154084c.clear();
        this.f154085d.clear();
        this.f154086e.clear();
    }

    public int b() {
        return this.f154086e.size() + this.f154085d.size() + this.f154084c.size();
    }

    public final void c() {
        if (!g().isRunning()) {
            g().start();
        }
        f();
    }

    public final void d() {
        if (g().isRunning()) {
            g().cancel();
        }
    }

    static final class d extends m implements h.f.a.a<ValueAnimator> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(102747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ValueAnimator invoke() {
            a aVar = this.this$0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            l.a((Object) ofFloat, "");
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new c(aVar));
            return ofFloat;
        }
    }

    static {
        Covode.recordClassIndex(102742);
    }

    public final com.ss.ugc.live.barrage.a.a e() {
        com.ss.ugc.live.barrage.a.a aVar;
        try {
            if (this.f154085d.isEmpty()) {
                return null;
            }
            Iterator<com.ss.ugc.live.barrage.a.a> it = this.f154085d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (aVar.f154065h) {
                    break;
                }
            }
            ArrayList<com.ss.ugc.live.barrage.a.a> arrayList = this.f154085d;
            if (arrayList != null) {
                ad.b(arrayList).remove(aVar);
                return aVar;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void f() {
        while (this.f154085d.size() <= 30 && this.f154084c.size() != 0) {
            com.ss.ugc.live.barrage.a.a removeFirst = this.f154084c.removeFirst();
            removeFirst.a(a.AbstractC4098a.c.f154071a);
            if (removeFirst.f154066i) {
                this.f154085d.add(0, removeFirst);
            } else {
                this.f154085d.add(removeFirst);
            }
        }
    }

    public a(View view) {
        l.c(view, "");
        this.f154089h = view;
        com.ss.ugc.live.barrage.a aVar = new com.ss.ugc.live.barrage.a();
        this.f154086e = aVar;
        this.f154090j = h.i.a((h.f.a.a) new d(this));
        aVar.setOnChangeListener(new a.AbstractC4097a(this) {
            /* class com.ss.ugc.live.barrage.b.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f154091a;

            static {
                Covode.recordClassIndex(102743);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f154091a = r1;
            }

            @Override // com.ss.ugc.live.barrage.a.AbstractC4097a
            public final void a(boolean z, com.ss.ugc.live.barrage.a.a aVar) {
                l.c(aVar, "");
                if (z) {
                    AbstractC4100a aVar2 = this.f154091a.f154088g;
                    if (aVar2 != null) {
                        aVar2.a();
                        return;
                    }
                    return;
                }
                AbstractC4100a aVar3 = this.f154091a.f154088g;
                if (aVar3 != null) {
                    aVar3.b();
                }
            }
        });
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f154092a;

        static {
            Covode.recordClassIndex(102746);
        }

        c(a aVar) {
            this.f154092a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f2 = this.f154092a.f154087f;
            l.a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f154092a.f154087f = floatValue;
                float f3 = (floatValue - f2) * 1000.0f;
                if (floatValue < f2) {
                    f3 = ((1.0f - f2) + floatValue) * 1000.0f;
                }
                a aVar = this.f154092a;
                aVar.a(aVar.f154086e, f3);
                if (this.f154092a.f154084c.isEmpty() && this.f154092a.f154085d.isEmpty() && this.f154092a.f154086e.isEmpty()) {
                    this.f154092a.d();
                }
                this.f154092a.f();
                if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
                    this.f154092a.f154089h.invalidate();
                } else {
                    this.f154092a.f154089h.postInvalidate();
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        RectF rectF;
        com.ss.ugc.live.barrage.a.a aVar;
        com.ss.ugc.live.barrage.a.a aVar2;
        RectF rectF2;
        com.ss.ugc.live.barrage.a.a aVar3;
        l.c(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            Iterator it = this.f154086e.iterator();
            while (it.hasNext()) {
                com.ss.ugc.live.barrage.a.a aVar4 = (com.ss.ugc.live.barrage.a.a) it.next();
                if (aVar4.f154067j.contains(motionEvent.getX(), motionEvent.getY()) && aVar4.a(motionEvent)) {
                    this.f154083a = aVar4;
                    return true;
                }
            }
        } else if (action == 1) {
            com.ss.ugc.live.barrage.a.a aVar5 = this.f154083a;
            if (aVar5 == null || (rectF = aVar5.f154067j) == null || !rectF.contains(motionEvent.getX(), motionEvent.getY()) || (aVar = this.f154083a) == null) {
                return false;
            }
            return aVar.a(motionEvent);
        } else if ((action != 2 && action != 3) || (aVar2 = this.f154083a) == null || (rectF2 = aVar2.f154067j) == null || !rectF2.contains(motionEvent.getX(), motionEvent.getY()) || (aVar3 = this.f154083a) == null) {
            return false;
        } else {
            return aVar3.a(motionEvent);
        }
        return false;
    }

    public final void a(com.ss.ugc.live.barrage.a.a aVar, boolean z) {
        l.c(aVar, "");
        if (z) {
            this.f154084c.add(0, aVar);
        } else {
            this.f154084c.add(aVar);
        }
        aVar.a(a.AbstractC4098a.b.f154070a);
        a(aVar);
    }
}

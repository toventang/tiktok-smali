package com.ss.android.ugc.gamora.editor.filter.core.a;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.h;
import com.ss.android.ugc.asve.a;
import com.ss.android.ugc.aweme.filter.repository.a.q;
import com.ss.android.ugc.tools.utils.a.c;
import h.f.b.l;

public final class b implements h.a {

    /* renamed from: a  reason: collision with root package name */
    public float f145884a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f145885b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f145886c;

    /* renamed from: d  reason: collision with root package name */
    private final int f145887d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f145888e;

    /* renamed from: f  reason: collision with root package name */
    private final a f145889f;

    /* renamed from: g  reason: collision with root package name */
    private final View f145890g;

    static {
        Covode.recordClassIndex(95860);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a() {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
        l.d(bVar, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(c cVar) {
        l.d(cVar, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void b(com.ss.android.ugc.tools.utils.a.b bVar) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b() {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean d(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean f(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void e(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (!this.f145888e) {
            this.f145886c = false;
        } else {
            this.f145886c = true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.f145888e = false;
        }
    }

    public b(a aVar, View view) {
        l.d(aVar, "");
        l.d(view, "");
        this.f145889f = aVar;
        this.f145890g = view;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(a.b());
        l.b(viewConfiguration, "");
        this.f145887d = viewConfiguration.getScaledPagingTouchSlop();
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
        l.d(bVar, "");
        this.f145888e = true;
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs <= this.f145887d || abs <= abs2 || this.f145885b) {
            return false;
        }
        float width = this.f145884a + (f2 / ((float) this.f145890g.getWidth()));
        this.f145884a = width;
        float min = Math.min(width, 1.0f);
        this.f145884a = min;
        float max = Math.max(min, -1.0f);
        this.f145884a = max;
        a aVar = this.f145889f;
        if (!aVar.f145873e) {
            return false;
        }
        aVar.a(max);
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        ValueAnimator ofFloat;
        float abs;
        float abs2;
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        boolean z = false;
        if (this.f145886c) {
            this.f145886c = false;
            if (!this.f145885b) {
                if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                    a aVar = this.f145889f;
                    float f4 = this.f145884a;
                    if (aVar.f145873e) {
                        int width = aVar.f145876h.a().getWidth();
                        q f5 = aVar.f145878j.f();
                        if (Math.signum(f4) == Math.signum(f2)) {
                            aVar.f145872d = aVar.f145871c;
                            ofFloat = ValueAnimator.ofFloat(f4, 0.0f);
                            l.b(ofFloat, "");
                            abs = (float) ((long) (((float) width) * Math.abs(f4)));
                            abs2 = Math.abs(f2);
                        } else {
                            if (f2 >= 1.0E-5f) {
                                aVar.f145872d = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(f5, Math.max(0, aVar.a(f5) - 1));
                                ofFloat = ValueAnimator.ofFloat(f4, -1.0f);
                                l.b(ofFloat, "");
                            } else {
                                aVar.f145872d = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(f5, Math.min(com.ss.android.ugc.aweme.filter.repository.a.a.c.a(f5).size() - 1, aVar.a(f5) + 1));
                                ofFloat = ValueAnimator.ofFloat(f4, 1.0f);
                                l.b(ofFloat, "");
                            }
                            abs = (float) ((long) (((float) width) * (1.0f - Math.abs(f4))));
                            abs2 = Math.abs(f2);
                        }
                        long min = Math.min((long) (abs / ((abs2 / 1000.0f) / 2.0f)), 400L);
                        ofFloat.setInterpolator(new DecelerateInterpolator());
                        ofFloat.setDuration(min);
                        ofFloat.addUpdateListener(aVar.f145875g);
                        ofFloat.addListener(aVar.f145874f);
                        ofFloat.start();
                        z = true;
                    }
                }
                this.f145884a = 0.0f;
            }
        }
        return z;
    }
}

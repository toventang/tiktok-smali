package com.ss.android.ugc.gamora.recorder.quickupload;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.j;
import com.bytedance.scene.navigation.d;
import com.ss.android.ugc.aweme.scene.a;
import h.f.b.l;

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final f f148196a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<? extends j> f148197b;

    /* renamed from: c  reason: collision with root package name */
    public final q f148198c;

    /* renamed from: d  reason: collision with root package name */
    public final d f148199d;

    /* renamed from: e  reason: collision with root package name */
    private float f148200e;

    /* renamed from: f  reason: collision with root package name */
    private float f148201f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f148202g;

    /* renamed from: h  reason: collision with root package name */
    private float f148203h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f148204i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f148205j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f148206k;

    /* renamed from: l  reason: collision with root package name */
    private final k f148207l;

    static {
        Covode.recordClassIndex(97681);
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.f
    public final boolean a(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean a2;
        j d2;
        View view;
        boolean z3;
        boolean a3;
        j d3;
        View view2;
        l.d(motionEvent, "");
        if (this.f148198c.D()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.f148198c.a(motionEvent) || this.f148198c.b(motionEvent)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!this.f148202g && z2 && !a.a(this.f148199d, this.f148197b)) {
                    this.f148198c.E();
                    this.f148203h = motionEvent.getRawY();
                    this.f148202g = true;
                }
                this.f148200e = motionEvent.getRawX();
                this.f148201f = motionEvent.getRawY();
            } else if (action == 1) {
                float rawY = motionEvent.getRawY() - this.f148203h;
                if (!a.a(this.f148199d, this.f148197b) || rawY >= 0.0f || (d2 = this.f148199d.d()) == null || (view = d2.n) == null || view.getVisibility() != 0) {
                    a2 = this.f148198c.a(this.f148202g);
                } else {
                    a2 = this.f148198c.a(this.f148202g, rawY);
                }
                this.f148202g = a2;
                this.f148206k = false;
            } else if (action == 2) {
                if (!this.f148206k) {
                    if (Math.abs(motionEvent.getRawX() - this.f148200e) < Math.abs(motionEvent.getRawY() - this.f148201f)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f148205j = z3;
                    this.f148206k = true;
                }
                if (this.f148205j && a.a(this.f148199d, this.f148197b)) {
                    this.f148202g = this.f148198c.a(this.f148202g, motionEvent, this.f148203h);
                }
            } else if (action == 3) {
                float rawY2 = motionEvent.getRawY() - this.f148203h;
                if (!a.a(this.f148199d, this.f148197b) || rawY2 >= 0.0f || (d3 = this.f148199d.d()) == null || (view2 = d3.n) == null || view2.getVisibility() != 0) {
                    a3 = this.f148198c.a(this.f148202g);
                } else {
                    a3 = this.f148198c.a(this.f148202g, rawY2);
                }
                this.f148202g = a3;
                this.f148206k = false;
            }
        }
        if (motionEvent.getAction() == 0) {
            if (this.f148198c.a(motionEvent) || this.f148198c.b(motionEvent)) {
                z = true;
            } else {
                z = false;
            }
            this.f148204i = z;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !this.f148204i) {
            this.f148202g = this.f148198c.a(this.f148202g);
            this.f148207l.f148219d.a("click");
        }
        return false;
    }

    public g(f fVar, Class<? extends j> cls, q qVar, d dVar) {
        l.d(fVar, "");
        l.d(cls, "");
        l.d(qVar, "");
        l.d(dVar, "");
        this.f148196a = fVar;
        this.f148197b = cls;
        this.f148198c = qVar;
        this.f148199d = dVar;
        Object a2 = fVar.a(k.class);
        l.b(a2, "");
        this.f148207l = (k) a2;
    }
}

package com.ss.android.ugc.aweme.canvas;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.a.a;
import com.ss.android.ugc.aweme.canvas.m;
import com.ss.android.ugc.aweme.editSticker.interact.view.e;
import com.ss.android.ugc.tools.utils.a.c;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import h.f.a.b;
import h.f.b.l;
import h.p;
import h.v;
import h.z;
import java.util.HashMap;

public final class x extends a {

    /* renamed from: a  reason: collision with root package name */
    boolean f69758a = true;

    /* renamed from: b  reason: collision with root package name */
    VESize f69759b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69760c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69761d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f69762e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f69763f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f69764g;

    /* renamed from: h  reason: collision with root package name */
    public int f69765h;

    /* renamed from: i  reason: collision with root package name */
    public CanvasVideoData f69766i;

    /* renamed from: j  reason: collision with root package name */
    private int f69767j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<Integer, PointF> f69768k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private p<Float, Float> f69769l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f69770m;
    private boolean n;
    private boolean o;
    private final m p;
    private final b<Boolean, z> q;

    static {
        Covode.recordClassIndex(43009);
    }

    private final void e() {
        this.f69760c = true;
        this.f69761d = true;
    }

    private final boolean d() {
        if (this.f69767j < 2 || !this.f69758a) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f69760c = false;
        this.f69768k.clear();
        this.o = false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final void b(com.ss.android.ugc.tools.utils.a.b bVar) {
        super.b(bVar);
        this.n = false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(c cVar) {
        if (!d() || !this.f69763f) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean b(float f2) {
        if (!d() || !this.f69763f) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean c(float f2) {
        if (!d() || !this.f69762e) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        if (!d() || !this.f69762e) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(float f2) {
        float degrees = (float) Math.toDegrees((double) f2);
        if (!d() || !this.f69763f) {
            return false;
        }
        if (Math.abs(degrees) < 10.0f && degrees != 0.0f) {
            e();
            m mVar = this.p;
            float f3 = -degrees;
            if (mVar.a()) {
                e eVar = mVar.f69710a;
                if (eVar != null && 4 == eVar.a(mVar.c(), true)) {
                    f3 = eVar.a(f3);
                }
                m.a b2 = mVar.b();
                b2.f69717a += f3;
                l lVar = mVar.f69711b;
                int i2 = (int) b2.f69717a;
                if (lVar.a()) {
                    int i3 = i2 % 360;
                    if (i3 < 0) {
                        i3 += 360;
                    }
                    lVar.b().degree = i3;
                    lVar.f69708d.setValue(lVar.b());
                }
            }
        }
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        if (scaleGestureDetector == null) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!d() || !this.f69762e) {
            return false;
        }
        if (scaleFactor == 1.0f) {
            return true;
        }
        e();
        m mVar = this.p;
        if (!mVar.a()) {
            return true;
        }
        m.a b2 = mVar.b();
        b2.f69718b = Math.min(Math.max(b2.f69718b * scaleFactor, mVar.f69713d), mVar.f69714e);
        l lVar = mVar.f69711b;
        float f2 = b2.f69718b;
        if (!lVar.a()) {
            return true;
        }
        lVar.b().scaleFactor = f2;
        lVar.f69708d.setValue(lVar.b());
        return true;
    }

    @Override // com.bytedance.f.a.a.a.a, com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final void e(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                this.f69767j++;
                                this.f69768k.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
                                return;
                            } else if (actionMasked == 6) {
                                this.f69767j--;
                                return;
                            } else {
                                return;
                            }
                        }
                    } else if (this.f69760c) {
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i2 = 0; i2 < pointerCount; i2++) {
                            PointF pointF = this.f69768k.get(Integer.valueOf(motionEvent.getPointerId(i2)));
                            if (pointF != null) {
                                if (Math.sqrt(Math.pow((double) (pointF.x - motionEvent.getX(i2)), 2.0d) + Math.pow((double) (pointF.y - motionEvent.getY(i2)), 2.0d)) > 5.0d) {
                                    if (!this.o) {
                                        this.q.invoke(false);
                                        this.o = true;
                                        l.d("hide panel", "");
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                this.f69767j = 0;
                l.d("reset", "");
                if (this.f69760c) {
                    e eVar = this.p.f69710a;
                    if (eVar != null) {
                        eVar.b();
                    }
                    this.q.invoke(true);
                }
                c();
                return;
            }
            this.f69767j = 1;
            this.f69768k.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        }
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
        PointF pointF;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (bVar != null) {
            PointF pointF2 = bVar.f149983i;
            if (this.f69767j >= this.f69765h && this.f69758a && this.f69764g && this.f69770m) {
                if (this.f69760c || pointF2.x >= 1.0f || pointF2.y >= 1.0f) {
                    e();
                    m mVar = this.p;
                    float f2 = pointF2.x;
                    float f3 = pointF2.y;
                    if (mVar.a()) {
                        e eVar = mVar.f69710a;
                        if (eVar == null || 3 != eVar.a(mVar.c(), false)) {
                            pointF = new PointF(f2, f3);
                        } else {
                            PointF[] c2 = mVar.c();
                            for (PointF pointF3 : c2) {
                                pointF3.x += f2;
                                pointF3.y += f3;
                            }
                            pointF = eVar.a(c2, f2, f3);
                        }
                        mVar.b().f69720d.offset(pointF.x, pointF.y);
                        l lVar = mVar.f69711b;
                        float f4 = pointF.x;
                        float f5 = pointF.y;
                        if (lVar.a()) {
                            VEVideoTransformFilterParam b2 = lVar.b();
                            float f6 = b2.transX;
                            VESize vESize = lVar.f69706b;
                            if (vESize == null) {
                                l.a("veSize");
                            }
                            b2.transX = f6 + (f4 / ((float) vESize.width));
                            VEVideoTransformFilterParam b3 = lVar.b();
                            float f7 = b3.transY;
                            VESize vESize2 = lVar.f69706b;
                            if (vESize2 == null) {
                                l.a("veSize");
                            }
                            b3.transY = f7 + (f5 / ((float) vESize2.height));
                            lVar.f69708d.setValue(lVar.b());
                        }
                    }
                }
                z = true;
            }
        }
        this.n = z;
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public x(m mVar, b<? super Boolean, z> bVar) {
        l.d(mVar, "");
        l.d(bVar, "");
        this.p = mVar;
        this.q = bVar;
        Float valueOf = Float.valueOf(0.0f);
        this.f69769l = v.a(valueOf, valueOf);
        this.f69762e = true;
        this.f69764g = true;
        this.f69765h = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ec, code lost:
        if (r13 <= r3) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
        if (r0 == null) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0131  */
    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.tools.utils.a.b r16, float r17, float r18) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.canvas.x.a(com.ss.android.ugc.tools.utils.a.b, float, float):boolean");
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.n) {
            return true;
        }
        return super.b(motionEvent, motionEvent2, f2, f3);
    }
}

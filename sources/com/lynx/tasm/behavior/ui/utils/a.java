package com.lynx.tasm.behavior.ui.utils;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.utils.c;
import com.lynx.tasm.utils.i;
import java.lang.ref.WeakReference;

public class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<LynxUI> f56392a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f56393b;

    /* renamed from: c  reason: collision with root package name */
    public float f56394c;

    /* renamed from: i  reason: collision with root package name */
    private i.a f56395i;

    static {
        Covode.recordClassIndex(35186);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0230, code lost:
        if (r10.equals("rotateZ") == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x02aa, code lost:
        if (r10.equals("rotate") == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x02ae, code lost:
        r12 = com.lynx.tasm.behavior.ui.utils.h.a(r1);
        r5[0] = java.lang.Math.cos(r12);
        r5[1] = java.lang.Math.sin(r12);
        r5[4] = -java.lang.Math.sin(r12);
        r5[5] = java.lang.Math.cos(r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<com.lynx.tasm.behavior.ui.utils.i> r104) {
        /*
        // Method dump skipped, instructions count: 2250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.a.a(java.util.List):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.utils.e
    public final BackgroundDrawable a() {
        LynxUI lynxUI = this.f56392a.get();
        if (lynxUI == null) {
            return null;
        }
        BackgroundDrawable a2 = super.a();
        Drawable background = lynxUI.mView.getBackground();
        j.a(lynxUI.mView, null);
        if (background == null) {
            j.a(lynxUI.mView, a2);
        } else {
            j.a(lynxUI.mView, new LayerDrawable(new Drawable[]{a2, background}));
        }
        return a2;
    }

    public final void b() {
        float f2;
        LynxUI lynxUI = this.f56392a.get();
        if (lynxUI != null) {
            PointF pointF = this.f56393b;
            float f3 = 0.0f;
            if (pointF != null) {
                f2 = 0.0f + this.f56393b.y;
                f3 = pointF.x + 0.0f;
            } else {
                f2 = 0.0f;
            }
            i.a aVar = this.f56395i;
            if (aVar != null) {
                f3 += c.a((float) aVar.f57043d[0]);
                f2 += c.a((float) this.f56395i.f57043d[1]);
            }
            lynxUI.mView.setTranslationX(f3);
            lynxUI.mView.setTranslationY(f2);
        }
    }

    public a(LynxUI lynxUI, j jVar) {
        super(jVar);
        this.f56392a = new WeakReference<>(lynxUI);
    }
}

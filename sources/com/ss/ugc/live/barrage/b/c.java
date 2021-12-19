package com.ss.ugc.live.barrage.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.barrage.a.a;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import h.f.b.l;
import java.util.Iterator;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final BarrageLayout f154097a;

    /* renamed from: j  reason: collision with root package name */
    private final int f154098j;

    /* renamed from: k  reason: collision with root package name */
    private final int f154099k = 2;

    /* renamed from: l  reason: collision with root package name */
    private final int f154100l = 7000;

    static {
        Covode.recordClassIndex(102749);
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final void a() {
        d();
        super.a();
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final void a(a aVar) {
        l.c(aVar, "");
        c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(BarrageLayout barrageLayout, int i2) {
        super(barrageLayout);
        l.c(barrageLayout, "");
        this.f154097a = barrageLayout;
        this.f154098j = i2;
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final void a(com.ss.ugc.live.barrage.a aVar, float f2) {
        l.c(aVar, "");
        int width = this.f154097a.getWidth();
        int height = this.f154097a.getHeight();
        this.f154097a.postInvalidate();
        float[] fArr = new float[this.f154099k];
        float f3 = (float) width;
        float f4 = (f2 / ((float) this.f154100l)) * f3;
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.f154067j.right < 0.0f) {
                aVar.remove((Object) aVar2);
            }
            int height2 = (int) ((aVar2.f154067j.bottom - aVar2.f154067j.height()) / ((float) this.f154098j));
            if (aVar2.f154067j.right > fArr[height2]) {
                fArr[height2] = aVar2.f154067j.right;
            }
            aVar2.f154067j.offset(-f4, 0.0f);
        }
        int i2 = this.f154099k;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f154098j * i3 <= height && fArr[i3] < f3) {
                a e2 = e();
                if (e2 != null) {
                    float width2 = e2.f154067j.width();
                    float height3 = e2.f154067j.height();
                    e2.f154067j.left = f3;
                    e2.f154067j.right = width2 + f3;
                    e2.f154067j.top = (float) (this.f154098j * i3);
                    e2.f154067j.bottom = ((float) (this.f154098j * i3)) + height3;
                    aVar.add(e2);
                } else {
                    return;
                }
            }
        }
    }
}

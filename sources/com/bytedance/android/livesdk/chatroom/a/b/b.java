package com.bytedance.android.livesdk.chatroom.a.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b extends com.ss.ugc.live.barrage.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14891a = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private final float[] f14892j;

    /* renamed from: k  reason: collision with root package name */
    private final CopyOnWriteArrayList<Float> f14893k = new CopyOnWriteArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private final PathMeasure f14894l;

    /* renamed from: m  reason: collision with root package name */
    private final BarrageLayout f14895m;
    private final Path n;
    private final int o;

    static {
        Covode.recordClassIndex(8254);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8255);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final void a() {
        d();
        this.f14893k.clear();
        super.a();
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final void a(com.ss.ugc.live.barrage.a.a aVar) {
        l.d(aVar, "");
        c();
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final void a(com.ss.ugc.live.barrage.a aVar, float f2) {
        l.d(aVar, "");
        float f3 = f2 / ((float) this.o);
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            com.ss.ugc.live.barrage.a.a aVar2 = (com.ss.ugc.live.barrage.a.a) it.next();
            int indexOf = aVar.indexOf((Object) aVar2);
            if (aVar2 instanceof com.bytedance.android.livesdk.chatroom.a.a.a) {
                Float f4 = this.f14893k.get(indexOf);
                float[] fArr = new float[2];
                float[] fArr2 = new float[2];
                this.f14894l.getPosTan(f4.floatValue() * this.f14894l.getLength(), fArr, null);
                this.f14894l.getPosTan((f4.floatValue() + f3) * this.f14894l.getLength(), fArr2, null);
                aVar2.f154067j.top += fArr2[1] - fArr[1];
                aVar2.f154067j.bottom += fArr2[1] - fArr[1];
                aVar2.f154067j.left += fArr2[0] - fArr[0];
                aVar2.f154067j.right += fArr2[0] - fArr[0];
                if (f4.floatValue() + f3 > 0.5f) {
                    l.b(f4, "");
                    ((com.bytedance.android.livesdk.chatroom.a.a.a) aVar2).f14878a = (int) (((1.0f - f4.floatValue()) - f3) * 326.4f);
                }
                if (f4.floatValue() + f3 < 0.2f) {
                    ((com.bytedance.android.livesdk.chatroom.a.a.a) aVar2).f14879b = ((f4.floatValue() + f3) * 2.8f) + 0.24f;
                }
                com.bytedance.android.livesdk.chatroom.a.a.a aVar3 = (com.bytedance.android.livesdk.chatroom.a.a.a) aVar2;
                double d2 = aVar3.f14881d;
                double floatValue = (double) f4.floatValue();
                Double.isNaN(floatValue);
                aVar3.f14880c = (float) (Math.sin(d2 + (floatValue * 3.141592653589793d * 8.0d)) * 4.0d);
                this.f14893k.set(indexOf, Float.valueOf(f4.floatValue() + f3));
                if (aVar3.f14878a == 0) {
                    aVar.remove(indexOf);
                    this.f14893k.remove(indexOf);
                }
            }
        }
        for (T t : this.f14893k) {
            if (t.floatValue() >= 1.0f) {
                int indexOf2 = this.f14893k.indexOf(t);
                aVar.remove(indexOf2);
                this.f14893k.remove(indexOf2);
            }
        }
        while (true) {
            com.ss.ugc.live.barrage.a.a e2 = e();
            if (e2 == null) {
                return;
            }
            if (e2 instanceof com.bytedance.android.livesdk.chatroom.a.a.a) {
                float width = e2.f154067j.width();
                float height = e2.f154067j.height();
                e2.f154067j.left = this.f14892j[0];
                e2.f154067j.right = this.f14892j[0] + width;
                e2.f154067j.top = this.f14892j[1];
                e2.f154067j.bottom = this.f14892j[1] + height;
                ((com.bytedance.android.livesdk.chatroom.a.a.a) e2).f14879b = 0.0f;
                aVar.add(e2);
                this.f14893k.add(Float.valueOf(0.0f));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(BarrageLayout barrageLayout, Path path, int i2) {
        super(barrageLayout);
        l.d(barrageLayout, "");
        l.d(path, "");
        this.f14895m = barrageLayout;
        this.n = path;
        this.o = i2;
        float[] fArr = new float[2];
        this.f14892j = fArr;
        PathMeasure pathMeasure = new PathMeasure();
        this.f14894l = pathMeasure;
        pathMeasure.setPath(path, false);
        pathMeasure.getPosTan(0.0f, fArr, null);
    }
}

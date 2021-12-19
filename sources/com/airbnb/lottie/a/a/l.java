package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.e.b.h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class l implements j, m {

    /* renamed from: a  reason: collision with root package name */
    private final Path f5200a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f5201b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f5202c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final String f5203d;

    /* renamed from: e  reason: collision with root package name */
    private final List<m> f5204e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final h f5205f;

    static {
        Covode.recordClassIndex(2197);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5203d;
    }

    /* renamed from: com.airbnb.lottie.a.a.l$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5206a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 2198(0x896, float:3.08E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.e.b.h$a[] r0 = com.airbnb.lottie.e.b.h.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.airbnb.lottie.a.a.l.AnonymousClass1.f5206a = r2
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.e.b.h.a.Merge     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.airbnb.lottie.a.a.l.AnonymousClass1.f5206a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.e.b.h.a.Add     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.airbnb.lottie.a.a.l.AnonymousClass1.f5206a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.e.b.h.a.Subtract     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.airbnb.lottie.a.a.l.AnonymousClass1.f5206a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.e.b.h.a.Intersect     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.airbnb.lottie.a.a.l.AnonymousClass1.f5206a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.e.b.h.a.ExcludeIntersections     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.l.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.airbnb.lottie.a.a.m
    public final Path e() {
        this.f5202c.reset();
        int i2 = AnonymousClass1.f5206a[this.f5205f.f5407b.ordinal()];
        if (i2 == 1) {
            for (int i3 = 0; i3 < this.f5204e.size(); i3++) {
                this.f5202c.addPath(this.f5204e.get(i3).e());
            }
        } else if (i2 == 2) {
            a(Path.Op.UNION);
        } else if (i2 == 3) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i2 == 4) {
            a(Path.Op.INTERSECT);
        } else if (i2 == 5) {
            a(Path.Op.XOR);
        }
        return this.f5202c;
    }

    public l(h hVar) {
        int i2 = Build.VERSION.SDK_INT;
        this.f5203d = hVar.f5406a;
        this.f5205f = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // com.airbnb.lottie.a.a.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ListIterator<com.airbnb.lottie.a.a.c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r3.previous()
            if (r0 != r2) goto L_0x0000
        L_0x000c:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r3.previous()
            com.airbnb.lottie.a.a.c r1 = (com.airbnb.lottie.a.a.c) r1
            boolean r0 = r1 instanceof com.airbnb.lottie.a.a.m
            if (r0 == 0) goto L_0x000c
            java.util.List<com.airbnb.lottie.a.a.m> r0 = r2.f5204e
            r0.add(r1)
            r3.remove()
            goto L_0x000c
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.l.a(java.util.ListIterator):void");
    }

    private void a(Path.Op op) {
        this.f5201b.reset();
        this.f5200a.reset();
        for (int size = this.f5204e.size() - 1; size > 0; size--) {
            m mVar = this.f5204e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> c2 = dVar.c();
                for (int size2 = c2.size() - 1; size2 >= 0; size2--) {
                    Path e2 = c2.get(size2).e();
                    e2.transform(dVar.d());
                    this.f5201b.addPath(e2);
                }
            } else {
                this.f5201b.addPath(mVar.e());
            }
        }
        m mVar2 = this.f5204e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> c3 = dVar2.c();
            for (int i2 = 0; i2 < c3.size(); i2++) {
                Path e3 = c3.get(i2).e();
                e3.transform(dVar2.d());
                this.f5200a.addPath(e3);
            }
        } else {
            this.f5200a.set(mVar2.e());
        }
        this.f5202c.op(this.f5200a, this.f5201b, op);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < this.f5204e.size(); i2++) {
            this.f5204e.get(i2).a(list, list2);
        }
    }
}

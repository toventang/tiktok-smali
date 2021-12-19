package com.bytedance.lottie.a.a;

import android.graphics.Path;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.b.h;
import java.util.ArrayList;
import java.util.List;

public final class k implements i, l {

    /* renamed from: a  reason: collision with root package name */
    private final Path f40361a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f40362b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f40363c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final String f40364d;

    /* renamed from: e  reason: collision with root package name */
    private final List<l> f40365e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final h f40366f;

    static {
        Covode.recordClassIndex(24841);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40364d;
    }

    /* renamed from: com.bytedance.lottie.a.a.k$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40367a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 24842(0x610a, float:3.4811E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.c.b.h$a[] r0 = com.bytedance.lottie.c.b.h.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.a.a.k.AnonymousClass1.f40367a = r2
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.c.b.h.a.Merge     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.a.a.k.AnonymousClass1.f40367a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.c.b.h.a.Add     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.lottie.a.a.k.AnonymousClass1.f40367a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.c.b.h.a.Subtract     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.lottie.a.a.k.AnonymousClass1.f40367a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.c.b.h.a.Intersect     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.lottie.a.a.k.AnonymousClass1.f40367a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.c.b.h.a.ExcludeIntersections     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.a.a.k.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.bytedance.lottie.a.a.l
    public final Path e() {
        this.f40363c.reset();
        int i2 = AnonymousClass1.f40367a[this.f40366f.f40531b.ordinal()];
        if (i2 == 1) {
            for (int i3 = 0; i3 < this.f40365e.size(); i3++) {
                this.f40363c.addPath(this.f40365e.get(i3).e());
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
        return this.f40363c;
    }

    public k(h hVar) {
        int i2 = Build.VERSION.SDK_INT;
        this.f40364d = hVar.f40530a;
        this.f40366f = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // com.bytedance.lottie.a.a.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ListIterator<com.bytedance.lottie.a.a.b> r3) {
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
            com.bytedance.lottie.a.a.b r1 = (com.bytedance.lottie.a.a.b) r1
            boolean r0 = r1 instanceof com.bytedance.lottie.a.a.l
            if (r0 == 0) goto L_0x000c
            java.util.List<com.bytedance.lottie.a.a.l> r0 = r2.f40365e
            r0.add(r1)
            r3.remove()
            goto L_0x000c
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.a.a.k.a(java.util.ListIterator):void");
    }

    private void a(Path.Op op) {
        this.f40362b.reset();
        this.f40361a.reset();
        for (int size = this.f40365e.size() - 1; size > 0; size--) {
            l lVar = this.f40365e.get(size);
            if (lVar instanceof c) {
                c cVar = (c) lVar;
                List<l> c2 = cVar.c();
                for (int size2 = c2.size() - 1; size2 >= 0; size2--) {
                    Path e2 = c2.get(size2).e();
                    e2.transform(cVar.d());
                    this.f40362b.addPath(e2);
                }
            } else {
                this.f40362b.addPath(lVar.e());
            }
        }
        l lVar2 = this.f40365e.get(0);
        if (lVar2 instanceof c) {
            c cVar2 = (c) lVar2;
            List<l> c3 = cVar2.c();
            for (int i2 = 0; i2 < c3.size(); i2++) {
                Path e3 = c3.get(i2).e();
                e3.transform(cVar2.d());
                this.f40361a.addPath(e3);
            }
        } else {
            this.f40361a.set(lVar2.e());
        }
        this.f40363c.op(this.f40361a, this.f40362b, op);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < this.f40365e.size(); i2++) {
            this.f40365e.get(i2).a(list, list2);
        }
    }
}

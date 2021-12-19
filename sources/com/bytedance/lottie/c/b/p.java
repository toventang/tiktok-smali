package com.bytedance.lottie.c.b;

import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.q;
import com.bytedance.lottie.c.a.d;
import com.bytedance.lottie.i;
import java.util.List;

public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40564a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.lottie.c.a.b f40565b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.bytedance.lottie.c.a.b> f40566c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.lottie.c.a.a f40567d;

    /* renamed from: e  reason: collision with root package name */
    public final d f40568e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.lottie.c.a.b f40569f;

    /* renamed from: g  reason: collision with root package name */
    public final a f40570g;

    /* renamed from: h  reason: collision with root package name */
    public final b f40571h;

    /* renamed from: i  reason: collision with root package name */
    public final float f40572i;

    static {
        Covode.recordClassIndex(24907);
    }

    public enum a {
        Butt,
        Round,
        Unknown;

        public final Paint.Cap toPaintCap() {
            int i2 = AnonymousClass1.f40573a[ordinal()];
            if (i2 == 1) {
                return Paint.Cap.BUTT;
            }
            if (i2 != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        static {
            Covode.recordClassIndex(24909);
        }
    }

    public enum b {
        Miter,
        Round,
        Bevel;

        public final Paint.Join toPaintJoin() {
            int i2 = AnonymousClass1.f40574b[ordinal()];
            if (i2 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i2 == 2) {
                return Paint.Join.MITER;
            }
            if (i2 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }

        static {
            Covode.recordClassIndex(24910);
        }
    }

    /* renamed from: com.bytedance.lottie.c.b.p$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40573a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f40574b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
        static {
            /*
                r0 = 24908(0x614c, float:3.4904E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.c.b.p$b[] r0 = com.bytedance.lottie.c.b.p.b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.bytedance.lottie.c.b.p.AnonymousClass1.f40574b = r1
                r4 = 1
                com.bytedance.lottie.c.b.p$b r0 = com.bytedance.lottie.c.b.p.b.Bevel     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r3 = 2
                int[] r1 = com.bytedance.lottie.c.b.p.AnonymousClass1.f40574b     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.c.b.p$b r0 = com.bytedance.lottie.c.b.p.b.Miter     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r2 = 3
                int[] r1 = com.bytedance.lottie.c.b.p.AnonymousClass1.f40574b     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.lottie.c.b.p$b r0 = com.bytedance.lottie.c.b.p.b.Round     // Catch:{ NoSuchFieldError -> 0x002d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                com.bytedance.lottie.c.b.p$a[] r0 = com.bytedance.lottie.c.b.p.a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.bytedance.lottie.c.b.p.AnonymousClass1.f40573a = r1
                com.bytedance.lottie.c.b.p$a r0 = com.bytedance.lottie.c.b.p.a.Butt     // Catch:{ NoSuchFieldError -> 0x003e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r1 = com.bytedance.lottie.c.b.p.AnonymousClass1.f40573a     // Catch:{ NoSuchFieldError -> 0x0048 }
                com.bytedance.lottie.c.b.p$a r0 = com.bytedance.lottie.c.b.p.a.Round     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r1 = com.bytedance.lottie.c.b.p.AnonymousClass1.f40573a     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.bytedance.lottie.c.b.p$a r0 = com.bytedance.lottie.c.b.p.a.Unknown     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.c.b.p.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.bytedance.lottie.c.b.b
    public final com.bytedance.lottie.a.a.b a(i iVar, com.bytedance.lottie.c.c.a aVar) {
        return new q(iVar, aVar, this);
    }

    public p(String str, com.bytedance.lottie.c.a.b bVar, List<com.bytedance.lottie.c.a.b> list, com.bytedance.lottie.c.a.a aVar, d dVar, com.bytedance.lottie.c.a.b bVar2, a aVar2, b bVar3, float f2) {
        this.f40564a = str;
        this.f40565b = bVar;
        this.f40566c = list;
        this.f40567d = aVar;
        this.f40568e = dVar;
        this.f40569f = bVar2;
        this.f40570g = aVar2;
        this.f40571h = bVar3;
        this.f40572i = f2;
    }
}

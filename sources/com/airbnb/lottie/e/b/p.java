package com.airbnb.lottie.e.b;

import android.graphics.Paint;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.r;
import com.airbnb.lottie.e.a.d;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5440a;

    /* renamed from: b  reason: collision with root package name */
    public final com.airbnb.lottie.e.a.b f5441b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.airbnb.lottie.e.a.b> f5442c;

    /* renamed from: d  reason: collision with root package name */
    public final com.airbnb.lottie.e.a.a f5443d;

    /* renamed from: e  reason: collision with root package name */
    public final d f5444e;

    /* renamed from: f  reason: collision with root package name */
    public final com.airbnb.lottie.e.a.b f5445f;

    /* renamed from: g  reason: collision with root package name */
    public final a f5446g;

    /* renamed from: h  reason: collision with root package name */
    public final b f5447h;

    /* renamed from: i  reason: collision with root package name */
    public final float f5448i;

    static {
        Covode.recordClassIndex(2276);
    }

    public enum a {
        Butt,
        Round,
        Unknown;

        public final Paint.Cap toPaintCap() {
            int i2 = AnonymousClass1.f5449a[ordinal()];
            if (i2 == 1) {
                return Paint.Cap.BUTT;
            }
            if (i2 != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        static {
            Covode.recordClassIndex(2278);
        }
    }

    public enum b {
        Miter,
        Round,
        Bevel;

        public final Paint.Join toPaintJoin() {
            int i2 = AnonymousClass1.f5450b[ordinal()];
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
            Covode.recordClassIndex(2279);
        }
    }

    /* renamed from: com.airbnb.lottie.e.b.p$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5449a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f5450b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
        static {
            /*
                r0 = 2277(0x8e5, float:3.191E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.e.b.p$b[] r0 = com.airbnb.lottie.e.b.p.b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.airbnb.lottie.e.b.p.AnonymousClass1.f5450b = r1
                r4 = 1
                com.airbnb.lottie.e.b.p$b r0 = com.airbnb.lottie.e.b.p.b.Bevel     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r3 = 2
                int[] r1 = com.airbnb.lottie.e.b.p.AnonymousClass1.f5450b     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.e.b.p$b r0 = com.airbnb.lottie.e.b.p.b.Miter     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r2 = 3
                int[] r1 = com.airbnb.lottie.e.b.p.AnonymousClass1.f5450b     // Catch:{ NoSuchFieldError -> 0x002d }
                com.airbnb.lottie.e.b.p$b r0 = com.airbnb.lottie.e.b.p.b.Round     // Catch:{ NoSuchFieldError -> 0x002d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                com.airbnb.lottie.e.b.p$a[] r0 = com.airbnb.lottie.e.b.p.a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.airbnb.lottie.e.b.p.AnonymousClass1.f5449a = r1
                com.airbnb.lottie.e.b.p$a r0 = com.airbnb.lottie.e.b.p.a.Butt     // Catch:{ NoSuchFieldError -> 0x003e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r1 = com.airbnb.lottie.e.b.p.AnonymousClass1.f5449a     // Catch:{ NoSuchFieldError -> 0x0048 }
                com.airbnb.lottie.e.b.p$a r0 = com.airbnb.lottie.e.b.p.a.Round     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r1 = com.airbnb.lottie.e.b.p.AnonymousClass1.f5449a     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.airbnb.lottie.e.b.p$a r0 = com.airbnb.lottie.e.b.p.a.Unknown     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.b.p.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.airbnb.lottie.e.b.b
    public final c a(g gVar, com.airbnb.lottie.e.c.a aVar) {
        return new r(gVar, aVar, this);
    }

    public p(String str, com.airbnb.lottie.e.a.b bVar, List<com.airbnb.lottie.e.a.b> list, com.airbnb.lottie.e.a.a aVar, d dVar, com.airbnb.lottie.e.a.b bVar2, a aVar2, b bVar3, float f2) {
        this.f5440a = str;
        this.f5441b = bVar;
        this.f5442c = list;
        this.f5443d = aVar;
        this.f5444e = dVar;
        this.f5445f = bVar2;
        this.f5446g = aVar2;
        this.f5447h = bVar3;
        this.f5448i = f2;
    }
}

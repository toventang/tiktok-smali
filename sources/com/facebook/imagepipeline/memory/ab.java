package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.g.d;
import com.facebook.common.g.e;
import com.facebook.imagepipeline.p.b;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public final ad f48032a;

    /* renamed from: b  reason: collision with root package name */
    public final ae f48033b;

    /* renamed from: c  reason: collision with root package name */
    public final ad f48034c;

    /* renamed from: d  reason: collision with root package name */
    public final d f48035d;

    /* renamed from: e  reason: collision with root package name */
    public final ad f48036e;

    /* renamed from: f  reason: collision with root package name */
    public final ae f48037f;

    /* renamed from: g  reason: collision with root package name */
    public final ad f48038g;

    /* renamed from: h  reason: collision with root package name */
    public final ae f48039h;

    /* renamed from: i  reason: collision with root package name */
    public final String f48040i;

    /* renamed from: j  reason: collision with root package name */
    public final int f48041j;

    /* renamed from: k  reason: collision with root package name */
    public final int f48042k;

    static {
        Covode.recordClassIndex(29041);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ad f48043a;

        /* renamed from: b  reason: collision with root package name */
        public ae f48044b;

        /* renamed from: c  reason: collision with root package name */
        public ad f48045c;

        /* renamed from: d  reason: collision with root package name */
        public d f48046d;

        /* renamed from: e  reason: collision with root package name */
        public ad f48047e;

        /* renamed from: f  reason: collision with root package name */
        public ae f48048f;

        /* renamed from: g  reason: collision with root package name */
        public ad f48049g;

        /* renamed from: h  reason: collision with root package name */
        public ae f48050h;

        /* renamed from: i  reason: collision with root package name */
        public String f48051i;

        /* renamed from: j  reason: collision with root package name */
        public int f48052j;

        /* renamed from: k  reason: collision with root package name */
        public int f48053k;

        static {
            Covode.recordClassIndex(29042);
        }

        private a() {
        }

        public final ab a() {
            return new ab(this, (byte) 0);
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static a a() {
        return new a((byte) 0);
    }

    private ab(a aVar) {
        ad adVar;
        ae aeVar;
        ad adVar2;
        d dVar;
        ad adVar3;
        ae aeVar2;
        ad adVar4;
        ae aeVar3;
        String str;
        int i2;
        int i3;
        b.a();
        if (aVar.f48043a == null) {
            adVar = k.a();
        } else {
            adVar = aVar.f48043a;
        }
        this.f48032a = adVar;
        if (aVar.f48044b == null) {
            aeVar = y.a();
        } else {
            aeVar = aVar.f48044b;
        }
        this.f48033b = aeVar;
        int i4 = 4194304;
        if (aVar.f48045c == null) {
            adVar2 = new ad(4194304, l.f48095a * 4194304, l.a(l.f48095a), 131072, 4194304, l.f48095a);
        } else {
            adVar2 = aVar.f48045c;
        }
        this.f48034c = adVar2;
        if (aVar.f48046d == null) {
            dVar = e.a();
        } else {
            dVar = aVar.f48046d;
        }
        this.f48035d = dVar;
        if (aVar.f48047e == null) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.put(1024, 5);
            sparseIntArray.put(2048, 5);
            sparseIntArray.put(4096, 5);
            sparseIntArray.put(8192, 5);
            sparseIntArray.put(16384, 5);
            sparseIntArray.put(32768, 5);
            sparseIntArray.put(65536, 5);
            sparseIntArray.put(131072, 5);
            sparseIntArray.put(262144, 2);
            sparseIntArray.put(524288, 2);
            sparseIntArray.put(1048576, 2);
            int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min < 16777216) {
                i2 = 3145728;
            } else if (min < 33554432) {
                i2 = 6291456;
            } else {
                i2 = 12582912;
            }
            int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min2 < 16777216) {
                i3 = min2 / 2;
            } else {
                i3 = (min2 / 4) * 3;
            }
            adVar3 = new ad(i2, i3, sparseIntArray);
        } else {
            adVar3 = aVar.f48047e;
        }
        this.f48036e = adVar3;
        if (aVar.f48048f == null) {
            aeVar2 = y.a();
        } else {
            aeVar2 = aVar.f48048f;
        }
        this.f48037f = aeVar2;
        if (aVar.f48049g == null) {
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            sparseIntArray2.put(16384, 5);
            adVar4 = new ad(81920, 1048576, sparseIntArray2);
        } else {
            adVar4 = aVar.f48049g;
        }
        this.f48038g = adVar4;
        if (aVar.f48050h == null) {
            aeVar3 = y.a();
        } else {
            aeVar3 = aVar.f48050h;
        }
        this.f48039h = aeVar3;
        if (aVar.f48051i == null) {
            str = "legacy";
        } else {
            str = aVar.f48051i;
        }
        this.f48040i = str;
        this.f48041j = aVar.f48052j;
        this.f48042k = aVar.f48053k > 0 ? aVar.f48053k : i4;
        b.a();
    }

    /* synthetic */ ab(a aVar, byte b2) {
        this(aVar);
    }
}

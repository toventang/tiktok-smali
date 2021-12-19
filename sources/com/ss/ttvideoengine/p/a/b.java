package com.ss.ttvideoengine.p.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.p.a;
import com.ss.ttvideoengine.p.a.a;
import com.ss.ttvideoengine.p.b;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.ttvideoengine.p.b f153170a;

    /* renamed from: b  reason: collision with root package name */
    public int f153171b = -1;

    /* renamed from: c  reason: collision with root package name */
    public a.c f153172c;

    /* renamed from: d  reason: collision with root package name */
    private final List<a.b> f153173d = new ArrayList();

    static {
        Covode.recordClassIndex(101750);
    }

    private static boolean a(int i2) {
        return i2 == 1 || i2 == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.p.a.b$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f153174a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 101751(0x18d77, float:1.42584E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.ttvideoengine.p.b$a[] r0 = com.ss.ttvideoengine.p.b.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.ttvideoengine.p.a.b.AnonymousClass1.f153174a = r2
                com.ss.ttvideoengine.p.b$a r0 = com.ss.ttvideoengine.p.b.a.DIRECT_URL_SOURCE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.ttvideoengine.p.a.b.AnonymousClass1.f153174a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.ttvideoengine.p.b$a r0 = com.ss.ttvideoengine.p.b.a.VID_PLAY_AUTH_TOKEN_SOURCE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.p.a.b.AnonymousClass1.<clinit>():void");
        }
    }

    public final boolean a(aj ajVar, c cVar) {
        if (cVar == null || cVar.f153260a != -499981) {
            return false;
        }
        com.ss.ttvideoengine.p.b bVar = this.f153170a;
        a.c cVar2 = this.f153172c;
        int i2 = this.f153171b;
        if (bVar == null || cVar2 == null || !a(i2)) {
            return false;
        }
        a.b bVar2 = cVar2.f153166a;
        if (bVar2 != null && !this.f153173d.contains(bVar2)) {
            this.f153173d.add(bVar2);
        }
        a.c a2 = a.a(bVar, this.f153173d);
        if (a2 == null) {
            if (j.b()) {
                j.e("CodecStrategyAdapter", "resolveFallback return null! " + bVar + "  " + i2 + " " + this.f153173d + " " + a.C4075a.a());
            }
            return false;
        }
        if (j.a()) {
            j.b("CodecStrategyAdapter", "resolveFallback " + a2 + " " + a.C4075a.a());
        }
        a(ajVar, bVar, a2);
        ajVar.k();
        return true;
    }

    private void a(aj ajVar, com.ss.ttvideoengine.p.b bVar, a.c cVar) {
        int i2;
        this.f153172c = cVar;
        a.b bVar2 = cVar.f153166a;
        if (bVar2.decoder == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        boolean equals = TextUtils.equals(bVar2.encodeType, "bytevc1");
        boolean equals2 = TextUtils.equals(bVar2.encodeType, "bytevc2");
        b.a a2 = bVar.a();
        int i3 = AnonymousClass1.f153174a[a2.ordinal()];
        if (i3 == 1) {
            a.C4074a aVar = cVar.f153169d;
            ajVar.b(aVar.f153158c);
            ajVar.b(aVar.f153156a, aVar.f153157b);
            ajVar.f(7, i2);
        } else if (i3 == 2) {
            ajVar.d(bVar.b());
            ajVar.j(((com.ss.ttvideoengine.p.c) bVar).f153177b);
            ajVar.f(7, i2);
            ajVar.f(6, equals ? 1 : 0);
            ajVar.f(432, equals2 ? 1 : 0);
        } else {
            throw new IllegalArgumentException("unsupported source type! ".concat(String.valueOf(a2)));
        }
        ajVar.f(670, 0);
    }
}

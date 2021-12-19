package com.ss.android.ugc.aweme.live.alphaplayer.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.c;

public final class b {
    static {
        Covode.recordClassIndex(69392);
    }

    public static void a(a.C2775a aVar) {
        aVar.b(-0.5f, -0.5f);
        aVar.c();
        aVar.d();
    }

    public static void a(a.C2775a aVar, c cVar) {
        if (!cVar.a()) {
            aVar.a(1.0f - (cVar.f108191a + cVar.f108193c));
            aVar.b(1.0f - (cVar.f108192b + cVar.f108194d));
            aVar.b(cVar.f108191a, cVar.f108192b);
        }
    }

    public static void a(float[] fArr, float f2, float f3, float f4, float f5) {
        if (fArr == null || fArr.length < 8) {
            throw new RuntimeException("data is invalid");
        }
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f2;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f3;
    }
}

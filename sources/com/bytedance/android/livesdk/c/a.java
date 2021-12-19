package com.bytedance.android.livesdk.c;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class a extends c {
    static {
        Covode.recordClassIndex(8230);
    }

    public a(List<g> list) {
        super(list);
    }

    @Override // com.bytedance.android.livesdk.c.c
    public final g a(float f2) {
        int length = this.f14858a.length;
        if (length < 2) {
            return new g(0.0f, 0.0f);
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f14859b[i2] == null) {
                this.f14859b[i2] = new g();
            }
            g gVar = this.f14859b[i2];
            g gVar2 = this.f14858a[i2];
            gVar.f14865a = gVar2.f14865a;
            gVar.f14866b = gVar2.f14866b;
        }
        g[] gVarArr = this.f14859b;
        int length2 = gVarArr.length;
        for (int i3 = 1; i3 <= length2; i3++) {
            int i4 = 0;
            while (i4 < length2 - i3) {
                float f3 = 1.0f - f2;
                int i5 = i4 + 1;
                gVarArr[i4].f14865a = (gVarArr[i4].f14865a * f3) + (gVarArr[i5].f14865a * f2);
                gVarArr[i4].f14866b = (f3 * gVarArr[i4].f14866b) + (gVarArr[i5].f14866b * f2);
                i4 = i5;
            }
        }
        return gVarArr[0];
    }
}

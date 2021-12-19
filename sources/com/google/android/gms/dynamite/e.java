package com.google.android.gms.dynamite;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.dynamite.DynamiteModule;

final class e implements DynamiteModule.b {
    static {
        Covode.recordClassIndex(31497);
    }

    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.AbstractC1214b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        aVar.f50545a = bVar.a(context, str);
        aVar.f50546b = bVar.a(context, str, true);
        if (aVar.f50545a == 0 && aVar.f50546b == 0) {
            aVar.f50547c = 0;
        } else if (aVar.f50545a >= aVar.f50546b) {
            aVar.f50547c = -1;
        } else {
            aVar.f50547c = 1;
        }
        return aVar;
    }
}

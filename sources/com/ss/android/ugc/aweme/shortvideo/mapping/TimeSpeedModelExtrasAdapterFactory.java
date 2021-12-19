package com.ss.android.ugc.aweme.shortvideo.mapping;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.a.a.e;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import h.f.b.l;

public final class TimeSpeedModelExtrasAdapterFactory implements w {
    static {
        Covode.recordClassIndex(84394);
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        if (!Bundle.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        return new e(fVar, b.f128768a);
    }
}

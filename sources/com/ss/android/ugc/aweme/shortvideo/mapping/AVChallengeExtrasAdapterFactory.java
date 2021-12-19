package com.ss.android.ugc.aweme.shortvideo.mapping;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.a.a.d;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import h.f.b.l;
import java.util.HashMap;

public final class AVChallengeExtrasAdapterFactory implements w {
    static {
        Covode.recordClassIndex(84393);
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        if (!HashMap.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        return new d(fVar, a.f128766a);
    }
}

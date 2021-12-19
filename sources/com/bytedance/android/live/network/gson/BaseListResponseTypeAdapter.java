package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.l;
import java.lang.reflect.Type;

public class BaseListResponseTypeAdapter extends AbsJsonDeserializer<a> {
    static {
        Covode.recordClassIndex(6633);
    }

    public BaseListResponseTypeAdapter(f fVar) {
        super(fVar);
    }

    @Override // com.google.gson.k
    public final /* synthetic */ Object a(l lVar, Type type, j jVar) {
        a aVar = (a) this.f12120a.a(lVar, type);
        if (aVar.f12144a != 0) {
            aVar.f12147d = (RequestError) this.f12120a.a(lVar.j().c("data"), RequestError.class);
        }
        return aVar;
    }
}

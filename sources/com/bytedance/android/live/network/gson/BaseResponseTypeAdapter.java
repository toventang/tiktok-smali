package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.l;
import java.lang.reflect.Type;

public class BaseResponseTypeAdapter extends AbsJsonDeserializer<b> {
    static {
        Covode.recordClassIndex(6634);
    }

    public BaseResponseTypeAdapter(f fVar) {
        super(fVar);
    }

    @Override // com.google.gson.k
    public final /* synthetic */ Object a(l lVar, Type type, j jVar) {
        b bVar = (b) this.f12120a.a(lVar, type);
        if (bVar.statusCode != 0) {
            bVar.error = (RequestError) this.f12120a.a(lVar.j().c("data"), RequestError.class);
        }
        return bVar;
    }
}

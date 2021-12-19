package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.l;
import java.lang.reflect.Type;

public class ResponseTypeAdapter extends AbsJsonDeserializer<d> {
    static {
        Covode.recordClassIndex(6636);
    }

    public ResponseTypeAdapter(f fVar) {
        super(fVar);
    }

    @Override // com.google.gson.k
    public final /* synthetic */ Object a(l lVar, Type type, j jVar) {
        d dVar = (d) this.f12120a.a(lVar, type);
        if (dVar.statusCode != 0) {
            dVar.error = (RequestError) this.f12120a.a(lVar.j().c("data"), RequestError.class);
        }
        return dVar;
    }
}

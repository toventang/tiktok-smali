package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.c;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.o;
import java.lang.reflect.Type;

public class ListResponseTypeAdapter extends AbsJsonDeserializer<c> {
    static {
        Covode.recordClassIndex(6635);
    }

    public ListResponseTypeAdapter(f fVar) {
        super(fVar);
    }

    @Override // com.google.gson.k
    public final /* synthetic */ Object a(l lVar, Type type, j jVar) {
        o j2 = lVar.j();
        int g2 = j2.c("status_code").g();
        if (g2 == 0) {
            return this.f12120a.a(lVar, type);
        }
        c cVar = new c();
        cVar.f12144a = g2;
        cVar.f12146c = (Extra) this.f12120a.a(j2.c("extra"), Extra.class);
        cVar.f12147d = (RequestError) this.f12120a.a(j2.c("data"), RequestError.class);
        return cVar;
    }
}

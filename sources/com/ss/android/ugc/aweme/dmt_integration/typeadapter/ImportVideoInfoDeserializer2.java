package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.r;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.tools.utils.q;
import java.lang.reflect.Type;

public final class ImportVideoInfoDeserializer2 implements k<ImportVideoInfo> {
    static {
        Covode.recordClassIndex(51704);
    }

    private static ImportVideoInfo a(l lVar) {
        o oVar;
        l c2;
        if (lVar != null) {
            try {
                oVar = lVar.j();
            } catch (Exception e2) {
                q.b("ImportVideoInfoDeserializer2 error :" + e2.toString());
                return null;
            }
        } else {
            oVar = null;
        }
        if (!(oVar == null || (c2 = oVar.c("e")) == null || (c2 instanceof r))) {
            oVar.a("e");
            oVar.a("e", c2.j().c("path"));
        }
        return (ImportVideoInfo) new f().a((l) oVar, ImportVideoInfo.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ ImportVideoInfo a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}

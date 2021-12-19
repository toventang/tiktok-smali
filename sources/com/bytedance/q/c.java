package com.bytedance.q;

import com.bytedance.covode.number.Covode;
import com.bytedance.q.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(25893);
    }

    public static <IN> b<IN> a(List<h> list) {
        if (list != null) {
            return new i(Collections.unmodifiableList(new ArrayList(list)), 0, new f.a(), null);
        }
        throw new IllegalArgumentException("interceptors == null !");
    }

    static <IN> b<IN> a(List<h> list, b bVar, d dVar) {
        if (list != null) {
            i iVar = (i) bVar;
            f fVar = iVar.mInterceptorFactory;
            if (fVar == null) {
                fVar = new f.a();
            }
            i iVar2 = new i(Collections.unmodifiableList(new ArrayList(list)), 0, fVar, dVar);
            iVar2.mBundleData = iVar.mBundleData;
            return iVar2;
        }
        throw new IllegalArgumentException("interceptors == null !");
    }
}

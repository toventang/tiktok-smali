package com.bytedance.geckox.e;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.f;
import com.bytedance.geckox.i.a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.q.b;
import com.bytedance.q.d;
import java.io.File;

public class p extends d<Pair<UpdatePackage, Long>, Pair<UpdatePackage, Long>> {
    static {
        Covode.recordClassIndex(17312);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* bridge */ /* synthetic */ Object a(b<Pair<UpdatePackage, Long>> bVar, Pair<UpdatePackage, Long> pair) {
        return a(bVar, pair);
    }

    private static Object a(b<Pair<UpdatePackage, Long>> bVar, Pair<UpdatePackage, Long> pair) {
        a.a("update success:", pair);
        try {
            return bVar.a(pair);
        } finally {
            UpdatePackage updatePackage = (UpdatePackage) pair.first;
            String accessKey = updatePackage.getAccessKey();
            String channel = updatePackage.getChannel();
            String str = f.a().f29842a.get(accessKey);
            if (str != null && !TextUtils.isEmpty(str)) {
                com.bytedance.geckox.b.b.a(new File(new File(str, accessKey), channel).getAbsolutePath(), (Long) pair.second, false, 41);
            }
        }
    }
}

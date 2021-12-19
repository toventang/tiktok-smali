package com.bytedance.geckox.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.j.a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.q.b;
import com.bytedance.q.d;
import h.f.b.l;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;

public final class k extends d<List<UpdatePackage>, List<? extends UpdatePackage>> {
    static {
        Covode.recordClassIndex(17306);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* synthetic */ Object a(b<List<? extends UpdatePackage>> bVar, List<UpdatePackage> list) {
        List<UpdatePackage> list2 = list;
        l.c(bVar, "");
        l.c(list2, "");
        ListIterator<UpdatePackage> listIterator = list2.listIterator();
        while (listIterator.hasNext()) {
            UpdatePackage next = listIterator.next();
            String accessKey = next.getAccessKey();
            ConcurrentHashMap<String, a> concurrentHashMap = com.bytedance.geckox.j.b.f29909a.get(accessKey);
            if (concurrentHashMap == null) {
                l.a((Object) accessKey, "");
                concurrentHashMap = com.bytedance.geckox.j.b.a(accessKey);
                if (concurrentHashMap == null) {
                }
            }
            a aVar = concurrentHashMap.get(next.getChannel());
            if (aVar != null && !aVar.allowUpdate) {
                listIterator.remove();
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return bVar.a(list2);
    }
}

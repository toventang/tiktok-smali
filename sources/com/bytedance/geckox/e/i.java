package com.bytedance.geckox.e;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.f;
import com.bytedance.geckox.i.a;
import com.bytedance.geckox.utils.m;
import com.bytedance.q.b;
import com.bytedance.q.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class i extends d<String, Map<String, List<Pair<String, Long>>>> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f29828a;

    static {
        Covode.recordClassIndex(17304);
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f29828a = ((Boolean) objArr[0]).booleanValue();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* synthetic */ Object a(b<Map<String, List<Pair<String, Long>>>> bVar, String str) {
        Long a2;
        a.a("get local channel version");
        Map<String, String> map = f.a().f29842a;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            File file = new File(entry.getValue(), key);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            if (list != null && list.length > 0) {
                for (String str2 : list) {
                    File file2 = new File(file, str2);
                    if (file2.isDirectory() && (a2 = m.a(file2)) != null) {
                        arrayList.add(new Pair<>(str2, a2));
                    }
                }
            }
            List<Pair<String, Long>> list2 = hashMap.get(key);
            if (list2 != null) {
                list2.addAll(arrayList);
            } else {
                hashMap.put(key, arrayList);
            }
        }
        return bVar.a(hashMap);
    }
}

package com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.playerkit.a.e;
import com.ss.android.ugc.aweme.playerkit.a.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f115485a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<e> f115486b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private f f115487c;

    /* renamed from: d  reason: collision with root package name */
    private String f115488d;

    static {
        Covode.recordClassIndex(74135);
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f115485a);
        arrayList.addAll(this.f115486b);
        List<e> a2 = a(arrayList);
        b(a2);
        for (e eVar : a2) {
            eVar.a();
            com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a.a(new b(this, hashMap, eVar));
        }
        return hashMap;
    }

    public final void a(f fVar) {
        this.f115487c = fVar;
        this.f115488d = fVar.f115471g;
        this.f115486b.clear();
        List<e> list = fVar.f115470f;
        if (list != null && list.size() > 0) {
            this.f115486b.addAll(list);
        }
    }

    private static List<e> a(List<e> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() == 0) {
            com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a.a("portraitParsers filter: null parsers：".concat(String.valueOf(list)));
            return arrayList;
        }
        for (e eVar : list) {
            if (eVar != null) {
                arrayList.add(eVar);
            } else {
                com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a.a("portraitParsers filter: parser is null");
            }
        }
        return arrayList;
    }

    private static void b(List<e> list) {
        HashSet hashSet = new HashSet();
        for (e eVar : list) {
            if (!hashSet.add(eVar.a())) {
                com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a.a("portraitParsers key duplicate!! ");
            }
        }
    }
}

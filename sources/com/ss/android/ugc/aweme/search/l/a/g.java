package com.ss.android.ugc.aweme.search.l.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.aweme.utils.es;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, e> f121354a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static int f121355b;

    /* renamed from: c  reason: collision with root package name */
    public static final g f121356c = new g();

    /* renamed from: d  reason: collision with root package name */
    private static long f121357d;

    /* renamed from: e  reason: collision with root package name */
    private static e f121358e;

    private g() {
    }

    static {
        Covode.recordClassIndex(79078);
    }

    public static e a(d dVar) {
        if (dVar == null) {
            return f.f121353a;
        }
        e eVar = f121354a.get(Integer.valueOf(dVar.getId()));
        if (eVar == null) {
            return f.f121353a;
        }
        return eVar;
    }

    private static void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    public static void b(com.ss.android.ugc.aweme.search.model.d r18) {
        /*
        // Method dump skipped, instructions count: 984
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.l.a.g.b(com.ss.android.ugc.aweme.search.model.d):void");
    }

    public static e a(int i2, d dVar) {
        l.d(dVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        f121357d = currentTimeMillis;
        if (currentTimeMillis - f121357d < 1000) {
            return null;
        }
        d copy = dVar.copy();
        l.b(copy, "");
        e eVar = new e(copy);
        eVar.f121340a = currentTimeMillis;
        eVar.f121342c = 0;
        eVar.f121347h = i2;
        f121354a.put(Integer.valueOf(copy.getId()), eVar);
        f121358e = eVar;
        if (dVar.getKeyword() != null) {
            String keyword = dVar.getKeyword();
            l.b(keyword, "");
            es.a.a(keyword).b();
        }
        return eVar;
    }

    private static boolean a(boolean z, d dVar) {
        if (!z || dVar == null || TextUtils.isEmpty(dVar.getKeyword())) {
            return false;
        }
        return true;
    }

    public static e b(int i2, d dVar) {
        if (dVar == null) {
            return null;
        }
        Map<Integer, e> map = f121354a;
        e eVar = map.get(Integer.valueOf(dVar.getId()));
        if (eVar == null) {
            e eVar2 = f121358e;
            if (eVar2 != null && !eVar2.a()) {
                String keyword = dVar.getKeyword();
                e eVar3 = f121358e;
                if (eVar3 == null) {
                    l.b();
                }
                if (l.a((Object) keyword, (Object) eVar3.C.getKeyword())) {
                    eVar = f121358e;
                    if (eVar == null) {
                        l.b();
                    }
                    map.remove(Integer.valueOf(eVar.C.getId()));
                    e eVar4 = f121358e;
                    if (eVar4 == null) {
                        l.b();
                    }
                    eVar4.a(i2);
                    e eVar5 = f121358e;
                    if (eVar5 == null) {
                        l.b();
                    }
                    eVar5.a(i2);
                    e eVar6 = f121358e;
                    if (eVar6 == null) {
                        l.b();
                    }
                    Integer valueOf = Integer.valueOf(eVar6.C.getId());
                    e eVar7 = f121358e;
                    if (eVar7 == null) {
                        l.b();
                    }
                    map.put(valueOf, eVar7);
                }
            }
            eVar = a(6, dVar);
            if (eVar != null) {
                eVar.a(i2);
            } else {
                eVar = null;
            }
        } else {
            eVar.a(i2);
        }
        f121358e = null;
        return eVar;
    }
}

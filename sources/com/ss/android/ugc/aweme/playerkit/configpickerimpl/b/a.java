package com.ss.android.ugc.aweme.playerkit.configpickerimpl.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.playerkit.a.f;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a.c;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f115502a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f115503b;

    /* renamed from: c  reason: collision with root package name */
    private final c f115504c = new c();

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a.a f115505d = new com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a.a();

    static {
        Covode.recordClassIndex(74142);
    }

    private boolean a(ConditionConfig conditionConfig) {
        Map<String, List<String>> map = conditionConfig.f115519a;
        Map<String, List<String>> map2 = conditionConfig.f115520b;
        if (!a(this.f115503b, map) || !a(this.f115502a, map2)) {
            return false;
        }
        return true;
    }

    public final List<ConditionConfig> a(List<ConditionConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (ConditionConfig conditionConfig : list) {
            if (a(conditionConfig)) {
                arrayList.add(conditionConfig);
            }
        }
        return arrayList;
    }

    public final void a(f fVar) {
        this.f115504c.f115492a = fVar;
        this.f115505d.a(fVar);
        this.f115502a = this.f115504c.a();
        Map<String, String> a2 = this.f115505d.a();
        this.f115503b = a2;
        com.a.a("ConditionMatcher update portraits: server:%s, client:%s", new Object[]{this.f115502a, a2});
    }

    private static boolean a(String str, List<String> list) {
        if (list == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        return list.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.util.Map<java.lang.String, java.lang.String> r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7) {
        /*
            r5 = 1
            if (r7 == 0) goto L_0x0009
            int r0 = r7.size()
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            return r5
        L_0x000a:
            r4 = 0
            if (r6 == 0) goto L_0x0013
            int r0 = r6.size()
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            return r4
        L_0x0014:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r6.containsKey(r2)
            if (r0 != 0) goto L_0x0039
            return r4
        L_0x0039:
            java.lang.Object r0 = r6.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = a(r0, r1)
            if (r0 != 0) goto L_0x001c
            return r4
        L_0x0046:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.a.a(java.util.Map, java.util.Map):boolean");
    }
}

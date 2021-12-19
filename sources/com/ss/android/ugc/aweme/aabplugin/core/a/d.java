package com.ss.android.ugc.aweme.aabplugin.core.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.a.a;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;
import com.ss.android.ugc.aweme.aabplugin.core.base.p;
import h.a.z;
import h.f.a.b;
import h.f.b.l;
import java.util.Map;

public final class d extends n {
    static {
        Covode.recordClassIndex(38429);
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.n
    public final void a(Map<String, String> map) {
        l.d(map, "");
        map.put(StringSet.name, this.f62518l);
        Iterable iterable = this.f62508b.f35061i;
        if (iterable == null) {
            iterable = z.INSTANCE;
        }
        map.put("dependent_modules", h.a.n.a(iterable, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62));
        map.put("is_all_dependent_modules_installed", String.valueOf(b()));
    }

    public /* synthetic */ d(String str, boolean z, p pVar, a aVar) {
        this(str, z, false, pVar, aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(java.lang.String r9, boolean r10, boolean r11, com.ss.android.ugc.aweme.aabplugin.core.base.p r12, com.bytedance.ies.ugc.aweme.plugin.a.a r13) {
        /*
            r8 = this;
            java.lang.String r1 = ""
            r3 = r9
            h.f.b.l.d(r3, r1)
            r7 = r13
            h.f.b.l.d(r7, r1)
            com.bytedance.m.a.d r0 = com.bytedance.m.a.d.a()
            java.lang.String r2 = r0.a(r3)
            h.f.b.l.b(r2, r1)
            r1 = r8
            r6 = r12
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.List<java.lang.String> r1 = r7.f35060h
            if (r1 != 0) goto L_0x0022
            h.a.z r1 = h.a.z.INSTANCE
        L_0x0022:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.n.a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0031:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.bytedance.m.a.d r0 = com.bytedance.m.a.d.a()
            java.lang.String r0 = r0.a(r1)
            r3.add(r0)
            goto L_0x0031
        L_0x0049:
            java.util.List r3 = (java.util.List) r3
            r7.f35061i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aabplugin.core.a.d.<init>(java.lang.String, boolean, boolean, com.ss.android.ugc.aweme.aabplugin.core.base.p, com.bytedance.ies.ugc.aweme.plugin.a.a):void");
    }
}

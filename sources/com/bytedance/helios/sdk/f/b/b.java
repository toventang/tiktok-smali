package com.bytedance.helios.sdk.f.b;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f30969a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(17969);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.reflect.Type a(com.bytedance.helios.api.config.TypeInfo r6) {
        /*
            java.lang.String r0 = r6.getRawTypeName()
            java.lang.Class r5 = java.lang.Class.forName(r0)
            java.lang.String r0 = ""
            h.f.b.l.a(r5, r0)
            java.lang.String r0 = r6.getOwnerTypeName()
            if (r0 == 0) goto L_0x0041
            java.lang.Class r4 = java.lang.Class.forName(r0)
        L_0x0017:
            java.util.List r1 = r6.getArgumentTypeNames()
            r3 = 0
            if (r1 == 0) goto L_0x0054
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.n.a(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x002d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r1.next()
            com.bytedance.helios.api.config.TypeInfo r0 = (com.bytedance.helios.api.config.TypeInfo) r0
            java.lang.reflect.Type r0 = a(r0)
            r2.add(r0)
            goto L_0x002d
        L_0x0041:
            r4 = 0
            goto L_0x0017
        L_0x0043:
            java.util.List r2 = (java.util.List) r2
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
            java.lang.Object[] r1 = r2.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            if (r1 != 0) goto L_0x0056
        L_0x0054:
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r3]
        L_0x0056:
            com.bytedance.helios.sdk.f.b.c r0 = new com.bytedance.helios.sdk.f.b.c
            r0.<init>(r5, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.f.b.b.a(com.bytedance.helios.api.config.TypeInfo):java.lang.reflect.Type");
    }
}

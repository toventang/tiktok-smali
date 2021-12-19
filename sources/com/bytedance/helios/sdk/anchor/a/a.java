package com.bytedance.helios.sdk.anchor.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.anchor.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f30769a = a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17884);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r1.equals("B") == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.anchor.a.a.a():java.lang.String");
    }

    public static b a(com.bytedance.helios.api.a.b bVar) {
        String a2 = a();
        a2.hashCode();
        if (a2.equals("PlanA")) {
            return new b(bVar);
        }
        if (!a2.equals("PlanB")) {
            return new d();
        }
        return new c(bVar);
    }
}

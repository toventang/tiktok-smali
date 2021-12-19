package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.b;
import h.f.b.l;
import java.util.Map;
import java.util.Objects;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C2665a f104559b = new C2665a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b.a f104560a;

    static {
        Covode.recordClassIndex(66990);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a$a  reason: collision with other inner class name */
    public static final class C2665a {
        static {
            Covode.recordClassIndex(66991);
        }

        private C2665a() {
        }

        public /* synthetic */ C2665a(byte b2) {
            this();
        }
    }

    public a(String str) {
        l.d(str, "");
        this.f104560a = b.f104561a.a(str);
    }

    private static Boolean b(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        l.b(lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3569038) {
            if (hashCode == 97196323 && lowerCase.equals("false")) {
                return false;
            }
            return null;
        } else if (lowerCase.equals("true")) {
            return true;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6 A[EDGE_INSN: B:37:0x00b6->B:34:0x00b6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a.a(java.lang.String):java.lang.String");
    }

    public final void a(String str, String str2) {
        String str3;
        l.d(str, "");
        if (str2 != null) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            str3 = str2.toLowerCase();
            l.b(str3, "");
        } else {
            str3 = null;
        }
        b bVar = b.f104561a;
        b.a aVar = this.f104560a;
        if (aVar == null) {
            l.b();
        }
        Map<String, Object> a2 = bVar.a(aVar);
        if (str3 == null) {
            a2.remove(str);
        } else {
            a2.put(str, str3);
        }
    }
}

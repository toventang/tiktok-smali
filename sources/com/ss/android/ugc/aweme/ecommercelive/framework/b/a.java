package com.ss.android.ugc.aweme.ecommercelive.framework.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.framework.b.b;
import h.f.b.l;
import h.m.p;
import java.util.Map;
import java.util.Objects;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C2134a f88013b = new C2134a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b.a f88014a;

    static {
        Covode.recordClassIndex(55329);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.b.a$a  reason: collision with other inner class name */
    public static final class C2134a {
        static {
            Covode.recordClassIndex(55330);
        }

        private C2134a() {
        }

        public /* synthetic */ C2134a(byte b2) {
            this();
        }
    }

    public a(String str) {
        l.d(str, "");
        this.f88014a = b.f88015a.a(str);
    }

    private static Boolean e(String str) {
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

    public final boolean a(String str) {
        l.d(str, "");
        b.a aVar = this.f88014a;
        if (aVar == null) {
            return false;
        }
        boolean containsKey = b.f88015a.a(aVar).containsKey(str);
        while (!containsKey && aVar.f88022a != null) {
            aVar = aVar.f88022a;
            if (aVar == null) {
                return false;
            }
            Map<String, Object> a2 = b.f88015a.a(aVar);
            containsKey = a2.containsKey(str);
            if (l.a(a2.get(str), (Object) "#$&*REMOVED*&$#")) {
                return false;
            }
        }
        return containsKey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d6, code lost:
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d6 A[EDGE_INSN: B:52:0x00d6->B:47:0x00d6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T b(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.framework.b.a.b(java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5 A[EDGE_INSN: B:39:0x00c5->B:37:0x00c5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.framework.b.a.c(java.lang.String):java.lang.String");
    }

    public final long d(String str) {
        l.d(str, "");
        Long l2 = 0L;
        Class cls = Long.TYPE;
        b.a aVar = this.f88014a;
        while (true) {
            if (aVar == null) {
                break;
            }
            Object obj = b.f88015a.a(aVar).get(str);
            Long l3 = null;
            if (obj != null) {
                if (l.a(cls, obj.getClass())) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
                    l3 = (Long) obj;
                } else if (l.a(cls, String.class)) {
                    String obj2 = obj.toString();
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                    l3 = (Long) obj2;
                } else if (l.a(cls, Boolean.TYPE)) {
                    e(obj.toString());
                } else if (l.a(cls, Integer.TYPE)) {
                    p.e(obj.toString());
                } else if (l.a(cls, Long.TYPE)) {
                    Long g2 = p.g(obj.toString());
                    if ((g2 instanceof Long) && g2 != null) {
                        l3 = g2;
                    }
                } else if (l.a(cls, Double.TYPE)) {
                    p.d(obj.toString());
                } else if (l.a(cls, Float.TYPE)) {
                    p.c(obj.toString());
                } else if (l.a(cls, Object.class)) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
                    l3 = (Long) obj;
                } else {
                    throw new RuntimeException(cls.getName() + " is not VALID.");
                }
            }
            if (l.a((Object) l3, (Object) "#$&*REMOVED*&$#")) {
                break;
            } else if (l3 != null) {
                l2 = l3;
                break;
            } else {
                aVar = aVar.f88022a;
            }
        }
        return l2.longValue();
    }

    public final void a(String str, int i2) {
        l.d(str, "");
        Integer valueOf = Integer.valueOf(i2);
        b bVar = b.f88015a;
        b.a aVar = this.f88014a;
        if (aVar == null) {
            l.b();
        }
        bVar.a(aVar).put(str, valueOf);
    }

    public final void a(String str, long j2) {
        l.d(str, "");
        Long valueOf = Long.valueOf(j2);
        b bVar = b.f88015a;
        b.a aVar = this.f88014a;
        if (aVar == null) {
            l.b();
        }
        bVar.a(aVar).put(str, valueOf);
    }

    public final void a(String str, String str2, boolean z) {
        l.d(str, "");
        if (!z) {
            if (str2 != null) {
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                str2 = str2.toLowerCase();
                l.b(str2, "");
            } else {
                str2 = null;
            }
        }
        b bVar = b.f88015a;
        b.a aVar = this.f88014a;
        if (aVar == null) {
            l.b();
        }
        Map<String, Object> a2 = bVar.a(aVar);
        if (str2 == null) {
            a2.remove(str);
        } else {
            a2.put(str, str2);
        }
    }
}

package com.ss.android.ugc.aweme.kids.experiment.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.o;
import com.google.gson.r;
import com.ss.android.ugc.aweme.kids.api.abmock.c;
import com.ss.android.ugc.aweme.kids.experiment.abmock.b.b;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106523a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static b f106524b = b.f106537a;

    /* renamed from: c  reason: collision with root package name */
    private static ConcurrentHashMap<String, Object> f106525c = new ConcurrentHashMap<>();

    private a() {
    }

    static {
        Covode.recordClassIndex(68070);
    }

    public static Object a(com.ss.android.ugc.aweme.kids.api.abmock.a aVar) {
        l.d(aVar, "");
        C2719a b2 = b(aVar);
        String str = b2.f106526a;
        Object obj = b2.f106527b;
        c cVar = b2.f106528c;
        boolean z = b2.f106529d;
        if (cVar == c.BOOL) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return Boolean.valueOf(a(str, ((Boolean) obj).booleanValue(), z));
        } else if (cVar == c.INT) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return Integer.valueOf(a(str, ((Integer) obj).intValue(), z));
        } else if (cVar != c.STRING) {
            return new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a("please use getObjectValue");
        } else {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            return a(str, (String) obj, z);
        }
    }

    private static C2719a b(com.ss.android.ugc.aweme.kids.api.abmock.a aVar) {
        Object obj;
        String a2 = aVar.a();
        c c2 = aVar.c();
        List<com.ss.android.ugc.aweme.kids.api.abmock.b> b2 = aVar.b();
        if (!b2.isEmpty()) {
            obj = b2.get(0).f105388c;
        } else {
            obj = "";
        }
        boolean d2 = aVar.d();
        for (T t : b2) {
            if (t.f105387b) {
                obj = t.f105388c;
            }
        }
        return new C2719a(a2, obj, c2, d2);
    }

    public static void a(o oVar) {
        String[] strArr;
        l.d(oVar, "");
        com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.f106534a.clear();
        for (Map.Entry<String, com.google.gson.l> entry : oVar.f54898a.entrySet()) {
            String key = entry.getKey();
            com.google.gson.l value = entry.getValue();
            l.b(value, "");
            if (value instanceof i) {
                l.b(key, "");
                i k2 = value.k();
                l.d(key, "");
                try {
                    if (com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.f106535b == null) {
                        com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.f106535b = new f();
                    }
                    f fVar = com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.f106535b;
                    if (fVar != null) {
                        strArr = (String[]) fVar.a((com.google.gson.l) k2, String[].class);
                    } else {
                        strArr = null;
                    }
                    com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.f106534a.storeStringArray(key, strArr);
                } catch (Throwable unused) {
                }
            } else if (value instanceof o) {
                l.b(key, "");
                o j2 = value.j();
                l.b(j2, "");
                l.d(key, "");
                l.d(j2, "");
                com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.f106534a.storeString(key, j2.toString());
            } else {
                r l2 = value.l();
                l.b(l2, "");
                if (l2.f54900a instanceof Number) {
                    l.b(key, "");
                    int g2 = value.g();
                    l.d(key, "");
                    com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.f106534a.storeInt(key, g2);
                } else {
                    r l3 = value.l();
                    l.b(l3, "");
                    if (l3.f54900a instanceof Boolean) {
                        l.b(key, "");
                        boolean h2 = value.h();
                        l.d(key, "");
                        com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.f106534a.storeBoolean(key, h2);
                    } else {
                        r l4 = value.l();
                        l.b(l4, "");
                        if (l4.f54900a instanceof String) {
                            l.b(key, "");
                            String c2 = value.c();
                            l.b(c2, "");
                            l.d(key, "");
                            l.d(c2, "");
                            com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.f106534a.storeString(key, c2);
                        }
                    }
                }
            }
        }
    }

    private static int a(String str, int i2, boolean z) {
        Object obj;
        if (b.a("")) {
            return Integer.valueOf(b.a(str, i2)).intValue();
        }
        if (z && (obj = f106525c.get(str)) != null) {
            return ((Integer) obj).intValue();
        }
        Integer valueOf = Integer.valueOf(com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.a(str, i2));
        f106525c.put(str, valueOf);
        return valueOf.intValue();
    }

    private static String a(String str, String str2, boolean z) {
        Object obj;
        String b2;
        if (b.a("") && (b2 = b.b(str)) != null) {
            return b2;
        }
        if (z && (obj = f106525c.get(str)) != null) {
            return (String) obj;
        }
        String a2 = com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.a(str, str2);
        f106525c.put(str, a2);
        return a2;
    }

    private static boolean a(String str, boolean z, boolean z2) {
        Object obj;
        if (b.a("")) {
            return Boolean.valueOf(b.a(str, z)).booleanValue();
        }
        if (z2 && (obj = f106525c.get(str)) != null) {
            return ((Boolean) obj).booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(com.ss.android.ugc.aweme.kids.experiment.abmock.b.a.a(str, z));
        f106525c.put(str, valueOf);
        return valueOf.booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.experiment.abmock.a$a  reason: collision with other inner class name */
    public static final class C2719a {

        /* renamed from: a  reason: collision with root package name */
        public final String f106526a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f106527b;

        /* renamed from: c  reason: collision with root package name */
        public final c f106528c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f106529d;

        static {
            Covode.recordClassIndex(68071);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2719a)) {
                return false;
            }
            C2719a aVar = (C2719a) obj;
            return l.a(this.f106526a, aVar.f106526a) && l.a(this.f106527b, aVar.f106527b) && l.a(this.f106528c, aVar.f106528c) && this.f106529d == aVar.f106529d;
        }

        public final int hashCode() {
            String str = this.f106526a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Object obj = this.f106527b;
            int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
            c cVar = this.f106528c;
            if (cVar != null) {
                i2 = cVar.hashCode();
            }
            int i3 = (hashCode2 + i2) * 31;
            boolean z = this.f106529d;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            return i3 + i4;
        }

        public final String toString() {
            return "BasicInfo(key=" + this.f106526a + ", defaultValue=" + this.f106527b + ", type=" + this.f106528c + ", needCache=" + this.f106529d + ")";
        }

        public C2719a(String str, Object obj, c cVar, boolean z) {
            l.d(str, "");
            l.d(obj, "");
            l.d(cVar, "");
            this.f106526a = str;
            this.f106527b = obj;
            this.f106528c = cVar;
            this.f106529d = z;
        }
    }
}

package com.ss.android.ugc.aweme.property;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.google.gson.r;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.property.db;
import com.ss.android.vesdk.u;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.n;
import h.p;
import h.v;
import java.util.HashMap;
import java.util.Map;

public final class ez {

    /* renamed from: a  reason: collision with root package name */
    public final db f118525a;

    /* renamed from: b  reason: collision with root package name */
    private final h f118526b;

    static {
        Covode.recordClassIndex(76981);
    }

    /* access modifiers changed from: package-private */
    public final db a() {
        return (db) this.f118526b.getValue();
    }

    public static final class a implements db.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f118527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u.d f118528b;

        static {
            Covode.recordClassIndex(76982);
        }

        @Override // com.ss.android.ugc.aweme.property.db.a
        public final String a() {
            return this.f118527a;
        }

        @Override // com.ss.android.ugc.aweme.property.db.a
        public final Object c() {
            Object obj = this.f118528b.f151496b;
            l.b(obj, "");
            return obj;
        }

        @Override // com.ss.android.ugc.aweme.property.db.a
        public final db.b b() {
            u.c cVar = this.f118528b.f151495a;
            if (cVar != null) {
                int i2 = fa.f118530a[cVar.ordinal()];
                if (i2 == 1) {
                    return db.b.Long;
                }
                if (i2 == 2) {
                    return db.b.Boolean;
                }
                if (i2 == 3) {
                    return db.b.Float;
                }
                if (i2 == 4) {
                    return db.b.Integer;
                }
                if (i2 == 5) {
                    return db.b.String;
                }
            }
            return db.b.String;
        }

        a(String str, u.d dVar) {
            this.f118527a = str;
            this.f118528b = dVar;
        }
    }

    static final class b extends m implements h.f.a.a<db> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(76983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ db invoke() {
            return new db(d.a(this.$context, "av_ab_vesdk_panel.xml", 0));
        }
    }

    public static Map<String, db.a> b() {
        HashMap hashMap = new HashMap();
        u a2 = u.a();
        l.b(a2, "");
        Map<String, u.d> map = a2.f151490a;
        l.b(map, "");
        for (Map.Entry<String, u.d> entry : map.entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey())) {
                String key = entry.getKey();
                l.b(key, "");
                String key2 = entry.getKey();
                l.b(key2, "");
                u.d value = entry.getValue();
                l.b(value, "");
                hashMap.put(key, a(key2, value));
            }
        }
        return hashMap;
    }

    public ez(Context context) {
        l.d(context, "");
        this.f118526b = i.a((h.f.a.a) new b(context));
        this.f118525a = new db(d.a(context, "av_ab_vesdk.xml", 0));
    }

    public final p<Object, Integer> a(db.a aVar) {
        int i2;
        l.d(aVar, "");
        com.ss.android.ugc.aweme.cs.d.b.b();
        Object a2 = a(this.f118525a, aVar);
        if (this.f118525a.f(aVar)) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        return v.a(a2, Integer.valueOf(i2));
    }

    public static db.a a(String str, u.d dVar) {
        return new a(str, dVar);
    }

    private static Object a(db dbVar, db.a aVar) {
        Object valueOf;
        db.b b2 = aVar.b();
        if (b2 != null) {
            int i2 = fa.f118532c[b2.ordinal()];
            if (i2 == 1) {
                valueOf = Boolean.valueOf(dbVar.a(aVar));
            } else if (i2 == 2) {
                valueOf = Integer.valueOf(dbVar.b(aVar));
            } else if (i2 == 3) {
                valueOf = Long.valueOf(dbVar.c(aVar));
            } else if (i2 == 4) {
                valueOf = Float.valueOf(dbVar.d(aVar));
            } else if (i2 == 5) {
                valueOf = dbVar.e(aVar);
            }
            l.b(valueOf, "");
            return valueOf;
        }
        throw new n();
    }

    public static String a(o oVar, String str) {
        try {
            r d2 = oVar.d(str);
            if (d2 == null) {
                return "";
            }
            String c2 = d2.c();
            l.b(c2, "");
            return c2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static float a(o oVar, String str, float f2) {
        try {
            r d2 = oVar.d(str);
            if (d2 != null) {
                return d2.e();
            }
            return f2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return f2;
        }
    }

    public static long a(o oVar, String str, long j2) {
        try {
            r d2 = oVar.d(str);
            if (d2 != null) {
                return d2.f();
            }
            return j2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return j2;
        }
    }

    public static int a(o oVar, String str, int i2) {
        try {
            r d2 = oVar.d(str);
            if (d2 == null) {
                return i2;
            }
            if (!(d2.f54900a instanceof Boolean)) {
                return d2.g();
            }
            if (d2.h()) {
                return 1;
            }
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return i2;
        }
    }

    public static boolean a(o oVar, String str, boolean z) {
        try {
            r d2 = oVar.d(str);
            if (d2 == null) {
                return z;
            }
            if (!(d2.f54900a instanceof Number)) {
                return d2.h();
            }
            if (d2.b().intValue() == 1) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return z;
        }
    }
}

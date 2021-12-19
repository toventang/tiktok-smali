package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.g;
import com.google.gson.o;
import com.google.gson.t;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class dw {

    /* renamed from: a  reason: collision with root package name */
    private static final v<Boolean> f142838a = new v<Boolean>() {
        /* class com.ss.android.ugc.aweme.utils.dw.AnonymousClass1 */

        static {
            Covode.recordClassIndex(93452);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ Boolean read(a aVar) {
            return a(aVar);
        }

        private static Boolean a(a aVar) {
            b f2 = aVar.f();
            int i2 = AnonymousClass3.f142840a[f2.ordinal()];
            boolean z = true;
            if (i2 == 1) {
                return Boolean.valueOf(aVar.j());
            }
            if (i2 == 2) {
                aVar.k();
                return null;
            } else if (i2 == 3) {
                try {
                    if (aVar.n() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } catch (NumberFormatException e2) {
                    throw new t(e2);
                }
            } else if (i2 == 4) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.i()));
            } else {
                throw new IllegalStateException("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f2)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null) {
                cVar.f();
            } else {
                cVar.a(bool2);
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final v<Integer> f142839b = new v<Integer>() {
        /* class com.ss.android.ugc.aweme.utils.dw.AnonymousClass2 */

        static {
            Covode.recordClassIndex(93453);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ Integer read(a aVar) {
            return a(aVar);
        }

        private static Integer a(a aVar) {
            b f2 = aVar.f();
            int i2 = AnonymousClass3.f142840a[f2.ordinal()];
            if (i2 == 1) {
                return Integer.valueOf(aVar.j() ? 1 : 0);
            }
            if (i2 == 2) {
                aVar.k();
                return null;
            } else if (i2 == 3) {
                try {
                    return Integer.valueOf(aVar.n());
                } catch (NumberFormatException e2) {
                    throw new t(e2);
                }
            } else if (i2 == 4) {
                return Integer.valueOf(Boolean.parseBoolean(aVar.i()) ? 1 : 0);
            } else {
                throw new IllegalStateException("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f2)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, Integer num) {
            Integer num2 = num;
            if (num2 == null) {
                cVar.f();
            } else {
                cVar.a(num2);
            }
        }
    };

    static {
        Covode.recordClassIndex(93451);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.dw$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f142840a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 93454(0x16d0e, float:1.30957E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.c.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.utils.dw.AnonymousClass3.f142840a = r2
                com.google.gson.c.b r0 = com.google.gson.c.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.utils.dw.AnonymousClass3.f142840a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.gson.c.b r0 = com.google.gson.c.b.NULL     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.utils.dw.AnonymousClass3.f142840a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.google.gson.c.b r0 = com.google.gson.c.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.utils.dw.AnonymousClass3.f142840a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.google.gson.c.b r0 = com.google.gson.c.b.STRING     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.dw.AnonymousClass3.<clinit>():void");
        }
    }

    public static g a() {
        g gVar = new g();
        v<Boolean> vVar = f142838a;
        g a2 = gVar.a((Type) Boolean.class, (Object) vVar).a((Type) Boolean.TYPE, (Object) vVar);
        v<Integer> vVar2 = f142839b;
        g a3 = a2.a((Type) Integer.class, (Object) vVar2).a((Type) Integer.TYPE, (Object) vVar2);
        a3.f54717g = true;
        return a3;
    }

    public static String a(Object obj) {
        return a().b().b(obj);
    }

    public static <T> T a(String str, Class<T> cls) {
        return cls == null ? (T) new o() : (T) a().b().a(str, (Class) cls);
    }

    public static <T> List<T> b(String str, Class<T> cls) {
        try {
            return (List) a().b().a(str, (Type) com.google.gson.internal.b.a((Type) null, ArrayList.class, cls));
        } catch (NullPointerException unused) {
            return new ArrayList();
        }
    }
}

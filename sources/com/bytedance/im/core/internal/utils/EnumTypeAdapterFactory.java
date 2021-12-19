package com.bytedance.im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class EnumTypeAdapterFactory implements w {
    static {
        Covode.recordClassIndex(23113);
    }

    /* access modifiers changed from: package-private */
    public enum a {
        INT("int"),
        STRING("java.lang.String"),
        LONG("long"),
        DOUBLE("double"),
        BOOLEAN("boolean");
        
        public String value;

        public final String toString() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(23116);
        }

        private a(String str) {
            this.value = str;
        }
    }

    /* renamed from: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f38760a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 23115(0x5a4b, float:3.2391E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a[] r0 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.AnonymousClass2.f38760a = r2
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.a.INT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.AnonymousClass2.f38760a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.a.STRING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.AnonymousClass2.f38760a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.a.LONG     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.AnonymousClass2.f38760a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.a.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.AnonymousClass2.f38760a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.a.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.AnonymousClass2.<clinit>():void");
        }
    }

    private static boolean a(String str) {
        for (int i2 = 0; i2 < a.values().length; i2++) {
            if (a.values()[i2].value.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static a b(String str) {
        for (int i2 = 0; i2 < a.values().length; i2++) {
            a aVar = a.values()[i2];
            if (aVar.value.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        Object f38767a;

        /* renamed from: b  reason: collision with root package name */
        a f38768b;

        static {
            Covode.recordClassIndex(23117);
        }

        b(Object obj, a aVar) {
            this.f38767a = obj;
            this.f38768b = aVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.w
    public <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
        Object obj;
        Class<? super T> cls = aVar.rawType;
        if (!cls.isEnum()) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        try {
            Object[] enumConstants = cls.getEnumConstants();
            for (Object[] objArr : enumConstants) {
                if (objArr != 0) {
                    c cVar = (c) objArr.getClass().getField(objArr.toString()).getAnnotation(c.class);
                    if (cVar != null) {
                        hashMap.put(objArr, new b(cVar.a(), a.STRING));
                    } else {
                        Field[] declaredFields = objArr.getClass().getDeclaredFields();
                        if (declaredFields != null && declaredFields.length > 0) {
                            int length = declaredFields.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                Field field = declaredFields[i2];
                                if (a(field.getType().getName())) {
                                    field.setAccessible(true);
                                    a b2 = b(field.getType().getName());
                                    int i3 = AnonymousClass2.f38760a[b2.ordinal()];
                                    if (i3 == 1) {
                                        obj = Integer.valueOf(field.getInt(objArr));
                                    } else if (i3 == 2) {
                                        obj = field.get(objArr);
                                    } else if (i3 == 3) {
                                        obj = Long.valueOf(field.getLong(objArr));
                                    } else if (i3 == 4) {
                                        obj = Double.valueOf(field.getDouble(objArr));
                                    } else if (i3 == 5) {
                                        obj = Boolean.valueOf(field.getBoolean(objArr));
                                    }
                                    if (obj != null) {
                                        hashMap.put(objArr, new b(obj, b2));
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                        hashMap.put(objArr, new b(objArr.toString(), a.STRING));
                    }
                }
            }
        } catch (Throwable th) {
            i.a().a("imsdk", "EnumTypeAdapterFactory", th);
        }
        return new v<T>() {
            /* class com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23114);
            }

            @Override // com.google.gson.v
            public final T read(com.google.gson.c.a aVar) {
                if (aVar.f() == com.google.gson.c.b.NULL) {
                    aVar.k();
                    return null;
                }
                String i2 = aVar.i();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!(entry.getValue() == null || ((b) entry.getValue()).f38767a == null || !((b) entry.getValue()).f38767a.toString().equals(i2))) {
                        return (T) entry.getKey();
                    }
                }
                return null;
            }

            @Override // com.google.gson.v
            public final void write(com.google.gson.c.c cVar, T t) {
                if (t == null) {
                    cVar.f();
                    return;
                }
                b bVar = (b) hashMap.get(t);
                if (bVar != null) {
                    int i2 = AnonymousClass2.f38760a[bVar.f38768b.ordinal()];
                    if (i2 == 1) {
                        cVar.a((long) ((Integer) bVar.f38767a).intValue());
                    } else if (i2 == 2) {
                        cVar.b((String) bVar.f38767a);
                    } else if (i2 == 3) {
                        cVar.a(((Long) bVar.f38767a).longValue());
                    } else if (i2 == 4) {
                        cVar.a(((Double) bVar.f38767a).doubleValue());
                    } else if (i2 == 5) {
                        cVar.a((Boolean) bVar.f38767a);
                    }
                }
            }
        };
    }
}

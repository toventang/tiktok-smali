package com.bytedance.android.livesdk.as;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.lang.reflect.Array;
import java.util.Map;

public abstract class g<T> {
    static {
        Covode.recordClassIndex(7807);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(k kVar, T t);

    static final class f extends g<Object> {
        static {
            Covode.recordClassIndex(7815);
        }

        f() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.as.g
        public final void a(k kVar, Object obj) {
            kVar.a((Object) obj.toString());
        }
    }

    g() {
    }

    /* access modifiers changed from: package-private */
    public final g<Iterable<T>> a() {
        return new g<Iterable<T>>() {
            /* class com.bytedance.android.livesdk.as.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7808);
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.android.livesdk.as.g
            public final /* synthetic */ void a(k kVar, Object obj) {
                Iterable<T> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (T t : iterable) {
                        g.this.a(kVar, t);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final g<Object> b() {
        return new g<Object>() {
            /* class com.bytedance.android.livesdk.as.g.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7809);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.livesdk.as.g */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.android.livesdk.as.g
            public final void a(k kVar, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        g.this.a(kVar, Array.get(obj, i2));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> extends g<T> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f14077a = false;

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.retrofit2.e<T, TypedOutput> f14078b;

        static {
            Covode.recordClassIndex(7810);
        }

        a(com.bytedance.retrofit2.e<T, TypedOutput> eVar) {
            this.f14078b = eVar;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ byte[] a(Object obj) {
            try {
                return ((TypedByteArray) this.f14078b.a(obj)).getBytes();
            } catch (Exception e2) {
                throw new RuntimeException("Unable to convert " + obj + " to TypedOutput", e2);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.as.g
        public final void a(k kVar, T t) {
            if (t != null) {
                kVar.f14118b = "application/json; charset=UTF-8";
                kVar.f14122f = new h(this, t);
            } else if (!this.f14077a) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    static final class c<T> extends g<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final com.bytedance.retrofit2.e<T, String> f14082a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f14083b;

        static {
            Covode.recordClassIndex(7812);
        }

        c(com.bytedance.retrofit2.e<T, String> eVar, boolean z) {
            this.f14082a = eVar;
            this.f14083b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.as.g
        public final /* synthetic */ void a(k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar.b(str, (String) this.f14082a.a(value), this.f14083b);
                        } else {
                            throw new IllegalArgumentException("Field map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    static final class e<T> extends g<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final com.bytedance.retrofit2.e<T, String> f14087a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f14088b;

        static {
            Covode.recordClassIndex(7814);
        }

        e(com.bytedance.retrofit2.e<T, String> eVar, boolean z) {
            this.f14087a = eVar;
            this.f14088b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.as.g
        public final /* synthetic */ void a(k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar.a(str, (String) this.f14087a.a(value), this.f14088b);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    static final class b<T> extends g<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f14079a;

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.retrofit2.e<T, String> f14080b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f14081c;

        static {
            Covode.recordClassIndex(7811);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.as.g
        public final void a(k kVar, T t) {
            if (t != null) {
                kVar.b(this.f14079a, this.f14080b.a(t), this.f14081c);
            }
        }

        b(String str, com.bytedance.retrofit2.e<T, String> eVar, boolean z) {
            this.f14079a = (String) l.a(str, "name == null");
            this.f14080b = eVar;
            this.f14081c = z;
        }
    }

    static final class d<T> extends g<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f14084a;

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.retrofit2.e<T, String> f14085b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f14086c;

        static {
            Covode.recordClassIndex(7813);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.as.g
        public final void a(k kVar, T t) {
            if (t != null) {
                kVar.a(this.f14084a, this.f14085b.a(t), this.f14086c);
            }
        }

        d(String str, com.bytedance.retrofit2.e<T, String> eVar, boolean z) {
            this.f14084a = (String) l.a(str, "name == null");
            this.f14085b = eVar;
            this.f14086c = z;
        }
    }
}

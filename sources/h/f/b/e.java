package h.f.b;

import com.bytedance.covode.number.Covode;
import h.f.b;
import h.k.c;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e implements d, c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<? extends h.c<?>>, Integer> f158715a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, String> f158716b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, String> f158717c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f158718d = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, String> f158719f;

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, String> f158720g;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f158721e;

    public static final class a {
        static {
            Covode.recordClassIndex(105216);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // h.f.b.d
    public final Class<?> a() {
        return this.f158721e;
    }

    @Override // h.k.a
    public final List<Annotation> getAnnotations() {
        throw new b();
    }

    public final int hashCode() {
        return h.f.a.b(this).hashCode();
    }

    public final String toString() {
        return this.f158721e.toString() + " (Kotlin reflection is not available)";
    }

    @Override // h.k.c
    public final String c() {
        String str;
        String str2;
        Class<?> cls = this.f158721e;
        l.d(cls, "");
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            l.b(componentType, "");
            if (!componentType.isPrimitive() || (str = f158716b.get(componentType.getName())) == null || (str + "Array") == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = f158716b.get(cls.getName());
        if (str3 == null) {
            return cls.getCanonicalName();
        }
        return str3;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // h.k.c
    public final java.lang.String b() {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.b.e.b():java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
        */
    static {
        /*
        // Method dump skipped, instructions count: 656
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.b.e.<clinit>():void");
    }

    public e(Class<?> cls) {
        l.d(cls, "");
        this.f158721e = cls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e) || !l.a(h.f.a.b(this), h.f.a.b((c) obj))) {
            return false;
        }
        return true;
    }
}

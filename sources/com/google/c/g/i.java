package com.google.c.g;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.a.l;
import com.google.c.a.m;
import com.google.c.c.ab;
import com.google.c.c.am;
import com.google.c.c.br;
import com.google.c.c.z;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.c.a.f<Type, String> f54168a = new com.google.c.a.f<Type, String>() {
        /* class com.google.c.g.i.AnonymousClass1 */

        static {
            Covode.recordClassIndex(33602);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.c.a.f
        public final /* synthetic */ String a(Type type) {
            return c.f54179e.c(type);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final com.google.c.a.g f54169b = com.google.c.a.g.a(", ").b("null");

    /* access modifiers changed from: package-private */
    public enum a {
        OWNED_BY_ENCLOSING_CLASS {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.a
            public final Class<?> a(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.a
            public final Class<?> a(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        

        /* renamed from: c  reason: collision with root package name */
        static final a f54173c;

        /* access modifiers changed from: package-private */
        public abstract Class<?> a(Class<?> cls);

        /* renamed from: com.google.c.g.i$a$a  reason: collision with other inner class name */
        class C1237a<T> {
            static {
                Covode.recordClassIndex(33608);
            }

            C1237a() {
            }
        }

        static {
            Covode.recordClassIndex(33604);
            ParameterizedType parameterizedType = (ParameterizedType) new C1237a<String>() {
                /* class com.google.c.g.i.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(33607);
                }
            }.getClass().getGenericSuperclass();
            a[] values = values();
            for (a aVar : values) {
                if (aVar.a(C1237a.class) == parameterizedType.getOwnerType()) {
                    f54173c = aVar;
                    return;
                }
            }
            throw new AssertionError();
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        static {
            Covode.recordClassIndex(33609);
        }

        public final Type getGenericComponentType() {
            return this.componentType;
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final String toString() {
            return i.b(this.componentType) + "[]";
        }

        b(Type type) {
            this.componentType = c.f54179e.b(type);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.c.a.i.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<X> {

        /* renamed from: a  reason: collision with root package name */
        static final boolean f54181a = (!d.class.getTypeParameters()[0].equals(i.a(d.class, "X", new Type[0])));

        d() {
        }

        static {
            Covode.recordClassIndex(33617);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        private final z<Type> argumentsList;
        private final Type ownerType;
        private final Class<?> rawType;

        static {
            Covode.recordClassIndex(33618);
        }

        public final Type getOwnerType() {
            return this.ownerType;
        }

        public final Type getRawType() {
            return this.rawType;
        }

        public final Type[] getActualTypeArguments() {
            return i.a(this.argumentsList);
        }

        public final int hashCode() {
            int hashCode;
            Type type = this.ownerType;
            if (type == null) {
                hashCode = 0;
            } else {
                hashCode = type.hashCode();
            }
            return (hashCode ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.ownerType != null && c.f54179e.a()) {
                sb.append(c.f54179e.c(this.ownerType)).append('.');
            }
            StringBuilder append = sb.append(this.rawType.getName()).append('<');
            com.google.c.a.g gVar = i.f54169b;
            z<Type> zVar = this.argumentsList;
            com.google.c.a.f<Type, String> fVar = i.f54168a;
            k.a(zVar);
            k.a(fVar);
            return append.append(gVar.a((Iterable<?>) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0055: RETURN  
                  (wrap: java.lang.String : 0x0051: INVOKE  (r0v8 java.lang.String) = 
                  (wrap: java.lang.StringBuilder : 0x004d: INVOKE  (r0v7 java.lang.StringBuilder) = 
                  (wrap: java.lang.StringBuilder : 0x0047: INVOKE  (r1v2 java.lang.StringBuilder) = 
                  (r4v0 'append' java.lang.StringBuilder)
                  (wrap: java.lang.String : 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String)
                 type: VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder)
                  ('>' char)
                 type: VIRTUAL call: java.lang.StringBuilder.append(char):java.lang.StringBuilder)
                 type: VIRTUAL call: java.lang.StringBuilder.toString():java.lang.String)
                 in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: INVOKE  (r0v8 java.lang.String) = 
                  (wrap: java.lang.StringBuilder : 0x004d: INVOKE  (r0v7 java.lang.StringBuilder) = 
                  (wrap: java.lang.StringBuilder : 0x0047: INVOKE  (r1v2 java.lang.StringBuilder) = 
                  (r4v0 'append' java.lang.StringBuilder)
                  (wrap: java.lang.String : 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String)
                 type: VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder)
                  ('>' char)
                 type: VIRTUAL call: java.lang.StringBuilder.append(char):java.lang.StringBuilder)
                 type: VIRTUAL call: java.lang.StringBuilder.toString():java.lang.String in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 14 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: INVOKE  (r0v7 java.lang.StringBuilder) = 
                  (wrap: java.lang.StringBuilder : 0x0047: INVOKE  (r1v2 java.lang.StringBuilder) = 
                  (r4v0 'append' java.lang.StringBuilder)
                  (wrap: java.lang.String : 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String)
                 type: VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder)
                  ('>' char)
                 type: VIRTUAL call: java.lang.StringBuilder.append(char):java.lang.StringBuilder in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 18 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: INVOKE  (r1v2 java.lang.StringBuilder) = 
                  (r4v0 'append' java.lang.StringBuilder)
                  (wrap: java.lang.String : 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String)
                 type: VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 24 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 30 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR) in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 36 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 42 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.c.c.am, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 46 more
                */
            /*
                this = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.reflect.Type r0 = r5.ownerType
                if (r0 == 0) goto L_0x0022
                com.google.c.g.i$c r0 = com.google.c.g.i.c.f54179e
                boolean r0 = r0.a()
                if (r0 == 0) goto L_0x0022
                com.google.c.g.i$c r1 = com.google.c.g.i.c.f54179e
                java.lang.reflect.Type r0 = r5.ownerType
                java.lang.String r0 = r1.c(r0)
                java.lang.StringBuilder r1 = r2.append(r0)
                r0 = 46
                r1.append(r0)
            L_0x0022:
                java.lang.Class<?> r0 = r5.rawType
                java.lang.String r0 = r0.getName()
                java.lang.StringBuilder r1 = r2.append(r0)
                r0 = 60
                java.lang.StringBuilder r4 = r1.append(r0)
                com.google.c.a.g r3 = com.google.c.g.i.f54169b
                com.google.c.c.z<java.lang.reflect.Type> r2 = r5.argumentsList
                com.google.c.a.f<java.lang.reflect.Type, java.lang.String> r1 = com.google.c.g.i.f54168a
                com.google.c.a.k.a(r2)
                com.google.c.a.k.a(r1)
                com.google.c.c.am$2 r0 = new com.google.c.c.am$2
                r0.<init>(r2, r1)
                java.lang.String r0 = r3.a(r0)
                java.lang.StringBuilder r1 = r4.append(r0)
                r0 = 62
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.c.g.i.e.toString():java.lang.String");
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!getRawType().equals(parameterizedType.getRawType()) || !com.google.c.a.i.a(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }

        e(Type type, Class<?> cls, Type[] typeArr) {
            boolean z;
            k.a(cls);
            if (typeArr.length == cls.getTypeParameters().length) {
                z = true;
            } else {
                z = false;
            }
            k.a(z);
            i.a(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = c.f54179e.a(typeArr);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<D extends GenericDeclaration> {

        /* renamed from: a  reason: collision with root package name */
        public final D f54182a;

        /* renamed from: b  reason: collision with root package name */
        public final String f54183b;

        /* renamed from: c  reason: collision with root package name */
        private final z<Type> f54184c;

        static {
            Covode.recordClassIndex(33619);
        }

        public final String toString() {
            return this.f54183b;
        }

        public final int hashCode() {
            return this.f54182a.hashCode() ^ this.f54183b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (d.f54181a) {
                if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof g)) {
                    f<?> fVar = ((g) Proxy.getInvocationHandler(obj)).f54186a;
                    if (!this.f54183b.equals(fVar.f54183b) || !this.f54182a.equals(fVar.f54182a) || !this.f54184c.equals(fVar.f54184c)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            if (obj instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (!this.f54183b.equals(typeVariable.getName()) || !this.f54182a.equals(typeVariable.getGenericDeclaration())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        f(D d2, String str, Type[] typeArr) {
            i.a(typeArr, "bound for type variable");
            this.f54182a = (D) ((GenericDeclaration) k.a(d2));
            this.f54183b = (String) k.a(str);
            this.f54184c = z.copyOf(typeArr);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        private final z<Type> lowerBounds;
        private final z<Type> upperBounds;

        static {
            Covode.recordClassIndex(33621);
        }

        public final Type[] getLowerBounds() {
            return i.a(this.lowerBounds);
        }

        public final Type[] getUpperBounds() {
            return i.a(this.upperBounds);
        }

        public final int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("?");
            br<Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                sb.append(" super ").append(c.f54179e.c(it.next()));
            }
            for (Type type : am.a((Iterable) this.upperBounds, (l) new m.c(new m.b(Object.class, (byte) 0)))) {
                sb.append(" extends ").append(c.f54179e.c(type));
            }
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (!this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return false;
                }
                return true;
            }
            return false;
        }

        h(Type[] typeArr, Type[] typeArr2) {
            i.a(typeArr, "lower bound for wildcard");
            i.a(typeArr2, "upper bound for wildcard");
            this.lowerBounds = c.f54179e.a(typeArr);
            this.upperBounds = c.f54179e.a(typeArr2);
        }
    }

    static {
        Covode.recordClassIndex(33601);
    }

    /* access modifiers changed from: package-private */
    public static final class g implements InvocationHandler {

        /* renamed from: b  reason: collision with root package name */
        private static final ab<String, Method> f54185b;

        /* renamed from: a  reason: collision with root package name */
        public final f<?> f54186a;

        static {
            Covode.recordClassIndex(33620);
            ab.a builder = ab.builder();
            Method[] methods = f.class.getMethods();
            for (Method method : methods) {
                if (method.getDeclaringClass().equals(f.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.a(method.getName(), method);
                }
            }
            f54185b = builder.a();
        }

        g(f<?> fVar) {
            this.f54186a = fVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Method method2 = f54185b.get(name);
            if (method2 != null) {
                try {
                    f<?> fVar = this.f54186a;
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method2, new Object[]{fVar, objArr}, 110000, "java.lang.Object", true, "com_google_common_reflect_Types$TypeVariableInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        return a2.second;
                    }
                    Object invoke = method2.invoke(fVar, objArr);
                    com.bytedance.helios.sdk.a.a(invoke, method2, new Object[]{fVar, objArr}, "com_google_common_reflect_Types$TypeVariableInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                throw new UnsupportedOperationException(name);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public enum c {
        JAVA6 {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final /* synthetic */ Type a(Type type) {
                return new b(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final Type b(Type type) {
                k.a(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                if (cls.isArray()) {
                    return new b(cls.getComponentType());
                }
                return type;
            }
        },
        JAVA7 {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final Type b(Type type) {
                return (Type) k.a(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final Type a(Type type) {
                if (type instanceof Class) {
                    return i.a((Class<?>) ((Class) type));
                }
                return new b(type);
            }
        },
        JAVA8 {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final Type a(Type type) {
                return JAVA7.a(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final Type b(Type type) {
                return JAVA7.b(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final String c(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }
        },
        JAVA9 {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final boolean a() {
                return false;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final Type a(Type type) {
                return JAVA8.a(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final Type b(Type type) {
                return JAVA8.b(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.i.c
            public final String c(Type type) {
                return JAVA8.c(type);
            }
        };
        

        /* renamed from: e  reason: collision with root package name */
        static final c f54179e;

        /* access modifiers changed from: package-private */
        public abstract Type a(Type type);

        /* access modifiers changed from: package-private */
        public boolean a() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public abstract Type b(Type type);

        static {
            AnonymousClass1 r5;
            AnonymousClass2 r4;
            AnonymousClass3 r3;
            AnonymousClass4 r2;
            Covode.recordClassIndex(33610);
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new d<Map.Entry<String, int[][]>>() {
                    /* class com.google.c.g.i.c.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(33615);
                    }
                }.a().toString().contains("java.util.Map.java.util.Map")) {
                    f54179e = r3;
                } else {
                    f54179e = r2;
                }
            } else if (new d<int[]>() {
                /* class com.google.c.g.i.c.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(33616);
                }
            }.a() instanceof Class) {
                f54179e = r4;
            } else {
                f54179e = r5;
            }
        }

        /* access modifiers changed from: package-private */
        public String c(Type type) {
            return i.b(type);
        }

        /* access modifiers changed from: package-private */
        public final z<Type> a(Type[] typeArr) {
            z.a builder = z.builder();
            for (Type type : typeArr) {
                builder.c(b(type));
            }
            return builder.a();
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    static Class<?> a(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    static String b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    private static WildcardType d(Type type) {
        return new h(new Type[0], new Type[]{type});
    }

    static Type c(Type type) {
        k.a(type);
        final AtomicReference atomicReference = new AtomicReference();
        new h() {
            /* class com.google.c.g.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(33603);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.h
            public final void a(Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.h
            public final void a(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.h
            public final void a(TypeVariable<?> typeVariable) {
                atomicReference.set(i.a(typeVariable.getBounds()));
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.h
            public final void a(WildcardType wildcardType) {
                atomicReference.set(i.a(wildcardType.getUpperBounds()));
            }
        }.a(type);
        return (Type) atomicReference.get();
    }

    private static WildcardType e(Type type) {
        return new h(new Type[]{type}, new Type[]{Object.class});
    }

    static Type a(Type type) {
        boolean z;
        if (!(type instanceof WildcardType)) {
            return c.f54179e.a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z2 = true;
        if (lowerBounds.length <= 1) {
            z = true;
        } else {
            z = false;
        }
        k.a(z, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return e(a(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z2 = false;
        }
        k.a(z2, "Wildcard should have only one upper bound.");
        return d(a(upperBounds[0]));
    }

    public static Type a(Type[] typeArr) {
        for (Type type : typeArr) {
            Type c2 = c(type);
            if (c2 != null) {
                if (c2 instanceof Class) {
                    Class cls = (Class) c2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return d(c2);
            }
        }
        return null;
    }

    public static Type[] a(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    private static ParameterizedType a(Class<?> cls, Type... typeArr) {
        return new e(a.f54173c.a(cls), cls, typeArr);
    }

    public static void a(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                k.a(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    private static <D extends GenericDeclaration> TypeVariable<D> b(D d2, String str, Type[] typeArr) {
        return (TypeVariable) c.a(TypeVariable.class, new g(new f(d2, str, typeArr)));
    }

    static ParameterizedType a(Type type, Class<?> cls, Type... typeArr) {
        boolean z;
        if (type == null) {
            return a(cls, typeArr);
        }
        k.a(typeArr);
        if (cls.getEnclosingClass() != null) {
            z = true;
        } else {
            z = false;
        }
        k.a(z, "Owner type for unenclosed %s", cls);
        return new e(type, cls, typeArr);
    }

    static <D extends GenericDeclaration> TypeVariable<D> a(D d2, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return b(d2, str, typeArr);
    }
}

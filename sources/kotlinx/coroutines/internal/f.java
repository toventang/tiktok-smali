package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import h.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final int f159123a = a(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantReadWriteLock f159124b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, h.f.a.b<Throwable, Throwable>> f159125c = new WeakHashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.internal.f$f  reason: collision with other inner class name */
    public static final class C4193f extends m implements h.f.a.b {

        /* renamed from: a  reason: collision with root package name */
        public static final C4193f f159126a = new C4193f();

        static {
            Covode.recordClassIndex(105654);
        }

        C4193f() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f159127a = new g();

        static {
            Covode.recordClassIndex(105655);
        }

        g() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(105648);
    }

    public static final class a extends m implements h.f.a.b<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        static {
            Covode.recordClassIndex(105649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                Object newInstance = this.$constructor$inlined.newInstance(th.getMessage(), th);
                if (newInstance != null) {
                    obj = q.m223constructorimpl((Throwable) newInstance);
                    if (q.m228isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Throwable th2) {
                obj = q.m223constructorimpl(r.a(th2));
            }
        }
    }

    public static final class b extends m implements h.f.a.b<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        static {
            Covode.recordClassIndex(105650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                Object newInstance = this.$constructor$inlined.newInstance(th);
                if (newInstance != null) {
                    obj = q.m223constructorimpl((Throwable) newInstance);
                    if (q.m228isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Throwable th2) {
                obj = q.m223constructorimpl(r.a(th2));
            }
        }
    }

    public static final class c extends m implements h.f.a.b<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        static {
            Covode.recordClassIndex(105651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                Object newInstance = this.$constructor$inlined.newInstance(th.getMessage());
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = q.m223constructorimpl(th2);
                    if (q.m228isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Throwable th3) {
                obj = q.m223constructorimpl(r.a(th3));
            }
        }
    }

    public static final class d extends m implements h.f.a.b<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        static {
            Covode.recordClassIndex(105652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                Object newInstance = this.$constructor$inlined.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = q.m223constructorimpl(th2);
                    if (q.m228isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Throwable th3) {
                obj = q.m223constructorimpl(r.a(th3));
            }
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:311)
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    public static final <E extends java.lang.Throwable> E a(E r9) {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.f.a(java.lang.Throwable):java.lang.Throwable");
    }

    public static final class e<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(105653);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t2.getParameterTypes().length), Integer.valueOf(t.getParameterTypes().length));
        }
    }

    private static final int a(Class<?> cls, int i2) {
        Integer num;
        l.d(cls, "");
        ab.a(cls);
        int i3 = 0;
        do {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (!Modifier.isStatic(declaredFields[i5].getModifiers())) {
                        i4++;
                    }
                }
                i3 += i4;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                num = q.m223constructorimpl(r.a(th));
            }
        } while (cls != null);
        num = q.m223constructorimpl(Integer.valueOf(i3));
        Integer valueOf = Integer.valueOf(i2);
        if (q.m228isFailureimpl(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }
}

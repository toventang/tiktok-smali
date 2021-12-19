package com.google.android.gms.internal.measurement;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.gm;
import com.google.android.gms.internal.measurement.gm.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class gm<MessageType extends gm<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends ev<MessageType, BuilderType> {
    private static Map<Object, gm<?, ?>> zzd = new ConcurrentHashMap();
    protected jd zzb = jd.f51055a;
    private int zzc = -1;

    public static class d<ContainingType extends ht, Type> extends fw<ContainingType, Type> {
        static {
            Covode.recordClassIndex(31824);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i2);

    public static abstract class a<MessageType extends gm<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends eu<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        protected MessageType f50937a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f50938b = false;

        /* renamed from: c  reason: collision with root package name */
        private final MessageType f50939c;

        static {
            Covode.recordClassIndex(31821);
        }

        @Override // com.google.android.gms.internal.measurement.hv
        public final /* synthetic */ ht H_() {
            return this.f50939c;
        }

        @Override // com.google.android.gms.internal.measurement.hv
        public final boolean G_() {
            return gm.a((gm) this.f50937a, false);
        }

        @Override // com.google.android.gms.internal.measurement.eu
        public final /* synthetic */ eu s() {
            return (eu) clone();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MessageType v() {
            if (this.f50938b) {
                return this.f50937a;
            }
            MessageType messagetype = this.f50937a;
            ii.f51018a.a(messagetype).c(messagetype);
            this.f50938b = true;
            return this.f50937a;
        }

        @Override // com.google.android.gms.internal.measurement.eu, java.lang.Object
        public /* synthetic */ Object clone() {
            a aVar = (a) this.f50939c.a(e.f50945e);
            aVar.a((gm) v());
            return aVar;
        }

        /* access modifiers changed from: protected */
        public final void t() {
            MessageType messagetype = (MessageType) ((gm) this.f50937a.a(e.f50944d));
            a(messagetype, this.f50937a);
            this.f50937a = messagetype;
        }

        /* renamed from: u */
        public final MessageType w() {
            MessageType a2 = v();
            if (a2.G_()) {
                return a2;
            }
            throw new jb(a2);
        }

        protected a(MessageType messagetype) {
            this.f50939c = messagetype;
            this.f50937a = (MessageType) ((gm) messagetype.a(e.f50944d));
        }

        public final BuilderType a(MessageType messagetype) {
            if (this.f50938b) {
                t();
                this.f50938b = false;
            }
            a(this.f50937a, messagetype);
            return this;
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            ii.f51018a.a(messagetype).b(messagetype, messagetype2);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final BuilderType a(fq fqVar, fy fyVar) {
            fr frVar;
            if (this.f50938b) {
                t();
                this.f50938b = false;
            }
            try {
                in a2 = ii.f51018a.a(this.f50937a);
                MessageType messagetype = this.f50937a;
                if (fqVar.f50868c != null) {
                    frVar = fqVar.f50868c;
                } else {
                    frVar = new fr(fqVar);
                }
                a2.a(messagetype, frVar, fyVar);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw e2.getCause();
                }
                throw e2;
            }
        }

        @Override // com.google.android.gms.internal.measurement.eu
        public final /* synthetic */ eu a(byte[] bArr, int i2) {
            return a(bArr, i2, fy.a());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final BuilderType a(byte[] bArr, int i2, fy fyVar) {
            if (this.f50938b) {
                t();
                this.f50938b = false;
            }
            try {
                ii.f51018a.a(this.f50937a).a(this.f50937a, bArr, 0, i2 + 0, new ez(fyVar));
                return this;
            } catch (gu e2) {
                throw e2;
            } catch (IndexOutOfBoundsException unused) {
                throw gu.a();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.ev
    public final int i() {
        return this.zzc;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final int f50941a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f50942b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f50943c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f50944d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f50945e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f50946f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f50947g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final int f50948h = 1;

        /* renamed from: i  reason: collision with root package name */
        public static final int f50949i = 2;

        /* renamed from: j  reason: collision with root package name */
        public static final int f50950j = 1;

        /* renamed from: k  reason: collision with root package name */
        public static final int f50951k = 2;

        /* renamed from: l  reason: collision with root package name */
        private static final /* synthetic */ int[] f50952l = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: m  reason: collision with root package name */
        private static final /* synthetic */ int[] f50953m = {1, 2};
        private static final /* synthetic */ int[] n = {1, 2};

        static {
            Covode.recordClassIndex(31825);
        }

        public static int[] a() {
            return (int[]) f50952l.clone();
        }
    }

    static {
        Covode.recordClassIndex(31820);
    }

    @Override // com.google.android.gms.internal.measurement.hv
    public final boolean G_() {
        return a(this, Boolean.TRUE.booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.hv
    public final /* synthetic */ ht H_() {
        return (ev) a(e.f50946f);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends gm<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType j() {
        return (BuilderType) ((a) a(e.f50945e));
    }

    public final BuilderType l() {
        BuilderType buildertype = (BuilderType) ((a) a(e.f50945e));
        buildertype.a(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.ht
    public final /* synthetic */ hw n() {
        a aVar = (a) a(e.f50945e);
        aVar.a((gm) this);
        return aVar;
    }

    @Override // com.google.android.gms.internal.measurement.ht
    public final /* synthetic */ hw o() {
        return (eu) a(e.f50945e);
    }

    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends gm<MessageType, BuilderType> {
        protected gb<Object> zzc = gb.f50901d;

        static {
            Covode.recordClassIndex(31822);
        }

        /* access modifiers changed from: package-private */
        public final gb<Object> a() {
            if (this.zzc.f50903b) {
                this.zzc = (gb) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = ii.f51018a.a(this).a(this);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.ht
    public final int m() {
        if (this.zzc == -1) {
            this.zzc = ii.f51018a.a(this).b(this);
        }
        return this.zzc;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(obj);
        hy.a(this, sb, 0);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.ev
    public final void b(int i2) {
        this.zzc = i2;
    }

    public static class c<T extends gm<T, ?>> extends ew<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f50940a;

        static {
            Covode.recordClassIndex(31823);
        }

        public c(T t) {
            this.f50940a = t;
        }
    }

    protected static gs a(gs gsVar) {
        int i2;
        int size = gsVar.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size << 1;
        }
        return gsVar.c(i2);
    }

    protected static <E> gv<E> a(gv<E> gvVar) {
        int i2;
        int size = gvVar.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size << 1;
        }
        return gvVar.a(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ii.f51018a.a(this).a(this, obj);
        }
        return false;
    }

    static <T extends gm<?, ?>> T a(Class<T> cls) {
        T t = (T) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzd.get(cls);
                if (t == null) {
                    t = (T) ((gm) ((gm) jk.a(cls)).a(e.f50946f));
                    if (t != null) {
                        zzd.put(cls, t);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        return t;
    }

    @Override // com.google.android.gms.internal.measurement.ht
    public final void a(ft ftVar) {
        fv fvVar;
        in a2 = ii.f51018a.a(this);
        if (ftVar.f50884a != null) {
            fvVar = ftVar.f50884a;
        } else {
            fvVar = new fv(ftVar);
        }
        a2.a((Object) this, (jw) fvVar);
    }

    protected static <T extends gm<?, ?>> void a(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends gm<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(e.f50941a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = ii.f51018a.a(t).d(t);
        if (z) {
            t.a(e.f50942b);
        }
        return d2;
    }

    protected static Object a(ht htVar, String str, Object[] objArr) {
        return new il(htVar, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_google_android_gms_internal_measurement_zzib_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_google_android_gms_internal_measurement_zzib_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            } else if (cause instanceof Error) {
                throw cause;
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }
}

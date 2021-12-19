package h.c.b.a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    static final a f158663a = new a(null, null, null);

    /* renamed from: b  reason: collision with root package name */
    static a f158664b;

    /* renamed from: c  reason: collision with root package name */
    public static final h f158665c = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(105118);
    }

    static a a(a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(StringSet.name, new Class[0]));
            f158664b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f158663a;
            f158664b = aVar3;
            return aVar3;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f158666a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f158667b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f158668c;

        static {
            Covode.recordClassIndex(105119);
        }

        public a(Method method, Method method2, Method method3) {
            this.f158666a = method;
            this.f158667b = method2;
            this.f158668c = method3;
        }
    }
}

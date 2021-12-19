package androidx.lifecycle;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;
import java.lang.reflect.InvocationTargetException;

public class ad {

    /* renamed from: a  reason: collision with root package name */
    private final b f3507a;

    /* renamed from: b  reason: collision with root package name */
    private final af f3508b;

    public interface b {
        static {
            Covode.recordClassIndex(1301);
        }

        <T extends ac> T a(Class<T> cls);
    }

    static {
        Covode.recordClassIndex(1299);
    }

    /* access modifiers changed from: package-private */
    public static abstract class c extends e implements b {
        static {
            Covode.recordClassIndex(1302);
        }

        public abstract <T extends ac> T a();

        c() {
        }
    }

    static class e {
        static {
            Covode.recordClassIndex(1304);
        }

        e() {
        }
    }

    public static class a extends d {

        /* renamed from: b  reason: collision with root package name */
        private static a f3509b;

        /* renamed from: c  reason: collision with root package name */
        private Application f3510c;

        static {
            Covode.recordClassIndex(1300);
        }

        public a(Application application) {
            this.f3510c = application;
        }

        public static a a(Application application) {
            if (f3509b == null) {
                f3509b = new a(application);
            }
            return f3509b;
        }

        @Override // androidx.lifecycle.ad.d, androidx.lifecycle.ad.b
        public <T extends ac> T a(Class<T> cls) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f3510c);
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e5);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ad(androidx.lifecycle.ag r3) {
        /*
            r2 = this;
            androidx.lifecycle.af r1 = r3.getViewModelStore()
            boolean r0 = r3 instanceof androidx.lifecycle.g
            if (r0 == 0) goto L_0x0012
            androidx.lifecycle.g r3 = (androidx.lifecycle.g) r3
            androidx.lifecycle.ad$b r0 = r3.a()
        L_0x000e:
            r2.<init>(r1, r0)
            return
        L_0x0012:
            androidx.lifecycle.ad$d r0 = androidx.lifecycle.ad.d.f3511a
            if (r0 != 0) goto L_0x001d
            androidx.lifecycle.ad$d r0 = new androidx.lifecycle.ad$d
            r0.<init>()
            androidx.lifecycle.ad.d.f3511a = r0
        L_0x001d:
            androidx.lifecycle.ad$d r0 = androidx.lifecycle.ad.d.f3511a
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ad.<init>(androidx.lifecycle.ag):void");
    }

    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        static d f3511a;

        static {
            Covode.recordClassIndex(1303);
        }

        @Override // androidx.lifecycle.ad.b
        public <T extends ac> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            }
        }
    }

    public <T extends ac> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(canonicalName));
            if (cls.equals(ScopeViewModel.class)) {
                return (T) a(concat, cls);
            }
            T t = (T) a(concat, cls);
            ab.a(t, this);
            return t;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public ad(af afVar, b bVar) {
        this.f3507a = bVar;
        this.f3508b = afVar;
    }

    public ad(ag agVar, b bVar) {
        this(agVar.getViewModelStore(), bVar);
    }

    public <T extends ac> T a(String str, Class<T> cls) {
        T t = (T) this.f3508b.a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        b bVar = this.f3507a;
        T t2 = bVar instanceof c ? (T) ((c) bVar).a() : (T) bVar.a(cls);
        this.f3508b.a(str, t2);
        return t2;
    }
}

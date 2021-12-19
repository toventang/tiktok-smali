package dagger.hilt.android.internal.managers;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import dagger.hilt.android.internal.a.e;
import dagger.hilt.android.internal.a.f;
import java.lang.reflect.Field;

public final class g implements dagger.hilt.a.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f156679a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f156680b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f156681c;

    /* renamed from: d  reason: collision with root package name */
    private final View f156682d;

    public interface b {
        static {
            Covode.recordClassIndex(104064);
        }

        e l();
    }

    public interface c {
        static {
            Covode.recordClassIndex(104065);
        }

        f a();
    }

    static {
        Covode.recordClassIndex(104062);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        dagger.hilt.a.b bVar;
        Object a2;
        boolean z;
        MethodCollector.i(471);
        if (this.f156679a == null) {
            synchronized (this.f156680b) {
                try {
                    if (this.f156679a == null) {
                        if (this.f156681c) {
                            Context a3 = a(a.class);
                            if (a3 instanceof a) {
                                bVar = (dagger.hilt.a.b) ((a) a3).f156683a;
                            } else {
                                Context a4 = a(dagger.hilt.a.b.class);
                                if (!(a4 instanceof dagger.hilt.a.b)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                dagger.hilt.a.c.a(z, "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f156682d.getClass(), a4.getClass().getName());
                                IllegalStateException illegalStateException = new IllegalStateException(com.a.a("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{this.f156682d.getClass()}));
                                MethodCollector.o(471);
                                throw illegalStateException;
                            }
                        } else {
                            Context a5 = a(dagger.hilt.a.b.class);
                            if (a5 instanceof dagger.hilt.a.b) {
                                bVar = (dagger.hilt.a.b) a5;
                            }
                            IllegalStateException illegalStateException2 = new IllegalStateException(com.a.a("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{this.f156682d.getClass()}));
                            MethodCollector.o(471);
                            throw illegalStateException2;
                        }
                        if (this.f156681c) {
                            a2 = ((c) bVar.generatedComponent()).a().a(this.f156682d).a();
                        } else {
                            a2 = ((b) bVar.generatedComponent()).l().a(this.f156682d).a();
                        }
                        this.f156679a = a2;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(471);
                    throw th;
                }
            }
        }
        Object obj = this.f156679a;
        MethodCollector.o(471);
        return obj;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static final class a extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final Fragment f156683a;

        /* renamed from: b  reason: collision with root package name */
        private LayoutInflater f156684b;

        /* renamed from: c  reason: collision with root package name */
        private LayoutInflater f156685c;

        static {
            Covode.recordClassIndex(104063);
        }

        @Override // android.content.Context, android.content.ContextWrapper
        public final Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return a(getBaseContext(), str);
            }
            if (this.f156685c == null) {
                if (this.f156684b == null) {
                    this.f156684b = (LayoutInflater) a(getBaseContext(), "layout_inflater");
                }
                this.f156685c = this.f156684b.cloneInContext(this);
            }
            return this.f156685c;
        }

        public a(Context context, Fragment fragment) {
            super((Context) dagger.hilt.a.c.a(context));
            this.f156684b = null;
            this.f156683a = (Fragment) dagger.hilt.a.c.a(fragment);
        }

        public a(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) dagger.hilt.a.c.a(((LayoutInflater) dagger.hilt.a.c.a(layoutInflater)).getContext()));
            this.f156684b = layoutInflater;
            this.f156683a = (Fragment) dagger.hilt.a.c.a(fragment);
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(3137);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(3137);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    private Context a(Class<?> cls) {
        Context a2 = a(this.f156682d.getContext(), cls);
        if (a2 != a(a(a2), dagger.hilt.a.b.class)) {
            return a2;
        }
        dagger.hilt.a.c.a(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f156682d.getClass());
        return null;
    }

    private static Context a(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }
}

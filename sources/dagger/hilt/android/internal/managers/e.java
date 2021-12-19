package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.hilt.a.b;
import dagger.hilt.a.c;
import dagger.hilt.android.internal.a.d;
import dagger.hilt.android.internal.managers.g;

public final class e implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f156676a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f156677b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f156678c;

    public interface a {
        static {
            Covode.recordClassIndex(104060);
        }

        d k();
    }

    static {
        Covode.recordClassIndex(104059);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        MethodCollector.i(584);
        if (this.f156676a == null) {
            synchronized (this.f156677b) {
                try {
                    if (this.f156676a == null) {
                        if (this.f156678c.getHost() != null) {
                            c.a(this.f156678c.getHost() instanceof b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f156678c.getHost().getClass());
                            this.f156676a = ((a) ((b) this.f156678c.getHost()).generatedComponent()).k().a(this.f156678c).a();
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("Hilt Fragments must be attached before creating the component.");
                            MethodCollector.o(584);
                            throw nullPointerException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(584);
                    throw th;
                }
            }
        }
        Object obj = this.f156676a;
        MethodCollector.o(584);
        return obj;
    }

    public e(Fragment fragment) {
        this.f156678c = fragment;
    }

    public static final Context a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static ContextWrapper a(Context context, Fragment fragment) {
        return new g.a(context, fragment);
    }

    public static ContextWrapper a(LayoutInflater layoutInflater, Fragment fragment) {
        return new g.a(layoutInflater, fragment);
    }
}

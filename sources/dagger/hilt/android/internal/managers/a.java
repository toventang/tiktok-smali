package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.core.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.hilt.a.b;

public class a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    protected final Activity f156666a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f156667b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f156668c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final b<dagger.hilt.android.a.b> f156669d;

    /* renamed from: dagger.hilt.android.internal.managers.a$a  reason: collision with other inner class name */
    public interface AbstractC4138a {
        static {
            Covode.recordClassIndex(104054);
        }

        dagger.hilt.android.internal.a.a a();
    }

    static {
        Covode.recordClassIndex(104053);
    }

    @Override // dagger.hilt.a.b
    public Object generatedComponent() {
        MethodCollector.i(606);
        if (this.f156667b == null) {
            synchronized (this.f156668c) {
                try {
                    if (this.f156667b == null) {
                        if (this.f156666a.getApplication() instanceof b) {
                            this.f156667b = ((AbstractC4138a) this.f156669d.generatedComponent()).a().a(this.f156666a).a();
                        } else if (Application.class.equals(this.f156666a.getApplication().getClass())) {
                            IllegalStateException illegalStateException = new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
                            MethodCollector.o(606);
                            throw illegalStateException;
                        } else {
                            IllegalStateException illegalStateException2 = new IllegalStateException("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: " + this.f156666a.getApplication().getClass());
                            MethodCollector.o(606);
                            throw illegalStateException2;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(606);
                    throw th;
                }
            }
        }
        Object obj = this.f156667b;
        MethodCollector.o(606);
        return obj;
    }

    public a(Activity activity) {
        this.f156666a = activity;
        this.f156669d = new ActivityRetainedComponentManager((d) activity);
    }
}

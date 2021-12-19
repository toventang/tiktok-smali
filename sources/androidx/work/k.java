package androidx.work;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4801a = g.a("WorkerFactory");

    static {
        Covode.recordClassIndex(1887);
    }

    public static ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Exception e2) {
                g.a();
                new Throwable[1][0] = e2;
                return null;
            }
        } catch (ClassNotFoundException unused) {
            g.a();
            return null;
        }
    }
}

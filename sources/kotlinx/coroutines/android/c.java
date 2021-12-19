package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.q;
import h.r;
import h.w;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f159017a;

    static {
        Object obj;
        Covode.recordClassIndex(105536);
        try {
            obj = q.m223constructorimpl(new a(a(Looper.getMainLooper()), "Main"));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        f159017a = (b) obj;
    }

    public static final Handler a(Looper looper) {
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new w("null cannot be cast to non-null type");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final b a(Handler handler, String str) {
        return new a(handler, str);
    }
}

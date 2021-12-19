package androidx.work.impl.a.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    private static g f4544e;

    /* renamed from: a  reason: collision with root package name */
    public a f4545a;

    /* renamed from: b  reason: collision with root package name */
    public b f4546b;

    /* renamed from: c  reason: collision with root package name */
    public e f4547c;

    /* renamed from: d  reason: collision with root package name */
    public f f4548d;

    static {
        Covode.recordClassIndex(1784);
    }

    public static synchronized g a(Context context) {
        g gVar;
        synchronized (g.class) {
            if (f4544e == null) {
                f4544e = new g(context);
            }
            gVar = f4544e;
        }
        return gVar;
    }

    private g(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f4545a = new a(applicationContext);
        this.f4546b = new b(applicationContext);
        this.f4547c = new e(applicationContext);
        this.f4548d = new f(applicationContext);
    }
}

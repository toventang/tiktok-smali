package ms.bd.o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class c extends b.a {
    static {
        Covode.recordClassIndex(105891);
    }

    c() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        String str2;
        MethodCollector.i(8830);
        try {
            Context context = a.f159493a.f159494b;
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            h.a(16777217, 0, 0, "503284", new byte[]{45, 59});
            str2 = "";
        }
        MethodCollector.o(8830);
        return str2;
    }
}

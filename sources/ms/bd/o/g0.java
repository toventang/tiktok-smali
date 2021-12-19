package ms.bd.o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class g0 extends b.a {
    static {
        Covode.recordClassIndex(105906);
    }

    g0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        MethodCollector.i(8814);
        Context context = a.f159493a.f159494b;
        if (d.f107195c == null || !d.f107197e) {
            d.f107195c = context.getFilesDir();
        }
        File file = new File(d.f107195c, (String) h.a(16777217, 0, 0, "4ba971", new byte[]{107, 109, 1, 73, 9, 50, 54}));
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        MethodCollector.o(8814);
        return absolutePath;
    }
}

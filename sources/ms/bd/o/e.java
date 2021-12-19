package ms.bd.o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class e extends b.a {
    static {
        Covode.recordClassIndex(105897);
    }

    e() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        MethodCollector.i(8815);
        Context context = a.f159493a.f159494b;
        if (d.f107195c == null || !d.f107197e) {
            d.f107195c = context.getFilesDir();
        }
        File file = new File(d.f107195c, (String) h.a(16777217, 0, 0, "87c2b3", new byte[]{103, 56, 3, 66, 92, 48, 58}));
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        MethodCollector.o(8815);
        return absolutePath;
    }
}

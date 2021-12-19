package ms.bd.o;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class x0 extends b.a {
    static {
        Covode.recordClassIndex(105971);
    }

    x0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        MethodCollector.i(9770);
        Context context = a.f159493a.f159494b;
        String[] split = str.split((String) h.a(16777217, 0, 0, "0e0aad", new byte[]{29, 123}));
        String str2 = split[0];
        String str3 = split[1];
        SharedPreferences.Editor edit = d.a(context, str2, 0).edit();
        edit.putString(str3, (String) obj);
        edit.commit();
        MethodCollector.o(9770);
        return null;
    }
}

package ms.bd.o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class d1 extends b.a {
    static {
        Covode.recordClassIndex(105896);
    }

    d1() {
    }

    /* access modifiers changed from: protected */
    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        Throwable c2 = y1.a().c();
        if (c2 == null) {
            return null;
        }
        StackTraceElement[] stackTrace = c2.getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        do {
            if (stackTrace[i2] != null && !TextUtils.isEmpty(stackTrace[i2].getClassName())) {
                Class<?> cls = Class.forName(stackTrace[i2].getClassName());
                y1.a();
                arrayList.addAll(y1.a(cls, stackTrace[i2].getMethodName()));
            }
            i2++;
        } while (i2 < 4);
        return arrayList;
    }
}

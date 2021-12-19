package h.c.b.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Field;

public final class g {
    static {
        Covode.recordClassIndex(105117);
    }

    static final int a(a aVar) {
        int i2;
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            l.b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            return i2 - 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}

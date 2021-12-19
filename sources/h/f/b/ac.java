package h.f.b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Object> f158713a;

    static {
        Covode.recordClassIndex(105209);
    }

    public final Object[] a(Object[] objArr) {
        return this.f158713a.toArray(objArr);
    }

    public final void b(Object obj) {
        this.f158713a.add(obj);
    }

    public ac(int i2) {
        this.f158713a = new ArrayList<>(i2);
    }

    public final void a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f158713a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f158713a, objArr);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }
}

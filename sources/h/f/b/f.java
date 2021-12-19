package h.f.b;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f158722a = new Object[0];

    static {
        Covode.recordClassIndex(105217);
    }

    public static final Object[] a(Collection<?> collection) {
        l.d(collection, "");
        int size = collection.size();
        if (size == 0) {
            return f158722a;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return f158722a;
        }
        Object[] objArr = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr[i2] = it.next();
            if (i3 >= objArr.length) {
                if (!it.hasNext()) {
                    return objArr;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    if (i3 < 2147483645) {
                        i4 = 2147483645;
                    } else {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i4);
                l.b(objArr, "");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr, i3);
                l.b(copyOf, "");
                return copyOf;
            }
            i2 = i3;
        }
    }

    public static final Object[] a(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        l.d(collection, "");
        if (objArr != null) {
            int size = collection.size();
            int i2 = 0;
            if (size == 0) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
                return objArr;
            }
            Iterator<?> it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
                return objArr;
            }
            if (size <= objArr.length) {
                objArr2 = objArr;
            } else {
                Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = (Object[]) newInstance;
            }
            while (true) {
                int i3 = i2 + 1;
                objArr2[i2] = it.next();
                if (i3 >= objArr2.length) {
                    if (!it.hasNext()) {
                        return objArr2;
                    }
                    int i4 = ((i3 * 3) + 1) >>> 1;
                    if (i4 <= i3) {
                        if (i3 < 2147483645) {
                            i4 = 2147483645;
                        } else {
                            throw new OutOfMemoryError();
                        }
                    }
                    objArr2 = Arrays.copyOf(objArr2, i4);
                    l.b(objArr2, "");
                } else if (!it.hasNext()) {
                    if (objArr2 == objArr) {
                        objArr[i3] = null;
                        return objArr;
                    }
                    Object[] copyOf = Arrays.copyOf(objArr2, i3);
                    l.b(copyOf, "");
                    return copyOf;
                }
                i2 = i3;
            }
        } else {
            throw new NullPointerException();
        }
    }
}

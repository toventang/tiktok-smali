package com.bytedance.apm.q;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class h {

    public interface a<A, B> {
        static {
            Covode.recordClassIndex(14706);
        }

        boolean a(A a2, B b2);
    }

    static {
        Covode.recordClassIndex(14705);
    }

    public static boolean a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static String[] a(Set<String> set) {
        String[] strArr = new String[set.size()];
        int i2 = 0;
        for (String str : set) {
            strArr[i2] = str;
            i2++;
        }
        return strArr;
    }

    public static String a(Collection collection, String str) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public static String a(Object[] objArr, String str) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public static <L, O> boolean a(Collection<L> collection, O o, a<? super L, O> aVar) {
        Iterator<L> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}

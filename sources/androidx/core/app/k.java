package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2214a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Field f2215b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2216c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f2217d = new Object();

    static {
        Covode.recordClassIndex(684);
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle a(Notification notification) {
        synchronized (f2214a) {
            if (f2216c) {
                return null;
            }
            if (f2215b == null) {
                Field declaredField = Notification.class.getDeclaredField("extras");
                if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                    f2216c = true;
                    return null;
                }
                try {
                    declaredField.setAccessible(true);
                    f2215b = declaredField;
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                    f2216c = true;
                    return null;
                }
            }
            Bundle bundle = (Bundle) f2215b.get(notification);
            if (bundle == null) {
                bundle = new Bundle();
                f2215b.set(notification, bundle);
            }
            return bundle;
        }
    }

    static Bundle[] a(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nVarArr.length];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            n nVar = nVarArr[i2];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", nVar.f2257a);
            bundle.putCharSequence("label", nVar.f2258b);
            bundle.putCharSequenceArray("choices", nVar.f2259c);
            bundle.putBoolean("allowFreeFormInput", nVar.f2260d);
            bundle.putBundle("extras", nVar.f2262f);
            Set<String> set = nVar.f2263g;
            if (set != null && !set.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(set.size());
                for (String str : set) {
                    arrayList.add(str);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i2] = bundle;
        }
        return bundleArr;
    }
}

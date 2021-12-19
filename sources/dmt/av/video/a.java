package dmt.av.video;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<HashMap<String, Object>> f156749a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f156750b = new a();

    private a() {
    }

    public static void a() {
        HashMap<String, Object> hashMap = f156749a.get(1);
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        Covode.recordClassIndex(104104);
    }

    public static void a(String str) {
        l.d(str, "");
        HashMap<String, Object> hashMap = f156749a.get(1);
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    public static void a(String str, Object obj) {
        l.d(str, "");
        SparseArray<HashMap<String, Object>> sparseArray = f156749a;
        if (sparseArray.get(1) == null) {
            sparseArray.put(1, new HashMap<>());
        }
        HashMap<String, Object> hashMap = sparseArray.get(1);
        l.b(hashMap, "");
        hashMap.put(str, obj);
    }
}

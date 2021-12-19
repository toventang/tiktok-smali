package ms.bd.o;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<a> f159495a = new SparseArray<>();

    public static abstract class a {
        static {
            Covode.recordClassIndex(105888);
        }

        public Object a(int i2, int i3, long j2, String str, Object obj) {
            return a(j2, str, obj);
        }

        /* access modifiers changed from: protected */
        public Object a(long j2, String str, Object obj) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(105887);
    }

    public static Object a(int i2, int i3, long j2, String str, Object obj) {
        MethodCollector.i(9042);
        Object a2 = h.a(i2, i3, j2, str, obj);
        MethodCollector.o(9042);
        return a2;
    }

    public static void a(int i2, a aVar) {
        MethodCollector.i(8847);
        a aVar2 = f159495a.get(i2);
        if (aVar2 == null) {
            f159495a.put(i2, aVar);
            MethodCollector.o(8847);
            return;
        }
        RuntimeException runtimeException = new RuntimeException(com.a.a((String) h.a(16777217, 0, 0, "97346e", new byte[]{109, 38, 0, 72, 8, 118, 122, 20, 103, 97, 38, 117, 82, 69, 14, 123, 41, 2, 103, 118, 102}), new Object[]{aVar2.toString()}));
        MethodCollector.o(8847);
        throw runtimeException;
    }

    public static Object b(int i2, int i3, long j2, String str, Object obj) {
        MethodCollector.i(9233);
        a aVar = f159495a.get(i2);
        if (aVar != null) {
            try {
                Object a2 = aVar.a(i2, i3, j2, str, obj);
                MethodCollector.o(9233);
                return a2;
            } catch (Throwable th) {
                RuntimeException runtimeException = new RuntimeException(th);
                MethodCollector.o(9233);
                throw runtimeException;
            }
        } else {
            RuntimeException runtimeException2 = new RuntimeException(com.a.a((String) h.a(16777217, 0, 0, "df27b9", new byte[]{122, 116, 1, 64, 82, 42, 98, 7, 38, 99, 53, 109, 82, 3, 84, 32, 113, 70, 111, 110, 113}), new Object[]{Integer.valueOf(i2)}));
            MethodCollector.o(9233);
            throw runtimeException2;
        }
    }

    public static Object a(int i2, String str) {
        MethodCollector.i(9041);
        Object a2 = h.a(i2, 0, 0, str, null);
        MethodCollector.o(9041);
        return a2;
    }
}

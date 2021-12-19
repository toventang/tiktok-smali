package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class r1 extends q1 {

    /* renamed from: a  reason: collision with root package name */
    long f159539a;

    static {
        Covode.recordClassIndex(105948);
    }

    /* access modifiers changed from: protected */
    @Override // ms.bd.o.q1
    public final Object a(long j2) {
        this.f159539a = j2;
        a(new a());
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        MethodCollector.i(13186);
        h.a(50331650, 0, this.f159539a, null, null);
        this.f159539a = -1;
        super.finalize();
        MethodCollector.o(13186);
    }

    private synchronized void a(e.a aVar) {
        MethodCollector.i(13007);
        e.f29339k = aVar;
        MethodCollector.o(13007);
    }

    class a implements e.a {
        static {
            Covode.recordClassIndex(105949);
        }

        a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.e.a
        public final Map<String, String> a(String str, Map<String, List<String>> map) {
            int i2;
            String str2;
            MethodCollector.i(8671);
            HashMap hashMap = new HashMap();
            if (str == null || map == null) {
                MethodCollector.o(8671);
                return hashMap;
            } else if (str.toLowerCase().contains((String) h.a(16777217, 0, 0, "cac90e", new byte[]{122, 119, 4, 93})) || str.toLowerCase().contains((String) h.a(16777217, 0, 0, "6860a0", new byte[]{47, 46, 81, 84, 77}))) {
                y1.a().b();
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, List<String>> next = it.next();
                    String key = next.getKey();
                    if (next.getValue() == null || next.getValue().size() <= 0) {
                        str2 = null;
                    } else {
                        str2 = next.getValue().get(0);
                    }
                    if (!(key == null || str2 == null)) {
                        arrayList.add(key);
                        arrayList.add(str2);
                    }
                }
                String[] strArr = (String[]) b.a(50331649, 0, r1.this.f159539a, str, arrayList.toArray(new String[0]));
                if (strArr != null) {
                    HashMap hashMap2 = new HashMap();
                    for (i2 = 0; i2 < strArr.length; i2 += 2) {
                        hashMap2.put(strArr[i2], strArr[i2 + 1]);
                    }
                    MethodCollector.o(8671);
                    return hashMap2;
                }
                MethodCollector.o(8671);
                return hashMap;
            } else {
                RuntimeException runtimeException = new RuntimeException((String) h.a(16777217, 0, 0, "34e6c8", new byte[]{43, 34, 86, 79, 73, 60, 36, 85, 54, 99, 98, 62, 2, 86, 76, 96, 56, 1, 32, 118, 49}));
                MethodCollector.o(8671);
                throw runtimeException;
            }
        }
    }
}

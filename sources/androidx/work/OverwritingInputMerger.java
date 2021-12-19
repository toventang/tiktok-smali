package androidx.work;

import androidx.work.e;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends f {
    static {
        Covode.recordClassIndex(1738);
    }

    @Override // androidx.work.f
    public final e a(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e eVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(eVar.f4501b));
        }
        aVar.a(hashMap);
        return aVar.a();
    }
}

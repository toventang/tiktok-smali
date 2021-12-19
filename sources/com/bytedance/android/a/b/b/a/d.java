package com.bytedance.android.a.b.b.a;

import android.text.TextUtils;
import com.bytedance.android.a.a.h.f;
import com.bytedance.android.a.b.a;
import com.bytedance.android.a.b.b.b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class d extends a {
    static {
        Covode.recordClassIndex(3224);
    }

    public d(a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.a.b.b.a.a
    public final b a(b bVar) {
        String str = bVar.f6696b;
        Map<String, String> map = bVar.f6699e.f6630l;
        if (map == null) {
            return super.a(bVar);
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (str.contains(entry.getKey())) {
                    String b2 = f.b(entry.getValue());
                    if (!TextUtils.isEmpty(b2)) {
                        str = str.replace(entry.getKey(), b2);
                    }
                }
            }
            b.a aVar = bVar.f6695a;
            aVar.f6700a = str;
            return aVar.a();
        } catch (Throwable unused) {
            return super.a(bVar);
        }
    }
}

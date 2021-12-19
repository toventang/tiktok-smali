package com.ss.android.ml.process.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ml.k;
import com.ss.android.ml.process.c;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import java.util.HashMap;
import org.json.JSONObject;

public final class b implements e {
    static {
        Covode.recordClassIndex(37012);
    }

    @Override // com.ss.android.ml.process.e
    public final void a(d dVar) {
        HashMap<String, Object> hashMap = dVar.f59904a;
        c cVar = dVar.f59907d;
        String feature = cVar.getFeature();
        int length = cVar.getLength();
        String type = cVar.getType();
        Float[] fArr = new Float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        try {
            String str = (String) com.ss.android.ml.e.a(hashMap, "server_feature_embedding_map");
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(feature);
                if (!TextUtils.isEmpty(optString) && type != null && TextUtils.equals(type.toLowerCase(), "float16_hex")) {
                    com.ss.android.ml.b.a(optString, fArr, length);
                }
            }
        } catch (Throwable th) {
            k.a("ml#evaluator", "embedding evaluate error: ", th);
        }
        hashMap.put(feature, fArr);
    }
}

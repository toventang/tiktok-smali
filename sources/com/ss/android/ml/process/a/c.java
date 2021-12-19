package com.ss.android.ml.process.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ml.b;
import com.ss.android.ml.k;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import com.ss.android.ml.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

public final class c implements e {
    static {
        Covode.recordClassIndex(37013);
    }

    @Override // com.ss.android.ml.process.e
    public final void a(d dVar) {
        HashMap<String, Object> hashMap = dVar.f59904a;
        com.ss.android.ml.process.c cVar = dVar.f59907d;
        String feature = cVar.getFeature();
        int length = cVar.getLength();
        String type = cVar.getType();
        Float[] fArr = new Float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        try {
            ArrayList arrayList = (ArrayList) com.ss.android.ml.e.a(hashMap, "server_feature_embedding_vector");
            if (arrayList != null && !arrayList.isEmpty()) {
                int vectorLength = cVar.getVectorLength();
                int vectorNum = cVar.getVectorNum();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < vectorNum && i3 < size) {
                    String str = (String) arrayList.get(i3);
                    if (!TextUtils.isEmpty(str)) {
                        String optString = new JSONObject(str).optString(feature);
                        if (!TextUtils.isEmpty(optString) && type != null && TextUtils.equals(type.toLowerCase(), "float16_hex")) {
                            Float[] fArr2 = new Float[vectorLength];
                            for (int i4 = 0; i4 < vectorLength; i4++) {
                                fArr2[i4] = Float.valueOf(0.0f);
                            }
                            b.a(optString, fArr2, vectorLength);
                            for (int i5 = 0; i5 < vectorLength; i5++) {
                                fArr[(i3 * vectorLength) + i5] = fArr2[i5];
                            }
                        }
                    }
                    i3++;
                }
            }
        } catch (Throwable th) {
            k.a("ml#evaluator", "embedding vector evaluate error: ", th);
        }
        if (t.f59923a) {
            Arrays.toString(fArr);
        }
        hashMap.put(feature, fArr);
    }
}

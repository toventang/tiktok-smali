package com.bytedance.android.a.b.b.a;

import android.text.TextUtils;
import com.bytedance.android.a.a.h.d;
import com.bytedance.android.a.b.b.a.e;
import com.bytedance.android.a.b.b.b;
import com.bytedance.android.a.b.b.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends a {
    static {
        Covode.recordClassIndex(3222);
    }

    public b() {
        super(null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.a.b.b.a.a
    public final com.bytedance.android.a.b.b.b a(com.bytedance.android.a.b.b.b bVar) {
        com.bytedance.android.a.a.d.b bVar2;
        if (bVar == null) {
            return null;
        }
        String str = bVar.f6696b;
        boolean z = this instanceof c;
        if (this.f6690a.f6680a.f6719k) {
            str = d.a(str, !z);
        }
        if (!z && (bVar2 = bVar.f6699e) != null) {
            JSONObject jSONObject = bVar2.f6626h;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                bVar2.f6626h = jSONObject;
            }
            try {
                jSONObject.putOpt("custom_net", 1);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        b.a aVar = bVar.f6695a;
        aVar.f6700a = str;
        return aVar.a();
    }

    @Override // com.bytedance.android.a.b.b.a.e, com.bytedance.android.a.b.b.a.a
    public final c a(e.a aVar) {
        int i2;
        com.bytedance.android.a.b.b.b a2 = a(aVar.a());
        String str = a2.f6696b;
        com.bytedance.android.a.b.c.b bVar = this.f6690a.f6680a;
        if (bVar != null) {
            i2 = bVar.f6718j;
        } else {
            i2 = 10000;
        }
        String a3 = d.a(str);
        boolean z = true;
        if (!TextUtils.isEmpty(a3) && this.f6690a.f6680a.f6720l.contains(a3)) {
            z = false;
        }
        return a(a(a2, i2, z));
    }

    /* access modifiers changed from: protected */
    public c a(com.bytedance.android.a.b.b.b bVar, int i2, boolean z) {
        throw new RuntimeException("Not implemented");
    }
}

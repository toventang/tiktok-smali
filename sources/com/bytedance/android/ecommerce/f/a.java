package com.bytedance.android.ecommerce.f;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.a.c;
import com.bytedance.android.ecommerce.a.d;
import com.bytedance.android.ecommerce.a.e;
import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

public final class a implements com.bytedance.android.ecommerce.i.a {
    static {
        Covode.recordClassIndex(3388);
    }

    private static d a(c cVar) {
        d dVar = new d();
        dVar.f6948a = true;
        for (e eVar : cVar.b()) {
            d a2 = a(cVar.f6943i, eVar);
            if (!a2.f6948a) {
                return a2;
            }
        }
        if (TextUtils.equals(cVar.f6941g, "R") && TextUtils.isEmpty(cVar.f6943i)) {
            dVar.f6948a = false;
            dVar.a("empty_content", new String[0]);
        }
        return dVar;
    }

    @Override // com.bytedance.android.ecommerce.i.a
    public final d a(c... cVarArr) {
        d a2 = a(cVarArr[0]);
        if (cVarArr.length > 1) {
            for (c cVar : cVarArr) {
                a2.a(a(cVar));
            }
        }
        return a2;
    }

    private static d a(String str, e eVar) {
        d dVar = new d();
        dVar.f6948a = true;
        String str2 = eVar.f6952a;
        str2.hashCode();
        switch (str2.hashCode()) {
            case 108392519:
                if (str2.equals("regex")) {
                    return a(str, eVar.f6953b, eVar.f6954c);
                }
                break;
            case 844440762:
                if (str2.equals("max_len")) {
                    return a(str, com.bytedance.android.ecommerce.k.c.a(eVar.f6953b), eVar.f6954c);
                }
                break;
            case 1064238760:
                if (str2.equals("min_len")) {
                    return b(str, com.bytedance.android.ecommerce.k.c.a(eVar.f6953b), eVar.f6954c);
                }
                break;
        }
        return dVar;
    }

    private static d a(String str, int i2, String str2) {
        d dVar = new d();
        dVar.f6948a = true;
        if (str != null && str.length() <= i2) {
            return dVar;
        }
        dVar.f6948a = false;
        dVar.a(str2, new String[0]);
        return dVar;
    }

    private static d b(String str, int i2, String str2) {
        d dVar = new d();
        dVar.f6948a = true;
        if (str != null && str.length() >= i2) {
            return dVar;
        }
        dVar.f6948a = false;
        dVar.a(str2, new String[0]);
        return dVar;
    }

    private static d a(String str, String str2, String str3) {
        d dVar = new d();
        dVar.f6948a = true;
        if (!Pattern.matches(str2, str)) {
            dVar.f6948a = false;
            dVar.a(str3, new String[0]);
        }
        return dVar;
    }
}

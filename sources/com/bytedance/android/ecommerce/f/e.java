package com.bytedance.android.ecommerce.f;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.a.c;
import com.bytedance.android.ecommerce.a.d;
import com.bytedance.android.ecommerce.i.a;
import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

public final class e implements a {
    static {
        Covode.recordClassIndex(3392);
    }

    @Override // com.bytedance.android.ecommerce.i.a
    public final d a(c... cVarArr) {
        com.bytedance.android.ecommerce.a.a aVar;
        String str;
        d dVar = new d();
        dVar.f6948a = true;
        c cVar = cVarArr[0];
        String str2 = cVar.f6943i;
        if (cVar.n != null) {
            aVar = (com.bytedance.android.ecommerce.a.a) cVar.n;
        } else {
            aVar = null;
        }
        if (cVar.a() && TextUtils.isEmpty(str2)) {
            dVar.f6948a = false;
            dVar.a("pipo_common_error_required_field", "pipo_common_payin_security_code");
        } else if (aVar != null) {
            if (aVar.a().size() > 0) {
                str = aVar.a().toString().replace("[", "{").replace("]", "}").replace(" ", "");
            } else {
                str = "{3,4}";
            }
            if (!Pattern.matches(com.a.a("^[0-9]%s$", new Object[]{str}), str2)) {
                dVar.f6948a = false;
                dVar.a("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
            } else if (!Pattern.matches("^[0-9]{3,4}$", str2)) {
                dVar.f6948a = false;
                dVar.a("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
            }
        } else {
            dVar.f6948a = false;
            dVar.a("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
        }
        return dVar;
    }
}

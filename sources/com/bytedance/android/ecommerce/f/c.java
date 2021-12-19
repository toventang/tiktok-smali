package com.bytedance.android.ecommerce.f;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.a.d;
import com.bytedance.android.ecommerce.a.h;
import com.bytedance.android.ecommerce.i.a;
import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

public final class c implements a {
    static {
        Covode.recordClassIndex(3390);
    }

    @Override // com.bytedance.android.ecommerce.i.a
    public final d a(com.bytedance.android.ecommerce.a.c... cVarArr) {
        d dVar = new d();
        dVar.f6948a = true;
        com.bytedance.android.ecommerce.a.c cVar = cVarArr[0];
        String str = cVar.f6943i;
        if (!cVar.a() || !TextUtils.isEmpty(str)) {
            h a2 = com.bytedance.android.ecommerce.a.f6869a.a(str);
            if (a2 == null) {
                dVar.f6948a = false;
                dVar.a("pipo_common_error_card_number", new String[0]);
            } else if (com.bytedance.android.ecommerce.e.c.f7063a.b().b(a2.f6979h) == null) {
                dVar.f6948a = false;
                dVar.a("pipo_common_error_card_not_supported", new String[0]);
            } else if (!a2.a().contains(Integer.valueOf(str.length()))) {
                dVar.f6948a = false;
                dVar.a("pipo_common_error_card_number_length", new String[0]);
            } else if (!Pattern.matches("^[0-9]+$", str)) {
                dVar.f6948a = false;
                dVar.a("pipo_common_error_card_check", new String[0]);
            } else {
                char[] charArray = str.toCharArray();
                int length = charArray.length + 1;
                int[] iArr = new int[length];
                int length2 = charArray.length - 1;
                int i2 = 1;
                while (length2 >= 0) {
                    iArr[i2] = charArray[length2] - '0';
                    length2--;
                    i2++;
                }
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 1; i5 < length; i5++) {
                    if (i5 % 2 == 0) {
                        int i6 = iArr[i5] * 2;
                        if (i6 >= 10) {
                            i6 -= 9;
                        }
                        i3 += i6;
                    } else {
                        i4 += iArr[i5];
                    }
                }
                if ((i3 + i4) % 10 != 0) {
                    dVar.f6948a = false;
                    dVar.a("pipo_common_error_card_number", new String[0]);
                }
            }
        } else {
            dVar.f6948a = false;
            dVar.a("pipo_common_error_required_field", "pipo_common_payin_card_number");
        }
        return dVar;
    }
}

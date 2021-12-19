package com.ss.android.ugc.aweme.qrcode.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.v;
import com.ss.android.ugc.aweme.qrcode.c;
import com.ss.android.ugc.aweme.qrcode.c.a;

public final class g extends a {
    static {
        Covode.recordClassIndex(77778);
    }

    public g(a.AbstractC3089a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final boolean a(String str, int i2) {
        String b2 = v.b(str, "schema_type");
        String b3 = v.b(str, "object_id");
        int i3 = 0;
        if (TextUtils.isEmpty(b2) || TextUtils.isEmpty(b3)) {
            return false;
        }
        try {
            i3 = Integer.parseInt(b2);
        } catch (NumberFormatException unused) {
        }
        this.f119720a = c.b(i3, b3);
        return this.f119721b.a(i3, b3, str, com.ss.android.ugc.aweme.qrcode.e.a.a(str));
    }
}

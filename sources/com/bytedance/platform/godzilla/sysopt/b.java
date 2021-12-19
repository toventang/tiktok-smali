package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.c.a;

public final class b extends a {
    static {
        Covode.recordClassIndex(25667);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final void a(Application application) {
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "UbsanOptPlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final void a() {
        MethodCollector.i(3322);
        g.a(g.a.ERROR);
        String a2 = a(Long.toHexString(79531005658441L));
        if (a2 != null && Build.MANUFACTURER.toUpperCase().contains(a2) && Build.VERSION.SDK_INT == 29) {
            UbsanOpt.start();
        }
        MethodCollector.o(3322);
    }

    private static String a(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String replace = str.replace(" ", "");
        int length = replace.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            try {
                bArr[i2] = (byte) (Integer.parseInt(replace.substring(i3, i3 + 2), 16) & 255);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            replace = new String(bArr, "UTF-8");
            return replace;
        } catch (Exception e3) {
            e3.printStackTrace();
            return replace;
        }
    }
}

package com.adm.push;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

final class b {
    static {
        Covode.recordClassIndex(2056);
    }

    static boolean a(Context context) {
        boolean z;
        MethodCollector.i(3927);
        try {
            InputStream open = context.getAssets().open("api_key.txt");
            z = true;
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            z = false;
        } catch (Throwable th) {
            MethodCollector.o(3927);
            throw th;
        }
        MethodCollector.o(3927);
        return z;
    }
}

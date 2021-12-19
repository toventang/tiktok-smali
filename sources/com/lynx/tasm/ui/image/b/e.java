package com.lynx.tasm.ui.image.b;

import android.content.Context;
import android.net.Uri;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;

public class e {

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f56967b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f56968a = new a();

    static {
        Covode.recordClassIndex(35439);
    }

    private e() {
    }

    public static e a() {
        MethodCollector.i(2503);
        if (f56967b == null) {
            synchronized (e.class) {
                try {
                    if (f56967b == null) {
                        f56967b = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2503);
                    throw th;
                }
            }
        }
        e eVar = f56967b;
        MethodCollector.o(2503);
        return eVar;
    }

    public final Uri b(Context context, String str) {
        int a2 = a(context, str);
        if (a2 > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(a2)).build();
        }
        return Uri.EMPTY;
    }

    public final int a(Context context, String str) {
        MethodCollector.i(2531);
        if (str == null || str.isEmpty()) {
            MethodCollector.o(2531);
            return 0;
        }
        String replace = str.toLowerCase().replace("-", "_");
        try {
            int parseInt = Integer.parseInt(replace);
            MethodCollector.o(2531);
            return parseInt;
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.f56968a.containsKey(replace)) {
                    int intValue = this.f56968a.get(replace).intValue();
                    MethodCollector.o(2531);
                    return intValue;
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.f56968a.put(replace, Integer.valueOf(identifier));
                MethodCollector.o(2531);
                return identifier;
            }
        } catch (Throwable th) {
            MethodCollector.o(2531);
            throw th;
        }
    }
}

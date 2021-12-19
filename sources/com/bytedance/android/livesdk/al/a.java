package com.bytedance.android.livesdk.al;

import android.content.Context;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdkapi.depend.d.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.Map;

public class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f13940a;

    static {
        Covode.recordClassIndex(7730);
    }

    private a() {
    }

    public static f a() {
        MethodCollector.i(13474);
        if (f13940a == null) {
            synchronized (a.class) {
                try {
                    if (f13940a == null) {
                        f13940a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13474);
                    throw th;
                }
            }
        }
        f fVar = f13940a;
        MethodCollector.o(13474);
        return fVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.f
    public final String a(Context context) {
        return b(context);
    }

    private static String b(Context context) {
        try {
            return context.getResources().getString(R.string.e8l);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.f
    public final void a(String str, Map<String, String> map) {
        b.a.a(str).a(map).a().b();
    }
}

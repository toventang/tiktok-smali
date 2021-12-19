package com.bytedance.android.livesdk.al;

import com.bytedance.android.livesdk.livesetting.other.LiveLocalizationEnableSettings;
import com.bytedance.android.livesdkapi.depend.d.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class h implements j {

    /* renamed from: a  reason: collision with root package name */
    private static volatile h f13951a;

    static {
        Covode.recordClassIndex(7738);
    }

    private h() {
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.j
    public final boolean a() {
        return LiveLocalizationEnableSettings.INSTANCE.getValue();
    }

    public static h b() {
        MethodCollector.i(13382);
        if (f13951a == null) {
            synchronized (h.class) {
                try {
                    if (f13951a == null) {
                        f13951a = new h();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13382);
                    throw th;
                }
            }
        }
        h hVar = f13951a;
        MethodCollector.o(13382);
        return hVar;
    }
}

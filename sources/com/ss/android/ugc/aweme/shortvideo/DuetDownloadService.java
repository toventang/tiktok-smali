package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IDuetDownloadService;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.Map;

public final class DuetDownloadService implements IDuetDownloadService {
    static {
        Covode.recordClassIndex(81964);
    }

    public static IDuetDownloadService a() {
        MethodCollector.i(2549);
        Object a2 = b.a(IDuetDownloadService.class, false);
        if (a2 != null) {
            IDuetDownloadService iDuetDownloadService = (IDuetDownloadService) a2;
            MethodCollector.o(2549);
            return iDuetDownloadService;
        }
        if (b.dZ == null) {
            synchronized (IDuetDownloadService.class) {
                try {
                    if (b.dZ == null) {
                        b.dZ = new DuetDownloadService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2549);
                    throw th;
                }
            }
        }
        DuetDownloadService duetDownloadService = (DuetDownloadService) b.dZ;
        MethodCollector.o(2549);
        return duetDownloadService;
    }

    @Override // com.ss.android.ugc.aweme.IDuetDownloadService
    public final void a(String str, Activity activity, String str2, Map<String, String> map) {
        l.d(str, "");
        l.d(activity, "");
        l.d(map, "");
        com.ss.android.ugc.aweme.shortvideo.l.b bVar = new com.ss.android.ugc.aweme.shortvideo.l.b();
        bVar.f128648b = map;
        bVar.a(str, activity, str2);
    }
}

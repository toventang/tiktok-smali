package com.ss.android.ugc.aweme.shortvideo.cut.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.vesdk.x;
import java.io.File;

public final class c {
    static {
        Covode.recordClassIndex(82322);
    }

    public static boolean a(File file) {
        MethodCollector.i(4533);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(4533);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(4533);
        return delete;
    }

    static final /* synthetic */ Object a(IVideo2GifService.ConvertListener convertListener, x xVar) {
        convertListener.onDone(false);
        xVar.j();
        return null;
    }

    static final /* synthetic */ Object a(int i2, IVideo2GifService.ConvertListener convertListener, float f2, x xVar) {
        if (i2 == 4103) {
            convertListener.onDone(true);
            xVar.j();
            return null;
        } else if (i2 != 4105) {
            return null;
        } else {
            convertListener.onUpdateProgress((int) (f2 * 100.0f));
            return null;
        }
    }
}

package com.ss.android.ugc.aweme.music.service;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.ui.ah;
import com.ss.android.ugc.b;

public class MusicDetailService implements IMusicDetailService {
    static {
        Covode.recordClassIndex(71852);
    }

    public static IMusicDetailService a() {
        MethodCollector.i(13619);
        Object a2 = b.a(IMusicDetailService.class, false);
        if (a2 != null) {
            IMusicDetailService iMusicDetailService = (IMusicDetailService) a2;
            MethodCollector.o(13619);
            return iMusicDetailService;
        }
        if (b.cQ == null) {
            synchronized (IMusicDetailService.class) {
                try {
                    if (b.cQ == null) {
                        b.cQ = new MusicDetailService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13619);
                    throw th;
                }
            }
        }
        MusicDetailService musicDetailService = (MusicDetailService) b.cQ;
        MethodCollector.o(13619);
        return musicDetailService;
    }

    private static Bundle b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final Fragment a(Intent intent) {
        if (!MSAdaptionService.c().a(d.a())) {
            return null;
        }
        Bundle b2 = b(intent);
        ah ahVar = new ah();
        ahVar.setArguments(b2);
        return ahVar;
    }
}

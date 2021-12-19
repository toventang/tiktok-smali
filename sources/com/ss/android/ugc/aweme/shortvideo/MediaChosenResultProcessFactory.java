package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bp;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bu;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.b.a;
import com.ss.android.ugc.b;

public class MediaChosenResultProcessFactory implements IMediaChosenResultProcessFactory {
    static {
        Covode.recordClassIndex(81971);
    }

    public static IMediaChosenResultProcessFactory a() {
        MethodCollector.i(8816);
        Object a2 = b.a(IMediaChosenResultProcessFactory.class, false);
        if (a2 != null) {
            IMediaChosenResultProcessFactory iMediaChosenResultProcessFactory = (IMediaChosenResultProcessFactory) a2;
            MethodCollector.o(8816);
            return iMediaChosenResultProcessFactory;
        }
        if (b.ea == null) {
            synchronized (IMediaChosenResultProcessFactory.class) {
                try {
                    if (b.ea == null) {
                        b.ea = new MediaChosenResultProcessFactory();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8816);
                    throw th;
                }
            }
        }
        MediaChosenResultProcessFactory mediaChosenResultProcessFactory = (MediaChosenResultProcessFactory) b.ea;
        MethodCollector.o(8816);
        return mediaChosenResultProcessFactory;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory
    public final com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b a(Activity activity) {
        return new a(activity);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory
    public final v a(e eVar, int i2, long j2, long j3) {
        if (i2 == 1) {
            return new com.ss.android.ugc.aweme.tools.mvtemplate.a.b(eVar);
        }
        if (i2 != 2) {
            if (i2 != 7) {
                if (i2 == 8) {
                    return new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.b(eVar);
                }
                switch (i2) {
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        return new c(eVar);
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        return new br(eVar, j2, j3);
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        break;
                    default:
                        switch (i2) {
                            case 15:
                                return new com.ss.android.ugc.aweme.shortvideo.sticker.b.a(eVar);
                            case 16:
                                return new bp(eVar);
                            case 17:
                                break;
                            default:
                                return new com.ss.android.ugc.aweme.tools.mvtemplate.a.b(eVar);
                        }
                }
            }
            return new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e(eVar);
        }
        return new bu(eVar, i2, j2, j3);
    }
}

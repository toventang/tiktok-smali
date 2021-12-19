package com.ss.android.ugc.aweme.mediaplayer;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

final /* synthetic */ class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final MediaPlayerModule f109442a;

    static {
        Covode.recordClassIndex(70082);
    }

    b(MediaPlayerModule mediaPlayerModule) {
        this.f109442a = mediaPlayerModule;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        MediaPlayerModule mediaPlayerModule = this.f109442a;
        h hVar = (h) obj;
        if (hVar != null) {
            switch (hVar.f109454b) {
                case 1:
                    if (hVar.f109453a) {
                        mediaPlayerModule.f109438e = true;
                        return;
                    }
                    return;
                case 2:
                case 4:
                    mediaPlayerModule.f109437d = true;
                    return;
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    mediaPlayerModule.f109437d = false;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    mediaPlayerModule.f109438e = false;
                    mediaPlayerModule.f109437d = false;
                    return;
                default:
                    return;
            }
        }
    }
}

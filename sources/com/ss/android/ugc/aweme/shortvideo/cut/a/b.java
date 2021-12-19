package com.ss.android.ugc.aweme.shortvideo.cut.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.mediaplayer.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f125438a;

    static {
        Covode.recordClassIndex(82327);
    }

    b(a aVar) {
        this.f125438a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f125438a;
        h hVar = (h) obj;
        if (hVar != null) {
            switch (hVar.f109454b) {
                case 1:
                    if (!hVar.f109453a) {
                        aVar.b();
                        return;
                    } else if (aVar.f125416j != null) {
                        aVar.f125416j.f123491d = (int) aVar.f125413g.f109435b.f();
                        return;
                    } else {
                        return;
                    }
                case 2:
                case 4:
                    aVar.f125408b.setVisibility(8);
                    if (hVar.f109453a) {
                        aVar.f125417k.post(aVar.f125418l);
                        return;
                    }
                    return;
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (hVar.f109453a && !aVar.f125412f) {
                        aVar.f125417k.removeCallbacks(aVar.f125418l);
                        aVar.f125408b.setVisibility(0);
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (hVar.f109453a) {
                        aVar.f125408b.setVisibility(8);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}

package com.ss.android.ugc.aweme.mediaplayer;

import androidx.lifecycle.t;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final MediaPlayerModule f109444a;

    static {
        Covode.recordClassIndex(70084);
    }

    d(MediaPlayerModule mediaPlayerModule) {
        this.f109444a = mediaPlayerModule;
    }

    @Override // b.g
    public final Object then(i iVar) {
        boolean z;
        MediaPlayerModule mediaPlayerModule = this.f109444a;
        int intValue = ((Integer) iVar.d()).intValue();
        t<h> tVar = mediaPlayerModule.f109441h;
        if (intValue >= 0) {
            z = true;
        } else {
            z = false;
        }
        tVar.setValue(new h(1, z));
        return Integer.valueOf(intValue);
    }
}

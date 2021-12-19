package com.ss.android.ugc.aweme.kids.choosemusic.a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.a.i.b;

final /* synthetic */ class d implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    static final MediaPlayer.OnErrorListener f105465a = new d();

    static {
        Covode.recordClassIndex(67580);
    }

    private d() {
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        if (b.f105382a == null) {
            return false;
        }
        b.f105382a.release();
        b.f105382a = null;
        return false;
    }
}

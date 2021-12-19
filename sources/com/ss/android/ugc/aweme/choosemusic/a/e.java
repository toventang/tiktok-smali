package com.ss.android.ugc.aweme.choosemusic.a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.k.c;

final /* synthetic */ class e implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    static final MediaPlayer.OnErrorListener f70296a = new e();

    static {
        Covode.recordClassIndex(43363);
    }

    private e() {
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        if (c.f111545a == null) {
            return false;
        }
        c.f111545a.release();
        c.f111545a = null;
        return false;
    }
}

package com.ss.android.ugc.aweme.choosemusic.a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;

final /* synthetic */ class d implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    private final s f70295a;

    static {
        Covode.recordClassIndex(43362);
    }

    d(s sVar) {
        this.f70295a = sVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        s sVar = this.f70295a;
        mediaPlayer.start();
        sVar.a(false, true);
    }
}

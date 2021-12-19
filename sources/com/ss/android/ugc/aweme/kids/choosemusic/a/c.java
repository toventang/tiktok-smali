package com.ss.android.ugc.aweme.kids.choosemusic.a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;

final /* synthetic */ class c implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    private final o f105464a;

    static {
        Covode.recordClassIndex(67579);
    }

    c(o oVar) {
        this.f105464a = oVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        o oVar = this.f105464a;
        mediaPlayer.start();
        oVar.a(false, true);
    }
}

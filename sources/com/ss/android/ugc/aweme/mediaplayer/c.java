package com.ss.android.ugc.aweme.mediaplayer;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final MediaPlayerModule f109443a;

    static {
        Covode.recordClassIndex(70083);
    }

    c(MediaPlayerModule mediaPlayerModule) {
        this.f109443a = mediaPlayerModule;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2;
        MediaPlayerModule mediaPlayerModule = this.f109443a;
        String str = mediaPlayerModule.f109434a;
        if (mediaPlayerModule.f109438e) {
            i2 = 0;
        } else if (!TextUtils.isEmpty(str)) {
            i2 = mediaPlayerModule.f109435b.a(str);
            if (mediaPlayerModule.f109439f.f109451d >= 0 && mediaPlayerModule.f109439f.f109452e - mediaPlayerModule.f109439f.f109451d > 0) {
                mediaPlayerModule.f109435b.a(mediaPlayerModule.f109439f.f109451d, mediaPlayerModule.f109439f.f109452e);
            }
            mediaPlayerModule.f109435b.a(mediaPlayerModule.f109439f.f109450c);
            mediaPlayerModule.f109435b.b((double) mediaPlayerModule.f109439f.f109448a);
            mediaPlayerModule.f109435b.a((double) mediaPlayerModule.f109439f.f109449b);
        } else {
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}

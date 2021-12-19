package com.ss.android.ugc.aweme.live.e;

import android.view.TextureView;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.covode.number.Covode;

public interface b {
    static {
        Covode.recordClassIndex(69428);
    }

    void firstFrame();

    void onPlayerMessage(g.b bVar, Object obj);

    void onVideoSizeChange(TextureView textureView, int i2, int i3);

    void playComplete(String str);

    void playPrepared(String str);

    void playerMediaError(String str);

    void playing();

    void seiUpdate(String str);
}

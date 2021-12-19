package com.ss.android.ugc.aweme.tools.mvtemplate.c.a;

import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Video;

public interface e {
    static {
        Covode.recordClassIndex(91939);
    }

    void addPlayerListener(c cVar);

    boolean isPlaying();

    void pause();

    void stop();

    void tryResume(Video video);

    void wrap(TextureView textureView);
}

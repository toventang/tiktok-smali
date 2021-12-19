package com.ss.android.ugc.aweme.video;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.c.b;
import com.ss.android.ugc.aweme.video.c.c;
import com.ss.android.ugc.aweme.video.simplayer.f;
import java.util.List;

public interface i extends h, j {
    static {
        Covode.recordClassIndex(93859);
    }

    void A();

    void B();

    void C();

    void D();

    void E();

    void F();

    void G();

    void H();

    void I();

    void J();

    long K();

    f L();

    int M();

    int N();

    String a(Video video, int i2);

    String a(Video video, Audio audio, boolean z, OnUIPlayListener onUIPlayListener, int i2, c cVar);

    String a(Video video, Audio audio, boolean z, boolean z2);

    String a(Video video, Audio audio, boolean z, boolean z2, int i2);

    String a(Video video, Audio audio, boolean z, boolean z2, int i2, boolean z3, boolean z4, c cVar);

    String a(Video video, OnUIPlayListener onUIPlayListener);

    String a(Video video, OnUIPlayListener onUIPlayListener, int i2);

    String a(Video video, boolean z);

    String a(VideoUrlModel videoUrlModel, boolean z, c cVar);

    String a(b bVar);

    void a(float f2);

    void a(float f2, float f3);

    void a(int i2);

    void a(Surface surface);

    void a(Audio.InfoIdType infoIdType);

    void a(Aweme aweme);

    void a(OnUIPlayListener onUIPlayListener);

    void a(n nVar);

    void a(List<Aweme> list);

    void a(boolean z);

    String b(Video video, OnUIPlayListener onUIPlayListener);

    String b(n nVar);

    void b(Aweme aweme);

    boolean b(OnUIPlayListener onUIPlayListener);

    void c(OnUIPlayListener onUIPlayListener);

    void v();

    void w();

    void x();

    void y();

    void z();
}

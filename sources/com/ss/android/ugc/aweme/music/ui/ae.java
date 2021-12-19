package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.w;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

final /* synthetic */ class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w.AnonymousClass3 f111841a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f111842b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicWaveBean f111843c;

    /* renamed from: d  reason: collision with root package name */
    private final String f111844d;

    /* renamed from: e  reason: collision with root package name */
    private final int f111845e;

    static {
        Covode.recordClassIndex(71892);
    }

    ae(w.AnonymousClass3 r1, MusicModel musicModel, MusicWaveBean musicWaveBean, String str, int i2) {
        this.f111841a = r1;
        this.f111842b = musicModel;
        this.f111843c = musicWaveBean;
        this.f111844d = str;
        this.f111845e = i2;
    }

    public final void run() {
        w.AnonymousClass3 r6 = this.f111841a;
        MusicModel musicModel = this.f111842b;
        MusicWaveBean musicWaveBean = this.f111843c;
        String str = this.f111844d;
        int i2 = this.f111845e;
        w.this.f112069b.e_(false);
        musicModel.setMusicWaveBean(musicWaveBean);
        w.this.f112069b.a(str, musicModel, i2);
    }
}

package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.w;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w.AnonymousClass2 f112110a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f112111b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicModel f112112c;

    /* renamed from: d  reason: collision with root package name */
    private final MusicWaveBean f112113d;

    /* renamed from: e  reason: collision with root package name */
    private final String f112114e;

    /* renamed from: f  reason: collision with root package name */
    private final int f112115f;

    static {
        Covode.recordClassIndex(72043);
    }

    y(w.AnonymousClass2 r1, boolean z, MusicModel musicModel, MusicWaveBean musicWaveBean, String str, int i2) {
        this.f112110a = r1;
        this.f112111b = z;
        this.f112112c = musicModel;
        this.f112113d = musicWaveBean;
        this.f112114e = str;
        this.f112115f = i2;
    }

    public final void run() {
        w.AnonymousClass2 r6 = this.f112110a;
        boolean z = this.f112111b;
        MusicModel musicModel = this.f112112c;
        MusicWaveBean musicWaveBean = this.f112113d;
        String str = this.f112114e;
        int i2 = this.f112115f;
        w.this.f112069b.e_(z);
        musicModel.setMusicWaveBean(musicWaveBean);
        w.this.f112069b.a(str, musicModel, i2);
    }
}

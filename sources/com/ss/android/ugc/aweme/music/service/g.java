package com.ss.android.ugc.aweme.music.service;

import android.app.Activity;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

final /* synthetic */ class g implements b.g {

    /* renamed from: a  reason: collision with root package name */
    private final e f111754a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f111755b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f111756c;

    /* renamed from: d  reason: collision with root package name */
    private final MusicModel f111757d;

    /* renamed from: e  reason: collision with root package name */
    private final String f111758e;

    /* renamed from: f  reason: collision with root package name */
    private final int f111759f;

    static {
        Covode.recordClassIndex(71864);
    }

    g(e eVar, boolean z, Activity activity, MusicModel musicModel, String str, int i2) {
        this.f111754a = eVar;
        this.f111755b = z;
        this.f111756c = activity;
        this.f111757d = musicModel;
        this.f111758e = str;
        this.f111759f = i2;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return this.f111754a.a(this.f111755b, this.f111756c, this.f111757d, this.f111758e, this.f111759f, iVar);
    }
}

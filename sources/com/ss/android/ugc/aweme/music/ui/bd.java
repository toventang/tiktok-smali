package com.ss.android.ugc.aweme.music.ui;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bd implements g {

    /* renamed from: a  reason: collision with root package name */
    private final MusicDownloadPlayHelper f111921a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f111922b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f111923c;

    /* renamed from: d  reason: collision with root package name */
    private final String f111924d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f111925e;

    static {
        Covode.recordClassIndex(71939);
    }

    bd(MusicDownloadPlayHelper musicDownloadPlayHelper, MusicModel musicModel, boolean z, String str, boolean z2) {
        this.f111921a = musicDownloadPlayHelper;
        this.f111922b = musicModel;
        this.f111923c = z;
        this.f111924d = str;
        this.f111925e = z2;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return this.f111921a.a(this.f111922b, this.f111923c, this.f111924d, this.f111925e, iVar);
    }
}

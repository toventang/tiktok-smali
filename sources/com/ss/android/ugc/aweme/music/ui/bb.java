package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.e;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bb implements e.c {

    /* renamed from: a  reason: collision with root package name */
    private final MusicDownloadPlayHelper f111918a;

    /* renamed from: b  reason: collision with root package name */
    private final String f111919b;

    static {
        Covode.recordClassIndex(71937);
    }

    bb(MusicDownloadPlayHelper musicDownloadPlayHelper, String str) {
        this.f111918a = musicDownloadPlayHelper;
        this.f111919b = str;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.e.c
    public final void a() {
        this.f111918a.b(this.f111919b);
    }
}

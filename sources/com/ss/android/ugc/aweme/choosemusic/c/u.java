package com.ss.android.ugc.aweme.choosemusic.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final r f70515a;

    /* renamed from: b  reason: collision with root package name */
    private final DmtTabLayout.f f70516b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicModel f70517c;

    static {
        Covode.recordClassIndex(43478);
    }

    u(r rVar, DmtTabLayout.f fVar, MusicModel musicModel) {
        this.f70515a = rVar;
        this.f70516b = fVar;
        this.f70517c = musicModel;
    }

    public final void run() {
        this.f70515a.a(this.f70516b, this.f70517c);
    }
}

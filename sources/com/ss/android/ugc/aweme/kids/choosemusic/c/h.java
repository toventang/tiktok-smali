package com.ss.android.ugc.aweme.kids.choosemusic.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f105559a;

    /* renamed from: b  reason: collision with root package name */
    private final DmtTabLayout.f f105560b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicModel f105561c;

    static {
        Covode.recordClassIndex(67615);
    }

    h(e eVar, DmtTabLayout.f fVar, MusicModel musicModel) {
        this.f105559a = eVar;
        this.f105560b = fVar;
        this.f105561c = musicModel;
    }

    public final void run() {
        this.f105559a.a(this.f105560b, this.f105561c);
    }
}

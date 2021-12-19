package com.ss.android.ugc.aweme.choosemusic.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;

final /* synthetic */ class b implements MusicDownloadPlayHelper.a {

    /* renamed from: a  reason: collision with root package name */
    private final ChallengeMusicWidget f71068a;

    static {
        Covode.recordClassIndex(43745);
    }

    b(ChallengeMusicWidget challengeMusicWidget) {
        this.f71068a = challengeMusicWidget;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.a
    public final void a() {
        this.f71068a.f67010e.a("music_loading", (Object) false);
    }
}

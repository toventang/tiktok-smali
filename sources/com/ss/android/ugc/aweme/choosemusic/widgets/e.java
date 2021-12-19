package com.ss.android.ugc.aweme.choosemusic.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;

final /* synthetic */ class e implements MusicDownloadPlayHelper.a {

    /* renamed from: a  reason: collision with root package name */
    private final MusicBoardWidget f71072a;

    static {
        Covode.recordClassIndex(43748);
    }

    e(MusicBoardWidget musicBoardWidget) {
        this.f71072a = musicBoardWidget;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.a
    public final void a() {
        this.f71072a.f67010e.a("music_loading", (Object) false);
    }
}

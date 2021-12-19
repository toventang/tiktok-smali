package com.ss.android.ugc.aweme.choosemusic.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;

final /* synthetic */ class h implements MusicDownloadPlayHelper.a {

    /* renamed from: a  reason: collision with root package name */
    private final StickerMusicWidget f71075a;

    static {
        Covode.recordClassIndex(43751);
    }

    h(StickerMusicWidget stickerMusicWidget) {
        this.f71075a = stickerMusicWidget;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.a
    public final void a() {
        this.f71075a.f67010e.a("music_loading", (Object) false);
    }
}

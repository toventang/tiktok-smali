package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;

final /* synthetic */ class h implements MusicDownloadPlayHelper.a {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerMusicBoardWidget f71004a;

    static {
        Covode.recordClassIndex(43718);
    }

    h(RecyclerMusicBoardWidget recyclerMusicBoardWidget) {
        this.f71004a = recyclerMusicBoardWidget;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.a
    public final void a() {
        this.f71004a.f67010e.a("music_loading", (Object) false);
    }
}

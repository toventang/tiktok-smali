package com.ss.android.ugc.aweme.choosemusic.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements MusicDownloadPlayHelper.a {

    /* renamed from: a  reason: collision with root package name */
    private final MusicBoardWidget f71069a;

    static {
        Covode.recordClassIndex(43746);
    }

    c(MusicBoardWidget musicBoardWidget) {
        this.f71069a = musicBoardWidget;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.a
    public final void a() {
        this.f71069a.f67010e.a("music_loading", (Object) false);
    }
}

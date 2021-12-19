package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.d.c;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private final MusicClassWidget f71073a;

    static {
        Covode.recordClassIndex(43749);
    }

    f(MusicClassWidget musicClassWidget) {
        this.f71073a = musicClassWidget;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.c
    public final void a(MusicCollectionItem musicCollectionItem) {
        MusicClassWidget musicClassWidget = this.f71073a;
        Intent intent = new Intent(musicClassWidget.f67007b, MusicDetailListActivity.class);
        intent.putExtra("music_type", 2);
        intent.putExtra("music_class_id", musicCollectionItem.mcId);
        intent.putExtra("music_class_name", musicCollectionItem.mcName);
        intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicClassWidget.f71053j);
        intent.putExtra("music_class_enter_method", "click_category_list");
        intent.putExtra("music_class_level", musicCollectionItem.level);
        intent.putExtra("sound_page_scene", musicClassWidget.f71054k);
        musicClassWidget.a(intent, musicClassWidget.f71052i);
        b.a(musicCollectionItem.mcName, "click_category_list", "", "change_music_page", musicCollectionItem.mcId);
    }
}

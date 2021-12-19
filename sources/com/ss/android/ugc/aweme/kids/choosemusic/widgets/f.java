package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.a.e.d;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.d.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private final MusicClassWidget f105877a;

    static {
        Covode.recordClassIndex(67753);
    }

    f(MusicClassWidget musicClassWidget) {
        this.f105877a = musicClassWidget;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.c
    public final void a(d dVar) {
        MusicClassWidget musicClassWidget = this.f105877a;
        Intent intent = new Intent(musicClassWidget.f67007b, MusicDetailListActivity.class);
        intent.putExtra("music_type", 2);
        intent.putExtra("music_class_id", dVar.f105308a);
        intent.putExtra("music_class_name", dVar.f105309b);
        intent.putExtra("music_category_is_hot", dVar.f105312e);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicClassWidget.f105853j);
        intent.putExtra("music_class_enter_method", "click_category_list");
        intent.putExtra("music_class_level", dVar.f105313f);
        musicClassWidget.a(intent, musicClassWidget.f105852i);
        com.ss.android.ugc.aweme.kids.choosemusic.g.c.a(dVar.f105309b, "click_category_list", "", "change_music_page", dVar.f105308a);
    }
}

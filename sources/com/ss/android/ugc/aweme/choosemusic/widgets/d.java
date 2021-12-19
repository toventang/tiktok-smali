package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.choosemusic.view.s;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements s {

    /* renamed from: a  reason: collision with root package name */
    private final MusicBoardWidget f71070a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicCollectionItem f71071b;

    static {
        Covode.recordClassIndex(43747);
    }

    d(MusicBoardWidget musicBoardWidget, MusicCollectionItem musicCollectionItem) {
        this.f71070a = musicBoardWidget;
        this.f71071b = musicCollectionItem;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.view.s
    public final void a(com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar, View view, MusicModel musicModel, int i2) {
        MusicBoardWidget musicBoardWidget = this.f71070a;
        MusicCollectionItem musicCollectionItem = this.f71071b;
        int id = view.getId();
        if (id == R.id.bz3) {
            Activity j2 = f.j();
            if (j2 != null) {
                j2.getString(R.string.bss);
            }
            if (!AccountService.a().e().isLogin()) {
                a.a(f.j(), c.a(i2), "click_favorite_music");
                return;
            }
            sVar.e();
            b.a(sVar.u, musicModel.getMusicId(), musicBoardWidget.n, sVar.x, musicModel.getLogPb());
        } else if (id != R.id.bz5) {
            String str = "";
            if (id == R.id.f9p) {
                Intent intent = new Intent(musicBoardWidget.f67007b, MusicDetailListActivity.class);
                if (musicBoardWidget.f71047k == 0) {
                    intent.putExtra("music_type", 1);
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f71049m);
                    intent.putExtra("sound_page_scene", musicBoardWidget.s);
                } else {
                    intent.putExtra("music_class_id", musicCollectionItem.mcId);
                    intent.putExtra("music_class_name", musicCollectionItem.mcName);
                    intent.putExtra("music_type", 2);
                    intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                    intent.putExtra("music_class_enter_method", "click_more");
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f71049m);
                    intent.putExtra("music_class_level", musicCollectionItem.level);
                    intent.putExtra("sound_page_scene", musicBoardWidget.s);
                }
                musicBoardWidget.a(intent, musicBoardWidget.f71048l);
                b.a(musicCollectionItem.mcName, "click_more", str, "change_music_page", musicCollectionItem.mcId);
            } else if (id == R.id.cfv) {
                if (sVar != null && musicModel != null) {
                    if (musicBoardWidget.f71046j == sVar.x && ((Integer) musicBoardWidget.f67010e.b("music_position", (Object) -1)).intValue() == musicBoardWidget.f71047k) {
                        musicBoardWidget.f67010e.a("music_position", (Object) -1);
                        musicBoardWidget.f67010e.a("music_index", (Object) -1);
                        sVar.a(false, false);
                        musicBoardWidget.g();
                        return;
                    }
                    if (musicBoardWidget.f71044h != null) {
                        musicBoardWidget.g();
                        musicBoardWidget.f71044h.a(new e(musicBoardWidget));
                        musicBoardWidget.f71044h.a(musicModel, musicBoardWidget.n);
                        b.f70720c = sVar.x;
                    }
                    musicBoardWidget.f67010e.a("music_position", Integer.valueOf(musicBoardWidget.f71047k));
                    musicBoardWidget.f67010e.a("music_index", Integer.valueOf(sVar.x));
                    musicBoardWidget.f67010e.a("music_loading", (Object) true);
                }
            } else if (id == R.id.ch1 && musicBoardWidget.f71044h != null && musicModel != null) {
                String str2 = musicBoardWidget.n.f70383e;
                if (!m.a(str2)) {
                    str = str2;
                }
                musicModel.setCategoryID(str);
                musicBoardWidget.f71044h.b(musicModel);
                b.a(musicBoardWidget.n, musicModel.getMusicId(), sVar.x, musicModel.getLogPb());
            }
        } else if (musicModel == null) {
        } else {
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.dcb);
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(offlineDesc).a();
            } else if (com.ss.android.ugc.aweme.music.k.d.a(musicModel, view.getContext(), true)) {
                String uuid = UUID.randomUUID().toString();
                t.a(t.a(), u.a("aweme://music/detail/" + musicModel.getMusicId()).a("process_id", uuid).a());
                b.a(musicBoardWidget.n, musicModel.getMusicId(), false, uuid);
            }
        }
    }
}

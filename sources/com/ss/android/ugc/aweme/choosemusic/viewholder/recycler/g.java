package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.choosemusic.view.s;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements s {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerMusicBoardWidget f71002a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicCollectionItem f71003b;

    static {
        Covode.recordClassIndex(43717);
    }

    g(RecyclerMusicBoardWidget recyclerMusicBoardWidget, MusicCollectionItem musicCollectionItem) {
        this.f71002a = recyclerMusicBoardWidget;
        this.f71003b = musicCollectionItem;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.view.s
    public final void a(com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar, View view, MusicModel musicModel, int i2) {
        RecyclerMusicBoardWidget recyclerMusicBoardWidget = this.f71002a;
        MusicCollectionItem musicCollectionItem = this.f71003b;
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
            b.a(sVar.u, musicModel.getMusicId(), recyclerMusicBoardWidget.n, sVar.x, musicModel.getLogPb());
        } else if (id != R.id.bz5) {
            String str = "";
            if (id == R.id.f9p) {
                Intent intent = new Intent(recyclerMusicBoardWidget.f67007b, MusicDetailListActivity.class);
                if (recyclerMusicBoardWidget.f70968k == 0) {
                    intent.putExtra("music_type", 1);
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", recyclerMusicBoardWidget.f70970m);
                } else {
                    intent.putExtra("music_class_id", musicCollectionItem.mcId);
                    intent.putExtra("music_class_name", musicCollectionItem.mcName);
                    intent.putExtra("music_type", 2);
                    intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                    intent.putExtra("music_class_enter_method", "click_more");
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", recyclerMusicBoardWidget.f70970m);
                    intent.putExtra("music_class_level", musicCollectionItem.level);
                    intent.putExtra("sound_page_scene", recyclerMusicBoardWidget.s);
                }
                recyclerMusicBoardWidget.a(intent, recyclerMusicBoardWidget.f70969l);
                b.a(musicCollectionItem.mcName, "click_more", str, "change_music_page", musicCollectionItem.mcId);
            } else if (id == R.id.cfv) {
                if (sVar != null && musicModel != null) {
                    if (recyclerMusicBoardWidget.f70967j == sVar.x && ((Integer) recyclerMusicBoardWidget.f67010e.b("music_position", (Object) -1)).intValue() == recyclerMusicBoardWidget.f70968k) {
                        recyclerMusicBoardWidget.f67010e.a("music_position", (Object) -1);
                        recyclerMusicBoardWidget.f67010e.a("music_index", (Object) -1);
                        sVar.a(false, false);
                        recyclerMusicBoardWidget.g();
                        return;
                    }
                    if (recyclerMusicBoardWidget.f70965h != null) {
                        recyclerMusicBoardWidget.g();
                        recyclerMusicBoardWidget.f70965h.a(new h(recyclerMusicBoardWidget));
                        recyclerMusicBoardWidget.f70965h.a(musicModel, recyclerMusicBoardWidget.n);
                        b.f70720c = sVar.x;
                    }
                    recyclerMusicBoardWidget.f67010e.a("music_position", Integer.valueOf(recyclerMusicBoardWidget.f70968k));
                    recyclerMusicBoardWidget.f67010e.a("music_index", Integer.valueOf(sVar.x));
                    recyclerMusicBoardWidget.f67010e.a("music_loading", (Object) true);
                }
            } else if (id == R.id.ch1 && recyclerMusicBoardWidget.f70965h != null && musicModel != null) {
                String str2 = recyclerMusicBoardWidget.n.f70383e;
                if (!m.a(str2)) {
                    str = str2;
                }
                musicModel.setCategoryID(str);
                recyclerMusicBoardWidget.f70965h.b(musicModel);
                b.a(recyclerMusicBoardWidget.n, musicModel.getMusicId(), sVar.x, musicModel.getLogPb());
            }
        } else if (musicModel == null) {
        } else {
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.dcb);
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(offlineDesc).a();
            } else if (d.a(musicModel, view.getContext(), true)) {
                String uuid = UUID.randomUUID().toString();
                SmartRouter.buildRoute(view.getContext(), "aweme://music/detail/" + musicModel.getMusicId()).withParam("process_id", uuid).open();
                b.a(recyclerMusicBoardWidget.n, musicModel.getMusicId(), false, uuid);
            }
        }
    }
}

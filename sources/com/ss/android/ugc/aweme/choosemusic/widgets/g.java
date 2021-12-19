package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.choosemusic.view.s;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements s {

    /* renamed from: a  reason: collision with root package name */
    private final StickerMusicWidget f71074a;

    static {
        Covode.recordClassIndex(43750);
    }

    g(StickerMusicWidget stickerMusicWidget) {
        this.f71074a = stickerMusicWidget;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.view.s
    public final void a(com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar, View view, MusicModel musicModel, int i2) {
        StickerMusicWidget stickerMusicWidget = this.f71074a;
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
            b.a(sVar.u, musicModel.getMusicId(), stickerMusicWidget.f71060l, sVar.x, musicModel.getLogPb());
        } else if (id == R.id.bz5) {
            if (musicModel == null) {
                return;
            }
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.dcb);
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(offlineDesc).a();
            } else if (d.a(musicModel, view.getContext(), true)) {
                String uuid = UUID.randomUUID().toString();
                t.a(t.a(), u.a("aweme://music/detail/" + musicModel.getMusicId()).a("process_id", uuid).a());
                b.a(new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", "attached_song", "click_button", b.f70718a), musicModel.getMusicId(), false, uuid);
            }
        } else if (id == R.id.cfv) {
            if (stickerMusicWidget.f71057i == sVar.x && ((Integer) stickerMusicWidget.f67010e.b("music_position", (Object) -1)).intValue() == -2) {
                stickerMusicWidget.f67010e.a("music_position", (Object) -1);
                stickerMusicWidget.f67010e.a("music_index", (Object) -1);
                stickerMusicWidget.e();
                return;
            }
            if (stickerMusicWidget.f71056h != null) {
                stickerMusicWidget.e();
                b.f70720c = sVar.x;
                com.ss.android.ugc.aweme.choosemusic.b bVar = new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", "prop", "", b.f70718a);
                bVar.f70384f = (String) stickerMusicWidget.f67010e.b("sticker_id", (Object) null);
                stickerMusicWidget.f71056h.a(new h(stickerMusicWidget));
                stickerMusicWidget.f71056h.a(musicModel, bVar);
            }
            stickerMusicWidget.f67010e.a("music_position", (Object) -2);
            stickerMusicWidget.f67010e.a("music_index", Integer.valueOf(sVar.x));
            stickerMusicWidget.f67010e.a("music_loading", (Object) true);
        } else if (id == R.id.ch1) {
            if (stickerMusicWidget.n != null) {
                stickerMusicWidget.n.b(9);
            }
            if (stickerMusicWidget.f71056h != null) {
                stickerMusicWidget.f71056h.b(musicModel);
                b.a(stickerMusicWidget.f71060l, musicModel.getMusicId(), sVar.x, musicModel.getLogPb());
            }
        }
    }
}

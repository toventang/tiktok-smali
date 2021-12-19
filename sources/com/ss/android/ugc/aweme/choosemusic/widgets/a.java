package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.AccountService;
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
public final /* synthetic */ class a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final ChallengeMusicWidget f71062a;

    static {
        Covode.recordClassIndex(43742);
    }

    a(ChallengeMusicWidget challengeMusicWidget) {
        this.f71062a = challengeMusicWidget;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.view.s
    public final void a(com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar, View view, MusicModel musicModel, int i2) {
        ChallengeMusicWidget challengeMusicWidget = this.f71062a;
        int id = view.getId();
        if (id == R.id.bz3) {
            Activity j2 = f.j();
            if (j2 != null) {
                j2.getString(R.string.bss);
            }
            if (!AccountService.a().e().isLogin()) {
                com.ss.android.ugc.aweme.choosemusic.a.a(f.j(), c.a(i2), "click_favorite_music");
                return;
            }
            sVar.e();
            b.a(sVar.u, musicModel.getMusicId(), challengeMusicWidget.f71040m, sVar.x, musicModel.getLogPb());
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
                com.ss.android.ugc.aweme.choosemusic.b bVar = new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", "attached_song", "click_button", b.f70718a);
                bVar.f70385g = (String) challengeMusicWidget.f67010e.b("challenge_id", (Object) null);
                b.a(bVar, musicModel.getMusicId(), false, uuid);
            }
        } else if (id == R.id.cfv) {
            if (challengeMusicWidget.f71037j == sVar.x && ((Integer) challengeMusicWidget.f67010e.b("music_position", (Object) -1)).intValue() == -2) {
                challengeMusicWidget.f67010e.a("music_position", (Object) -1);
                challengeMusicWidget.f67010e.a("music_index", (Object) -1);
                sVar.a(false, false);
                challengeMusicWidget.e();
                return;
            }
            if (challengeMusicWidget.f71036i != null) {
                challengeMusicWidget.e();
                b.f70720c = sVar.x;
                com.ss.android.ugc.aweme.choosemusic.b bVar2 = new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", "attached_song", "", b.f70718a);
                bVar2.f70385g = (String) challengeMusicWidget.f67010e.b("challenge_id", (Object) null);
                challengeMusicWidget.f71036i.a(musicModel, bVar2);
                challengeMusicWidget.f71036i.a(new b(challengeMusicWidget));
            }
            challengeMusicWidget.f67010e.a("music_position", (Object) -2);
            challengeMusicWidget.f67010e.a("music_index", Integer.valueOf(sVar.x));
            challengeMusicWidget.f67010e.a("music_loading", (Object) true);
        } else if (id == R.id.ch1) {
            if (challengeMusicWidget.o != null) {
                challengeMusicWidget.o.b(10);
            }
            if (challengeMusicWidget.f71036i != null) {
                challengeMusicWidget.f71036i.b(musicModel);
                b.a(challengeMusicWidget.f71040m, musicModel.getMusicId(), sVar.x, musicModel.getLogPb());
            }
        }
    }
}

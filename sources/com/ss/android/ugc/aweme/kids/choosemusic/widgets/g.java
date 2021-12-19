package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.kids.choosemusic.a;
import com.ss.android.ugc.aweme.kids.choosemusic.g.c;
import com.ss.android.ugc.aweme.kids.choosemusic.h.k;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements k {

    /* renamed from: a  reason: collision with root package name */
    private final StickerMusicWidget f105878a;

    static {
        Covode.recordClassIndex(67754);
    }

    g(StickerMusicWidget stickerMusicWidget) {
        this.f105878a = stickerMusicWidget;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.k
    public final void a(o oVar, View view, MusicModel musicModel) {
        StickerMusicWidget stickerMusicWidget = this.f105878a;
        int id = view.getId();
        if (id == R.id.bz3) {
            f.j();
            oVar.d();
            boolean z = oVar.s;
            String musicId = musicModel.getMusicId();
            a aVar = stickerMusicWidget.f105869l;
            musicModel.getLogPb();
            c.a(z, musicId, aVar);
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
            } else if (com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel, view.getContext(), true)) {
                t.a(t.a(), u.a("aweme://music/detail/" + musicModel.getMusicId()).a("process_id", UUID.randomUUID().toString()).a());
            }
        } else if (id == R.id.cfv) {
            if (stickerMusicWidget.f105866i == oVar.v && ((Integer) stickerMusicWidget.f67010e.b("music_position", (Object) -1)).intValue() == -2) {
                stickerMusicWidget.f67010e.a("music_position", (Object) -1);
                stickerMusicWidget.f67010e.a("music_index", (Object) -1);
                stickerMusicWidget.e();
                return;
            }
            if (stickerMusicWidget.f105865h != null) {
                stickerMusicWidget.e();
                c.f105650b = oVar.v;
                a aVar2 = new a("change_music_page", "prop", "", c.f105649a);
                aVar2.f105437f = (String) stickerMusicWidget.f67010e.b("sticker_id", (Object) null);
                stickerMusicWidget.f105865h.a(new h(stickerMusicWidget));
                stickerMusicWidget.f105865h.a(musicModel, aVar2);
            }
            stickerMusicWidget.f67010e.a("music_position", (Object) -2);
            stickerMusicWidget.f67010e.a("music_index", Integer.valueOf(oVar.v));
            stickerMusicWidget.f67010e.a("music_loading", (Object) true);
        } else if (id == R.id.ch1) {
            if (stickerMusicWidget.n != null) {
                stickerMusicWidget.n.b(9);
            }
            if (stickerMusicWidget.f105865h != null) {
                stickerMusicWidget.f105865h.b(musicModel);
                a aVar3 = stickerMusicWidget.f105869l;
                String musicId2 = musicModel.getMusicId();
                int i2 = oVar.v;
                musicModel.getLogPb();
                c.a(aVar3, musicId2, i2);
            }
        }
    }
}

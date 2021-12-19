package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.kids.choosemusic.g.c;
import com.ss.android.ugc.aweme.kids.choosemusic.h.k;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements k {

    /* renamed from: a  reason: collision with root package name */
    private final ChallengeMusicWidget f105871a;

    static {
        Covode.recordClassIndex(67748);
    }

    a(ChallengeMusicWidget challengeMusicWidget) {
        this.f105871a = challengeMusicWidget;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.k
    public final void a(o oVar, View view, MusicModel musicModel) {
        ChallengeMusicWidget challengeMusicWidget = this.f105871a;
        int id = view.getId();
        if (id == R.id.bz3) {
            Activity j2 = f.j();
            if (j2 != null) {
                j2.getString(R.string.bss);
            }
            oVar.d();
            boolean z = oVar.s;
            String musicId = musicModel.getMusicId();
            com.ss.android.ugc.aweme.kids.choosemusic.a aVar = challengeMusicWidget.f105841m;
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
                new com.ss.android.ugc.aweme.kids.choosemusic.a("change_music_page", "attached_song", "click_button", c.f105649a).f105438g = (String) challengeMusicWidget.f67010e.b("challenge_id", (Object) null);
            }
        } else if (id == R.id.cfv) {
            if (challengeMusicWidget.f105838j == oVar.v && ((Integer) challengeMusicWidget.f67010e.b("music_position", (Object) -1)).intValue() == -2) {
                challengeMusicWidget.f67010e.a("music_position", (Object) -1);
                challengeMusicWidget.f67010e.a("music_index", (Object) -1);
                oVar.a(false, false);
                challengeMusicWidget.e();
                return;
            }
            if (challengeMusicWidget.f105837i != null) {
                challengeMusicWidget.e();
                c.f105650b = oVar.v;
                com.ss.android.ugc.aweme.kids.choosemusic.a aVar2 = new com.ss.android.ugc.aweme.kids.choosemusic.a("change_music_page", "attached_song", "", c.f105649a);
                aVar2.f105438g = (String) challengeMusicWidget.f67010e.b("challenge_id", (Object) null);
                challengeMusicWidget.f105837i.a(musicModel, aVar2);
                challengeMusicWidget.f105837i.a(new b(challengeMusicWidget));
            }
            challengeMusicWidget.f67010e.a("music_position", (Object) -2);
            challengeMusicWidget.f67010e.a("music_index", Integer.valueOf(oVar.v));
            challengeMusicWidget.f67010e.a("music_loading", (Object) true);
        } else if (id == R.id.ch1) {
            if (challengeMusicWidget.o != null) {
                challengeMusicWidget.o.b(10);
            }
            if (challengeMusicWidget.f105837i != null) {
                challengeMusicWidget.f105837i.b(musicModel);
                com.ss.android.ugc.aweme.kids.choosemusic.a aVar3 = challengeMusicWidget.f105841m;
                String musicId2 = musicModel.getMusicId();
                int i2 = oVar.v;
                musicModel.getLogPb();
                c.a(aVar3, musicId2, i2);
            }
        }
    }
}

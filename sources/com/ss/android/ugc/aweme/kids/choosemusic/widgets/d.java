package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.kids.choosemusic.a;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.g.c;
import com.ss.android.ugc.aweme.kids.choosemusic.h.k;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements k {

    /* renamed from: a  reason: collision with root package name */
    private final MusicBoardWidget f105874a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.kids.a.e.d f105875b;

    static {
        Covode.recordClassIndex(67751);
    }

    d(MusicBoardWidget musicBoardWidget, com.ss.android.ugc.aweme.kids.a.e.d dVar) {
        this.f105874a = musicBoardWidget;
        this.f105875b = dVar;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.k
    public final void a(o oVar, View view, MusicModel musicModel) {
        MusicBoardWidget musicBoardWidget = this.f105874a;
        com.ss.android.ugc.aweme.kids.a.e.d dVar = this.f105875b;
        int id = view.getId();
        if (id == R.id.bz3) {
            Activity j2 = f.j();
            if (j2 != null) {
                j2.getString(R.string.bss);
            }
            oVar.d();
            boolean z = oVar.s;
            String musicId = musicModel.getMusicId();
            a aVar = musicBoardWidget.n;
            musicModel.getLogPb();
            c.a(z, musicId, aVar);
        } else if (id != R.id.bz5) {
            String str = "";
            if (id == R.id.f9p) {
                Intent intent = new Intent(musicBoardWidget.f67007b, MusicDetailListActivity.class);
                if (musicBoardWidget.f105847k == 0) {
                    intent.putExtra("music_type", 1);
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f105849m);
                } else {
                    intent.putExtra("music_class_id", dVar.f105308a);
                    intent.putExtra("music_class_name", dVar.f105309b);
                    intent.putExtra("music_type", 2);
                    intent.putExtra("music_category_is_hot", dVar.f105312e);
                    intent.putExtra("music_class_enter_method", "click_more");
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f105849m);
                    intent.putExtra("music_class_level", dVar.f105313f);
                }
                musicBoardWidget.a(intent, musicBoardWidget.f105848l);
                c.a(dVar.f105309b, "click_more", str, "change_music_page", dVar.f105308a);
            } else if (id == R.id.cfv) {
                if (oVar != null && musicModel != null) {
                    if (musicBoardWidget.f105846j == oVar.v && ((Integer) musicBoardWidget.f67010e.b("music_position", (Object) -1)).intValue() == musicBoardWidget.f105847k) {
                        musicBoardWidget.f67010e.a("music_position", (Object) -1);
                        musicBoardWidget.f67010e.a("music_index", (Object) -1);
                        oVar.a(false, false);
                        musicBoardWidget.g();
                        return;
                    }
                    if (musicBoardWidget.f105844h != null) {
                        musicBoardWidget.g();
                        musicBoardWidget.f105844h.a(new e(musicBoardWidget));
                        musicBoardWidget.f105844h.a(musicModel, musicBoardWidget.n);
                        c.f105650b = oVar.v;
                    }
                    musicBoardWidget.f67010e.a("music_position", Integer.valueOf(musicBoardWidget.f105847k));
                    musicBoardWidget.f67010e.a("music_index", Integer.valueOf(oVar.v));
                    musicBoardWidget.f67010e.a("music_loading", (Object) true);
                }
            } else if (id == R.id.ch1 && musicBoardWidget.f105844h != null && musicModel != null) {
                String str2 = musicBoardWidget.n.f105436e;
                if (!m.a(str2)) {
                    str = str2;
                }
                musicModel.setCategoryID(str);
                musicBoardWidget.f105844h.b(musicModel);
                a aVar2 = musicBoardWidget.n;
                String musicId2 = musicModel.getMusicId();
                int i2 = oVar.v;
                musicModel.getLogPb();
                c.a(aVar2, musicId2, i2);
            }
        } else if (musicModel == null) {
        } else {
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.dcb);
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(offlineDesc).a();
            } else if (com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel, view.getContext(), true)) {
                t.a(t.a(), u.a("aweme://music/detail/" + musicModel.getMusicId()).a("process_id", UUID.randomUUID().toString()).a());
            }
        }
    }
}

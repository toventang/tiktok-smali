package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.music.model.MusicList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70677a;

    static {
        Covode.recordClassIndex(43576);
    }

    p(b bVar) {
        this.f70677a = bVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70677a;
        bVar.f70645f = false;
        if (iVar.c()) {
            bVar.f70641b.a("refresh_status_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            bVar.f70641b.a("refresh_status_music_list", (Object) 0);
            MusicList musicList = (MusicList) iVar.d();
            b bVar2 = new b();
            bVar2.a("list_cursor", Integer.valueOf(musicList.getCursor())).a("list_hasmore", Integer.valueOf(musicList.hasMore)).a("action_type", 1).a("list_data", c.a(musicList.items));
            bVar.f70641b.a("music_list", bVar2);
            bVar.f70641b.a("data_share_info", musicList.mcInfo.shareInfo);
            return null;
        }
    }
}

package com.ss.android.ugc.aweme.choosemusic.model;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.music.model.MusicList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements b.g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70659a;

    static {
        Covode.recordClassIndex(43567);
    }

    g(b bVar) {
        this.f70659a = bVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70659a;
        bVar.f70647h = false;
        if (iVar.c()) {
            bVar.f70641b.a("refresh_status_hot_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            MusicList musicList = (MusicList) iVar.d();
            b bVar2 = new b();
            bVar2.a("refresh_status_hot_music_list", 0).a("list_cursor", Integer.valueOf(musicList.getCursor())).a("list_hasmore", Integer.valueOf(musicList.hasMore)).a("action_type", 1).a("list_data", c.a(musicList.items));
            bVar.f70641b.a("hot_music_list_data", bVar2);
            return null;
        }
    }
}

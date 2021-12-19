package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.music.model.MusicList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70679a;

    /* renamed from: b  reason: collision with root package name */
    private final int f70680b;

    static {
        Covode.recordClassIndex(43578);
    }

    r(b bVar, int i2) {
        this.f70679a = bVar;
        this.f70680b = i2;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70679a;
        int i2 = this.f70680b;
        if (iVar.c()) {
            bVar.f70641b.a("status_second_level_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            bVar.f70641b.a("status_second_level_music_list", (Object) 0);
            MusicList musicList = (MusicList) iVar.d();
            b bVar2 = new b();
            bVar2.a("list_cursor", Integer.valueOf(musicList.getCursor())).a("list_hasmore", Integer.valueOf(musicList.hasMore)).a("action_type", 1).a("list_level", Integer.valueOf(i2)).a("list_collection_data", musicList.childCollections).a("list_data", c.a(musicList.items));
            bVar.f70641b.a("second_level_music_list", bVar2);
            return null;
        }
    }
}

package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.music.model.MusicCollection;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70675a;

    static {
        Covode.recordClassIndex(43574);
    }

    n(b bVar) {
        this.f70675a = bVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70675a;
        if (iVar.c()) {
            bVar.f70641b.a("refresh_status_music_sheet", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            bVar.f70641b.a("refresh_status_music_sheet", (Object) 0);
            MusicCollection musicCollection = (MusicCollection) iVar.d();
            b bVar2 = new b();
            bVar2.a("list_cursor", Long.valueOf(musicCollection.cursor)).a("list_hasmore", Boolean.valueOf(musicCollection.hasMore)).a("action_type", 1).a("list_data", musicCollection.getItems());
            bVar.f70641b.a("music_sheet_list", bVar2);
            return null;
        }
    }
}

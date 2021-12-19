package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.b.a;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70661a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f70662b;

    /* renamed from: c  reason: collision with root package name */
    private final int f70663c;

    /* renamed from: d  reason: collision with root package name */
    private final int f70664d;

    /* renamed from: e  reason: collision with root package name */
    private final int f70665e;

    /* renamed from: f  reason: collision with root package name */
    private final String f70666f;

    static {
        Covode.recordClassIndex(43569);
    }

    i(b bVar, MusicModel musicModel, int i2, int i3, int i4, String str) {
        this.f70661a = bVar;
        this.f70662b = musicModel;
        this.f70663c = i2;
        this.f70664d = i3;
        this.f70665e = i4;
        this.f70666f = str;
    }

    @Override // b.g
    public final Object then(b.i iVar) {
        b bVar = this.f70661a;
        MusicModel musicModel = this.f70662b;
        int i2 = this.f70663c;
        int i3 = this.f70664d;
        int i4 = this.f70665e;
        String str = this.f70666f;
        if (iVar.b()) {
            return null;
        }
        boolean z = true;
        if (iVar.c()) {
            musicModel.setCollectionType(i2 == 1 ? MusicModel.CollectionType.NOT_COLLECTED : MusicModel.CollectionType.COLLECTED);
            bVar.f70641b.a("music_collect_status", new a(1, i2, i3, i4, musicModel));
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            musicModel.setCollectionType(i2 == 1 ? MusicModel.CollectionType.COLLECTED : MusicModel.CollectionType.NOT_COLLECTED);
            com.ss.android.ugc.aweme.music.c.a h2 = MusicService.m().h();
            if (h2 != null) {
                if (i2 != 1) {
                    z = false;
                }
                h2.a(str, z);
            }
            bVar.f70641b.a("music_collect_status", new a(0, i2, i3, i4, musicModel));
            return null;
        }
    }
}

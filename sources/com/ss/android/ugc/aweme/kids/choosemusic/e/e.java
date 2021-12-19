package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.choosemusic.b.a;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105605a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f105606b;

    /* renamed from: c  reason: collision with root package name */
    private final int f105607c;

    /* renamed from: d  reason: collision with root package name */
    private final int f105608d;

    /* renamed from: e  reason: collision with root package name */
    private final int f105609e;

    static {
        Covode.recordClassIndex(67648);
    }

    e(a aVar, MusicModel musicModel, int i2, int i3, int i4) {
        this.f105605a = aVar;
        this.f105606b = musicModel;
        this.f105607c = i2;
        this.f105608d = i3;
        this.f105609e = i4;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105605a;
        MusicModel musicModel = this.f105606b;
        int i2 = this.f105607c;
        int i3 = this.f105608d;
        int i4 = this.f105609e;
        if (iVar.b()) {
            return null;
        }
        if (iVar.c()) {
            musicModel.setCollectionType(i2 == 1 ? MusicModel.CollectionType.NOT_COLLECTED : MusicModel.CollectionType.COLLECTED);
            aVar.f105590b.a("music_collect_status", new a(1, i2, i3, i4, musicModel));
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            musicModel.setCollectionType(i2 == 1 ? MusicModel.CollectionType.COLLECTED : MusicModel.CollectionType.NOT_COLLECTED);
            aVar.f105590b.a("music_collect_status", new a(0, i2, i3, i4, musicModel));
            return null;
        }
    }
}

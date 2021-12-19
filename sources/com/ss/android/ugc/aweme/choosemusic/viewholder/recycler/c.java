package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.a;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.b;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;

public final class c {

    /* renamed from: a */
    public final MusicModel f70978a;

    /* renamed from: b */
    public a f70979b;

    /* renamed from: c */
    public b f70980c;

    static {
        Covode.recordClassIndex(43708);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f70978a, cVar.f70978a) && l.a(this.f70979b, cVar.f70979b) && l.a(this.f70980c, cVar.f70980c);
    }

    public final int hashCode() {
        MusicModel musicModel = this.f70978a;
        int i2 = 0;
        int hashCode = (musicModel != null ? musicModel.hashCode() : 0) * 31;
        a aVar = this.f70979b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.f70980c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MusicStatus(musicModel=" + this.f70978a + ", loadStatus=" + this.f70979b + ", playStatus=" + this.f70980c + ")";
    }

    public /* synthetic */ c(MusicModel musicModel) {
        this(musicModel, a.c.f70974a, b.c.f70977a);
    }

    private c(MusicModel musicModel, a aVar, b bVar) {
        l.d(musicModel, "");
        l.d(aVar, "");
        l.d(bVar, "");
        this.f70978a = musicModel;
        this.f70979b = aVar;
        this.f70980c = bVar;
    }

    public static /* synthetic */ c a(c cVar, MusicModel musicModel, a aVar, b bVar, int i2) {
        if ((i2 & 1) != 0) {
            musicModel = cVar.f70978a;
        }
        if ((i2 & 2) != 0) {
            aVar = cVar.f70979b;
        }
        if ((i2 & 4) != 0) {
            bVar = cVar.f70980c;
        }
        l.d(musicModel, "");
        l.d(aVar, "");
        l.d(bVar, "");
        return new c(musicModel, aVar, bVar);
    }
}

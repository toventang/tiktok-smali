package com.ss.android.ugc.aweme.music.assem.list.cell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final MusicModel f111239a;

    /* renamed from: b  reason: collision with root package name */
    public final f f111240b;

    static {
        Covode.recordClassIndex(71465);
    }

    public final String toString() {
        return "MusicItem(model=" + this.f111239a + ", pinStatus=" + this.f111240b + ")";
    }

    public final int hashCode() {
        return this.f111239a.getMusicId().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return l.a((Object) ((d) obj).f111239a.getMusicId(), (Object) this.f111239a.getMusicId());
        }
        return super.equals(obj);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        l.d(aVar, "");
        if (!(aVar instanceof d)) {
            return aVar.equals(this);
        }
        d dVar = (d) aVar;
        if (l.a((Object) dVar.f111239a.getMusicId(), (Object) this.f111239a.getMusicId()) && dVar.f111240b == this.f111240b && dVar.f111239a.getCollectionType() == this.f111239a.getCollectionType()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        l.d(aVar, "");
        if (aVar instanceof d) {
            return l.a((Object) ((d) aVar).f111239a.getMusicId(), (Object) this.f111239a.getMusicId());
        }
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        boolean z;
        l.d(aVar, "");
        if (!(aVar instanceof d)) {
            return null;
        }
        d dVar = (d) aVar;
        if (dVar.f111240b == this.f111240b && dVar.f111239a.getCollectionType() == this.f111239a.getCollectionType()) {
            return null;
        }
        boolean z2 = true;
        if (dVar.f111240b != this.f111240b) {
            z = true;
        } else {
            z = false;
        }
        if (dVar.f111239a.getCollectionType() == this.f111239a.getCollectionType()) {
            z2 = false;
        }
        return new e(z, z2);
    }

    public d(MusicModel musicModel, f fVar) {
        l.d(musicModel, "");
        l.d(fVar, "");
        this.f111239a = musicModel;
        this.f111240b = fVar;
    }
}

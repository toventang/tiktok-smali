package com.ss.android.ugc.aweme.music.ui.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import h.f.b.l;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ExternalMusicInfo f112105a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f112106b;

    static {
        Covode.recordClassIndex(72041);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f112105a, dVar.f112105a) && this.f112106b == dVar.f112106b;
    }

    public final int hashCode() {
        ExternalMusicInfo externalMusicInfo = this.f112105a;
        int hashCode = (externalMusicInfo != null ? externalMusicInfo.hashCode() : 0) * 31;
        boolean z = this.f112106b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "ThirdMusicItem(musicInfo=" + this.f112105a + ", isLastItem=" + this.f112106b + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public d(ExternalMusicInfo externalMusicInfo, boolean z) {
        l.d(externalMusicInfo, "");
        this.f112105a = externalMusicInfo;
        this.f112106b = z;
    }
}

package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import h.f.b.l;
import java.util.List;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final List<ExternalMusicInfo> f111908a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f111909b;

    /* renamed from: c  reason: collision with root package name */
    public final String f111910c;

    /* renamed from: d  reason: collision with root package name */
    public final String f111911d;

    /* renamed from: e  reason: collision with root package name */
    public final String f111912e;

    static {
        Covode.recordClassIndex(71930);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f111908a, bVar.f111908a) && this.f111909b == bVar.f111909b && l.a(this.f111910c, bVar.f111910c) && l.a(this.f111911d, bVar.f111911d) && l.a(this.f111912e, bVar.f111912e);
    }

    public final int hashCode() {
        List<ExternalMusicInfo> list = this.f111908a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f111909b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str = this.f111910c;
        int hashCode2 = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f111911d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f111912e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ChooseThirdMusicData(musicInfoList=" + this.f111908a + ", isExclusiveResso=" + this.f111909b + ", processId=" + this.f111910c + ", musicId=" + this.f111911d + ", groupId=" + this.f111912e + ")";
    }

    public b(List<ExternalMusicInfo> list, boolean z, String str, String str2, String str3) {
        l.d(list, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f111908a = list;
        this.f111909b = z;
        this.f111910c = str;
        this.f111911d = str2;
        this.f111912e = str3;
    }
}

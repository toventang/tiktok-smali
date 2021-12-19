package com.ss.android.ugc.aweme.choosemusic.g;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "commercial_music_schema")

    /* renamed from: a  reason: collision with root package name */
    public final String f70537a;

    static {
        Covode.recordClassIndex(43501);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f70537a, ((b) obj).f70537a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f70537a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CommercialMusicPageInfo(commercialMusicSchema=" + this.f70537a + ")";
    }

    private b() {
        this.f70537a = null;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}

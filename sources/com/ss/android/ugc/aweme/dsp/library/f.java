package com.ss.android.ugc.aweme.dsp.library;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f83342a;

    static {
        Covode.recordClassIndex(51994);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && l.a(this.f83342a, ((f) obj).f83342a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f83342a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MusicLibraryCommonData(enterMethod=" + this.f83342a + ")";
    }

    private /* synthetic */ f() {
        this("homepage_music_tab");
    }

    public f(String str) {
        l.d(str, "");
        this.f83342a = str;
    }
}

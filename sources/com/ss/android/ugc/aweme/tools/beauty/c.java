package com.ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ComposerBeauty f138896a;

    /* renamed from: b  reason: collision with root package name */
    public final String f138897b;

    static {
        Covode.recordClassIndex(90825);
    }

    public final String toString() {
        return "ComposerBeautyDownload(beauty=" + this.f138896a + ", unzipPath=" + this.f138897b + ")";
    }

    public final int hashCode() {
        return this.f138897b.hashCode();
    }

    public /* synthetic */ c(ComposerBeauty composerBeauty) {
        this(composerBeauty, composerBeauty.getEffect().getUnzipPath());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return l.a((Object) ((c) obj).f138897b, (Object) this.f138897b);
        }
        return false;
    }

    private c(ComposerBeauty composerBeauty, String str) {
        l.d(composerBeauty, "");
        l.d(str, "");
        this.f138896a = composerBeauty;
        this.f138897b = str;
    }
}

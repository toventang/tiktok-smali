package com.ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.g.b;
import h.f.b.l;

public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    public final String f89445a;

    static {
        Covode.recordClassIndex(56207);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f89445a, ((i) obj).f89445a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f89445a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.service.g.b
    public final String toString() {
        return "StickerDownloadEventKey(resourceID=" + this.f89445a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super("aweme_im_sticker_download", str);
        l.d(str, "");
        this.f89445a = str;
    }
}

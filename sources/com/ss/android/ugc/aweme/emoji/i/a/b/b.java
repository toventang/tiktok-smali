package com.ss.android.ugc.aweme.emoji.i.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.im.service.g.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f89344a;

    static {
        Covode.recordClassIndex(56140);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f89344a, ((b) obj).f89344a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f89344a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.service.g.b
    public final String toString() {
        return "GeckoSmallEmojiLoadEventKey(text=" + this.f89344a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super("aweme_im_gecko_small_emoji_load", str);
        l.d(str, "");
        this.f89344a = str;
    }
}

package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.g.a;
import h.f.b.l;
import java.util.List;

final class JockerEmoji extends SayHelloContentEmoji {
    private final List<a> stickers;

    static {
        Covode.recordClassIndex(64049);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.JockerEmoji */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JockerEmoji copy$default(JockerEmoji jockerEmoji, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = jockerEmoji.getStickers();
        }
        return jockerEmoji.copy(list);
    }

    public final List<a> component1() {
        return getStickers();
    }

    public final JockerEmoji copy(List<? extends a> list) {
        l.d(list, "");
        return new JockerEmoji(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof JockerEmoji) && l.a(getStickers(), ((JockerEmoji) obj).getStickers());
        }
        return true;
    }

    public final int hashCode() {
        List<a> stickers2 = getStickers();
        if (stickers2 != null) {
            return stickers2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "JockerEmoji(stickers=" + getStickers() + ")";
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContentEmoji
    public final List<a> getStickers() {
        return this.stickers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.emoji.g.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JockerEmoji(List<? extends a> list) {
        super(null);
        l.d(list, "");
        this.stickers = list;
    }
}

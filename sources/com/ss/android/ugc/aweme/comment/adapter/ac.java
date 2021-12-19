package com.ss.android.ugc.aweme.comment.adapter;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import h.f.b.l;

public final class ac extends j.e<GifEmoji> {
    static {
        Covode.recordClassIndex(43917);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean b(GifEmoji gifEmoji, GifEmoji gifEmoji2) {
        l.d(gifEmoji, "");
        l.d(gifEmoji2, "");
        return l.a(gifEmoji, gifEmoji2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean a(GifEmoji gifEmoji, GifEmoji gifEmoji2) {
        GifEmoji gifEmoji3 = gifEmoji;
        GifEmoji gifEmoji4 = gifEmoji2;
        l.d(gifEmoji3, "");
        l.d(gifEmoji4, "");
        return l.a((Object) gifEmoji3.getId(), (Object) gifEmoji4.getId());
    }
}

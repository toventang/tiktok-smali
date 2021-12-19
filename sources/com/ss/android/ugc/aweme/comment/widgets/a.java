package com.ss.android.ugc.aweme.comment.widgets;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel;
import h.f.b.l;

public final class a implements ad.b {
    static {
        Covode.recordClassIndex(45024);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new GifEmojiListViewModel();
    }
}

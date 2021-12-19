package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.aweme.sticker.f;

public abstract class AbsInteractStickerWidget extends LifecycleOwnerWidget implements au, f {
    static {
        Covode.recordClassIndex(85660);
    }

    public abstract void a(Aweme aweme);

    public abstract void a(g gVar);

    public abstract InteractStickerViewModel e();

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }
}

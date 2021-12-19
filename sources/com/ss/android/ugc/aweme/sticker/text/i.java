package com.ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f135739a = new i();

    static {
        Covode.recordClassIndex(88729);
    }

    private i() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((StickerItemModel) obj).startTime - ((StickerItemModel) obj2).startTime;
    }
}

package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dr implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f126480a = new dr();

    static {
        Covode.recordClassIndex(82965);
    }

    private dr() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((InteractStickerStruct) obj).getIndex() - ((InteractStickerStruct) obj2).getIndex();
    }
}

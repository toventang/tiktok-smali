package com.ss.android.ugc.aweme.commerce_challenge_impl.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Comparator;

public final class d implements Comparator<TextExtraStruct> {
    static {
        Covode.recordClassIndex(45277);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(TextExtraStruct textExtraStruct, TextExtraStruct textExtraStruct2) {
        TextExtraStruct textExtraStruct3 = textExtraStruct;
        TextExtraStruct textExtraStruct4 = textExtraStruct2;
        if (textExtraStruct3 == null || textExtraStruct4 == null || textExtraStruct3.getStart() == textExtraStruct4.getStart()) {
            return 0;
        }
        if (textExtraStruct3.getStart() < textExtraStruct4.getStart()) {
            return -1;
        }
        return 1;
    }
}

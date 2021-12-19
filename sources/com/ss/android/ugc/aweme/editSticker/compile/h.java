package com.ss.android.ugc.aweme.editSticker.compile;

import com.bytedance.covode.number.Covode;
import java.io.File;

public final class h extends c {
    static {
        Covode.recordClassIndex(55393);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.editSticker.compile.c
    public final String a(String str, int i2) {
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        return str + "text_sticker_" + i2 + ".png";
    }
}

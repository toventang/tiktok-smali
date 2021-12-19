package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.compile.c;
import java.io.File;

public class b extends c {
    static {
        Covode.recordClassIndex(83427);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.compile.c
    public String a(String str, int i2) {
        StringBuilder append = new StringBuilder().append(str);
        String str2 = "interact_sticker.png";
        if (!str.endsWith(File.separator)) {
            str2 = File.separator + str2;
        }
        return append.append(str2).toString();
    }
}

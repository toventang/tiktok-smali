package com.ss.android.ugc.aweme.editSticker.compile;

import com.bytedance.covode.number.Covode;

public class b {
    public int index;
    public String stickerPath;
    public int viewHash;

    static {
        Covode.recordClassIndex(55387);
    }

    public b(b bVar) {
        this(bVar.stickerPath, bVar.index, bVar.viewHash);
    }

    public b(String str, int i2) {
        this(str, i2, 0);
    }

    public b(String str, int i2, int i3) {
        this.stickerPath = str;
        this.index = i2;
        this.viewHash = i3;
    }
}

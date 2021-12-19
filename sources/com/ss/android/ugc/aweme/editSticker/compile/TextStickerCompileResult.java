package com.ss.android.ugc.aweme.editSticker.compile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;

public class TextStickerCompileResult extends b {
    public TextStickerData textStickerData;

    static {
        Covode.recordClassIndex(55385);
    }

    public TextStickerCompileResult(TextStickerData textStickerData2, b bVar) {
        super(bVar);
        this.textStickerData = textStickerData2;
    }

    public TextStickerCompileResult(String str, int i2, int i3) {
        super(str, i2, i3);
    }

    public TextStickerCompileResult(String str, int i2, int i3, TextStickerData textStickerData2) {
        super(str, i2, i3);
        this.textStickerData = textStickerData2;
    }
}

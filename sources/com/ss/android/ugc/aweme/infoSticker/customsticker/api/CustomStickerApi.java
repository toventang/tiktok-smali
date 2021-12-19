package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.q;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.v;
import com.bytedance.retrofit2.mime.TypedFile;

public interface CustomStickerApi {
    static {
        Covode.recordClassIndex(67064);
    }

    @t(a = "/media/api/pic/iss")
    @q
    f.a.t<CutoutResponse> cutoutSticker(@v(a = "file") TypedFile typedFile);
}

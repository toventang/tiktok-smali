package com.ss.android.ugc.aweme.sticker;

import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.framework.services.IStickerService;

public interface IStickerViewService {

    public interface a {
        static {
            Covode.recordClassIndex(88025);
        }

        void a();

        void a(IStickerService.FaceSticker faceSticker);

        void a(String str);

        void b();

        void b(IStickerService.FaceSticker faceSticker);
    }

    static {
        Covode.recordClassIndex(88024);
    }

    void hideStickerView();

    boolean isShowStickerView();

    void setPixelLoopStickerPresenterSupplier(q<com.ss.android.ugc.aweme.sticker.n.a> qVar);

    void showStickerView(d dVar, i iVar, String str, FrameLayout frameLayout, a aVar);
}

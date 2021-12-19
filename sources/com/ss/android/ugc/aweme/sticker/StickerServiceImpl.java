package com.ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.favorites.ui.q;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.b;

public final class StickerServiceImpl implements IStickerService {
    static {
        Covode.recordClassIndex(88032);
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerService
    public final AbsInteractStickerWidget a() {
        return new InteractStickerWidget();
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerService
    public final a b() {
        return new q();
    }

    public static IStickerService c() {
        MethodCollector.i(3374);
        Object a2 = b.a(IStickerService.class, false);
        if (a2 != null) {
            IStickerService iStickerService = (IStickerService) a2;
            MethodCollector.o(3374);
            return iStickerService;
        }
        if (b.em == null) {
            synchronized (IStickerService.class) {
                try {
                    if (b.em == null) {
                        b.em = new StickerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3374);
                    throw th;
                }
            }
        }
        StickerServiceImpl stickerServiceImpl = (StickerServiceImpl) b.em;
        MethodCollector.o(3374);
        return stickerServiceImpl;
    }
}

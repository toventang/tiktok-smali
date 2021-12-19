package com.ss.android.ugc.aweme.servicimpl;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.IEmojiService;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class EmojiServiceImplDiff implements IEmojiService {
    static {
        Covode.recordClassIndex(79884);
    }

    public static IEmojiService a() {
        MethodCollector.i(9458);
        Object a2 = b.a(IEmojiService.class, false);
        if (a2 != null) {
            IEmojiService iEmojiService = (IEmojiService) a2;
            MethodCollector.o(9458);
            return iEmojiService;
        }
        if (b.dG == null) {
            synchronized (IEmojiService.class) {
                try {
                    if (b.dG == null) {
                        b.dG = new EmojiServiceImplDiff();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9458);
                    throw th;
                }
            }
        }
        EmojiServiceImplDiff emojiServiceImplDiff = (EmojiServiceImplDiff) b.dG;
        MethodCollector.o(9458);
        return emojiServiceImplDiff;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IEmojiService
    public final void a(TextView textView) {
        l.d(textView, "");
        com.ss.android.ugc.aweme.emoji.i.b.b.a(textView);
    }
}

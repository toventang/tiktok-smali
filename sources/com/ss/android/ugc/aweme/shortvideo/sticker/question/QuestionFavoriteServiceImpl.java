package com.ss.android.ugc.aweme.shortvideo.sticker.question;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.question.IQuestionFavoriteService;
import com.ss.android.ugc.b;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class QuestionFavoriteServiceImpl implements WeakHandler.IHandler, IQuestionFavoriteService {

    /* renamed from: a  reason: collision with root package name */
    private final int f130680a = 64;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Integer> f130681b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(85679);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public static IQuestionFavoriteService a() {
        MethodCollector.i(8099);
        Object a2 = b.a(IQuestionFavoriteService.class, false);
        if (a2 != null) {
            IQuestionFavoriteService iQuestionFavoriteService = (IQuestionFavoriteService) a2;
            MethodCollector.o(8099);
            return iQuestionFavoriteService;
        }
        if (b.ee == null) {
            synchronized (IQuestionFavoriteService.class) {
                try {
                    if (b.ee == null) {
                        b.ee = new QuestionFavoriteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8099);
                    throw th;
                }
            }
        }
        QuestionFavoriteServiceImpl questionFavoriteServiceImpl = (QuestionFavoriteServiceImpl) b.ee;
        MethodCollector.o(8099);
        return questionFavoriteServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.question.IQuestionFavoriteService
    public final void a(String str, int i2) {
        MethodCollector.i(8098);
        l.d(str, "");
        if (str.length() == 0) {
            MethodCollector.o(8098);
            return;
        }
        synchronized (this.f130681b) {
            try {
                if (this.f130681b.size() >= this.f130680a) {
                    this.f130681b.entrySet().remove((Map.Entry) n.c((Iterable) this.f130681b.entrySet()));
                }
                this.f130681b.put(str, Integer.valueOf(i2));
            } finally {
                MethodCollector.o(8098);
            }
        }
    }
}

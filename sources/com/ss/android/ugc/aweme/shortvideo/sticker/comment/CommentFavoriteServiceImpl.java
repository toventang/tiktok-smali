package com.ss.android.ugc.aweme.shortvideo.sticker.comment;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.comment.ICommentFavoriteService;
import com.ss.android.ugc.b;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class CommentFavoriteServiceImpl implements WeakHandler.IHandler, ICommentFavoriteService {

    /* renamed from: a  reason: collision with root package name */
    private final int f130236a = 64;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Integer> f130237b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(85432);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public static ICommentFavoriteService a() {
        MethodCollector.i(8382);
        Object a2 = b.a(ICommentFavoriteService.class, false);
        if (a2 != null) {
            ICommentFavoriteService iCommentFavoriteService = (ICommentFavoriteService) a2;
            MethodCollector.o(8382);
            return iCommentFavoriteService;
        }
        if (b.ed == null) {
            synchronized (ICommentFavoriteService.class) {
                try {
                    if (b.ed == null) {
                        b.ed = new CommentFavoriteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8382);
                    throw th;
                }
            }
        }
        CommentFavoriteServiceImpl commentFavoriteServiceImpl = (CommentFavoriteServiceImpl) b.ed;
        MethodCollector.o(8382);
        return commentFavoriteServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.comment.ICommentFavoriteService
    public final int a(String str) {
        boolean z;
        Integer num;
        MethodCollector.i(8261);
        l.d(str, "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = -1;
        if (z) {
            MethodCollector.o(8261);
            return -1;
        }
        synchronized (this.f130237b) {
            try {
                if (this.f130237b.containsKey(str) && (num = this.f130237b.get(str)) != null) {
                    i2 = num.intValue();
                }
            } finally {
                MethodCollector.o(8261);
            }
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.comment.ICommentFavoriteService
    public final void a(String str, int i2) {
        MethodCollector.i(8214);
        l.d(str, "");
        if (str.length() == 0) {
            MethodCollector.o(8214);
            return;
        }
        synchronized (this.f130237b) {
            try {
                if (this.f130237b.size() >= this.f130236a) {
                    this.f130237b.entrySet().remove((Map.Entry) n.c((Iterable) this.f130237b.entrySet()));
                }
                this.f130237b.put(str, Integer.valueOf(i2));
            } finally {
                MethodCollector.o(8214);
            }
        }
    }
}

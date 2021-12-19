package com.ss.android.ugc.aweme.internal;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.d.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.b;
import h.a.n;
import h.f.a.a;
import h.f.b.l;
import h.z;
import java.util.List;

public final class AVCommentServiceImpl implements IAVCommentService {
    static {
        Covode.recordClassIndex(67172);
    }

    public static IAVCommentService a() {
        MethodCollector.i(8833);
        Object a2 = b.a(IAVCommentService.class, false);
        if (a2 != null) {
            IAVCommentService iAVCommentService = (IAVCommentService) a2;
            MethodCollector.o(8833);
            return iAVCommentService;
        }
        if (b.bI == null) {
            synchronized (IAVCommentService.class) {
                try {
                    if (b.bI == null) {
                        b.bI = new AVCommentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8833);
                    throw th;
                }
            }
        }
        AVCommentServiceImpl aVCommentServiceImpl = (AVCommentServiceImpl) b.bI;
        MethodCollector.o(8833);
        return aVCommentServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCommentService
    public final boolean a(boolean z) {
        if (!z || !g.c()) {
            if (!z) {
                if (n.d(1, 3, 5).contains(Integer.valueOf(g.a()))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCommentService
    public final void a(e eVar, boolean z, a<z> aVar) {
        l.d(aVar, "");
        CommentServiceImpl.e().a(eVar, z, aVar);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCommentService
    public final void a(Context context, String str, Aweme aweme, int i2, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        l.d(context, "");
        l.d(str, "");
        l.d(onActivityResultCallback, "");
        CommentServiceImpl.e().a(context, str, aweme, i2, list, onActivityResultCallback);
    }
}

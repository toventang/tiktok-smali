package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class NoticeCommentHelperServiceImpl implements NoticeCommentHelperService {
    static {
        Covode.recordClassIndex(44858);
    }

    public static NoticeCommentHelperService a() {
        MethodCollector.i(36);
        Object a2 = b.a(NoticeCommentHelperService.class, false);
        if (a2 != null) {
            NoticeCommentHelperService noticeCommentHelperService = (NoticeCommentHelperService) a2;
            MethodCollector.o(36);
            return noticeCommentHelperService;
        }
        if (b.af == null) {
            synchronized (NoticeCommentHelperService.class) {
                try {
                    if (b.af == null) {
                        b.af = new NoticeCommentHelperServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(36);
                    throw th;
                }
            }
        }
        NoticeCommentHelperServiceImpl noticeCommentHelperServiceImpl = (NoticeCommentHelperServiceImpl) b.af;
        MethodCollector.o(36);
        return noticeCommentHelperServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService
    public final String a(Comment comment) {
        l.d(comment, "");
        return f.a(comment, false);
    }
}

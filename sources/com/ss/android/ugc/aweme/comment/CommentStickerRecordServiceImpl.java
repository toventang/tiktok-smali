package com.ss.android.ugc.aweme.comment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService;
import com.ss.android.ugc.aweme.comment.util.u;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class CommentStickerRecordServiceImpl implements ICommentStickerRecordService {
    static {
        Covode.recordClassIndex(43860);
    }

    public static ICommentStickerRecordService a() {
        MethodCollector.i(770);
        Object a2 = b.a(ICommentStickerRecordService.class, false);
        if (a2 != null) {
            ICommentStickerRecordService iCommentStickerRecordService = (ICommentStickerRecordService) a2;
            MethodCollector.o(770);
            return iCommentStickerRecordService;
        }
        if (b.ae == null) {
            synchronized (ICommentStickerRecordService.class) {
                try {
                    if (b.ae == null) {
                        b.ae = new CommentStickerRecordServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(770);
                    throw th;
                }
            }
        }
        CommentStickerRecordServiceImpl commentStickerRecordServiceImpl = (CommentStickerRecordServiceImpl) b.ae;
        MethodCollector.o(770);
        return commentStickerRecordServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService
    public final void a(Context context, CommentVideoModel commentVideoModel) {
        l.d(context, "");
        u.a(context, commentVideoModel);
    }
}

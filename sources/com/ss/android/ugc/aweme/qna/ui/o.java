package com.ss.android.ugc.aweme.qna.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.api.i;
import com.ss.android.ugc.aweme.qna.api.k;
import com.ss.android.ugc.aweme.qna.fragment.w;
import com.ss.android.ugc.aweme.question.c;
import h.f.b.l;
import java.util.List;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f119616a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(77712);
    }

    public static w a(i iVar, List<c> list) {
        l.d(list, "");
        if (iVar != null && iVar.f119252a != 0) {
            return w.FAILURE;
        }
        if (!list.isEmpty()) {
            return w.SUCCESS;
        }
        return w.SUCCESS_EMPTY;
    }

    public static w a(k kVar, List<c> list) {
        l.d(list, "");
        if (kVar != null && kVar.f119261a != 0) {
            return w.FAILURE;
        }
        if (!list.isEmpty()) {
            return w.SUCCESS;
        }
        return w.SUCCESS_EMPTY;
    }
}

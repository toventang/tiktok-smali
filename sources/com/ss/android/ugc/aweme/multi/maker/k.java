package com.ss.android.ugc.aweme.multi.maker;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class k extends j {

    /* renamed from: e  reason: collision with root package name */
    private String f110968e = "resso_exclusive";

    static {
        Covode.recordClassIndex(71203);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.j, com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.ANCHOR_RESSO_EXCLUSIVE.getTYPE();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.j
    public final boolean n() {
        List<AnchorCommonStruct> anchors;
        Aweme o = o();
        l.d(r(), "");
        T t = null;
        if (!(o == null || (anchors = o.getAnchors()) == null)) {
            Iterator<T> it = anchors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                if (t2.getType() == ab.ANCHOR_RESSO_EXCLUSIVE.getTYPE() && !TextUtils.isEmpty(t2.getKeyword()) && !TextUtils.isEmpty(t2.getSchema()) && !TextUtils.isEmpty(t2.getDeepLink()) && !TextUtils.isEmpty(t2.getUniversalLink())) {
                    t = next;
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                Integer.valueOf(t3.getType());
                t3.getKeyword();
                return true;
            }
        }
        return false;
    }
}

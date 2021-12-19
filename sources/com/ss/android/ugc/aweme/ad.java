package com.ss.android.ugc.aweme;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static final ad f65567a = new ad();

    private ad() {
    }

    static {
        Covode.recordClassIndex(40345);
    }

    public static AnchorCommonStruct a(Aweme aweme, Context context) {
        List<AnchorCommonStruct> anchors;
        l.d(context, "");
        T t = null;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<T> it = anchors.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t2 = next;
            if (t2.getType() == ab.ANCHOR_RESSO.getTYPE() && !TextUtils.isEmpty(t2.getKeyword()) && !TextUtils.isEmpty(t2.getSchema()) && !TextUtils.isEmpty(t2.getDeepLink()) && !TextUtils.isEmpty(t2.getUniversalLink())) {
                t = next;
                break;
            }
        }
        return t;
    }
}

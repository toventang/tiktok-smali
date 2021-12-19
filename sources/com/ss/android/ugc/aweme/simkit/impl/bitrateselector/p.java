package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.simapicommon.a.e;
import java.util.Comparator;

final /* synthetic */ class p implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f133567a = new p();

    static {
        Covode.recordClassIndex(87372);
    }

    private p() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((e) obj2).getBitRate() - ((e) obj).getBitRate();
    }
}

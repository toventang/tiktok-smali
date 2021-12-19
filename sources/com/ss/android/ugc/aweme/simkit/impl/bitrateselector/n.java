package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bitrateselector.a.a.c;
import java.util.Comparator;

final /* synthetic */ class n implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f133562a = new n();

    static {
        Covode.recordClassIndex(87370);
    }

    private n() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((c) obj2).a() - ((c) obj).a();
    }
}

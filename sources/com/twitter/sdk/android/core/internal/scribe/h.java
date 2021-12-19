package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.scribe.g;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f156082a = new h();

    static {
        Covode.recordClassIndex(103683);
    }

    private h() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (int) (((g.a) obj).f156081b - ((g.a) obj2).f156081b);
    }
}

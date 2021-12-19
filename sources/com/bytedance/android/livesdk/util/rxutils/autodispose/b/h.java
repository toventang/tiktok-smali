package com.bytedance.android.livesdk.util.rxutils.autodispose.b;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;

final /* synthetic */ class h implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f22147a = new h();

    static {
        Covode.recordClassIndex(13056);
    }

    private h() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }
}

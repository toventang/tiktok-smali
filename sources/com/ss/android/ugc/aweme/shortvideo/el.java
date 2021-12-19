package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class el implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f128436a = new el();

    static {
        Covode.recordClassIndex(84217);
    }

    private el() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((AVTextExtraStruct) obj2).getStart() - ((AVTextExtraStruct) obj).getStart();
    }
}

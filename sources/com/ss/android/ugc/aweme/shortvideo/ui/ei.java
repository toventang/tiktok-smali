package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ei implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f131718a = new ei();

    static {
        Covode.recordClassIndex(86265);
    }

    private ei() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((AVTextExtraStruct) obj).getStart(), ((AVTextExtraStruct) obj2).getStart());
    }
}

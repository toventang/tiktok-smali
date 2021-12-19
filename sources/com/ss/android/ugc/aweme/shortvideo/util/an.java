package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class an implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f132214a = new an();

    static {
        Covode.recordClassIndex(86592);
    }

    private an() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}

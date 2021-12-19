package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ao implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f132215a = new ao();

    static {
        Covode.recordClassIndex(86593);
    }

    private ao() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}

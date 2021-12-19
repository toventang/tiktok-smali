package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ca.a;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Runnable f92972a = new r();

    static {
        Covode.recordClassIndex(58985);
    }

    private r() {
    }

    public final void run() {
        if (!a.f69589b) {
            Iterator<T> it = a.f69588a.iterator();
            while (it.hasNext()) {
                a.b(it.next().intValue());
            }
            a.f69588a.clear();
            a.f69589b = true;
        }
    }
}

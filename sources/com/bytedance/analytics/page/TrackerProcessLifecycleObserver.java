package com.bytedance.analytics.page;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class TrackerProcessLifecycleObserver implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final TrackerProcessLifecycleObserver f6562a = new TrackerProcessLifecycleObserver();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6563b = true;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6564a;

        static {
            Covode.recordClassIndex(3158);
            int[] iArr = new int[i.a.values().length];
            iArr[i.a.ON_START.ordinal()] = 1;
            iArr[i.a.ON_STOP.ordinal()] = 2;
            f6564a = iArr;
        }
    }

    private TrackerProcessLifecycleObserver() {
    }

    static {
        Covode.recordClassIndex(3157);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (a.f6564a[aVar.ordinal()] == 1 && f6563b) {
            f6563b = false;
        }
    }
}

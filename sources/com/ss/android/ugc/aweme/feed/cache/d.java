package com.ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f92685a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f92686b;

    /* renamed from: c  reason: collision with root package name */
    public static WeakReference<b> f92687c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f92688d = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(58789);
    }

    public static void a() {
        b bVar;
        WeakReference<b> weakReference = f92687c;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            bVar.a();
        }
    }
}

package com.google.android.play.core.d;

import com.bytedance.covode.number.Covode;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Set f53215a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f53216b;

    static {
        Covode.recordClassIndex(32890);
    }

    p(a aVar, Set set) {
        this.f53216b = aVar;
        this.f53215a = set;
    }

    public final void run() {
        try {
            for (String str : this.f53215a) {
                this.f53216b.f53190b.e(str);
            }
        } catch (Exception unused) {
        }
    }
}

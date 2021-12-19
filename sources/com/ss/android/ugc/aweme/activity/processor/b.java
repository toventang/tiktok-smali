package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class b implements v {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<a> f65533a;

    static {
        Covode.recordClassIndex(40311);
    }

    private final a a() {
        a aVar;
        WeakReference<a> weakReference = this.f65533a;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            l.b(aVar, "");
            if (com.ss.android.ugc.aweme.activity.a.a(aVar)) {
                return aVar;
            }
        }
        return null;
    }

    public final void b(String str) {
        a a2 = a();
        if (a2 != null) {
            new com.bytedance.tux.g.b(a2).a(str).b();
        }
    }

    public final void a(String str) {
        a a2 = a();
        if (a2 != null) {
            new com.bytedance.tux.g.b(a2).a(str).b();
        }
    }

    @Override // com.bytedance.common.utility.f
    public final void showCustomLongToast(int i2, String str) {
        b(str);
    }

    @Override // com.bytedance.common.utility.f
    public final void showCustomToast(int i2, String str, int i3, int i4) {
        b(str);
    }
}

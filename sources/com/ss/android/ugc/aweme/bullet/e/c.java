package com.ss.android.ugc.aweme.bullet.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final BulletContainerView f69288a;

    /* renamed from: b  reason: collision with root package name */
    public final b f69289b;

    static {
        Covode.recordClassIndex(42722);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f69288a, cVar.f69288a) && l.a(this.f69289b, cVar.f69289b);
    }

    public final int hashCode() {
        BulletContainerView bulletContainerView = this.f69288a;
        int i2 = 0;
        int hashCode = (bulletContainerView != null ? bulletContainerView.hashCode() : 0) * 31;
        b bVar = this.f69289b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BulletViewCache(bulletView=" + this.f69288a + ", factory=" + this.f69289b + ")";
    }

    public c(BulletContainerView bulletContainerView, b bVar) {
        l.d(bulletContainerView, "");
        l.d(bVar, "");
        this.f69288a = bulletContainerView;
        this.f69289b = bVar;
    }
}

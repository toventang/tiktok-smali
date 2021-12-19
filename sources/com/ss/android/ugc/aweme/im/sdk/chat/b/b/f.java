package com.ss.android.ugc.aweme.im.sdk.chat.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.facebook.d.b;
import com.facebook.d.c;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<ai> f100135a;

    /* renamed from: b  reason: collision with root package name */
    public final List<h> f100136b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f100137c;

    /* renamed from: d  reason: collision with root package name */
    public final int f100138d;

    static {
        Covode.recordClassIndex(63827);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f100135a, fVar.f100135a) && l.a(this.f100136b, fVar.f100136b) && this.f100137c == fVar.f100137c && this.f100138d == fVar.f100138d;
    }

    public final int hashCode() {
        WeakReference<ai> weakReference = this.f100135a;
        int i2 = 0;
        int hashCode = (weakReference != null ? weakReference.hashCode() : 0) * 31;
        List<h> list = this.f100136b;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f100137c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return ((i3 + i4) * 31) + this.f100138d;
    }

    public final String toString() {
        return "PreloadMedia(msg=" + this.f100135a + ", urls=" + this.f100136b + ", isAnimate=" + this.f100137c + ", priority=" + this.f100138d + ")";
    }

    public static final class a extends b<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f100139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f100140b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f100141c;

        static {
            Covode.recordClassIndex(63828);
        }

        @Override // com.facebook.d.b
        public final void onFailureImpl(c<Void> cVar) {
            e eVar = this.f100141c;
            if (eVar != null) {
                eVar.a(this.f100139a);
            }
        }

        @Override // com.facebook.d.b
        public final void onNewResultImpl(c<Void> cVar) {
            e eVar = this.f100141c;
            if (eVar != null) {
                eVar.a(this.f100139a);
            }
        }

        a(h hVar, f fVar, e eVar) {
            this.f100139a = hVar;
            this.f100140b = fVar;
            this.f100141c = eVar;
        }
    }

    private f(WeakReference<ai> weakReference, List<h> list, boolean z) {
        l.d(weakReference, "");
        l.d(list, "");
        this.f100135a = weakReference;
        this.f100136b = list;
        this.f100137c = z;
        this.f100138d = 0;
    }

    public /* synthetic */ f(WeakReference weakReference, List list, boolean z, byte b2) {
        this(weakReference, list, z);
    }
}

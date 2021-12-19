package com.ss.android.ugc.aweme.recommend;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<? extends Activity> f120099a;

    /* renamed from: b  reason: collision with root package name */
    public final String f120100b;

    /* renamed from: c  reason: collision with root package name */
    public final String f120101c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f120102d;

    static {
        Covode.recordClassIndex(78060);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f120099a, mVar.f120099a) && l.a(this.f120100b, mVar.f120100b) && l.a(this.f120101c, mVar.f120101c) && this.f120102d == mVar.f120102d;
    }

    public final int hashCode() {
        WeakReference<? extends Activity> weakReference = this.f120099a;
        int i2 = 0;
        int hashCode = (weakReference != null ? weakReference.hashCode() : 0) * 31;
        String str = this.f120100b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f120101c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f120102d;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "RecommendUserDialogParams(activityRef=" + this.f120099a + ", enterFrom=" + this.f120100b + ", previousPage=" + this.f120101c + ", isColdBoot=" + this.f120102d + ")";
    }

    private m(WeakReference<? extends Activity> weakReference, String str, String str2) {
        l.d(weakReference, "");
        this.f120099a = weakReference;
        this.f120100b = str;
        this.f120101c = str2;
        this.f120102d = false;
    }

    public /* synthetic */ m(WeakReference weakReference, String str, String str2, byte b2) {
        this(weakReference, str, str2);
    }
}

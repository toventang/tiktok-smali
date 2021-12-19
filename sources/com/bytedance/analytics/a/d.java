package com.bytedance.analytics.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class d implements Serializable, Cloneable {
    public static final a Companion = new a((byte) 0);
    private static final long serialVersionUID = 1;
    private final e provider;
    private final WeakReference<View> viewRef;

    static {
        Covode.recordClassIndex(3143);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3144);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private a() {
        }
    }

    public final WeakReference<View> getViewRef() {
        return this.viewRef;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final String getEventName() {
        return this.provider.a();
    }

    public final int getExposePeriodSpecification() {
        return this.provider.f6544f;
    }

    public final boolean getRepeatedInsidePage() {
        return this.provider.f6541c;
    }

    public final boolean getRepeatedWhenBack() {
        return this.provider.f6542d;
    }

    public final float getVisiblePercent() {
        return this.provider.f6543e;
    }

    public final int hashCode() {
        return this.viewRef.hashCode();
    }

    public final Map<String, String> getParams() {
        HashMap<String, String> b2 = this.provider.b();
        if (b2 == null) {
            return new HashMap();
        }
        return b2;
    }

    public final String getBTM_CD() {
        return new StringBuilder().append((Object) this.provider.f6539a).append('.').append((Object) this.provider.f6540b).toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d) || getViewRef().get() != ((d) obj).getViewRef().get()) {
            return false;
        }
        return true;
    }

    public d(WeakReference<View> weakReference, e eVar) {
        l.d(weakReference, "");
        l.d(eVar, "");
        this.viewRef = weakReference;
        this.provider = eVar;
    }
}

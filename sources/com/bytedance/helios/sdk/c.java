package com.bytedance.helios.sdk;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f30800a;

    /* renamed from: b  reason: collision with root package name */
    public i.a f30801b;

    /* renamed from: c  reason: collision with root package name */
    public String f30802c;

    /* renamed from: d  reason: collision with root package name */
    public int f30803d;

    static {
        Covode.recordClassIndex(17895);
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.f30800a + '/' + this.f30801b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!TextUtils.equals(this.f30800a, cVar.f30800a) || this.f30801b != cVar.f30801b) {
            return false;
        }
        return true;
    }

    public c(Activity activity, i.a aVar) {
        l.c(activity, "");
        l.c(aVar, "");
        this.f30800a = activity.toString();
        this.f30801b = aVar;
        String name = activity.getClass().getName();
        l.a((Object) name, "");
        this.f30802c = name;
        this.f30803d = activity.hashCode();
    }
}

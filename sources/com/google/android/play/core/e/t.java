package com.google.android.play.core.e;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.aq;
import com.google.android.play.core.b.au;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.l;
import com.google.android.play.core.d.q;
import com.google.android.play.core.tasks.d;
import com.google.android.play.core.tasks.f;
import com.google.android.play.core.tasks.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    static final b f53342a = new b("SplitInstallService");

    /* renamed from: d  reason: collision with root package name */
    private static final Intent f53343d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: b  reason: collision with root package name */
    final String f53344b;

    /* renamed from: c  reason: collision with root package name */
    l<aq> f53345c;

    static {
        Covode.recordClassIndex(32948);
    }

    public t(Context context) {
        this.f53344b = context.getPackageName();
        if (au.a(context)) {
            this.f53345c = new l<>(q.a(context), f53342a, "SplitInstallService", f53343d, l.f53329a);
        }
    }

    static /* synthetic */ Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10803);
        return bundle;
    }

    static /* synthetic */ ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("language", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static <T> d<T> b() {
        f53342a.b("onError(%d)", -14);
        return f.a((Exception) new a(-14));
    }

    public final d<f> a(int i2) {
        if (this.f53345c == null) {
            return b();
        }
        f53342a.d("getSessionState(%d)", Integer.valueOf(i2));
        m mVar = new m();
        this.f53345c.a(new n(this, mVar, i2, mVar));
        return mVar.f53383a;
    }

    public final d<Integer> a(Collection<String> collection, Collection<String> collection2) {
        if (this.f53345c == null) {
            return b();
        }
        f53342a.d("startInstall(%s,%s)", collection, collection2);
        m mVar = new m();
        this.f53345c.a(new m(this, mVar, collection, collection2, mVar));
        return mVar.f53383a;
    }

    public final d<Void> b(int i2) {
        if (this.f53345c == null) {
            return b();
        }
        f53342a.d("cancelInstall(%d)", Integer.valueOf(i2));
        m mVar = new m();
        this.f53345c.a(new o(this, mVar, i2, mVar));
        return mVar.f53383a;
    }
}

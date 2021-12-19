package com.facebook.internal;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.facebook.m;
import java.util.Iterator;
import java.util.List;

public abstract class j<CONTENT, RESULT> {

    /* renamed from: a  reason: collision with root package name */
    protected static final Object f48605a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int f48606b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f48607c;

    /* renamed from: d  reason: collision with root package name */
    private final s f48608d = null;

    /* renamed from: e  reason: collision with root package name */
    private List<j<CONTENT, RESULT>.a> f48609e;

    /* access modifiers changed from: protected */
    public abstract List<j<CONTENT, RESULT>.a> b();

    /* access modifiers changed from: protected */
    public abstract a c();

    public abstract class a {
        static {
            Covode.recordClassIndex(29321);
        }

        public abstract a a(CONTENT content);

        public abstract boolean a(CONTENT content, boolean z);

        public Object a() {
            return j.f48605a;
        }

        public a() {
        }
    }

    static {
        Covode.recordClassIndex(29320);
    }

    private List<j<CONTENT, RESULT>.a> d() {
        if (this.f48609e == null) {
            this.f48609e = b();
        }
        return this.f48609e;
    }

    public final Activity a() {
        Activity activity = this.f48607c;
        if (activity != null) {
            return activity;
        }
        s sVar = this.f48608d;
        if (sVar != null) {
            return sVar.a();
        }
        return null;
    }

    public final boolean a(CONTENT content) {
        boolean z;
        Object obj = f48605a;
        if (obj == obj) {
            z = true;
        } else {
            z = false;
        }
        for (j<CONTENT, RESULT>.a aVar : d()) {
            if ((z || ad.a(aVar.a(), obj)) && aVar.a(content, false)) {
                return true;
            }
        }
        return false;
    }

    public final void b(CONTENT content) {
        a a2 = a(content, f48605a);
        if (a2 != null) {
            s sVar = this.f48608d;
            if (sVar != null) {
                sVar.a(a2.a(), a2.c());
                a2.d();
                return;
            }
            this.f48607c.startActivityForResult(a2.a(), a2.c());
            a2.d();
        } else if (m.f48919e) {
            throw new IllegalStateException("No code path should ever result in a null appCall");
        }
    }

    public j(Activity activity, int i2) {
        ae.a((Object) activity, "activity");
        this.f48607c = activity;
        this.f48606b = i2;
    }

    private a a(CONTENT content, Object obj) {
        boolean z;
        a aVar;
        if (obj == f48605a) {
            z = true;
        } else {
            z = false;
        }
        Iterator<j<CONTENT, RESULT>.a> it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            j<CONTENT, RESULT>.a next = it.next();
            if ((z || ad.a(next.a(), obj)) && next.a(content, true)) {
                try {
                    aVar = next.a(content);
                } catch (com.facebook.j e2) {
                    aVar = c();
                    i.a(aVar, e2);
                }
                if (aVar != null) {
                    return aVar;
                }
            }
        }
        a c2 = c();
        i.a(c2, new com.facebook.j("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        return c2;
    }
}

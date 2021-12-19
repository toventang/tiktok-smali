package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.a.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f115648a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Activity> f115649b;

    /* renamed from: c  reason: collision with root package name */
    public int f115650c;

    /* renamed from: d  reason: collision with root package name */
    public int f115651d;

    /* renamed from: e  reason: collision with root package name */
    public int f115652e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f115653f;

    /* renamed from: g  reason: collision with root package name */
    private final List<Object> f115654g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Object> f115655h;

    static {
        Covode.recordClassIndex(74595);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f115657a = new k((byte) 0);

        static {
            Covode.recordClassIndex(74597);
        }
    }

    public final void a() {
        if (!this.f115653f) {
            throw new IllegalStateException("call this method after CreativeActivityMonitor is inited!");
        }
    }

    public final void b() {
        Iterator<Object> it = this.f115655h.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private k() {
        this.f115649b = Collections.newSetFromMap(new WeakHashMap());
        this.f115654g = new ArrayList();
        this.f115655h = new ArrayList();
        this.f115650c = 2;
        this.f115651d = 0;
        this.f115652e = 0;
        this.f115653f = false;
    }

    /* synthetic */ k(byte b2) {
        this();
    }

    public final void a(int i2) {
        this.f115650c = i2;
        Iterator<Object> it = this.f115654g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static boolean a(Activity activity) {
        if (TextUtils.equals(activity.getClass().getSimpleName(), "LiveBgBroadcastActivity") || TextUtils.equals(activity.getClass().getSimpleName(), "LiveBroadcastActivity")) {
            return true;
        }
        return false;
    }

    public final boolean a(l<Activity> lVar) {
        a();
        for (Activity activity : this.f115649b) {
            if (lVar.a(activity)) {
                return true;
            }
        }
        return false;
    }
}

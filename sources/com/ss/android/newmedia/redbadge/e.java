package com.ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.redbadge.a.a;
import com.ss.android.newmedia.redbadge.a.b;
import com.ss.android.newmedia.redbadge.a.c;
import com.ss.android.newmedia.redbadge.a.d;
import com.ss.android.newmedia.redbadge.a.f;
import com.ss.android.newmedia.redbadge.a.g;
import com.ss.android.newmedia.redbadge.a.h;
import com.ss.android.newmedia.redbadge.a.i;
import com.ss.android.newmedia.redbadge.a.j;
import com.ss.android.newmedia.redbadge.a.k;
import com.ss.android.newmedia.redbadge.a.l;
import com.ss.android.newmedia.redbadge.a.m;
import com.ss.android.newmedia.redbadge.a.n;
import com.ss.android.newmedia.redbadge.a.o;
import com.ss.android.newmedia.redbadge.a.p;
import com.ss.android.newmedia.redbadge.a.q;
import com.ss.android.newmedia.redbadge.a.r;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Class<? extends a>> f60038a;

    /* renamed from: d  reason: collision with root package name */
    private static volatile e f60039d;

    /* renamed from: b  reason: collision with root package name */
    private a f60040b;

    /* renamed from: c  reason: collision with root package name */
    private ComponentName f60041c;

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            MethodCollector.i(220);
            if (f60039d == null) {
                synchronized (e.class) {
                    try {
                        if (f60039d == null) {
                            f60039d = new e();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(220);
                        throw th;
                    }
                }
            }
            eVar = f60039d;
            MethodCollector.o(220);
        }
        return eVar;
    }

    static {
        Covode.recordClassIndex(37108);
        LinkedList linkedList = new LinkedList();
        f60038a = linkedList;
        linkedList.add(a.class);
        linkedList.add(b.class);
        linkedList.add(h.class);
        linkedList.add(i.class);
        linkedList.add(m.class);
        linkedList.add(p.class);
        linkedList.add(c.class);
        linkedList.add(f.class);
        linkedList.add(j.class);
        linkedList.add(n.class);
        linkedList.add(q.class);
        linkedList.add(r.class);
        linkedList.add(k.class);
        linkedList.add(com.ss.android.newmedia.redbadge.a.e.class);
        linkedList.add(l.class);
        linkedList.add(g.class);
        linkedList.add(o.class);
    }

    private boolean a(Context context) {
        a aVar;
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return false;
            }
            this.f60041c = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (!(resolveActivity == null || resolveActivity.activityInfo == null || TextUtils.isEmpty(resolveActivity.activityInfo.name))) {
                if (!resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
                    String str = resolveActivity.activityInfo.packageName;
                    Iterator<Class<? extends a>> it = f60038a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        try {
                            aVar = (a) it.next().newInstance();
                        } catch (Throwable unused) {
                        }
                        if (aVar != null && aVar.a().contains(str)) {
                            this.f60040b = aVar;
                            z = true;
                            break;
                        }
                    }
                    if (this.f60040b == null) {
                        if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                            this.f60040b = new j();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("VIVO")) {
                            this.f60040b = new n();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                            this.f60040b = new p();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
                            this.f60040b = new r();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZTE")) {
                            this.f60040b = new q();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("SONY")) {
                            this.f60040b = new m();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
                            this.f60040b = new k();
                            return true;
                        } else {
                            this.f60040b = new d();
                            return true;
                        }
                    }
                    return z;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final boolean a(Context context, int i2) {
        try {
            b(context, i2);
            return true;
        } catch (d unused) {
            Logger.debug();
            return false;
        }
    }

    public final void b(Context context, int i2) {
        if (this.f60040b != null || a(context)) {
            try {
                this.f60040b.a(context, this.f60041c, i2);
            } catch (Exception e2) {
                throw new d("Unable to execute badge", e2);
            }
        } else {
            throw new d("No default launcher available");
        }
    }
}

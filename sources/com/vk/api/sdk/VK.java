package com.vk.api.sdk;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.vk.api.sdk.a.a;
import com.vk.api.sdk.a.c;
import com.vk.api.sdk.c.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class VK {

    /* renamed from: a  reason: collision with root package name */
    public static b f156195a;

    /* renamed from: b  reason: collision with root package name */
    public static d f156196b;

    /* renamed from: c  reason: collision with root package name */
    public static c f156197c;

    /* renamed from: d  reason: collision with root package name */
    static final ArrayList<Object> f156198d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public static final VK f156199e = new VK();

    /* renamed from: f  reason: collision with root package name */
    private static int f156200f;

    private VK() {
    }

    public static final boolean a() {
        c cVar = f156197c;
        if (cVar == null) {
            l.a("authManager");
        }
        return cVar.a();
    }

    public static void b() {
        a(new com.vk.api.sdk.e.a("stats.trackVisitor"));
    }

    static {
        Covode.recordClassIndex(103742);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.vk.api.sdk.internal.a f156201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f156202b = null;

        static {
            Covode.recordClassIndex(103743);
        }

        a(com.vk.api.sdk.internal.a aVar) {
            this.f156201a = aVar;
        }

        public final void run() {
            try {
                com.vk.api.sdk.internal.a aVar = this.f156201a;
                l.c(aVar, "");
                d dVar = VK.f156196b;
                if (dVar == null) {
                    l.a("apiManager");
                }
                final Object a2 = aVar.a(dVar);
                l.a(new Runnable(this) {
                    /* class com.vk.api.sdk.VK.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f156203a;

                    static {
                        Covode.recordClassIndex(103744);
                    }

                    {
                        this.f156203a = r1;
                    }

                    public final void run() {
                    }
                });
            } catch (Exception e2) {
                l.a(new Runnable(this) {
                    /* class com.vk.api.sdk.VK.a.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f156205a;

                    static {
                        Covode.recordClassIndex(103745);
                    }

                    {
                        this.f156205a = r1;
                    }

                    public final void run() {
                        Exception exc = e2;
                        if ((exc instanceof b) && ((b) exc).isInvalidCredentialsError()) {
                            c cVar = VK.f156197c;
                            if (cVar == null) {
                                l.a("authManager");
                            }
                            a.C4121a.a(cVar.f156220a);
                            Iterator<T> it = VK.f156198d.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                    }
                });
            }
        }
    }

    public static final void a(Context context) {
        l.c(context, "");
        a(new b(context, b(context), new g(context)));
        if (a()) {
            b();
        }
    }

    private static void a(b bVar) {
        l.c(bVar, "");
        f156195a = bVar;
        f156196b = new d(bVar);
        c cVar = new c(bVar.q);
        f156197c = cVar;
        com.vk.api.sdk.a.a b2 = a.C4121a.b(cVar.f156220a);
        if (b2 != null) {
            d dVar = f156196b;
            if (dVar == null) {
                l.a("apiManager");
            }
            dVar.a(b2.f156210b, b2.f156211c);
        }
    }

    public static final int b(Context context) {
        int i2;
        l.c(context, "");
        int i3 = f156200f;
        if (i3 != 0) {
            return i3;
        }
        try {
            i2 = a(context.getResources(), context.getResources().getIdentifier("com_vk_sdk_AppId", "integer", context.getPackageName()));
        } catch (Exception unused) {
            i2 = 0;
        }
        f156200f = i2;
        if (i2 != 0) {
            return i2;
        }
        throw new RuntimeException("<integer name=\"com_vk_sdk_AppId\">your_app_id</integer> is not found in your resources.xml");
    }

    private static /* synthetic */ void a(com.vk.api.sdk.internal.a aVar) {
        l.c(aVar, "");
        l.a().submit(new a(aVar));
    }

    private static int a(Resources resources, int i2) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i2);
        if (matchConfig == null) {
            return resources.getInteger(i2);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i2);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i3 = 0; i3 < min; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i2);
        }
    }
}

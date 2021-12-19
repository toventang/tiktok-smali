package com.bytedance.push.third;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.third.a.b;
import com.bytedance.push.third.a.c;
import com.ss.android.message.a;
import java.util.Set;
import org.json.JSONArray;

public class f extends a {

    /* renamed from: c  reason: collision with root package name */
    private static f f42363c;

    static {
        Covode.recordClassIndex(25880);
    }

    @Override // com.bytedance.push.third.a
    public final /* bridge */ /* synthetic */ Set b() {
        return super.b();
    }

    @Override // com.bytedance.push.third.a
    public final /* bridge */ /* synthetic */ JSONArray c() {
        return super.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.push.third.a
    public final void a() {
        if (this.f42353a.size() == 0) {
            this.f42353a.put(5, new e(5, "com.fcm.FcmPushAdapter", "fcm", new c(a.f59817a)));
            this.f42353a.put(2, new e(2, "com.bytedance.push.self.SelfPushAdapter", "SelfPush", new com.bytedance.push.third.a.a(a.f59817a)));
            this.f42353a.put(14, new e(14, "com.adm.push.AdmPushAdapter", "amazon", new com.bytedance.push.third.a.a(a.f59817a)));
            this.f42353a.put(15, new e(15, "com.bytedance.push.frontier.FrontierPushAdapter", "frontierPush", new b()));
        }
    }

    @Override // com.bytedance.push.third.a
    public final /* bridge */ /* synthetic */ int a(String str) {
        return super.a(str);
    }

    @Override // com.bytedance.push.third.a
    public final /* bridge */ /* synthetic */ String d(int i2) {
        return super.d(i2);
    }

    @Override // com.bytedance.push.third.a
    public final /* bridge */ /* synthetic */ b a(int i2) {
        return super.a(i2);
    }

    @Override // com.bytedance.push.third.a
    public final /* bridge */ /* synthetic */ boolean b(int i2) {
        return super.b(i2);
    }

    private f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        a.a((Application) applicationContext);
    }

    @Override // com.bytedance.push.third.a
    public final /* bridge */ /* synthetic */ boolean b(String str) {
        return super.b(str);
    }

    public static f a(Context context) {
        MethodCollector.i(6422);
        if (f42363c == null) {
            synchronized (f.class) {
                try {
                    if (f42363c == null) {
                        f42363c = new f(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6422);
                    throw th;
                }
            }
        }
        f fVar = f42363c;
        MethodCollector.o(6422);
        return fVar;
    }
}

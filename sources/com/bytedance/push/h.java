package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.c.g;
import com.bytedance.push.c.i;
import com.bytedance.push.c.l;
import com.bytedance.push.i.b;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.d;
import com.ss.android.message.a.a;

public final class h implements l {

    /* renamed from: b  reason: collision with root package name */
    private final i f42180b;

    /* renamed from: c  reason: collision with root package name */
    private final g f42181c;

    /* renamed from: d  reason: collision with root package name */
    private final c f42182d;

    static {
        Covode.recordClassIndex(25778);
    }

    @Override // com.bytedance.push.c.l
    public final String a() {
        c cVar = this.f42182d;
        if (cVar == null || TextUtils.isEmpty(cVar.v)) {
            return "payload";
        }
        return this.f42182d.v;
    }

    @Override // com.bytedance.push.c.l
    public final void a(Context context, d dVar) {
        e.a(new b(context, dVar));
    }

    h(i iVar, g gVar, c cVar) {
        this.f42180b = iVar;
        this.f42181c = gVar;
        this.f42182d = cVar;
    }

    @Override // com.bytedance.push.c.l
    public final void a(Context context, final int i2, final String str) {
        if (a.a(context)) {
            f.b().a(context, new d() {
                /* class com.bytedance.push.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25779);
                }

                @Override // com.bytedance.push.third.d
                public final String a() {
                    return str;
                }

                @Override // com.bytedance.push.third.d
                public final int b() {
                    return i2;
                }
            });
        }
        if (((PushOnlineSettings) com.bytedance.push.settings.h.a(com.ss.android.message.a.f59817a, PushOnlineSettings.class)).i() <= 0) {
            Application application = com.ss.android.message.a.f59817a;
            com.ss.android.pushmanager.setting.b.b();
            String b2 = com.ss.android.pushmanager.setting.a.a().b();
            if (!TextUtils.isEmpty(b2)) {
                i iVar = this.f42180b;
                Context applicationContext = application.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                iVar.a(applicationContext, b2, i2);
            }
        }
    }
}

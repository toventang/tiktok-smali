package com.bytedance.android.livesdk.aj;

import android.content.Context;
import com.bytedance.android.live.i.a.a;
import com.bytedance.android.live.i.b.b;
import com.bytedance.android.livesdk.ab.h;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.f.b;
import java.lang.ref.WeakReference;

public final class a implements com.bytedance.android.live.i.a.a {

    /* renamed from: a  reason: collision with root package name */
    static String f13795a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<a.AbstractC0152a> f13796b;

    static {
        Covode.recordClassIndex(7671);
    }

    @Override // com.bytedance.android.live.i.a.a
    public final String a() {
        String str = f13795a;
        if (str != null) {
            return str;
        }
        Context context = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context();
        if (context != null) {
            f13795a = b.a(context, b.f33816b).a("hardware_info_cpu_soc", (String) null);
        }
        return f13795a;
    }

    /* renamed from: com.bytedance.android.livesdk.aj.a$a  reason: collision with other inner class name */
    public static final class C0290a implements b.AbstractC0153b<com.bytedance.android.live.i.a.a> {
        static {
            Covode.recordClassIndex(7672);
        }

        @Override // com.bytedance.android.live.i.b.b.AbstractC0153b
        public final b.AbstractC0153b.a<com.bytedance.android.live.i.a.a> a(b.AbstractC0153b.a<com.bytedance.android.live.i.a.a> aVar) {
            aVar.f9912a = (R) new a();
            aVar.f9913b = true;
            return aVar;
        }
    }

    @Override // com.bytedance.android.live.i.a.a
    public final void a(a.AbstractC0152a aVar) {
        this.f13796b = new WeakReference<>(aVar);
        h.a().a(new b(this));
    }
}

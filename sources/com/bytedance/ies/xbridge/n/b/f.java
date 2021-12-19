package com.bytedance.ies.xbridge.n.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n.a.f;
import com.bytedance.ies.xbridge.n.c.a.a;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class f extends com.bytedance.ies.xbridge.n.a.f {
    static {
        Covode.recordClassIndex(21764);
    }

    @Override // com.bytedance.ies.xbridge.n.a.f
    public final void a(com.bytedance.ies.xbridge.n.d.f fVar, f.a aVar, e eVar) {
        IHostStyleUIDepend iHostStyleUIDepend;
        b bVar;
        l.c(fVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a("context not provided in host");
            return;
        }
        String str = fVar.f36355a;
        if (str == null) {
            l.a("message");
        }
        String str2 = fVar.f36356b;
        if (str2 == null) {
            l.a(StringSet.type);
        }
        ToastBuilder toastBuilder = new ToastBuilder(context, str, str2, fVar.f36357c);
        b bVar2 = (b) a(b.class);
        Boolean bool = null;
        if (!((bVar2 == null || (iHostStyleUIDepend = bVar2.f35877f) == null) && ((bVar = b.f35870l) == null || (iHostStyleUIDepend = bVar.f35877f) == null))) {
            bool = iHostStyleUIDepend.showToast(toastBuilder);
        }
        if (true ^ l.a((Object) bool, (Object) true)) {
            new a().showToast(toastBuilder);
        }
        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
    }
}

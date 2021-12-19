package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.n;
import com.bytedance.ies.web.jsbridge2.x;

final /* synthetic */ class ah implements n.a.AbstractC0809a {

    /* renamed from: a  reason: collision with root package name */
    private final ae f35611a;

    /* renamed from: b  reason: collision with root package name */
    private final x.b f35612b;

    static {
        Covode.recordClassIndex(21274);
    }

    ah(ae aeVar, x.b bVar) {
        this.f35611a = aeVar;
        this.f35612b = bVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.n.a.AbstractC0809a
    public final void a(String str) {
        ae aeVar = this.f35611a;
        x.b bVar = this.f35612b;
        if (TextUtils.isEmpty(str)) {
            str = aeVar.f35593b.c();
            ae.a(str, TimeLineEvent.b.I, (String) null);
        } else {
            ae.a(str, TimeLineEvent.b.J, (String) null);
        }
        aeVar.a(true, str, bVar);
    }
}

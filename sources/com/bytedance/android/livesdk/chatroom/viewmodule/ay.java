package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.chatroom.c.aj;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.c;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ay implements f {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16477a;

    /* renamed from: b  reason: collision with root package name */
    private final aj f16478b;

    static {
        Covode.recordClassIndex(9115);
    }

    ay(DecorationWrapperWidget decorationWrapperWidget, aj ajVar) {
        this.f16477a = decorationWrapperWidget;
        this.f16478b = ajVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar;
        DecorationWrapperWidget decorationWrapperWidget = this.f16477a;
        d dVar = (d) obj;
        String str = this.f16478b.f15095a;
        String str2 = (dVar == null || (cVar = (c) dVar.data) == null || TextUtils.isEmpty(cVar.f23108a)) ? "" : cVar.f23108a;
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        String encodedQuery = parse.getEncodedQuery();
        if (TextUtils.isEmpty(encodedQuery)) {
            buildUpon.encodedQuery(str2);
        } else {
            buildUpon.encodedQuery(encodedQuery + "&" + str2);
        }
        buildUpon.appendQueryParameter("ttScenario", "streaming");
        Context context = decorationWrapperWidget.getContext();
        d.b a2 = e.a(buildUpon.build().toString()).a(0, 0, 0, 0);
        a2.f14310k = -1;
        double b2 = (double) y.b();
        Double.isNaN(b2);
        a2.f14302c = (int) y.e((int) (b2 * 0.7d));
        a2.f14301b = (int) y.e(y.c());
        a2.f14309j = 80;
        a a3 = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a(a2, new com.bytedance.android.livesdk.chatroom.a(a2.f14300a, null, ba.f16481a));
        androidx.fragment.app.e a4 = p.a(context);
        if (a3 != null && a4 != null) {
            a.a(a4, a3);
        }
    }
}

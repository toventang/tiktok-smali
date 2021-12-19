package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.DialogInterface;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements LiveDialog.b {

    /* renamed from: a  reason: collision with root package name */
    private final v f22688a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22689b;

    static {
        Covode.recordClassIndex(13385);
    }

    ab(v vVar, String str) {
        this.f22688a = vVar;
        this.f22689b = str;
    }

    @Override // com.bytedance.android.live.design.app.LiveDialog.b
    public final void a(DialogInterface dialogInterface) {
        v vVar = this.f22688a;
        String str = this.f22689b;
        ((IActionHandlerService) a.a(IActionHandlerService.class)).handle(vVar.f22799a, "aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2ffe_tiktok_common%2ffaq%2ffeedback%2f%3Fhide_nav_bar%3D1%26feedback_id%3D15889&hide_nav_bar=1");
        com.bytedance.android.livesdk.service.c.e.a.a(str, "contact_us");
    }
}

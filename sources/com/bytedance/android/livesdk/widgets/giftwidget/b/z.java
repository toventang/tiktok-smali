package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f22810a;

    static {
        Covode.recordClassIndex(13446);
    }

    z(v vVar) {
        this.f22810a = vVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        v vVar = this.f22810a;
        dialogInterface.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            if (((IHostApp) a.a(IHostApp.class)).isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        ((IActionHandlerService) a.a(IActionHandlerService.class)).handle(vVar.f22799a, value);
        if (u.a().b() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(u.a().b().c()));
            b.a.a("livesdk_anchor_click_contact_us").a(vVar.f22800b).a((Map<String, String>) hashMap).b();
        }
    }
}

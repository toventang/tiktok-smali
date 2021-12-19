package com.ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import java.util.HashMap;

final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final UpdateTipActivity f79547a;

    static {
        Covode.recordClassIndex(49407);
    }

    y(UpdateTipActivity updateTipActivity) {
        this.f79547a = updateTipActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        UpdateTipActivity updateTipActivity = this.f79547a;
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse("market://details?id=" + updateTipActivity.getPackageName()));
            intent.setPackage("com.android.vending");
            if (intent.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                UpdateTipActivity.a(updateTipActivity, intent);
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + updateTipActivity.getPackageName()));
                if (intent2.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                    UpdateTipActivity.a(updateTipActivity, intent2);
                }
            }
        } catch (Exception unused) {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + updateTipActivity.getPackageName()));
            if (intent3.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                UpdateTipActivity.a(updateTipActivity, intent3);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("schema_url", updateTipActivity.f79422a);
        hashMap.put("click_position", "update");
        r.a("schema_update_toast_click", hashMap);
    }
}

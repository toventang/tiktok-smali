package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.f;
import com.ss.android.ugc.tiktok.security.a.a;

final /* synthetic */ class fi implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f142923a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f142924b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a f142925c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f142926d;

    /* renamed from: e  reason: collision with root package name */
    private final String f142927e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f142928f;

    static {
        Covode.recordClassIndex(93524);
    }

    fi(Context context, boolean z, f.a aVar, boolean z2, String str, Runnable runnable) {
        this.f142923a = context;
        this.f142924b = z;
        this.f142925c = aVar;
        this.f142926d = z2;
        this.f142927e = str;
        this.f142928f = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context = this.f142923a;
        boolean z = this.f142924b;
        f.a aVar = this.f142925c;
        boolean z2 = this.f142926d;
        String str = this.f142927e;
        Runnable runnable = this.f142928f;
        try {
            fg.b(context);
        } catch (Exception unused) {
            Intent intent = new Intent("android.settings.SETTINGS");
            a.a(intent, context);
            context.startActivity(intent);
        }
        if (z) {
            r.a("notification_setting_alert_click", new d().a("enter_from", "notification_setting_page").f66730a);
        } else if (aVar != null) {
            r.a("push_pre_permission_auth", new d().a("enter_from", aVar.f116377c).a("enter_method", aVar.f116378d).a("room_id", aVar.f116375a).a("anchor_id", aVar.f116376b).a("enter_reason", "general").f66730a);
        } else if (z2) {
            r.a("push_pre_permission_auth", new d().a("enter_from", str).a("enter_method", "notification_bell").a("enter_reason", "general").f66730a);
        } else {
            r.a("push_pre_permission_auth", new d().f66730a);
        }
        SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(context, "NotificationGuide", 0);
        SharedPreferences.Editor edit = a2.edit();
        edit.putInt("guide_show_times", a2.getInt("guide_show_times", 0) + 1);
        edit.putLong("guide_last_time", System.currentTimeMillis());
        edit.apply();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}

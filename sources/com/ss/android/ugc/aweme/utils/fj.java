package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.f;
import com.ss.android.ugc.d.a.c;

final /* synthetic */ class fj implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f142929a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f142930b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f142931c;

    /* renamed from: d  reason: collision with root package name */
    private final String f142932d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f142933e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f142934f;

    static {
        Covode.recordClassIndex(93525);
    }

    fj(boolean z, f.a aVar, boolean z2, String str, Context context, Runnable runnable) {
        this.f142929a = z;
        this.f142930b = aVar;
        this.f142931c = z2;
        this.f142932d = str;
        this.f142933e = context;
        this.f142934f = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        boolean z = this.f142929a;
        f.a aVar = this.f142930b;
        boolean z2 = this.f142931c;
        String str = this.f142932d;
        Context context = this.f142933e;
        Runnable runnable = this.f142934f;
        dialogInterface.dismiss();
        if (z) {
            r.a("notification_setting_alert_close", new d().a("enter_from", "notification_setting_page").f66730a);
        } else if (aVar != null) {
            r.a("push_pre_permission_deny", new d().a("enter_from", aVar.f116377c).a("enter_method", aVar.f116378d).a("room_id", aVar.f116375a).a("anchor_id", aVar.f116376b).a("enter_reason", "general").f66730a);
        } else if (z2) {
            r.a("push_pre_permission_deny", new d().a("enter_from", str).a("enter_method", "notification_bell").a("enter_reason", "general").f66730a);
        } else {
            r.a("push_pre_permission_deny", new d().f66730a);
        }
        SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(context, "NotificationGuide", 0);
        SharedPreferences.Editor edit = a2.edit();
        edit.putInt("guide_show_times", a2.getInt("guide_show_times", 0) + 1);
        edit.putLong("guide_last_time", System.currentTimeMillis());
        edit.apply();
        if (runnable != null) {
            runnable.run();
        }
        c.a(new com.ss.android.ugc.aweme.ug.guide.f());
    }
}

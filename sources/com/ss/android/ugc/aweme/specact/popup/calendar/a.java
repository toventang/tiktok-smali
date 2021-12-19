package com.ss.android.ugc.aweme.specact.popup.calendar;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final Keva f134599a = Keva.getRepo("com.ss.android.ugc.aweme.specact.calendar.CalendarHelper");

    /* renamed from: b  reason: collision with root package name */
    public static final a f134600b = new a();

    private a() {
    }

    public static final class c implements a.AbstractC3816a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f134604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f134605b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f134606c;

        static {
            Covode.recordClassIndex(87957);
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.a.AbstractC3816a
        public final void a() {
            a.a(this.f134604a, this.f134605b, this.f134606c);
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.a.AbstractC3816a
        public final void b() {
            Activity activity = this.f134604a;
            if (!activity.shouldShowRequestPermissionRationale("android.permission.WRITE_CALENDAR") || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CALENDAR")) {
                a.f134599a.storeBoolean("isUserChoosesNotToAsk", true);
                this.f134606c.invoke(6);
                return;
            }
            this.f134606c.invoke(2);
        }

        c(Activity activity, b bVar, h.f.a.b bVar2) {
            this.f134604a = activity;
            this.f134605b = bVar;
            this.f134606c = bVar2;
        }
    }

    static {
        Covode.recordClassIndex(87954);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.a$a  reason: collision with other inner class name */
    public static final class DialogInterface$OnClickListenerC3499a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134601a;

        static {
            Covode.recordClassIndex(87955);
        }

        DialogInterface$OnClickListenerC3499a(b bVar) {
            this.f134601a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            r.a("warmup_auth_deny_pop_click", new d().a("position", this.f134601a.f134617k).a("button", "cancel").f66730a);
        }
    }

    public static String a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return str + '_' + str2;
    }

    public static boolean a(Activity activity, String str) {
        l.d(activity, "");
        l.d(str, "");
        if (com.ss.android.ugc.aweme.utils.permission.a.b(activity, new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"})) {
            return c.a(activity, str);
        }
        l.d(str, "");
        return c.f134618a.getBoolean(str, false);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134602a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f134603b;

        static {
            Covode.recordClassIndex(87956);
        }

        b(b bVar, Activity activity) {
            this.f134602a = bVar;
            this.f134603b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            r.a("warmup_auth_deny_pop_click", new d().a("position", this.f134602a.f134617k).a("button", "setting").f66730a);
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f134603b.getPackageName(), null));
            Activity activity = this.f134603b;
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }
    }

    public static void a(Activity activity, b bVar, h.f.a.b<? super Integer, z> bVar2) {
        bVar2.invoke(Integer.valueOf(c.a(activity, bVar)));
    }

    public static void a(Activity activity, b bVar, boolean z, h.f.a.b<? super Integer, z> bVar2) {
        l.d(activity, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        if (Build.VERSION.SDK_INT < 23) {
            a(activity, bVar, bVar2);
        } else if (com.ss.android.ugc.aweme.utils.permission.a.b(activity, new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"})) {
            a(activity, bVar, bVar2);
        } else if (f134599a.getBoolean("isUserChoosesNotToAsk", false)) {
            if (z) {
                r.a("warmup_auth_deny_pop_show", new d().a("position", bVar.f134617k).f66730a);
                a.C0731a aVar = new a.C0731a(activity);
                aVar.a(R.string.c5r).b(R.string.c5v).b(R.string.a9e, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3499a(bVar), false).a(R.string.c5g, (DialogInterface.OnClickListener) new b(bVar, activity), false);
                aVar.a().c().show();
            }
            bVar2.invoke(6);
        } else {
            com.ss.android.ugc.aweme.utils.permission.a.a(activity, new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"}, new c(activity, bVar, bVar2));
        }
    }
}

package com.ss.android.ugc.aweme.live.f;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f108369a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static Dialog f108370b;

    private b() {
    }

    static {
        Covode.recordClassIndex(69434);
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108371a = new a();

        static {
            Covode.recordClassIndex(69435);
        }

        a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.f.b$b  reason: collision with other inner class name */
    static final class DialogInterface$OnClickListenerC2781b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f108372a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f108373b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Intent f108374c;

        static {
            Covode.recordClassIndex(69436);
        }

        DialogInterface$OnClickListenerC2781b(Activity activity, String str, Intent intent) {
            this.f108372a = activity;
            this.f108373b = str;
            this.f108374c = intent;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            this.f108372a.finish();
            SmartRouter.buildRoute(this.f108372a, "//launcher/shortcut_proxy").withParam(StringSet.type, this.f108373b).withParam("open_url", a(this.f108374c, "open_url")).withParam("from_live_block_dialog", true).open();
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Activity activity, Intent intent) {
        l.d(activity, "");
        l.d(intent, "");
        String a2 = a(intent, StringSet.type);
        if (p.a((CharSequence) a2)) {
            p.b(f108370b);
            com.bytedance.android.livesdk.l.b a3 = new b.a(activity).a(R.string.e6w).b(R.string.e70).b(R.string.e71, (DialogInterface.OnClickListener) a.f108371a, false).a(R.string.e6y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC2781b(activity, a2, intent), false).a();
            f108370b = a3;
            p.a(a3);
        }
    }
}

package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler;
import com.ss.android.ugc.aweme.kids.setting.o;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class j implements o {

    /* renamed from: c  reason: collision with root package name */
    public static final a f107090c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.setting.base.a f107091a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f107092b;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.ies.dmt.ui.dialog.a f107093d;

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f107098a = new e();

        static {
            Covode.recordClassIndex(68499);
        }

        e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    static {
        Covode.recordClassIndex(68493);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final String a() {
        return "logout";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68495);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final Activity b() {
        return this.f107092b;
    }

    public static final class g implements com.ss.android.ugc.aweme.base.ui.session.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f107100a;

        static {
            Covode.recordClassIndex(68501);
        }

        @Override // com.ss.android.ugc.aweme.base.ui.session.b
        public final /* synthetic */ void a() {
            this.f107100a.c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(j jVar) {
            this.f107100a = jVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f107099a;

        static {
            Covode.recordClassIndex(68500);
        }

        f(j jVar) {
            this.f107099a = jVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f107099a.f107092b).a(R.string.de8).a();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("user_id", com.ss.android.ugc.aweme.kids.setting.a.a.a());
            com.ss.android.ugc.aweme.kids.common.c.f.a("log_out", bundle);
            KidsAccountServiceImpl.h().g();
            j jVar = this.f107099a;
            jVar.f107092b.runOnUiThread(new b(jVar));
            KidsAccountServiceImpl.h().a("user_logout", "user_logout");
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f107094a;

        static {
            Covode.recordClassIndex(68496);
        }

        b(j jVar) {
            this.f107094a = jVar;
        }

        public final void run() {
            if (this.f107094a.f107091a == null) {
                this.f107094a.f107091a = new com.ss.android.ugc.aweme.kids.setting.base.a(this.f107094a.f107092b);
            }
            com.ss.android.ugc.aweme.kids.setting.base.a aVar = this.f107094a.f107091a;
            if (aVar != null) {
                aVar.show();
            }
        }
    }

    public final void d() {
        if (this.f107093d == null) {
            a.C0731a aVar = new a.C0731a(this.f107092b);
            aVar.a(R.string.asn).b(R.string.a9e, (DialogInterface.OnClickListener) e.f107098a, false).a(R.string.czc, (DialogInterface.OnClickListener) new f(this), false);
            this.f107093d = aVar.a();
        }
        com.bytedance.ies.dmt.ui.dialog.a aVar2 = this.f107093d;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final void c() {
        IKidsAccountService h2 = KidsAccountServiceImpl.h();
        if (!h2.d() || h2.c() || !h2.e()) {
            d();
            return;
        }
        a.C0731a aVar = new a.C0731a(this.f107092b);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(this.f107092b);
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(KidsAccountServiceImpl.h().b().getUserThumb()));
        a2.E = smartAvatarImageView;
        a2.c();
        aVar.a(smartAvatarImageView, 48, 48);
        aVar.M = false;
        aVar.a(R.string.c3).b(R.string.c0).b(R.string.c1, (DialogInterface.OnClickListener) new c(this), false).a(R.string.c2, (DialogInterface.OnClickListener) new d(this, h2), false);
        aVar.a().c();
    }

    public j(Activity activity) {
        l.d(activity, "");
        this.f107092b = activity;
        activity.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.ss.android.ugc.aweme.kids.setting.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68494);
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                l.d(activity, "");
            }

            public final void onActivityPaused(Activity activity) {
                l.d(activity, "");
            }

            public final void onActivityResumed(Activity activity) {
                l.d(activity, "");
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                l.d(activity, "");
                l.d(bundle, "");
            }

            public final void onActivityStarted(Activity activity) {
                l.d(activity, "");
            }

            public final void onActivityStopped(Activity activity) {
                l.d(activity, "");
            }

            public final void onActivityDestroyed(Activity activity) {
                l.d(activity, "");
                KidsAccountServiceImpl.h().f();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final CommonItemView a(View view) {
        l.d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.cj6);
        l.b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(CommonItemView commonItemView) {
        l.d(commonItemView, "");
        if (AVExternalServiceImpl.a().publishService().isPublishable()) {
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = e();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f107092b).a(R.string.de8).a();
                return;
            }
            Activity activity = this.f107092b;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity");
            if (!((com.bytedance.ies.foundation.activity.a) activity).isActive()) {
                return;
            }
            if (TimeLockRuler.isRuleValid()) {
                com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.b.a(new g(this), "logout");
            } else {
                c();
            }
        } else {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f107092b).a(R.string.f0w).a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f107095a;

        static {
            Covode.recordClassIndex(68497);
        }

        c(j jVar) {
            this.f107095a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f107095a.d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f107096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IKidsAccountService f107097b;

        static {
            Covode.recordClassIndex(68498);
        }

        d(j jVar, IKidsAccountService iKidsAccountService) {
            this.f107096a = jVar;
            this.f107097b = iKidsAccountService;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f107097b.a("allow_one_key_login", true);
            this.f107096a.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(String str, String str2, Boolean bool) {
        l.d(str, "");
        o.a.a(this, str, str2, bool, (Boolean) null);
    }
}

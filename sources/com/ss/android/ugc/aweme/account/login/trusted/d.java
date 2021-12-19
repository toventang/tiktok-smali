package com.ss.android.ugc.aweme.account.login.trusted;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f63705a = new d();

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63706a = new a();

        static {
            Covode.recordClassIndex(39282);
        }

        a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(39281);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.d$d  reason: collision with other inner class name */
    public static final class C1428d implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f63709a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f63710b;

        static {
            Covode.recordClassIndex(39285);
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a() {
            Activity activity = this.f63709a;
            h.f.a.a aVar = this.f63710b;
            r.a("remember_login_info_notify", new com.ss.android.ugc.aweme.app.f.d().a("user_id", cj.f71084b.e().getCurUserId()).a("enter_from", "login").f66730a);
            a.C0731a aVar2 = new a.C0731a(activity);
            SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(activity);
            v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(cj.f71084b.e().getCurUser().getAvatarThumb()));
            a2.E = smartAvatarImageView;
            a2.c();
            aVar2.a(smartAvatarImageView, 48, 48);
            aVar2.M = false;
            aVar2.a(R.string.c3).b(R.string.c0).b(R.string.c1, (DialogInterface.OnClickListener) a.f63706a, false).a(R.string.c2, (DialogInterface.OnClickListener) b.f63707a, false).n = new c(aVar);
            aVar2.a().c();
            Keva.getRepo("save_info_keva_repo").storeLong("key_last_show_time", System.currentTimeMillis());
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list) {
            if (list != null) {
                Integer.valueOf(list.size());
            }
        }

        public C1428d(Activity activity, h.f.a.a aVar) {
            this.f63709a = activity;
            this.f63710b = aVar;
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list, int i2) {
            if (list != null) {
                Integer.valueOf(list.size());
            }
        }
    }

    static final class c implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f63708a;

        static {
            Covode.recordClassIndex(39284);
        }

        c(h.f.a.a aVar) {
            this.f63708a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f63708a.invoke();
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f63707a = new b();

        static {
            Covode.recordClassIndex(39283);
        }

        b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            cj.f71084b.k().updateMethodInfo("allow_one_key_login", true);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            IAccountUserService e2 = cj.f71084b.e();
            l.b(e2, "");
            r.a("remember_login_info_confirm", dVar.a("user_id", e2.getCurUserId()).a("enter_from", "login").f66730a);
        }
    }
}

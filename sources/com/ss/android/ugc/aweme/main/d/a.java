package com.ss.android.ugc.aweme.main.d;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bq;
import com.ss.android.ugc.aweme.utils.hi;
import com.ss.android.ugc.aweme.utils.hj;
import com.zhiliaoapp.musically.R;
import f.a.v;
import f.a.w;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2799a f109225a = new C2799a((byte) 0);

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final g f109233a = new g();

        static {
            Covode.recordClassIndex(69949);
        }

        g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    static {
        Covode.recordClassIndex(69942);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.d.a$a  reason: collision with other inner class name */
    public static final class C2799a {
        static {
            Covode.recordClassIndex(69943);
        }

        private C2799a() {
        }

        public /* synthetic */ C2799a(byte b2) {
            this();
        }
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f109229a = new d();

        static {
            Covode.recordClassIndex(69946);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.framework.a.a.a("CleanCacheDialog#show: " + ((Throwable) obj).getMessage());
        }
    }

    static void a(String str) {
        r.a("storage_toast_show", new com.ss.android.ugc.aweme.app.f.d().a("toast_type", str).f66730a);
    }

    public static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f109226a;

        static {
            Covode.recordClassIndex(69944);
        }

        public b(Activity activity) {
            this.f109226a = activity;
        }

        @Override // f.a.w
        public final void subscribe(v<Integer> vVar) {
            l.d(vVar, "");
            com.ss.android.ugc.aweme.cs.c.a().storeLong("last_check_storage_time", System.currentTimeMillis());
            Activity activity = this.f109226a;
            l.d(activity, "");
            hi a2 = hj.a();
            if (bq.e(activity) <= ((long) a2.f143065b) * 1048576 || bq.d(activity) >= ((long) a2.f143064a) * 1048576) {
                Activity activity2 = this.f109226a;
                l.d(activity2, "");
                hi a3 = hj.a();
                if (bq.e(activity2) >= ((long) a3.f143065b) * 1048576 || bq.d(activity2) >= ((long) a3.f143064a) * 1048576) {
                    vVar.a();
                } else {
                    vVar.a((Integer) 2);
                }
            } else {
                vVar.a((Integer) 1);
            }
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f109227a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f109228b;

        static {
            Covode.recordClassIndex(69945);
        }

        public c(a aVar, Activity activity) {
            this.f109227a = aVar;
            this.f109228b = activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 1) {
                    a aVar = this.f109227a;
                    Activity activity = this.f109228b;
                    if (!com.ss.android.ugc.aweme.cs.c.b() && !activity.isFinishing()) {
                        com.ss.android.ugc.aweme.cs.c.a().storeInt("show_storage_manager_count", com.ss.android.ugc.aweme.cs.c.c() + 1);
                        a.C0731a aVar2 = new a.C0731a(activity);
                        aVar2.a(R.string.d22).b(R.string.c19).b(R.string.dj3, (DialogInterface.OnClickListener) new e(aVar), false).a(R.string.d21, (DialogInterface.OnClickListener) new f(aVar, activity), false);
                        Dialog c2 = aVar2.a().c();
                        c2.setCancelable(false);
                        c2.setCanceledOnTouchOutside(false);
                        a.a("clean_app");
                    }
                } else if (num.intValue() == 2) {
                    Activity activity2 = this.f109228b;
                    if (!com.ss.android.ugc.aweme.cs.c.d() && !activity2.isFinishing()) {
                        com.ss.android.ugc.aweme.cs.c.a().storeInt("show_system_clean_count", com.ss.android.ugc.aweme.cs.c.e() + 1);
                        a.C0731a aVar3 = new a.C0731a(activity2);
                        aVar3.a(R.string.d22).b(R.string.c1_).a(R.string.b75, (DialogInterface.OnClickListener) g.f109233a, false);
                        Dialog c3 = aVar3.a().c();
                        c3.setCancelable(false);
                        c3.setCanceledOnTouchOutside(false);
                        a.a("clean_system");
                    }
                }
            }
        }
    }

    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f109230a;

        static {
            Covode.recordClassIndex(69947);
        }

        e(a aVar) {
            this.f109230a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            r.a("storage_toast_cancel", new com.ss.android.ugc.aweme.app.f.d().a("toast_type", "clean_app").f66730a);
        }
    }

    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f109231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f109232b;

        static {
            Covode.recordClassIndex(69948);
        }

        f(a aVar, Activity activity) {
            this.f109231a = aVar;
            this.f109232b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            SmartRouter.buildRoute(this.f109232b, "//setting/diskmanager").open();
            r.a("storage_toast_clean", new com.ss.android.ugc.aweme.app.f.d().a("toast_type", "clean_app").f66730a);
        }
    }
}

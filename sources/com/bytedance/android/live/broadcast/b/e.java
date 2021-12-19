package com.bytedance.android.live.broadcast.b;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static boolean f7574a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f7575b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(3737);
    }

    static final class c implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7584a = new c();

        static {
            Covode.recordClassIndex(3741);
        }

        c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            e.f7574a = false;
        }
    }

    static final class d implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f7585a = new d();

        static {
            Covode.recordClassIndex(3742);
        }

        d() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            e.f7574a = true;
        }
    }

    static final class b implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7582a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f7583b;

        static {
            Covode.recordClassIndex(3740);
        }

        b(String str, h.f.a.a aVar) {
            this.f7582a = str;
            this.f7583b = aVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            e.a(this.f7582a, "cancel");
            h.f.a.a aVar = this.f7583b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    static final class a implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f7577b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f7578c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f7579d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f7580e;

        static {
            Covode.recordClassIndex(3738);
        }

        a(String str, Activity activity, String str2, m mVar, h.f.a.b bVar) {
            this.f7576a = str;
            this.f7577b = activity;
            this.f7578c = str2;
            this.f7579d = mVar;
            this.f7580e = bVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            e.a(this.f7576a, "add");
            ((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).goEditDoBAgeGatePage(this.f7577b, this.f7578c, new IHostAction.a(this) {
                /* class com.bytedance.android.live.broadcast.b.e.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f7581a;

                static {
                    Covode.recordClassIndex(3739);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f7581a = r1;
                }

                @Override // com.bytedance.android.livesdkapi.host.IHostAction.a
                public final void a(String str) {
                    l.d(str, "");
                    this.f7581a.f7580e.invoke(str);
                }

                @Override // com.bytedance.android.livesdkapi.host.IHostAction.a
                public final void a(String str, String str2) {
                    l.d(str, "");
                    l.d(str2, "");
                    this.f7581a.f7579d.invoke(str, str2);
                }
            });
        }
    }

    public static void a(String str, String str2) {
        b.a.a("livesdk_add_birth_popup_window_click").a().a("request_page", str).a("click_type", str2).b();
    }

    public static boolean a(Activity activity, String str, String str2, m<? super String, ? super String, z> mVar, h.f.a.b<? super String, z> bVar, h.f.a.a<z> aVar) {
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(mVar, "");
        l.d(bVar, "");
        if (f7574a) {
            return false;
        }
        LiveDialog.a aVar2 = new LiveDialog.a(activity);
        aVar2.r = false;
        aVar2.q = false;
        LiveDialog.a b2 = aVar2.a(R.string.dvg).b(R.string.dvf).a(R.string.dve, new a(str2, activity, str, mVar, bVar)).b(R.string.dvd, new b(str2, aVar));
        b2.t = c.f7584a;
        b2.s = d.f7585a;
        b2.a().show();
        return true;
    }
}

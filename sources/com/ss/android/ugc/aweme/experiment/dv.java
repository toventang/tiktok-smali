package com.ss.android.ugc.aweme.experiment;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.component.h;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class dv {

    /* renamed from: a  reason: collision with root package name */
    public static long f89848a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static String f89849b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final Keva f89850c;

    /* renamed from: d  reason: collision with root package name */
    public static final dv f89851d = new dv();

    private dv() {
    }

    static {
        Covode.recordClassIndex(56432);
        Keva repo = Keva.getRepo("new_illegal_username_keva");
        l.b(repo, "");
        f89850c = repo;
    }

    public static final class a implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f89852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f89853b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f89854c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f89855d;

        static {
            Covode.recordClassIndex(56433);
        }

        public a(Runnable runnable, h hVar, String str, long j2) {
            this.f89852a = runnable;
            this.f89853b = hVar;
            this.f89854c = str;
            this.f89855d = j2;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            String str;
            Runnable runnable = this.f89852a;
            if (runnable != null) {
                runnable.run();
            }
            h hVar = this.f89853b;
            if (hVar == null || (str = hVar.f68072e) == null) {
                str = "background";
            }
            dv.a(this.f89854c, System.currentTimeMillis() - this.f89855d, str);
            dv.f89848a = -1;
        }
    }

    public static void a(String str, long j2, String str2) {
        r.a("exit_username", new d().a("enter_from", str).a("result", str2).a("stay_time", j2).f66730a);
    }
}

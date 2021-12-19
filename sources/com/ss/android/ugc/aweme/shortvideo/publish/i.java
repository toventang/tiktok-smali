package com.ss.android.ugc.aweme.shortvideo.publish;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.ay;
import com.ss.android.ugc.aweme.port.in.ba;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f129785b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f129786a;

    public interface b {
        static {
            Covode.recordClassIndex(85201);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(85199);
    }

    public static final void a(String str, String str2, String str3, String str4, String str5) {
        a.a(str, str2, str3, str4, str5);
    }

    public static final boolean a() {
        return a.a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85200);
        }

        private a() {
        }

        public static boolean a() {
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null || !cVar.isPreventDownload()) {
                return false;
            }
            ay ayVar = com.ss.android.ugc.aweme.port.in.c.f115628g;
            l.b(ayVar, "");
            if (!p.a("JP", ayVar.a(), true) || com.ss.android.ugc.aweme.port.in.c.A == null) {
                return false;
            }
            ba baVar = com.ss.android.ugc.aweme.port.in.c.A;
            l.b(baVar, "");
            if (baVar.a()) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str, String str2, String str3, String str4, String str5) {
            r.a("download_alert", new com.ss.android.ugc.tools.f.b().a("group_id", str).a("author_id", str2).a("enter_from", str3).a("download_method", str4).a("action_type", str5).f149193a);
        }
    }

    public final Dialog a(Context context) {
        if (context == null) {
            return null;
        }
        a.C0731a aVar = new a.C0731a(context);
        aVar.f33402b = context.getString(R.string.h_9);
        aVar.a(R.string.bbm, (DialogInterface.OnClickListener) new c(this), false).b(R.string.bbp, (DialogInterface.OnClickListener) new d(this), false);
        Dialog c2 = aVar.a().c();
        c2.setCanceledOnTouchOutside(false);
        c2.setCancelable(false);
        return c2;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f129787a;

        static {
            Covode.recordClassIndex(85202);
        }

        c(i iVar) {
            this.f129787a = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            b bVar = this.f129787a.f129786a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f129788a;

        static {
            Covode.recordClassIndex(85203);
        }

        d(i iVar) {
            this.f129788a = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            b bVar = this.f129788a.f129786a;
            if (bVar != null) {
                bVar.b();
            }
        }
    }
}

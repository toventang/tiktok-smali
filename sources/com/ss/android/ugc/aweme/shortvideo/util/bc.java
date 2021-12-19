package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class bc {

    /* renamed from: a  reason: collision with root package name */
    static Dialog f132252a;

    /* renamed from: b  reason: collision with root package name */
    public static final bc f132253b = new bc();

    private bc() {
    }

    static {
        Covode.recordClassIndex(86612);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f132257a = new c();

        static {
            Covode.recordClassIndex(86615);
        }

        c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            bc.f132252a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f132254a;

        static {
            Covode.recordClassIndex(86613);
        }

        a(h.f.a.a aVar) {
            this.f132254a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            this.f132254a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f132255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f132256b;

        static {
            Covode.recordClassIndex(86614);
        }

        b(Context context, h.f.a.a aVar) {
            this.f132255a = context;
            this.f132256b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            com.ss.android.ugc.aweme.port.in.c.D.c().d(this.f132255a);
            this.f132256b.invoke();
        }
    }

    public static void a(Context context, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        l.d(context, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        if (f132252a == null) {
            a.C0731a a2 = new a.C0731a(context).b(R.string.v_).b(R.string.va, (DialogInterface.OnClickListener) new a(aVar), false).a(R.string.asi, (DialogInterface.OnClickListener) new b(context, aVar2), false);
            a2.M = false;
            Dialog b2 = a2.a().b();
            b2.setOnDismissListener(c.f132257a);
            f132252a = b2;
        }
        Dialog dialog = f132252a;
        if (dialog != null && (context instanceof Activity) && !((Activity) context).isFinishing() && !dialog.isShowing()) {
            try {
                dialog.show();
                eu.a(dialog);
            } catch (Exception e2) {
                e.a(e2.toString());
            }
        }
    }
}

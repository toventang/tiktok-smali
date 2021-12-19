package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f127855a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(83808);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a$a  reason: collision with other inner class name */
    public static final class DialogInterface$OnClickListenerC3333a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f127856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f127857b;

        static {
            Covode.recordClassIndex(83809);
        }

        public DialogInterface$OnClickListenerC3333a(String str, h.f.a.a aVar) {
            this.f127856a = str;
            this.f127857b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f127857b.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f127858a;

        static {
            Covode.recordClassIndex(83810);
        }

        b(h.f.a.a aVar) {
            this.f127858a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f127858a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f127859a;

        static {
            Covode.recordClassIndex(83811);
        }

        c(h.f.a.a aVar) {
            this.f127859a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f127859a.invoke();
        }
    }

    public static void a(Activity activity, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (activity == null || activity.isFinishing()) {
            aVar.invoke();
        } else {
            new a.C0731a(activity).b(R.string.bk2).b(R.string.bjv, (DialogInterface.OnClickListener) null, false).a(R.string.bk1, (DialogInterface.OnClickListener) new c(aVar), false).a().b().show();
        }
    }

    public static void b(Activity activity, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (activity == null || activity.isFinishing()) {
            aVar.invoke();
        } else {
            new a.C0731a(activity).b(R.string.bk2).b(R.string.bjv, (DialogInterface.OnClickListener) null, false).a(R.string.bk1, (DialogInterface.OnClickListener) new b(aVar), false).a().b().show();
        }
    }
}

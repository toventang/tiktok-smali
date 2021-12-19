package com.ss.android.ugc.aweme.shortvideo.ui.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class p implements com.ss.android.ugc.aweme.shortvideo.ui.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final p f131352a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static Dialog f131353b;

    private p() {
    }

    static {
        Covode.recordClassIndex(86057);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f131356a;

        static {
            Covode.recordClassIndex(86060);
        }

        c(Activity activity) {
            this.f131356a = activity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f131356a.finish();
        }
    }

    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f131357a;

        static {
            Covode.recordClassIndex(86061);
        }

        d(Activity activity) {
            this.f131357a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f131357a.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.a.a.a
    public final void b(Activity activity) {
        l.d(activity, "");
        Dialog b2 = new a.C0731a(activity).a(R.string.a93).b(R.string.a92).b(R.string.a9e, (DialogInterface.OnClickListener) new d(activity), false).a().b();
        int i2 = Build.VERSION.SDK_INT;
        b2.setOnDismissListener(new c(activity));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.a.a.a
    public final void a(Activity activity) {
        l.d(activity, "");
        if (f131353b == null) {
            f131353b = new a.C0731a(activity).b(R.string.v_).b(R.string.va, (DialogInterface.OnClickListener) new a(activity), false).a(R.string.asi, (DialogInterface.OnClickListener) new b(activity), false).a().b();
        }
        Dialog dialog = f131353b;
        if (dialog != null && !dialog.isShowing()) {
            eu.a(f131353b);
            try {
                Dialog dialog2 = f131353b;
                if (dialog2 != null) {
                    dialog2.show();
                }
            } catch (Throwable unused) {
            }
        }
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f131354a;

        static {
            Covode.recordClassIndex(86058);
        }

        a(Activity activity) {
            this.f131354a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f131354a.finish();
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f131355a;

        static {
            Covode.recordClassIndex(86059);
        }

        b(Activity activity) {
            this.f131355a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.port.in.c.D.c().d(this.f131355a);
            this.f131355a.finish();
        }
    }
}

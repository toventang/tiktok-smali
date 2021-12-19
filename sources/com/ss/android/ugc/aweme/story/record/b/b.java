package com.ss.android.ugc.aweme.story.record.b;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b implements com.ss.android.ugc.aweme.shortvideo.ui.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f138173a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static Dialog f138174b;

    private b() {
    }

    static {
        Covode.recordClassIndex(90376);
    }

    static final class c implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f138177a;

        static {
            Covode.recordClassIndex(90379);
        }

        c(Activity activity) {
            this.f138177a = activity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f138177a.finish();
        }
    }

    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f138178a;

        static {
            Covode.recordClassIndex(90380);
        }

        d(Activity activity) {
            this.f138178a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f138178a.finish();
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
        if (f138174b == null) {
            f138174b = new a.C0731a(activity).b(R.string.v_).b(R.string.va, (DialogInterface.OnClickListener) new a(activity), false).a(R.string.asi, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3638b(activity), false).a().b();
        }
        Dialog dialog = f138174b;
        if (dialog != null && !dialog.isShowing()) {
            eu.a(f138174b);
            try {
                Dialog dialog2 = f138174b;
                if (dialog2 != null) {
                    dialog2.show();
                }
            } catch (Throwable unused) {
            }
        }
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f138175a;

        static {
            Covode.recordClassIndex(90377);
        }

        a(Activity activity) {
            this.f138175a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f138175a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.b.b$b  reason: collision with other inner class name */
    static final class DialogInterface$OnClickListenerC3638b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f138176a;

        static {
            Covode.recordClassIndex(90378);
        }

        DialogInterface$OnClickListenerC3638b(Activity activity) {
            this.f138176a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.port.in.l.f115658a.c().d(this.f138176a);
            this.f138176a.finish();
        }
    }
}

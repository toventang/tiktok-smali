package com.bytedance.awemelobby;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f25819a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(15074);
    }

    public static final class a implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f25820a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GoogleApiAvailability f25821b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f25822c;

        static {
            Covode.recordClassIndex(15075);
        }

        public a(Activity activity, GoogleApiAvailability googleApiAvailability, int i2) {
            this.f25820a = activity;
            this.f25821b = googleApiAvailability;
            this.f25822c = i2;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Activity activity = this.f25820a;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.bytedance.awemelobby.b$b  reason: collision with other inner class name */
    public static final class DialogInterface$OnCancelListenerC0552b implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f25823a;

        static {
            Covode.recordClassIndex(15076);
        }

        public DialogInterface$OnCancelListenerC0552b(Activity activity) {
            this.f25823a = activity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Activity activity = this.f25823a;
            if (activity != null) {
                activity.finish();
            }
        }
    }
}

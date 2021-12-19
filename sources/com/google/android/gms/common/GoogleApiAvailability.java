package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.bh;
import com.google.android.gms.common.api.internal.bi;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.d.g;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public class GoogleApiAvailability extends c {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object mLock = new Object();
    private static final GoogleApiAvailability zaao = new GoogleApiAvailability();
    private String zaap;

    public static int com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    static Dialog zaa(Context context, int i2, f fVar, DialogInterface.OnCancelListener onCancelListener) {
        return com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_GPLancet_zaa(context, i2, fVar, onCancelListener);
    }

    public static GoogleApiAvailability getInstance() {
        return zaao;
    }

    static {
        Covode.recordClassIndex(31178);
    }

    private final String zag() {
        String str;
        MethodCollector.i(13006);
        synchronized (mLock) {
            try {
                str = this.zaap;
            } finally {
                MethodCollector.o(13006);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.common.c
    public final String getErrorString(int i2) {
        return super.getErrorString(i2);
    }

    @Override // com.google.android.gms.common.c
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.c
    public final boolean isUserResolvableError(int i2) {
        return super.isUserResolvableError(i2);
    }

    /* access modifiers changed from: package-private */
    public final void zaa(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }

    /* access modifiers changed from: package-private */
    public class a extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f49949a;

        static {
            Covode.recordClassIndex(31179);
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i2 = message.what;
                return;
            }
            int isGooglePlayServicesAvailable = GoogleApiAvailability.this.isGooglePlayServicesAvailable(this.f49949a);
            if (GoogleApiAvailability.this.isUserResolvableError(isGooglePlayServicesAvailable)) {
                GoogleApiAvailability.this.showErrorNotification(this.f49949a, isGooglePlayServicesAvailable);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r4) {
            /*
                r2 = this;
                com.google.android.gms.common.GoogleApiAvailability.this = r3
                android.os.Looper r0 = android.os.Looper.myLooper()
                if (r0 != 0) goto L_0x0020
                android.os.Looper r0 = android.os.Looper.getMainLooper()
            L_0x000c:
                r2.<init>(r0)
                android.content.Context r1 = r4.getApplicationContext()
                boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
                if (r0 != 0) goto L_0x001a
            L_0x0017:
                r2.f49949a = r1
                return
            L_0x001a:
                if (r1 == 0) goto L_0x001d
                goto L_0x0017
            L_0x001d:
                android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
                goto L_0x0017
            L_0x0020:
                android.os.Looper r0 = android.os.Looper.myLooper()
                goto L_0x000c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.a.<init>(com.google.android.gms.common.GoogleApiAvailability, android.content.Context):void");
        }
    }

    @Override // com.google.android.gms.common.c
    public int isGooglePlayServicesAvailable(Context context, int i2) {
        return super.isGooglePlayServicesAvailable(context, i2);
    }

    public void showErrorNotification(Context context, int i2) {
        zaa(context, i2, (String) null, getErrorResolutionPendingIntent(context, i2, 0, "n"));
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        if (connectionResult.a()) {
            return connectionResult.f49943c;
        }
        return getErrorResolutionPendingIntent(context, connectionResult.f49942b, 0);
    }

    public static Dialog zaa(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        MethodCollector.i(13004);
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(e.b(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zaa(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        MethodCollector.o(13004);
        return create;
    }

    public static Object com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(13097);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(13097);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final bi zaa(Context context, bh bhVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        bi biVar = new bi(bhVar);
        com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(context, biVar, intentFilter);
        biVar.f50097a = context;
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return biVar;
        }
        bhVar.a();
        biVar.a();
        return null;
    }

    @Override // com.google.android.gms.common.c
    public Intent getErrorResolutionIntent(Context context, int i2, String str) {
        return super.getErrorResolutionIntent(context, i2, str);
    }

    @Override // com.google.android.gms.common.c
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3) {
        return super.getErrorResolutionPendingIntent(context, i2, i3);
    }

    public static Intent com_google_android_gms_common_GoogleApiAvailability_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = com_google_android_gms_common_GoogleApiAvailability_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public final boolean zaa(Context context, ConnectionResult connectionResult, int i2) {
        PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult);
        if (errorResolutionPendingIntent == null) {
            return false;
        }
        zaa(context, connectionResult.f49942b, (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, errorResolutionPendingIntent, i2, true), 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i2, new u(getErrorResolutionIntent(activity, i2, "d"), activity, i3), onCancelListener);
    }

    public boolean showErrorDialogFragment(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i2, i3, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zaa(activity, errorDialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public static Dialog com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_GPLancet_zaa(Context context, int i2, f fVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 1 || i2 == 3 || i2 == 9) {
            return null;
        }
        return GoogleApiAvailability__zaa$___twin___(context, i2, fVar, onCancelListener);
    }

    public static Dialog GoogleApiAvailability__zaa$___twin___(Context context, int i2, f fVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder;
        String string;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(e.b(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i2 == 1) {
            string = resources.getString(R.string.ao0);
        } else if (i2 == 2) {
            string = resources.getString(R.string.ao7);
        } else if (i2 != 3) {
            string = resources.getString(17039370);
        } else {
            string = resources.getString(R.string.anx);
        }
        if (string != null) {
            builder.setPositiveButton(string, fVar);
        }
        String a2 = e.a(context, i2);
        if (a2 != null) {
            builder.setTitle(a2);
        }
        return builder.create();
    }

    static void zaa(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof androidx.fragment.app.e) {
            androidx.fragment.app.i supportFragmentManager = ((androidx.fragment.app.e) activity).getSupportFragmentManager();
            i iVar = new i();
            Dialog dialog2 = (Dialog) r.a(dialog, "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            iVar.f50305a = dialog2;
            if (onCancelListener != null) {
                iVar.f50306b = onCancelListener;
            }
            iVar.show(supportFragmentManager, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        Dialog dialog3 = (Dialog) r.a(dialog, "Cannot display null dialog");
        dialog3.setOnCancelListener(null);
        dialog3.setOnDismissListener(null);
        bVar.f50289a = dialog3;
        if (onCancelListener != null) {
            bVar.f50290b = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    private final void zaa(Context context, int i2, String str, PendingIntent pendingIntent) {
        String a2;
        String str2;
        int i3;
        if (i2 == 18) {
            zaa(context);
        } else if (pendingIntent != null) {
            if (i2 == 6) {
                a2 = e.a(context, "common_google_play_services_resolution_required_title");
            } else {
                a2 = e.a(context, i2);
            }
            if (a2 == null) {
                a2 = context.getResources().getString(R.string.ao4);
            }
            if (i2 == 6 || i2 == 19) {
                str2 = e.a(context, "common_google_play_services_resolution_required_text", e.a(context));
            } else {
                str2 = e.b(context, i2);
            }
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "notification");
            i.e eVar = new i.e(context);
            eVar.y = true;
            i.e a3 = eVar.b(true).a((CharSequence) a2).a(new i.c().c(str2));
            if (h.a(context)) {
                r.a(k.b());
                a3.a(context.getApplicationInfo().icon).f2189l = 2;
                if (h.b(context)) {
                    a3.a(2131231789, resources.getString(R.string.apx), pendingIntent);
                } else {
                    a3.f2183f = pendingIntent;
                }
            } else {
                i.e a4 = a3.a(17301642).d(resources.getString(R.string.ao4)).a(System.currentTimeMillis());
                a4.f2183f = pendingIntent;
                a4.b(str2);
            }
            if (k.e()) {
                r.a(k.e());
                String zag = zag();
                if (zag == null) {
                    zag = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(zag);
                    String string = context.getResources().getString(R.string.ao3);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(zag, string, 4));
                    } else if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                a3.J = zag;
            }
            Notification d2 = a3.d();
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                i3 = 10436;
                g.f50300c.set(false);
            } else {
                i3 = 39789;
            }
            notificationManager.notify(i3, d2);
        } else if (i2 == 6) {
            com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_LogLancet_w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final boolean zaa(Activity activity, j jVar, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa = zaa(activity, i2, new v(getErrorResolutionIntent(activity, i2, "d"), jVar), onCancelListener);
        if (zaa == null) {
            return false;
        }
        zaa(activity, zaa, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}

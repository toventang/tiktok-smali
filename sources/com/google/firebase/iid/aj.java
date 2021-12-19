package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.c.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.ac;
import com.google.android.gms.c.h;
import com.google.android.gms.c.i;
import com.google.android.gms.c.k;
import com.google.android.gms.internal.f.d;
import com.google.firebase.iid.FirebaseIidMessengerCompat;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public final class aj {

    /* renamed from: d  reason: collision with root package name */
    private static int f54401d;

    /* renamed from: e  reason: collision with root package name */
    private static PendingIntent f54402e;

    /* renamed from: a  reason: collision with root package name */
    final g<String, i<Bundle>> f54403a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    Messenger f54404b;

    /* renamed from: c  reason: collision with root package name */
    FirebaseIidMessengerCompat f54405c;

    /* renamed from: f  reason: collision with root package name */
    private final Context f54406f;

    /* renamed from: g  reason: collision with root package name */
    private final ae f54407g;

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledExecutorService f54408h;

    /* renamed from: i  reason: collision with root package name */
    private Messenger f54409i;

    static {
        Covode.recordClassIndex(33778);
    }

    private static synchronized String a() {
        String num;
        synchronized (aj.class) {
            MethodCollector.i(13447);
            int i2 = f54401d;
            f54401d = i2 + 1;
            num = Integer.toString(i2);
            MethodCollector.o(13447);
        }
        return num;
    }

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean b(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return false;
        }
        return true;
    }

    private h<Bundle> d(Bundle bundle) {
        if (!this.f54407g.a()) {
            return k.a((Exception) new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return c(bundle).b(g.f54460a, new al(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final h<Bundle> a(Bundle bundle) {
        if (this.f54407g.e() >= 12000000) {
            return x.a(this.f54406f).a(bundle).a(g.f54460a, ak.f54411a);
        }
        return d(bundle);
    }

    /* access modifiers changed from: package-private */
    public final void b(Intent intent) {
        MethodCollector.i(13367);
        String a2 = a(intent, "error");
        if (a2 == null) {
            String.valueOf(String.valueOf(a(intent))).length();
            MethodCollector.o(13367);
            return;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(a2);
            if (valueOf.length() != 0) {
                "Received InstanceID error ".concat(valueOf);
            } else {
                new String("Received InstanceID error ");
            }
        }
        if (a2.startsWith("|")) {
            String[] split = a2.split("\\|");
            if (split.length <= 2 || !"ID".equals(split[1])) {
                String valueOf2 = String.valueOf(a2);
                if (valueOf2.length() != 0) {
                    "Unexpected structured response ".concat(valueOf2);
                    MethodCollector.o(13367);
                    return;
                }
                new String("Unexpected structured response ");
                MethodCollector.o(13367);
                return;
            }
            String str = split[2];
            String str2 = split[3];
            if (str2.startsWith(":")) {
                str2 = str2.substring(1);
            }
            a(str, a(intent.putExtra("error", str2)));
            MethodCollector.o(13367);
            return;
        }
        synchronized (this.f54403a) {
            for (int i2 = 0; i2 < this.f54403a.size(); i2++) {
                try {
                    a(this.f54403a.b(i2), a(intent));
                } finally {
                    MethodCollector.o(13367);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final h<Bundle> c(Bundle bundle) {
        MethodCollector.i(13449);
        String a2 = a();
        i<Bundle> iVar = new i<>();
        synchronized (this.f54403a) {
            try {
                this.f54403a.put(a2, iVar);
            } catch (Throwable th) {
                MethodCollector.o(13449);
                throw th;
            }
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f54407g.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        a(this.f54406f, intent);
        intent.putExtra("kid", new StringBuilder(String.valueOf(a2).length() + 5).append("|ID|").append(a2).append("|").toString());
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(a(intent))).length();
        }
        intent.putExtra("google.messenger", this.f54409i);
        if (!(this.f54404b == null && this.f54405c == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f54404b;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f54405c.a(obtain);
                }
            } catch (RemoteException unused) {
            }
            iVar.f49902a.a(g.f54460a, new an(this, a2, this.f54408h.schedule(new am(iVar), 30, TimeUnit.SECONDS)));
            ac<TResult> acVar = iVar.f49902a;
            MethodCollector.o(13449);
            return acVar;
        }
        if (this.f54407g.b() == 2) {
            this.f54406f.sendBroadcast(intent);
        } else {
            b(this.f54406f, intent);
        }
        iVar.f49902a.a(g.f54460a, new an(this, a2, this.f54408h.schedule(new am(iVar), 30, TimeUnit.SECONDS)));
        ac<TResult> acVar2 = iVar.f49902a;
        MethodCollector.o(13449);
        return acVar2;
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public aj(Context context, ae aeVar) {
        MethodCollector.i(13290);
        this.f54406f = context;
        this.f54407g = aeVar;
        this.f54409i = new Messenger(new d(Looper.getMainLooper()) {
            /* class com.google.firebase.iid.aj.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33779);
            }

            public final void handleMessage(Message message) {
                aj ajVar = aj.this;
                if (message != null && (message.obj instanceof Intent)) {
                    Intent intent = (Intent) message.obj;
                    intent.setExtrasClassLoader(new FirebaseIidMessengerCompat.a());
                    if (intent.hasExtra("google.messenger")) {
                        Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                        if (parcelableExtra instanceof FirebaseIidMessengerCompat) {
                            ajVar.f54405c = (FirebaseIidMessengerCompat) parcelableExtra;
                        }
                        if (parcelableExtra instanceof Messenger) {
                            ajVar.f54404b = (Messenger) parcelableExtra;
                        }
                    }
                    Intent intent2 = (Intent) message.obj;
                    String action = intent2.getAction();
                    if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                        String a2 = aj.a(intent2, "registration_id");
                        if (a2 == null && (a2 = aj.a(intent2, "unregistered")) == null) {
                            ajVar.b(intent2);
                            return;
                        }
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(a2);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            Bundle a3 = aj.a(intent2);
                            a3.putString("registration_id", group2);
                            ajVar.a(group, a3);
                        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf = String.valueOf(a2);
                            if (valueOf.length() != 0) {
                                "Unexpected response string: ".concat(valueOf);
                            } else {
                                new String("Unexpected response string: ");
                            }
                        }
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf2 = String.valueOf(action);
                        if (valueOf2.length() != 0) {
                            "Unexpected response action: ".concat(valueOf2);
                        } else {
                            new String("Unexpected response action: ");
                        }
                    }
                }
            }
        });
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f54408h = scheduledThreadPoolExecutor;
        MethodCollector.o(13290);
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (aj.class) {
            MethodCollector.i(13364);
            if (f54402e == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f54402e = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f54402e);
            MethodCollector.o(13364);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName b(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.aj.b(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, Bundle bundle) {
        MethodCollector.i(13445);
        synchronized (this.f54403a) {
            try {
                i<Bundle> remove = this.f54403a.remove(str);
                if (remove == null) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        "Missing callback for ".concat(valueOf);
                    } else {
                        new String("Missing callback for ");
                    }
                    return;
                }
                remove.a(bundle);
                MethodCollector.o(13445);
            } finally {
                MethodCollector.o(13445);
            }
        }
    }
}

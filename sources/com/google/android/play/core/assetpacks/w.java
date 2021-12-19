package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bg;
import com.google.android.play.core.c.c;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class w extends c<AssetPackState> {

    /* renamed from: a  reason: collision with root package name */
    final bm f53096a;

    /* renamed from: b  reason: collision with root package name */
    final av f53097b;

    /* renamed from: c  reason: collision with root package name */
    final bg<dj> f53098c;

    /* renamed from: f  reason: collision with root package name */
    private final am f53099f;

    /* renamed from: g  reason: collision with root package name */
    private final ay f53100g;

    /* renamed from: h  reason: collision with root package name */
    private final com.google.android.play.core.common.c f53101h;

    /* renamed from: i  reason: collision with root package name */
    private final bg<Executor> f53102i;

    /* renamed from: j  reason: collision with root package name */
    private final bg<Executor> f53103j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f53104k = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32777);
    }

    w(Context context, bm bmVar, av avVar, bg<dj> bgVar, ay ayVar, am amVar, com.google.android.play.core.common.c cVar, bg<Executor> bgVar2, bg<Executor> bgVar3) {
        super(new b("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f53096a = bmVar;
        this.f53097b = avVar;
        this.f53098c = bgVar;
        this.f53100g = ayVar;
        this.f53099f = amVar;
        this.f53101h = cVar;
        this.f53102i = bgVar2;
        this.f53103j = bgVar3;
    }

    @Override // com.google.android.play.core.c.c
    public final void a(Context context, Intent intent) {
        Bundle a2 = a(intent, "com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (a2 != null) {
            ArrayList<String> stringArrayList = a2.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f53183d.b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            Bundle a3 = a(intent, "com.google.android.play.core.FLAGS");
            if (a3 != null) {
                this.f53101h.a(a3);
            }
            AssetPackState a4 = AssetPackState.a(a2, stringArrayList.get(0), this.f53100g, y.f53114a);
            this.f53183d.a("ListenerRegistryBroadcastReceiver.onReceive: %s", a4);
            PendingIntent pendingIntent = (PendingIntent) a2.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f53099f.f52799a = pendingIntent;
            }
            this.f53103j.a().execute(new u(this, a2, a4));
            this.f53102i.a().execute(new v(this, a2));
            return;
        }
        this.f53183d.b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final void a(AssetPackState assetPackState) {
        this.f53104k.post(new t(this, assetPackState));
    }

    private static Bundle a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }
}

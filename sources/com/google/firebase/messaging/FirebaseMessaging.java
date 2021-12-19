package com.google.firebase.messaging;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.g;
import com.google.android.gms.c.h;
import com.google.android.gms.c.k;
import com.google.firebase.b;
import com.google.firebase.c.c;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.ae;
import com.google.firebase.iid.q;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {

    /* renamed from: b  reason: collision with root package name */
    static g f54592b;

    /* renamed from: a  reason: collision with root package name */
    final FirebaseInstanceId f54593a;

    /* renamed from: c  reason: collision with root package name */
    private final Context f54594c;

    /* renamed from: d  reason: collision with root package name */
    private final h<v> f54595d;

    static {
        Covode.recordClassIndex(33869);
    }

    public static synchronized FirebaseMessaging a() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            MethodCollector.i(4614);
            instance = getInstance(b.d());
            MethodCollector.o(4614);
        }
        return instance;
    }

    static synchronized FirebaseMessaging getInstance(b bVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            MethodCollector.i(4618);
            firebaseMessaging = (FirebaseMessaging) bVar.a(FirebaseMessaging.class);
            MethodCollector.o(4618);
        }
        return firebaseMessaging;
    }

    FirebaseMessaging(b bVar, FirebaseInstanceId firebaseInstanceId, com.google.firebase.f.h hVar, c cVar, com.google.firebase.installations.h hVar2, g gVar) {
        f54592b = gVar;
        this.f54593a = firebaseInstanceId;
        Context a2 = bVar.a();
        this.f54594c = a2;
        ae aeVar = new ae(a2);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.b("Firebase-Messaging-Topics-Io"));
        h<v> a3 = k.a(scheduledThreadPoolExecutor, new w(a2, scheduledThreadPoolExecutor, firebaseInstanceId, aeVar, new q(bVar, aeVar, hVar, cVar, hVar2)));
        this.f54595d = a3;
        a3.a(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.a.b("Firebase-Messaging-Trigger-Topics-Io")), new h(this));
    }
}

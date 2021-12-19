package com.google.firebase.messaging;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.ae;
import com.google.firebase.iid.q;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

final /* synthetic */ class w implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54649a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f54650b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseInstanceId f54651c;

    /* renamed from: d  reason: collision with root package name */
    private final ae f54652d;

    /* renamed from: e  reason: collision with root package name */
    private final q f54653e;

    static {
        Covode.recordClassIndex(33903);
    }

    w(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, ae aeVar, q qVar) {
        this.f54649a = context;
        this.f54650b = scheduledExecutorService;
        this.f54651c = firebaseInstanceId;
        this.f54652d = aeVar;
        this.f54653e = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f54649a;
        ScheduledExecutorService scheduledExecutorService = this.f54650b;
        return new v(this.f54651c, this.f54652d, u.a(context, scheduledExecutorService), this.f54653e, context, scheduledExecutorService);
    }
}

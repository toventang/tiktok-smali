package com.google.android.play.core.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f53179a;

    static {
        Covode.recordClassIndex(32867);
    }

    /* synthetic */ b(c cVar) {
        this.f53179a = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f53179a.a(context, intent);
    }
}

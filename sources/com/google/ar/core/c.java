package com.google.ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;

final class c extends com.google.a.b.a.a.a.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f53432a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f53433b;

    static {
        Covode.recordClassIndex(33070);
    }

    @Override // com.google.a.b.a.a.a.d
    public final void b(Bundle bundle) {
    }

    @Override // com.google.a.b.a.a.a.d
    public final void a(Bundle bundle) {
        if (!this.f53432a.getAndSet(true)) {
            int i2 = bundle.getInt("error.code", -100);
            int i3 = bundle.getInt("install.status", 0);
            if (i3 == 4) {
                this.f53433b.f53437b.a(aj.COMPLETED);
            } else if (i2 != 0) {
                e eVar = this.f53433b;
                ak.a(eVar.f53436a, eVar.f53437b);
            } else if (bundle.containsKey("resolution.intent")) {
                e eVar2 = this.f53433b;
                Activity activity = eVar2.f53436a;
                ai aiVar = eVar2.f53437b;
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
                if (pendingIntent != null) {
                    try {
                        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
                    } catch (IntentSender.SendIntentException e2) {
                        aiVar.a(new FatalException("Installation Intent failed", e2));
                    }
                } else {
                    aiVar.a(new FatalException("Installation intent failed to unparcel."));
                }
            } else if (i3 != 10) {
                switch (i3) {
                    case 1:
                    case 2:
                    case 3:
                        this.f53433b.f53437b.a(aj.ACCEPTED);
                        return;
                    case 4:
                        this.f53433b.f53437b.a(aj.COMPLETED);
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        this.f53433b.f53437b.a(new FatalException("Unexpected FAILED install status without error."));
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        this.f53433b.f53437b.a(aj.CANCELLED);
                        return;
                    default:
                        ai aiVar2 = this.f53433b.f53437b;
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected install status: ");
                        sb.append(i3);
                        aiVar2.a(new FatalException(sb.toString()));
                        return;
                }
            } else {
                this.f53433b.f53437b.a(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
            }
        }
    }

    c(e eVar, AtomicBoolean atomicBoolean) {
        this.f53433b = eVar;
        this.f53432a = atomicBoolean;
    }
}

package com.ss.android.ugc.aweme.scheduler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.publish.o;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.services.external.ui.IDraftService;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;

public final class PublishBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f120838a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f120839b = new a((byte) 0);

    static {
        Covode.recordClassIndex(78729);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78730);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements IDraftService.OnGetRecoverDraftCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f120840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f120841b;

        static {
            Covode.recordClassIndex(78731);
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IDraftService.OnGetRecoverDraftCallback
        public final void onFail() {
            h.c("PublishBroadcastReceiver retry onFail");
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IDraftService.OnGetRecoverDraftCallback
        public final void onSuccess(c cVar) {
            String a2;
            l.d(cVar, "");
            String f2 = cVar.f();
            l.b(f2, "");
            h.d("PublishBroadcastReceiver retry onSuccess draftCreationId:".concat(String.valueOf(f2)));
            if (!l.a((Object) this.f120840a, (Object) f2)) {
                h.c("PublishBroadcastReceiver retry CreationIdNotEqual intent:" + this.f120840a + " draft:" + f2);
            }
            r.a("publish_retry", new com.ss.android.ugc.tools.f.b().a("action_type", "publish").a("creation_id", f2).a("enter_from", "notification").a("enter_method", "click_retry").f149193a);
            com.ss.android.ugc.aweme.port.in.c.r.a(true);
            Bundle a3 = o.a(this.f120841b, cVar);
            if (m.a()) {
                a2 = h.a(a3);
                h.a();
            } else {
                a2 = h.a(a3, (String) null);
            }
            if (a2 == null) {
                q.b("PublishFromDraft Already In publish, can not start new");
            }
            Activity c2 = com.ss.android.ugc.aweme.df.c.c();
            h.d("PublishBroadcastReceiver bind publishId:" + a2 + " hostActivity:" + c2);
            if (a2 != null) {
                com.ss.android.ugc.aweme.port.in.l.f115658a.j().a(c2, a2);
            }
        }

        b(String str, Context context) {
            this.f120840a = str;
            this.f120841b = context;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        l.d(context, "");
        l.d(intent, "");
        if (l.a((Object) a(intent, "DEBUG_MSG"), (Object) "MSG_SUCCESS")) {
            h.d("PublishBroadcastReceiver onReceive success");
            f120838a = true;
            return;
        }
        String a2 = a(intent, "creation_id");
        if (!m.a()) {
            PublishService.a.a();
        } else if (a2 != null) {
            l.d(a2, "");
            PublishService.a.a("clear");
            Context a3 = com.ss.android.ugc.aweme.df.b.a();
            PublishService.a.a(a3);
            androidx.core.app.l.a(a3).a((String) null, a2.hashCode());
        }
        h.d("PublishBroadcastReceiver onReceive intentCreationId:".concat(String.valueOf(a2)));
        if (m.a() || !h.b()) {
            o.a(context, new b(a2, context));
        } else {
            h.c("PublishBroadcastReceiver start publish when publishing");
        }
    }
}

package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f100554a;

    /* renamed from: b  reason: collision with root package name */
    public final String f100555b;

    static {
        Covode.recordClassIndex(64314);
    }

    public static final class b implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f100558a;

        static {
            Covode.recordClassIndex(64316);
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list, int i2) {
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a() {
            new Handler(Looper.getMainLooper()).post(new a(this));
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f100559a;

            static {
                Covode.recordClassIndex(64317);
            }

            a(b bVar) {
                this.f100559a = bVar;
            }

            public final void run() {
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(topActivity).b(R.string.cof), new h.f.a.b<com.bytedance.tux.dialog.b.b, z>(this) {
                        /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.g.b.a.AnonymousClass1 */
                        final /* synthetic */ a this$0;

                        static {
                            Covode.recordClassIndex(64318);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                            com.bytedance.tux.dialog.b.b bVar2 = bVar;
                            l.d(bVar2, "");
                            String string = this.this$0.f100559a.f100558a.f100554a.getString(R.string.cgn);
                            l.b(string, "");
                            bVar2.a(string, AnonymousClass1.f100560a);
                            return z.f158842a;
                        }
                    }).a(false)).a().b().show();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(g gVar) {
            this.f100558a = gVar;
        }
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new c(this), 1000);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f100561a;

        static {
            Covode.recordClassIndex(64320);
        }

        c(g gVar) {
            this.f100561a = gVar;
        }

        public final void run() {
            g gVar = this.f100561a;
            Activity topActivity = ActivityStack.getTopActivity();
            if (((topActivity != null && (!MainServiceImpl.createIMainServicebyMonsterPlugin(false).isDeepLinkHandlerActivity(topActivity))) || (topActivity = ActivityStack.getPreviousActivity()) != null) && (topActivity instanceof e)) {
                com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
                DialogContext.a aVar2 = new DialogContext.a((m) topActivity);
                aVar2.f33424a = b.a.GROUP_CHAT_INVITE;
                aVar.a(aVar2.a(new b(gVar)));
            }
        }
    }

    public static final class a implements com.ss.android.ugc.aweme.im.service.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f100556a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100557b;

        static {
            Covode.recordClassIndex(64315);
        }

        @Override // com.ss.android.ugc.aweme.im.service.g
        public final void a() {
            String str = this.f100557b;
            l.d(str, "");
            l.d(this, "");
            CopyOnWriteArrayList<com.ss.android.ugc.aweme.im.service.g> copyOnWriteArrayList = ImUnder16Manger.f103780h.get(str);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(this);
            }
            if (!ImUnder16Manger.b()) {
                Intent sessionListActivityIntent = IMService.createIIMServicebyMonsterPlugin(false).getSessionListActivityIntent(this.f100556a.f100554a);
                if (sessionListActivityIntent != null) {
                    sessionListActivityIntent.putExtra("im_group_invite_id", this.f100556a.f100555b);
                    Activity activity = this.f100556a.f100554a;
                    com.ss.android.ugc.tiktok.security.a.a.a(sessionListActivityIntent, activity);
                    activity.startActivity(sessionListActivityIntent);
                    return;
                }
                return;
            }
            this.f100556a.a();
        }

        public a(g gVar, String str) {
            this.f100556a = gVar;
            this.f100557b = str;
        }
    }

    public g(Activity activity, String str) {
        l.d(activity, "");
        this.f100554a = activity;
        this.f100555b = str;
    }
}

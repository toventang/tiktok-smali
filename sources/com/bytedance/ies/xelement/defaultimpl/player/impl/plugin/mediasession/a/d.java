package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.i;
import androidx.media.a.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37041b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f37042a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f37043c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f37044d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f37045e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f37046f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f37047g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f37048h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f37049i = i.a((h.f.a.a) h.f37052a);

    /* renamed from: j  reason: collision with root package name */
    private final MediaSessionCompat.Token f37050j;

    /* renamed from: k  reason: collision with root package name */
    private final int f37051k;

    static {
        Covode.recordClassIndex(22278);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22279);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class h extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f37052a = new h();

        static {
            Covode.recordClassIndex(22286);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.a.b invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.a.a();
        }
    }

    static final class e extends m implements h.f.a.a<PendingIntent> {
        final /* synthetic */ ComponentName $notificationReceiverComponentName;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(22283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, ComponentName componentName) {
            super(0);
            this.this$0 = dVar;
            this.$notificationReceiverComponentName = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PendingIntent invoke() {
            return androidx.media.b.a.a(this.this$0.f37042a, this.$notificationReceiverComponentName, 512);
        }
    }

    static final class f extends m implements h.f.a.a<PendingIntent> {
        final /* synthetic */ ComponentName $notificationReceiverComponentName;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(22284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, ComponentName componentName) {
            super(0);
            this.this$0 = dVar;
            this.$notificationReceiverComponentName = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PendingIntent invoke() {
            return androidx.media.b.a.a(this.this$0.f37042a, this.$notificationReceiverComponentName, 32);
        }
    }

    static final class g extends m implements h.f.a.a<PendingIntent> {
        final /* synthetic */ ComponentName $notificationReceiverComponentName;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(22285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar, ComponentName componentName) {
            super(0);
            this.this$0 = dVar;
            this.$notificationReceiverComponentName = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PendingIntent invoke() {
            return androidx.media.b.a.a(this.this$0.f37042a, this.$notificationReceiverComponentName, 16);
        }
    }

    static final class b extends m implements h.f.a.a<PendingIntent> {
        final /* synthetic */ ComponentName $notificationReceiverComponentName;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(22280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, ComponentName componentName) {
            super(0);
            this.this$0 = dVar;
            this.$notificationReceiverComponentName = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PendingIntent invoke() {
            Context context = this.this$0.f37042a;
            Intent intent = new Intent();
            intent.setComponent(this.$notificationReceiverComponentName);
            intent.putExtra("command_from_notification", 2);
            return PendingIntent.getBroadcast(context, 2, intent, 134217728);
        }
    }

    static final class c extends m implements h.f.a.a<PendingIntent> {
        final /* synthetic */ ComponentName $notificationReceiverComponentName;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(22281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, ComponentName componentName) {
            super(0);
            this.this$0 = dVar;
            this.$notificationReceiverComponentName = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PendingIntent invoke() {
            Context context = this.this$0.f37042a;
            Intent intent = new Intent();
            intent.setComponent(this.$notificationReceiverComponentName);
            intent.putExtra("command_from_notification", 1);
            return PendingIntent.getBroadcast(context, 1, intent, 134217728);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d$d  reason: collision with other inner class name */
    static final class C0914d extends m implements h.f.a.a<PendingIntent> {
        final /* synthetic */ ComponentName $notificationReceiverComponentName;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(22282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0914d(d dVar, ComponentName componentName) {
            super(0);
            this.this$0 = dVar;
            this.$notificationReceiverComponentName = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PendingIntent invoke() {
            Context context = this.this$0.f37042a;
            Intent intent = new Intent();
            intent.setComponent(this.$notificationReceiverComponentName);
            intent.putExtra("command_from_notification", 3);
            return PendingIntent.getBroadcast(context, 3, intent, 134217728);
        }
    }

    public final Notification a(e eVar) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        l.c(eVar, "");
        try {
            Context context = this.f37042a;
            if (this.f37051k == -1) {
                return null;
            }
            i.e eVar2 = new i.e(context, "X_AUDIO_DEFAULT_PLAY_SERVICE");
            eVar2.b(false);
            eVar2.a(this.f37051k);
            eVar2.a((Uri) null);
            eVar2.a();
            this.f37049i.getValue();
            eVar2.c();
            eVar2.a((PendingIntent) this.f37045e.getValue());
            String str = eVar.f37056d;
            if (str == null) {
                str = "";
            }
            eVar2.a((CharSequence) str);
            String str2 = eVar.f37057e;
            if (str2 == null) {
                str2 = "";
            }
            eVar2.b(str2);
            String str3 = eVar.f37058f;
            if (str3 == null) {
                str3 = "";
            }
            eVar2.c(str3);
            eVar2.a(l.a((Object) eVar.f37053a, (Object) true));
            eVar2.b((PendingIntent) this.f37043c.getValue());
            eVar2.a("x_audio_default_player_service");
            Bitmap bitmap = eVar.f37059g;
            if (bitmap == null || !bitmap.isRecycled()) {
                eVar2.a(eVar.f37059g);
            } else {
                com.bytedance.ies.xelement.b.g.f36700a.b("NotificationFactory", "coverBitmap(" + eVar.f37059g + ") already recycled.");
            }
            Boolean bool = eVar.f37054b;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                i2 = 2131235012;
            } else {
                i2 = 2131235013;
            }
            eVar2.a(i2, "SkipToPrevious", (PendingIntent) this.f37046f.getValue());
            Boolean bool2 = eVar.f37053a;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            if (z2) {
                i3 = 2131235011;
            } else {
                i3 = 2131235008;
            }
            eVar2.a(i3, "PlayOrPause", (PendingIntent) this.f37047g.getValue());
            Boolean bool3 = eVar.f37055c;
            if (bool3 != null) {
                z3 = bool3.booleanValue();
            } else {
                z3 = false;
            }
            if (z3) {
                i4 = 2131235009;
            } else {
                i4 = 2131235010;
            }
            eVar2.a(i4, "SkipToNext", (PendingIntent) this.f37048h.getValue());
            eVar2.a(new a.C0053a().a(0, 1, 2).c().a(this.f37050j).a((PendingIntent) this.f37044d.getValue()));
            return eVar2.d();
        } catch (Exception e2) {
            com.bytedance.ies.xelement.b.g.f36700a.c("NotificationFactory", e2.getMessage());
            return null;
        }
    }

    public d(Context context, MediaSessionCompat.Token token, ComponentName componentName, int i2) {
        l.c(context, "");
        l.c(componentName, "");
        this.f37042a = context;
        this.f37050j = token;
        this.f37051k = i2;
        this.f37043c = h.i.a((h.f.a.a) new c(this, componentName));
        this.f37044d = h.i.a((h.f.a.a) new b(this, componentName));
        this.f37045e = h.i.a((h.f.a.a) new C0914d(this, componentName));
        this.f37046f = h.i.a((h.f.a.a) new g(this, componentName));
        this.f37047g = h.i.a((h.f.a.a) new e(this, componentName));
        this.f37048h = h.i.a((h.f.a.a) new f(this, componentName));
    }
}

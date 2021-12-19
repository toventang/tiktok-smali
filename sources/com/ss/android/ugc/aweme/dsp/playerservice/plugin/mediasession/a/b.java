package com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a;

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
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f83621b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f83622a = hashCode();

    /* renamed from: c  reason: collision with root package name */
    private final h f83623c = i.a((h.f.a.a) C1987b.f83628a);

    /* renamed from: d  reason: collision with root package name */
    private final Context f83624d;

    /* renamed from: e  reason: collision with root package name */
    private final g f83625e;

    /* renamed from: f  reason: collision with root package name */
    private final MediaSessionCompat.Token f83626f;

    /* renamed from: g  reason: collision with root package name */
    private final ComponentName f83627g;

    static {
        Covode.recordClassIndex(52179);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52180);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.b$b  reason: collision with other inner class name */
    static final class C1987b extends m implements h.f.a.a<com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1987b f83628a = new C1987b();

        static {
            Covode.recordClassIndex(52181);
        }

        C1987b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a.b invoke() {
            return new com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a.a();
        }
    }

    public final Notification a(c cVar) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        l.d(cVar, "");
        try {
            i.e eVar = new i.e(this.f83624d, this.f83625e.f83671f);
            eVar.b(false);
            eVar.a(this.f83625e.f83667b);
            eVar.a((Uri) null);
            eVar.f2190m = false;
            this.f83623c.getValue();
            eVar.E = 1;
            Context context = this.f83624d;
            Intent intent = new Intent();
            intent.setComponent(this.f83627g);
            intent.putExtra("EXTRA_KEY_FACTORY_ID", this.f83622a);
            intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 3);
            PendingIntent service = PendingIntent.getService(context, 3, intent, 134217728);
            l.b(service, "");
            eVar.f2183f = service;
            String str = cVar.f83632d;
            if (str == null) {
                str = "";
            }
            eVar.a((CharSequence) str);
            String str2 = cVar.f83633e;
            if (str2 == null) {
                str2 = "";
            }
            eVar.b(str2);
            String str3 = cVar.f83634f;
            if (str3 == null) {
                str3 = "";
            }
            eVar.c(str3);
            Context context2 = this.f83624d;
            Intent intent2 = new Intent();
            intent2.setComponent(this.f83627g);
            intent2.putExtra("EXTRA_KEY_FACTORY_ID", this.f83622a);
            intent2.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 1);
            PendingIntent service2 = PendingIntent.getService(context2, 1, intent2, 134217728);
            l.b(service2, "");
            eVar.b(service2);
            eVar.v = this.f83625e.f83668c;
            Bitmap bitmap = cVar.f83635g;
            if (bitmap == null || !bitmap.isRecycled()) {
                eVar.a(cVar.f83635g);
            } else {
                String.valueOf("coverBitmap(" + cVar.f83635g + ") already recycled.");
            }
            Boolean bool = cVar.f83630b;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                i2 = 2131233250;
            } else {
                i2 = 2131233251;
            }
            Context context3 = this.f83624d;
            Intent intent3 = new Intent();
            intent3.setComponent(this.f83627g);
            intent3.putExtra("EXTRA_KEY_FACTORY_ID", this.f83622a);
            intent3.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 6);
            eVar.a(i2, "SkipToPrevious", PendingIntent.getService(context3, 6, intent3, 134217728));
            Boolean bool2 = cVar.f83629a;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            String.valueOf("addPlayingAction ".concat(String.valueOf(z2)));
            if (z2) {
                i3 = 2131233248;
            } else {
                i3 = 2131233249;
            }
            Context context4 = this.f83624d;
            Intent intent4 = new Intent();
            intent4.setComponent(this.f83627g);
            intent4.putExtra("EXTRA_KEY_FACTORY_ID", this.f83622a);
            intent4.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 4);
            eVar.a(i3, "PlayOrPause", PendingIntent.getService(context4, 4, intent4, 134217728));
            Boolean bool3 = cVar.f83631c;
            if (bool3 != null) {
                z3 = bool3.booleanValue();
            } else {
                z3 = false;
            }
            if (z3) {
                i4 = 2131233246;
            } else {
                i4 = 2131233247;
            }
            Context context5 = this.f83624d;
            Intent intent5 = new Intent();
            intent5.setComponent(this.f83627g);
            intent5.putExtra("EXTRA_KEY_FACTORY_ID", this.f83622a);
            intent5.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 5);
            eVar.a(i4, "SkipToNext", PendingIntent.getService(context5, 5, intent5, 134217728));
            a.C0053a aVar = new a.C0053a();
            aVar.f3634a = new int[]{0, 1, 2};
            a.C0053a c2 = aVar.c();
            c2.f3635b = this.f83626f;
            Context context6 = this.f83624d;
            Intent intent6 = new Intent();
            intent6.setComponent(this.f83627g);
            intent6.putExtra("EXTRA_KEY_FACTORY_ID", this.f83622a);
            intent6.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 2);
            PendingIntent service3 = PendingIntent.getService(context6, 2, intent6, 134217728);
            l.b(service3, "");
            c2.f3637h = service3;
            eVar.a(c2);
            return eVar.d();
        } catch (Throwable th) {
            com.bytedance.services.apm.api.a.a(th, "create");
            return null;
        }
    }

    public b(Context context, g gVar, MediaSessionCompat.Token token, ComponentName componentName) {
        l.d(context, "");
        l.d(gVar, "");
        l.d(token, "");
        l.d(componentName, "");
        this.f83624d = context;
        this.f83625e = gVar;
        this.f83626f = token;
        this.f83627g = componentName;
    }
}

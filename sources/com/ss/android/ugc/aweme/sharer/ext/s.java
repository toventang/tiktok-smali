package com.ss.android.ugc.aweme.sharer.ext;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class s extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f124555b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f124556a;

    static {
        Covode.recordClassIndex(81846);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "more";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f
    public final String e() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81847);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return this.f124556a;
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f124557a = new b();

        static {
            Covode.recordClassIndex(81848);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_color_ellipsis_circle;
            return z.f158842a;
        }
    }

    public s(String str) {
        l.d(str, "");
        this.f124556a = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(b.f124557a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.a
    public final boolean a(Context context, Intent intent) {
        Intent createChooser;
        l.d(context, "");
        l.d(intent, "");
        if (Build.VERSION.SDK_INT >= 22) {
            Intent intent2 = new Intent();
            intent2.setAction(context.getPackageName() + ".systemshare.targetchosen.action");
            intent2.setPackage(context.getPackageName());
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, 0, intent2, 1342177280);
            l.b(broadcast, "");
            createChooser = Intent.createChooser(intent, "", broadcast.getIntentSender());
            l.b(createChooser, "");
        } else {
            createChooser = Intent.createChooser(intent, "");
            l.b(createChooser, "");
        }
        return super.a(context, createChooser);
    }
}

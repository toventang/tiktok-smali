package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Telephony;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class q extends com.ss.android.ugc.aweme.sharer.a {
    static {
        Covode.recordClassIndex(81842);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "sms";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "SMS";
    }

    static final class a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124552a = new a();

        static {
            Covode.recordClassIndex(81843);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_color_sms_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(a.f124552a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        int i2 = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", lVar.f124575b);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            intent.setPackage(defaultSmsPackage);
        }
        return a(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        String str;
        l.d(mVar, "");
        l.d(context, "");
        String str2 = mVar.f124582e;
        if (str2 == null || str2.length() == 0) {
            str = mVar.f124581d;
        } else {
            str = mVar.f124582e + ' ' + mVar.f124581d;
        }
        int i2 = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            intent.setPackage(defaultSmsPackage);
        }
        return a(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(n nVar, Context context) {
        l.d(nVar, "");
        l.d(context, "");
        int i2 = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("video/*");
        intent.putExtra("android.intent.extra.STREAM", nVar.f124583b);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            intent.setPackage(defaultSmsPackage);
        }
        return a(context, intent);
    }
}

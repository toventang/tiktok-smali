package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.f;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public class x extends f {
    static {
        Covode.recordClassIndex(81858);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public String a() {
        return "whatsapp";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public String b() {
        return "WhatsApp";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f
    public final String e() {
        return "com.whatsapp";
    }

    static final class a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124567a = new a();

        static {
            Covode.recordClassIndex(81859);
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
            aVar2.f44749a = R.raw.icon_color_whatsapp_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public Drawable a(Context context) {
        if (context != null) {
            return c.a(a.f124567a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        String b2 = mVar.b("whatsapp_target_phone_number", "");
        if (!TextUtils.isEmpty(b2)) {
            if (!a(context, mVar)) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse("https://wa.me/" + b2 + "?text=" + a(mVar)));
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
            return true;
        } else if (mVar.b("image", "").length() == 0) {
            return super.a(mVar, context);
        } else {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("image/*");
            intent2.setPackage("com.whatsapp");
            intent2.putExtra("android.intent.extra.STREAM", Uri.parse(mVar.b("image", "")));
            intent2.putExtra("android.intent.extra.TEXT", a(mVar));
            intent2.addFlags(268435456);
            int i2 = Build.VERSION.SDK_INT;
            intent2.addFlags(64);
            return a(context, intent2);
        }
    }
}

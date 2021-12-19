package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.sharer.a {
    static {
        Covode.recordClassIndex(81810);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "email";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Email";
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124534a = new a();

        static {
            Covode.recordClassIndex(81811);
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
            aVar2.f44749a = R.raw.icon_color_email_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(a.f124534a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        l.b(queryIntentActivities, "");
        if (queryIntentActivities.size() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean a(k kVar, Context context) {
        String str;
        l.d(kVar, "");
        l.d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        String str2 = kVar.f124574c;
        if (str2 == null || str2.length() == 0) {
            str = kVar.f124573b;
        } else {
            str = kVar.f124574c + ' ' + kVar.f124573b;
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.SUBJECT", kVar.f124582e);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return a(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", lVar.f124577d);
        intent.putExtra("android.intent.extra.SUBJECT", lVar.f124579f);
        intent.putExtra("android.intent.extra.STREAM", lVar.f124575b);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return a(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", mVar.f124581d);
        intent.putExtra("android.intent.extra.SUBJECT", mVar.f124582e);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return a(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(n nVar, Context context) {
        l.d(nVar, "");
        l.d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", nVar.f124585d);
        intent.putExtra("android.intent.extra.SUBJECT", nVar.f124587f);
        intent.putExtra("android.intent.extra.STREAM", nVar.f124583b);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return a(context, intent);
    }
}

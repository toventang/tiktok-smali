package com.ss.android.ugc.aweme.sharer.ext;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.a.c;
import com.ss.android.ugc.aweme.sharer.f;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class n extends f {
    static {
        Covode.recordClassIndex(81836);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "naver_blog";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "NaverBlog";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f
    public final String e() {
        return "com.nhn.android.blog";
    }

    static final class a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124549a = new a();

        static {
            Covode.recordClassIndex(81837);
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
            aVar2.f44749a = R.raw.icon_color_naverblog_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(a.f124549a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        String str = mVar.f124582e;
        if (str == null) {
            str = "";
        }
        String str2 = mVar.f124581d;
        com.ss.android.ugc.aweme.sharer.a.c cVar = new com.ss.android.ugc.aweme.sharer.a.c(context);
        h.a.z zVar = h.a.z.INSTANCE;
        h.a.z zVar2 = h.a.z.INSTANCE;
        h.a.z zVar3 = h.a.z.INSTANCE;
        h.a.z zVar4 = h.a.z.INSTANCE;
        l.d(str, "");
        l.d(str2, "");
        l.d(zVar, "");
        l.d(zVar2, "");
        l.d(zVar3, "");
        l.d(zVar4, "");
        l.d(zVar, "");
        l.d(zVar2, "");
        l.d(zVar3, "");
        l.d(zVar4, "");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(com.ss.android.ugc.aweme.sharer.a.c.f124509e);
        builder.authority(com.ss.android.ugc.aweme.sharer.a.c.f124510f);
        builder.appendQueryParameter(com.ss.android.ugc.aweme.sharer.a.c.f124511g, "1");
        if (str.length() != 0) {
            builder.appendQueryParameter(com.ss.android.ugc.aweme.sharer.a.c.f124512h, str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            builder.appendQueryParameter(com.ss.android.ugc.aweme.sharer.a.c.f124513i, str2);
        }
        c.a.a(builder, com.ss.android.ugc.aweme.sharer.a.c.f124514j, zVar);
        c.a.a(builder, com.ss.android.ugc.aweme.sharer.a.c.f124515k, zVar2);
        c.a.a(builder, com.ss.android.ugc.aweme.sharer.a.c.f124516l, zVar3);
        c.a.a(builder, com.ss.android.ugc.aweme.sharer.a.c.f124517m, zVar4);
        Uri build = builder.build();
        l.b(build, "");
        Intent intent = new Intent();
        intent.setData(build);
        try {
            com.ss.android.ugc.aweme.sharer.a.c.a(cVar.f124518a, intent);
        } catch (ActivityNotFoundException unused) {
            if (cVar.a(com.ss.android.ugc.aweme.sharer.a.c.f124506b)) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(com.ss.android.ugc.aweme.sharer.a.c.f124508d));
                com.ss.android.ugc.aweme.sharer.a.c.a(cVar.f124518a, intent2);
            } else {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setData(Uri.parse(com.ss.android.ugc.aweme.sharer.a.c.f124507c));
                com.ss.android.ugc.aweme.sharer.a.c.a(cVar.f124518a, intent3);
            }
        }
        return true;
    }
}

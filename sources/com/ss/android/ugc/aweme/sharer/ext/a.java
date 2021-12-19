package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.f;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.l;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.m;
import h.z;
import java.net.URLEncoder;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f124528a;

    static {
        Covode.recordClassIndex(81806);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "band";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(l lVar, Context context) {
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(n nVar, Context context) {
        h.f.b.l.d(nVar, "");
        h.f.b.l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Band";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f
    public final String e() {
        return "com.nhn.android.band";
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.a$a  reason: collision with other inner class name */
    static final class C3255a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3255a f124529a = new C3255a();

        static {
            Covode.recordClassIndex(81807);
        }

        C3255a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_color_band_circle;
            return z.f158842a;
        }
    }

    public a(String str) {
        h.f.b.l.d(str, "");
        this.f124528a = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(C3255a.f124529a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(hVar, "");
        if (!super.a(context, hVar) || !(hVar instanceof com.ss.android.ugc.aweme.sharer.m)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(context, "");
        return a(context, new Intent("android.intent.action.VIEW", Uri.parse("bandapp://create/post?text=" + URLEncoder.encode(String.valueOf(a(mVar)), "UTF-8") + "&route=" + this.f124528a)));
    }
}

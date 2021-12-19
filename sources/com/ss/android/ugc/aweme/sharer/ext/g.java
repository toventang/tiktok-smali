package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.f;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.m;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class g extends f {
    static {
        Covode.recordClassIndex(81822);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "instagram";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Instagram";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f
    public final String e() {
        return "com.instagram.android";
    }

    static final class a extends h.f.b.m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124541a = new a();

        static {
            Covode.recordClassIndex(81823);
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
            aVar2.f44749a = R.raw.icon_color_instagram_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(a.f124541a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        return super.a(context, hVar);
    }
}

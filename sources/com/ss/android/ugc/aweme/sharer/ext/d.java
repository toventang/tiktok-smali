package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.f;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d extends f {
    static {
        Covode.recordClassIndex(81816);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "facebook_lite";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Lite";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f
    public final String e() {
        return "com.facebook.lite";
    }

    static final class a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124538a = new a();

        static {
            Covode.recordClassIndex(81817);
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
            aVar2.f44749a = R.raw.icon_color_facebook_lite_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(a.f124538a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean b(Context context) {
        l.d(context, "");
        if (!super.b(context) || !a(context, new com.ss.android.ugc.aweme.sharer.m("test"))) {
            return false;
        }
        return true;
    }
}

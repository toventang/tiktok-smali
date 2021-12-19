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

public final class z extends f {
    static {
        Covode.recordClassIndex(81861);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "zalo";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Zalo";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f
    public final String e() {
        return "com.zing.zalo";
    }

    static final class a extends m implements b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124569a = new a();

        static {
            Covode.recordClassIndex(81862);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_color_zalo_circle;
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(a.f124569a).a(context);
        }
        return null;
    }
}

package com.ss.android.ugc.aweme.share.qrcode.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a extends com.ss.android.ugc.aweme.share.improve.b.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3233a f124189b = new C3233a((byte) 0);

    static {
        Covode.recordClassIndex(81570);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "qr_code_save";
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a.a$a  reason: collision with other inner class name */
    public static final class C3233a {
        static {
            Covode.recordClassIndex(81571);
        }

        private C3233a() {
        }

        public /* synthetic */ C3233a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        String string = d.a().getString(R.string.bbm);
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return i.a(com.bytedance.tux.c.c.a(b.f124190a).a(context), f.a(c.f124191a).a(context));
        }
        return null;
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f124190a = new b();

        static {
            Covode.recordClassIndex(81572);
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
            aVar2.f44749a = R.raw.icon_2pt_arrow_to_bottom;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f124191a = new c();

        static {
            Covode.recordClassIndex(81573);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.f159897h);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44782h = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44781g = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 24.0f, system3.getDisplayMetrics()));
            return z.f158842a;
        }
    }
}

package com.ss.android.ugc.aweme.share.improve.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.m;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public class a extends com.ss.android.ugc.aweme.sharer.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3205a f123823a = new C3205a((byte) 0);

    static {
        Covode.recordClassIndex(81265);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public String a() {
        return "download";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(com.ss.android.ugc.aweme.sharer.l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(n nVar, Context context) {
        l.d(nVar, "");
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public String b() {
        return "download";
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.a$a  reason: collision with other inner class name */
    public static final class C3205a {
        static {
            Covode.recordClassIndex(81266);
        }

        private C3205a() {
        }

        public /* synthetic */ C3205a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public Drawable a(Context context) {
        if (context != null) {
            return i.a(com.bytedance.tux.c.c.a(b.f123824a).a(context), f.a(c.f123825a).a(context));
        }
        return null;
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123824a = new b();

        static {
            Covode.recordClassIndex(81267);
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

    static final class c extends h.f.b.m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f123825a = new c();

        static {
            Covode.recordClassIndex(81268);
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
            eVar2.f44776b = Integer.valueOf((int) R.attr.f159902m);
            eVar2.f44780f = Integer.valueOf((int) R.attr.bc);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44778d = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44782h = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            eVar2.f44781g = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 24.0f, system4.getDisplayMetrics()));
            return z.f158842a;
        }
    }
}

package com.ss.android.ugc.aweme.ecommerce.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87617a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(55078);
    }

    public static Drawable a(Context context) {
        l.d(context, "");
        return f.a(new C2116a(context)).a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.a$a  reason: collision with other inner class name */
    public static final class C2116a extends m implements b<e, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $solidId = R.color.u;
        final /* synthetic */ int $strokeColorId = R.color.bh;

        static {
            Covode.recordClassIndex(55079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2116a(Context context) {
            super(1);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            eVar2.f44775a = Integer.valueOf(androidx.core.content.b.c(this.$context, this.$solidId));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44778d = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics())));
            eVar2.f44779e = Integer.valueOf(androidx.core.content.b.c(this.$context, this.$strokeColorId));
            return z.f158842a;
        }
    }
}

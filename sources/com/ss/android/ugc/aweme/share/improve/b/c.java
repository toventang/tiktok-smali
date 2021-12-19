package com.ss.android.ugc.aweme.share.improve.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.share.improve.a.k;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.n;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123828b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final k f123829c;

    /* renamed from: d  reason: collision with root package name */
    private final SharePackage f123830d;

    static {
        Covode.recordClassIndex(81272);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "download";
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(n nVar, Context context) {
        l.d(nVar, "");
        l.d(context, "");
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81273);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean c() {
        if (!this.f123829c.f()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        String string = d.a().getString(this.f123829c.b());
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context == null) {
            return null;
        }
        if (com.ss.android.ugc.aweme.im.service.c.k.d()) {
            return super.a(context);
        }
        return com.bytedance.tux.c.c.a(b.f123831a).a(context);
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123831a = new b();

        static {
            Covode.recordClassIndex(81274);
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
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.a, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        this.f123829c.a(context, this.f123830d);
        return true;
    }
}

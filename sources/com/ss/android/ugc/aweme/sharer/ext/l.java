package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.facebook.m;
import com.ss.android.ugc.aweme.sharer.f;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

public final class l extends f {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sharer.a.a f124546a;

    static {
        Covode.recordClassIndex(81832);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "messenger";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Messenger";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f
    public final String e() {
        return "com.facebook.orca";
    }

    private final void f() {
        if (!m.a()) {
            m.a(this.f124546a.a());
        }
    }

    static final class a extends h.f.b.m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124547a = new a();

        static {
            Covode.recordClassIndex(81833);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_color_messenger_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(a.f124547a).a(context);
        }
        return null;
    }

    public l(com.ss.android.ugc.aweme.sharer.a.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f124546a = aVar;
        if (!com.ss.android.ugc.aweme.sharer.ext.a.a.a() && !m.a()) {
            m.a(aVar.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(context, "");
        f();
        if (com.facebook.internal.m.a(context, "com.facebook.orca")) {
            return super.a(mVar, context);
        }
        com.facebook.messenger.a.a(context);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.l lVar, Context context) {
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(context, "");
        f();
        com.facebook.messenger.a.a(this.f124546a.a(), com.facebook.messenger.b.a(lVar.f124575b, "image/*").a());
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(n nVar, Context context) {
        h.f.b.l.d(nVar, "");
        h.f.b.l.d(context, "");
        f();
        com.facebook.messenger.a.a(this.f124546a.a(), com.facebook.messenger.b.a(nVar.f124583b, "video/*").a());
        return true;
    }
}

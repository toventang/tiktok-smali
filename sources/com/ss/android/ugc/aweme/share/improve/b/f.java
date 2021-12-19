package com.ss.android.ugc.aweme.share.improve.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.qrcode.j;
import com.ss.android.ugc.aweme.sharer.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123839a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123840b;

    static {
        Covode.recordClassIndex(81279);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "qr_code";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81280);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        String b2 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.f6w);
        l.b(b2, "");
        return b2;
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123841a = new b();

        static {
            Covode.recordClassIndex(81281);
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
            aVar2.f44749a = R.raw.icon_color_qr_code_circle;
            return z.f158842a;
        }
    }

    public f(Aweme aweme) {
        l.d(aweme, "");
        this.f123840b = aweme;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(b.f123841a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(h hVar, Context context) {
        String desc;
        String str = "";
        l.d(hVar, str);
        l.d(context, str);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//qrcodev2");
        j.a aVar = new j.a();
        String aid = this.f123840b.getAid();
        aVar.f119753a.type = 1;
        aVar.f119753a.objectId = aid;
        aVar.f119753a.isHashTag = false;
        aVar.f119753a.hashTagName = str;
        aVar.f119753a.enterFrom = "video";
        Aweme aweme = this.f123840b;
        if (aweme == null) {
            desc = str;
        } else {
            desc = aweme.getDesc();
        }
        Aweme aweme2 = this.f123840b;
        if (!(aweme2 == null || aweme2.getAuthor() == null)) {
            str = aweme2.getAuthor().getNickname();
        }
        aVar.f119753a.title = desc;
        aVar.f119753a.describe = str;
        buildRoute.withParam("extra_params", aVar.f119753a).open();
        return true;
    }
}

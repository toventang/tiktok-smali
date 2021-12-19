package com.ss.android.ugc.aweme.share.improve.b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.utils.gy;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f123832c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.service.share.b f123833a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f123834b;

    /* renamed from: d  reason: collision with root package name */
    private final SharePackage f123835d;

    /* renamed from: e  reason: collision with root package name */
    private final String f123836e;

    /* renamed from: f  reason: collision with root package name */
    private final int f123837f;

    static {
        Covode.recordClassIndex(81275);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "chat_merge";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81276);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        String b2 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.fu_);
        l.b(b2, "");
        return b2;
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123838a = new b();

        static {
            Covode.recordClassIndex(81277);
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
            aVar2.f44749a = R.raw.icon_color_direct_message_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(b.f123838a).a(context);
        }
        return null;
    }

    private d(SharePackage sharePackage, String str) {
        com.ss.android.ugc.aweme.im.service.share.b bVar;
        com.ss.android.ugc.aweme.im.service.j.c shareService;
        l.d(sharePackage, "");
        l.d(str, "");
        this.f123835d = sharePackage;
        this.f123836e = str;
        this.f123837f = R.style.wk;
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (createIIMServicebyMonsterPlugin == null || (shareService = createIIMServicebyMonsterPlugin.getShareService()) == null) {
            bVar = null;
        } else {
            bVar = shareService.a(new com.ss.android.ugc.aweme.im.service.share.b.c(com.bytedance.ies.ugc.appcontext.d.a(), sharePackage));
        }
        this.f123833a = bVar;
        this.f123834b = true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(h hVar, Context context) {
        l.d(hVar, "");
        l.d(context, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            com.ss.android.ugc.aweme.login.c.a(com.ss.android.ugc.aweme.share.improve.c.b.a(context), this.f123836e, "click_shareim_button");
            return true;
        } else if (IMUnder16ProxyImpl.n().c()) {
            IMUnder16ProxyImpl.n().h();
            return true;
        } else {
            Activity a2 = com.ss.android.ugc.aweme.share.improve.c.b.a(context);
            if (a2 == null) {
                return false;
            }
            if (!this.f123834b) {
                new com.bytedance.tux.g.b(a2).e(R.string.fki).b();
                return true;
            }
            com.ss.android.ugc.aweme.im.service.j.c shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            if (shareService != null) {
                e.b bVar = new e.b();
                bVar.n = this.f123835d;
                Dialog a3 = shareService.a(a2, bVar.a(), null, this.f123837f, null);
                if (a3 != null) {
                    a3.show();
                }
            }
            ai.a("chat_merge");
            long j2 = this.f123835d.f124595i.getLong("ad_id");
            if (j2 != 0) {
                Aweme e2 = AwemeService.b().e(String.valueOf(j2));
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(e2)) {
                    j.p(context, e2);
                    l.b(e2, "");
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "share", e2.getAwemeRawAd()).a("anchor_id", gy.b(e2)).a("room_id", gy.a(e2)).c();
                }
            }
            return true;
        }
    }

    public /* synthetic */ d(SharePackage sharePackage, String str, byte b2) {
        this(sharePackage, str);
    }
}

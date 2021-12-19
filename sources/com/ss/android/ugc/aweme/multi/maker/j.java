package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.metrics.ac;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;

public class j extends o implements i, org.greenrobot.eventbus.j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f110964d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private String f110965e = "Resso";

    /* renamed from: f  reason: collision with root package name */
    private final String f110966f = "";

    /* renamed from: g  reason: collision with root package name */
    private d f110967g;

    static {
        Covode.recordClassIndex(71199);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(309, new g(j.class, "onH5Finish", com.ss.android.ugc.aweme.crossplatform.b.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71200);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Context context, String str) {
            l.d(context, "");
            l.d(str, "");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                context.getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final com.ss.android.ugc.aweme.multi.c i() {
        return new j();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public int k() {
        return ab.ANCHOR_RESSO.getTYPE();
    }

    private final String u() {
        String str;
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        String a2 = com.ss.android.ugc.aweme.miniapp.a.a.a(str);
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        if (a.a(r(), "com.moonvideo.android.resso")) {
            return "h5_page";
        }
        return "other_app";
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n() {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.maker.j.n():boolean");
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final com.ss.android.ugc.aweme.multi.g a(List<AnchorCommonStruct> list) {
        l.d(list, "");
        if (!n()) {
            return com.ss.android.ugc.aweme.multi.g.NOT_FOUND;
        }
        return super.a(list);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(d dVar) {
        l.d(dVar, "");
        r.a("multi_anchor_entrance_click", e(dVar).f66730a);
        r.a("anchor_entrance_click", t().f66730a);
    }

    private final d e(d dVar) {
        String authorUid = o().getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        d a2 = dVar.a("author_id", authorUid);
        String aid = o().getAid();
        if (aid == null) {
            aid = "";
        }
        d a3 = a2.a("group_id", aid).a("enter_from", p()).a("music_id", ac.d(o()));
        l.b(a3, "");
        return a3;
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(d dVar) {
        l.d(dVar, "");
        r.a("multi_anchor_entrance_show", e(dVar).f66730a);
        r.a("anchor_entrance_show", t().a("external_label_id", u()).f66730a);
    }

    static final class c extends m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ d $eventMapBuilder;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(71202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar, d dVar) {
            super(1);
            this.this$0 = jVar;
            this.$eventMapBuilder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            l.d(anchorCommonStruct2, "");
            if (a.a(this.this$0.r(), "com.moonvideo.android.resso")) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.addCategory("android.intent.category.DEFAULT");
                if (Build.VERSION.SDK_INT >= 23) {
                    intent.setData(Uri.parse(anchorCommonStruct2.getUniversalLink()));
                } else {
                    intent.setData(Uri.parse(anchorCommonStruct2.getDeepLink()));
                    l.b(intent.setPackage("com.moonvideo.android.resso"), "");
                }
                Activity r = this.this$0.r();
                com.ss.android.ugc.tiktok.security.a.a.a(intent, r);
                r.startActivity(intent);
            } else {
                j jVar = this.this$0;
                jVar.a(new b(jVar, this.$eventMapBuilder));
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        String str;
        String schema;
        l.d(dVar, "");
        this.f110967g = dVar;
        l.d(dVar, "");
        a(new c(this, dVar));
        if (m.a.a(r(), "com.moonvideo.android.resso")) {
            str = "other_app";
        } else {
            AnchorCommonStruct anchorCommonStruct = this.f110994h;
            if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null || !p.b(schema, "aweme://lynxview/", false)) {
                str = "webview";
            } else {
                str = "lynx";
            }
        }
        r.a("enter_multi_anchor_detail", e(dVar).a("click_type", str).f66730a);
        r.a("enter_anchor_detail", t().a("click_type", str).a("external_label_id", u()).f66730a);
    }

    @org.greenrobot.eventbus.r
    public final void onH5Finish(com.ss.android.ugc.aweme.crossplatform.b.d dVar) {
        Map<String, String> map;
        l.d(dVar, "");
        r.a("anchor_stay_time", t().a("duration", dVar.f78593a).f66730a);
        d t = t();
        d dVar2 = this.f110967g;
        if (dVar2 == null || (map = dVar2.f66730a) == null) {
            map = ag.a();
        }
        r.a("multi_anchor_stay_time", t.a(new HashMap<>(map)).a("duration", dVar.f78593a).f66730a);
        EventBus.a().b(this);
    }

    static final class b extends h.f.b.m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ d $eventMapBuilder;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(71201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, d dVar) {
            super(1);
            this.this$0 = jVar;
            this.$eventMapBuilder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x011e, code lost:
            if (r3 != null) goto L_0x00a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0044, code lost:
            if (r7 == null) goto L_0x0046;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r9) {
            /*
            // Method dump skipped, instructions count: 397
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.maker.j.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(com.ss.android.ugc.aweme.multi.d dVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar, com.ss.android.ugc.aweme.anchor.multi.a.a aVar) {
        l.d(dVar, "");
        l.d(cVar, "");
        l.d(aVar, "");
        super.a(dVar, cVar, aVar);
        if (!n()) {
            dVar.f110896a.remove(this);
            int g2 = dVar.g();
            if (g2 == 0) {
                cVar.c();
            } else if (g2 != 1) {
                cVar.c();
                aVar.b(dVar, cVar);
            } else {
                cVar.c();
                aVar.a(dVar, cVar);
            }
        }
    }
}

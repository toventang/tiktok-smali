package com.ss.android.ugc.aweme.prop.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.ReuseStickerUpdateSP;
import com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PropReuseServiceImpl implements IPropReuseService {

    /* renamed from: a  reason: collision with root package name */
    private final h f118304a = i.a((h.f.a.a) d.f118314a);

    static {
        Covode.recordClassIndex(76825);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final Class<? extends Activity> b() {
        return StickerPropDetailActicity.class;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final com.ss.android.ugc.aweme.common.e.a<Aweme, ?> a() {
        return new com.ss.android.ugc.aweme.prop.c.c();
    }

    static final class d extends m implements h.f.a.a<StickerPropApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f118314a = new d();

        static {
            Covode.recordClassIndex(76829);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StickerPropApi invoke() {
            return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(StickerPropApi.class);
        }
    }

    public static IPropReuseService c() {
        MethodCollector.i(12295);
        Object a2 = com.ss.android.ugc.b.a(IPropReuseService.class, false);
        if (a2 != null) {
            IPropReuseService iPropReuseService = (IPropReuseService) a2;
            MethodCollector.o(12295);
            return iPropReuseService;
        }
        if (com.ss.android.ugc.b.dc == null) {
            synchronized (IPropReuseService.class) {
                try {
                    if (com.ss.android.ugc.b.dc == null) {
                        com.ss.android.ugc.b.dc = new PropReuseServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12295);
                    throw th;
                }
            }
        }
        PropReuseServiceImpl propReuseServiceImpl = (PropReuseServiceImpl) com.ss.android.ugc.b.dc;
        MethodCollector.o(12295);
        return propReuseServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final com.ss.android.ugc.aweme.sticker.model.h a(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.sticker.model.h hVar = ((StickerPropApi) this.f118304a.getValue()).getStickerDetail(str).get();
        l.b(hVar, "");
        return hVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final String a(Context context) {
        l.d(context, "");
        ReuseStickerUpdateSP reuseStickerUpdateSP = (ReuseStickerUpdateSP) new com.bytedance.cukaie.closet.a(new com.bytedance.cukaie.closet.internal.d()).a(context, ReuseStickerUpdateSP.class);
        String c2 = reuseStickerUpdateSP.c();
        Long valueOf = Long.valueOf(reuseStickerUpdateSP.b());
        int a2 = reuseStickerUpdateSP.a();
        if (TextUtils.isEmpty(c2) || valueOf.longValue() == 0 || a2 == 0 || System.currentTimeMillis() - valueOf.longValue() >= 86400000 || com.bytedance.ies.ugc.appcontext.d.e() <= ((long) a2)) {
            c2 = "";
        }
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final boolean a(Aweme aweme) {
        l.d(aweme, "");
        if (aweme.getStickerEntranceInfo() == null || TextUtils.isEmpty(aweme.getStickerEntranceInfo().name)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final aa a(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, com.ss.android.ugc.aweme.feed.param.b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.prop.c.a(aVar, bVar);
    }

    public static final class a implements com.ss.android.ugc.aweme.tools.f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f118305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f118306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f118307c;

        static {
            Covode.recordClassIndex(76826);
        }

        @Override // com.ss.android.ugc.aweme.tools.f.a
        public final void onIntercept(String str, Effect effect) {
            l.d(str, "");
            l.d(effect, "");
            r.a("shoot", new com.ss.android.ugc.aweme.app.f.d().a("shoot_way", "profile_prop").a("shoot_entrance", "profile_prop").a("enter_from", this.f118305a).a("prop_id", effect.getEffectId()).a("creation_id", str).a("author_id", this.f118306b).a("group_id", this.f118307c).f66730a);
        }

        a(String str, String str2, String str3) {
            this.f118305a = str;
            this.f118306b = str2;
            this.f118307c = str3;
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.tools.f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f118308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f118309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f118310c;

        static {
            Covode.recordClassIndex(76827);
        }

        @Override // com.ss.android.ugc.aweme.tools.f.a
        public final void onIntercept(String str, Effect effect) {
            String str2 = "";
            l.d(str, str2);
            l.d(effect, str2);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", this.f118308a).a("prop_id", effect.getEffectId());
            if (!TextUtils.isEmpty(this.f118309b)) {
                str2 = p.b(this.f118309b, new String[]{","}).get(0);
            }
            r.a("shoot", a2.a("giphy_id", str2).a("group_id", this.f118310c).a("creation_id", str).a("enter_from", "prop_page").a("shoot_way", "prop_page").f66730a);
        }

        b(String str, String str2, String str3) {
            this.f118308a = str;
            this.f118309b = str2;
            this.f118310c = str3;
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.tools.f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f118311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f118312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f118313c;

        static {
            Covode.recordClassIndex(76828);
        }

        @Override // com.ss.android.ugc.aweme.tools.f.a
        public final void onIntercept(String str, Effect effect) {
            String str2 = "";
            l.d(str, str2);
            l.d(effect, str2);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "toolstip_click").a("prop_id", this.f118311a).a("group_id", this.f118312b).a("creation_id", str).a("enter_from", "prop_page").a("shoot_way", "reuse_giphy_gif");
            if (!TextUtils.isEmpty(this.f118313c)) {
                str2 = p.b(this.f118313c, new String[]{","}).get(0);
            }
            r.a("shoot", a2.a("giphy_id", str2).f66730a);
        }

        c(String str, String str2, String str3) {
            this.f118311a = str;
            this.f118312b = str2;
            this.f118313c = str3;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void a(Context context, List<String> list, com.ss.android.ugc.aweme.model.a.a aVar, boolean z) {
        com.ss.android.ugc.aweme.prop.a aVar2;
        int i2;
        l.d(context, "");
        l.d(list, "");
        l.d(aVar, "");
        String str = aVar.f110673b;
        if (str == null || str.length() == 0) {
            aVar2 = new com.ss.android.ugc.aweme.prop.a(context);
        } else {
            aVar2 = new com.ss.android.ugc.aweme.prop.a(context, aVar.f110673b);
        }
        String str2 = aVar.f110672a;
        if (!(str2 == null || str2.length() == 0)) {
            aVar2.f118175k = aVar.f110672a;
        }
        if (aVar.f110682k) {
            aVar2.x = aVar.f110682k;
        }
        aVar2.f118175k = aVar.f110672a;
        aVar2.o = aVar.f110677f;
        if (aVar.f110674c != null) {
            Music music = aVar.f110674c;
            if (music == null) {
                l.b();
            }
            aVar2.a(music);
        }
        aVar2.f118168d = aVar.f110683l;
        aVar2.f118177m = aVar.f110675d;
        aVar2.q = aVar.n;
        aVar2.r = aVar.o;
        aVar2.u = aVar.f110680i;
        aVar2.t = aVar.f110679h;
        Integer num = aVar.f110684m;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        aVar2.C = i2;
        aVar2.v = aVar.f110681j;
        aVar2.x = !z;
        aVar2.a(z, new ArrayList<>(list), aVar.f110678g, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void a(Context context, Aweme aweme, String str, String str2, String str3, String str4, int i2) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        com.ss.android.ugc.aweme.prop.a aVar = new com.ss.android.ugc.aweme.prop.a(context, "reuse_giphy_gif");
        aVar.f118177m = "prop_auto";
        aVar.f118168d = str2;
        aVar.o = str3;
        aVar.q = new c(str, str4, str2);
        aVar.a(n.d(str), "homepage_feed", "reuse", false, i2, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void a(Activity activity, ArrayList<g> arrayList, Music music, String str, String str2, String str3, int i2) {
        l.d(activity, "");
        l.d(arrayList, "");
        l.d(str, "");
        if (arrayList.isEmpty() || CommerceStickerServiceImpl.c().b().a(activity, arrayList.get(0), "prop_collection")) {
            return;
        }
        if (AVExternalServiceImpl.a().configService().avsettingsConfig().needLoginBeforeRecord()) {
            com.ss.android.ugc.aweme.login.c.a(activity, "prop_page", "prop_reuse_icon", (Bundle) null, (f) null);
            return;
        }
        com.ss.android.ugc.aweme.prop.a aVar = new com.ss.android.ugc.aweme.prop.a(activity, "profile_prop");
        aVar.f118177m = "prop_auto";
        aVar.o = str;
        aVar.q = new a(str, str2, str3);
        if (music != null && (music instanceof Music)) {
            aVar.a(music);
        }
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().id);
        }
        aVar.a(new ArrayList<>(arrayList2), "profile_prop", "reuse", false, i2, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void a(Activity activity, ArrayList<g> arrayList, String str, Music music, String str2, String str3, int i2, boolean z) {
        l.d(activity, "");
        l.d(arrayList, "");
        l.d(str, "");
        l.d(str2, "");
        if (arrayList.isEmpty() || CommerceStickerServiceImpl.c().b().a(activity, arrayList.get(0), "prop_page")) {
            return;
        }
        if (AVExternalServiceImpl.a().configService().avsettingsConfig().needLoginBeforeRecord()) {
            com.ss.android.ugc.aweme.login.c.a(activity, "prop_page", "prop_reuse_icon", (Bundle) null, (f) null);
            return;
        }
        com.ss.android.ugc.aweme.prop.a aVar = new com.ss.android.ugc.aweme.prop.a(activity, "prop_page");
        aVar.f118177m = "prop_auto";
        aVar.f118168d = str;
        aVar.o = str2;
        aVar.q = new b("prop_feed", str, str3);
        if (music != null) {
            aVar.a(music);
        }
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().id);
        }
        aVar.a(new ArrayList<>(arrayList2), "prop_page", "reuse", false, i2, z);
    }
}

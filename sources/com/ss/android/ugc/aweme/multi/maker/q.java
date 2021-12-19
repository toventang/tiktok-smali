package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;
import com.lynx.tasm.r;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.multi.c;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import java.util.List;

public final class q extends o {

    /* renamed from: d  reason: collision with root package name */
    public static final a f111005d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private boolean f111006e;

    static {
        Covode.recordClassIndex(71231);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71232);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends com.google.gson.b.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(71233);
        }

        b() {
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final c i() {
        return new q();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.TTCM.getTYPE();
    }

    private final void n() {
        String str;
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        l a2 = com.google.gson.q.a(str);
        h.f.b.l.b(a2, "");
        o j2 = a2.j();
        AdLandPagePreloadServiceImpl.f().a().c((List) new f().a(j2.c("gecko_channel"), new b().type));
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(d dVar) {
        h.f.b.l.d(dVar, "");
        this.f111006e = true;
        dVar.a("is_ad_signal", b().a("is_ad_signal"));
        n();
        super.b(dVar);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(d dVar) {
        h.f.b.l.d(dVar, "");
        dVar.a("is_ad_signal", b().a("is_ad_signal"));
        super.c(dVar);
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        String schema;
        String str;
        h.f.b.l.d(dVar, "");
        dVar.a("is_ad_signal", b().a("is_ad_signal"));
        o.a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
            Bundle bundle = new Bundle();
            Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
            AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
            if (anchorCommonStruct2 != null) {
                str = anchorCommonStruct2.getExtra();
            } else {
                str = null;
            }
            repo.storeString("anchor_extra", str);
            repo.storeString("group_id", o().getGroupId());
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            bundle.putBoolean("need_bottom_out", true);
            Uri parse = Uri.parse(schema);
            h.f.b.l.b(parse, "");
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                    bundle.putBoolean("preset_safe_point", true);
                    bundle.putInt("thread_strategy", r.PART_ON_LAYOUT.id());
                }
            }
            Uri.Builder buildUpon = parse.buildUpon();
            o oVar = new o();
            oVar.a("sourcePage", "ttcm_app");
            oVar.a("isRTL", Integer.valueOf(gb.a(r()) ? 1 : 0));
            oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
            buildUpon.appendQueryParameter("lynx_landing_page_data", oVar.toString());
            buildUpon.appendQueryParameter("sourcePage", "ttcm_app");
            Activity r = r();
            String builder = buildUpon.toString();
            h.f.b.l.b(builder, "");
            com.ss.android.ugc.aweme.bullet.b.a(r, builder, null, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(com.ss.android.ugc.aweme.multi.d dVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar, com.ss.android.ugc.aweme.anchor.multi.a.a aVar) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(aVar, "");
        if (!this.f111006e) {
            n();
        }
    }
}

package com.ss.android.ugc.aweme;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.anchor.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multi.c;
import com.ss.android.ugc.aweme.multi.maker.m;
import h.a.n;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class df implements d {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f80033b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final a f80034c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.anchor.multi.a.a f80035a = new com.ss.android.ugc.aweme.multi.a.a();

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.multi.d f80036d;

    /* renamed from: e  reason: collision with root package name */
    private String f80037e;

    public static final class a {
        static {
            Covode.recordClassIndex(49817);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(49816);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.d
    public final boolean a() {
        List<c> list;
        com.ss.android.ugc.aweme.multi.d dVar = this.f80036d;
        if (dVar == null || (list = dVar.f110896a) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.d
    public final void a(com.ss.android.ugc.aweme.base.ui.anchor.c cVar) {
        com.ss.android.ugc.aweme.multi.d dVar;
        l.d(cVar, "");
        if (!f80033b && (dVar = this.f80036d) != null) {
            this.f80035a.c(dVar, cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.d
    public final void b(com.ss.android.ugc.aweme.base.ui.anchor.c cVar) {
        l.d(cVar, "");
        com.ss.android.ugc.aweme.multi.d dVar = this.f80036d;
        if (dVar != null) {
            c cVar2 = (c) n.h((List) dVar.f110896a);
            if (cVar2 != null && ((cVar2 instanceof com.ss.android.ugc.aweme.multi.maker.l) || (cVar2 instanceof m))) {
                r.a("rd_tiktokec_shop_multi_anchor_show", new com.ss.android.ugc.aweme.app.f.d().a("where", "TagMultiHandler").a("presenter_name", this.f80035a.getClass().getName()).a("maker_name", cVar2.getClass().getName()).a("experiment", "5").a("anchor_count", dVar.g()).a("product_count", cVar2.d()).a("item_id", this.f80037e).f66730a);
            }
            int g2 = dVar.g();
            if (g2 == 0) {
                return;
            }
            if (g2 != 1) {
                this.f80035a.b(dVar, cVar);
            } else {
                this.f80035a.a(dVar, cVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.d
    public final int a(Aweme aweme, Activity activity, String str, JSONObject jSONObject, s<ag> sVar, boolean z, com.ss.android.ugc.aweme.base.ui.anchor.c cVar) {
        int i2;
        l.d(aweme, "");
        l.d(activity, "");
        l.d(str, "");
        l.d(jSONObject, "");
        l.d(cVar, "");
        com.ss.android.ugc.aweme.multi.d dVar = new com.ss.android.ugc.aweme.multi.d(aweme, activity, str, "", jSONObject, sVar, z);
        this.f80037e = aweme.getAid();
        if (dVar.g() == 0) {
            this.f80036d = null;
            i2 = 0;
        } else {
            this.f80036d = dVar;
            i2 = -1000;
        }
        if (f80033b) {
            com.ss.android.ugc.aweme.multi.d dVar2 = this.f80036d;
            if (dVar2 != null) {
                this.f80035a.c(dVar2, cVar);
            }
            f80033b = false;
        }
        return i2;
    }
}

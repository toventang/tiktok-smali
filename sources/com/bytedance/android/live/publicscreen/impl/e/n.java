package com.bytedance.android.live.publicscreen.impl.e;

import android.text.TextUtils;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.impl.api.PublicScreenApi;
import com.bytedance.android.live.publicscreen.impl.model.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import h.f.a.a;

final /* synthetic */ class n implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f12357a;

    /* renamed from: b  reason: collision with root package name */
    private final f f12358b;

    /* renamed from: c  reason: collision with root package name */
    private final k f12359c;

    static {
        Covode.recordClassIndex(6793);
    }

    n(h hVar, f fVar, k kVar) {
        this.f12357a = hVar;
        this.f12358b = fVar;
        this.f12359c = kVar;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        b a2;
        String charSequence;
        h hVar = this.f12357a;
        f fVar = this.f12358b;
        long E = this.f12359c.E();
        if (!(hVar.f12348m == null || hVar.f12348m.f12208l == null)) {
            String str = "anchor";
            String str2 = "user_type";
            if (fVar.s()) {
                fVar.a(false);
                hVar.c(fVar);
                b a3 = b.a.a("livesdk_undo_translate_comment").a(hVar.f12348m.f12208l);
                if (!hVar.f12348m.f12205i) {
                    str = "user";
                }
                a2 = a3.a(str2, str);
                str2 = "click_icon";
                str = "undo_translate";
            } else if (!TextUtils.isEmpty(fVar.t())) {
                fVar.a(true);
                hVar.c(fVar);
                a2 = b.a.a("livesdk_translate_comment_click").a(hVar.f12348m.f12208l);
                if (!hVar.f12348m.f12205i) {
                    str = "user";
                }
            } else if (!fVar.c()) {
                fVar.b(true);
                hVar.c(fVar);
                PublicScreenApi publicScreenApi = (PublicScreenApi) e.a().a(PublicScreenApi.class);
                if (fVar.u() == null) {
                    charSequence = "";
                } else {
                    charSequence = fVar.u().toString();
                }
                ((z) publicScreenApi.translateComment(charSequence, hVar.f12348m.f12199c).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(hVar.f12348m.f12201e))).a(new o(hVar, fVar, E), new p(hVar, fVar, E));
                b a4 = b.a.a("livesdk_translate_comment_click").a(hVar.f12348m.f12208l);
                if (!hVar.f12348m.f12205i) {
                    str = "user";
                }
                a4.a(str2, str).a("to_user_id", E).b();
            }
            a2.a(str2, str).a("to_user_id", E).b();
        }
        return h.z.f158842a;
    }
}

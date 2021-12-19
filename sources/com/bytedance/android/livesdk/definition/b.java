package com.bytedance.android.livesdk.definition;

import android.content.Context;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.i.a.d;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.definition.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.Iterator;
import java.util.List;

public class b implements com.bytedance.android.live.d.b {
    static {
        Covode.recordClassIndex(9393);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.d.b
    public boolean isAudienceLowestDefinition() {
        d dVar = (d) n.j((List) e.a());
        if (dVar != null) {
            return dVar.f16934c;
        }
        return false;
    }

    @Override // com.bytedance.android.live.d.b
    public void reportAnchorDefinitionBtnShow() {
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_anchor_definition_selection_btn_show");
        f b2 = u.a().b();
        l.b(b2, "");
        a2.a("anchor_id", b2.c()).a("screen_share").b();
    }

    @Override // com.bytedance.android.live.d.b
    public p<String, String> getNextLowerLevelDefinition() {
        List<d> a2 = e.a();
        Iterator<T> it = a2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (a2.get(i2).f16934c && i3 < a2.size()) {
                return new p<>(a2.get(i3).b(), a2.get(i3).a());
            }
            i2 = i3;
        }
        return null;
    }

    @Override // com.bytedance.android.live.d.b
    public void reportAudienceRotateBtnShow(String str) {
        l.d(str, "");
        l.d(str, "");
        b.a.a("livesdk_user_screen_rotate_btn_show").a("anchor_id", a.b()).a("room_id", str).b();
    }

    @Override // com.bytedance.android.live.d.b
    public void showDefinitionSelectionDialog(Context context, boolean z) {
        c.a.a(context, z);
    }

    @Override // com.bytedance.android.live.d.b
    public void reportAudienceDefinitionBtnShow(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        a.a(str, str2, str3);
    }

    @Override // com.bytedance.android.live.d.b
    public void reportAudienceRotateBtnClick(String str, long j2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str, "");
        l.d(str2, "");
        b.a.a("livesdk_user_screen_rotate_btn_click").a("anchor_id", a.b()).a("room_id", str).a("room_orientation_after", str2).a("duration", String.valueOf((System.currentTimeMillis() - j2) / 1000)).b();
    }

    @Override // com.bytedance.android.live.d.b
    public void reportAudienceDefinitionTipsShow(String str, String str2, String str3) {
        String g2;
        String str4 = "";
        l.d(str, str4);
        l.d(str2, str4);
        l.d(str3, str4);
        l.d(str, str4);
        l.d(str2, str4);
        l.d(str3, str4);
        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
        l.b(fVar, str4);
        EnterRoomLinkSession a2 = fVar.a();
        l.b(a2, str4);
        String str5 = a2.f23354b.f23299c.E;
        if (str5 == null) {
            str5 = str4;
        }
        a a3 = com.bytedance.android.live.t.a.a(d.class);
        l.b(a3, str4);
        k b2 = ((d) a3).getLivePlayControllerManager().b(str5);
        if (!(b2 == null || (g2 = b2.g()) == null)) {
            str4 = g2;
        }
        b.a.a("livesdk_live_definition_switch_show").a("anchor_id", a.b()).a("room_id", str).a("room_orientation", str3).a("current_definition", str4).a(str2).b();
    }

    @Override // com.bytedance.android.live.d.b
    public void reportAudienceDefinitionDialogSelectSuccess(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        a.a(str, str2, str3, str4, str5, str6, str7);
    }
}

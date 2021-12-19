package com.ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class FreeDataCell extends FreeDataCommonCell<b> {

    /* renamed from: a  reason: collision with root package name */
    public b f122459a;

    static {
        Covode.recordClassIndex(80310);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell, com.ss.android.ugc.aweme.setting.page.datasave.zerorating.FreeDataCommonCell
    public final /* synthetic */ void a(b bVar) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        super.a((a) bVar2);
        this.f122459a = bVar2;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.b9x);
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.b9u);
        l.b(tuxTextView, "");
        tuxTextView.setText(bVar2.f122465a);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(bVar2.f122466b);
        ((SimpleDraweeView) this.itemView.findViewById(R.id.b9v)).setImageURI(bVar2.f122467c);
    }

    public final void onClick(View view) {
        String str;
        View view2 = this.itemView;
        l.b(view2, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(view2.getContext(), "aweme://webview");
        b bVar = this.f122459a;
        String str2 = null;
        if (bVar != null) {
            str = bVar.f122469e;
        } else {
            str = null;
        }
        buildRoute.withParam("url", str).open();
        JSONObject jSONObject = new JSONObject();
        try {
            b bVar2 = this.f122459a;
            if (bVar2 != null) {
                str2 = bVar2.f122468d;
            }
            jSONObject.put("plan_id", str2);
            jSONObject.put("enter_from", "zero_rating");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        r.a("data_plan_click", jSONObject);
    }
}

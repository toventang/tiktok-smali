package com.ss.android.ugc.aweme.multi.maker;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.multi.c;
import h.f.b.l;
import org.json.JSONObject;

public final class b extends o {
    static {
        Covode.recordClassIndex(71172);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final boolean j() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        return "app_page";
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final c i() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.DONATION_STICKER.getTYPE();
    }

    private final String n() {
        String str;
        boolean z;
        if (this.f110994h == null) {
            return "";
        }
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        String str2 = null;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
            if (anchorCommonStruct2 != null) {
                str2 = anchorCommonStruct2.getExtra();
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.optLong("linked_effect_id", 0) > 0) {
                return String.valueOf(jSONObject.optLong("linked_effect_id"));
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    private final Integer u() {
        String str;
        boolean z;
        if (this.f110994h != null) {
            AnchorCommonStruct anchorCommonStruct = this.f110994h;
            String str2 = null;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getExtra();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
                    if (anchorCommonStruct2 != null) {
                        str2 = anchorCommonStruct2.getExtra();
                    }
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.optInt("ngo_id", 0) > 0) {
                        return Integer.valueOf(jSONObject.optInt("ngo_id"));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        String str;
        String str2 = "";
        l.d(dVar, str2);
        a(dVar, true, false);
        SmartRoute withParam = SmartRouter.buildRoute(r(), "aweme://donation/pannel").withParam("enter_method", "anchor_click").withParam("enter_from", p()).withParam("aweme_id", o().getAid());
        String optString = s().optString("request_id");
        if (optString != null) {
            str2 = optString;
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str2);
        SmartRoute withParam2 = withParam.withParam("log_pb", ac.a.f91473a.a(logPbBean)).withParam("sticker_id", n()).withParam("ngo_id", u());
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getKeyword();
        } else {
            str = null;
        }
        withParam2.withParam("ngo_name", str).open();
    }
}

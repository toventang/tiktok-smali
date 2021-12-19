package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.google.gson.f;
import com.ss.android.sdk.webview.d;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod;
import com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.h;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.ss.android.ugc.d.a.c;
import org.json.JSONException;
import org.json.JSONObject;

public class BroadcastMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57251);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public BroadcastMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        try {
            a(d.a((Context) this.mContextRef.get()), jSONObject, this.mJsBridge, null);
            aVar.a("");
        } catch (JSONException e2) {
            aVar.a(-1, "");
            e2.printStackTrace();
        }
    }

    public static void a(Context context, JSONObject jSONObject, a aVar, com.bytedance.ies.bullet.c.c.i iVar) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        c.a(new j("notification", jSONObject));
        c.a(new com.ss.android.ugc.aweme.ad.c.a("notification", jSONObject));
        c.a(new com.ss.android.ugc.aweme.bullet.c.a("notification", jSONObject));
        b.h().notifyFromRnAndH5(jSONObject);
        h.f121133a.a(jSONObject);
        if (TextUtils.equals(jSONObject.getString("eventName"), "activity_view")) {
            com.ss.android.ugc.aweme.profile.c.a().a(jSONObject.getJSONObject("data"));
            com.ss.android.ugc.aweme.profile.c.a().a(false);
            com.ss.android.ugc.aweme.profile.c.a().b(false);
            com.ss.android.ugc.aweme.profile.c.a().f();
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "music_feedback_send_success")) {
            c.a(new com.ss.android.ugc.aweme.music.f.c());
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "anchor_TCM_content") && (optJSONObject2 = jSONObject.optJSONObject("data")) != null) {
            if (com.ss.android.ugc.aweme.tcm.impl.e.a.a()) {
                com.ss.android.ugc.aweme.tcm.api.b.a.a(optJSONObject2.optString("campaignInfo"));
            } else {
                com.ss.android.ugc.aweme.tcm.api.b.c.a(optJSONObject2.optString("campaignInfo"));
            }
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "branded_content_type") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            if (com.ss.android.ugc.aweme.tcm.impl.e.a.a()) {
                com.ss.android.ugc.aweme.tcm.api.b.a.b(optJSONObject.optString("branded_content_type"));
            } else {
                com.ss.android.ugc.aweme.tcm.api.b.c.b(optJSONObject.optString("branded_content_type"));
            }
            if (TextUtils.equals(optJSONObject.optString("branded_content_type"), "0")) {
                com.ss.android.ugc.aweme.tcm.api.b.a.a((TagBAUser) null);
            }
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "bc_on_creator_tag_BA")) {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
            if (optJSONObject3 != null) {
                try {
                    com.ss.android.ugc.aweme.tcm.api.b.a.a((TagBAUser) new f().a(optJSONObject3.toString(), new com.google.gson.b.a<TagBAUser>() {
                        /* class com.ss.android.ugc.aweme.fe.method.BroadcastMethod.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(57252);
                        }
                    }.type));
                } catch (Exception unused) {
                }
            }
            com.ss.android.ugc.aweme.tcm.api.b.a.a((TagBAUser) null);
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "bc_pop_music_alert")) {
            TcmServiceImpl.j().a(context, aVar, iVar);
        }
        BroadcastMethod.a.a(jSONObject);
        if (TextUtils.equals(jSONObject.getString("eventName"), "userBlockSuccess")) {
            IMService.createIIMServicebyMonsterPlugin(false).onBlockUserSuccessEvent();
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "_dou_ad_create_tcm_order")) {
            User curUser = b.g().getCurUser();
            ProfileServiceImpl.g().queryUser(ProfileServiceImpl.g().userUrl(curUser.getSecUid(), curUser.getUid(), curUser.getUniqueId(), 0), true, "");
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "live-link-pin") || TextUtils.equals(jSONObject.getString("eventName"), "live-link-card")) {
            CommercializeLiveServiceImpl.a().a(jSONObject);
        }
    }
}

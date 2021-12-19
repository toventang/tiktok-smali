package com.ss.android.ugc.aweme.im;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.helper.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.im.g;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.ss.android.ugc.aweme.im.service.a.c;
import com.ss.android.ugc.aweme.im.service.b;
import com.ss.android.ugc.aweme.im.service.e;
import com.ss.android.ugc.aweme.im.service.model.i;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.j;
import com.ss.android.ugc.aweme.main.l;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.notice.api.e.t;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.settingsrequest.f;
import com.ss.android.ugc.aweme.utils.cy;
import com.ss.android.ugc.aweme.utils.gw;
import h.f.a.a;
import java.util.Map;
import org.json.JSONObject;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f100080a;

    static {
        Covode.recordClassIndex(63781);
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final com.ss.android.ugc.aweme.im.service.d getFamiliarProxy() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final boolean isEnableShowTeenageTip() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void openNotificationSetting(Context context, String str) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void sendShareOverEvent(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final Dialog showShareCompleteTipsDialog(Activity activity, String str, a aVar, a aVar2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final boolean isNeedToContinuePlayInAct() {
        return this.f100080a;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final boolean enableIM() {
        return a.a();
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final IIMunder16Proxy getUnder16Proxy() {
        return IMUnder16ProxyImpl.n();
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final String getLastWsConnectUrl() {
        return t.f112753j.a().f112756c;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final boolean enableSendPic() {
        if (SharePrefCache.inst().getCanImSendPic().c().intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final i getIMSetting() {
        f a2 = f.a();
        if (a2.f123223a == null) {
            return SettingsRequestServiceImpl.i().b();
        }
        return a2.f123223a;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final String getEnterFrom() {
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 instanceof MainActivity) {
            return ((MainActivity) j2).getEnterFrom();
        }
        if (j2 instanceof com.ss.android.ugc.aweme.base.f) {
            return ((com.ss.android.ugc.aweme.base.f) j2).c();
        }
        if (!(j2 instanceof com.bytedance.ies.powerpage.a)) {
            return "";
        }
        Fragment rootFragment = ((com.bytedance.ies.powerpage.a) j2).getRootFragment();
        if (rootFragment instanceof com.ss.android.ugc.aweme.base.f) {
            return ((com.ss.android.ugc.aweme.base.f) rootFragment).c();
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final boolean canShowInnerNotification() {
        Aweme a2;
        g.a.a();
        Activity c2 = g.a().c();
        if (c2 == null) {
            return false;
        }
        String localClassName = c2.getLocalClassName();
        if (TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.live.LivePlayActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.live.LiveBroadcastActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.account.login.I18nSignUpActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity")) {
            return false;
        }
        Fragment a3 = cy.a(c2);
        if (a3 != null && TextUtils.equals(a3.getClass().getName(), "com.ss.android.ugc.aweme.im.sdk.module.session.SessionListFragment")) {
            return false;
        }
        g.a.a();
        if (g.a().a()) {
            return false;
        }
        if (((!(c2 instanceof j) || !(((j) c2).getCurFragment() instanceof l)) && !(c2 instanceof DetailActivity)) || (a2 = AwemeChangeCallBack.a((androidx.fragment.app.e) c2)) == null || !a2.isAd()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void setIMAwemeProvider(b bVar) {
        ae.f95299d = bVar;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void setNeedToContinueToPlay(boolean z) {
        this.f100080a = z;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void registerAppStateCallback(al alVar) {
        com.ss.android.ugc.aweme.i.a.c().a(alVar);
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final ViewGroup getCurrentDecorView(Activity activity) {
        g.a.a();
        return g.a().a(activity);
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void registerWsListener(com.bytedance.common.wschannel.app.e eVar) {
        t a2 = t.f112753j.a();
        h.f.b.l.d(eVar, "");
        a2.f112758e.add(eVar);
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void updateApk(Context context) {
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse("https://go.onelink.me/bIdt/409f077"));
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void monitorMsgSendStatus(Map<String, String> map) {
        try {
            int parseInt = Integer.parseInt(map.get("success_cnt"));
            while (true) {
                int i2 = parseInt - 1;
                if (parseInt <= 0) {
                    break;
                }
                com.bytedance.apm.b.a("aweme_im_message_error_rate", 0, (JSONObject) null);
                parseInt = i2;
            }
            int parseInt2 = Integer.parseInt(map.get("fail_cnt"));
            while (true) {
                int i3 = parseInt2 - 1;
                if (parseInt2 > 0) {
                    com.bytedance.apm.b.a("aweme_im_message_error_rate", 1, (JSONObject) null);
                    parseInt2 = i3;
                } else {
                    return;
                }
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void setSharePlayer(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            if (objArr[0] != null && (objArr[0] instanceof com.ss.android.ugc.aweme.im.service.f)) {
                h.a().f93338a = (com.ss.android.ugc.aweme.video.i) ((com.ss.android.ugc.aweme.im.service.f) objArr[0]).a();
            }
            if (objArr[1] != null && (objArr[1] instanceof Long) && ((Long) objArr[1]).longValue() > 0) {
                h.a().f93340c = 0;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void feedbackIm(String str, String str2) {
        RuntimeBehaviorServiceImpl.c().a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void putSecUidToMap(String str, String str2) {
        gw.a().a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void popCaptcha(Activity activity, int i2, final c cVar) {
        SecApiImpl.a().popCaptcha(activity, i2, new com.ss.android.ugc.aweme.secapi.a() {
            /* class com.ss.android.ugc.aweme.im.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(63782);
            }

            @Override // com.ss.android.ugc.aweme.secapi.a
            public final void a() {
                c cVar = cVar;
                if (cVar != null) {
                    cVar.a();
                }
            }

            @Override // com.ss.android.ugc.aweme.secapi.a
            public final void a(boolean z, int i2) {
                c cVar = cVar;
                if (cVar != null) {
                    cVar.a(z, "");
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (r5 == null) goto L_0x0083;
     */
    @Override // com.ss.android.ugc.aweme.im.service.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void openUrl(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.d.openUrl(android.content.Context, java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public final void enterDetailActivity(Context context, String str, String str2, String str3, int i2, int i3, String str4, View view, Bundle bundle) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("refer", str2);
        intent.putExtra("video_from", str3);
        intent.putExtra("profile_enterprise_type", i2);
        intent.putExtra("page_type", i3);
        intent.putExtra("enter_method", bundle.getString("enter_method", null));
        if (str4 != null) {
            intent.putExtra("userid", str4);
        }
        intent.putExtra("key_from_chat_room_playing", bundle.getBoolean("key_from_chat_room_playing"));
        intent.putExtra("key_from_chat_room_real_aid", bundle.getString("key_from_chat_room_real_aid"));
        intent.putExtra("message", bundle.getSerializable("message"));
        String string = bundle.getString("cid");
        if (!TextUtils.isEmpty(string)) {
            intent.putExtra("cid", string);
            intent.putExtra("id", bundle.getString("realItemId"));
        }
        if (view == null) {
            try {
                DetailActivity.a(context, intent);
            } catch (Exception unused) {
                DetailActivity.a(context, intent);
            }
        } else {
            androidx.core.app.a.a(context, intent, androidx.core.app.b.b(view, view.getWidth(), view.getHeight()).a());
        }
        r.a("feed_enter", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "chat").a("group_id", str).f66730a);
    }
}

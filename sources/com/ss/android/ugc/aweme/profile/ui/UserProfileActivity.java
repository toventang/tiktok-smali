package com.ss.android.ugc.aweme.profile.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.a.a;
import com.ss.android.ugc.aweme.base.a.g;
import com.ss.android.ugc.aweme.base.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout;
import com.ss.android.ugc.aweme.profile.arg.UserProfileArg;
import com.ss.android.ugc.aweme.profile.presenter.ac;
import com.ss.android.ugc.aweme.profile.presenter.v;
import com.ss.android.ugc.aweme.profile.ui.d.b;
import com.ss.android.ugc.aweme.profile.ui.d.d;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class UserProfileActivity extends ak implements g, f, v {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f116823a;

    /* renamed from: b  reason: collision with root package name */
    SlideSwitchLayout f116824b;

    /* renamed from: c  reason: collision with root package name */
    protected DmtStatusView f116825c;

    /* renamed from: d  reason: collision with root package name */
    private UserProfileArg f116826d;

    /* renamed from: e  reason: collision with root package name */
    private Aweme f116827e;

    /* renamed from: f  reason: collision with root package name */
    private ac f116828f;

    /* renamed from: g  reason: collision with root package name */
    private String f116829g;

    /* renamed from: h  reason: collision with root package name */
    private List<a> f116830h = new ArrayList();

    static {
        Covode.recordClassIndex(75450);
    }

    @Override // com.ss.android.ugc.aweme.base.f
    public final String c() {
        return "others_homepage";
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.v
    public final void d() {
        this.f116825c.d();
        try {
            onBackPressed();
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        com.ss.android.ugc.aweme.push.a.a(this);
        com.ss.android.ugc.aweme.miniapp_api.a.a(this);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", false);
    }

    private void a() {
        i supportFragmentManager = getSupportFragmentManager();
        Fragment a2 = supportFragmentManager.a("userprofilefragment");
        if (a2 == null) {
            a2 = new com.ss.android.ugc.aweme.profile.ui.v2.i();
            a2.setArguments(b());
        }
        supportFragmentManager.a().b(R.id.fja, a2, "userprofilefragment").c();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    private Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("uid", this.f116826d.getUserId());
        bundle.putString("sec_user_id", this.f116826d.getSecUid());
        bundle.putString("profile_from", this.f116826d.getLabel());
        bundle.putString("video_id", this.f116826d.getAid());
        bundle.putString("profile_from", "other_user");
        bundle.putString(StringSet.type, this.f116826d.getType());
        bundle.putString("enter_method", this.f116826d.getEnterMethod());
        bundle.putString("enter_from", this.f116826d.getEnterFrom());
        bundle.putString("position", this.f116826d.getPosition());
        bundle.putString("profile_from_scene", this.f116826d.getProfileFromScene());
        if (!TextUtils.isEmpty(this.f116826d.getPreviousPage())) {
            bundle.putString("extra_previous_page", this.f116826d.getPreviousPage());
        }
        bundle.putString("request_id", this.f116826d.getLiveRequestId());
        bundle.putString("room_id", this.f116826d.getLiveRoomId());
        bundle.putString("room_owner_id", this.f116826d.getLiveRoomOwnerId());
        bundle.putString("user_type", this.f116826d.getLiveType());
        String trackParams = this.f116826d.getTrackParams();
        if (!TextUtils.isEmpty(trackParams)) {
            try {
                bundle.putString("show_window_source", new JSONObject(trackParams).optString("show_window_source"));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        bundle.putBoolean("is_live_record", this.f116826d.isFromLiveRecord());
        bundle.putString("search_request_id", this.f116826d.getSearchRequestId());
        bundle.putBoolean("isFromFeed", false);
        bundle.putString("extra_previous_page_position", a(getIntent(), "extra_previous_page_position"));
        bundle.putString("enter_from_request_id", a(getIntent(), "enter_from_request_id"));
        bundle.putString("scene_id", this.f116826d.getSceneId());
        bundle.putInt("need_track_compare_recommend_reason", getIntent().getIntExtra("need_track_compare_recommend_reason", 0));
        bundle.putString("previous_recommend_reason", a(getIntent(), "previous_recommend_reason"));
        bundle.putString("recommend_from_type", a(getIntent(), "recommend_from_type"));
        bundle.putInt("is_cold_launch", getIntent().getIntExtra("is_cold_launch", 0));
        bundle.putInt("from_recommend_card", getIntent().getIntExtra("from_recommend_card", 0));
        bundle.putString("id", a(getIntent(), "id"));
        bundle.putInt("general_search_card_type", getIntent().getIntExtra("general_search_card_type", 0));
        bundle.putBoolean("is_notify_miniapp_follow_status", getIntent().getBooleanExtra("is_notify_miniapp_follow_status", false));
        bundle.putSerializable("recommend_enter_profile_params", getIntent().getSerializableExtra("recommend_enter_profile_params"));
        bundle.putSerializable("extra_mutual_relation", getIntent().getSerializableExtra("extra_mutual_relation"));
        bundle.putBoolean("extra_from_mutual", getIntent().getBooleanExtra("extra_from_mutual", false));
        bundle.putString("event_keys", a(getIntent(), "event_keys"));
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public void unRegisterActivityOnKeyDownListener(a aVar) {
        List<a> list = this.f116830h;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public void registerActivityOnKeyDownListener(a aVar) {
        if (!this.f116830h.contains(aVar)) {
            this.f116830h.add(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01d6, code lost:
        if (android.text.TextUtils.equals(r9.f116826d.getUserId(), com.ss.android.ugc.aweme.account.b.g().getCurUserId()) != false) goto L_0x015a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x024b  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.profile.ui.ak, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.UserProfileActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.v
    public final void a(String str, String str2) {
        this.f116826d.setUserId(str);
        this.f116826d.setSecUid(str2);
        a();
        this.f116825c.d();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onActivityReenter(int i2, Intent intent) {
        com.ss.android.ugc.aweme.detail.transition.a.a(this, i2);
        if (-1 == i2 && intent != null) {
            String a2 = a(intent, "feed_share_element_aid");
            i supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.a("userprofilefragment") instanceof d) {
                ((d) supportFragmentManager.a("userprofilefragment")).e(a2);
            } else if (supportFragmentManager.a("myprofilefragment") instanceof b) {
                ((b) supportFragmentManager.a("myprofilefragment")).a(a2);
            }
        }
        super.onActivityReenter(i2, intent);
    }

    @Override // com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        for (a aVar : this.f116830h) {
            if (aVar.onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            if (i3 == 2) {
                SlideSwitchLayout slideSwitchLayout = this.f116824b;
                if (slideSwitchLayout != null) {
                    slideSwitchLayout.setCurrentItem("page_profile");
                    return;
                }
                return;
            }
        } else if (i2 == 10086 && i3 == -1) {
            setResult(-1, intent);
            activityConfiguration(cy.f117116a);
            finish();
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }
}

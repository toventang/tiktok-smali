package com.ss.android.ugc.aweme.choosemusic.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.choosemusic.c.ab;
import com.ss.android.ugc.aweme.choosemusic.c.ai;
import com.ss.android.ugc.aweme.choosemusic.c.aj;
import com.ss.android.ugc.aweme.choosemusic.c.z;
import com.ss.android.ugc.aweme.setting.bj;
import com.zhiliaoapp.musically.R;

public class MusicDetailListActivity extends a {
    static {
        Covode.recordClassIndex(43379);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        super.onBackPressed();
        com.ss.android.ugc.aweme.push.a.a(this);
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        int intExtra;
        String str;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.f159928l;
        activityConfiguration(new g(xVar));
        super.onCreate(bundle);
        if (bj.a()) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.bo);
        if (getIntent() != null) {
            String a2 = a(getIntent(), "cid");
            int intExtra2 = getIntent().getIntExtra("music_class_level", 0);
            if (!TextUtils.isEmpty(a2)) {
                intExtra = 2;
            } else {
                intExtra = getIntent().getIntExtra("music_type", 1);
            }
            if (intExtra2 == 1) {
                intExtra = 7;
            }
            int intExtra3 = getIntent().getIntExtra("sound_page_scene", 0);
            switch (intExtra) {
                case 1:
                    str = "hot_music_list";
                    break;
                case 2:
                    str = "music_class_sheet";
                    break;
                case 3:
                    str = "local_music_list";
                    break;
                case 4:
                    str = "tag_music_sheet";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str = "local_music_list_shoot";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str = "local_music_list_edit";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str = "local_second_level_music_list_edit";
                    break;
                default:
                    str = "";
                    break;
            }
            i supportFragmentManager = getSupportFragmentManager();
            Fragment a3 = supportFragmentManager.a(str);
            if (a3 == null) {
                Intent intent = getIntent();
                switch (intExtra) {
                    case 1:
                        a3 = z.a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1), intExtra3);
                        break;
                    case 2:
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        a3 = ai.a(intent, intExtra3);
                        break;
                    case 3:
                        a3 = ab.a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1));
                        break;
                    case 4:
                        int intExtra4 = intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
                        a3 = new aj();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", intExtra4);
                        bundle2.putInt("sound_page_scene", intExtra3);
                        a3.setArguments(bundle2);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        a3 = ab.a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 2));
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        a3 = ab.a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0));
                        break;
                    default:
                        a3 = z.a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1), intExtra3);
                        break;
                }
            }
            n a4 = supportFragmentManager.a();
            a4.b(R.id.b94, a3, str);
            a4.c();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

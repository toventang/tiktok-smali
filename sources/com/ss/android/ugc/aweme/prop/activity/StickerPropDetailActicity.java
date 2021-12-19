package com.ss.android.ugc.aweme.prop.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.base.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.f.e;
import com.ss.android.ugc.aweme.prop.b.j;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StickerPropDetailActicity extends a implements f {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f118214a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private String f118215b;

    /* renamed from: c  reason: collision with root package name */
    private String f118216c;

    /* renamed from: d  reason: collision with root package name */
    private int f118217d;

    /* renamed from: e  reason: collision with root package name */
    private String f118218e;

    static {
        Covode.recordClassIndex(76764);
    }

    @Override // com.ss.android.ugc.aweme.base.f
    public final String c() {
        return "prop_page";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.nd;
        activityConfiguration(new a(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.c8);
        View findViewById = findViewById(R.id.e_f);
        if (findViewById != null) {
            e.b(findViewById);
            o.b(this);
        }
        String a2 = a(getIntent(), "extra_log_pb");
        this.f118215b = a(getIntent(), "aweme_id");
        this.f118216c = a(getIntent(), "extra_music_from");
        Serializable serializableExtra = getIntent().getSerializableExtra("sticker_music");
        Serializable serializableExtra2 = getIntent().getSerializableExtra("music_model");
        String a3 = a(getIntent(), "shoot_enter_from");
        String a4 = a(getIntent(), "from_banner_id");
        int intExtra = getIntent().getIntExtra("is_bundled", 0);
        int intExtra2 = getIntent().getIntExtra("media_type", 0);
        a(getIntent(), "sticker_id");
        a(getIntent(), "from_token");
        this.f118217d = getIntent().getIntExtra("extra_video_length", 0);
        this.f118218e = a(getIntent(), "extra_previous_page");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_stickers");
        if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
            stringArrayListExtra = new ArrayList<>();
            String a5 = a(getIntent(), "id");
            if (!TextUtils.isEmpty(a5)) {
                String[] split = a5.split(",");
                if (split.length > 0) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            stringArrayListExtra.add(str);
                        }
                    }
                }
            }
        }
        if (stringArrayListExtra.size() == 0) {
            finish();
        } else {
            this.f118214a.addAll(stringArrayListExtra);
            i supportFragmentManager = getSupportFragmentManager();
            n a6 = supportFragmentManager.a();
            Fragment a7 = supportFragmentManager.a("sticker_prop_detail_fragment_tag");
            String a8 = a(getIntent(), "extra_sticker_from");
            if (a7 == null) {
                String str2 = this.f118215b;
                String str3 = this.f118216c;
                int i2 = this.f118217d;
                String str4 = this.f118218e;
                Bundle bundle2 = new Bundle(3);
                bundle2.putStringArrayList("extra_stickers", stringArrayListExtra);
                bundle2.putString("aweme_id", str2);
                bundle2.putString("extra_music_from", str3);
                bundle2.putString("extra_sticker_from", a8);
                bundle2.putSerializable("sticker_music", serializableExtra);
                bundle2.putSerializable("music_model", serializableExtra2);
                bundle2.putString("extra_log_pb", a2);
                bundle2.putInt("media_type", intExtra2);
                bundle2.putInt("EXTRA_VIDEO_LENGTH", i2);
                bundle2.putString("extra_previous_page", str4);
                if (a3 == null) {
                    a3 = "";
                }
                bundle2.putString("shoot_enter_from", a3);
                if (!TextUtils.isEmpty(a4)) {
                    bundle2.putString("from_banner_id", a4);
                }
                bundle2.putInt("is_bundled", intExtra);
                a7 = new j();
                a7.setArguments(bundle2);
            }
            a7.setUserVisibleHint(true);
            a6.b(R.id.ad7, a7, "sticker_prop_detail_fragment_tag");
            a6.b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 10086 && i3 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}

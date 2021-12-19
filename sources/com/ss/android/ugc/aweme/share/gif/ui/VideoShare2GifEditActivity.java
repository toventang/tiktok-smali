package com.ss.android.ugc.aweme.share.gif.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.util.HashMap;

public class VideoShare2GifEditActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    boolean f123531a = true;

    /* renamed from: b  reason: collision with root package name */
    public VideoShare2GifEditContext f123532b;

    static {
        Covode.recordClassIndex(81097);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onWindowFocusChanged", true);
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

    public void resolveUiClickEvent(View view) {
        if (view.getId() == R.id.q9) {
            r.a("gif_quit_editing", new HashMap());
            finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", true);
        activityConfiguration(a.f123540a);
        super.onCreate(bundle);
        setContentView(R.layout.ci);
        View findViewById = findViewById(R.id.q9);
        if (findViewById != null) {
            findViewById.setOnClickListener(new b(this));
        }
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        this.f123532b = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null || !e.b(videoShare2GifEditContext.f123488a)) {
            finish();
        }
        findViewById(R.id.cuz).setOnClickListener(new bp() {
            /* class com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity.AnonymousClass2 */

            static {
                Covode.recordClassIndex(81099);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                VideoShare2GifEditActivity videoShare2GifEditActivity = VideoShare2GifEditActivity.this;
                if (videoShare2GifEditActivity.f123531a && videoShare2GifEditActivity.f123532b != null && !TextUtils.isEmpty(videoShare2GifEditActivity.f123532b.f123488a)) {
                    videoShare2GifEditActivity.f123531a = false;
                    videoShare2GifEditActivity.f123532b.f123493f = com.ss.android.ugc.aweme.share.gif.a.a();
                    VideoShare2GifEditContext videoShare2GifEditContext = videoShare2GifEditActivity.f123532b;
                    String str = videoShare2GifEditActivity.f123532b.f123489b;
                    l.d(str, "");
                    String path = new File(com.ss.android.ugc.aweme.share.gif.a.a(), str + ".gif").getPath();
                    l.b(path, "");
                    videoShare2GifEditContext.f123492e = path;
                    d a2 = d.a(videoShare2GifEditActivity, videoShare2GifEditActivity.getResources().getString(R.string.c4a));
                    a2.setIndeterminate(false);
                    AVExternalServiceImpl.a().abilityService().transformService().video2gif(videoShare2GifEditActivity.f123532b, new c(a2), new d(videoShare2GifEditActivity, a2));
                }
            }
        });
        if (getSupportFragmentManager().a(R.id.b4y) == null) {
            AVExternalServiceImpl.a().asyncService(this, "Share2Gif", new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(81098);
                }

                @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    VideoShare2GifEditActivity.this.finish();
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    i.b(new f(this, asyncAVService), m.f68150a);
                }
            });
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", false);
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && i3 == -1) {
            finish();
        }
    }

    public static void a(Context context, String str, String str2, boolean z, String str3, String str4, String str5) {
        Intent intent = new Intent(context, VideoShare2GifEditActivity.class);
        VideoShare2GifEditContext videoShare2GifEditContext = new VideoShare2GifEditContext();
        videoShare2GifEditContext.f123489b = str;
        videoShare2GifEditContext.r = str5;
        videoShare2GifEditContext.q = str4;
        videoShare2GifEditContext.p = str2;
        videoShare2GifEditContext.f123488a = str3;
        videoShare2GifEditContext.f123490c = z;
        intent.putExtra("extra_data", videoShare2GifEditContext);
        a(context, intent);
    }
}

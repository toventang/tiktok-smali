package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.i18n.musically.cut.j;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.zhiliaoapp.musically.R;

public class AvatarChooseActivity extends a implements View.OnClickListener, IVideoChoose.Callback {

    /* renamed from: a  reason: collision with root package name */
    TextView f99815a;

    /* renamed from: b  reason: collision with root package name */
    View f99816b;

    /* renamed from: c  reason: collision with root package name */
    public IVideoChoose f99817c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f99818d;

    static {
        Covode.recordClassIndex(63635);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        IVideoChoose iVideoChoose;
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", true);
        super.onResume();
        if (!this.f99818d && (iVideoChoose = this.f99817c) != null) {
            this.f99818d = true;
            iVideoChoose.loadData();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", false);
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

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (view == this.f99816b) {
            finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback
    public void onData(String str) {
        j jVar = new j();
        jVar.f99858a = new j.b() {
            /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity.AnonymousClass2 */

            static {
                Covode.recordClassIndex(63637);
            }

            @Override // com.ss.android.ugc.aweme.i18n.musically.cut.j.b
            public final void a(Intent intent) {
                AvatarChooseActivity.this.setResult(-1, intent);
                AvatarChooseActivity.this.finish();
            }
        };
        SmartRouter.buildRoute(this, "//profile/avatar_cut").withParam("file_path", str).open(3, new l(jVar));
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65559e = R.attr.f159902m;
        xVar.f65560f = R.attr.f159902m;
        xVar.f65562h = true;
        activityConfiguration(new a(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.an_);
        this.f99815a = (TextView) findViewById(R.id.title);
        this.f99816b = findViewById(R.id.qb);
        this.f99815a.setText(R.string.d73);
        this.f99816b.setOnClickListener(this);
        final Fragment a2 = getSupportFragmentManager().a(R.id.d4m);
        AVExternalServiceImpl.a().asyncService(this, "AvatarChoose", new SimpleServiceLoadCallback() {
            /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(63636);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                AvatarChooseActivity avatarChooseActivity = AvatarChooseActivity.this;
                IVideo2GifUIService abilityUiService = asyncAVService.uiService().abilityUiService();
                AvatarChooseActivity avatarChooseActivity2 = AvatarChooseActivity.this;
                avatarChooseActivity.f99817c = abilityUiService.toMusVideoChooseFragment(avatarChooseActivity2, a2, avatarChooseActivity2, Integer.valueOf((int) R.id.d4m));
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", false);
    }
}

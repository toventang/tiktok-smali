package com.ss.android.ugc.aweme.story.base.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.services.story.IStoryView;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.story.base.StoryActivityArg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class StoryRootActivity extends com.ss.android.ugc.aweme.adaptation.b {

    /* renamed from: d  reason: collision with root package name */
    public IStoryView f136905d;

    /* renamed from: e  reason: collision with root package name */
    final h f136906e = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: f  reason: collision with root package name */
    private final SafeHandler f136907f = new SafeHandler(this);

    /* renamed from: g  reason: collision with root package name */
    private final h f136908g = i.a((h.f.a.a) new a(this));

    /* renamed from: h  reason: collision with root package name */
    private HashMap f136909h;

    static {
        Covode.recordClassIndex(89482);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f136909h == null) {
            this.f136909h = new HashMap();
        }
        View view = (View) this.f136909h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f136909h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final int bv_() {
        return androidx.core.content.b.c(this, R.color.c9);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, com.ss.android.ugc.aweme.tools.a.f138737d);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRootActivity f136910a;

        static {
            Covode.recordClassIndex(89484);
        }

        b(StoryRootActivity storyRootActivity) {
            this.f136910a = storyRootActivity;
        }

        public final void run() {
            if (!this.f136910a.isFinishing()) {
                IStoryView iStoryView = this.f136910a.f136905d;
                if (iStoryView == null) {
                    l.a("storyView");
                }
                iStoryView.onOpenCompletely();
            }
        }
    }

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        IStoryView iStoryView = this.f136905d;
        if (iStoryView == null) {
            l.a("storyView");
        }
        if (!iStoryView.onBackPressed()) {
            super.onBackPressed();
        }
    }

    static final class a extends m implements h.f.a.a<EnterStoryParam> {
        final /* synthetic */ StoryRootActivity this$0;

        static {
            Covode.recordClassIndex(89483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StoryRootActivity storyRootActivity) {
            super(0);
            this.this$0 = storyRootActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EnterStoryParam invoke() {
            EnterStoryParam enterStoryParam;
            StoryActivityArg storyActivityArg = (StoryActivityArg) this.this$0.f136906e.getValue();
            if (storyActivityArg == null || (enterStoryParam = storyActivityArg.getEnterStoryParam()) == null) {
                return new EnterStoryParam(null, null, null, false, true, false, false, 111, null);
            }
            return enterStoryParam;
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onStop() {
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

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRootActivity f136911a;

        static {
            Covode.recordClassIndex(89485);
        }

        c(StoryRootActivity storyRootActivity) {
            this.f136911a = storyRootActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f136911a.finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b20);
        Fragment a2 = getSupportFragmentManager().a("StorySlideFragment");
        if (a2 == null || !(a2 instanceof IStoryView)) {
            this.f136905d = AVExternalServiceImpl.a().storyService().createStoryView((EnterStoryParam) this.f136908g.getValue());
            n a3 = getSupportFragmentManager().a();
            IStoryView iStoryView = this.f136905d;
            if (iStoryView == null) {
                l.a("storyView");
            }
            a3.a(R.id.b48, iStoryView.asFragment(), "StorySlideFragment").b();
        } else {
            this.f136905d = (IStoryView) a2;
        }
        IStoryView iStoryView2 = this.f136905d;
        if (iStoryView2 == null) {
            l.a("storyView");
        }
        iStoryView2.getCloseEvent().observe(this, new c(this));
        this.f136907f.postDelayed(new b(this), 300);
        overridePendingTransition(com.ss.android.ugc.aweme.tools.a.f138734a, 0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        IStoryView iStoryView = this.f136905d;
        if (iStoryView == null) {
            l.a("storyView");
        }
        iStoryView.onActivityResult(i2, i3, intent);
    }
}

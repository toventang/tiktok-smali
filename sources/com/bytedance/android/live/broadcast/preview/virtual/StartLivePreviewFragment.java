package com.bytedance.android.live.broadcast.preview.virtual;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.fragment.app.n;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.p;
import com.bytedance.android.live.broadcast.preview.virtual.LiveSettingApi;
import com.bytedance.android.live.broadcast.stream.c;
import com.bytedance.android.live.broadcast.stream.capture.c;
import com.bytedance.android.live.broadcast.stream.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.effect.d;
import com.bytedance.android.livesdk.j.af;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableEffectSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.bytedance.android.livesdkapi.depend.model.a.g;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import f.a.t;

public class StartLivePreviewFragment extends com.bytedance.android.livesdk.ui.a implements g {
    private static int PREVIEW_HEIGHT = 1280;
    private static int PREVIEW_WIDTH = 720;
    private AnimationSet l2RAnimationSet;
    private e listener = new e() {
        /* class com.bytedance.android.live.broadcast.preview.virtual.StartLivePreviewFragment.AnonymousClass3 */

        static {
            Covode.recordClassIndex(4230);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String str, String str2) {
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(e.a aVar) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar, String str) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(PrivacyCert privacyCert) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(String str) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b() {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b(com.bytedance.android.livesdkapi.depend.model.a aVar, String str) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b(PrivacyCert privacyCert) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b(String str) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void d(float f2) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a() {
            StartLivePreviewFragment.this.getActivity().finish();
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int b(String[] strArr) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.b(strArr);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int c(String[] strArr) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.c(strArr);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void c(float f2) {
            if (StartLivePreviewFragment.this.mLiveBeautyHelper != null) {
                StartLivePreviewFragment.this.mLiveBeautyHelper.c(f2);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String[] strArr) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.a(strArr);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b(float f2) {
            if (StartLivePreviewFragment.this.mLiveBeautyHelper != null) {
                StartLivePreviewFragment.this.mLiveBeautyHelper.b(f2);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(float f2) {
            if (StartLivePreviewFragment.this.mLiveBeautyHelper != null) {
                StartLivePreviewFragment.this.mLiveBeautyHelper.a(f2);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(int i2) {
            boolean z;
            if (StartLivePreviewFragment.this.mLiveBeautyHelper != null && StartLivePreviewFragment.this.mLiveFilterHelper != null) {
                int f2 = StartLivePreviewFragment.this.mLiveFilterHelper.f();
                StartLivePreviewFragment.this.mLiveFilterHelper.a(i2);
                StartLivePreviewFragment startLivePreviewFragment = StartLivePreviewFragment.this;
                if (i2 < f2) {
                    z = true;
                } else {
                    z = false;
                }
                startLivePreviewFragment.showFilterName(z);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int b(String[] strArr, String[] strArr2) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.b(strArr, strArr2);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String[] strArr, String[] strArr2) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.a(strArr, strArr2);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(int i2, PrivacyCert privacyCert) {
            if (i2 != StartLivePreviewFragment.this.mCameraType) {
                StartLivePreviewFragment.this.mCameraType = i2;
                if (StartLivePreviewFragment.this.mCameraCapture != null) {
                    StartLivePreviewFragment.this.mCameraCapture.b(privacyCert);
                }
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String str, String str2, float f2) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.a(str, str2, f2);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String str, String str2, int[] iArr) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.a(str, str2, iArr);
            return 0;
        }
    };
    public com.bytedance.android.live.broadcast.stream.capture.a mCameraCapture;
    public int mCameraType = 1;
    public View mFilterLayout;
    private TextView mFilterText;
    private GestureDetectLayout mGestureDetectLayout;
    public GestureDetector mGestureDetector;
    private View.OnTouchListener mGestureTouchListener = new View.OnTouchListener() {
        /* class com.bytedance.android.live.broadcast.preview.virtual.StartLivePreviewFragment.AnonymousClass4 */

        static {
            Covode.recordClassIndex(4231);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            StartLivePreviewFragment.this.mGestureDetector.onTouchEvent(motionEvent);
            return false;
        }
    };
    public boolean mInitializedEffect;
    public com.bytedance.android.live.broadcast.c.a mLiveBeautyHelper;
    public com.bytedance.android.live.effect.api.e mLiveFilterHelper;
    private com.bytedance.android.live.broadcast.api.d.a mLiveStream;
    private View mLoadingView;
    private int mScreenWidth;
    private boolean mShowStartLiveFragment;
    private f mStartLiveFragment;
    public com.bytedance.android.live.broadcast.stream.capture.a.a mStickerEffect;
    public b mSubscribe;
    private SurfaceView mSurfaceView;
    private AnimationSet r2LAnimationSet;

    public static StartLivePreviewFragment newInstance() {
        return new StartLivePreviewFragment();
    }

    static {
        Covode.recordClassIndex(4227);
    }

    private void initGestureDetector() {
        this.mGestureDetector = new GestureDetector(getActivity(), new a(this, (byte) 0));
        this.mGestureDetectLayout.a(this.mGestureTouchListener);
    }

    public void initEffect() {
        if (!this.mInitializedEffect) {
            this.mInitializedEffect = true;
            com.bytedance.android.live.effect.api.e f2 = d.f();
            this.mLiveFilterHelper = f2;
            f2.a(this.mCameraCapture);
            this.mLiveBeautyHelper = new com.bytedance.android.live.broadcast.c.b();
            com.bytedance.android.live.broadcast.stream.capture.a.a aVar = new com.bytedance.android.live.broadcast.stream.capture.a.a();
            this.mStickerEffect = aVar;
            com.bytedance.android.live.broadcast.stream.capture.a aVar2 = this.mCameraCapture;
            if (aVar2 != null) {
                aVar2.a(aVar);
            }
            this.mStickerEffect.a(LiveNewEffectPanelSetting.INSTANCE.useNewPanel() ? 1 : 0);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onPause() {
        f fVar = this.mStartLiveFragment;
        if (fVar != null) {
            fVar.E();
        }
        com.bytedance.android.live.broadcast.api.d.a aVar = this.mLiveStream;
        if (aVar != null) {
            aVar.b(PrivacyCert.Builder.with("bpea-389").usage("").tag("[offline test only] fragment onPause").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.bytedance.android.live.broadcast.api.d.a aVar = this.mLiveStream;
        if (aVar != null) {
            aVar.a(PrivacyCert.Builder.with("bpea-368").usage("").tag("[Offline test only] Switch to foreground").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        f fVar = this.mStartLiveFragment;
        if (fVar == null) {
            this.mShowStartLiveFragment = true;
        } else {
            fVar.D();
        }
    }

    private void initLiveFragment() {
        f createStartLiveFragment = ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).createStartLiveFragment(null);
        this.mStartLiveFragment = createStartLiveFragment;
        createStartLiveFragment.a(this.listener);
        n a2 = getActivity().getSupportFragmentManager().a();
        a2.b(R.id.adx, this.mStartLiveFragment.F());
        a2.e();
        ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).startLiveManager().a(this);
        if (this.mShowStartLiveFragment) {
            this.mStartLiveFragment.D();
        }
    }

    private void initView() {
        this.mScreenWidth = y.c();
        this.mFilterLayout = getView().findViewById(R.id.b31);
        this.mGestureDetectLayout = (GestureDetectLayout) getView().findViewById(R.id.d1y);
        this.mSurfaceView = (SurfaceView) getView().findViewById(R.id.efe);
        this.mFilterText = (TextView) getView().findViewById(R.id.b33);
        View findViewById = getView().findViewById(R.id.chg);
        this.mLoadingView = findViewById;
        findViewById.setVisibility(0);
        ((LiveSettingApi.WebcastAPI) com.bytedance.android.live.network.e.a().a(LiveSettingApi.WebcastAPI.class)).getLivePodCast().a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new c(this), new d(this));
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.bytedance.android.live.broadcast.stream.capture.a aVar = this.mCameraCapture;
        if (aVar != null) {
            aVar.a(PrivacyCert.Builder.with("bpea-432").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            this.mCameraCapture = null;
        }
        b bVar = this.mSubscribe;
        if (bVar != null && !bVar.isDisposed()) {
            this.mSubscribe.dispose();
        }
        com.bytedance.android.live.broadcast.api.d.a aVar2 = this.mLiveStream;
        if (aVar2 != null) {
            aVar2.c(PrivacyCert.Builder.with("bpea-489").usage("").tag("release when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            this.mLiveStream = null;
        }
        ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).startLiveManager().b(this);
        super.onDestroy();
    }

    private void initCameraCapture() {
        int i2;
        if (com.bytedance.android.livesdk.ap.a.f14015i.b().intValue() == 0) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        this.mCameraType = i2;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent == null || !m.a(com_bytedance_android_live_broadcast_preview_virtual_StartLivePreviewFragment_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "orientation"), "landscape")) {
                PREVIEW_WIDTH = 720;
                PREVIEW_HEIGHT = 1280;
            } else {
                PREVIEW_WIDTH = 1280;
                PREVIEW_HEIGHT = 720;
            }
        }
        d.a aVar = new d.a(getContext());
        aVar.v = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getProjectKey();
        aVar.E = new com.bytedance.android.live.broadcast.d.e();
        aVar.t = new com.bytedance.android.live.broadcast.d.f();
        aVar.F = new com.bytedance.android.live.broadcast.d.d();
        aVar.q = i2;
        aVar.H = p.INST.getModelFilePath();
        aVar.I = p.INST.getResourceFinder(getContext());
        d.a a2 = aVar.a(PREVIEW_WIDTH, PREVIEW_HEIGHT);
        a2.r = 5;
        this.mLiveStream = new c(a2.a());
        com.bytedance.android.live.broadcast.stream.capture.b bVar = new com.bytedance.android.live.broadcast.stream.capture.b(this.mSurfaceView, this.mLiveStream, true);
        this.mCameraCapture = bVar;
        bVar.a(new c.a() {
            /* class com.bytedance.android.live.broadcast.preview.virtual.StartLivePreviewFragment.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4228);
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.c.a
            public final void a(int i2, int i3) {
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.c.a
            public final void a() {
                if (!StartLivePreviewFragment.this.mInitializedEffect) {
                    StartLivePreviewFragment.this.mSubscribe = t.b((Object) 1).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this), f.f8325a);
                }
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.g
    public void onStartLive() {
        com.bytedance.android.live.broadcast.stream.capture.a aVar = this.mCameraCapture;
        if (aVar != null) {
            aVar.a(PrivacyCert.Builder.with("bpea-431").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            this.mCameraCapture = null;
        }
        com.bytedance.android.live.effect.api.e eVar = this.mLiveFilterHelper;
        if (eVar != null) {
            eVar.a();
        }
        com.bytedance.android.live.broadcast.api.d.a aVar2 = this.mLiveStream;
        if (aVar2 != null) {
            aVar2.b(PrivacyCert.Builder.with("bpea-390").usage("").tag("[offline test only] fragment onPause").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            this.mLiveStream.c(PrivacyCert.Builder.with("bpea-490").usage("").tag("release when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            this.mLiveStream = null;
        }
        getActivity().finish();
    }

    /* access modifiers changed from: package-private */
    public final class a extends GestureDetector.SimpleOnGestureListener {
        static {
            Covode.recordClassIndex(4232);
        }

        private a() {
        }

        /* synthetic */ a(StartLivePreviewFragment startLivePreviewFragment, byte b2) {
            this();
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            if (!(TestDisableEffectSetting.INSTANCE.getValue() || motionEvent == null || motionEvent2 == null)) {
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) > 200.0f && Math.abs(f2) > 100.0f) {
                    if (x > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (StartLivePreviewFragment.this.mLiveFilterHelper != null) {
                        if (com.bytedance.android.livesdk.utils.p.c()) {
                            DataChannelGlobal.f34575d.a(com.bytedance.android.live.broadcast.api.c.class, false);
                        }
                        if (z) {
                            StartLivePreviewFragment.this.mLiveFilterHelper.c();
                        } else {
                            StartLivePreviewFragment.this.mLiveFilterHelper.d();
                        }
                        StartLivePreviewFragment.this.showFilterName(z);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.android.livesdk.ab.m.f13604j = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initView$1$StartLivePreviewFragment(Throwable th) {
        ao.a(y.e(), "fetch live permission fail, please retry", 0);
        this.mLoadingView.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initView$0$StartLivePreviewFragment(com.bytedance.android.live.network.response.d dVar) {
        b bVar = ((LiveSettingApi.a) dVar.data).f8308b;
        if (bVar != null) {
            DataChannelGlobal.f34575d.a(af.class, new com.bytedance.android.livesdkapi.l.b(false, bVar.f8318a, bVar.f8320c, bVar.f8319b, bVar.f8321d));
        }
        a aVar = ((LiveSettingApi.a) dVar.data).f8309c;
        if (aVar != null) {
            DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.j.e.class, new com.bytedance.android.livesdkapi.l.a(aVar.f8317c, aVar.f8316b, aVar.f8315a));
        }
        initLiveFragment();
        this.mLoadingView.setVisibility(8);
    }

    public void showFilterName(boolean z) {
        String str;
        com.bytedance.android.live.effect.api.e eVar = this.mLiveFilterHelper;
        if (eVar != null) {
            str = eVar.b();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            this.mFilterText.setText(str);
            if (z) {
                if (this.l2RAnimationSet == null) {
                    this.l2RAnimationSet = generateAnimationSet(true);
                } else {
                    this.mFilterLayout.clearAnimation();
                }
                this.mFilterLayout.startAnimation(this.l2RAnimationSet);
                return;
            }
            if (this.r2LAnimationSet == null) {
                this.r2LAnimationSet = generateAnimationSet(false);
            } else {
                this.mFilterLayout.clearAnimation();
            }
            this.mFilterLayout.startAnimation(this.r2LAnimationSet);
        }
    }

    private AnimationSet generateAnimationSet(boolean z) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int width = (this.mScreenWidth - this.mFilterText.getWidth()) / 2;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new androidx.g.a.a.c());
        alphaAnimation.setDuration(300);
        if (z) {
            f2 = (float) (-width);
        } else {
            f2 = (float) width;
        }
        float f7 = -50.0f;
        if (z) {
            f3 = -50.0f;
        } else {
            f3 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f2, f3, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new androidx.g.a.a.c());
        translateAnimation.setDuration(300);
        if (z) {
            f4 = -50.0f;
            f5 = 50.0f;
        } else {
            f4 = 50.0f;
            f5 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f4, f5, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new androidx.g.a.a.b());
        alphaAnimation2.setDuration(300);
        if (z) {
            f7 = 50.0f;
            f6 = (float) width;
        } else {
            f6 = (float) (-width);
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f7, f6, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new androidx.g.a.a.b());
        translateAnimation3.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            /* class com.bytedance.android.live.broadcast.preview.virtual.StartLivePreviewFragment.AnonymousClass2 */

            static {
                Covode.recordClassIndex(4229);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                StartLivePreviewFragment.this.mFilterLayout.setVisibility(4);
            }

            public final void onAnimationStart(Animation animation) {
                StartLivePreviewFragment.this.mFilterLayout.setVisibility(0);
            }
        });
        return animationSet;
    }

    public static String com_bytedance_android_live_broadcast_preview_virtual_StartLivePreviewFragment_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        super.onViewCreated(view, bundle);
        androidx.fragment.app.e activity = getActivity();
        if (!(activity == null || (intent = activity.getIntent()) == null || !m.a(com_bytedance_android_live_broadcast_preview_virtual_StartLivePreviewFragment_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "orientation"), "landscape"))) {
            activity.setRequestedOrientation(0);
        }
        initView();
        initCameraCapture();
        initGestureDetector();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.b57, viewGroup, false);
    }
}

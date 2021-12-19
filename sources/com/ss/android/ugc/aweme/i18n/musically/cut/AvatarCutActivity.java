package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ak;
import com.ss.android.ugc.aweme.profile.f.y;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.x;
import com.ss.android.ugc.aweme.profile.ui.ap;
import com.ss.android.ugc.aweme.shortvideo.a.c;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.UUID;

public class AvatarCutActivity extends a implements View.OnClickListener, View.OnTouchListener, x, ap {
    private static final String y = AvatarCutActivity.class.getCanonicalName();
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private com.ss.android.ugc.aweme.profile.edit.a F;
    private FrameLayout G;
    private int H;
    private TextView I;
    private int J;
    private TextView K;
    private TextView L;
    private int M;
    private float N;
    private int O;
    private ae P;
    private com.ss.android.ugc.aweme.qrcode.view.a Q;
    private ak R;
    private float S;
    private float T;

    /* renamed from: a  reason: collision with root package name */
    public MediaPlayer f99822a;

    /* renamed from: b  reason: collision with root package name */
    public TextureView f99823b;

    /* renamed from: c  reason: collision with root package name */
    public RelativeLayout f99824c;

    /* renamed from: d  reason: collision with root package name */
    public String f99825d;

    /* renamed from: e  reason: collision with root package name */
    public int f99826e;

    /* renamed from: f  reason: collision with root package name */
    FrameLayout f99827f;

    /* renamed from: g  reason: collision with root package name */
    public RecyclerView f99828g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f99829h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f99830i;

    /* renamed from: j  reason: collision with root package name */
    public int f99831j;

    /* renamed from: k  reason: collision with root package name */
    public int f99832k;

    /* renamed from: l  reason: collision with root package name */
    public int f99833l;

    /* renamed from: m  reason: collision with root package name */
    protected d f99834m;
    public View n;
    public View o;
    public Runnable p;
    protected String q;
    public boolean r;
    public volatile boolean s;
    public Thread t;
    public long u = -1;
    public int v;
    public Runnable w = new Runnable() {
        /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass7 */

        static {
            Covode.recordClassIndex(63647);
        }

        public final void run() {
            MethodCollector.i(8347);
            if (AvatarCutActivity.this.t != null) {
                try {
                    AvatarCutActivity.this.t.join();
                } catch (InterruptedException unused) {
                }
            }
            if (!AvatarCutActivity.this.isActive()) {
                MethodCollector.o(8347);
                return;
            }
            if (AvatarCutActivity.this.u > 0) {
                long currentTimeMillis = System.currentTimeMillis() - AvatarCutActivity.this.u;
                n.a("aweme_movie_publish", "crop_time", (float) currentTimeMillis);
                if (!TextUtils.isEmpty(AvatarCutActivity.this.q)) {
                    new File(AvatarCutActivity.this.q);
                    if (currentTimeMillis <= 0) {
                        MethodCollector.o(8347);
                        return;
                    }
                }
                AvatarCutActivity.this.u = -1;
            }
            AvatarCutActivity.this.c();
            MethodCollector.o(8347);
        }
    };
    public int x = 0;
    private int z;

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(User user, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(Exception exc, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ap
    public final void a(String str) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(AvatarUri avatarUri) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(String str) {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ap
    public final void e() {
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
    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    private float h() {
        return ((float) this.M) * 2.5f;
    }

    private float i() {
        return ((float) this.M) * 5.0f;
    }

    public final void d() {
        g();
        a();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        this.K.performClick();
    }

    static {
        Covode.recordClassIndex(63638);
    }

    private void j() {
        com.ss.android.ugc.aweme.qrcode.view.a aVar = this.Q;
        if (aVar != null && aVar.isShowing()) {
            this.Q.dismiss();
        }
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.f99822a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f99822a.stop();
            }
            this.f99822a.release();
            this.f99822a = null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        MethodCollector.i(9063);
        com.bytedance.helios.sdk.utils.a.e(this);
        try {
            this.t.join();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.onDestroy();
        this.f99824c.removeCallbacks(this.p);
        MethodCollector.o(9063);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", true);
        super.onResume();
        if (this.r) {
            com.ss.android.b.a.a.a.b(this.w);
            this.r = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", false);
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.f99822a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f99822a.pause();
            }
            Runnable runnable = this.p;
            if (runnable != null) {
                this.f99824c.removeCallbacks(runnable);
            }
            this.p = new Runnable() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(63640);
                }

                public final void run() {
                    if (AvatarCutActivity.this.f99822a != null) {
                        if (AvatarCutActivity.this.f99822a.isPlaying()) {
                            AvatarCutActivity.this.f99822a.pause();
                        }
                        AvatarCutActivity.this.p = null;
                        AvatarCutActivity.this.a();
                    }
                }
            };
            this.f99822a.seekTo(this.f99831j);
            this.f99824c.postDelayed(this.p, (long) this.f99832k);
            this.f99822a.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        j();
        Intent intent = new Intent();
        intent.putExtra("mp4", this.q);
        intent.putExtra("dir", AVExternalServiceImpl.a().configService().cacheConfig().rootDir());
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        b();
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

    public final void c() {
        this.f99834m.dismiss();
        com.ss.android.ugc.aweme.qrcode.view.a aVar = this.Q;
        if (aVar == null) {
            com.ss.android.ugc.aweme.qrcode.view.a a2 = com.ss.android.ugc.aweme.qrcode.view.a.a(this, getString(R.string.hau));
            this.Q = a2;
            a2.setIndeterminate(false);
            this.Q.a(getResources().getDrawable(R.drawable.b6y));
        } else if (!aVar.isShowing()) {
            this.Q.show();
            this.Q.a();
        }
        this.F.a(this.q);
        this.F.b();
    }

    private void g() {
        int x2;
        if (!(((int) this.f99830i.getX()) == this.J && ((int) this.f99829h.getX()) == this.f99833l - this.f99826e && (x2 = this.B) <= 6000)) {
            x2 = (int) ((((this.f99830i.getX() - this.f99829h.getX()) - ((float) this.f99826e)) / ((float) this.M)) * 1.2f * 1000.0f);
        }
        if (x2 >= 2500) {
            int x3 = (int) (((((float) this.x) + this.f99829h.getX()) + ((float) this.f99826e)) - ((float) this.f99833l));
            if (x3 < 0) {
                x3 = 0;
            }
            double d2 = (double) this.N;
            Double.isNaN(d2);
            double d3 = (double) x3;
            Double.isNaN(d3);
            double d4 = d2 * 1000.0d * d3;
            double d5 = (double) this.H;
            Double.isNaN(d5);
            int i2 = (int) (d4 / d5);
            if (x2 < 3000) {
                x2 = 3000;
            }
            int i3 = this.B;
            if (x2 > i3) {
                x2 = i3;
            }
            if (x2 + i2 > i3) {
                i2 = i3 - x2;
            }
            this.f99832k = x2;
            a(x2);
            this.f99831j = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ap
    public final void a(Exception exc) {
        j();
        com.ss.android.ugc.aweme.framework.a.a.a("", exc);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ap
    public final void a(AvatarUri avatarUri) {
        this.R.a(avatarUri.uri);
        this.P.a(this.R.a());
    }

    private void a(int i2) {
        int i3;
        float f2 = this.N;
        if (((float) i2) <= f2 * 5.0f * 1000.0f) {
            double d2 = (double) i2;
            Double.isNaN(d2);
            i3 = (int) Math.round(d2 / 1000.0d);
        } else {
            i3 = (int) (f2 * 5.0f);
        }
        if (i3 < 3) {
            i3 = 3;
        }
        float f3 = this.N;
        if (((float) i3) > f3 * 5.0f) {
            i3 = Math.round(f3 * 5.0f);
        }
        this.I.setText(getResources().getString(R.string.adq, Integer.valueOf(i3)));
    }

    public void onClick(View view) {
        final float f2;
        ClickAgent.onClick(view);
        if (view.getId() == this.K.getId()) {
            finish();
        } else if (view.getId() == this.L.getId()) {
            y.a("save_profile", "click_save", UGCMonitor.TYPE_PHOTO);
            this.f99824c.removeCallbacks(this.p);
            this.p = null;
            try {
                if (this.f99822a.isPlaying()) {
                    this.f99822a.pause();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.u = System.currentTimeMillis();
            d a2 = d.a(this, getResources().getString(R.string.fyd));
            this.f99834m = a2;
            a2.setIndeterminate(false);
            g();
            com.ss.android.b.a.a.a.a(new Runnable() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(63639);
                }

                public final void run() {
                    AvatarCutActivity.this.q = AVExternalServiceImpl.a().configService().cacheConfig().cacheDir() + UUID.randomUUID() + ".webp";
                    AVExternalServiceImpl.a().abilityService().transformService().video2webp(AvatarCutActivity.this.f99825d, AvatarCutActivity.this.q, AvatarCutActivity.this.f99831j, AvatarCutActivity.this.f99832k, new g(this), new h(this));
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ void a(int i2) {
                    if (!AvatarCutActivity.this.isDestroyed() && AvatarCutActivity.this.f99834m != null && AvatarCutActivity.this.f99834m.isShowing()) {
                        AvatarCutActivity.this.f99834m.setProgress(i2);
                    }
                }
            });
        } else if (view.getId() == R.id.dqs) {
            float f3 = 1.0f;
            if (this.v % LiveFeedRefreshTimeSetting.DEFAULT == 0) {
                f3 = (((float) this.z) * 1.0f) / ((float) this.A);
                f2 = 1.0f;
            } else {
                f2 = (((float) this.z) * 1.0f) / ((float) this.A);
            }
            final float f4 = f3 - f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(63648);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    AvatarCutActivity.this.f99823b.setRotation(((float) AvatarCutActivity.this.v) + (90.0f * animatedFraction));
                    AvatarCutActivity.this.f99823b.setScaleX(f2 + (f4 * animatedFraction));
                    AvatarCutActivity.this.f99823b.setScaleY(f2 + (f4 * animatedFraction));
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(63649);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    AvatarCutActivity.this.v += 90;
                    if (AvatarCutActivity.this.v >= 360) {
                        AvatarCutActivity.this.v = 0;
                    }
                }
            });
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        MethodCollector.i(9059);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", true);
        com.ss.android.ugc.aweme.activity.processor.x xVar = new com.ss.android.ugc.aweme.activity.processor.x((byte) 0);
        xVar.f65559e = R.attr.f159902m;
        xVar.f65560f = R.attr.f159902m;
        xVar.f65562h = true;
        activityConfiguration(new c(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.an3);
        this.f99827f = (FrameLayout) findViewById(R.id.eff);
        this.M = com.bytedance.common.utility.n.a(this) / 6;
        this.O = (int) com.bytedance.common.utility.n.b(this, 2.0f);
        this.f99825d = ((AvatarCutActivityArgs) RouteArgExtension.INSTANCE.navArg(this, d.f99851a).getValue()).getFilePath();
        this.f99824c = (RelativeLayout) findViewById(R.id.uw);
        this.f99828g = (RecyclerView) findViewById(R.id.djj);
        this.I = (TextView) findViewById(R.id.f9e);
        this.G = (FrameLayout) findViewById(R.id.dqs);
        TextureView textureView = (TextureView) findViewById(R.id.efb);
        this.f99823b = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass3 */

            static {
                Covode.recordClassIndex(63641);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                AvatarCutActivity.this.b();
                return true;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                Uri parse = Uri.parse(AvatarCutActivity.this.f99825d);
                AvatarCutActivity avatarCutActivity = AvatarCutActivity.this;
                avatarCutActivity.f99822a = MediaPlayer.create(avatarCutActivity, parse);
                if (AvatarCutActivity.this.f99822a == null) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(AvatarCutActivity.this).a(R.string.dr5).a();
                    AvatarCutActivity.this.finish();
                    return;
                }
                AvatarCutActivity.this.f99822a.setAudioStreamType(3);
                AvatarCutActivity.this.f99822a.setSurface(new Surface(surfaceTexture));
                AvatarCutActivity.this.f99822a.start();
                AvatarCutActivity.this.f99822a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(63642);
                    }

                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        AvatarCutActivity.this.a();
                    }
                });
                AvatarCutActivity.this.f99822a.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass3.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(63643);
                    }

                    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                        if (AvatarCutActivity.this.f99822a == null) {
                            return false;
                        }
                        AvatarCutActivity.this.f99822a.release();
                        AvatarCutActivity.this.f99822a = null;
                        return false;
                    }
                });
            }
        });
        int[] videoFileInfo = AVExternalServiceImpl.a().abilityService().processService().getVideoFileInfo(this.f99825d);
        if (videoFileInfo[0] == 0) {
            int i2 = videoFileInfo[1];
            this.B = i2;
            this.f99832k = i2;
            this.z = videoFileInfo[2];
            this.A = videoFileInfo[3];
            this.N = 1.2f;
            int round = Math.round(1.2f * 1000.0f);
            this.E = ((i2 + round) - 1) / round;
            int i3 = videoFileInfo[4];
            this.C = i3;
            int i4 = videoFileInfo[5];
            this.D = i4;
            String str = this.f99825d;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f99828g.getLayoutParams();
            layoutParams.width = com.bytedance.common.utility.n.a(this);
            this.f99833l = this.M >> 1;
            layoutParams.leftMargin = 0;
            int i5 = this.M;
            this.H = i5;
            layoutParams.height = i5;
            this.f99828g.setLayoutParams(layoutParams);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(0);
            this.f99828g.a(new RecyclerView.n() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(63645);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2) {
                    super.a(recyclerView, i2);
                    if (i2 == 0) {
                        AvatarCutActivity.this.d();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2, int i3) {
                    super.a(recyclerView, i2, i3);
                    AvatarCutActivity.this.x += i2;
                }
            });
            this.f99828g.setLayoutManager(wrapLinearLayoutManager);
            this.f99828g.setAdapter(new c(this, this.H, this.f99832k, this.f99826e, str, i3, i4, this.E));
            this.f99828g.a(new RecyclerView.n() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(63646);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2) {
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2, int i3) {
                    super.a(recyclerView, i2, i3);
                    AvatarCutActivity.this.x += i2;
                    AvatarCutActivity.this.d();
                }
            });
            com.bytedance.common.utility.n.b(this);
            int a2 = com.bytedance.common.utility.n.a(this);
            ViewGroup.LayoutParams layoutParams2 = this.f99827f.getLayoutParams();
            layoutParams2.height = a2;
            layoutParams2.width = a2;
            this.f99827f.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f99823b.getLayoutParams();
            double d2 = (double) a2;
            Double.isNaN(d2);
            double d3 = (double) this.A;
            Double.isNaN(d3);
            double d4 = d2 * 1.0d * d3;
            double d5 = (double) this.z;
            Double.isNaN(d5);
            layoutParams3.height = (int) (d4 / d5);
            this.f99823b.setLayoutParams(layoutParams3);
            TextView textView = (TextView) findViewById(R.id.q9);
            this.K = textView;
            textView.setOnClickListener(this);
            TextView textView2 = (TextView) findViewById(R.id.cuz);
            this.L = textView2;
            textView2.setOnClickListener(this);
            ImageView imageView = new ImageView(this);
            this.f99830i = imageView;
            imageView.setPadding(0, 0, this.O, 0);
            this.f99830i.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f99824c.addView(this.f99830i);
            this.f99830i.setImageResource(2131233448);
            int b2 = (int) (((float) this.M) + com.bytedance.common.utility.n.b(this, 4.0f));
            double d6 = (double) b2;
            Double.isNaN(d6);
            this.f99826e = (int) ((d6 * 3.0d) / 26.0d);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.f99826e + this.O, b2);
            layoutParams4.topMargin = (int) com.bytedance.common.utility.n.b(this, 5.0f);
            layoutParams4.addRule(10);
            layoutParams4.addRule(9);
            int i6 = this.E;
            if (i6 >= 5) {
                i6 = 5;
            }
            double d7 = (double) i6;
            Double.isNaN(d7);
            double d8 = (double) this.M;
            Double.isNaN(d8);
            double d9 = d7 * 1.0d * d8;
            double d10 = (double) this.f99833l;
            Double.isNaN(d10);
            layoutParams4.leftMargin = (int) (d9 + d10);
            int i7 = this.f99832k;
            float f2 = this.N;
            if (((float) i7) < f2 * 5.0f * 1000.0f) {
                int round2 = Math.round(((float) i7) % (f2 * 1000.0f));
                float f3 = this.N;
                layoutParams4.leftMargin -= (int) Math.ceil((double) ((((f3 * 1000.0f) - ((float) round2)) / (f3 * 1000.0f)) * ((float) layoutParams4.height)));
            }
            this.J = layoutParams4.leftMargin;
            if (SharePrefCache.inst().getLongVideoPermitted().c().booleanValue() && this.f99832k >= 6000) {
                layoutParams4.leftMargin = Math.round(((((float) this.M) * 1.0f) / 1.2f) * 6.0f) + this.f99833l;
            }
            this.f99830i.setLayoutParams(layoutParams4);
            this.f99830i.setTag("right");
            ImageView imageView2 = new ImageView(this);
            this.f99829h = imageView2;
            imageView2.setPadding(this.O, 0, 0, 0);
            this.f99829h.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f99824c.addView(this.f99829h);
            this.f99829h.setImageResource(2131233448);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(this.f99826e + this.O, b2);
            layoutParams5.addRule(10);
            layoutParams5.addRule(9);
            layoutParams5.topMargin = (int) com.bytedance.common.utility.n.b(this, 5.0f);
            layoutParams5.leftMargin = this.f99833l - this.f99826e;
            this.f99829h.setLayoutParams(layoutParams5);
            this.f99829h.setOnTouchListener(this);
            this.f99830i.setOnTouchListener(this);
            this.f99829h.setTag("left");
            this.f99828g.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(63644);
                }

                public final void run() {
                    MethodCollector.i(9314);
                    AvatarCutActivity.this.n = new View(AvatarCutActivity.this);
                    AvatarCutActivity.this.o = new View(AvatarCutActivity.this);
                    AvatarCutActivity.this.f99824c.addView(AvatarCutActivity.this.n);
                    AvatarCutActivity.this.f99824c.addView(AvatarCutActivity.this.o);
                    AvatarCutActivity.this.n.setBackgroundColor(b.c(AvatarCutActivity.this.f99828g.getContext(), R.color.bh));
                    AvatarCutActivity.this.o.setBackgroundColor(b.c(AvatarCutActivity.this.f99828g.getContext(), R.color.bh));
                    AvatarCutActivity avatarCutActivity = AvatarCutActivity.this;
                    avatarCutActivity.a(avatarCutActivity.f99833l - AvatarCutActivity.this.f99826e, (int) ((AvatarCutActivity.this.f99830i.getX() - AvatarCutActivity.this.f99829h.getX()) + ((float) AvatarCutActivity.this.f99830i.getWidth())));
                    MethodCollector.o(9314);
                }
            });
            com.ss.android.ugc.aweme.profile.edit.a aVar = new com.ss.android.ugc.aweme.profile.edit.a();
            this.F = aVar;
            aVar.f116509c = this;
            this.F.a(this, (Fragment) null);
            this.P = new ae();
            this.R = new ak();
            this.P.f116520c = this;
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
            MethodCollector.o(9059);
            return;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.doa).a();
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
        MethodCollector.o(9059);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(boolean z2) {
        com.ss.android.ugc.aweme.qrcode.view.a aVar;
        if (z2 && (aVar = this.Q) != null && aVar.isShowing()) {
            this.Q.setMessage(getString(R.string.h_y));
            this.Q.b();
            new Handler().postDelayed(new e(this), 500);
        }
    }

    public final void a(int i2, int i3) {
        int i4 = this.O;
        int i5 = i2 + i4;
        int i6 = i3 - (i4 * 2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i6, (int) com.bytedance.common.utility.n.b(this, 2.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = (int) com.bytedance.common.utility.n.b(this, 5.0f);
        this.n.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i6, (int) com.bytedance.common.utility.n.b(this, 2.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(9);
        layoutParams2.leftMargin = i5;
        layoutParams2.topMargin = ((int) com.bytedance.common.utility.n.b(this, 7.0f)) + this.H;
        this.o.setLayoutParams(layoutParams2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 354
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

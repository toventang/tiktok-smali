package com.ss.android.ugc.aweme.ftc.pages;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.ftc.pages.c;
import com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.ax;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.z;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;

public final class FTCChooseCoverActivity extends com.ss.android.ugc.aweme.adaptation.b implements a, VEEditorAutoStartStopArbiter.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f98804d = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private static final String f98805k = FTCChooseCoverActivity.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private final n f98806e = new n(this);

    /* renamed from: f  reason: collision with root package name */
    private VideoPublishEditModel f98807f;

    /* renamed from: g  reason: collision with root package name */
    private z f98808g;

    /* renamed from: h  reason: collision with root package name */
    private final t<dmt.av.video.t> f98809h = new t<>();

    /* renamed from: i  reason: collision with root package name */
    private final t<Bitmap> f98810i = new t<>();

    /* renamed from: j  reason: collision with root package name */
    private final t<Boolean> f98811j = new t<>();

    /* renamed from: l  reason: collision with root package name */
    private HashMap f98812l;

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f98812l == null) {
            this.f98812l = new HashMap();
        }
        View view = (View) this.f98812l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f98812l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62826);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.pages.a
    public final t<dmt.av.video.t> b() {
        return this.f98809h;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f98806e;
    }

    static final class e extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ FTCChooseCoverActivity this$0;

        static {
            Covode.recordClassIndex(62830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FTCChooseCoverActivity fTCChooseCoverActivity) {
            super(0);
            this.this$0 = fTCChooseCoverActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            View d_ = this.this$0.d_(R.id.btb);
            l.b(d_, "");
            return d_;
        }
    }

    static final class f extends m implements h.f.a.a<SurfaceView> {
        final /* synthetic */ FTCChooseCoverActivity this$0;

        static {
            Covode.recordClassIndex(62831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(FTCChooseCoverActivity fTCChooseCoverActivity) {
            super(0);
            this.this$0 = fTCChooseCoverActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SurfaceView invoke() {
            View d_ = this.this$0.d_(R.id.d8k);
            l.b(d_, "");
            return d_;
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.pages.a
    public final VideoPublishEditModel c() {
        VideoPublishEditModel videoPublishEditModel = this.f98807f;
        if (videoPublishEditModel == null) {
            l.a("mModel");
        }
        return videoPublishEditModel;
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.w, R.anim.x);
    }

    static {
        Covode.recordClassIndex(62825);
        com.ss.android.ugc.aweme.sticker.text.b.a();
        com.ss.android.ugc.aweme.sticker.text.c.a();
        com.ss.android.ugc.aweme.sticker.text.c.b();
    }

    private final c h() {
        Fragment a2 = getSupportFragmentManager().a("cover");
        if (!(a2 instanceof c)) {
            a2 = null;
        }
        return (c) a2;
    }

    @Override // com.ss.android.ugc.aweme.ftc.pages.a
    public final g a() {
        z zVar = this.f98808g;
        if (zVar == null) {
            l.a("mPresenter");
        }
        g gVar = zVar.w;
        l.b(gVar, "");
        return gVar;
    }

    @Override // dmt.av.video.VEEditorAutoStartStopArbiter.a
    public final void g() {
        c h2 = h();
        if (h2 != null && h2.f98858f) {
            a aVar = h2.f98853a;
            if (aVar == null) {
                l.a("mDependency");
            }
            Bitmap c2 = aVar.a().c();
            if (c2 != null) {
                a aVar2 = h2.f98853a;
                if (aVar2 == null) {
                    l.a("mDependency");
                }
                h2.f98854b = (float) aVar2.a().k();
                ((FTCChooseCoverView) h2.a(R.id.ff_)).setVideoCoverFrameView(c2);
                c2.recycle();
            }
        }
    }

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        c h2 = h();
        if (h2 != null) {
            b bVar = new b(this);
            l.d(bVar, "");
            a aVar = h2.f98853a;
            if (aVar == null) {
                l.a("mDependency");
            }
            com.ss.android.ugc.aweme.port.in.g.a().K().a(!ax.a(aVar.c().mVideoCoverStartTm, h2.f98854b / 1000.0f), new c.g(h2, bVar));
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        this.f98806e.a(i.b.DESTROYED);
        a().z();
        z zVar = this.f98808g;
        if (zVar == null) {
            l.a("mPresenter");
        }
        zVar.b();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
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

    static final class b extends m implements h.f.a.b<Boolean, Boolean> {
        final /* synthetic */ FTCChooseCoverActivity this$0;

        static {
            Covode.recordClassIndex(62827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FTCChooseCoverActivity fTCChooseCoverActivity) {
            super(1);
            this.this$0 = fTCChooseCoverActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (!booleanValue) {
                FTCChooseCoverActivity.super.onBackPressed();
            }
            return Boolean.valueOf(booleanValue);
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCChooseCoverActivity f98814a;

        static {
            Covode.recordClassIndex(62829);
        }

        d(FTCChooseCoverActivity fTCChooseCoverActivity) {
            this.f98814a = fTCChooseCoverActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                ((ImageView) this.f98814a.d_(R.id.btb)).setImageBitmap(bitmap);
            }
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCChooseCoverActivity f98813a;

        static {
            Covode.recordClassIndex(62828);
        }

        c(FTCChooseCoverActivity fTCChooseCoverActivity) {
            this.f98813a = fTCChooseCoverActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                ImageView imageView = (ImageView) this.f98813a.d_(R.id.btb);
                l.b(imageView, "");
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:241:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0511  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r24) {
        /*
        // Method dump skipped, instructions count: 1364
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity.onCreate(android.os.Bundle):void");
    }
}

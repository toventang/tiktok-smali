package com.ss.android.ugc.aweme.shoutouts;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.e.a;
import com.ss.android.ugc.aweme.adaptation.b;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class ShoutOutsPublishActivity extends b implements i, j {

    /* renamed from: d  reason: collision with root package name */
    public c f133111d;

    /* renamed from: e  reason: collision with root package name */
    public VideoPublishEditModel f133112e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f133113f;

    static {
        Covode.recordClassIndex(87042);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final boolean cs_() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f133113f == null) {
            this.f133113f = new HashMap();
        }
        View view = (View) this.f133113f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f133113f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(395, new g(ShoutOutsPublishActivity.class, "onEvent", b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        super.onBackPressed();
        h();
    }

    private final void i() {
        EventBus a2 = EventBus.a();
        if (!a2.a(this)) {
            EventBus.a(a2, this);
        }
    }

    public final void g() {
        EventBus a2 = EventBus.a();
        if (a2.a(this)) {
            a2.b(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final void d() {
        a.C1099a.a(this).a(R.color.f159928l).d(R.color.f159928l).a(true).f44923a.d();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        c.a(this);
        IInternalCommerceService h2 = AVCommerceServiceImpl.h();
        l.b(h2, "");
        h2.g();
        g();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onResume", true);
        super.onResume();
        i();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onResume", false);
    }

    public final void h() {
        if (this.f133112e != null) {
            c cVar = this.f133111d;
            if (cVar != null) {
                cVar.L();
            }
            VideoPublishEditModel videoPublishEditModel = this.f133112e;
            if (videoPublishEditModel == null) {
                l.b();
            }
            String desc = videoPublishEditModel.mShoutOutsData.getDesc();
            VideoPublishEditModel videoPublishEditModel2 = this.f133112e;
            if (videoPublishEditModel2 == null) {
                l.b();
            }
            g price = videoPublishEditModel2.mShoutOutsData.getPrice();
            VideoPublishEditModel videoPublishEditModel3 = this.f133112e;
            if (videoPublishEditModel3 == null) {
                l.b();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.g(desc, price, videoPublishEditModel3.mShoutOutsData.getBuyerMoneyDes()));
        }
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c4);
        c.a(this, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("shout_out_from_dl", false)) {
            Serializable serializableExtra = intent.getSerializableExtra("shout_out_data");
            if (serializableExtra != null) {
                a(null, (d) serializableExtra);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.ShoutOutsData");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", false);
                throw nullPointerException;
            }
        } else {
            Serializable serializableExtra2 = intent.getSerializableExtra("args");
            if (serializableExtra2 != null) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializableExtra2;
                this.f133112e = videoPublishEditModel;
                String.valueOf(videoPublishEditModel);
                VideoPublishEditModel videoPublishEditModel2 = this.f133112e;
                if (videoPublishEditModel2 == null) {
                    l.b();
                }
                a(videoPublishEditModel2, null);
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", false);
                throw nullPointerException2;
            }
        }
        i();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", false);
    }

    @r(a = ThreadMode.MAIN)
    public final void onEvent(b bVar) {
        l.d(bVar, "");
        c cVar = this.f133111d;
        if (cVar != null) {
            g gVar = bVar.f133117a;
            a aVar = bVar.f133118b;
            l.d(gVar, "");
            if (cVar.x != null && gVar.getMoneyDes() != null) {
                d dVar = cVar.w;
                if (dVar == null) {
                    l.a("shoutOutsData");
                }
                dVar.setPrice(gVar);
                d dVar2 = cVar.w;
                if (dVar2 == null) {
                    l.a("shoutOutsData");
                }
                dVar2.setBuyerMoneyDes(aVar);
                cVar.K();
                TuxButton tuxButton = cVar.t;
                if (tuxButton == null) {
                    l.a("postView");
                }
                tuxButton.setEnabled(true);
                if (cVar.C != null) {
                    VideoPublishEditModel videoPublishEditModel = cVar.C;
                    d dVar3 = cVar.w;
                    if (dVar3 == null) {
                        l.a("shoutOutsData");
                    }
                    videoPublishEditModel.mShoutOutsData = dVar3;
                }
                if (!cVar.z) {
                    View view = cVar.f133128l;
                    if (view == null) {
                        l.a("previewLayout");
                    }
                    view.setVisibility(0);
                }
            }
        }
    }

    private final void a(VideoPublishEditModel videoPublishEditModel, d dVar) {
        this.f133111d = new c(videoPublishEditModel, dVar);
        i.a a2 = com.bytedance.scene.i.a(this, c.class);
        a2.f42897e = false;
        a2.f42898f = new a(this);
        a2.f42894b = false;
        a2.f42895c = false;
        a2.f42896d = R.id.b96;
        a2.a();
    }

    /* access modifiers changed from: package-private */
    public static final class a implements com.bytedance.scene.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutOutsPublishActivity f133114a;

        static {
            Covode.recordClassIndex(87043);
        }

        a(ShoutOutsPublishActivity shoutOutsPublishActivity) {
            this.f133114a = shoutOutsPublishActivity;
        }

        @Override // com.bytedance.scene.l
        public final com.bytedance.scene.j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            l.d(classLoader, "");
            l.d(str, "");
            if (l.a((Object) c.class.getName(), (Object) str)) {
                return this.f133114a.f133111d;
            }
            return null;
        }
    }
}

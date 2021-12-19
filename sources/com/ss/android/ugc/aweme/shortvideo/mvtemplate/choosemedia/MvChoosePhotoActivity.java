package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.shortvideo.j.e;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class MvChoosePhotoActivity extends com.ss.android.ugc.aweme.adaptation.b implements w, com.ss.android.ugc.tools.view.a.c, i, j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f128839e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public ao f128840d;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<com.ss.android.ugc.tools.view.a.b> f128841f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<com.ss.android.ugc.tools.view.a.a> f128842g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private HashMap f128843h;

    public interface b {
        static {
            Covode.recordClassIndex(84560);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(84558);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.a aVar) {
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final boolean bu_() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f128843h == null) {
            this.f128843h = new HashMap();
        }
        View view = (View) this.f128843h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f128843h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(359, new g(MvChoosePhotoActivity.class, "onEvent", e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84559);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Activity activity, Bundle bundle, int i2) {
            l.d(activity, "");
            l.d(bundle, "");
            Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("key_choose_request_code", i2);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }

        public static Intent a(Activity activity, Bundle bundle, int i2, int i3) {
            l.d(activity, "");
            l.d(bundle, "");
            Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("key_choose_request_code", i2);
            intent.putExtra("key_start_activity_request_code", i3);
            return intent;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final void g() {
        ao aoVar = this.f128840d;
        if (aoVar == null) {
            l.a("rootScene");
        }
        aoVar.Z = false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final boolean i() {
        ao aoVar = this.f128840d;
        if (aoVar == null) {
            l.a("rootScene");
        }
        return aoVar.Z;
    }

    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        b.a.f132249a.end(OpenAlbumPanelPerformanceMonitor.f132344a, "animationEnded");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final w.a a() {
        ao aoVar = this.f128840d;
        if (aoVar == null) {
            l.a("rootScene");
        }
        if (aoVar.f42913m == null) {
            return new w.a(null, null);
        }
        ao aoVar2 = this.f128840d;
        if (aoVar2 == null) {
            l.a("rootScene");
        }
        return aoVar2.a();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final w.a e() {
        ao aoVar = this.f128840d;
        if (aoVar == null) {
            l.a("rootScene");
        }
        if (aoVar.f42913m == null) {
            return new w.a(null, null);
        }
        ao aoVar2 = this.f128840d;
        if (aoVar2 == null) {
            l.a("rootScene");
        }
        return aoVar2.e();
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

    static final class c implements com.bytedance.scene.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MvChoosePhotoActivity f128844a;

        static {
            Covode.recordClassIndex(84561);
        }

        c(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f128844a = mvChoosePhotoActivity;
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.scene.l
        public final com.bytedance.scene.j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            l.d(classLoader, "");
            l.d(str, "");
            if (!TextUtils.equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao", str)) {
                return null;
            }
            MvChoosePhotoActivity mvChoosePhotoActivity = this.f128844a;
            ao aoVar = new ao();
            Intent intent = this.f128844a.getIntent();
            l.b(intent, "");
            Bundle a2 = a(intent);
            if (a2 == null) {
                a2 = new Bundle();
            }
            aoVar.r = a2;
            mvChoosePhotoActivity.f128840d = aoVar;
            ao aoVar2 = this.f128844a.f128840d;
            if (aoVar2 == null) {
                l.a("rootScene");
            }
            return aoVar2;
        }
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.b bVar) {
        l.d(bVar, "");
        this.f128841f.add(bVar);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.a aVar) {
        l.d(aVar, "");
        this.f128842g.add(aVar);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void c(com.ss.android.ugc.tools.view.a.a aVar) {
        l.d(aVar, "");
        this.f128842g.remove(aVar);
    }

    @r(a = ThreadMode.MAIN)
    public final void onEvent(e eVar) {
        l.d(eVar, "");
        finish();
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.b bVar) {
        l.d(bVar, "");
        this.f128841f.remove(bVar);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.w, 0);
        if (Build.VERSION.SDK_INT <= 19) {
            eu.a((Activity) this);
        }
        setContentView(R.layout.bp);
        i.a a2 = com.bytedance.scene.i.a(this, ao.class);
        a2.f42896d = R.id.b68;
        i.a a3 = a2.a("MvChoosePhotoActivity");
        a3.f42897e = false;
        a3.f42898f = new c(this);
        a3.a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", false);
    }

    @Override // androidx.appcompat.app.d
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Iterator<T> it = this.f128842g.iterator();
        while (it.hasNext()) {
            if (it.next().onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.e
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Iterator<T> it = this.f128841f.iterator();
        while (it.hasNext()) {
            if (it.next().a(i2, i3, intent)) {
                return;
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final void a(boolean z, MusicModel musicModel, String str) {
        ao aoVar = this.f128840d;
        if (aoVar == null) {
            l.a("rootScene");
        }
        aoVar.a(z, musicModel, str);
    }
}

package com.ss.android.ugc.aweme.miniapp.media;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.miniapp_api.model.a;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public class MiniAppMediaChooseEmptyActivity extends e {

    /* renamed from: a  reason: collision with root package name */
    private Fragment f109656a;

    /* renamed from: b  reason: collision with root package name */
    private b f109657b;

    /* renamed from: c  reason: collision with root package name */
    private int f109658c;

    static {
        Covode.recordClassIndex(70183);
    }

    @Override // androidx.fragment.app.e
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e
    public void onStop() {
        a.d(this);
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

    @Override // androidx.core.app.d, androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bm);
        this.f109656a = getSupportFragmentManager().a(R.id.b9c);
        MiniAppMediaChooseEmptyArg miniAppMediaChooseEmptyArg = (MiniAppMediaChooseEmptyArg) RouteArgExtension.INSTANCE.navArg(this, a.f109659a).getValue();
        this.f109657b = new b(this, this.f109656a);
        this.f109658c = miniAppMediaChooseEmptyArg.getCurrentType();
        int chooseNum = miniAppMediaChooseEmptyArg.getChooseNum();
        int i2 = this.f109658c;
        if (i2 == 1) {
            this.f109657b.f109660a.e(6);
        } else if (i2 == 2) {
            b bVar = this.f109657b;
            bVar.f109660a.f116447i = chooseNum;
            bVar.f109660a.a(6);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        Bitmap createBitmap;
        Intent intent2 = intent;
        MethodCollector.i(2313);
        super.onActivityResult(i2, i3, intent2);
        setResult(i2, intent2);
        if (intent2 == null) {
            intent2 = new Intent();
        }
        ArrayList arrayList = new ArrayList();
        int i4 = this.f109658c;
        if (i4 != 1) {
            if (i4 == 2) {
                arrayList.addAll(this.f109657b.a(intent2));
            }
        } else if (i3 != 0) {
            b bVar = this.f109657b;
            String h2 = bVar.f109660a.h();
            Bitmap decodeFile = BitmapFactory.decodeFile(h2);
            if (decodeFile == null) {
                createBitmap = null;
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) b.a(h2));
                createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            }
            arrayList.add(new a.C2808a(bVar.a(createBitmap), "", 0, 0, 0, 0, ""));
        }
        setResult(11, intent2);
        intent2.putExtra("key_media_list", arrayList);
        c.a.f109704a.a().handleActivityImageResult(i2, i3, intent2);
        finish();
        MethodCollector.o(2313);
    }
}

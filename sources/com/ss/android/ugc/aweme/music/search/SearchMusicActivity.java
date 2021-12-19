package com.ss.android.ugc.aweme.music.search;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.music.search.d;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;

public final class SearchMusicActivity extends b {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f111634a;

    static {
        Covode.recordClassIndex(71729);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f111634a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f111634a == null) {
            this.f111634a = new SparseArray();
        }
        View view = (View) this.f111634a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f111634a.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        KeyboardUtils.c(findViewById(R.id.ay6));
        Serializable serializableExtra = getIntent().getSerializableExtra("pinned_music_list");
        Intent intent = new Intent();
        intent.putExtra("pinned_music_list", serializableExtra);
        setResult(-1, intent);
        super.finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
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

    static final class a extends m implements b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f111635a = new a();

        static {
            Covode.recordClassIndex(71730);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f111636a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, com.ss.android.ugc.aweme.music.search.b, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onCreate", true);
        activityConfiguration(a.f111635a);
        super.onCreate(bundle);
        setContentView(R.layout.an7);
        n a2 = getSupportFragmentManager().a();
        Intent intent = getIntent();
        l.d(intent, "");
        d dVar = new d();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_me", intent.getBooleanExtra("is_me", false));
        bundle2.putString("user_id", d.a.a(intent, "user_id"));
        bundle2.putString("sec_user_id", d.a.a(intent, "sec_user_id"));
        bundle2.putString("previous_page", d.a.a(intent, "previous_page"));
        bundle2.putSerializable("pinned_music_list", intent.getSerializableExtra("pinned_music_list"));
        dVar.setArguments(bundle2);
        a2.b(R.id.b6d, dVar).b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onCreate", false);
    }
}

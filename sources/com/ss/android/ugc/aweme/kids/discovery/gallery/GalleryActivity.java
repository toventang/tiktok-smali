package com.ss.android.ugc.aweme.kids.discovery.gallery;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class GalleryActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106458a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private a f106459b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f106460c;

    static {
        Covode.recordClassIndex(68028);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106460c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106460c == null) {
            this.f106460c = new HashMap();
        }
        View view = (View) this.f106460c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106460c.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68029);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
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

    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryActivity f106461a;

        static {
            Covode.recordClassIndex(68030);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(GalleryActivity galleryActivity) {
            this.f106461a = galleryActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f106461a.finish();
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f106462a = new c();

        static {
            Covode.recordClassIndex(68031);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f106463a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        String string;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onCreate", true);
        activityConfiguration(c.f106462a);
        super.onCreate(bundle);
        setContentView(R.layout.acp);
        Fragment a2 = getSupportFragmentManager().a("gallery_grid_fragment");
        a aVar = null;
        if (!(a2 instanceof a)) {
            a2 = null;
        }
        a aVar2 = (a) a2;
        this.f106459b = aVar2;
        String str = "";
        if (aVar2 == null) {
            Bundle a3 = a(getIntent());
            if (a3 == null) {
                a3 = new Bundle();
            }
            l.b(a3, str);
            l.d(a3, str);
            a aVar3 = new a();
            String string2 = a3.getString("challenge_id");
            if (string2 == null) {
                string2 = str;
            }
            l.b(string2, str);
            if (string2.length() != 0) {
                aVar3.f105946b = new b(string2);
                aVar3.setArguments(a3);
                aVar = aVar3;
            }
            this.f106459b = aVar;
            if (aVar != null) {
                n a4 = getSupportFragmentManager().a();
                l.b(a4, str);
                a4.b(R.id.b94, aVar, "gallery_grid_fragment");
                a4.c(aVar).b();
            }
        }
        com.bytedance.ies.dmt.ui.titlebar.a aVar4 = (com.bytedance.ies.dmt.ui.titlebar.a) _$_findCachedViewById(R.id.c3n);
        l.b(aVar4, str);
        aVar4.setColorMode(0);
        com.bytedance.ies.dmt.ui.titlebar.a aVar5 = (com.bytedance.ies.dmt.ui.titlebar.a) _$_findCachedViewById(R.id.c3n);
        Bundle a5 = a(getIntent());
        if (!(a5 == null || (string = a5.getString("title")) == null)) {
            str = string;
        }
        aVar5.setTitle(str);
        ((NormalTitleBar) _$_findCachedViewById(R.id.c3n)).setOnTitleBarClickListener(new b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onCreate", false);
    }
}

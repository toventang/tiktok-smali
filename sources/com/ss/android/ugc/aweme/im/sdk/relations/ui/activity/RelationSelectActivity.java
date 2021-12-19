package com.ss.android.ugc.aweme.im.sdk.relations.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.f;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class RelationSelectActivity extends com.bytedance.ies.foundation.activity.a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f103248a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Fragment f103249b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f103250c;

    static {
        Covode.recordClassIndex(66186);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f103250c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f103250c == null) {
            this.f103250c = new HashMap();
        }
        View view = (View) this.f103250c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f103250c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.f
    public final String c() {
        return "contact_list";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66187);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(Context context, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }

        public static void a(Context context, Bundle bundle) {
            l.d(context, "");
            Intent intent = new Intent(context, RelationSelectActivity.class);
            if (bundle != null) {
                intent.putExtra("key_member_list_type", 1);
                intent.putExtras(bundle);
            } else {
                intent.putExtra("key_member_list_type", 0);
            }
            a(context, intent);
        }

        public static void a(Activity activity, Bundle bundle, int i2) {
            l.d(activity, "");
            Intent intent = new Intent(activity, RelationSelectActivity.class);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, i2);
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

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if ((r2 - r1.bottom) != 0) goto L_0x004e;
     */
    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity.onBackPressed():void");
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103251a = new b();

        static {
            Covode.recordClassIndex(66188);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f103252a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        b.d dVar;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onCreate", true);
        activityConfiguration(b.f103251a);
        super.onCreate(bundle);
        setContentView(R.layout.a4b);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().setupStatusBar(this);
        i supportFragmentManager = getSupportFragmentManager();
        n a2 = supportFragmentManager.a();
        l.b(a2, "");
        Fragment a3 = supportFragmentManager.a("relation_fragment_tag");
        this.f103249b = a3;
        if (a3 == null) {
            if (com.ss.android.ugc.aweme.im.service.c.b.a() && (dVar = (b.d) getIntent().getSerializableExtra("member_select_config")) != null) {
                this.f103249b = new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("init_config", dVar);
                Fragment fragment = this.f103249b;
                if (fragment != null) {
                    fragment.setArguments(bundle2);
                }
                a2.a(R.anim.af, R.anim.ah);
            }
            if (this.f103249b == null) {
                com.ss.android.ugc.aweme.im.sdk.relations.ui.b.a aVar = new com.ss.android.ugc.aweme.im.sdk.relations.ui.b.a();
                this.f103249b = aVar;
                aVar.setArguments(a(getIntent()));
            }
        }
        Fragment fragment2 = this.f103249b;
        if (fragment2 == null) {
            l.b();
        }
        a2.b(R.id.b5g, fragment2, "relation_fragment_tag").c();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Fragment fragment = this.f103249b;
        if (fragment != null) {
            fragment.onActivityResult(i2, i3, intent);
        }
    }
}

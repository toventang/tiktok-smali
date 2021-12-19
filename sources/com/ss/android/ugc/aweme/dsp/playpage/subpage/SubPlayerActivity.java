package com.ss.android.ugc.aweme.dsp.playpage.subpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.dsp.common.arch.a.a;
import com.ss.android.ugc.aweme.utils.ez;
import com.ss.android.ugc.aweme.utils.fc;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SubPlayerActivity extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83919a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playerservice.a f83920b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f83921c;

    static {
        Covode.recordClassIndex(52339);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.playpage.subpage.SubPlayerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52340);
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

        public static void a(Context context, String str) {
            l.d(context, "");
            l.d(str, "");
            Intent intent = new Intent(context, SubPlayerActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("enter_method", str);
            intent.putExtras(bundle);
            a(context, intent);
            com.ss.android.ugc.aweme.dsp.common.b.a.f83295c = true;
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.d3, R.anim.ah);
        com.ss.android.ugc.aweme.dsp.common.b.a.f83296d = true;
    }

    private final com.ss.android.ugc.aweme.dsp.playerservice.a a() {
        com.ss.android.ugc.aweme.dsp.playerservice.a aVar = this.f83920b;
        if (aVar != null) {
            return aVar;
        }
        com.ss.android.ugc.aweme.dsp.playerservice.a aVar2 = a.C1960a.a(b()).f83291b;
        this.f83920b = aVar2;
        return aVar2;
    }

    private final String b() {
        String a2;
        Intent intent = getIntent();
        if (intent == null || (a2 = a(intent, "enter_method")) == null) {
            return "homepage_music_tab";
        }
        return a2;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        a().b();
        com.ss.android.ugc.aweme.dsp.common.b.a.f83296d = false;
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        if (!com.ss.android.ugc.aweme.dsp.common.b.a.f83296d) {
            com.ss.android.ugc.aweme.dsp.common.b.a.b("dsp_player", "other");
        }
    }

    @Override // androidx.fragment.app.e
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.playpage.subpage.SubPlayerActivity", "onResume", true);
        super.onResume();
        if (!com.ss.android.ugc.aweme.dsp.common.b.a.f83295c) {
            com.ss.android.ugc.aweme.dsp.common.b.a.f83294b = SystemClock.elapsedRealtime();
            com.ss.android.ugc.aweme.dsp.common.b.a.a(com.ss.android.ugc.aweme.dsp.common.b.a.f83293a, "");
        }
        com.ss.android.ugc.aweme.dsp.common.b.a.f83295c = false;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.playpage.subpage.SubPlayerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
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

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SubPlayerActivity f83922a;

        static {
            Covode.recordClassIndex(52341);
        }

        b(SubPlayerActivity subPlayerActivity) {
            this.f83922a = subPlayerActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f83922a.finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.playpage.subpage.SubPlayerActivity", "onCreate", true);
        super.onCreate(bundle);
        if (a().f83363c > 0) {
            setContentView(R.layout.als);
            if (this.f83921c == null) {
                this.f83921c = new SparseArray();
            }
            View view = (View) this.f83921c.get(R.id.e_f);
            if (view == null) {
                view = findViewById(R.id.e_f);
                this.f83921c.put(R.id.e_f, view);
            }
            l.b(view, "");
            view.getLayoutParams().height = hh.b();
            i supportFragmentManager = getSupportFragmentManager();
            n a2 = supportFragmentManager.a();
            l.b(a2, "");
            Fragment a3 = supportFragmentManager.a("music_dsp_sub_player_fragment_tag");
            if (a3 == null) {
                String b2 = b();
                Bundle bundle2 = new Bundle();
                bundle2.putString("enter_method", b2);
                a3 = new com.ss.android.ugc.aweme.dsp.playpage.subpage.shuffle.a();
                a3.setArguments(bundle2);
            }
            a2.b(R.id.b51, a3, "music_dsp_sub_player_fragment_tag");
            a2.b();
            o.a((Activity) this);
            ez.a(this);
            fc.a(this);
            findViewById(R.id.bu7).setOnClickListener(new b(this));
            overridePendingTransition(R.anim.af, R.anim.d3);
            a().a();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.playpage.subpage.SubPlayerActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.playpage.subpage.SubPlayerActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

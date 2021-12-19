package com.ss.android.ugc.aweme.geofencing.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class GeoFencingStatusActivity extends com.ss.android.ugc.aweme.adaptation.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f99066e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.geofencing.a.a f99067d;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f99068f;

    static {
        Covode.recordClassIndex(62994);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f99068f == null) {
            this.f99068f = new HashMap();
        }
        View view = (View) this.f99068f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f99068f.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62995);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.ss.android.ugc.aweme.geofencing.b.a.a().a();
    }

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        com.ss.android.ugc.aweme.geofencing.a.a aVar = this.f99067d;
        if (aVar == null) {
            l.a("regionDeleteAdapter");
        }
        a(aVar.a());
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
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

    public static final /* synthetic */ com.ss.android.ugc.aweme.geofencing.a.a a(GeoFencingStatusActivity geoFencingStatusActivity) {
        com.ss.android.ugc.aweme.geofencing.a.a aVar = geoFencingStatusActivity.f99067d;
        if (aVar == null) {
            l.a("regionDeleteAdapter");
        }
        return aVar;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingStatusActivity f99070a;

        static {
            Covode.recordClassIndex(62997);
        }

        c(GeoFencingStatusActivity geoFencingStatusActivity) {
            this.f99070a = geoFencingStatusActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GeoFencingStatusActivity geoFencingStatusActivity = this.f99070a;
            geoFencingStatusActivity.a(GeoFencingStatusActivity.a(geoFencingStatusActivity).a());
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingStatusActivity f99069a;

        static {
            Covode.recordClassIndex(62996);
        }

        b(GeoFencingStatusActivity geoFencingStatusActivity) {
            this.f99069a = geoFencingStatusActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GeoFencingStatusActivity geoFencingStatusActivity = this.f99069a;
            List<com.ss.android.ugc.aweme.geofencing.c.a> a2 = GeoFencingStatusActivity.a(geoFencingStatusActivity).a();
            l.d(a2, "");
            if (geoFencingStatusActivity != null) {
                Intent intent = new Intent(geoFencingStatusActivity, GeoFencingSelectionActivity.class);
                com.ss.android.ugc.aweme.geofencing.d.a.a(intent, a2);
                geoFencingStatusActivity.startActivityForResult(intent, 957, null);
            }
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.geofencing.c.a> list) {
        if (getIntent().getBooleanExtra("extra.read_only", false)) {
            finish();
            return;
        }
        Intent intent = new Intent();
        com.ss.android.ugc.aweme.geofencing.d.a.a(intent, list);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.be);
        Intent intent = getIntent();
        l.b(intent, "");
        List a2 = com.ss.android.ugc.aweme.geofencing.d.a.a(intent);
        if (a2 == null) {
            a2 = z.INSTANCE;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("extra.read_only", false);
        if (booleanExtra) {
            ((TuxTextView) d_(R.id.ba0)).setTextColor(androidx.core.content.b.c(this, R.color.bx));
            ((TuxTextView) d_(R.id.ba0)).setText(R.string.gdd);
            ((TuxTextView) d_(R.id.ba2)).setText(R.string.gd6);
        } else {
            ((TuxTextView) d_(R.id.ba0)).setOnClickListener(new b(this));
        }
        this.f99067d = new com.ss.android.ugc.aweme.geofencing.a.a(this, booleanExtra, a2);
        RecyclerView recyclerView = (RecyclerView) d_(R.id.bab);
        com.ss.android.ugc.aweme.geofencing.a.a aVar = this.f99067d;
        if (aVar == null) {
            l.a("regionDeleteAdapter");
        }
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((AVAutoRTLImageView) d_(R.id.bad)).setOnClickListener(new c(this));
        com.ss.android.ugc.aweme.geofencing.b.a.b();
        a.C1099a.a(this).a(R.color.f159928l).d(R.color.f159928l).a(true).f44923a.d();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e
    public final void onActivityResult(int i2, int i3, Intent intent) {
        List<com.ss.android.ugc.aweme.geofencing.c.a> a2;
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && intent != null && (a2 = com.ss.android.ugc.aweme.geofencing.d.a.a(intent)) != null) {
            com.ss.android.ugc.aweme.geofencing.a.a aVar = this.f99067d;
            if (aVar == null) {
                l.a("regionDeleteAdapter");
            }
            l.d(a2, "");
            aVar.f99014a = n.g((Collection) a2);
            aVar.notifyDataSetChanged();
        }
    }
}

package com.ss.android.ugc.aweme.geofencing.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.geofencing.a.b;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class GeoFencingSelectionActivity extends com.ss.android.ugc.aweme.adaptation.b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f99052f = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.geofencing.a.b f99053d;

    /* renamed from: e  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.geofencing.c.a> f99054e;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f99055g = h.i.a((h.f.a.a) b.f99057a);

    /* renamed from: h  reason: collision with root package name */
    private HashMap f99056h;

    static {
        Covode.recordClassIndex(62983);
    }

    private final f.a.b.a g() {
        return (f.a.b.a) this.f99055g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f99056h == null) {
            this.f99056h = new HashMap();
        }
        View view = (View) this.f99056h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f99056h.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62984);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f99057a = new b();

        static {
            Covode.recordClassIndex(62985);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        g().dispose();
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

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        com.ss.android.ugc.aweme.geofencing.a.b bVar = this.f99053d;
        if (bVar == null) {
            l.a("regionAdapter");
        }
        bVar.a();
        List<com.ss.android.ugc.aweme.geofencing.c.a> list = this.f99054e;
        if (list == null) {
            l.a("initialState");
        }
        if (!list.isEmpty()) {
            List<com.ss.android.ugc.aweme.geofencing.c.a> list2 = this.f99054e;
            if (list2 == null) {
                l.a("initialState");
            }
            a(list2);
            return;
        }
        new a.C0731a(this).a(R.string.gd5).b(R.string.gd4).a(R.string.gd3, (DialogInterface.OnClickListener) new i(this), false).b(R.string.gd2, (DialogInterface.OnClickListener) j.f99065a, false).a().c();
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSelectionActivity f99058a;

        static {
            Covode.recordClassIndex(62986);
        }

        c(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f99058a = geoFencingSelectionActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            if (i2 != 0) {
                KeyboardUtils.c(this.f99058a.d_(R.id.ba_));
            }
        }
    }

    public static final class e implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSelectionActivity f99060a;

        static {
            Covode.recordClassIndex(62988);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f99060a = geoFencingSelectionActivity;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            l.d(editable, "");
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TuxTextView tuxTextView = (TuxTextView) this.f99060a.d_(R.id.ba9);
                l.b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                GeoFencingSelectionActivity.a(this.f99060a).a("");
                return;
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.f99060a.d_(R.id.ba9);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            GeoFencingSelectionActivity.a(this.f99060a).a(editable.toString());
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSelectionActivity f99062a;

        static {
            Covode.recordClassIndex(62990);
        }

        g(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f99062a = geoFencingSelectionActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f99062a.onBackPressed();
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.geofencing.a.b a(GeoFencingSelectionActivity geoFencingSelectionActivity) {
        com.ss.android.ugc.aweme.geofencing.a.b bVar = geoFencingSelectionActivity.f99053d;
        if (bVar == null) {
            l.a("regionAdapter");
        }
        return bVar;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSelectionActivity f99061a;

        static {
            Covode.recordClassIndex(62989);
        }

        f(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f99061a = geoFencingSelectionActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtEditText) this.f99061a.d_(R.id.ba_)).setText("");
            KeyboardUtils.c(this.f99061a.d_(R.id.ba_));
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSelectionActivity f99063a;

        static {
            Covode.recordClassIndex(62991);
        }

        h(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f99063a = geoFencingSelectionActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GeoFencingSelectionActivity geoFencingSelectionActivity = this.f99063a;
            geoFencingSelectionActivity.a(GeoFencingSelectionActivity.a(geoFencingSelectionActivity).a());
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.geofencing.c.a> list) {
        Intent intent = new Intent();
        com.ss.android.ugc.aweme.geofencing.d.a.a(intent, list);
        setResult(-1, intent);
        finish();
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSelectionActivity f99059a;

        static {
            Covode.recordClassIndex(62987);
        }

        d(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f99059a = geoFencingSelectionActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            if (r8 != null) goto L_0x0023;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity.d.accept(java.lang.Object):void");
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bd);
        Intent intent = getIntent();
        l.b(intent, "");
        List<com.ss.android.ugc.aweme.geofencing.c.a> a2 = com.ss.android.ugc.aweme.geofencing.d.a.a(intent);
        if (a2 == null) {
            a2 = z.INSTANCE;
        }
        this.f99054e = a2;
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            it.next().setSelected(true);
        }
        this.f99053d = new com.ss.android.ugc.aweme.geofencing.a.b(a2);
        RecyclerView recyclerView = (RecyclerView) d_(R.id.ba6);
        l.b(recyclerView, "");
        com.ss.android.ugc.aweme.geofencing.a.b bVar = this.f99053d;
        if (bVar == null) {
            l.a("regionAdapter");
        }
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.a(new c(this));
        f.a.b.a g2 = g();
        com.ss.android.ugc.aweme.geofencing.a.b bVar2 = this.f99053d;
        if (bVar2 == null) {
            l.a("regionAdapter");
        }
        t<R> d2 = bVar2.f99026b.d((f.a.d.g<? super Boolean, ? extends R>) new b.C2414b(bVar2));
        l.b(d2, "");
        g2.a(d2.d(new d(this)));
        ((DmtEditText) d_(R.id.ba_)).addTextChangedListener(new e(this));
        ((TuxTextView) d_(R.id.ba9)).setOnClickListener(new f(this));
        ((TuxTextView) d_(R.id.ba1)).setOnClickListener(new g(this));
        ((TuxTextView) d_(R.id.ba8)).setOnClickListener(new h(this));
        a.C1099a.a(this).a(R.color.f159928l).d(R.color.f159928l).a(true).f44923a.d();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    public static final class j implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final j f99065a = new j();

        static {
            Covode.recordClassIndex(62993);
        }

        j() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSelectionActivity f99064a;

        static {
            Covode.recordClassIndex(62992);
        }

        i(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f99064a = geoFencingSelectionActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f99064a.a(z.INSTANCE);
        }
    }
}

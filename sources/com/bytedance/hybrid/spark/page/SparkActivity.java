package com.bytedance.hybrid.spark.page;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.a.i;
import com.bytedance.hybrid.spark.a.j;
import com.bytedance.hybrid.spark.a.k;
import com.bytedance.hybrid.spark.d.g;
import com.bytedance.hybrid.spark.d.m;
import com.bytedance.hybrid.spark.d.o;
import com.bytedance.hybrid.spark.d.p;
import com.bytedance.lynx.hybrid.a.h;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class SparkActivity extends e implements com.bytedance.hybrid.spark.a.e {

    /* renamed from: i  reason: collision with root package name */
    public static final a f31199i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public SparkContext f31200a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31201b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f31202c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f31203d;

    /* renamed from: e  reason: collision with root package name */
    public o.a.EnumC0658a f31204e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31205f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.immersionbar.e f31206g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.lynx.a.a.b.a f31207h;

    /* renamed from: j  reason: collision with root package name */
    private a f31208j;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.hybrid.spark.a.d f31209k;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f31210l;

    static {
        Covode.recordClassIndex(18111);
    }

    private View a(int i2) {
        if (this.f31210l == null) {
            this.f31210l = new HashMap();
        }
        View view = (View) this.f31210l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f31210l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18112);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.hybrid.spark.a.e
    public final void a() {
        finish();
    }

    @Override // androidx.fragment.app.e
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        if (!c()) {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.hybrid.spark.a.g
    public final void b() {
        com.bytedance.hybrid.spark.e.c.a("SparkActivity", "refresh", this.f31200a);
        a aVar = this.f31208j;
        if (aVar == null) {
            l.a("sparkFragment");
        }
        aVar.b();
    }

    public final void finish() {
        k b2;
        super.finish();
        com.bytedance.hybrid.spark.a.d dVar = this.f31209k;
        if (dVar != null && (b2 = dVar.b()) != null) {
            overridePendingTransition(b2.f31056a, b2.f31057b);
        }
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        h kitView;
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        a aVar = this.f31208j;
        if (aVar == null) {
            l.a("sparkFragment");
        }
        c cVar = aVar.f31216a;
        if (cVar != null && (kitView = cVar.getKitView()) != null) {
            kitView.a("viewDisappeared", null);
        }
    }

    @Override // androidx.fragment.app.e
    public final void onResume() {
        h kitView;
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
        a aVar = this.f31208j;
        if (aVar == null) {
            l.a("sparkFragment");
        }
        c cVar = aVar.f31216a;
        if (cVar != null && (kitView = cVar.getKitView()) != null) {
            kitView.a("viewAppeared", null);
        }
    }

    @Override // androidx.fragment.app.e
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

    public final boolean c() {
        String str;
        boolean z;
        h kitView;
        String str2;
        Map<String, Boolean> map = com.bytedance.hybrid.spark.b.a.f31102a;
        SparkContext sparkContext = this.f31200a;
        String str3 = "";
        if (sparkContext == null || (str = sparkContext.f40979f) == null) {
            str = str3;
        }
        Boolean bool = map.get(str);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        com.bytedance.hybrid.spark.e.c.a("SparkActivity", "onBackPressed enableBlockBackPress:" + z + " disableBackPress:" + this.f31201b, this.f31200a);
        if (z) {
            a aVar = this.f31208j;
            if (aVar == null) {
                l.a("sparkFragment");
            }
            c cVar = aVar.f31216a;
            if (!(cVar == null || (kitView = cVar.getKitView()) == null)) {
                JSONObject jSONObject = new JSONObject();
                SparkContext sparkContext2 = this.f31200a;
                if (!(sparkContext2 == null || (str2 = sparkContext2.f40979f) == null)) {
                    str3 = str2;
                }
                jSONObject.put("containerID", str3);
                kitView.a("sparkOnBackPressAction", n.a(jSONObject));
            }
            return true;
        }
        a aVar2 = this.f31208j;
        if (aVar2 == null) {
            l.a("sparkFragment");
        }
        if (!aVar2.a() && !this.f31201b) {
            return false;
        }
        return true;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SparkActivity f31211a;

        static {
            Covode.recordClassIndex(18113);
        }

        b(SparkActivity sparkActivity) {
            this.f31211a = sparkActivity;
        }

        public final void onClick(View view) {
            if (!this.f31211a.f31201b) {
                this.f31211a.finish();
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SparkActivity f31214a;

        static {
            Covode.recordClassIndex(18115);
        }

        d(SparkActivity sparkActivity) {
            this.f31214a = sparkActivity;
        }

        public final void onClick(View view) {
            if (!this.f31214a.c()) {
                this.f31214a.finish();
            }
        }
    }

    public static final /* synthetic */ com.bytedance.lynx.a.a.b.a a(SparkActivity sparkActivity) {
        com.bytedance.lynx.a.a.b.a aVar = sparkActivity.f31207h;
        if (aVar == null) {
            l.a("schemaParams");
        }
        return aVar;
    }

    public static final class c implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SparkActivity f31212a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f31213b;

        static {
            Covode.recordClassIndex(18114);
        }

        @Override // com.bytedance.hybrid.spark.a.j
        public final void a(String str) {
            T t;
            com.bytedance.hybrid.spark.e.c.a("SparkActivity", "onReceivedTitle " + str + " useWebTitle = " + SparkActivity.a(this.f31212a).getUseWebTitle(), this.f31212a.f31200a);
            if (SparkActivity.a(this.f31212a).getUseWebTitle() && !TextUtils.isEmpty(str) && (t = this.f31213b.element) != null) {
                if (str == null) {
                    str = "";
                }
                t.a(str);
            }
        }

        c(SparkActivity sparkActivity, z.e eVar) {
            this.f31212a = sparkActivity;
            this.f31213b = eVar;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e
    public final void onCreate(Bundle bundle) {
        com.bytedance.lynx.a.a.b.a aVar;
        boolean z;
        View a2;
        com.bytedance.lynx.a.a.b.c b2;
        SparkContext sparkContext;
        k a3;
        MethodCollector.i(4617);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        SparkContext sparkContext2 = (SparkContext) getIntent().getParcelableExtra("sparkContext");
        this.f31200a = sparkContext2;
        com.bytedance.hybrid.spark.e.c.a("SparkActivity", "onCreate", sparkContext2);
        SparkContext sparkContext3 = this.f31200a;
        String str = null;
        com.bytedance.hybrid.spark.a.d dVar = sparkContext3 != null ? (com.bytedance.hybrid.spark.a.d) sparkContext3.a(com.bytedance.hybrid.spark.a.d.class) : null;
        this.f31209k = dVar;
        if (!(dVar == null || (a3 = dVar.a()) == null)) {
            overridePendingTransition(a3.f31056a, a3.f31057b);
        }
        super.onCreate(bundle);
        setContentView(R.layout.b15);
        View findViewById = findViewById(R.id.cw);
        int i2 = Build.VERSION.SDK_INT;
        new com.bytedance.hybrid.spark.e.a(findViewById);
        SparkContext sparkContext4 = this.f31200a;
        if ((sparkContext4 == null || sparkContext4.a() == null) && (sparkContext = this.f31200a) != null) {
            sparkContext.a(this);
        }
        z.e eVar = new z.e();
        SparkContext sparkContext5 = this.f31200a;
        eVar.element = sparkContext5 != null ? (T) sparkContext5.a(i.class) : null;
        if (eVar.element == null) {
            com.bytedance.hybrid.spark.b bVar = com.bytedance.hybrid.spark.d.f31109a;
            eVar.element = bVar != null ? (T) bVar.a() : null;
        }
        SparkContext sparkContext6 = this.f31200a;
        if (sparkContext6 == null || (b2 = sparkContext6.b()) == null || !(b2 instanceof com.bytedance.lynx.a.a.b.a) || (aVar = (com.bytedance.lynx.a.a.b.a) b2) == null) {
            aVar = new com.bytedance.lynx.a.a.b.a(null, 1, null);
        }
        this.f31207h = aVar;
        ((FrameLayout) a(R.id.emb)).removeAllViews();
        T t = eVar.element;
        if (!(t == null || (a2 = t.a(this)) == null)) {
            ((FrameLayout) a(R.id.emb)).addView(a2);
        }
        SparkContext sparkContext7 = this.f31200a;
        if (sparkContext7 != null) {
            c cVar = new c(this, eVar);
            l.c(cVar, "");
            sparkContext7.a(j.class, cVar);
        }
        StringBuilder sb = new StringBuilder("SparkFragment#");
        SparkContext sparkContext8 = this.f31200a;
        if (sparkContext8 != null) {
            str = sparkContext8.f40979f;
        }
        String sb2 = sb.append(str).toString();
        Fragment a4 = getSupportFragmentManager().a(sb2);
        if (a4 instanceof a) {
            a aVar2 = (a) a4;
            this.f31208j = aVar2;
            if (aVar2 == null) {
                l.a("sparkFragment");
            }
            Bundle arguments = aVar2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            l.a((Object) arguments, "");
            a aVar3 = this.f31208j;
            if (aVar3 == null) {
                l.a("sparkFragment");
            }
            arguments.putParcelable("sparkContext", this.f31200a);
            aVar3.setArguments(arguments);
            a aVar4 = this.f31208j;
            if (aVar4 == null) {
                l.a("sparkFragment");
            }
            aVar4.b();
        } else {
            com.bytedance.hybrid.spark.e.c.a("SparkActivity", "Create SparkFragment", this.f31200a);
            a aVar5 = new a();
            this.f31208j = aVar5;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("sparkContext", this.f31200a);
            aVar5.setArguments(bundle2);
            androidx.fragment.app.n a5 = getSupportFragmentManager().a();
            a aVar6 = this.f31208j;
            if (aVar6 == null) {
                l.a("sparkFragment");
            }
            a5.a(R.id.cw, aVar6, sb2).c();
        }
        ArrayList<f> arrayList = new ArrayList();
        com.bytedance.lynx.a.a.b.a aVar7 = this.f31207h;
        if (aVar7 == null) {
            l.a("schemaParams");
        }
        arrayList.add(new com.bytedance.hybrid.spark.d.f(aVar7, this));
        com.bytedance.lynx.a.a.b.a aVar8 = this.f31207h;
        if (aVar8 == null) {
            l.a("schemaParams");
        }
        arrayList.add(new m(aVar8, eVar.element));
        com.bytedance.lynx.a.a.b.a aVar9 = this.f31207h;
        if (aVar9 == null) {
            l.a("schemaParams");
        }
        FrameLayout frameLayout = (FrameLayout) a(R.id.emb);
        l.a((Object) frameLayout, "");
        arrayList.add(new g(aVar9, frameLayout));
        com.bytedance.lynx.a.a.b.a aVar10 = this.f31207h;
        if (aVar10 == null) {
            l.a("schemaParams");
        }
        arrayList.add(new com.bytedance.hybrid.spark.d.k(aVar10, eVar.element));
        com.bytedance.lynx.a.a.b.a aVar11 = this.f31207h;
        if (aVar11 == null) {
            l.a("schemaParams");
        }
        arrayList.add(new com.bytedance.hybrid.spark.d.j(aVar11, this, eVar.element));
        com.bytedance.lynx.a.a.b.a aVar12 = this.f31207h;
        if (aVar12 == null) {
            l.a("schemaParams");
        }
        arrayList.add(new com.bytedance.hybrid.spark.d.i(aVar12, this, eVar.element));
        com.bytedance.lynx.a.a.b.a aVar13 = this.f31207h;
        if (aVar13 == null) {
            l.a("schemaParams");
        }
        arrayList.add(new com.bytedance.hybrid.spark.d.l(aVar13, eVar.element));
        com.bytedance.lynx.a.a.b.a aVar14 = this.f31207h;
        if (aVar14 == null) {
            l.a("schemaParams");
        }
        arrayList.add(new com.bytedance.hybrid.spark.d.h(aVar14, this));
        com.bytedance.lynx.a.a.b.a aVar15 = this.f31207h;
        if (aVar15 == null) {
            l.a("schemaParams");
        }
        arrayList.add(new com.bytedance.hybrid.spark.d.n(aVar15, this, this.f31206g));
        com.bytedance.lynx.a.a.b.a aVar16 = this.f31207h;
        if (aVar16 == null) {
            l.a("schemaParams");
        }
        arrayList.add(new o(aVar16, this));
        com.bytedance.lynx.a.a.b.a aVar17 = this.f31207h;
        if (aVar17 == null) {
            l.a("schemaParams");
        }
        FrameLayout frameLayout2 = (FrameLayout) a(R.id.emb);
        l.a((Object) frameLayout2, "");
        arrayList.add(new p(aVar17, this, frameLayout2));
        for (f fVar : arrayList) {
            fVar.a();
        }
        com.bytedance.hybrid.spark.e.c.a("SparkActivity", "initStatusBar", this.f31200a);
        com.bytedance.immersionbar.e a6 = com.bytedance.immersionbar.e.a((e) this);
        this.f31206g = a6;
        if (this.f31202c && a6 != null) {
            a6.a(com.bytedance.immersionbar.b.FLAG_HIDE_STATUS_BAR);
        }
        Integer num = this.f31203d;
        if (num != null) {
            int intValue = num.intValue();
            com.bytedance.immersionbar.e eVar2 = this.f31206g;
            if (eVar2 != null) {
                eVar2.b(intValue);
            }
        }
        o.a.EnumC0658a aVar18 = this.f31204e;
        if (aVar18 != null) {
            com.bytedance.immersionbar.e eVar3 = this.f31206g;
            boolean z2 = false;
            if (eVar3 != null) {
                if (aVar18 == o.a.EnumC0658a.DARK) {
                    z = true;
                } else {
                    z = false;
                }
                eVar3.b(z);
            }
            com.bytedance.immersionbar.e eVar4 = this.f31206g;
            if (eVar4 != null) {
                if (aVar18 == o.a.EnumC0658a.DARK) {
                    z2 = true;
                }
                eVar4.c(z2);
            }
        }
        if (this.f31205f) {
            LinearLayout linearLayout = (LinearLayout) a(R.id.dqk);
            l.a((Object) linearLayout, "");
            linearLayout.setFitsSystemWindows(!this.f31205f);
            com.bytedance.immersionbar.e eVar5 = this.f31206g;
            if (eVar5 != null) {
                eVar5.a();
            }
        }
        com.bytedance.immersionbar.e eVar6 = this.f31206g;
        if (eVar6 != null) {
            eVar6.d();
        }
        T t2 = eVar.element;
        if (t2 != null) {
            t2.a(new d(this));
        }
        T t3 = eVar.element;
        if (t3 != null) {
            t3.b(new b(this));
            MethodCollector.o(4617);
            return;
        }
        MethodCollector.o(4617);
    }

    @Override // androidx.fragment.app.e
    public final void onActivityResult(int i2, int i3, Intent intent) {
        com.bytedance.lynx.hybrid.service.b bVar;
        SparkContext sparkContext = this.f31200a;
        if (!(sparkContext == null || (bVar = (com.bytedance.lynx.hybrid.service.b) sparkContext.a(com.bytedance.lynx.hybrid.service.b.class)) == null)) {
            bVar.a(i2);
        }
        super.onActivityResult(i2, i3, intent);
    }
}

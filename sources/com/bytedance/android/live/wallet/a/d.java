package com.bytedance.android.live.wallet.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.c;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.a;
import com.bytedance.android.live.wallet.model.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.other.PayMethodsDisabledAlertSetting;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.android.livesdk.model.as;
import com.bytedance.android.livesdk.utils.h;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private final a f12952a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12953b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.b.a f12954c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<as> f12955d;

    /* renamed from: e  reason: collision with root package name */
    private final as[] f12956e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnClickListener f12957f;

    /* renamed from: l  reason: collision with root package name */
    protected a.AbstractC0280a f12958l = new a.AbstractC0280a() {
        /* class com.bytedance.android.live.wallet.a.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(7196);
        }

        @Override // com.bytedance.android.live.wallet.model.a.AbstractC0280a
        public final void a(a aVar, boolean z) {
            if (z) {
                d.this.v = null;
                d.this.f();
            } else if (!aVar.a()) {
                String value = PayMethodsDisabledAlertSetting.INSTANCE.getValue();
                if (!TextUtils.isEmpty(value)) {
                    b.a aVar2 = new b.a(d.this.getContext());
                    aVar2.f18285b = value;
                    aVar2.a(17039370, h.f12967a, false).a().show();
                }
            } else {
                d.this.v = aVar.q;
                d.this.f();
            }
        }
    };

    /* renamed from: m  reason: collision with root package name */
    protected String f12959m;
    protected String n;
    protected TextView o;
    protected TextView p;
    protected TextView q;
    protected ProgressBar r;
    protected ViewGroup s;
    protected View t;
    protected ChargeDeal u;
    protected as v;
    protected Context w;
    protected final Map<Long, a> x;

    static {
        Covode.recordClassIndex(7194);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12954c.a();
    }

    /* renamed from: com.bytedance.android.live.wallet.a.d$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12963a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 7198(0x1c1e, float:1.0087E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.model.as[] r0 = com.bytedance.android.livesdk.model.as.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.live.wallet.a.d.AnonymousClass4.f12963a = r2
                com.bytedance.android.livesdk.model.as r0 = com.bytedance.android.livesdk.model.as.FIRE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.live.wallet.a.d.AnonymousClass4.f12963a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.model.as r0 = com.bytedance.android.livesdk.model.as.TEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.a.d.AnonymousClass4.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void g() {
        MethodCollector.i(8736);
        this.r.setVisibility(0);
        this.q.setVisibility(8);
        this.t.setEnabled(false);
        this.s.removeAllViews();
        this.f12954c.a(((IapApi) e.a().a(IapApi.class)).fetchOptionList().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this), new g(this)));
        MethodCollector.o(8736);
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.o.setText(y.a((int) R.string.gx7, Float.valueOf(((float) this.u.f18925c) / 100.0f)));
        this.p.setText(new StringBuilder().append(y.a((int) R.string.gy_)).append(h.a("%.2f", Float.valueOf(((float) this.u.f18924b) / 100.0f))));
    }

    /* access modifiers changed from: protected */
    public final void f() {
        if (this.v == null) {
            this.t.setEnabled(false);
            for (a aVar : this.x.values()) {
                if (aVar.f13208h != null) {
                    aVar.f13208h.setChecked(false);
                }
            }
        } else {
            Iterator<a> it = this.x.values().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                a next = it.next();
                if (next.f13208h != null) {
                    CheckBox checkBox = next.f13208h;
                    if (next.q != this.v) {
                        z = false;
                    }
                    checkBox.setChecked(z);
                }
            }
            this.t.setEnabled(true);
        }
        a();
    }

    public final void a(ChargeDeal chargeDeal) {
        this.u = chargeDeal;
        if (this.o != null) {
            f();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        com.bytedance.android.live.core.c.a.a(6, "PayDialog", th.getStackTrace());
        this.r.setVisibility(8);
        this.q.setVisibility(0);
        this.t.setEnabled(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(c cVar) {
        this.r.setVisibility(8);
        this.q.setVisibility(8);
        b();
        for (com.bytedance.android.live.wallet.model.e eVar : cVar.f12145b) {
            a aVar = this.x.get(Long.valueOf(eVar.f13225a));
            if (aVar != null) {
                if (eVar.f13228d) {
                    aVar.o = eVar.f13226b;
                    aVar.p = eVar.f13227c;
                    aVar.a(this.s);
                } else {
                    this.x.remove(Long.valueOf(eVar.f13225a));
                }
            }
        }
        String a2 = com.bytedance.android.livesdk.ap.a.ay.a();
        if (m.a(a2)) {
            this.v = null;
        } else if (as.valueOf(a2) != as.FIRE || this.f12952a.a()) {
            as valueOf = as.valueOf(a2);
            this.v = valueOf;
            if (this.f12955d.contains(valueOf)) {
                this.v = null;
                as[] asVarArr = this.f12956e;
                int length = asVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    as asVar = asVarArr[i2];
                    if (!this.f12955d.contains(asVar)) {
                        this.v = asVar;
                        break;
                    }
                    i2++;
                }
            }
        } else {
            this.v = null;
        }
        f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b7p);
        Window window = getWindow();
        boolean z = true;
        try {
            if (getContext().getResources().getConfiguration().orientation != 1) {
                z = false;
            }
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("PayDialog", e2);
        }
        if (window != null) {
            if (z) {
                getWindow().setLayout(-1, -2);
                getWindow().setGravity(80);
            } else {
                getWindow().setLayout(-2, -1);
                getWindow().setWindowAnimations(R.style.a3f);
                getWindow().setGravity(21);
            }
        }
        this.f12955d.clear();
        this.o = (TextView) findViewById(R.id.f4u);
        this.p = (TextView) findViewById(R.id.f5j);
        this.r = (ProgressBar) findViewById(R.id.dc8);
        this.s = (ViewGroup) findViewById(R.id.cfz);
        TextView textView = (TextView) findViewById(R.id.f2j);
        this.q = textView;
        textView.setOnClickListener(new e(this));
        View findViewById = findViewById(R.id.zb);
        this.t = findViewById;
        findViewById.setOnClickListener(this.f12957f);
        if (this.u != null) {
            a();
        }
        if (!this.f12953b) {
            this.x.remove(Long.valueOf(this.f12952a.f13210j));
        }
        g();
    }

    public d(Context context, String str, String str2) {
        super(context);
        AnonymousClass1 r3 = new a(y.a((int) R.string.gx5), as.FIRE) {
            /* class com.bytedance.android.live.wallet.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7195);
            }

            @Override // com.bytedance.android.live.wallet.model.a
            public final boolean a() {
                if (d.this.u.f18927e <= 0) {
                    return true;
                }
                return false;
            }

            @Override // com.bytedance.android.live.wallet.model.a
            public final void b() {
                String a2 = y.a((int) R.string.gwz);
                StringBuilder sb = new StringBuilder(com.a.a(Locale.US, a2, new Object[]{0}));
                if (d.this.u.f18927e > 0) {
                    sb.append(d.this.w.getString(R.string.gx6));
                }
                this.n = sb.toString();
                this.f13205e.setText(this.n);
                this.f13205e.setVisibility(0);
            }
        };
        this.f12952a = r3;
        HashMap hashMap = new HashMap();
        this.x = hashMap;
        this.f12954c = new f.a.b.a();
        this.f12955d = new androidx.c.b();
        this.f12956e = new as[0];
        this.f12957f = new View.OnClickListener() {
            /* class com.bytedance.android.live.wallet.a.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(7197);
            }

            public final void onClick(View view) {
                String str;
                if (d.this.v != null) {
                    com.bytedance.android.livesdk.an.a.a().a(new f(d.this.u, d.this.v));
                    com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.ay, d.this.v.name());
                    if (AnonymousClass4.f12963a[d.this.v.ordinal()] != 1) {
                        str = "TEST";
                    } else {
                        str = "balance";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("request_page", d.this.n);
                    hashMap.put("charge_reason", d.this.f12959m);
                    hashMap.put("pay_method", str);
                    hashMap.put("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
                    b.a.a("livesdk_recharge_pay").a((Map<String, String>) hashMap).a().b();
                }
            }
        };
        this.w = context;
        this.f12953b = false;
        this.f12959m = str;
        this.n = str2;
        r3.r = this.f12958l;
        hashMap.put(Long.valueOf(r3.f13210j), r3);
    }
}

package com.zhihu.matisse.internal.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.zhihu.matisse.b.b;
import com.zhihu.matisse.internal.b.c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.ui.widget.CheckRadioView;
import com.zhihu.matisse.internal.ui.widget.CheckView;
import com.zhiliaoapp.musically.R;

public abstract class a extends d implements View.OnClickListener, ViewPager.e, b {

    /* renamed from: a  reason: collision with root package name */
    protected final c f156448a = new c(this);

    /* renamed from: b  reason: collision with root package name */
    protected com.zhihu.matisse.internal.entity.c f156449b;

    /* renamed from: c  reason: collision with root package name */
    protected ViewPager f156450c;

    /* renamed from: d  reason: collision with root package name */
    protected com.zhihu.matisse.internal.ui.a.c f156451d;

    /* renamed from: e  reason: collision with root package name */
    protected CheckView f156452e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f156453f;

    /* renamed from: g  reason: collision with root package name */
    protected TextView f156454g;

    /* renamed from: h  reason: collision with root package name */
    protected TextView f156455h;

    /* renamed from: i  reason: collision with root package name */
    protected int f156456i = -1;

    /* renamed from: j  reason: collision with root package name */
    public CheckRadioView f156457j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f156458k;

    /* renamed from: l  reason: collision with root package name */
    private LinearLayout f156459l;

    /* renamed from: m  reason: collision with root package name */
    private FrameLayout f156460m;
    private FrameLayout n;
    private boolean o = false;

    static {
        Covode.recordClassIndex(103893);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public void onPageScrolled(int i2, float f2, int i3) {
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        a(false);
        super.onBackPressed();
    }

    public final int d() {
        int e2 = this.f156448a.e();
        int i2 = 0;
        for (int i3 = 0; i3 < e2; i3++) {
            Item item = this.f156448a.b().get(i3);
            if (item.a() && com.zhihu.matisse.internal.c.b.a(item.f156424d) > ((float) this.f156449b.t)) {
                i2++;
            }
        }
        return i2;
    }

    private void a() {
        this.f156457j.setChecked(this.f156458k);
        if (!this.f156458k) {
            this.f156457j.setColor(-1);
        }
        if (d() > 0 && this.f156458k) {
            com.zhihu.matisse.internal.ui.widget.b.a("", getString(R.string.d2r, new Object[]{Integer.valueOf(this.f156449b.t)})).show(getSupportFragmentManager(), com.zhihu.matisse.internal.ui.widget.b.class.getName());
            this.f156457j.setChecked(false);
            this.f156457j.setColor(-1);
            this.f156458k = false;
        }
    }

    public final void c() {
        int e2 = this.f156448a.e();
        if (e2 == 0) {
            this.f156454g.setText(R.string.d2k);
            this.f156454g.setEnabled(false);
        } else if (e2 != 1 || !this.f156449b.a()) {
            this.f156454g.setEnabled(true);
            this.f156454g.setText(getString(R.string.d2j, new Object[]{Integer.valueOf(e2)}));
        } else {
            this.f156454g.setText(R.string.d2k);
            this.f156454g.setEnabled(true);
        }
        if (this.f156449b.r) {
            this.f156459l.setVisibility(0);
            a();
            return;
        }
        this.f156459l.setVisibility(8);
    }

    @Override // com.zhihu.matisse.b.b
    public final void b() {
        if (this.f156449b.s) {
            if (this.o) {
                this.n.animate().setInterpolator(new androidx.g.a.a.b()).translationYBy((float) this.n.getMeasuredHeight()).start();
                this.f156460m.animate().translationYBy((float) (-this.f156460m.getMeasuredHeight())).setInterpolator(new androidx.g.a.a.b()).start();
            } else {
                this.n.animate().setInterpolator(new androidx.g.a.a.b()).translationYBy((float) (-this.n.getMeasuredHeight())).start();
                this.f156460m.animate().setInterpolator(new androidx.g.a.a.b()).translationYBy((float) this.f156460m.getMeasuredHeight()).start();
            }
            this.o = !this.o;
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        Context b2 = com.ss.android.ugc.aweme.i18n.language.i18n.c.b(context);
        com.google.android.play.core.d.a.a(b2, false);
        super.attachBaseContext(b2);
    }

    public final boolean b(Item item) {
        com.zhihu.matisse.internal.entity.b d2 = this.f156448a.d(item);
        com.zhihu.matisse.internal.entity.b.a(this, d2);
        if (d2 == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        this.f156448a.b(bundle);
        bundle.putBoolean("checkState", this.f156458k);
        super.onSaveInstanceState(bundle);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.a0y) {
            onBackPressed();
        } else if (view.getId() == R.id.a0x) {
            a(true);
            finish();
        }
    }

    private void a(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("extra_result_bundle", this.f156448a.a());
        intent.putExtra("extra_result_apply", z);
        intent.putExtra("extra_result_original_enable", this.f156458k);
        setResult(-1, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r4.f156448a.d() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r4.f156448a.d() == false) goto L_0x006c;
     */
    @Override // androidx.viewpager.widget.ViewPager.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageSelected(int r5) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.internal.ui.a.onPageSelected(int):void");
    }

    /* access modifiers changed from: protected */
    public final void a(Item item) {
        if (item.b()) {
            this.f156455h.setVisibility(0);
            this.f156455h.setText(com.zhihu.matisse.internal.c.b.a(item.f156424d) + "M");
        } else {
            this.f156455h.setVisibility(8);
        }
        if (item.c()) {
            this.f156459l.setVisibility(8);
        } else if (this.f156449b.r) {
            this.f156459l.setVisibility(0);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        setTheme(c.a.f156445a.f156435d);
        super.onCreate(bundle);
        if (!c.a.f156445a.p) {
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.bl);
        int i2 = Build.VERSION.SDK_INT;
        getWindow().addFlags(67108864);
        com.zhihu.matisse.internal.entity.c cVar = c.a.f156445a;
        this.f156449b = cVar;
        if (cVar.b()) {
            setRequestedOrientation(this.f156449b.f156436e);
        }
        if (bundle == null) {
            com.zhihu.matisse.internal.b.c cVar2 = this.f156448a;
            Bundle bundleExtra = getIntent().getBundleExtra("extra_default_bundle");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            cVar2.a(bundleExtra);
            this.f156458k = getIntent().getBooleanExtra("extra_result_original_enable", false);
        } else {
            this.f156448a.a(bundle);
            this.f156458k = bundle.getBoolean("checkState");
        }
        this.f156453f = (TextView) findViewById(R.id.a0y);
        this.f156454g = (TextView) findViewById(R.id.a0x);
        this.f156455h = (TextView) findViewById(R.id.e4p);
        this.f156453f.setOnClickListener(this);
        this.f156454g.setOnClickListener(this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.d1j);
        this.f156450c = viewPager;
        viewPager.addOnPageChangeListener(this);
        com.zhihu.matisse.internal.ui.a.c cVar3 = new com.zhihu.matisse.internal.ui.a.c(getSupportFragmentManager());
        this.f156451d = cVar3;
        this.f156450c.setAdapter(cVar3);
        CheckView checkView = (CheckView) findViewById(R.id.a59);
        this.f156452e = checkView;
        checkView.setCountable(this.f156449b.f156437f);
        this.f156460m = (FrameLayout) findViewById(R.id.wd);
        this.n = (FrameLayout) findViewById(R.id.epd);
        this.f156452e.setOnClickListener(new View.OnClickListener() {
            /* class com.zhihu.matisse.internal.ui.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103894);
            }

            public final void onClick(View view) {
                if (a.this.f156451d.getCount() > 0) {
                    Item c2 = a.this.f156451d.c(a.this.f156450c.getCurrentItem());
                    if (a.this.f156448a.c(c2)) {
                        a.this.f156448a.b(c2);
                        if (a.this.f156449b.f156437f) {
                            a.this.f156452e.setCheckedNum(Integer.MIN_VALUE);
                        } else {
                            a.this.f156452e.setChecked(false);
                        }
                    } else if (a.this.b(c2)) {
                        a.this.f156448a.a(c2);
                        if (a.this.f156449b.f156437f) {
                            a.this.f156452e.setCheckedNum(a.this.f156448a.e(c2));
                        } else {
                            a.this.f156452e.setChecked(true);
                        }
                    }
                    a.this.c();
                    if (a.this.f156449b.q != null) {
                        a.this.f156448a.c();
                    }
                }
            }
        });
        this.f156459l = (LinearLayout) findViewById(R.id.d0h);
        this.f156457j = (CheckRadioView) findViewById(R.id.d0g);
        this.f156459l.setOnClickListener(new View.OnClickListener() {
            /* class com.zhihu.matisse.internal.ui.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(103895);
            }

            public final void onClick(View view) {
                int d2 = a.this.d();
                if (d2 > 0) {
                    com.zhihu.matisse.internal.ui.widget.b.a("", a.this.getString(R.string.d2q, new Object[]{Integer.valueOf(d2), Integer.valueOf(a.this.f156449b.t)})).show(a.this.getSupportFragmentManager(), com.zhihu.matisse.internal.ui.widget.b.class.getName());
                    return;
                }
                a aVar = a.this;
                aVar.f156458k = true ^ aVar.f156458k;
                a.this.f156457j.setChecked(a.this.f156458k);
                if (!a.this.f156458k) {
                    a.this.f156457j.setColor(-1);
                }
            }
        });
        c();
    }
}

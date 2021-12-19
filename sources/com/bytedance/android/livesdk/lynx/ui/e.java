package com.bytedance.android.livesdk.lynx.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.b.h;
import com.bytedance.android.live.b.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18842b = new a((byte) 0);
    private String A;
    private String B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private String G;
    private float H;
    private int I;
    private boolean J;
    private int K;

    /* renamed from: a  reason: collision with root package name */
    public final String f18843a;

    /* renamed from: c  reason: collision with root package name */
    private int f18844c;

    /* renamed from: d  reason: collision with root package name */
    private int f18845d;

    /* renamed from: e  reason: collision with root package name */
    private int f18846e;

    /* renamed from: f  reason: collision with root package name */
    private int f18847f;

    /* renamed from: g  reason: collision with root package name */
    private int f18848g;

    /* renamed from: h  reason: collision with root package name */
    private int f18849h;

    /* renamed from: i  reason: collision with root package name */
    private int f18850i;

    /* renamed from: j  reason: collision with root package name */
    private int f18851j;

    /* renamed from: k  reason: collision with root package name */
    private int f18852k;

    /* renamed from: l  reason: collision with root package name */
    private Integer f18853l;

    /* renamed from: m  reason: collision with root package name */
    private String f18854m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private h u;
    private boolean v;
    private b w;
    private String x;
    private String y;
    private f.a z;

    public enum b {
        H5,
        LYNX;

        static {
            Covode.recordClassIndex(11208);
        }
    }

    static {
        Covode.recordClassIndex(11206);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11207);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.b.m
    public final com.bytedance.android.live.core.widget.a a() {
        com.bytedance.android.livesdk.browser.d.a aVar = new com.bytedance.android.livesdk.browser.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("arg_url", this.f18843a);
        bundle.putInt("arg_width", this.f18844c);
        bundle.putInt("arg_height", this.f18845d);
        bundle.putInt("arg_gravity", this.f18852k);
        bundle.putInt("arg_radius", this.f18847f);
        bundle.putInt("arg_margin", this.f18846e);
        bundle.putInt("arg_radius_top_left", this.f18848g);
        bundle.putInt("arg_radius_top_right", this.f18849h);
        bundle.putInt("arg_radius_bottom_right", this.f18850i);
        bundle.putInt("arg_radius_bottom_left", this.f18851j);
        Integer num = this.f18853l;
        if (num != null) {
            num.intValue();
            Integer num2 = this.f18853l;
            if (num2 == null) {
                l.b();
            }
            bundle.putInt("arg_background_res", num2.intValue());
        }
        bundle.putBoolean("arg_use_bottom_close", this.n);
        bundle.putBoolean("arg_landscape_custom_height", this.o);
        bundle.putBoolean("arg_landscape_custom_gravity", this.p);
        bundle.putBoolean("arg_show_dim", this.q);
        bundle.putString("arg_monitor_page_service", this.s);
        bundle.putBoolean("arg_cancel_on_touch_outside", this.t);
        bundle.putString("arg_original_scheme", this.y);
        bundle.putString("fallback_schema", this.x);
        bundle.putString("arg_from_label", this.f18854m);
        bundle.putInt("hybrid_type", this.w.ordinal());
        bundle.putString("arg_enter_type", this.A);
        bundle.putString("arg_title", this.B);
        bundle.putBoolean("arg_enable_title_bar", this.C);
        bundle.putBoolean("arg_enable_title_close", this.D);
        bundle.putBoolean("arg_enable_title_share", this.E);
        bundle.putBoolean("arg_enable_title_share_add_report_action", this.F);
        bundle.putString("arg_report_schema", this.G);
        bundle.putFloat("arg_mask_alpha", this.H);
        bundle.putInt("arg_web_bg_color", this.I);
        bundle.putBoolean("arg_enable_pull_down_close", this.J);
        bundle.putInt("arg_variable_height", this.K);
        aVar.setArguments(bundle);
        aVar.r = this.u;
        aVar.u = this.z;
        com.bytedance.android.livesdk.browser.g.a.a(this.f18843a);
        l.b(aVar, "");
        return aVar;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* bridge */ /* synthetic */ m a(int i2) {
        this.f18844c = i2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* bridge */ /* synthetic */ m b(int i2) {
        this.f18845d = i2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* bridge */ /* synthetic */ m c(int i2) {
        this.f18846e = i2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m d(boolean z2) {
        this.v = z2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* bridge */ /* synthetic */ m e(int i2) {
        this.f18852k = i2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m f(int i2) {
        this.K = i2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m g(boolean z2) {
        this.E = z2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m h(boolean z2) {
        this.J = z2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m a(f.a aVar) {
        this.z = aVar;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* bridge */ /* synthetic */ m b(boolean z2) {
        this.q = z2;
        this.r = true;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* bridge */ /* synthetic */ m c(boolean z2) {
        this.t = z2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m e(boolean z2) {
        this.C = z2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m f(boolean z2) {
        this.D = z2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m c(String str) {
        l.d(str, "");
        this.y = str;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* bridge */ /* synthetic */ m d(int i2) {
        this.f18847f = i2;
        this.f18848g = 0;
        this.f18849h = 0;
        this.f18850i = 0;
        this.f18851j = 0;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m e(String str) {
        float f2;
        if (str == null) {
            try {
                l.b();
            } catch (Exception unused) {
                f2 = 0.0f;
            }
        }
        f2 = Float.parseFloat(str);
        this.H = f2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m f(String str) {
        l.d(str, "");
        this.B = str;
        return this;
    }

    public final m a(b bVar) {
        l.d(bVar, "");
        this.w = bVar;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m b(String str) {
        int i2;
        if (str == null || str.length() == 0) {
            return this;
        }
        try {
            i2 = Color.parseColor(com.bytedance.android.livesdk.browser.j.a.a(str));
        } catch (Exception unused) {
            i2 = -1;
        }
        this.I = i2;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final m d(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "bottom";
            }
            this.A = str;
        }
        return this;
    }

    public e(String str) {
        l.d(str, "");
        this.f18843a = str;
        this.f18854m = "";
        this.t = true;
        this.w = b.H5;
        this.x = "";
        this.y = "";
        this.A = "bottom";
        this.B = "";
        this.G = "";
        this.I = -1;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* synthetic */ m a(String str) {
        l.d(str, "");
        this.f18854m = str;
        return this;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* bridge */ /* synthetic */ m a(boolean z2) {
        this.o = z2;
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        this(str);
        l.d(str, "");
        this.x = str2 == null ? "" : str2;
    }

    @Override // com.bytedance.android.live.b.m
    public final /* bridge */ /* synthetic */ m a(int i2, int i3) {
        this.f18848g = i2;
        this.f18849h = i3;
        this.f18850i = 0;
        this.f18851j = 0;
        return this;
    }
}

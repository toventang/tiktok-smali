package com.bytedance.tux.status;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.bytedance.tux.widget.FlexLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.w;
import java.util.HashMap;

public final class TuxStatusView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45341a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private b f45342b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f45343c;

    /* renamed from: d  reason: collision with root package name */
    private final int f45344d;

    /* renamed from: e  reason: collision with root package name */
    private final float f45345e;

    /* renamed from: f  reason: collision with root package name */
    private final float f45346f;

    /* renamed from: g  reason: collision with root package name */
    private final int f45347g;

    /* renamed from: h  reason: collision with root package name */
    private final int f45348h;

    /* renamed from: i  reason: collision with root package name */
    private final int f45349i;

    /* renamed from: j  reason: collision with root package name */
    private final int f45350j;

    /* renamed from: k  reason: collision with root package name */
    private final int f45351k;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f45352l;

    public interface b {
        static {
            Covode.recordClassIndex(27626);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(27624);
    }

    public TuxStatusView(Context context) {
        this(context, null, 0, 6);
    }

    public TuxStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    private View a(int i2) {
        if (this.f45352l == null) {
            this.f45352l = new HashMap();
        }
        View view = (View) this.f45352l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f45352l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27625);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public final View f45363a;

        static {
            Covode.recordClassIndex(27628);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.b
        public final void a() {
            this.f45363a.setVisibility(0);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.b
        public final void b() {
            this.f45363a.setVisibility(4);
        }

        public d(View view) {
            l.c(view, "");
            this.f45363a = view;
        }
    }

    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f45364a;

        static {
            Covode.recordClassIndex(27629);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.b
        public final void a() {
            this.f45364a.element.setVisibility(0);
            this.f45364a.element.b();
        }

        @Override // com.bytedance.tux.status.TuxStatusView.b
        public final void b() {
            this.f45364a.element.setVisibility(4);
            this.f45364a.element.c();
        }

        e(z.e eVar) {
            this.f45364a = eVar;
        }
    }

    public final void a() {
        if (this.f45342b == null) {
            z.e eVar = new z.e();
            eVar.element = (T) findViewById(R.id.eug);
            if (eVar.element == null) {
                Context context = getContext();
                l.a((Object) context, "");
                T t = (T) new TuxDualBallView(context, (AttributeSet) null, 6);
                t.setId(R.id.eug);
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                int a2 = h.g.a.a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
                layoutParams.gravity = 17;
                t.setLayoutParams(layoutParams);
                if (t.getParent() == null) {
                    addView(t);
                }
                eVar.element = t;
            }
            a(new e(eVar));
        }
        b bVar = this.f45342b;
        if (bVar != null) {
            bVar.a();
        }
        FlexLayout flexLayout = (FlexLayout) a(R.id.e_s);
        if (flexLayout != null) {
            flexLayout.setVisibility(4);
        }
    }

    private final void b() {
        MethodCollector.i(8406);
        if (!this.f45343c) {
            View.inflate(getContext(), R.layout.u, this);
            float f2 = this.f45345e;
            if (f2 > 0.0f) {
                setTopMarginInner(f2);
            }
            float f3 = this.f45346f;
            if (f3 > 0.0f) {
                setButtonTopMarginInner(f3);
            }
            setLayoutVariantInner(this.f45344d);
            ((TuxTextView) a(R.id.title_tv)).setTuxFont(this.f45350j);
            ((TuxTextView) a(R.id.title_tv)).setTextColor(this.f45347g);
            ((TuxTextView) a(R.id.message_tv)).setTuxFont(this.f45351k);
            ((TuxTextView) a(R.id.message_tv)).setTextColor(this.f45348h);
            ((TuxButton) a(R.id.button)).setButtonVariant(this.f45349i);
            FlexLayout flexLayout = (FlexLayout) a(R.id.e_s);
            l.a((Object) flexLayout, "");
            flexLayout.setVisibility(4);
            this.f45343c = true;
        }
        MethodCollector.o(8406);
    }

    public final void setButtonTopMargin(float f2) {
        b();
        setButtonTopMarginInner(f2);
    }

    public final void setLayoutVariant(int i2) {
        b();
        setLayoutVariantInner(i2);
    }

    public final void setTopMargin(float f2) {
        b();
        setTopMarginInner(f2);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public int f45353a = -1;

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f45354b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f45355c;

        /* renamed from: d  reason: collision with root package name */
        public com.bytedance.tux.c.a f45356d;

        /* renamed from: e  reason: collision with root package name */
        public int f45357e;

        /* renamed from: f  reason: collision with root package name */
        public int f45358f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f45359g = -1;

        /* renamed from: h  reason: collision with root package name */
        public String f45360h = "";

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f45361i = "";

        /* renamed from: j  reason: collision with root package name */
        public h.f.a.b<? super TuxButton, h.z> f45362j;

        static {
            Covode.recordClassIndex(27627);
        }

        public final c a(com.bytedance.tux.c.a aVar) {
            this.f45357e = 0;
            this.f45356d = aVar;
            return this;
        }

        public final c a(CharSequence charSequence) {
            l.c(charSequence, "");
            this.f45361i = charSequence;
            return this;
        }

        public final c a(String str) {
            l.c(str, "");
            this.f45360h = str;
            return this;
        }

        public final c a(int i2, int i3) {
            this.f45357e = i2;
            this.f45353a = i3;
            return this;
        }

        public final c b(int i2, int i3) {
            this.f45358f = i2;
            this.f45359g = i3;
            return this;
        }
    }

    public final void a(b bVar) {
        l.c(bVar, "");
        b bVar2 = this.f45342b;
        if (bVar2 != null) {
            bVar2.b();
        }
        this.f45342b = bVar;
    }

    private final void setLayoutVariantInner(int i2) {
        View a2 = a(R.id.top_margin_view);
        l.a((Object) a2, "");
        a2.setTag(Integer.valueOf(i2));
        a(R.id.top_margin_view).requestLayout();
    }

    private final void setTopMarginInner(float f2) {
        View a2 = a(R.id.top_margin_view);
        l.a((Object) a2, "");
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        if (layoutParams != null) {
            Context context = getContext();
            l.a((Object) context, "");
            ((FlexLayout.am) layoutParams).f45603h = FlexLayout.ao.a.a(context, f2 + "px", "layout_height");
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    private final void setButtonTopMarginInner(float f2) {
        TuxButton tuxButton = (TuxButton) a(R.id.button);
        l.a((Object) tuxButton, "");
        ViewGroup.LayoutParams layoutParams = tuxButton.getLayoutParams();
        if (layoutParams != null) {
            Context context = getContext();
            l.a((Object) context, "");
            ((FlexLayout.am) layoutParams).f45598c = FlexLayout.ao.a.a(context, "message_tv.bottom+" + f2 + "px", "layout_top");
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void a(View view) {
        l.c(view, "");
        if (view.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            addView(view, layoutParams);
        }
        a(new d(view));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStatus(com.bytedance.tux.status.TuxStatusView.c r8) {
        /*
        // Method dump skipped, instructions count: 414
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.status.TuxStatusView.setStatus(com.bytedance.tux.status.TuxStatusView$c):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxStatusView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        MethodCollector.i(8439);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.fd, R.attr.fe, R.attr.ff, R.attr.fg, R.attr.fh, R.attr.apu, R.attr.ar3, R.attr.ar4}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        this.f45344d = obtainStyledAttributes.getInt(5, 0);
        this.f45345e = obtainStyledAttributes.getDimension(7, 0.0f);
        this.f45346f = obtainStyledAttributes.getDimension(6, 0.0f);
        this.f45347g = obtainStyledAttributes.getColor(3, -16777216);
        this.f45348h = obtainStyledAttributes.getColor(1, -16777216);
        this.f45349i = obtainStyledAttributes.getInt(0, 0);
        this.f45350j = obtainStyledAttributes.getInt(4, 0);
        this.f45351k = obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.recycle();
        MethodCollector.o(8439);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxStatusView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.c7 : i2);
    }
}

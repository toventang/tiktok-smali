package com.ss.android.ugc.aweme.editSticker.text.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.d.f;
import com.ss.android.ugc.aweme.editSticker.g;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.s;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.editSticker.text.c.h;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.tools.utils.d;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class i extends FrameLayout {
    public boolean A = true;
    public h B;
    public f C;
    public c D;
    public List<InteractTextStructWrap> E = new ArrayList();
    public int F = 0;
    protected boolean G = false;
    public boolean H = false;
    public a I = null;
    public boolean J = false;
    public com.bytedance.tux.tooltip.a K = null;
    protected int L = 1;
    b M;
    private View N;
    private View O;
    private View P;

    /* renamed from: a  reason: collision with root package name */
    private Context f88673a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f88674b = true;

    /* renamed from: c  reason: collision with root package name */
    private InputMethodManager f88675c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.editSticker.text.c.f f88676d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.editSticker.text.c.c f88677e;

    /* renamed from: f  reason: collision with root package name */
    private View f88678f;

    /* renamed from: g  reason: collision with root package name */
    protected View f88679g;

    /* renamed from: h  reason: collision with root package name */
    public TextStickerEditText f88680h;

    /* renamed from: i  reason: collision with root package name */
    protected ColorSelectLayout f88681i;

    /* renamed from: j  reason: collision with root package name */
    protected ImageView f88682j;

    /* renamed from: k  reason: collision with root package name */
    protected ImageView f88683k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f88684l;

    /* renamed from: m  reason: collision with root package name */
    protected int f88685m = 1;
    protected int n = -1;
    protected int o = 2;
    protected int p = -1;
    protected View q;
    protected g r;
    protected LinearLayout s;
    public q t;
    View u;
    public LinearLayout v;
    protected String w;
    protected String x;
    protected boolean y;
    protected boolean z;

    public interface a {
        static {
            Covode.recordClassIndex(55795);
        }

        void a(String str, q qVar);
    }

    public interface b {
        static {
            Covode.recordClassIndex(55796);
        }

        void a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(55797);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(55790);
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.zi;
    }

    /* access modifiers changed from: protected */
    public int getScene() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void setEffectText(List<TextStickerTextWrap> list) {
    }

    public int getAlignTxt() {
        return this.o;
    }

    public int getCurColor() {
        return this.p;
    }

    public int getCurTxtMode() {
        return this.f88685m;
    }

    public EditText getEditText() {
        return this.f88680h;
    }

    public c getVisibleController() {
        return this.D;
    }

    public final boolean i() {
        if (!this.f88674b) {
            return true;
        }
        return false;
    }

    private void m() {
        g gVar = this.r;
        if (gVar != null) {
            gVar.a(com.ss.android.ugc.aweme.editSticker.text.a.b.a().b());
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        InputMethodManager inputMethodManager;
        if (this.f88680h != null && (inputMethodManager = this.f88675c) != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }

    public Point getEditPageSize() {
        return new Point(getWidth(), getHeight());
    }

    public TextStickerTextWrap getTextWrap() {
        return t.a(this.f88680h, this.E);
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getTextWrap());
        return arrayList;
    }

    private int getEditTextLength() {
        if (this.f88680h.getText() != null) {
            return this.f88680h.getText().length();
        }
        return 0;
    }

    public void c() {
        InputMethodManager inputMethodManager;
        TextStickerEditText textStickerEditText = this.f88680h;
        if (textStickerEditText != null && (inputMethodManager = this.f88675c) != null) {
            inputMethodManager.hideSoftInputFromWindow(textStickerEditText.getWindowToken(), 0);
        }
    }

    public final void d() {
        ImageView imageView = this.f88684l;
        if (imageView != null) {
            imageView.setClickable(false);
            this.f88684l.setAlpha(0.5f);
            this.f88684l.setImageResource(2131232706);
        }
    }

    public Point getEditInputCenterPoint() {
        return new Point(com.ss.android.ttve.utils.b.a(this.f88673a) / 2, ((int) com.ss.android.ttve.utils.b.b(this.f88673a, 52.0f)) + (this.N.getHeight() / 2));
    }

    public String getEditTextStr() {
        if (this.f88680h.getText() != null) {
            return this.f88680h.getText().toString();
        }
        return "";
    }

    public final void h() {
        com.bytedance.tux.tooltip.a aVar = this.K;
        if (aVar != null) {
            aVar.dismiss();
        }
        if (!this.f88674b) {
            com.ss.android.ugc.aweme.editSticker.f.a.b(this);
            this.f88674b = true;
            com.ss.android.ugc.aweme.editSticker.text.c.f fVar = this.f88676d;
            if (fVar != null) {
                fVar.b();
            }
        }
    }

    private void k() {
        int i2 = this.o;
        if (i2 == 2) {
            this.f88683k.setImageResource(2131232456);
        } else if (i2 == 1) {
            this.f88683k.setImageResource(2131232460);
        } else if (i2 == 3) {
            this.f88683k.setImageResource(2131232461);
        }
    }

    private void l() {
        int i2 = this.f88685m;
        if (i2 == 1) {
            this.f88682j.setImageResource(2131232459);
        } else if (i2 == 2) {
            this.f88682j.setImageResource(2131232455);
        } else if (i2 == 3) {
            this.f88682j.setImageResource(2131232467);
        } else if (i2 == 4) {
            this.f88682j.setImageResource(2131232466);
        }
    }

    public void a() {
        this.r.a();
        this.f88685m = 1;
        this.n = -1;
        int i2 = s.a().b().f88449b;
        this.p = i2;
        this.o = 2;
        this.f88680h.a(this.f88685m, i2);
        this.f88680h.a("", 0);
    }

    public final void g() {
        com.ss.android.ugc.aweme.editSticker.f.a.a(this);
        com.ss.android.ugc.aweme.editSticker.text.c.f fVar = this.f88676d;
        if (fVar != null) {
            fVar.a();
        }
        if (d.a(com.ss.android.ugc.aweme.editSticker.text.a.b.a().b())) {
            com.ss.android.ugc.aweme.editSticker.d.e().a(getContext(), R.string.b1w);
        }
    }

    public Point getEditInputScreenCenterPoint() {
        int[] iArr = new int[2];
        this.N.getLocationOnScreen(iArr);
        Point point = new Point(this.N.getWidth() / 2, this.N.getHeight() / 2);
        return new Point(iArr[0] + point.x, iArr[1] + point.y);
    }

    public Point getReadIconPosition() {
        ImageView imageView = this.f88684l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        this.f88684l.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + (this.f88684l.getWidth() / 2);
        return new Point(iArr[0], iArr[1]);
    }

    /* access modifiers changed from: protected */
    public int getTopMargin() {
        int identifier;
        Context context = getContext();
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        int i2 = this.o;
        if (i2 == 2) {
            this.o = 1;
        } else if (i2 == 1) {
            this.o = 3;
        } else if (i2 == 3) {
            this.o = 2;
        }
        k();
        this.f88680h.setAligin(this.o);
        int i3 = this.o;
        String str = "center";
        if (i3 != 2) {
            if (i3 == 1) {
                str = "left";
            } else if (i3 == 3) {
                str = "right";
            }
        }
        h hVar = this.B;
        if (hVar != null) {
            hVar.a(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r1 == 4) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.editSticker.e r0 = com.ss.android.ugc.aweme.editSticker.g.a()
            com.ss.android.ugc.aweme.editSticker.f r0 = r0.f88138b
            boolean r0 = r0.f88146a
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0048
            int r0 = r7.f88685m
            if (r0 != r3) goto L_0x003b
            r7.f88685m = r6
        L_0x0014:
            r7.l()
            com.ss.android.ugc.aweme.editSticker.text.view.TextStickerEditText r2 = r7.f88680h
            int r1 = r7.f88685m
            int r0 = r7.p
            r2.a(r1, r0)
            int r1 = r7.f88685m
            r7.n = r1
            r0 = 0
            if (r1 != r3) goto L_0x0030
        L_0x0027:
            r5 = 0
        L_0x0028:
            com.ss.android.ugc.aweme.editSticker.text.c.h r0 = r7.B
            if (r0 == 0) goto L_0x002f
            r0.b(r5)
        L_0x002f:
            return
        L_0x0030:
            if (r1 != r4) goto L_0x0034
            r5 = 1
            goto L_0x0028
        L_0x0034:
            if (r1 != r5) goto L_0x0038
            r5 = 2
            goto L_0x0028
        L_0x0038:
            if (r1 != r6) goto L_0x0027
            goto L_0x0028
        L_0x003b:
            if (r0 != r6) goto L_0x0040
            r7.f88685m = r4
            goto L_0x0014
        L_0x0040:
            if (r0 != r4) goto L_0x0045
            r7.f88685m = r5
            goto L_0x0014
        L_0x0045:
            r7.f88685m = r3
            goto L_0x0014
        L_0x0048:
            int r0 = r7.f88685m
            if (r0 != r3) goto L_0x004f
            r7.f88685m = r4
            goto L_0x0014
        L_0x004f:
            if (r0 != r4) goto L_0x0054
            r7.f88685m = r5
            goto L_0x0014
        L_0x0054:
            r7.f88685m = r3
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.view.i.f():void");
    }

    public void setBgColorChangeListener(com.ss.android.ugc.aweme.editSticker.text.c.c cVar) {
        this.f88677e = cVar;
    }

    public void setInputLayoutShowListener(com.ss.android.ugc.aweme.editSticker.text.c.f fVar) {
        this.f88676d = fVar;
    }

    public void setOnReadTextClickListener(a aVar) {
        this.I = aVar;
    }

    public void setTextStickerInputMobListener(h hVar) {
        this.B = hVar;
    }

    public void setTextStickerUpdateListener(b bVar) {
        this.M = bVar;
    }

    public void setTextStickerView(q qVar) {
        this.t = qVar;
    }

    public void setVisibleController(c cVar) {
        this.D = cVar;
    }

    public void setWikiTextStickerMob(f fVar) {
        this.C = fVar;
    }

    public final void a(int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f88678f.getLayoutParams();
        layoutParams.bottomMargin = i2;
        this.f88678f.setLayoutParams(layoutParams);
    }

    public final void b(int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f88678f.getLayoutParams();
        layoutParams.bottomMargin += i2;
        this.f88678f.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i2) {
        this.f88680h.a(this.f88685m, i2);
        this.p = i2;
        h hVar = this.B;
        if (hVar != null) {
            hVar.a(i2);
        }
    }

    public void setData(TextStickerData textStickerData) {
        int bgMode = textStickerData.getBgMode();
        int color = textStickerData.getColor();
        int align = textStickerData.getAlign();
        this.f88685m = bgMode;
        this.p = color;
        this.o = align;
        if (TextUtils.isEmpty(textStickerData.getFontType())) {
            com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(textStickerData.getFontType(), getScene());
        }
    }

    public void setReadTextIcon(boolean z2) {
        ImageView imageView = this.f88684l;
        if (imageView != null) {
            imageView.setClickable(true);
            this.f88684l.setAlpha(1.0f);
            this.H = z2;
            if (z2) {
                this.f88684l.setImageResource(2131232705);
            } else {
                this.f88684l.setImageResource(2131232706);
            }
        }
    }

    private void b(com.ss.android.ugc.aweme.editSticker.text.a.c cVar) {
        boolean z2;
        if (cVar != null) {
            if (cVar.f88295c == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (this.n == -1 || this.f88685m != 1) {
                    this.n = this.f88685m;
                    this.f88685m = 1;
                }
                this.f88682j.setAlpha(0.34f);
                this.f88682j.setClickable(false);
                this.f88682j.setTag(false);
                return;
            }
            int i2 = this.n;
            if (i2 != -1) {
                this.f88685m = i2;
            }
            this.f88682j.setAlpha(1.0f);
            this.f88682j.setClickable(true);
            this.f88682j.setTag(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.editSticker.text.a.c cVar) {
        if (cVar != null) {
            b(cVar);
            com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(cVar.f88297e, getScene());
            this.f88680h.setFontType(com.ss.android.ugc.aweme.editSticker.text.a.b.a().c(getScene()));
            this.f88680h.a(this.f88685m, this.p);
            if (getScene() == 0) {
                if (cVar.f88298f > 0) {
                    this.f88680h.setFontSize(cVar.f88298f);
                } else {
                    this.f88680h.setFontSize(28);
                }
            }
            h hVar = this.B;
            if (hVar != null) {
                hVar.a(cVar);
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3082);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(3082);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2949);
        this.f88673a = context;
        this.f88675c = (InputMethodManager) a(context, "input_method");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.w5});
            this.L = obtainStyledAttributes.getInt(0, 1);
            obtainStyledAttributes.recycle();
        }
        View inflate = LayoutInflater.from(this.f88673a).inflate(getLayoutRes(), (ViewGroup) null);
        this.f88679g = inflate;
        this.f88678f = inflate.findViewById(R.id.adr);
        this.N = this.f88679g.findViewById(R.id.bq1);
        this.f88680h = (TextStickerEditText) this.f88679g.findViewById(R.id.ay0);
        this.f88682j = (ImageView) this.f88679g.findViewById(R.id.e05);
        g gVar = new g(this.f88673a, getScene());
        gVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.r = gVar;
        gVar.a(com.ss.android.ugc.aweme.editSticker.text.a.b.a().b());
        ((LinearLayout) this.f88679g.findViewById(R.id.b8o)).addView(this.r);
        this.f88683k = (ImageView) this.f88679g.findViewById(R.id.iv);
        if (g.a().f88138b.f88149d) {
            ImageView imageView = (ImageView) this.f88679g.findViewById(R.id.etn);
            this.f88684l = imageView;
            imageView.setOnClickListener(new com.ss.android.ugc.aweme.views.d() {
                /* class com.ss.android.ugc.aweme.editSticker.text.view.i.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(55791);
                }

                @Override // com.ss.android.ugc.aweme.views.d
                public final void a(View view) {
                    if (i.this.I != null) {
                        i.this.I.a(t.i(i.this.getTextWrapList()), i.this.t);
                    }
                }
            });
            this.f88684l.setVisibility(0);
        }
        this.f88680h.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.ugc.aweme.editSticker.text.view.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(55792);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString().trim())) {
                    i.this.d();
                    return;
                }
                i iVar = i.this;
                iVar.setReadTextIcon(iVar.H);
            }
        });
        this.f88683k.setOnClickListener(new j(this));
        ColorSelectLayout colorSelectLayout = (ColorSelectLayout) this.f88679g.findViewById(R.id.a8n);
        this.f88681i = colorSelectLayout;
        colorSelectLayout.setColorChangeListener(new k(this));
        this.r.setClickFontStyleListener(new l(this));
        this.f88682j.setOnClickListener(new com.ss.android.ugc.aweme.views.d() {
            /* class com.ss.android.ugc.aweme.editSticker.text.view.i.AnonymousClass3 */

            static {
                Covode.recordClassIndex(55793);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                i.this.f();
            }
        });
        this.s = (LinearLayout) this.f88679g.findViewById(R.id.cgs);
        View findViewById = this.f88679g.findViewById(R.id.ef9);
        View findViewById2 = this.f88679g.findViewById(R.id.f8l);
        if (this.L == 0) {
            this.q = findViewById;
            findViewById2.setVisibility(8);
        } else {
            this.q = findViewById2;
            findViewById.setVisibility(8);
        }
        this.q.setOnClickListener(new m(this));
        this.f88679g.setOnClickListener(new n(this));
        this.f88682j.setImageResource(2131232455);
        addView(this.f88679g);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f88679g.getLayoutParams();
        layoutParams.topMargin = getTopMargin();
        this.f88679g.setLayoutParams(layoutParams);
        findViewById(R.id.cyw).setOnClickListener(o.f88696a);
        this.O = this.f88679g.findViewById(R.id.sq);
        this.u = this.f88679g.findViewById(R.id.sp);
        View findViewById3 = this.f88679g.findViewById(R.id.dxs);
        this.P = findViewById3;
        findViewById3.setVisibility(8);
        this.O.setBackground(com.ss.android.ugc.tools.view.a.a(-1, 16777215, (int) com.ss.android.ttve.utils.b.b(getContext(), 2.0f), (int) com.ss.android.ttve.utils.b.b(getContext(), 4.0f)));
        this.u.setBackground(com.ss.android.ugc.tools.view.a.a(s.a().b().f88448a, GradientDrawable.Orientation.TR_BL));
        this.P.setOnClickListener(new p(this));
        com.ss.android.ugc.aweme.shortvideo.widget.a.b.a(this.P);
        this.f88682j.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.a.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(86929);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    b.a(view, true);
                } else if (action == 1 || action == 3) {
                    b.a(view, false);
                }
                return false;
            }
        });
        this.q.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86927);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    b.a(true, view);
                } else if (action == 1 || action == 3) {
                    b.a(false, view);
                }
                return false;
            }
        });
        com.ss.android.ugc.aweme.shortvideo.widget.a.b.a(this.f88683k);
        this.v = (LinearLayout) findViewById(R.id.cgt);
        e();
        MethodCollector.o(2949);
    }

    public final void a(String str, String str2, int i2) {
        a(t.a(str), 0, -1, 0, str2, true, 28, i2);
    }

    public final void a(String str, String str2, boolean z2) {
        this.w = str;
        this.x = str2;
        this.y = z2;
        this.z = false;
    }

    /* access modifiers changed from: protected */
    public final void b(List<TextStickerTextWrap> list, int i2, int i3, int i4, String str, boolean z2, int i5, int i6) {
        int d2;
        this.n = -1;
        m();
        com.ss.android.ugc.aweme.editSticker.f.d.a(this.f88680h);
        this.f88680h.setTextSize((float) i5);
        this.f88681i.a(z2, i3);
        String c2 = t.c(list);
        List<InteractTextStructWrap> d3 = t.d(list);
        this.E = d3;
        this.F = i6 - d3.size();
        this.f88680h.setTextStructWrapList(this.E);
        if (z2) {
            com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(getScene());
            a();
            if (getScene() == 0 && (d2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a().d()) > 0) {
                this.f88680h.setFontSize(d2);
            }
        } else {
            this.f88680h.a(c2, c2.length());
            this.f88681i.setSelectColorView(i3);
            this.f88685m = i2;
            this.o = i4;
            this.p = i3;
            com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(str, getScene());
        }
        l();
        this.f88680h.setFontType(com.ss.android.ugc.aweme.editSticker.text.a.b.a().c(getScene()));
        this.f88680h.a(i2, i3);
        this.f88680h.setAligin(this.o);
        this.r.a();
        k();
        b(com.ss.android.ugc.aweme.editSticker.text.a.b.a().d(getScene()));
        if (!this.A) {
            this.u.setBackground(com.ss.android.ugc.tools.view.a.a(s.a().b().f88448a, GradientDrawable.Orientation.TR_BL));
        }
    }

    public void a(List<TextStickerTextWrap> list, int i2, int i3, int i4, String str, boolean z2, int i5, int i6) {
        if (this.G) {
            setEffectText(list);
        } else {
            b(list, i2, i3, i4, str, z2, i5, i6);
        }
        if (this.f88674b || z2) {
            this.f88674b = false;
            b();
        }
        q qVar = this.t;
        if (!(qVar == null || qVar.getData() == null)) {
            setReadTextIcon(this.t.getData().getHasReadTextAudio());
        }
        if (this.J) {
            ImageView imageView = this.f88684l;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = this.f88684l;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        final com.ss.android.ugc.aweme.editSticker.interact.g gVar = new com.ss.android.ugc.aweme.editSticker.interact.g();
        if (!this.J && gVar.f88167a.getInt("edit_text_tux_bubble_1", 0) < 2) {
            postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.editSticker.text.view.i.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(55794);
                }

                public final void run() {
                    if (i.this.f88684l != null) {
                        try {
                            gVar.a(false);
                            i.this.K = ((com.bytedance.tux.tooltip.a.b.a) ((com.bytedance.tux.tooltip.a.b.a) ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(i.this.getContext()).b(i.this.f88684l)).a(com.bytedance.tux.tooltip.h.TOP)).a(5000L)).e(R.string.geg).d();
                            i.this.K.a();
                            if (i.this.B != null) {
                                i.this.B.a();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }, 200);
        }
    }
}

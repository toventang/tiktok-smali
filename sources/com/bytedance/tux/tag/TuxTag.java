package com.bytedance.tux.tag;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.a.c;
import com.bytedance.tux.b.a.d;
import com.bytedance.tux.b.g;
import com.bytedance.tux.b.k;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public final class TuxTag extends TuxTextView implements com.bytedance.tux.icon.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f45469f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f45470a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45471b;

    /* renamed from: e  reason: collision with root package name */
    public boolean f45472e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f45473g;

    /* renamed from: h  reason: collision with root package name */
    private int f45474h;

    /* renamed from: i  reason: collision with root package name */
    private int f45475i;

    /* renamed from: j  reason: collision with root package name */
    private int f45476j;

    /* renamed from: k  reason: collision with root package name */
    private int f45477k;

    /* renamed from: l  reason: collision with root package name */
    private int f45478l;

    /* renamed from: m  reason: collision with root package name */
    private RectF f45479m;
    private final com.bytedance.tux.icon.b n;
    private k<TuxTag> o;

    static {
        Covode.recordClassIndex(27686);
    }

    public TuxTag(Context context) {
        this(context, null, 0, 6);
    }

    public TuxTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27687);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        int i2;
        if (this.f45473g && this.f45471b) {
            if (TextUtils.isEmpty(getText())) {
                i2 = 0;
            } else {
                i2 = this.f45470a;
            }
            this.n.a(this.f45472e);
            this.n.a(i2);
        }
    }

    private final void b() {
        setTagSize(this.f45478l);
        this.f45474h = getMinWidth();
        this.f45475i = getMaxWidth();
        setGravity(19);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
        int i2 = this.f45470a;
        if (i2 <= 0) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            i2 = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
        }
        setCompoundDrawablePadding(i2);
        setTextColor(this.f45477k);
        setTagBackgroundColor(this.f45476j);
        a();
        int i3 = this.f45475i;
        if (i3 < Integer.MAX_VALUE) {
            setMaxWidth(i3);
        }
        int i4 = this.f45474h;
        if (i4 > 0) {
            setMinWidth(i4);
        }
        this.o.a(this, (int) R.attr.g6);
    }

    @Override // com.bytedance.tux.icon.a
    public final void setIconHeight(int i2) {
        this.n.f45108a = i2;
        a();
    }

    @Override // com.bytedance.tux.icon.a
    public final void setIconWidth(int i2) {
        this.n.f45109b = i2;
        a();
    }

    public final void setTagTextColor(int i2) {
        this.f45477k = i2;
        setTextColor(i2);
    }

    public final void setIconTintColor(int i2) {
        this.n.f45110c = Integer.valueOf(i2);
        a();
    }

    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (this.f45473g) {
            this.o.a(this);
        }
    }

    public final void setTagBackgroundColor(int i2) {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i2);
        }
    }

    public final void setTagIcon(Integer num) {
        this.n.a(num);
        a();
    }

    public final void setTagSize(int i2) {
        this.f45478l = i2;
        this.o.a(this, R.attr.arb, i2);
    }

    final class b extends com.bytedance.tux.b.a.b<TuxTag> {

        /* renamed from: b  reason: collision with root package name */
        private final d f45481b = new d();

        /* renamed from: c  reason: collision with root package name */
        private final c f45482c = new c();

        static {
            Covode.recordClassIndex(27688);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
        @Override // com.bytedance.tux.b.a.b
        public final /* synthetic */ Map a(TuxTag tuxTag, Map map) {
            TuxTag tuxTag2 = tuxTag;
            l.c(tuxTag2, "");
            l.c(map, "");
            return super.a(tuxTag2, this.f45482c.a(tuxTag2, this.f45481b.a((TuxTextView) tuxTag2, (Map<Integer, ? extends Object>) map)));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
        @Override // com.bytedance.tux.b.a.b
        public final /* synthetic */ boolean a(TuxTag tuxTag, int i2, Object obj) {
            l.c(tuxTag, "");
            l.c(obj, "");
            boolean z = false;
            if (i2 == g.w().f44668a) {
                g.w();
                l.c(obj, "");
                int intValue = ((Number) obj).intValue();
                TuxTag.this.f45470a = intValue;
                TuxTag tuxTag2 = TuxTag.this;
                if (intValue > 0) {
                    z = true;
                }
                tuxTag2.f45471b = z;
                TuxTag.this.a();
                return true;
            } else if (i2 != g.x().f44668a) {
                return false;
            } else {
                g.x();
                l.c(obj, "");
                int intValue2 = ((Number) obj).intValue();
                TuxTag.this.setPadding(intValue2, 0, intValue2, 0);
                return true;
            }
        }
    }

    public final void setHollow(boolean z) {
        PorterDuffXfermode porterDuffXfermode;
        this.f45472e = z;
        TextPaint paint = getPaint();
        l.a((Object) paint, "");
        if (z) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        } else {
            porterDuffXfermode = null;
        }
        paint.setXfermode(porterDuffXfermode);
        a();
    }

    @Override // com.bytedance.tux.icon.a
    public final void setIconTintColorRes(int i2) {
        Context context = getContext();
        l.a((Object) context, "");
        Integer a2 = com.bytedance.tux.h.d.a(context, i2);
        if (a2 != null) {
            setIconTintColor(a2.intValue());
        }
    }

    public final void draw(Canvas canvas) {
        if (canvas != null) {
            this.f45479m.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            if (Build.VERSION.SDK_INT >= 21) {
                canvas.saveLayer(this.f45479m, null);
            } else {
                canvas.saveLayer(this.f45479m, null, 31);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public final void setTagIconBitmap(Bitmap bitmap) {
        l.c(bitmap, "");
        com.bytedance.tux.icon.b bVar = this.n;
        Context context = getContext();
        l.a((Object) context, "");
        l.c(context, "");
        l.c(bitmap, "");
        com.bytedance.tux.c.b bVar2 = new com.bytedance.tux.c.b(context, -1);
        bVar2.f44757a = new BitmapDrawable(context.getResources(), bitmap);
        bVar.f45113f = bVar2;
        a();
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxTag(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        this.f45475i = Integer.MAX_VALUE;
        this.f45476j = -1;
        this.f45477k = -1;
        this.f45471b = true;
        this.f45479m = new RectF();
        this.o = new k<>(new b());
        this.f45473g = true;
        com.bytedance.tux.icon.b bVar = new com.bytedance.tux.icon.b(this);
        this.n = bVar;
        bVar.a(attributeSet, i2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aob, R.attr.apa, R.attr.apl, R.attr.apn, R.attr.ar8, R.attr.ar_, R.attr.arb, R.attr.arc}, i2, 0);
            l.a((Object) obtainStyledAttributes, "");
            this.f45478l = obtainStyledAttributes.getInt(6, -1);
            this.f45476j = obtainStyledAttributes.getColor(0, -7829368);
            setHollow(obtainStyledAttributes.getBoolean(5, false));
            this.f45477k = obtainStyledAttributes.getColor(7, -1);
            int color = obtainStyledAttributes.getColor(4, -1);
            obtainStyledAttributes.recycle();
            bVar.f45110c = Integer.valueOf(color);
        }
        b();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxTag(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.cb : i2);
    }
}

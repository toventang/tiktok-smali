package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.an;
import androidx.appcompat.widget.z;
import com.bytedance.covode.number.Covode;

public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, p.a, ActionMenuView.a {

    /* renamed from: a  reason: collision with root package name */
    j f1116a;

    /* renamed from: b  reason: collision with root package name */
    h.b f1117b;

    /* renamed from: c  reason: collision with root package name */
    b f1118c;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1119e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1120f;

    /* renamed from: g  reason: collision with root package name */
    private z f1121g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1122h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1123i;

    /* renamed from: j  reason: collision with root package name */
    private int f1124j;

    /* renamed from: k  reason: collision with root package name */
    private int f1125k;

    /* renamed from: l  reason: collision with root package name */
    private int f1126l;

    public static abstract class b {
        static {
            Covode.recordClassIndex(323);
        }

        public abstract s a();
    }

    static {
        Covode.recordClassIndex(321);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public final boolean a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.p.a
    public j getItemData() {
        return this.f1116a;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean d() {
        return b();
    }

    public final boolean b() {
        if (!TextUtils.isEmpty(getText())) {
            return true;
        }
        return false;
    }

    class a extends z {
        static {
            Covode.recordClassIndex(322);
        }

        @Override // androidx.appcompat.widget.z
        public final s a() {
            if (ActionMenuItemView.this.f1118c != null) {
                return ActionMenuItemView.this.f1118c.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.z
        public final boolean b() {
            s a2;
            if (ActionMenuItemView.this.f1117b == null || !ActionMenuItemView.this.f1117b.a(ActionMenuItemView.this.f1116a) || (a2 = a()) == null || !a2.e()) {
                return false;
            }
            return true;
        }

        public a() {
            super(ActionMenuItemView.this);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean c() {
        if (!b() || this.f1116a.getIcon() != null) {
            return false;
        }
        return true;
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 >= 480) {
            return true;
        }
        if ((i2 < 640 || i3 < 480) && configuration.orientation != 2) {
            return false;
        }
        return true;
    }

    private void f() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1119e);
        if (this.f1120f != null && (!this.f1116a.i() || (!this.f1122h && !this.f1123i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.f1119e;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f1116a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.f1116a.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1116a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f1116a.getTitle();
            }
            an.a(this, charSequence2);
            return;
        }
        an.a(this, tooltipText);
    }

    public void setItemInvoker(h.b bVar) {
        this.f1117b = bVar;
    }

    public void setPopupCallback(b bVar) {
        this.f1118c = bVar;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1119e = charSequence;
        f();
    }

    public void onClick(View view) {
        h.b bVar = this.f1117b;
        if (bVar != null) {
            bVar.a(this.f1116a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1122h = e();
        f();
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1123i != z) {
            this.f1123i = z;
            j jVar = this.f1116a;
            if (jVar != null) {
                jVar.f1231d.h();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        z zVar;
        if (!this.f1116a.hasSubMenu() || (zVar = this.f1121g) == null || !zVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public final void a(j jVar) {
        int i2;
        this.f1116a = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.a((p.a) this));
        setId(jVar.getItemId());
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1121g == null) {
            this.f1121g = new a();
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1120f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1126l;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        boolean b2 = b();
        if (b2 && (i5 = this.f1125k) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(size, this.f1124j);
        } else {
            i4 = this.f1124j;
        }
        if (mode != 1073741824 && this.f1124j > 0 && measuredWidth < i4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
        }
        if (!b2 && this.f1120f != null) {
            super.setPadding((getMeasuredWidth() - this.f1120f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    private ActionMenuItemView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1122h = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071}, 0, 0);
        this.f1124j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1126l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1125k = -1;
        setSaveEnabled(false);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f1125k = i2;
        super.setPadding(i2, i3, i4, i5);
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.al;
import androidx.core.h.v;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, p.a {

    /* renamed from: a  reason: collision with root package name */
    private j f1131a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f1132b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f1133c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f1134d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f1135e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f1136f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f1137g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f1138h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f1139i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f1140j;

    /* renamed from: k  reason: collision with root package name */
    private int f1141k;

    /* renamed from: l  reason: collision with root package name */
    private Context f1142l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1143m;
    private Drawable n;
    private boolean o;
    private int p;
    private LayoutInflater q;
    private boolean r;

    static {
        Covode.recordClassIndex(325);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public j getItemData() {
        return this.f1131a;
    }

    private void b() {
        RadioButton radioButton = (RadioButton) a.a(getInflater(), R.layout.ai, this, false);
        this.f1133c = radioButton;
        a(radioButton, -1);
    }

    private void c() {
        CheckBox checkBox = (CheckBox) a.a(getInflater(), R.layout.af, this, false);
        this.f1135e = checkBox;
        a(checkBox, -1);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        v.a(this, this.f1140j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1134d = textView;
        int i2 = this.f1141k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1142l, i2);
        }
        this.f1136f = (TextView) findViewById(R.id.e3e);
        ImageView imageView = (ImageView) findViewById(R.id.edn);
        this.f1137g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.f1138h = (ImageView) findViewById(R.id.bd_);
        this.f1139i = (LinearLayout) findViewById(R.id.adh);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.f1143m = z;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i2;
        ImageView imageView = this.f1137g;
        if (imageView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1131a.e()) {
            if (this.f1133c == null) {
                b();
            }
            compoundButton = this.f1133c;
        } else {
            if (this.f1135e == null) {
                c();
            }
            compoundButton = this.f1135e;
        }
        compoundButton.setChecked(z);
    }

    public void setGroupDividerEnabled(boolean z) {
        int i2;
        ImageView imageView = this.f1138h;
        if (imageView != null) {
            if (this.o || !z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1138h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1138h.getLayoutParams();
            rect.top += this.f1138h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1134d.setText(charSequence);
            if (this.f1134d.getVisibility() != 0) {
                this.f1134d.setVisibility(0);
            }
        } else if (this.f1134d.getVisibility() != 8) {
            this.f1134d.setVisibility(8);
        }
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1133c != null || this.f1135e != null) {
            if (this.f1131a.e()) {
                if (this.f1133c == null) {
                    b();
                }
                compoundButton = this.f1133c;
                compoundButton2 = this.f1135e;
            } else {
                if (this.f1135e == null) {
                    c();
                }
                compoundButton = this.f1135e;
                compoundButton2 = this.f1133c;
            }
            if (z) {
                compoundButton.setChecked(this.f1131a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1135e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1133c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.f1131a.f1231d.f1221k || this.r) {
            z = true;
        } else {
            z = false;
            if (!this.f1143m) {
                return;
            }
        }
        if (this.f1132b == null) {
            if (drawable != null || this.f1143m) {
                ImageView imageView = (ImageView) a.a(getInflater(), R.layout.ag, this, false);
                this.f1132b = imageView;
                a(imageView, 0);
            } else {
                return;
            }
        }
        if (drawable != null || this.f1143m) {
            ImageView imageView2 = this.f1132b;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1132b.getVisibility() != 0) {
                this.f1132b.setVisibility(0);
                return;
            }
            return;
        }
        this.f1132b.setVisibility(8);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public final void a(j jVar) {
        int i2;
        int i3;
        String sb;
        this.f1131a = jVar;
        int i4 = 0;
        this.p = 0;
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(jVar.a((p.a) this));
        setCheckable(jVar.isCheckable());
        boolean d2 = jVar.d();
        jVar.c();
        if (!d2 || !this.f1131a.d()) {
            i4 = 8;
        } else {
            TextView textView = this.f1136f;
            j jVar2 = this.f1131a;
            char c2 = jVar2.c();
            if (c2 == 0) {
                sb = "";
            } else {
                Resources resources = jVar2.f1231d.f1211a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(jVar2.f1231d.f1211a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.m_));
                }
                if (jVar2.f1231d.c()) {
                    i3 = jVar2.f1230c;
                } else {
                    i3 = jVar2.f1229b;
                }
                j.a(sb2, i3, 65536, resources.getString(R.string.m6));
                j.a(sb2, i3, 4096, resources.getString(R.string.m2));
                j.a(sb2, i3, 2, resources.getString(R.string.m1));
                j.a(sb2, i3, 1, resources.getString(R.string.m7));
                j.a(sb2, i3, 4, resources.getString(R.string.m9));
                j.a(sb2, i3, 8, resources.getString(R.string.m5));
                if (c2 == '\b') {
                    sb2.append(resources.getString(R.string.m3));
                } else if (c2 == '\n') {
                    sb2.append(resources.getString(R.string.m4));
                } else if (c2 != ' ') {
                    sb2.append(c2);
                } else {
                    sb2.append(resources.getString(R.string.m8));
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f1136f.getVisibility() != i4) {
            this.f1136f.setVisibility(i4);
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private void a(View view, int i2) {
        LinearLayout linearLayout = this.f1139i;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f1132b != null && this.f1143m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1132b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }

    private ListMenuItemView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet);
        al a2 = al.a(getContext(), attributeSet, new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.a7o, R.attr.afs}, R.attr.a2s, 0);
        this.f1140j = a2.a(5);
        this.f1141k = a2.g(1, -1);
        this.f1143m = a2.a(7, false);
        this.f1142l = context;
        this.n = a2.a(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.s3, 0);
        this.o = obtainStyledAttributes.hasValue(0);
        a2.f1549a.recycle();
        obtainStyledAttributes.recycle();
    }
}

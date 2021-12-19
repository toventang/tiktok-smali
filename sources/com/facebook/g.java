package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.facebook.a.m;
import com.facebook.internal.a.b.a;
import com.facebook.internal.s;
import com.zhiliaoapp.musically.R;

public abstract class g extends Button {

    /* renamed from: a  reason: collision with root package name */
    String f47599a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnClickListener f47600b;

    /* renamed from: c  reason: collision with root package name */
    private String f47601c;

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f47602d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47603e;

    /* renamed from: f  reason: collision with root package name */
    private int f47604f;

    /* renamed from: g  reason: collision with root package name */
    private int f47605g;

    /* renamed from: h  reason: collision with root package name */
    private s f47606h;

    static {
        Covode.recordClassIndex(28862);
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        a.a(this);
        return 0;
    }

    public int getCompoundPaddingLeft() {
        if (a.a(this)) {
            return 0;
        }
        try {
            if (this.f47603e) {
                return this.f47604f;
            }
            return super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            a.a(th, this);
            return 0;
        }
    }

    public int getCompoundPaddingRight() {
        if (a.a(this)) {
            return 0;
        }
        try {
            if (this.f47603e) {
                return this.f47605g;
            }
            return super.getCompoundPaddingRight();
        } catch (Throwable th) {
            a.a(th, this);
            return 0;
        }
    }

    public Fragment getFragment() {
        if (a.a(this)) {
            return null;
        }
        try {
            s sVar = this.f47606h;
            if (sVar != null) {
                return sVar.f48676a;
            }
            return null;
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }

    public android.app.Fragment getNativeFragment() {
        if (a.a(this)) {
            return null;
        }
        try {
            s sVar = this.f47606h;
            if (sVar != null) {
                return sVar.f48677b;
            }
            return null;
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (a.a(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            a.a(th, this);
            return 0;
        }
    }

    public Activity getActivity() {
        if (a.a(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new j("Unable to get Activity.");
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }

    public void onAttachedToWindow() {
        if (!a.a(this)) {
            try {
                super.onAttachedToWindow();
                if (!isInEditMode()) {
                    Context context = getContext();
                    if (!a.a(this)) {
                        try {
                            new m(context).b();
                        } catch (Throwable th) {
                            a.a(th, this);
                        }
                    }
                }
            } catch (Throwable th2) {
                a.a(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (!a.a(this)) {
            try {
                this.f47602d = onClickListener;
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (!a.a(this)) {
            try {
                this.f47600b = onClickListener;
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    static /* synthetic */ View.OnClickListener a(g gVar) {
        if (a.a(g.class)) {
            return null;
        }
        try {
            return gVar.f47602d;
        } catch (Throwable th) {
            a.a(th, g.class);
            return null;
        }
    }

    static /* synthetic */ View.OnClickListener b(g gVar) {
        if (a.a(g.class)) {
            return null;
        }
        try {
            return gVar.f47600b;
        } catch (Throwable th) {
            a.a(th, g.class);
            return null;
        }
    }

    public void setFragment(android.app.Fragment fragment) {
        if (!a.a(this)) {
            try {
                this.f47606h = new s(fragment);
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a(String str) {
        if (a.a(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil((double) getPaint().measureText(str));
        } catch (Throwable th) {
            a.a(th, this);
            return 0;
        }
    }

    public void setFragment(Fragment fragment) {
        if (!a.a(this)) {
            try {
                this.f47606h = new s(fragment);
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (!a.a(this)) {
            try {
                if ((getGravity() & 1) != 0) {
                    int compoundPaddingLeft = getCompoundPaddingLeft();
                    int compoundPaddingRight = getCompoundPaddingRight();
                    int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - a(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                    this.f47604f = compoundPaddingLeft - min;
                    this.f47605g = compoundPaddingRight + min;
                    this.f47603e = true;
                }
                super.onDraw(canvas);
                this.f47603e = false;
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    public g(Context context, String str, String str2) {
        super(context, null, 0);
        int defaultStyleResource = getDefaultStyleResource();
        a(context, null, 0, defaultStyleResource == 0 ? R.style.vi : defaultStyleResource);
        this.f47601c = str;
        this.f47599a = str2;
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: finally extract failed */
    public void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        if (!a.a(this)) {
            try {
                if (!a.a(this)) {
                    try {
                        if (!isInEditMode()) {
                            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i2, i3);
                            try {
                                if (obtainStyledAttributes.hasValue(0)) {
                                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                                    if (resourceId != 0) {
                                        setBackgroundResource(resourceId);
                                    } else {
                                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                                    }
                                } else {
                                    setBackgroundColor(b.c(context, R.color.fk));
                                }
                            } finally {
                                obtainStyledAttributes.recycle();
                            }
                        }
                    } catch (Throwable th) {
                        a.a(th, this);
                    }
                }
                if (!a.a(this)) {
                    try {
                        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i2, i3);
                        try {
                            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes2.getResourceId(0, 0), obtainStyledAttributes2.getResourceId(1, 0), obtainStyledAttributes2.getResourceId(2, 0), obtainStyledAttributes2.getResourceId(3, 0));
                            setCompoundDrawablePadding(obtainStyledAttributes2.getDimensionPixelSize(4, 0));
                        } finally {
                            obtainStyledAttributes2.recycle();
                        }
                    } catch (Throwable th2) {
                        a.a(th2, this);
                    }
                }
                if (!a.a(this)) {
                    try {
                        TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i2, i3);
                        try {
                            setPadding(obtainStyledAttributes3.getDimensionPixelSize(0, 0), obtainStyledAttributes3.getDimensionPixelSize(1, 0), obtainStyledAttributes3.getDimensionPixelSize(2, 0), obtainStyledAttributes3.getDimensionPixelSize(3, 0));
                        } finally {
                            obtainStyledAttributes3.recycle();
                        }
                    } catch (Throwable th3) {
                        a.a(th3, this);
                    }
                }
                if (!a.a(this)) {
                    try {
                        TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i2, i3);
                        try {
                            setTextColor(obtainStyledAttributes4.getColorStateList(0));
                            obtainStyledAttributes4.recycle();
                            TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i2, i3);
                            try {
                                setGravity(obtainStyledAttributes5.getInt(0, 17));
                                obtainStyledAttributes5.recycle();
                                TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i2, i3);
                                try {
                                    setTextSize(0, (float) obtainStyledAttributes6.getDimensionPixelSize(0, 0));
                                    setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes6.getInt(1, 1)));
                                    setText(obtainStyledAttributes6.getString(2));
                                } finally {
                                    obtainStyledAttributes6.recycle();
                                }
                            } catch (Throwable th4) {
                                obtainStyledAttributes5.recycle();
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            obtainStyledAttributes4.recycle();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        a.a(th6, this);
                    }
                }
                if (!a.a(this)) {
                    try {
                        super.setOnClickListener(new View.OnClickListener() {
                            /* class com.facebook.g.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(28863);
                            }

                            public final void onClick(View view) {
                                if (!a.a(this)) {
                                    try {
                                        g gVar = g.this;
                                        Context context = gVar.getContext();
                                        if (!a.a(g.class)) {
                                            try {
                                                if (!a.a(gVar)) {
                                                    try {
                                                        new m(context).b();
                                                    } catch (Throwable th) {
                                                        a.a(th, gVar);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                a.a(th2, g.class);
                                            }
                                        }
                                        if (g.a(g.this) != null) {
                                            g.a(g.this).onClick(view);
                                        } else if (g.b(g.this) != null) {
                                            g.b(g.this).onClick(view);
                                        }
                                    } catch (Throwable th3) {
                                        a.a(th3, this);
                                    }
                                }
                            }
                        });
                    } catch (Throwable th7) {
                        a.a(th7, this);
                    }
                }
            } catch (Throwable th8) {
                a.a(th8, this);
            }
        }
    }
}

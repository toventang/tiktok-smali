package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ai;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.l;
import com.zhiliaoapp.musically.R;

public class SoftInputResizeFuncLayoutView extends a implements c {

    /* renamed from: d  reason: collision with root package name */
    protected c.a f100856d;

    /* renamed from: e  reason: collision with root package name */
    private View f100857e;

    /* renamed from: f  reason: collision with root package name */
    private EditText f100858f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f100859g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f100860h;

    /* renamed from: i  reason: collision with root package name */
    private int f100861i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f100862j;

    static {
        Covode.recordClassIndex(64521);
    }

    public final void c() {
        a(-2);
    }

    public int getSoftKeyboardHeight() {
        return d.a(0);
    }

    private int getCurrentHeight() {
        if (this.f100860h) {
            return d.a(this.f100861i);
        }
        return this.f100861i;
    }

    public int getPanelHeight() {
        if (!a()) {
            return 0;
        }
        if (this.f100862j) {
            return getSoftKeyboardHeight();
        }
        return getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean d() {
        boolean z = false;
        if (this.f100859g) {
            return false;
        }
        Rect rect = new Rect();
        Activity a2 = com.bytedance.tux.h.c.a(getContext());
        if (a2 == null) {
            return false;
        }
        View view = this.f100857e;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            a2.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int f2 = i.f(a2);
        int a3 = ai.a(a2);
        int b2 = i.b();
        int i2 = ((f2 - rect.bottom) - a3) + b2;
        if (i2 >= (((f2 - a3) - b2) / 10) * 3) {
            z = true;
        }
        if (this.f100862j != z) {
            this.f100862j = z;
            getLocationInWindow(new int[2]);
            if (z) {
                if (i2 > 0) {
                    d.f100866a = i2;
                }
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                int currentHeight = getCurrentHeight();
                if (layoutParams.height != currentHeight) {
                    layoutParams.height = currentHeight;
                    setLayoutParams(layoutParams);
                }
                this.f100863a = -2;
                if (this.f100864b != null) {
                    this.f100864b.a(this.f100863a, null);
                }
            } else if (this.f100863a == -2) {
                a(-1);
            }
        }
        return z;
    }

    public void setDefaultPanelHeight(int i2) {
        this.f100861i = i2;
    }

    public void setEditText(EditText editText) {
        this.f100858f = editText;
    }

    public void setForceHide(boolean z) {
        this.f100859g = z;
    }

    public void setOnKeyBordChangedListener(c.a aVar) {
        this.f100856d = aVar;
    }

    public void setOuterView(View view) {
        this.f100857e = view;
    }

    public void setResizable(boolean z) {
        this.f100860h = z;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.a
    public final void a(int i2) {
        if (this.f100863a != i2) {
            Activity a2 = com.bytedance.tux.h.c.a(getContext());
            if (i2 == -1) {
                setVisibility(8);
                l.a(a2, this.f100858f);
                this.f100863a = i2;
                if (this.f100864b != null) {
                    this.f100864b.a(i2, null);
                }
            } else if (i2 == -2) {
                this.f100858f.requestFocus();
                EditText editText = this.f100858f;
                if (editText != null) {
                    Context context = editText.getContext();
                    h.f.b.l.b(context, "");
                    InputMethodManager a3 = l.a(context);
                    if (a3 != null && !a3.showSoftInput(editText, 0)) {
                        editText.postDelayed(new l.a(a3, editText), 100);
                    }
                }
                this.f100863a = i2;
                if (this.f100864b != null) {
                    this.f100864b.a(i2, null);
                }
            } else {
                View view = (View) this.f100865c.get(i2);
                if (view != null) {
                    setVisibility(0);
                    int size = this.f100865c.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        int keyAt = this.f100865c.keyAt(i3);
                        if (keyAt != i2) {
                            ((View) this.f100865c.get(keyAt)).setVisibility(8);
                        }
                    }
                    view.setVisibility(0);
                    this.f100863a = i2;
                    if (this.f100864b != null) {
                        this.f100864b.a(i2, view);
                    }
                    l.a(a2, this.f100858f);
                }
            }
        }
    }

    public SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), 1073741824));
    }

    private SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        this.f100860h = true;
        this.f100861i = getResources().getDimensionPixelSize(R.dimen.mo);
        getViewTreeObserver().addOnGlobalLayoutListener(new e(this));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }
}

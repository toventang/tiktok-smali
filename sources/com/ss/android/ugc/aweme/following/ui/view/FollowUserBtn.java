package com.ss.android.ugc.aweme.following.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.d;
import androidx.lifecycle.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.ui.common.rebranding.a;
import com.bytedance.ies.dmt.ui.common.rebranding.b;
import com.bytedance.ies.dmt.ui.common.rebranding.c;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public class FollowUserBtn extends RelativeLayout implements b, a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f96596a;

    /* renamed from: b  reason: collision with root package name */
    protected NiceWidthTextView f96597b;

    /* renamed from: c  reason: collision with root package name */
    protected int f96598c;

    /* renamed from: d  reason: collision with root package name */
    protected int f96599d;

    /* renamed from: e  reason: collision with root package name */
    protected int f96600e;

    /* renamed from: f  reason: collision with root package name */
    public int f96601f;

    static {
        Covode.recordClassIndex(61239);
    }

    /* access modifiers changed from: protected */
    public int getFollowedTextColorResId() {
        return R.color.bx;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        return R.layout.mp;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowBgResId() {
        return R.drawable.azs;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowTextColorResId() {
        return R.color.a9;
    }

    public void c() {
        this.f96597b.setFontDefinition(52);
    }

    public ViewGroup.LayoutParams getButtonLayoutParams() {
        return this.f96597b.getLayoutParams();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public m getLifeCycleOwner() {
        return (d) o.d(this);
    }

    public static boolean b() {
        if (!IMUnder16ProxyImpl.n().d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int getFollowedBgResId() {
        if (this.f96596a) {
            return R.drawable.vf;
        }
        return R.drawable.azu;
    }

    public void a() {
        this.f96597b.setText(getResources().getText(R.string.bbg));
    }

    public void setForceDarkMode(boolean z) {
        this.f96596a = z;
    }

    public FollowUserBtn(Context context) {
        this(context, null);
    }

    public void setForceWidth(int i2) {
        if (this.f96599d != i2) {
            this.f96599d = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f96597b.setOnClickListener(onClickListener);
    }

    public void setFollowStatus(int i2) {
        if (this.f96598c != i2) {
            a(i2, -1);
        }
    }

    public void setButtonLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f96601f = layoutParams.width;
        a.a(getClass(), new a.C0729a(a(this.f96597b)));
        this.f96597b.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void setDoubleFollowButtonText(String str) {
        this.f96597b.setText(getResources().getText(R.string.bbg));
    }

    public void setFollowButtonTextAndIcon(int i2) {
        this.f96597b.setText(getResources().getText(R.string.byp));
        setFollowButtonStyle(-1);
    }

    public void setText(String str) {
        setVisibility(0);
        setFollowButtonStyle(-1);
        this.f96597b.setText(str);
        this.f96597b.setTextColor(getResources().getColor(getUnFollowTextColorResId()));
        this.f96597b.setBackground(getResources().getDrawable(getUnFollowBgResId()));
    }

    /* access modifiers changed from: protected */
    public final int a(Drawable drawable) {
        NiceWidthTextView niceWidthTextView = this.f96597b;
        int i2 = 0;
        if (niceWidthTextView == null || TextUtils.isEmpty(niceWidthTextView.getText())) {
            return 0;
        }
        TextPaint paint = this.f96597b.getPaint();
        Rect rect = new Rect();
        paint.getTextBounds(this.f96597b.getText().toString(), 0, this.f96597b.getText().toString().length(), rect);
        int width = rect.width();
        if (this.f96600e == 0) {
            this.f96600e = a(this.f96597b);
        }
        int i3 = this.f96600e;
        if (drawable != null) {
            i2 = drawable.getIntrinsicWidth();
        }
        return (int) ((((float) ((i3 - width) - i2)) - n.b(getContext(), 4.0f)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    public void setFollowButtonStyle(int i2) {
        if (i2 == -1) {
            this.f96597b.setPadding(0, 0, 0, 0);
            this.f96597b.setGravity(17);
            this.f96597b.setCompoundDrawables(null, null, null, null);
            return;
        }
        Drawable drawable = getContext().getResources().getDrawable(i2);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f96597b.setPadding(a(drawable), 0, 0, 0);
        this.f96597b.setCompoundDrawables(drawable, null, null, null);
        this.f96597b.setGravity(16);
    }

    @Override // com.bytedance.ies.dmt.ui.common.rebranding.b
    public int a(TextView textView) {
        int i2 = this.f96599d;
        if (i2 != -1) {
            return i2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.string.c06));
        arrayList.add(Integer.valueOf((int) R.string.bbg));
        arrayList.add(Integer.valueOf((int) R.string.bzw));
        arrayList.add(Integer.valueOf((int) R.string.bbi));
        arrayList.add(Integer.valueOf((int) R.string.byt));
        return c.a(textView, arrayList, (int) n.b(getContext(), 60.0f), (int) n.b(getContext(), 120.0f));
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public void a(int i2, int i3) {
        a(i2, i3, null);
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void b(final int i2, final int i3) {
        post(new Runnable() {
            /* class com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f96602a = 0;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f96603b = 0;

            static {
                Covode.recordClassIndex(61240);
            }

            public final void run() {
                Rect rect = new Rect();
                FollowUserBtn.this.getHitRect(rect);
                rect.left -= this.f96602a;
                rect.right += this.f96603b;
                rect.top -= i2;
                rect.bottom += i3;
                ((View) FollowUserBtn.this.getParent()).setTouchDelegate(new TouchDelegate(rect, FollowUserBtn.this));
            }
        });
    }

    public void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.uv});
        this.f96599d = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        obtainStyledAttributes.recycle();
        NiceWidthTextView niceWidthTextView = (NiceWidthTextView) com.a.b.a.a(context, getLayout(), this, true).findViewById(R.id.yg);
        this.f96597b = niceWidthTextView;
        niceWidthTextView.f33349a = this;
        this.f96600e = a(this.f96597b);
        a.a(getClass(), new a.C0729a(a(this.f96597b)));
        this.f96598c = 0;
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(6324);
        this.f96599d = -1;
        a(context, attributeSet);
        MethodCollector.o(6324);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public void a(int i2, int i3, String str) {
        int followedBgResId = getFollowedBgResId();
        setVisibility(0);
        if (i2 == 0) {
            if (i3 != -1) {
                setFollowButtonTextAndIcon(i3);
            }
            this.f96597b.setTextColor(getResources().getColor(getUnFollowTextColorResId()));
            this.f96597b.setBackground(getResources().getDrawable(getUnFollowBgResId()));
        } else if (i2 == 1) {
            if (i3 != -1) {
                setFollowButtonStyle(-1);
            }
            this.f96597b.setText(getResources().getText(R.string.c06));
            this.f96597b.setTextColor(getResources().getColor(getFollowedTextColorResId()));
            this.f96597b.setBackground(getResources().getDrawable(followedBgResId));
        } else if (i2 == 2) {
            if (i3 != -1) {
                setFollowButtonStyle(-1);
            }
            setDoubleFollowButtonText(str);
            this.f96597b.setTextColor(getResources().getColor(getFollowedTextColorResId()));
            this.f96597b.setBackground(getResources().getDrawable(followedBgResId));
        } else if (i2 == 3) {
            setVisibility(8);
        } else if (i2 == 4) {
            if (i3 != -1) {
                setFollowButtonStyle(-1);
            }
            this.f96597b.setText(getResources().getText(R.string.bzw));
            this.f96597b.setTextColor(getResources().getColor(getFollowedTextColorResId()));
            this.f96597b.setBackground(getResources().getDrawable(followedBgResId));
        }
        this.f96598c = i2;
    }
}

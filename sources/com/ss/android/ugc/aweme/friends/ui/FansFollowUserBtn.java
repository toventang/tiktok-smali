package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.ui.common.rebranding.a;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.ArrayList;

public class FansFollowUserBtn extends FollowUserBtn {

    /* renamed from: g  reason: collision with root package name */
    public static final a f97075g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f97076a;

    /* renamed from: h  reason: collision with root package name */
    private final h f97077h = i.a((h.f.a.a) new c(this));

    /* renamed from: i  reason: collision with root package name */
    private final h f97078i = i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f97079j = i.a((h.f.a.a) d.f97082a);

    /* renamed from: k  reason: collision with root package name */
    private float f97080k = 64.0f;

    /* renamed from: l  reason: collision with root package name */
    private int f97081l = R.drawable.ve;

    static {
        Covode.recordClassIndex(61699);
    }

    private final int getHorizontalWidthForFour() {
        return ((Number) this.f97078i.getValue()).intValue();
    }

    private final int getHorizontalWidthForTwo() {
        return ((Number) this.f97077h.getValue()).intValue();
    }

    public int getFollowButtonTextColorRes() {
        return R.color.bx;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public int getLayout() {
        return R.layout.mq;
    }

    /* access modifiers changed from: protected */
    public final int getVerticalOutsidePadding() {
        return ((Number) this.f97079j.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61700);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public float getDefaultWidth() {
        return this.f97080k;
    }

    public final int getMaxWidth() {
        return this.f96601f;
    }

    static final class b extends m implements h.f.a.a<Integer> {
        final /* synthetic */ FansFollowUserBtn this$0;

        static {
            Covode.recordClassIndex(61701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FansFollowUserBtn fansFollowUserBtn) {
            super(0);
            this.this$0 = fansFollowUserBtn;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.a(4));
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {
        final /* synthetic */ FansFollowUserBtn this$0;

        static {
            Covode.recordClassIndex(61702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FansFollowUserBtn fansFollowUserBtn) {
            super(0);
            this.this$0 = fansFollowUserBtn;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.a(2));
        }
    }

    static final class d extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f97082a = new d();

        static {
            Covode.recordClassIndex(61703);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(n.a(4.0d));
        }
    }

    public final int getDefaultMeasureNiceWidth() {
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        return a(niceWidthTextView);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public void a() {
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        niceWidthTextView.setText(getResources().getText(R.string.bbg));
    }

    public final void setClickedBgResId(int i2) {
        this.f97081l = i2;
    }

    public void setDefaultWidth(float f2) {
        this.f97080k = f2;
    }

    public final void setForceDark(boolean z) {
        this.f97076a = z;
    }

    public final void setTypeAppearance(int i2) {
        androidx.core.widget.h.a(this.f96597b, i2);
    }

    public final void setFontType(String str) {
        l.d(str, "");
        this.f96597b.setFontType(str);
    }

    public final void setTextSize(float f2) {
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        niceWidthTextView.setTextSize(f2);
    }

    public final void setTypeface(Typeface typeface) {
        l.d(typeface, "");
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        niceWidthTextView.setTypeface(typeface);
    }

    public final void setAutoSize(int[] iArr) {
        l.d(iArr, "");
        NiceWidthTextView niceWidthTextView = this.f96597b;
        if (Build.VERSION.SDK_INT >= 27) {
            niceWidthTextView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 2);
        } else if (niceWidthTextView instanceof androidx.core.widget.b) {
            niceWidthTextView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 2);
        }
    }

    public final int a(int i2) {
        float b2 = com.bytedance.common.utility.n.b(getContext(), getDefaultWidth());
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        return (int) Math.max(0.0f, ((b2 - niceWidthTextView.getPaint().measureText(p.a((CharSequence) "-", i2))) - com.bytedance.common.utility.n.b(getContext(), 14.0f)) / 2.0f);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public void setText(String str) {
        l.d(str, "");
        setVisibility(0);
        setFollowButtonStyle(-1);
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        niceWidthTextView.setText(str);
        this.f96597b.setTextColor(androidx.core.content.b.c(getContext(), R.color.a9));
        NiceWidthTextView niceWidthTextView2 = this.f96597b;
        l.b(niceWidthTextView2, "");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.ve));
    }

    @Override // com.bytedance.ies.dmt.ui.common.rebranding.b, com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final int a(TextView textView) {
        l.d(textView, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.string.c06));
        arrayList.add(Integer.valueOf((int) R.string.bbg));
        arrayList.add(Integer.valueOf((int) R.string.bzw));
        arrayList.add(Integer.valueOf((int) R.string.bbi));
        arrayList.add(Integer.valueOf((int) R.string.byt));
        int a2 = com.bytedance.ies.dmt.ui.common.rebranding.c.a(textView, arrayList, (int) com.bytedance.common.utility.n.b(getContext(), getDefaultWidth()), (int) com.bytedance.common.utility.n.b(getContext(), getDefaultWidth()));
        if (a2 > this.f96601f) {
            return a2;
        }
        return this.f96601f;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public void setFollowButtonStyle(int i2) {
        if (i2 == -1) {
            this.f96597b.setPadding(0, 0, 0, 0);
            NiceWidthTextView niceWidthTextView = this.f96597b;
            l.b(niceWidthTextView, "");
            niceWidthTextView.setGravity(17);
            this.f96597b.setCompoundDrawables(null, null, null, null);
            return;
        }
        Context context = getContext();
        l.b(context, "");
        Drawable drawable = context.getResources().getDrawable(i2);
        l.b(drawable, "");
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f96597b.setPadding(a(drawable), 0, 0, 0);
        this.f96597b.setCompoundDrawables(drawable, null, null, null);
        NiceWidthTextView niceWidthTextView2 = this.f96597b;
        l.b(niceWidthTextView2, "");
        niceWidthTextView2.setGravity(16);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Class<?> cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        com.bytedance.ies.dmt.ui.common.rebranding.a.a(cls, new a.C0729a(a(niceWidthTextView)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FansFollowUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void a(Context context, AttributeSet attributeSet) {
        this.f96597b = (NiceWidthTextView) com.a.a(LayoutInflater.from(context), getLayout(), this, true).findViewById(R.id.yg);
        this.f96597b.f33349a = this;
        this.f96598c = 0;
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        niceWidthTextView.setCompoundDrawablePadding((int) com.bytedance.common.utility.n.b(context, 2.0f));
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn, com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3) {
        setVisibility(0);
        if (i2 == 0) {
            setFollowButtonTextAndIcon(i3);
            this.f96597b.setTextColor(androidx.core.content.b.c(getContext(), R.color.a9));
            NiceWidthTextView niceWidthTextView = this.f96597b;
            l.b(niceWidthTextView, "");
            niceWidthTextView.setBackground(getResources().getDrawable(R.drawable.azs));
        } else if (i2 == 1) {
            setFollowButtonStyle(-1);
            NiceWidthTextView niceWidthTextView2 = this.f96597b;
            l.b(niceWidthTextView2, "");
            niceWidthTextView2.setText(getResources().getText(R.string.c06));
            if (this.f97076a) {
                this.f96597b.setTextColor(androidx.core.content.b.c(getContext(), R.color.a_));
                NiceWidthTextView niceWidthTextView3 = this.f96597b;
                l.b(niceWidthTextView3, "");
                niceWidthTextView3.setBackground(getResources().getDrawable(R.drawable.vg));
            } else {
                this.f96597b.setTextColor(getResources().getColor(getFollowButtonTextColorRes()));
                NiceWidthTextView niceWidthTextView4 = this.f96597b;
                l.b(niceWidthTextView4, "");
                niceWidthTextView4.setBackground(getResources().getDrawable(R.drawable.ve));
            }
        } else if (i2 == 2) {
            setFollowButtonStyle(-1);
            a();
            this.f96597b.setTextColor(getResources().getColor(getFollowButtonTextColorRes()));
            NiceWidthTextView niceWidthTextView5 = this.f96597b;
            l.b(niceWidthTextView5, "");
            niceWidthTextView5.setBackground(getResources().getDrawable(this.f97081l));
        } else if (i2 == 3) {
            setVisibility(8);
        } else if (i2 == 4) {
            setFollowButtonStyle(-1);
            NiceWidthTextView niceWidthTextView6 = this.f96597b;
            l.b(niceWidthTextView6, "");
            niceWidthTextView6.setText(getResources().getText(R.string.bzw));
            this.f96597b.setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
            NiceWidthTextView niceWidthTextView7 = this.f96597b;
            l.b(niceWidthTextView7, "");
            niceWidthTextView7.setBackground(getResources().getDrawable(this.f97081l));
        }
        this.f96598c = i2;
        b(getVerticalOutsidePadding(), getVerticalOutsidePadding());
    }
}

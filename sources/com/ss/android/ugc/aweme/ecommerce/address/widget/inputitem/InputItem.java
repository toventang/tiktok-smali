package com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.address.widget.InputResultIndicator;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class InputItem extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84627a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f84628b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f84629c;

    static {
        Covode.recordClassIndex(52826);
    }

    public InputItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public View a(int i2) {
        if (this.f84629c == null) {
            this.f84629c = new SparseArray();
        }
        View view = (View) this.f84629c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f84629c.put(i2, findViewById);
        return findViewById;
    }

    public View getContentView() {
        return null;
    }

    public int getContentViewLayoutId() {
        return -1;
    }

    public View getFooterView() {
        return null;
    }

    public int getFooterViewLayoutId() {
        return -1;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52827);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        ((InputResultIndicator) a(R.id.bpr)).a();
    }

    public final void a(String str) {
        if (str != null) {
            ((InputResultIndicator) a(R.id.bpr)).a(str);
        }
    }

    public final void setTitle(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            View a2 = a(R.id.em0);
            l.b(a2, "");
            a2.setVisibility(0);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.title);
        l.b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        View a3 = a(R.id.em0);
        l.b(a3, "");
        a3.setVisibility(8);
        TuxTextView tuxTextView3 = (TuxTextView) a(R.id.title);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(str);
    }

    private /* synthetic */ InputItem(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(4440);
        if (this.f84628b) {
            ((FrameLayout) a(R.id.adq)).addView(view, layoutParams);
            MethodCollector.o(4440);
            return;
        }
        super.addView(view, i2, layoutParams);
        MethodCollector.o(4440);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputItem(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.d(context, "");
        MethodCollector.i(4485);
        View.inflate(context, R.layout.o0, this);
        this.f84628b = true;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        int contentViewLayoutId = getContentViewLayoutId();
        View contentView = getContentView();
        if (contentViewLayoutId != -1) {
            View.inflate(context, contentViewLayoutId, this);
        } else if (contentView != null) {
            addView(contentView);
        }
        int footerViewLayoutId = getFooterViewLayoutId();
        View footerView = footerViewLayoutId != -1 ? View.inflate(context, footerViewLayoutId, null) : getFooterView();
        if (footerView != null) {
            ((FrameLayout) a(R.id.b8p)).addView(footerView);
        }
        MethodCollector.o(4485);
    }
}

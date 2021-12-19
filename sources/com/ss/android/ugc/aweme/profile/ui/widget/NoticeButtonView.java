package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.d;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class NoticeButtonView extends LinearLayout implements View.OnClickListener, d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f117324a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private b f117325b;

    /* renamed from: c  reason: collision with root package name */
    private int f117326c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f117327d;

    /* renamed from: e  reason: collision with root package name */
    private final AttributeSet f117328e;

    /* renamed from: f  reason: collision with root package name */
    private final int f117329f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f117330g;

    public interface b {
        static {
            Covode.recordClassIndex(75826);
        }

        void a();

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(75824);
    }

    private View b(int i2) {
        if (this.f117330g == null) {
            this.f117330g = new SparseArray();
        }
        View view = (View) this.f117330g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f117330g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public final void a(int i2) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75825);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final AttributeSet getAttrs() {
        return this.f117328e;
    }

    public final int getDefStyleAttr() {
        return this.f117329f;
    }

    public final b getMClickListener() {
        return this.f117325b;
    }

    public final int getMColorMode() {
        return this.f117326c;
    }

    public final Context getMContext() {
        return this.f117327d;
    }

    public final TextView getContextTextView() {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.bvs);
        l.b(tuxTextView, "");
        return tuxTextView;
    }

    public final TextView getTitleTextView() {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.c24);
        l.b(tuxTextView, "");
        return tuxTextView;
    }

    public final void setMClickListener(b bVar) {
        this.f117325b = bVar;
    }

    public final void setMColorMode(int i2) {
        this.f117326c = i2;
    }

    private final void setColorMode(int i2) {
        if (this.f117326c != i2) {
            this.f117326c = i2;
        }
    }

    public final void setOnInternalClickListener(b bVar) {
        l.d(bVar, "");
        this.f117325b = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoticeButtonView(Context context) {
        this(context, null);
        l.d(context, "");
    }

    public final void setButtonBackgroundColor(int i2) {
        ((DmtButton) b(R.id.buq)).setBackgroundColor(i2);
    }

    public final void setButtonTextColor(int i2) {
        ((DmtButton) b(R.id.buq)).setTextColor(i2);
    }

    public final void setCloseImage(int i2) {
        ((ImageView) b(R.id.bve)).setImageResource(i2);
    }

    public final void setContextTextColor(int i2) {
        ((TuxTextView) b(R.id.bvs)).setTextColor(i2);
    }

    public final void setIconImage(int i2) {
        ((ImageView) b(R.id.by0)).setImageResource(i2);
    }

    public final void setNoticeBackgroundColor(int i2) {
        ((LinearLayout) b(R.id.cwl)).setBackgroundColor(i2);
    }

    public final void setButtonBackgroundDrawable(Drawable drawable) {
        l.d(drawable, "");
        DmtButton dmtButton = (DmtButton) b(R.id.buq);
        l.b(dmtButton, "");
        dmtButton.setBackground(drawable);
    }

    public final void setCloseImage(Bitmap bitmap) {
        l.d(bitmap, "");
        ((ImageView) b(R.id.bve)).setImageBitmap(bitmap);
    }

    public final void setContextText(CharSequence charSequence) {
        l.d(charSequence, "");
        TuxTextView tuxTextView = (TuxTextView) b(R.id.bvs);
        l.b(tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    public final void setIconImage(Bitmap bitmap) {
        l.d(bitmap, "");
        ((ImageView) b(R.id.by0)).setImageBitmap(bitmap);
    }

    public final void setItemText(String str) {
        l.d(str, "");
        DmtButton dmtButton = (DmtButton) b(R.id.buq);
        l.b(dmtButton, "");
        dmtButton.setText(str);
    }

    public final void setTitleText(CharSequence charSequence) {
        l.d(charSequence, "");
        TuxTextView tuxTextView = (TuxTextView) b(R.id.c24);
        l.b(tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    public final void setContextText(int i2) {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.bvs);
        l.b(tuxTextView, "");
        Context context = getContext();
        l.b(context, "");
        tuxTextView.setText(context.getResources().getText(i2));
    }

    public final void setTitleText(int i2) {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.c24);
        l.b(tuxTextView, "");
        Context context = getContext();
        l.b(context, "");
        tuxTextView.setText(context.getResources().getText(i2));
    }

    public final void setContextText(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) b(R.id.bvs);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setTitleText(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) b(R.id.c24);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void onClick(View view) {
        Integer num;
        b bVar;
        ClickAgent.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        DmtButton dmtButton = (DmtButton) b(R.id.buq);
        l.b(dmtButton, "");
        int id = dmtButton.getId();
        if (num != null && num.intValue() == id) {
            b bVar2 = this.f117325b;
            if (bVar2 != null) {
                bVar2.a();
                return;
            }
            return;
        }
        ImageView imageView = (ImageView) b(R.id.bve);
        l.b(imageView, "");
        int id2 = imageView.getId();
        if (num != null && num.intValue() == id2) {
            b bVar3 = this.f117325b;
            if (bVar3 != null) {
                bVar3.b();
                return;
            }
            return;
        }
        TuxTextView tuxTextView = (TuxTextView) b(R.id.bvs);
        l.b(tuxTextView, "");
        int id3 = tuxTextView.getId();
        if (num != null && num.intValue() == id3) {
            b bVar4 = this.f117325b;
            if (bVar4 != null) {
                bVar4.c();
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.c24);
        l.b(tuxTextView2, "");
        int id4 = tuxTextView2.getId();
        if (num != null && num.intValue() == id4 && (bVar = this.f117325b) != null) {
            bVar.c();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoticeButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeButtonView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10024);
        this.f117327d = context;
        this.f117328e = attributeSet;
        this.f117329f = 0;
        this.f117326c = -1;
        l.d(context, "");
        LinearLayout.inflate(context, R.layout.apf, this);
        ((DmtButton) b(R.id.buq)).setOnClickListener(this);
        ((ImageView) b(R.id.bve)).setOnClickListener(this);
        ((TuxTextView) b(R.id.bvs)).setOnClickListener(this);
        ((TuxTextView) b(R.id.c24)).setOnClickListener(this);
        ((DmtButton) b(R.id.buq)).setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.5f));
        ((ImageView) b(R.id.bve)).setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.5f));
        com.bytedance.ies.dmt.ui.common.b bVar = b.a.f33348a;
        l.b(bVar, "");
        setColorMode(bVar.f33347a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.m3, R.attr.m4, R.attr.m5, R.attr.m6, R.attr.m7, R.attr.m8, R.attr.m9, R.attr.m_});
        l.b(obtainStyledAttributes, "");
        Drawable drawable = obtainStyledAttributes.getDrawable(3);
        if (drawable != null) {
            ((ImageView) b(R.id.by0)).setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            ((ImageView) b(R.id.bve)).setImageDrawable(drawable2);
        }
        TuxTextView tuxTextView = (TuxTextView) b(R.id.c24);
        l.b(tuxTextView, "");
        tuxTextView.setText(obtainStyledAttributes.getString(6));
        ((TuxTextView) b(R.id.c24)).setTextColor(obtainStyledAttributes.getColor(7, androidx.core.content.b.c(getContext(), R.color.c0)));
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.bvs);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(obtainStyledAttributes.getString(1));
        ((TuxTextView) b(R.id.bvs)).setTextColor(obtainStyledAttributes.getColor(2, androidx.core.content.b.c(getContext(), R.color.c0)));
        DmtButton dmtButton = (DmtButton) b(R.id.buq);
        l.b(dmtButton, "");
        dmtButton.setText(obtainStyledAttributes.getString(4));
        obtainStyledAttributes.recycle();
        MethodCollector.o(10024);
    }
}

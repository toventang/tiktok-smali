package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.zhiliaoapp.musically.R;

public final class b extends a {

    /* renamed from: m  reason: collision with root package name */
    ImageView f107027m;
    public a n;
    private TextView o;
    private TextView p;
    private View q;
    private RadioSettingGroup r;

    public interface a {
        static {
            Covode.recordClassIndex(68458);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(68456);
    }

    private void c() {
        if (this.r == null && (getParent() instanceof RadioSettingGroup)) {
            this.r = (RadioSettingGroup) getParent();
        }
    }

    public final void setOnSettingItemClickListener(a aVar) {
        this.n = aVar;
    }

    public b(Context context) {
        this(context, (byte) 0);
    }

    public final void setStartSubTextColor(int i2) {
        TextView textView = this.p;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public final void setStartText(String str) {
        this.o.setText(str);
    }

    public final void setStartTextColor(int i2) {
        TextView textView = this.o;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public final void setStartSubText(String str) {
        TextView textView = this.p;
        if (textView != null) {
            textView.setVisibility(0);
            this.p.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void setSelfChecked(boolean z) {
        this.f107027m.setSelected(z);
        if (z) {
            this.f107027m.setImageDrawable(d.a().getResources().getDrawable(2131232954));
            return;
        }
        this.f107027m.setImageDrawable(null);
    }

    public final void setChecked(boolean z) {
        boolean z2;
        if (!this.f107027m.isSelected()) {
            c();
            if (this.r != null) {
                for (int i2 = 0; i2 < this.r.getChildCount(); i2++) {
                    if (this.r.getChildAt(i2) instanceof b) {
                        b bVar = (b) this.r.getChildAt(i2);
                        if (equals(bVar)) {
                            z2 = z;
                        } else if (!z) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bVar.setSelfChecked(z2);
                    }
                }
                return;
            }
            setSelfChecked(z);
        }
    }

    private b(Context context, byte b2) {
        this(context, (char) 0);
    }

    private b(Context context, char c2) {
        super(context, null);
        MethodCollector.i(5831);
        View inflate = View.inflate(context, R.layout.ac_, this);
        this.q = inflate.findViewById(R.id.dqk);
        this.o = (TextView) inflate.findViewById(R.id.f1u);
        this.f107027m = (ImageView) inflate.findViewById(R.id.c9y);
        this.p = (TextView) inflate.findViewById(R.id.f1t);
        c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.sx, R.attr.sy, R.attr.vl, R.attr.xl, R.attr.af9, R.attr.afa, R.attr.afb, R.attr.aft, R.attr.afu, R.attr.ai_, R.attr.aih});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 6) {
                this.o.setText(obtainStyledAttributes.getString(index));
            } else if (index == 10) {
                this.o.setTextSize((float) obtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(2, 15.0f, getResources().getDisplayMetrics())));
            } else if (index == 9) {
                this.o.setTextColor(obtainStyledAttributes.getColor(index, androidx.core.content.b.c(getContext(), R.color.bx)));
            }
        }
        obtainStyledAttributes.recycle();
        this.q.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68457);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (b.this.n == null) {
                    b bVar = b.this;
                    bVar.setChecked(!bVar.f107027m.isSelected());
                    return;
                }
                b.this.n.a();
                b bVar2 = b.this;
                bVar2.setChecked(!bVar2.f107027m.isSelected());
            }
        });
        MethodCollector.o(5831);
    }
}

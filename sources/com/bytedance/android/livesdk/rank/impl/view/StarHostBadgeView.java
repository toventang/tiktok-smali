package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdkapi.m.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;

public final class StarHostBadgeView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final h f21035a;

    /* renamed from: b  reason: collision with root package name */
    private final h f21036b;

    static {
        Covode.recordClassIndex(12416);
    }

    public StarHostBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final LiveTextView getBadgeView() {
        return (LiveTextView) this.f21035a.getValue();
    }

    private final LiveTextView getCountView() {
        return (LiveTextView) this.f21036b.getValue();
    }

    static final class a extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ StarHostBadgeView this$0;

        static {
            Covode.recordClassIndex(12417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StarHostBadgeView starHostBadgeView) {
            super(0);
            this.this$0 = starHostBadgeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f9t);
        }
    }

    static final class b extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ StarHostBadgeView this$0;

        static {
            Covode.recordClassIndex(12418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StarHostBadgeView starHostBadgeView) {
            super(0);
            this.this$0 = starHostBadgeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f7n);
        }
    }

    private /* synthetic */ StarHostBadgeView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    private StarHostBadgeView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        MethodCollector.i(2256);
        this.f21035a = d.a(new a(this));
        this.f21036b = d.a(new b(this));
        com.a.a(LayoutInflater.from(context), R.layout.bft, this, true);
        MethodCollector.o(2256);
    }

    public final void a(int i2, int i3, boolean z) {
        String str;
        String str2;
        int i4;
        LiveTextView badgeView = getBadgeView();
        String str3 = "#161823";
        if (z) {
            str = str3;
        } else {
            str = "#FFFFFF";
        }
        badgeView.setTextColor(Color.parseColor(str));
        LiveTextView countView = getCountView();
        if (!z) {
            str3 = "#E6FFFFFF";
        }
        countView.setTextColor(Color.parseColor(str3));
        LiveTextView countView2 = getCountView();
        if (!y.g()) {
            str2 = "x".concat(String.valueOf(i3));
        } else {
            str2 = String.valueOf(i3) + "x";
        }
        countView2.setText(str2);
        LiveTextView badgeView2 = getBadgeView();
        if (z) {
            if (i2 == 1) {
                i4 = R.drawable.bu3;
            } else if (i2 != 2) {
                i4 = R.drawable.bu7;
            } else {
                i4 = R.drawable.bu5;
            }
        } else if (i2 == 1) {
            i4 = R.drawable.bu4;
        } else if (i2 != 2) {
            i4 = R.drawable.bu8;
        } else {
            i4 = R.drawable.bu6;
        }
        badgeView2.setBackgroundResource(i4);
    }
}

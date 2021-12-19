package com.ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class RatingNumber extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87082a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f87083b;

    /* renamed from: c  reason: collision with root package name */
    private final h f87084c;

    /* renamed from: d  reason: collision with root package name */
    private final h f87085d;

    static {
        Covode.recordClassIndex(54628);
    }

    public RatingNumber(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public RatingNumber(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final TuxTextView getDivider() {
        return (TuxTextView) this.f87084c.getValue();
    }

    public final TuxTextView getMaxScore() {
        return (TuxTextView) this.f87085d.getValue();
    }

    public final TuxTextView getScore() {
        return (TuxTextView) this.f87083b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54629);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ RatingNumber this$0;

        static {
            Covode.recordClassIndex(54630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RatingNumber ratingNumber) {
            super(0);
            this.this$0 = ratingNumber;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.an6);
        }
    }

    static final class c extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ RatingNumber this$0;

        static {
            Covode.recordClassIndex(54631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RatingNumber ratingNumber) {
            super(0);
            this.this$0 = ratingNumber;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.cl5);
        }
    }

    static final class d extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ RatingNumber this$0;

        static {
            Covode.recordClassIndex(54632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RatingNumber ratingNumber) {
            super(0);
            this.this$0 = ratingNumber;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.dt2);
        }
    }

    public final void setStyle(int i2) {
        int c2 = androidx.core.content.b.c(getContext(), R.color.c5);
        getDivider().setTextColor(c2);
        getMaxScore().setTextColor(c2);
        if (i2 == 1) {
            getScore().setTextColor(c2);
            getScore().setTuxFont(51);
            getDivider().setTuxFont(81);
            getMaxScore().setTuxFont(81);
        } else if (i2 == 2) {
            getScore().setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
            getScore().setTuxFont(42);
            getDivider().setTuxFont(81);
            getMaxScore().setTuxFont(81);
        } else if (i2 == 3) {
            getScore().setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
            getScore().setTuxFont(12);
            getDivider().setTuxFont(71);
            getMaxScore().setTuxFont(71);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ RatingNumber(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RatingNumber(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5341);
        com.a.a(LayoutInflater.from(context), R.layout.ql, this, true);
        this.f87083b = i.a((h.f.a.a) new d(this));
        this.f87084c = i.a((h.f.a.a) new b(this));
        this.f87085d = i.a((h.f.a.a) new c(this));
        setOrientation(0);
        getDivider().setText("/");
        getMaxScore().setText("5");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pe});
        l.b(obtainStyledAttributes, "");
        int i2 = obtainStyledAttributes.getInt(0, 3);
        obtainStyledAttributes.recycle();
        setStyle(i2);
        MethodCollector.o(5341);
    }
}

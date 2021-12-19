package com.ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;

public final class RatingStar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87086a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private float f87087b;

    /* renamed from: c  reason: collision with root package name */
    private int f87088c;

    /* renamed from: d  reason: collision with root package name */
    private int f87089d;

    static {
        Covode.recordClassIndex(54633);
    }

    public RatingStar(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public RatingStar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54634);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final float getRate() {
        return this.f87087b;
    }

    public final int getStarSize() {
        return this.f87089d;
    }

    public static final class d implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f87090a;

        static {
            Covode.recordClassIndex(54637);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f87091a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f87092b;

                static {
                    Covode.recordClassIndex(54638);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f87091a < this.f87092b.f87090a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f87092b.f87090a;
                    int i2 = this.f87091a;
                    this.f87091a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f87092b = r1;
                }
            };
        }

        public d(ViewGroup viewGroup) {
            this.f87090a = viewGroup;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ RatingStar this$0;

        static {
            Covode.recordClassIndex(54635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RatingStar ratingStar) {
            super(1);
            this.this$0 = ratingStar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_star_fill;
            aVar2.f44752d = Integer.valueOf(androidx.core.content.b.c(this.this$0.getContext(), R.color.f159917a));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ RatingStar this$0;

        static {
            Covode.recordClassIndex(54636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RatingStar ratingStar) {
            super(1);
            this.this$0 = ratingStar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_star_fill;
            aVar2.f44752d = Integer.valueOf(androidx.core.content.b.c(this.this$0.getContext(), R.color.f159927k));
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setRate(float r11) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar.setRate(float):void");
    }

    public final void setStarSize(int i2) {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f87089d = h.g.a.a(TypedValue.applyDimension(1, (float) i2, system.getDisplayMetrics()));
        if (i2 <= 12) {
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            this.f87088c = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
        }
        if (i2 >= 16) {
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            this.f87088c = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system3.getDisplayMetrics()));
        }
        for (View view : new d(this)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.width = this.f87089d;
                marginLayoutParams2.height = this.f87089d;
                marginLayoutParams2.leftMargin = this.f87088c;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    private final void a(ImageView imageView, int i2) {
        if (i2 == 2) {
            com.bytedance.tux.c.a a2 = com.bytedance.tux.c.c.a(new b(this));
            Context context = getContext();
            l.b(context, "");
            imageView.setImageDrawable(a2.a(context));
        } else if (i2 == 0) {
            com.bytedance.tux.c.a a3 = com.bytedance.tux.c.c.a(new c(this));
            Context context2 = getContext();
            l.b(context2, "");
            imageView.setImageDrawable(a3.a(context2));
        } else if (i2 == 1) {
            imageView.setImageResource(R.drawable.zk);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ RatingStar(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RatingStar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        int i2 = 0;
        MethodCollector.i(5380);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f87088c = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        this.f87089d = h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics()));
        do {
            ImageView imageView = new ImageView(context);
            int i3 = this.f87089d;
            imageView.setLayoutParams(new LinearLayout.LayoutParams(i3, i3));
            if (getChildCount() != 0) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (!(layoutParams instanceof ViewGroup.MarginLayoutParams) ? null : layoutParams);
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = this.f87088c;
                    imageView.setLayoutParams(marginLayoutParams);
                }
            }
            addView(imageView);
            i2++;
        } while (i2 < 5);
        if (isInEditMode()) {
            setRate((float) ((Math.random() * 10.0d) / 2.0d));
        }
        MethodCollector.o(5380);
    }
}

package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class WishListThanksView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public a f22881g;

    /* renamed from: h  reason: collision with root package name */
    private final h f22882h;

    /* renamed from: i  reason: collision with root package name */
    private final h f22883i;

    /* renamed from: j  reason: collision with root package name */
    private final h f22884j;

    public enum a {
        FULFILLED,
        THANKS;

        static {
            Covode.recordClassIndex(13517);
        }
    }

    static {
        Covode.recordClassIndex(13516);
    }

    public WishListThanksView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final ImageView getMAvatarView() {
        return (ImageView) this.f22882h.getValue();
    }

    public final ConstraintLayout getMFulfilledLayout() {
        return (ConstraintLayout) this.f22883i.getValue();
    }

    public final ConstraintLayout getMThanksLayout() {
        return (ConstraintLayout) this.f22884j.getValue();
    }

    static final class b extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ WishListThanksView this$0;

        static {
            Covode.recordClassIndex(13518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(WishListThanksView wishListThanksView) {
            super(0);
            this.this$0 = wishListThanksView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.fmt);
        }
    }

    static final class c extends m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ WishListThanksView this$0;

        static {
            Covode.recordClassIndex(13519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(WishListThanksView wishListThanksView) {
            super(0);
            this.this$0 = wishListThanksView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.findViewById(R.id.c5u);
        }
    }

    static final class d extends m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ WishListThanksView this$0;

        static {
            Covode.recordClassIndex(13520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(WishListThanksView wishListThanksView) {
            super(0);
            this.this$0 = wishListThanksView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.findViewById(R.id.c90);
        }
    }

    private /* synthetic */ WishListThanksView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishListThanksView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9000);
        com.a.a(LayoutInflater.from(context), R.layout.bgf, this, true);
        Bitmap a2 = com.bytedance.android.livesdk.wishlist.c.a.a(BitmapFactory.decodeResource(y.a(), 2131234274), y.a(6.0f));
        l.b(a2, "");
        ((ImageView) findViewById(R.id.bm0)).setImageBitmap(a2);
        this.f22881g = a.FULFILLED;
        this.f22882h = com.bytedance.android.livesdkapi.m.d.a(new b(this));
        this.f22883i = com.bytedance.android.livesdkapi.m.d.a(new c(this));
        this.f22884j = com.bytedance.android.livesdkapi.m.d.a(new d(this));
        MethodCollector.o(9000);
    }
}

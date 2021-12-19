package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.wishlist.a.a;
import com.bytedance.android.livesdkapi.m.d;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class WishListServerErrorView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private final h f22879g;

    static {
        Covode.recordClassIndex(13513);
    }

    public WishListServerErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final LinearLayout getMRefreshLayout() {
        return (LinearLayout) this.f22879g.getValue();
    }

    static final class b extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ WishListServerErrorView this$0;

        static {
            Covode.recordClassIndex(13515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(WishListServerErrorView wishListServerErrorView) {
            super(0);
            this.this$0 = wishListServerErrorView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.findViewById(R.id.cg9);
        }
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.c f22880a;

        static {
            Covode.recordClassIndex(13514);
        }

        public a(a.c cVar) {
            this.f22880a = cVar;
        }

        public final void onClick(View view) {
            this.f22880a.c();
        }
    }

    private /* synthetic */ WishListServerErrorView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishListServerErrorView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        com.a.a(LayoutInflater.from(context), R.layout.bfr, this, true);
        this.f22879g = d.a(new b(this));
    }
}

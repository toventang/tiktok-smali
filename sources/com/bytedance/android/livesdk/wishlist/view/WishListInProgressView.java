package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class WishListInProgressView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public List<? extends x.a> f22874g;

    /* renamed from: h  reason: collision with root package name */
    public int f22875h;

    /* renamed from: i  reason: collision with root package name */
    private final h f22876i;

    /* renamed from: j  reason: collision with root package name */
    private final h f22877j;

    /* renamed from: k  reason: collision with root package name */
    private final h f22878k;

    static {
        Covode.recordClassIndex(13508);
    }

    public WishListInProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final HSImageView getMGiftIcon() {
        return (HSImageView) this.f22876i.getValue();
    }

    public final ProgressBar getMWishListProgressView() {
        return (ProgressBar) this.f22878k.getValue();
    }

    public final LiveTextView getMWishesProgressText() {
        return (LiveTextView) this.f22877j.getValue();
    }

    static final class a extends m implements h.f.a.a<HSImageView> {
        final /* synthetic */ WishListInProgressView this$0;

        static {
            Covode.recordClassIndex(13509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(WishListInProgressView wishListInProgressView) {
            super(0);
            this.this$0 = wishListInProgressView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HSImageView invoke() {
            return this.this$0.findViewById(R.id.bm3);
        }
    }

    static final class b extends m implements h.f.a.a<ProgressBar> {
        final /* synthetic */ WishListInProgressView this$0;

        static {
            Covode.recordClassIndex(13510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(WishListInProgressView wishListInProgressView) {
            super(0);
            this.this$0 = wishListInProgressView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProgressBar invoke() {
            return this.this$0.findViewById(R.id.fn5);
        }
    }

    static final class c extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ WishListInProgressView this$0;

        static {
            Covode.recordClassIndex(13511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(WishListInProgressView wishListInProgressView) {
            super(0);
            this.this$0 = wishListInProgressView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f_t);
        }
    }

    private /* synthetic */ WishListInProgressView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishListInProgressView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        com.a.a(LayoutInflater.from(context), R.layout.bgh, this, true);
        this.f22876i = i.a((h.f.a.a) new a(this));
        this.f22877j = i.a((h.f.a.a) new c(this));
        this.f22878k = i.a((h.f.a.a) new b(this));
        this.f22874g = new ArrayList();
        this.f22875h = -1;
    }
}

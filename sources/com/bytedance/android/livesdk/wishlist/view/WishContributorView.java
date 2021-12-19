package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class WishContributorView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final h f22855a;

    /* renamed from: b  reason: collision with root package name */
    private final h f22856b;

    static {
        Covode.recordClassIndex(13491);
    }

    public WishContributorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final ImageView getMAvatar() {
        return (ImageView) this.f22856b.getValue();
    }

    private final ImageView getMBorder() {
        return (ImageView) this.f22855a.getValue();
    }

    static final class b extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ WishContributorView this$0;

        static {
            Covode.recordClassIndex(13493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(WishContributorView wishContributorView) {
            super(0);
            this.this$0 = wishContributorView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.fmt);
        }
    }

    static final class c extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ WishContributorView this$0;

        static {
            Covode.recordClassIndex(13494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(WishContributorView wishContributorView) {
            super(0);
            this.this$0 = wishContributorView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.fmu);
        }
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        int i2 = aVar.f22858b;
        int i3 = 2131234615;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 2131234616;
            } else if (i2 == 3) {
                i3 = 2131234617;
            }
        }
        getMBorder().setImageResource(i3);
        g.a(getMAvatar(), aVar.f22857a, getMAvatar().getWidth(), getMAvatar().getHeight(), 2131234424);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ImageModel f22857a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22858b;

        static {
            Covode.recordClassIndex(13492);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f22857a, aVar.f22857a) && this.f22858b == aVar.f22858b;
        }

        public final int hashCode() {
            ImageModel imageModel = this.f22857a;
            return ((imageModel != null ? imageModel.hashCode() : 0) * 31) + this.f22858b;
        }

        public final String toString() {
            return "WishListContributorInfo(avatar=" + this.f22857a + ", rank=" + this.f22858b + ")";
        }

        public a(ImageModel imageModel, int i2) {
            l.d(imageModel, "");
            this.f22857a = imageModel;
            this.f22858b = i2;
        }
    }

    private /* synthetic */ WishContributorView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishContributorView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9005);
        com.a.a(LayoutInflater.from(context), R.layout.bge, this, true);
        this.f22855a = i.a((h.f.a.a) new c(this));
        this.f22856b = i.a((h.f.a.a) new b(this));
        MethodCollector.o(9005);
    }
}

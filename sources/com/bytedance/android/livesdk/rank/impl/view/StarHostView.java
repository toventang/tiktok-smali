package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;

public final class StarHostView extends ConstraintLayout {

    /* renamed from: i  reason: collision with root package name */
    public static final a f21037i = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public b f21038g;

    /* renamed from: h  reason: collision with root package name */
    public c f21039h;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f21040j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f21041k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f21042l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f21043m;
    private final h.h n;

    static {
        Covode.recordClassIndex(12419);
    }

    public StarHostView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final StarHostBadgeView getHostBadgeView() {
        return (StarHostBadgeView) this.n.getValue();
    }

    private final HSImageView getHostLivingImage() {
        return (HSImageView) this.f21042l.getValue();
    }

    public final HSImageView getHostAvatarBorderImage() {
        return (HSImageView) this.f21041k.getValue();
    }

    public final AppCompatImageView getHostAvatarImage() {
        return (AppCompatImageView) this.f21040j.getValue();
    }

    public final LiveTextView getHostUserNameText() {
        return (LiveTextView) this.f21043m.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12420);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ StarHostView this$0;

        static {
            Covode.recordClassIndex(12423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(StarHostView starHostView) {
            super(0);
            this.this$0 = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            AppCompatImageView hostAvatarImage = this.this$0.getHostAvatarImage();
            ViewGroup.LayoutParams layoutParams = this.this$0.getHostAvatarImage().getLayoutParams();
            layoutParams.width = y.a((float) StarHostView.a(this.this$0).f21049a);
            layoutParams.height = y.a((float) StarHostView.a(this.this$0).f21049a);
            hostAvatarImage.setLayoutParams(layoutParams);
            p.a(this.this$0.getHostAvatarImage(), y.a((float) StarHostView.a(this.this$0).f21051c));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ StarHostView this$0;

        static {
            Covode.recordClassIndex(12424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(StarHostView starHostView) {
            super(0);
            this.this$0 = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            HSImageView hostAvatarBorderImage = this.this$0.getHostAvatarBorderImage();
            ViewGroup.LayoutParams layoutParams = this.this$0.getHostAvatarBorderImage().getLayoutParams();
            layoutParams.width = y.a((float) StarHostView.a(this.this$0).f21050b);
            layoutParams.height = y.a((float) StarHostView.a(this.this$0).f21050b);
            hostAvatarBorderImage.setLayoutParams(layoutParams);
        }
    }

    static final class h extends m implements h.f.a.a<HSImageView> {
        final /* synthetic */ StarHostView this$0;

        static {
            Covode.recordClassIndex(12427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(StarHostView starHostView) {
            super(0);
            this.this$0 = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HSImageView invoke() {
            return this.this$0.findViewById(R.id.c1e);
        }
    }

    static final class i extends m implements h.f.a.a<AppCompatImageView> {
        final /* synthetic */ StarHostView this$0;

        static {
            Covode.recordClassIndex(12428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(StarHostView starHostView) {
            super(0);
            this.this$0 = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AppCompatImageView invoke() {
            return this.this$0.findViewById(R.id.c1d);
        }
    }

    static final class j extends m implements h.f.a.a<StarHostBadgeView> {
        final /* synthetic */ StarHostView this$0;

        static {
            Covode.recordClassIndex(12429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(StarHostView starHostView) {
            super(0);
            this.this$0 = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StarHostBadgeView invoke() {
            return this.this$0.findViewById(R.id.e9f);
        }
    }

    static final class k extends m implements h.f.a.a<HSImageView> {
        final /* synthetic */ StarHostView this$0;

        static {
            Covode.recordClassIndex(12430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(StarHostView starHostView) {
            super(0);
            this.this$0 = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HSImageView invoke() {
            return this.this$0.findViewById(R.id.c1f);
        }
    }

    static final class l extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ StarHostView this$0;

        static {
            Covode.recordClassIndex(12431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(StarHostView starHostView) {
            super(0);
            this.this$0 = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f7q);
        }
    }

    private final void b() {
        d dVar = new d(this);
        e eVar = new e(this);
        dVar.a();
        eVar.a();
    }

    private final c d() {
        int i2;
        b bVar = this.f21038g;
        if (bVar == null) {
            h.f.b.l.a("starHostItem");
        }
        if (bVar.f21048e) {
            b bVar2 = this.f21038g;
            if (bVar2 == null) {
                h.f.b.l.a("starHostItem");
            }
            int i3 = bVar2.f21045b;
            if (i3 == 1) {
                i2 = 2131234245;
            } else if (i3 != 2) {
                i2 = 2131234249;
            } else {
                i2 = 2131234247;
            }
        } else {
            b bVar3 = this.f21038g;
            if (bVar3 == null) {
                h.f.b.l.a("starHostItem");
            }
            int i4 = bVar3.f21045b;
            if (i4 == 1) {
                i2 = 2131234246;
            } else if (i4 != 2) {
                i2 = 2131234250;
            } else {
                i2 = 2131234248;
            }
        }
        b bVar4 = this.f21038g;
        if (bVar4 == null) {
            h.f.b.l.a("starHostItem");
        }
        if (bVar4.f21045b != 1) {
            return new c(40, 48, 16, i2);
        }
        return new c(48, 56, 28, i2);
    }

    private final void c() {
        f fVar = new f(this);
        g gVar = new g(this);
        b bVar = this.f21038g;
        if (bVar == null) {
            h.f.b.l.a("starHostItem");
        }
        if (bVar.f21044a != null) {
            AppCompatImageView hostAvatarImage = getHostAvatarImage();
            b bVar2 = this.f21038g;
            if (bVar2 == null) {
                h.f.b.l.a("starHostItem");
            }
            User user = bVar2.f21044a;
            if (user == null) {
                h.f.b.l.b();
            }
            com.bytedance.android.livesdk.chatroom.g.g.a(hostAvatarImage, user.getAvatarThumb(), getHostAvatarImage().getWidth(), getHostAvatarImage().getHeight(), 2131234726);
            fVar.a(true);
            gVar.a(true);
            n.a(getHostBadgeView(), 0);
            StarHostBadgeView hostBadgeView = getHostBadgeView();
            b bVar3 = this.f21038g;
            if (bVar3 == null) {
                h.f.b.l.a("starHostItem");
            }
            int i2 = bVar3.f21045b;
            b bVar4 = this.f21038g;
            if (bVar4 == null) {
                h.f.b.l.a("starHostItem");
            }
            int i3 = bVar4.f21046c;
            b bVar5 = this.f21038g;
            if (bVar5 == null) {
                h.f.b.l.a("starHostItem");
            }
            hostBadgeView.a(i2, i3, bVar5.f21048e);
            b bVar6 = this.f21038g;
            if (bVar6 == null) {
                h.f.b.l.a("starHostItem");
            }
            if (bVar6.f21047d) {
                com.bytedance.android.live.core.f.k.a(getHostAvatarBorderImage(), 2131234838);
                com.bytedance.android.live.core.f.k.a(getHostLivingImage(), "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
                n.a(getHostAvatarBorderImage(), 0);
                n.a(getHostLivingImage(), 0);
                return;
            }
            n.a(getHostAvatarBorderImage(), 8);
            n.a(getHostLivingImage(), 8);
            return;
        }
        fVar.a(false);
        gVar.a(false);
        n.a(getHostBadgeView(), 8);
        n.a(getHostAvatarBorderImage(), 8);
        n.a(getHostLivingImage(), 8);
        AppCompatImageView hostAvatarImage2 = getHostAvatarImage();
        c cVar = this.f21039h;
        if (cVar == null) {
            h.f.b.l.a("starHostLayoutParams");
        }
        hostAvatarImage2.setImageResource(cVar.f21052d);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ StarHostView this$0;

        static {
            Covode.recordClassIndex(12425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(StarHostView starHostView) {
            super(1);
            this.this$0 = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            a(bool.booleanValue());
            return z.f158842a;
        }

        public final void a(boolean z) {
            String str;
            if (z) {
                LiveTextView hostUserNameText = this.this$0.getHostUserNameText();
                User user = StarHostView.b(this.this$0).f21044a;
                if (user == null || (str = user.displayId) == null) {
                    str = "";
                }
                hostUserNameText.setText(str);
                hostUserNameText.setMaxLines(1);
                return;
            }
            LiveTextView hostUserNameText2 = this.this$0.getHostUserNameText();
            hostUserNameText2.setText(y.a((int) R.string.ejy));
            hostUserNameText2.setMaxLines(4);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ StarHostView this$0;

        static {
            Covode.recordClassIndex(12426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(StarHostView starHostView) {
            super(1);
            this.this$0 = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            a(bool.booleanValue());
            return z.f158842a;
        }

        public final void a(boolean z) {
            String str;
            String str2;
            LiveTextView hostUserNameText = this.this$0.getHostUserNameText();
            if (StarHostView.b(this.this$0).f21048e) {
                if (z) {
                    str2 = "#161823";
                } else {
                    str2 = "#57161823";
                }
                hostUserNameText.setTextColor(Color.parseColor(str2));
                return;
            }
            if (z) {
                str = "#E6FFFFFF";
            } else {
                str = "#57FFFFFF";
            }
            hostUserNameText.setTextColor(Color.parseColor(str));
        }
    }

    public static final /* synthetic */ c a(StarHostView starHostView) {
        c cVar = starHostView.f21039h;
        if (cVar == null) {
            h.f.b.l.a("starHostLayoutParams");
        }
        return cVar;
    }

    public static final /* synthetic */ b b(StarHostView starHostView) {
        b bVar = starHostView.f21038g;
        if (bVar == null) {
            h.f.b.l.a("starHostItem");
        }
        return bVar;
    }

    public final void a(b bVar) {
        h.f.b.l.d(bVar, "");
        this.f21038g = bVar;
        this.f21039h = d();
        b();
        c();
    }

    private /* synthetic */ StarHostView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    private StarHostView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        com.a.a(LayoutInflater.from(context), R.layout.bdx, this, true);
        this.f21040j = com.bytedance.android.livesdkapi.m.d.a(new i(this));
        this.f21041k = com.bytedance.android.livesdkapi.m.d.a(new h(this));
        this.f21042l = com.bytedance.android.livesdkapi.m.d.a(new k(this));
        this.f21043m = com.bytedance.android.livesdkapi.m.d.a(new l(this));
        this.n = com.bytedance.android.livesdkapi.m.d.a(new j(this));
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f21049a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21050b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21051c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21052d;

        static {
            Covode.recordClassIndex(12422);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f21049a == cVar.f21049a && this.f21050b == cVar.f21050b && this.f21051c == cVar.f21051c && this.f21052d == cVar.f21052d;
        }

        public final int hashCode() {
            return (((((this.f21049a * 31) + this.f21050b) * 31) + this.f21051c) * 31) + this.f21052d;
        }

        public final String toString() {
            return "StarHostLayoutParams(avatarRadius=" + this.f21049a + ", avatarBorderRadius=" + this.f21050b + ", avatarTopMargin=" + this.f21051c + ", emptyAvatarResId=" + this.f21052d + ")";
        }

        public c(int i2, int i3, int i4, int i5) {
            this.f21049a = i2;
            this.f21050b = i3;
            this.f21051c = i4;
            this.f21052d = i5;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final User f21044a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21045b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21046c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f21047d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f21048e;

        static {
            Covode.recordClassIndex(12421);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.f.b.l.a(this.f21044a, bVar.f21044a) && this.f21045b == bVar.f21045b && this.f21046c == bVar.f21046c && this.f21047d == bVar.f21047d && this.f21048e == bVar.f21048e;
        }

        public final int hashCode() {
            User user = this.f21044a;
            int hashCode = (((((user != null ? user.hashCode() : 0) * 31) + this.f21045b) * 31) + this.f21046c) * 31;
            boolean z = this.f21047d;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode + i3) * 31;
            if (!this.f21048e) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public final String toString() {
            return "StarHostItem(user=" + this.f21044a + ", rankNum=" + this.f21045b + ", starHostCount=" + this.f21046c + ", isLiving=" + this.f21047d + ", isPortrait=" + this.f21048e + ")";
        }

        public b(User user, int i2, int i3, boolean z, boolean z2) {
            this.f21044a = user;
            this.f21045b = i2;
            this.f21046c = i3;
            this.f21047d = z;
            this.f21048e = z2;
        }
    }
}

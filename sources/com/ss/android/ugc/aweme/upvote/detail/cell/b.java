package com.ss.android.ugc.aweme.upvote.detail.cell;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f142107h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final TuxIconView f142108a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f142109b;

    /* renamed from: c  reason: collision with root package name */
    public int f142110c;

    /* renamed from: d  reason: collision with root package name */
    User f142111d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.upvote.event.b f142112e;

    /* renamed from: f  reason: collision with root package name */
    final ViewGroup f142113f;

    /* renamed from: g  reason: collision with root package name */
    final UpvoteDetailPanelViewModel f142114g;

    /* renamed from: i  reason: collision with root package name */
    private final TuxTextView f142115i;

    static {
        Covode.recordClassIndex(92889);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92890);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.b$b  reason: collision with other inner class name */
    static final class RunnableC3790b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f142116a;

        static {
            Covode.recordClassIndex(92891);
        }

        RunnableC3790b(b bVar) {
            this.f142116a = bVar;
        }

        public final void run() {
            this.f142116a.f142108a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.this$0;
            int i2 = 1;
            boolean z = !bVar.f142109b;
            int i3 = bVar.f142110c;
            if (bVar.f142109b) {
                i2 = -1;
            }
            bVar.a(z, i3 + i2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $color;
        final /* synthetic */ int $iconRes;

        static {
            Covode.recordClassIndex(92892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i2, int i3) {
            super(1);
            this.$iconRes = i2;
            this.$color = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = this.$iconRes;
            aVar2.f44753e = Integer.valueOf(this.$color);
            return z.f158842a;
        }
    }

    public b(ViewGroup viewGroup, UpvoteDetailPanelViewModel upvoteDetailPanelViewModel) {
        l.d(viewGroup, "");
        l.d(upvoteDetailPanelViewModel, "");
        this.f142113f = viewGroup;
        this.f142114g = upvoteDetailPanelViewModel;
        View findViewById = viewGroup.findViewById(R.id.bhu);
        l.b(findViewById, "");
        this.f142108a = (TuxIconView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.eyo);
        l.b(findViewById2, "");
        this.f142115i = (TuxTextView) findViewById2;
    }

    public final void a(boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        this.f142109b = z;
        this.f142110c = i2;
        if (z) {
            i3 = R.raw.icon_heart_fill;
            i4 = R.attr.ay;
        } else {
            i3 = R.raw.icon_heart;
            i4 = R.attr.bi;
        }
        this.f142108a.setTuxIcon(com.bytedance.tux.c.c.a(new c(i3, i4)));
        this.f142115i.setText(com.ss.android.ugc.aweme.i18n.b.a((long) i2));
        TuxTextView tuxTextView = this.f142115i;
        if (i2 <= 0) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        tuxTextView.setVisibility(i5);
    }
}

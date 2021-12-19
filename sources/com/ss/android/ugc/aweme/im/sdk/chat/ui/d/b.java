package com.ss.android.ugc.aweme.im.sdk.chat.ui.d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class b {
    public static final a p = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f101210a;

    /* renamed from: b  reason: collision with root package name */
    boolean f101211b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f101212c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f101213d;

    /* renamed from: e  reason: collision with root package name */
    public long f101214e;

    /* renamed from: f  reason: collision with root package name */
    public long f101215f;

    /* renamed from: g  reason: collision with root package name */
    public int f101216g = -1;

    /* renamed from: h  reason: collision with root package name */
    final Context f101217h;

    /* renamed from: i  reason: collision with root package name */
    public int f101218i;

    /* renamed from: j  reason: collision with root package name */
    final View f101219j;

    /* renamed from: k  reason: collision with root package name */
    final TextView f101220k;

    /* renamed from: l  reason: collision with root package name */
    public final ChatLinearLayoutManager f101221l;

    /* renamed from: m  reason: collision with root package name */
    public final View f101222m;
    public final RecyclerView n;
    public final com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c o;
    private int q;
    private final f r;

    static {
        Covode.recordClassIndex(64750);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64751);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f101225a;

        static {
            Covode.recordClassIndex(64754);
        }

        d(b bVar) {
            this.f101225a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c.b
        public final void a() {
            if (this.f101225a.f101213d) {
                this.f101225a.b();
                return;
            }
            b bVar = this.f101225a;
            com.ss.android.ugc.aweme.im.service.m.a.b("UnreadMessageTips", "checkShowUnreadMessageTips");
            if (bVar.o.getItemCount() > 0 && bVar.f101215f > 0 && !bVar.f101211b) {
                bVar.f101211b = true;
                bVar.n.post(new RunnableC2519b(bVar));
            }
        }
    }

    public final void a() {
        float width;
        if (gb.a()) {
            width = -((float) this.f101219j.getWidth());
        } else {
            width = (float) this.f101219j.getWidth();
        }
        this.f101219j.startAnimation(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.a(0.0f, width));
        n.a(this.f101219j, 8);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b$b  reason: collision with other inner class name */
    static final class RunnableC2519b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f101223a;

        static {
            Covode.recordClassIndex(64752);
        }

        RunnableC2519b(b bVar) {
            this.f101223a = bVar;
        }

        public final void run() {
            String string;
            ChatLinearLayoutManager chatLinearLayoutManager = this.f101223a.f101221l;
            if (chatLinearLayoutManager != null) {
                int k2 = chatLinearLayoutManager.k();
                if (this.f101223a.f101215f > ((long) ((chatLinearLayoutManager.m() - k2) + 1))) {
                    b bVar = this.f101223a;
                    long j2 = bVar.f101215f;
                    if (j2 > 99) {
                        string = bVar.f101217h.getResources().getString(R.string.cj9, bVar.f101217h.getResources().getString(R.string.cj7));
                        l.b(string, "");
                    } else {
                        string = bVar.f101217h.getResources().getString(R.string.cj9, String.valueOf(j2));
                        l.b(string, "");
                    }
                    TextView textView = bVar.f101220k;
                    l.b(textView, "");
                    textView.setText(string);
                    bVar.f101219j.setVisibility(0);
                    bVar.f101219j.startAnimation(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.a(n.b(bVar.f101217h, 120.0f), 0.0f));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b.b():void");
    }

    public static final class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f101226a;

        static {
            Covode.recordClassIndex(64755);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(b bVar) {
            this.f101226a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            int i3;
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 0 && this.f101226a.f101212c) {
                ChatLinearLayoutManager chatLinearLayoutManager = this.f101226a.f101221l;
                if (chatLinearLayoutManager != null) {
                    i3 = chatLinearLayoutManager.C();
                } else {
                    i3 = -1;
                }
                com.ss.android.ugc.aweme.im.service.m.a.b("UnreadMessageTips", "lastVisiblePos=" + i3 + "mCurrentUnreadPosition=" + this.f101226a.f101216g + " mSmoothScrollDistance=" + this.f101226a.f101218i);
                if (i3 == this.f101226a.f101216g) {
                    recyclerView.a(0, -this.f101226a.f101218i);
                    this.f101226a.f101212c = false;
                    return;
                }
                recyclerView.d(this.f101226a.f101216g);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            ChatLinearLayoutManager chatLinearLayoutManager;
            int C;
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            b bVar = this.f101226a;
            if (bVar.f101219j.getVisibility() != 8 && (chatLinearLayoutManager = bVar.f101221l) != null && (C = chatLinearLayoutManager.C()) >= 0 && C < bVar.o.getItemCount()) {
                ai b2 = bVar.o.b(C);
                l.b(b2, "");
                if (b2 == null) {
                    return;
                }
                if (b2.getIndex() <= bVar.f101214e) {
                    bVar.a();
                } else if (C == bVar.o.getItemCount() - 1 && !bVar.o.f101118h) {
                    bVar.a();
                }
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f101224a;

        static {
            Covode.recordClassIndex(64753);
        }

        c(b bVar) {
            this.f101224a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f101224a.f101214e != -1 && !this.f101224a.f101210a) {
                this.f101224a.f101210a = true;
                this.f101224a.a();
                this.f101224a.b();
            }
        }
    }

    public static final class f extends r {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f101227f;

        static {
            Covode.recordClassIndex(64756);
        }

        @Override // androidx.recyclerview.widget.r
        public final int c() {
            return -1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, Context context) {
            super(context);
            this.f101227f = bVar;
        }
    }

    public b(View view, RecyclerView recyclerView, com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar) {
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(cVar, "");
        this.f101222m = view;
        this.n = recyclerView;
        this.o = cVar;
        Context context = view.getContext();
        l.b(context, "");
        this.f101217h = context;
        this.f101218i = (int) n.b(context, 60.0f);
        View findViewById = view.findViewById(R.id.fc7);
        ChatLinearLayoutManager chatLinearLayoutManager = null;
        if (gb.a()) {
            float a2 = com.c.a.a.a(16);
            float a3 = com.c.a.a.a(16);
            l.b(findViewById, "");
            Drawable background = findViewById.getBackground();
            GradientDrawable gradientDrawable = (GradientDrawable) (!(background instanceof GradientDrawable) ? null : background);
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, a2, a2, a3, a3, 0.0f, 0.0f});
            }
        }
        l.b(findViewById, "");
        this.f101219j = findViewById;
        this.f101220k = (TextView) view.findViewById(R.id.fc6);
        if (recyclerView.getLayoutManager() instanceof ChatLinearLayoutManager) {
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager");
            chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager;
        }
        this.f101221l = chatLinearLayoutManager;
        this.r = new f(this, recyclerView.getContext());
        findViewById.setVisibility(8);
        findViewById.setOnClickListener(new c(this));
        h a4 = a.C0745a.a().a(cVar.n.getConversationId());
        if (a4 != null) {
            this.f101214e = a4.getReadIndex();
            this.f101215f = a4.getUnreadCount();
        }
        cVar.a(new d(this));
        recyclerView.a(new e(this));
    }
}

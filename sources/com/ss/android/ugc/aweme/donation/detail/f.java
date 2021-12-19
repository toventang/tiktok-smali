package com.ss.android.ugc.aweme.donation.detail;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.donation.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends RecyclerView.ViewHolder {

    /* renamed from: i  reason: collision with root package name */
    public static final int f83008i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f83009j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final SmartAvatarImageView f83010a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f83011b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f83012c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f83013d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f83014e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f83015f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f83016g;

    /* renamed from: h  reason: collision with root package name */
    public final b f83017h;

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f83018a = new b();

        static {
            Covode.recordClassIndex(51760);
        }

        b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f83019a = new c();

        static {
            Covode.recordClassIndex(51761);
        }

        c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51759);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(51758);
        Context applicationContext = com.bytedance.ies.ugc.appcontext.d.a().getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        f83008i = (int) n.b(applicationContext, 32.0f);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f83020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f83021b;

        static {
            Covode.recordClassIndex(51762);
        }

        d(f fVar, e eVar) {
            this.f83020a = fVar;
            this.f83021b = eVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f83020a.f83017h.o();
            View view2 = this.f83020a.itemView;
            l.b(view2, "");
            SmartRoute buildRoute = SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/");
            User user = this.f83021b.f83022a;
            String str2 = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            SmartRoute withParam = buildRoute.withParam("uid", str);
            User user2 = this.f83021b.f83022a;
            if (user2 != null) {
                str2 = user2.getSecUid();
            }
            withParam.withParam("sec_uid", str2).withParam("enter_from", this.f83020a.f83017h.a()).withParam("enter_method", this.f83020a.f83017h.c()).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f83017h = bVar;
        this.f83010a = (SmartAvatarImageView) view.findViewById(R.id.or);
        this.f83011b = (TextView) view.findViewById(R.id.cs_);
        this.f83012c = (TextView) view.findViewById(R.id.ak7);
        this.f83013d = (TextView) view.findViewById(R.id.eku);
        this.f83014e = (ImageView) view.findViewById(R.id.e99);
        this.f83015f = (TextView) view.findViewById(R.id.eny);
        this.f83016g = (TextView) view.findViewById(R.id.enz);
    }
}

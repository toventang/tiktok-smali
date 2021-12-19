package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.api.k;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class s extends a {

    /* renamed from: b  reason: collision with root package name */
    public AnimatedImageView f91877b;

    /* renamed from: c  reason: collision with root package name */
    public k f91878c;

    /* renamed from: d  reason: collision with root package name */
    d f91879d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f91880e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f91881f;

    /* renamed from: g  reason: collision with root package name */
    private Context f91882g;

    /* renamed from: h  reason: collision with root package name */
    private LiveCircleView f91883h;

    /* renamed from: i  reason: collision with root package name */
    private List<k> f91884i;

    static {
        Covode.recordClassIndex(57829);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f91885a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f91886b;

        static {
            Covode.recordClassIndex(57830);
        }

        a(s sVar, List list) {
            this.f91885a = sVar;
            this.f91886b = list;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(this.f91885a.itemView, 1200)) {
                s sVar = this.f91885a;
                View view2 = sVar.itemView;
                l.b(view2, "");
                Context context = view2.getContext();
                l.b(context, "");
                sVar.a(context, this.f91885a.f91878c, this.f91886b, this.f91885a.f91877b.getWidth(), this.f91885a.f91877b.getHeight());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.bvt);
        l.b(findViewById, "");
        this.f91877b = (AnimatedImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f3c);
        l.b(findViewById2, "");
        this.f91880e = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bjg);
        l.b(findViewById3, "");
        this.f91881f = (TextView) findViewById3;
        Context context = view.getContext();
        l.b(context, "");
        this.f91882g = context;
        View findViewById4 = view.findViewById(R.id.byp);
        l.b(findViewById4, "");
        this.f91883h = (LiveCircleView) findViewById4;
        AnimatedImageView animatedImageView = this.f91877b;
        d dVar = new d(animatedImageView, animatedImageView, this.f91883h);
        this.f91879d = dVar;
        dVar.f94547l = false;
    }

    public final void a(k kVar, List<k> list, int i2) {
        User user;
        l.d(kVar, "");
        l.d(list, "");
        this.f91580a = i2;
        View view = this.itemView;
        l.b(view, "");
        view.setScaleX(1.0f);
        View view2 = this.itemView;
        l.b(view2, "");
        view2.setScaleY(1.0f);
        this.f91878c = kVar;
        this.f91884i = list;
        if (!(kVar == null || (user = kVar.getUser()) == null)) {
            e.a(this.f91877b, user.getAvatarThumb());
            if (com.ss.android.ugc.aweme.language.d.c()) {
                this.f91880e.setText(user.getNickname());
            } else {
                this.f91880e.setText(user.getUniqueId());
            }
        }
        a(this.f91881f);
        this.f91883h.setVisibility(0);
        this.f91879d.a(null, getClass());
        this.f91877b.setOnClickListener(new a(this, list));
    }
}

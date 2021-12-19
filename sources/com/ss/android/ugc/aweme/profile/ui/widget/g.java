package com.ss.android.ugc.aweme.profile.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.profile.service.f;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class g extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final Context f117400a;

    /* renamed from: b  reason: collision with root package name */
    final AvatarImageWithVerify f117401b;

    /* renamed from: c  reason: collision with root package name */
    final TextView f117402c;

    /* renamed from: d  reason: collision with root package name */
    final TextView f117403d;

    /* renamed from: e  reason: collision with root package name */
    final TextView f117404e;

    /* renamed from: f  reason: collision with root package name */
    final ImageView f117405f;

    /* renamed from: g  reason: collision with root package name */
    public m<? super RecommendContact, ? super Integer, z> f117406g;

    /* renamed from: h  reason: collision with root package name */
    public final int f117407h;

    static {
        Covode.recordClassIndex(75854);
    }

    public final String a() {
        int i2 = this.f117407h;
        if (i2 == 0) {
            return "others_homepage";
        }
        if (i2 == 1) {
            return "homepage_follow";
        }
        if (i2 != 2) {
            return "";
        }
        return "homepage_friends";
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f117408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendContact f117409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f117410c;

        static {
            Covode.recordClassIndex(75855);
        }

        a(g gVar, RecommendContact recommendContact, int i2) {
            this.f117408a = gVar;
            this.f117409b = recommendContact;
            this.f117410c = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m<? super RecommendContact, ? super Integer, z> mVar = this.f117408a.f117406g;
            if (mVar != null) {
                mVar.invoke(this.f117409b, Integer.valueOf(this.f117410c));
            }
            com.ss.android.ugc.aweme.recommend.users.a.f120113a.a();
            this.f117408a.a();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f117411a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendContact f117412b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f117413c;

        static {
            Covode.recordClassIndex(75856);
        }

        b(g gVar, RecommendContact recommendContact, int i2) {
            this.f117411a = gVar;
            this.f117412b = recommendContact;
            this.f117413c = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f a2 = com.ss.android.ugc.aweme.recommend.users.a.f120113a.a();
            Context context = this.f117411a.f117400a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new h.f.a.b<Boolean, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.widget.g.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(75857);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Boolean bool) {
                    m<? super RecommendContact, ? super Integer, z> mVar;
                    if (bool.booleanValue() && (mVar = this.this$0.f117411a.f117406g) != null) {
                        mVar.invoke(this.this$0.f117412b, Integer.valueOf(this.this$0.f117413c));
                    }
                    return z.f158842a;
                }
            };
            a2.a((Activity) context);
            f a3 = com.ss.android.ugc.aweme.recommend.users.a.f120113a.a();
            this.f117411a.a();
            a3.a("click");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view, int i2) {
        super(view);
        l.d(view, "");
        this.f117407h = i2;
        this.f117400a = view.getContext();
        View findViewById = view.findViewById(R.id.or);
        l.b(findViewById, "");
        this.f117401b = (AvatarImageWithVerify) findViewById;
        View findViewById2 = view.findViewById(R.id.fdm);
        l.b(findViewById2, "");
        this.f117402c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dig);
        l.b(findViewById3, "");
        this.f117403d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.b7a);
        l.b(findViewById4, "");
        this.f117404e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.a7h);
        l.b(findViewById5, "");
        this.f117405f = (ImageView) findViewById5;
    }
}

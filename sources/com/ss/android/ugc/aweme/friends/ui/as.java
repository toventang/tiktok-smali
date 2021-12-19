package com.ss.android.ugc.aweme.friends.ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.profile.service.f;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class as extends x {

    /* renamed from: a  reason: collision with root package name */
    public final Context f97161a;

    /* renamed from: b  reason: collision with root package name */
    public m<? super RecommendContact, ? super Integer, z> f97162b;

    /* renamed from: c  reason: collision with root package name */
    private final View f97163c;

    /* renamed from: d  reason: collision with root package name */
    private final AvatarImageWithVerify f97164d;

    /* renamed from: e  reason: collision with root package name */
    private final FansFollowUserBtn f97165e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f97166f;

    static {
        Covode.recordClassIndex(61738);
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.x
    public final void setDislikeListener(m<? super RecommendContact, ? super Integer, z> mVar) {
        this.f97162b = mVar;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ as f97167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendContact f97168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f97169c;

        static {
            Covode.recordClassIndex(61739);
        }

        a(as asVar, RecommendContact recommendContact, int i2) {
            this.f97167a = asVar;
            this.f97168b = recommendContact;
            this.f97169c = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f i2 = IRecommendUsersServiceImpl.j().i();
            Context context = this.f97167a.f97161a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new h.f.a.b<Boolean, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.ui.as.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(61740);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Boolean bool) {
                    m<? super RecommendContact, ? super Integer, z> mVar;
                    if (bool.booleanValue() && (mVar = this.this$0.f97167a.f97162b) != null) {
                        mVar.invoke(this.this$0.f97168b, Integer.valueOf(this.this$0.f97169c));
                    }
                    return z.f158842a;
                }
            };
            i2.a((Activity) context);
            f i3 = IRecommendUsersServiceImpl.j().i();
            this.f97167a.getEnterFrom();
            i3.a("click");
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ as f97170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendContact f97171b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f97172c;

        static {
            Covode.recordClassIndex(61741);
        }

        b(as asVar, RecommendContact recommendContact, int i2) {
            this.f97170a = asVar;
            this.f97171b = recommendContact;
            this.f97172c = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m<? super RecommendContact, ? super Integer, z> mVar = this.f97170a.f97162b;
            if (mVar != null) {
                mVar.invoke(this.f97171b, Integer.valueOf(this.f97172c));
            }
            IRecommendUsersServiceImpl.j().i();
            this.f97170a.getEnterFrom();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private as(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(11690);
        this.f97161a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a2l, this);
        this.f97163c = inflate;
        this.f97164d = (AvatarImageWithVerify) inflate.findViewById(R.id.bu0);
        this.f97165e = (FansFollowUserBtn) inflate.findViewById(R.id.a56);
        this.f97166f = (ImageView) inflate.findViewById(R.id.amw);
        setBackground(c.c(context));
        MethodCollector.o(11690);
    }

    public /* synthetic */ as(Context context, byte b2) {
        this(context);
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.x
    public final void a(RecommendContact recommendContact, int i2) {
        l.d(recommendContact, "");
        this.f97164d.setPlaceHolder(R.drawable.a_d);
        if (l.a((Object) getEnterFrom(), (Object) "find_friends")) {
            FansFollowUserBtn fansFollowUserBtn = this.f97165e;
            ViewGroup.LayoutParams buttonLayoutParams = fansFollowUserBtn.getButtonLayoutParams();
            if (!(buttonLayoutParams.height == n.a(24.0d) && buttonLayoutParams.width == n.a(64.0d))) {
                buttonLayoutParams.height = n.a(24.0d);
                buttonLayoutParams.width = n.a(64.0d);
                fansFollowUserBtn.setButtonLayoutParams(buttonLayoutParams);
                fansFollowUserBtn.getLayoutParams().height = buttonLayoutParams.height;
                fansFollowUserBtn.requestLayout();
            }
        }
        this.f97165e.setText("");
        this.f97165e.setOnClickListener(new a(this, recommendContact, i2));
        this.f97166f.setOnClickListener(new b(this, recommendContact, i2));
    }
}

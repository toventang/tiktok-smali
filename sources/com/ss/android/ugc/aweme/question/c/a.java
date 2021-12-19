package com.ss.android.ugc.aweme.question.c;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.DetailViewModel;
import com.ss.android.ugc.aweme.favorites.g.d;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.question.c;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class a implements u<Boolean>, d {

    /* renamed from: a  reason: collision with root package name */
    public c f119910a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.question.h.a.c f119911b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f119912c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f119913d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f119914e;

    /* renamed from: f  reason: collision with root package name */
    public final View f119915f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.favorites.g.a f119916g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dh.d f119917h;

    /* renamed from: i  reason: collision with root package name */
    private final CheckableImageView f119918i;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f119919j;

    /* renamed from: k  reason: collision with root package name */
    private final QuestionDetailParam f119920k;

    static {
        Covode.recordClassIndex(77910);
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(String str) {
    }

    private final void d() {
        this.f119914e = !this.f119914e;
    }

    public final void a() {
        int i2;
        CheckableImageView checkableImageView = this.f119918i;
        if (this.f119914e) {
            i2 = R.drawable.b1a;
        } else {
            i2 = 2131233128;
        }
        checkableImageView.setImageResource(i2);
    }

    public final void b() {
        int i2;
        TextView textView = this.f119919j;
        if (textView != null) {
            if (this.f119914e) {
                i2 = R.string.pp;
            } else {
                i2 = R.string.pj;
            }
            textView.setText(i2);
        }
        com.ss.android.ugc.aweme.dh.d dVar = this.f119917h;
        if (dVar != null && !this.f119914e && dVar.isShowing()) {
            dVar.dismiss();
        }
        if (this.f119914e) {
            this.f119913d = true;
        }
    }

    public final void c() {
        String str;
        String str2;
        String str3 = null;
        if (this.f119914e) {
            QuestionDetailParam questionDetailParam = this.f119920k;
            if (questionDetailParam != null) {
                str2 = questionDetailParam.getId();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("enter_from", "qa_detail");
            if (str2 != null) {
                dVar.a("question_id", str2);
            }
            r.a("cancel_favorite_qa", dVar.f66730a);
        } else {
            QuestionDetailParam questionDetailParam2 = this.f119920k;
            if (questionDetailParam2 != null) {
                str = questionDetailParam2.getId();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
            dVar2.a("enter_from", "qa_detail");
            if (str != null) {
                dVar2.a("question_id", str);
            }
            r.a("favorite_qa", dVar2.f66730a);
        }
        com.ss.android.ugc.aweme.favorites.g.a aVar = this.f119916g;
        Object[] objArr = new Object[3];
        objArr[0] = 7;
        c cVar = this.f119910a;
        if (cVar == null) {
            l.a("mData");
        }
        Long id = cVar.getId();
        if (id != null) {
            str3 = String.valueOf(id.longValue());
        }
        objArr[1] = str3;
        objArr[2] = Integer.valueOf(1 ^ (this.f119914e ? 1 : 0));
        aVar.a(objArr);
        d();
        this.f119918i.b();
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void e_(Exception exc) {
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        d();
        a();
        b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(Boolean bool) {
        com.ss.android.ugc.aweme.dh.d dVar = this.f119917h;
        if (dVar != null && dVar.isShowing()) {
            dVar.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(BaseResponse baseResponse) {
        int i2;
        c cVar = this.f119910a;
        if (cVar == null) {
            l.a("mData");
        }
        if (this.f119914e) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        cVar.setCollectStatus(i2);
        if (this.f119914e) {
            this.f119912c = true;
        }
    }

    public a(View view, CheckableImageView checkableImageView, TextView textView, QuestionDetailParam questionDetailParam) {
        l.d(view, "");
        l.d(checkableImageView, "");
        this.f119915f = view;
        this.f119918i = checkableImageView;
        this.f119919j = textView;
        this.f119920k = questionDetailParam;
        com.ss.android.ugc.aweme.favorites.g.a aVar = new com.ss.android.ugc.aweme.favorites.g.a();
        this.f119916g = aVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.question.c.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f119921a;

            /* renamed from: com.ss.android.ugc.aweme.question.c.a$1$a  reason: collision with other inner class name */
            final /* synthetic */ class C3092a implements f {

                /* renamed from: a  reason: collision with root package name */
                private final /* synthetic */ h.f.a.a f119922a;

                static {
                    Covode.recordClassIndex(77913);
                }

                C3092a(h.f.a.a aVar) {
                    this.f119922a = aVar;
                }

                @Override // com.ss.android.ugc.aweme.base.component.f
                public final /* synthetic */ void a() {
                    l.b(this.f119922a.invoke(), "");
                }

                @Override // com.ss.android.ugc.aweme.base.component.f
                public final void b() {
                }
            }

            static {
                Covode.recordClassIndex(77911);
            }

            {
                this.f119921a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f119921a.f119912c = false;
                this.f119921a.f119913d = false;
                if (!b.g().isLogin()) {
                    com.ss.android.ugc.aweme.login.c.a(o.d(this.f119921a.f119915f), "qa_detail", "click_favorite_question", (Bundle) null, new C3092a(new h.f.a.a<z>(this.f119921a) {
                        /* class com.ss.android.ugc.aweme.question.c.a.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(77912);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            ((a) this.receiver).c();
                            return z.f158842a;
                        }
                    }));
                } else {
                    this.f119921a.c();
                }
            }
        });
        checkableImageView.setOnStateChangeListener(new CheckableImageView.a(this) {
            /* class com.ss.android.ugc.aweme.question.c.a.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f119923a;

            static {
                Covode.recordClassIndex(77914);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void bR_() {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f119923a = r1;
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void a(int i2) {
                if (i2 == 1) {
                    this.f119923a.a();
                    this.f119923a.b();
                }
            }
        });
        aVar.a_(this);
        Activity d2 = o.d(view);
        Objects.requireNonNull(d2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        NextLiveData<Boolean> nextLiveData = ((DetailViewModel) ae.a((e) d2, (ad.b) null).a(DetailViewModel.class)).f79589a;
        Activity d3 = o.d(view);
        Objects.requireNonNull(d3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        nextLiveData.observe((e) d3, this);
    }
}

package com.ss.android.ugc.aweme.challenge.ui.a;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.DetailViewModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.g.a;
import com.ss.android.ugc.aweme.favorites.g.d;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class i implements u<Boolean>, d {

    /* renamed from: a  reason: collision with root package name */
    Challenge f70069a;

    /* renamed from: b  reason: collision with root package name */
    j f70070b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f70071c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f70072d;

    /* renamed from: e  reason: collision with root package name */
    boolean f70073e;

    /* renamed from: f  reason: collision with root package name */
    public final View f70074f;

    /* renamed from: g  reason: collision with root package name */
    final ChallengeDetailParam f70075g;

    /* renamed from: h  reason: collision with root package name */
    private final a f70076h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dh.d f70077i;

    /* renamed from: j  reason: collision with root package name */
    private final CheckableImageView f70078j;

    /* renamed from: k  reason: collision with root package name */
    private final TextView f70079k;

    static {
        Covode.recordClassIndex(43224);
    }

    private final void d() {
        this.f70073e = !this.f70073e;
    }

    public final void a() {
        int i2;
        CheckableImageView checkableImageView = this.f70078j;
        if (this.f70073e) {
            i2 = R.drawable.b1a;
        } else {
            i2 = 2131233128;
        }
        checkableImageView.setImageResource(i2);
    }

    public final void b() {
        int i2;
        TextView textView = this.f70079k;
        if (textView != null) {
            if (this.f70073e) {
                i2 = R.string.pp;
            } else {
                i2 = R.string.pj;
            }
            textView.setText(i2);
        }
        com.ss.android.ugc.aweme.dh.d dVar = this.f70077i;
        if (dVar != null && !this.f70073e && dVar.isShowing()) {
            dVar.dismiss();
        }
        if (this.f70073e) {
            this.f70072d = true;
        }
    }

    public final void c() {
        a aVar = this.f70076h;
        Object[] objArr = new Object[3];
        objArr[0] = 3;
        Challenge challenge = this.f70069a;
        if (challenge == null) {
            l.a("mData");
        }
        objArr[1] = challenge.getCid();
        objArr[2] = Integer.valueOf(1 ^ (this.f70073e ? 1 : 0));
        aVar.a(objArr);
        d();
        this.f70078j.b();
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
        com.ss.android.ugc.aweme.dh.d dVar = this.f70077i;
        if (dVar != null && dVar.isShowing()) {
            dVar.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(BaseResponse baseResponse) {
        Challenge challenge = this.f70069a;
        if (challenge == null) {
            l.a("mData");
        }
        challenge.setCollectStatus(this.f70073e ? 1 : 0);
        if (this.f70073e) {
            this.f70071c = true;
        }
        Challenge challenge2 = this.f70069a;
        if (challenge2 == null) {
            l.a("mData");
        }
        c.a(new com.ss.android.ugc.aweme.challenge.d.a(challenge2));
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(String str) {
        if (str != null) {
            new b(this.f70074f).a(str).b();
        }
    }

    public final void a(Challenge challenge, j jVar) {
        l.d(challenge, "");
        l.d(jVar, "");
        this.f70069a = challenge;
        this.f70070b = jVar;
        boolean z = true;
        if (challenge.getCollectStatus() != 1) {
            z = false;
        }
        this.f70073e = z;
        a();
        b();
    }

    public i(View view, CheckableImageView checkableImageView, TextView textView, ChallengeDetailParam challengeDetailParam) {
        l.d(view, "");
        l.d(checkableImageView, "");
        this.f70074f = view;
        this.f70078j = checkableImageView;
        this.f70079k = textView;
        this.f70075g = challengeDetailParam;
        a aVar = new a();
        this.f70076h = aVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.challenge.ui.a.i.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f70080a;

            /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.i$1$a */
            final /* synthetic */ class a implements f {

                /* renamed from: a  reason: collision with root package name */
                private final /* synthetic */ h.f.a.a f70081a;

                static {
                    Covode.recordClassIndex(43227);
                }

                a(h.f.a.a aVar) {
                    this.f70081a = aVar;
                }

                @Override // com.ss.android.ugc.aweme.base.component.f
                public final /* synthetic */ void a() {
                    l.b(this.f70081a.invoke(), "");
                }

                @Override // com.ss.android.ugc.aweme.base.component.f
                public final void b() {
                }
            }

            static {
                Covode.recordClassIndex(43225);
            }

            {
                this.f70080a = r1;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                ClickAgent.onClick(view);
                i iVar = this.f70080a;
                if (iVar.f70073e) {
                    str = "cancel_favourite_challenge";
                } else {
                    str = "favourite_challenge";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "challenge");
                Challenge challenge = iVar.f70069a;
                if (challenge == null) {
                    l.a("mData");
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("tag_id", challenge.getCid());
                Challenge challenge2 = iVar.f70069a;
                if (challenge2 == null) {
                    l.a("mData");
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("challenge_id", challenge2.getCid());
                j jVar = iVar.f70070b;
                if (jVar == null) {
                    l.a("mHeaderParam");
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("process_id", jVar.f70087e);
                ChallengeDetailParam challengeDetailParam = iVar.f70075g;
                if (challengeDetailParam != null) {
                    str2 = challengeDetailParam.getParentTagId();
                } else {
                    str2 = null;
                }
                r.a(str, a5.a("parent_tag_id", str2).f66730a);
                j jVar2 = iVar.f70070b;
                if (jVar2 == null) {
                    l.a("mHeaderParam");
                }
                boolean equals = TextUtils.equals(jVar2.f70086d, "search_result");
                j jVar3 = iVar.f70070b;
                if (jVar3 == null) {
                    l.a("mHeaderParam");
                }
                boolean equals2 = TextUtils.equals(jVar3.f70086d, "general_search");
                if ((equals || equals2) && !iVar.f70073e) {
                    IChallengeDetailLegacyService a6 = ChallengeDetailLegacyServiceImpl.a();
                    Challenge challenge3 = iVar.f70069a;
                    if (challenge3 == null) {
                        l.a("mData");
                    }
                    a6.a("search_favourite", "challenge", challenge3.getCid(), equals);
                }
                this.f70080a.f70071c = false;
                this.f70080a.f70072d = false;
                if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                    com.ss.android.ugc.aweme.login.c.a(o.d(this.f70080a.f70074f), "challenge", "click_favorite_challenge", (Bundle) null, new a(new h.f.a.a<z>(this.f70080a) {
                        /* class com.ss.android.ugc.aweme.challenge.ui.a.i.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(43226);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            ((i) this.receiver).c();
                            return z.f158842a;
                        }
                    }));
                } else {
                    this.f70080a.c();
                }
            }
        });
        checkableImageView.setOnStateChangeListener(new CheckableImageView.a(this) {
            /* class com.ss.android.ugc.aweme.challenge.ui.a.i.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f70082a;

            static {
                Covode.recordClassIndex(43228);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void bR_() {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f70082a = r1;
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void a(int i2) {
                if (i2 == 1) {
                    this.f70082a.a();
                    this.f70082a.b();
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

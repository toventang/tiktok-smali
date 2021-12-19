package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.n;
import com.ss.android.ugc.aweme.feed.x.t;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class ProfileAdvancedFeatureTranslationsAssem extends i implements org.greenrobot.eventbus.i, j {

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f117612a = new a();

        static {
            Covode.recordClassIndex(76054);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(76053);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new g(ProfileAdvancedFeatureTranslationsAssem.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a B() {
        return com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Translations;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final View A() {
        return a(R.string.cux, R.raw.icon_globe, a.f117612a);
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        if (EventBus.a().a(this)) {
            EventBus.a().b(this);
        }
        super.p();
    }

    @Override // com.bytedance.assem.arch.core.a, com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), v.f117645a, new b(this));
        d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), w.f117646a, new c(this));
    }

    static final class c extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ ProfileAdvancedFeatureTranslationsAssem this$0;

        static {
            Covode.recordClassIndex(76057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ProfileAdvancedFeatureTranslationsAssem profileAdvancedFeatureTranslationsAssem) {
            super(1);
            this.this$0 = profileAdvancedFeatureTranslationsAssem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            if (aVar != null) {
                this.this$0.z();
            }
            return z.f158842a;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        if (l.a((Object) jVar.f91311b.optString("eventName"), (Object) t.f95364a)) {
            n.f90266a = true;
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ ProfileAdvancedFeatureTranslationsAssem this$0;

        static {
            Covode.recordClassIndex(76055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ProfileAdvancedFeatureTranslationsAssem profileAdvancedFeatureTranslationsAssem) {
            super(1);
            this.this$0 = profileAdvancedFeatureTranslationsAssem;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f117613a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f117614b;

            static {
                Covode.recordClassIndex(76056);
            }

            a(User user, b bVar) {
                this.f117613a = user;
                this.f117614b = bVar;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                ProfileAdvancedFeatureTranslationsAssem profileAdvancedFeatureTranslationsAssem = this.f117614b.this$0;
                User user = this.f117613a;
                Context ar_ = profileAdvancedFeatureTranslationsAssem.ar_();
                if (ar_ == null) {
                    l.b();
                }
                String uid = user.getUid();
                l.b(uid, "");
                if (profileAdvancedFeatureTranslationsAssem.v()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                t.a(ar_, uid, str, "profile", false, null);
                if (!EventBus.a().a(profileAdvancedFeatureTranslationsAssem)) {
                    EventBus.a(EventBus.a(), profileAdvancedFeatureTranslationsAssem);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                if (com.ss.android.ugc.aweme.profile.widgets.advancedfeat.b.a.a(t, this.this$0.v())) {
                    this.this$0.y();
                    this.this$0.a(new a(t, this));
                } else {
                    this.this$0.z();
                }
            }
            return z.f158842a;
        }
    }
}

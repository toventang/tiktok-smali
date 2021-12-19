package com.ss.android.ugc.aweme.profile.widgets.translations;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.ClaCrowdsourcingEntrypoints;
import com.ss.android.ugc.aweme.experiment.n;
import com.ss.android.ugc.aweme.experiment.o;
import com.ss.android.ugc.aweme.experiment.p;
import com.ss.android.ugc.aweme.feed.x.t;
import com.ss.android.ugc.aweme.profile.model.User;
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
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class TranslationsAssem extends com.bytedance.assem.arch.d.a implements i, j {

    /* renamed from: j  reason: collision with root package name */
    public TextView f118102j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f118103k = new com.bytedance.assem.arch.extensions.i(bQ_(), new a(this, null));

    static {
        Covode.recordClassIndex(76690);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new g(TranslationsAssem.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        if (this.f118103k.getValue() != null) {
            return true;
        }
        return false;
    }

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.translations.TranslationsAssem.a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void p() {
        if (EventBus.a().a(this)) {
            EventBus.a().b(this);
        }
        super.p();
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ TranslationsAssem this$0;

        static {
            Covode.recordClassIndex(76694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TranslationsAssem translationsAssem) {
            super(1);
            this.this$0 = translationsAssem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            TextView textView;
            if (!(aVar == null || (textView = this.this$0.f118102j) == null)) {
                textView.setVisibility(8);
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

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslationsAssem f118104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f118105b;

        static {
            Covode.recordClassIndex(76692);
        }

        b(TranslationsAssem translationsAssem, User user) {
            this.f118104a = translationsAssem;
            this.f118105b = user;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            TranslationsAssem translationsAssem = this.f118104a;
            User user = this.f118105b;
            Context ar_ = translationsAssem.ar_();
            if (ar_ == null) {
                l.b();
            }
            String uid = user.getUid();
            l.b(uid, "");
            if (translationsAssem.u()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            t.a(ar_, uid, str, "profile", false, null);
            if (!EventBus.a().a(translationsAssem)) {
                EventBus.a(EventBus.a(), translationsAssem);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        this.f118102j = (TextView) view.findViewById(R.id.f9y);
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), a.f118106a, new c(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), b.f118107a, new d(this));
    }

    static final class c extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ TranslationsAssem this$0;

        static {
            Covode.recordClassIndex(76693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TranslationsAssem translationsAssem) {
            super(1);
            this.this$0 = translationsAssem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            TextView textView;
            ClaCrowdsourcingEntrypoints a2;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                TranslationsAssem translationsAssem = this.this$0;
                if (o.a() && (textView = translationsAssem.f118102j) != null) {
                    int i2 = 0;
                    if ((!translationsAssem.u() || (a2 = p.a()) == null || !a2.isEnrolled()) && (translationsAssem.u() || !t.isTranslator)) {
                        i2 = 8;
                    }
                    textView.setVisibility(i2);
                    textView.setOnClickListener(new b(translationsAssem, t));
                }
            }
            return z.f158842a;
        }
    }
}

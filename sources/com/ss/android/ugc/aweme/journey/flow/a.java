package com.ss.android.ugc.aweme.journey.flow;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.c.c;
import com.ss.android.ugc.aweme.journey.aa;
import com.ss.android.ugc.aweme.journey.ad;
import com.ss.android.ugc.aweme.journey.ae;
import com.ss.android.ugc.aweme.journey.ai;
import com.ss.android.ugc.aweme.journey.k;
import com.ss.android.ugc.aweme.journey.m;
import com.ss.android.ugc.aweme.journey.o;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.v;
import com.ss.android.ugc.aweme.journey.w;
import com.ss.android.ugc.aweme.journey.y;
import h.a.n;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class a extends com.ss.android.d.b.a<NewUserJourneyFlowDependencies> {

    /* renamed from: c  reason: collision with root package name */
    public static final C2670a f104853c = new C2670a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static final List<aa> f104854f = n.b(new aa(c.JOURNEY_SLOGAN_ID.getId()), new aa(c.JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID.getId()), new aa(c.JOURNEY_INTERESTS_ID.getId()), new aa(c.JOURNEY_AD_EXPERIENCE_ID.getId()), new aa(c.JOURNEY_CONTENT_LANGUAGE_ID.getId()), new aa(c.JOURNEY_APP_LANGUAGE_ID.getId()), new aa(c.JOURNEY_NEW_USER_ADD_FB_FRIENDS_ID.getId()), new aa(c.JOURNEY_DEEPLINK_ID.getId()), new aa(c.JOURNEY_SWIPE_UP_ID.getId()), new aa(c.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID.getId()));

    /* renamed from: b  reason: collision with root package name */
    public int f104855b = -1;

    /* renamed from: d  reason: collision with root package name */
    private List<aa> f104856d = f104854f;

    /* renamed from: e  reason: collision with root package name */
    private List<c> f104857e = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.journey.flow.a$a  reason: collision with other inner class name */
    public static final class C2670a {
        static {
            Covode.recordClassIndex(67244);
        }

        private C2670a() {
        }

        public /* synthetic */ C2670a(byte b2) {
            this();
        }
    }

    private final void a() {
        List<aa> list;
        List<Integer> list2;
        List<w> list3;
        com.ss.android.ugc.aweme.journey.a.c c2 = this.f59393a.c();
        ComponentDependencies a2 = this.f59393a.a();
        Context context = (Context) ((WeakReference) this.f59393a.f104846b.invoke()).get();
        if (context != null && !y.f105215a) {
            l.b(context, "");
            y.a.a(context);
        }
        o oVar = c2.f104805a;
        if (oVar != null) {
            a2.j();
            v vVar = oVar.f104873a;
            if (!(vVar == null || (list3 = vVar.f105207a) == null)) {
                a2.b(list3);
            }
            List<ai> list4 = oVar.f104880h;
            if (list4 != null) {
                a2.c(list4);
            }
            m mVar = oVar.f104877e;
            if (!(mVar == null || (list2 = mVar.f104868a) == null)) {
                a2.a(list2);
            }
            k kVar = oVar.f104874b;
            if (kVar != null) {
                a2.a(kVar);
            }
            ae aeVar = oVar.f104876d;
            if (aeVar != null) {
                a2.a(aeVar);
            }
            com.ss.android.ugc.aweme.journey.n nVar = oVar.f104875c;
            if (nVar != null) {
                a2.a(nVar);
            }
            ad adVar = oVar.f104878f;
            if (adVar != null && (list = adVar.f104819a) != null) {
                a(list);
            }
        }
    }

    static {
        Covode.recordClassIndex(67243);
    }

    public final void a(NewUserJourneyFlowDependencies newUserJourneyFlowDependencies) {
        l.d(newUserJourneyFlowDependencies, "");
        a((Object) newUserJourneyFlowDependencies);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(NewUserJourneyFlowDependencies newUserJourneyFlowDependencies) {
        super(newUserJourneyFlowDependencies);
        l.d(newUserJourneyFlowDependencies, "");
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ ComponentDependencies $componentDependencies;
        final /* synthetic */ com.ss.android.ugc.aweme.journey.step.c $stepComponentProvider;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(67245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, com.ss.android.ugc.aweme.journey.step.c cVar, ComponentDependencies componentDependencies) {
            super(1);
            this.this$0 = aVar;
            this.$stepComponentProvider = cVar;
            this.$componentDependencies = componentDependencies;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            if (this.$stepComponentProvider.b(this.$componentDependencies) == null) {
                this.this$0.a((Boolean) null);
            } else {
                this.$stepComponentProvider.a().invoke(this.$componentDependencies);
                this.$stepComponentProvider.c(this.$componentDependencies);
            }
            return z.f158842a;
        }
    }

    private final void a(List<aa> list) {
        int i2 = this.f104855b;
        if (i2 == -1) {
            this.f104856d = list;
        } else if (i2 < list.size()) {
            int i3 = 0;
            int i4 = this.f104855b;
            if (i4 >= 0) {
                while (true) {
                    c a2 = c.a.a(list.get(i3).f104810a);
                    if (a2 != null && this.f104857e.get(i3) == a2) {
                        if (i3 == i4) {
                            break;
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
            this.f104856d = list;
        }
    }

    private final void a(aa aaVar) {
        c a2 = c.a.a(aaVar.f104810a);
        if (a2 == null) {
            a((Boolean) null);
        } else if (this.f104857e.contains(a2)) {
            a((Boolean) null);
        } else {
            this.f104857e.add(a2);
            com.ss.android.ugc.aweme.journey.step.c<?, ? super ComponentDependencies> a3 = this.f59393a.f104845a.a(a2.getId());
            ComponentDependencies a4 = this.f59393a.a();
            if (a3 == null) {
                a((Boolean) null);
            } else if (!a3.a((Object) a4)) {
                a((Boolean) null);
            } else {
                b bVar = new b(this, a3, a4);
                if (a3.a((Object) a4) == 0) {
                    bVar.invoke(z.f158842a);
                } else {
                    this.f59393a.c().a(a3.a((Object) a4), bVar);
                }
            }
        }
    }

    public final void a(Boolean bool) {
        if (bool != null && (!l.a((Object) this.f59393a.b().getValue(), (Object) true))) {
            this.f59393a.b().postValue(Boolean.valueOf(!bool.booleanValue()));
        }
        if (this.f104855b == Integer.MAX_VALUE) {
            this.f59393a.d().invoke();
            return;
        }
        a();
        int i2 = this.f104855b + 1;
        this.f104855b = i2;
        if (i2 >= this.f104856d.size()) {
            this.f59393a.d().invoke();
        } else {
            a(this.f104856d.get(this.f104855b));
        }
    }
}

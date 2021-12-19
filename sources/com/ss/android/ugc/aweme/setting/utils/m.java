package com.ss.android.ugc.aweme.setting.utils;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.dd.d;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.setting.ui.v;
import com.ss.android.ugc.aweme.setting.unit.a.c;
import h.f.b.l;
import h.z;
import java.util.HashSet;
import java.util.Iterator;

public final class m {
    static {
        Covode.recordClassIndex(80802);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ v $activity;
        final /* synthetic */ HashSet $unloginGoneView;

        static {
            Covode.recordClassIndex(80804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(v vVar, HashSet hashSet) {
            super(0);
            this.$activity = vVar;
            this.$unloginGoneView = hashSet;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            c.a(this.$activity, "settings_page", "click_setting", new f(this) {
                /* class com.ss.android.ugc.aweme.setting.utils.m.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f123045a;

                static {
                    Covode.recordClassIndex(80805);
                }

                {
                    this.f123045a = r1;
                }

                @Override // com.ss.android.ugc.aweme.base.component.f
                public final void b() {
                }

                @Override // com.ss.android.ugc.aweme.base.component.f
                public final void a() {
                    if (!this.f123045a.$unloginGoneView.isEmpty()) {
                        Iterator it = this.f123045a.$unloginGoneView.iterator();
                        while (it.hasNext()) {
                            ((com.ss.android.ugc.aweme.dc.a) it.next()).a(true);
                        }
                        this.f123045a.$unloginGoneView.clear();
                    }
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.dd.a());
                    com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.setting.utils.m.b.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f123046a;

                        static {
                            Covode.recordClassIndex(80806);
                        }

                        {
                            this.f123046a = r1;
                        }

                        public final void run() {
                            if (!this.f123046a.f123045a.$activity.isFinishing()) {
                                this.f123046a.f123045a.$activity.finish();
                            }
                        }
                    }, 500);
                }
            });
            d.a("settings_page", "click_setting");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f123044a;

        static {
            Covode.recordClassIndex(80803);
        }

        a(h.f.a.a aVar) {
            this.f123044a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f123044a.invoke();
        }
    }

    public static final void a(v vVar, HashSet<com.ss.android.ugc.aweme.dc.a<com.ss.android.ugc.aweme.be.a>> hashSet) {
        l.d(vVar, "");
        l.d(hashSet, "");
        b bVar = new b(vVar, hashSet);
        com.ss.android.ugc.aweme.setting.unit.a.c cVar = vVar.z;
        cVar.a(true);
        a aVar = new a(bVar);
        l.d(aVar, "");
        cVar.a(new c.a(cVar, aVar));
        com.ss.android.ugc.aweme.dc.a<com.ss.android.ugc.aweme.be.a>[] b2 = vVar.b();
        l.b(b2, "");
        for (com.ss.android.ugc.aweme.dc.a<com.ss.android.ugc.aweme.be.a> aVar2 : b2) {
            if (aVar2.l().b()) {
                hashSet.add(aVar2);
                aVar2.a(false);
            }
        }
    }
}

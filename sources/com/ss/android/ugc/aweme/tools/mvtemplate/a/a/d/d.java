package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d;

import android.app.Activity;
import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.utils.k;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class d extends com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a {

    /* renamed from: d  reason: collision with root package name */
    public String f140696d;

    static {
        Covode.recordClassIndex(91882);
    }

    public final void a() {
        f fVar = this.f140642c.f140683l;
        if (fVar == null) {
            l.b();
        }
        fVar.a(this.f140696d, new a(this));
    }

    public static final class a implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140697a;

        static {
            Covode.recordClassIndex(91883);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.f140697a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            l.d(effectChannelResponse2, "");
            this.f140697a.a(effectChannelResponse2);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            long a2 = this.f140697a.f140641b.a("fetch mv panel list", "failed.");
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar = this.f140697a.f140642c.f140677f;
            if (dVar != null) {
                dVar.f140733b = (int) a2;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar2 = this.f140697a.f140642c.f140677f;
            if (dVar2 != null) {
                dVar2.f140743l = exceptionResult.getMsg();
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar3 = this.f140697a.f140642c.f140677f;
            if (dVar3 != null) {
                dVar3.f140742k = 1;
            }
            c cVar = this.f140697a.f140642c.f140679h;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    public static final class b implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140698a;

        static {
            Covode.recordClassIndex(91884);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(d dVar) {
            this.f140698a = dVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f140698a.a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            l.d(effectChannelResponse2, "");
            if (!this.f140698a.a(effectChannelResponse2)) {
                this.f140698a.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e
    public final void a(Object obj) {
        Activity activity;
        WeakReference<Activity> weakReference;
        Activity activity2;
        Activity activity3;
        if (!this.f140642c.f140674c) {
            e eVar = this.f140640a;
            if (eVar != null) {
                eVar.a(obj);
                return;
            }
            return;
        }
        this.f140641b.f140703a = System.currentTimeMillis();
        com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar = this.f140642c.f140677f;
        if (dVar != null) {
            dVar.f140732a = 1;
        }
        WeakReference<Activity> weakReference2 = this.f140642c.f140678g;
        Application application = null;
        if (weakReference2 != null) {
            activity = weakReference2.get();
        } else {
            activity = null;
        }
        if (activity == null || !((weakReference = this.f140642c.f140678g) == null || (activity3 = weakReference.get()) == null || !activity3.isFinishing())) {
            long a2 = this.f140641b.a("fetch mv panel list", "failed.");
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar2 = this.f140642c.f140677f;
            if (dVar2 != null) {
                dVar2.f140733b = (int) a2;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar3 = this.f140642c.f140677f;
            if (dVar3 != null) {
                dVar3.f140743l = "activity is finish";
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar4 = this.f140642c.f140677f;
            if (dVar4 != null) {
                dVar4.f140742k = 1;
            }
            c cVar = this.f140642c.f140679h;
            if (cVar != null) {
                cVar.a();
                return;
            }
            return;
        }
        if (this.f140642c.f140683l == null) {
            WeakReference<Activity> weakReference3 = this.f140642c.f140678g;
            if (weakReference3 == null || weakReference3.get() == null) {
                long a3 = this.f140641b.a("fetch mv panel list", "failed.");
                com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar5 = this.f140642c.f140677f;
                if (dVar5 != null) {
                    dVar5.f140733b = (int) a3;
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar6 = this.f140642c.f140677f;
                if (dVar6 != null) {
                    dVar6.f140743l = "activity is null";
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar7 = this.f140642c.f140677f;
                if (dVar7 != null) {
                    dVar7.f140742k = 1;
                }
                c cVar2 = this.f140642c.f140679h;
                if (cVar2 != null) {
                    cVar2.a();
                }
            } else {
                com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar = this.f140642c;
                EffectService instance = EffectService.getInstance();
                WeakReference<Activity> weakReference4 = this.f140642c.f140678g;
                if (weakReference4 == null || (activity2 = weakReference4.get()) == null || (application = activity2.getApplication()) == null) {
                    l.b();
                }
                bVar.f140683l = instance.createMvEffectPlatform(application);
            }
        }
        f fVar = this.f140642c.f140683l;
        if (fVar != null) {
            fVar.a(this.f140696d, false, (IFetchEffectChannelListener) new b(this));
        }
    }

    public final boolean a(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null || k.a(effectChannelResponse.getAllCategoryEffects())) {
            long a2 = this.f140641b.a("fetch mv panel list", "failed.");
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar = this.f140642c.f140677f;
            if (dVar != null) {
                dVar.f140733b = (int) a2;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar2 = this.f140642c.f140677f;
            if (dVar2 != null) {
                dVar2.f140743l = "mv list is null";
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar3 = this.f140642c.f140677f;
            if (dVar3 != null) {
                dVar3.f140742k = 1;
            }
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
            MvThemeData mvThemeData = new MvThemeData();
            mvThemeData.a(effect);
            mvThemeData.f140619b = effectChannelResponse.getUrlPrefix();
            arrayList.add(mvThemeData);
        }
        if (arrayList.size() <= 0) {
            long a3 = this.f140641b.a("fetch mv panel list", "failed.");
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar4 = this.f140642c.f140677f;
            if (dVar4 != null) {
                dVar4.f140733b = (int) a3;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar5 = this.f140642c.f140677f;
            if (dVar5 != null) {
                dVar5.f140743l = "mv list is null";
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar6 = this.f140642c.f140677f;
            if (dVar6 != null) {
                dVar6.f140742k = 1;
            }
            c cVar = this.f140642c.f140679h;
            if (cVar != null) {
                cVar.a();
            }
            return false;
        }
        long a4 = this.f140641b.a("fetch mv panel list", "success");
        com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar7 = this.f140642c.f140677f;
        if (dVar7 != null) {
            dVar7.f140733b = (int) a4;
        }
        e eVar = this.f140640a;
        if (eVar != null) {
            eVar.a(arrayList);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar) {
        super(bVar);
        l.d(str, "");
        l.d(bVar, "");
        this.f140696d = str;
    }
}

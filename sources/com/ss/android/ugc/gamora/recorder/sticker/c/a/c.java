package com.ss.android.ugc.gamora.recorder.sticker.c.a;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.g;
import com.bytedance.als.k;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.l.a;
import com.ss.android.ugc.aweme.sticker.f.e;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c implements com.ss.android.ugc.gamora.recorder.sticker.c.c {

    /* renamed from: a  reason: collision with root package name */
    public final SafeHandler f148324a;

    /* renamed from: b  reason: collision with root package name */
    final h.f.a.a<a> f148325b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.appcompat.app.d f148326c;

    /* renamed from: d  reason: collision with root package name */
    public final j f148327d;

    /* renamed from: e  reason: collision with root package name */
    public final ShortVideoContext f148328e;

    /* renamed from: f  reason: collision with root package name */
    private final k<Effect> f148329f = new k<>();

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.l.a f148330g;

    static {
        Covode.recordClassIndex(97755);
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
    public final g<Effect> a() {
        return this.f148329f;
    }

    private final String e() {
        String str = this.f148325b.invoke().f148332b;
        if (str == null) {
            return "";
        }
        return str;
    }

    private final List<String> f() {
        return this.f148325b.invoke().f148334d;
    }

    public final String d() {
        String str = this.f148325b.invoke().f148331a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$c  reason: collision with other inner class name */
    public static final class C4004c implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f148338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f148339b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ StringBuilder f148340c;

        static {
            Covode.recordClassIndex(97758);
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$c$a */
        public static final class a implements IFetchEffectListListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4004c f148341a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ EffectListResponse f148342b;

            static {
                Covode.recordClassIndex(97759);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                l.d(exceptionResult, "");
            }

            /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$c$a$a  reason: collision with other inner class name */
            static final class RunnableC4005a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f148343a;

                static {
                    Covode.recordClassIndex(97760);
                }

                RunnableC4005a(a aVar) {
                    this.f148343a = aVar;
                }

                public final void run() {
                    this.f148343a.f148341a.f148338a.a(this.f148343a.f148342b, this.f148343a.f148341a.f148340c);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(List<Effect> list) {
                l.d(list, "");
                if (!this.f148341a.f148338a.f148325b.invoke().f148335e) {
                    this.f148341a.f148338a.f148324a.postDelayed(new RunnableC4005a(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                } else {
                    this.f148341a.f148338a.a(this.f148342b, this.f148341a.f148340c);
                }
            }

            a(C4004c cVar, EffectListResponse effectListResponse) {
                this.f148341a = cVar;
                this.f148342b = effectListResponse;
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            Exception exception = exceptionResult.getException();
            if (exception != null) {
                exception.printStackTrace();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            String sb;
            String str;
            EffectListResponse effectListResponse2 = effectListResponse;
            l.d(effectListResponse2, "");
            if (this.f148338a.d().equals("draft")) {
                ShortVideoContext shortVideoContext = this.f148338a.f148328e;
                List<Effect> data = effectListResponse2.getData();
                if (com.ss.android.ugc.tools.utils.k.a(data)) {
                    sb = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (Effect effect : data) {
                        String effectId = effect.getEffectId();
                        if (!TextUtils.isEmpty(effectId)) {
                            if (sb2.length() == 0) {
                                str = "";
                            } else {
                                str = ",";
                            }
                            sb2.append(str).append(effectId);
                        }
                    }
                    sb = sb2.toString();
                    if (sb == null) {
                        sb = "";
                    }
                }
                shortVideoContext.u = sb;
            }
            j jVar = this.f148338a.f148327d;
            String effectId2 = ((EffectTemplate) n.g((List) effectListResponse2.getData())).getEffectId();
            Map<String, String> map = this.f148339b;
            a aVar = new a(this, effectListResponse2);
            l.d(jVar, "");
            l.d(effectId2, "");
            jVar.t().a(n.a(effectId2), map, aVar);
        }

        C4004c(c cVar, Map map, StringBuilder sb) {
            this.f148338a = cVar;
            this.f148339b = map;
            this.f148340c = sb;
        }
    }

    private final Map<String, String> g() {
        HashMap hashMap = new HashMap();
        hashMap.put("scene", d());
        String e2 = e();
        if (!TextUtils.isEmpty(e2)) {
            hashMap.put("grade_key", e2);
        }
        return hashMap;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
    public final String c() {
        List<String> f2 = f();
        if (f2 == null || f2.isEmpty()) {
            return "";
        }
        Iterator<String> it = f2.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
    public final void b() {
        List<String> f2 = f();
        if (!(f2 == null || f2.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            sb.append(f2.get(0));
            int size = f2.size();
            for (int i2 = 1; i2 < size; i2++) {
                sb.append(",").append(f2.get(i2));
            }
            Map<String, String> g2 = g();
            e.a(this.f148327d, f2, g2, new C4004c(this, g2, sb));
        }
    }

    public static final class d implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f148344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f148345b;

        static {
            Covode.recordClassIndex(97761);
        }

        public static final class a implements c.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f148346a;

            static {
                Covode.recordClassIndex(97762);
            }

            @Override // com.ss.android.ugc.aweme.sticker.g.c.a
            public final void a(Effect effect, int i2) {
            }

            @Override // com.ss.android.ugc.aweme.sticker.g.c.a
            public final void b(Effect effect) {
            }

            @Override // com.ss.android.ugc.aweme.sticker.g.c.a
            public final void c(Effect effect) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(d dVar) {
                this.f148346a = dVar;
            }

            @Override // com.ss.android.ugc.aweme.sticker.g.c.a
            public final void a(Effect effect, ExceptionResult exceptionResult) {
                Exception exception;
                if (!(exceptionResult == null || (exception = exceptionResult.getException()) == null)) {
                    exception.printStackTrace();
                }
                com.ss.android.ugc.tools.view.widget.d.b(this.f148346a.f148344a.f148326c, R.string.g72).b();
                com.bytedance.creativex.recorder.sticker.a.c cVar = (com.bytedance.creativex.recorder.sticker.a.c) ApiCenter.a.a(this.f148346a.f148344a.f148326c).b(com.bytedance.creativex.recorder.sticker.a.c.class);
                if (cVar != null) {
                    cVar.a(true);
                }
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            int i2;
            l.d(exceptionResult, "");
            switch (exceptionResult.getErrorCode()) {
                case 2002:
                case 2004:
                    i2 = R.string.bm4;
                    break;
                case 2003:
                    i2 = R.string.b6w;
                    break;
                case 2005:
                default:
                    i2 = R.string.br1;
                    break;
                case 2006:
                    i2 = R.string.h5w;
                    break;
            }
            com.ss.android.ugc.tools.view.widget.d.b(this.f148344a.f148326c, i2).b();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            a aVar;
            EffectListResponse effectListResponse2 = effectListResponse;
            l.d(effectListResponse2, "");
            this.f148344a.f148327d.C().a(effectListResponse2.getUrlPrefix());
            List<Effect> data = effectListResponse2.getData();
            if (!h.a(data)) {
                Effect effect = data.get(0);
                j jVar = this.f148344a.f148327d;
                boolean z = this.f148344a.f148328e.U;
                if (com.ss.android.ugc.aweme.sticker.p.g.a(effect)) {
                    aVar = null;
                } else {
                    aVar = new a(this);
                }
                e.a(jVar, data, z, true, aVar, 0, null, 992);
                this.f148344a.b(effect);
            }
        }

        d(c cVar, Map map) {
            this.f148344a = cVar;
            this.f148345b = map;
        }
    }

    public static final class b implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f148336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f148337b;

        static {
            Covode.recordClassIndex(97757);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f148337b.invoke(null);
            Exception exception = exceptionResult.getException();
            if (exception != null) {
                exception.printStackTrace();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            EffectListResponse effectListResponse2 = effectListResponse;
            l.d(effectListResponse2, "");
            this.f148336a.f148327d.C().a(effectListResponse2.getUrlPrefix());
            List g2 = n.g((Collection) effectListResponse2.getData());
            if (!g2.isEmpty() && !TextUtils.equals(this.f148336a.d(), "qrcode") && com.ss.android.ugc.aweme.shortvideo.sticker.c.c((Effect) n.g(g2)) && !com.ss.android.ugc.aweme.sticker.types.lock.b.a((Effect) n.g(g2))) {
                g2.remove(0);
            }
            if (g2.isEmpty()) {
                this.f148337b.invoke(null);
                return;
            }
            if (h.b(effectListResponse2.getCollection())) {
                e.a(this.f148336a.f148327d, effectListResponse2.getCollection());
            }
            Iterator it = g2.iterator();
            HashSet hashSet = new HashSet();
            while (it.hasNext()) {
                String parentId = ((EffectTemplate) it.next()).getParentId();
                if (!TextUtils.isEmpty(parentId) && !hashSet.add(parentId)) {
                    it.remove();
                }
            }
            e.a(this.f148336a.f148327d, g2, true, false, null, 0, null, 1016);
            Effect effect = (Effect) n.h(g2);
            if (effect != null) {
                this.f148336a.b(effect);
            }
            this.f148337b.invoke(n.h(g2));
        }

        b(c cVar, h.f.a.b bVar) {
            this.f148336a = cVar;
            this.f148337b = bVar;
        }
    }

    public final void b(Effect effect) {
        if (com.ss.android.ugc.aweme.shortvideo.sticker.c.c(effect)) {
            com.ss.android.ugc.aweme.sticker.types.lock.c.a().a(effect);
            this.f148329f.a(effect);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
    public final void a(String str) {
        if (str != null && str.length() != 0) {
            ArrayList<String> a2 = com.ss.android.ugc.aweme.sticker.p.g.a(str);
            l.b(a2, "");
            Map<String, String> g2 = g();
            j jVar = this.f148327d;
            com.ss.android.ugc.aweme.shortvideo.l.a aVar = this.f148330g;
            d dVar = new d(this, g2);
            l.d(dVar, "");
            e.a(jVar, a2, g2, new a.C3356a(aVar, dVar));
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
    public final boolean b(String str) {
        ArrayList<String> arrayList;
        if (str == null || str.length() == 0) {
            arrayList = null;
        } else {
            arrayList = com.ss.android.ugc.aweme.sticker.p.g.a(str);
        }
        ArrayList arrayList2 = new ArrayList();
        List<String> f2 = f();
        if (f2 != null) {
            arrayList2.addAll(f2);
        }
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
    public final boolean a(Effect effect) {
        l.d(effect, "");
        if (TextUtils.equals(d(), "qrcode") || !com.ss.android.ugc.aweme.shortvideo.sticker.c.c(effect) || com.ss.android.ugc.aweme.sticker.types.lock.b.a(effect)) {
            return true;
        }
        return false;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
    public final void a(String str, h.f.a.b<? super Effect, z> bVar) {
        boolean z;
        l.d(bVar, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<String> a2 = !z ? com.ss.android.ugc.aweme.sticker.p.g.a(str) : null;
        ArrayList arrayList = new ArrayList();
        List<String> f2 = f();
        if (f2 != null) {
            arrayList.addAll(f2);
        }
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        if (arrayList.isEmpty()) {
            bVar.invoke(null);
            return;
        }
        arrayList.get(0);
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            arrayList.get(i2);
        }
        e.a(this.f148327d, arrayList, g(), new b(this, bVar));
    }

    public final void a(EffectListResponse effectListResponse, StringBuilder sb) {
        String unzipPath;
        com.bytedance.creativex.recorder.sticker.a.c cVar;
        this.f148327d.C().a(effectListResponse.getUrlPrefix());
        Effect effect = this.f148325b.invoke().f148333c;
        List<Effect> g2 = n.g((Collection) effectListResponse.getData());
        if (!g2.isEmpty() && !TextUtils.equals(d(), "qrcode") && com.ss.android.ugc.aweme.shortvideo.sticker.c.c((Effect) n.g((List) g2)) && !com.ss.android.ugc.aweme.sticker.types.lock.b.a((Effect) n.g((List) g2))) {
            g2.remove(0);
        }
        if (g2.isEmpty()) {
            effectListResponse.setData(g2);
            return;
        }
        if (h.b(effectListResponse.getCollection())) {
            e.a(this.f148327d, effectListResponse.getCollection());
        }
        Iterator<Effect> it = g2.iterator();
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            String parentId = it.next().getParentId();
            if (!TextUtils.isEmpty(parentId) && !hashSet.add(parentId)) {
                it.remove();
            }
        }
        String sb2 = sb.toString();
        String str = "";
        l.b(sb2, str);
        if (!TextUtils.isEmpty(a(this.f148326c.getIntent(), "event_shoot_event_track"))) {
            r.a("auto_prop_show", new com.ss.android.ugc.tools.f.b().a("prop_id", sb2).a("creation_id", this.f148328e.q).a("shoot_way", "direct_shoot").f149193a);
        } else {
            r.a("reuse_prop_release", new com.ss.android.ugc.tools.f.b().a("prop_id", sb2).f149193a);
        }
        Effect effect2 = (Effect) n.g((List) g2);
        if (d().equals("draft")) {
            effect = effect2;
        }
        boolean z = true;
        if (AVExternalServiceImpl.a().configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && this.f148328e.f124757b.b() && com.ss.android.ugc.aweme.port.in.g.a().A().b()) {
            this.f148327d.t().c().g().a(str, g2);
            if (!g2.isEmpty()) {
                effect = (Effect) n.g((List) g2);
                this.f148328e.X = effect.getEffectId();
                FaceStickerBean.sCurPropSource = "duet";
                if (com.ss.android.ugc.aweme.sticker.p.g.A(effect) && (cVar = (com.bytedance.creativex.recorder.sticker.a.c) ApiCenter.a.a(this.f148326c).b(com.bytedance.creativex.recorder.sticker.a.c.class)) != null) {
                    cVar.a(true);
                }
            } else {
                return;
            }
        }
        Boolean bool = this.f148328e.W;
        l.b(bool, str);
        if (bool.booleanValue()) {
            this.f148327d.f(true);
            FaceStickerBean.sCurPropSource = "qa_prop";
        }
        j jVar = this.f148327d;
        if (effect == null) {
            z = false;
        }
        e.a(jVar, g2, true, z, null, 0, null, 1016);
        effectListResponse.setData(g2);
        if (effect2 == null) {
            l.b();
        }
        if (!(effect == null || (unzipPath = effect.getUnzipPath()) == null)) {
            str = unzipPath;
        }
        effect2.setUnzipPath(str);
        b(effect2);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f148331a;

        /* renamed from: b  reason: collision with root package name */
        public final String f148332b;

        /* renamed from: c  reason: collision with root package name */
        public final Effect f148333c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f148334d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f148335e;

        static {
            Covode.recordClassIndex(97756);
        }

        public a(String str, String str2, Effect effect, List<String> list, boolean z) {
            this.f148331a = str;
            this.f148332b = str2;
            this.f148333c = effect;
            this.f148334d = list;
            this.f148335e = z;
        }
    }

    public c(h.f.a.a<a> aVar, androidx.appcompat.app.d dVar, j jVar, ShortVideoContext shortVideoContext, com.ss.android.ugc.aweme.shortvideo.l.a aVar2) {
        l.d(aVar, "");
        l.d(dVar, "");
        l.d(jVar, "");
        l.d(shortVideoContext, "");
        l.d(aVar2, "");
        this.f148325b = aVar;
        this.f148326c = dVar;
        this.f148327d = jVar;
        this.f148328e = shortVideoContext;
        this.f148330g = aVar2;
        this.f148324a = new SafeHandler(dVar);
    }
}

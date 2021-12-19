package com.bytedance.android.live.effect.c;

import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.api.f;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.e;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.j.am;
import com.bytedance.android.livesdk.j.cv;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.d.g;
import f.a.t;
import h.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    public final List<FilterModel> f9728a;

    /* renamed from: b  reason: collision with root package name */
    EffectManager f9729b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Double> f9730c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f.a> f9731d;

    /* renamed from: e  reason: collision with root package name */
    private final List<f.b> f9732e;

    /* renamed from: f  reason: collision with root package name */
    private int f9733f;

    @Override // com.bytedance.android.live.effect.api.f
    public final void b() {
        this.f9733f = -1;
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final List<FilterModel> a() {
        return this.f9728a;
    }

    class a implements j.c<FilterModel> {

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<DataChannel> f9739b;

        static {
            Covode.recordClassIndex(4958);
        }

        @Override // com.bytedance.android.live.effect.api.a.j.c
        public final void a() {
            j.this.a(false);
        }

        @Override // com.bytedance.android.live.effect.api.a.j.c
        public final void a(List<e<FilterModel>> list) {
            if (!list.isEmpty()) {
                List<T> list2 = list.get(0).f9890b;
                j.this.f9728a.clear();
                j.this.f9728a.addAll(list2);
                j jVar = j.this;
                t a2 = t.b((Iterable) list2).a(k.f9741a).a((g) new l(jVar), false).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
                f.a.d.f<? super Throwable> fVar = f.a.e.b.a.f157191d;
                a2.a(fVar, fVar, new m(jVar));
                DataChannel dataChannel = this.f9739b.get();
                if (dataChannel != null) {
                    dataChannel.b(com.bytedance.android.live.effect.e.class, list2);
                }
            }
            j.this.a(true);
        }

        private a(DataChannel dataChannel) {
            this.f9739b = new WeakReference<>(dataChannel);
        }

        /* synthetic */ a(j jVar, DataChannel dataChannel, byte b2) {
            this(dataChannel);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j f9740a = new j((byte) 0);

        static {
            Covode.recordClassIndex(4959);
        }
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(4955);
        if (com.bytedance.android.livesdk.ap.a.O.a().intValue() < 0) {
            c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.O, (Object) 1);
        }
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final boolean c() {
        List<FilterModel> list = this.f9728a;
        if (list == null) {
            return false;
        }
        for (FilterModel filterModel : list) {
            if (filterModel.isNew()) {
                return true;
            }
        }
        return false;
    }

    private j() {
        this.f9730c = new HashMap();
        this.f9731d = new ArrayList();
        this.f9733f = -1;
        this.f9729b = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getEffectManager();
        this.f9732e = new ArrayList();
        this.f9728a = new ArrayList();
        this.f9730c = com.bytedance.android.livesdk.ap.a.cT.a();
    }

    /* synthetic */ j(byte b2) {
        this();
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final void a(f.a aVar) {
        this.f9731d.add(aVar);
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final void b(int i2) {
        this.f9733f = i2;
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final void a(f.b bVar) {
        this.f9732e.add(bVar);
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final void b(f.a aVar) {
        this.f9731d.remove(aVar);
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final float a(int i2) {
        FilterModel filterModel;
        if (i2 < this.f9728a.size()) {
            filterModel = this.f9728a.get(i2);
        } else {
            filterModel = null;
        }
        return d(filterModel);
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final void b(f.b bVar) {
        this.f9732e.remove(bVar);
    }

    public final float a(String str) {
        FilterModel filterModel;
        Iterator<FilterModel> it = this.f9728a.iterator();
        while (true) {
            if (!it.hasNext()) {
                filterModel = null;
                break;
            }
            filterModel = it.next();
            if (TextUtils.equals(str, filterModel.getFilterId())) {
                break;
            }
        }
        return d(filterModel);
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final boolean b(FilterModel filterModel) {
        if (filterModel == null) {
            return false;
        }
        if (filterModel.getFilterType() != 2) {
            return true;
        }
        if (!DownloadableModelSupport.isInitialized() || filterModel.getEffect() == null) {
            EffectManager effectManager = this.f9729b;
            if (effectManager == null || !effectManager.isEffectDownloaded(filterModel.getEffect())) {
                return false;
            }
            return true;
        } else if (this.f9729b == null || !DownloadableModelSupport.getInstance().isEffectReady(this.f9729b, filterModel.getEffect())) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final boolean c(FilterModel filterModel) {
        EffectManager effectManager;
        if (filterModel.getFilterType() == 2 && (effectManager = this.f9729b) != null && effectManager.isEffectDownloading(filterModel.getEffect())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final float d(FilterModel filterModel) {
        if (filterModel == null) {
            return 1.0f;
        }
        if (this.f9730c.containsKey(filterModel.getFilterId())) {
            return this.f9730c.get(filterModel.getFilterId()).floatValue();
        }
        FilterModel.a aVar = filterModel.filterConfig;
        return com.bytedance.android.live.effect.b.e.a(aVar.f9871a, aVar.f9872b, aVar.f9873c);
    }

    @Override // com.bytedance.android.live.effect.api.f
    public final void a(FilterModel filterModel) {
        if (filterModel.getFilterType() == 2) {
            Effect effect = filterModel.getEffect();
            this.f9728a.indexOf(filterModel);
            if (effect != null) {
                y.e();
                if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                    com.ss.android.ugc.aweme.lancet.j.f107226e = d();
                }
                if (com.ss.android.ugc.aweme.lancet.j.f107226e) {
                    this.f9729b.fetchEffect(effect, new IFetchEffectListener() {
                        /* class com.bytedance.android.live.effect.c.j.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(4957);
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onStart(Effect effect) {
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
                        }
                    });
                }
            }
        }
    }

    public final void a(DataChannel dataChannel) {
        com.bytedance.android.live.effect.g.a(new a(this, dataChannel, (byte) 0));
    }

    public final void a(boolean z) {
        if (!h.a(this.f9732e)) {
            for (f.b bVar : this.f9732e) {
                bVar.a(z);
            }
        }
    }

    public final void a(String str, String str2) {
        EffectManager effectManager = this.f9729b;
        if (effectManager != null) {
            effectManager.updateTag(str, str2, null);
        }
    }

    public final void a(DataChannel dataChannel, int i2, boolean z, boolean z2) {
        int i3 = i2;
        if (!this.f9728a.isEmpty()) {
            if (i3 < 0 || i3 >= this.f9728a.size()) {
                i3 = 0;
            }
            if (this.f9733f != i3) {
                this.f9733f = i3;
                String filterId = this.f9728a.get(i3).getFilterId();
                long currentTimeMillis = System.currentTimeMillis();
                c.a(com.bytedance.android.livesdk.ap.a.O, Integer.valueOf(i3));
                for (f.a aVar : this.f9731d) {
                    aVar.a(i3, z, z2);
                }
                c.a(com.bytedance.android.livesdk.ap.a.cS, Long.valueOf(System.currentTimeMillis()));
                if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
                    com.bytedance.android.live.effect.b.f9657a.b(dataChannel, z, filterId, z2, i3 + 1);
                } else if (z) {
                    if (p.c()) {
                        DataChannelGlobal.f34575d.a(am.class, filterId);
                        if (TextUtils.isEmpty((String) DataChannelGlobal.f34575d.b(am.class))) {
                            return;
                        }
                    }
                    int i4 = i3 + 1;
                    com.bytedance.android.live.effect.b.f9657a.a(dataChannel, true, filterId, true, i4);
                    com.bytedance.android.live.effect.b.f9657a.b(dataChannel, true, filterId, z2, i4);
                    DataChannelGlobal.f34575d.a(cv.class, new u(filterId, Float.valueOf(a(filterId)), Long.valueOf(currentTimeMillis)));
                    DataChannelGlobal.f34575d.a(am.class, "");
                }
            }
        }
    }
}

package com.bytedance.android.live.effect.d;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.effect.api.a.i;
import com.bytedance.android.live.effect.b.c;
import com.bytedance.android.live.effect.e.e;
import com.bytedance.android.livesdk.j.dw;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    e f9775a;

    /* renamed from: b  reason: collision with root package name */
    String f9776b;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.android.livesdkapi.depend.model.a f9777c;

    /* renamed from: d  reason: collision with root package name */
    final Map<String, com.bytedance.android.livesdkapi.depend.model.a> f9778d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    final List<String> f9779e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    final List<com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>> f9780f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    String f9781g = "";

    /* renamed from: h  reason: collision with root package name */
    String f9782h = "";

    /* renamed from: i  reason: collision with root package name */
    final i f9783i = c.a.a();

    /* renamed from: j  reason: collision with root package name */
    final Fragment f9784j;

    /* renamed from: k  reason: collision with root package name */
    final b f9785k;

    /* renamed from: l  reason: collision with root package name */
    public final AdjustPercentBar f9786l;

    /* renamed from: m  reason: collision with root package name */
    final StateLayout f9787m;
    private final DataChannel n;
    private final ViewPager o;

    static {
        Covode.recordClassIndex(4985);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(4988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            p.a(this.this$0.f9786l);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        com.bytedance.android.livesdkapi.depend.model.a aVar = this.f9777c;
        if (aVar != null) {
            i iVar = this.f9783i;
            String str = com.bytedance.android.live.effect.api.a.f9639d;
            l.b(str, "");
            iVar.b(str, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int i2;
        h.p pVar;
        Integer num;
        if (!TextUtils.isEmpty(this.f9781g)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(dw.class);
            if (concurrentHashMap == null || (pVar = (h.p) concurrentHashMap.get(this.f9781g)) == null || (num = (Integer) pVar.getFirst()) == null) {
                i2 = -1;
            } else {
                i2 = num.intValue();
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(dw.class);
            if (concurrentHashMap2 != null) {
                String str = this.f9781g;
                if (str == null) {
                    l.b();
                }
                Integer valueOf = Integer.valueOf(i2);
                String str2 = this.f9782h;
                if (str2 == null) {
                    str2 = "";
                }
                concurrentHashMap2.put(str, new h.p(valueOf, str2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        if (aVar == null || aVar.a() == null) {
            p.a(this.f9786l);
            return;
        }
        p.b(this.f9786l);
        d(aVar);
        this.f9783i.a(com.bytedance.android.live.effect.api.a.f9639d, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float c(com.bytedance.android.livesdkapi.depend.model.a r4) {
        /*
            r3 = this;
            com.bytedance.android.live.effect.api.a.i r2 = r3.f9783i
            java.lang.String r1 = r4.f22997c
            com.bytedance.android.livesdkapi.depend.model.a$b r0 = r4.a()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.f23010c
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            java.lang.Float r0 = r2.a(r1, r0)
            if (r0 != 0) goto L_0x0033
            com.bytedance.android.livesdkapi.depend.model.a$b r0 = r4.a()
            if (r0 == 0) goto L_0x0038
            int r0 = r0.f23009b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0027
        L_0x0024:
            h.f.b.l.b()
        L_0x0027:
            int r0 = r0.intValue()
            float r0 = com.bytedance.android.live.effect.b.e.a(r4, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0033:
            float r0 = r0.floatValue()
            return r0
        L_0x0038:
            r0 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.d.g.c(com.bytedance.android.livesdkapi.depend.model.a):float");
    }

    private final void d(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        int i2;
        int i3;
        this.f9786l.setPercent(com.bytedance.android.live.effect.b.e.a(aVar, c(aVar)));
        a.b a2 = aVar.a();
        if (a2 == null || !a2.f23013f) {
            AdjustPercentBar adjustPercentBar = this.f9786l;
            a.b a3 = aVar.a();
            if (a3 != null) {
                i2 = a3.f23009b;
            } else {
                i2 = 0;
            }
            adjustPercentBar.a(100, 0, i2, true);
            return;
        }
        AdjustPercentBar adjustPercentBar2 = this.f9786l;
        a.b a4 = aVar.a();
        if (a4 != null) {
            i3 = a4.f23009b;
        } else {
            i3 = 0;
        }
        adjustPercentBar2.a(50, -50, i3, false);
    }

    /* access modifiers changed from: package-private */
    public final void b(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        Boolean bool;
        this.f9777c = aVar;
        if (aVar != null) {
            bool = Boolean.valueOf(aVar.b());
        } else {
            bool = null;
        }
        if (p.b(bool)) {
            this.f9778d.put(this.f9776b, aVar);
        }
    }

    public g(DataChannel dataChannel, Fragment fragment, ViewPager viewPager, b bVar, AdjustPercentBar adjustPercentBar, StateLayout stateLayout) {
        l.d(fragment, "");
        l.d(viewPager, "");
        l.d(adjustPercentBar, "");
        l.d(stateLayout, "");
        this.n = dataChannel;
        this.f9784j = fragment;
        this.o = viewPager;
        this.f9785k = bVar;
        this.f9786l = adjustPercentBar;
        this.f9787m = stateLayout;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) fragment, com.bytedance.android.live.effect.m.class, (b) new b<com.bytedance.android.livesdkapi.depend.model.a, z>(this) {
                /* class com.bytedance.android.live.effect.d.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(4986);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.android.livesdkapi.depend.model.a aVar) {
                    ConcurrentHashMap concurrentHashMap;
                    com.bytedance.android.livesdkapi.depend.model.a aVar2 = aVar;
                    l.d(aVar2, "");
                    g gVar = this.this$0;
                    String str = null;
                    com.bytedance.android.livesdkapi.depend.model.a aVar3 = null;
                    Boolean bool = null;
                    if (com.bytedance.android.live.effect.f.b.a(aVar2)) {
                        if (!TextUtils.isEmpty(gVar.f9782h)) {
                            gVar.a();
                        }
                        gVar.f9781g = aVar2.f22999e;
                        gVar.f9782h = "";
                        if (gVar.f9775a == null) {
                            String str2 = aVar2.B;
                            if (str2 == null) {
                                str2 = "";
                            }
                            String str3 = aVar2.f22997c;
                            l.d(str2, "");
                            l.d(str3, "");
                            e eVar = new e();
                            Bundle bundle = new Bundle();
                            bundle.putString("live_effect_panel_name", str2);
                            bundle.putString("live_effect_panel_info", str3);
                            eVar.setArguments(bundle);
                            a aVar4 = new a(gVar);
                            l.d(aVar4, "");
                            eVar.f9820f = aVar4;
                            gVar.f9775a = eVar;
                        }
                        n a2 = gVar.f9784j.getChildFragmentManager().a();
                        e eVar2 = gVar.f9775a;
                        if (eVar2 == null) {
                            l.b();
                        }
                        String str4 = aVar2.B;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = aVar2.f22997c;
                        l.d(str4, "");
                        l.d(str5, "");
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("live_effect_panel_name", str4);
                        bundle2.putString("live_effect_panel_info", str5);
                        eVar2.setArguments(bundle2);
                        a2.b(R.id.ede, eVar2).d();
                        gVar.b(aVar2);
                        e eVar3 = gVar.f9775a;
                        if (eVar3 != null) {
                            aVar3 = eVar3.f9815a;
                        }
                        gVar.b(aVar3);
                        com.bytedance.android.livesdkapi.depend.model.a aVar5 = gVar.f9777c;
                        if (aVar5 == null) {
                            p.a(gVar.f9786l);
                        } else if (aVar5.C) {
                            p.a(gVar.f9786l);
                        } else {
                            p.b(gVar.f9786l);
                            gVar.a(aVar5);
                        }
                    } else if (aVar2.C) {
                        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(dw.class);
                        if (concurrentHashMap2 != null) {
                            for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                                if (l.a(((h.p) entry.getValue()).getSecond(), (Object) gVar.f9782h) && (concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(dw.class)) != null) {
                                    concurrentHashMap.remove(entry.getKey());
                                }
                            }
                        }
                        gVar.f9782h = "";
                        p.a(gVar.f9786l);
                        com.bytedance.android.livesdkapi.depend.model.a aVar6 = gVar.f9777c;
                        if (aVar6 != null) {
                            bool = Boolean.valueOf(aVar6.D);
                        }
                        if (p.a(bool)) {
                            gVar.b();
                        }
                        gVar.b(aVar2);
                    } else {
                        if (aVar2.D) {
                            com.bytedance.android.livesdkapi.depend.model.a aVar7 = gVar.f9777c;
                            if (p.a(aVar7 != null ? Boolean.valueOf(aVar7.D) : null)) {
                                String str6 = aVar2.B;
                                com.bytedance.android.livesdkapi.depend.model.a aVar8 = gVar.f9777c;
                                if (aVar8 != null) {
                                    str = aVar8.B;
                                }
                                if (l.a((Object) str6, (Object) str)) {
                                    gVar.f9782h = aVar2.f22999e;
                                    gVar.a();
                                    gVar.b();
                                    gVar.b(aVar2);
                                    gVar.a(aVar2);
                                }
                            }
                        }
                        gVar.f9782h = aVar2.f22999e;
                        gVar.a();
                        gVar.b(aVar2);
                        gVar.a(aVar2);
                    }
                    return z.f158842a;
                }
            }).b((androidx.lifecycle.m) fragment, com.bytedance.android.live.effect.a.class, (b) new b<List<? extends com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>>, z>(this) {
                /* class com.bytedance.android.live.effect.d.g.AnonymousClass2 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(4987);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: com.bytedance.android.live.effect.d.b */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(List<? extends com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>> list) {
                    com.bytedance.android.livesdkapi.depend.model.a aVar;
                    List<T> list2;
                    List<? extends com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>> list3 = list;
                    l.d(list3, "");
                    g gVar = this.this$0;
                    gVar.f9787m.a("CONTENT");
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().f9889a);
                    }
                    ArrayList arrayList2 = arrayList;
                    if (!l.a(gVar.f9779e, arrayList2)) {
                        com.bytedance.android.live.effect.model.e eVar = (com.bytedance.android.live.effect.model.e) h.a.n.h((List) list3);
                        String str = null;
                        if (eVar == null || (list2 = eVar.f9890b) == null || (aVar = (com.bytedance.android.livesdkapi.depend.model.a) h.a.n.h((List) list2)) == null) {
                            aVar = null;
                        } else {
                            gVar.a(aVar);
                        }
                        com.bytedance.android.live.effect.model.e eVar2 = (com.bytedance.android.live.effect.model.e) h.a.n.h((List) list3);
                        if (eVar2 != null) {
                            str = eVar2.f9889a;
                        }
                        gVar.f9776b = str;
                        gVar.b(aVar);
                        b bVar = gVar.f9785k;
                        if (bVar != 0) {
                            bVar.a((List<com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>>) list3);
                        }
                        gVar.f9779e.addAll(arrayList2);
                    }
                    gVar.f9780f.clear();
                    gVar.f9780f.addAll(list3);
                    return z.f158842a;
                }
            });
        }
    }
}

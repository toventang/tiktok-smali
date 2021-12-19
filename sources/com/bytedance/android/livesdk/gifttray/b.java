package com.bytedance.android.livesdk.gifttray;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.gift.n;
import com.bytedance.android.livesdk.ba;
import com.bytedance.android.livesdk.bb;
import com.bytedance.android.livesdk.bc;
import com.bytedance.android.livesdk.gifttray.d.d;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.model.aa;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.service.c.i.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f18008a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18009b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.gifttray.c.a f18010c;

    /* renamed from: d  reason: collision with root package name */
    public DataChannel f18011d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.livesdk.gifttray.a.a f18012e;

    /* renamed from: f  reason: collision with root package name */
    public ViewGroup f18013f;

    /* renamed from: g  reason: collision with root package name */
    public a f18014g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18015h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18016i;

    /* renamed from: j  reason: collision with root package name */
    public final int f18017j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.android.livesdk.service.animation.c f18018k = new a(this);

    static {
        Covode.recordClassIndex(9997);
    }

    public static final class a implements com.bytedance.android.livesdk.service.animation.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18019a;

        static {
            Covode.recordClassIndex(9998);
        }

        @Override // com.bytedance.android.livesdk.service.animation.c
        public final void b() {
            this.f18019a.f18009b = false;
        }

        @Override // com.bytedance.android.livesdk.service.animation.c
        public final void a() {
            this.f18019a.f18009b = true;
            com.bytedance.android.livesdk.gifttray.a.a aVar = this.f18019a.f18012e;
            if (aVar == null || aVar.a() <= 0) {
                a aVar2 = this.f18019a.f18014g;
                if (aVar2 != null) {
                    aVar2.a(this.f18019a.f18017j);
                    return;
                }
                return;
            }
            if (d.a(this.f18019a.f18012e)) {
                b.a.C0467a.f21435a.a();
                com.bytedance.android.livesdk.gifttray.a.a aVar3 = this.f18019a.f18012e;
                if (aVar3 != null) {
                    aVar3.b();
                }
            } else {
                b.a.C0467a.f21435a.a();
                com.bytedance.android.livesdk.gifttray.a.a aVar4 = this.f18019a.f18012e;
                if (aVar4 != null) {
                    aVar4.c();
                }
            }
            com.bytedance.android.livesdk.gifttray.c.a aVar5 = this.f18019a.f18010c;
            if (aVar5 != null) {
                aVar5.a();
            }
        }

        @Override // com.bytedance.android.livesdk.service.animation.c
        public final void c() {
            DataChannel dataChannel;
            MethodCollector.i(9362);
            com.bytedance.android.livesdk.gifttray.c.a aVar = this.f18019a.f18010c;
            if (aVar != null) {
                b.a(this.f18019a).removeView(aVar);
            }
            com.bytedance.android.livesdk.gifttray.c.a aVar2 = this.f18019a.f18010c;
            if (aVar2 != null) {
                aVar2.b();
            }
            this.f18019a.f18010c = null;
            if (b.a(this.f18019a).getChildCount() == 0 && (dataChannel = this.f18019a.f18011d) != null) {
                dataChannel.c(n.class, true);
            }
            this.f18019a.f18012e = null;
            this.f18019a.f18009b = false;
            this.f18019a.f18008a = true;
            this.f18019a.f18015h = false;
            this.f18019a.f18016i = false;
            a aVar3 = this.f18019a.f18014g;
            if (aVar3 != null) {
                aVar3.a();
                MethodCollector.o(9362);
                return;
            }
            MethodCollector.o(9362);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f18019a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        ViewGroup viewGroup = this.f18013f;
        if (viewGroup == null) {
            l.a("mContainerView");
        }
        if (!(viewGroup instanceof LiveGiftTrayQueueView)) {
            return -1;
        }
        ViewGroup viewGroup2 = this.f18013f;
        if (viewGroup2 == null) {
            l.a("mContainerView");
        }
        Objects.requireNonNull(viewGroup2, "null cannot be cast to non-null type com.bytedance.android.livesdk.gifttray.LiveGiftTrayQueueView");
        return ((LiveGiftTrayQueueView) viewGroup2).getQueueSize();
    }

    public final void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        this.f18013f = viewGroup;
    }

    public b(int i2) {
        this.f18017j = i2;
    }

    public static final /* synthetic */ ViewGroup a(b bVar) {
        ViewGroup viewGroup = bVar.f18013f;
        if (viewGroup == null) {
            l.a("mContainerView");
        }
        return viewGroup;
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ DataChannel $dataChannel$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(10000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, DataChannel dataChannel) {
            super(1);
            this.this$0 = bVar;
            this.$dataChannel$inlined = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            com.bytedance.android.livesdk.gifttray.a.a aVar = this.this$0.f18012e;
            if (aVar != null) {
                this.this$0.a(aVar, Boolean.valueOf(booleanValue));
            }
            return z.f158842a;
        }
    }

    public final void a(DataChannel dataChannel) {
        if (dataChannel != null) {
            this.f18011d = dataChannel;
            dataChannel.a(ba.class, (h.f.a.b) new C0376b(this, dataChannel)).a(bc.class, (h.f.a.b) new c(this, dataChannel));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.b$b  reason: collision with other inner class name */
    static final class C0376b extends m implements h.f.a.b<z, z> {
        final /* synthetic */ DataChannel $dataChannel$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(9999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0376b(b bVar, DataChannel dataChannel) {
            super(1);
            this.this$0 = bVar;
            this.$dataChannel$inlined = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            MethodCollector.i(10928);
            l.d(zVar, "");
            b bVar = this.this$0;
            if (bVar.f18015h) {
                ViewGroup viewGroup = bVar.f18013f;
                if (viewGroup == null) {
                    l.a("mContainerView");
                }
                viewGroup.removeView(bVar.f18010c);
                com.bytedance.android.livesdk.gifttray.c.a aVar = bVar.f18010c;
                if (aVar != null) {
                    aVar.b();
                }
                bVar.f18012e = null;
                bVar.f18008a = true;
                bVar.f18015h = false;
                bVar.f18016i = false;
                a aVar2 = bVar.f18014g;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
            z zVar2 = z.f158842a;
            MethodCollector.o(10928);
            return zVar2;
        }
    }

    public final void a(com.bytedance.android.livesdk.gifttray.a.a aVar) {
        Boolean bool;
        MethodCollector.i(9876);
        l.d(aVar, "");
        this.f18008a = false;
        this.f18009b = false;
        this.f18012e = aVar;
        b.a.C0467a.f21435a.a();
        if (com.bytedance.android.livesdk.gifttray.d.b.a(aVar)) {
            this.f18015h = true;
            DataChannel dataChannel = this.f18011d;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.gift.m.class, false);
            }
            y yVar = aVar.C;
            if (yVar == null || !yVar.f19703a) {
                DataChannel dataChannel2 = this.f18011d;
                if (dataChannel2 == null || (bool = (Boolean) dataChannel2.b(cp.class)) == null || !bool.booleanValue()) {
                    com.bytedance.android.livesdk.gifttray.a.a aVar2 = this.f18012e;
                    if (aVar2 != null) {
                        a(aVar2, false);
                        MethodCollector.o(9876);
                        return;
                    }
                    MethodCollector.o(9876);
                    return;
                }
                y yVar2 = aVar.C;
                if (yVar2 != null) {
                    DataChannel dataChannel3 = this.f18011d;
                    if (dataChannel3 != null) {
                        dataChannel3.c(bb.class, yVar2);
                        MethodCollector.o(9876);
                        return;
                    }
                    MethodCollector.o(9876);
                    return;
                }
                MethodCollector.o(9876);
                return;
            }
            y yVar3 = aVar.C;
            DataChannel dataChannel4 = this.f18011d;
            if (dataChannel4 != null) {
                dataChannel4.c(bb.class, yVar3);
                MethodCollector.o(9876);
                return;
            }
            MethodCollector.o(9876);
            return;
        }
        if (!d.a(aVar)) {
            aVar.f17998e = aVar.f17997d;
        }
        ViewGroup viewGroup = this.f18013f;
        if (viewGroup == null) {
            l.a("mContainerView");
        }
        Context context = viewGroup.getContext();
        l.b(context, "");
        com.bytedance.android.livesdk.gifttray.c.b bVar = new com.bytedance.android.livesdk.gifttray.c.b(context);
        this.f18010c = bVar;
        bVar.a(this.f18011d);
        com.bytedance.android.livesdk.gifttray.c.a aVar3 = this.f18010c;
        if (aVar3 != null) {
            aVar3.setTrackNum(this.f18017j);
        }
        com.bytedance.android.livesdk.gifttray.c.a aVar4 = this.f18010c;
        if (aVar4 != null) {
            aVar4.setGiftMessage(aVar);
        }
        com.bytedance.android.livesdk.gifttray.c.a aVar5 = this.f18010c;
        if (aVar5 != null) {
            ViewGroup viewGroup2 = this.f18013f;
            if (viewGroup2 == null) {
                l.a("mContainerView");
            }
            int i2 = -viewGroup2.getWidth();
            ViewGroup viewGroup3 = this.f18013f;
            if (viewGroup3 == null) {
                l.a("mContainerView");
            }
            aVar5.a(i2, (viewGroup3.getHeight() - ((this.f18017j + 1) * com.bytedance.android.live.core.f.y.a(49.0f))) + com.bytedance.android.live.core.f.y.a(2.0f));
        }
        ViewGroup viewGroup4 = this.f18013f;
        if (viewGroup4 == null) {
            l.a("mContainerView");
        }
        viewGroup4.addView(this.f18010c);
        com.bytedance.android.livesdk.service.c.i.a.a(aVar, a());
        DataChannel dataChannel5 = this.f18011d;
        if (dataChannel5 != null) {
            dataChannel5.c(n.class, false);
        }
        com.bytedance.android.livesdk.gifttray.c.a aVar6 = this.f18010c;
        if (aVar6 != null) {
            aVar6.a(this.f18018k);
            MethodCollector.o(9876);
            return;
        }
        MethodCollector.o(9876);
    }

    public final void a(com.bytedance.android.livesdk.gifttray.a.a aVar, Boolean bool) {
        com.bytedance.android.livesdk.gifttray.c.a aVar2;
        MethodCollector.i(10045);
        if (!this.f18015h) {
            MethodCollector.o(10045);
        } else if (this.f18016i) {
            MethodCollector.o(10045);
        } else {
            this.f18016i = true;
            y yVar = aVar.C;
            if (yVar == null || !yVar.f19703a) {
                ViewGroup viewGroup = this.f18013f;
                if (viewGroup == null) {
                    l.a("mContainerView");
                }
                com.bytedance.android.livesdk.gifttray.c.c cVar = new com.bytedance.android.livesdk.gifttray.c.c(viewGroup.getContext());
                this.f18010c = cVar;
                cVar.setTrackNum(this.f18017j);
                com.bytedance.android.livesdk.gifttray.c.a aVar3 = this.f18010c;
                if (aVar3 != null) {
                    aVar3.a(this.f18011d);
                }
                com.bytedance.android.livesdk.gifttray.a.a aVar4 = this.f18012e;
                if (!(aVar4 == null || (aVar2 = this.f18010c) == null)) {
                    aVar2.setGiftMessage(aVar4);
                }
                com.bytedance.android.livesdk.gifttray.c.a aVar5 = this.f18010c;
                if (aVar5 != null) {
                    ViewGroup viewGroup2 = this.f18013f;
                    if (viewGroup2 == null) {
                        l.a("mContainerView");
                    }
                    int i2 = -viewGroup2.getWidth();
                    ViewGroup viewGroup3 = this.f18013f;
                    if (viewGroup3 == null) {
                        l.a("mContainerView");
                    }
                    aVar5.a(i2, (viewGroup3.getHeight() - ((this.f18017j + 1) * com.bytedance.android.live.core.f.y.a(49.0f))) + com.bytedance.android.live.core.f.y.a(2.0f));
                }
                ViewGroup viewGroup4 = this.f18013f;
                if (viewGroup4 == null) {
                    l.a("mContainerView");
                }
                viewGroup4.addView(this.f18010c);
                com.bytedance.android.livesdk.service.c.i.a.a(aVar, a());
                com.bytedance.android.livesdk.gifttray.c.a aVar6 = this.f18010c;
                if (aVar6 != null) {
                    aVar6.a(this.f18018k, bool);
                    MethodCollector.o(10045);
                    return;
                }
                MethodCollector.o(10045);
                return;
            }
            aa aaVar = aVar.C.f19704f;
            l.b(aaVar, "");
            aaVar.a();
            MethodCollector.o(10045);
        }
    }
}

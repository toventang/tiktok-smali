package com.bytedance.android.live.slot;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.android.live.g;
import com.bytedance.android.live.n.t;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.livesdk.j.ai;
import com.bytedance.android.livesdk.j.aj;
import com.bytedance.android.livesdk.j.bj;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class IconSlotController implements w {

    /* renamed from: a  reason: collision with root package name */
    Map<String, Object> f12728a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    Map<IIconSlot.b, ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b>> f12729b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    Map<IIconSlot.b, IIconSlot.SlotViewModel> f12730c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    Queue<ah> f12731d;

    /* renamed from: e  reason: collision with root package name */
    WeakHandler f12732e = new WeakHandler(this);

    /* renamed from: f  reason: collision with root package name */
    e f12733f;

    /* renamed from: g  reason: collision with root package name */
    public IIconSlot.a f12734g;

    /* renamed from: h  reason: collision with root package name */
    protected DataChannel f12735h;

    /* renamed from: i  reason: collision with root package name */
    protected IMessageManager f12736i;

    /* renamed from: j  reason: collision with root package name */
    IIconSlot.b f12737j;

    /* renamed from: k  reason: collision with root package name */
    c f12738k;

    /* renamed from: l  reason: collision with root package name */
    IIconSlot.c f12739l;

    /* renamed from: m  reason: collision with root package name */
    private ab.a f12740m = new ab.a() {
        /* class com.bytedance.android.live.slot.IconSlotController.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7081);
        }

        @Override // com.bytedance.android.live.slot.ab.a
        public final Context a() {
            return IconSlotController.this.f12733f;
        }

        @Override // com.bytedance.android.live.slot.ab.a
        public final boolean a(ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> abVar, IIconSlot.SlotViewModel slotViewModel) {
            if (IconSlotController.this.f12738k == null) {
                return false;
            }
            IconSlotController.this.f12734g.a(abVar, slotViewModel);
            return true;
        }
    };

    static {
        Covode.recordClassIndex(7080);
    }

    @Override // com.bytedance.android.live.slot.z
    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        Queue<ah> queue = this.f12731d;
        if (queue != null) {
            Iterator<ah> it = queue.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.z
    @v(a = i.a.ON_RESUME)
    public void onResume() {
        Queue<ah> queue = this.f12731d;
        if (queue != null) {
            Iterator<ah> it = queue.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private HashMap<String, String> a() {
        DataChannel dataChannel = this.f12735h;
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = (HashMap) dataChannel.b(t.class);
        if (hashMap != null) {
            return hashMap;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.f12735h.a(t.class, hashMap2);
        return hashMap2;
    }

    @Override // com.bytedance.android.live.slot.z
    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        Queue<ah> queue = this.f12731d;
        if (queue != null) {
            for (ah ahVar : queue) {
                ahVar.f12758b.a(new Bundle());
            }
            c cVar = this.f12738k;
            if (!(cVar == null || cVar.f12764a == null)) {
                this.f12738k.f12764a.a(new Bundle());
            }
        }
    }

    @Override // com.bytedance.android.live.slot.z
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        IMessageManager iMessageManager = this.f12736i;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f12732e.removeCallbacksAndMessages(null);
        Queue<ah> queue = this.f12731d;
        if (queue != null) {
            for (ah ahVar : queue) {
                ahVar.f12758b.d();
            }
            c cVar = this.f12738k;
            if (!(cVar == null || cVar.f12764a == null)) {
                this.f12738k.f12764a.d();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.z
    @v(a = i.a.ON_START)
    public void onStart() {
        Queue<ah> queue = this.f12731d;
        if (queue != null) {
            for (ah ahVar : queue) {
                ahVar.f12758b.b();
            }
            c cVar = this.f12738k;
            if (!(cVar == null || cVar.f12764a == null)) {
                this.f12738k.f12764a.b();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.z
    @v(a = i.a.ON_STOP)
    public void onStop() {
        Queue<ah> queue = this.f12731d;
        if (queue != null) {
            for (ah ahVar : queue) {
                ahVar.f12758b.c();
            }
            c cVar = this.f12738k;
            if (!(cVar == null || cVar.f12764a == null)) {
                this.f12738k.f12764a.c();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.w
    public final /* synthetic */ w a(DataChannel dataChannel) {
        this.f12735h = dataChannel;
        if (dataChannel != null) {
            this.f12736i = (IMessageManager) dataChannel.b(cg.class);
        }
        return this;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        Queue<ah> queue = this.f12731d;
        if (queue != null) {
            for (ah ahVar : queue) {
                if (ahVar.f12759c) {
                    ahVar.f12758b.a(iMessage);
                }
            }
            c cVar = this.f12738k;
            if (!(cVar == null || cVar.f12764a == null)) {
                this.f12738k.f12764a.a(iMessage);
            }
        }
    }

    private void a(List<ah> list) {
        if (this.f12738k == null) {
            c cVar = new c();
            this.f12738k = cVar;
            cVar.f12764a = g.a().b(this.f12737j).a(this.f12733f, this.f12737j);
            this.f12738k.f12764a.a(this.f12728a, new ab.b() {
                /* class com.bytedance.android.live.slot.IconSlotController.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(7084);
                }

                @Override // com.bytedance.android.live.slot.ab.b
                public final void a(boolean z) {
                }
            });
        }
        for (ah ahVar : list) {
            if (!ahVar.f12761e) {
                IIconSlot.SlotViewModel a2 = IIconSlot.SlotViewModel.a(ahVar.f12758b, this.f12733f);
                ahVar.f12758b.a(a2, this.f12740m);
                ahVar.f12761e = true;
                this.f12738k.f12764a.a(ahVar.f12758b, a2);
            }
        }
        IIconSlot.SlotViewModel a3 = IIconSlot.SlotViewModel.a(this.f12738k.f12764a, this.f12733f);
        if (!this.f12738k.f12765b) {
            this.f12738k.f12765b = true;
        }
        this.f12738k.f12764a.a(a3, this.f12740m);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1) {
            ah ahVar = (ah) message.obj;
            Iterator<ah> it = this.f12731d.iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                ah next = it.next();
                if (!next.f12760d || next.f12759c) {
                    arrayList.add(next);
                } else {
                    next.f12758b.d();
                    it.remove();
                }
            }
            if (arrayList.size() > 1 && this.f12739l == IIconSlot.c.AGGREGATE) {
                a(arrayList);
            } else if (ahVar.f12759c && !ahVar.f12761e && (ahVar.f12758b.f() instanceof IIconSlot)) {
                IIconSlot.SlotViewModel a2 = IIconSlot.SlotViewModel.a(ahVar.f12758b, this.f12733f);
                this.f12734g.a(ahVar, a2);
                ahVar.f12758b.a(a2, this.f12740m);
                ahVar.f12761e = true;
            }
        }
    }

    @Override // com.bytedance.android.live.slot.w
    public final void a(String str, Object obj) {
        this.f12728a.put(str, obj);
    }

    @Override // com.bytedance.android.live.slot.w
    public final void a(e eVar, IIconSlot.b bVar) {
        this.f12731d = new PriorityBlockingQueue(3, new Comparator<ah>() {
            /* class com.bytedance.android.live.slot.IconSlotController.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7082);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(ah ahVar, ah ahVar2) {
                return ahVar.f12757a - ahVar2.f12757a;
            }
        });
        List<ad> a2 = g.a().a(bVar);
        if (a2 != null) {
            a("param_live_enter_from_merge", com.bytedance.android.livesdk.ab.e.a());
            a("param_live_enter_method_merge", com.bytedance.android.livesdk.ab.e.d());
            a("param_live_action_type", com.bytedance.android.livesdk.ab.e.e());
            a("param_live_rec_content_id", com.bytedance.android.livesdk.ab.e.o());
            a("param_live_rec_content_type", com.bytedance.android.livesdk.ab.e.p());
            a("param_search_id", com.bytedance.android.livesdk.ab.e.q());
            a("param_search_result_id", com.bytedance.android.livesdk.ab.e.r());
            DataChannel dataChannel = this.f12735h;
            if (dataChannel != null) {
                a("param_room", dataChannel.b(df.class));
                a("param_effect_ad_extra", this.f12735h.b(bj.class));
                a("param_enter_from_effect_ad_bool", this.f12735h.b(aj.class));
                a().put("param_live_slot_load_time", new StringBuilder().append(System.currentTimeMillis()).toString());
                a("param_live_show_time", a());
                a("param_extra_auto_route_schema", this.f12735h.b(ai.class));
            }
            for (ad adVar : a2) {
                ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> a3 = adVar.f12751b.a(eVar, bVar);
                if (a3 != null) {
                    final ah ahVar = new ah();
                    ahVar.f12757a = af.a(a3.e(), a3.g());
                    ahVar.f12758b = a3;
                    this.f12731d.offer(ahVar);
                    if (!(this.f12736i == null || a3.a() == null)) {
                        for (Integer num : a3.a()) {
                            if (num.intValue() > 0) {
                                this.f12736i.addMessageListener(num.intValue(), this);
                            }
                        }
                    }
                    a3.a(this.f12728a, new ab.b() {
                        /* class com.bytedance.android.live.slot.IconSlotController.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(7083);
                        }

                        @Override // com.bytedance.android.live.slot.ab.b
                        public final void a(boolean z) {
                            ahVar.a(z);
                            Message obtainMessage = IconSlotController.this.f12732e.obtainMessage(1);
                            obtainMessage.obj = ahVar;
                            IconSlotController.this.f12732e.sendMessage(obtainMessage);
                        }
                    });
                }
            }
        }
    }

    public IconSlotController(e eVar, IIconSlot.a aVar, IIconSlot.b bVar, IIconSlot.c cVar) {
        this.f12733f = eVar;
        this.f12734g = aVar;
        this.f12737j = bVar;
        this.f12739l = cVar;
        aVar.a(cVar);
    }
}

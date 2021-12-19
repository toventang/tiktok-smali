package com.bytedance.android.live.slot;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.g;
import com.bytedance.android.live.n.t;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.j.ai;
import com.bytedance.android.livesdk.j.aj;
import com.bytedance.android.livesdk.j.bj;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class FrameSlotController implements WeakHandler.IHandler, au, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    Map<IFrameSlot.b, ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b>> f12679a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    Map<IFrameSlot.b, IFrameSlot.SlotViewModel> f12680b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    Queue<ah> f12681c;

    /* renamed from: d  reason: collision with root package name */
    WeakHandler f12682d = new WeakHandler(this);

    /* renamed from: e  reason: collision with root package name */
    e f12683e;

    /* renamed from: f  reason: collision with root package name */
    protected DataChannel f12684f;

    /* renamed from: g  reason: collision with root package name */
    protected IMessageManager f12685g;

    /* renamed from: h  reason: collision with root package name */
    Map<String, Object> f12686h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    IFrameSlot.c f12687i;

    /* renamed from: j  reason: collision with root package name */
    private IFrameSlot.a f12688j;

    /* renamed from: k  reason: collision with root package name */
    private Room f12689k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12690l;

    /* renamed from: m  reason: collision with root package name */
    private ab.a f12691m = new ab.a() {
        /* class com.bytedance.android.live.slot.FrameSlotController.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7061);
        }

        @Override // com.bytedance.android.live.slot.ab.a
        public final boolean a(ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> abVar, IIconSlot.SlotViewModel slotViewModel) {
            return false;
        }

        @Override // com.bytedance.android.live.slot.ab.a
        public final Context a() {
            return FrameSlotController.this.f12683e;
        }
    };

    static {
        Covode.recordClassIndex(7060);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        Queue<ah> queue = this.f12681c;
        if (queue != null) {
            Iterator<ah> it = queue.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_RESUME)
    public void onResume() {
        Queue<ah> queue = this.f12681c;
        if (queue != null) {
            Iterator<ah> it = queue.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_START)
    public void onStart() {
        Queue<ah> queue = this.f12681c;
        if (queue != null) {
            for (ah ahVar : queue) {
                ahVar.f12758b.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_STOP)
    public void onStop() {
        Queue<ah> queue = this.f12681c;
        if (queue != null) {
            for (ah ahVar : queue) {
                ahVar.f12758b.c();
            }
        }
    }

    private HashMap<String, String> a() {
        DataChannel dataChannel = this.f12684f;
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = (HashMap) dataChannel.b(t.class);
        if (hashMap != null) {
            return hashMap;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.f12684f.a(t.class, hashMap2);
        return hashMap2;
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        Queue<ah> queue = this.f12681c;
        if (queue != null) {
            for (ah ahVar : queue) {
                ahVar.f12758b.a(new Bundle());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        IMessageManager iMessageManager = this.f12685g;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f12682d.removeCallbacksAndMessages(null);
        Queue<ah> queue = this.f12681c;
        if (queue != null) {
            for (ah ahVar : queue) {
                ahVar.f12758b.d();
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        Queue<ah> queue = this.f12681c;
        if (queue != null) {
            for (ah ahVar : queue) {
                if (ahVar.f12759c) {
                    ahVar.f12758b.a(iMessage);
                }
            }
        }
    }

    public final void a(bq bqVar) {
        DataChannel provideDataChannel = bqVar.provideDataChannel();
        this.f12684f = provideDataChannel;
        if (provideDataChannel != null) {
            this.f12685g = (IMessageManager) provideDataChannel.b(cg.class);
            this.f12689k = (Room) this.f12684f.b(df.class);
            this.f12690l = ((Boolean) this.f12684f.b(ee.class)).booleanValue();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        ac a2;
        if (message.what == 1) {
            ah ahVar = (ah) message.obj;
            Iterator<ah> it = this.f12681c.iterator();
            while (it.hasNext()) {
                ah next = it.next();
                if (next.f12760d && !next.f12759c) {
                    next.f12758b.d();
                    it.remove();
                }
            }
            if (ahVar != null && ahVar.f12759c && !ahVar.f12761e && (ahVar.f12758b.f() instanceof IFrameSlot)) {
                ab abVar = ahVar.f12758b;
                ad a3 = ae.a(this.f12683e, (ad.b) null);
                String str = abVar.e().name() + abVar.hashCode();
                if (IFrameSlot.SlotViewModel.class.equals(ScopeViewModel.class)) {
                    a2 = a3.a(str, IFrameSlot.SlotViewModel.class);
                } else {
                    a2 = a3.a(str, IFrameSlot.SlotViewModel.class);
                    androidx.lifecycle.ab.a(a2, a3);
                }
                IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) a2;
                this.f12688j.a(ahVar, slotViewModel);
                ahVar.f12758b.a(slotViewModel, this.f12691m);
                ahVar.f12761e = true;
            }
        }
    }

    private void a(String str, Object obj) {
        this.f12686h.put(str, obj);
    }

    public final void a(e eVar, IFrameSlot.b bVar) {
        int i2;
        Integer num;
        this.f12681c = new PriorityBlockingQueue(3, new Comparator<ah>() {
            /* class com.bytedance.android.live.slot.FrameSlotController.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7062);
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
            DataChannel dataChannel = this.f12684f;
            if (dataChannel != null) {
                a("param_room", dataChannel.b(df.class));
                a("param_effect_ad_extra", this.f12684f.b(bj.class));
                a("param_enter_from_effect_ad_bool", this.f12684f.b(aj.class));
                a().put("param_live_slot_load_time", new StringBuilder().append(System.currentTimeMillis()).toString());
                a("param_live_show_time", a());
                a("param_extra_auto_route_schema", this.f12684f.b(ai.class));
                a("param_search_id", com.bytedance.android.livesdk.ab.e.q());
                a("param_search_result_id", com.bytedance.android.livesdk.ab.e.r());
            }
            for (ad adVar : a2) {
                ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b> a3 = adVar.f12751b.a(eVar, bVar);
                if (a3 != null) {
                    final ah ahVar = new ah();
                    IFrameSlot.b e2 = a3.e();
                    String g2 = a3.g();
                    Map<String, Integer> map = af.f12753b.get(e2);
                    if (map == null || (num = map.get(g2)) == null) {
                        i2 = af.f12756e;
                    } else {
                        i2 = num.intValue();
                    }
                    ahVar.f12757a = i2;
                    ahVar.f12758b = a3;
                    this.f12681c.offer(ahVar);
                    if (!(this.f12685g == null || a3.a() == null)) {
                        for (Integer num2 : a3.a()) {
                            if (num2.intValue() > 0) {
                                this.f12685g.addMessageListener(num2.intValue(), this);
                            }
                        }
                    }
                    a3.a(this.f12686h, new ab.b() {
                        /* class com.bytedance.android.live.slot.FrameSlotController.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(7063);
                        }

                        @Override // com.bytedance.android.live.slot.ab.b
                        public final void a(boolean z) {
                            ahVar.a(z);
                            Message obtainMessage = FrameSlotController.this.f12682d.obtainMessage(1);
                            obtainMessage.obj = ahVar;
                            FrameSlotController.this.f12682d.sendMessage(obtainMessage);
                        }
                    });
                }
            }
        }
    }

    public FrameSlotController(e eVar, IFrameSlot.a aVar, IFrameSlot.c cVar) {
        this.f12683e = eVar;
        this.f12688j = aVar;
        this.f12687i = cVar;
        aVar.a(cVar);
    }
}

package com.ss.android.ugc.aweme.live.slot;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.m;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ae;
import com.bytedance.android.live.slot.af;
import com.bytedance.android.live.slot.ah;
import com.bytedance.android.live.slot.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

public final class c implements u<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> {

    /* renamed from: a  reason: collision with root package name */
    C2783c f108577a = new C2783c();

    /* renamed from: b  reason: collision with root package name */
    public b f108578b = new b();

    /* renamed from: c  reason: collision with root package name */
    IIconSlot.SlotViewModel f108579c;

    /* renamed from: d  reason: collision with root package name */
    ab.a f108580d;

    /* renamed from: e  reason: collision with root package name */
    int f108581e;

    /* renamed from: f  reason: collision with root package name */
    int f108582f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f108583g;

    /* renamed from: h  reason: collision with root package name */
    boolean f108584h;

    /* renamed from: i  reason: collision with root package name */
    IIconSlot.b f108585i;

    /* renamed from: j  reason: collision with root package name */
    ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> f108586j;

    /* renamed from: k  reason: collision with root package name */
    a f108587k;

    /* renamed from: l  reason: collision with root package name */
    HashMap<ab, IIconSlot.SlotViewModel> f108588l = new HashMap<>();

    static {
        Covode.recordClassIndex(69595);
    }

    @Override // com.bytedance.android.live.slot.ab
    public final List<Integer> a() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(Bundle bundle) {
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void b() {
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void c() {
    }

    @Override // com.bytedance.android.live.slot.ab
    public final String g() {
        return "LIVE_SDK_GroupBusiness";
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Enum e() {
        return IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Object f() {
        return this.f108578b;
    }

    public class b implements IIconSlot {

        /* renamed from: a  reason: collision with root package name */
        String f108595a = "GroupIconSlot";

        /* renamed from: b  reason: collision with root package name */
        e f108596b;

        static {
            Covode.recordClassIndex(69599);
        }

        @Override // com.bytedance.android.live.slot.IIconSlot
        public final Animator.AnimatorListener b() {
            return null;
        }

        @Override // com.bytedance.android.live.slot.IIconSlot
        public final ae a() {
            return new ae() {
                /* class com.ss.android.ugc.aweme.live.slot.c.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69600);
                }

                @Override // com.bytedance.android.live.slot.ae
                public final void a(View view, String str) {
                    if (b.this.f108596b == null) {
                        b.this.f108596b = new e(c.this.f108585i, c.this.f108587k);
                        b.this.f108596b.f108618a = c.this.f108577a;
                    }
                    if (!b.this.f108596b.n()) {
                        b.this.f108596b.show(((e) c.this.f108580d.a()).getSupportFragmentManager(), b.this.f108595a);
                        r.a("livesdk_business_icon_click", new d().a("anchor_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).a("room_id", c.this.f108587k.a()).a("live_status", c.this.f108587k.f108594d).a("icon_type", "Business").a("enter_from_merge", c.this.f108587k.f108591a).a("enter_method", c.this.f108587k.f108592b).f66730a);
                        r.a("livesdk_tiktokec_business_icon_click", new d().a("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).a("room_id", c.this.f108587k.a()).a("EVENT_ORIGIN_FEATURE", "TEMAI").a("live_status", c.this.f108587k.f108594d).f66730a);
                    }
                    if (c.this.f108584h) {
                        c.this.f108579c.f12716d.postValue(false);
                        c.this.f108584h = false;
                    }
                }
            };
        }

        public b() {
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f108591a;

        /* renamed from: b  reason: collision with root package name */
        public String f108592b;

        /* renamed from: c  reason: collision with root package name */
        public Room f108593c;

        /* renamed from: d  reason: collision with root package name */
        public String f108594d;

        static {
            Covode.recordClassIndex(69598);
        }

        public final String a() {
            Room room = this.f108593c;
            if (room != null) {
                return String.valueOf(room.getId());
            }
            return "";
        }

        public a(IIconSlot.b bVar) {
            String str;
            if (bVar == IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
                str = "before_live";
            } else if (bVar == IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR) {
                str = "during_live";
            } else {
                str = "";
            }
            this.f108594d = str;
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void d() {
        b bVar = this.f108578b;
        if (bVar.f108596b != null && bVar.f108596b.n()) {
            bVar.f108596b.dismissAllowingStateLoss();
        }
    }

    private void h() {
        for (Map.Entry<ab, IIconSlot.SlotViewModel> entry : this.f108577a.f108600b.entrySet()) {
            IIconSlot.SlotViewModel value = entry.getValue();
            if (Boolean.TRUE.equals(value.f12714b.getValue())) {
                this.f108588l.put(entry.getKey(), value);
            }
        }
        if (this.f108588l.size() == 0) {
            a(false);
            this.f108580d.a(this, this.f108579c);
        } else if (this.f108588l.size() == 1) {
            Map.Entry<ab, IIconSlot.SlotViewModel> next = this.f108588l.entrySet().iterator().next();
            this.f108580d.a(next.getKey(), next.getValue());
        } else {
            a(true);
            this.f108580d.a(this, this.f108579c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.c$c  reason: collision with other inner class name */
    public class C2783c {

        /* renamed from: a  reason: collision with root package name */
        List<ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b>> f108599a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        Map<ab, IIconSlot.SlotViewModel> f108600b = new HashMap();

        static {
            Covode.recordClassIndex(69601);
        }

        public C2783c() {
        }

        public final synchronized void a(ab abVar, IIconSlot.SlotViewModel slotViewModel) {
            MethodCollector.i(12985);
            Integer valueOf = Integer.valueOf(af.a(abVar.g()));
            int size = this.f108599a.size();
            int i2 = 0;
            while (true) {
                if (i2 >= this.f108599a.size()) {
                    break;
                }
                if (valueOf.intValue() < Integer.valueOf(af.a(this.f108599a.get(i2).g())).intValue()) {
                    size = i2;
                    break;
                }
                i2++;
            }
            this.f108599a.add(size, abVar);
            this.f108600b.put(abVar, slotViewModel);
            MethodCollector.o(12985);
        }
    }

    private String a(Context context) {
        if (this.f108585i == IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
            return context.getString(R.string.f160030i);
        }
        if (this.f108585i == IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR) {
            return context.getString(R.string.f160030i);
        }
        if (this.f108585i == IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR) {
            return context.getString(R.string.f160030i);
        }
        return context.getString(R.string.f160030i);
    }

    public c(IIconSlot.b bVar) {
        this.f108585i = bVar;
        int i2 = 2131234284;
        if (bVar == IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR || !(this.f108585i == IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR || this.f108585i == IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR)) {
            i2 = 2131234299;
        }
        this.f108581e = i2;
        int i3 = 2131234285;
        if (this.f108585i == IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR || !(this.f108585i == IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR || this.f108585i == IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR)) {
            i3 = -1;
        }
        this.f108582f = i3;
        this.f108587k = new a(bVar);
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(String str) {
        r.a("livesdk_business_icon_show_notify", new d().a("anchor_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).a("room_id", this.f108587k.a()).a("live_status", this.f108587k.f108594d).a("enter_from_merge", this.f108587k.f108591a).a("enter_method", this.f108587k.f108592b).f66730a);
        r.a("livesdk_tiktokec_business_icon_show", new d().a("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).a("room_id", this.f108587k.a()).a("EVENT_ORIGIN_FEATURE", "TEMAI").a("live_status", this.f108587k.f108594d).f66730a);
    }

    private void a(boolean z) {
        int a2;
        this.f108579c.f12714b.setValue(Boolean.valueOf(z));
        this.f108579c.f12717e.setValue(androidx.core.content.b.a(this.f108580d.a(), this.f108581e));
        if (this.f108582f > 0) {
            this.f108579c.f12718f.setValue(androidx.core.content.b.a(this.f108580d.a(), this.f108582f));
        }
        this.f108579c.f12721i.setValue(a(this.f108580d.a()));
        C2783c cVar = this.f108577a;
        if (cVar != null) {
            for (ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> abVar : cVar.f108599a) {
                IIconSlot.SlotViewModel slotViewModel = this.f108577a.f108600b.get(abVar);
                if (slotViewModel.f12715c.getValue() != null) {
                    this.f108579c.f12715c.setValue(slotViewModel.f12715c.getValue());
                }
                slotViewModel.f12715c.observe((m) this.f108580d.a(), new androidx.lifecycle.u<String>() {
                    /* class com.ss.android.ugc.aweme.live.slot.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(69596);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // androidx.lifecycle.u
                    public final /* synthetic */ void onChanged(String str) {
                        c.this.f108579c.f12715c.postValue(str);
                    }
                });
            }
            if (this.f108579c.f12715c.getValue() == null && this.f108585i == IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR && (a2 = com.bytedance.ies.f.b.a(this.f108580d.a(), com.bytedance.ies.f.b.f33816b).a("ttlive_broadcast_preview_business_icon_guide_count", 0)) < 5) {
                this.f108579c.f12716d.postValue(true);
                this.f108584h = true;
                com.bytedance.ies.f.b.a(this.f108580d.a(), com.bytedance.ies.f.b.f33816b).a("ttlive_broadcast_preview_business_icon_guide_count", Integer.valueOf(a2 + 1)).a();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.u
    public final void a(ab abVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f108577a.a(abVar, slotViewModel);
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* synthetic */ void a(ac acVar, ab.a aVar) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) acVar;
        IIconSlot.SlotViewModel slotViewModel2 = this.f108579c;
        this.f108579c = slotViewModel;
        this.f108583g = true;
        this.f108580d = aVar;
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(3, new Comparator<ah>() {
            /* class com.ss.android.ugc.aweme.live.slot.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(69597);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(ah ahVar, ah ahVar2) {
                return ahVar.f12757a - ahVar2.f12757a;
            }
        });
        for (Map.Entry<ab, IIconSlot.SlotViewModel> entry : this.f108577a.f108600b.entrySet()) {
            if (!(entry.getValue().p == null || entry.getValue().p.intValue() == 0)) {
                priorityBlockingQueue.add(new ah(entry.getKey(), af.a(this.f108585i, entry.getKey().g())));
            }
        }
        if (priorityBlockingQueue.size() > 0) {
            ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> abVar = ((ah) priorityBlockingQueue.peek()).f12758b;
            if (this.f108586j != abVar) {
                this.f108580d.a(abVar, this.f108577a.f108600b.get(abVar));
                this.f108586j = abVar;
            }
        } else if (slotViewModel2 != slotViewModel) {
            h();
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(Map<String, Object> map, ab.b bVar) {
        this.f108587k.f108591a = (String) map.get("param_live_enter_from_merge");
        this.f108587k.f108592b = (String) map.get("param_live_enter_method_merge");
        this.f108587k.f108593c = (Room) map.get("param_room");
        bVar.a(true);
    }
}

package com.bytedance.android.live.broadcast.preview;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.android.live.broadcast.c;
import com.bytedance.android.live.broadcast.widget.l;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ah;
import com.bytedance.android.live.slot.w;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    e f8293a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.android.livesdk.ui.a f8294b;

    /* renamed from: c  reason: collision with root package name */
    View f8295c;

    /* renamed from: d  reason: collision with root package name */
    DataChannel f8296d;

    /* renamed from: e  reason: collision with root package name */
    b f8297e;

    /* renamed from: f  reason: collision with root package name */
    public a f8298f;

    /* renamed from: g  reason: collision with root package name */
    public a f8299g;

    interface b {
        static {
            Covode.recordClassIndex(4223);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(4221);
    }

    public static class a implements IIconSlot.a {

        /* renamed from: a  reason: collision with root package name */
        e f8300a;

        /* renamed from: b  reason: collision with root package name */
        DataChannel f8301b;

        /* renamed from: c  reason: collision with root package name */
        public l f8302c;

        /* renamed from: d  reason: collision with root package name */
        public w f8303d;

        /* renamed from: e  reason: collision with root package name */
        IIconSlot.c f8304e;

        /* renamed from: f  reason: collision with root package name */
        private com.bytedance.android.livesdk.ui.a f8305f;

        /* renamed from: g  reason: collision with root package name */
        private IIconSlot.SlotViewModel f8306g;

        static {
            Covode.recordClassIndex(4222);
        }

        public final Integer a() {
            l lVar = this.f8302c;
            if (lVar == null) {
                return null;
            }
            return Integer.valueOf(lVar.getId());
        }

        @Override // com.bytedance.android.live.slot.IIconSlot.a
        public final void a(IIconSlot.c cVar) {
            this.f8304e = cVar;
        }

        public final void a(int i2) {
            this.f8302c.setIconMarginTop(i2);
        }

        public final void a(boolean z) {
            if (this.f8302c != null && this.f8306g != null) {
                if (!z || !Boolean.TRUE.equals(this.f8306g.f12714b.getValue())) {
                    this.f8302c.setVisibility(8);
                } else {
                    this.f8302c.setVisibility(0);
                }
            }
        }

        @Override // com.bytedance.android.live.slot.IIconSlot.a
        public final void a(ah ahVar, IIconSlot.SlotViewModel slotViewModel) {
            a(ahVar.f12758b, slotViewModel);
        }

        @Override // com.bytedance.android.live.slot.IIconSlot.a
        public final void a(ab abVar, IIconSlot.SlotViewModel slotViewModel) {
            if (slotViewModel != null) {
                slotViewModel.f12713a.setValue(true);
                this.f8306g = slotViewModel;
                slotViewModel.f12714b.observe(this.f8305f, new aa(this, slotViewModel, abVar));
                slotViewModel.f12720h.observe(this.f8305f, new ab(this, slotViewModel));
                slotViewModel.f12716d.observe(this.f8305f, new ac(this, slotViewModel));
                slotViewModel.f12715c.observe(this.f8305f, new ad(this, slotViewModel));
                slotViewModel.f12717e.observe(this.f8305f, new ae(this, slotViewModel));
                slotViewModel.f12721i.observe(this.f8305f, new af(this, slotViewModel));
                this.f8302c.setOnClickListener(new ag(this, abVar));
                if (this.f8301b.b(x.class) == i.SCREEN_RECORD) {
                    a(false);
                }
            }
        }

        public a(e eVar, com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, IIconSlot.b bVar, IIconSlot.c cVar) {
            this.f8300a = eVar;
            this.f8305f = aVar;
            this.f8301b = dataChannel;
            w createIconSlotController = ((ISlotService) com.bytedance.android.live.t.a.a(ISlotService.class)).createIconSlotController(this.f8300a, this, bVar, cVar);
            this.f8303d = createIconSlotController;
            createIconSlotController.a(dataChannel);
            l lVar = new l(this.f8300a);
            this.f8302c = lVar;
            lVar.setId(androidx.core.h.v.a());
            this.f8302c.setVisibility(8);
        }
    }

    v(DataChannel dataChannel, com.bytedance.android.livesdk.ui.a aVar, View view, b bVar) {
        this.f8293a = aVar.getActivity();
        this.f8295c = view;
        this.f8294b = aVar;
        this.f8296d = dataChannel;
        this.f8297e = bVar;
        dataChannel.a(c.class, (h.f.a.b) new w(this));
    }
}

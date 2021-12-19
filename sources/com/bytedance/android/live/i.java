package com.bytedance.android.live;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.android.live.g;
import com.bytedance.android.live.slot.BarrageWidget;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.FrameSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.IconSlotController;
import com.bytedance.android.live.slot.aa;
import com.bytedance.android.live.slot.ad;
import com.bytedance.android.live.slot.w;
import com.bytedance.android.live.slot.x;
import com.bytedance.android.live.slot.y;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlotExperiment;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow;
import com.bytedance.android.livesdkapi.depend.e.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class i implements ISlotService {
    static {
        Covode.recordClassIndex(5101);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getBarrageWidget() {
        return BarrageWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getBottomLeftSlotWidget() {
        return BottomLeftSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget() {
        return FrameL2SlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget() {
        return FrameL3SlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameSlotWidget() {
        return FrameSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public x getAggregateProviderByID(IIconSlot.b bVar) {
        return g.a().b(bVar);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<ad> getProviderWrappersByID(IFrameSlot.b bVar) {
        return g.a().a(bVar);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public boolean isBizTypeRegistered(String str) {
        return g.a().f9900a.f9904d.containsKey(str);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void dispatchMessage(IMessage iMessage) {
        Iterator<y> it = g.a().f9900a.f9904d.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<ad> getProviderWrappersByID(IIconSlot.b bVar) {
        return g.a().a(bVar);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public aa getSlotMessagerByBiz(String str) {
        g a2 = g.a();
        if (a2.f9900a.f9904d.containsKey(str) && a2.f9900a.a(str) != null) {
            a2.f9900a.a(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void registerAggregateSlot(x xVar) {
        g a2 = g.a();
        String b2 = xVar.b();
        if (!TextUtils.isEmpty(b2)) {
            SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get(b2);
            if (slotBizTypeDisallow == null || !slotBizTypeDisallow.getDisallowAll()) {
                g.a aVar = a2.f9900a;
                aVar.f9905e.put(xVar.b(), xVar);
                List<IIconSlot.b> a3 = xVar.a();
                if (a3 != null) {
                    for (IIconSlot.b bVar : a3) {
                        if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(bVar.name())) {
                            a2.f9900a.f9903c.put(bVar, xVar);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void registerSlot(y yVar) {
        g a2 = g.a();
        String c2 = yVar.c();
        if (!TextUtils.isEmpty(c2)) {
            SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get(c2);
            if (slotBizTypeDisallow == null || !slotBizTypeDisallow.getDisallowAll()) {
                g.a aVar = a2.f9900a;
                aVar.f9904d.put(yVar.c(), yVar);
                List<IIconSlot.b> a3 = yVar.a();
                if (a3 != null) {
                    for (IIconSlot.b bVar : a3) {
                        if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(bVar.name())) {
                            g.a aVar2 = a2.f9900a;
                            List<y> list = aVar2.f9901a.get(bVar);
                            if (list == null) {
                                list = new ArrayList<>();
                                aVar2.f9901a.put(bVar, list);
                            }
                            list.add(yVar);
                        }
                    }
                }
                List<IFrameSlot.b> b2 = yVar.b();
                if (b2 != null) {
                    for (IFrameSlot.b bVar2 : b2) {
                        if (slotBizTypeDisallow == null || slotBizTypeDisallow.getFrameSlotDisallowList() == null || !slotBizTypeDisallow.getFrameSlotDisallowList().contains(bVar2.name())) {
                            g.a aVar3 = a2.f9900a;
                            List<y> list2 = aVar3.f9902b.get(bVar2);
                            if (list2 == null) {
                                list2 = new ArrayList<>();
                                aVar3.f9902b.put(bVar2, list2);
                            }
                            list2.add(yVar);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<a> getLiveShareSheetAction(Map<String, Object> map, IIconSlot.b bVar) {
        ArrayList arrayList = new ArrayList();
        List<ad> a2 = g.a().a(bVar);
        if (a2 == null) {
            return arrayList;
        }
        for (ad adVar : a2) {
            List list = null;
            com.bytedance.android.live.slot.a aVar = adVar.f12751b instanceof com.bytedance.android.live.slot.a ? (com.bytedance.android.live.slot.a) adVar.f12751b : null;
            if (aVar != null) {
                try {
                    list = (List) aVar.a(map, bVar).get("param_live_broadcast_share_sheet_list");
                } catch (Exception unused) {
                    com.bytedance.android.live.core.c.a.a(4, "TAG", "getLiveShareSheetAction responseParams get param_live_broadcast_share_sheet_list, error");
                }
                if (list != null && list.size() > 0) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public w createIconSlotController(e eVar, IIconSlot.a aVar, IIconSlot.b bVar, IIconSlot.c cVar) {
        return new IconSlotController(eVar, aVar, bVar, cVar);
    }
}

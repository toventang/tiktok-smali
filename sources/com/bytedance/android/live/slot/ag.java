package com.bytedance.android.live.slot;

import androidx.fragment.app.e;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.e.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ag implements ISlotService {
    static {
        Covode.recordClassIndex(7094);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public w createIconSlotController(e eVar, IIconSlot.a aVar, IIconSlot.b bVar, IIconSlot.c cVar) {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void dispatchMessage(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public x getAggregateProviderByID(IIconSlot.b bVar) {
        l.d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getBarrageWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getBottomLeftSlotWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameSlotWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public aa getSlotMessagerByBiz(String str) {
        l.d(str, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public boolean isBizTypeRegistered(String str) {
        return false;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void registerAggregateSlot(x xVar) {
        l.d(xVar, "");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void registerSlot(y yVar) {
        l.d(yVar, "");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<ad> getProviderWrappersByID(IFrameSlot.b bVar) {
        l.d(bVar, "");
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<ad> getProviderWrappersByID(IIconSlot.b bVar) {
        l.d(bVar, "");
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<a> getLiveShareSheetAction(Map<String, Object> map, IIconSlot.b bVar) {
        return new ArrayList();
    }
}

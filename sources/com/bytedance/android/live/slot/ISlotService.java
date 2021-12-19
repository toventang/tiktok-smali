package com.bytedance.android.live.slot;

import androidx.fragment.app.e;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.Map;

public interface ISlotService extends a {
    static {
        Covode.recordClassIndex(7079);
    }

    w createIconSlotController(e eVar, IIconSlot.a aVar, IIconSlot.b bVar, IIconSlot.c cVar);

    void dispatchMessage(IMessage iMessage);

    x getAggregateProviderByID(IIconSlot.b bVar);

    Class<? extends LiveRecyclableWidget> getBarrageWidget();

    Class<? extends LiveRecyclableWidget> getBottomLeftSlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameSlotWidget();

    List<com.bytedance.android.livesdkapi.depend.e.a> getLiveShareSheetAction(Map<String, Object> map, IIconSlot.b bVar);

    List<ad> getProviderWrappersByID(IFrameSlot.b bVar);

    List<ad> getProviderWrappersByID(IIconSlot.b bVar);

    aa getSlotMessagerByBiz(String str);

    boolean isBizTypeRegistered(String str);

    void registerAggregateSlot(x xVar);

    void registerSlot(y yVar);
}

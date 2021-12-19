package com.bytedance.android.live.slot;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface y {
    static {
        Covode.recordClassIndex(7121);
    }

    ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b> a(Context context, IFrameSlot.b bVar);

    ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> a(Context context, IIconSlot.b bVar);

    List<IIconSlot.b> a();

    List<IFrameSlot.b> b();

    String c();
}

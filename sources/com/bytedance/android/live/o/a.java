package com.bytedance.android.live.o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public interface a extends com.bytedance.android.live.base.a {
    static {
        Covode.recordClassIndex(6664);
    }

    Fragment getSubscribeInfoListFragment(Context context, String str);

    void openUserSubscribeEntry(Context context, Room room, String str);

    void openUserSubscribeState(Context context, Room room, String str);
}

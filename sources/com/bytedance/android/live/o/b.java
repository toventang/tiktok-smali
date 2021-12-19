package com.bytedance.android.live.o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class b implements a {
    static {
        Covode.recordClassIndex(6665);
    }

    @Override // com.bytedance.android.live.o.a
    public Fragment getSubscribeInfoListFragment(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.o.a
    public void openUserSubscribeEntry(Context context, Room room, String str) {
        l.d(context, "");
        l.d(room, "");
        l.d(str, "");
    }

    @Override // com.bytedance.android.live.o.a
    public void openUserSubscribeState(Context context, Room room, String str) {
        l.d(context, "");
        l.d(room, "");
        l.d(str, "");
    }
}

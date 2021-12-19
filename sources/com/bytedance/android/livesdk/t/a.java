package com.bytedance.android.livesdk.t;

import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ap.b;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameCategoryEntranceSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(12757);
    }

    public static final GameTag a() {
        return new GameTag(-1L, y.a((int) R.string.ead), y.a((int) R.string.ead), y.a((int) R.string.ead));
    }

    private static final boolean b(DataChannel dataChannel) {
        o oVar;
        if (dataChannel == null || (oVar = (o) dataChannel.b(dg.class)) == null) {
            return false;
        }
        return oVar.s;
    }

    public static final boolean a(DataChannel dataChannel) {
        boolean z;
        boolean z2 = true;
        if (!LiveGameCategoryEntranceSetting.INSTANCE.shouldShow() || !b(dataChannel)) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder append = new StringBuilder("shouldShowGameCategoryEntry. result=").append(z).append(". dataChannelNull=");
        if (dataChannel != null) {
            z2 = false;
        }
        com.bytedance.android.live.core.c.a.a(4, "GameCategoryExt", append.append(z2).toString());
        return z;
    }

    public static final boolean a(List<GameTag> list) {
        l.d(list, "");
        int size = list.size();
        if (size == 1) {
            return list.get(0).isNonGameOrOtherGameItem();
        }
        if (size == 2 && list.get(0).isNonGameOrOtherGameItem() && list.get(1).isNonGameOrOtherGameItem()) {
            return true;
        }
        return false;
    }

    public static final List<GameTag> a(boolean z, List<GameTag> list) {
        long j2;
        boolean z2;
        Long l2;
        l.d(list, "");
        b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cN;
        l.b(bVar, "");
        GameTag a2 = GameTag.a.a(bVar.a());
        list.add(0, a());
        if (!z) {
            list.add(1, new GameTag(0L, y.a((int) R.string.eac), y.a((int) R.string.eac), y.a((int) R.string.eac)));
        }
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            GameTag gameTag = new GameTag(null, null, null, null, 15, null);
            if (t == null || (l2 = t.id) == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            gameTag.id = Long.valueOf(j2);
            Long l3 = null;
            gameTag.showName = t != null ? t.showName : null;
            gameTag.fullName = t != null ? t.fullName : null;
            gameTag.shortName = t != null ? t.shortName : null;
            if (a2 != null) {
                Long l4 = a2.id;
                if (t != null) {
                    l3 = t.id;
                }
                if (l.a(l4, l3)) {
                    z2 = true;
                    gameTag.setSelected(z2);
                    arrayList.add(gameTag);
                }
            }
            z2 = false;
            gameTag.setSelected(z2);
            arrayList.add(gameTag);
        }
        return n.g((Collection) arrayList);
    }
}

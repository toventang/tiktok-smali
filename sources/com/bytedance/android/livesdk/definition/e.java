package com.bytedance.android.livesdk.definition;

import com.bytedance.android.live.base.a;
import com.bytedance.android.live.broadcast.model.n;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.i.a.d;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.j.v;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class e {
    static {
        Covode.recordClassIndex(9406);
    }

    public static final List<d> a() {
        ArrayList<LiveCoreSDKData.Quality> arrayList;
        String str;
        boolean z;
        StreamUrl streamUrl;
        LinkedList<LiveCoreSDKData.Quality> linkedList;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null || (streamUrl = room.getStreamUrl()) == null || (linkedList = streamUrl.qualityList) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (T t : linkedList) {
                T t2 = t;
                String str2 = t2.sdkKey;
                if (str2 != null && !p.a((CharSequence) str2)) {
                    String str3 = t2.sdkKey;
                    l.b(str3, "");
                    if (!p.e((CharSequence) str3, (CharSequence) "auto")) {
                        arrayList2.add(t);
                    }
                }
            }
            arrayList = arrayList2;
        }
        f fVar = f.a.f23366a;
        l.b(fVar, "");
        EnterRoomLinkSession a2 = fVar.a();
        l.b(a2, "");
        String str4 = a2.f23354b.f23299c.E;
        if (str4 == null) {
            str4 = "";
        }
        a a3 = com.bytedance.android.live.t.a.a(d.class);
        l.b(a3, "");
        k b2 = ((d) a3).getLivePlayControllerManager().b(str4);
        if (b2 == null || (str = b2.g()) == null) {
            str = "";
        }
        com.bytedance.android.live.core.c.a.a(4, "DefinitionList", "genAudienceSupportDefinitionList(). tag=" + str4 + ", currentSdkKey=" + str);
        if (arrayList == null) {
            return z.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList, 10));
        for (LiveCoreSDKData.Quality quality : arrayList) {
            l.b(quality, "");
            d dVar = new d(quality);
            if (!com.bytedance.android.livesdk.utils.p.a((CharSequence) str) || !l.a((Object) str, (Object) quality.sdkKey)) {
                z = false;
            } else {
                z = true;
            }
            dVar.f16934c = z;
            arrayList3.add(dVar);
        }
        return arrayList3;
    }

    public static final List<d> a(c cVar) {
        o oVar;
        com.bytedance.android.live.broadcast.model.n nVar;
        String str;
        boolean z;
        String str2;
        l.d(cVar, "");
        ArrayList arrayList = new ArrayList();
        DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(cVar);
        if (!(a2 == null || (oVar = (o) a2.b(dg.class)) == null)) {
            Map<Long, com.bytedance.android.live.broadcast.model.n> map = oVar.r;
            ArrayList<n.a> arrayList2 = null;
            if (!(map == null || (nVar = map.get(4L)) == null)) {
                List<n.a> list = nVar.f7936b;
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (T t : list) {
                        T t2 = t;
                        String str3 = t2.f7938b;
                        l.b(str3, "");
                        if (!p.e((CharSequence) str3, (CharSequence) "auto") && (str2 = t2.f7938b) != null && !p.a((CharSequence) str2)) {
                            arrayList3.add(t);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                n.a aVar = (n.a) DataChannelGlobal.f34575d.b(v.class);
                if (aVar == null || (str = aVar.f7938b) == null) {
                    str = "";
                }
                if (arrayList2 != null) {
                    for (n.a aVar2 : arrayList2) {
                        l.b(aVar2, "");
                        d dVar = new d(aVar2);
                        if (!com.bytedance.android.livesdk.utils.p.a((CharSequence) str) || !l.a((Object) str, (Object) aVar2.f7938b)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        dVar.f16934c = z;
                        arrayList.add(dVar);
                    }
                }
            }
        }
        return arrayList;
    }
}

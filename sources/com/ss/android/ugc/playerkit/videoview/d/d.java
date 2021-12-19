package com.ss.android.ugc.playerkit.videoview.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.simkit.c;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.BitrateFilter;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.playerkit.exp.b;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.simapicommon.a.e;
import h.a.i;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f148930a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(98068);
    }

    private static e a(e[] eVarArr) {
        int intValue = ((Number) b.f148672f.getValue()).intValue();
        if (intValue == 1) {
            return (e) i.c(eVarArr);
        }
        if (intValue == 2) {
            return (e) i.e(eVarArr);
        }
        e eVar = (e) i.c(eVarArr);
        for (e eVar2 : eVarArr) {
            if (Math.abs(eVar2.getBitRate() - 1000000) < Math.abs(eVar.getBitRate() - 1000000)) {
                eVar = eVar2;
            }
        }
        return eVar;
    }

    public final u a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        l.c(iVar, "");
        ArrayList arrayList = new ArrayList();
        c a2 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a2, "");
        ISimKitConfig b2 = a2.b();
        l.a((Object) b2, "");
        ICommonConfig commonConfig = b2.getCommonConfig();
        l.a((Object) commonConfig, "");
        arrayList.addAll(commonConfig.getColdBootVideoUrlHooks());
        com.ss.android.ugc.aweme.video.preload.i b3 = s.b();
        c a3 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a3, "");
        ISimKitConfig b4 = a3.b();
        l.a((Object) b4, "");
        ICommonConfig commonConfig2 = b4.getCommonConfig();
        l.a((Object) commonConfig2, "");
        arrayList.add(new com.ss.android.ugc.aweme.simkit.impl.b.a(b3, commonConfig2.getVideoUrlHookHook()));
        return a(iVar, (ArrayList<n>) arrayList);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f148931a = new a();

        static {
            Covode.recordClassIndex(98069);
        }

        a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            e eVar = (e) obj;
            e eVar2 = (e) obj2;
            l.c(eVar, "");
            l.c(eVar2, "");
            return eVar2.getBitRate() - eVar.getBitRate();
        }
    }

    public static u a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, ArrayList<n> arrayList) {
        u uVar = new u();
        List<String> urlList = iVar.getUrlList();
        l.a((Object) urlList, "");
        Object[] array = urlList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            uVar.f148829f = iVar.getUrlKey();
            uVar.f148827d = iVar.isBytevc1();
            uVar.f148830g = iVar.getFileCheckSum();
            uVar.f148825b = iVar.getRatio();
            uVar.f148832i = false;
            List<e> bitRate = iVar.getBitRate();
            l.a((Object) bitRate, "");
            e[] a2 = a(iVar, bitRate);
            if (a2 != null) {
                boolean z = true;
                if (a2.length != 0) {
                    e a3 = a(a2);
                    iVar.setHitBitrate(a3);
                    List<String> urlList2 = a3.urlList();
                    l.a((Object) urlList2, "");
                    Object[] array2 = urlList2.toArray(new String[0]);
                    if (array2 != null) {
                        strArr = (String[]) array2;
                        String urlKey = a3.getUrlKey();
                        if (urlKey == null) {
                            urlKey = uVar.f148829f;
                        }
                        uVar.f148829f = urlKey;
                        String checksum = a3.getChecksum();
                        if (checksum == null) {
                            checksum = uVar.f148830g;
                        }
                        uVar.f148830g = checksum;
                        if (a3.isBytevc1() != 1) {
                            z = false;
                        }
                        uVar.f148827d = z;
                        uVar.f148828e = new com.ss.android.ugc.playerkit.model.a(a3.getBitRate(), a3.getGearName(), a3.getQualityType(), a3.isBytevc1(), a3.getUrlKey(), a3.urlList(), a3.getChecksum(), a3.getSize());
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
            }
            List<String> a4 = p.a(strArr, iVar.getCreateTime(), iVar.getCdnUrlExpired());
            l.a((Object) a4, "");
            Object[] array3 = a4.toArray(new String[0]);
            if (array3 != null) {
                String[] strArr2 = (String[]) array3;
                uVar.f148824a = i.d(strArr2);
                if (arrayList != null) {
                    i iVar2 = new i(iVar, uVar.f148829f, strArr2);
                    j a5 = new o(arrayList, iVar2, 0).a(iVar2);
                    uVar.f148824a = a5.f148935a;
                    uVar.f148831h = a5.f148936b;
                }
                return uVar;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    private static e[] a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, List<e> list) {
        c a2 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a2, "");
        ISimKitConfig b2 = a2.b();
        l.a((Object) b2, "");
        IDimensionBitrateFilterConfig dimensionBitrateFilterConfig = b2.getDimensionBitrateFilterConfig();
        if (dimensionBitrateFilterConfig != null && dimensionBitrateFilterConfig.a()) {
            list = new BitrateFilter().a(list, iVar.getSourceId());
            l.a((Object) list, "");
        }
        if (list.isEmpty()) {
            return null;
        }
        Object[] array = list.toArray(new e[0]);
        if (array != null) {
            e[] eVarArr = (e[]) array;
            Arrays.sort(eVarArr, a.f148931a);
            return eVarArr;
        }
        throw new w("null cannot be cast to non-null type");
    }
}

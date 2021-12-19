package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.compliance.api.model.c;
import com.ss.android.ugc.aweme.compliance.api.model.d;
import com.ss.android.ugc.aweme.compliance.api.model.g;
import com.ss.android.ugc.aweme.compliance.api.model.h;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.api.model.t;
import com.ss.android.ugc.aweme.compliance.privacy.utils.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.util.LinkedHashSet;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static f f77433a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f77434b = new i();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f77435c;

    /* renamed from: d  reason: collision with root package name */
    private static PrivacyUserSettingsResponse f77436d;

    private i() {
    }

    static {
        Covode.recordClassIndex(47900);
    }

    public static void a() {
        PrivacyUserSettingsResponse privacyUserSettingsResponse;
        Map map;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        String str;
        d dVar;
        d dVar2;
        c cVar;
        h hVar;
        t tVar;
        t tVar2;
        t tVar3;
        t tVar4;
        t tVar5;
        g gVar;
        g gVar2;
        g gVar3;
        g gVar4;
        d dVar3;
        d dVar4;
        c cVar2;
        h hVar2;
        t tVar6;
        t tVar7;
        t tVar8;
        t tVar9;
        t tVar10;
        g gVar5;
        g gVar6;
        g gVar7;
        g gVar8;
        if (f77435c && (privacyUserSettingsResponse = f77436d) != null && f77433a != null) {
            q privacyUserSettings = privacyUserSettingsResponse.getPrivacyUserSettings();
            f fVar = f77433a;
            if (fVar == null) {
                l.b();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = fVar.v;
            if (privacyUserSettings == null || (gVar8 = privacyUserSettings.f76685a) == null || i2 != gVar8.f76663a) {
                linkedHashSet.add("download");
            }
            int i3 = fVar.s;
            if (privacyUserSettings == null || (gVar7 = privacyUserSettings.f76685a) == null || i3 != gVar7.f76664b) {
                linkedHashSet.add("duet");
            }
            int i4 = fVar.u;
            if (privacyUserSettings == null || (gVar6 = privacyUserSettings.f76685a) == null || i4 != gVar6.f76665c) {
                linkedHashSet.add("stitch");
            }
            int i5 = fVar.r;
            if (privacyUserSettings == null || (gVar5 = privacyUserSettings.f76685a) == null || i5 != gVar5.f76666d) {
                linkedHashSet.add(UGCMonitor.EVENT_COMMENT);
            }
            int i6 = fVar.ah;
            if (privacyUserSettings == null || (tVar10 = privacyUserSettings.f76686b) == null || i6 != tVar10.f76695a) {
                linkedHashSet.add("sugToContacts");
            }
            int i7 = fVar.ai;
            if (privacyUserSettings == null || (tVar9 = privacyUserSettings.f76686b) == null || i7 != tVar9.f76696b) {
                linkedHashSet.add("sugToFbFriends");
            }
            int i8 = fVar.aj;
            if (privacyUserSettings == null || (tVar8 = privacyUserSettings.f76686b) == null || i8 != tVar8.f76697c) {
                linkedHashSet.add("sugToMutualConnections");
            }
            int i9 = fVar.ak;
            if (privacyUserSettings == null || (tVar7 = privacyUserSettings.f76686b) == null || i9 != tVar7.f76698d) {
                linkedHashSet.add("sugToWhoShareLink");
            }
            int i10 = fVar.al;
            if (privacyUserSettings == null || (tVar6 = privacyUserSettings.f76686b) == null || i10 != tVar6.f76699e) {
                linkedHashSet.add("sugToInterestedUsers");
            }
            int i11 = fVar.J;
            if (privacyUserSettings == null || (hVar2 = privacyUserSettings.f76687c) == null || i11 != hVar2.f76667a) {
                linkedHashSet.add("favoriteList");
            }
            int i12 = fVar.am;
            if (privacyUserSettings == null || (cVar2 = privacyUserSettings.f76688d) == null || i12 != cVar2.f76646a) {
                linkedHashSet.add("followingList");
            }
            int i13 = fVar.C;
            if (privacyUserSettings == null || (dVar4 = privacyUserSettings.f76689e) == null || i13 != dVar4.f76647a) {
                linkedHashSet.add("directMessage");
            }
            int i14 = fVar.F;
            if (privacyUserSettings == null || (dVar3 = privacyUserSettings.f76689e) == null || i14 != dVar3.f76648b) {
                linkedHashSet.add("groupChatInvite");
            }
            boolean isEmpty = linkedHashSet.isEmpty();
            p[] pVarArr = new p[3];
            pVarArr[0] = v.a("diffsKeys", linkedHashSet.toString());
            PrivacyUserSettingsResponse privacyUserSettingsResponse2 = f77436d;
            Map map2 = null;
            if (privacyUserSettingsResponse2 != null) {
                p[] pVarArr2 = new p[14];
                if (privacyUserSettings == null || (gVar4 = privacyUserSettings.f76685a) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(gVar4.f76663a);
                }
                pVarArr2[0] = v.a("download", num);
                if (privacyUserSettings == null || (gVar3 = privacyUserSettings.f76685a) == null) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(gVar3.f76664b);
                }
                pVarArr2[1] = v.a("duet", num2);
                if (privacyUserSettings == null || (gVar2 = privacyUserSettings.f76685a) == null) {
                    num3 = null;
                } else {
                    num3 = Integer.valueOf(gVar2.f76665c);
                }
                pVarArr2[2] = v.a("stitch", num3);
                if (privacyUserSettings == null || (gVar = privacyUserSettings.f76685a) == null) {
                    num4 = null;
                } else {
                    num4 = Integer.valueOf(gVar.f76666d);
                }
                pVarArr2[3] = v.a(UGCMonitor.EVENT_COMMENT, num4);
                if (privacyUserSettings == null || (tVar5 = privacyUserSettings.f76686b) == null) {
                    num5 = null;
                } else {
                    num5 = Integer.valueOf(tVar5.f76695a);
                }
                pVarArr2[4] = v.a("sugToContacts", num5);
                if (privacyUserSettings == null || (tVar4 = privacyUserSettings.f76686b) == null) {
                    num6 = null;
                } else {
                    num6 = Integer.valueOf(tVar4.f76696b);
                }
                pVarArr2[5] = v.a("sugToFbFriends", num6);
                if (privacyUserSettings == null || (tVar3 = privacyUserSettings.f76686b) == null) {
                    num7 = null;
                } else {
                    num7 = Integer.valueOf(tVar3.f76697c);
                }
                pVarArr2[6] = v.a("sugToMutualConnections", num7);
                if (privacyUserSettings == null || (tVar2 = privacyUserSettings.f76686b) == null) {
                    num8 = null;
                } else {
                    num8 = Integer.valueOf(tVar2.f76698d);
                }
                pVarArr2[7] = v.a("sugToWhoShareLink", num8);
                if (privacyUserSettings == null || (tVar = privacyUserSettings.f76686b) == null) {
                    num9 = null;
                } else {
                    num9 = Integer.valueOf(tVar.f76699e);
                }
                pVarArr2[8] = v.a("sugToInterestedUsers", num9);
                if (privacyUserSettings == null || (hVar = privacyUserSettings.f76687c) == null) {
                    num10 = null;
                } else {
                    num10 = Integer.valueOf(hVar.f76667a);
                }
                pVarArr2[9] = v.a("favoriteList", num10);
                if (privacyUserSettings == null || (cVar = privacyUserSettings.f76688d) == null) {
                    num11 = null;
                } else {
                    num11 = Integer.valueOf(cVar.f76646a);
                }
                pVarArr2[10] = v.a("followingList", num11);
                if (privacyUserSettings == null || (dVar2 = privacyUserSettings.f76689e) == null) {
                    num12 = null;
                } else {
                    num12 = Integer.valueOf(dVar2.f76647a);
                }
                pVarArr2[11] = v.a("directMessage", num12);
                if (privacyUserSettings == null || (dVar = privacyUserSettings.f76689e) == null) {
                    num13 = null;
                } else {
                    num13 = Integer.valueOf(dVar.f76648b);
                }
                pVarArr2[12] = v.a("groupChatInvite", num13);
                LogPbBean logPb = privacyUserSettingsResponse2.getLogPb();
                if (logPb != null) {
                    str = logPb.getImprId();
                } else {
                    str = null;
                }
                pVarArr2[13] = v.a("logid", str);
                map = ag.a(pVarArr2);
            } else {
                map = null;
            }
            pVarArr[1] = v.a("privacy", map);
            f fVar2 = f77433a;
            if (fVar2 != null) {
                map2 = ag.a(v.a("downloadSetting", Integer.valueOf(fVar2.v)), v.a("duet", Integer.valueOf(fVar2.s)), v.a("stitch", Integer.valueOf(fVar2.u)), v.a(UGCMonitor.EVENT_COMMENT, Integer.valueOf(fVar2.r)), v.a("sugToContacts", Integer.valueOf(fVar2.ah)), v.a("sugToFbFriends", Integer.valueOf(fVar2.ai)), v.a("sugToMutualConnections", Integer.valueOf(fVar2.aj)), v.a("sugToWhoShareLink", Integer.valueOf(fVar2.ak)), v.a("sugToInterestedUsers", Integer.valueOf(fVar2.al)), v.a("whoCanSeeMyLikeList", Integer.valueOf(fVar2.J)), v.a("followingVisibility", Integer.valueOf(fVar2.am)), v.a("chatSet", Integer.valueOf(fVar2.C)), v.a("groupChatSet", Integer.valueOf(fVar2.F)), v.a("logid", a.a((BaseResponse) fVar2)));
            }
            pVarArr[2] = v.a("user", map2);
            com.ss.android.ugc.aweme.compliance.common.c.a.a("privacy_user_settings_resp_fail", isEmpty, ag.a(pVarArr));
            a(false);
        }
    }

    public static void a(boolean z) {
        f77435c = z;
        f77436d = null;
        f77433a = null;
    }

    public static void a(PrivacyUserSettingsResponse privacyUserSettingsResponse) {
        l.d(privacyUserSettingsResponse, "");
        f77436d = privacyUserSettingsResponse;
        a();
    }
}

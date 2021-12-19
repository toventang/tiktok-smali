package com.ss.android.ugc.aweme.requesttask.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class a implements r {
    static {
        Covode.recordClassIndex(78610);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        n a2 = n.a();
        l.b(a2, "");
        if (a2.d() > 0) {
            return aa.IDLE;
        }
        return aa.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        T t;
        boolean z2;
        long j2;
        long j3;
        long j4;
        long j5;
        Long l2;
        l.d(context, "");
        if (!c.a()) {
            return;
        }
        if (b.a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_FULL)) {
            b.a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_FULL, false);
            return;
        }
        b.a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_DIFF, false);
        if (SettingsManager.a().a("social_should_mention_check_when_warm_start", true) && (System.currentTimeMillis() - com.ss.android.ugc.aweme.im.sdk.relations.data.a.a.f102974a.getLong("key_warm_start_time", 0)) / 1000 >= SettingsManager.a().a("im_mention_check_valid_duration_for_warm_start", 14400L)) {
            com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
            List<IMUser> a2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(SettingsManager.a().a("social_page_count_of_mention_check", 100));
            l.b(a2, "");
            if (!a2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : a2) {
                    String uid = t2.getUid();
                    l.b(uid, "");
                    Long g2 = p.g(uid);
                    if (g2 == null || g2.longValue() <= 0) {
                        String uid2 = t2.getUid();
                        l.b(uid2, "");
                        arrayList2.add(uid2);
                    } else {
                        arrayList.add(g2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    com.ss.android.ugc.aweme.common.r.a("mention_check_params_illegal", new d().a("illegal_uids", j.a(arrayList2)).f66730a);
                }
                try {
                    t = SummonFriendApi.f96818a.batchCheckMentionPrivacy(arrayList.toString(), h.a.n.b(3L, 5L, 6L, 4L).toString(), false, 0).execute().f42630b;
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.im.service.m.a.b("MentionPrivacyUpdate", "Fetch mention privacy batch update info failed, previous success update time is " + com.ss.android.ugc.aweme.im.sdk.relations.data.a.a.f102974a.getLong("key_warm_start_time", 0));
                    e2.printStackTrace();
                    t = null;
                }
                HashMap hashMap = new HashMap();
                if (t != null) {
                    for (T t3 : t.f68760a) {
                        String str = t3.f68756a;
                        HashMap hashMap2 = new HashMap();
                        for (T t4 : t3.f68757b) {
                            hashMap2.put(Long.valueOf(t4.f68758a), Long.valueOf(t4.f68759b));
                        }
                        hashMap.put(str, hashMap2);
                    }
                }
                for (T t5 : a2) {
                    HashMap hashMap3 = (HashMap) hashMap.get(t5.getUid());
                    if (hashMap3 != null) {
                        Long l3 = (Long) hashMap3.get(3L);
                        if ((l3 != null && l3.longValue() == 0) || ((l2 = (Long) hashMap3.get(6L)) != null && l2.longValue() == 0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        t5.setMentionEnabled(z2);
                        Long l4 = (Long) hashMap3.get(3L);
                        if (l4 != null) {
                            j2 = l4.longValue();
                        } else {
                            j2 = 0;
                        }
                        t5.setCommentMentionBlockStatus(j2);
                        Long l5 = (Long) hashMap3.get(4L);
                        if (l5 != null) {
                            j3 = l5.longValue();
                        } else {
                            j3 = 0;
                        }
                        t5.setVideoTagBlockStatus(j3);
                        Long l6 = (Long) hashMap3.get(5L);
                        if (l6 != null) {
                            j4 = l6.longValue();
                        } else {
                            j4 = 0;
                        }
                        t5.setQaInviteBlockStatus(j4);
                        Long l7 = (Long) hashMap3.get(6L);
                        if (l7 != null) {
                            j5 = l7.longValue();
                        } else {
                            j5 = 0;
                        }
                        t5.setVideoMentionBlockStatus(j5);
                    }
                }
                int i2 = 0;
                do {
                    try {
                        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
                        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.b(a2);
                        try {
                            com.ss.android.ugc.aweme.im.sdk.relations.data.a.a.a(1);
                            return;
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        i2++;
                        if (i2 >= 2) {
                        }
                    }
                } while (i2 >= 2);
            }
        }
    }
}

package com.ss.android.ugc.aweme.im.sdk.relations.data.core;

import android.content.ContentValues;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.net.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.FamiliarRelation;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.FamiliarsRelationFetchResponse;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c implements i, j {

    /* renamed from: a  reason: collision with root package name */
    static Map<Integer, a> f103083a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    static volatile boolean f103084b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f103085c;

    /* renamed from: d  reason: collision with root package name */
    private static final com.ss.android.ugc.aweme.im.sdk.relations.data.b.b f103086d = com.ss.android.ugc.aweme.im.sdk.relations.data.b.b.f102978c;

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(183, new g(c.class, "onEvent", f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private c() {
    }

    public static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(66090);
        c cVar = new c();
        f103085c = cVar;
        EventBus.a(EventBus.a(), cVar);
    }

    public static void a() {
        bz unused = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new b(null), 3);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f103087a;

        /* renamed from: b  reason: collision with root package name */
        public int f103088b;

        /* renamed from: c  reason: collision with root package name */
        public int f103089c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f103090d = true;

        static {
            Covode.recordClassIndex(66091);
        }

        public a(int i2) {
            this.f103087a = i2;
        }
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.common.net.f fVar) {
        if (f103084b) {
            a();
            f103084b = false;
        }
    }

    static FamiliarsRelationFetchResponse a(String str) {
        int i2 = 0;
        do {
            try {
                return com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.f103120a.getSpotlightRelationOfFriends(str).get();
            } catch (Throwable unused) {
                i2++;
                if (i2 >= 2) {
                    return null;
                }
            }
        } while (i2 >= 2);
        return null;
    }

    static boolean a(FamiliarRelation familiarRelation) {
        l.d(familiarRelation, "");
        int relationType = familiarRelation.getRelationType();
        List<String> secUserIds = familiarRelation.getSecUserIds();
        l.b(secUserIds, "");
        List<Long> createdTimes = familiarRelation.getCreatedTimes();
        if (createdTimes == null) {
            int size = familiarRelation.getSecUserIds().size();
            Long[] lArr = new Long[size];
            for (int i2 = 0; i2 < size; i2++) {
                lArr[i2] = 0L;
            }
            createdTimes = h.a.i.j(lArr);
        }
        com.ss.android.ugc.aweme.im.sdk.relations.data.b.a aVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.b.a(relationType, secUserIds, createdTimes);
        int i3 = 0;
        do {
            try {
                com.ss.android.ugc.aweme.im.sdk.common.data.b.c.a.a();
                if (aVar.getSecUserIds().size() == 0) {
                    return true;
                }
                List<String> secUserIds2 = aVar.getSecUserIds();
                List<Long> createdTimes2 = aVar.getCreatedTimes();
                if (secUserIds2.size() != createdTimes2.size()) {
                    com.ss.android.ugc.aweme.im.service.m.a.e("FriendsRelationDao", "sec user and created time not match");
                    return true;
                }
                com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b.a().b();
                int relationType2 = aVar.getRelationType();
                for (int i4 = 0; i4 < aVar.getSecUserIds().size(); i4++) {
                    String str = secUserIds2.get(i4);
                    long longValue = createdTimes2.get(i4).longValue();
                    if (str != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a.COLUMN_RELATION_TYPE.key, Integer.valueOf(relationType2));
                        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a.COLUMN_SEC_UID.key, str);
                        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a.COLUMN_CREATED_TIME.key, Long.valueOf(longValue));
                        com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b.a().a("FRIENDS_RELATION", contentValues);
                    }
                }
                com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b.a().c();
                return true;
            } catch (Throwable unused) {
                i3++;
                if (i3 >= 2) {
                    return false;
                }
            }
        } while (i3 >= 2);
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements m<am, d<? super z>, Object> {
        int label;

        static {
            Covode.recordClassIndex(66092);
        }

        b(d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            List<FamiliarRelation> relations;
            boolean z;
            if (this.label == 0) {
                h.r.a(obj);
                n a2 = n.a();
                l.b(a2, "");
                if (System.currentTimeMillis() - a2.f102428a.getLong("last_friends_relation_fetch_time", 0) >= ((long) (com.ss.android.ugc.aweme.im.sdk.relations.data.b.b.f102976a * 1000))) {
                    com.bytedance.ies.ugc.appcontext.d.a();
                    if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                        com.ss.android.ugc.aweme.lancet.j.f107229h = c.b();
                    }
                    if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                        c.f103084b = true;
                    } else {
                        c.f103083a.clear();
                        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.a.a();
                        com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b.a().c("FRIENDS_RELATION");
                        com.ss.android.ugc.aweme.im.sdk.relations.data.b.d[] dVarArr = com.ss.android.ugc.aweme.im.sdk.relations.data.b.b.f102977b;
                        if (dVarArr == null) {
                            l.b();
                        }
                        for (com.ss.android.ugc.aweme.im.sdk.relations.data.b.d dVar : dVarArr) {
                            c.f103083a.put(Integer.valueOf(dVar.f102994a), new a(dVar.f102994a));
                        }
                        while (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a()) {
                            JSONArray jSONArray = new JSONArray();
                            for (Map.Entry<Integer, a> entry : c.f103083a.entrySet()) {
                                a value = entry.getValue();
                                if (value.f103090d) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("relation_type", value.f103087a);
                                    jSONObject.put("count", value.f103088b);
                                    jSONObject.put("cursor", value.f103089c);
                                    jSONArray.put(jSONObject);
                                }
                            }
                            String jSONArray2 = jSONArray.toString();
                            l.b(jSONArray2, "");
                            FamiliarsRelationFetchResponse a3 = c.a(jSONArray2);
                            if (a3 != null && (relations = a3.getRelations()) != null) {
                                boolean z2 = false;
                                for (FamiliarRelation familiarRelation : relations) {
                                    l.b(familiarRelation, "");
                                    if (c.a(familiarRelation)) {
                                        a aVar = c.f103083a.get(Integer.valueOf(familiarRelation.getRelationType()));
                                        if (aVar != null) {
                                            if (familiarRelation.getHasMore() == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            aVar.f103090d = z;
                                            aVar.f103089c = familiarRelation.getNextCursor();
                                        }
                                        if (familiarRelation.getHasMore() == 1) {
                                            z2 = true;
                                        }
                                    }
                                }
                                if (!z2) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        n a4 = n.a();
                        l.b(a4, "");
                        a4.f102428a.edit().putLong("last_friends_relation_fetch_time", System.currentTimeMillis()).commit();
                    }
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

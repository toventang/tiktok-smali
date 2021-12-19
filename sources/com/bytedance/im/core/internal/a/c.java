package com.bytedance.im.core.internal.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.c.i;
import com.bytedance.im.core.d.ad;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.aq;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.l;
import com.bytedance.im.core.internal.a.a.b;
import com.bytedance.im.core.internal.a.c.a;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.internal.utils.s;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c {
    static {
        Covode.recordClassIndex(22874);
    }

    public static List<String> a(boolean z) {
        Throwable th;
        a aVar;
        ArrayList arrayList;
        Exception e2;
        a aVar2 = null;
        ArrayList arrayList2 = null;
        f.b("imsdk", "IMConversationDao getAllConversationIds, stranger:".concat(String.valueOf(z)), (Throwable) null);
        try {
            aVar = b.a("select " + a.COLUMN_ID.key + " from conversation_list where " + a.COLUMN_STRANGER.key + "=" + (z ? 1 : 0), (String[]) null);
            if (aVar != null) {
                try {
                    arrayList = new ArrayList();
                    while (aVar.d()) {
                        try {
                            arrayList.add(aVar.c(aVar.a(a.COLUMN_ID.key)));
                        } catch (Exception e3) {
                            e2 = e3;
                            try {
                                f.b("imsdk", "IMConversationDao getAllConversationIds ".concat(String.valueOf(e2)), (Throwable) null);
                                e.a(e2);
                                com.bytedance.im.core.internal.a.a.a.a(aVar);
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar;
                                com.bytedance.im.core.internal.a.a.a.a(aVar2);
                                throw th;
                            }
                        }
                    }
                    arrayList2 = arrayList;
                } catch (Exception e4) {
                    e2 = e4;
                    arrayList = null;
                    f.b("imsdk", "IMConversationDao getAllConversationIds ".concat(String.valueOf(e2)), (Throwable) null);
                    e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return arrayList;
                }
            }
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return arrayList2;
        } catch (Exception e5) {
            e2 = e5;
            aVar = null;
            arrayList = null;
            f.b("imsdk", "IMConversationDao getAllConversationIds ".concat(String.valueOf(e2)), (Throwable) null);
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
    }

    public static boolean a(String str, long j2, long j3) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        j.c("IMConversationDao updateConversationMinIndex, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.COLUMN_MIN_INDEX.key, Long.valueOf(j2));
            contentValues.put(a.COLUMN_MIN_INDEX_V2.key, Long.valueOf(j3));
            if (b.a("conversation_list", contentValues, a.COLUMN_ID.key + "=?", new String[]{str}) > 0) {
                z = true;
            }
            com.bytedance.im.core.g.c.a().a("updateConversationMinIndex", currentTimeMillis);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationDao updateConversationMinIndex ", e2);
            e.a(e2);
        }
        return z;
    }

    public static boolean a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        j.c("IMConversationDao setConversationNoMore, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.COLUMN_HAS_MORE.key, (Integer) 0);
            if (b.a("conversation_list", contentValues, a.COLUMN_ID.key + "=? and " + a.COLUMN_HAS_MORE.key + "=?", new String[]{str, "1"}) > 0) {
                z = true;
            }
            com.bytedance.im.core.g.c.a().a("setConversationNoMore", currentTimeMillis);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationDao setConversationNoMore ", e2);
            e.a(e2);
        }
        return z;
    }

    public static boolean a(ai aiVar) {
        boolean z = false;
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            String conversationId = aiVar.getConversationId();
            j.c("IMConversationDao updateLastMsgToConversation:".concat(String.valueOf(conversationId)));
            long currentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(aiVar.getIndex()));
                contentValues.put(a.COLUMN_UPDATE_TIME.key, Long.valueOf(aiVar.getCreatedAt()));
                contentValues.put(a.COLUMN_LAST_MSG_ORDER_INDEX.key, Long.valueOf(aiVar.getOrderIndex()));
                if (b.a("conversation_list", contentValues, a.COLUMN_ID.key + "=?", new String[]{conversationId}) > 0) {
                    z = true;
                }
                com.bytedance.im.core.g.c.a().a("updateLastMsgToConversation", currentTimeMillis);
            } catch (Exception e2) {
                f.b("imsdk", "IMConversationDao updateLastMsgToConversation ", e2);
                e.a(e2);
            }
        }
        return z;
    }

    public static boolean a(String str, long j2, long j3, long j4, int i2, long j5) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        j.c("IMConversationDao updateConversationWhenRecvMsg:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(j3));
            contentValues.put(a.COLUMN_UPDATE_TIME.key, Long.valueOf(j2));
            contentValues.put(a.COLUMN_MAX_INDEX_V2.key, Long.valueOf(j4));
            contentValues.put(a.COLUMN_BADGE_COUNT.key, Integer.valueOf(i2));
            contentValues.put(a.COLUMN_UNREAD_COUNT.key, Long.valueOf(j5));
            if (b.a("conversation_list", contentValues, a.COLUMN_ID.key + "=?", new String[]{str}) > 0) {
                z = true;
            }
            com.bytedance.im.core.g.c.a().a("updateConversationWhenRecvMsg", currentTimeMillis);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationDao updateConversationWhenRecvMsg ", e2);
            e.a(e2);
        }
        return z;
    }

    public static boolean a(h hVar, boolean z) {
        boolean z2 = false;
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            j.c("IMConversationDao updateConversation:" + hVar.getConversationId());
            long currentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues f2 = f(hVar);
                f2.remove(a.COLUMN_ID.key);
                if (TextUtils.isEmpty(hVar.getTicket())) {
                    f2.remove(a.COLUMN_COLUMN_TICKET.key);
                }
                if (hVar.getConversationShortId() <= 0) {
                    f2.remove(a.COLUMN_SHORT_ID.key);
                }
                if (!z) {
                    f2.remove(a.COLUMN_STRANGER.key);
                }
                if (b.a("conversation_list", f2, a.COLUMN_ID.key + "=?", new String[]{hVar.getConversationId()}) > 0) {
                    z2 = true;
                }
                if (hVar.getCoreInfo() != null) {
                    b.a(hVar.getCoreInfo());
                }
                if (hVar.getSettingInfo() != null) {
                    g.a(hVar.getSettingInfo());
                }
                com.bytedance.im.core.internal.a.b.a.a();
                d.a();
                com.bytedance.im.core.g.c.a().a("updateConversation", currentTimeMillis);
            } catch (Exception e2) {
                f.b("imsdk", "IMConversationDao updateConversation ", e2);
                e2.printStackTrace();
                e.a(e2);
            }
        }
        return z2;
    }

    public static boolean a(String str, long j2) {
        if (TextUtils.isEmpty(str) || j2 <= 0) {
            return false;
        }
        j.c("IMConversationDao setConversationTime, cid:" + str + ", updateTime:" + j2);
        return b.b("update conversation_list set " + a.COLUMN_UPDATE_TIME.key + "=" + j2 + " where " + a.COLUMN_ID.key + "=\"" + str + "\"");
    }

    public static boolean a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        j.c("IMConversationDao updateLocalExt, cid:".concat(String.valueOf(str)));
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.COLUMN_LOCAL_INFO.key, com.bytedance.im.core.internal.utils.f.b(map));
        if (b.a("conversation_list", contentValues, a.COLUMN_ID.key + "=?", new String[]{str}) != -1) {
            return true;
        }
        return false;
    }

    public static List<h> a(int i2, int i3, long j2) {
        Throwable th;
        a aVar;
        Exception e2;
        a aVar2 = null;
        f.b("imsdk", "IMConversationDao getStrangerConversations, inbox:" + i2 + ", limit:" + i3 + ", maxUpdateTime:" + j2, (Throwable) null);
        ArrayList arrayList = new ArrayList();
        try {
            String str = "select * from conversation_list where " + a.COLUMN_STRANGER.key + "=1 and " + a.COLUMN_INBOX.key + "=" + i2;
            if (j2 != -1) {
                str = str + " and " + a.COLUMN_UPDATE_TIME.key + "<" + j2;
            }
            aVar = b.a(str + " order by " + a.COLUMN_UPDATE_TIME.key + " desc limit " + i3, (String[]) null);
            if (aVar != null) {
                while (aVar.d()) {
                    try {
                        arrayList.add(a(aVar, true));
                    } catch (Exception e3) {
                        e2 = e3;
                        try {
                            f.b("imsdk", "IMConversationDao getStrangerConversations ".concat(String.valueOf(e2)), (Throwable) null);
                            e2.printStackTrace();
                            e.a(e2);
                            com.bytedance.im.core.internal.a.a.a.a(aVar);
                            return arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2 = aVar;
                            com.bytedance.im.core.internal.a.a.a.a(aVar2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar;
                        com.bytedance.im.core.internal.a.a.a.a(aVar2);
                        throw th;
                    }
                }
            }
            com.bytedance.im.core.internal.a.a.a.a(aVar);
        } catch (Exception e4) {
            e2 = e4;
            aVar = null;
            f.b("imsdk", "IMConversationDao getStrangerConversations ".concat(String.valueOf(e2)), (Throwable) null);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
        return arrayList;
    }

    public static List<h> b() {
        Throwable th;
        a aVar;
        Exception e2;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        a aVar2 = null;
        try {
            String str = "select * from conversation_list where " + a.COLUMN_STRANGER.key + "=0";
            if (com.bytedance.im.core.b.b.b()) {
                str = str + " and " + a.COLUMN_IS_IN_BOX.key + "=0";
            }
            aVar = b.a(str + " order by " + a.COLUMN_UPDATE_TIME.key + " desc;", (String[]) null);
            try {
                if (d.a().b().ab.batchQueryEnableAndQueryLimit != 0) {
                    a(aVar, arrayList);
                } else if (aVar != null) {
                    while (aVar.d()) {
                        arrayList.add(a(aVar, true));
                    }
                }
                com.bytedance.im.core.g.c.a().a("getAllConversation", currentTimeMillis);
                com.bytedance.im.core.internal.a.a.a.a(aVar);
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMConversationDao getAllConversation ".concat(String.valueOf(e2)), (Throwable) null);
                    e2.printStackTrace();
                    e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    j.c("IMConversationDao getAllConversation, count:" + arrayList.size());
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    com.bytedance.im.core.internal.a.a.a.a(aVar2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                com.bytedance.im.core.internal.a.a.a.a(aVar2);
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            aVar = null;
            f.b("imsdk", "IMConversationDao getAllConversation ".concat(String.valueOf(e2)), (Throwable) null);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            j.c("IMConversationDao getAllConversation, count:" + arrayList.size());
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
        j.c("IMConversationDao getAllConversation, count:" + arrayList.size());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r12 != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c() {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.a.c.c():boolean");
    }

    public static List<h> d() {
        Throwable th;
        a aVar;
        Exception e2;
        a aVar2 = null;
        f.b("imsdk", "IMConversationDao getConversationBoxConversations", (Throwable) null);
        ArrayList arrayList = new ArrayList();
        try {
            aVar = b.a("select * from conversation_list where " + a.COLUMN_IS_IN_BOX.key + "=1 order by " + a.COLUMN_UPDATE_TIME.key + " desc", (String[]) null);
            try {
                if (d.a().b().ab.batchQueryEnableAndQueryLimit != 0) {
                    a(aVar, arrayList);
                } else if (aVar != null) {
                    while (aVar.d()) {
                        arrayList.add(a(aVar, true));
                    }
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMConversationDao getConversationBoxConversations ".concat(String.valueOf(e2)), (Throwable) null);
                    e2.printStackTrace();
                    e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    com.bytedance.im.core.internal.a.a.a.a(aVar2);
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            aVar = null;
            f.b("imsdk", "IMConversationDao getConversationBoxConversations ".concat(String.valueOf(e2)), (Throwable) null);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static List<String> a() {
        Throwable th;
        ArrayList arrayList;
        a aVar;
        Exception e2;
        j.c("IMConversationDao getAllConversationId");
        long currentTimeMillis = System.currentTimeMillis();
        a aVar2 = null;
        try {
            aVar = b.a("select " + a.COLUMN_ID.key + " from conversation_list where " + a.COLUMN_STRANGER.key + "=0", (String[]) null);
            if (aVar != null) {
                try {
                    arrayList = new ArrayList();
                    while (aVar.d()) {
                        try {
                            arrayList.add(aVar.c(aVar.a(a.COLUMN_ID.key)));
                        } catch (Exception e3) {
                            e2 = e3;
                            try {
                                f.b("imsdk", "IMConversationDao getAllConversationId ".concat(String.valueOf(e2)), (Throwable) null);
                                e2.printStackTrace();
                                e.a(e2);
                                com.bytedance.im.core.internal.a.a.a.a(aVar);
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar;
                                com.bytedance.im.core.internal.a.a.a.a(aVar2);
                                throw th;
                            }
                        }
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    arrayList = null;
                    f.b("imsdk", "IMConversationDao getAllConversationId ".concat(String.valueOf(e2)), (Throwable) null);
                    e2.printStackTrace();
                    e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return arrayList;
                }
            } else {
                arrayList = null;
            }
            com.bytedance.im.core.g.c.a().a("getAllConversationId", currentTimeMillis);
        } catch (Exception e5) {
            e2 = e5;
            aVar = null;
            arrayList = null;
            f.b("imsdk", "IMConversationDao getAllConversationId ".concat(String.valueOf(e2)), (Throwable) null);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public enum a {
        COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
        COLUMN_SHORT_ID("short_id", "BIGINT"),
        COLUMN_CONVERSATION_TYPE(StringSet.type, "INTEGER"),
        COLUMN_LAST_MSG_INDEX("last_msg_index", "BIGINT"),
        COLUMN_UPDATE_TIME("updated_time", "INTEGER"),
        COLUMN_UNREAD_COUNT("unread_count", "INTEGER"),
        COLUMN_READ_INDEX("read_index", "BIGINT"),
        COLUMN_INBOX("inbox", "INTEGER"),
        COLUMN_MIN_INDEX("min_index", "BIGINT"),
        COLUMN_DRAFT_TIME("drafted_time", "INTEGER"),
        COLUMN_COLUMN_TICKET("ticket", "TEXT"),
        COLUMN_DRAFT_CONTENT("draft_content", "TEXT"),
        COLUMN_LOCAL_INFO("local_info", "TEXT"),
        COLUMN_IS_MEMBER("is_member", "INTEGER"),
        COLUMN_HAS_MORE("has_more", "INTEGER"),
        COLUMN_MEMBER_COUNT("member_count", "INTEGER"),
        COLUMN_STATUS("status", "INTEGER"),
        COLUMN_PARTICIPANT("participant", "TEXT"),
        COLUMN_LAST_MSG_ORDER_INDEX("last_msg_order_index", "BIGINT"),
        COLUMN_STRANGER("stranger", "INTEGER default 0"),
        COLUMN_SORT_ORDER("sort_order", "INTEGER"),
        COLUMN_MIN_INDEX_V2("min_index_v2", "BIGINT"),
        COLUMN_MAX_INDEX_V2("max_index_v2", "BIGINT"),
        COLUMN_READ_INDEX_V2("read_index_v2", "BIGINT"),
        COLUMN_BADGE_COUNT("badge_count", "INTEGER"),
        COLUMN_READ_BADGE_COUNT("read_badge_count", "INTEGER"),
        COLUMN_IS_IN_BOX("is_in_box", "INTEGER DEFAULT 0");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22875);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static boolean c(h hVar) {
        if (hVar == null || TextUtils.isEmpty(hVar.getConversationId())) {
            return false;
        }
        return b(hVar.getConversationId(), d(hVar));
    }

    public static boolean a(h hVar) {
        boolean z = false;
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            j.c("IMConversationDao insertConversation:" + hVar.getConversationId());
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues f2 = f(hVar);
            if (hVar.getCoreInfo() != null) {
                b.a(hVar.getCoreInfo());
            }
            if (hVar.getSettingInfo() != null) {
                g.a(hVar.getSettingInfo());
            }
            if (b.a("conversation_list", f2) >= 0) {
                z = true;
                com.bytedance.im.core.internal.a.b.a.a();
                d.a();
            }
            com.bytedance.im.core.g.c.a().a("insertConversation", currentTimeMillis);
        }
        return z;
    }

    public static long b(String str) {
        long j2 = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        j.c("IMConversationDao getConversationReadIndex, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        a aVar = null;
        try {
            aVar = b.a("select " + a.COLUMN_READ_INDEX.key + " from conversation_list where " + a.COLUMN_ID.key + "=?", new String[]{str});
            if (aVar != null && aVar.c()) {
                j2 = aVar.b(aVar.a(a.COLUMN_READ_INDEX.key));
            }
            com.bytedance.im.core.g.c.a().a("getConversationReadIndex", currentTimeMillis);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationDao getConversationReadIndex ", e2);
            e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return j2;
    }

    public static boolean c(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        a aVar = null;
        try {
            aVar = b.a("select * from conversation_list where " + a.COLUMN_ID.key + "=?", new String[]{str});
            if (aVar.b() > 0) {
                z = true;
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationDao hasLocalConversation ", e2);
            e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        j.c("IMConversationDao hasLocalConversation, cid:" + str + ", result:" + z);
        return z;
    }

    public static long d(h hVar) {
        long max;
        if (d.a().f37567g != null) {
            max = d.a().f37567g.a(hVar);
        } else {
            max = Math.max(hVar.getUpdatedTime(), hVar.getDraftTime());
            if (hVar.isStickTop()) {
                double pow = Math.pow(10.0d, 13.0d);
                double d2 = (double) max;
                Double.isNaN(d2);
                max = (long) (pow + d2);
            }
        }
        if (max <= 0) {
            f.b("IMConversationDao generateConversationSortOrder, sortOrder abnormal: ", String.valueOf(max), (Throwable) null);
        }
        hVar.setSortOrder(max);
        return max;
    }

    public static boolean f(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        f.b("imsdk", "IMConversationDao transferStrangerConversation:".concat(String.valueOf(str)), (Throwable) null);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.COLUMN_STRANGER.key, (Integer) 0);
            if (b.a("conversation_list", contentValues, a.COLUMN_ID.key + "=?", new String[]{str}) > 0) {
                z = true;
            }
            f.b("imsdk", "IMConversationDao transferStrangerConversation, result:".concat(String.valueOf(z)), (Throwable) null);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationDao transferStrangerConversation ", e2);
            e.a(e2);
        }
        return z;
    }

    public static boolean b(h hVar) {
        boolean z = false;
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            String conversationId = hVar.getConversationId();
            j.c("IMConversationDao updateConversationRead, cid:".concat(String.valueOf(conversationId)));
            long currentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.COLUMN_UNREAD_COUNT.key, Long.valueOf(hVar.getUnreadCount()));
                contentValues.put(a.COLUMN_READ_INDEX.key, Long.valueOf(hVar.getReadIndex()));
                contentValues.put(a.COLUMN_READ_INDEX_V2.key, Long.valueOf(hVar.getReadIndexV2()));
                contentValues.put(a.COLUMN_READ_BADGE_COUNT.key, Integer.valueOf(hVar.getReadBadgeCount()));
                Map<String, String> localExt = hVar.getLocalExt();
                if (hVar.getReadBadgeCount() > 0 && !TextUtils.equals(localExt.get("s:read_badge_count_update"), "1")) {
                    localExt.put("s:read_badge_count_update", "1");
                    contentValues.put(a.COLUMN_LOCAL_INFO.key, com.bytedance.im.core.internal.utils.f.b(localExt));
                    f.b("imsdk", "IMConversationDao updateConversationRead, read badge count updated", (Throwable) null);
                }
                if (b.a("conversation_list", contentValues, a.COLUMN_ID.key + "=?", new String[]{conversationId}) > 0) {
                    z = true;
                }
                com.bytedance.im.core.g.c.a().a("updateConversationRead", currentTimeMillis);
            } catch (Exception e2) {
                f.b("imsdk", "IMConversationDao updateConversationRead ", e2);
                e.a(e2);
            }
        }
        return z;
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        j.c("IMConversationDao dissolveConversation:".concat(String.valueOf(str)));
        return b.b("update conversation_list set " + a.COLUMN_STATUS.key + "=1 where " + a.COLUMN_ID.key + "=\"" + str + "\"");
    }

    public static long e(h hVar) {
        if (hVar == null) {
            f.b("imsdk", "IMConversationDao computeUnreadCount conversation invalid", (Throwable) null);
            return 0;
        }
        String conversationId = hVar.getConversationId();
        long readIndex = hVar.getReadIndex();
        long maxIndexV2 = hVar.getMaxIndexV2();
        int readBadgeCount = hVar.getReadBadgeCount();
        int badgeCount = hVar.getBadgeCount();
        if (TextUtils.isEmpty(conversationId)) {
            f.b("imsdk", "IMConversationDao computeUnreadCount cid invalid:".concat(String.valueOf(conversationId)), (Throwable) null);
            return 0;
        }
        s.a();
        if (!s.c()) {
            long d2 = i.d(conversationId, readIndex);
            f.b("imsdk", "IMConversationDao computeUnreadCount cid: +" + conversationId + ", no recent messages, use readIndex, count:" + d2, (Throwable) null);
            return d2;
        }
        f.b("IMConversationDao ", "computeUnreadCount start, cid:" + conversationId + ", readBadgeCount:" + readBadgeCount + ", lastMsgBadgeCount:" + badgeCount, (Throwable) null);
        if (readBadgeCount <= 0 || badgeCount < readBadgeCount) {
            long j2 = d.a().b().ai.baseIndexV2;
            long a2 = i.a(conversationId, readIndex, d.a().b().ai.baseIndexV2);
            if (j2 <= 0 || maxIndexV2 < j2) {
                f.b("imsdk", "IMConversationDao computeUnreadCount use old continue, maxIndexV2:" + maxIndexV2 + ", baseIndexV2:" + j2 + ", count:" + a2, (Throwable) null);
                return a2;
            }
            if (readBadgeCount < 0) {
                readBadgeCount = 0;
            }
            if (badgeCount < readBadgeCount) {
                f.b("imsdk", "IMConversationDao computeUnreadCount badge count invalid, readBadgeCount:" + readBadgeCount + ", lastMsgBadgeCount:" + badgeCount + ", count:" + a2, (Throwable) null);
                new i().a("im_invalid_badge_count").a("conversation_id", hVar.getConversationId()).a("read_index", String.valueOf(hVar.getReadIndex())).a("max_index", String.valueOf(hVar.getLastMessageIndex())).a("read_index_v2", String.valueOf(hVar.getReadIndexV2())).a("max_index_v2", String.valueOf(hVar.getMaxIndexV2())).a("badge_count", Integer.valueOf(hVar.getBadgeCount())).a("read_badge_count", Integer.valueOf(hVar.getReadBadgeCount())).b();
                return a2;
            }
            long j3 = ((long) (badgeCount - readBadgeCount)) + a2;
            f.b("imsdk", "IMConversationDao computeUnreadCount use mix, continuous:" + a2 + ", readBadgeCount:" + readBadgeCount + ", lastMsgBadgeCount:" + badgeCount + ", count:" + j3, (Throwable) null);
            return j3;
        }
        int i2 = badgeCount - readBadgeCount;
        f.b("imsdk", "IMConversationDao computeUnreadCount use badge, count:" + i2, (Throwable) null);
        return (long) i2;
    }

    public static ContentValues f(h hVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.COLUMN_ID.key, com.bytedance.im.core.internal.utils.e.b(hVar.getConversationId()));
        contentValues.put(a.COLUMN_SHORT_ID.key, Long.valueOf(hVar.getConversationShortId()));
        contentValues.put(a.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(hVar.getLastMessageIndex()));
        contentValues.put(a.COLUMN_UPDATE_TIME.key, Long.valueOf(hVar.getUpdatedTime()));
        contentValues.put(a.COLUMN_UNREAD_COUNT.key, Long.valueOf(hVar.getUnreadCount()));
        contentValues.put(a.COLUMN_COLUMN_TICKET.key, com.bytedance.im.core.internal.utils.e.b(hVar.getTicket()));
        contentValues.put(a.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(hVar.getConversationType()));
        contentValues.put(a.COLUMN_DRAFT_TIME.key, Long.valueOf(hVar.getDraftTime()));
        contentValues.put(a.COLUMN_DRAFT_CONTENT.key, com.bytedance.im.core.internal.utils.e.b(hVar.getDraftContent()));
        contentValues.put(a.COLUMN_MIN_INDEX.key, Long.valueOf(hVar.getMinIndex()));
        contentValues.put(a.COLUMN_LOCAL_INFO.key, com.bytedance.im.core.internal.utils.e.b(hVar.getLocalExtStr()));
        contentValues.put(a.COLUMN_READ_INDEX.key, Long.valueOf(hVar.getReadIndex()));
        contentValues.put(a.COLUMN_INBOX.key, Integer.valueOf(hVar.getInboxType()));
        contentValues.put(a.COLUMN_IS_MEMBER.key, Integer.valueOf(hVar.isMember() ? 1 : 0));
        contentValues.put(a.COLUMN_HAS_MORE.key, Integer.valueOf(hVar.hasMore() ? 1 : 0));
        contentValues.put(a.COLUMN_MEMBER_COUNT.key, Integer.valueOf(hVar.getMemberCount()));
        contentValues.put(a.COLUMN_STATUS.key, Integer.valueOf(hVar.getStatus()));
        contentValues.put(a.COLUMN_PARTICIPANT.key, com.bytedance.im.core.internal.utils.e.b(hVar.getMemberStr()));
        contentValues.put(a.COLUMN_LAST_MSG_ORDER_INDEX.key, Long.valueOf(hVar.getLastMessageOrderIndex()));
        contentValues.put(a.COLUMN_STRANGER.key, Integer.valueOf(hVar.isStranger() ? 1 : 0));
        contentValues.put(a.COLUMN_SORT_ORDER.key, Long.valueOf(d(hVar)));
        contentValues.put(a.COLUMN_MIN_INDEX_V2.key, Long.valueOf(hVar.getMinIndexV2()));
        contentValues.put(a.COLUMN_MAX_INDEX_V2.key, Long.valueOf(hVar.getMaxIndexV2()));
        contentValues.put(a.COLUMN_READ_INDEX_V2.key, Long.valueOf(hVar.getReadIndexV2()));
        contentValues.put(a.COLUMN_BADGE_COUNT.key, Integer.valueOf(hVar.getBadgeCount()));
        contentValues.put(a.COLUMN_READ_BADGE_COUNT.key, Integer.valueOf(hVar.getReadBadgeCount()));
        contentValues.put(a.COLUMN_IS_IN_BOX.key, Integer.valueOf(hVar.isInBox() ? 1 : 0));
        return contentValues;
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        j.c("IMConversationDao deleteConversation:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = b.a("conversation_list", a.COLUMN_ID.key + "=?", new String[]{str});
        if (a2) {
            ad.a(str, new aq(new ArrayList()));
            aq aqVar = new aq(new ArrayList());
            com.bytedance.im.core.d.d.f37945a.put(str, aqVar);
            com.bytedance.im.core.internal.e.d.a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0063: INVOKE  
                  (wrap: com.bytedance.im.core.d.d$1 : 0x005b: CONSTRUCTOR  (r4v1 com.bytedance.im.core.d.d$1) = (r1v5 'aqVar' com.bytedance.im.core.d.aq), (r10v0 'str' java.lang.String) call: com.bytedance.im.core.d.d.1.<init>(com.bytedance.im.core.d.aq, java.lang.String):void type: CONSTRUCTOR)
                  (null com.bytedance.im.core.internal.e.b)
                  (wrap: java.util.concurrent.Executor : 0x005f: INVOKE  (r0v12 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.a():java.util.concurrent.Executor)
                 type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b, java.util.concurrent.Executor):void in method: com.bytedance.im.core.internal.a.c.e(java.lang.String):boolean, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005b: CONSTRUCTOR  (r4v1 com.bytedance.im.core.d.d$1) = (r1v5 'aqVar' com.bytedance.im.core.d.aq), (r10v0 'str' java.lang.String) call: com.bytedance.im.core.d.d.1.<init>(com.bytedance.im.core.d.aq, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.a.c.e(java.lang.String):boolean, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.d.d, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 299
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.a.c.e(java.lang.String):boolean");
        }

        public static List<h> a(int i2) {
            Throwable th;
            a aVar;
            Exception e2;
            ArrayList arrayList = new ArrayList();
            a aVar2 = null;
            try {
                aVar = b.a("select * from conversation_list where " + a.COLUMN_STRANGER.key + "=0 order by " + a.COLUMN_UPDATE_TIME.key + " desc limit " + i2 + ";", (String[]) null);
                if (aVar != null) {
                    while (aVar.d()) {
                        try {
                            arrayList.add(a(aVar, true));
                        } catch (Exception e3) {
                            e2 = e3;
                            try {
                                f.b("imsdk", "IMConversationDao getConversationLimit ".concat(String.valueOf(e2)), (Throwable) null);
                                e2.printStackTrace();
                                e.a(e2);
                                com.bytedance.im.core.internal.a.a.a.a(aVar);
                                j.c("IMConversationDao getConversationLimit, limit:" + i2 + ", count:" + arrayList.size());
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar;
                                com.bytedance.im.core.internal.a.a.a.a(aVar2);
                                throw th;
                            }
                        }
                    }
                }
            } catch (Exception e4) {
                e2 = e4;
                aVar = null;
                f.b("imsdk", "IMConversationDao getConversationLimit ".concat(String.valueOf(e2)), (Throwable) null);
                e2.printStackTrace();
                e.a(e2);
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                j.c("IMConversationDao getConversationLimit, limit:" + i2 + ", count:" + arrayList.size());
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                com.bytedance.im.core.internal.a.a.a.a(aVar2);
                throw th;
            }
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            j.c("IMConversationDao getConversationLimit, limit:" + i2 + ", count:" + arrayList.size());
            return arrayList;
        }

        private static void a(a aVar, ArrayList<h> arrayList) {
            b(aVar, arrayList);
        }

        public static List<h> a(int i2, int i3) {
            return a(i2, i3, -1);
        }

        public static h a(String str, boolean z) {
            Throwable th;
            h hVar;
            Exception e2;
            a aVar = null;
            r6 = null;
            h hVar2 = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            j.c("IMConversationDao getConversation, cid:" + str + ", fullInfo:" + z);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                a a2 = b.a("select * from conversation_list where " + a.COLUMN_ID.key + "=?", new String[]{str});
                if (a2 != null) {
                    try {
                        if (a2.c()) {
                            hVar2 = a(a2, z);
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        hVar = null;
                        aVar = a2;
                        try {
                            f.b("imsdk", "IMConversationDao getConversation ", e2);
                            e2.printStackTrace();
                            e.a(e2);
                            com.bytedance.im.core.internal.a.a.a.a(aVar);
                            return hVar;
                        } catch (Throwable th2) {
                            th = th2;
                            com.bytedance.im.core.internal.a.a.a.a(aVar);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aVar = a2;
                        com.bytedance.im.core.internal.a.a.a.a(aVar);
                        throw th;
                    }
                }
                com.bytedance.im.core.g.c.a().a("getConversation:".concat(String.valueOf(z)), currentTimeMillis);
                com.bytedance.im.core.internal.a.a.a.a(a2);
                return hVar2;
            } catch (Exception e4) {
                e2 = e4;
                hVar = null;
                f.b("imsdk", "IMConversationDao getConversation ", e2);
                e2.printStackTrace();
                e.a(e2);
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return hVar;
            }
        }

        private static h a(a aVar, boolean z) {
            boolean z2;
            boolean z3;
            boolean z4;
            if (aVar == null) {
                return null;
            }
            h hVar = new h();
            hVar.setConversationId(aVar.c(aVar.a(a.COLUMN_ID.key)));
            hVar.setConversationShortId(aVar.b(aVar.a(a.COLUMN_SHORT_ID.key)));
            hVar.setUpdatedTime(aVar.b(aVar.a(a.COLUMN_UPDATE_TIME.key)));
            hVar.setUnreadCount((long) aVar.a(aVar.a(a.COLUMN_UNREAD_COUNT.key)));
            hVar.setTicket(aVar.c(aVar.a(a.COLUMN_COLUMN_TICKET.key)));
            hVar.setConversationType(aVar.a(aVar.a(a.COLUMN_CONVERSATION_TYPE.key)));
            hVar.setDraftTime(aVar.b(aVar.a(a.COLUMN_DRAFT_TIME.key)));
            hVar.setDraftContent(aVar.c(aVar.a(a.COLUMN_DRAFT_CONTENT.key)));
            hVar.setMinIndex(aVar.b(aVar.a(a.COLUMN_MIN_INDEX.key)));
            hVar.setLocalExtStr(aVar.c(aVar.a(a.COLUMN_LOCAL_INFO.key)));
            hVar.setReadIndex(aVar.b(aVar.a(a.COLUMN_READ_INDEX.key)));
            hVar.setLastMessageIndex(aVar.b(aVar.a(a.COLUMN_LAST_MSG_INDEX.key)));
            hVar.setInboxType(aVar.a(aVar.a(a.COLUMN_INBOX.key)));
            boolean z5 = false;
            if (aVar.a(aVar.a(a.COLUMN_IS_MEMBER.key)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            hVar.setIsMember(z2);
            if (aVar.a(aVar.a(a.COLUMN_HAS_MORE.key)) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            hVar.setHasMore(z3);
            hVar.setMemberCount(aVar.a(aVar.a(a.COLUMN_MEMBER_COUNT.key)));
            hVar.setStatus(aVar.a(aVar.a(a.COLUMN_STATUS.key)));
            hVar.setMemberStr(aVar.c(aVar.a(a.COLUMN_PARTICIPANT.key)));
            hVar.setLastMessageOrderIndex(aVar.b(aVar.a(a.COLUMN_LAST_MSG_ORDER_INDEX.key)));
            if (aVar.a(aVar.a(a.COLUMN_STRANGER.key)) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            hVar.setStranger(z4);
            hVar.setSortOrder(aVar.b(aVar.a(a.COLUMN_SORT_ORDER.key)));
            hVar.setMinIndexV2(aVar.b(aVar.a(a.COLUMN_MIN_INDEX_V2.key)));
            hVar.setMaxIndexV2(aVar.b(aVar.a(a.COLUMN_MAX_INDEX_V2.key)));
            hVar.setReadIndexV2(aVar.b(aVar.a(a.COLUMN_READ_INDEX_V2.key)));
            hVar.setBadgeCount(aVar.a(aVar.a(a.COLUMN_BADGE_COUNT.key)));
            hVar.setReadBadgeCount(aVar.a(aVar.a(a.COLUMN_READ_BADGE_COUNT.key)));
            if (aVar.a(aVar.a(a.COLUMN_IS_IN_BOX.key)) == 1) {
                z5 = true;
            }
            hVar.setInBox(z5);
            if (z) {
                hVar.setMemberIds(e.a(hVar.getConversationId()));
                if (hVar.getConversationType() == e.a.f37581a) {
                    hVar.setSingleChatMembers(e.b(hVar.getConversationId()));
                }
                hVar.setLastMessage(i.h(hVar.getConversationId()));
                hVar.setCoreInfo(b.a(hVar.getConversationId()));
                hVar.setSettingInfo(g.a(hVar.getConversationId()));
                hVar.setUnreadSelfMentionedMessages(h.a(hVar.getConversationId(), hVar.getReadIndex()));
            }
            return hVar;
        }

        private static void b(a aVar, ArrayList<h> arrayList) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (aVar != null) {
                int a2 = aVar.a(a.COLUMN_ID.key);
                int a3 = aVar.a(a.COLUMN_SHORT_ID.key);
                int a4 = aVar.a(a.COLUMN_UPDATE_TIME.key);
                int a5 = aVar.a(a.COLUMN_UNREAD_COUNT.key);
                int a6 = aVar.a(a.COLUMN_COLUMN_TICKET.key);
                int a7 = aVar.a(a.COLUMN_CONVERSATION_TYPE.key);
                int a8 = aVar.a(a.COLUMN_DRAFT_TIME.key);
                int a9 = aVar.a(a.COLUMN_DRAFT_CONTENT.key);
                int a10 = aVar.a(a.COLUMN_MIN_INDEX.key);
                int a11 = aVar.a(a.COLUMN_LOCAL_INFO.key);
                int a12 = aVar.a(a.COLUMN_READ_INDEX.key);
                int a13 = aVar.a(a.COLUMN_LAST_MSG_INDEX.key);
                int a14 = aVar.a(a.COLUMN_INBOX.key);
                int a15 = aVar.a(a.COLUMN_IS_MEMBER.key);
                int a16 = aVar.a(a.COLUMN_HAS_MORE.key);
                int a17 = aVar.a(a.COLUMN_MEMBER_COUNT.key);
                int a18 = aVar.a(a.COLUMN_STATUS.key);
                int a19 = aVar.a(a.COLUMN_PARTICIPANT.key);
                int a20 = aVar.a(a.COLUMN_LAST_MSG_ORDER_INDEX.key);
                int a21 = aVar.a(a.COLUMN_STRANGER.key);
                int a22 = aVar.a(a.COLUMN_SORT_ORDER.key);
                int a23 = aVar.a(a.COLUMN_MIN_INDEX_V2.key);
                int a24 = aVar.a(a.COLUMN_MAX_INDEX_V2.key);
                int a25 = aVar.a(a.COLUMN_READ_INDEX_V2.key);
                int a26 = aVar.a(a.COLUMN_BADGE_COUNT.key);
                int a27 = aVar.a(a.COLUMN_READ_BADGE_COUNT.key);
                int a28 = aVar.a(a.COLUMN_IS_IN_BOX.key);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashMap hashMap = new HashMap();
                if (d.a().b().ab.fullInfoOptimizeEnable == 1) {
                    z = true;
                } else {
                    z = false;
                }
                while (true) {
                    arrayList = arrayList;
                    if (!aVar.d()) {
                        break;
                    }
                    h hVar = new h();
                    String c2 = aVar.c(a2);
                    hVar.setConversationId(c2);
                    hVar.setConversationShortId(aVar.b(a3));
                    hVar.setUpdatedTime(aVar.b(a4));
                    hVar.setUnreadCount((long) aVar.a(a5));
                    hVar.setTicket(aVar.c(a6));
                    hVar.setConversationType(aVar.a(a7));
                    hVar.setDraftTime(aVar.b(a8));
                    hVar.setDraftContent(aVar.c(a9));
                    hVar.setMinIndex(aVar.b(a10));
                    try {
                        hVar.setLocalExtStr(aVar.c(a11));
                    } catch (Throwable th) {
                        f.b("imsdk", "IMConversationDao setLocalExtStr error", th);
                        com.bytedance.im.core.g.b.a(aVar.c(a11), th);
                    }
                    hVar.setReadIndex(aVar.b(a12));
                    hVar.setLastMessageIndex(aVar.b(a13));
                    hVar.setInboxType(aVar.a(a14));
                    if (aVar.a(a15) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hVar.setIsMember(z2);
                    if (aVar.a(a16) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    hVar.setHasMore(z3);
                    hVar.setMemberCount(aVar.a(a17));
                    hVar.setStatus(aVar.a(a18));
                    hVar.setMemberStr(aVar.c(a19));
                    hVar.setLastMessageOrderIndex(aVar.b(a20));
                    if (aVar.a(a21) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    hVar.setStranger(z4);
                    hVar.setSortOrder(aVar.b(a22));
                    hVar.setMinIndexV2(aVar.b(a23));
                    hVar.setMaxIndexV2(aVar.b(a24));
                    hVar.setReadIndexV2(aVar.b(a25));
                    hVar.setBadgeCount(aVar.a(a26));
                    hVar.setReadBadgeCount(aVar.a(a27));
                    if (aVar.a(a28) == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    hVar.setInBox(z5);
                    if (!z) {
                        hVar.setMemberIds(e.a(c2));
                        if (hVar.getConversationType() == e.a.f37581a) {
                            hVar.setSingleChatMembers(e.b(c2));
                        }
                        hVar.setLastMessage(i.h(c2));
                        hVar.setCoreInfo(b.a(c2));
                        hVar.setSettingInfo(g.a(c2));
                        hVar.setUnreadSelfMentionedMessages(h.a(c2, hVar.getReadIndex()));
                    }
                    arrayList2.add(c2);
                    if (hVar.getConversationType() == e.a.f37581a) {
                        arrayList3.add(c2);
                    }
                    hashMap.put(c2, Long.valueOf(hVar.getReadIndex()));
                    arrayList.add(hVar);
                }
                if (!arrayList2.isEmpty() && z) {
                    Map<String, List<Long>> a29 = e.a(arrayList2);
                    Map<String, List<ah>> b2 = e.b(arrayList3);
                    Map<String, com.bytedance.im.core.d.i> a30 = b.a(arrayList2);
                    Map<String, l> a31 = g.a(arrayList2);
                    Map<String, List<ai>> a32 = h.a(arrayList2, hashMap);
                    Iterator<h> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h next = it.next();
                        String conversationId = next.getConversationId();
                        if (a29 != null && !a29.isEmpty()) {
                            next.setMemberIds(a29.get(conversationId));
                        }
                        if (b2 != null && !b2.isEmpty() && next.getConversationType() == e.a.f37581a) {
                            next.setSingleChatMembers(b2.get(conversationId));
                        }
                        next.setLastMessage(i.h(next.getConversationId()));
                        if (a30 != null && !a30.isEmpty()) {
                            next.setCoreInfo(a30.get(conversationId));
                        }
                        if (a31 != null && !a31.isEmpty()) {
                            next.setSettingInfo(a31.get(conversationId));
                        }
                        if (a32 != null && !a32.isEmpty()) {
                            next.setUnreadSelfMentionedMessages(a32.get(conversationId));
                        }
                    }
                }
            }
        }

        public static boolean b(String str, long j2) {
            j.c("IMConversationDao setConversationSortOrder".concat(String.valueOf(str)));
            return b.b("update conversation_list set " + a.COLUMN_SORT_ORDER.key + "=" + j2 + " where " + a.COLUMN_ID.key + "=\"" + str + "\"");
        }
    }

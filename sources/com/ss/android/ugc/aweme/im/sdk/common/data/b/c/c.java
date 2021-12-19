package com.ss.android.ugc.aweme.im.sdk.common.data.b.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b;
import com.ss.android.ugc.aweme.im.sdk.relations.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f102491a;

    static {
        Covode.recordClassIndex(65625);
    }

    private c() {
    }

    public static void a(List<IMUser> list) {
        if (!(list == null || list.isEmpty())) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                a(list.get(i2));
            }
            b.a().b();
            for (IMUser iMUser : list) {
                if (iMUser != null && !IMUser.isInvalidUser(iMUser.getUid())) {
                    ContentValues a2 = a(iMUser, true);
                    if (iMUser.getFriendRecType() == 0 || g.b(iMUser.getUid(), iMUser.getSecUid()) == null) {
                        b.a().a("SIMPLE_USER", a2);
                    } else {
                        b.a().a("SIMPLE_USER", a2, com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UID.key + "=?", new String[]{iMUser.getUid()});
                    }
                }
            }
            b.a().c();
        }
    }

    private static void a(IMUser iMUser) {
        String c2 = a.c(iMUser.getDisplayName());
        iMUser.setSortWeight(com.ss.android.ugc.aweme.im.sdk.relations.b.b.b(c2));
        iMUser.setInitialLetter(com.ss.android.ugc.aweme.im.sdk.relations.b.b.a(c2));
        try {
            iMUser.setAvatarStr(j.a(iMUser.getAvatarThumb()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (0 == 0) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> a(java.util.List<java.lang.String> r5, int r6, int r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(java.util.List, int, int, java.lang.String):java.util.List");
    }

    public static void g() {
        b.a().c("SIMPLE_USER");
    }

    public static String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key).append(" == 2");
        return sb.toString();
    }

    public static String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key).append(" != 0");
        return sb.toString();
    }

    public static c a() {
        MethodCollector.i(4760);
        if (f102491a == null) {
            synchronized (c.class) {
                try {
                    if (f102491a == null) {
                        f102491a = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4760);
                    throw th;
                }
            }
        }
        c cVar = f102491a;
        MethodCollector.o(4760);
        return cVar;
    }

    public static String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key).append(" == 2");
        sb.append(" and ");
        sb.append(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_SHARE_STATUS.key).append(" != 2");
        return sb.toString();
    }

    public static String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key).append(" == 1");
        sb.append(" and ");
        sb.append(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_SHARE_STATUS.key).append(" != 2");
        return sb.toString();
    }

    public static boolean h() {
        boolean z = true;
        Cursor cursor = null;
        try {
            Cursor b2 = b.a().b("select * from SIMPLE_USER");
            if (b2 != null) {
                if (b2.getCount() != 0) {
                    z = false;
                }
                b2.close();
                return z;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (0 != 0) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
        return true;
    }

    public static int j() {
        Cursor cursor = null;
        try {
            Cursor b2 = b.a().b("select * from SIMPLE_USER where " + com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key + " != 0");
            if (b2 == null) {
                return 0;
            }
            int count = b2.getCount();
            try {
                b2.close();
            } catch (Exception unused) {
            }
            return count;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.im.service.m.a.a(e2);
            if (0 == 0) {
                return 0;
            }
            try {
                cursor.close();
                return 0;
            } catch (Exception unused2) {
                return 0;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public static int i() {
        Cursor cursor = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("select * from SIMPLE_USER");
            sb.append(" where ").append(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key).append(" != -1");
            sb.append(" and ");
            sb.append(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_SHARE_STATUS.key).append(" != 2");
            Cursor b2 = b.a().b(sb.toString());
            if (b2 == null) {
                return 0;
            }
            int count = b2.getCount();
            try {
                b2.close();
            } catch (Exception unused) {
            }
            return count;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.im.service.m.a.a(e2);
            if (0 == 0) {
                return 0;
            }
            try {
                cursor.close();
                return 0;
            } catch (Exception unused2) {
                return 0;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public static int k() {
        Cursor cursor = null;
        try {
            String str = "select * from SIMPLE_USER where " + com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key + " == 2";
            CharSequence b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b();
            if (!TextUtils.isEmpty(b2)) {
                str = str + " and " + com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UID.key + " != " + ((Object) b2);
            }
            Cursor b3 = b.a().b(str);
            if (b3 == null) {
                return 0;
            }
            int count = b3.getCount();
            try {
                b3.close();
            } catch (Exception unused) {
            }
            return count;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.im.service.m.a.a(e2);
            if (0 == 0) {
                return 0;
            }
            try {
                cursor.close();
                return 0;
            } catch (Exception unused2) {
                return 0;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists SIMPLE_USER (");
        com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b[] values = com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.values();
        for (com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b bVar : values) {
            sb.append(bVar.key).append(" ").append(bVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r1 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r1 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.im.service.model.IMUser a(java.lang.String r3) {
        /*
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r0 = "select * from SIMPLE_USER where "
            r1.<init>(r0)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b r0 = com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UID     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r0 = " = "
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b r0 = com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b.a()     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            android.database.Cursor r1 = r0.b(r1)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            if (r1 == 0) goto L_0x0038
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x0036 }
            if (r0 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = a(r1)     // Catch:{ Exception -> 0x0036 }
            r1.close()
            return r0
        L_0x0036:
            r0 = move-exception
            goto L_0x0040
        L_0x0038:
            if (r1 == 0) goto L_0x0050
            goto L_0x004d
        L_0x003b:
            r0 = move-exception
            r1 = r2
            goto L_0x0045
        L_0x003e:
            r0 = move-exception
            r1 = r2
        L_0x0040:
            r0.printStackTrace()     // Catch:{ all -> 0x0044 }
            goto L_0x004b
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()
        L_0x004a:
            throw r0
        L_0x004b:
            if (r1 == 0) goto L_0x0050
        L_0x004d:
            r1.close()
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(java.lang.String):com.ss.android.ugc.aweme.im.service.model.IMUser");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.im.service.model.IMUser b(java.lang.String r3) {
        /*
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r0 = "select * from SIMPLE_USER where "
            r1.<init>(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b r0 = com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SEC_UID     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r0 = "='"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.StringBuilder r1 = r0.append(r3)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b r0 = com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b.a()     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            android.database.Cursor r1 = r0.b(r1)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x003c }
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = a(r1)     // Catch:{ Exception -> 0x003c }
            r1.close()
            return r0
        L_0x003c:
            r0 = move-exception
            goto L_0x0046
        L_0x003e:
            if (r1 == 0) goto L_0x0056
            goto L_0x0053
        L_0x0041:
            r0 = move-exception
            r1 = r2
            goto L_0x004b
        L_0x0044:
            r0 = move-exception
            r1 = r2
        L_0x0046:
            r0.printStackTrace()     // Catch:{ all -> 0x004a }
            goto L_0x0051
        L_0x004a:
            r0 = move-exception
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()
        L_0x0050:
            throw r0
        L_0x0051:
            if (r1 == 0) goto L_0x0056
        L_0x0053:
            r1.close()
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.b(java.lang.String):com.ss.android.ugc.aweme.im.service.model.IMUser");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (0 == 0) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> c(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.c(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (0 == 0) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> a(int r5) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0033 }
            r2.<init>()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r0 = "select * from SIMPLE_USER limit 0,"
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch:{ Exception -> 0x0033 }
            r0.append(r5)     // Catch:{ Exception -> 0x0033 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b r1 = com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b.a()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0033 }
            android.database.Cursor r3 = r1.b(r0)     // Catch:{ Exception -> 0x0033 }
            if (r3 == 0) goto L_0x0030
        L_0x0022:
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x0033 }
            if (r0 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = a(r3)     // Catch:{ Exception -> 0x0033 }
            r4.add(r0)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0022
        L_0x0030:
            if (r3 == 0) goto L_0x0044
            goto L_0x0041
        L_0x0033:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            r0 = move-exception
            if (r3 == 0) goto L_0x003e
            r3.close()
        L_0x003e:
            throw r0
        L_0x003f:
            if (r3 == 0) goto L_0x0044
        L_0x0041:
            r3.close()
        L_0x0044:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (0 == 0) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> d(java.util.List<java.lang.String> r5) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.d(java.util.List):java.util.List");
    }

    public static void b(List<IMUser> list) {
        if (!(list == null || list.isEmpty())) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                a(list.get(i2));
            }
            b.a().b();
            for (IMUser iMUser : list) {
                if (iMUser != null && !IMUser.isInvalidUser(iMUser.getUid())) {
                    iMUser.getUniqueId();
                    iMUser.isMentionEnabled();
                    ContentValues a2 = a(iMUser, false);
                    if (iMUser.getFriendRecType() == 0 || g.b(iMUser.getUid(), iMUser.getSecUid()) == null) {
                        b.a().a("SIMPLE_USER", a2);
                    } else {
                        b.a().a("SIMPLE_USER", a2, com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UID.key + "=?", new String[]{iMUser.getUid()});
                    }
                }
            }
            b.a().c();
        }
    }

    public static void c(List<IMUser> list) {
        if (!(list == null || list.isEmpty())) {
            b.a().b();
            for (IMUser iMUser : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UID.key, iMUser.getUid());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SEC_UID.key, iMUser.getSecUid());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_NICK_NAME.key, iMUser.getNickName());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SIGNATURE.key, iMUser.getSignature());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(iMUser.getFollowStatus()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UNIQUE_ID.key, iMUser.getUniqueId());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_WEIBO_VERIFY.key, iMUser.getWeiboVerify());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CUSTOM_VERIFY.key, iMUser.getCustomVerify());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_ENTERPRISE_VERIFY_REASON.key, iMUser.getEnterpriseVerifyReason());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(iMUser.getVerificationType()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_REMARK_NAME.key, iMUser.getRemarkName());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(iMUser.getCommerceUserLevel()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CONTACT_NAME.key, iMUser.getContactName());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CONTACT_NAME_PINYIN.key, iMUser.getContactNamePinyin());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CONTACT_NAME_INITIAL.key, iMUser.getContactNameInitial());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_SHARE_STATUS.key, Integer.valueOf(iMUser.getShareStatus()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_FRIEND_REC_TYPE.key, Integer.valueOf(iMUser.getFriendRecType()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_FOLLOW_TIME.key, Long.valueOf(iMUser.getFollowTime()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_MENTION_ENABLED.key, Integer.valueOf(!iMUser.isMentionEnabled()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_QA_INVITE_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getQaInviteBlockStatus()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_VIDEO_MENTION_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getVideoMentionBlockStatus()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_VIDEO_TAG_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getVideoTagBlockStatus()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_COMMENT_MENTION_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getCommentMentionBlockStatus()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOWER_STATUS.key, Integer.valueOf(iMUser.getFollowerStatus()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_ACCOUNT_TYPE.key, Integer.valueOf(iMUser.getAccountType()));
                if (iMUser.getFriendRecTime() > 0) {
                    contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_FRIEND_REC_TIME.key, Long.valueOf(iMUser.getFriendRecTime()));
                }
                b.a().a("SIMPLE_USER", contentValues, com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UID.key + "=?", new String[]{iMUser.getUid()});
            }
            b.a().c();
        }
    }

    private static IMUser a(Cursor cursor) {
        boolean z;
        if (cursor == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UID.key)));
        iMUser.setSecUid(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SEC_UID.key)));
        iMUser.setNickName(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_NICK_NAME.key)));
        iMUser.setSignature(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SIGNATURE.key)));
        iMUser.setAvatarStr(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_AVATAR_THUMB.key)));
        iMUser.setFollowStatus(cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key)));
        iMUser.setUniqueId(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UNIQUE_ID.key)));
        iMUser.setWeiboVerify(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_WEIBO_VERIFY.key)));
        iMUser.setCustomVerify(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CUSTOM_VERIFY.key)));
        iMUser.setEnterpriseVerifyReason(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_ENTERPRISE_VERIFY_REASON.key)));
        iMUser.setVerificationType(cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_VERIFICATION_TYPE.key)));
        iMUser.setRemarkName(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_REMARK_NAME.key)));
        iMUser.setSortWeight(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SORT_WEIGHT.key)));
        iMUser.setInitialLetter(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_INITIAL_LETTER.key)));
        iMUser.setShortId(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SHORT_ID.key)));
        iMUser.setRemarkPinyin(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_REMARK_PINYIN.key)));
        iMUser.setRemarkInitial(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_REMARK_INITIAL.key)));
        iMUser.setNickNamePinyin(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_NICK_NAME_PINYIN.key)));
        iMUser.setNickNameInitial(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_NICK_NAME_INITIAL.key)));
        iMUser.setCommerceUserLevel(cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_COMMERCE_USER_LEVEL.key)));
        iMUser.setContactName(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CONTACT_NAME.key)));
        iMUser.setContactNamePinyin(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CONTACT_NAME_PINYIN.key)));
        iMUser.setContactNameInitial(cursor.getString(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CONTACT_NAME_INITIAL.key)));
        iMUser.setShareStatus(cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_SHARE_STATUS.key)));
        iMUser.setFriendRecType(cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_FRIEND_REC_TYPE.key)));
        iMUser.setFriendRecTime(cursor.getLong(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_FRIEND_REC_TIME.key)));
        iMUser.setFollowTime(cursor.getLong(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_FOLLOW_TIME.key)));
        boolean z2 = false;
        if (cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_BLOCK_STATUS.key)) == 1) {
            z = true;
        } else {
            z = false;
        }
        iMUser.setBlock(z);
        if (cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_MENTION_ENABLED.key)) == 0) {
            z2 = true;
        }
        iMUser.setMentionEnabled(z2);
        iMUser.setQaInviteBlockStatus((long) cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_QA_INVITE_BLOCK_STATUS.key)));
        iMUser.setVideoMentionBlockStatus((long) cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_VIDEO_MENTION_BLOCK_STATUS.key)));
        iMUser.setVideoTagBlockStatus((long) cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_VIDEO_TAG_BLOCK_STATUS.key)));
        iMUser.setCommentMentionBlockStatus((long) cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_COMMENT_MENTION_BLOCK_STATUS.key)));
        iMUser.setFollowerStatus(cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOWER_STATUS.key)));
        iMUser.setAccountType(cursor.getInt(cursor.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_ACCOUNT_TYPE.key)));
        return iMUser;
    }

    private static ContentValues a(IMUser iMUser, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UID.key, iMUser.getUid());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SEC_UID.key, iMUser.getSecUid());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_NICK_NAME.key, iMUser.getNickName());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SIGNATURE.key, iMUser.getSignature());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_AVATAR_THUMB.key, iMUser.getAvatarStr());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(iMUser.getFollowStatus()));
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_UNIQUE_ID.key, iMUser.getUniqueId());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_WEIBO_VERIFY.key, iMUser.getWeiboVerify());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CUSTOM_VERIFY.key, iMUser.getCustomVerify());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_ENTERPRISE_VERIFY_REASON.key, iMUser.getEnterpriseVerifyReason());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(iMUser.getVerificationType()));
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_REMARK_NAME.key, iMUser.getRemarkName());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SORT_WEIGHT.key, iMUser.getSortWeight());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_INITIAL_LETTER.key, iMUser.getInitialLetter());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_SHORT_ID.key, iMUser.getShortId());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_REMARK_PINYIN.key, iMUser.getRemarkPinyin());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_REMARK_INITIAL.key, iMUser.getRemarkInitial());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_NICK_NAME_PINYIN.key, iMUser.getNickNamePinyin());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_NICK_NAME_INITIAL.key, iMUser.getNickNameInitial());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(iMUser.getCommerceUserLevel()));
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CONTACT_NAME.key, iMUser.getContactName());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CONTACT_NAME_PINYIN.key, iMUser.getContactNamePinyin());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_CONTACT_NAME_INITIAL.key, iMUser.getContactNameInitial());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_SHARE_STATUS.key, Integer.valueOf(iMUser.getShareStatus()));
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_FRIEND_REC_TYPE.key, Integer.valueOf(iMUser.getFriendRecType()));
        if (iMUser.getFriendRecTime() > 0) {
            contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_FRIEND_REC_TIME.key, Long.valueOf(iMUser.getFriendRecTime()));
        }
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_USER_FOLLOW_TIME.key, Long.valueOf(iMUser.getFollowTime()));
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_BLOCK_STATUS.key, Integer.valueOf(iMUser.isBlock() ? 1 : 0));
        if (z) {
            contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_MENTION_ENABLED.key, Integer.valueOf(!iMUser.isMentionEnabled()));
            contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_QA_INVITE_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getQaInviteBlockStatus()));
            contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_VIDEO_MENTION_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getVideoMentionBlockStatus()));
            contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_VIDEO_TAG_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getVideoTagBlockStatus()));
            contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_COMMENT_MENTION_BLOCK_STATUS.key, Integer.valueOf((int) iMUser.getCommentMentionBlockStatus()));
            contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_FOLLOWER_STATUS.key, Integer.valueOf(iMUser.getFollowerStatus()));
        }
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.common.data.b.b.b.COLUMN_ACCOUNT_TYPE.key, Integer.valueOf(iMUser.getAccountType()));
        return contentValues;
    }

    public static List<IMUser> a(List<String> list, int i2, int i3) {
        return a("sec_uid", list, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (0 == 0) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> a(java.lang.String r6, java.util.List<java.lang.String> r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(java.lang.String, java.util.List, int, int):java.util.List");
    }
}

package com.bytedance.im.core.internal.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.c;
import com.bytedance.im.core.internal.a.a.b;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(22864);
    }

    public static String c() {
        return "create index attchment_index on attchment(" + EnumC0922a.COLUMN_UUID.key + ")";
    }

    public static List<String> a() {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        ArrayList arrayList = new ArrayList();
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        try {
            aVar = b.a("SELECT rowId," + EnumC0922a.COLUMN_UUID.key + " FROM attchment", (String[]) null);
            try {
                int a2 = aVar.a(EnumC0922a.COLUMN_UUID.key);
                while (aVar.d()) {
                    arrayList.add(aVar.c(a2));
                }
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return arrayList;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMAttachmentDao getUuidList ", e2);
                    e2.printStackTrace();
                    e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return null;
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
            f.b("imsdk", "IMAttachmentDao getUuidList ", e2);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists attchment (");
        EnumC0922a[] values = EnumC0922a.values();
        for (EnumC0922a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* renamed from: com.bytedance.im.core.internal.a.a$a  reason: collision with other inner class name */
    public enum EnumC0922a {
        COLUMN_UUID("uuid", "TEXT NOT NULL"),
        COLUMN_LOCAL_URI("local_uri", "TEXT"),
        COLUMN_REMOTE_URI("remote_uri", "TEXT"),
        COLUMN_SIZE("size", "BIGINT"),
        COLUMN_TYPE(StringSet.type, "TEXT"),
        COLUMN_HASH("hash", "TEXT"),
        COLUMN_INDEX("position", "INTEGER"),
        COLUMN_STATUS("status", "INTEGER"),
        COLUMN_EXT("ext", "TEXT"),
        COLUMN_DISPLAY_TYPE("display_type", "TEXT"),
        COLUMN_MIME_TYPE("mime_type", "TEXT");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22865);
        }

        private EnumC0922a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    private static List<c> a(com.bytedance.im.core.internal.a.c.a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int a2 = aVar.a(EnumC0922a.COLUMN_UUID.key);
        int a3 = aVar.a(EnumC0922a.COLUMN_LOCAL_URI.key);
        int a4 = aVar.a(EnumC0922a.COLUMN_REMOTE_URI.key);
        int a5 = aVar.a(EnumC0922a.COLUMN_INDEX.key);
        int a6 = aVar.a(EnumC0922a.COLUMN_SIZE.key);
        int a7 = aVar.a(EnumC0922a.COLUMN_TYPE.key);
        int a8 = aVar.a(EnumC0922a.COLUMN_EXT.key);
        int a9 = aVar.a(EnumC0922a.COLUMN_STATUS.key);
        int a10 = aVar.a(EnumC0922a.COLUMN_HASH.key);
        int a11 = aVar.a(EnumC0922a.COLUMN_DISPLAY_TYPE.key);
        int a12 = aVar.a(EnumC0922a.COLUMN_MIME_TYPE.key);
        while (aVar.d()) {
            c cVar = new c();
            cVar.setMsgUuid(aVar.c(a2));
            cVar.setLocalPath(aVar.c(a3));
            cVar.setRemoteUrl(aVar.c(a4));
            cVar.setIndex(aVar.a(a5));
            cVar.setLength(aVar.b(a6));
            cVar.setType(aVar.c(a7));
            cVar.setExtStr(aVar.c(a8));
            cVar.setStatus(aVar.a(a9));
            cVar.setHash(aVar.c(a10));
            cVar.setDisplayType(aVar.c(a11));
            cVar.setMimeType(aVar.c(a12));
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public static boolean b(List<c> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (c cVar : list) {
            if (cVar != null && !TextUtils.isEmpty(cVar.getMsgUuid())) {
                sb.append(",\"").append(cVar.getMsgUuid()).append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return false;
        }
        if (b.b("delete from attchment where " + EnumC0922a.COLUMN_UUID.key + " in " + ("(" + sb2.substring(1) + ")"))) {
            return a(list);
        }
        return false;
    }

    public static Map<String, List<c>> c(List<String> list) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            String str = "select * from attchment where " + EnumC0922a.COLUMN_UUID.key + " in (";
            for (int i2 = 0; i2 < list.size(); i2++) {
                str = str + "?";
                if (i2 != list.size() - 1) {
                    str = str + ",";
                }
            }
            aVar = b.a(str + ")", (String[]) list.toArray(new String[0]));
            for (c cVar : a(aVar)) {
                List list2 = (List) hashMap.get(cVar.getMsgUuid());
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(cVar.getMsgUuid(), list2);
                }
                list2.add(cVar);
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMAttachmentDao getAttachments2 ", e2);
            e2.printStackTrace();
            e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        com.bytedance.im.core.g.c.a().a("getAttachmentsMap", currentTimeMillis);
        return hashMap;
    }

    public static List<c> a(String str) {
        Throwable th;
        Exception e2;
        ArrayList arrayList = new ArrayList();
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = b.a("select * from attchment where " + EnumC0922a.COLUMN_UUID.key + "=?", new String[]{str});
            while (aVar.d()) {
                try {
                    c cVar = new c();
                    cVar.setMsgUuid(aVar.c(aVar.a(EnumC0922a.COLUMN_UUID.key)));
                    cVar.setLocalPath(aVar.c(aVar.a(EnumC0922a.COLUMN_LOCAL_URI.key)));
                    cVar.setRemoteUrl(aVar.c(aVar.a(EnumC0922a.COLUMN_REMOTE_URI.key)));
                    cVar.setIndex(aVar.a(aVar.a(EnumC0922a.COLUMN_INDEX.key)));
                    cVar.setLength(aVar.b(aVar.a(EnumC0922a.COLUMN_SIZE.key)));
                    cVar.setType(aVar.c(aVar.a(EnumC0922a.COLUMN_TYPE.key)));
                    cVar.setExtStr(aVar.c(aVar.a(EnumC0922a.COLUMN_EXT.key)));
                    cVar.setStatus(aVar.a(aVar.a(EnumC0922a.COLUMN_STATUS.key)));
                    cVar.setHash(aVar.c(aVar.a(EnumC0922a.COLUMN_HASH.key)));
                    cVar.setDisplayType(aVar.c(aVar.a(EnumC0922a.COLUMN_DISPLAY_TYPE.key)));
                    cVar.setMimeType(aVar.c(aVar.a(EnumC0922a.COLUMN_MIME_TYPE.key)));
                    arrayList.add(cVar);
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        f.b("imsdk", "IMAttachmentDao getAttachments ", e2);
                        e2.printStackTrace();
                        e.a(e2);
                        com.bytedance.im.core.internal.a.a.a.a(aVar);
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.im.core.internal.a.a.a.a(aVar);
                        throw th;
                    }
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            f.b("imsdk", "IMAttachmentDao getAttachments ", e2);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static boolean a(List<c> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i2 = 0;
        for (c cVar : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC0922a.COLUMN_UUID.key, cVar.getMsgUuid());
            contentValues.put(EnumC0922a.COLUMN_LOCAL_URI.key, cVar.getLocalPath());
            contentValues.put(EnumC0922a.COLUMN_REMOTE_URI.key, cVar.getRemoteUrl());
            contentValues.put(EnumC0922a.COLUMN_HASH.key, cVar.getHash());
            contentValues.put(EnumC0922a.COLUMN_INDEX.key, Integer.valueOf(cVar.getIndex()));
            contentValues.put(EnumC0922a.COLUMN_EXT.key, cVar.getExtStr());
            contentValues.put(EnumC0922a.COLUMN_STATUS.key, Integer.valueOf(cVar.getStatus()));
            contentValues.put(EnumC0922a.COLUMN_TYPE.key, cVar.getType());
            contentValues.put(EnumC0922a.COLUMN_SIZE.key, Long.valueOf(cVar.getLength()));
            contentValues.put(EnumC0922a.COLUMN_DISPLAY_TYPE.key, cVar.getDisplayType());
            contentValues.put(EnumC0922a.COLUMN_MIME_TYPE.key, cVar.getMimeType());
            if (b.a("attchment", contentValues) >= 0) {
                i2++;
            }
        }
        if (i2 == list.size()) {
            return true;
        }
        return false;
    }
}

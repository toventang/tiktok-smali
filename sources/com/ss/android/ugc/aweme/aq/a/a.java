package com.ss.android.ugc.aweme.aq.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.y.c;
import com.ss.android.ugc.aweme.y.d;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f66964a = R.id.e42;

    /* renamed from: b  reason: collision with root package name */
    public static final int f66965b = R.id.bj6;

    /* renamed from: c  reason: collision with root package name */
    public static int f66966c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static volatile c f66967d;

    public static d d() {
        c b2 = b();
        if (b2 == null) {
            return null;
        }
        return b2.f145305e;
    }

    private static boolean e() {
        if (b() == null || !a()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(41271);
    }

    public static boolean a() {
        if (b() == null || !b().f145304d) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        if (b() == null || b().f145305e == null) {
            return true;
        }
        return false;
    }

    public static c b() {
        if (f66967d != null) {
            return f66967d;
        }
        String c2 = s.a.f66880a.u().c();
        if (TextUtils.isEmpty(c2)) {
            return null;
        }
        try {
            f66967d = (c) new f().a(c2, c.class);
        } catch (Exception unused) {
            f66967d = null;
        }
        return f66967d;
    }

    private static ArrayList<String> a(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String[] split = str.split(",");
        for (String str2 : split) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static boolean b(Aweme aweme) {
        String str;
        List<String> list;
        if (e() && aweme != null) {
            String stickerIDs = aweme.getStickerIDs();
            c b2 = b();
            if (b2 != null) {
                List<String> list2 = b2.f145310j;
                if (list2 != null) {
                    Iterator<String> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    ArrayList<String> a2 = a(stickerIDs);
                    Iterator<String> it2 = a2.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    for (String str2 : a2) {
                        if (list2.contains(str2)) {
                            return true;
                        }
                    }
                }
                if (!(aweme.getUploadMiscInfoStruct() == null || (str = aweme.getUploadMiscInfoStruct().mvThemeId) == null || (list = b2.f145312l) == null)) {
                    Iterator<String> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    if (list.contains(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(Aweme aweme) {
        if (!(!e() || aweme == null || aweme.getAuthor() == null)) {
            if (b.g().isMe(aweme.getAuthor().getUid())) {
                User curUser = b.g().getCurUser();
                if (curUser != null && !curUser.isSecret()) {
                    List list = null;
                    s sVar = s.a.f66880a;
                    if (sVar.f66871e == null) {
                        sVar.f66871e = new aj<>("festival_share_donation_list", "");
                    }
                    try {
                        list = (List) new f().a(sVar.f66871e.c(), new com.google.gson.b.a<List<String>>() {
                            /* class com.ss.android.ugc.aweme.aq.a.a.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(41272);
                            }
                        }.type);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (com.bytedance.common.utility.collection.b.a((Collection) list) || !list.contains(aweme.getAid())) {
                        return false;
                    }
                    return true;
                }
                return false;
            } else if (aweme.getAuthor().isSecret() || !b(aweme)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean a(long j2, long j3) {
        boolean z;
        boolean z2;
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        instance2.setTimeInMillis(j3);
        int i2 = instance.get(1);
        int i3 = instance2.get(1);
        if (i3 > i2) {
            z = true;
        } else {
            z = false;
        }
        if (i3 != i2 || instance2.get(6) - instance.get(6) <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}

package com.ss.android.ugc.aweme.inbox;

import android.os.SystemClock;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.inbox.widget.multi.e;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bo;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f104292a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(66783);
    }

    public static Keva a() {
        String str;
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        String a2 = a.a("inbox_data_%s_repo_v1", Arrays.copyOf(new Object[]{str}, 1));
        l.b(a2, "");
        Keva repo = Keva.getRepo(a2);
        l.b(repo, "");
        return repo;
    }

    public static void a(String str) {
        l.d(str, "");
        a().erase(str);
    }

    public static void a(com.ss.android.ugc.aweme.inbox.widget.multi.b bVar) {
        l.d(bVar, "");
        a().storeString(bVar.f104442a.name(), new f().b(bVar));
    }

    public static com.ss.android.ugc.aweme.inbox.widget.multi.b a(e eVar) {
        boolean z;
        l.d(eVar, "");
        String string = a().getString(eVar.name(), "");
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            com.ss.android.ugc.aweme.inbox.widget.multi.b bVar = (com.ss.android.ugc.aweme.inbox.widget.multi.b) new f().a(string, com.ss.android.ugc.aweme.inbox.widget.multi.b.class);
            if (SystemClock.uptimeMillis() - bVar.f104450i > 86400000) {
                return null;
            }
            return bVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static CombineLiveNotice a(List<CombineLiveNotice> list) {
        Map<String, ?> all;
        l.d(list, "");
        Keva a2 = a();
        if (!bo.a(a2.getLong("key_live_notice_cache_time", 0)) && (all = a2.getAll()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                l.b(key, "");
                if (p.b(key, "key_live_notice_status_", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                a2.erase((String) entry2.getKey());
            }
        }
        a2.storeLong("key_live_notice_cache_time", System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.getUser() != null) {
                arrayList.add(t);
            }
        }
        ArrayList<CombineLiveNotice> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            StringBuilder sb = new StringBuilder("key_live_notice_status_");
            User user = ((CombineLiveNotice) next).getUser();
            if (user != null) {
                str = user.getUid();
            }
            if (a2.getInt(sb.append(str).toString(), 1) != 0) {
                arrayList2.add(next);
            }
        }
        CombineLiveNotice combineLiveNotice = null;
        for (CombineLiveNotice combineLiveNotice2 : arrayList2) {
            StringBuilder sb2 = new StringBuilder("key_live_notice_status_");
            User user2 = combineLiveNotice2.getUser();
            a2.storeInt(sb2.append(user2 != null ? user2.getUid() : null).toString(), 1);
            if (combineLiveNotice == null) {
                combineLiveNotice = combineLiveNotice2;
            }
        }
        return combineLiveNotice;
    }
}

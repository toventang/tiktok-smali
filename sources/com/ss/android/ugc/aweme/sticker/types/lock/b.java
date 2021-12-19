package com.ss.android.ugc.aweme.sticker.types.lock;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, List<String>> f136129a = new HashMap<>();

    static {
        Covode.recordClassIndex(88918);
    }

    public static final boolean a(Effect effect) {
        l.d(effect, "");
        ArrayList<String> a2 = e.a();
        if (a2.isEmpty()) {
            return false;
        }
        return a2.contains(effect.getEffectId());
    }

    public static final int a(String str) {
        l.d(str, "");
        if (!TextUtils.isEmpty(str) && !l.a((Object) str, (Object) "{}")) {
            try {
                return new JSONObject(str).getInt("lock_type");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return -1;
    }

    public static final boolean b(Effect effect) {
        if (effect == null || !c.b(effect) || c.c(effect)) {
            return false;
        }
        String effectId = effect.getEffectId();
        if (TextUtils.isEmpty(effectId)) {
            return false;
        }
        ArrayList<String> a2 = e.a();
        l.b(a2, "");
        for (String str : a2) {
            if (TextUtils.equals(effectId, str)) {
                return false;
            }
        }
        return true;
    }

    public static final List<String> a(Context context, String str) {
        l.d(str, "");
        HashMap<String, List<String>> hashMap = f136129a;
        Set<String> keySet = hashMap.keySet();
        l.b(keySet, "");
        if (keySet.contains(str)) {
            return hashMap.get(str);
        }
        List<String> a2 = new d(context, str).a();
        l.b(a2, "");
        hashMap.put(str, a2);
        Iterator<String> it = a2.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return a2;
    }

    public static final void a(Context context, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        HashMap<String, List<String>> hashMap = f136129a;
        Set<String> keySet = hashMap.keySet();
        l.b(keySet, "");
        if (keySet.contains(str)) {
            List<String> list = hashMap.get(str);
            if (list == null) {
                l.b();
            }
            list.add(str2);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            hashMap.put(str, arrayList);
        }
        new d(context, str).a(str2);
    }
}

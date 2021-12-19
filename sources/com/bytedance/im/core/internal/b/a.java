package com.bytedance.im.core.internal.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.internal.b.a.al;
import com.bytedance.im.core.internal.b.a.p;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.MessageBody;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Integer> f38227a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f38228b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    public static final Set<Integer> f38229c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    public static final Set<Integer> f38230d = new CopyOnWriteArraySet();

    /* renamed from: e  reason: collision with root package name */
    public static final Set<Integer> f38231e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public static final Set<Integer> f38232f = new CopyOnWriteArraySet();

    /* renamed from: g  reason: collision with root package name */
    public static final Set<String> f38233g = new CopyOnWriteArraySet();

    /* renamed from: h  reason: collision with root package name */
    public static final Map<Integer, Map<String, MessageBody>> f38234h = new ConcurrentHashMap();

    /* renamed from: i  reason: collision with root package name */
    public static final Set<String> f38235i = new CopyOnWriteArraySet();

    /* renamed from: j  reason: collision with root package name */
    public static final Map<Integer, List<String>> f38236j = new ConcurrentHashMap();

    /* renamed from: k  reason: collision with root package name */
    public static final Set<Integer> f38237k = new CopyOnWriteArraySet();

    /* renamed from: l  reason: collision with root package name */
    public static final Set<Integer> f38238l = new CopyOnWriteArraySet();

    /* renamed from: m  reason: collision with root package name */
    public static final Map<String, WeakReference<al>> f38239m = new ConcurrentHashMap();
    public static final Set<String> n = new CopyOnWriteArraySet();

    public static void a() {
        a(false);
    }

    static {
        Covode.recordClassIndex(22911);
    }

    public static boolean b(String str) {
        return f38233g.contains(str);
    }

    public static void c(String str) {
        f38233g.add(str);
    }

    public static boolean a(String str) {
        return f38228b.contains(str);
    }

    public static boolean b(int i2) {
        return f38229c.contains(Integer.valueOf(i2));
    }

    public static void c(int i2) {
        f38229c.add(Integer.valueOf(i2));
    }

    public static void d(int i2) {
        f38229c.remove(Integer.valueOf(i2));
    }

    public static void e(int i2) {
        f38230d.add(Integer.valueOf(i2));
    }

    public static void f(int i2) {
        f38230d.remove(Integer.valueOf(i2));
    }

    public static void g(int i2) {
        f38231e.add(Integer.valueOf(i2));
    }

    public static void h(int i2) {
        f38231e.remove(Integer.valueOf(i2));
    }

    public static boolean i(int i2) {
        return f38232f.contains(Integer.valueOf(i2));
    }

    public static void j(int i2) {
        f38232f.remove(Integer.valueOf(i2));
    }

    public static void a(int i2) {
        Set<Integer> set = f38227a;
        if (set.contains(Integer.valueOf(i2))) {
            set.remove(Integer.valueOf(i2));
            d.a();
        }
    }

    public static void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            f38239m.remove(str);
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str) || !n.remove(str)) {
            return false;
        }
        return true;
    }

    public static boolean k(int i2) {
        List<String> list = f38236j.get(Integer.valueOf(i2));
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void a(boolean z) {
        Map<Integer, Map<String, MessageBody>> map = f38234h;
        if (!map.isEmpty()) {
            for (Integer num : map.keySet()) {
                x.a();
                int intValue = num.intValue();
                Map<Integer, Map<String, MessageBody>> map2 = f38234h;
                p.a(intValue, map2.get(num), z);
                map2.put(num, new ConcurrentHashMap());
            }
        }
        Set<String> set = f38235i;
        if (!set.isEmpty()) {
            for (String str : set) {
                x.a();
                x.b(str);
            }
            f38235i.clear();
        }
    }

    public static void b(int i2, String str) {
        Map<Integer, Map<String, MessageBody>> map = f38234h;
        if (map.containsKey(Integer.valueOf(i2))) {
            map.get(Integer.valueOf(i2)).remove(str);
        }
    }

    public static void a(int i2, ai aiVar) {
        if (aiVar != null) {
            a(i2, new MessageBody.Builder().conversation_id(aiVar.getConversationId()).conversation_short_id(Long.valueOf(aiVar.getConversationShortId())).conversation_type(Integer.valueOf(aiVar.getConversationType())).create_time(Long.valueOf(aiVar.getCreatedAt())).build());
        }
    }

    public static void a(int i2, MessageBody messageBody) {
        if (messageBody.conversation_id != null && messageBody.conversation_short_id != null && messageBody.conversation_type != null) {
            Map<Integer, Map<String, MessageBody>> map = f38234h;
            if (map.get(Integer.valueOf(i2)) == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                concurrentHashMap.put(messageBody.conversation_id, messageBody);
                map.put(Integer.valueOf(i2), concurrentHashMap);
                return;
            }
            map.get(Integer.valueOf(i2)).put(messageBody.conversation_id, messageBody);
        }
    }

    public static void a(int i2, Collection<String> collection) {
        List<String> list;
        if (collection != null && !collection.isEmpty() && (list = f38236j.get(Integer.valueOf(i2))) != null) {
            list.removeAll(collection);
            if (list.isEmpty() && f38237k.contains(Integer.valueOf(i2))) {
                q.a().b(i2);
            }
        }
    }

    public static boolean a(int i2, String str) {
        Map<Integer, Map<String, MessageBody>> map = f38234h;
        if (!map.containsKey(Integer.valueOf(i2)) || map.get(Integer.valueOf(i2)) == null || !map.get(Integer.valueOf(i2)).containsKey(str)) {
            return false;
        }
        return true;
    }

    public static void a(int i2, String str, long j2, int i3, long j3) {
        a(i2, new MessageBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j2)).conversation_type(Integer.valueOf(i3)).create_time(Long.valueOf(j3)).build());
    }
}

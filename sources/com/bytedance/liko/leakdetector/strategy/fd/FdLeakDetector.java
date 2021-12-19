package com.bytedance.liko.leakdetector.strategy.fd;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.liko.b.e;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class FdLeakDetector {
    public static final FdLeakDetector INSTANCE = new FdLeakDetector();
    private static Handler handler;
    private static final HandlerThread handlerThread = new HandlerThread("FdLeakThread");
    private static volatile boolean hasInstalled;

    private FdLeakDetector() {
    }

    static {
        Covode.recordClassIndex(24735);
    }

    public final void install() {
        if (!hasInstalled) {
            HandlerThread handlerThread2 = handlerThread;
            handlerThread2.start();
            a aVar = new a(this, handlerThread2.getLooper());
            handler = aVar;
            aVar.sendEmptyMessageDelayed(0, com.bytedance.liko.b.a.f40063d);
            hasInstalled = true;
        }
    }

    public final void dumpFdAndReport() {
        if (com.bytedance.liko.b.a.f40060a) {
            List<String> a2 = com.bytedance.liko.c.a.a();
            l.c("found " + a2.size() + " fd", "");
            parse(a2);
        }
    }

    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FdLeakDetector f40141a;

        static {
            Covode.recordClassIndex(24736);
        }

        public final void handleMessage(Message message) {
            FdLeakDetector.INSTANCE.dumpFdAndReport();
            sendEmptyMessageDelayed(0, com.bytedance.liko.b.a.f40063d);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FdLeakDetector fdLeakDetector, Looper looper) {
            super(looper);
            this.f40141a = fdLeakDetector;
        }
    }

    public final String getTag(String str) {
        l.c(str, "");
        if (p.a((CharSequence) str, (CharSequence) ":", false)) {
            return p.b(str, new String[]{":"}).get(0);
        }
        if (!p.a((CharSequence) str, (CharSequence) "/", false)) {
            return str;
        }
        String substring = str.substring(0, p.a((CharSequence) str, "/"));
        l.a((Object) substring, "");
        return substring;
    }

    private final void parse(List<String> list) {
        T next;
        if (list.size() >= com.bytedance.liko.b.a.f40061b || list.size() >= com.bytedance.liko.b.a.f40062c) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : list) {
                linkedHashSet.add(t);
                String tag = INSTANCE.getTag(t);
                Integer num = linkedHashMap.get(tag);
                if (num != null) {
                    linkedHashMap.put(tag, Integer.valueOf(num.intValue() + 1));
                } else {
                    linkedHashMap.put(tag, 1);
                }
                Integer num2 = linkedHashMap2.get(t);
                if (num2 != null) {
                    linkedHashMap2.put(t, Integer.valueOf(num2.intValue() + 1));
                } else {
                    linkedHashMap2.put(t, 1);
                }
            }
            Iterator<T> it = linkedHashMap2.entrySet().iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) next.getValue()).intValue();
                    do {
                        T next2 = it.next();
                        int intValue2 = ((Number) next2.getValue()).intValue();
                        if (intValue < intValue2) {
                            next = next2;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            T t2 = next;
            if (t2 != null && t2.getValue().intValue() >= com.bytedance.liko.b.a.f40062c) {
                parseSingle(linkedHashSet, linkedHashMap2, t2);
            } else if (list.size() >= com.bytedance.liko.b.a.f40061b) {
                parseTotal(list, linkedHashSet, linkedHashMap2, linkedHashMap);
            }
        }
    }

    public static final class b<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f40142a;

        static {
            Covode.recordClassIndex(24737);
        }

        public b(Map map) {
            this.f40142a = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i2;
            Integer num = (Integer) this.f40142a.get(t2);
            int i3 = 0;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            Integer valueOf = Integer.valueOf(i2);
            Integer num2 = (Integer) this.f40142a.get(t);
            if (num2 != null) {
                i3 = num2.intValue();
            }
            return h.b.a.a(valueOf, Integer.valueOf(i3));
        }
    }

    public static final class c<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f40143a;

        static {
            Covode.recordClassIndex(24738);
        }

        public c(Map map) {
            this.f40143a = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i2;
            Integer num = (Integer) this.f40143a.get(FdLeakDetector.INSTANCE.getTag(t2));
            int i3 = 0;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            Integer valueOf = Integer.valueOf(i2);
            Integer num2 = (Integer) this.f40143a.get(FdLeakDetector.INSTANCE.getTag(t));
            if (num2 != null) {
                i3 = num2.intValue();
            }
            return h.b.a.a(valueOf, Integer.valueOf(i3));
        }
    }

    private final void report(List<String> list, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FdLeakWarning: " + str + '\n');
        stringBuffer.append("at " + getClass().getName() + ".INSTANCE (FdLeakDetector.java:0)\n");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()) + '\n');
        }
        l.c("start report \n" + stringBuffer, "");
        com.bytedance.liko.b.b bVar = e.f40081a;
        if (bVar != null) {
            bVar.a(stringBuffer.toString());
        } else {
            l.c("reporter is null", "");
        }
    }

    private final void parseSingle(Set<String> set, Map<String, Integer> map, Map.Entry<String, Integer> entry) {
        List<String> a2 = n.a((Iterable) n.k(set), (Comparator) new b(map));
        ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
        for (String str : a2) {
            arrayList.add(str + '(' + map.get(str) + ')');
        }
        report(arrayList, "found more than " + com.bytedance.liko.b.a.f40062c + " fd(" + entry.getValue().intValue() + ") by single count with max fd:" + entry.getKey());
    }

    private final void parseTotal(List<String> list, Set<String> set, Map<String, Integer> map, Map<String, Integer> map2) {
        T next;
        List<String> a2 = n.a((Iterable) n.k(set), (Comparator) new c(map2));
        ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
        for (String str : a2) {
            arrayList.add(str + '(' + map.get(str) + ')');
        }
        ArrayList arrayList2 = arrayList;
        StringBuilder append = new StringBuilder("found more than ").append(com.bytedance.liko.b.a.f40061b).append(" fd(").append(list.size()).append(") by total count with max fd:");
        Iterator<T> it = map2.entrySet().iterator();
        String str2 = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) next.getValue()).intValue();
                do {
                    T next2 = it.next();
                    int intValue2 = ((Number) next2.getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        T t = next;
        if (t != null) {
            str2 = (String) t.getKey();
        }
        report(arrayList2, append.append(str2).toString());
    }
}

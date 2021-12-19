package com.ss.android.ugc.aweme.friends.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.a.c;
import com.ss.android.ugc.aweme.friends.model.Friend;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f96877a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f96878b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f96879c = new ArrayList();

    static {
        Covode.recordClassIndex(61479);
    }

    public final c a() {
        int[] iArr = new int[this.f96879c.size()];
        int size = this.f96879c.size();
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f96879c.get(i2).intValue();
        }
        String[] strArr = new String[this.f96878b.size()];
        Objects.requireNonNull(this.f96878b.toArray(new String[0]), "null cannot be cast to non-null type kotlin.Array<T>");
        return new c(strArr, iArr);
    }

    public final void a(List<Friend> list) {
        int i2;
        boolean z;
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<Friend> it = list.iterator();
        while (it.hasNext()) {
            Friend next = it.next();
            if (!TextUtils.equals(next.getSection(), "#") && !TextUtils.equals(next.getSection(), "…") && next.getSection() != null) {
                String section = next.getSection();
                l.b(section, "");
                int length = section.length() - 1;
                int i3 = 0;
                boolean z2 = false;
                while (i3 <= length) {
                    if (!z2) {
                        i2 = i3;
                    } else {
                        i2 = length;
                    }
                    if (l.a(section.charAt(i2), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2) {
                        if (!z) {
                            break;
                        }
                        length--;
                    } else if (!z) {
                        z2 = true;
                    } else {
                        i3++;
                    }
                }
                if (!TextUtils.isEmpty(section.subSequence(i3, length + 1).toString())) {
                }
            }
            it.remove();
            next.setSection("#");
            arrayList.add(next);
        }
        Collections.sort(list, a.f96880a);
        list.addAll(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Friend friend : list) {
            if (friend != null) {
                String section2 = friend.getSection();
                if (!linkedHashMap.containsKey(section2)) {
                    l.b(section2, "");
                    linkedHashMap.put(section2, 1);
                } else {
                    l.b(section2, "");
                    Integer num = (Integer) linkedHashMap.get(section2);
                    if (num == null) {
                        num = 0;
                    }
                    linkedHashMap.put(section2, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            arrayList2.add(obj);
            int i4 = linkedHashMap.get(obj);
            if (i4 == null) {
                i4 = 0;
            }
            arrayList3.add(i4);
        }
        this.f96878b = arrayList2;
        this.f96879c = arrayList3;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final a f96880a = new a();

        static {
            Covode.recordClassIndex(61480);
        }

        a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Friend friend = (Friend) obj;
            Friend friend2 = (Friend) obj2;
            l.b(friend, "");
            String section = friend.getSection();
            l.b(section, "");
            Objects.requireNonNull(section, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = section.toLowerCase();
            l.b(lowerCase, "");
            char charAt = lowerCase.charAt(0);
            l.b(friend2, "");
            String section2 = friend2.getSection();
            l.b(section2, "");
            Objects.requireNonNull(section2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = section2.toLowerCase();
            l.b(lowerCase2, "");
            return charAt - lowerCase2.charAt(0);
        }
    }
}

package com.bytedance.android.livesdk.chatroom.backroom;

import android.app.Activity;
import com.bytedance.android.livesdk.chatroom.backroom.b.a;
import com.bytedance.android.livesdk.chatroom.backroom.b.c;
import com.bytedance.android.livesdk.chatroom.backroom.b.d;
import com.bytedance.android.livesdk.chatroom.backroom.b.e;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f15002a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f15003b = i.a((h.f.a.a) a.f15006a);

    /* renamed from: c  reason: collision with root package name */
    private static final ArrayList<com.bytedance.android.livesdk.chatroom.backroom.e.b> f15004c;

    /* renamed from: d  reason: collision with root package name */
    private static final ArrayList<a> f15005d;

    public static Map<Integer, com.bytedance.android.livesdk.watch.chatroom.a> a() {
        return (Map) f15003b.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<HashMap<Integer, com.bytedance.android.livesdk.watch.chatroom.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15006a = new a();

        static {
            Covode.recordClassIndex(8331);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<Integer, com.bytedance.android.livesdk.watch.chatroom.a> invoke() {
            return new HashMap();
        }
    }

    static {
        Covode.recordClassIndex(8330);
        ArrayList<com.bytedance.android.livesdk.chatroom.backroom.e.b> arrayList = new ArrayList<>();
        f15004c = arrayList;
        ArrayList<a> arrayList2 = new ArrayList<>();
        f15005d = arrayList2;
        a(arrayList2, new e());
        a(arrayList2, new com.bytedance.android.livesdk.chatroom.backroom.b.b());
        a(arrayList2, new d());
        a(arrayList2, new c());
        a(arrayList, new com.bytedance.android.livesdk.chatroom.backroom.e.a());
        a(arrayList, new com.bytedance.android.livesdk.chatroom.backroom.e.c());
    }

    private static com.bytedance.android.livesdk.watch.chatroom.a a(int i2) {
        com.bytedance.android.livesdk.watch.chatroom.a aVar = a().get(Integer.valueOf(i2));
        if (aVar == null) {
            aVar = new a(f15005d, f15004c);
        }
        if (a().get(Integer.valueOf(i2)) == null) {
            a().put(Integer.valueOf(i2), aVar);
        }
        return aVar;
    }

    public final com.bytedance.android.livesdk.watch.chatroom.a a(Activity activity) {
        int i2;
        if (activity != null) {
            i2 = activity.hashCode();
        } else {
            i2 = 0;
        }
        return a(i2);
    }

    private static <T> void a(ArrayList<T> arrayList, T t) {
        if (!arrayList.contains(t)) {
            arrayList.add(t);
        }
    }
}

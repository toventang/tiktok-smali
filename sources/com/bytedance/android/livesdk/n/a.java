package com.bytedance.android.livesdk.n;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.n.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f19824a = i.a((h.f.a.a) C0404a.f19826a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f19825b = new a();

    private a() {
    }

    /* renamed from: com.bytedance.android.livesdk.n.a$a  reason: collision with other inner class name */
    static final class C0404a extends m implements h.f.a.a<ArrayList<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0404a f19826a = new C0404a();

        static {
            Covode.recordClassIndex(11751);
        }

        C0404a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayList<String> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("live_merge");
            arrayList.add("homepage_hot");
            arrayList.add("live_end");
            arrayList.add("feed");
            return arrayList;
        }
    }

    static {
        Covode.recordClassIndex(11750);
    }

    public static void b(Room room, String str, String str2, b.a aVar) {
        l.d(aVar, "");
        if (room != null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            b.a(room, str, str2, aVar);
        }
    }

    public static void a(Room room, String str, String str2, b.a aVar) {
        l.d(aVar, "");
        if (room != null) {
            com.bytedance.android.livesdk.an.a.a().a(new f(room.getId()));
            ao.a(y.e(), (int) R.string.e8h);
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            b.a(room, str, str2, aVar);
        }
    }
}

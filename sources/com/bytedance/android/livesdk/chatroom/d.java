package com.bytedance.android.livesdk.chatroom;

import android.text.TextUtils;
import androidx.lifecycle.f;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawerUrlsSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;

public class d {

    /* renamed from: e  reason: collision with root package name */
    private static d f15170e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15171a;

    /* renamed from: b  reason: collision with root package name */
    public a f15172b;

    /* renamed from: c  reason: collision with root package name */
    public int f15173c;

    /* renamed from: d  reason: collision with root package name */
    public f f15174d;

    static {
        Covode.recordClassIndex(8411);
    }

    private d() {
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f15175a;

        /* renamed from: b  reason: collision with root package name */
        public String f15176b;

        /* renamed from: c  reason: collision with root package name */
        public String f15177c;

        /* renamed from: d  reason: collision with root package name */
        public com.bytedance.android.livesdk.live.model.a f15178d;

        /* renamed from: e  reason: collision with root package name */
        public String f15179e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f15180f;

        /* renamed from: g  reason: collision with root package name */
        int f15181g = -1;

        static {
            Covode.recordClassIndex(8412);
        }

        public final String a() {
            com.bytedance.android.livesdk.live.model.a aVar = this.f15178d;
            if (aVar != null) {
                return aVar.f18681d;
            }
            return null;
        }

        private static com.bytedance.android.livesdk.live.model.a a(String str) {
            List<com.bytedance.android.livesdk.live.model.a> value = FeedDrawerUrlsSetting.INSTANCE.getValue();
            com.bytedance.android.livesdk.live.model.a aVar = null;
            if (value != null && !TextUtils.isEmpty(str)) {
                for (com.bytedance.android.livesdk.live.model.a aVar2 : value) {
                    if (!(aVar2 == null || aVar2.f18678a == null)) {
                        if (TextUtils.equals(aVar2.f18678a, str)) {
                            return aVar2;
                        }
                        if ((aVar2.f18678a.startsWith("*") && str.endsWith(aVar2.f18678a.replace("*", ""))) || (aVar2.f18678a.endsWith("*") && str.startsWith(aVar2.f18678a.replace("*", "")))) {
                            aVar = aVar2;
                        }
                    }
                }
            }
            return aVar;
        }

        public a(EnterRoomConfig enterRoomConfig) {
            if (enterRoomConfig != null) {
                this.f15176b = enterRoomConfig.f23299c.J;
                this.f15175a = enterRoomConfig.f23299c.L;
                if (!TextUtils.isEmpty(this.f15176b) && !TextUtils.isEmpty(this.f15175a)) {
                    this.f15177c = this.f15176b + "_" + this.f15175a;
                }
                this.f15178d = a(this.f15177c);
                this.f15179e = enterRoomConfig.f23299c.P;
                if (TextUtils.equals(enterRoomConfig.f23299c.W, "small_picture")) {
                    this.f15180f = true;
                } else {
                    this.f15180f = false;
                }
                this.f15181g = enterRoomConfig.f23298b.M;
            }
        }
    }

    public final String b() {
        a aVar;
        if (!this.f15171a || (aVar = this.f15172b) == null) {
            return null;
        }
        return aVar.f15176b;
    }

    public final String c() {
        a aVar;
        if (!this.f15171a || (aVar = this.f15172b) == null) {
            return null;
        }
        return aVar.f15175a;
    }

    public final String d() {
        a aVar;
        if (!this.f15171a || (aVar = this.f15172b) == null) {
            return null;
        }
        return aVar.a();
    }

    public final String e() {
        a aVar;
        if (!this.f15171a || (aVar = this.f15172b) == null) {
            return null;
        }
        return aVar.f15179e;
    }

    public final int f() {
        a aVar;
        if (!this.f15171a || (aVar = this.f15172b) == null) {
            return -1;
        }
        return aVar.f15181g;
    }

    public static d a() {
        MethodCollector.i(10619);
        if (f15170e == null) {
            synchronized (d.class) {
                try {
                    if (f15170e == null) {
                        f15170e = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10619);
                    throw th;
                }
            }
        }
        d dVar = f15170e;
        MethodCollector.o(10619);
        return dVar;
    }
}

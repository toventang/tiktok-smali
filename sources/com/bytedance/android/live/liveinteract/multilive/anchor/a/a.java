package com.bytedance.android.live.liveinteract.multilive.anchor.a;

import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class a {

    public static abstract class b extends d.b<AbstractC0233a> {

        /* renamed from: d  reason: collision with root package name */
        private HashMap f11595d;

        static {
            Covode.recordClassIndex(6293);
        }

        public void a() {
            HashMap hashMap = this.f11595d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        public abstract void a(int i2);

        public abstract void a(Throwable th);

        @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            a();
        }
    }

    static {
        Covode.recordClassIndex(6291);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0233a extends d.a<b> {
        static {
            Covode.recordClassIndex(6292);
        }

        public abstract void a(Long l2, Long l3, com.bytedance.android.livesdk.chatroom.model.c.a aVar, int i2);

        public AbstractC0233a(b bVar) {
            super(bVar);
        }
    }
}

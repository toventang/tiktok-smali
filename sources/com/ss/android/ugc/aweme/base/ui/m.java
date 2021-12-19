package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.b.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class m extends d implements i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f68381c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final String f68382b;

    /* renamed from: d  reason: collision with root package name */
    private String f68383d;

    /* renamed from: e  reason: collision with root package name */
    private final String f68384e;

    /* renamed from: f  reason: collision with root package name */
    private String f68385f;

    static {
        Covode.recordClassIndex(42100);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(309, new g(m.class, "onH5Finish", d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42101);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Context context, String str) {
            l.d(context, "");
            l.d(str, "");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                context.getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    @r
    public final void onH5Finish(d dVar) {
        String str;
        String str2;
        l.d(dVar, "");
        com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
        Aweme aweme = this.f68363a;
        if (aweme == null || (str = aweme.getAuthorUid()) == null) {
            str = "";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar2.a("author_id", str);
        Aweme aweme2 = this.f68363a;
        if (aweme2 == null || (str2 = aweme2.getAid()) == null) {
            str2 = "";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str2).a("enter_from", this.f68382b).a("anchor_type", this.f68385f).a("anchor_name", this.f68384e).a("anchor_id", this.f68383d).a("music_id", ac.d(this.f68363a));
        l.b(a3, "");
        com.ss.android.ugc.aweme.common.r.a("anchor_stay_time", a3.a("duration", dVar.f78593a).f66730a);
        EventBus.a().b(this);
    }
}

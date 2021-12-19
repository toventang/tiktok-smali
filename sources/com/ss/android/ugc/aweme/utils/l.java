package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.deeplink.m;
import com.ss.android.ugc.aweme.journey.x;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class l implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f143132a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f143133b;

    /* renamed from: c  reason: collision with root package name */
    public String f143134c;

    static {
        Covode.recordClassIndex(93694);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(188, new g(l.class, "onEvent", x.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    private l() {
        this.f143134c = "";
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static l f143135a = new l((byte) 0);

        static {
            Covode.recordClassIndex(93695);
        }
    }

    public final void a() {
        if (this.f143133b != null) {
            a(d.a(), b());
        }
    }

    public final Intent b() {
        if (this.f143133b == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(this.f143133b);
        intent.setFlags(268435456);
        intent.putExtra("dl_from", "af");
        if (m.f79501a.a(this.f143134c)) {
            intent.putExtra("is_from_self", true);
        }
        return intent;
    }

    /* synthetic */ l(byte b2) {
        this();
    }

    @r(a = ThreadMode.MAIN)
    public void onEvent(x xVar) {
        if (this.f143132a) {
            a();
            this.f143132a = false;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }
}

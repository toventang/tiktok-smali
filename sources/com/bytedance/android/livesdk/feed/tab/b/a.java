package com.bytedance.android.livesdk.feed.tab.b;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class a implements m {

    /* renamed from: a  reason: collision with root package name */
    public h f17668a;

    /* renamed from: b  reason: collision with root package name */
    public i f17669b;

    static {
        Covode.recordClassIndex(9801);
    }

    public final List<ah> a() {
        if (TextUtils.equals("homepage_hot", d.a().e())) {
            return this.f17668a.b();
        }
        return this.f17668a.a();
    }

    @Override // com.bytedance.android.livesdk.feed.m
    public final ah a(long j2) {
        return this.f17668a.a(j2);
    }

    @Override // com.bytedance.android.livesdk.feed.m
    public final boolean b(long j2) {
        ah a2 = a(j2);
        if (a2 == null || a2.getDislike() <= 0) {
            return false;
        }
        return true;
    }

    public a(h hVar, i iVar) {
        this.f17668a = hVar;
        this.f17669b = iVar;
    }
}

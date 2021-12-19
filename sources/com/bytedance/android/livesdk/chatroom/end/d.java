package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f15430a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f15431b;

    static {
        Covode.recordClassIndex(8523);
    }

    d(b bVar, Map map) {
        this.f15430a = bVar;
        this.f15431b = map;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f15430a;
        Map<String, String> map = this.f15431b;
        map.putAll((Map) obj);
        b.a.a("live_show").a(map).a(bVar.f15418c).b();
    }
}

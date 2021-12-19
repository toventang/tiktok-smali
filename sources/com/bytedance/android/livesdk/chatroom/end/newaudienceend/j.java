package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.f;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Map f15480a;

    /* renamed from: b  reason: collision with root package name */
    private final DataChannel f15481b;

    static {
        Covode.recordClassIndex(8549);
    }

    j(Map map, DataChannel dataChannel) {
        this.f15480a = map;
        this.f15481b = dataChannel;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Map<String, String> map = this.f15480a;
        DataChannel dataChannel = this.f15481b;
        map.putAll((Map) obj);
        b.a.a("livesdk_live_show").a(dataChannel).a(map).b();
    }
}

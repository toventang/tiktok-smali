package com.ss.android.ugc.aweme.components.video;

import com.bytedance.covode.number.Covode;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.ss.android.ugc.aweme.components.b;
import h.f.b.l;
import java.util.Map;

public final class a extends Event<a> {

    /* renamed from: a  reason: collision with root package name */
    public static final C1813a f78109a = new C1813a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f78110b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f78111c;

    static {
        Covode.recordClassIndex(48428);
    }

    public final boolean canCoalesce() {
        return false;
    }

    public final short getCoalescingKey() {
        return 0;
    }

    public final String getEventName() {
        return "topChange";
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.a$a  reason: collision with other inner class name */
    public static final class C1813a {
        static {
            Covode.recordClassIndex(48429);
        }

        private C1813a() {
        }

        public /* synthetic */ C1813a(byte b2) {
            this();
        }
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        l.d(rCTEventEmitter, "");
        int viewTag = getViewTag();
        String eventName = getEventName();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("state", this.f78110b);
        Map<String, Object> map = this.f78111c;
        if (map != null && (!map.isEmpty())) {
            createMap.putMap("data", b.a(this.f78111c));
        }
        l.b(createMap, "");
        rCTEventEmitter.receiveEvent(viewTag, eventName, createMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, String str, Map<String, ? extends Object> map) {
        super(i2);
        l.d(str, "");
        this.f78110b = str;
        this.f78111c = map;
    }
}

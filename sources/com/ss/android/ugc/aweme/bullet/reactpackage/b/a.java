package com.ss.android.ugc.aweme.bullet.reactpackage.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.rn.core.c;
import com.bytedance.ies.bullet.kit.rn.core.e;
import com.bytedance.ies.xelement.d;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a extends e<DeclarativeVideoPlayBox> {

    /* renamed from: a  reason: collision with root package name */
    public static final C1571a f69531a = new C1571a((byte) 0);

    static {
        Covode.recordClassIndex(42881);
    }

    @Override // com.bytedance.ies.bullet.kit.rn.core.e
    public final String a() {
        return "x_video_player";
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.b.a$a  reason: collision with other inner class name */
    public static final class C1571a {
        static {
            Covode.recordClassIndex(42882);
        }

        private C1571a() {
        }

        public /* synthetic */ C1571a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.kit.rn.core.e
    public final Map<String, Integer> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("zoom", 4);
        hashMap.put("play", 1);
        hashMap.put("pause", 2);
        hashMap.put("seek", 3);
        return hashMap;
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.bytedance.ies.bullet.kit.rn.core.e
    public final /* synthetic */ DeclarativeVideoPlayBox a(c cVar) {
        l.d(cVar, "");
        return new DeclarativeVideoPlayBox(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.ies.bullet.kit.rn.core.e
    public final /* synthetic */ void a(DeclarativeVideoPlayBox declarativeVideoPlayBox) {
        DeclarativeVideoPlayBox declarativeVideoPlayBox2 = declarativeVideoPlayBox;
        l.d(declarativeVideoPlayBox2, "");
        super.a(declarativeVideoPlayBox2);
        declarativeVideoPlayBox2.a();
        System.out.println((Object) "BulletXVideoViewManager- onPropsUpdateOnce");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.bullet.kit.rn.core.c, android.view.View] */
    @Override // com.bytedance.ies.bullet.kit.rn.core.e
    public final /* synthetic */ void a(c cVar, DeclarativeVideoPlayBox declarativeVideoPlayBox) {
        DeclarativeVideoPlayBox declarativeVideoPlayBox2 = declarativeVideoPlayBox;
        l.d(cVar, "");
        l.d(declarativeVideoPlayBox2, "");
        super.a(cVar, declarativeVideoPlayBox2);
        declarativeVideoPlayBox2.setStateChangeReporter(b.f69532a);
    }

    static final class b extends m implements q<String, Map<String, ? extends Object>, d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f69532a = new b();

        static {
            Covode.recordClassIndex(42883);
        }

        b() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(String str, Map<String, ? extends Object> map, d dVar) {
            UIManagerModule uIManagerModule;
            EventDispatcher eventDispatcher;
            String str2 = str;
            Map<String, ? extends Object> map2 = map;
            d dVar2 = dVar;
            l.d(str2, "");
            l.d(map2, "");
            l.d(dVar2, "");
            c cVar = (c) dVar2.getContext();
            if (!(cVar == null || (uIManagerModule = (UIManagerModule) cVar.a(UIManagerModule.class)) == null || (eventDispatcher = uIManagerModule.getEventDispatcher()) == null)) {
                eventDispatcher.dispatchEvent(new com.ss.android.ugc.aweme.components.video.a(dVar2.getId(), str2, map2));
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, int, java.util.List] */
    @Override // com.bytedance.ies.bullet.kit.rn.core.e
    public final /* synthetic */ void a(DeclarativeVideoPlayBox declarativeVideoPlayBox, int i2, List list) {
        Object obj;
        DeclarativeVideoPlayBox declarativeVideoPlayBox2 = declarativeVideoPlayBox;
        l.d(declarativeVideoPlayBox2, "");
        if (i2 == 1) {
            System.out.println((Object) "BulletXVideoViewManager- play");
            declarativeVideoPlayBox2.a((h.f.a.a<z>) null);
        } else if (i2 == 2) {
            System.out.println((Object) "BulletXVideoViewManager- pause");
            declarativeVideoPlayBox2.b();
        } else if (i2 != 3) {
            if (i2 == 4) {
                System.out.println((Object) "BulletXVideoViewManager- performZoom");
                declarativeVideoPlayBox2.c();
            }
        } else if (list != null && (!list.isEmpty()) && (obj = list.get(0)) != null && (obj instanceof String)) {
            System.out.println((Object) "BulletXVideoViewManager- seek ".concat(String.valueOf(obj)));
            JSONObject jSONObject = new JSONObject((String) obj);
            declarativeVideoPlayBox2.a(jSONObject.optInt("seekTime", 0), jSONObject.optBoolean("play", false));
        }
    }
}

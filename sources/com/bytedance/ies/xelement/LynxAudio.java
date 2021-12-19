package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.b.c;
import com.bytedance.ies.xelement.b.e;
import com.bytedance.ies.xelement.b.f;
import com.bytedance.ies.xelement.b.g;
import com.bytedance.ies.xelement.b.h;
import com.bytedance.ies.xelement.b.i;
import com.bytedance.ies.xelement.b.k;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import h.f.b.l;
import h.n;

public final class LynxAudio extends UISimpleView<i> implements c.a, e.a, i.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36516b = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static final String f36517e = LynxAudio.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public f f36518a;

    /* renamed from: c  reason: collision with root package name */
    private c f36519c;

    /* renamed from: d  reason: collision with root package name */
    private Long f36520d = 0L;

    @Override // com.bytedance.ies.xelement.b.c.a
    public final void c() {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            switch (nextKey.hashCode()) {
                case -1669980826:
                    if (nextKey.equals("nativecontrol")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSupportNativeControl(z);
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSrc(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3322014:
                    if (nextKey.equals("list")) {
                        setList(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3327652:
                    if (nextKey.equals("loop")) {
                        setLoop(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1197813673:
                    if (nextKey.equals("nativeplugins")) {
                        setNativePlugins(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        isAutoPlay(z);
                        continue;
                    }
                    break;
                case 1629011506:
                    if (nextKey.equals("focusable")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSupportFocusable(z);
                        continue;
                    }
                    break;
                case 2095859131:
                    if (nextKey.equals("playerType")) {
                        setPlayerType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21908);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.b.i.b
    public final void b() {
        c cVar = this.f36519c;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    static {
        Covode.recordClassIndex(21905);
    }

    @Override // com.bytedance.ies.xelement.b.e.a
    public final void a() {
        com.lynx.tasm.c cVar;
        j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f55897e) != null) {
            cVar.a(new com.lynx.tasm.c.c(getSign(), "listchange"));
        }
    }

    public LynxAudio(j jVar) {
        super(jVar);
    }

    @Override // com.bytedance.ies.xelement.b.e.a
    public final void a(String str) {
        com.lynx.tasm.c cVar;
        l.c(str, "");
        g.f36700a.a(f36517e, "onCurrentSrcChanged -> ".concat(String.valueOf(str)));
        j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f55897e) != null) {
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(getSign(), "srcchange");
            cVar2.a("currentSrcID", str);
            cVar.a(cVar2);
        }
    }

    @Override // com.bytedance.ies.xelement.b.e.a
    public final void b(int i2) {
        com.lynx.tasm.c cVar;
        String str;
        e player;
        j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f55897e) != null) {
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(getSign(), "seek");
            i iVar = (i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null || (str = player.k()) == null) {
                str = "";
            }
            cVar2.a("currentSrcID", str);
            cVar2.a("currentTime", Integer.valueOf(i2));
            cVar.a(cVar2);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        i a2 = l.f37166c.a(context);
        e.b bVar = l.f37165b;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        l.a((Object) applicationContext, "");
        j jVar = this.mContext;
        l.a((Object) jVar, "");
        e a3 = bVar.a(applicationContext, jVar, getSign());
        a3.a(this);
        f fVar = this.f36518a;
        if (fVar != null) {
            a3.a(fVar);
        }
        a2.setPlayer(a3);
        a2.setLifecycle(this);
        return a2;
    }

    @p
    public final void currentSrcID(Callback callback) {
        String str;
        e player;
        g.f36700a.a(f36517e, "Getter method: -> currentSrcID");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            i iVar = (i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                str = null;
            } else {
                str = player.k();
            }
            javaOnlyMap.put("currentSrcID", str);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @p
    public final void currentTime(Callback callback) {
        Integer num;
        e player;
        g.f36700a.a(f36517e, "Getter method: -> currentTime");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            i iVar = (i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(player.g());
            }
            javaOnlyMap.put("currentTime", num);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @p
    public final void duration(Callback callback) {
        Integer num;
        e player;
        g.f36700a.a(f36517e, "Getter method: -> duration");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            i iVar = (i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(player.f());
            }
            javaOnlyMap.put("duration", num);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @m(a = "autoplay")
    public final void isAutoPlay(boolean z) {
        e player;
        g.f36700a.a(f36517e, "isAutoPlay -> ".concat(String.valueOf(z)));
        i iVar = (i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            player.a(z);
        }
    }

    @p
    public final void pause(Callback callback) {
        e player;
        g.f36700a.a(f36517e, "Control method: --> pause()");
        i iVar = (i) this.mView;
        if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
            player.d();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @p
    public final void play(Callback callback) {
        e player;
        g.f36700a.a(f36517e, "Control method: --> play()");
        i iVar = (i) this.mView;
        if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
            player.c();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @p
    public final void playBitrate(Callback callback) {
        Long l2;
        e player;
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            i iVar = (i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(player.i());
            }
            javaOnlyMap.put("playBitrate", l2);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @m(a = "list")
    public final void setList(String str) {
        e player;
        if (str != null) {
            System.out.println((Object) (f36517e + "- list -> " + str));
            i iVar = (i) this.mView;
            if (iVar != null && (player = iVar.getPlayer()) != null) {
                player.a(str);
            }
        }
    }

    @m(a = "src")
    public final void setSrc(String str) {
        i iVar;
        e player;
        g.f36700a.a(f36517e, "setSrc -> ".concat(String.valueOf(str)));
        if (str != null && str.length() > 0 && (iVar = (i) this.mView) != null && (player = iVar.getPlayer()) != null) {
            player.b(str);
        }
    }

    @m(a = "focusable")
    public final void setSupportFocusable(boolean z) {
        e player;
        g.f36700a.a(f36517e, "setSupportFocusable -> ".concat(String.valueOf(z)));
        i iVar = (i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            player.c(z);
        }
    }

    @m(a = "nativecontrol")
    public final void setSupportNativeControl(boolean z) {
        e player;
        g.f36700a.a(f36517e, "setSupportNativeControl -> ".concat(String.valueOf(z)));
        i iVar = (i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            player.b(z);
        }
    }

    @p
    public final void status(Callback callback) {
        String str;
        e player;
        k j2;
        g.f36700a.a(f36517e, "Getter method: -> status");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            i iVar = (i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null || (j2 = player.j()) == null) {
                str = null;
            } else {
                str = j2.getDesc();
            }
            javaOnlyMap.put("status", str);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @p
    public final void stop(Callback callback) {
        e player;
        g.f36700a.a(f36517e, "Control method: --> stop()");
        i iVar = (i) this.mView;
        if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
            player.e();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @p
    public final void cacheTime(Callback callback) {
        Long l2;
        e player;
        System.out.println((Object) (f36517e + " Getter method: cacheTime"));
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            i iVar = (i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(player.h());
            }
            javaOnlyMap.put("cacheTime", l2);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @m(a = "loop")
    public final void setLoop(String str) {
        e player;
        h hVar;
        l.c(str, "");
        g.f36700a.a(f36517e, "setLoop -> ".concat(String.valueOf(str)));
        i iVar = (i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            if (l.a((Object) str, (Object) h.SINGLE.getDesc())) {
                hVar = h.SINGLE;
            } else if (l.a((Object) str, (Object) h.LIST.getDesc())) {
                hVar = h.LIST;
            } else {
                hVar = h.ORDER;
            }
            player.a(hVar);
        }
    }

    @m(a = "nativeplugins")
    public final void setNativePlugins(String str) {
        e player;
        l.c(str, "");
        g gVar = g.f36700a;
        String str2 = f36517e;
        gVar.a(str2, "setNativePlugins -> ".concat(String.valueOf(str)));
        System.out.println((Object) (str2 + "- nativeplugins -> " + str));
        i iVar = (i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            player.c(str);
        }
    }

    @m(a = "playerType")
    public final void setPlayerType(String str) {
        e player;
        com.bytedance.ies.xelement.b.l lVar;
        l.c(str, "");
        g.f36700a.a(f36517e, "setPlayerType -> ".concat(String.valueOf(str)));
        i iVar = (i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            if (l.a((Object) str, (Object) com.bytedance.ies.xelement.b.l.DEFAULT.getDesc()) || (!l.a((Object) str, (Object) com.bytedance.ies.xelement.b.l.SHORT.getDesc()) && !l.a((Object) str, (Object) com.bytedance.ies.xelement.b.l.LIGHT.getDesc()))) {
                lVar = com.bytedance.ies.xelement.b.l.DEFAULT;
            } else {
                lVar = com.bytedance.ies.xelement.b.l.LIGHT;
            }
            player.a(lVar);
        }
    }

    @Override // com.bytedance.ies.xelement.b.e.a
    public final void a(int i2) {
        com.lynx.tasm.c cVar;
        String str;
        Long l2;
        e player;
        String k2;
        e player2;
        e player3;
        j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f55897e) != null) {
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(getSign(), "timeupdate");
            i iVar = (i) this.mView;
            String str2 = "";
            if (iVar == null || (player3 = iVar.getPlayer()) == null || (str = player3.k()) == null) {
                str = str2;
            }
            cVar2.a("currentSrcID", str);
            cVar2.a("currentTime", Integer.valueOf(i2));
            cVar.a(cVar2);
            i iVar2 = (i) this.mView;
            if (iVar2 == null || (player2 = iVar2.getPlayer()) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(player2.h());
            }
            if (!l.a(l2, this.f36520d)) {
                this.f36520d = l2;
                com.lynx.tasm.c.c cVar3 = new com.lynx.tasm.c.c(getSign(), "cachetimeupdate");
                i iVar3 = (i) this.mView;
                if (!(iVar3 == null || (player = iVar3.getPlayer()) == null || (k2 = player.k()) == null)) {
                    str2 = k2;
                }
                cVar3.a("currentSrcID", str2);
                cVar3.a("cacheTime", l2);
                cVar.a(cVar3);
            }
        }
    }

    @Override // com.bytedance.ies.xelement.b.e.a
    public final void a(k kVar) {
        String str;
        com.lynx.tasm.c cVar;
        String str2;
        e player;
        String k2;
        e player2;
        String str3 = "";
        l.c(kVar, str3);
        g.f36700a.a(f36517e, "onPlaybackStateChanged -> " + kVar.name());
        switch (e.f37076a[kVar.ordinal()]) {
            case 1:
            case 2:
                str = "play";
                break;
            case 3:
                str = "pause";
                break;
            case 4:
                str = "error";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                str = "stop";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                str = "ended";
                break;
            default:
                throw new n();
        }
        j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f55897e) != null) {
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(getSign(), str);
            i iVar = (i) this.mView;
            if (iVar == null || (player2 = iVar.getPlayer()) == null || (str2 = player2.k()) == null) {
                str2 = str3;
            }
            cVar2.a("currentSrcID", str2);
            cVar2.a("status", kVar.getDesc());
            cVar.a(cVar2);
            com.lynx.tasm.c.c cVar3 = new com.lynx.tasm.c.c(getSign(), "statuschange");
            i iVar2 = (i) this.mView;
            if (!(iVar2 == null || (player = iVar2.getPlayer()) == null || (k2 = player.k()) == null)) {
                str3 = k2;
            }
            cVar3.a("currentSrcID", str3);
            cVar3.a("status", kVar.getDesc());
            cVar.a(cVar3);
        }
    }

    @Override // com.bytedance.ies.xelement.b.e.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar) {
        com.lynx.tasm.c cVar;
        l.c(lVar, "");
        System.out.println((Object) (f36517e + "- onLoadStateChanged, state:" + lVar));
        j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f55897e) != null) {
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(getSign(), "loadstatechanged");
            cVar2.a("loadState", lVar.name());
            cVar.a(cVar2);
        }
    }

    @p
    public final void seek(ReadableMap readableMap, Callback callback) {
        e player;
        l.c(readableMap, "");
        int i2 = readableMap.getInt("currentTime", 0);
        g.f36700a.a(f36517e, "Control method: --> seek(), param is: ".concat(String.valueOf(i2)));
        i iVar = (i) this.mView;
        if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
            player.a(i2);
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @Override // com.bytedance.ies.xelement.b.e.a
    public final void a(int i2, String str) {
        com.lynx.tasm.c cVar;
        String str2;
        e player;
        g.f36700a.c(f36517e, "onError -> " + i2 + ", " + str);
        j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f55897e) != null) {
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(getSign(), "error");
            i iVar = (i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null || (str2 = player.k()) == null) {
                str2 = "";
            }
            cVar2.a("currentSrcID", str2);
            cVar2.a("code", Integer.valueOf(i2));
            if (str == null) {
                str = "";
            }
            cVar2.a("msg", str);
            cVar.a(cVar2);
        }
    }
}

package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.a.c;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.utils.e;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class LynxVideoManagerLite extends UISimpleView<DeclarativeVideoPlayBoxViewDelegate> {
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(21957);
    }

    public static int com_bytedance_ies_xelement_LynxVideoManagerLite_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i2 = 0;
            boolean z5 = false;
            int i3 = 0;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            switch (nextKey.hashCode()) {
                case -1699818261:
                    if (nextKey.equals("enableplaylistener")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setEnablePlayListener(z);
                        continue;
                    }
                    break;
                case -1664825047:
                    if (nextKey.equals("singleplayer")) {
                        if (!readableMap.isNull(nextKey)) {
                            z8 = readableMap.getBoolean(nextKey, false);
                        }
                        setSinglePlayer(z8);
                        continue;
                    }
                    break;
                case -1531319052:
                    if (nextKey.equals("performanceLog")) {
                        setPerformanceLog(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1489589134:
                    if (nextKey.equals("objectfit")) {
                        setObjectFit(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -982450867:
                    if (nextKey.equals("poster")) {
                        setPoster(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -894681731:
                    if (nextKey.equals("__control")) {
                        setControl(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -810883302:
                    if (nextKey.equals("volume")) {
                        setVolume(readableMap.isNull(nextKey) ? 0.0f : (float) readableMap.getDouble(nextKey, 0.0d));
                        continue;
                    }
                    break;
                case -318476791:
                    if (nextKey.equals("preload")) {
                        if (!readableMap.isNull(nextKey)) {
                            z7 = readableMap.getBoolean(nextKey, false);
                        }
                        setPreload(z7);
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSrc(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 3327652:
                    if (nextKey.equals("loop")) {
                        if (!readableMap.isNull(nextKey)) {
                            z6 = readableMap.getBoolean(nextKey, false);
                        }
                        setLoop(z6);
                        continue;
                    }
                    break;
                case 3493088:
                    if (nextKey.equals("rate")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setRate(i3);
                        continue;
                    }
                    break;
                case 104264043:
                    if (nextKey.equals("muted")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setMuted(z5);
                        continue;
                    }
                    break;
                case 269397981:
                    if (nextKey.equals("inittime")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setInitTime(i2);
                        continue;
                    }
                    break;
                case 850708551:
                    if (nextKey.equals("log-extra")) {
                        setLogExtra(readableMap.getMap(nextKey));
                        continue;
                    }
                    break;
                case 894041755:
                    if (nextKey.equals("autolifecycle")) {
                        if (!readableMap.isNull(nextKey)) {
                            z4 = readableMap.getBoolean(nextKey, false);
                        }
                        setAutoLifecycle(z4);
                        continue;
                    }
                    break;
                case 1331794760:
                    if (nextKey.equals("video-tag")) {
                        setVideoTag(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setAutoPlay(z3);
                        continue;
                    }
                    break;
                case 1933829272:
                    if (nextKey.equals("devicechangeaware")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setDeviceChangeAware(z2);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21960);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void destroy() {
        super.destroy();
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).onPropsUpdateOnce();
        super.onPropsUpdated();
        System.out.println((Object) "LynxVideoManagerLite- onPropsUpdated");
    }

    public LynxVideoManagerLite(j jVar) {
        super(jVar);
    }

    @m(a = "video-tag")
    public final void setVideoTag(String str) {
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setVideoTag(str);
    }

    @p
    public final void getDuration(Callback callback) {
        int duration = ((DeclarativeVideoPlayBoxViewDelegate) this.mView).getDuration();
        if (callback != null) {
            callback.invoke(0, Integer.valueOf(duration));
        }
    }

    @m(a = "autolifecycle")
    public final void setAutoLifecycle(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- autolifecycle -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setAutoLifecycle(z);
    }

    @m(a = "autoplay")
    public final void setAutoPlay(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- autoplay -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setAutoPlay(z);
    }

    @m(a = "devicechangeaware")
    public final void setDeviceChangeAware(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- devicechangeaware -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setDeviceChangeAware(z);
    }

    @m(a = "enableplaylistener")
    public final void setEnablePlayListener(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- enableplaylistener -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setEnablePlayListener(z);
    }

    @m(a = "inittime")
    public final void setInitTime(int i2) {
        System.out.println((Object) "LynxVideoManagerLite- inittime -> ".concat(String.valueOf(i2)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setInitTime(i2);
    }

    @m(a = "loop")
    public final void setLoop(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- loop -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setLoop(z);
    }

    @m(a = "muted")
    public final void setMuted(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- muted -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setMuted(z);
    }

    @m(a = "objectfit")
    public final void setObjectFit(String str) {
        l.c(str, "");
        System.out.println((Object) "LynxVideoManagerLite- objectfit -> ".concat(String.valueOf(str)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setObjectFit(str);
    }

    @m(a = "performanceLog")
    public final void setPerformanceLog(String str) {
        System.out.println((Object) "LynxVideoManagerLite- performanceLog -> ".concat(String.valueOf(str)));
        if (str != null) {
            ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setPerformanceLog(str);
        }
    }

    @m(a = "preload")
    public final void setPreload(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- preload -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setPreload(z);
    }

    @m(a = "rate")
    public final void setRate(int i2) {
        System.out.println((Object) "LynxVideoManagerLite- rate -> ".concat(String.valueOf(i2)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setRate(i2);
    }

    public final void setResourceLoader(com.bytedance.ies.xelement.a.a<c> aVar) {
        l.c(aVar, "");
        System.out.println((Object) "LynxVideoManagerLite- setResourceLoader");
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setResourceLoader(aVar);
    }

    @m(a = "singleplayer")
    public final void setSinglePlayer(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- singleplayer -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setSinglePlayer(z);
    }

    @m(a = "volume")
    public final void setVolume(float f2) {
        System.out.println((Object) "LynxVideoManagerLite- preload -> ".concat(String.valueOf(f2)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setVolume(f2);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final DeclarativeVideoPlayBoxViewDelegate createView(Context context) {
        h.f.a.b<Context, DeclarativeVideoPlayBoxViewDelegate> declarativeVideoPlayBoxViewProvider = ((XElementInitializerLite) XElementInitializerLite.instance$delegate.getValue()).getConfig().getDeclarativeVideoPlayBoxViewProvider();
        if (declarativeVideoPlayBoxViewProvider == null) {
            l.a();
        }
        if (context == null) {
            l.a();
        }
        DeclarativeVideoPlayBoxViewDelegate invoke = declarativeVideoPlayBoxViewProvider.invoke(context);
        invoke.setStateChangeReporter(new b(this));
        return invoke;
    }

    @m(a = "log-extra")
    public final void setLogExtra(ReadableMap readableMap) {
        System.out.println((Object) "LynxVideoManagerLite- log-extra -> ".concat(String.valueOf(readableMap)));
        if (readableMap != null) {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            l.a((Object) hashMap, "");
            ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setLogExtra(hashMap);
        }
    }

    @m(a = "poster")
    public final void setPoster(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ReadableType h2 = aVar.h();
        if (h2 != null && h.f37080b[h2.ordinal()] == 1) {
            System.out.println((Object) ("LynxVideoManagerLite- poster -> " + aVar.e()));
            String e2 = aVar.e();
            l.a((Object) e2, "");
            if (e2.length() > 0) {
                String e3 = aVar.e();
                l.a((Object) e3, "");
                ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setPoster(e3);
                return;
            }
            return;
        }
        com_bytedance_ies_xelement_LynxVideoManagerLite_com_ss_android_ugc_aweme_lancet_LogLancet_w("LynxVideoManagerLite", "Not supported poster type: " + aVar.h().name());
    }

    @m(a = "src")
    public final void setSrc(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ReadableType h2 = aVar.h();
        if (h2 != null && h.f37079a[h2.ordinal()] == 1) {
            System.out.println((Object) ("LynxVideoManagerLite- src -> " + aVar.e()));
            String e2 = aVar.e();
            l.a((Object) e2, "");
            if (e2.length() > 0) {
                String e3 = aVar.e();
                l.a((Object) e3, "");
                ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setSrc(e3);
                return;
            }
            return;
        }
        com_bytedance_ies_xelement_LynxVideoManagerLite_com_ss_android_ugc_aweme_lancet_LogLancet_w("LynxVideoManagerLite", "Not supported src type: " + aVar.h().name());
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onBorderRadiusUpdated(int i2) {
        com.lynx.tasm.behavior.ui.utils.b d2;
        super.onBorderRadiusUpdated(i2);
        e eVar = this.mLynxBackground;
        float[] fArr = null;
        if (!(eVar == null || (d2 = eVar.d()) == null)) {
            View view = this.mView;
            l.a((Object) view, "");
            int paddingLeft = ((DeclarativeVideoPlayBoxViewDelegate) view).getPaddingLeft();
            View view2 = this.mView;
            l.a((Object) view2, "");
            int paddingRight = ((DeclarativeVideoPlayBoxViewDelegate) view2).getPaddingRight();
            View view3 = this.mView;
            l.a((Object) view3, "");
            int paddingTop = ((DeclarativeVideoPlayBoxViewDelegate) view3).getPaddingTop();
            View view4 = this.mView;
            l.a((Object) view4, "");
            int paddingBottom = ((DeclarativeVideoPlayBoxViewDelegate) view4).getPaddingBottom();
            View view5 = this.mView;
            l.a((Object) view5, "");
            float width = (float) (((DeclarativeVideoPlayBoxViewDelegate) view5).getWidth() + paddingLeft + paddingRight);
            View view6 = this.mView;
            l.a((Object) view6, "");
            d2.a(width, (float) (((DeclarativeVideoPlayBoxViewDelegate) view6).getHeight() + paddingTop + paddingBottom));
            float[] a2 = d2.a();
            if (a2 != null) {
                int i3 = 0;
                if (a2.length == 8) {
                    float f2 = (float) paddingLeft;
                    float f3 = (float) paddingTop;
                    float f4 = (float) paddingRight;
                    float f5 = (float) paddingBottom;
                    float[] fArr2 = {f2, f3, f4, f3, f4, f5, f2, f5};
                    do {
                        a2[i3] = Math.max(0.0f, a2[i3] - fArr2[i3]);
                        i3++;
                    } while (i3 < 8);
                    fArr = a2;
                }
            }
        }
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setBorderRadius(fArr);
    }

    @m(a = "__control")
    public final void setControl(String str) {
        List<String> b2;
        DeclarativeVideoPlayBoxViewDelegate declarativeVideoPlayBoxViewDelegate;
        JSONObject jSONObject;
        DeclarativeVideoPlayBoxViewDelegate declarativeVideoPlayBoxViewDelegate2;
        System.out.println((Object) "LynxVideoManagerLite- __control -> ".concat(String.valueOf(str)));
        if (str != null) {
            boolean z = false;
            if (g.a(str) && (b2 = h.m.p.b(str, new String[]{"_*_"})) != null && b2.size() == 3 && 1 != 0) {
                List<String> b3 = h.m.p.b(str, new String[]{"_*_"});
                String str2 = b3.get(0);
                switch (str2.hashCode()) {
                    case -1879513255:
                        if (str2.equals("exitfullscreen")) {
                            ((DeclarativeVideoPlayBoxViewDelegate) this.mView).performZoomOut();
                            return;
                        }
                        return;
                    case -619198582:
                        if (str2.equals("requestfullscreen")) {
                            ((DeclarativeVideoPlayBoxViewDelegate) this.mView).performZoom();
                            return;
                        }
                        return;
                    case 3443508:
                        if (str2.equals("play") && (declarativeVideoPlayBoxViewDelegate = (DeclarativeVideoPlayBoxViewDelegate) this.mView) != null) {
                            DeclarativeVideoPlayBoxViewDelegate.playReal$default(declarativeVideoPlayBoxViewDelegate, null, 1, null);
                            return;
                        }
                        return;
                    case 3526264:
                        if (str2.equals("seek")) {
                            try {
                                jSONObject = new JSONObject(b3.get(1));
                            } catch (Exception unused) {
                                jSONObject = new JSONObject();
                            }
                            DeclarativeVideoPlayBoxViewDelegate declarativeVideoPlayBoxViewDelegate3 = (DeclarativeVideoPlayBoxViewDelegate) this.mView;
                            if (declarativeVideoPlayBoxViewDelegate3 != null) {
                                int optInt = jSONObject.optInt("position", 0);
                                if (jSONObject.optInt("play") == 1) {
                                    z = true;
                                }
                                declarativeVideoPlayBoxViewDelegate3.seek(optInt, z);
                                return;
                            }
                            return;
                        }
                        return;
                    case 106440182:
                        if (str2.equals("pause") && (declarativeVideoPlayBoxViewDelegate2 = (DeclarativeVideoPlayBoxViewDelegate) this.mView) != null) {
                            declarativeVideoPlayBoxViewDelegate2.pause();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements q<String, Map<String, ? extends Object>, DeclarativeVideoPlayBoxViewDelegate, z> {
        final /* synthetic */ LynxVideoManagerLite this$0;

        static {
            Covode.recordClassIndex(21961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LynxVideoManagerLite lynxVideoManagerLite) {
            super(3);
            this.this$0 = lynxVideoManagerLite;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
            if (r6.equals("onPlayFailed") != false) goto L_0x00c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
            if (r6.equals("onError") != false) goto L_0x00c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
            r7 = r3;
            r1 = "error";
         */
        @Override // h.f.a.q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(java.lang.String r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, com.bytedance.ies.xelement.DeclarativeVideoPlayBoxViewDelegate r8) {
            /*
            // Method dump skipped, instructions count: 300
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxVideoManagerLite.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}

package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.n;
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

public final class LynxVideoManager extends UISimpleView<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36564a = new a((byte) 0);

    static {
        Covode.recordClassIndex(21952);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            boolean z2 = false;
            int i2 = 0;
            boolean z3 = false;
            boolean z4 = false;
            int i3 = 0;
            boolean z5 = false;
            int i4 = 0;
            boolean z6 = false;
            boolean z7 = false;
            int i5 = 0;
            switch (nextKey.hashCode()) {
                case -1664825047:
                    if (nextKey.equals("singleplayer")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSinglePlayer(z);
                        continue;
                    }
                    break;
                case -1596019157:
                    if (nextKey.equals("videowidth")) {
                        if (!readableMap.isNull(nextKey)) {
                            i5 = readableMap.getInt(nextKey, 0);
                        }
                        setVideoWidth(i5);
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
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setRate(i4);
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
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setInitTime(i3);
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
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setAutoPlay(z3);
                        continue;
                    }
                    break;
                case 1630018914:
                    if (nextKey.equals("videoheight")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setVideoHeight(i2);
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
            Covode.recordClassIndex(21955);
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
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        ((d) this.mView).a();
        super.onPropsUpdated();
        System.out.println((Object) "LynxVideoManager- onPropsUpdated");
    }

    public LynxVideoManager(j jVar) {
        super(jVar);
    }

    @p
    public final void getDuration(Callback callback) {
        int duration = ((d) this.mView).getDuration();
        if (callback != null) {
            callback.invoke(0, Integer.valueOf(duration));
        }
    }

    @m(a = "autolifecycle")
    public final void setAutoLifecycle(boolean z) {
        System.out.println((Object) "LynxVideoManager- autolifecycle -> ".concat(String.valueOf(z)));
        ((d) this.mView).setAutoLifecycle(z);
    }

    @m(a = "autoplay")
    public final void setAutoPlay(boolean z) {
        System.out.println((Object) "LynxVideoManager- autoplay -> ".concat(String.valueOf(z)));
        ((d) this.mView).setAutoPlay(z);
    }

    @m(a = "devicechangeaware")
    public final void setDeviceChangeAware(boolean z) {
        System.out.println((Object) "LynxVideoManager- devicechangeaware -> ".concat(String.valueOf(z)));
        ((d) this.mView).setDeviceChangeAware(z);
    }

    @m(a = "inittime")
    public final void setInitTime(int i2) {
        System.out.println((Object) "LynxVideoManager- inittime -> ".concat(String.valueOf(i2)));
        ((d) this.mView).setInitTime(i2);
    }

    @m(a = "loop")
    public final void setLoop(boolean z) {
        System.out.println((Object) "LynxVideoManager- loop -> ".concat(String.valueOf(z)));
        ((d) this.mView).setLoop(z);
    }

    @m(a = "muted")
    public final void setMuted(boolean z) {
        System.out.println((Object) "LynxVideoManager- muted -> ".concat(String.valueOf(z)));
        ((d) this.mView).setMuted(z);
    }

    @m(a = "objectfit")
    public final void setObjectFit(String str) {
        l.c(str, "");
        System.out.println((Object) "LynxVideoManager- objectfit -> ".concat(String.valueOf(str)));
        ((d) this.mView).setObjectFit(str);
    }

    @m(a = "performanceLog")
    public final void setPerformanceLog(String str) {
        System.out.println((Object) "LynxVideoManager- performanceLog -> ".concat(String.valueOf(str)));
        if (str != null) {
            ((d) this.mView).setPerformanceLog(str);
        }
    }

    @m(a = "preload")
    public final void setPreload(boolean z) {
        System.out.println((Object) "LynxVideoManager- preload -> ".concat(String.valueOf(z)));
        ((d) this.mView).setPreload(z);
    }

    @m(a = "rate")
    public final void setRate(int i2) {
        System.out.println((Object) "LynxVideoManager- rate -> ".concat(String.valueOf(i2)));
        ((d) this.mView).setRate(i2);
    }

    @m(a = "singleplayer")
    public final void setSinglePlayer(boolean z) {
        System.out.println((Object) "LynxVideoManager- singleplayer -> ".concat(String.valueOf(z)));
        ((d) this.mView).setSinglePlayer(z);
    }

    @m(a = "videoheight")
    public final void setVideoHeight(int i2) {
        System.out.println((Object) "LynxVideoManager- videoheight -> ".concat(String.valueOf(i2)));
        ((d) this.mView).setVideoHeight(i2);
    }

    @m(a = "videowidth")
    public final void setVideoWidth(int i2) {
        System.out.println((Object) "LynxVideoManager- videowidth -> ".concat(String.valueOf(i2)));
        ((d) this.mView).setVideoWidth(i2);
    }

    @m(a = "volume")
    public final void setVolume(float f2) {
        System.out.println((Object) "LynxVideoManager- preload -> ".concat(String.valueOf(f2)));
        ((d) this.mView).setVolume(f2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        m mVar = n.a.a().f37173a;
        if (mVar == null) {
            l.a("localConfig");
        }
        h.f.a.b<Context, d> bVar = mVar.f37169a;
        if (bVar == null) {
            l.a();
        }
        if (context == null) {
            l.a();
        }
        d invoke = bVar.invoke(context);
        invoke.setStateChangeReporter(new b(this));
        return invoke;
    }

    @m(a = "log-extra")
    public final void setLogExtra(ReadableMap readableMap) {
        System.out.println((Object) "LynxVideoManager- log-extra -> ".concat(String.valueOf(readableMap)));
        if (readableMap != null) {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            l.a((Object) hashMap, "");
            ((d) this.mView).setLogExtra(hashMap);
        }
    }

    @m(a = "poster")
    public final void setPoster(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ReadableType h2 = aVar.h();
        if (h2 != null && f.f37078b[h2.ordinal()] == 1) {
            System.out.println((Object) ("LynxVideoManager- poster -> " + aVar.e()));
            String e2 = aVar.e();
            l.a((Object) e2, "");
            if (e2.length() > 0) {
                String e3 = aVar.e();
                l.a((Object) e3, "");
                ((d) this.mView).setPoster(e3);
                return;
            }
            return;
        }
        aVar.h().name();
    }

    @m(a = "src")
    public final void setSrc(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ReadableType h2 = aVar.h();
        if (h2 != null && f.f37077a[h2.ordinal()] == 1) {
            System.out.println((Object) ("LynxVideoManager- src -> " + aVar.e()));
            String e2 = aVar.e();
            l.a((Object) e2, "");
            if (e2.length() > 0) {
                String e3 = aVar.e();
                l.a((Object) e3, "");
                ((d) this.mView).setSrc(e3);
                return;
            }
            return;
        }
        aVar.h().name();
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
            int paddingLeft = ((d) view).getPaddingLeft();
            View view2 = this.mView;
            l.a((Object) view2, "");
            int paddingRight = ((d) view2).getPaddingRight();
            View view3 = this.mView;
            l.a((Object) view3, "");
            int paddingTop = ((d) view3).getPaddingTop();
            View view4 = this.mView;
            l.a((Object) view4, "");
            int paddingBottom = ((d) view4).getPaddingBottom();
            View view5 = this.mView;
            l.a((Object) view5, "");
            float width = (float) (((d) view5).getWidth() + paddingLeft + paddingRight);
            View view6 = this.mView;
            l.a((Object) view6, "");
            d2.a(width, (float) (((d) view6).getHeight() + paddingTop + paddingBottom));
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
        ((d) this.mView).setBorderRadius(fArr);
    }

    @m(a = "__control")
    public final void setControl(String str) {
        List<String> b2;
        d dVar;
        JSONObject jSONObject;
        d dVar2;
        System.out.println((Object) "LynxVideoManager- __control -> ".concat(String.valueOf(str)));
        if (str != null) {
            boolean z = true;
            if (g.a(str) && (b2 = h.m.p.b(str, new String[]{"_*_"})) != null && b2.size() == 3 && 1 != 0) {
                List<String> b3 = h.m.p.b(str, new String[]{"_*_"});
                String str2 = b3.get(0);
                switch (str2.hashCode()) {
                    case -1879513255:
                        if (str2.equals("exitfullscreen")) {
                            ((d) this.mView).d();
                            return;
                        }
                        return;
                    case -619198582:
                        if (str2.equals("requestfullscreen")) {
                            ((d) this.mView).c();
                            return;
                        }
                        return;
                    case 3443508:
                        if (str2.equals("play") && (dVar = (d) this.mView) != null) {
                            dVar.a(null);
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
                            d dVar3 = (d) this.mView;
                            if (dVar3 != null) {
                                int optInt = jSONObject.optInt("position", 0);
                                if (jSONObject.optInt("play") != 1) {
                                    z = false;
                                }
                                dVar3.a(optInt, z);
                                return;
                            }
                            return;
                        }
                        return;
                    case 106440182:
                        if (str2.equals("pause") && (dVar2 = (d) this.mView) != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    static final class b extends h.f.b.m implements q<String, Map<String, ? extends Object>, d, z> {
        final /* synthetic */ LynxVideoManager this$0;

        static {
            Covode.recordClassIndex(21956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LynxVideoManager lynxVideoManager) {
            super(3);
            this.this$0 = lynxVideoManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
            if (r6.equals("onPlayFailed") != false) goto L_0x00af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
            if (r6.equals("onError") != false) goto L_0x00af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
            r7 = r3;
            r1 = "error";
         */
        @Override // h.f.a.q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(java.lang.String r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, com.bytedance.ies.xelement.d r8) {
            /*
            // Method dump skipped, instructions count: 268
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxVideoManager.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}

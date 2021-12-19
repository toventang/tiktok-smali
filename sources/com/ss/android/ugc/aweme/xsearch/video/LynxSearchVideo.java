package com.ss.android.ugc.aweme.xsearch.video;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.xsearch.video.d;
import h.a.am;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class LynxSearchVideo extends LynxUI<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f145251a = i.a((h.f.a.a) b.f145253a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f145252b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(94979);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
    }

    @p
    public final void pause() {
        ((b) this.mView).f();
    }

    @p
    public final void play() {
        ((b) this.mView).e();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        l.d("XSearchVideo measure", "");
        super.measure();
    }

    static final class b extends m implements h.f.a.a<Set<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145253a = new b();

        static {
            Covode.recordClassIndex(94980);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<? extends String> invoke() {
            return am.a((Object[]) new String[]{"play", "pause", "stop", "ended", "error", "loading", "timeupdate"});
        }
    }

    static {
        Covode.recordClassIndex(94978);
    }

    @p
    public final void stop() {
        b bVar = (b) this.mView;
        Aweme mAweme = bVar.getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        bVar.d();
        d.b.f145280a.a(null, null, null, bVar.f145258b);
    }

    public LynxSearchVideo(j jVar) {
        super(jVar);
    }

    @com.lynx.tasm.behavior.m(a = "autoplay")
    public final void setAutoPlay(boolean z) {
        ((b) this.mView).setAutoPlay(z);
    }

    @com.lynx.tasm.behavior.m(a = "muted")
    public final void setMuted(boolean z) {
        ((b) this.mView).setMuted(z);
    }

    @com.lynx.tasm.behavior.m(a = "repeat")
    public final void setRepeat(boolean z) {
        ((b) this.mView).setRepeat(z);
    }

    @com.lynx.tasm.behavior.m(a = "sessionid")
    public final void setSessionId(int i2) {
        ((b) this.mView).setSessionId(i2);
    }

    @com.lynx.tasm.behavior.m(a = "objectfit")
    public final void setObjectFit(String str) {
        l.d(str, "");
        ((b) this.mView).setObjectFit(str);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ b createView(Context context) {
        if (context == null) {
            l.b();
        }
        b bVar = new b(context, (byte) 0);
        bVar.setEventChangeListener(new c(this));
        return bVar;
    }

    @com.lynx.tasm.behavior.m(a = "awemeindex")
    public final void setAwemeIndex(ReadableMap readableMap) {
        if (readableMap != null) {
            ((b) this.mView).setAwemeIndex(new a((int) readableMap.getDouble("card_rank"), (int) readableMap.getDouble("aweme_index")));
        }
    }

    @com.lynx.tasm.behavior.m(a = "logextra")
    public final void setLogExtra(ReadableMap readableMap) {
        if (readableMap != null) {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            l.b(hashMap, "");
            ((b) this.mView).setLogExtra(hashMap);
        }
    }

    @com.lynx.tasm.behavior.m(a = "rate")
    public final void setRate(int i2) {
        System.out.println((Object) "XSearchVideo- rate -> ".concat(String.valueOf(i2)));
        ((b) this.mView).setRate(i2);
    }

    @com.lynx.tasm.behavior.m(a = "aweme")
    public final void setAweme(ReadableMap readableMap) {
        if (readableMap != null) {
            readableMap.getString("aid");
            GsonProvider c2 = GsonHolder.c();
            l.b(c2, "");
            String b2 = c2.b().b(readableMap);
            l.b(b2, "");
            ((b) this.mView).setAweme(b2);
        }
    }

    @com.lynx.tasm.behavior.m(a = "__control")
    public final void setControl(String str) {
        boolean z;
        List<String> b2;
        b bVar;
        JSONObject jSONObject;
        b bVar2;
        if (str != null) {
            boolean z2 = false;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (b2 = h.m.p.b(str, new String[]{"_*_"})) != null && b2.size() == 3) {
                List<String> b3 = h.m.p.b(str, new String[]{"_*_"});
                String str2 = b3.get(0);
                int hashCode = str2.hashCode();
                if (hashCode != 3443508) {
                    if (hashCode != 3526264) {
                        if (hashCode == 106440182 && str2.equals("pause") && (bVar2 = (b) this.mView) != null) {
                            bVar2.f();
                        }
                    } else if (str2.equals("seek")) {
                        try {
                            jSONObject = new JSONObject(b3.get(1));
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                        b bVar3 = (b) this.mView;
                        if (bVar3 != null) {
                            int optInt = jSONObject.optInt("position", 0);
                            if (jSONObject.optInt("play") == 1) {
                                z2 = true;
                            }
                            bVar3.a(optInt, z2);
                        }
                    }
                } else if (str2.equals("play") && (bVar = (b) this.mView) != null) {
                    bVar.e();
                }
            }
        }
    }

    @p
    public final void seek(int i2, boolean z) {
        ((b) this.mView).a(i2, z);
    }

    static final class c extends m implements h.f.a.m<String, Map<String, ? extends Object>, z> {
        final /* synthetic */ LynxSearchVideo this$0;

        static {
            Covode.recordClassIndex(94981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LynxSearchVideo lynxSearchVideo) {
            super(2);
            this.this$0 = lynxSearchVideo;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, ? extends Object> map) {
            String str2 = str;
            Map<String, ? extends Object> map2 = map;
            l.d(str2, "");
            l.d(map2, "");
            l.d(str2, "");
            if (((Set) LynxSearchVideo.f145251a.getValue()).contains(str2)) {
                j jVar = this.this$0.mContext;
                l.b(jVar, "");
                com.lynx.tasm.c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.this$0.getSign(), str2);
                for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                    cVar2.a(entry.getKey(), entry.getValue());
                }
                cVar.a(cVar2);
            }
            return z.f158842a;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        l.d("XSearchVideo updateLayout", "");
        super.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        l.d("XSearchVideo updateLayoutInfo", "");
        super.updateLayoutInfo(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }
}

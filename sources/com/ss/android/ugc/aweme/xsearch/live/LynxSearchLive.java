package com.ss.android.ugc.aweme.xsearch.live;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.c;
import com.ss.android.ugc.aweme.autoplay.player.b;
import h.a.am;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class LynxSearchLive extends LynxUI<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f145238a = new a((byte) 0);

    static {
        Covode.recordClassIndex(94966);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94967);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @p
    public final void play() {
        b.c cVar = ((b) this.mView).getDataProvider().f67521e;
        if (cVar != null) {
            cVar.a(150);
        }
    }

    @p
    public final void stop() {
        b.c cVar = ((b) this.mView).getDataProvider().f67521e;
        if (cVar != null) {
            cVar.e();
        }
    }

    @m(a = "autoplay")
    public final void setAutoPlay(boolean z) {
        ((b) this.mView).setAutoPlay(z);
    }

    @m(a = "muted")
    public final void setMuted(boolean z) {
        ((b) this.mView).setMuted(z);
    }

    @m(a = "sessionid")
    public final void setSessionId(int i2) {
        ((b) this.mView).setSessionId(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxSearchLive(j jVar) {
        super(jVar);
        l.d(jVar, "");
    }

    @m(a = "objectfit")
    public final void setObjectFit(String str) {
        l.d(str, "");
        ((b) this.mView).setObjectFit(str);
    }

    @m(a = "awemeindex")
    public final void setAwemeIndex(ReadableMap readableMap) {
        if (readableMap != null) {
            ((b) this.mView).setAwemeIndex(new a(readableMap.getInt("card_rank", -1), readableMap.getInt("aweme_index")));
        }
    }

    @m(a = "logextra")
    public final void setLogExtra(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        if (!(readableMap == null || (hashMap = readableMap.toHashMap()) == null)) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                l.b(key, "");
                hashMap2.put(key, entry.getValue());
            }
            ((b) this.mView).setLogExtra(hashMap2);
        }
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ b createView(Context context, Object obj) {
        l.d(context, "");
        b bVar = new b(context, (byte) 0);
        bVar.setEventChangeListener(new b(this));
        return bVar;
    }

    static final class b extends h.f.b.m implements h.f.a.m<String, Map<String, ? extends Object>, z> {
        final /* synthetic */ LynxSearchLive this$0;

        static {
            Covode.recordClassIndex(94968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LynxSearchLive lynxSearchLive) {
            super(2);
            this.this$0 = lynxSearchLive;
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
            if (am.a((Object[]) new String[]{"play", "ended", "error", "loading"}).contains(str2)) {
                j jVar = this.this$0.mContext;
                l.b(jVar, "");
                c cVar = jVar.f55897e;
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
        super.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        super.updateLayoutInfo(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }
}

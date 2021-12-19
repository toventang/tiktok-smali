package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.v;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class LynxSeekerManager extends LynxUI<com.bytedance.ies.xelement.d.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36563a = new a((byte) 0);

    static {
        Covode.recordClassIndex(21947);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            int i2 = 0;
            if (hashCode != -1992012396) {
                if (hashCode == 261482029 && nextKey.equals("currentDuration")) {
                    if (!readableMap.isNull(nextKey)) {
                        i2 = readableMap.getInt(nextKey, 0);
                    }
                    setProgress(i2);
                }
            } else if (nextKey.equals("duration")) {
                if (!readableMap.isNull(nextKey)) {
                    i2 = readableMap.getInt(nextKey, 0);
                }
                setDuration(i2);
            }
            super.dispatchProperties(vVar);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21950);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public LynxSeekerManager(j jVar) {
        super(jVar);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ com.bytedance.ies.xelement.d.a createView(Context context) {
        com.bytedance.ies.xelement.d.a aVar = new com.bytedance.ies.xelement.d.a(context);
        aVar.setStateReporter(new b(this));
        return aVar;
    }

    @m(a = "currentDuration")
    public final void setProgress(int i2) {
        View view = this.mView;
        l.a((Object) view, "");
        ((com.bytedance.ies.xelement.d.a) view).setProgress(i2);
    }

    @m(a = "duration")
    public final void setDuration(int i2) {
        View view = this.mView;
        l.a((Object) view, "");
        ((com.bytedance.ies.xelement.d.a) view).setEnabled(true);
        View view2 = this.mView;
        l.a((Object) view2, "");
        ((com.bytedance.ies.xelement.d.a) view2).setMax(i2);
    }

    static final class b extends h.f.b.m implements q<String, Map<String, ? extends Object>, com.bytedance.ies.xelement.d.a, z> {
        final /* synthetic */ LynxSeekerManager this$0;

        static {
            Covode.recordClassIndex(21951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LynxSeekerManager lynxSeekerManager) {
            super(3);
            this.this$0 = lynxSeekerManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[LOOP:0: B:14:0x0050->B:16:0x0056, LOOP_END] */
        @Override // h.f.a.q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, com.bytedance.ies.xelement.d.a r10) {
            /*
            // Method dump skipped, instructions count: 136
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxSeekerManager.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}

package com.bytedance.ies.xelement.pickview;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.g;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.v;
import h.f.b.l;
import h.p;
import h.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class LynxPickerViewColumn extends LynxUI<com.bytedance.ies.xelement.pickview.e.a> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37361b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f37362a;

    /* renamed from: c  reason: collision with root package name */
    private com.lynx.react.bridge.a f37363c;

    /* renamed from: d  reason: collision with root package name */
    private com.lynx.react.bridge.a f37364d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.ies.xelement.c.a f37365e;

    static {
        Covode.recordClassIndex(22449);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (nextKey.hashCode()) {
                case -752785969:
                    if (nextKey.equals("range-key")) {
                        setRangeKey(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -208291852:
                    if (nextKey.equals("visible-count")) {
                        setVisibleCount(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 108280125:
                    if (nextKey.equals("range")) {
                        setRange(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 111972721:
                    if (nextKey.equals("value")) {
                        setValue(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1256871824:
                    if (nextKey.equals("mask-style")) {
                        setMaskStyle(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 2065426547:
                    if (nextKey.equals("indicator-style")) {
                        setIndicatorStyle(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22452);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements com.bytedance.ies.xelement.pickview.b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerViewColumn f37367a;

        static {
            Covode.recordClassIndex(22454);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f37367a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.b.c
        public final void c(String str) {
            l.c(str, "");
            ((com.bytedance.ies.xelement.pickview.e.a) this.f37367a.mView).setCenterWeight(str);
        }

        @Override // com.bytedance.ies.xelement.pickview.b.c
        public final void a(String str) {
            l.c(str, "");
            ((com.bytedance.ies.xelement.pickview.e.a) this.f37367a.mView).setTextSizePx(com.bytedance.ies.xelement.pickview.b.e.a(this.f37367a.mContext, str));
        }

        @Override // com.bytedance.ies.xelement.pickview.b.c
        public final void b(String str) {
            l.c(str, "");
            Long a2 = com.bytedance.ies.xelement.pickview.b.e.a(str);
            if (a2 != null) {
                int longValue = (int) a2.longValue();
                ((com.bytedance.ies.xelement.pickview.e.a) this.f37367a.mView).setTextColorCenter(longValue);
                ((com.bytedance.ies.xelement.pickview.e.a) this.f37367a.mView).setTextColorOut(longValue);
            }
        }
    }

    public static final class d implements com.bytedance.ies.xelement.pickview.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerViewColumn f37368a;

        static {
            Covode.recordClassIndex(22455);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f37368a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.b.a
        public final void a(String str) {
            l.c(str, "");
            ((com.bytedance.ies.xelement.pickview.e.a) this.f37368a.mView).setDividerWidth(com.bytedance.ies.xelement.pickview.b.e.a(this.f37368a.mContext, str));
        }

        @Override // com.bytedance.ies.xelement.pickview.b.a
        public final void b(String str) {
            l.c(str, "");
            Long a2 = com.bytedance.ies.xelement.pickview.b.e.a(str);
            if (a2 != null) {
                ((com.bytedance.ies.xelement.pickview.e.a) this.f37368a.mView).setDividerColor((int) a2.longValue());
            }
        }
    }

    public static final class e implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerViewColumn f37369a;

        static {
            Covode.recordClassIndex(22456);
        }

        @Override // com.bytedance.ies.xelement.pickview.b.g
        public final void b(String str) {
            l.c(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f37369a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.b.g
        public final void a(String str) {
            l.c(str, "");
            ((com.bytedance.ies.xelement.pickview.e.a) this.f37369a.mView).setUserItemHeight(com.bytedance.ies.xelement.pickview.b.e.a(this.f37369a.mContext, str));
        }
    }

    public static final class f implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerViewColumn f37370a;

        static {
            Covode.recordClassIndex(22457);
        }

        @Override // com.bytedance.ies.xelement.pickview.b.g
        public final void a(String str) {
            l.c(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f37370a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.b.g
        public final void b(String str) {
            l.c(str, "");
            Long a2 = com.bytedance.ies.xelement.pickview.b.e.a(str);
            if (a2 != null) {
                ((com.bytedance.ies.xelement.pickview.e.a) this.f37370a.mView).setMaskColor((int) a2.longValue());
            }
        }
    }

    @m(a = "range-key")
    public final void setRangeKey(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        this.f37364d = aVar;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f37362a = map.containsKey("change");
        }
    }

    @m(a = "mask-style")
    public final void setMaskStyle(String str) {
        l.c(str, "");
        com.bytedance.ies.xelement.pickview.b.f.a(com.bytedance.ies.xelement.pickview.b.d.a(str), new f(this));
    }

    @m(a = "visible-count")
    public final void setVisibleCount(String str) {
        int i2;
        l.c(str, "");
        try {
            i2 = Integer.parseInt(str);
        } catch (Exception unused) {
            i2 = 5;
        }
        ((com.bytedance.ies.xelement.pickview.e.a) this.mView).setItemsVisibleCount(i2);
    }

    static final class b implements com.bytedance.ies.xelement.pickview.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerViewColumn f37366a;

        static {
            Covode.recordClassIndex(22453);
        }

        b(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f37366a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.c.b
        public final void a(int i2) {
            if (this.f37366a.f37362a) {
                com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(this.f37366a.getSign(), "change");
                cVar.a("value", Integer.valueOf(i2));
                j jVar = this.f37366a.mContext;
                l.a((Object) jVar, "");
                jVar.f55897e.a(cVar);
            }
        }
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ com.bytedance.ies.xelement.pickview.e.a createView(Context context) {
        com.bytedance.ies.xelement.pickview.e.a aVar = new com.bytedance.ies.xelement.pickview.e.a(context);
        aVar.setLocalizeAdapter(this.f37365e);
        aVar.setCyclic(false);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aVar.setOnItemSelectedListener(new b(this));
        aVar.setCurrentIndex(0);
        return aVar;
    }

    @m(a = "indicator-style")
    public final void setIndicatorStyle(String str) {
        l.c(str, "");
        List<p<String, String>> a2 = com.bytedance.ies.xelement.pickview.b.d.a(str);
        c cVar = new c(this);
        l.c(a2, "");
        l.c(cVar, "");
        String a3 = com.bytedance.ies.xelement.pickview.b.f.a(a2, com.bytedance.ies.xelement.pickview.b.b.f37373b);
        if (a3 != null) {
            cVar.a(a3);
        }
        String a4 = com.bytedance.ies.xelement.pickview.b.f.a(a2, com.bytedance.ies.xelement.pickview.b.b.f37372a);
        if (a4 != null) {
            cVar.b(a4);
        }
        String a5 = com.bytedance.ies.xelement.pickview.b.f.a(a2, com.bytedance.ies.xelement.pickview.b.b.f37374c);
        if (a5 != null) {
            cVar.c(a5);
        }
        d dVar = new d(this);
        l.c(a2, "");
        l.c(dVar, "");
        String a6 = com.bytedance.ies.xelement.pickview.b.f.a(a2, com.bytedance.ies.xelement.pickview.b.b.f37375d);
        if (a6 != null) {
            dVar.a(a6);
        }
        String a7 = com.bytedance.ies.xelement.pickview.b.f.a(a2, com.bytedance.ies.xelement.pickview.b.b.f37376e);
        if (a7 != null) {
            dVar.b(a7);
        }
        com.bytedance.ies.xelement.pickview.b.f.a(a2, new e(this));
    }

    @m(a = "value")
    public final void setValue(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        int i2 = 0;
        if (aVar.h() == ReadableType.String) {
            try {
                String e2 = aVar.e();
                l.a((Object) e2, "");
                i2 = Integer.parseInt(e2);
            } catch (Exception unused) {
            }
        } else if (aVar.h() == ReadableType.Int || aVar.h() == ReadableType.Long) {
            i2 = aVar.d();
        } else if (aVar.h() == ReadableType.Number) {
            i2 = (int) aVar.c();
        }
        com.bytedance.ies.xelement.pickview.e.a aVar2 = (com.bytedance.ies.xelement.pickview.e.a) this.mView;
        if (aVar2 != null) {
            aVar2.setCurrentIndex(i2);
        }
    }

    @m(a = "range")
    public final void setRange(com.lynx.react.bridge.a aVar) {
        ReadableArray f2;
        String e2;
        l.c(aVar, "");
        this.f37363c = aVar;
        if (!(aVar.h() != ReadableType.Array || aVar.a() || 1 == 0 || (f2 = aVar.f()) == null || f2.size() <= 0 || f2.isNull(0))) {
            ArrayList arrayList = new ArrayList();
            if (f2.getType(0) == ReadableType.String) {
                ArrayList<Object> arrayList2 = f2.toArrayList();
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                com.lynx.react.bridge.a aVar2 = this.f37364d;
                if (!(aVar2 == null || (e2 = aVar2.e()) == null)) {
                    int size = f2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String string = f2.getMap(i2).getString(e2);
                        l.a((Object) string, "");
                        arrayList.add(string);
                    }
                }
            }
            com.bytedance.ies.xelement.pickview.e.a aVar3 = (com.bytedance.ies.xelement.pickview.e.a) this.mView;
            l.a((Object) aVar3, "");
            aVar3.setAdapter(new com.bytedance.ies.xelement.pickview.a.a(arrayList));
            ((com.bytedance.ies.xelement.pickview.e.a) this.mView).setItemsVisibleCount(5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxPickerViewColumn(j jVar, com.bytedance.ies.xelement.c.a aVar) {
        super(jVar);
        l.c(jVar, "");
        l.c(aVar, "");
        this.f37365e = aVar;
    }
}

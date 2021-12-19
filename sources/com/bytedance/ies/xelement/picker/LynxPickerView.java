package com.bytedance.ies.xelement.picker;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.utils.ColorUtils;
import h.a.ag;
import h.f.b.ad;
import h.p;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class LynxPickerView extends UISimpleView<com.lynx.tasm.behavior.ui.view.a> {
    public static final a t = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f37205a;

    /* renamed from: b  reason: collision with root package name */
    com.lynx.react.bridge.a f37206b;

    /* renamed from: c  reason: collision with root package name */
    com.lynx.react.bridge.a f37207c;

    /* renamed from: d  reason: collision with root package name */
    com.lynx.react.bridge.a f37208d;

    /* renamed from: e  reason: collision with root package name */
    String f37209e;

    /* renamed from: f  reason: collision with root package name */
    String f37210f;

    /* renamed from: g  reason: collision with root package name */
    String f37211g;

    /* renamed from: h  reason: collision with root package name */
    String f37212h;

    /* renamed from: i  reason: collision with root package name */
    public String f37213i;

    /* renamed from: j  reason: collision with root package name */
    public String f37214j;

    /* renamed from: k  reason: collision with root package name */
    String f37215k;

    /* renamed from: l  reason: collision with root package name */
    String f37216l;

    /* renamed from: m  reason: collision with root package name */
    String f37217m;
    String n;
    String o;
    public boolean p;
    public boolean q;
    public boolean r;
    com.bytedance.ies.xelement.c.a s;

    static {
        Covode.recordClassIndex(22376);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (nextKey.hashCode()) {
                case -1274708295:
                    if (nextKey.equals("fields")) {
                        setFields(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -854975978:
                    if (nextKey.equals("confirm-color")) {
                        setConfirmColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -752785969:
                    if (nextKey.equals("range-key")) {
                        setRangeKey(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -586660946:
                    if (nextKey.equals("title-color")) {
                        setTitleColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -271594562:
                    if (nextKey.equals("confirm-string")) {
                        setConfirmString(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -28424822:
                    if (nextKey.equals("title-font-size")) {
                        setTitleFontSize(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 100571:
                    if (nextKey.equals("end")) {
                        setEnd(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextKey.equals("mode")) {
                        setMode(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 49495748:
                    if (nextKey.equals("cancel-string")) {
                        setCancelString(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 108280125:
                    if (nextKey.equals("range")) {
                        setRange(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 109757538:
                    if (nextKey.equals("start")) {
                        setStart(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 110371416:
                    if (nextKey.equals("title")) {
                        setTitle(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 111972721:
                    if (nextKey.equals("value")) {
                        setValue(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1372139088:
                    if (nextKey.equals("cancel-color")) {
                        setCancelColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1732829925:
                    if (nextKey.equals("separator")) {
                        setSeparator(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22379);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements com.bytedance.ies.xelement.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37220a;

        static {
            Covode.recordClassIndex(22381);
        }

        @Override // com.bytedance.ies.xelement.c.a
        public final Map<String, String> a() {
            p[] pVarArr = new p[2];
            String str = this.f37220a.f37213i;
            if (str == null) {
                str = "Confirm";
            }
            pVarArr[0] = h.v.a("confirm", str);
            String str2 = this.f37220a.f37214j;
            if (str2 == null) {
                str2 = "Cancel";
            }
            pVarArr[1] = h.v.a("cancel", str2);
            return ag.a(pVarArr);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(LynxPickerView lynxPickerView) {
            this.f37220a = lynxPickerView;
        }
    }

    static final class e implements com.bytedance.ies.xelement.picker.e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37222a;

        static {
            Covode.recordClassIndex(22383);
        }

        e(LynxPickerView lynxPickerView) {
            this.f37222a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.e.a
        public final void a() {
            if (this.f37222a.p) {
                com.lynx.tasm.behavior.j jVar = this.f37222a.mContext;
                h.f.b.l.a((Object) jVar, "");
                jVar.f55897e.a(new com.lynx.tasm.c.c(this.f37222a.getSign(), "cancel"));
            }
        }
    }

    public static final class f implements com.bytedance.ies.xelement.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37223a;

        static {
            Covode.recordClassIndex(22384);
        }

        @Override // com.bytedance.ies.xelement.c.a
        public final Map<String, String> a() {
            p[] pVarArr = new p[2];
            String str = this.f37223a.f37213i;
            if (str == null) {
                str = "Confirm";
            }
            pVarArr[0] = h.v.a("confirm", str);
            String str2 = this.f37223a.f37214j;
            if (str2 == null) {
                str2 = "Cancel";
            }
            pVarArr[1] = h.v.a("cancel", str2);
            return ag.a(pVarArr);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(LynxPickerView lynxPickerView) {
            this.f37223a = lynxPickerView;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements com.bytedance.ies.xelement.picker.e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37226a;

        static {
            Covode.recordClassIndex(22387);
        }

        i(LynxPickerView lynxPickerView) {
            this.f37226a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.e.a
        public final void a() {
            if (this.f37226a.p) {
                com.lynx.tasm.behavior.j jVar = this.f37226a.mContext;
                h.f.b.l.a((Object) jVar, "");
                jVar.f55897e.a(new com.lynx.tasm.c.c(this.f37226a.getSign(), "cancel"));
            }
        }
    }

    public static final class j implements com.bytedance.ies.xelement.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37227a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f37228b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f37229c;

        static {
            Covode.recordClassIndex(22388);
        }

        @Override // com.bytedance.ies.xelement.c.a
        public final Map<String, String> a() {
            p[] pVarArr = new p[2];
            String str = this.f37227a.f37213i;
            if (str == null) {
                str = "Confirm";
            }
            pVarArr[0] = h.v.a("confirm", str);
            String str2 = this.f37227a.f37214j;
            if (str2 == null) {
                str2 = "Cancel";
            }
            pVarArr[1] = h.v.a("cancel", str2);
            return ag.a(pVarArr);
        }

        j(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f37227a = lynxPickerView;
            this.f37228b = list;
            this.f37229c = num;
        }
    }

    static final class l implements com.bytedance.ies.xelement.picker.e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f37234b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f37235c;

        static {
            Covode.recordClassIndex(22390);
        }

        l(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f37233a = lynxPickerView;
            this.f37234b = list;
            this.f37235c = num;
        }

        @Override // com.bytedance.ies.xelement.picker.e.a
        public final void a() {
            if (this.f37233a.p) {
                com.lynx.tasm.behavior.j jVar = this.f37233a.mContext;
                h.f.b.l.a((Object) jVar, "");
                jVar.f55897e.a(new com.lynx.tasm.c.c(this.f37233a.getSign(), "cancel"));
            }
        }
    }

    public static final class m implements com.bytedance.ies.xelement.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37236a;

        static {
            Covode.recordClassIndex(22391);
        }

        @Override // com.bytedance.ies.xelement.c.a
        public final Map<String, String> a() {
            p[] pVarArr = new p[2];
            String str = this.f37236a.f37213i;
            if (str == null) {
                str = "Confirm";
            }
            pVarArr[0] = h.v.a("confirm", str);
            String str2 = this.f37236a.f37214j;
            if (str2 == null) {
                str2 = "Cancel";
            }
            pVarArr[1] = h.v.a("cancel", str2);
            return ag.a(pVarArr);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(LynxPickerView lynxPickerView) {
            this.f37236a = lynxPickerView;
        }
    }

    static final class o implements com.bytedance.ies.xelement.picker.e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37238a;

        static {
            Covode.recordClassIndex(22393);
        }

        o(LynxPickerView lynxPickerView) {
            this.f37238a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.e.a
        public final void a() {
            if (this.f37238a.p) {
                com.lynx.tasm.behavior.j jVar = this.f37238a.mContext;
                h.f.b.l.a((Object) jVar, "");
                jVar.f55897e.a(new com.lynx.tasm.c.c(this.f37238a.getSign(), "cancel"));
            }
        }
    }

    @com.lynx.tasm.behavior.m(a = "cancel-color")
    public final void setCancelColor(String str) {
        this.f37216l = str;
    }

    @com.lynx.tasm.behavior.m(a = "cancel-string")
    public final void setCancelString(String str) {
        this.f37214j = str;
    }

    @com.lynx.tasm.behavior.m(a = "confirm-color")
    public final void setConfirmColor(String str) {
        this.f37215k = str;
    }

    @com.lynx.tasm.behavior.m(a = "confirm-string")
    public final void setConfirmString(String str) {
        this.f37213i = str;
    }

    @com.lynx.tasm.behavior.m(a = "end")
    public final void setEnd(String str) {
        this.f37210f = str;
    }

    @com.lynx.tasm.behavior.m(a = "fields")
    public final void setFields(String str) {
        this.f37211g = str;
    }

    @com.lynx.tasm.behavior.m(a = "range")
    public final void setRange(com.lynx.react.bridge.a aVar) {
        this.f37207c = aVar;
    }

    @com.lynx.tasm.behavior.m(a = "range-key")
    public final void setRangeKey(com.lynx.react.bridge.a aVar) {
        this.f37208d = aVar;
    }

    @com.lynx.tasm.behavior.m(a = "separator")
    public final void setSeparator(String str) {
        this.f37212h = str;
    }

    @com.lynx.tasm.behavior.m(a = "start")
    public final void setStart(String str) {
        this.f37209e = str;
    }

    @com.lynx.tasm.behavior.m(a = "title")
    public final void setTitle(String str) {
        this.f37217m = str;
    }

    @com.lynx.tasm.behavior.m(a = "title-color")
    public final void setTitleColor(String str) {
        this.n = str;
    }

    @com.lynx.tasm.behavior.m(a = "title-font-size")
    public final void setTitleFontSize(String str) {
        this.o = str;
    }

    @com.lynx.tasm.behavior.m(a = "value")
    public final void setValue(com.lynx.react.bridge.a aVar) {
        this.f37206b = aVar;
    }

    @com.lynx.tasm.behavior.m(a = "mode")
    public final void setMode(String str) {
        h.f.b.l.c(str, "");
        this.f37205a = str;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        h.f.b.l.c(context, "");
        com.lynx.tasm.behavior.ui.view.a aVar = new com.lynx.tasm.behavior.ui.view.a(context);
        aVar.setOnClickListener(new b(this, context));
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.p = map.containsKey("cancel");
            this.q = map.containsKey("change");
            this.r = map.containsKey("columnchange");
        }
    }

    static final class d implements com.bytedance.ies.xelement.picker.e.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37221a;

        static {
            Covode.recordClassIndex(22382);
        }

        d(LynxPickerView lynxPickerView) {
            this.f37221a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.e.j
        public final void a(String str) {
            if (this.f37221a.q) {
                com.lynx.tasm.behavior.j jVar = this.f37221a.mContext;
                h.f.b.l.a((Object) jVar, "");
                com.lynx.tasm.c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37221a.getSign(), "change");
                cVar2.a("value", str);
                cVar.a(cVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements com.bytedance.ies.xelement.picker.e.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37224a;

        static {
            Covode.recordClassIndex(22385);
        }

        g(LynxPickerView lynxPickerView) {
            this.f37224a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.e.h
        public final void a(List<Integer> list) {
            if (this.f37224a.q) {
                com.lynx.tasm.behavior.j jVar = this.f37224a.mContext;
                h.f.b.l.a((Object) jVar, "");
                com.lynx.tasm.c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37224a.getSign(), "change");
                cVar2.a("value", list);
                cVar.a(cVar2);
            }
        }
    }

    static final class k implements com.bytedance.ies.xelement.picker.e.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37230a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f37231b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f37232c;

        static {
            Covode.recordClassIndex(22389);
        }

        k(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f37230a = lynxPickerView;
            this.f37231b = list;
            this.f37232c = num;
        }

        @Override // com.bytedance.ies.xelement.picker.e.h
        public final void a(List<Integer> list) {
            if (this.f37230a.q) {
                com.lynx.tasm.behavior.j jVar = this.f37230a.mContext;
                h.f.b.l.a((Object) jVar, "");
                com.lynx.tasm.c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37230a.getSign(), "change");
                cVar2.a("value", list.get(0));
                cVar.a(cVar2);
            }
        }
    }

    static final class n implements com.bytedance.ies.xelement.picker.e.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37237a;

        static {
            Covode.recordClassIndex(22392);
        }

        n(LynxPickerView lynxPickerView) {
            this.f37237a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.e.j
        public final void a(String str) {
            if (this.f37237a.q) {
                com.lynx.tasm.behavior.j jVar = this.f37237a.mContext;
                h.f.b.l.a((Object) jVar, "");
                com.lynx.tasm.c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37237a.getSign(), "change");
                cVar2.a("value", str);
                cVar.a(cVar2);
            }
        }
    }

    public final void a(Context context) {
        ReadableArray f2;
        com.bytedance.ies.xelement.c.a fVar;
        ReadableArray f3;
        ReadableArray f4;
        String string;
        com.lynx.react.bridge.a aVar = this.f37207c;
        if (!(aVar == null || aVar.h() != ReadableType.Array || aVar.a())) {
            ArrayList arrayList = null;
            if (!(1 == 0 || (f2 = aVar.f()) == null)) {
                ArrayList arrayList2 = new ArrayList();
                int size = f2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ReadableArray array = f2.getArray(i2);
                    ArrayList arrayList3 = new ArrayList();
                    if (!array.isNull(0)) {
                        if (array.getType(0) == ReadableType.String) {
                            ArrayList<Object> arrayList4 = array.toArrayList();
                            if (arrayList4 != null) {
                                arrayList3.addAll(ad.d(arrayList4));
                            } else {
                                throw new w("null cannot be cast to non-null type");
                            }
                        } else {
                            com.lynx.react.bridge.a aVar2 = this.f37208d;
                            if (!(aVar2 == null || (f4 = aVar2.f()) == null || (string = f4.getString(i2)) == null)) {
                                int size2 = array.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    String string2 = array.getMap(i3).getString(string);
                                    h.f.b.l.a((Object) string2, "");
                                    arrayList3.add(string2);
                                }
                            }
                        }
                    }
                    arrayList2.add(arrayList3);
                }
                com.lynx.react.bridge.a aVar3 = this.f37206b;
                ArrayList<Object> arrayList5 = (aVar3 == null || (f3 = aVar3.f()) == null) ? null : f3.toArrayList();
                if (ad.c(arrayList5) && arrayList5 != null) {
                    ArrayList arrayList6 = new ArrayList(h.a.n.a((Iterable) arrayList5, 10));
                    Iterator<T> it = arrayList5.iterator();
                    while (it.hasNext()) {
                        arrayList6.add(Integer.valueOf((int) it.next().doubleValue()));
                    }
                    arrayList = arrayList6;
                }
                com.bytedance.ies.xelement.picker.b.c cVar = new com.bytedance.ies.xelement.picker.b.c(context);
                if (!(this.f37213i == null && this.f37214j == null && (fVar = this.s) != null)) {
                    fVar = new f(this);
                }
                com.bytedance.ies.xelement.picker.b.c b2 = ((com.bytedance.ies.xelement.picker.b.c) cVar.a(fVar).a(new g(this)).a(new h(this)).a(new i(this))).a(arrayList2).b(arrayList);
                String str = this.f37215k;
                if (str != null) {
                    b2.a(ColorUtils.a(str));
                }
                String str2 = this.f37216l;
                if (str2 != null) {
                    b2.b(ColorUtils.a(str2));
                }
                String str3 = this.f37217m;
                if (str3 != null) {
                    b2.a(str3);
                }
                String str4 = this.n;
                if (str4 != null) {
                    b2.c(ColorUtils.a(str4));
                }
                String str5 = this.o;
                if (str5 != null) {
                    b2.d((int) com.lynx.tasm.utils.n.a(str5));
                }
                b2.b().a(this.mView);
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f37219b;

        static {
            Covode.recordClassIndex(22380);
        }

        b(LynxPickerView lynxPickerView, Context context) {
            this.f37218a = lynxPickerView;
            this.f37219b = context;
        }

        public final void onClick(View view) {
            com.bytedance.ies.xelement.c.a cVar;
            com.bytedance.ies.xelement.c.a mVar;
            ReadableArray f2;
            String e2;
            com.bytedance.ies.xelement.c.a jVar;
            String str = this.f37218a.f37205a;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            switch (str.hashCode()) {
                case -1364270024:
                    if (str.equals("multiSelector")) {
                        this.f37218a.a(this.f37219b);
                        return;
                    }
                    return;
                case 3076014:
                    if (str.equals("date")) {
                        LynxPickerView lynxPickerView = this.f37218a;
                        Context context = this.f37219b;
                        String str4 = lynxPickerView.f37209e;
                        String str5 = lynxPickerView.f37210f;
                        com.lynx.react.bridge.a aVar = lynxPickerView.f37206b;
                        if (aVar != null) {
                            str2 = aVar.e();
                        }
                        String str6 = lynxPickerView.f37211g;
                        String str7 = lynxPickerView.f37212h;
                        com.bytedance.ies.xelement.picker.b.b bVar = new com.bytedance.ies.xelement.picker.b.b(context);
                        if (lynxPickerView.f37213i == null && lynxPickerView.f37214j == null && lynxPickerView.s != null) {
                            cVar = lynxPickerView.s;
                        } else {
                            cVar = new c(lynxPickerView);
                        }
                        com.bytedance.ies.xelement.picker.b.b d2 = ((com.bytedance.ies.xelement.picker.b.b) bVar.a(cVar).a(new d(lynxPickerView)).a(new e(lynxPickerView))).c(str7).b(str6).a(str4, str5).d(str2);
                        String str8 = lynxPickerView.f37215k;
                        if (str8 != null) {
                            d2.a(ColorUtils.a(str8));
                        }
                        String str9 = lynxPickerView.f37216l;
                        if (str9 != null) {
                            d2.b(ColorUtils.a(str9));
                        }
                        String str10 = lynxPickerView.f37217m;
                        if (str10 != null) {
                            d2.a(str10);
                        }
                        String str11 = lynxPickerView.n;
                        if (str11 != null) {
                            d2.c(ColorUtils.a(str11));
                        }
                        String str12 = lynxPickerView.o;
                        if (str12 != null) {
                            d2.d((int) com.lynx.tasm.utils.n.a(str12));
                        }
                        d2.b().a(lynxPickerView.mView);
                        return;
                    }
                    return;
                case 3560141:
                    if (str.equals("time")) {
                        LynxPickerView lynxPickerView2 = this.f37218a;
                        Context context2 = this.f37219b;
                        String str13 = lynxPickerView2.f37209e;
                        String str14 = lynxPickerView2.f37210f;
                        com.lynx.react.bridge.a aVar2 = lynxPickerView2.f37206b;
                        if (aVar2 != null) {
                            str3 = aVar2.e();
                        }
                        String str15 = lynxPickerView2.f37211g;
                        String str16 = lynxPickerView2.f37212h;
                        com.bytedance.ies.xelement.picker.b.d dVar = new com.bytedance.ies.xelement.picker.b.d(context2);
                        if (lynxPickerView2.f37213i == null && lynxPickerView2.f37214j == null && lynxPickerView2.s != null) {
                            mVar = lynxPickerView2.s;
                        } else {
                            mVar = new m(lynxPickerView2);
                        }
                        com.bytedance.ies.xelement.picker.b.d d3 = ((com.bytedance.ies.xelement.picker.b.d) dVar.a(mVar).a(new n(lynxPickerView2)).a(new o(lynxPickerView2))).c(str16).b(str15).a(str13, str14).d(str3);
                        String str17 = lynxPickerView2.f37215k;
                        if (str17 != null) {
                            d3.a(ColorUtils.a(str17));
                        }
                        String str18 = lynxPickerView2.f37216l;
                        if (str18 != null) {
                            d3.b(ColorUtils.a(str18));
                        }
                        String str19 = lynxPickerView2.f37217m;
                        if (str19 != null) {
                            d3.a(str19);
                        }
                        String str20 = lynxPickerView2.n;
                        if (str20 != null) {
                            d3.c(ColorUtils.a(str20));
                        }
                        String str21 = lynxPickerView2.o;
                        if (str21 != null) {
                            d3.d((int) com.lynx.tasm.utils.n.a(str21));
                        }
                        d3.b().a(lynxPickerView2.mView);
                        return;
                    }
                    return;
                case 1191572447:
                    if (str.equals("selector")) {
                        LynxPickerView lynxPickerView3 = this.f37218a;
                        Context context3 = this.f37219b;
                        com.lynx.react.bridge.a aVar3 = lynxPickerView3.f37207c;
                        if (!(aVar3 == null || aVar3.h() != ReadableType.Array || aVar3.a() || (f2 = aVar3.f()) == null || f2.size() <= 0 || f2.isNull(0))) {
                            ArrayList arrayList = new ArrayList();
                            if (f2.getType(0) == ReadableType.String) {
                                ArrayList<Object> arrayList2 = f2.toArrayList();
                                if (arrayList2 != null) {
                                    arrayList.addAll(arrayList2);
                                } else {
                                    throw new w("null cannot be cast to non-null type");
                                }
                            } else {
                                com.lynx.react.bridge.a aVar4 = lynxPickerView3.f37208d;
                                if (!(aVar4 == null || (e2 = aVar4.e()) == null)) {
                                    int size = f2.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        String string = f2.getMap(i2).getString(e2);
                                        h.f.b.l.a((Object) string, "");
                                        arrayList.add(string);
                                    }
                                }
                            }
                            com.lynx.react.bridge.a aVar5 = lynxPickerView3.f37206b;
                            if (aVar5 != null) {
                                num = Integer.valueOf(aVar5.d());
                            }
                            com.bytedance.ies.xelement.picker.b.c cVar2 = new com.bytedance.ies.xelement.picker.b.c(context3);
                            if (lynxPickerView3.f37213i == null && lynxPickerView3.f37214j == null && lynxPickerView3.s != null) {
                                jVar = lynxPickerView3.s;
                            } else {
                                jVar = new j(lynxPickerView3, arrayList, num);
                            }
                            cVar2.a(jVar);
                            cVar2.a(new k(lynxPickerView3, arrayList, num));
                            cVar2.a(new l(lynxPickerView3, arrayList, num));
                            cVar2.a(h.a.n.c(arrayList));
                            if (num != null) {
                                cVar2.b(h.a.n.c(Integer.valueOf(num.intValue())));
                            }
                            String str22 = lynxPickerView3.f37215k;
                            if (str22 != null) {
                                cVar2.a(ColorUtils.a(str22));
                            }
                            String str23 = lynxPickerView3.f37216l;
                            if (str23 != null) {
                                cVar2.b(ColorUtils.a(str23));
                            }
                            String str24 = lynxPickerView3.f37217m;
                            if (str24 != null) {
                                cVar2.a(str24);
                            }
                            String str25 = lynxPickerView3.n;
                            if (str25 != null) {
                                cVar2.c(ColorUtils.a(str25));
                            }
                            String str26 = lynxPickerView3.o;
                            if (str26 != null) {
                                cVar2.d((int) com.lynx.tasm.utils.n.a(str26));
                            }
                            cVar2.b().a(lynxPickerView3.mView);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements com.bytedance.ies.xelement.picker.e.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPickerView f37225a;

        static {
            Covode.recordClassIndex(22386);
        }

        h(LynxPickerView lynxPickerView) {
            this.f37225a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.e.g
        public final void a(int i2, Integer num) {
            if (this.f37225a.r) {
                com.lynx.tasm.behavior.j jVar = this.f37225a.mContext;
                h.f.b.l.a((Object) jVar, "");
                com.lynx.tasm.c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37225a.getSign(), "columnchange");
                cVar2.a("column", Integer.valueOf(i2));
                cVar2.a("value", num);
                cVar.a(cVar2);
            }
        }
    }
}

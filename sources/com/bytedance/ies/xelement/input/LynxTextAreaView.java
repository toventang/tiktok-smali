package com.bytedance.ies.xelement.input;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.input.c;
import com.bytedance.ies.xelement.input.d;
import com.bytedance.ies.xelement.text.a.c;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.h;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.utils.n;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.ab;
import h.f.b.l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LynxTextAreaView extends LynxBaseInputView {
    public static final a F = new a((byte) 0);
    private static Field J;
    private static Field K;
    public final List<g> A = new ArrayList();
    public final int B = 1;
    public final int C = 16;
    int D;
    public h.f.a.b<? super Context, ? extends com.bytedance.ies.xelement.text.a.b> E = b.f37117a;
    private final int G;
    private boolean H;
    private boolean I;
    public c v;
    public boolean w;
    public int x;
    public ClipboardManager y;
    public boolean z;

    static {
        Covode.recordClassIndex(22323);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void a(EditText editText, String str) {
        l.c(editText, "");
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (nextKey.hashCode()) {
                case -1550570986:
                    if (nextKey.equals("richtype")) {
                        setRichType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -428786256:
                    if (nextKey.equals("max-height")) {
                        setMaxHeight(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 419784731:
                    if (nextKey.equals("maxlines")) {
                        int i2 = Integer.MAX_VALUE;
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, Integer.MAX_VALUE);
                        }
                        setMaxLines(i2);
                        continue;
                    }
                    break;
                case 2043213058:
                    if (nextKey.equals("min-height")) {
                        setMinHeight(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @p
    public final void resetSelectionMenu() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22326);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean f() {
        c cVar = this.v;
        if (cVar == null) {
            l.a("mEditText");
        }
        if (cVar.getMaxHeight() < 0) {
            return false;
        }
        c cVar2 = this.v;
        if (cVar2 == null) {
            l.a("mEditText");
        }
        if (cVar2.getMinHeight() >= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void b() {
        super.b();
        if (this.f37091c != null && f()) {
            if (d()) {
                int i2 = this.D;
                g();
                if (this.D != i2) {
                    e();
                    return;
                }
                return;
            }
            this.I = true;
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        super.layout();
        if (d() && this.I) {
            g();
        }
        if (d() && this.H) {
            this.t.b();
            this.H = false;
        }
        if (f()) {
            e();
        }
    }

    public static final class e implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxTextAreaView f37122a;

        static {
            Covode.recordClassIndex(22330);
        }

        @Override // com.bytedance.ies.xelement.input.d.a
        public final boolean a() {
            Editable text = LynxTextAreaView.a(this.f37122a).getText();
            if (text != null && text.length() == 0) {
                return false;
            }
            Iterator<T> it = this.f37122a.A.iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    T next = it.next();
                    if (!z) {
                        Editable text2 = LynxTextAreaView.a(this.f37122a).getText();
                        if (text2 == null) {
                            l.a();
                        }
                        l.a((Object) text2, "");
                        if (next.a(text2)) {
                        }
                    }
                    z = true;
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LynxTextAreaView lynxTextAreaView) {
            this.f37122a = lynxTextAreaView;
        }
    }

    private final void g() {
        if (K == null) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mHintLayout");
                K = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Exception e2) {
                LLog.d("LynxTextAreaView", Log.getStackTraceString(e2));
            }
        }
        try {
            Field field = K;
            if (field == null) {
                l.a();
            }
            Layout layout = (Layout) field.get(this.mView);
            if (layout != null) {
                if (layout.getHeight() != this.D) {
                    this.D = layout.getHeight();
                }
                View view = this.mView;
                l.a((Object) view, "");
                int maxHeight = ((EditText) view).getMaxHeight();
                View view2 = this.mView;
                l.a((Object) view2, "");
                int minHeight = ((EditText) view2).getMinHeight();
                int i2 = this.D;
                if (i2 > maxHeight) {
                    this.D = maxHeight;
                } else if (i2 < minHeight) {
                    this.D = minHeight;
                }
                this.I = false;
            }
        } catch (Exception e3) {
            LLog.d("LynxTextAreaView", Log.getStackTraceString(e3));
        }
    }

    public final void e() {
        if (J == null) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mLayout");
                J = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Exception e2) {
                LLog.d("LynxTextAreaView", Log.getStackTraceString(e2));
                return;
            }
        }
        try {
            Field field = J;
            if (field == null) {
                l.a();
            }
            Layout layout = (Layout) field.get(this.mView);
            int i2 = 0;
            if (layout != null) {
                i2 = layout.getHeight();
            }
            View view = this.mView;
            if (view == null) {
                l.a();
            }
            int minHeight = ((EditText) view).getMinHeight();
            View view2 = this.mView;
            if (view2 == null) {
                l.a();
            }
            int maxHeight = ((EditText) view2).getMaxHeight();
            if (i2 < minHeight) {
                a(minHeight);
            } else if (i2 > maxHeight) {
                a(maxHeight);
            } else {
                a(i2);
            }
        } catch (Exception e3) {
            LLog.d("LynxTextAreaView", Log.getStackTraceString(e3));
        }
    }

    public static final class f implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxTextAreaView f37123a;

        static {
            Covode.recordClassIndex(22331);
        }

        private static void b(ClipboardManager clipboardManager, ClipData clipData) {
            if (!((Boolean) com.bytedance.helios.sdk.a.a(clipboardManager, new Object[]{clipData}, 101807, "void", false, null).first).booleanValue()) {
                clipboardManager.setPrimaryClip(clipData);
                com.bytedance.helios.sdk.a.a(null, clipboardManager, new Object[]{clipData}, 101807, "com_bytedance_ies_xelement_input_LynxTextAreaView$setRichType$2_android_content_ClipboardManager_setPrimaryClip(Landroid/content/ClipboardManager;Landroid/content/ClipData;)V");
            }
        }

        @Override // com.bytedance.ies.xelement.input.c.b
        public final boolean a() {
            Method declaredMethod;
            int i2;
            ClipData clipData;
            int selectionStart = Selection.getSelectionStart(LynxTextAreaView.a(this.f37123a).getText());
            int selectionEnd = Selection.getSelectionEnd(LynxTextAreaView.a(this.f37123a).getText());
            if (Build.VERSION.SDK_INT <= 22) {
                declaredMethod = TextView.class.getDeclaredMethod("stopSelectionActionMode", new Class[0]);
                l.a((Object) declaredMethod, "");
            } else {
                declaredMethod = TextView.class.getDeclaredMethod("stopTextActionMode", new Class[0]);
                l.a((Object) declaredMethod, "");
            }
            if (selectionStart == -1 || selectionEnd == -1) {
                try {
                    ClipboardManager clipboardManager = this.f37123a.y;
                    if (clipboardManager != null) {
                        a(clipboardManager, ClipData.newPlainText(null, ""));
                    }
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(LynxTextAreaView.a(this.f37123a), new Object[0]);
                } catch (Throwable th) {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(LynxTextAreaView.a(this.f37123a), new Object[0]);
                    throw th;
                }
                return true;
            }
            if (selectionStart <= selectionEnd) {
                i2 = selectionStart;
            } else {
                i2 = selectionEnd;
            }
            if (selectionStart <= selectionEnd) {
                selectionStart = selectionEnd;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LynxTextAreaView.a(this.f37123a).getText());
            com.bytedance.ies.xelement.input.b.b[] bVarArr = (com.bytedance.ies.xelement.input.b.b[]) spannableStringBuilder.getSpans(i2, selectionStart, com.bytedance.ies.xelement.input.b.b.class);
            com.bytedance.ies.xelement.text.a.d[] dVarArr = (com.bytedance.ies.xelement.text.a.d[]) spannableStringBuilder.getSpans(i2, selectionStart, com.bytedance.ies.xelement.text.a.d.class);
            for (com.bytedance.ies.xelement.input.b.b bVar : bVarArr) {
                int spanStart = spannableStringBuilder.getSpanStart(bVar);
                spannableStringBuilder.delete(spanStart, spannableStringBuilder.getSpanEnd(bVar));
                spannableStringBuilder.insert(spanStart, (CharSequence) (bVar.f37133b + bVar.f37132a));
            }
            for (com.bytedance.ies.xelement.text.a.d dVar : dVarArr) {
                spannableStringBuilder.removeSpan(dVar);
            }
            if (i2 > spannableStringBuilder.length() || selectionStart > spannableStringBuilder.length()) {
                clipData = ClipData.newPlainText(null, "");
                l.a((Object) clipData, "");
            } else {
                clipData = ClipData.newPlainText(null, spannableStringBuilder.subSequence(i2, selectionStart));
                l.a((Object) clipData, "");
            }
            try {
                ClipboardManager clipboardManager2 = this.f37123a.y;
                if (clipboardManager2 != null) {
                    a(clipboardManager2, clipData);
                }
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(LynxTextAreaView.a(this.f37123a), new Object[0]);
            } catch (Throwable th2) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(LynxTextAreaView.a(this.f37123a), new Object[0]);
                throw th2;
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(LynxTextAreaView lynxTextAreaView) {
            this.f37123a = lynxTextAreaView;
        }

        private static void a(ClipboardManager clipboardManager, ClipData clipData) {
            l.d(clipData, "");
            try {
                b(clipboardManager, clipData);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.b("ClipboardLancet", e2.getLocalizedMessage());
            }
        }
    }

    @m(a = "maxlines", e = Integer.MAX_VALUE)
    public final void setMaxLines(int i2) {
        this.p = i2;
    }

    static final class b extends h.f.b.m implements h.f.a.b<Context, com.bytedance.ies.xelement.text.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f37117a = new b();

        static {
            Covode.recordClassIndex(22327);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.xelement.text.a.a invoke(Context context) {
            l.c(context, "");
            return new com.bytedance.ies.xelement.text.a.a();
        }
    }

    public static final /* synthetic */ c a(LynxTextAreaView lynxTextAreaView) {
        c cVar = lynxTextAreaView.v;
        if (cVar == null) {
            l.a("mEditText");
        }
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxTextAreaView(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void a(EditText editText) {
        l.c(editText, "");
        editText.setHorizontallyScrolling(false);
        editText.setSingleLine(false);
        editText.setGravity(48);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f37092d = map.containsKey("line");
            this.z = map.containsKey("mention");
        }
    }

    private final void a(int i2) {
        if (Math.max(this.o, this.D) != i2) {
            this.o = i2;
            ShadowNode b2 = this.mContext.b(getSign());
            if (b2 != null && f()) {
                b2.d();
                this.H = true;
            }
        }
    }

    @m(a = "max-height")
    public final void setMaxHeight(String str) {
        if (str == null) {
            View view = this.mView;
            if (view == null) {
                l.a();
            }
            ((EditText) view).setMaxLines(Integer.MAX_VALUE);
        }
        float b2 = n.b(str, 0.0f);
        View view2 = this.mView;
        if (view2 == null) {
            l.a();
        }
        double d2 = (double) b2;
        Double.isNaN(d2);
        ((EditText) view2).setMaxHeight((int) (d2 + 0.5d));
        e();
    }

    @m(a = "min-height")
    public final void setMinHeight(String str) {
        if (str == null) {
            View view = this.mView;
            if (view == null) {
                l.a();
            }
            ((EditText) view).setMinLines(0);
            return;
        }
        float b2 = n.b(str, 0.0f);
        View view2 = this.mView;
        if (view2 == null) {
            l.a();
        }
        double d2 = (double) b2;
        Double.isNaN(d2);
        ((EditText) view2).setMinHeight((int) (d2 + 0.5d));
        e();
    }

    private final <T> JavaOnlyArray a(Class<T> cls) {
        c cVar = this.v;
        if (cVar == null) {
            l.a("mEditText");
        }
        Editable text = cVar.getText();
        if (text == null) {
            l.a();
        }
        l.a((Object) text, "");
        Object[] spans = text.getSpans(0, text.length(), cls);
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (Object obj : spans) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("start", Integer.valueOf(text.getSpanStart(obj)));
            javaOnlyMap.put("end", Integer.valueOf(text.getSpanEnd(obj)));
            javaOnlyArray.add(javaOnlyMap);
        }
        return javaOnlyArray;
    }

    @p
    public final void getTextInfo(Callback callback) {
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            c cVar = this.v;
            if (cVar == null) {
                l.a("mEditText");
            }
            javaOnlyMap.put("text", String.valueOf(cVar.getText()));
            int i2 = this.x;
            int i3 = this.B;
            if ((i2 & i3) == i3) {
                javaOnlyMap.put("mention", a(com.bytedance.ies.xelement.input.b.b.class));
            }
            int i4 = this.x;
            int i5 = this.C;
            if ((i4 & i5) == i5) {
                javaOnlyMap.put("emoji", a(com.bytedance.ies.xelement.text.a.d.class));
            }
            callback.invoke(0, javaOnlyMap);
        }
    }

    @m(a = "richtype")
    public final void setRichType(String str) {
        if (str == null) {
            str = "none";
        }
        if (h.m.p.a((CharSequence) str, (CharSequence) "none", false)) {
            this.x = this.G;
            this.A.clear();
            c cVar = this.v;
            if (cVar == null) {
                l.a("mEditText");
            }
            d dVar = cVar.f37139a;
            if (dVar != null) {
                dVar.f37142a = null;
            }
            c cVar2 = this.v;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            cVar2.f37140b = null;
            return;
        }
        if (h.m.p.a((CharSequence) str, (CharSequence) "mention", false)) {
            this.x |= this.B;
            this.A.add(com.bytedance.ies.xelement.input.b.a.f37131a);
            this.f37098j = true;
            c cVar3 = this.v;
            if (cVar3 == null) {
                l.a("mEditText");
            }
            cVar3.setEditableFactory(new com.bytedance.ies.xelement.input.b.c(new com.bytedance.ies.xelement.input.b.d(ab.a(com.bytedance.ies.xelement.input.b.b.class))));
        }
        if (h.m.p.a((CharSequence) str, (CharSequence) "bracket", false)) {
            this.x |= this.C;
            this.A.add(com.bytedance.ies.xelement.input.a.a.f37125a);
            com.bytedance.ies.xelement.text.a.c a2 = c.a.a();
            h.f.a.b<? super Context, ? extends com.bytedance.ies.xelement.text.a.b> bVar = this.E;
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            a2.a((com.bytedance.ies.xelement.text.a.b) bVar.invoke(jVar));
            this.w = true;
        }
        if ((this.x ^ this.G) != 0) {
            c cVar4 = this.v;
            if (cVar4 == null) {
                l.a("mEditText");
            }
            cVar4.setBackSpaceListener(new e(this));
            this.y = (ClipboardManager) a(this.mContext, "clipboard");
            c cVar5 = this.v;
            if (cVar5 == null) {
                l.a("mEditText");
            }
            cVar5.setCopyListener(new f(this));
            return;
        }
        this.w = false;
    }

    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f37118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxTextAreaView f37119b;

        static {
            Covode.recordClassIndex(22328);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f2, code lost:
            if (r7 != false) goto L_0x00f4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r18) {
            /*
            // Method dump skipped, instructions count: 471
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxTextAreaView.c.afterTextChanged(android.text.Editable):void");
        }

        c(c cVar, LynxTextAreaView lynxTextAreaView) {
            this.f37118a = cVar;
            this.f37119b = lynxTextAreaView;
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if ((this.f37119b.x & this.f37119b.B) == this.f37119b.B && this.f37119b.z && !this.f37119b.f37098j && i3 == 0 && i4 == 1 && !TextUtils.isEmpty(charSequence) && charSequence != null && (charSequence.charAt(i2) == '@' || charSequence.charAt(i2) == '#')) {
                j jVar = this.f37119b.mContext;
                l.a((Object) jVar, "");
                jVar.f55897e.a(new com.lynx.tasm.c.c(this.f37119b.getSign(), "mention"));
            }
            if (!this.f37119b.f37093e && this.f37119b.f37098j) {
                this.f37119b.f37098j = false;
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (!this.f37119b.f37098j && i4 != 0) {
                com.bytedance.ies.xelement.input.b.b bVar = null;
                if ((this.f37119b.x & this.f37119b.C) == this.f37119b.C) {
                    int i5 = i2 + i3;
                    Object[] spans = this.f37118a.getEditableText().getSpans(i2, i5, com.bytedance.ies.xelement.text.a.d.class);
                    l.a((Object) spans, "");
                    int length = spans.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        Object obj = spans[i6];
                        if (this.f37118a.getEditableText().getSpanStart(obj) != i2 || this.f37118a.getEditableText().getSpanEnd(obj) != i5) {
                            i6++;
                        } else if (obj != null) {
                            this.f37118a.getEditableText().removeSpan(obj);
                        }
                    }
                }
                if ((this.f37119b.x & this.f37119b.B) == this.f37119b.B) {
                    int i7 = i3 + i2;
                    Object[] spans2 = this.f37118a.getEditableText().getSpans(i2, i7, com.bytedance.ies.xelement.input.b.b.class);
                    l.a((Object) spans2, "");
                    int length2 = spans2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            break;
                        }
                        Object obj2 = spans2[i8];
                        if (this.f37118a.getEditableText().getSpanStart(obj2) == i2 && this.f37118a.getEditableText().getSpanEnd(obj2) == i7) {
                            bVar = obj2;
                            break;
                        }
                        i8++;
                    }
                    com.bytedance.ies.xelement.input.b.b bVar2 = bVar;
                    if (bVar2 != null) {
                        this.f37119b.f37098j = true;
                        this.f37118a.getEditableText().delete(this.f37118a.getEditableText().getSpanStart(bVar2), this.f37118a.getEditableText().getSpanEnd(bVar2));
                        this.f37119b.f37098j = true;
                        this.f37118a.getEditableText().insert(i2, bVar2.f37133b + bVar2.f37132a);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: a */
    public final c createView(Context context) {
        c a2 = super.createView(context);
        this.v = a2;
        if (a2 == null) {
            l.a("mEditText");
        }
        a2.addTextChangedListener(new c(a2, this));
        a2.setOnEditorActionListener(new d(a2, this));
        c cVar = this.v;
        if (cVar == null) {
            l.a("mEditText");
        }
        a(cVar);
        c cVar2 = this.v;
        if (cVar2 == null) {
            l.a("mEditText");
        }
        return cVar2;
    }

    public final void a(h.f.a.b<? super Context, ? extends com.bytedance.ies.xelement.text.a.b> bVar) {
        l.c(bVar, "");
        this.E = bVar;
    }

    private static Object a(j jVar, String str) {
        Object obj;
        MethodCollector.i(13386);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = jVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = jVar.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = jVar.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(13386);
                }
            }
        } else {
            obj = jVar.getSystemService(str);
        }
        return obj;
    }

    @p
    public final void addMention(ReadableMap readableMap, Callback callback) {
        com.bytedance.ies.xelement.input.b.b bVar;
        int i2;
        if (readableMap != null) {
            int i3 = this.x;
            int i4 = this.B;
            if ((i3 & i4) == i4 && readableMap.hasKey(StringSet.name)) {
                if (readableMap.hasKey("symbol")) {
                    String string = readableMap.getString(StringSet.name);
                    l.a((Object) string, "");
                    String string2 = readableMap.getString("symbol");
                    l.a((Object) string2, "");
                    bVar = new com.bytedance.ies.xelement.input.b.b(string, string2);
                } else {
                    String string3 = readableMap.getString(StringSet.name);
                    l.a((Object) string3, "");
                    bVar = new com.bytedance.ies.xelement.input.b.b(string3);
                }
                SpannableString spannableString = new SpannableString(bVar.f37133b + bVar.f37132a);
                int i5 = -65536;
                int length = spannableString.length();
                c cVar = this.v;
                if (cVar == null) {
                    l.a("mEditText");
                }
                spannableString.setSpan(Integer.valueOf(cVar.getHeight()), 0, length, 33);
                if (readableMap.hasKey("font-style")) {
                    i2 = readableMap.getInt("font-style");
                } else {
                    i2 = 1;
                }
                spannableString.setSpan(new StyleSpan(i2), 0, length, 33);
                if (readableMap.hasKey("font-color")) {
                    i5 = Color.parseColor(readableMap.getString("font-color"));
                }
                spannableString.setSpan(new h(i5), 0, length, 33);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) com.bytedance.ies.xelement.input.b.b.a(spannableString, bVar));
                if (readableMap.hasKey("extraSpace")) {
                    spannableStringBuilder.append((CharSequence) readableMap.getString("extraSpace"));
                } else {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                c cVar2 = this.v;
                if (cVar2 == null) {
                    l.a("mEditText");
                }
                d a2 = cVar2.a();
                if (a2 != null) {
                    a2.commitText(spannableStringBuilder, 1);
                }
                if (callback != null) {
                    callback.invoke(0);
                }
            } else if (callback != null) {
                callback.invoke(4);
            }
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    @p
    public void sendDelEvent(ReadableMap readableMap, Callback callback) {
        boolean z2;
        if (readableMap != null) {
            if ((this.x ^ this.G) == 0) {
                super.sendDelEvent(readableMap, callback);
                return;
            }
            Iterator<T> it = this.A.iterator();
            loop0:
            while (true) {
                z2 = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    T next = it.next();
                    if (!z2) {
                        c cVar = this.v;
                        if (cVar == null) {
                            l.a("mEditText");
                        }
                        Editable text = cVar.getText();
                        if (text == null) {
                            l.a();
                        }
                        l.a((Object) text, "");
                        if (next.a(text)) {
                        }
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                try {
                    int i2 = readableMap.getInt("action");
                    if (i2 == 0) {
                        int i3 = readableMap.getInt("length");
                        c cVar2 = this.v;
                        if (cVar2 == null) {
                            l.a("mEditText");
                        }
                        d a2 = cVar2.a();
                        if (a2 != null) {
                            a2.deleteSurroundingText(i3, 0);
                        }
                    } else if (i2 == 1) {
                        ((EditText) this.mView).dispatchKeyEvent(new KeyEvent(0, 67));
                    }
                    if (callback != null) {
                        callback.invoke(0);
                    }
                } catch (Throwable th) {
                    if (callback != null) {
                        callback.invoke(1, th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f37120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxTextAreaView f37121b;

        static {
            Covode.recordClassIndex(22329);
        }

        d(c cVar, LynxTextAreaView lynxTextAreaView) {
            this.f37120a = cVar;
            this.f37121b = lynxTextAreaView;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            String str;
            if ((i2 != 6 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 0) || !this.f37121b.f37096h) {
                return false;
            }
            j jVar = this.f37121b.mContext;
            l.a((Object) jVar, "");
            com.lynx.tasm.c cVar = jVar.f55897e;
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37121b.getSign(), "confirm");
            Editable text = this.f37120a.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            cVar2.a("value", str);
            cVar.a(cVar2);
            return false;
        }
    }
}

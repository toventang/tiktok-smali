package com.bytedance.ies.xelement.input;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.n;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import h.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

public class LynxBaseInputView extends LynxUI<EditText> {
    public static final a u = new a((byte) 0);
    private boolean A;
    private boolean B;

    /* renamed from: a  reason: collision with root package name */
    public c f37089a;

    /* renamed from: b  reason: collision with root package name */
    public int f37090b = 140;

    /* renamed from: c  reason: collision with root package name */
    public String f37091c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f37092d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f37093e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f37094f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f37095g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f37096h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f37097i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f37098j;

    /* renamed from: k  reason: collision with root package name */
    public float f37099k;

    /* renamed from: l  reason: collision with root package name */
    public float f37100l;

    /* renamed from: m  reason: collision with root package name */
    public int f37101m;
    public boolean n;
    public int o;
    public int p = Integer.MAX_VALUE;
    public boolean q;
    public boolean r;
    public int s = 1;
    public f t = new f(this);
    private Integer v;
    private boolean w;
    private e x;
    private boolean y;
    private int z;

    enum h {
        SHOW,
        HIDE,
        KEEP,
        BLUR;

        static {
            Covode.recordClassIndex(22317);
        }
    }

    static {
        Covode.recordClassIndex(22307);
    }

    public int a() {
        return 0;
    }

    public void a(EditText editText) {
        l.c(editText, "");
    }

    public void a(EditText editText, String str) {
        l.c(editText, "");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            int i2 = 0;
            boolean z5 = false;
            boolean z6 = false;
            switch (nextKey.hashCode()) {
                case -1988401764:
                    if (nextKey.equals("letter-spacing")) {
                        setLetterSpacing(readableMap.isNull(nextKey) ? 0.0f : (float) readableMap.getDouble(nextKey, 0.0d));
                        continue;
                    }
                    break;
                case -1730062511:
                    if (nextKey.equals("smart-scroll")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        setSmartScroll(z2);
                        continue;
                    }
                    break;
                case -1586082113:
                    if (nextKey.equals(com.bytedance.ies.xelement.pickview.b.b.f37373b)) {
                        setFontTextSize(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -962590849:
                    if (nextKey.equals("direction")) {
                        int i3 = 3;
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 3);
                        }
                        setLynxDirection(i3);
                        continue;
                    }
                    break;
                case -866730430:
                    if (nextKey.equals("readonly")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setIsReadOnly(z3);
                        continue;
                    }
                    break;
                case -525534091:
                    if (nextKey.equals("fullscreen-mode")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        setKeyBoardFullscreenMode(z2);
                        continue;
                    }
                    break;
                case -445272125:
                    if (nextKey.equals("show-soft-input-onfocus")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        setShowSoftInputOnFocus(z2);
                        continue;
                    }
                    break;
                case -140393755:
                    if (nextKey.equals("placeholder-font-size")) {
                        setPlaceholderTextSize(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 3575610:
                    if (nextKey.equals(StringSet.type)) {
                        setInputType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 94842723:
                    if (nextKey.equals(com.bytedance.ies.xelement.pickview.b.b.f37372a)) {
                        setFontColor(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 97604824:
                    if (nextKey.equals("focus")) {
                        if (!readableMap.isNull(nextKey)) {
                            z6 = readableMap.getBoolean(nextKey, false);
                        }
                        setFocus(z6);
                        continue;
                    }
                    break;
                case 111972721:
                    if (nextKey.equals("value")) {
                        setInputValue(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 124732746:
                    if (nextKey.equals("maxlength")) {
                        setMaxLength(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 270940796:
                    if (nextKey.equals("disabled")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setDisable(z5);
                        continue;
                    }
                    break;
                case 598246771:
                    if (nextKey.equals("placeholder")) {
                        setPlaceholder(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 746232421:
                    if (nextKey.equals("text-align")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setTextAlign(i2);
                        continue;
                    }
                    break;
                case 1101235489:
                    if (nextKey.equals("adjust-mode")) {
                        setAdjustMode(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1155760891:
                    if (nextKey.equals("bottom-inset")) {
                        setBottomInset(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1437560563:
                    if (nextKey.equals("auto-fit")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        setAutoFit(z2);
                        continue;
                    }
                    break;
                case 1782197877:
                    if (nextKey.equals("enableAutoFill")) {
                        if (!readableMap.isNull(nextKey)) {
                            z4 = readableMap.getBoolean(nextKey, false);
                        }
                        setIsAutoFillEnabled(z4);
                        continue;
                    }
                    break;
                case 1901673625:
                    if (nextKey.equals("caret-color")) {
                        setCursorColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 2018420361:
                    if (nextKey.equals("placeholder-color")) {
                        setPlaceholderColor(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 2033358039:
                    if (nextKey.equals("placeholder-style")) {
                        setPlaceHolderStyle(readableMap.getMap(nextKey));
                        continue;
                    }
                    break;
                case 2051146279:
                    if (nextKey.equals("confirm-type")) {
                        setConfirmType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22310);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getOverflow() {
        if (Build.VERSION.SDK_INT <= 20) {
            return 3;
        }
        return super.getOverflow();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.a.a
    public boolean isFocusable() {
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        return cVar.isFocusable();
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBaseInputView f37109a;

        static {
            Covode.recordClassIndex(22315);
        }

        f(LynxBaseInputView lynxBaseInputView) {
            this.f37109a = lynxBaseInputView;
        }

        public final void run() {
            Object a2 = a(this.f37109a.mContext, "input_method");
            if (a2 != null) {
                ((InputMethodManager) a2).showSoftInput(LynxBaseInputView.a(this.f37109a), 1);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }

        private static Object a(j jVar, String str) {
            Object obj;
            MethodCollector.i(11886);
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
                        MethodCollector.o(11886);
                    }
                }
            } else {
                obj = jVar.getSystemService(str);
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBaseInputView f37110a;

        static {
            Covode.recordClassIndex(22316);
        }

        g(LynxBaseInputView lynxBaseInputView) {
            this.f37110a = lynxBaseInputView;
        }

        public final void run() {
            Object a2 = a(this.f37110a.mContext, "input_method");
            if (a2 != null) {
                ((InputMethodManager) a2).hideSoftInputFromWindow(LynxBaseInputView.a(this.f37110a).getWindowToken(), 0);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }

        private static Object a(j jVar, String str) {
            Object obj;
            MethodCollector.i(13415);
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
                        MethodCollector.o(13415);
                    }
                }
            } else {
                obj = jVar.getSystemService(str);
            }
            return obj;
        }
    }

    private void e() {
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        cVar.requestFocus();
        if (!this.y) {
            if (this.mContext != null) {
                c cVar2 = this.f37089a;
                if (cVar2 == null) {
                    l.a("mEditText");
                }
                cVar2.post(new f(this));
            }
        } else if (this.mContext != null) {
            c cVar3 = this.f37089a;
            if (cVar3 == null) {
                l.a("mEditText");
            }
            cVar3.post(new g(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        cVar.clearFocus();
        if (!this.y && this.mContext != null) {
            Object a2 = a(this.mContext, "input_method");
            if (a2 != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) a2;
                c cVar2 = this.f37089a;
                if (cVar2 == null) {
                    l.a("mEditText");
                }
                inputMethodManager.hideSoftInputFromWindow(cVar2.getWindowToken(), 0);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        int bottom = cVar.getBottom();
        c cVar2 = this.f37089a;
        if (cVar2 == null) {
            l.a("mEditText");
        }
        if (bottom <= cVar2.getTop()) {
            return false;
        }
        c cVar3 = this.f37089a;
        if (cVar3 == null) {
            l.a("mEditText");
        }
        int right = cVar3.getRight();
        c cVar4 = this.f37089a;
        if (cVar4 == null) {
            l.a("mEditText");
        }
        if (right > cVar4.getLeft()) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        com.lynx.tasm.behavior.i iVar;
        f fVar = this.t;
        if (!(fVar.f37146b == null || (iVar = fVar.f37148d) == null)) {
            iVar.b(fVar.f37146b);
        }
        try {
            com.lynx.tasm.behavior.i iVar2 = fVar.f37148d;
            if (iVar2 != null) {
                iVar2.c();
            }
        } catch (RuntimeException e2) {
            fVar.f37145a.a(e2);
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        super.layout();
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        cVar.setPadding(this.mBorderLeftWidth + this.mPaddingLeft, this.mBorderTopWidth + this.mPaddingTop, this.mBorderRightWidth + this.mPaddingRight, this.mBorderBottomWidth + this.mPaddingBottom);
        if (d() && this.B) {
            setFocus(true);
            this.B = false;
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        String str = this.f37091c;
        if (str == null) {
            return;
        }
        if (this.v == null) {
            c cVar = this.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            cVar.setHint(this.f37091c);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        Integer num = this.v;
        if (num != null) {
            spannableString.setSpan(new AbsoluteSizeSpan(num.intValue(), false), 0, spannableString.length(), 33);
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            cVar2.setHint(spannableString);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBaseInputView f37105a;

        /* renamed from: b  reason: collision with root package name */
        private int f37106b = 140;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f37107c = "";

        static {
            Covode.recordClassIndex(22313);
        }

        @Override // com.bytedance.ies.xelement.input.e
        public final e a(int i2) {
            this.f37106b = i2;
            return this;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(LynxBaseInputView lynxBaseInputView) {
            this.f37105a = lynxBaseInputView;
        }

        @Override // com.bytedance.ies.xelement.input.e
        public final e a(String str) {
            l.c(str, "");
            this.f37107c = str;
            return this;
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            Editable text;
            l.c(charSequence, "");
            l.c(spanned, "");
            if ((!(charSequence instanceof SpannableStringBuilder) || ((SpannableStringBuilder) charSequence).getSpans(i2, i3, UnderlineSpan.class) == null) && (!p.a(this.f37107c))) {
                charSequence = new h.m.l(this.f37107c.toString()).replace(charSequence, "");
                i3 = charSequence.length();
            }
            int length = this.f37106b - (spanned.length() - (i5 - i4));
            if (length <= 0) {
                if (this.f37105a.f37097i && (text = LynxBaseInputView.a(this.f37105a).getText()) != null && text.length() == this.f37105a.f37090b) {
                    LynxBaseInputView.a(this.f37105a);
                    j jVar = this.f37105a.mContext;
                    l.a((Object) jVar, "");
                    jVar.f55897e.a(new com.lynx.tasm.c.c(this.f37105a.getSign(), "length"));
                }
                return "";
            } else if (length >= i3 - i2) {
                return charSequence;
            } else {
                h.l.h findAll$default = h.m.l.findAll$default(new h.m.l("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-🛿]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?)"), charSequence, 0, 2, null);
                z.e eVar = new z.e();
                Iterator a2 = findAll$default.a();
                while (a2.hasNext()) {
                    h.m.j jVar2 = (h.m.j) a2.next();
                    if (jVar2.a().f158747a + jVar2.b().length() > length + i2) {
                        eVar.element = (T) charSequence.subSequence(i2, jVar2.a().f158747a);
                        return eVar.element;
                    }
                }
                return charSequence.subSequence(i2, length + i2);
            }
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBaseInputView f37102a;

        static {
            Covode.recordClassIndex(22311);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        b(LynxBaseInputView lynxBaseInputView) {
            this.f37102a = lynxBaseInputView;
        }

        public final void afterTextChanged(Editable editable) {
            if (this.f37102a.f37093e && !this.f37102a.f37098j && editable != null) {
                j jVar = this.f37102a.mContext;
                l.a((Object) jVar, "");
                com.lynx.tasm.c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37102a.getSign(), "input");
                cVar2.a("value", editable.toString());
                cVar2.a("cursor", Integer.valueOf(LynxBaseInputView.a(this.f37102a).getSelectionEnd()));
                cVar2.a("textLength", Integer.valueOf(editable.toString().length()));
                cVar.a(cVar2);
            }
            if (this.f37102a.f37098j) {
                this.f37102a.f37098j = false;
            }
        }
    }

    @m(a = "auto-fit", f = true)
    public final void setAutoFit(boolean z2) {
        this.t.f37152h = z2;
    }

    public static final /* synthetic */ c a(LynxBaseInputView lynxBaseInputView) {
        c cVar = lynxBaseInputView.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        return cVar;
    }

    @m(a = "adjust-mode")
    public final void setAdjustMode(String str) {
        if (str == null) {
            str = "end";
        }
        f fVar = this.t;
        l.c(str, "");
        fVar.f37151g = str;
    }

    @m(a = "placeholder")
    public final void setPlaceholder(String str) {
        if (str == null) {
            str = "";
        }
        this.f37091c = str;
        b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBaseInputView(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }

    @m(a = "bottom-inset")
    public final void setBottomInset(String str) {
        if (str == null) {
            str = "0px";
        }
        f fVar = this.t;
        l.c(str, "");
        fVar.f37153i = (int) n.b(str, 0.0f);
    }

    @com.lynx.tasm.behavior.p
    public final void setInputFilter(ReadableMap readableMap) {
        e eVar;
        if (readableMap != null && (eVar = this.x) != null) {
            String string = readableMap.getString("pattern");
            l.a((Object) string, "");
            eVar.a(string);
        }
    }

    @m(a = StringSet.type)
    public final void setInputType(String str) {
        if (str == null) {
            str = "text";
        }
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        a(cVar, str);
    }

    @m(a = "readonly", f = false)
    public final void setIsReadOnly(boolean z2) {
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        cVar.setFocusable(!z2);
        c cVar2 = this.f37089a;
        if (cVar2 == null) {
            l.a("mEditText");
        }
        cVar2.setFocusableInTouchMode(!z2);
    }

    @m(a = "smart-scroll", f = true)
    public final void setSmartScroll(boolean z2) {
        f fVar = this.t;
        fVar.f37157m = z2;
        if (z2) {
            com.lynx.tasm.behavior.i iVar = fVar.f37148d;
            if (iVar != null) {
                iVar.show();
                return;
            }
            return;
        }
        com.lynx.tasm.behavior.i iVar2 = fVar.f37148d;
        if (iVar2 != null) {
            iVar2.c();
        }
    }

    @m(a = "disabled", f = false)
    public final void setDisable(boolean z2) {
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        cVar.setEnabled(!z2);
        c cVar2 = this.f37089a;
        if (cVar2 == null) {
            l.a("mEditText");
        }
        cVar2.setFocusable(!z2);
        c cVar3 = this.f37089a;
        if (cVar3 == null) {
            l.a("mEditText");
        }
        cVar3.setFocusableInTouchMode(!z2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f37095g = map.containsKey("blur");
            this.f37096h = map.containsKey("confirm");
            this.f37094f = map.containsKey("focus");
            this.f37093e = map.containsKey("input");
            this.f37097i = map.containsKey("length");
        }
    }

    @m(a = "focus", f = false)
    public final void setFocus(boolean z2) {
        if (d() || !z2) {
            this.w = z2;
            if (z2) {
                e();
                j jVar = this.mContext;
                l.a((Object) jVar, "");
                jVar.f55898f.f56470b = this;
                return;
            }
            c();
            return;
        }
        this.B = true;
    }

    @m(a = "value")
    public final void setInputValue(String str) {
        if (str == null) {
            str = "";
        }
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        if (!l.a((Object) str, (Object) String.valueOf(cVar.getText()))) {
            a(str, null, null);
        }
    }

    @m(a = "fullscreen-mode", f = true)
    public final void setKeyBoardFullscreenMode(boolean z2) {
        if (!z2) {
            c cVar = this.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            cVar.setImeOptions(cVar2.getImeOptions() | 33554432 | 268435456);
            return;
        }
        c cVar3 = this.f37089a;
        if (cVar3 == null) {
            l.a("mEditText");
        }
        cVar3.setImeOptions(1);
    }

    @m(a = "letter-spacing", d = 0.0f)
    public final void setLetterSpacing(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            c cVar = this.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            if (cVar.getTextSize() != 0.0f) {
                c cVar2 = this.f37089a;
                if (cVar2 == null) {
                    l.a("mEditText");
                }
                c cVar3 = this.f37089a;
                if (cVar3 == null) {
                    l.a("mEditText");
                }
                cVar2.setLetterSpacing(f2 / cVar3.getTextSize());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @m(a = "direction", e = 3)
    public void setLynxDirection(int i2) {
        this.mLynxDirection = i2;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = this.mLynxDirection;
        if (i4 == 0) {
            c cVar = this.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            cVar.setTextDirection(5);
        } else if (i4 == 2) {
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            cVar2.setTextDirection(4);
        } else if (i4 == 3) {
            c cVar3 = this.f37089a;
            if (cVar3 == null) {
                l.a("mEditText");
            }
            cVar3.setTextDirection(3);
        }
    }

    @m(a = "placeholder-style")
    public final void setPlaceHolderStyle(ReadableMap readableMap) {
        com.lynx.react.bridge.a dynamic;
        com.lynx.react.bridge.a dynamic2;
        if (readableMap != null) {
            if (readableMap.hasKey(com.bytedance.ies.xelement.pickview.b.b.f37372a) && (dynamic2 = readableMap.getDynamic(com.bytedance.ies.xelement.pickview.b.b.f37372a)) != null) {
                setPlaceholderColor(dynamic2);
            }
            if (readableMap.hasKey(com.bytedance.ies.xelement.pickview.b.b.f37373b) && (dynamic = readableMap.getDynamic(com.bytedance.ies.xelement.pickview.b.b.f37373b)) != null) {
                setPlaceholderTextSize(dynamic);
            }
        }
    }

    @m(a = "text-align", e = 0)
    public final void setTextAlign(int i2) {
        int a2 = a();
        if (i2 == 0) {
            c cVar = this.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            cVar.setGravity(a2 | 3);
        } else if (i2 == 1) {
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            cVar2.setGravity(a2 | 17);
        } else if (i2 == 2) {
            c cVar3 = this.f37089a;
            if (cVar3 == null) {
                l.a("mEditText");
            }
            cVar3.setGravity(a2 | 5);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void blur(Callback callback) {
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        if (cVar.isFocused()) {
            c();
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            if (!cVar2.isFocused()) {
                if (callback != null) {
                    callback.invoke(0, "Success to blur.");
                }
            } else if (callback != null) {
                callback.invoke(1, "Fail to blur.");
            }
        } else if (callback != null) {
            callback.invoke(1, "Target is not focused now.");
        }
    }

    @com.lynx.tasm.behavior.p
    public final void focus(Callback callback) {
        e();
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        if (cVar.isFocused()) {
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            jVar.f55898f.f56470b = this;
            if (callback != null) {
                callback.invoke(0, "Success to focus.");
            }
        } else if (callback != null) {
            callback.invoke(1, "Fail to focus.");
        }
    }

    @com.lynx.tasm.behavior.p
    public final void select(Callback callback) {
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        if (cVar.getText() != null) {
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            c cVar3 = this.f37089a;
            if (cVar3 == null) {
                l.a("mEditText");
            }
            Editable text = cVar3.getText();
            if (text == null) {
                l.a();
            }
            cVar2.setSelection(0, text.length());
            if (callback != null) {
                callback.invoke(0, "Success.");
            }
        } else if (callback != null) {
            callback.invoke(1, "Input is not ready.");
        }
    }

    @m(a = com.bytedance.ies.xelement.pickview.b.b.f37372a, e = 0)
    public final void setFontColor(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ReadableType h2 = aVar.h();
        if (h2 != null) {
            int i2 = b.f37126a[h2.ordinal()];
            if (i2 == 1) {
                c cVar = this.f37089a;
                if (cVar == null) {
                    l.a("mEditText");
                }
                cVar.setTextColor(aVar.d());
                return;
            } else if (i2 == 2) {
                c cVar2 = this.f37089a;
                if (cVar2 == null) {
                    l.a("mEditText");
                }
                cVar2.setTextColor(ColorUtils.a(aVar.e()));
                return;
            }
        }
        aVar.h().name();
    }

    @m(a = com.bytedance.ies.xelement.pickview.b.b.f37373b)
    public final void setFontTextSize(com.lynx.react.bridge.a aVar) {
        if (aVar == null) {
            c cVar = this.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            cVar.setTextSize(0, n.a("14px", 0.0f, 0.0f));
            return;
        }
        ReadableType h2 = aVar.h();
        if (h2 != null) {
            int i2 = b.f37127b[h2.ordinal()];
            if (i2 == 1) {
                c cVar2 = this.f37089a;
                if (cVar2 == null) {
                    l.a("mEditText");
                }
                cVar2.setTextSize(0, (float) aVar.c());
            } else if (i2 == 2) {
                c cVar3 = this.f37089a;
                if (cVar3 == null) {
                    l.a("mEditText");
                }
                cVar3.setTextSize(0, n.a(aVar.e(), 0.0f, 0.0f));
            }
        }
    }

    @m(a = "enableAutoFill", f = false)
    public final void setIsAutoFillEnabled(boolean z2) {
        this.A = z2;
        if (Build.VERSION.SDK_INT >= 26) {
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            if (!(jVar.getBaseContext() instanceof Activity)) {
                return;
            }
            if (this.A) {
                j jVar2 = this.mContext;
                l.a((Object) jVar2, "");
                Context baseContext = jVar2.getBaseContext();
                if (baseContext != null) {
                    Window window = ((Activity) baseContext).getWindow();
                    l.a((Object) window, "");
                    View decorView = window.getDecorView();
                    l.a((Object) decorView, "");
                    decorView.setImportantForAutofill(1);
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
            j jVar3 = this.mContext;
            l.a((Object) jVar3, "");
            Context baseContext2 = jVar3.getBaseContext();
            if (baseContext2 != null) {
                Window window2 = ((Activity) baseContext2).getWindow();
                l.a((Object) window2, "");
                View decorView2 = window2.getDecorView();
                l.a((Object) decorView2, "");
                decorView2.setImportantForAutofill(8);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    @m(a = "maxlength")
    public final void setMaxLength(com.lynx.react.bridge.a aVar) {
        if (aVar == null) {
            this.f37090b = 140;
        } else {
            ReadableType h2 = aVar.h();
            if (h2 != null) {
                int i2 = b.f37128c[h2.ordinal()];
                if (i2 == 1) {
                    String e2 = aVar.e();
                    l.a((Object) e2, "");
                    this.f37090b = Integer.parseInt(e2);
                } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                    this.f37090b = aVar.d();
                }
            }
            aVar.h().name();
        }
        if (this.f37090b < 0) {
            this.f37090b = Integer.MAX_VALUE;
        }
        e eVar = this.x;
        if (eVar != null) {
            eVar.a(this.f37090b);
        }
    }

    @m(a = "placeholder-color")
    public final void setPlaceholderColor(com.lynx.react.bridge.a aVar) {
        if (aVar == null) {
            c cVar = this.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            cVar.setHintTextColor(0);
            return;
        }
        ReadableType h2 = aVar.h();
        if (h2 != null) {
            int i2 = b.f37129d[h2.ordinal()];
            if (i2 == 1 || i2 == 2) {
                c cVar2 = this.f37089a;
                if (cVar2 == null) {
                    l.a("mEditText");
                }
                cVar2.setHintTextColor(aVar.d());
                return;
            } else if (i2 == 3) {
                String e2 = aVar.e();
                if (e2 != null) {
                    int a2 = ColorUtils.a(e2);
                    c cVar3 = this.f37089a;
                    if (cVar3 == null) {
                        l.a("mEditText");
                    }
                    cVar3.setHintTextColor(a2);
                    return;
                }
                return;
            }
        }
        aVar.h().name();
    }

    @m(a = "placeholder-font-size")
    public final void setPlaceholderTextSize(com.lynx.react.bridge.a aVar) {
        if (aVar == null) {
            this.v = Integer.valueOf((int) n.b("14px", 0.0f));
        } else {
            ReadableType h2 = aVar.h();
            if (h2 != null) {
                int i2 = b.f37130e[h2.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    this.v = Integer.valueOf(aVar.d());
                } else if (i2 == 3) {
                    this.v = Integer.valueOf((int) aVar.c());
                } else if (i2 == 4) {
                    this.v = Integer.valueOf((int) n.b(aVar.e(), 0.0f));
                }
            }
            aVar.h().name();
        }
        b();
    }

    @m(a = "confirm-type")
    public final void setConfirmType(String str) {
        if (str == null) {
            str = "done";
        }
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    c cVar = this.f37089a;
                    if (cVar == null) {
                        l.a("mEditText");
                    }
                    cVar.setImeOptions(3);
                    return;
                }
                return;
            case 3304:
                if (str.equals("go")) {
                    c cVar2 = this.f37089a;
                    if (cVar2 == null) {
                        l.a("mEditText");
                    }
                    cVar2.setImeOptions(2);
                    return;
                }
                return;
            case 3089282:
                if (str.equals("done")) {
                    c cVar3 = this.f37089a;
                    if (cVar3 == null) {
                        l.a("mEditText");
                    }
                    cVar3.setImeOptions(6);
                    return;
                }
                return;
            case 3377907:
                if (str.equals("next")) {
                    c cVar4 = this.f37089a;
                    if (cVar4 == null) {
                        l.a("mEditText");
                    }
                    cVar4.setImeOptions(5);
                    return;
                }
                return;
            case 3526536:
                if (str.equals("send")) {
                    c cVar5 = this.f37089a;
                    if (cVar5 == null) {
                        l.a("mEditText");
                    }
                    cVar5.setImeOptions(4);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r6 == null) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @com.lynx.tasm.behavior.m(a = "caret-color")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setCursorColor(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxBaseInputView.setCursorColor(java.lang.String):void");
    }

    @m(a = "show-soft-input-onfocus", f = true)
    public final void setShowSoftInputOnFocus(boolean z2) {
        Method method;
        try {
            method = c.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            try {
                method.setAccessible(true);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            method = null;
        }
        j jVar = this.mContext;
        l.a((Object) jVar, "");
        Context baseContext = jVar.getBaseContext();
        if (!(baseContext instanceof Activity)) {
            return;
        }
        if (!z2) {
            this.y = true;
            Activity activity = (Activity) baseContext;
            Window window = activity.getWindow();
            l.a((Object) window, "");
            this.z = window.getAttributes().softInputMode & 15;
            Window window2 = activity.getWindow();
            l.a((Object) window2, "");
            activity.getWindow().setSoftInputMode((window2.getAttributes().softInputMode ^ 15) | 3);
            if (method != null) {
                c cVar = this.f37089a;
                if (cVar == null) {
                    l.a("mEditText");
                }
                method.invoke(cVar, false);
                return;
            }
            return;
        }
        this.y = false;
        Activity activity2 = (Activity) baseContext;
        Window window3 = activity2.getWindow();
        l.a((Object) window3, "");
        activity2.getWindow().setSoftInputMode((window3.getAttributes().softInputMode ^ 15) | this.z);
        if (method != null) {
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            method.invoke(cVar2, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c createView(Context context) {
        if (context == null) {
            l.a();
        }
        this.f37089a = new c(context);
        this.x = new d(this);
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        InputFilter[] inputFilterArr = new InputFilter[1];
        e eVar = this.x;
        if (eVar != null) {
            inputFilterArr[0] = eVar;
            cVar.setFilters(inputFilterArr);
            cVar.addTextChangedListener(new b(this));
            cVar.setOnFocusChangeListener(new c(cVar, this));
            cVar.setBackground(null);
            cVar.setImeOptions(1);
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            a(cVar2);
            c cVar3 = this.f37089a;
            if (cVar3 == null) {
                l.a("mEditText");
            }
            cVar3.setOnTouchListener(new e(this));
            if (Build.VERSION.SDK_INT >= 26) {
                j jVar = this.mContext;
                l.a((Object) jVar, "");
                if (jVar.getBaseContext() instanceof Activity) {
                    j jVar2 = this.mContext;
                    l.a((Object) jVar2, "");
                    Context baseContext = jVar2.getBaseContext();
                    if (baseContext != null) {
                        Window window = ((Activity) baseContext).getWindow();
                        l.a((Object) window, "");
                        View decorView = window.getDecorView();
                        l.a((Object) decorView, "");
                        decorView.setImportantForAutofill(8);
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
            }
            c cVar4 = this.f37089a;
            if (cVar4 == null) {
                l.a("mEditText");
            }
            cVar4.setTextSize(0, n.a("14px", 0.0f, 0.0f));
            c cVar5 = this.f37089a;
            if (cVar5 == null) {
                l.a("mEditText");
            }
            return cVar5;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.a.a
    public void onFocusChanged(boolean z2, boolean z3) {
        if (z3 && !this.y) {
            return;
        }
        if (!z2 || this.n) {
            c();
        } else {
            e();
        }
    }

    @com.lynx.tasm.behavior.p
    public final void addText(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            String string = readableMap.getString("text");
            c cVar = this.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            d a2 = cVar.a();
            if (a2 != null) {
                a2.finishComposingText();
            }
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            d a3 = cVar2.a();
            if (a3 != null) {
                a3.commitText(string, 1);
            }
            if (callback != null) {
                callback.invoke(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f37103a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxBaseInputView f37104b;

        static {
            Covode.recordClassIndex(22312);
        }

        c(c cVar, LynxBaseInputView lynxBaseInputView) {
            this.f37103a = cVar;
            this.f37104b = lynxBaseInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            String str = null;
            if (z) {
                if (this.f37104b.f37094f) {
                    j jVar = this.f37104b.mContext;
                    l.a((Object) jVar, "");
                    com.lynx.tasm.c cVar = jVar.f55897e;
                    com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37104b.getSign(), "focus");
                    Editable text = this.f37103a.getText();
                    if (text != null) {
                        str = text.toString();
                    }
                    cVar2.a("value", str);
                    cVar.a(cVar2);
                }
                if (this.f37104b.t.a()) {
                    this.f37104b.t.b();
                }
            } else if (this.f37104b.f37095g) {
                j jVar2 = this.f37104b.mContext;
                l.a((Object) jVar2, "");
                com.lynx.tasm.c cVar3 = jVar2.f55897e;
                com.lynx.tasm.c.c cVar4 = new com.lynx.tasm.c.c(this.f37104b.getSign(), "blur");
                Editable text2 = this.f37103a.getText();
                if (text2 != null) {
                    str = text2.toString();
                }
                cVar4.a("value", str);
                cVar3.a(cVar4);
            }
        }
    }

    private static Object a(j jVar, String str) {
        Object obj;
        MethodCollector.i(14209);
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
                    MethodCollector.o(14209);
                }
            }
        } else {
            obj = jVar.getSystemService(str);
        }
        return obj;
    }

    @com.lynx.tasm.behavior.p
    public void sendDelEvent(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            try {
                int i2 = readableMap.getInt("action");
                if (i2 == 0) {
                    int i3 = readableMap.getInt("length");
                    c cVar = this.f37089a;
                    if (cVar == null) {
                        l.a("mEditText");
                    }
                    d a2 = cVar.a();
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

    @com.lynx.tasm.behavior.p
    public final void setValue(ReadableMap readableMap, Callback callback) {
        String str;
        Integer num;
        if (readableMap != null) {
            if (readableMap.hasKey("value")) {
                str = readableMap.getString("value");
            } else {
                str = "";
            }
            if (readableMap.hasKey("index")) {
                num = Integer.valueOf(readableMap.getInt("index"));
            } else {
                num = null;
            }
            l.a((Object) str, "");
            a(str, num, callback);
        } else if (callback != null) {
            callback.invoke(4, "Param is not a map.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBaseInputView f37108a;

        static {
            Covode.recordClassIndex(22314);
        }

        e(LynxBaseInputView lynxBaseInputView) {
            this.f37108a = lynxBaseInputView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.a((Object) motionEvent, "");
            int action = motionEvent.getAction();
            boolean z = true;
            if (action == 0) {
                l.a((Object) view, "");
                view.getParent().requestDisallowInterceptTouchEvent(true);
                this.f37108a.f37099k = motionEvent.getX();
                this.f37108a.f37100l = motionEvent.getY();
                this.f37108a.f37101m = view.getScrollY();
            } else if (action == 1) {
                l.a((Object) view, "");
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.f37108a.f37099k = 0.0f;
                this.f37108a.f37100l = 0.0f;
                LynxBaseInputView lynxBaseInputView = this.f37108a;
                if (Math.abs(view.getScrollY() - this.f37108a.f37101m) <= 10) {
                    z = false;
                }
                lynxBaseInputView.n = z;
            } else if (action != 2) {
                if (action == 3) {
                    l.a((Object) view, "");
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    this.f37108a.f37099k = 0.0f;
                    this.f37108a.f37100l = 0.0f;
                    LynxBaseInputView lynxBaseInputView2 = this.f37108a;
                    if (Math.abs(view.getScrollY() - this.f37108a.f37101m) <= 10) {
                        z = false;
                    }
                    lynxBaseInputView2.n = z;
                }
            } else if ((!LynxBaseInputView.a(this.f37108a).canScrollVertically(1) && motionEvent.getY() < this.f37108a.f37100l) || (!LynxBaseInputView.a(this.f37108a).canScrollVertically(-1) && motionEvent.getY() > this.f37108a.f37100l)) {
                l.a((Object) view, "");
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
    }

    @com.lynx.tasm.behavior.p
    public final void controlKeyBoard(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            int i2 = readableMap.getInt("action");
            int length = h.values().length;
            if (i2 >= 0 && length > i2) {
                c cVar = this.f37089a;
                if (cVar == null) {
                    l.a("mEditText");
                }
                if (!cVar.isFocused()) {
                    c cVar2 = this.f37089a;
                    if (cVar2 == null) {
                        l.a("mEditText");
                    }
                    cVar2.requestFocus();
                    j jVar = this.mContext;
                    l.a((Object) jVar, "");
                    jVar.f55898f.f56470b = this;
                }
                Object a2 = a(this.mContext, "input_method");
                if (a2 != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) a2;
                    if (i2 == h.SHOW.ordinal()) {
                        c cVar3 = this.f37089a;
                        if (cVar3 == null) {
                            l.a("mEditText");
                        }
                        inputMethodManager.showSoftInput(cVar3, 1);
                    } else if (i2 == h.HIDE.ordinal()) {
                        c cVar4 = this.f37089a;
                        if (cVar4 == null) {
                            l.a("mEditText");
                        }
                        inputMethodManager.hideSoftInputFromWindow(cVar4.getWindowToken(), 0);
                    } else if (i2 != h.KEEP.ordinal() && i2 == h.BLUR.ordinal()) {
                        c();
                    }
                    if (callback != null) {
                        callback.invoke(0);
                        return;
                    }
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            } else if (callback != null) {
                callback.invoke(4);
            }
        }
    }

    @com.lynx.tasm.behavior.p
    public final void setSelectionRange(ReadableMap readableMap, Callback callback) {
        int i2;
        int i3;
        if (readableMap != null) {
            if (readableMap.hasKey("selectionStart")) {
                i2 = readableMap.getInt("selectionStart");
            } else {
                i2 = -1;
            }
            if (readableMap.hasKey("selectionEnd")) {
                i3 = readableMap.getInt("selectionEnd");
            } else {
                i3 = -1;
            }
            c cVar = this.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            if (cVar.getText() != null) {
                c cVar2 = this.f37089a;
                if (cVar2 == null) {
                    l.a("mEditText");
                }
                Editable text = cVar2.getText();
                if (text == null) {
                    l.a();
                }
                int length = text.length();
                if (length != -1 && i2 <= length && i3 <= length && i2 >= 0 && i3 >= 0) {
                    c cVar3 = this.f37089a;
                    if (cVar3 == null) {
                        l.a("mEditText");
                    }
                    cVar3.setSelection(i2, i3);
                    if (callback != null) {
                        callback.invoke(0, "Success.");
                        return;
                    }
                    return;
                }
            }
            if (callback != null) {
                callback.invoke(4, "Range does not meet expectations.");
            }
        } else if (callback != null) {
            callback.invoke(4, "Param is not a map.");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setTextStyleData(int[] iArr, double[] dArr, String str) {
        l.c(iArr, "");
        l.c(dArr, "");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1) {
                JavaOnlyArray from = JavaOnlyArray.from(h.a.n.c(Float.valueOf((float) dArr[i2])));
                l.a((Object) from, "");
                com.lynx.react.bridge.b a2 = com.lynx.react.bridge.b.a(from, 0);
                l.a((Object) a2, "");
                setFontTextSize(a2);
            } else if (i3 == 2) {
                c cVar = this.f37089a;
                if (cVar == null) {
                    l.a("mEditText");
                }
                cVar.setTextColor((int) ((long) dArr[i2]));
            } else if (i3 == 11) {
                setTextAlign((int) dArr[i2]);
            }
        }
    }

    private final void a(String str, Integer num, Callback callback) {
        c cVar = this.f37089a;
        if (cVar == null) {
            l.a("mEditText");
        }
        if (cVar.getText() != null) {
            this.f37098j = true;
            c cVar2 = this.f37089a;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            Editable text = cVar2.getText();
            c cVar3 = this.f37089a;
            if (cVar3 == null) {
                l.a("mEditText");
            }
            Editable text2 = cVar3.getText();
            if (text2 == null) {
                l.a();
            }
            c cVar4 = this.f37089a;
            if (cVar4 == null) {
                l.a("mEditText");
            }
            Editable text3 = cVar4.getText();
            if (text3 == null) {
                l.a();
            }
            text2.replace(0, text3.length(), str);
            c cVar5 = this.f37089a;
            if (cVar5 == null) {
                l.a("mEditText");
            }
            if (l.a(cVar5.getText(), text)) {
                this.f37098j = false;
            }
            if (num != null && num.intValue() >= 0) {
                int intValue = num.intValue();
                c cVar6 = this.f37089a;
                if (cVar6 == null) {
                    l.a("mEditText");
                }
                Editable text4 = cVar6.getText();
                if (text4 == null) {
                    l.a();
                }
                if (intValue <= text4.length()) {
                    c cVar7 = this.f37089a;
                    if (cVar7 == null) {
                        l.a("mEditText");
                    }
                    cVar7.setSelection(num.intValue());
                }
            }
            if (callback != null) {
                callback.invoke(0, "Success.");
            }
        } else if (callback != null) {
            callback.invoke(1, "Input is not ready.");
        }
    }
}

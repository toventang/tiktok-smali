package com.bytedance.ies.xelement.input;

import android.content.Context;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c;
import h.f.b.l;

public class LynxInputView extends LynxBaseInputView {
    public static final a w = new a((byte) 0);
    public c v;

    static {
        Covode.recordClassIndex(22318);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final int a() {
        return 16;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 1216985755 && nextKey.equals("password")) {
                boolean z = false;
                if (!readableMap.isNull(nextKey)) {
                    z = readableMap.getBoolean(nextKey, false);
                }
                setIsPassword(z);
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22321);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxInputView(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void a(EditText editText) {
        l.c(editText, "");
        editText.setLines(1);
        editText.setSingleLine(true);
        editText.setHorizontallyScrolling(true);
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
        a2.setOnEditorActionListener(new b(this));
        a2.setOnTouchListener(null);
        a2.setImeOptions(6);
        c cVar = this.v;
        if (cVar == null) {
            l.a("mEditText");
        }
        return cVar;
    }

    @m(a = "password", f = false)
    public final void setIsPassword(boolean z) {
        if (z) {
            c cVar = this.v;
            if (cVar == null) {
                l.a("mEditText");
            }
            int selectionStart = cVar.getSelectionStart();
            c cVar2 = this.v;
            if (cVar2 == null) {
                l.a("mEditText");
            }
            cVar2.setInputType(128);
            c cVar3 = this.v;
            if (cVar3 == null) {
                l.a("mEditText");
            }
            cVar3.setTransformationMethod(PasswordTransformationMethod.getInstance());
            c cVar4 = this.v;
            if (cVar4 == null) {
                l.a("mEditText");
            }
            cVar4.setSelection(selectionStart);
            return;
        }
        c cVar5 = this.v;
        if (cVar5 == null) {
            l.a("mEditText");
        }
        int selectionStart2 = cVar5.getSelectionStart();
        c cVar6 = this.v;
        if (cVar6 == null) {
            l.a("mEditText");
        }
        cVar6.setInputType(this.s);
        c cVar7 = this.v;
        if (cVar7 == null) {
            l.a("mEditText");
        }
        cVar7.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        c cVar8 = this.v;
        if (cVar8 == null) {
            l.a("mEditText");
        }
        cVar8.setSelection(selectionStart2);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void a(EditText editText, String str) {
        l.c(editText, "");
        if (str != null) {
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        editText.setInputType(12290);
                        break;
                    }
                    break;
                case 114715:
                    if (str.equals("tel")) {
                        editText.setInputType(3);
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        editText.setInputType(1);
                        break;
                    }
                    break;
                case 95582509:
                    if (str.equals("digit")) {
                        editText.setInputType(8194);
                        break;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        editText.setInputType(32);
                        break;
                    }
                    break;
                case 1216985755:
                    if (str.equals("password")) {
                        editText.setInputType(128);
                        break;
                    }
                    break;
            }
        }
        this.s = editText.getInputType();
        int selectionStart = editText.getSelectionStart();
        if (!l.a((Object) str, (Object) "password")) {
            editText.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        editText.setSelection(selectionStart);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxInputView f37116a;

        static {
            Covode.recordClassIndex(22322);
        }

        b(LynxInputView lynxInputView) {
            this.f37116a = lynxInputView;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            String str;
            if (i2 != 6 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 0) {
                return false;
            }
            if (this.f37116a.f37096h) {
                j jVar = this.f37116a.mContext;
                l.a((Object) jVar, "");
                c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37116a.getSign(), "confirm");
                c cVar3 = this.f37116a.v;
                if (cVar3 == null) {
                    l.a("mEditText");
                }
                Editable text = cVar3.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                cVar2.a("value", str);
                cVar.a(cVar2);
            }
            if (i2 == 5) {
                return false;
            }
            this.f37116a.c();
            return true;
        }
    }
}

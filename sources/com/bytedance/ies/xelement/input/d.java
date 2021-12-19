package com.bytedance.ies.xelement.input;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.j;
import java.util.Iterator;

public final class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public a f37142a;

    /* renamed from: b  reason: collision with root package name */
    c f37143b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37144c;

    public interface a {
        static {
            Covode.recordClassIndex(22343);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(22342);
    }

    public d() {
        super(null, true);
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        a aVar;
        l.c(keyEvent, "");
        if (keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 0 || (aVar = this.f37142a) == null || !aVar.a()) {
            return super.sendKeyEvent(keyEvent);
        }
        return true;
    }

    public final boolean commitText(CharSequence charSequence, int i2) {
        if (this.f37144c) {
            return true;
        }
        return super.commitText(charSequence, i2);
    }

    public final boolean deleteSurroundingText(int i2, int i3) {
        a aVar;
        if (this.f37144c) {
            return true;
        }
        if (i2 != 1 || i3 != 0 || (aVar = this.f37142a) == null || !aVar.a()) {
            return super.deleteSurroundingText(i2, i3);
        }
        return true;
    }

    public final boolean setComposingText(CharSequence charSequence, int i2) {
        if (!this.f37144c) {
            return super.setComposingText(charSequence, i2);
        }
        if (charSequence == null || charSequence.length() != 1) {
            return true;
        }
        this.f37144c = false;
        return super.setComposingText(charSequence, i2);
    }

    public final boolean setComposingRegion(int i2, int i3) {
        int i4;
        int i5;
        Editable text;
        if (i2 <= i3) {
            i4 = i2;
        } else {
            i4 = i3;
        }
        if (i2 <= i3) {
            i5 = i3;
        } else {
            i5 = i2;
        }
        c cVar = this.f37143b;
        if (cVar != null && (text = cVar.getText()) != null && !this.f37144c && i4 >= 0 && i5 <= text.length()) {
            Iterator a2 = h.m.l.findAll$default(new h.m.l("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-🛿]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?)"), text.subSequence(i4, i5), 0, 2, null).a();
            while (a2.hasNext()) {
                if (((j) a2.next()).a().f158748b == (i5 - i4) - 1) {
                    this.f37144c = true;
                    return true;
                }
            }
        }
        return super.setComposingRegion(i2, i3);
    }
}

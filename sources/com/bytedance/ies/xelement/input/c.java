package com.bytedance.ies.xelement.input;

import android.content.Context;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.input.d;
import h.f.b.l;

public final class c extends AppCompatEditText {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37138c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    d f37139a;

    /* renamed from: b  reason: collision with root package name */
    b f37140b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f37141d;

    public interface b {
        static {
            Covode.recordClassIndex(22341);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(22339);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22340);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final d a() {
        if (!this.f37141d) {
            return null;
        }
        return this.f37139a;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IndexOutOfBoundsException unused) {
            return true;
        }
    }

    public final void setBackSpaceListener(d.a aVar) {
        d dVar = this.f37139a;
        if (dVar != null) {
            dVar.f37142a = aVar;
        }
    }

    public final void setCopyListener(b bVar) {
        l.c(bVar, "");
        this.f37140b = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        l.c(context, "");
        d dVar = new d();
        this.f37139a = dVar;
        l.c(this, "");
        dVar.f37143b = this;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            d dVar = this.f37139a;
            if (dVar != null) {
                dVar.setTarget(onCreateInputConnection);
            }
            this.f37141d = true;
            return this.f37139a;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public final boolean onTextContextMenuItem(int i2) {
        if (i2 != 16908321) {
            return super.onTextContextMenuItem(i2);
        }
        b bVar = this.f37140b;
        if (bVar != null) {
            return bVar.a();
        }
        return super.onTextContextMenuItem(i2);
    }
}

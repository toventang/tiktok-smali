package androidx.emoji.widget;

import android.os.Build;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.g.g;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final a f2822a;

    /* renamed from: b  reason: collision with root package name */
    public int f2823b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f2824c;

    static {
        Covode.recordClassIndex(995);
    }

    static class a {
        static {
            Covode.recordClassIndex(996);
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        /* access modifiers changed from: package-private */
        public InputConnection a(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
        }

        /* access modifiers changed from: package-private */
        public void b(int i2) {
        }

        a() {
        }
    }

    /* renamed from: androidx.emoji.widget.b$b  reason: collision with other inner class name */
    static class C0043b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f2825a;

        /* renamed from: b  reason: collision with root package name */
        private final h f2826b;

        static {
            Covode.recordClassIndex(997);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.b.a
        public final void a(int i2) {
            this.f2826b.f2838a = i2;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.b.a
        public final void b(int i2) {
            this.f2826b.f2839b = i2;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.b.a
        public final KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof f) {
                return keyListener;
            }
            return new f(keyListener);
        }

        C0043b(EditText editText) {
            this.f2825a = editText;
            h hVar = new h(editText);
            this.f2826b = hVar;
            editText.addTextChangedListener(hVar);
            editText.setEditableFactory(c.a());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.b.a
        public final InputConnection a(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof d) {
                return inputConnection;
            }
            return new d(this.f2825a, inputConnection, editorInfo);
        }
    }

    public final KeyListener a(KeyListener keyListener) {
        g.a(keyListener, "keyListener cannot be null");
        return this.f2822a.a(keyListener);
    }

    public b(EditText editText) {
        g.a(editText, "editText cannot be null");
        int i2 = Build.VERSION.SDK_INT;
        this.f2822a = new C0043b(editText);
    }

    public final void a(int i2) {
        g.a(i2, "maxEmojiCount should be greater than 0");
        this.f2823b = i2;
        this.f2822a.a(i2);
    }

    public final InputConnection a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f2822a.a(inputConnection, editorInfo);
    }
}

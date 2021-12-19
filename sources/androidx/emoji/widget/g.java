package androidx.emoji.widget;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final a f2835a;

    static {
        Covode.recordClassIndex(1003);
    }

    public static class a {
        static {
            Covode.recordClassIndex(1004);
        }

        public void a() {
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        a() {
        }
    }

    static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f2836a;

        /* renamed from: b  reason: collision with root package name */
        private final e f2837b;

        static {
            Covode.recordClassIndex(1005);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.g.a
        public final void a() {
            TransformationMethod transformationMethod = this.f2836a.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                TextView textView = this.f2836a;
                if (!(transformationMethod instanceof i)) {
                    transformationMethod = new i(transformationMethod);
                }
                textView.setTransformationMethod(transformationMethod);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.g.a
        public final void a(boolean z) {
            if (z) {
                a();
            }
        }

        b(TextView textView) {
            this.f2836a = textView;
            this.f2837b = new e(textView);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.g.a
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter instanceof e) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f2837b;
            return inputFilterArr2;
        }
    }

    public final void a(boolean z) {
        this.f2835a.a(z);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f2835a.a(inputFilterArr);
    }

    public g(TextView textView) {
        androidx.core.g.g.a(textView, "textView cannot be null");
        int i2 = Build.VERSION.SDK_INT;
        this.f2835a = new b(textView);
    }
}

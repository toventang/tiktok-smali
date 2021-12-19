package androidx.emoji.widget;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.g.g;
import androidx.emoji.a.d;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class j extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f2844a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f2845b = new ArrayList();

    static {
        Covode.recordClassIndex(1009);
    }

    /* access modifiers changed from: package-private */
    public static class a implements SpanWatcher, TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final Object f2846a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f2847b = new AtomicInteger(0);

        static {
            Covode.recordClassIndex(1010);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f2847b.incrementAndGet();
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            this.f2847b.decrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2846a).afterTextChanged(editable);
        }

        a(Object obj) {
            this.f2846a = obj;
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f2846a).beforeTextChanged(charSequence, i2, i3, i4);
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f2846a).onTextChanged(charSequence, i2, i3, i4);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f2847b.get() <= 0 || !(obj instanceof d)) {
                ((SpanWatcher) this.f2846a).onSpanAdded(spannable, obj, i2, i3);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f2847b.get() <= 0 || !(obj instanceof d)) {
                ((SpanWatcher) this.f2846a).onSpanRemoved(spannable, obj, i2, i3);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
            if (this.f2847b.get() <= 0 || !(obj instanceof d)) {
                ((SpanWatcher) this.f2846a).onSpanChanged(spannable, obj, i2, i3, i4, i5);
            }
        }
    }

    private void c() {
        for (int i2 = 0; i2 < this.f2845b.size(); i2++) {
            this.f2845b.get(i2).b();
        }
    }

    public final void a() {
        c();
        d();
    }

    private void d() {
        for (int i2 = 0; i2 < this.f2845b.size(); i2++) {
            this.f2845b.get(i2).onTextChanged(this, 0, length(), length());
        }
    }

    public final void b() {
        for (int i2 = 0; i2 < this.f2845b.size(); i2++) {
            this.f2845b.get(i2).a();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable, android.text.Editable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    private boolean a(Class<?> cls) {
        if (this.f2844a == cls) {
            return true;
        }
        return false;
    }

    private boolean a(Object obj) {
        if (obj == null || !a(obj.getClass())) {
            return false;
        }
        return true;
    }

    private a b(Object obj) {
        for (int i2 = 0; i2 < this.f2845b.size(); i2++) {
            a aVar = this.f2845b.get(i2);
            if (aVar.f2846a == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final int getSpanEnd(Object obj) {
        a b2;
        if (a(obj) && (b2 = b(obj)) != null) {
            obj = b2;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        a b2;
        if (a(obj) && (b2 = b(obj)) != null) {
            obj = b2;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        a b2;
        if (a(obj) && (b2 = b(obj)) != null) {
            obj = b2;
        }
        return super.getSpanStart(obj);
    }

    public final void removeSpan(Object obj) {
        a aVar;
        if (a(obj)) {
            aVar = b(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2845b.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable, android.text.Editable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    public final CharSequence subSequence(int i2, int i3) {
        return new j(this.f2844a, this, i2, i3);
    }

    j(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        g.a(cls, "watcherClass cannot be null");
        this.f2844a = cls;
    }

    public final int nextSpanTransition(int i2, int i3, Class cls) {
        if (a((Class<?>) cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        b();
        super.replace(i2, i3, charSequence);
        c();
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        if (!a((Class<?>) cls)) {
            return (T[]) super.getSpans(i2, i3, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i2, i3, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            tArr[i4] = aVarArr[i4].f2846a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable, android.text.Editable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (a(obj)) {
            a aVar = new a(obj);
            this.f2845b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    private j(Class<?> cls, CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        g.a(cls, "watcherClass cannot be null");
        this.f2844a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        b();
        super.replace(i2, i3, charSequence, i4, i5);
        c();
        return this;
    }
}

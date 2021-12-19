package com.bytedance.ies.dmt.ui.d;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class a extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public static final b f33380a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final List<Integer> f33381b = new ArrayList();

    static {
        Covode.recordClassIndex(19928);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(19930);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static String a(int i2) {
            String a2 = com.a.a(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            l.b(a2, "");
            return a2;
        }
    }

    public final /* bridge */ int length() {
        return super.length();
    }

    /* renamed from: com.bytedance.ies.dmt.ui.d.a$a  reason: collision with other inner class name */
    public static final class C0730a {

        /* renamed from: a  reason: collision with root package name */
        public final a f33382a;

        /* renamed from: b  reason: collision with root package name */
        public final c f33383b = new c();

        static {
            Covode.recordClassIndex(19929);
        }

        public C0730a() {
            char c2;
            a aVar = new a();
            this.f33382a = aVar;
            if (gb.a()) {
                c2 = 8207;
            } else {
                c2 = 8206;
            }
            aVar.append(c2);
            aVar.a(0);
        }

        public final C0730a a(CharSequence charSequence) {
            l.d(charSequence, "");
            this.f33382a.append(charSequence);
            return this;
        }

        public final C0730a b(CharSequence charSequence) {
            l.d(charSequence, "");
            c.a(this.f33382a, charSequence);
            return this;
        }

        public final C0730a c(CharSequence charSequence) {
            char c2;
            l.d(charSequence, "");
            a aVar = this.f33382a;
            l.d(aVar, "");
            l.d(charSequence, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (gb.a()) {
                c2 = 8207;
            } else {
                c2 = 8206;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(c2);
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            l.b(spannableStringBuilder2, "");
            int length = aVar.length();
            aVar.a(length);
            aVar.a((length + spannableStringBuilder2.length()) - 1);
            aVar.append((CharSequence) spannableStringBuilder2);
            return this;
        }

        public final C0730a a(CharSequence charSequence, Object obj, int i2) {
            l.d(charSequence, "");
            int length = this.f33382a.length();
            this.f33382a.append(charSequence);
            if (obj != null) {
                this.f33382a.setSpan(obj, length, this.f33382a.length(), i2);
            }
            return this;
        }

        public final C0730a a(Resources resources, int i2, String... strArr) {
            l.d(resources, "");
            l.d(strArr, "");
            ArrayList arrayList = new ArrayList(1);
            int i3 = 0;
            do {
                arrayList.add(c.a(strArr[0]));
                i3++;
            } while (i3 <= 0);
            Object[] array = arrayList.toArray(new CharSequence[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String string = resources.getString(i2, Arrays.copyOf(array, array.length));
            l.b(string, "");
            this.f33382a.append((CharSequence) string);
            return this;
        }
    }

    public final /* bridge */ char charAt(int i2) {
        return super.charAt(i2);
    }

    public final void a(int i2) {
        this.f33381b.add(Integer.valueOf(i2));
    }

    public static final class c {
        static {
            Covode.recordClassIndex(19931);
        }

        public static CharSequence a(CharSequence charSequence) {
            l.d(charSequence, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((char) 8296);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8297);
            return spannableStringBuilder;
        }

        public static void a(a aVar, CharSequence charSequence) {
            l.d(aVar, "");
            l.d(charSequence, "");
            CharSequence a2 = a(charSequence);
            int length = aVar.length();
            aVar.a(length);
            aVar.a((length + a2.length()) - 1);
            aVar.append(a2);
        }
    }

    private final int b(int i2) {
        int size = this.f33381b.size();
        int i3 = 0;
        while (i3 < size && this.f33381b.get(i3).intValue() <= i2) {
            i2++;
            i3++;
        }
        return i2;
    }

    public final void a(Object obj, int i2, int i3) {
        super.setSpan(obj, b(i2), b(i3), 33);
    }
}

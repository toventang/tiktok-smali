package androidx.core.f;

import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ugc.effectplatform.b.a.e;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final e f2349a;

    /* renamed from: b  reason: collision with root package name */
    static final a f2350b;

    /* renamed from: c  reason: collision with root package name */
    static final a f2351c;

    /* renamed from: e  reason: collision with root package name */
    private static final String f2352e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f2353f = Character.toString(8207);

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2354d;

    /* renamed from: g  reason: collision with root package name */
    private final int f2355g;

    /* renamed from: h  reason: collision with root package name */
    private final e f2356h;

    public static a a() {
        return new C0031a().a();
    }

    /* renamed from: androidx.core.f.a$a  reason: collision with other inner class name */
    public static final class C0031a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2357a;

        /* renamed from: b  reason: collision with root package name */
        private int f2358b;

        /* renamed from: c  reason: collision with root package name */
        private e f2359c;

        static {
            Covode.recordClassIndex(751);
        }

        public C0031a() {
            a(g.a(Locale.getDefault()) != 1 ? false : true);
        }

        public final a a() {
            if (this.f2358b == 2 && this.f2359c == a.f2349a) {
                return b(this.f2357a);
            }
            return new a(this.f2357a, this.f2358b, this.f2359c);
        }

        public C0031a(boolean z) {
            a(z);
        }

        private static a b(boolean z) {
            if (z) {
                return a.f2351c;
            }
            return a.f2350b;
        }

        private void a(boolean z) {
            this.f2357a = z;
            this.f2359c = a.f2349a;
            this.f2358b = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f2360a = new byte[1792];

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f2361b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f2362c = false;

        /* renamed from: d  reason: collision with root package name */
        private final int f2363d;

        /* renamed from: e  reason: collision with root package name */
        private int f2364e;

        /* renamed from: f  reason: collision with root package name */
        private char f2365f;

        static {
            Covode.recordClassIndex(752);
            int i2 = 0;
            do {
                f2360a[i2] = Character.getDirectionality(i2);
                i2++;
            } while (i2 < 1792);
        }

        private byte g() {
            char charAt;
            do {
                int i2 = this.f2364e;
                if (i2 >= this.f2363d) {
                    return 12;
                }
                CharSequence charSequence = this.f2361b;
                this.f2364e = i2 + 1;
                charAt = charSequence.charAt(i2);
                this.f2365f = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte f() {
            char charAt;
            int i2 = this.f2364e;
            while (true) {
                int i3 = this.f2364e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2361b;
                int i4 = i3 - 1;
                this.f2364e = i4;
                char charAt2 = charSequence.charAt(i4);
                this.f2365f = charAt2;
                if (charAt2 != '<') {
                    if (charAt2 == '>') {
                        break;
                    } else if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i5 = this.f2364e;
                            if (i5 <= 0) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2361b;
                            int i6 = i5 - 1;
                            this.f2364e = i6;
                            charAt = charSequence2.charAt(i6);
                            this.f2365f = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    return 12;
                }
            }
            this.f2364e = i2;
            this.f2365f = '>';
            return e.f153515b;
        }

        private byte h() {
            char charAt;
            int i2 = this.f2364e;
            do {
                int i3 = this.f2364e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2361b;
                int i4 = i3 - 1;
                this.f2364e = i4;
                charAt = charSequence.charAt(i4);
                this.f2365f = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f2364e = i2;
            this.f2365f = ';';
            return e.f153515b;
        }

        private byte c() {
            char charAt = this.f2361b.charAt(this.f2364e);
            this.f2365f = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2361b, this.f2364e);
                this.f2364e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2364e++;
            byte a2 = a(this.f2365f);
            if (!this.f2362c) {
                return a2;
            }
            char c2 = this.f2365f;
            if (c2 == '<') {
                return e();
            }
            if (c2 == '&') {
                return g();
            }
            return a2;
        }

        private byte d() {
            char charAt = this.f2361b.charAt(this.f2364e - 1);
            this.f2365f = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2361b, this.f2364e);
                this.f2364e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2364e--;
            byte a2 = a(this.f2365f);
            if (!this.f2362c) {
                return a2;
            }
            char c2 = this.f2365f;
            if (c2 == '>') {
                return f();
            }
            if (c2 == ';') {
                return h();
            }
            return a2;
        }

        private byte e() {
            char charAt;
            int i2 = this.f2364e;
            while (true) {
                int i3 = this.f2364e;
                if (i3 < this.f2363d) {
                    CharSequence charSequence = this.f2361b;
                    this.f2364e = i3 + 1;
                    char charAt2 = charSequence.charAt(i3);
                    this.f2365f = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i4 = this.f2364e;
                            if (i4 >= this.f2363d) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2361b;
                            this.f2364e = i4 + 1;
                            charAt = charSequence2.charAt(i4);
                            this.f2365f = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f2364e = i2;
                    this.f2365f = '<';
                    return e.f153515b;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            this.f2364e = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (this.f2364e < this.f2363d) {
                    if (i2 == 0) {
                        byte c2 = c();
                        if (c2 != 0) {
                            if (c2 == 1 || c2 == 2) {
                                if (i4 == 0) {
                                    return 1;
                                }
                            } else if (c2 != 9) {
                                switch (c2) {
                                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                    case 15:
                                        i4++;
                                        i3 = -1;
                                        break;
                                    case 16:
                                    case 17:
                                        i4++;
                                        i3 = 1;
                                        break;
                                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                        i4--;
                                        i3 = 0;
                                        break;
                                }
                            }
                        } else if (i4 == 0) {
                            return -1;
                        }
                        i2 = i4;
                    }
                } else if (i2 == 0) {
                    return 0;
                }
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.f2364e > 0) {
                switch (d()) {
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                    case 15:
                        if (i2 == i4) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i2 == i4) {
                            return 1;
                        }
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                        i4++;
                        continue;
                }
                i4--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            this.f2364e = this.f2363d;
            int i2 = 0;
            int i3 = 0;
            while (this.f2364e > 0) {
                byte d2 = d();
                if (d2 != 0) {
                    if (d2 == 1 || d2 == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i3 != 0) {
                        }
                    } else if (d2 != 9) {
                        switch (d2) {
                            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            case 15:
                                if (i3 == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i3 == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                i2++;
                                break;
                            default:
                                if (i3 != 0) {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i2 == 0) {
                    return -1;
                } else {
                    if (i3 != 0) {
                    }
                }
                i3 = i2;
            }
            return 0;
        }

        b(CharSequence charSequence) {
            this.f2361b = charSequence;
            this.f2363d = charSequence.length();
        }

        private static byte a(char c2) {
            if (c2 < 1792) {
                return f2360a[c2];
            }
            return Character.getDirectionality(c2);
        }
    }

    static {
        Covode.recordClassIndex(750);
        e eVar = f.f2384c;
        f2349a = eVar;
        f2350b = new a(false, 2, eVar);
        f2351c = new a(true, 2, eVar);
    }

    public final CharSequence a(CharSequence charSequence) {
        return a(charSequence, this.f2356h);
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence).b();
    }

    private static int c(CharSequence charSequence) {
        return new b(charSequence).a();
    }

    public static a a(boolean z) {
        return new C0031a(z).a();
    }

    public final String b(String str) {
        e eVar = this.f2356h;
        if (str == null) {
            return null;
        }
        return a(str, eVar).toString();
    }

    public final boolean a(String str) {
        return this.f2356h.a(str, str.length());
    }

    private CharSequence a(CharSequence charSequence, e eVar) {
        boolean z;
        e eVar2;
        char c2;
        e eVar3;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean a2 = eVar.a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f2355g & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z) {
            if (a2) {
                eVar3 = f.f2383b;
            } else {
                eVar3 = f.f2382a;
            }
            boolean a3 = eVar3.a(charSequence, charSequence.length());
            if (!this.f2354d && (a3 || c(charSequence) == 1)) {
                str = f2352e;
            } else if (!this.f2354d || (a3 && c(charSequence) != -1)) {
                str = str2;
            } else {
                str = f2353f;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (a2 != this.f2354d) {
            if (a2) {
                c2 = 8235;
            } else {
                c2 = 8234;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (a2) {
            eVar2 = f.f2383b;
        } else {
            eVar2 = f.f2382a;
        }
        boolean a4 = eVar2.a(charSequence, charSequence.length());
        if (!this.f2354d && (a4 || b(charSequence) == 1)) {
            str2 = f2352e;
        } else if (this.f2354d && (!a4 || b(charSequence) == -1)) {
            str2 = f2353f;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    a(boolean z, int i2, e eVar) {
        this.f2354d = z;
        this.f2355g = i2;
        this.f2356h = eVar;
    }
}

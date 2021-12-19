package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.g;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;

public final class r extends com.bytedance.ies.web.jsbridge2.e<a, b> {

    public static final class a {
        @com.google.gson.a.c(a = StringSet.type)

        /* renamed from: a  reason: collision with root package name */
        public final String f14711a;
        @com.google.gson.a.c(a = "title")

        /* renamed from: b  reason: collision with root package name */
        public final String f14712b;
        @com.google.gson.a.c(a = "text")

        /* renamed from: c  reason: collision with root package name */
        public final String f14713c;
        @com.google.gson.a.c(a = "left_button_text")

        /* renamed from: d  reason: collision with root package name */
        public final String f14714d;
        @com.google.gson.a.c(a = "left_button_text_color")

        /* renamed from: e  reason: collision with root package name */
        public final String f14715e;
        @com.google.gson.a.c(a = "right_button_text")

        /* renamed from: f  reason: collision with root package name */
        public final String f14716f;
        @com.google.gson.a.c(a = "right_button_text_color")

        /* renamed from: g  reason: collision with root package name */
        public final String f14717g;
        @com.google.gson.a.c(a = "corner_radius")

        /* renamed from: h  reason: collision with root package name */
        public final Float f14718h;

        static {
            Covode.recordClassIndex(8171);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f14711a, aVar.f14711a) && l.a(this.f14712b, aVar.f14712b) && l.a(this.f14713c, aVar.f14713c) && l.a(this.f14714d, aVar.f14714d) && l.a(this.f14715e, aVar.f14715e) && l.a(this.f14716f, aVar.f14716f) && l.a(this.f14717g, aVar.f14717g) && l.a(this.f14718h, aVar.f14718h);
        }

        public final int hashCode() {
            String str = this.f14711a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f14712b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f14713c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f14714d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f14715e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f14716f;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.f14717g;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            Float f2 = this.f14718h;
            if (f2 != null) {
                i2 = f2.hashCode();
            }
            return hashCode7 + i2;
        }

        public final String toString() {
            return "Params(type=" + this.f14711a + ", title=" + this.f14712b + ", text=" + this.f14713c + ", leftButtonText=" + this.f14714d + ", leftButtonTextColor=" + this.f14715e + ", rightButtonText=" + this.f14716f + ", rightButtonTextColor=" + this.f14717g + ", cornerRadius=" + this.f14718h + ")";
        }
    }

    static {
        Covode.recordClassIndex(8170);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
    }

    static final class f extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f14729a = new f();

        static {
            Covode.recordClassIndex(8176);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.livesdk.l.b $dlg;

        static {
            Covode.recordClassIndex(8175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.bytedance.android.livesdk.l.b bVar) {
            super(0);
            this.$dlg = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.livesdk.l.b bVar = this.$dlg;
            if (bVar != null) {
                bVar.dismiss();
            }
            return z.f158842a;
        }
    }

    public static final class b {
        @com.google.gson.a.c(a = "code")

        /* renamed from: a  reason: collision with root package name */
        public final int f14719a = 1;
        @com.google.gson.a.c(a = "action")

        /* renamed from: b  reason: collision with root package name */
        public final String f14720b;

        static {
            Covode.recordClassIndex(8172);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14719a == bVar.f14719a && l.a(this.f14720b, bVar.f14720b);
        }

        public final int hashCode() {
            int i2 = this.f14719a * 31;
            String str = this.f14720b;
            return i2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Result(code=" + this.f14719a + ", action=" + this.f14720b + ")";
        }

        public b(String str) {
            l.d(str, "");
            this.f14720b = str;
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f14721a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f14722b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f14723c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f14724d;

        static {
            Covode.recordClassIndex(8173);
        }

        c(b.a aVar, r rVar, a aVar2, z.e eVar) {
            this.f14721a = aVar;
            this.f14722b = rVar;
            this.f14723c = aVar2;
            this.f14724d = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f14722b.finishWithResult(new b("right"));
            this.f14724d.element.invoke();
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f14725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f14726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f14727c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f14728d;

        static {
            Covode.recordClassIndex(8174);
        }

        d(b.a aVar, r rVar, a aVar2, z.e eVar) {
            this.f14725a = aVar;
            this.f14726b = rVar;
            this.f14727c = aVar2;
            this.f14728d = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f14726b.finishWithResult(new b("left"));
            this.f14728d.element.invoke();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(a aVar, g gVar) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        l.d(gVar, "");
        try {
            String str = aVar2.f14711a;
            if (str.hashCode() == 951117504 && str.equals("confirm")) {
                Context context = gVar.f35646a;
                l.b(context, "");
                z.e eVar = new z.e();
                eVar.element = (T) f.f14729a;
                b.a aVar3 = new b.a(context);
                String str2 = aVar2.f14712b;
                if (str2 != null) {
                    aVar3.f18284a = str2;
                }
                String str3 = aVar2.f14713c;
                if (str3 != null) {
                    aVar3.f18285b = str3;
                }
                Float f2 = aVar2.f14718h;
                if (f2 != null) {
                    aVar3.n = (int) f2.floatValue();
                }
                aVar3.f18296m = false;
                String str4 = aVar2.f14716f;
                if (str4 != null && str4.length() > 0) {
                    SpannableString spannableString = new SpannableString(str4);
                    String str5 = aVar2.f14717g;
                    if (str5 != null) {
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str5)), 0, spannableString.length(), 33);
                    }
                    aVar3.a((CharSequence) spannableString, (DialogInterface.OnClickListener) new c(aVar3, this, aVar2, eVar), false);
                }
                String str6 = aVar2.f14714d;
                if (str6 != null && str6.length() > 0) {
                    SpannableString spannableString2 = new SpannableString(str6);
                    String str7 = aVar2.f14715e;
                    if (str7 != null) {
                        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(str7)), 0, spannableString2.length(), 33);
                    }
                    aVar3.b((CharSequence) spannableString2, (DialogInterface.OnClickListener) new d(aVar3, this, aVar2, eVar), false);
                }
                com.bytedance.android.livesdk.l.b a2 = aVar3.a();
                a2.show();
                eVar.element = (T) new e(a2);
                return;
            }
            finishWithFailure();
        } catch (Throwable th) {
            finishWithFailure();
            i.b();
            com.bytedance.android.live.core.c.a.a(5, "ttlive_exception", th.getStackTrace());
        }
    }
}

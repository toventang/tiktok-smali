package com.ss.android.ugc.aweme.specact.popup.b;

import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.specact.popup.a.g;
import com.ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi;
import com.ss.android.ugc.aweme.specact.popup.b.b;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f134520a;

    /* renamed from: b  reason: collision with root package name */
    public String f134521b;

    /* renamed from: c  reason: collision with root package name */
    public String f134522c;

    /* renamed from: d  reason: collision with root package name */
    public c f134523d;

    /* renamed from: e  reason: collision with root package name */
    public g f134524e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.popup.a.d f134525f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f134526g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public d f134527h;

    /* renamed from: i  reason: collision with root package name */
    public C3497e[] f134528i;

    /* renamed from: j  reason: collision with root package name */
    public String f134529j;

    /* renamed from: k  reason: collision with root package name */
    public a f134530k;

    /* renamed from: l  reason: collision with root package name */
    public m<? super j, ? super e, z> f134531l = new m<j, e, z>(this) {
        /* class com.ss.android.ugc.aweme.specact.popup.b.e.AnonymousClass1 */
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(87916);
        }

        {
            this.this$0 = r2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(j jVar, e eVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            l.d(eVar, "");
            b bVar = new b(this.this$0.n);
            l.d(jVar2, "");
            SpecActRedPacketApi.a.a(bVar.f134508c, "False");
            if (!bVar.f134508c.f134442l.isEmpty()) {
                bVar.f134506a = bVar.f134508c.f134442l.get(0);
                com.ss.android.ugc.aweme.specact.popup.a.b bVar2 = bVar.f134506a;
                if (bVar2 == null) {
                    l.a("buttonAction");
                }
                if (bVar2.f134413f == 0 && bVar.f134508c.o.f134423a.f134416b.length() != 0) {
                    String a2 = com.ss.android.ugc.aweme.specact.popup.calendar.a.a(bVar.f134508c.f134434d, "register");
                    long j2 = bVar.f134508c.o.f134423a.f134415a * 1000;
                    com.ss.android.ugc.aweme.specact.popup.calendar.a.a(jVar2.f134575d, new com.ss.android.ugc.aweme.specact.popup.calendar.b(a2, null, j2, j2, TimeUnit.MINUTES.toMillis(1), bVar.f134508c.o.f134423a.f134416b, bVar.f134508c.o.f134423a.f134417c, "feed", 142), false, new b.f(bVar, jVar2));
                    jVar2.dismiss();
                } else {
                    bVar.f134507b = jVar2.f134575d;
                    TextView textView = jVar2.f134573b;
                    if (textView != null) {
                        textView.setText("");
                    }
                    ImageView imageView = jVar2.f134572a;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    jVar2.f134574c = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    RotateAnimation rotateAnimation = jVar2.f134574c;
                    if (rotateAnimation != null) {
                        rotateAnimation.setDuration(1000);
                        rotateAnimation.setRepeatCount(-1);
                        rotateAnimation.setInterpolator(new LinearInterpolator());
                        rotateAnimation.setFillAfter(true);
                    }
                    ImageView imageView2 = jVar2.f134572a;
                    if (imageView2 != null) {
                        imageView2.startAnimation(jVar2.f134574c);
                    }
                    i.b(new b.d(bVar), i.f4824a).b(new b.e(bVar, jVar2), i.f4826c);
                }
            }
            return z.f158842a;
        }
    };

    /* renamed from: m  reason: collision with root package name */
    public Boolean f134532m;
    public final com.ss.android.ugc.aweme.specact.popup.a.i n;

    public enum b {
        YELLOW,
        SIMPLE;

        static {
            Covode.recordClassIndex(87918);
        }
    }

    public enum d {
        COIN,
        COIN2,
        CALENDAR;

        static {
            Covode.recordClassIndex(87920);
        }
    }

    static {
        Covode.recordClassIndex(87915);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f134538a;

        /* renamed from: b  reason: collision with root package name */
        public final d f134539b;

        static {
            Covode.recordClassIndex(87919);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.f134538a, cVar.f134538a) && l.a(this.f134539b, cVar.f134539b);
        }

        public final int hashCode() {
            String str = this.f134538a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            d dVar = this.f134539b;
            if (dVar != null) {
                i2 = dVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "Content(content=" + this.f134538a + ", icon=" + this.f134539b + ")";
        }

        public /* synthetic */ c(String str) {
            this(str, null);
        }

        public c(String str, d dVar) {
            l.d(str, "");
            this.f134538a = str;
            this.f134539b = dVar;
        }
    }

    public final void a(List<String> list) {
        l.d(list, "");
        this.f134526g = list;
    }

    public e(com.ss.android.ugc.aweme.specact.popup.a.i iVar) {
        l.d(iVar, "");
        this.n = iVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.e$e  reason: collision with other inner class name */
    public static final class C3497e {

        /* renamed from: a  reason: collision with root package name */
        public final String f134541a;

        /* renamed from: b  reason: collision with root package name */
        public final String f134542b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f134543c;

        static {
            Covode.recordClassIndex(87921);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3497e)) {
                return false;
            }
            C3497e eVar = (C3497e) obj;
            return l.a(this.f134541a, eVar.f134541a) && l.a(this.f134542b, eVar.f134542b) && this.f134543c == eVar.f134543c;
        }

        public final int hashCode() {
            String str = this.f134541a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f134542b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            int i3 = (hashCode + i2) * 31;
            boolean z = this.f134543c;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            return i3 + i4;
        }

        public final String toString() {
            return "ListModel(key=" + this.f134541a + ", value=" + this.f134542b + ", isBold=" + this.f134543c + ")";
        }

        public C3497e(String str, String str2, boolean z) {
            l.d(str, "");
            l.d(str2, "");
            this.f134541a = str;
            this.f134542b = str2;
            this.f134543c = z;
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f134533a;

        /* renamed from: b  reason: collision with root package name */
        public final b f134534b;

        /* renamed from: c  reason: collision with root package name */
        public final d f134535c;

        /* renamed from: d  reason: collision with root package name */
        public final String f134536d;

        static {
            Covode.recordClassIndex(87917);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f134533a, aVar.f134533a) && l.a(this.f134534b, aVar.f134534b) && l.a(this.f134535c, aVar.f134535c) && l.a(this.f134536d, aVar.f134536d);
        }

        public final int hashCode() {
            String str = this.f134533a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            b bVar = this.f134534b;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            d dVar = this.f134535c;
            int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
            String str2 = this.f134536d;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "Button(content=" + this.f134533a + ", style=" + this.f134534b + ", icon=" + this.f134535c + ", image=" + this.f134536d + ")";
        }

        public a(String str, b bVar, d dVar, String str2) {
            l.d(str, "");
            l.d(bVar, "");
            l.d(str2, "");
            this.f134533a = str;
            this.f134534b = bVar;
            this.f134535c = dVar;
            this.f134536d = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, b bVar, d dVar, String str2, int i2) {
            this(str, bVar, (i2 & 4) != 0 ? null : dVar, (i2 & 8) != 0 ? "" : str2);
        }
    }
}

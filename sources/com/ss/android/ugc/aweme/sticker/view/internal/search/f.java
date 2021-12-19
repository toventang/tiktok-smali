package com.ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public abstract class f {
    static {
        Covode.recordClassIndex(89178);
    }

    private f() {
    }

    public /* synthetic */ f(byte b2) {
        this();
    }

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f136528a;

        static {
            Covode.recordClassIndex(89179);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f136528a, ((a) obj).f136528a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f136528a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ClearPropSearchText(panelUnfold=" + this.f136528a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super((byte) 0);
            l.d(str, "");
            this.f136528a = str;
        }
    }

    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f136529a;

        static {
            Covode.recordClassIndex(89180);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && l.a(this.f136529a, ((b) obj).f136529a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f136529a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ClickSearchIcon(enterMethod=" + this.f136529a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((byte) 0);
            l.d(str, "");
            this.f136529a = str;
        }
    }

    public static final class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f136535a;

        static {
            Covode.recordClassIndex(89182);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && l.a(this.f136535a, ((d) obj).f136535a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f136535a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "PropSearchCancel(panelUnfold=" + this.f136535a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super((byte) 0);
            l.d(str, "");
            this.f136535a = str;
        }
    }

    public static final class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f136530a;

        /* renamed from: b  reason: collision with root package name */
        public final String f136531b;

        /* renamed from: c  reason: collision with root package name */
        public final String f136532c;

        /* renamed from: d  reason: collision with root package name */
        public final String f136533d;

        /* renamed from: e  reason: collision with root package name */
        public final String f136534e;

        static {
            Covode.recordClassIndex(89181);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.f136530a, cVar.f136530a) && l.a(this.f136531b, cVar.f136531b) && l.a(this.f136532c, cVar.f136532c) && l.a(this.f136533d, cVar.f136533d) && l.a(this.f136534e, cVar.f136534e);
        }

        public final int hashCode() {
            String str = this.f136530a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f136531b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f136532c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f136533d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f136534e;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            return hashCode4 + i2;
        }

        public final String toString() {
            return "PropSearch(enterMethod=" + this.f136530a + ", searchKeyword=" + this.f136531b + ", searchId=" + this.f136532c + ", isSuccess=" + this.f136533d + ", duration=" + this.f136534e + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, String str5) {
            super((byte) 0);
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            l.d(str5, "");
            this.f136530a = str;
            this.f136531b = str2;
            this.f136532c = str3;
            this.f136533d = str4;
            this.f136534e = str5;
        }
    }

    public static final class e extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f136536a;

        /* renamed from: b  reason: collision with root package name */
        public final String f136537b;

        /* renamed from: c  reason: collision with root package name */
        public final String f136538c;

        /* renamed from: d  reason: collision with root package name */
        public final Effect f136539d;

        /* renamed from: e  reason: collision with root package name */
        public final int f136540e;

        static {
            Covode.recordClassIndex(89183);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return l.a(this.f136536a, eVar.f136536a) && l.a(this.f136537b, eVar.f136537b) && l.a(this.f136538c, eVar.f136538c) && l.a(this.f136539d, eVar.f136539d) && this.f136540e == eVar.f136540e;
        }

        public final int hashCode() {
            String str = this.f136536a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f136537b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f136538c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Effect effect = this.f136539d;
            if (effect != null) {
                i2 = effect.hashCode();
            }
            return ((hashCode3 + i2) * 31) + this.f136540e;
        }

        public final String toString() {
            return "PropShow(searchMethod=" + this.f136536a + ", searchId=" + this.f136537b + ", panelUnfold=" + this.f136538c + ", effect=" + this.f136539d + ", index=" + this.f136540e + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, Effect effect, int i2) {
            super((byte) 0);
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(effect, "");
            this.f136536a = str;
            this.f136537b = str2;
            this.f136538c = str3;
            this.f136539d = effect;
            this.f136540e = i2;
        }
    }
}

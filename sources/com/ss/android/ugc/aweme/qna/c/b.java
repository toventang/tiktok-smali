package com.ss.android.ugc.aweme.qna.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qna.fragment.c;
import h.f.b.l;
import h.n;
import java.util.Locale;
import java.util.Objects;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119268a = a.f119269a;

    /* renamed from: com.ss.android.ugc.aweme.qna.c.b$b  reason: collision with other inner class name */
    public enum EnumC3079b {
        TRANSLATE,
        SHOW_ORIGINAL,
        REPORT,
        VIEW_MORE_ANSWERS,
        DELETE;
        
        public static final a Companion = new a((byte) 0);

        static {
            Covode.recordClassIndex(77471);
        }

        /* renamed from: com.ss.android.ugc.aweme.qna.c.b$b$a */
        public static final class a {
            static {
                Covode.recordClassIndex(77472);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            public static EnumC3079b a(c cVar) {
                l.d(cVar, "");
                int i2 = c.f119271a[cVar.ordinal()];
                if (i2 == 1) {
                    return EnumC3079b.SHOW_ORIGINAL;
                }
                if (i2 == 2) {
                    return EnumC3079b.TRANSLATE;
                }
                if (i2 == 3) {
                    return EnumC3079b.DELETE;
                }
                if (i2 == 4) {
                    return EnumC3079b.VIEW_MORE_ANSWERS;
                }
                throw new n();
            }
        }
    }

    static {
        Covode.recordClassIndex(77469);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f119269a = new a();

        public static String a(boolean z) {
            return z ? "qa_personal_profile" : "qa_others_profile";
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(77470);
        }

        public static void a(String str, boolean z) {
            String str2;
            l.d(str, "");
            d dVar = new d();
            if (z) {
                str2 = "qa_personal_profile";
            } else {
                str2 = "qa_others_profile";
            }
            r.a("tap_question", dVar.a("enter_from", str2).a("question_id", str).f66730a);
        }

        public static void a(String str, c cVar, boolean z) {
            String str2;
            l.d(str, "");
            l.d(cVar, "");
            EnumC3079b a2 = EnumC3079b.a.a(cVar);
            d dVar = new d();
            if (z) {
                str2 = "qa_personal_profile";
            } else {
                str2 = "qa_others_profile";
            }
            d a3 = dVar.a("enter_from", str2).a("question_id", str);
            String name = a2.name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(Locale.ROOT);
            l.b(lowerCase, "");
            r.a("click_qa_option", a3.a("question_type", lowerCase).f66730a);
        }
    }
}

package com.ss.android.ugc.aweme.qna.g;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f119463a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(77649);
    }

    public static String a(int i2) {
        String string = com.bytedance.ies.ugc.appcontext.d.a().getString(i2);
        l.b(string, "");
        return string;
    }

    public static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f119466a = new b();

        static {
            Covode.recordClassIndex(77651);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_wifi_slash;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.g.c$c  reason: collision with other inner class name */
    public static final class C3086c extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ h.f.a.a $onClick;
        final /* synthetic */ TuxStatusView $qnaStatusView;

        static {
            Covode.recordClassIndex(77652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3086c(h.f.a.a aVar, TuxStatusView tuxStatusView) {
            super(1);
            this.$onClick = aVar;
            this.$qnaStatusView = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            l.d(tuxButton2, "");
            tuxButton2.setText(c.a(R.string.br));
            tuxButton2.setButtonSize(3);
            tuxButton2.setButtonVariant(1);
            tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise));
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.qna.g.c.C3086c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C3086c f119467a;

                static {
                    Covode.recordClassIndex(77653);
                }

                {
                    this.f119467a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f119467a.$onClick.invoke();
                    this.f119467a.$qnaStatusView.a();
                }
            });
            return z.f158842a;
        }
    }

    public static final class d extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ boolean $isSuggestionTab;

        static {
            Covode.recordClassIndex(77654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(1);
            this.$isSuggestionTab = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            int i2;
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            if (!this.$isSuggestionTab || !com.ss.android.ugc.aweme.qna.e.b.a()) {
                i2 = R.raw.icon_large_error_qa;
            } else {
                i2 = R.raw.icon_large_lightbulb;
            }
            aVar2.f44749a = i2;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f119464a;

        /* renamed from: b  reason: collision with root package name */
        public final String f119465b;

        static {
            Covode.recordClassIndex(77650);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f119464a, aVar.f119464a) && l.a(this.f119465b, aVar.f119465b);
        }

        public final int hashCode() {
            String str = this.f119464a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f119465b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "TitleMessagePair(title=" + this.f119464a + ", message=" + this.f119465b + ")";
        }

        public a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f119464a = str;
            this.f119465b = str2;
        }
    }

    public static String a(int i2, String str) {
        String string = com.bytedance.ies.ugc.appcontext.d.a().getString(i2, str);
        l.b(string, "");
        return string;
    }
}

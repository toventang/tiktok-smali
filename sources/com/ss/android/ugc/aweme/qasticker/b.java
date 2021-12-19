package com.ss.android.ugc.aweme.qasticker;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.dialog.b.c;
import com.ss.android.ugc.aweme.shortvideo.bn;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.j.g;
import h.m.p;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static String f119163a = "allow_show_keva_key";

    /* renamed from: b  reason: collision with root package name */
    public static final Keva f119164b;

    static {
        Covode.recordClassIndex(77388);
        Keva repo = Keva.getRepo("allow_show_keva_repo");
        l.b(repo, "");
        f119164b = repo;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ h.f.a.a $nextStep$inlined;

        static {
            Covode.recordClassIndex(77389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h.f.a.a aVar) {
            super(1);
            this.$nextStep$inlined = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.f6g, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.qasticker.b.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(77390);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    b.f119164b.storeInt(b.f119163a, com.ss.android.ugc.aweme.question.a.FORUM_OPEN.ordinal());
                    h.f.a.a aVar2 = this.this$0.$nextStep$inlined;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.f6f, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.qasticker.b.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(77391);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    h.f.a.a aVar2 = this.this$0.$nextStep$inlined;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static final int a(EditText editText) {
        if (editText == null) {
            return 0;
        }
        try {
            String obj = editText.getText().toString();
            Editable text = editText.getText();
            l.b(text, "");
            if (p.c(text, " ")) {
                obj = p.a(obj, new g(0, obj.length() - 2)) + '-';
            }
            return new StaticLayout(obj, editText.getPaint(), editText.getMaxWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static final void a(h.f.a.a<z> aVar, Context context, Long l2) {
        String a2 = bn.a(com.ss.android.ugc.aweme.port.in.g.a().A().c());
        l.b(a2, "");
        f119163a = a2;
        if (f119164b.getInt(a2, com.ss.android.ugc.aweme.question.a.FORUM_UNKNOWN.ordinal()) == com.ss.android.ugc.aweme.question.a.FORUM_OPEN.ordinal() || !(l2 == null || l2.longValue() == 0)) {
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (context != null) {
            c.a((com.bytedance.tux.dialog.b) a.C1094a.a(context).a(false).a(R.string.f6i).b(R.string.f6h), new a(aVar)).a().b().show();
        }
    }
}

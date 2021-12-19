package com.ss.android.ugc.aweme.q.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bl;
import h.f.b.l;
import j.a.a.f;

public abstract class a<T, VH extends RecyclerView.ViewHolder> extends j.a.a.c<T, VH> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f118915c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.q.a<T> f118916a;

    /* renamed from: b  reason: collision with root package name */
    public final bl f118917b;

    static {
        Covode.recordClassIndex(77248);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(77251);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public a(bl blVar) {
        this.f118917b = blVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.a$a  reason: collision with other inner class name */
    public class C3047a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f118918a;

        static {
            Covode.recordClassIndex(77249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3047a(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f118918a = aVar;
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.q.a.a.C3047a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C3047a f118919a;

                static {
                    Covode.recordClassIndex(77250);
                }

                {
                    this.f118919a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: com.ss.android.ugc.aweme.q.a<T> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (this.f118919a.getAdapterPosition() >= 0) {
                        f fVar = this.f118919a.f118918a.f158844e;
                        l.b(fVar, "");
                        Object obj = fVar.f158845b.get(this.f118919a.getAdapterPosition());
                        com.ss.android.ugc.aweme.q.a<T> aVar = this.f118919a.f118918a.f118916a;
                        if (aVar != 0) {
                            l.b(view, "");
                            aVar.a(view, obj);
                        }
                    }
                }
            });
        }
    }

    public class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f118923a;

        /* renamed from: b  reason: collision with root package name */
        private final String f118924b;

        static {
            Covode.recordClassIndex(77252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar, View view, String str) {
            super(view);
            l.d(view, "");
            l.d(str, "");
            this.f118923a = aVar;
            this.f118924b = str;
        }
    }
}

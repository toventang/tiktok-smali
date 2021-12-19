package com.ss.android.ugc.aweme.q.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import j.a.a.f;
import java.util.Objects;

public final class c extends com.ss.android.ugc.aweme.q.a.a<String, b> {

    /* renamed from: d  reason: collision with root package name */
    public a f118925d;

    public interface a {
        static {
            Covode.recordClassIndex(77258);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(77257);
    }

    public c(bl blVar) {
        super(blVar);
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a9i, viewGroup, false);
        l.b(a2, "");
        return new b(this, a2);
    }

    public final class b extends com.ss.android.ugc.aweme.q.a.a<String, b>.C3047a {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f118926b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f118927c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f118928d;

        static {
            Covode.recordClassIndex(77259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, View view) {
            super(cVar, view);
            l.d(view, "");
            this.f118928d = cVar;
            this.f118926b = (TextView) view.findViewById(R.id.bgf);
            ImageView imageView = (ImageView) view.findViewById(R.id.bge);
            this.f118927c = imageView;
            imageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.q.a.a.c.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f118929a;

                static {
                    Covode.recordClassIndex(77260);
                }

                {
                    this.f118929a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    f fVar = this.f118929a.f118928d.f158844e;
                    l.b(fVar, "");
                    Object obj = fVar.f158845b.get(this.f118929a.getAdapterPosition());
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    a aVar = this.f118929a.f118928d.f118925d;
                    if (aVar != null) {
                        aVar.a(str);
                    }
                }
            });
        }
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        b bVar = (b) viewHolder;
        String str = (String) obj;
        l.d(bVar, "");
        l.d(str, "");
        TextView textView = bVar.f118926b;
        l.b(textView, "");
        textView.setText(str);
    }
}

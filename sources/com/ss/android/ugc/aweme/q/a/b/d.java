package com.ss.android.ugc.aweme.q.a.b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.bl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class d extends com.ss.android.ugc.aweme.q.a.a<com.ss.android.ugc.aweme.api.model.a, b> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f118938d = new a((byte) 0);

    static {
        Covode.recordClassIndex(77269);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77270);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public d(bl blVar) {
        super(blVar);
    }

    public final class b extends com.ss.android.ugc.aweme.q.a.a<com.ss.android.ugc.aweme.api.model.a, b>.C3047a {

        /* renamed from: b  reason: collision with root package name */
        final TextView f118939b;

        /* renamed from: c  reason: collision with root package name */
        final TextView f118940c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f118941d;

        static {
            Covode.recordClassIndex(77271);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f118942a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.api.model.a f118943b;

            static {
                Covode.recordClassIndex(77272);
            }

            a(b bVar, com.ss.android.ugc.aweme.api.model.a aVar) {
                this.f118942a = bVar;
                this.f118943b = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                bl blVar = this.f118942a.f118941d.f118917b;
                if (blVar != null) {
                    blVar.a(this.f118943b.f66467e);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, View view) {
            super(dVar, view);
            l.d(view, "");
            this.f118941d = dVar;
            this.f118939b = (TextView) view.findViewById(R.id.fas);
            this.f118940c = (TextView) view.findViewById(R.id.fax);
        }
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a9f, viewGroup, false);
        l.b(a2, "");
        return new b(this, a2);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        String str;
        b bVar = (b) viewHolder;
        com.ss.android.ugc.aweme.api.model.a aVar = (com.ss.android.ugc.aweme.api.model.a) obj;
        l.d(bVar, "");
        l.d(aVar, "");
        l.d(aVar, "");
        TextView textView = bVar.f118940c;
        if (TextUtils.isEmpty(aVar.f66465c)) {
            str = textView.getContext().getString(R.string.anm);
        } else {
            str = aVar.f66465c;
        }
        textView.setText(str);
        TextView textView2 = bVar.f118939b;
        ArrayList<AnchorCell> arrayList = aVar.f66467e;
        int i2 = 0;
        if (arrayList == null || arrayList.size() <= 3) {
            i2 = 4;
        }
        textView2.setVisibility(i2);
        textView2.setOnClickListener(new b.a(bVar, aVar));
    }
}

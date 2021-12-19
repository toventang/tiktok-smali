package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.k.ax;
import com.ss.android.ugc.aweme.search.k.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import java.util.List;

public final class af extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f80319d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final TextView f80320a;

    /* renamed from: b  reason: collision with root package name */
    public f f80321b;

    /* renamed from: c  reason: collision with root package name */
    String f80322c;

    public interface b {
        static {
            Covode.recordClassIndex(50003);
        }

        void a(f fVar);
    }

    static {
        Covode.recordClassIndex(50000);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50002);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static String a(f fVar) {
        String a2 = ac.a.f91473a.a(fVar.getClusterList().get(0).getRequestId());
        l.b(a2, "");
        return a2;
    }

    private static String a(List<Music> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getMid()).append(",");
        }
        return p.a((CharSequence) sb, (CharSequence) ",").toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(View view, final b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        View findViewById = view.findViewById(R.id.f2p);
        l.b(findViewById, "");
        this.f80320a = (TextView) findViewById;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.af.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ af f80323a;

            static {
                Covode.recordClassIndex(50001);
            }

            {
                this.f80323a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && this.f80323a.f80321b != null) {
                    af afVar = this.f80323a;
                    f fVar = afVar.f80321b;
                    if (fVar == null) {
                        l.b();
                    }
                    afVar.a("matched_sounds_click", fVar);
                    b bVar = bVar;
                    f fVar2 = this.f80323a.f80321b;
                    if (fVar2 == null) {
                        l.b();
                    }
                    bVar.a(fVar2);
                }
            }
        });
    }

    public final void a(String str, f fVar) {
        ((c) ((c) new ax(str).o("search_result")).b(this.f80322c).c("music_list", a(fVar.getClusterList()))).c(a(fVar)).f();
    }
}

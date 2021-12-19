package com.ss.android.ugc.aweme.feed.ui.masklayer2.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.helper.o;
import com.ss.android.ugc.aweme.feed.helper.t;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.g;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.i;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.m;
import com.ss.android.ugc.aweme.metrics.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f94948a = ((TextView) findViewById(R.id.dhy));

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f94949b;

    static {
        Covode.recordClassIndex(60221);
    }

    private View a() {
        if (this.f94949b == null) {
            this.f94949b = new SparseArray();
        }
        View view = (View) this.f94949b.get(R.id.ant);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.ant);
        this.f94949b.put(R.id.ant, findViewById);
        return findViewById;
    }

    public b(Context context) {
        super(context);
        MethodCollector.i(7607);
        View.inflate(getContext(), R.layout.sg, this);
        int b2 = (int) n.b(getContext(), 16.0f);
        setPadding(b2, 0, b2, 0);
        setOrientation(1);
        setBackgroundResource(R.drawable.sm);
        MethodCollector.o(7607);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n f94950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f94951b;

        static {
            Covode.recordClassIndex(60222);
        }

        a(com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n nVar, c cVar) {
            this.f94950a = nVar;
            this.f94951b = cVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n nVar = this.f94950a;
            if (nVar instanceof g) {
                g gVar = (g) nVar;
                if (gVar != null) {
                    l.b(view, "");
                    c cVar = this.f94951b;
                    l.d(view, "");
                    l.d(cVar, "");
                    d a2 = new d().a("enter_from", gVar.f94892a.f94866c);
                    Aweme aweme = gVar.f94892a.f94865b;
                    String str3 = null;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    d a3 = a2.a("group_id", str);
                    Aweme aweme2 = gVar.f94892a.f94865b;
                    if (aweme2 != null) {
                        str2 = aweme2.getAuthorUid();
                    } else {
                        str2 = null;
                    }
                    r.a("block_videos", a3.a("author_id", str2).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(gVar.f94892a.f94865b))).a("reason_id", cVar.f94952a).a("reason_text", cVar.f94953b).a("music_id", com.ss.android.ugc.aweme.metrics.ac.d(gVar.f94892a.f94865b)).a("enter_method", "long_press").a("click_method", "button").f66730a);
                    k f2 = new k().a(gVar.f94892a.f94866c).g(gVar.f94892a.f94865b);
                    f2.f109578a = com.ss.android.ugc.aweme.metrics.ac.e(gVar.f94892a.f94865b);
                    f2.f109579b = com.ss.android.ugc.aweme.metrics.ac.a(gVar.f94892a.f94865b);
                    f2.f109580c = "long_press";
                    f2.f109581d = com.ss.android.ugc.aweme.metrics.ac.b(gVar.f94892a.f94865b);
                    f2.f();
                    if (!TextUtils.isEmpty(gVar.f94892a.f94866c)) {
                        Aweme aweme3 = gVar.f94892a.f94865b;
                        if (aweme3 != null) {
                            str3 = aweme3.getAid();
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            Aweme aweme4 = gVar.f94892a.f94865b;
                            if (aweme4 == null) {
                                l.b();
                            }
                            String aid = aweme4.getAid();
                            l.b(aid, "");
                            t.a(new o(aid, 2, System.currentTimeMillis(), gVar.f94892a.f94866c));
                            Aweme aweme5 = gVar.f94892a.f94865b;
                            if (aweme5 == null) {
                                l.b();
                            }
                            String aid2 = aweme5.getAid();
                            l.b(aid2, "");
                            t.a(new o(aid2, 3, System.currentTimeMillis(), gVar.f94892a.f94866c));
                        }
                    }
                    i iVar = new i();
                    iVar.a(new h());
                    iVar.a_(gVar);
                    iVar.a(gVar.f94892a.f94865b, cVar.f94952a);
                    gVar.f94893b.dismiss();
                }
            } else if ((nVar instanceof m) && nVar != null) {
                l.b(view, "");
                nVar.b(view);
            }
        }
    }

    private void a(c cVar, com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n nVar) {
        l.d(cVar, "");
        TextView textView = this.f94948a;
        if (textView != null) {
            String str = cVar.f94953b;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        setOnClickListener(new a(nVar, cVar));
    }

    public final void a(c cVar, com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n nVar, boolean z) {
        l.d(cVar, "");
        a(cVar, nVar);
        if (z) {
            View a2 = a();
            l.b(a2, "");
            a2.setVisibility(4);
            return;
        }
        View a3 = a();
        l.b(a3, "");
        a3.setVisibility(0);
    }
}

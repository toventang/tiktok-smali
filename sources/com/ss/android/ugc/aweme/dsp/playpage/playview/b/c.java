package com.ss.android.ugc.aweme.dsp.playpage.playview.b;

import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.i.c;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.playpage.base.b;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.n.e;
import com.ss.android.ugc.aweme.feed.x.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class c implements s<ag>, e, i, j {

    /* renamed from: a  reason: collision with root package name */
    public b f83828a;

    /* renamed from: b  reason: collision with root package name */
    public int f83829b = -1;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playerservice.b.c f83830c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.e f83831d;

    /* renamed from: e  reason: collision with root package name */
    public final View f83832e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f83833f;

    static {
        Covode.recordClassIndex(52279);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.i.s
    public final /* bridge */ /* synthetic */ void a(ag agVar) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(46, new g(c.class, "onComment", com.ss.android.ugc.aweme.dsp.playpage.a.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f83835a;

        static {
            Covode.recordClassIndex(52281);
        }

        a(c cVar) {
            this.f83835a = cVar;
        }

        public final void run() {
            this.f83835a.a();
        }
    }

    public final void a() {
        long j2;
        DspStruct c2;
        Aweme aweme;
        AwemeStatistics statistics;
        TextView textView = this.f83833f;
        if (textView != null) {
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83830c;
            if (cVar == null || (c2 = cVar.c()) == null || (aweme = c2.getAweme()) == null || (statistics = aweme.getStatistics()) == null) {
                j2 = 0;
            } else {
                j2 = statistics.getCommentCount();
            }
            textView.setText(String.valueOf(j2));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.e
    public final String a_(boolean z) {
        com.ss.android.ugc.aweme.dsp.playpage.model.g n;
        String str;
        b bVar = this.f83828a;
        if (bVar == null || (n = bVar.n()) == null || (str = n.f83747a) == null) {
            return "";
        }
        return str;
    }

    @r
    public final void onComment(com.ss.android.ugc.aweme.dsp.playpage.a.b bVar) {
        l.d(bVar, "");
        TextView textView = this.f83833f;
        if (textView != null) {
            textView.post(new a(this));
        }
    }

    public c(View view) {
        l.d(view, "");
        this.f83832e = view;
        View findViewById = view.findViewById(R.id.aao);
        findViewById.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.dsp.playpage.playview.b.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f83834a;

            static {
                Covode.recordClassIndex(52280);
            }

            {
                this.f83834a = r1;
            }

            public final void onClick(View view) {
                Aweme aweme;
                DspStruct c2;
                ClickAgent.onClick(view);
                c cVar = this.f83834a;
                com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = cVar.f83830c;
                if (cVar2 == null || (c2 = cVar2.c()) == null) {
                    aweme = null;
                } else {
                    aweme = c2.getAweme();
                }
                c.a aVar = new c.a(m.c(aweme));
                aVar.f72005f = "click_comment_icon";
                com.ss.android.ugc.aweme.feed.e eVar = cVar.f83831d;
                if (eVar instanceof com.ss.android.ugc.aweme.comment.f.b) {
                    ((com.ss.android.ugc.aweme.comment.f.b) eVar).a(aVar.a());
                }
            }
        });
        if (!com.ss.android.ugc.aweme.dsp.experiment.b.a().getEnableComment()) {
            l.b(findViewById, "");
            findViewById.setVisibility(8);
        }
        this.f83833f = (TextView) findViewById.findViewById(R.id.a_2);
        com.ss.android.ugc.aweme.cp.c cVar = new com.ss.android.ugc.aweme.cp.c();
        cVar.f78251a = findViewById;
        cVar.f78252b = findViewById.findViewById(R.id.a_0);
        cVar.f78254d = this.f83833f;
        cVar.f78253c = findViewById.findViewById(R.id.a_h);
        cVar.c();
    }
}

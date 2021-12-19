package com.ss.android.ugc.aweme.feed.ui.masklayer2.layout;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public e f94960g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f94961h;

    static {
        Covode.recordClassIndex(60227);
    }

    public f(Context context) {
        super(context);
        MethodCollector.i(7785);
        View.inflate(getContext(), R.layout.si, this);
        View findViewById = findViewById(R.id.bu7);
        l.b(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        this.f94961h = imageView;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f94962a;

            static {
                Covode.recordClassIndex(60228);
            }

            {
                this.f94962a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                e eVar = this.f94962a.f94960g;
                if (eVar != null) {
                    l.b(view, "");
                    eVar.b(view);
                }
            }
        });
        setOnClickListener(AnonymousClass2.f94963a);
        MethodCollector.o(7785);
    }
}

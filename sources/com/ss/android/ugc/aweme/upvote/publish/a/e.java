package com.ss.android.ugc.aweme.upvote.publish.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends ConstraintLayout {
    static {
        Covode.recordClassIndex(93046);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f142287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142288b;

        static {
            Covode.recordClassIndex(93047);
        }

        a(String str, h.f.a.a aVar) {
            this.f142287a = str;
            this.f142288b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a aVar = this.f142288b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f142289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142290b;

        static {
            Covode.recordClassIndex(93048);
        }

        b(String str, h.f.a.a aVar) {
            this.f142289a = str;
            this.f142290b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a aVar = this.f142290b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e(Context context) {
        super(context, null, 0);
        l.d(context, "");
        com.a.a(LayoutInflater.from(context), R.layout.bic, this, true);
    }

    public final void setMessage(String str) {
        l.d(str, "");
        View findViewById = findViewById(R.id.f2q);
        l.b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    public final void setTitle(String str) {
        l.d(str, "");
        View findViewById = findViewById(R.id.f9l);
        l.b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    public /* synthetic */ e(Context context, byte b2) {
        this(context);
    }
}

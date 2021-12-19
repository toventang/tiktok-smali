package com.ss.android.ugc.aweme.profile.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ProfileLiveEventView extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    private static final a f117310d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f117311a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f117312b;

    /* renamed from: c  reason: collision with root package name */
    private SmartImageView f117313c;

    public interface b {
        static {
            Covode.recordClassIndex(75814);
        }

        void a(LiveEventStruct liveEventStruct);
    }

    static {
        Covode.recordClassIndex(75812);
    }

    public ProfileLiveEventView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    static final class a {
        static {
            Covode.recordClassIndex(75813);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f117314a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveEventStruct f117315b;

        static {
            Covode.recordClassIndex(75815);
        }

        public c(b bVar, LiveEventStruct liveEventStruct) {
            this.f117314a = bVar;
            this.f117315b = liveEventStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117314a.a(this.f117315b);
        }
    }

    private /* synthetic */ ProfileLiveEventView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProfileLiveEventView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9481);
        View.inflate(context, R.layout.aov, this);
        View findViewById = findViewById(R.id.d_p);
        l.b(findViewById, "");
        this.f117311a = findViewById;
        View findViewById2 = findViewById(R.id.d_o);
        l.b(findViewById2, "");
        this.f117313c = (SmartImageView) findViewById2;
        View findViewById3 = findViewById(R.id.d_q);
        l.b(findViewById3, "");
        this.f117312b = (TextView) findViewById3;
        MethodCollector.o(9481);
    }
}

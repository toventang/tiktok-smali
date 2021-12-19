package com.ss.android.ugc.aweme.profile.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class DonationLinkView extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final int f117304c = R.color.bh;

    /* renamed from: d  reason: collision with root package name */
    public static final a f117305d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f117306a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f117307b;

    public interface b {
        static {
            Covode.recordClassIndex(75810);
        }

        void a(int i2);
    }

    public DonationLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75809);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(75808);
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f117308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileNgoStruct f117309b;

        static {
            Covode.recordClassIndex(75811);
        }

        public c(b bVar, ProfileNgoStruct profileNgoStruct) {
            this.f117308a = bVar;
            this.f117309b = profileNgoStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117308a.a(this.f117309b.getId());
        }
    }

    private /* synthetic */ DonationLinkView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DonationLinkView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9641);
        View.inflate(context, R.layout.aol, this);
        View findViewById = findViewById(R.id.ao7);
        l.b(findViewById, "");
        this.f117306a = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.ao8);
        l.b(findViewById2, "");
        this.f117307b = (TextView) findViewById2;
        MethodCollector.o(9641);
    }
}

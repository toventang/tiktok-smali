package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxRadio;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: d  reason: collision with root package name */
    public static final a f100847d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f100848a;

    /* renamed from: b  reason: collision with root package name */
    SmartImageView f100849b;

    /* renamed from: c  reason: collision with root package name */
    TuxRadio f100850c;

    public interface b {
        static {
            Covode.recordClassIndex(64517);
        }

        void a();

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(64515);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64516);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC2497c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f100851a;

        static {
            Covode.recordClassIndex(64518);
        }

        View$OnClickListenerC2497c(c cVar) {
            this.f100851a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b bVar = this.f100851a.f100848a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
    }

    public final void a(boolean z) {
        View findViewById = this.itemView.findViewById(R.id.dgn);
        l.b(findViewById, "");
        TuxRadio tuxRadio = (TuxRadio) findViewById;
        this.f100850c = tuxRadio;
        if (tuxRadio == null) {
            l.a("radioButton");
        }
        tuxRadio.setOnCheckedChangeListener(null);
        TuxRadio tuxRadio2 = this.f100850c;
        if (tuxRadio2 == null) {
            l.a("radioButton");
        }
        tuxRadio2.setChecked(z);
        TuxRadio tuxRadio3 = this.f100850c;
        if (tuxRadio3 == null) {
            l.a("radioButton");
        }
        tuxRadio3.setOnCheckedChangeListener(new d(this));
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f100852a;

        static {
            Covode.recordClassIndex(64519);
        }

        d(c cVar) {
            this.f100852a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            b bVar = this.f100852a.f100848a;
            if (bVar != null) {
                bVar.a(z);
            }
        }
    }
}

package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class bq extends Dialog {

    /* renamed from: d  reason: collision with root package name */
    public static final a f15981d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f15982a;

    /* renamed from: b  reason: collision with root package name */
    public String f15983b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f15984c = "";

    /* renamed from: e  reason: collision with root package name */
    private final h.h f15985e = i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f15986f = i.a((h.f.a.a) new h(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f15987g = i.a((h.f.a.a) new g(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f15988h = i.a((h.f.a.a) new f(this));

    public interface b {
        static {
            Covode.recordClassIndex(8843);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(8841);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8842);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
    }

    static final class c extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ bq this$0;

        static {
            Covode.recordClassIndex(8844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(bq bqVar) {
            super(0);
            this.this$0 = bqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.ewf);
        }
    }

    static final class f extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ bq this$0;

        static {
            Covode.recordClassIndex(8847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(bq bqVar) {
            super(0);
            this.this$0 = bqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f8c);
        }
    }

    static final class g extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ bq this$0;

        static {
            Covode.recordClassIndex(8848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(bq bqVar) {
            super(0);
            this.this$0 = bqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f9l);
        }
    }

    static final class h extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ bq this$0;

        static {
            Covode.recordClassIndex(8849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(bq bqVar) {
            super(0);
            this.this$0 = bqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f_l);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bq f15989a;

        static {
            Covode.recordClassIndex(8845);
        }

        d(bq bqVar) {
            this.f15989a = bqVar;
        }

        public final void onClick(View view) {
            this.f15989a.dismiss();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bq f15990a;

        static {
            Covode.recordClassIndex(8846);
        }

        e(bq bqVar) {
            this.f15990a = bqVar;
        }

        public final void onClick(View view) {
            this.f15990a.dismiss();
            b bVar = this.f15990a.f15982a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bq(Context context) {
        super(context);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setGravity(17);
        }
        setCanceledOnTouchOutside(false);
        super.onCreate(bundle);
        setContentView(R.layout.b7b);
        ((LiveTextView) this.f15985e.getValue()).setOnClickListener(new d(this));
        ((LiveTextView) this.f15986f.getValue()).setOnClickListener(new e(this));
        LiveTextView liveTextView = (LiveTextView) this.f15987g.getValue();
        l.b(liveTextView, "");
        liveTextView.setText(this.f15983b);
        LiveTextView liveTextView2 = (LiveTextView) this.f15988h.getValue();
        l.b(liveTextView2, "");
        liveTextView2.setText(this.f15984c);
    }
}

package com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.utils.h;
import com.bytedance.android.livesdk.widget.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class MultiLiveAnchorOpenCameraDialog extends g implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f11691c = new a((byte) 0);
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11692a;

    /* renamed from: b  reason: collision with root package name */
    public Context f11693b;

    /* renamed from: d  reason: collision with root package name */
    private f.a.b.b f11694d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11695e;

    /* renamed from: f  reason: collision with root package name */
    private DataChannel f11696f;

    /* renamed from: g  reason: collision with root package name */
    private m f11697g;

    /* renamed from: h  reason: collision with root package name */
    private String f11698h;

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f11701a = new c();

        static {
            Covode.recordClassIndex(6370);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(6366);
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public final int b() {
        return R.layout.b7k;
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        this.f11695e = true;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6367);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        c();
        dismiss();
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        if (this.f11695e) {
            a();
        }
        this.f11695e = false;
    }

    public final void show() {
        WindowManager.LayoutParams layoutParams;
        super.show();
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
            if (layoutParams != null) {
                layoutParams.dimAmount = 0.0f;
            }
        } else {
            layoutParams = null;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
    }

    private final void c() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11692a;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        aVar.f11294d = true;
        com.bytedance.android.livesdk.an.a.a().a(new r(40));
        DataChannel dataChannel = this.f11696f;
        if (dataChannel != null) {
            dataChannel.c(com.bytedance.android.live.liveinteract.multilive.c.c.class, true);
        }
    }

    public final void dismiss() {
        super.dismiss();
        DataChannel dataChannel = this.f11696f;
        if (dataChannel != null) {
            dataChannel.c(com.bytedance.android.live.liveinteract.multilive.anchor.b.a.class, new com.bytedance.android.live.liveinteract.multilive.anchor.b.d(false, this.f11698h));
        }
        f.a.b.b bVar = this.f11694d;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f11697g.getLifecycle().b(this);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiLiveAnchorOpenCameraDialog f11702a;

        static {
            Covode.recordClassIndex(6371);
        }

        d(MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog) {
            this.f11702a = multiLiveAnchorOpenCameraDialog;
        }

        public final void onClick(View view) {
            this.f11702a.a();
            com.bytedance.android.live.liveinteract.multilive.b.a.a("on", "floating_page", 1);
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiLiveAnchorOpenCameraDialog f11699a;

        static {
            Covode.recordClassIndex(6368);
        }

        b(MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog) {
            this.f11699a = multiLiveAnchorOpenCameraDialog;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = 5 - ((Number) obj).longValue();
            LiveButton liveButton = (LiveButton) this.f11699a.findViewById(R.id.czf);
            l.b(liveButton, "");
            liveButton.setText(h.a(y.a((int) R.string.eh8), Long.valueOf(longValue)));
            if (longValue == 0) {
                ((LiveButton) this.f11699a.findViewById(R.id.czf)).post(new Runnable(this) {
                    /* class com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f11700a;

                    static {
                        Covode.recordClassIndex(6369);
                    }

                    {
                        this.f11700a = r1;
                    }

                    public final void run() {
                        this.f11700a.f11699a.a();
                        com.bytedance.android.live.liveinteract.multilive.b.a.a("on", "time_out", 1);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11697g.getLifecycle().a(this);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        DataChannel dataChannel = this.f11696f;
        if (dataChannel != null) {
            dataChannel.c(com.bytedance.android.live.liveinteract.multilive.anchor.b.a.class, new com.bytedance.android.live.liveinteract.multilive.anchor.b.d(true, this.f11698h));
        }
        this.f11694d = com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b(6).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), c.f11701a);
        ((LiveButton) findViewById(R.id.czf)).setOnClickListener(new d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLiveAnchorOpenCameraDialog(Context context, DataChannel dataChannel, m mVar, String str) {
        super(context);
        l.d(context, "");
        l.d(mVar, "");
        l.d(str, "");
        this.f11693b = context;
        this.f11696f = dataChannel;
        this.f11697g = mVar;
        this.f11698h = str;
        e.f10014a.a(this);
    }
}

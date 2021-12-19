package com.ss.android.ugc.aweme.bullet.views;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends h implements c, i, j {

    /* renamed from: d  reason: collision with root package name */
    public static final b f69553d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f69554a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f69555b;

    /* renamed from: c  reason: collision with root package name */
    public int f69556c;

    /* renamed from: e  reason: collision with root package name */
    private final String f69557e;

    /* renamed from: f  reason: collision with root package name */
    private final String f69558f;

    /* renamed from: g  reason: collision with root package name */
    private final int f69559g;

    static {
        Covode.recordClassIndex(42899);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(393, new g(a.class, "onCloseBulletBottomDialogEvent", com.ss.android.ugc.aweme.bullet.c.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(42901);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f69564a;

        static {
            Covode.recordClassIndex(42903);
        }

        d(a aVar) {
            this.f69564a = aVar;
        }

        public final void run() {
            a.super.show();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.views.c
    public final void dismiss() {
        BulletContainerView bulletContainerView;
        super.dismiss();
        View view = this.f69554a;
        if (!(view == null || (bulletContainerView = (BulletContainerView) view.findViewById(R.id.a0n)) == null)) {
            bulletContainerView.a();
        }
        this.f69554a = null;
        EventBus.a().b(this);
    }

    @r
    public final void onCloseBulletBottomDialogEvent(com.ss.android.ugc.aweme.bullet.c.b bVar) {
        l.d(bVar, "");
        dismiss();
    }

    @Override // com.ss.android.ugc.aweme.bullet.views.c
    public final void onEvent(p pVar) {
        l.d(pVar, "");
        com.bytedance.ies.bullet.c.c.i iVar = this.f69555b;
        if (iVar != null) {
            iVar.onEvent(pVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.views.c
    public final void a(Activity activity) {
        l.d(activity, "");
        if (!activity.isFinishing()) {
            EventBus.a(EventBus.a(), this);
            if (this.f69556c > 0) {
                new Handler().postDelayed(new d(this), (long) this.f69556c);
            } else {
                super.show();
            }
        }
    }

    @Override // androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View view = this.f69554a;
        if (view != null) {
            setContentView(view);
        }
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            int i2 = this.f69559g;
            if (i2 > 0) {
                attributes.height = i2;
            } else {
                attributes.height = -2;
            }
            window.setAttributes(attributes);
            window.setGravity(80);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setBackgroundDrawableResource(R.color.c9);
            window.setWindowAnimations(R.style.f3);
        }
        setOnKeyListener(new c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$a  reason: collision with other inner class name */
    public static final class C1573a implements h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f69560a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f69561b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f69562c;

        static {
            Covode.recordClassIndex(42900);
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri) {
            l.d(uri, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri, Throwable th) {
            l.d(uri, "");
            l.d(th, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
            l.d(iVar, "");
            l.d(uri, "");
            l.d(qVar, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
            l.d(list, "");
            l.d(uri, "");
            l.d(iVar, "");
        }

        C1573a(View view, a aVar, Context context) {
            this.f69560a = view;
            this.f69561b = aVar;
            this.f69562c = context;
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            l.d(view, "");
            l.d(uri, "");
            l.d(iVar, "");
            this.f69561b.f69555b = iVar;
        }
    }

    static final class c implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f69563a;

        static {
            Covode.recordClassIndex(42902);
        }

        c(a aVar) {
            this.f69563a = aVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            l.b(keyEvent, "");
            if (keyEvent.getAction() != 1) {
                return false;
            }
            this.f69563a.dismiss();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, String str2, int i2) {
        super(context, 0);
        l.d(context, "");
        l.d(str, "");
        MethodCollector.i(5764);
        this.f69557e = str;
        this.f69558f = str2;
        this.f69559g = i2;
        View inflate = View.inflate(context, R.layout.m5, null);
        this.f69554a = inflate;
        if (inflate != null) {
            ((BulletContainerView) inflate.findViewById(R.id.a0n)).a(BulletService.f().a());
            ((BulletContainerView) inflate.findViewById(R.id.a0n)).a(BulletService.f().a(context), 17, 0, 0, 0, 0);
            Bundle bundle = new Bundle();
            bundle.putString("initial_data", str2);
            ((BulletContainerView) inflate.findViewById(R.id.a0n)).a(com.ss.android.ugc.aweme.bullet.utils.c.a(str), bundle, new C1573a(inflate, this, context));
            MethodCollector.o(5764);
            return;
        }
        MethodCollector.o(5764);
    }
}

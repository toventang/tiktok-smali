package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.h;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.facebook.drawee.f.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.d.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.af;
import com.ss.android.ugc.aweme.im.sdk.share.b.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.reflect.Field;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public final a.AbstractC2624a f102570a;

    /* renamed from: b  reason: collision with root package name */
    public final a.AbstractC2624a f102571b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f102572c;

    /* renamed from: d  reason: collision with root package name */
    public EditText f102573d;

    /* renamed from: e  reason: collision with root package name */
    public SharePackage f102574e;

    /* renamed from: f  reason: collision with root package name */
    public Context f102575f;

    /* renamed from: g  reason: collision with root package name */
    private final IMUser[] f102576g;

    /* renamed from: h  reason: collision with root package name */
    private final IMContact[] f102577h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteImageView f102578i;

    /* renamed from: j  reason: collision with root package name */
    private ViewGroup f102579j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f102580k;

    /* renamed from: l  reason: collision with root package name */
    private Button f102581l;

    /* renamed from: m  reason: collision with root package name */
    private Button f102582m;
    private View n;
    private String o;

    static {
        Covode.recordClassIndex(65686);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a$a  reason: collision with other inner class name */
    public static class C2579a {

        /* renamed from: a  reason: collision with root package name */
        public Context f102587a;

        /* renamed from: b  reason: collision with root package name */
        public IMContact[] f102588b;

        /* renamed from: c  reason: collision with root package name */
        public IMUser[] f102589c;

        /* renamed from: d  reason: collision with root package name */
        public SharePackage f102590d;

        /* renamed from: e  reason: collision with root package name */
        public a.AbstractC2624a f102591e;

        /* renamed from: f  reason: collision with root package name */
        public a.AbstractC2624a f102592f;

        /* renamed from: g  reason: collision with root package name */
        public String f102593g;

        /* renamed from: h  reason: collision with root package name */
        private int f102594h;

        /* renamed from: i  reason: collision with root package name */
        private int f102595i;

        static {
            Covode.recordClassIndex(65691);
        }

        public final a c() {
            return new a(this, (byte) 0);
        }

        public final C2579a a() {
            this.f102594h = b.a(this.f102587a, 416.0f);
            return this;
        }

        public final C2579a b() {
            this.f102595i = b.a(this.f102587a, 335.0f);
            return this;
        }

        public C2579a(Context context) {
            this.f102587a = context;
        }

        public final C2579a a(String str) {
            if (str == null) {
                str = "";
            }
            this.f102593g = str;
            return this;
        }

        public final C2579a a(IMContact[] iMContactArr) {
            this.f102588b = iMContactArr;
            this.f102589c = null;
            return this;
        }
    }

    public final void cancel() {
        b();
        super.cancel();
    }

    public final void dismiss() {
        b();
        super.dismiss();
    }

    private void b() {
        InputMethodManager inputMethodManager = (InputMethodManager) a(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f102573d.getWindowToken(), 0);
        }
    }

    private static void a(RemoteImageView remoteImageView) {
        e eVar = ((com.facebook.drawee.f.a) remoteImageView.getHierarchy()).f47454a;
        if (eVar != null) {
            eVar.f47476b = true;
            ((com.facebook.drawee.f.a) remoteImageView.getHierarchy()).a(eVar);
        }
    }

    private a(C2579a aVar) {
        super(aVar.f102587a, R.style.yr);
        this.f102575f = aVar.f102587a;
        this.f102576g = aVar.f102589c;
        this.f102577h = aVar.f102588b;
        this.f102574e = aVar.f102590d;
        this.f102570a = aVar.f102591e;
        this.f102571b = aVar.f102592f;
        this.o = aVar.f102593g;
    }

    private <T extends IMContact> void a(T[] tArr) {
        MethodCollector.i(7940);
        this.f102579j.removeAllViews();
        if (tArr.length == 1) {
            this.f102580k.setText(R.string.ci4);
            this.f102582m.setText(R.string.ci1);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a8s, (ViewGroup) null);
            inflate.findViewById(R.id.fez);
            TextView textView = (TextView) inflate.findViewById(R.id.fdm);
            T t = tArr[0];
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a((RemoteImageView) inflate.findViewById(R.id.pd), t.getDisplayAvatar());
            if (t instanceof IMUser) {
                textView.setText(t.getDisplayName());
                IMUser iMUser = (IMUser) t;
                io.a(getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), textView);
            } else {
                textView.setText(t.getDisplayName());
                io.a(getContext(), "", "", textView);
            }
            this.f102579j.addView(inflate);
            MethodCollector.o(7940);
            return;
        }
        this.f102580k.setText(R.string.cg7);
        int length = tArr.length;
        for (T t2 : tArr) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.a8r, (ViewGroup) null);
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a((RemoteImageView) inflate2.findViewById(R.id.pd), t2.getDisplayAvatar());
            a((TuxIconView) inflate2.findViewById(R.id.fez), t2);
            this.f102579j.addView(inflate2);
        }
        this.f102582m.setText(((Object) getContext().getResources().getText(R.string.ci1)) + "(" + length + ")");
        MethodCollector.o(7940);
    }

    @Override // androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(7734);
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        View inflate = LayoutInflater.from(this.f102575f).inflate(R.layout.a4l, (ViewGroup) null);
        this.n = inflate;
        setContentView(inflate);
        setCancelable(false);
        this.f102580k = (TextView) findViewById(R.id.dyr);
        this.f102579j = (ViewGroup) findViewById(R.id.fdk);
        this.f102578i = (RemoteImageView) findViewById(R.id.e0w);
        this.f102572c = (TextView) findViewById(R.id.e27);
        EditText editText = (EditText) findViewById(R.id.asr);
        this.f102573d = editText;
        editText.setText(this.o);
        EditText editText2 = this.f102573d;
        editText2.setSelection(editText2.getText().length());
        this.f102581l = (Button) findViewById(R.id.e0l);
        this.f102582m = (Button) findViewById(R.id.e0r);
        ae.a(this.f102581l);
        ae.a(this.f102582m);
        this.f102581l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(65687);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (a.this.f102570a != null) {
                    a.this.f102570a.a(a.this.f102573d.getText().toString());
                }
                a.this.dismiss();
            }
        });
        this.f102582m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(65688);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (a.this.f102571b == null) {
                    return;
                }
                if (a.this.f102573d.getText().length() > 6000) {
                    new com.bytedance.tux.g.b(view).a(d.a().getResources().getString(R.string.cfv)).b();
                    return;
                }
                a.this.f102571b.a(a.this.f102573d.getText().toString());
                a.this.dismiss();
            }
        });
        if (TextUtils.equals("live_event", this.f102574e.f124590d)) {
            String string = this.f102574e.f124595i.getString("live_event_title");
            if (!TextUtils.isEmpty(string)) {
                this.f102572c.setText(d.a().getResources().getString(R.string.bpm, string));
                this.f102572c.setVisibility(0);
            }
            this.f102578i.setVisibility(8);
        } else if (TextUtils.equals("text", this.f102574e.f124590d)) {
            String string2 = this.f102574e.f124595i.getString("share_text");
            this.f102572c.setText(string2);
            this.f102578i.setVisibility(8);
            this.f102572c.setVisibility(0);
            if (string2 != null && string2.length() <= 1024) {
                com.ss.android.ugc.aweme.emoji.i.b.b.a(this.f102572c);
            }
        } else if (TextUtils.equals(UGCMonitor.EVENT_COMMENT, this.f102574e.f124590d)) {
            this.f102578i.setVisibility(0);
            this.f102572c.setVisibility(0);
            this.f102572c.setText(CommentSharePackage.a(this.f102575f, this.f102574e.f124595i.getString("comment_author_name", ""), this.f102574e.f124595i.getString("comment_reply_user_name", ""), this.f102574e.f124595i.getString("comment_text", ""), BitmapFactory.decodeResource(this.f102575f.getResources(), 2131232780), (int) n.b(this.f102575f, 16.0f)));
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a((UrlModel) this.f102574e.f124595i.getSerializable("comment_author_avatar_url")));
            a2.f39906b = this.f102575f;
            a2.a("ImShareDialog").a(new com.bytedance.lighten.a.c.e() {
                /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(65689);
                }

                @Override // com.bytedance.lighten.a.c.n
                public final void a(Throwable th) {
                }

                @Override // com.bytedance.lighten.a.c.n
                public final void a(Bitmap bitmap) {
                    if (bitmap != null) {
                        a.this.f102572c.setText(CommentSharePackage.a(a.this.f102575f, a.this.f102574e.f124595i.getString("comment_author_name", ""), a.this.f102574e.f124595i.getString("comment_reply_user_name", ""), a.this.f102574e.f124595i.getString("comment_text", ""), bitmap, (int) n.b(a.this.f102575f, 16.0f)));
                    }
                }
            });
            a(this.f102578i, this.f102574e, (Boolean) true);
        } else {
            this.f102578i.setVisibility(0);
            this.f102572c.setVisibility(8);
            a(this.f102578i, this.f102574e, (Boolean) true);
        }
        this.f102573d.setFilters(new InputFilter[]{new ad(this.f102573d)});
        this.f102573d.setOnKeyListener(new View.OnKeyListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(65690);
            }

            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return i2 == 66;
            }
        });
        IMUser[] iMUserArr = this.f102576g;
        if (iMUserArr != null && iMUserArr.length > 0) {
            a(iMUserArr);
        }
        IMContact[] iMContactArr = this.f102577h;
        if (iMContactArr == null || iMContactArr.length <= 0) {
            MethodCollector.o(7734);
            return;
        }
        a(iMContactArr);
        MethodCollector.o(7734);
    }

    /* synthetic */ a(C2579a aVar, byte b2) {
        this(aVar);
    }

    private static <T extends IMContact> void a(TuxIconView tuxIconView, T t) {
        af.a(tuxIconView, f.a(t));
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8147);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8147);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static void a(RemoteImageView remoteImageView, Serializable serializable, int i2) {
        if (serializable instanceof UrlModel) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView, (UrlModel) serializable);
        } else {
            com.ss.android.ugc.aweme.base.e.a(remoteImageView, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        if (r4.equals("aweme") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0135, code lost:
        if (r4.equals("web") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01fc, code lost:
        if (r4.equals("search") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0204, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0206, code lost:
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020b, code lost:
        com.ss.android.ugc.aweme.base.e.a(r8, 2131232869);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0219, code lost:
        if (r4.equals("story_video") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021d, code lost:
        a(r8, r2, (int) com.zhiliaoapp.musically.R.color.v);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0237 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.ss.android.ugc.aweme.base.ui.RemoteImageView r8, com.ss.android.ugc.aweme.sharer.ui.SharePackage r9, java.lang.Boolean r10) {
        /*
        // Method dump skipped, instructions count: 630
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.sharer.ui.SharePackage, java.lang.Boolean):boolean");
    }
}

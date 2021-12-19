package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a;

import android.content.ClipboardManager;
import android.content.Context;
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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.h;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.common.f.e;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.model.h f100958a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2506a f100959b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC2506a f100960c;

    /* renamed from: d  reason: collision with root package name */
    public EditText f100961d;

    /* renamed from: e  reason: collision with root package name */
    private View f100962e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f100963f;

    /* renamed from: g  reason: collision with root package name */
    private AvatarImageView f100964g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f100965h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f100966i;

    /* renamed from: j  reason: collision with root package name */
    private Button f100967j;

    /* renamed from: k  reason: collision with root package name */
    private Button f100968k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a$a  reason: collision with other inner class name */
    public interface AbstractC2506a {
        static {
            Covode.recordClassIndex(64586);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(64582);
    }

    public final void cancel() {
        b();
        super.cancel();
    }

    public final void dismiss() {
        b();
        super.dismiss();
    }

    public final void show() {
        super.show();
        e.a(this.f100961d);
    }

    private void b() {
        InputMethodManager inputMethodManager = (InputMethodManager) a(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f100961d.getWindowToken(), 0);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Context f100972a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.android.ugc.aweme.im.service.model.h f100973b;

        /* renamed from: c  reason: collision with root package name */
        public AbstractC2506a f100974c;

        /* renamed from: d  reason: collision with root package name */
        public AbstractC2506a f100975d;

        static {
            Covode.recordClassIndex(64587);
        }

        public b(Context context) {
            this.f100972a = context;
        }
    }

    private a(b bVar) {
        super(bVar.f100972a);
        this.f100958a = bVar.f100973b;
        this.f100959b = bVar.f100974c;
        this.f100960c = bVar.f100975d;
    }

    @Override // androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(4916);
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a4j, (ViewGroup) null);
        this.f100962e = inflate;
        setContentView(inflate);
        setCancelable(false);
        this.f100963f = (TextView) findViewById(R.id.a9n);
        this.f100964g = (AvatarImageView) findViewById(R.id.pd);
        this.f100965h = (ImageView) findViewById(R.id.fez);
        this.f100966i = (TextView) findViewById(R.id.fdm);
        this.f100961d = (EditText) findViewById(R.id.asr);
        this.f100967j = (Button) findViewById(R.id.e0l);
        this.f100968k = (Button) findViewById(R.id.e0r);
        IMUser iMUser = this.f100958a.f103903h;
        this.f100963f.setText(getContext().getResources().getString(R.string.cea, this.f100958a.f103902g));
        com.ss.android.ugc.aweme.base.e.a(this.f100964g, iMUser.getAvatarThumb());
        this.f100966i.setText(iMUser.getNickName());
        io.a(getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f100966i);
        ae.a(this.f100967j);
        ae.a(this.f100968k);
        this.f100967j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(64583);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (a.this.f100959b != null) {
                    a.this.f100959b.a(a.this.f100961d.getText().toString());
                }
                a.this.dismiss();
            }
        });
        this.f100968k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(64584);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (TextUtils.isEmpty(a.this.f100961d.getText().toString())) {
                    new com.bytedance.tux.g.b(a.this).e(R.string.cdv).b();
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.a.a.a(a.this.f100958a.f103900e);
                } else if (a.this.f100961d.getText().length() > 6000) {
                    new com.bytedance.tux.g.b(view).a(d.a().getResources().getString(R.string.cfv)).b();
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.a.a.a(a.this.f100958a.f103900e);
                } else {
                    com.ss.android.ugc.aweme.im.service.model.h hVar = a.this.f100958a;
                    a.b bVar = a.b.f100957a;
                    l.d(hVar, "");
                    l.d(bVar, "");
                    androidx.c.a aVar = new androidx.c.a();
                    String str = hVar.f103900e;
                    l.b(str, "");
                    aVar.put("enter_from", str);
                    String str2 = hVar.f103898c;
                    l.b(str2, "");
                    aVar.put("group_id", str2);
                    String str3 = hVar.f103897b;
                    l.b(str3, "");
                    aVar.put("comment_id", str3);
                    IMUser iMUser = hVar.f103903h;
                    l.b(iMUser, "");
                    String uid = iMUser.getUid();
                    l.b(uid, "");
                    aVar.put("to_user_id", uid);
                    String str4 = hVar.f103899d;
                    l.b(str4, "");
                    aVar.put("author_id", str4);
                    bVar.invoke("share_comment", aVar);
                    if (a.this.f100960c != null) {
                        a.this.f100960c.a(a.this.f100961d.getText().toString());
                    }
                    a.this.dismiss();
                }
            }
        });
        this.f100961d.setFilters(new InputFilter[]{new ad(this.f100961d)});
        this.f100961d.setOnKeyListener(new View.OnKeyListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(64585);
            }

            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return i2 == 66;
            }
        });
        MethodCollector.o(4916);
    }

    public /* synthetic */ a(b bVar, byte b2) {
        this(bVar);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4924);
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
                    MethodCollector.o(4924);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}

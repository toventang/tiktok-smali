package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.airbnb.epoxy.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.o;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ExtendedEditText;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import java.lang.reflect.Field;

public abstract class f extends t<b> {

    /* renamed from: l  reason: collision with root package name */
    public static final a f101675l = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public GroupChatDetailViewModel f101676h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.ies.im.core.api.b.b f101677i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b f101678j;

    /* renamed from: k  reason: collision with root package name */
    public int f101679k = -1;

    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f101680a = {new y(b.class, "avatarView", "getAvatarView()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new y(b.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new y(b.class, "editButton", "getEditButton()Landroid/widget/ImageView;", 0), new y(b.class, "memberCountView", "getMemberCountView()Landroid/widget/TextView;", 0), new y(b.class, "editContainer", "getEditContainer()Landroid/view/ViewGroup;", 0), new y(b.class, "editText", "getEditText()Lcom/ss/android/ugc/aweme/im/sdk/common/ui/widget/ExtendedEditText;", 0), new y(b.class, "editTextClearIcon", "getEditTextClearIcon()Landroid/widget/ImageView;", 0), new y(b.class, "editCheckProgressBar", "getEditCheckProgressBar()Landroid/widget/ProgressBar;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final h.h.d f101681b = a((int) R.id.bkt);

        /* renamed from: c  reason: collision with root package name */
        private final h.h.d f101682c = a((int) R.id.bkx);

        /* renamed from: d  reason: collision with root package name */
        private final h.h.d f101683d = a((int) R.id.bkz);

        /* renamed from: e  reason: collision with root package name */
        private final h.h.d f101684e = a((int) R.id.bkw);

        /* renamed from: f  reason: collision with root package name */
        private final h.h.d f101685f = a((int) R.id.bku);

        /* renamed from: h  reason: collision with root package name */
        private final h.h.d f101686h = a((int) R.id.bkv);

        /* renamed from: i  reason: collision with root package name */
        private final h.h.d f101687i = a((int) R.id.bl1);

        /* renamed from: j  reason: collision with root package name */
        private final h.h.d f101688j = a((int) R.id.bl0);

        static {
            Covode.recordClassIndex(65025);
        }

        public final TextView b() {
            return (TextView) this.f101682c.a(this, f101680a[1]);
        }

        public final ImageView c() {
            return (ImageView) this.f101683d.a(this, f101680a[2]);
        }

        public final TextView d() {
            return (TextView) this.f101684e.a(this, f101680a[3]);
        }

        public final ViewGroup e() {
            return (ViewGroup) this.f101685f.a(this, f101680a[4]);
        }

        public final ExtendedEditText f() {
            return (ExtendedEditText) this.f101686h.a(this, f101680a[5]);
        }

        public final ImageView g() {
            return (ImageView) this.f101687i.a(this, f101680a[6]);
        }

        public final ProgressBar h() {
            return (ProgressBar) this.f101688j.a(this, f101680a[7]);
        }
    }

    static {
        Covode.recordClassIndex(65023);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a89;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65024);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f101698a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f101699b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f101700c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b f101701d;

        static {
            Covode.recordClassIndex(65028);
        }

        e(f fVar, b bVar, h hVar, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2) {
            this.f101698a = fVar;
            this.f101699b = bVar;
            this.f101700c = hVar;
            this.f101701d = bVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101698a.f101676h;
            if (groupChatDetailViewModel != null) {
                groupChatDetailViewModel.a(StringSet.name);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f$f  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2530f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f101702a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f101703b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f101704c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b f101705d;

        static {
            Covode.recordClassIndex(65029);
        }

        View$OnClickListenerC2530f(f fVar, b bVar, h hVar, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2) {
            this.f101702a = fVar;
            this.f101703b = bVar;
            this.f101704c = hVar;
            this.f101705d = bVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101702a.f101676h;
            if (groupChatDetailViewModel != null) {
                groupChatDetailViewModel.a("button");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f101706a;

        static {
            Covode.recordClassIndex(65030);
        }

        g(b bVar) {
            this.f101706a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Editable text = this.f101706a.f().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    public void a(b bVar) {
        h c2;
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2;
        String str;
        String str2;
        l.d(bVar, "");
        com.bytedance.ies.im.core.api.b.b bVar3 = this.f101677i;
        if (bVar3 != null && (c2 = bVar3.c()) != null && (bVar2 = this.f101678j) != null) {
            Context context = bVar.a().getContext();
            String string = context.getString(R.string.c6u);
            l.b(string, "");
            int i2 = 0;
            e.a.a();
            com.ss.android.ugc.aweme.base.e.b((RemoteImageView) bVar.f101681b.a(bVar, b.f101680a[0]), com.ss.android.ugc.aweme.im.sdk.group.a.e.a(c2), -1, -1);
            String str3 = null;
            if (bVar2.f101530d.f101550d) {
                this.f101679k = 2;
                bVar.b().setVisibility(8);
                bVar.c().setVisibility(8);
                bVar.g().setVisibility(8);
                bVar.d().setVisibility(8);
                bVar.e().setVisibility(0);
                bVar.h().setVisibility(0);
                bVar.f().setEnabled(false);
                bVar.f().a();
                if (bVar2.f101530d.f101548b) {
                    ExtendedEditText f2 = bVar.f();
                    com.bytedance.im.core.d.i coreInfo = c2.getCoreInfo();
                    if (coreInfo != null) {
                        str3 = coreInfo.getName();
                    }
                    f2.setText(str3);
                    return;
                }
                bVar.f().setHint(string);
            } else if (bVar2.f101530d.f101549c) {
                this.f101679k = 1;
                bVar.b().setVisibility(8);
                bVar.c().setVisibility(8);
                bVar.d().setVisibility(8);
                bVar.e().setVisibility(0);
                bVar.h().setVisibility(8);
                bVar.f().setText("");
                bVar.f().setEnabled(true);
                bVar.g().setOnClickListener(new g(bVar));
                if (bVar2.f101530d.f101548b) {
                    ExtendedEditText f3 = bVar.f();
                    com.bytedance.im.core.d.i coreInfo2 = c2.getCoreInfo();
                    if (coreInfo2 != null) {
                        str2 = coreInfo2.getName();
                    } else {
                        str2 = null;
                    }
                    f3.setText(str2);
                    bVar.g().setVisibility(0);
                } else {
                    bVar.f().setHint(string);
                    bVar.g().setVisibility(8);
                }
                bVar.f().a();
                bVar.f().addTextChangedListener(new c(bVar, this, bVar, c2, bVar2));
                bVar.f().setOnEditorActionListener(new d(this, bVar, c2, bVar2));
                if (!bVar.f().hasFocus()) {
                    bVar.f().requestFocus();
                    Object a2 = a(context, "input_method");
                    if (a2 instanceof InputMethodManager) {
                        str3 = a2;
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) str3;
                    if (inputMethodManager != null) {
                        inputMethodManager.toggleSoftInput(1, 0);
                    }
                    ExtendedEditText f4 = bVar.f();
                    Editable text = bVar.f().getText();
                    if (text != null) {
                        i2 = text.length();
                    }
                    f4.setSelection(i2);
                }
            } else {
                this.f101679k = 0;
                bVar.b().setVisibility(0);
                bVar.c().setVisibility(0);
                bVar.d().setVisibility(0);
                bVar.e().setVisibility(8);
                bVar.h().setVisibility(8);
                bVar.f().setEnabled(false);
                if (bVar2.f101530d.f101548b) {
                    TextView b2 = bVar.b();
                    com.bytedance.im.core.d.i coreInfo3 = c2.getCoreInfo();
                    if (coreInfo3 != null) {
                        str = coreInfo3.getName();
                    } else {
                        str = null;
                    }
                    b2.setText(str);
                    bVar.b().setTextColor(androidx.core.content.b.c(context, R.color.bx));
                } else {
                    bVar.b().setText(string);
                    bVar.b().setTextColor(androidx.core.content.b.c(context, R.color.c5));
                }
                TextView d2 = bVar.d();
                l.b(context, "");
                Resources resources = context.getResources();
                if (resources != null) {
                    str3 = resources.getQuantityString(R.plurals.cy, c2.getMemberCount(), Integer.valueOf(c2.getMemberCount()));
                }
                d2.setText(str3);
                bVar.b().setOnClickListener(new e(this, bVar, c2, bVar2));
                bVar.c().setOnClickListener(new View$OnClickListenerC2530f(this, bVar, c2, bVar2));
                KeyboardUtils.c(bVar.f());
            }
        }
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f101694a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f101695b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f101696c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b f101697d;

        static {
            Covode.recordClassIndex(65027);
        }

        d(f fVar, b bVar, h hVar, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2) {
            this.f101694a = fVar;
            this.f101695b = bVar;
            this.f101696c = hVar;
            this.f101697d = bVar2;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 != 6) {
                return false;
            }
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101694a.f101676h;
            if (groupChatDetailViewModel != null) {
                groupChatDetailViewModel.d();
            }
            KeyboardUtils.c(textView);
            return true;
        }
    }

    public static final class c extends o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f101689a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f101690b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f101691c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f101692d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b f101693e;

        static {
            Covode.recordClassIndex(65026);
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            CharSequence charSequence2;
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101690b.f101676h;
            if (groupChatDetailViewModel != null) {
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence;
                }
                l.d(charSequence2, "");
                groupChatDetailViewModel.f101796b = charSequence2.toString();
            }
            if (charSequence == null || charSequence.length() <= 0) {
                this.f101689a.g().setVisibility(8);
            } else {
                this.f101689a.g().setVisibility(0);
            }
        }

        c(b bVar, f fVar, b bVar2, h hVar, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar3) {
            this.f101689a = bVar;
            this.f101690b = fVar;
            this.f101691c = bVar2;
            this.f101692d = hVar;
            this.f101693e = bVar3;
        }
    }
}

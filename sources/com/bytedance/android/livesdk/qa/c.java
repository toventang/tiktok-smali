package com.bytedance.android.livesdk.qa;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.c.m;
import com.bytedance.android.livesdk.j.ah;
import com.bytedance.android.livesdk.j.br;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommunityGuidelineSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCheckQuestionTooShortSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class c extends v {

    /* renamed from: a  reason: collision with root package name */
    public final int f20425a = 50;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20426b = true;

    /* renamed from: c  reason: collision with root package name */
    public String f20427c = "";

    /* renamed from: d  reason: collision with root package name */
    InputFilter f20428d;

    /* renamed from: e  reason: collision with root package name */
    public Dialog f20429e;

    /* renamed from: f  reason: collision with root package name */
    h.f.a.a<z> f20430f;

    /* renamed from: g  reason: collision with root package name */
    private final double f20431g = 0.4d;

    /* renamed from: h  reason: collision with root package name */
    private Room f20432h;

    /* renamed from: i  reason: collision with root package name */
    private final f.a.b.a f20433i = new f.a.b.a();

    /* renamed from: j  reason: collision with root package name */
    private d f20434j;

    /* renamed from: k  reason: collision with root package name */
    private final TextWatcher f20435k = new e(this);

    /* renamed from: l  reason: collision with root package name */
    private HashMap f20436l;

    static {
        Covode.recordClassIndex(12067);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f20436l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f20436l == null) {
            this.f20436l = new HashMap();
        }
        View view = (View) this.f20436l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20436l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f20429e;
        if (dialog != null) {
            dialog.dismiss();
        }
        a();
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20442a;

        static {
            Covode.recordClassIndex(12073);
        }

        f(c cVar) {
            this.f20442a = cVar;
        }

        public final void run() {
            LiveEditText liveEditText = (LiveEditText) this.f20442a.a_(R.id.dfo);
            if (liveEditText != null) {
                liveEditText.requestFocus();
            }
            LiveEditText liveEditText2 = (LiveEditText) this.f20442a.a_(R.id.dfo);
            if (liveEditText2 != null) {
                p.a((EditText) liveEditText2);
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20440a;

        static {
            Covode.recordClassIndex(12071);
        }

        d(c cVar) {
            this.f20440a = cVar;
        }

        public final void run() {
            if (this.f20440a.a_(R.id.dfo) != null) {
                ((LiveEditText) this.f20440a.a_(R.id.dfo)).requestFocus();
                LiveEditText liveEditText = (LiveEditText) this.f20440a.a_(R.id.dfo);
                h.f.b.l.b(liveEditText, "");
                p.a((EditText) liveEditText);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b62);
        bVar.f22374a = 0;
        bVar.f22375b = R.style.a2d;
        bVar.f22380g = 80;
        double b2 = (double) y.b();
        double d2 = this.f20431g;
        Double.isNaN(b2);
        bVar.f22382i = (int) (b2 * d2);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        Editable text;
        String obj;
        String replace;
        LiveEditText liveEditText = (LiveEditText) a_(R.id.dfo);
        if (liveEditText == null || (text = liveEditText.getText()) == null || (obj = text.toString()) == null || (replace = new h.m.l("\t|\r|\n").replace(obj, " ")) == null) {
            return "";
        }
        return replace;
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20455a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20456b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f20457c;

        static {
            Covode.recordClassIndex(12081);
        }

        n(c cVar, String str, String str2) {
            this.f20455a = cVar;
            this.f20456b = str;
            this.f20457c = str2;
        }

        public final void run() {
            this.f20455a.a(true);
            DataChannel dataChannel = this.f20455a.p;
            String str = this.f20456b;
            String str2 = this.f20457c;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_qa_rethink_post_ck").a(dataChannel);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            a2.a("user_id", b2.c()).a(UGCMonitor.EVENT_COMMENT, str2).a("resend_same_cmt", TextUtils.equals(str, str2) ? 1 : 0).a("if_click_cg", av.f20407a ? 1 : 0).b();
        }
    }

    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20458a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20459b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f20460c;

        static {
            Covode.recordClassIndex(12082);
        }

        o(c cVar, String str, String str2) {
            this.f20458a = cVar;
            this.f20459b = str;
            this.f20460c = str2;
        }

        public final void run() {
            DataChannel dataChannel = this.f20458a.p;
            String str = this.f20459b;
            String str2 = this.f20460c;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_qa_rethink_edit_ck").a(dataChannel);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            a2.a("user_id", b2.c()).a(UGCMonitor.EVENT_COMMENT, str2).a("resend_same_cmt", TextUtils.equals(str, str2) ? 1 : 0).a("if_click_cg", av.f20407a ? 1 : 0).b();
            av.f20408b = SystemClock.uptimeMillis();
            av.f20409c = str2;
        }
    }

    public final Map<String, String> e() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d dVar = this.f20434j;
        if (dVar != null) {
            if (aa.a(this.p)) {
                linkedHashMap.put("ask_enter_from", dVar.f20464d);
            } else {
                linkedHashMap.put("show_question_cnt", String.valueOf(dVar.f20462b + dVar.f20461a));
                linkedHashMap.put("show_answered_question_cnt", String.valueOf(dVar.f20462b));
                linkedHashMap.put("show_not_answered_question_cnt", String.valueOf(dVar.f20461a));
                if (dVar.f20463c) {
                    str = "1";
                } else {
                    str = "0";
                }
                linkedHashMap.put("is_qa_list_end", str);
                linkedHashMap.put("ask_enter_from", "qa_list");
                linkedHashMap.put("qa_list_enter_from", dVar.f20464d);
            }
        }
        return linkedHashMap;
    }

    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20451b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f20452c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f20453d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f20454e;

        static {
            Covode.recordClassIndex(12080);
        }

        m(c cVar, String str, Context context, String str2, String str3) {
            this.f20450a = cVar;
            this.f20451b = str;
            this.f20452c = context;
            this.f20453d = str2;
            this.f20454e = str3;
        }

        public final void run() {
            Object obj;
            d.b a2 = com.bytedance.android.livesdk.browser.c.e.a(this.f20451b);
            a2.f14310k = -1;
            a2.f14309j = 80;
            DataChannel dataChannel = this.f20450a.p;
            if (dataChannel != null) {
                obj = dataChannel.b(cp.class);
            } else {
                obj = null;
            }
            if (h.f.b.l.a(obj, (Object) true)) {
                a2.f14302c = (int) y.e((int) (((float) y.b()) * 0.9f));
                a2.f14301b = (int) y.e(y.c());
                a2.x = y.a((int) R.string.e40);
                a2.y = true;
                a2.C = true;
            } else {
                d.b a3 = a2.a(8, 0, 0, 8);
                a3.n = true;
                a3.f14302c = (int) y.e(y.b());
                a3.f14301b = 395;
            }
            com.bytedance.android.live.core.widget.a.a(p.a(this.f20452c), ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a(a2));
            DataChannel dataChannel2 = this.f20450a.p;
            String str = this.f20453d;
            String str2 = this.f20454e;
            av.f20407a = true;
            com.bytedance.android.livesdk.ab.b a4 = b.a.a("livesdk_qa_rethink_cg_ck").a(dataChannel2);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            a4.a("user_id", b2.c()).a(UGCMonitor.EVENT_COMMENT, str2).a("resend_same_cmt", TextUtils.equals(str, str2) ? 1 : 0).b();
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20437a;

        static {
            Covode.recordClassIndex(12068);
        }

        a(c cVar) {
            this.f20437a = cVar;
        }

        public final void onClick(View view) {
            this.f20437a.dismiss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20438a;

        static {
            Covode.recordClassIndex(12069);
        }

        b(c cVar) {
            this.f20438a = cVar;
        }

        public final void onClick(View view) {
            this.f20438a.a(false);
        }
    }

    public static final class e implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20441a;

        static {
            Covode.recordClassIndex(12072);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(c cVar) {
            this.f20441a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            h.f.b.l.d(editable, "");
            if (this.f20441a.o) {
                c cVar = this.f20441a;
                LiveEditText liveEditText = (LiveEditText) cVar.a_(R.id.dfo);
                h.f.b.l.b(liveEditText, "");
                Editable text = liveEditText.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                cVar.f20427c = str;
                LiveButton liveButton = (LiveButton) this.f20441a.a_(R.id.dfp);
                h.f.b.l.b(liveButton, "");
                if (new h.m.l("\\s").replace(this.f20441a.f20427c, "").length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                liveButton.setEnabled(z);
                int length = this.f20441a.f20427c.length();
                if (length > this.f20441a.f20425a) {
                    b.a.a("livesdk_qa_trigger_word_limit").a().b();
                    String str2 = this.f20441a.f20427c;
                    int i2 = this.f20441a.f20425a;
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String substring = str2.substring(0, i2);
                    h.f.b.l.b(substring, "");
                    ((LiveEditText) this.f20441a.a_(R.id.dfo)).setText(substring);
                    length = this.f20441a.f20425a;
                    ((LiveEditText) this.f20441a.a_(R.id.dfo)).setSelection(this.f20441a.f20425a);
                    c cVar2 = this.f20441a;
                    LiveEditText liveEditText2 = (LiveEditText) cVar2.a_(R.id.dfo);
                    h.f.b.l.b(liveEditText2, "");
                    cVar2.f20428d = new InputFilter.LengthFilter(this.f20441a.f20425a);
                    liveEditText2.setFilters(new InputFilter[]{cVar2.f20428d});
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.f20441a.a_(R.id.flr);
                    h.f.b.l.b(constraintLayout, "");
                    constraintLayout.setVisibility(0);
                } else {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f20441a.a_(R.id.flr);
                    h.f.b.l.b(constraintLayout2, "");
                    constraintLayout2.setVisibility(4);
                    c cVar3 = this.f20441a;
                    LiveEditText liveEditText3 = (LiveEditText) cVar3.a_(R.id.dfo);
                    h.f.b.l.b(liveEditText3, "");
                    if (cVar3.f20428d != null) {
                        liveEditText3.setFilters(new InputFilter[0]);
                        cVar3.f20428d = null;
                    }
                }
                if (this.f20441a.f20426b && length > 0) {
                    b.a.a("livesdk_qa_begin_to_type").a().c("click").b();
                    this.f20441a.f20426b = false;
                }
            }
        }
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20447a;

        static {
            Covode.recordClassIndex(12077);
        }

        j(c cVar) {
            this.f20447a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (!((e) obj).f20465a) {
                this.f20447a.dismiss();
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(12076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            Dialog dialog = this.this$0.f20429e;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f20433i.a();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.live.m.d.class, (Object) false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20448a;

        static {
            Covode.recordClassIndex(12078);
        }

        k(c cVar) {
            this.f20448a = cVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            c cVar = this.f20448a;
            b.a.a("livesdk_qa_deny_popup_click").a(cVar.p).a("choose_type", "cancel").a(cVar.e()).b();
            dialogInterface.dismiss();
            ((LiveEditText) cVar.a_(R.id.dfo)).postDelayed(new f(cVar), 200);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        d dVar;
        super.onCreate(bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, br.class, (h.f.a.b) new i(this));
        }
        DataChannel dataChannel2 = this.p;
        if (dataChannel2 != null) {
            dVar = (d) dataChannel2.b(b.class);
        } else {
            dVar = null;
        }
        this.f20434j = dVar;
        this.f20433i.a(com.bytedance.android.livesdk.an.a.a().a(e.class).d(new j(this)));
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20443a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20444b;

        static {
            Covode.recordClassIndex(12074);
        }

        g(c cVar, String str) {
            this.f20443a = cVar;
            this.f20444b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel = this.f20443a.p;
            if (dataChannel != null) {
                dataChannel.c(ab.class);
            }
            ao.a(y.e(), (int) R.string.eo1);
            this.f20443a.dismiss();
            DataChannel dataChannel2 = this.f20443a.p;
            if (dataChannel2 != null) {
                dataChannel2.a(g.class, this.f20444b);
            }
            b.a.a("livesdk_qa_ask_publish_success").a(this.f20443a.p).a(this.f20443a.e()).b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20449a;

        static {
            Covode.recordClassIndex(12079);
        }

        l(c cVar) {
            this.f20449a = cVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            c cVar = this.f20449a;
            b.a.a("livesdk_qa_deny_popup_click").a(cVar.p).a("choose_type", "to_comment").a(cVar.e()).b();
            DataChannel dataChannel = cVar.p;
            if (dataChannel != null) {
                com.bytedance.android.livesdk.event.d dVar = new com.bytedance.android.livesdk.event.d(cVar.d());
                dVar.f17186b = m.a.QA;
                dataChannel.c(ah.class, dVar);
            }
            dialogInterface.dismiss();
            cVar.dismiss();
            h.f.a.a<z> aVar = cVar.f20430f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20445a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20446b;

        static {
            Covode.recordClassIndex(12075);
        }

        h(c cVar, String str) {
            this.f20445a = cVar;
            this.f20446b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Object obj2;
            Throwable th = (Throwable) obj;
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
                if (aVar.getErrorCode() == 4021011) {
                    c cVar = this.f20445a;
                    String str2 = this.f20446b;
                    Context context = cVar.getContext();
                    if (context != null) {
                        h.f.b.l.b(context, "");
                        DataChannel dataChannel = cVar.p;
                        m mVar = null;
                        if (dataChannel != null) {
                            str = (String) dataChannel.b(g.class);
                        } else {
                            str = null;
                        }
                        DataChannel dataChannel2 = cVar.p;
                        av.f20407a = false;
                        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_qa_rethink_sw").a(dataChannel2);
                        com.bytedance.android.livesdk.at.f b2 = u.a().b();
                        h.f.b.l.b(b2, "");
                        a2.a("user_id", b2.c()).a(UGCMonitor.EVENT_COMMENT, str2).a("resend_same_cmt", TextUtils.equals(str, str2) ? 1 : 0).b();
                        Dialog dialog = cVar.f20429e;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        String value = LiveCommunityGuidelineSetting.INSTANCE.getValue();
                        DataChannel dataChannel3 = cVar.p;
                        if (dataChannel3 != null) {
                            obj2 = dataChannel3.b(ee.class);
                        } else {
                            obj2 = null;
                        }
                        if (h.f.b.l.a(obj2, (Object) false) && !TextUtils.isEmpty(value)) {
                            mVar = new m(cVar, value, context, str, str2);
                        }
                        cVar.f20429e = com.bytedance.android.livesdk.am.a.a(context, mVar, new n(cVar, str, str2), new o(cVar, str, str2));
                        Dialog dialog2 = cVar.f20429e;
                        if (dialog2 != null) {
                            dialog2.show();
                        }
                    }
                } else {
                    String prompt = aVar.getPrompt();
                    if (prompt == null || prompt.length() == 0) {
                        ao.a(y.e(), (int) R.string.eo3);
                    } else {
                        String prompt2 = aVar.getPrompt();
                        h.f.b.l.b(prompt2, "");
                        p.a(prompt2);
                    }
                }
            }
            DataChannel dataChannel4 = this.f20445a.p;
            if (dataChannel4 != null) {
                dataChannel4.a(g.class, this.f20446b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r12) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.qa.c.a(boolean):void");
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f20434j != null) {
            b.a.a("livesdk_qa_ask_click").a(this.p).a(e()).b();
        }
        ((ImageView) a_(R.id.m6)).setOnClickListener(new a(this));
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        h.f.b.l.b(b2, "");
        com.bytedance.android.live.base.model.user.b a2 = b2.a();
        h.f.b.l.b(a2, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) a_(R.id.flr);
        h.f.b.l.b(constraintLayout, "");
        constraintLayout.setVisibility(4);
        LiveButton liveButton = (LiveButton) a_(R.id.dfp);
        h.f.b.l.b(liveButton, "");
        liveButton.setEnabled(false);
        LiveTextView liveTextView = (LiveTextView) a_(R.id.cv8);
        h.f.b.l.b(liveTextView, "");
        liveTextView.setText(com.bytedance.android.livesdk.ac.g.a(d.a.a()));
        ImageModel avatarThumb = a2.getAvatarThumb();
        ImageView imageView = (ImageView) a_(R.id.n4);
        h.f.b.l.b(imageView, "");
        int width = imageView.getWidth();
        ImageView imageView2 = (ImageView) a_(R.id.n4);
        h.f.b.l.b(imageView2, "");
        com.bytedance.android.livesdk.chatroom.g.g.a((ImageView) a_(R.id.n4), avatarThumb, width, imageView2.getHeight(), 2131234726);
        if (LiveCheckQuestionTooShortSetting.INSTANCE.enable()) {
            ((LiveEditText) a_(R.id.dfo)).setHint(R.string.ejr);
        } else {
            ((LiveEditText) a_(R.id.dfo)).setHint(R.string.dwk);
        }
        ((LiveEditText) a_(R.id.dfo)).addTextChangedListener(this.f20435k);
        ((LiveButton) a_(R.id.dfp)).setOnClickListener(new b(this));
        ((LiveEditText) a_(R.id.dfo)).setOnKeyListener(new View$OnKeyListenerC0412c(this));
        ((LiveEditText) a_(R.id.dfo)).postDelayed(new d(this), 200);
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$c  reason: collision with other inner class name */
    static final class View$OnKeyListenerC0412c implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20439a;

        static {
            Covode.recordClassIndex(12070);
        }

        View$OnKeyListenerC0412c(c cVar) {
            this.f20439a = cVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (66 != i2) {
                return false;
            }
            h.f.b.l.b(keyEvent, "");
            if (1 == keyEvent.getAction()) {
                this.f20439a.a(false);
            }
            return true;
        }
    }
}

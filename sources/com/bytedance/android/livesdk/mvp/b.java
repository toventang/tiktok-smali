package com.bytedance.android.livesdk.mvp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.ReplacementTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.aw;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.c.z;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

public final class b extends v implements WeakHandler.IHandler {

    /* renamed from: k  reason: collision with root package name */
    public static final a f19795k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f19796a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19797b = true;

    /* renamed from: c  reason: collision with root package name */
    public String f19798c = "";

    /* renamed from: d  reason: collision with root package name */
    InputFilter f19799d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f19800e = new WeakHandler(this);

    /* renamed from: f  reason: collision with root package name */
    public boolean f19801f;

    /* renamed from: g  reason: collision with root package name */
    public int f19802g;

    /* renamed from: h  reason: collision with root package name */
    public long f19803h;

    /* renamed from: i  reason: collision with root package name */
    public EnterRoomConfig f19804i;

    /* renamed from: j  reason: collision with root package name */
    final TextWatcher f19805j = new l(this);

    /* renamed from: l  reason: collision with root package name */
    private f.a.b.a f19806l = new f.a.b.a();

    /* renamed from: m  reason: collision with root package name */
    private HashMap f19807m;

    static {
        Covode.recordClassIndex(11735);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f19807m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f19807m == null) {
            this.f19807m = new HashMap();
        }
        View view = (View) this.f19807m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f19807m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11736);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b66);
        bVar.f22374a = 0;
        bVar.f22375b = R.style.a2d;
        bVar.f22380g = 80;
        bVar.f22382i = -2;
        bVar.f22378e = false;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$b  reason: collision with other inner class name */
    public static final class C0403b extends ReplacementTransformationMethod {
        static {
            Covode.recordClassIndex(11737);
        }

        /* access modifiers changed from: protected */
        public final char[] getOriginal() {
            return new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        }

        /* access modifiers changed from: protected */
        public final char[] getReplacement() {
            return new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19817a;

        static {
            Covode.recordClassIndex(11745);
        }

        j(b bVar) {
            this.f19817a = bVar;
        }

        public final void run() {
            if (this.f19817a.a_(R.id.atn) != null) {
                ((LiveEditText) this.f19817a.a_(R.id.atn)).requestFocus();
                LiveEditText liveEditText = (LiveEditText) this.f19817a.a_(R.id.atn);
                h.f.b.l.b(liveEditText, "");
                p.a((EditText) liveEditText);
            }
        }
    }

    public final void d() {
        getContext();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = e();
        }
        if (com.ss.android.ugc.aweme.lancet.j.f107229h) {
            LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) a_(R.id.axg);
            h.f.b.l.b(liveAutoRtlImageView, "");
            liveAutoRtlImageView.setBackground(y.c(2131234852));
            LiveTextView liveTextView = (LiveTextView) a_(R.id.title);
            h.f.b.l.b(liveTextView, "");
            liveTextView.setText(y.a((int) R.string.eqb));
            LiveTextView liveTextView2 = (LiveTextView) a_(R.id.adh);
            h.f.b.l.b(liveTextView2, "");
            liveTextView2.setText(y.a((int) R.string.eoz));
            return;
        }
        LiveAutoRtlImageView liveAutoRtlImageView2 = (LiveAutoRtlImageView) a_(R.id.axg);
        h.f.b.l.b(liveAutoRtlImageView2, "");
        liveAutoRtlImageView2.setBackground(y.c(R.drawable.c_8));
        LiveTextView liveTextView3 = (LiveTextView) a_(R.id.title);
        h.f.b.l.b(liveTextView3, "");
        liveTextView3.setText(y.a((int) R.string.egh));
        LiveTextView liveTextView4 = (LiveTextView) a_(R.id.adh);
        h.f.b.l.b(liveTextView4, "");
        liveTextView4.setText(y.a((int) R.string.egi) + " " + y.a((int) R.string.eoz));
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19818a;

        static {
            Covode.recordClassIndex(11746);
        }

        k(b bVar) {
            this.f19818a = bVar;
        }

        public final void onClick(View view) {
            this.f19818a.a(true);
        }
    }

    public static final class l implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19819a;

        static {
            Covode.recordClassIndex(11747);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(b bVar) {
            this.f19819a = bVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            h.f.b.l.d(editable, "");
            if (this.f19819a.o) {
                b bVar = this.f19819a;
                LiveEditText liveEditText = (LiveEditText) bVar.a_(R.id.atn);
                h.f.b.l.b(liveEditText, "");
                Editable text = liveEditText.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                bVar.f19798c = str;
                b bVar2 = this.f19819a;
                bVar2.f19802g = bVar2.f19798c.length();
                LiveButton liveButton = (LiveButton) this.f19819a.a_(R.id.edq);
                h.f.b.l.b(liveButton, "");
                if (this.f19819a.f19801f || this.f19819a.f19802g < 4) {
                    z = false;
                } else {
                    z = true;
                }
                liveButton.setEnabled(z);
                if (this.f19819a.f19802g > 32) {
                    String str2 = this.f19819a.f19798c;
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String substring = str2.substring(0, 32);
                    h.f.b.l.b(substring, "");
                    ((LiveEditText) this.f19819a.a_(R.id.atn)).setText(substring);
                    this.f19819a.f19802g = 32;
                    ((LiveEditText) this.f19819a.a_(R.id.atn)).setSelection(32);
                    b bVar3 = this.f19819a;
                    LiveEditText liveEditText2 = (LiveEditText) bVar3.a_(R.id.atn);
                    h.f.b.l.b(liveEditText2, "");
                    bVar3.f19799d = new InputFilter.LengthFilter(32);
                    liveEditText2.setFilters(new InputFilter[]{bVar3.f19799d});
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.f19819a.a_(R.id.flt);
                    h.f.b.l.b(constraintLayout, "");
                    constraintLayout.setVisibility(0);
                } else {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f19819a.a_(R.id.flt);
                    h.f.b.l.b(constraintLayout2, "");
                    constraintLayout2.setVisibility(8);
                    b bVar4 = this.f19819a;
                    LiveEditText liveEditText3 = (LiveEditText) bVar4.a_(R.id.atn);
                    h.f.b.l.b(liveEditText3, "");
                    if (bVar4.f19799d != null) {
                        liveEditText3.setFilters(new InputFilter[0]);
                        bVar4.f19799d = null;
                    }
                }
                if (this.f19819a.f19797b && this.f19819a.f19802g > 0) {
                    this.f19819a.f19797b = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19808a;

        static {
            Covode.recordClassIndex(11738);
        }

        c(b bVar) {
            this.f19808a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f19808a.f19796a = true;
            ((LiveButton) this.f19808a.a_(R.id.edq)).b();
            this.f19808a.dismiss();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (this.f19802g >= 4) {
            LiveButton liveButton = (LiveButton) a_(R.id.edq);
            h.f.b.l.b(liveButton, "");
            liveButton.setEnabled(true);
        }
        this.f19801f = false;
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19816a;

        static {
            Covode.recordClassIndex(11744);
        }

        i(b bVar) {
            this.f19816a = bVar;
        }

        public final void onClick(View view) {
            b bVar = this.f19816a;
            LiveEditText liveEditText = (LiveEditText) bVar.a_(R.id.atn);
            h.f.b.l.b(liveEditText, "");
            String valueOf = String.valueOf(liveEditText.getText());
            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase();
            h.f.b.l.b(upperCase, "");
            bVar.a(upperCase);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long j2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            j2 = arguments.getLong("roomId");
        } else {
            j2 = 0;
        }
        this.f19803h = j2;
        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
        h.f.b.l.b(fVar, "");
        EnterRoomLinkSession a2 = fVar.a();
        h.f.b.l.b(a2, "");
        this.f19804i = a2.f23354b;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        z zVar = new z();
        zVar.f15169a = this.f19796a;
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.b(aw.class, zVar);
        }
        super.onDismiss(dialogInterface);
        this.f19800e.removeMessages(101);
        this.f19806l.a();
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19811a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f19812b;

        static {
            Covode.recordClassIndex(11741);
        }

        f(b bVar, boolean z) {
            this.f19811a = bVar;
            this.f19812b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.i(2065);
            LiveLoadingView liveLoadingView = (LiveLoadingView) this.f19811a.a_(R.id.ci9);
            h.f.b.l.b(liveLoadingView, "");
            liveLoadingView.setVisibility(8);
            if (!this.f19812b) {
                b bVar = this.f19811a;
                ((ViewStub) bVar.getView().findViewById(R.id.axf)).inflate();
                ((LiveButton) bVar.a_(R.id.dmf)).setOnClickListener(new k(bVar));
            }
            this.f19811a.d();
            MethodCollector.o(2065);
        }
    }

    public final void a(boolean z) {
        LiveLoadingView liveLoadingView = (LiveLoadingView) a_(R.id.ci9);
        h.f.b.l.b(liveLoadingView, "");
        liveLoadingView.setVisibility(0);
        this.f19806l.a(((PaidRoomApi) com.bytedance.android.live.network.e.a().a(PaidRoomApi.class)).queryRoomData(Long.valueOf(this.f19803h)).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new e(this), new f(this, z)));
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19809a;

        static {
            Covode.recordClassIndex(11739);
        }

        d(b bVar) {
            this.f19809a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f19809a.a_(R.id.flt);
            h.f.b.l.b(constraintLayout, "");
            constraintLayout.setVisibility(0);
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
                String prompt = aVar.getPrompt();
                if (prompt == null || prompt.length() == 0) {
                    LiveTextView liveTextView = (LiveTextView) this.f19809a.a_(R.id.axo);
                    h.f.b.l.b(liveTextView, "");
                    liveTextView.setText(y.a((int) R.string.e63));
                } else {
                    LiveTextView liveTextView2 = (LiveTextView) this.f19809a.a_(R.id.axo);
                    h.f.b.l.b(liveTextView2, "");
                    liveTextView2.setText(aVar.getPrompt());
                }
                String extra = aVar.getExtra();
                if (!(extra == null || extra.length() == 0)) {
                    Object obj2 = new JSONObject(aVar.getExtra()).get("block_duration");
                    if (!(obj2 instanceof Integer)) {
                        obj2 = null;
                    }
                    Integer num = (Integer) obj2;
                    if (num != null && num.intValue() > 0) {
                        this.f19809a.f19800e.removeMessages(101);
                        Message obtainMessage = this.f19809a.f19800e.obtainMessage(101);
                        h.f.b.l.b(obtainMessage, "");
                        this.f19809a.f19800e.sendMessageDelayed(obtainMessage, (long) (num.intValue() * 1000));
                        this.f19809a.f19801f = true;
                        LiveButton liveButton = (LiveButton) this.f19809a.a_(R.id.edq);
                        h.f.b.l.b(liveButton, "");
                        liveButton.setEnabled(false);
                    }
                }
            } else {
                LiveTextView liveTextView3 = (LiveTextView) this.f19809a.a_(R.id.axo);
                h.f.b.l.b(liveTextView3, "");
                liveTextView3.setText(y.a((int) R.string.e63));
            }
            ((LiveButton) this.f19809a.a_(R.id.edq)).b();
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f19815b;

        static {
            Covode.recordClassIndex(11743);
        }

        h(b bVar, a aVar) {
            this.f19814a = bVar;
            this.f19815b = aVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            EnterRoomConfig.RoomsData roomsData;
            EnterRoomConfig.RoomsData roomsData2;
            EnterRoomConfig.LogData logData;
            EnterRoomConfig.LogData logData2;
            EnterRoomConfig.RoomsData roomsData3;
            EnterRoomConfig.RoomsData roomsData4;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_event_gate_popup_click_more");
            EnterRoomConfig enterRoomConfig = this.f19814a.f19804i;
            String str6 = null;
            if (enterRoomConfig == null || (roomsData4 = enterRoomConfig.f23299c) == null) {
                str = null;
            } else {
                str = roomsData4.J;
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("enter_from_merge", str);
            EnterRoomConfig enterRoomConfig2 = this.f19814a.f19804i;
            if (enterRoomConfig2 == null || (roomsData3 = enterRoomConfig2.f23299c) == null) {
                str2 = null;
            } else {
                str2 = roomsData3.L;
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("enter_method", str2);
            EnterRoomConfig enterRoomConfig3 = this.f19814a.f19804i;
            if (enterRoomConfig3 == null || (logData2 = enterRoomConfig3.f23298b) == null) {
                str3 = null;
            } else {
                str3 = logData2.f23310b;
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("anchor_id", str3).a("room_id", this.f19814a.f19803h);
            EnterRoomConfig enterRoomConfig4 = this.f19814a.f19804i;
            if (enterRoomConfig4 == null || (logData = enterRoomConfig4.f23298b) == null) {
                str4 = null;
            } else {
                str4 = logData.f23309a;
            }
            com.bytedance.android.livesdk.ab.b a6 = a5.a("request_id", str4);
            EnterRoomConfig enterRoomConfig5 = this.f19814a.f19804i;
            if (enterRoomConfig5 == null || (roomsData2 = enterRoomConfig5.f23299c) == null) {
                str5 = null;
            } else {
                str5 = roomsData2.M;
            }
            com.bytedance.android.livesdk.ab.b a7 = a6.a("action_type", str5);
            EnterRoomConfig enterRoomConfig6 = this.f19814a.f19804i;
            if (!(enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f23299c) == null)) {
                str6 = roomsData.F;
            }
            a7.a("follow_status", str6).b();
            String str7 = this.f19815b.f19793c;
            if (str7 != null) {
                com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
                Context context = this.f19814a.getContext();
                d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(str7);
                b2.f14292c = true;
                webViewManager.a(context, b2);
            }
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19820a;

        static {
            Covode.recordClassIndex(11748);
        }

        m(b bVar) {
            this.f19820a = bVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            EnterRoomConfig.RoomsData roomsData;
            EnterRoomConfig.LogData logData;
            EnterRoomConfig.RoomsData roomsData2;
            EnterRoomConfig.LogData logData2;
            EnterRoomConfig.RoomsData roomsData3;
            EnterRoomConfig.RoomsData roomsData4;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_event_gate_popup_exit");
            EnterRoomConfig enterRoomConfig = this.f19820a.f19804i;
            String str6 = null;
            if (enterRoomConfig == null || (roomsData4 = enterRoomConfig.f23299c) == null) {
                str = null;
            } else {
                str = roomsData4.J;
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("enter_from_merge", str);
            EnterRoomConfig enterRoomConfig2 = this.f19820a.f19804i;
            if (enterRoomConfig2 == null || (roomsData3 = enterRoomConfig2.f23299c) == null) {
                str2 = null;
            } else {
                str2 = roomsData3.L;
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("enter_method", str2);
            EnterRoomConfig enterRoomConfig3 = this.f19820a.f19804i;
            if (enterRoomConfig3 == null || (logData2 = enterRoomConfig3.f23298b) == null) {
                str3 = null;
            } else {
                str3 = logData2.f23310b;
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("anchor_id", str3).a("room_id", this.f19820a.f19803h);
            EnterRoomConfig enterRoomConfig4 = this.f19820a.f19804i;
            if (enterRoomConfig4 == null || (roomsData2 = enterRoomConfig4.f23299c) == null) {
                str4 = null;
            } else {
                str4 = roomsData2.M;
            }
            com.bytedance.android.livesdk.ab.b a6 = a5.a("action_type", str4);
            EnterRoomConfig enterRoomConfig5 = this.f19820a.f19804i;
            if (enterRoomConfig5 == null || (logData = enterRoomConfig5.f23298b) == null) {
                str5 = null;
            } else {
                str5 = logData.f23309a;
            }
            com.bytedance.android.livesdk.ab.b a7 = a6.a("request_id", str5);
            EnterRoomConfig enterRoomConfig6 = this.f19820a.f19804i;
            if (!(enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f23299c) == null)) {
                str6 = roomsData.F;
            }
            a7.a("follow_status", str6).b();
            this.f19820a.dismiss();
        }
    }

    public final void a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.LogData logData;
        EnterRoomConfig.LogData logData2;
        EnterRoomConfig.RoomsData roomsData3;
        EnterRoomConfig.RoomsData roomsData4;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_event_gate_popup_continue");
        EnterRoomConfig enterRoomConfig = this.f19804i;
        String str7 = null;
        if (enterRoomConfig == null || (roomsData4 = enterRoomConfig.f23299c) == null) {
            str2 = null;
        } else {
            str2 = roomsData4.J;
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("enter_from_merge", str2);
        EnterRoomConfig enterRoomConfig2 = this.f19804i;
        if (enterRoomConfig2 == null || (roomsData3 = enterRoomConfig2.f23299c) == null) {
            str3 = null;
        } else {
            str3 = roomsData3.L;
        }
        com.bytedance.android.livesdk.ab.b a4 = a3.a("enter_method", str3);
        EnterRoomConfig enterRoomConfig3 = this.f19804i;
        if (enterRoomConfig3 == null || (logData2 = enterRoomConfig3.f23298b) == null) {
            str4 = null;
        } else {
            str4 = logData2.f23310b;
        }
        com.bytedance.android.livesdk.ab.b a5 = a4.a("anchor_id", str4).a("room_id", this.f19803h);
        EnterRoomConfig enterRoomConfig4 = this.f19804i;
        if (enterRoomConfig4 == null || (logData = enterRoomConfig4.f23298b) == null) {
            str5 = null;
        } else {
            str5 = logData.f23309a;
        }
        com.bytedance.android.livesdk.ab.b a6 = a5.a("request_id", str5);
        EnterRoomConfig enterRoomConfig5 = this.f19804i;
        if (enterRoomConfig5 == null || (roomsData2 = enterRoomConfig5.f23299c) == null) {
            str6 = null;
        } else {
            str6 = roomsData2.M;
        }
        com.bytedance.android.livesdk.ab.b a7 = a6.a("action_type", str6);
        EnterRoomConfig enterRoomConfig6 = this.f19804i;
        if (!(enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f23299c) == null)) {
            str7 = roomsData.F;
        }
        a7.a("follow_status", str7).b();
        LiveButton liveButton = (LiveButton) a_(R.id.edq);
        if (!liveButton.f9562i) {
            liveButton.f9564k = liveButton.f9563j.getVisibility();
            liveButton.f9565l = liveButton.f9560g.getVisibility();
            if (liveButton.f9563j.getVisibility() == 0) {
                liveButton.f9563j.setVisibility(4);
            }
            if (liveButton.f9560g.getVisibility() == 0) {
                liveButton.f9560g.setVisibility(4);
            }
            liveButton.f9562i = true;
            liveButton.f9561h.start();
        }
        this.f19806l.a(((PaidRoomApi) com.bytedance.android.live.network.e.a().a(PaidRoomApi.class)).checkCode(str, Long.valueOf(this.f19803h)).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new c(this), new d(this)));
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19810a;

        static {
            Covode.recordClassIndex(11740);
        }

        e(b bVar) {
            this.f19810a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            EnterRoomConfig.RoomsData roomsData;
            EnterRoomConfig.LogData logData;
            EnterRoomConfig.RoomsData roomsData2;
            EnterRoomConfig.LogData logData2;
            EnterRoomConfig.RoomsData roomsData3;
            EnterRoomConfig.RoomsData roomsData4;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            LiveLoadingView liveLoadingView = (LiveLoadingView) this.f19810a.a_(R.id.ci9);
            h.f.b.l.b(liveLoadingView, "");
            liveLoadingView.setVisibility(8);
            if (dVar.data != null) {
                b bVar = this.f19810a;
                Object obj2 = dVar.data;
                h.f.b.l.b(obj2, "");
                a aVar = (a) obj2;
                LiveButton liveButton = (LiveButton) bVar.a_(R.id.edq);
                h.f.b.l.b(liveButton, "");
                liveButton.setEnabled(false);
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_event_gate_popup_show");
                EnterRoomConfig enterRoomConfig = bVar.f19804i;
                ImageModel imageModel = null;
                if (enterRoomConfig == null || (roomsData4 = enterRoomConfig.f23299c) == null) {
                    str = null;
                } else {
                    str = roomsData4.J;
                }
                com.bytedance.android.livesdk.ab.b a3 = a2.a("enter_from_merge", str);
                EnterRoomConfig enterRoomConfig2 = bVar.f19804i;
                if (enterRoomConfig2 == null || (roomsData3 = enterRoomConfig2.f23299c) == null) {
                    str2 = null;
                } else {
                    str2 = roomsData3.L;
                }
                com.bytedance.android.livesdk.ab.b a4 = a3.a("enter_method", str2);
                EnterRoomConfig enterRoomConfig3 = bVar.f19804i;
                if (enterRoomConfig3 == null || (logData2 = enterRoomConfig3.f23298b) == null) {
                    str3 = null;
                } else {
                    str3 = logData2.f23310b;
                }
                com.bytedance.android.livesdk.ab.b a5 = a4.a("anchor_id", str3).a("room_id", bVar.f19803h);
                EnterRoomConfig enterRoomConfig4 = bVar.f19804i;
                if (enterRoomConfig4 == null || (roomsData2 = enterRoomConfig4.f23299c) == null) {
                    str4 = null;
                } else {
                    str4 = roomsData2.M;
                }
                com.bytedance.android.livesdk.ab.b a6 = a5.a("action_type", str4);
                EnterRoomConfig enterRoomConfig5 = bVar.f19804i;
                if (enterRoomConfig5 == null || (logData = enterRoomConfig5.f23298b) == null) {
                    str5 = null;
                } else {
                    str5 = logData.f23309a;
                }
                com.bytedance.android.livesdk.ab.b a7 = a6.a("request_id", str5);
                EnterRoomConfig enterRoomConfig6 = bVar.f19804i;
                if (enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f23299c) == null) {
                    str6 = null;
                } else {
                    str6 = roomsData.F;
                }
                a7.a("follow_status", str6).b();
                ConstraintLayout constraintLayout = (ConstraintLayout) bVar.a_(R.id.als);
                h.f.b.l.b(constraintLayout, "");
                constraintLayout.setVisibility(0);
                ImageView imageView = (ImageView) bVar.a_(R.id.pp);
                User user = aVar.f19794d;
                if (user != null) {
                    imageModel = user.getAvatarThumb();
                }
                ImageView imageView2 = (ImageView) bVar.a_(R.id.pp);
                h.f.b.l.b(imageView2, "");
                int width = imageView2.getWidth();
                ImageView imageView3 = (ImageView) bVar.a_(R.id.pp);
                h.f.b.l.b(imageView3, "");
                com.bytedance.android.livesdk.chatroom.g.g.a(imageView, imageModel, width, imageView3.getHeight(), 2131234726);
                LiveTextView liveTextView = (LiveTextView) bVar.a_(R.id.emz);
                h.f.b.l.b(liveTextView, "");
                liveTextView.setText(aVar.f19791a);
                LiveTextView liveTextView2 = (LiveTextView) bVar.a_(R.id.aem);
                h.f.b.l.b(liveTextView2, "");
                liveTextView2.setText(aVar.f19792b);
                LiveEditText liveEditText = (LiveEditText) bVar.a_(R.id.atn);
                h.f.b.l.b(liveEditText, "");
                liveEditText.setTransformationMethod(new C0403b());
                ((LinearLayout) bVar.a_(R.id.al6)).setOnClickListener(new h(bVar, aVar));
                ((LiveButton) bVar.a_(R.id.edq)).setOnClickListener(new i(bVar));
                LiveEditText liveEditText2 = (LiveEditText) bVar.a_(R.id.atn);
                liveEditText2.addTextChangedListener(bVar.f19805j);
                liveEditText2.setOnKeyListener(new g(bVar));
                ((LiveEditText) bVar.a_(R.id.atn)).postDelayed(new j(bVar), 100);
                return;
            }
            this.f19810a.d();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        ((ImageView) a_(R.id.a81)).setOnClickListener(new m(this));
        a(false);
    }

    static final class g implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f19813a;

        static {
            Covode.recordClassIndex(11742);
        }

        g(b bVar) {
            this.f19813a = bVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (66 != i2) {
                return false;
            }
            h.f.b.l.b(keyEvent, "");
            if (1 != keyEvent.getAction()) {
                return false;
            }
            b bVar = this.f19813a;
            LiveEditText liveEditText = (LiveEditText) bVar.a_(R.id.atn);
            h.f.b.l.b(liveEditText, "");
            String valueOf = String.valueOf(liveEditText.getText());
            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase();
            h.f.b.l.b(upperCase, "");
            bVar.a(upperCase);
            return true;
        }
    }
}

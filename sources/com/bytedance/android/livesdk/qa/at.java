package com.bytedance.android.livesdk.qa;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.model.message.bj;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;

public final class at extends v {

    /* renamed from: a  reason: collision with root package name */
    public bj f20399a;

    /* renamed from: b  reason: collision with root package name */
    String f20400b = "";

    /* renamed from: c  reason: collision with root package name */
    private HashMap f20401c;

    static {
        Covode.recordClassIndex(12046);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f20401c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f20401c == null) {
            this.f20401c = new HashMap();
        }
        View view = (View) this.f20401c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20401c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b84);
        bVar.f22374a = 0;
        bVar.f22375b = R.style.a2d;
        bVar.f22380g = 80;
        bVar.f22382i = -2;
        return bVar;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f20404a;

        static {
            Covode.recordClassIndex(12048);
        }

        b(at atVar) {
            this.f20404a = atVar;
        }

        public final void onClick(View view) {
            this.f20404a.dismiss();
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f20405a;

        static {
            Covode.recordClassIndex(12049);
        }

        c(at atVar) {
            this.f20405a = atVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel;
            bj bjVar = this.f20405a.f20399a;
            if (bjVar != null && (dataChannel = this.f20405a.p) != null) {
                dataChannel.b(an.class, new af(bjVar, 6));
            }
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f20406a = new d();

        static {
            Covode.recordClassIndex(12050);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String prompt;
            Throwable th = (Throwable) obj;
            if (!(th instanceof com.bytedance.android.live.a.a.b.a)) {
                th = null;
            }
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
            if (aVar != null && (prompt = aVar.getPrompt()) != null && prompt.length() > 0) {
                p.a(prompt);
            }
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f20402a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f20403b;

        static {
            Covode.recordClassIndex(12047);
        }

        a(at atVar, boolean z) {
            this.f20402a = atVar;
            this.f20403b = z;
        }

        public final void onClick(View view) {
            at atVar;
            bj bjVar;
            Room room;
            at atVar2 = this.f20402a;
            DataChannel dataChannel = atVar2.p;
            if (!(dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null)) {
                String a2 = e.a();
                String d2 = e.d();
                bj bjVar2 = atVar2.f20399a;
                if (bjVar2 != null) {
                    long id = room.getId();
                    long ownerUserId = room.getOwnerUserId();
                    User user = bjVar2.f19336e;
                    l.b(user, "");
                    long id2 = user.getId();
                    User user2 = bjVar2.f19336e;
                    l.b(user2, "");
                    com.bytedance.android.livesdkapi.model.d dVar = new com.bytedance.android.livesdkapi.model.d(id, ownerUserId, id2, user2.getSecUid(), atVar2.f20400b, bjVar2.f19332a, bjVar2.f19333b, room.getRequestId(), a2, d2, "report_question", "3");
                    dVar.s = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
                    if (l.a((Object) dVar.f23281h, (Object) "qa_board")) {
                        double b2 = (double) y.b();
                        Double.isNaN(b2);
                        dVar.f23278e = (int) y.e((int) (b2 * 0.73d));
                    }
                    ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).report(atVar2.getContext(), dVar);
                }
            }
            if (this.f20403b && (bjVar = (atVar = this.f20402a).f20399a) != null) {
                ((QAApi) com.bytedance.android.live.network.e.a().a(QAApi.class)).deleteQuestion(bjVar.f19332a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new c(atVar), d.f20406a);
            }
            this.f20402a.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        bj bjVar;
        String str;
        Boolean bool;
        String str2 = "";
        l.d(view, str2);
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        DataChannel dataChannel2 = this.p;
        if (!(dataChannel2 == null || (str = (String) dataChannel2.b(au.class)) == null)) {
            str2 = str;
        }
        this.f20400b = str2;
        DataChannel dataChannel3 = this.p;
        if (dataChannel3 != null) {
            bjVar = (bj) dataChannel3.b(ad.class);
        } else {
            bjVar = null;
        }
        this.f20399a = bjVar;
        ((LiveTextView) a_(R.id.dlz)).setOnClickListener(new a(this, z));
        ((LiveTextView) a_(R.id.a1p)).setOnClickListener(new b(this));
    }
}

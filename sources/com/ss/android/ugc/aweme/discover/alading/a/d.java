package com.ss.android.ugc.aweme.discover.alading.a;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.ArrayList;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public View f80728a;

    /* renamed from: b  reason: collision with root package name */
    public SmartImageView f80729b;

    /* renamed from: c  reason: collision with root package name */
    Aweme f80730c;

    /* renamed from: d  reason: collision with root package name */
    public final q<View, Integer, Aweme, z> f80731d;

    static {
        Covode.recordClassIndex(50204);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f80732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f80733b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f80734c;

        static {
            Covode.recordClassIndex(50205);
        }

        a(d dVar, Aweme aweme, r rVar) {
            this.f80732a = dVar;
            this.f80733b = aweme;
            this.f80734c = rVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            long j2;
            String str;
            Long l2;
            String str2;
            String str3;
            User author;
            User author2;
            User author3;
            User author4;
            User author5;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                View view2 = this.f80732a.itemView;
                l.b(view2, "");
                view2.getContext();
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = a();
                }
                if (!j.f107229h) {
                    View view3 = this.f80732a.itemView;
                    l.b(view3, "");
                    new com.ss.android.ugc.aweme.tux.a.i.a(view3.getContext()).a(R.string.de8).a();
                } else {
                    Aweme aweme = this.f80733b;
                    if (aweme == null || (author5 = aweme.getAuthor()) == null) {
                        j2 = 0;
                    } else {
                        j2 = author5.roomId;
                    }
                    String str4 = this.f80734c.f121274i;
                    String str5 = this.f80734c.f121271f;
                    String valueOf = String.valueOf(this.f80734c.f121269d);
                    Aweme aweme2 = this.f80733b;
                    if (aweme2 == null || (author4 = aweme2.getAuthor()) == null || (str = author4.getUid()) == null) {
                        str = "";
                    }
                    Aweme aweme3 = this.f80733b;
                    if (aweme3 == null || (author3 = aweme3.getAuthor()) == null) {
                        l2 = "";
                    } else {
                        l2 = Long.valueOf(author3.roomId);
                    }
                    String valueOf2 = String.valueOf(l2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(j2));
                    ArrayList arrayList2 = new ArrayList();
                    Aweme aweme4 = this.f80733b;
                    if (aweme4 == null || (author2 = aweme4.getAuthor()) == null || (str2 = author2.getUid()) == null) {
                        str2 = "";
                    }
                    arrayList2.add(new RoomInfo(j2, str2));
                    Context context = GlobalContext.getContext();
                    l.b(context, "");
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    enterRoomConfig.f23298b.x = str4;
                    enterRoomConfig.f23298b.y = str5;
                    enterRoomConfig.f23298b.A = valueOf;
                    enterRoomConfig.f23298b.z = str;
                    enterRoomConfig.f23298b.B = valueOf2;
                    enterRoomConfig.f23298b.f23309a = str4;
                    EnterRoomConfig.LogData logData = enterRoomConfig.f23298b;
                    Aweme aweme5 = this.f80733b;
                    if (aweme5 == null || (author = aweme5.getAuthor()) == null || (str3 = author.getUid()) == null) {
                        str3 = "";
                    }
                    logData.f23310b = str3;
                    enterRoomConfig.f23299c.L = "live_cover";
                    com.ss.android.ugc.aweme.discover.ui.c.a.a(context, j2, arrayList, arrayList2, enterRoomConfig, this.f80734c.f121272g);
                }
                q<View, Integer, Aweme, z> qVar = this.f80732a.f80731d;
                if (qVar != null) {
                    l.b(view, "");
                    qVar.invoke(view, Integer.valueOf(this.f80732a.getAdapterPosition()), this.f80733b);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.q<? super android.view.View, ? super java.lang.Integer, ? super com.ss.android.ugc.aweme.feed.model.Aweme, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, q<? super View, ? super Integer, ? super Aweme, z> qVar) {
        super(view);
        l.d(view, "");
        this.f80731d = qVar;
        this.f80728a = view;
        LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view.findViewById(R.id.agf);
        l.b(linearGradientDraweeView, "");
        this.f80729b = linearGradientDraweeView;
    }
}

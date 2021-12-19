package com.ss.android.ugc.aweme.profile.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.UUID;

public final class o extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f115874a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f115875b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f115876c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f115877d;

    static {
        Covode.recordClassIndex(74738);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f115878a;

        static {
            Covode.recordClassIndex(74739);
        }

        a(o oVar) {
            this.f115878a = oVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            String uuid = UUID.randomUUID().toString();
            l.b(uuid, "");
            l.d("click_create_video", "");
            l.d(uuid, "");
            d a2 = new d().a("enter_from", "personal_homepage").a("enter_method", "click_create_video").a("shoot_way", "direct_shoot").a("creation_id", uuid);
            if (com.ss.android.ugc.aweme.profile.f.o.c()) {
                str = "set_up_profile";
            } else {
                str = "edit_profile";
            }
            r.a("shoot", a2.a("btn_name", str).a("with_guidence", com.ss.android.ugc.aweme.profile.f.o.f116433c ? 1 : 0).a("tab_name", com.ss.android.ugc.aweme.profile.f.o.f116431a).f66730a);
            final RecordConfig.Builder translationType = new RecordConfig.Builder().creationId(uuid).shootWay("direct_shoot").groupId(ah.f109484b).enterFrom(ah.f109483a).fromMain(true).startRecordTime(System.currentTimeMillis()).musicType(1).translationType(3);
            AVExternalServiceImpl.a().asyncService(this.f115878a.f115877d, "direct_shoot", new SimpleServiceLoadCallback(this) {
                /* class com.ss.android.ugc.aweme.profile.a.o.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f115879a;

                static {
                    Covode.recordClassIndex(74740);
                }

                @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                }

                {
                    this.f115879a = r1;
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    l.d(asyncAVService, "");
                    asyncAVService.uiService().recordService().startRecord(this.f115879a.f115878a.f115877d, translationType.build());
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(View view, Context context) {
        super(view);
        l.d(view, "");
        l.d(context, "");
        this.f115877d = context;
        View findViewById = view.findViewById(R.id.e2e);
        l.b(findViewById, "");
        this.f115874a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.e2f);
        l.b(findViewById2, "");
        this.f115875b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.agz);
        l.b(findViewById3, "");
        this.f115876c = (TextView) findViewById3;
        com.ss.android.ugc.aweme.profile.f.o.f116433c = true;
    }
}

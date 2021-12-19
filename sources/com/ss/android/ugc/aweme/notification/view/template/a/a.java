package com.ss.android.ugc.aweme.notification.view.template.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.notice.repo.list.a.c;
import com.ss.android.ugc.aweme.notice.repo.list.a.d;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.e;
import com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateBottomButton;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.b.l;
import java.util.List;

public final class a implements com.ss.android.ugc.aweme.notification.view.template.a {
    static {
        Covode.recordClassIndex(73303);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoticeTemplateBottomButton f114010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.notification.view.template.b f114011b;

        static {
            Covode.recordClassIndex(73305);
        }

        b(NoticeTemplateBottomButton noticeTemplateBottomButton, com.ss.android.ugc.aweme.notification.view.template.b bVar) {
            this.f114010a = noticeTemplateBottomButton;
            this.f114011b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f114011b.a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.a.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2919a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f114008a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoticeTemplateBottomButton f114009b;

        static {
            Covode.recordClassIndex(73304);
        }

        View$OnClickListenerC2919a(String str, NoticeTemplateBottomButton noticeTemplateBottomButton) {
            this.f114008a = str;
            this.f114009b = noticeTemplateBottomButton;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f114009b.getContext(), this.f114008a).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.a
    public final void a(MusNotice musNotice, com.ss.android.ugc.aweme.notification.view.template.b bVar) {
        c cVar;
        List<d> list;
        l.d(musNotice, "");
        l.d(bVar, "");
        e eVar = musNotice.templateNotice;
        if (!(eVar == null || (cVar = eVar.f112844b) == null || (list = cVar.q) == null)) {
            for (T t : list) {
                Integer num = t.f112816b;
                if (num != null) {
                    if (num.intValue() == 0) {
                        a(bVar.getNegativeButton(), t, bVar);
                    } else if (num.intValue() == 2) {
                        a(bVar.getPositiveButton(), t, bVar);
                    }
                }
            }
        }
    }

    private static void a(NoticeTemplateBottomButton noticeTemplateBottomButton, d dVar, com.ss.android.ugc.aweme.notification.view.template.b bVar) {
        noticeTemplateBottomButton.setText(dVar.f112815a);
        b(noticeTemplateBottomButton, dVar, bVar);
    }

    private static void b(NoticeTemplateBottomButton noticeTemplateBottomButton, d dVar, com.ss.android.ugc.aweme.notification.view.template.b bVar) {
        String str = dVar.f112817c;
        if (str == null || !hk.a(str)) {
            List<Integer> list = dVar.f112818d;
            if (list != null && (!list.isEmpty()) && list.get(0).intValue() == 1) {
                noticeTemplateBottomButton.setOnClickListener(new b(noticeTemplateBottomButton, bVar));
                return;
            }
            return;
        }
        noticeTemplateBottomButton.setOnClickListener(new View$OnClickListenerC2919a(str, noticeTemplateBottomButton));
    }
}
